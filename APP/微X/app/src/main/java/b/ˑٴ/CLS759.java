// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS17;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS42;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS85.CLS83;
import b.ˈˈ.CLS85.CLS84;
import b.ˈˈ.CLS85;
import b.יﹳ.CLS166;
import b.ᵔʾ.CLS288;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS485.CLS484;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.Collections;

public final class CLS759 implements CLS17, CLS39 {
    public final int FLD1011;
    public final Object FLD1012;
    public final int FLD1013;
    public final int FLD1014;
    public final String FLD1015;
    public final Object FLD1016;

    public CLS759(CLS794 ᴵʽ0, ContentValues contentValues0, int v, String s, int v1) {
        this.FLD1011 = 0;
        super();
        this.FLD1012 = ᴵʽ0;
        this.FLD1016 = contentValues0;
        this.FLD1014 = v;
        this.FLD1015 = s;
        this.FLD1013 = v1;
    }

    public CLS759(CLS818 ᵎⁱ0, int v, ArrayList arrayList0, int v1, String s) {
        this.FLD1011 = 1;
        super();
        this.FLD1012 = ᵎⁱ0;
        this.FLD1014 = v;
        this.FLD1016 = arrayList0;
        this.FLD1013 = v1;
        this.FLD1015 = s;
    }

