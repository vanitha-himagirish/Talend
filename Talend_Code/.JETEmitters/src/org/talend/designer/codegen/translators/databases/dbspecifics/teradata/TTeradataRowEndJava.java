package org.talend.designer.codegen.translators.databases.dbspecifics.teradata;

import org.talend.core.model.process.INode;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.core.model.process.ElementParameterParser;

public class TTeradataRowEndJava
{
  protected static String nl;
  public static synchronized TTeradataRowEndJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TTeradataRowEndJava result = new TTeradataRowEndJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t\t\t\tlog.debug(\"";
  protected final String TEXT_2 = " - Retrieving records from the datasource.\");" + NL + "\t\t\t";
  protected final String TEXT_3 = NL + "\t\t\t\tlog.debug(\"";
  protected final String TEXT_4 = " - Retrieved records count: \"+ nb_line_";
  protected final String TEXT_5 = " + \" .\");" + NL + "\t\t\t";
  protected final String TEXT_6 = " - Retrieved records count: \"+ globalMap.get(\"";
  protected final String TEXT_7 = "_NB_LINE\") + \" .\");" + NL + "\t\t\t";
  protected final String TEXT_8 = " - Written records count: \" + nb_line_";
  protected final String TEXT_9 = NL + "\t\t\t\tfinal StringBuffer log4jSb_";
  protected final String TEXT_10 = " = new StringBuffer();" + NL + "\t\t\t";
  protected final String TEXT_11 = " - Retrieving the record \" + (nb_line_";
  protected final String TEXT_12 = ") + \".\");" + NL + "\t\t\t";
  protected final String TEXT_13 = " - Writing the record \" + nb_line_";
  protected final String TEXT_14 = " + \" to the file.\");" + NL + "\t\t\t";
  protected final String TEXT_15 = " - Processing the record \" + nb_line_";
  protected final String TEXT_16 = " + \".\");" + NL + "\t\t\t";
  protected final String TEXT_17 = " - Processed records count: \" + nb_line_";
  protected final String TEXT_18 = NL + "\t\t\t\tif(conn_";
  protected final String TEXT_19 = " != null) {" + NL + "\t\t\t\t\tif(conn_";
  protected final String TEXT_20 = ".getMetaData() != null) {" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_21 = NL + "\t\t\t\t\t\tlog.debug(\"";
  protected final String TEXT_22 = " - Uses an existing connection ";
  protected final String TEXT_23 = ".\");" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_24 = NL + "\t\t\t\t\t\t\tlog.debug(\"";
  protected final String TEXT_25 = " - Uses an existing connection. Connection URL: \" + conn_";
  protected final String TEXT_26 = ".getMetaData().getURL() + \".\");" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_27 = " - Uses an existing connection with username '\" + conn_";
  protected final String TEXT_28 = ".getMetaData().getUserName() + \"'. Connection URL: \" + conn_";
  protected final String TEXT_29 = NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t";
  protected final String TEXT_30 = NL + "\t\t\tconn_";
  protected final String TEXT_31 = " = java.sql.DriverManager.getConnection(url_";
  protected final String TEXT_32 = ", dbUser_";
  protected final String TEXT_33 = ", dbPwd_";
  protected final String TEXT_34 = ");" + NL + "\t\t\t";
  protected final String TEXT_35 = ".rollback();" + NL + "\t\t\t";
  protected final String TEXT_36 = ".commit();" + NL + "\t\t\t";
  protected final String TEXT_37 = ".close();" + NL + "\t\t\t";
  protected final String TEXT_38 = NL + "\t\t\t\tconn_";
  protected final String TEXT_39 = ".setAutoCommit(";
  protected final String TEXT_40 = NL + "\t\t\t\tlog.";
  protected final String TEXT_41 = "(\"";
  protected final String TEXT_42 = " - \" + ";
  protected final String TEXT_43 = ".getMessage());" + NL + "\t\t\t";
  protected final String TEXT_44 = NL + "\t    \t\tlog.";
  protected final String TEXT_45 = "\");" + NL + "\t\t\t";
  protected final String TEXT_46 = NL + "\t\t\t\tpstmt_";
  protected final String TEXT_47 = ".executeBatch();" + NL + "\t\t\t";
  protected final String TEXT_48 = NL + "\t\t\t\tint countSum_";
  protected final String TEXT_49 = " = 0;" + NL + "\t\t\t\tfor(int countEach_";
  protected final String TEXT_50 = ": pstmt_";
  protected final String TEXT_51 = ".executeBatch()) {" + NL + "\t\t\t\t\tcountSum_";
  protected final String TEXT_52 = " += (countEach_";
  protected final String TEXT_53 = " < 0 ? 0 : ";
  protected final String TEXT_54 = ");" + NL + "\t\t\t\t}" + NL + "\t\t\t";
  protected final String TEXT_55 = NL;
  protected final String TEXT_56 = NL + "                if(log.is";
  protected final String TEXT_57 = "Enabled())";
  protected final String TEXT_58 = NL + "            log.";
  protected final String TEXT_59 = " - \" ";
  protected final String TEXT_60 = " + (";
  protected final String TEXT_61 = ") ";
  protected final String TEXT_62 = ");";
  protected final String TEXT_63 = NL + "            if (log.isDebugEnabled()) {" + NL + "                class BytesLimit65535_";
  protected final String TEXT_64 = "{" + NL + "                    public void limitLog4jByte() throws Exception{" + NL + "                    StringBuilder ";
  protected final String TEXT_65 = " = new StringBuilder();";
  protected final String TEXT_66 = NL + "                    ";
  protected final String TEXT_67 = ".append(\"Parameters:\");";
  protected final String TEXT_68 = NL + "                            ";
  protected final String TEXT_69 = ".append(\"";
  protected final String TEXT_70 = "\" + \" = \" + String.valueOf(";
  protected final String TEXT_71 = ").substring(0, 4) + \"...\");     ";
  protected final String TEXT_72 = "\" + \" = \" + ";
  protected final String TEXT_73 = NL + "                        ";
  protected final String TEXT_74 = ".append(\" | \");";
  protected final String TEXT_75 = NL + "                    } " + NL + "                } " + NL + "            new BytesLimit65535_";
  protected final String TEXT_76 = "().limitLog4jByte();" + NL + "            }";
  protected final String TEXT_77 = NL + "            StringBuilder ";
  protected final String TEXT_78 = " = new StringBuilder();    ";
  protected final String TEXT_79 = ".append(";
  protected final String TEXT_80 = ".";
  protected final String TEXT_81 = NL + "                    if(";
  protected final String TEXT_82 = " == null){";
  protected final String TEXT_83 = ".append(\"<null>\");" + NL + "                    }else{";
  protected final String TEXT_84 = ");" + NL + "                    }   ";
  protected final String TEXT_85 = NL + "                ";
  protected final String TEXT_86 = ".append(\"|\");";
  protected final String TEXT_87 = NL + "        stmt_";
  protected final String TEXT_88 = ".execute(\"SET IDENTITY_INSERT \"+ tableName_";
  protected final String TEXT_89 = " +\" OFF\");" + NL + "\t";
  protected final String TEXT_90 = NL + "\tpstmt_";
  protected final String TEXT_91 = ".close();" + NL + "\tresourceMap.remove(\"pstmt_";
  protected final String TEXT_92 = "\");";
  protected final String TEXT_93 = NL + "\tstmt_";
  protected final String TEXT_94 = ".close();" + NL + "\tresourceMap.remove(\"stmt_";
  protected final String TEXT_95 = NL + "    resourceMap.put(\"statementClosed_";
  protected final String TEXT_96 = "\", true);";
  protected final String TEXT_97 = NL + "\t\tif(commitEvery_";
  protected final String TEXT_98 = ">commitCounter_";
  protected final String TEXT_99 = "){" + NL + "" + NL + "\t\t\t";
  protected final String TEXT_100 = NL + NL + "\t\t\tcommitCounter_";
  protected final String TEXT_101 = "=0;" + NL + "" + NL + "\t\t}";
  protected final String TEXT_102 = NL + "\t";
  protected final String TEXT_103 = NL + "    conn_";
  protected final String TEXT_104 = ".setAutoCommit(true);" + NL + "    try{" + NL + "         conn_";
  protected final String TEXT_105 = ".createStatement().execute(\"SET QUERY_BAND = NONE FOR SESSION\");";
  protected final String TEXT_106 = NL + "                   try{" + NL + "                        conn_";
  protected final String TEXT_107 = ".createStatement().execute(\"END QUERY LOGGING ON \" + ";
  protected final String TEXT_108 = ");" + NL + "                   }catch(Exception e){" + NL + "                         System.err.println(e.getMessage());" + NL + "                   }";
  protected final String TEXT_109 = NL + "     }catch(Exception e){";
  protected final String TEXT_110 = NL + "         System.err.println(e.getMessage());" + NL + "     }";
  protected final String TEXT_111 = NL + "\t" + NL + "\t";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	//this util class use by set log4j debug paramters
	class DefaultLog4jFileUtil {
	
		INode node = null;
	    String cid = null;
 		boolean isLog4jEnabled = false;
 		String label = null;
 		
 		public DefaultLog4jFileUtil(){
 		}
 		public DefaultLog4jFileUtil(INode node) {
 			this.node = node;
 			this.cid = node.getUniqueName();
 			this.label = cid;
			this.isLog4jEnabled = ("true").equals(org.talend.core.model.process.ElementParameterParser.getValue(node.getProcess(), "__LOG4J_ACTIVATE__"));
 		}
 		
 		public void setCid(String cid) {
 			this.cid = cid;
 		}
 		
		//for all tFileinput* components 
		public void startRetriveDataInfo() {
			if (isLog4jEnabled) {
			
    stringBuffer.append(TEXT_1);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_2);
    
			}
		}
		
		public void retrievedDataNumberInfo() {
			if (isLog4jEnabled) {
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_5);
    
			}
		}
		
