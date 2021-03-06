package com.fr.chain.chaintrade.db.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.fr.chain.chaintrade.db.entity.ChainTrade;
import com.fr.chain.chaintrade.db.entity.ChainTradeExample.Criteria;
import com.fr.chain.chaintrade.db.entity.ChainTradeExample.Criterion;
import com.fr.chain.chaintrade.db.entity.ChainTradeExample;
import java.util.List;
import java.util.Map;

public class ChainTradeSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHAIN_TRADE
     *
     * @mbggenerated Fri Feb 24 10:10:34 CST 2017
     */
    public String countByExample(ChainTradeExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("CHAIN_TRADE");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHAIN_TRADE
     *
     * @mbggenerated Fri Feb 24 10:10:34 CST 2017
     */
    public String deleteByExample(ChainTradeExample example) {
        BEGIN();
        DELETE_FROM("CHAIN_TRADE");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHAIN_TRADE
     *
     * @mbggenerated Fri Feb 24 10:10:34 CST 2017
     */
    public String insertSelective(ChainTrade record) {
        BEGIN();
        INSERT_INTO("CHAIN_TRADE");
        
        if (record.getChainTradeId() != null) {
            VALUES("CHAIN_TRADE_ID", "#{chainTradeId,jdbcType=VARCHAR}");
        }
        
        if (record.getMerchantId() != null) {
            VALUES("MERCHANT_ID", "#{merchantId,jdbcType=VARCHAR}");
        }
        
        if (record.getAppId() != null) {
            VALUES("APP_ID", "#{appId,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenId() != null) {
            VALUES("OPEN_ID", "#{openId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            VALUES("ORDER_ID", "#{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getTxid() != null) {
            VALUES("TXID", "#{txid,jdbcType=VARCHAR}");
        }
        
        if (record.getChainCode() != null) {
            VALUES("CHAIN_CODE", "#{chainCode,jdbcType=INTEGER}");
        }
        
        if (record.getProductId() != null) {
            VALUES("PRODUCT_ID", "#{productId,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDigit() != null) {
            VALUES("IS_DIGIT", "#{isDigit,jdbcType=VARCHAR}");
        }
        
        if (record.getUnit() != null) {
            VALUES("UNIT", "#{unit,jdbcType=VARCHAR}");
        }
        
        if (record.getMincount() != null) {
            VALUES("MINCOUNT", "#{mincount,jdbcType=VARCHAR}");
        }
        
        if (record.getCount() != null) {
            VALUES("COUNT", "#{count,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            VALUES("AMOUNT", "#{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("CREATE_TIME", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("UPDATE_TIME", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProcessStatus() != null) {
            VALUES("PROCESS_STATUS", "#{processStatus,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHAIN_TRADE
     *
     * @mbggenerated Fri Feb 24 10:10:34 CST 2017
     */
    public String selectByExample(ChainTradeExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("CHAIN_TRADE_ID");
        } else {
            SELECT("CHAIN_TRADE_ID");
        }
        SELECT("MERCHANT_ID");
        SELECT("APP_ID");
        SELECT("OPEN_ID");
        SELECT("ORDER_ID");
        SELECT("TXID");
        SELECT("CHAIN_CODE");
        SELECT("PRODUCT_ID");
        SELECT("IS_DIGIT");
        SELECT("UNIT");
        SELECT("MINCOUNT");
        SELECT("COUNT");
        SELECT("AMOUNT");
        SELECT("CREATE_TIME");
        SELECT("UPDATE_TIME");
        SELECT("PROCESS_STATUS");
        FROM("CHAIN_TRADE");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        if(example != null){
            return SQL().concat(" limit "+example.getOffset()+","+example.getLimit());
        }
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHAIN_TRADE
     *
     * @mbggenerated Fri Feb 24 10:10:34 CST 2017
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        ChainTrade record = (ChainTrade) parameter.get("record");
        ChainTradeExample example = (ChainTradeExample) parameter.get("example");
        
        BEGIN();
        UPDATE("CHAIN_TRADE");
        
        if (record.getChainTradeId() != null) {
            SET("CHAIN_TRADE_ID = #{record.chainTradeId,jdbcType=VARCHAR}");
        }
        
        if (record.getMerchantId() != null) {
            SET("MERCHANT_ID = #{record.merchantId,jdbcType=VARCHAR}");
        }
        
        if (record.getAppId() != null) {
            SET("APP_ID = #{record.appId,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenId() != null) {
            SET("OPEN_ID = #{record.openId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            SET("ORDER_ID = #{record.orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getTxid() != null) {
            SET("TXID = #{record.txid,jdbcType=VARCHAR}");
        }
        
        if (record.getChainCode() != null) {
            SET("CHAIN_CODE = #{record.chainCode,jdbcType=INTEGER}");
        }
        
        if (record.getProductId() != null) {
            SET("PRODUCT_ID = #{record.productId,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDigit() != null) {
            SET("IS_DIGIT = #{record.isDigit,jdbcType=VARCHAR}");
        }
        
        if (record.getUnit() != null) {
            SET("UNIT = #{record.unit,jdbcType=VARCHAR}");
        }
        
        if (record.getMincount() != null) {
            SET("MINCOUNT = #{record.mincount,jdbcType=VARCHAR}");
        }
        
        if (record.getCount() != null) {
            SET("COUNT = #{record.count,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            SET("AMOUNT = #{record.amount,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("UPDATE_TIME = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProcessStatus() != null) {
            SET("PROCESS_STATUS = #{record.processStatus,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHAIN_TRADE
     *
     * @mbggenerated Fri Feb 24 10:10:34 CST 2017
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("CHAIN_TRADE");
        
        SET("CHAIN_TRADE_ID = #{record.chainTradeId,jdbcType=VARCHAR}");
        SET("MERCHANT_ID = #{record.merchantId,jdbcType=VARCHAR}");
        SET("APP_ID = #{record.appId,jdbcType=VARCHAR}");
        SET("OPEN_ID = #{record.openId,jdbcType=VARCHAR}");
        SET("ORDER_ID = #{record.orderId,jdbcType=VARCHAR}");
        SET("TXID = #{record.txid,jdbcType=VARCHAR}");
        SET("CHAIN_CODE = #{record.chainCode,jdbcType=INTEGER}");
        SET("PRODUCT_ID = #{record.productId,jdbcType=VARCHAR}");
        SET("IS_DIGIT = #{record.isDigit,jdbcType=VARCHAR}");
        SET("UNIT = #{record.unit,jdbcType=VARCHAR}");
        SET("MINCOUNT = #{record.mincount,jdbcType=VARCHAR}");
        SET("COUNT = #{record.count,jdbcType=VARCHAR}");
        SET("AMOUNT = #{record.amount,jdbcType=DECIMAL}");
        SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("UPDATE_TIME = #{record.updateTime,jdbcType=TIMESTAMP}");
        SET("PROCESS_STATUS = #{record.processStatus,jdbcType=INTEGER}");
        
        ChainTradeExample example = (ChainTradeExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHAIN_TRADE
     *
     * @mbggenerated Fri Feb 24 10:10:34 CST 2017
     */
    public String updateByPrimaryKeySelective(ChainTrade record) {
        BEGIN();
        UPDATE("CHAIN_TRADE");
        
        if (record.getMerchantId() != null) {
            SET("MERCHANT_ID = #{merchantId,jdbcType=VARCHAR}");
        }
        
        if (record.getAppId() != null) {
            SET("APP_ID = #{appId,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenId() != null) {
            SET("OPEN_ID = #{openId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            SET("ORDER_ID = #{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getTxid() != null) {
            SET("TXID = #{txid,jdbcType=VARCHAR}");
        }
        
        if (record.getChainCode() != null) {
            SET("CHAIN_CODE = #{chainCode,jdbcType=INTEGER}");
        }
        
        if (record.getProductId() != null) {
            SET("PRODUCT_ID = #{productId,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDigit() != null) {
            SET("IS_DIGIT = #{isDigit,jdbcType=VARCHAR}");
        }
        
        if (record.getUnit() != null) {
            SET("UNIT = #{unit,jdbcType=VARCHAR}");
        }
        
        if (record.getMincount() != null) {
            SET("MINCOUNT = #{mincount,jdbcType=VARCHAR}");
        }
        
        if (record.getCount() != null) {
            SET("COUNT = #{count,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            SET("AMOUNT = #{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProcessStatus() != null) {
            SET("PROCESS_STATUS = #{processStatus,jdbcType=INTEGER}");
        }
        
        WHERE("CHAIN_TRADE_ID = #{chainTradeId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHAIN_TRADE
     *
     * @mbggenerated Fri Feb 24 10:10:34 CST 2017
     */
    protected void applyWhere(ChainTradeExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}