    public CLS759(Class class0, String s, int v, int v1, Class class1) {
        this.FLD1011 = 2;
        super();
        this.FLD1012 = class0;
        this.FLD1015 = s;
        this.FLD1014 = v;
        this.FLD1013 = v1;
        this.FLD1016 = class1;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        Activity activity0;
        String s = this.FLD1015;
        int v = this.FLD1014;
        int v1 = this.FLD1013;
        Object object0 = this.FLD1016;
        Object object1 = this.FLD1012;
        if(this.FLD1011 == 0) {
            CLS794 ᴵʽ0 = (CLS794)object1;
            ContentValues contentValues0 = (ContentValues)object0;
            ᴵʽ0.getClass();
            CLS42 ʾᵢ0 = CLS794.MTH2694();
            try {
                String s1 = contentValues0.getAsString("content");
                CLS371 ʻ0 = ᴵʽ0.FLD1444;
                CLS29 ˎᵢ0 = ᴵʽ0.FLD1445;
                switch(v) {
                    case 1: {
                        if(ˎᵢ0.MTH938("auto_exit_chatroom_keyword", false)) {
                            String s2 = CLS426.MTH6106(v1, s1, s);
                            if(!TextUtils.isEmpty(s2) && CLS502.MTH6935(ᴵʽ0.FLD1158, s2)) {
                                int v2 = ˎᵢ0.MTH927(5, "auto_exit_chatroom_keyword_max_count");
                                if(ʾᵢ0.MTH1142(s, "_KEYWORD_", s2) >= v2) {
                                    CLS66.MTH1436(s, CLS27.MTH904());
                                    ʾᵢ0.MTH1141(s, "_NAMECARD_");
                                    ʾᵢ0.MTH1141(s, "_KEYWORD_");
                                    activity0 = ((CLS140)ᴵʽ0).MTH3042();
                                    CLS412.MTH6014(activity0, CLS27.MTH889("auto_exit_chatroom") + ": " + ʻ0.MTH5316(s));
                                    return;
                                }
                            }
                        }
                        break;
                    }
                    case 42: {
                        if(ˎᵢ0.MTH938("auto_exit_chatroom_namecard", false)) {
                            int v3 = ˎᵢ0.MTH927(5, "auto_exit_chatroom_namecard_max_count");
                            if(ʾᵢ0.MTH1142(s, "_NAMECARD_", "") >= v3) {
                                CLS66.MTH1436(s, CLS27.MTH904());
                                ʾᵢ0.MTH1141(s, "_NAMECARD_");
                                ʾᵢ0.MTH1141(s, "_KEYWORD_");
                                activity0 = ((CLS140)ᴵʽ0).MTH3042();
                                CLS412.MTH6014(activity0, CLS27.MTH889("auto_exit_chatroom") + ": " + ʻ0.MTH5316(s));
                                return;
                            }
                        }
                        break;
                    }
                    default: {
                        return;
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        ((CLS818)object1).getClass();
        int v4 = Math.min(v, ((ArrayList)object0).size());
        String s3 = CLS27.MTH895().MTH925("chatroom_friend_req_excl", "");
        String s4 = CLS372.MTH5418("chatroom_friendreq_type", "chatroom");
        CLS29 ˎᵢ1 = ((CLS818)object1).FLD1445;
        int v5 = ˎᵢ1.MTH927(0, "friendreq_order");
        if(v5 == 1) {
            Collections.reverse(((ArrayList)object0));
        }
        else if(v5 == 2) {
            Collections.shuffle(((ArrayList)object0));
        }
        int v6 = 1;
        for(Object object2: ((ArrayList)object0)) {
            CLS78 ˊﾞ0 = (CLS78)object2;
            if(!CLS502.MTH6934(s3, new String[]{""})) {
                CLS288 ˈˊ0 = CLS288.FLD2989;
                if(!ˈˊ0.MTH4730("") && (v1 == -1 || v1 == CLS66.MTH1499(""))) {
                    CLS85 ـˏ0 = new CLS85("", CLS66.MTH1452(s, ""), s4);
                    ـˏ0.FLD340 = s;
                    ـˏ0.FLD329 = true;
                    ـˏ0.FLD330 = CLS83.FLD318;
                    ـˏ0.FLD334 = true;
                    int v7 = ˎᵢ1.MTH927(0, "friendreq_permission_type");
                    int v8 = ˎᵢ1.MTH927(0, "friendreq_history_type");
                    ـˏ0.MTH1692((v7 == 0 ? CLS84.FLD325 : CLS84.FLD327), v8);
                    ˈˊ0.MTH4731(ـˏ0);
                    if(v != -1) {
                        if(v4 == v6) {
                            break;
                        }
                        ++v6;
                    }
                }
            }
        }
        CLS412.MTH6014(((CLS140)(((CLS818)object1))).MTH3042(), CLS27.MTH889("start_friend_request"));
        CLS288.FLD2989.MTH4734();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        int v1;
        Class class0 = (Class)this.FLD1012;
        Class class1 = (Class)this.FLD1016;
        String s = (String)arr_object[0];
        int v = (int)(((Integer)arr_object[1]));
        try {
            Object object0 = CLS166.MTH3188(class0, new Object[0]);
            CLS166.MTH3198(object0, CLS27.MTH897("massSendField1"), this.FLD1015);
            CLS166.MTH3198(object0, CLS27.MTH897("massSendField2"), this.FLD1014);
            CLS166.MTH3198(object0, CLS27.MTH892("massSendField_filename", "filename"), s);
            CLS166.MTH3198(object0, CLS27.MTH897("massSendField3"), this.FLD1013);
            CLS166.MTH3198(object0, CLS27.MTH897("massSendField4"), v);
            if(this.FLD1013 == 43) {
                try {
                    CLS166.MTH3198(object0, CLS27.MTH892("massSendField_videoSource", "videoSource"), 2);
                }
                catch(Throwable throwable1) {
                    v1 = 1;
                    goto label_29;
                }
                try {
                    CLS40 ﾞᵎ0 = CLS40.FLD157;
                    CLS484 ᐧﾞ$ˆٴ0 = (CLS484)ﾞᵎ0.FLD155.MTH1744("notification_" + s);
                    if(ᐧﾞ$ˆٴ0 != null) {
                        CLS485 ᐧﾞ0 = (CLS485)ﾞᵎ0.MTH1118(CLS485.class);
                        String s1 = CLS27.MTH889("uploading");
                        ᐧﾞ0.getClass();
                        CLS485.MTH6725(ᐧﾞ$ˆٴ0, s1, 0);
                    }
                    v1 = 0;
                    goto label_30;
                }
                catch(Throwable throwable1) {
                    v1 = 0;
                }
            label_29:
                CLS27.MTH893(throwable1);
            }
            else {
                v1 = 1;
            }
        label_30:
            Object object1 = CLS166.MTH3188(class1, new Object[]{object0, Boolean.FALSE, v1});
            CLS166.MTH3199(object1, "wx", s);
            CLS66.MTH1521(object1);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