		public void retrievedDataNumberInfoFromGlobalMap(INode node) {
			if (isLog4jEnabled) {
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_7);
    
			}
		}
		
		//for all tFileinput* components 
		public void retrievedDataNumberInfo(INode node) {
			if (isLog4jEnabled) {
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_5);
    
			}
		}
		
		public void writeDataFinishInfo(INode node) {
			if(isLog4jEnabled){
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_5);
    
			}
		}
		
 		//TODO delete it and remove all log4jSb parameter from components
		public void componentStartInfo(INode node) {
			if (isLog4jEnabled) {
			
    stringBuffer.append(TEXT_9);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_10);
    
			}
		}
		
		//TODO rename or delete it
		public void debugRetriveData(INode node,boolean hasIncreased) {
			if(isLog4jEnabled){
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(cid);
    stringBuffer.append(hasIncreased?"":"+1");
    stringBuffer.append(TEXT_12);
    
			}
		}
		
		//TODO rename or delete it
		public void debugRetriveData(INode node) {
			debugRetriveData(node,true);
		}
		
		//TODO rename or delete it
		public void debugWriteData(INode node) {
			if(isLog4jEnabled){
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
			}
		}
		
		public void logCurrentRowNumberInfo() {
			if(isLog4jEnabled){
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_16);
    
			}
		}
		
		public void logDataCountInfo() {
			if(isLog4jEnabled){
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(label);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_5);
    
			}
		}
	}
	
	final DefaultLog4jFileUtil log4jFileUtil = new DefaultLog4jFileUtil((INode)(((org.talend.designer.codegen.config.CodeGeneratorArgument)argument).getArgument()));
	
    
	class DefaultLog4jCodeGenerateUtil extends DefaultLog4jFileUtil{

 		String connection = "";
 		boolean hasInit = false;
 		String dataAction ;
 		String dataOperationPrefix;
		String useBatchSize;
		String batchSize;
		String dbSchema;
 		boolean logCommitCounter = false;

		public DefaultLog4jCodeGenerateUtil(){
		}

		public DefaultLog4jCodeGenerateUtil(INode node) {
			super(node);
	    	init();
		}

	    public void beforeComponentProcess(INode node){
	    	this.node = node;
	    	init();
	    }

		private void init() {
			if(hasInit){
				return;
			}
 			this.cid = node.getUniqueName();
			this.isLog4jEnabled = ("true").equals(ElementParameterParser.getValue(node.getProcess(), "__LOG4J_ACTIVATE__"));
			String useConn = ElementParameterParser.getValue(node,"__USE_EXISTING_CONNECTION__");
			if(useConn == null || "".equals(useConn) || "true".equals(useConn)){
				connection = ElementParameterParser.getValue(node,"__CONNECTION__");
				if(!"".equals(connection)){
					connection = "'" + connection+"' ";
				}
			}
			//for output
			dataAction = ElementParameterParser.getValue(node,"__DATA_ACTION__");
			if(dataAction != null && !("").equals(dataAction)){
				logCommitCounter=true;
			}
			useBatchSize = ElementParameterParser.getValue(node, "__USE_BATCH_SIZE__");
			batchSize =ElementParameterParser.getValue(node, "__BATCH_SIZE__");
			hasInit = true;
		}

		public void debugDriverClassName() {
			logInfo(node,"debug",cid+" - Driver ClassName: \"+driverClass_"+cid+"+\".");
		}

		public void debugConnectionParams(INode node) {
			beforeComponentProcess(node);
			debugDriverClassName();
		}

		public void useExistConnection(INode node){
			useExistConnection(node, true);
		}

		public void useExistConnection(INode node, boolean needUserAndPassword){
			beforeComponentProcess(node);
			if(isLog4jEnabled) {
			
    stringBuffer.append(TEXT_18);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_20);
    if (cid.contains("tImpala") || cid.contains("tHive")) {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(connection );
    stringBuffer.append(TEXT_23);
    } else if (!needUserAndPassword){
    stringBuffer.append(TEXT_24);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_26);
    } else {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_26);
    }
    stringBuffer.append(TEXT_29);
    
			}
		}

		public void connect(INode node){
			beforeComponentProcess(node);
			if ("SSO".equals(ElementParameterParser.getValue(node, "__JDBC_URL__"))){
				connectWithSSO();
			} else {
				connect();
			}
		}

		public void connect(){
			connect_begin();
			
    stringBuffer.append(TEXT_30);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_32);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_34);
    
			connect_end();
		}
		
		public void connectWithSSO(){
			connect_begin_noUser();
			
    stringBuffer.append(TEXT_30);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_34);
    
			connect_end();
		}

		public void connect_begin(){
			logInfo(node,"debug",cid+" - Connection attempt to '\" + url_"+cid+" + \"' with the username '\" + dbUser_"+cid+" + \"'.");
		}

		public void connect_begin_noUser(){
			logInfo(node,"debug",cid+" - Connection attempt to '\" + url_"+cid+" + \"'.");
		}

		public void connect_end(){
			logInfo(node,"debug",cid+" - Connection to '\" + url_"+cid+" + \"' has succeeded.");
		}

		public void rollback(INode node){
			beforeComponentProcess(node);
			logInfo(node,"debug",cid+" - Connection "+connection+"starting to rollback.");
			
    stringBuffer.append(TEXT_30);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_35);
    
			logInfo(node,"debug",cid+" - Connection "+connection+"rollback has succeeded.");
		}

		public void commit(INode node){
			beforeComponentProcess(node);
			commit();
		}

		private void commit(){
			commit_begin();
			
    stringBuffer.append(TEXT_30);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_36);
    
			commit_end();
		}

		private void commit_begin(){
			if(logCommitCounter){
				logInfo(node,"debug",cid+" - Connection "+connection+"starting to commit \" + commitCounter_"+cid+"+ \" records.");
			}else{
				logInfo(node,"debug",cid+" - Connection "+connection+"starting to commit.");
			}
		}
		private void commit_end(){
			logInfo(node,"debug",cid+" - Connection "+connection+"commit has succeeded.");
		}

		public void close(INode node){
			beforeComponentProcess(node);
			close();
		}

		private void close(){
			close_begin();
			
    stringBuffer.append(TEXT_30);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_37);
    
			close_end();
		}

		public void close_begin(){
			logInfo(node,"debug",cid+" - Closing the connection "+connection+"to the database.");
		}
		public void close_end(){
			logInfo(node,"debug",cid+" - Connection "+connection+"to the database closed.");
		}

		public void autoCommit(INode node,boolean autoCommit){
			beforeComponentProcess(node);
			logInfo(node,"debug",cid+" - Connection is set auto commit to '"+autoCommit+"'.");
			
    stringBuffer.append(TEXT_38);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(autoCommit);
    stringBuffer.append(TEXT_34);
    
		}

		public void query(INode node){
			beforeComponentProcess(node);
			//for input
	 		String dbquery= ElementParameterParser.getValue(node, "__QUERY__");
			dbquery = org.talend.core.model.utils.NodeUtil.replaceCRLFInMEMO_SQL(dbquery);
			logInfo(node,"debug",cid+" - Executing the query: '\" + "+dbquery +" + \"'.");
		}

		public void retrieveRecordsCount(INode node){
			beforeComponentProcess(node);
			logInfo(node,"debug",cid+" - Retrieved records count: \"+nb_line_"+cid+" + \" .");
		}

		public void logError(INode node,String logLevel,String exception){
	    	beforeComponentProcess(node);
	    	if(isLog4jEnabled){
	    	
    stringBuffer.append(TEXT_40);
    stringBuffer.append(logLevel);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_42);
    stringBuffer.append(exception);
    stringBuffer.append(TEXT_43);
    
			}
	    }

	    public void logError(INode node,String logLevel){
	    	logError(node,logLevel,"e");
	    }
	    
	    public void logInfo(INode node,String logLevel,String message){
	    	beforeComponentProcess(node);
	    	if(isLog4jEnabled){
	    	
    stringBuffer.append(TEXT_44);
    stringBuffer.append(logLevel);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_45);
    
			}
	    }
		/**
		*batchType :
		*			1: do not get return value of executeBatch();
		*			2: get return value of executeBatch();
		*
		*/
		public void executeBatch(INode node,int batchType){
			beforeComponentProcess(node);
			boolean logBatch = ("true").equals(useBatchSize) && !("").equals(batchSize) && !("0").equals(batchSize);
			if(logBatch){
				logInfo(node,"debug",cid+" - Executing the "+dataAction+" batch.");
			}
			if(batchType==1){
			
    stringBuffer.append(TEXT_46);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_47);
    
			}else if(batchType==2){
				boolean isMysqlBatchInsert = false;
				if ((node.getUniqueName().contains("tMysqlOutput")||node.getUniqueName().contains("tAmazonMysqlOutput")) && ("INSERT").equals(dataAction)) {
					isMysqlBatchInsert = true;
				}
			
    stringBuffer.append(TEXT_48);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_50);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_51);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(isMysqlBatchInsert? "1" : "countEach_"+cid );
    stringBuffer.append(TEXT_54);
    
			}
			if(logBatch){
				logInfo(node,"debug",cid+" - The "+dataAction+" batch execution has succeeded.");
			}
		}
	}

	DefaultLog4jCodeGenerateUtil log4jCodeGenerateUtil = new DefaultLog4jCodeGenerateUtil();

    stringBuffer.append(TEXT_55);
    stringBuffer.append(TEXT_55);
    
