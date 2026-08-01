// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS44;
import b.ˆʿ.CLS61;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS91;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1255;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412.CLS411;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS502;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS659 implements CLS35 {
    public final int FLD669;
    public final CLS839 FLD670;

    public CLS659(CLS839 ᵢⁱ0, int v) {
        this.FLD669 = v;
        this.FLD670 = ᵢⁱ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        long v4;
        Class class0 = CLS44.class;
        Class class1 = CLS485.class;
        CLS839 ᵢⁱ0 = this.FLD670;
        switch(this.FLD669) {
            case 0: {
                ᵢⁱ0.getClass();
                try {
                    CLS758 ـˋ0 = new CLS758(ᵢⁱ0, 2);
                    CLS40.FLD157.MTH1123(((CLS39)ـˋ0), 2000L);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                if(ᵢⁱ0.FLD1301) {
                    CLS1255 ᵢﹶ0 = new CLS1255(ᵢⁱ0, new CLS167(arr_object[0]), 19);
                    CLS40.FLD157.MTH1124(((CLS39)ᵢﹶ0));
                }
                return;
            }
            case 2: {
                if(ᵢⁱ0.FLD1301) {
                    String s1 = (String)arr_object[0];
                    if(!TextUtils.isEmpty(s1) && s1.equals(ᵢⁱ0.FLD1303)) {
                        CLS758 ـˋ1 = new CLS758(ᵢⁱ0, 0);
                        CLS40.FLD157.MTH1124(((CLS39)ـˋ1));
                    }
                }
                return;
            }
            case 3: {
                if(ᵢⁱ0.FLD1301) {
                    CLS139 ﹶʼ0 = ᵢⁱ0.FLD1447;
                    boolean z = ﹶʼ0.FLD1438.MTH6895("auto_add_members1");
                    ArrayList arrayList2 = ᵢⁱ0.FLD1302;
                    ArrayDeque arrayDeque0 = ᵢⁱ0.FLD1307;
                    CLS29 ˎᵢ0 = ᵢⁱ0.FLD1445;
                    if(z) {
                        if(!arrayDeque0.isEmpty()) {
                            arrayDeque0.addAll(arrayList2);
                        }
                        if(arrayDeque0.isEmpty()) {
                            ᵢⁱ0.FLD1301 = false;
                            ˎᵢ0.MTH922(Boolean.FALSE, "$aam_start");
                        }
                        else {
                            ᵢⁱ0.MTH2905();
                        }
                    }
                    if(ﹶʼ0.FLD1438.MTH6895("auto_add_members2")) {
                        if(!arrayDeque0.isEmpty()) {
                            arrayDeque0.addAll(arrayList2);
                        }
                        if(arrayDeque0.isEmpty()) {
                            ᵢⁱ0.FLD1301 = false;
                            ˎᵢ0.MTH922(Boolean.FALSE, "$aam_start");
                        }
                        else {
                            ᵢⁱ0.MTH2905();
                        }
                    }
                    CLS27.MTH906(((String)arr_object[0]));
                    CLS412.MTH6014(((CLS140)ᵢⁱ0).MTH3042(), ((String)arr_object[0]));
                }
                return;
            }
            case 4: {
                CLS139 ﹶʼ1 = ᵢⁱ0.FLD1447;
                if(!ﹶʼ1.FLD1410 && "message".equalsIgnoreCase(((String)arr_object[2]))) {
                    ContentValues contentValues0 = (ContentValues)arr_object[3];
                    if(contentValues0.containsKey("type")) {
                        int v2 = CLS182.MTH3474(4101453542294606645L, contentValues0);
                        int v3 = contentValues0.containsKey("isSend") ? CLS182.MTH3474(0x38EB4A502B3CD335L, contentValues0) : 0;
                        String s2 = contentValues0.getAsString("talker");
                        if(v3 != 1 && !CLS426.MTH6126(s2)) {
                            if(v2 == 1) {
                                ᵢⁱ0.MTH2901(contentValues0.getAsString("content"), s2);
                                return;
                            }
                            if(v2 == 0x19000031 || v2 == 0x1A000031 || v2 == 0x1C000031) {
                                CLS29 ˎᵢ1 = ᵢⁱ0.FLD1445;
                                if((ˎᵢ1.MTH938("f_rp_reply_enable_rp", false) || ˎᵢ1.MTH938("f_rp_reply_enable_mt", false)) && ﹶʼ1.FLD1438.MTH6895("f_rp_reply")) {
                                    if(v2 != 0x19000031) {
                                        if(ˎᵢ1.MTH938("f_rp_reply_enable_rp", false)) {
                                            v4 = 0x38EB4AD32B3CD335L;
                                        label_100:
                                            String s3 = CLS370.MTH5289(v4);
                                            CLS40 ﾞᵎ0 = CLS40.FLD157;
                                            CLS91 ᵔʾ0 = ((CLS44)ﾞᵎ0.MTH1118(class0)).MTH1184(s3);
                                            if(ᵔʾ0 != null) {
                                                String s4 = ᵔʾ0.MTH1735();
                                                if(!TextUtils.isEmpty(s4)) {
                                                    ﾞᵎ0.MTH1123(((CLS39)new CLS754(ᵢⁱ0, s4, s2, 1)), ((long)CLS404.MTH5913(s3)));
                                                }
                                            }
                                        }
                                    }
                                    else if(ˎᵢ1.MTH938("f_rp_reply_enable_mt", false)) {
                                        v4 = 0x38EB4A302B3CD335L;
                                        goto label_100;
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 5: {
                ᵢⁱ0.getClass();
                int v5 = (int)(((Integer)arr_object[0]));
                String s5 = (String)arr_object[1];
                int v6 = (int)(((Integer)arr_object[2]));
                String s6 = (String)arr_object[3];
                CLS29 ˎᵢ2 = ᵢⁱ0.FLD1445;
                if(v6 != 1) {
                    ᵢⁱ0.MTH2901(s6, s5);
                    if(ˎᵢ2.MTH938("f_rp_threshold_reply_mt_enable", false) && ᵢⁱ0.FLD1447.FLD1438.MTH6895("f_rp_threshold_reply")) {
                        int v8 = ˎᵢ2.MTH927(0, "f_rp_threshold_mt");
                        CLS40 ﾞᵎ1 = CLS40.FLD157;
                        CLS44 ˆٴ0 = (CLS44)ﾞᵎ1.MTH1118(class0);
                        String s9 = CLS370.MTH5289((v5 < v8 ? 4101457218786612021L : 4101457102822495029L));
                        CLS91 ᵔʾ1 = ˆٴ0.MTH1184(s9);
                        if(ᵔʾ1 != null) {
                            String s10 = ᵔʾ1.MTH1735();
                            if(!TextUtils.isEmpty(s10)) {
                                ﾞᵎ1.MTH1117(((CLS39)new CLS754(ᵢⁱ0, s10, s5, 0)), ((long)CLS404.MTH5913(s9)));
                            }
                        }
                    }
                }
                else if(ˎᵢ2.MTH938("total_amount_notification_enable", false)) {
                    int v7 = ᵢⁱ0.MTH2900().MTH1293(s5) + v5;
                    ᵢⁱ0.MTH2900().MTH1297(s5, v7);
                    if(v7 >= ˎᵢ2.MTH927(15000, "total_amount_notification_max")) {
                        Bitmap bitmap0 = CLS372.MTH5411(s5);
                        String s7 = ᵢⁱ0.FLD1444.MTH5311(s5);
                        String s8 = CLS27.MTH889("rp_amount_msg");
                        Object object0 = CLS40.FLD157.MTH1118(class1);
                        ((CLS485)CLS40.FLD157.MTH1118(class1)).getClass();
                        ((CLS485)object0).MTH6711(CLS485.MTH6729(s5), bitmap0, s5, s7, String.format(s8, ((double)(((double)v5) / 100.0)), ((double)(((double)v7) / 100.0))), "rpamount_");
                        ᵢⁱ0.MTH2900().MTH1297(s5, 0);
                        return;
                    }
                }
                return;
            }
            case 6: {
                ᵢⁱ0.getClass();
                int v9 = (int)(((Integer)arr_object[0]));
                String s11 = (String)arr_object[1];
                String s12 = (String)arr_object[2];
                String s13 = (String)arr_object[3];
                if(!CLS426.MTH6126(s11)) {
                    ᵢⁱ0.MTH2901(s13, s11);
                }
                CLS29 ˎᵢ3 = ᵢⁱ0.FLD1445;
                if(v9 != 0 && ˎᵢ3.MTH938("total_amount_notification_enable", false)) {
                    int v10 = ᵢⁱ0.MTH2900().MTH1293(s12) + v9;
                    ᵢⁱ0.MTH2900().MTH1297(s12, v10);
                    if(v10 >= ˎᵢ3.MTH927(15000, "total_amount_notification_max")) {
                        Bitmap bitmap1 = CLS372.MTH5411(s11);
                        String s14 = ᵢⁱ0.FLD1444.MTH5311(s12);
                        String s15 = CLS27.MTH889("rp_amount_msg");
                        Object object1 = CLS40.FLD157.MTH1118(class1);
                        ((CLS485)CLS40.FLD157.MTH1118(class1)).getClass();
                        ((CLS485)object1).MTH6711(CLS485.MTH6729(s11), bitmap1, s12, s14, String.format(s15, ((double)(((double)v9) / 100.0)), ((double)(((double)v10) / 100.0))), "rpamount_");
                        ᵢⁱ0.MTH2900().MTH1297(s12, 0);
                    }
                }
                if(ˎᵢ3.MTH938("f_rp_threshold_reply_rp_enable", false) && ᵢⁱ0.FLD1447.FLD1438.MTH6895("f_rp_threshold_reply")) {
                    int v11 = ˎᵢ3.MTH927(50000, "f_rp_threshold_rp");
                    CLS40 ﾞᵎ2 = CLS40.FLD157;
                    CLS44 ˆٴ1 = (CLS44)ﾞᵎ2.MTH1118(class0);
                    String s16 = CLS370.MTH5289((v9 < v11 ? 4101456862304326453L : 0x38EB4CAE2B3CD335L));
                    CLS91 ᵔʾ2 = ˆٴ1.MTH1184(s16);
                    if(ᵔʾ2 != null) {
                        String s17 = ᵔʾ2.MTH1735();
                        if(!TextUtils.isEmpty(s17)) {
                            ﾞᵎ2.MTH1117(((CLS39)new CLS754(ᵢⁱ0, s17, s11, 2)), ((long)CLS404.MTH5913(s16)));
                        }
                    }
                }
                return;
            }
            case 7: {
                if(ᵢⁱ0.FLD1447.FLD1438.MTH6895("mass_invite_chatrooms")) {
                    CLS412.MTH6014(((CLS140)ᵢⁱ0).MTH3042(), CLS27.MTH889("start") + CLS27.MTH889("mass_invite_chatrooms"));
                    CLS29 ˎᵢ4 = ᵢⁱ0.FLD1445;
                    String s18 = ˎᵢ4.MTH925("$mass_invite_chatrooms", "");
                    if(!TextUtils.isEmpty(s18)) {
                        String s19 = ˎᵢ4.MTH925("$mic_tag", "");
                        ArrayList arrayList3 = ᵢⁱ0.FLD1444.MTH5328(s19);
                        if(!arrayList3.isEmpty()) {
                            String[] arr_s = CLS502.MTH6941(s18);
                            if(arr_s.length != 0) {
                                long v12 = (long)ˎᵢ4.MTH927(3000, "$mass_invite_chatrooms_delay");
                                CLS737 ˑٴ0 = new CLS737(ᵢⁱ0, arr_s, arrayList3, arr_s.length, 1);
                                CLS412.MTH6016(v12, arr_s.length, ((CLS411)ˑٴ0), null);
                            }
                        }
                    }
                }
                return;
            }
            default: {
                ᵢⁱ0.getClass();
                int v = (int)(((Integer)arr_object[0]));
                try {
                    if(ᵢⁱ0.FLD1447.FLD1438.MTH6895("random_del_contacts")) {
                        ArrayList arrayList0 = new ArrayList();
                        String s = CLS27.MTH904();
                        ᵢⁱ0.FLD1444.MTH5381(s, arrayList0);
                        CLS61 ﾞٴ0 = (CLS61)CLS40.FLD157.MTH1118(CLS61.class);
                        ﾞٴ0.getClass();
                        HashSet hashSet0 = new HashSet();
                        Cursor cursor0 = CLS61.MTH1342(ﾞٴ0.getReadableDatabase(), 0);
                        if(cursor0 != null) {
                            if(cursor0.moveToFirst()) {
                                while(true) {
                                    hashSet0.add(CLS61.MTH1328(cursor0).FLD396);
                                    if(!cursor0.moveToNext()) {
                                        break;
                                    }
                                }
                            }
                            cursor0.close();
                        }
                        hashSet0.addAll(Arrays.asList(CLS502.MTH6941(ᵢⁱ0.FLD1445.MTH925("$random_del_excl", ""))));
                        Iterator iterator0 = arrayList0.iterator();
                        while(iterator0.hasNext()) {
                            iterator0.next();
                            if(hashSet0.contains("")) {
                                iterator0.remove();
                            }
                        }
                        HashSet hashSet1 = new HashSet();
                        while(hashSet1.size() != v) {
                            int v1 = CLS412.MTH6015(arrayList0.size() - 1, 0);
                            if(v1 < arrayList0.size()) {
                                hashSet1.add(((CLS78)arrayList0.get(v1)));
                            }
                        }
                        ArrayList arrayList1 = new ArrayList(hashSet1);
                        CLS372.MTH5409(((CLS140)ᵢⁱ0).MTH3042(), arrayList1, true, false);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

