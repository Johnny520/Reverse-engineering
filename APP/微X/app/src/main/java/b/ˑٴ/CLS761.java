// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.SparseArray;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS41;
import b.ˆٴ.CLS66;
import b.ˊﾞ.CLS613;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS396;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS502;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class CLS761 implements CLS35 {
    public final int FLD1031;
    public final CLS760 FLD1032;

    public CLS761(CLS760 ـˑ0, int v) {
        this.FLD1031 = v;
        this.FLD1032 = ـˑ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        boolean z3;
        long v11;
        SparseArray sparseArray2;
        CLS124 ـˑ$ˆٴ0;
        Integer integer0 = -1;
        Class class0 = Object.class;
        CLS760 ـˑ0 = this.FLD1032;
        switch(this.FLD1031) {
            case 0: {
                Object object0 = null;
                ـˑ0.getClass();
                Object object1 = arr_object[0];
                try {
                    Field field0 = object1.getClass().getDeclaredField("thisObject");
                    if(field0 != null) {
                        field0.setAccessible(true);
                        object0 = field0.get(object1);
                    }
                }
                catch(Throwable unused_ex) {
                }
                String s1 = CLS412.MTH6009(((Activity)object0));
                boolean z = CLS502.MTH6943(s1, new String[]{CLS27.MTH897("SnsTimeLineUI"), CLS27.MTH897("ImproveSnsTimelineUI")});
                CLS371 ʻ0 = ـˑ0.FLD1444;
                if(z) {
                    ـˑ0.FLD1022 = ʻ0.MTH5344();
                    ـˑ$ˆٴ0 = CLS124.FLD1017;
                    ـˑ0.FLD1024 = ـˑ$ˆٴ0;
                    return;
                }
                boolean z4 = false;
                if(s1.equals(CLS27.MTH897("SnsCommentDetailUI"))) {
                    z4 = true;
                    ـˑ0.FLD1022 = ʻ0.MTH5344();
                    ـˑ$ˆٴ0 = CLS124.FLD1019;
                }
                else if(s1.equals(CLS27.MTH897("SnsGalleryUI"))) {
                    z4 = true;
                    ـˑ0.FLD1022 = ʻ0.MTH5344();
                    ـˑ$ˆٴ0 = CLS124.FLD1021;
                }
                if(z4) {
                    ـˑ0.FLD1024 = ـˑ$ˆٴ0;
                    return;
                }
                if(s1.equals(CLS27.MTH897("SnsUserUI")) || s1.equals(CLS27.MTH897("ContactInfoUI"))) {
                    ـˑ0.FLD1022 = ʻ0.MTH5344();
                    ـˑ0.FLD1024 = CLS124.FLD1020;
                }
                return;
            }
            case 1: {
                ـˑ0.getClass();
                ـˑ0.FLD1026.put(((long)(((Long)arr_object[0]))), ((ContentValues)arr_object[1]));
                return;
            }
            case 2: {
                ـˑ0.getClass();
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                String s2 = (String)ᵔʾ0.MTH3204()[0];
                if(!TextUtils.isEmpty(s2) && "revokemsg".equals(s2)) {
                    ـˑ0.MTH2535(ᵔʾ0, s2, ((Map)ᵔʾ0.MTH3204()[1]));
                }
                return;
            }
            case 3: {
                ـˑ0.getClass();
                if(ـˑ0.FLD1029.MTH938("prevent_msg_recall", true)) {
                    Object object2 = arr_object[0];
                    try {
                        Method method0 = object2.getClass().getDeclaredMethod("setResult", class0);
                        method0.setAccessible(true);
                        method0.invoke(object2, ((Object)null));
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                return;
            }
            case 4: {
                ـˑ0.getClass();
                CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                Object object3 = CLS182.MTH3492(4101380600865018677L, ᵔʾ1.MTH3204()[0]);
                if(CLS166.MTH3181(object3, CLS27.MTH897("dataFieldType")) == 10002) {
                    String s3 = "" + CLS166.MTH3194(object3, CLS27.MTH897("dataFieldContent"));
                    int v3 = s3.indexOf("<sysmsg");
                    if(v3 != -1) {
                        HashMap hashMap0 = CLS392.MTH5633(s3.substring(v3), "sysmsg");
                        if(hashMap0 != null) {
                            String s4 = (String)hashMap0.get(".sysmsg.$type");
                            if(!TextUtils.isEmpty(s4) && "revokemsg".equals(s4)) {
                                ـˑ0.MTH2535(ᵔʾ1, s4, hashMap0);
                            }
                        }
                    }
                }
                return;
            }
            case 5: {
                ـˑ0.getClass();
                CLS167 ᵔʾ2 = new CLS167(arr_object[0]);
                Object object4 = ᵔʾ2.MTH3204()[0];
                if(CLS166.MTH3181(object4, CLS27.MTH897("dataFieldType")) == 10002) {
                    String s5 = "" + CLS166.MTH3194(object4, CLS27.MTH897("dataFieldContent"));
                    int v4 = s5.indexOf("<sysmsg");
                    if(v4 != -1) {
                        HashMap hashMap1 = CLS392.MTH5633(s5.substring(v4), "sysmsg");
                        if(hashMap1 != null) {
                            String s6 = (String)hashMap1.get(".sysmsg.$type");
                            if(!TextUtils.isEmpty(s6) && "revokemsg".equals(s6)) {
                                ـˑ0.MTH2535(ᵔʾ2, s6, hashMap1);
                            }
                        }
                    }
                }
                return;
            }
            case 6: {
                String s7 = "";
                ـˑ0.getClass();
                if(ـˑ0.FLD1029.MTH938("prevent_msg_recall", true) && ـˑ0.FLD1029.MTH938("keep_self_recall", false)) {
                    if(CLS27.MTH890("msgRevokeClass")) {
                        s7 = CLS27.MTH897(CLS370.MTH5289(4101380085468943157L));
                    }
                    else if(CLS27.MTH890("msgRevokeClass_b")) {
                        s7 = CLS27.MTH897(CLS370.MTH5289(0x38EB07152B3CD335L));
                    }
                    if(!TextUtils.isEmpty(s7) && !TextUtils.isEmpty(CLS164.MTH3177(s7))) {
                        Object object5 = arr_object[0];
                        try {
                            Method method1 = object5.getClass().getDeclaredMethod("setResult", class0);
                            method1.setAccessible(true);
                            method1.invoke(object5, ((Object)null));
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                }
                return;
            }
            case 7: {
                ـˑ0.getClass();
                CLS167 ᵔʾ3 = new CLS167(arr_object[0]);
                String s8 = (String)arr_object[2];
                ContentValues contentValues1 = (ContentValues)arr_object[3];
                CLS29 ˎᵢ0 = ـˑ0.FLD1029;
                if("snscomment".equalsIgnoreCase(s8) && ˎᵢ0.MTH938("prevent_comments_recall", true) && contentValues1.containsKey("commentflag") && CLS182.MTH3474(4101402981939598133L, contentValues1) != 0 && (!contentValues1.containsKey("isSend") || !contentValues1.getAsBoolean("isSend").booleanValue())) {
                    ᵔʾ3.MTH3207(-1);
                    ـˑ0.MTH2539(contentValues1);
                    if(ˎᵢ0.MTH938("comment_recall_notification_enable", false)) {
                        String s9 = contentValues1.getAsString("talker");
                        Bitmap bitmap0 = CLS372.MTH5411(s9);
                        String s10 = ـˑ0.FLD1444.MTH5311(s9) + " " + ˎᵢ0.MTH925("comment_recall_content", CLS27.MTH889("comment_recall_content"));
                        String s11 = CLS27.MTH889("no_content");
                        if(!CLS27.MTH901()) {
                            Class class1 = CLS27.MTH894("commentClass");
                            if(class1 != null) {
                                s11 = (String)CLS182.MTH3492(4101403639069594421L, CLS66.MTH1381(class1, contentValues1.getAsByteArray("curActionBuf")));
                            }
                        }
                        Intent intent0 = new Intent();
                        intent0.setClassName(CLS390.MTH5619(CLS27.MTH900()), CLS27.MTH897("SnsMsgUI"));
                        ـˑ0.MTH2541().MTH6744(intent0, bitmap0, s9, s10, s11, "comment_recall");
                    }
                }
                if("snsinfo".equalsIgnoreCase(s8) && contentValues1.containsKey("userName") && contentValues1.containsKey("snsId") && CLS34.MTH1080(4101403389961491253L, contentValues1) < 0L) {
                    boolean z1 = ˎᵢ0.MTH938("prevent_comments_recall", true);
                    CLS396 ʿʽ0 = ـˑ0.FLD1446;
                    if(z1 && !CLS27.MTH901()) {
                        try {
                            ContentValues contentValues2 = (ContentValues)ᵔʾ3.MTH3204()[1];
                            if(contentValues2.containsKey("attrBuf")) {
                                long v5 = (long)contentValues2.getAsLong("snsId");
                                if(!((CLS41)CLS40.FLD157.MTH1118(CLS41.class)).MTH1132(v5)) {
                                    Class class2 = CLS27.MTH894("snsAttrClass");
                                    if(class2 != null) {
                                        Object object6 = CLS66.MTH1381(class2, contentValues2.getAsByteArray("attrBuf"));
                                        ʿʽ0.getClass();
                                        SparseArray sparseArray0 = CLS396.MTH5770(object6);
                                        SparseArray sparseArray1 = CLS396.MTH5770(ʿʽ0.MTH5771(class2, String.valueOf(v5)));
                                        for(int v6 = 0; v6 < sparseArray0.size(); ++v6) {
                                            int v7 = sparseArray0.keyAt(v6);
                                            if(sparseArray1.indexOfKey(v7) < 0) {
                                                sparseArray1.put(v7, sparseArray0.get(v7));
                                            }
                                        }
                                        if(ˎᵢ0.MTH938("show_comment_deleted_tag", false)) {
                                            int v8 = 0;
                                            while(v8 < sparseArray1.size()) {
                                                int v9 = sparseArray1.keyAt(v8);
                                                if(sparseArray0.indexOfKey(v9) < 0) {
                                                    Object object7 = sparseArray1.get(v9);
                                                    int v10 = (int)(((Integer)CLS166.MTH3194(object7, CLS27.MTH897("snsFieldCreateTime"))));
                                                    sparseArray2 = sparseArray0;
                                                    String s12 = CLS502.MTH6931(CLS66.MTH1407(object7));
                                                    if(ʿʽ0.MTH5768(v5, v10)) {
                                                        s12 = s12 + " " + CLS27.MTH889("deletedTag");
                                                    }
                                                    v11 = v5;
                                                    CLS166.MTH3198(object7, CLS27.MTH892("snsLikeContentField", CLS27.MTH897("snsCommentContentField")), s12);
                                                }
                                                else {
                                                    v11 = v5;
                                                    sparseArray2 = sparseArray0;
                                                }
                                                ++v8;
                                                sparseArray0 = sparseArray2;
                                                v5 = v11;
                                            }
                                        }
                                        if(sparseArray1.size() != 0) {
                                            LinkedList linkedList0 = new LinkedList();
                                            for(int v12 = 0; v12 < sparseArray1.size(); ++v12) {
                                                linkedList0.add(sparseArray1.get(sparseArray1.keyAt(v12)));
                                            }
                                            CLS166.MTH3198(object6, CLS27.MTH897("snsAttrCommentsListField"), linkedList0);
                                            contentValues2.put("attrBuf", CLS396.MTH5764(object6));
                                        }
                                    }
                                }
                            }
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                    }
                    String s13 = contentValues1.getAsString("userName");
                    if((TextUtils.isEmpty(CLS27.MTH904()) || !s13.equalsIgnoreCase(CLS27.MTH904())) && ˎᵢ0.MTH938("prevent_moments_recall", !CLS412.MTH6002()) && contentValues1.containsKey("sourceType") && contentValues1.containsKey("type")) {
                        int v13 = CLS182.MTH3474(4101404274724754229L, contentValues1);
                        int v14 = CLS182.MTH3474(0x38EB1D002B3CD335L, contentValues1);
                        if(ـˑ0.FLD1022 == null || !ـˑ0.FLD1022.contains(s13)) {
                            CLS124 ـˑ$ˆٴ1 = ـˑ0.FLD1024;
                            boolean z2 = ـˑ$ˆٴ1 == CLS124.FLD1017 || ـˑ$ˆٴ1 == CLS124.FLD1020;
                            int v15 = 8;
                            if((!z2 || v13 != 0) && (v14 != 1 && v14 != 15 || !z2 || v13 != 8 && (ـˑ$ˆٴ1 == CLS124.FLD1017 || v13 != 2))) {
                                if(v14 != 1 && v14 != 15 || v13 == 2 || ـˑ$ˆٴ1 == CLS124.FLD1019 || ـˑ$ˆٴ1 == CLS124.FLD1021) {
                                    String s16 = contentValues1.getAsString("snsId");
                                    if(CLS27.MTH901()) {
                                        z3 = false;
                                    }
                                    else {
                                        Class class4 = CLS27.MTH894("snsContentClass");
                                        if(class4 == null) {
                                            z3 = false;
                                        }
                                        else {
                                            try {
                                                Cursor cursor0 = ʿʽ0.MTH5759(String.format(CLS27.MTH882("q_snsinfo3"), s16), null);
                                                if(cursor0 == null) {
                                                    z3 = false;
                                                }
                                                else {
                                                    if(cursor0.moveToFirst()) {
                                                        Object object9 = CLS66.MTH1381(class4, cursor0.getBlob(cursor0.getColumnIndex("content")));
                                                        z3 = object9 == null || !ـˑ0.MTH2534(CLS66.MTH1511(object9)) ? false : true;
                                                    }
                                                    else {
                                                        z3 = false;
                                                    }
                                                    cursor0.close();
                                                }
                                            }
                                            catch(Throwable throwable2) {
                                                CLS27.MTH893(throwable2);
                                                z3 = false;
                                            }
                                        }
                                    }
                                    if(z3) {
                                        ᵔʾ3.MTH3207(-1);
                                    }
                                }
                            }
                            else if(v13 != 8 || ʿʽ0.MTH5757(((long)contentValues1.getAsLong("snsId"))) != 8) {
                                if(!ˎᵢ0.MTH938("enable_moment_deleted_filter", false)) {
                                    v15 = 10;
                                }
                                contentValues1.put("sourceType", v15);
                                try {
                                    if(!CLS27.MTH901() || ˎᵢ0.MTH938("show_moment_deleted_tag", false)) {
                                        Class class3 = CLS27.MTH894("snsContentClass");
                                        if(class3 != null) {
                                            Object object8 = CLS66.MTH1381(class3, contentValues1.getAsByteArray("content"));
                                            if(object8 != null) {
                                                String s14 = CLS66.MTH1511(object8);
                                                if(!ـˑ0.MTH2534(s14)) {
                                                    String s15 = CLS502.MTH6931(s14);
                                                    CLS166.MTH3198(object8, CLS27.MTH897("snsContentField"), CLS27.MTH889("deletedTag") + "\n" + s15);
                                                    contentValues1.put("content", CLS396.MTH5764(object8));
                                                }
                                            }
                                        }
                                    }
                                }
                                catch(Throwable throwable1) {
                                    CLS27.MTH893(throwable1);
                                }
                            }
                        }
                    }
                }
                ـˑ0.MTH2533(ᵔʾ3, s8, contentValues1);
                if("message".equalsIgnoreCase(s8) && contentValues1.containsKey("msgId") && contentValues1.containsKey("status")) {
                    long v16 = CLS34.MTH1080(0x38EB127F2B3CD335L, contentValues1);
                    int v17 = contentValues1.containsKey("status") ? CLS182.MTH3474(0x38EB120C2B3CD335L, contentValues1) : 0;
                    HashMap hashMap2 = ـˑ0.FLD1026;
                    if(!hashMap2.isEmpty() && hashMap2.containsKey(v16) && v17 == 2) {
                        ContentValues contentValues3 = (ContentValues)hashMap2.get(v16);
                        hashMap2.remove(v16);
                        contentValues1.put("content", contentValues3.getAsString("content"));
                        contentValues1.put("type", contentValues3.getAsInteger("type"));
                    }
                }
                return;
            }
            case 8: {
                CLS139 ﹶʼ0 = ـˑ0.FLD1447;
                if(!ﹶʼ0.FLD1410) {
                    String s17 = (String)arr_object[2];
                    ContentValues contentValues4 = (ContentValues)arr_object[3];
                    CLS29 ˎᵢ1 = ـˑ0.FLD1029;
                    if(ˎᵢ1.MTH938("comment_unread", false) && CLS502.MTH6934(s17, new String[]{"SnsInfo"})) {
                        ContentValues contentValues5 = new ContentValues();
                        String s18 = CLS182.MTH3479(0, contentValues5, "isRead", 0x38EB04D82B3CD335L);
                        ـˑ0.FLD1446.MTH5767(s18, contentValues5, "isRead = ?", new String[]{"1"});
                    }
                    if("message".equalsIgnoreCase(s17)) {
                        if(!CLS27.MTH901() && ((contentValues4.containsKey("isSend") ? CLS182.MTH3474(0x38EB128F2B3CD335L, contentValues4) : 0) != 0 && CLS182.MTH3474(4101392321830769461L, contentValues4) != 10000)) {
                            String s19 = contentValues4.getAsString("talker");
                            if(!CLS27.MTH904().equals(s19) && ˎᵢ1.MTH938("autorecall", false) && (CLS21.FLD76.MTH830("isAutoRecallMode", new Object[]{ﹶʼ0.FLD1434}) && contentValues4.containsKey("msgId"))) {
                                long v18 = CLS34.MTH1080(4101393069155078965L, contentValues4);
                                long v19 = CLS34.MTH1080(4101393094924882741L, contentValues4);
                                long v20 = Math.max(1000L, Math.min(ـˑ0.FLD1025, v19 + 120000L - System.currentTimeMillis()));
                                CLS649 ʽٴ1 = new CLS649(ـˑ0, v18, 1);
                                CLS40.FLD157.MTH1123(((CLS39)ʽٴ1), v20);
                            }
                        }
                        if(ˎᵢ1.MTH938("remote_recall", false) && !CLS27.MTH901() && ((contentValues4.containsKey("isSend") ? CLS182.MTH3474(0x38EB136A2B3CD335L, contentValues4) : 0) != 1 && CLS182.MTH3474(4101393262428607285L, contentValues4) == 1 && ﹶʼ0.FLD1438.MTH6895("remote_recall"))) {
                            String s20 = contentValues4.getAsString("talker");
                            if(CLS502.MTH6934(ˎᵢ1.MTH925("remote_recall_users", ""), new String[]{s20})) {
                                String s21 = contentValues4.getAsString("content");
                                String s22 = ˎᵢ1.MTH925("remote_recall_keyword", "");
                                if(!TextUtils.isEmpty(s22) && CLS502.MTH6934(s21, new String[]{s22})) {
                                    ـˑ0.FLD1444.getClass();
                                    String s23 = CLS27.MTH882("q_db47");
                                    Cursor cursor1 = ـˑ0.FLD1444.MTH5307(s23, null);
                                    if(cursor1 != null) {
                                        long v21 = cursor1.moveToFirst() ? CLS34.MTH1076(0x38EB18FB2B3CD335L, cursor1) : -1L;
                                        cursor1.close();
                                        if(v21 != -1L) {
                                            ـˑ0.MTH2536(v21);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 9: {
                ـˑ0.getClass();
                CLS696 ˊˆ0 = new CLS696(ـˑ0, 2);
                CLS40.FLD157.MTH1124(((CLS39)ˊˆ0));
                return;
            }
            case 10: {
                this.MTH2544(arr_object);
                return;
            }
            case 11: {
                ـˑ0.getClass();
                Object object10 = arr_object[0];
                int v22 = (int)(((Integer)arr_object[1]));
                String s24 = (String)arr_object[2];
                if(ـˑ0.FLD1029.MTH938("prevent_moments_recall", true) && CLS502.MTH6940(s24, new CharSequence[]{CLS27.MTH882("prevent_moments_recall")}) || ـˑ0.FLD1029.MTH938("comment_unread", false) && CLS502.MTH6934(s24, new String[]{CLS27.MTH882("comment_unread")})) {
                    if(v22 == 1) {
                        try {
                        label_278:
                            Method method2 = object10.getClass().getDeclaredMethod("setResult", class0);
                            method2.setAccessible(true);
                            method2.invoke(object10, integer0);
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                    else if(v22 == 2) {
                        integer0 = Boolean.FALSE;
                        goto label_278;
                    }
                }
                return;
            }
            case 12: {
                ـˑ0.getClass();
                CLS696 ˊˆ1 = new CLS696(ـˑ0, 0);
                CLS40.FLD157.MTH1124(((CLS39)ˊˆ1));
                return;
            }
            case 13: {
                ـˑ0.getClass();
                CLS696 ˊˆ2 = new CLS696(ـˑ0, 1);
                CLS40.FLD157.MTH1124(((CLS39)ˊˆ2));
                return;
            }
            case 14: {
                ـˑ0.getClass();
                ـˑ0.FLD1025 = (int)(((Integer)arr_object[0]));
                return;
            }
            default: {
                ـˑ0.getClass();
                String s = (String)arr_object[0];
                ContentValues contentValues0 = CLS371.MTH5368(ـˑ0.FLD1444.MTH5315(ـˑ0.FLD1447.FLD1434));
                if(contentValues0 != null) {
                    long v = CLS34.MTH1080(0x38EB045B2B3CD335L, contentValues0);
                    long v1 = CLS34.MTH1080(4101376722509550389L, contentValues0);
                    String[] arr_s = s.split(" ");
                    long v2 = arr_s.length <= 1 ? Math.max(1000L, v + 120000L - System.currentTimeMillis()) : Math.min(((int)(Double.parseDouble(arr_s[1]) * 1000.0)), Math.max(1000L, v + 120000L - System.currentTimeMillis()));
                    CLS649 ʽٴ0 = new CLS649(ـˑ0, v1, 0);
                    CLS40.FLD157.MTH1123(((CLS39)ʽٴ0), v2);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2544(Object[] arr_object) {
        String s4;
        String s5;
        CLS760 ـˑ0 = this.FLD1032;
        ـˑ0.getClass();
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        if(ᵔʾ0.MTH3205() != null) {
            int v = CLS166.MTH3181(ᵔʾ0.MTH3205(), "field_isSend");
            String s = (String)CLS166.MTH3194(ᵔʾ0.MTH3205(), "field_talker");
            if(!TextUtils.isEmpty(s) && v != 1 && !CLS372.MTH5400(s)) {
                int v1 = CLS166.MTH3181(ᵔʾ0.MTH3205(), "field_type");
                String s1 = (String)CLS166.MTH3194(ᵔʾ0.MTH3205(), "field_content");
                if(v1 == 1 && ـˑ0.FLD1028 != null) {
                    CLS29 ˎᵢ0 = ـˑ0.FLD1029;
                    if(ˎᵢ0.MTH938("enable_chat_filter", false) && !CLS502.MTH6934(ˎᵢ0.MTH925("chat_filter_exclude", ""), new String[]{s})) {
                        String s2 = CLS426.MTH6106(v, s1, s);
                        if(!TextUtils.isEmpty(s2) && CLS502.MTH6935(ـˑ0.FLD1028, s2)) {
                            CLS166.MTH3196(10000, ᵔʾ0.MTH3205(), "field_type");
                            CLS166.MTH3198(ᵔʾ0.MTH3205(), "field_content", ˎᵢ0.MTH925("chat_filtered_msg", CLS27.MTH889("chat_filtered_msg")) + " (" + (CLS426.MTH6126(s) ? CLS613.MTH1971(CLS66.MTH1452(s, CLS426.MTH6109(s1))) : ـˑ0.FLD1444.MTH5311(s)) + ")");
                        }
                    }
                }
                if((v1 == 1 || v1 == 0x1000031) && CLS502.MTH6934(s1, new String[]{"#*"}) && CLS502.MTH6934(s1, new String[]{"*#"})) {
                    String s3 = CLS426.MTH6106(v, s1, s);
                    if(v1 != 1) {
                        s4 = s1.substring(0, s1.indexOf("<"));
                        s3 = (String)CLS392.MTH5633(s1, "appmsg").get(".appmsg.content");
                        if(TextUtils.isEmpty(s3)) {
                            s3 = s1.substring(s1.indexOf("<content>") + 9, s1.indexOf("</content"));
                        }
                    label_26:
                        if(!TextUtils.isEmpty(s3) && s3.endsWith("*#") && s3.startsWith("#*")) {
                            if(CLS426.MTH6126(s)) {
                                StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                                stringBuilder0.append(CLS426.MTH6109(s1));
                                s5 = stringBuilder0.toString();
                            }
                            else {
                                s5 = s;
                            }
                            String s6 = CLS412.MTH5994(s5, s3);
                            if(!TextUtils.isEmpty(s6) && (!CLS426.MTH6129(s6) || CLS502.MTH6934(s6, new String[]{CLS66.MTH1452(s, CLS27.MTH904())}))) {
                                CLS166.MTH3196(1, ᵔʾ0.MTH3205(), "field_type");
                                CLS166.MTH3198(ᵔʾ0.MTH3205(), "field_content", s4 + s6);
                            }
                        }
                    }
                    else if(s1.endsWith("*#")) {
                        s4 = s1.substring(0, s1.indexOf("#*"));
                        goto label_26;
                    }
                }
            }
        }
    }
}