class BasicLogUtil{
    protected String cid  = "";
    protected org.talend.core.model.process.INode node = null;
    protected boolean log4jEnabled = false;
    private String logID = "";
    
    private BasicLogUtil(){}
    
    public BasicLogUtil(org.talend.core.model.process.INode node){
        this.node = node;
        String cidx = this.node.getUniqueName();
        if(cidx.matches("^.*?tAmazonAuroraOutput_\\d+_out$") || cidx.matches("^.*?tDBOutput_\\d+_out$")){
             cidx = cidx.substring(0,cidx.length()-4);// 4 ==> "_out".length();
        }
        this.cid = cidx;
        this.log4jEnabled = ("true").equals(org.talend.core.model.process.ElementParameterParser.getValue(this.node.getProcess(), "__LOG4J_ACTIVATE__"));
        this.log4jEnabled = this.log4jEnabled &&
                            this.node.getComponent().isLog4JEnabled() && !"JOBLET".equals(node.getComponent().getComponentType().toString());
        this.logID = this.cid;
    }
    
    public String var(String varName){
        return varName + "_" + this.cid;
    }
    public String str(String content){
        return "\"" + content + "\"";
    }
    
    public void info(String... message){
        log4j("info", message);
    }
    
    public void debug(String... message){
        log4j("debug", message);
    }
    
