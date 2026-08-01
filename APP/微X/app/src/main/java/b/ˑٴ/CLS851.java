// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS85.CLS83;
import b.ˈˈ.CLS85.CLS84;
import b.ˈˈ.CLS85;
import b.ᵔʾ.CLS288;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.Collections;

public final class CLS851 implements CLS39 {
    public final int FLD1342;
    public final int FLD1343;
    public final CLS818 FLD1344;
    public final ArrayList FLD1345;

    public CLS851(CLS818 ᵎⁱ0, int v, ArrayList arrayList0, int v1) {
        this.FLD1342 = v1;
        this.FLD1344 = ᵎⁱ0;
        this.FLD1343 = v;
        this.FLD1345 = arrayList0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        int v = this.FLD1343;
        ArrayList arrayList0 = this.FLD1345;
        CLS818 ᵎⁱ0 = this.FLD1344;
        if(this.FLD1342 == 0) {
            ᵎⁱ0.getClass();
            int v1 = Math.min(v, arrayList0.size());
            CLS29 ˎᵢ0 = ᵎⁱ0.FLD1445;
            String s = ˎᵢ0.MTH925("friend_req_excl", "");
            String s1 = CLS372.MTH5418("request_friendreq_type", "request");
            int v2 = ˎᵢ0.MTH927(0, "friendreq_order");
            if(v2 == 1) {
                Collections.reverse(arrayList0);
            }
            else if(v2 == 2) {
                Collections.shuffle(arrayList0);
            }
            int v3 = 1;
            for(Object object0: arrayList0) {
                CLS78 ˊﾞ0 = (CLS78)object0;
                if(!CLS502.MTH6934(s, new String[]{""})) {
                    CLS288 ˈˊ0 = CLS288.FLD2989;
                    if(!ˈˊ0.MTH4730("")) {
                        CLS85 ـˏ0 = new CLS85("", "", s1);
                        ـˏ0.FLD328 = "";
                        ـˏ0.FLD329 = true;
                        ـˏ0.FLD330 = CLS83.FLD321;
                        if(ˊﾞ0.FLD271) {
                            ـˏ0.FLD334 = true;
                        }
                        int v4 = ˎᵢ0.MTH927(0, "friendreq_permission_type");
                        int v5 = ˎᵢ0.MTH927(0, "friendreq_history_type");
                        ـˏ0.MTH1692((v4 == 0 ? CLS84.FLD325 : CLS84.FLD327), v5);
                        ˈˊ0.MTH4731(ـˏ0);
                        if(v1 != -1) {
                            if(v1 == v3) {
                                break;
                            }
                            ++v3;
                        }
                    }
                }
            }
            CLS412.MTH6014(((CLS140)ᵎⁱ0).MTH3042(), CLS27.MTH889("start_friend_request"));
            CLS288.FLD2989.MTH4734();
            return;
        }
        ᵎⁱ0.getClass();
        int v6 = Math.min(v, arrayList0.size());
        CLS29 ˎᵢ1 = ᵎⁱ0.FLD1445;
        String s2 = ˎᵢ1.MTH925("phone_friend_req_excl", "");
        String s3 = CLS372.MTH5418("phone_friendreq_type", "phone");
        int v7 = ˎᵢ1.MTH927(0, "friendreq_order");
        if(v7 == 1) {
            Collections.reverse(arrayList0);
        }
        else if(v7 == 2) {
            Collections.shuffle(arrayList0);
        }
        int v8 = 1;
        for(Object object1: arrayList0) {
            CLS78 ˊﾞ1 = (CLS78)object1;
            if(!CLS502.MTH6934(s2, new String[]{""})) {
                CLS85 ـˏ1 = new CLS85("", "", s3);
                ـˏ1.FLD329 = true;
                ـˏ1.FLD330 = CLS83.FLD319;
                int v9 = ˎᵢ1.MTH927(0, "friendreq_permission_type");
                int v10 = ˎᵢ1.MTH927(0, "friendreq_history_type");
                ـˏ1.MTH1692((v9 == 0 ? CLS84.FLD325 : CLS84.FLD327), v10);
                CLS288.FLD2989.MTH4731(ـˏ1);
                if(v6 != -1) {
                    if(v6 == v8) {
                        break;
                    }
                    ++v8;
                }
            }
        }
        CLS412.MTH6014(((CLS140)ᵎⁱ0).MTH3042(), CLS27.MTH889("start_friend_request"));
        CLS288.FLD2989.MTH4734();
    }
}

