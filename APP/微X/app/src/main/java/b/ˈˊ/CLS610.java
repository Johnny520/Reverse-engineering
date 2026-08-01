// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.os.Bundle;
import android.util.SparseArray;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS12;
import b.ˆٴ.CLS66;
import b.ˑٴ.CLS755;
import b.ˑٴ.CLS773;
import b.יᐧ.CLS151.CLS149;
import b.ـˏ.CLS1645;
import b.ـˏ.CLS887;
import b.ـˏ.CLS890;
import b.ـˏ.CLS892;
import b.ـˏ.CLS893;
import b.ـˏ.CLS894;
import b.ⁱʾ.CLS1274;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS466;

public final class CLS610 implements CLS149 {
    public final int FLD487;

    public CLS610(int v) {
        this.FLD487 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.יᐧ.CLS151$CLS149
    public final void MTH3132(int v, Object object0, SparseArray sparseArray0, CLS1274 ﾞˎ0) {
        switch(this.FLD487) {
            case 0: {
                sparseArray0.put(v, new CLS887(((String)CLS392.MTH5633(((Bundle)object0).getString("content"), "msg").get(".msg.appmsg.title"))));
                ﾞˎ0.MTH774();
                return;
            }
            case 1: {
                String s = ((Bundle)object0).getString("imgPath");
                CLS466.MTH6507(s, ((CLS12)new CLS589(s, ((Bundle)object0).getLong("msgId"), sparseArray0, v, ﾞˎ0, 0)), false, 0);
                return;
            }
            case 2: {
                String s1 = ((Bundle)object0).getString("imgPath");
                String s2 = ((Bundle)object0).getString("content");
                long v1 = ((Bundle)object0).getLong("msgId");
                sparseArray0.put(v, new CLS892(s2, CLS466.MTH6532(s1), v1));
                ﾞˎ0.MTH774();
                return;
            }
            case 3: {
                sparseArray0.put(v, new CLS887(((Bundle)object0).getString("stripContent")));
                ﾞˎ0.MTH774();
                return;
            }
            case 4: {
                sparseArray0.put(v, new CLS893(1, ((Bundle)object0).getString("stripContent")));
                ﾞˎ0.MTH774();
                return;
            }
            case 5: {
                long v2 = ((Bundle)object0).getLong("msgSvrId");
                long v3 = ((Bundle)object0).getLong("msgId");
                int v4 = ((Bundle)object0).getInt("isSend");
                String s3 = ((Bundle)object0).getString("imgPath");
                CLS466.MTH6539(v4, v3, v2, ((CLS0)new CLS588(sparseArray0, v, ﾞˎ0, 0)), s3);
                return;
            }
            case 6: {
                String s4 = ((Bundle)object0).getString("imgPath");
                sparseArray0.put(v, new CLS894(((Bundle)object0).getString("content"), s4));
                ﾞˎ0.MTH774();
                return;
            }
            case 7: {
                sparseArray0.put(v, new CLS890(((Bundle)object0).getLong("msgId")));
                ﾞˎ0.MTH774();
                return;
            }
            case 8: {
                String s5 = (String)CLS392.MTH5633(((Bundle)object0).getString("content"), "msg").get(".msg.appmsg.title");
                Bundle bundle0 = new Bundle();
                bundle0.putInt("type", 1);
                bundle0.putString("content", s5);
                sparseArray0.put(v, bundle0);
                ﾞˎ0.MTH774();
                return;
            }
            case 9: {
                String s6 = ((Bundle)object0).getString("imgPath");
                CLS466.MTH6507(s6, ((CLS12)new CLS773(v, sparseArray0, ﾞˎ0, s6)), false, 0);
                return;
            }
            case 10: {
                String s7 = ((Bundle)object0).getString("stripContent");
                Bundle bundle1 = new Bundle();
                bundle1.putInt("type", 1);
                bundle1.putString("content", s7);
                sparseArray0.put(v, bundle1);
                ﾞˎ0.MTH774();
                return;
            }
            case 11: {
                long v5 = ((Bundle)object0).getLong("msgSvrId");
                long v6 = ((Bundle)object0).getLong("msgId");
                int v7 = ((Bundle)object0).getInt("isSend");
                String s8 = ((Bundle)object0).getString("imgPath");
                CLS466.MTH6539(v7, v6, v5, ((CLS0)new CLS755(((Bundle)object0).getString("c"), ((Bundle)object0), sparseArray0, v, ﾞˎ0)), s8);
                return;
            }
            case 12: {
                String s9 = ((Bundle)object0).getString("imgPath");
                String[] arr_s = ((Bundle)object0).getString("content").split(":");
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", 34);
                bundle2.putString("imgPath", s9);
                bundle2.putString("voicePath", CLS66.MTH1483(s9));
                bundle2.putInt("voiceLength", Integer.parseInt(arr_s[1]));
                sparseArray0.put(v, bundle2);
                ﾞˎ0.MTH774();
                return;
            }
            case 13: {
                String s10 = ((Bundle)object0).getString("imgPath");
                String s11 = ((Bundle)object0).getString("content");
                String s12 = ((Bundle)object0).getString("talker");
                long v8 = ((Bundle)object0).getLong("msgId");
                byte[] arr_b = CLS466.MTH6532(s10);
                Bundle bundle3 = new Bundle();
                bundle3.putInt("type", 49);
                bundle3.putString("content", s11);
                bundle3.putString("talker", s12);
                bundle3.putByteArray("imgBuf", arr_b);
                bundle3.putString("imgPath", s10);
                bundle3.putLong("msgId", v8);
                sparseArray0.put(v, bundle3);
                ﾞˎ0.MTH774();
                return;
            }
            case 14: {
                String s13 = ((Bundle)object0).getString("stripContent");
                Bundle bundle4 = new Bundle();
                bundle4.putInt("type", 1);
                bundle4.putString("content", s13);
                sparseArray0.put(v, bundle4);
                ﾞˎ0.MTH774();
                return;
            }
            case 15: {
                long v9 = ((Bundle)object0).getLong("msgSvrId");
                long v10 = ((Bundle)object0).getLong("msgId");
                int v11 = ((Bundle)object0).getInt("isSend");
                String s14 = ((Bundle)object0).getString("imgPath");
                CLS466.MTH6539(v11, v10, v9, ((CLS0)new CLS588(sparseArray0, v, ﾞˎ0, 1)), s14);
                return;
            }
            case 16: {
                sparseArray0.put(v, new CLS887(((String)CLS392.MTH5633(((Bundle)object0).getString("content"), "msg").get(".msg.appmsg.title"))));
                ﾞˎ0.MTH774();
                return;
            }
            case 17: {
                String s15 = ((Bundle)object0).getString("imgPath");
                CLS466.MTH6507(s15, ((CLS12)new CLS589(s15, ((Bundle)object0).getLong("msgId"), sparseArray0, v, ﾞˎ0, 1)), false, 0);
                return;
            }
            case 18: {
                String s16 = ((Bundle)object0).getString("imgPath");
                String s17 = ((Bundle)object0).getString("content");
                long v12 = ((Bundle)object0).getLong("msgId");
                sparseArray0.put(v, new CLS892(s17, CLS466.MTH6532(s16), v12));
                ﾞˎ0.MTH774();
                return;
            }
            case 19: {
                sparseArray0.put(v, new CLS887(((Bundle)object0).getString("stripContent")));
                ﾞˎ0.MTH774();
                return;
            }
            case 20: {
                long v13 = ((Bundle)object0).getLong("msgSvrId");
                long v14 = ((Bundle)object0).getLong("msgId");
                int v15 = ((Bundle)object0).getInt("isSend");
                String s18 = ((Bundle)object0).getString("imgPath");
                CLS466.MTH6539(v15, v14, v13, ((CLS0)new CLS588(sparseArray0, v, ﾞˎ0, 2)), s18);
                return;
            }
            case 21: {
                String s19 = ((Bundle)object0).getString("imgPath");
                sparseArray0.put(v, new CLS894(((Bundle)object0).getString("content"), s19));
                ﾞˎ0.MTH774();
                return;
            }
            case 22: {
                sparseArray0.put(v, new CLS1645(((Bundle)object0).getString("content")));
                ﾞˎ0.MTH774();
                return;
            }
            default: {
                sparseArray0.put(v, new CLS890(((Bundle)object0).getLong("msgId")));
                ﾞˎ0.MTH774();
            }
        }
    }
}