    public void warn(String... message){
        log4j("warn", message);
    }
    
    public void error(String... message){
        log4j("error", message);
    }
    
    public void fatal(String... message){
        log4j("fatal", message);
    }
    
    public void trace(String... message){
        log4j("trace", message);
    }
    java.util.List<String> checkableList = java.util.Arrays.asList(new String[]{"info", "debug", "trace"});     
    public void log4j(String level, String... messages){
        if(this.log4jEnabled){
            if(checkableList.contains(level)){
            
    stringBuffer.append(TEXT_56);
    stringBuffer.append(level.substring(0, 1).toUpperCase() + level.substring(1));
    stringBuffer.append(TEXT_57);
    
            }
            
    stringBuffer.append(TEXT_58);
    stringBuffer.append(level);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(logID);
    stringBuffer.append(TEXT_59);
    for(String message : messages){
    stringBuffer.append(TEXT_60);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_62);
    
        }
    }
    
    public boolean isActive(){
        return this.log4jEnabled;
    }
}

class LogUtil extends BasicLogUtil{
    
    private LogUtil(){
    }
    
    public LogUtil(org.talend.core.model.process.INode node){
        super(node);
    }
    
    public void startWork(){
        debug(str("Start to work."));
    }
    
    public void endWork(){
        debug(str("Done."));
    }
    
    public void logIgnoredException(String exception){
        warn(exception);
    }
    
    public void logPrintedException(String exception){
        error(exception);
    }
    
    public void logException(String exception){
        fatal(exception);
    }
    
    public void logCompSetting(){
    
    
        if(log4jEnabled){
        
    stringBuffer.append(TEXT_63);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(TEXT_66);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_67);
    
                    java.util.Set<org.talend.core.model.process.EParameterFieldType> ignoredParamsTypes = new java.util.HashSet<org.talend.core.model.process.EParameterFieldType>(); 
                    ignoredParamsTypes.addAll(
                        java.util.Arrays.asList(
                            org.talend.core.model.process.EParameterFieldType.SCHEMA_TYPE,
                            org.talend.core.model.process.EParameterFieldType.LABEL,
                            org.talend.core.model.process.EParameterFieldType.EXTERNAL,
                            org.talend.core.model.process.EParameterFieldType.MAPPING_TYPE,
                            org.talend.core.model.process.EParameterFieldType.IMAGE,
                            org.talend.core.model.process.EParameterFieldType.TNS_EDITOR,
                            org.talend.core.model.process.EParameterFieldType.WSDL2JAVA,
                            org.talend.core.model.process.EParameterFieldType.GENERATEGRAMMARCONTROLLER,
                            org.talend.core.model.process.EParameterFieldType.GENERATE_SURVIVORSHIP_RULES_CONTROLLER,
                            org.talend.core.model.process.EParameterFieldType.REFRESH_REPORTS,
                            org.talend.core.model.process.EParameterFieldType.BROWSE_REPORTS,
                            org.talend.core.model.process.EParameterFieldType.PALO_DIM_SELECTION,
                            org.talend.core.model.process.EParameterFieldType.GUESS_SCHEMA,
                            org.talend.core.model.process.EParameterFieldType.MATCH_RULE_IMEX_CONTROLLER,
                            org.talend.core.model.process.EParameterFieldType.MEMO_PERL,
                            org.talend.core.model.process.EParameterFieldType.DBTYPE_LIST,
                            org.talend.core.model.process.EParameterFieldType.VERSION,
                            org.talend.core.model.process.EParameterFieldType.TECHNICAL,
                            org.talend.core.model.process.EParameterFieldType.ICON_SELECTION,
                            org.talend.core.model.process.EParameterFieldType.JAVA_COMMAND,
                            org.talend.core.model.process.EParameterFieldType.TREE_TABLE,
                            org.talend.core.model.process.EParameterFieldType.VALIDATION_RULE_TYPE,
                            org.talend.core.model.process.EParameterFieldType.DCSCHEMA,
                            org.talend.core.model.process.EParameterFieldType.SURVIVOR_RELATION,
                            org.talend.core.model.process.EParameterFieldType.REST_RESPONSE_SCHEMA_TYPE
                            )
                    );
                    for(org.talend.core.model.process.IElementParameter ep : org.talend.core.model.utils.NodeUtil.getDisplayedParameters(node)){
                        if(!ep.isLog4JEnabled() || ignoredParamsTypes.contains(ep.getFieldType())){
                            continue;
                        }
                        String name = ep.getName();
                        if(org.talend.core.model.process.EParameterFieldType.PASSWORD.equals(ep.getFieldType())){
                            String epName = "__" + name + "__";
                            String password = "";
                            if(org.talend.core.model.process.ElementParameterParser.canEncrypt(node, epName)){
                                password = org.talend.core.model.process.ElementParameterParser.getEncryptedValue(node, epName);
                            }else{
                                String passwordValue = org.talend.core.model.process.ElementParameterParser.getValue(node, epName);
                                if (passwordValue == null || "".equals(passwordValue.trim())) {// for the value which empty
                                    passwordValue = "\"\"";
                                } 
                                password = "routines.system.PasswordEncryptUtil.encryptPassword(" + passwordValue + ")";
                            } 
                            
    stringBuffer.append(TEXT_68);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_70);
    stringBuffer.append(password);
    stringBuffer.append(TEXT_71);
    
                        }else{
                            String value = org.talend.core.model.utils.NodeUtil.getNormalizeParameterValue(node, ep);
                            if(value.length()>10000){
                            value = org.talend.core.model.utils.NodeUtil.replaceCRLFInMEMO_SQL(value);
                            }
                            
    stringBuffer.append(TEXT_68);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_72);
    stringBuffer.append(value);
    stringBuffer.append(TEXT_62);
    
                        }   
                        
    stringBuffer.append(TEXT_73);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_74);
    
                    }
                    debug(var("log4jParamters")); 
                    
    stringBuffer.append(TEXT_75);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_76);
    
        } 
        
    
    } 
    
    //no use for now, because we log the data by rowStruct
    public void traceData(String rowStruct, java.util.List<org.talend.core.model.metadata.IMetadataColumn> columnList, String nbline){
        if(log4jEnabled){
        
    stringBuffer.append(TEXT_77);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_78);
    
            for(org.talend.core.model.metadata.IMetadataColumn column : columnList){
                org.talend.core.model.metadata.types.JavaType javaType = org.talend.core.model.metadata.types.JavaTypesManager.getJavaTypeFromId(column.getTalendType());
                String columnName = column.getLabel();
                boolean isPrimit = org.talend.core.model.metadata.types.JavaTypesManager.isJavaPrimitiveType(column.getTalendType(), column.isNullable());
                if(isPrimit){
                
    stringBuffer.append(TEXT_66);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(rowStruct);
    stringBuffer.append(TEXT_80);
    stringBuffer.append(columnName);
    stringBuffer.append(TEXT_62);
    
                }else{
                
    stringBuffer.append(TEXT_81);
    stringBuffer.append(rowStruct);
    stringBuffer.append(TEXT_80);
    stringBuffer.append(columnName);
    stringBuffer.append(TEXT_82);
    stringBuffer.append(TEXT_73);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(TEXT_73);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(rowStruct);
    stringBuffer.append(TEXT_80);
    stringBuffer.append(columnName);
    stringBuffer.append(TEXT_84);
    
                }
                
    stringBuffer.append(TEXT_85);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_86);
    
            }
        }
        trace(str("Content of the record "), nbline, str(": "), var("log4jSb"));
        
    
    }
}

class LogHelper{
    
    java.util.Map<String, String> pastDict = null;
    
    public LogHelper(){
        pastDict = new java.util.HashMap<String, String>();
        pastDict.put("insert", "inserted");
        pastDict.put("update", "updated");
        pastDict.put("delete", "deleted");
        pastDict.put("upsert", "upserted");
    }   
    
    public String upperFirstChar(String data){ 
        return data.substring(0, 1).toUpperCase() + data.substring(1);
    }
    
    public String toPastTense(String data){
        return pastDict.get(data);
    }
}
LogHelper logHelper = new LogHelper();

LogUtil log = null;

    stringBuffer.append(TEXT_55);
    
class DBConnLogUtil extends BasicLogUtil{
	
	private DBConnLogUtil(){}
	
	protected DBConnLogUtil(org.talend.core.model.process.INode node){
		super(node);
	}
	
	public void logJDBCDriver(String driverClass){
		debug(str("Driver ClassName: "), driverClass, str("."));
	}
	
	public void connTry(String url, String dbUser){
		if(dbUser != null){
			debug(str("Connection attempts to '"), url, str("' with the username '"), dbUser, str("'."));
		}else{
			debug(str("Connection attempts to '"), url, str("'."));
		}
	}
	
	public void connDone(String url){
		debug(str("Connection to '"), url, str("' has succeeded."));
	}
	
	public void useExistConn(String url, String dbUser){
		if(dbUser != null){
			debug(str("Uses an existing connection with username '"), dbUser, str("'. Connection URL: "), url, str("."));
		}else{
			debug(str("Uses an existing connection. Connection URL: "), url, str("."));
		}
	}
	
	public void closeTry(String connCompID){
		if(connCompID == null){
			debug(str("Closing the connection to the database."));
		}else{
			debug(str("Closing the connection "), connCompID, str(" to the database."));
		}
	}
	
	public void closeDone(String connCompID){
		if(connCompID == null){
			debug(str("Connection to the database has closed."));	
		}else{
			debug(str("Connection "), connCompID, str(" to the database has closed."));
		}
	}
}

class DBTableActionLogUtil extends BasicLogUtil{
	private DBTableActionLogUtil(){}
	
	protected DBTableActionLogUtil(org.talend.core.model.process.INode node){
		super(node);
	}
	
	public void dropTry(String tableName){
		tableActionTry(tableName, str("Dropping"));
	}
	
	public void dropDone(String tableName){
		tableActionDone(tableName, str("Drop"));
	}
	
	public void createTry(String tableName){
		tableActionTry(tableName, str("Creating"));
	}
	
	public void createDone(String tableName){
		tableActionDone(tableName, str("Create"));
	}
	
	public void clearTry(String tableName){
		tableActionTry(tableName, str("Clearing"));
	}
	
	public void clearDone(String tableName){
		tableActionDone(tableName, str("Clear"));
	}
	
	public void truncateTry(String tableName){
		tableActionTry(tableName, str("Truncating"));
	}
	
	public void truncateDone(String tableName){
		tableActionDone(tableName, str("Truncate"));
	}
	
	public void truncateReuseStorageTry(String tableName){
		tableActionTry(tableName, str("Truncating reuse storage"));
	}
	
	public void truncateReuseStorageDone(String tableName){
		tableActionDone(tableName, str("Truncate reuse stroage"));
	}
	
	private void tableActionTry(String tableName, String action){
		debug(action, str(" table '"), tableName, str("'."));
	}
	
	private void tableActionDone(String tableName, String action){
		debug(action, str(" table '"), tableName, str("' has succeeded."));
	}
}

class DBCommitLogUtil extends BasicLogUtil{
	private DBCommitLogUtil(){}
	
	protected DBCommitLogUtil(org.talend.core.model.process.INode node){
		super(node);
	}
	
	public void logAutoCommit(String autoCommit){
		debug(str("Connection is set auto commit to '"), autoCommit, str("'."));
	}

	public void commitTry(String connCompID, String commitCount){
		if(commitCount == null && connCompID == null){
			debug(str("Connection starting to commit."));
		}else if(commitCount == null){
			debug(str("Connection "), connCompID, str(" starting to commit."));	
		}else if(connCompID == null){
			debug(str("Connection starting to commit "), commitCount, str(" record(s)."));
		}else{
			debug(str("Connection "), connCompID, str(" starting to commit "), commitCount, str(" record(s)."));
		}
	}
	
	public void commitDone(String connCompID){
		if(connCompID == null){
			debug(str("Connection commit has succeeded."));
		}else{
			debug(str("Connection "), connCompID, (" commit has succeeded."));
		}
	}
}

class DBBatchLogUtil extends BasicLogUtil{
	private DBBatchLogUtil(){}
	
	protected DBBatchLogUtil(org.talend.core.model.process.INode node){
		super(node);
	}
	
	public void executeTry(String action){
		debug(str("Executing the "), action, str(" batch."));
	}
	
	public void executeDone(String action){
		debug(str("The "), action, str(" batch execution has succeeded."));
	}
}

class DBDataActionLogUtil extends BasicLogUtil{
	private DBDataActionLogUtil(){}
	
	protected DBDataActionLogUtil(org.talend.core.model.process.INode node){
		super(node);
	}
	
	public void inserting(String nbline){
		sqlAction(nbline, str("Inserting"));
	}
	
	public void deleting(String nbline){
		sqlAction(nbline, str("Deleting"));
	}
	
	public void updating(String nbline){
		sqlAction(nbline, str("Updating"));
	}
	
	public void replacing(String nbline){
		sqlAction(nbline, str("Replacing"));
	}
	
	public void insertingOnDuplicateKeyUpdating(String nbline){
		sqlAction(nbline, str("Inserting on duplicate key updating"));
	}
	
	public void insertingIgnore(String nbline){
		sqlAction(nbline, str("Inserting ignore"));
	}
	
	private void sqlAction(String nbline, String action){
		if(nbline == null){
			debug(action, str(" the record."));
		}else{
			debug(action, str(" the record "), nbline, str("."));
		}
	}
	
	public void sqlExecuteTry(String sql){
		debug(str("Executing '"), sql, str("'."));
	}
	
	public void sqlExecuteDone(String sql){
		debug(str("Execute '"), sql, str("' has succeeded."));
	}

	public void addingToBatch(String nbline, String batchAction){
		debug(str("Adding the record "), nbline, str(" to the "), batchAction, str(" batch."));
	}
}

class DBStateLogUtil extends BasicLogUtil{
	private DBStateLogUtil(){}
	
	protected DBStateLogUtil(org.talend.core.model.process.INode node){
		super(node);
	}
	
	public void logInsertedLines(String nbline){
		logFinishedLines(nbline, str("inserted"));
	}
	
	public void logUpdatedLines(String nbline){
		logFinishedLines(nbline, str("updated"));
	}
	
	public void logDeletedLines(String nbline){
		logFinishedLines(nbline, str("deleted"));
	}
	
	public void logRejectedLines(String nbline){
		logFinishedLines(nbline, str("rejected"));
	}
	
	private void logFinishedLines(String nbline, String action){
		debug(str("Has "), action, str(" "), nbline, str(" record(s)."));
	}
}	
class DBLogUtil extends LogUtil{
	DBConnLogUtil conn = null;
	DBTableActionLogUtil table = null;
	DBCommitLogUtil commit = null;
	DBBatchLogUtil batch = null;
	DBDataActionLogUtil data = null;
	DBStateLogUtil state = null;
	private DBLogUtil(){}
	
	protected DBLogUtil(org.talend.core.model.process.INode node){
		super(node);
		conn = new DBConnLogUtil(node);
    	table = new DBTableActionLogUtil(node);
    	commit = new DBCommitLogUtil(node);
    	batch = new DBBatchLogUtil(node);
    	data = new DBDataActionLogUtil(node);
    	state = new DBStateLogUtil(node);
	}
	
	public DBConnLogUtil conn(){
		return conn;
	}
	
	public DBTableActionLogUtil table(){
		return table;
	}
	
	public DBCommitLogUtil commit(){
		return commit;
	}
	
	public DBBatchLogUtil batch(){
		return batch;
	}
	
	public DBDataActionLogUtil data(){
		return data;
	}
	
	public DBStateLogUtil state(){
		return state;
	}
}
DBLogUtil dbLog = null;

    
	CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
	INode node = (INode)codeGenArgument.getArgument();
	      dbLog = new DBLogUtil(node);
	String cid = node.getUniqueName();

	String commitEvery = ElementParameterParser.getValue(node, "__COMMIT_EVERY__");

	boolean useTransaction = !("false").equals(ElementParameterParser.getValue(node,"__USE_TRANSACTION__"));
	String useExistingConn = ElementParameterParser.getValue(node,"__USE_EXISTING_CONNECTION__");

	boolean usePrepareStatement = "true".equals(ElementParameterParser.getValue(node,"__USE_PREPAREDSTATEMENT__"));
	boolean identityInsert = "true".equals(ElementParameterParser.getValue(node, "__IDENTITY_INSERT__"));
	boolean useQueryBanding = "true".equals(ElementParameterParser.getValue(node, "__QUERY_BAND__"));
    if(identityInsert) {
	
    stringBuffer.append(TEXT_87);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_88);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_89);
    
    }
	
    stringBuffer.append(TEXT_55);
    
	if (usePrepareStatement) {

    stringBuffer.append(TEXT_90);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_91);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_92);
    
	} else {

    stringBuffer.append(TEXT_93);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_94);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_92);
    
	}

    stringBuffer.append(TEXT_95);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_96);
    
	if(!("true").equals(useExistingConn)) {
		if(useTransaction && !("").equals(commitEvery)&&!("0").equals(commitEvery)){

    stringBuffer.append(TEXT_97);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_98);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_99);
    log4jCodeGenerateUtil.commit(node);
    stringBuffer.append(TEXT_100);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_101);
    
		}  
    stringBuffer.append(TEXT_102);
    
    CodeGeneratorArgument codeGenArgument4End = (CodeGeneratorArgument) argument;
    INode node4End = (INode)codeGenArgument4End.getArgument();
    Boolean queryBand4End = "true".equals(ElementParameterParser.getValue(node4End, "__QUERY_BAND__"));
    boolean activateQueryLogging = "true".equals(ElementParameterParser.getValue(node, "__ACTIVATE_QUERY_LOGGING__"));
    String usrName = ElementParameterParser.getValue(node, "__USER__");

    stringBuffer.append(TEXT_55);
    if(queryBand4End){
    stringBuffer.append(TEXT_103);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_104);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_105);
    
             if(activateQueryLogging){
                
    stringBuffer.append(TEXT_106);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_107);
    stringBuffer.append( usrName );
    stringBuffer.append(TEXT_108);
    
             }
          
    stringBuffer.append(TEXT_109);
    dbLog.logPrintedException("e.getMessage()");
    stringBuffer.append(TEXT_110);
    }
    stringBuffer.append(TEXT_111);
    
	   log4jCodeGenerateUtil.close(node);
	}


    stringBuffer.append(TEXT_55);
    return stringBuffer.toString();
  }
}
