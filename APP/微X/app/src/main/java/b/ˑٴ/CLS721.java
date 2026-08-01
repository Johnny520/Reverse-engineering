// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import android.util.Pair;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS38.CLS37;
import b.ˈˈ.CLS91;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS721 implements CLS37 {
    public final int FLD871;
    public final CLS818 FLD872;

    public CLS721(CLS818 ᵎⁱ0, int v) {
        this.FLD871 = v;
        this.FLD872 = ᵎⁱ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS38$CLS37
    public final Object MTH1108(Object[] arr_object) {
        CLS818 ᵎⁱ0 = this.FLD872;
        switch(this.FLD871) {
            case 0: {
                ᵎⁱ0.getClass();
                boolean z = CLS412.MTH6002();
                return ᵎⁱ0.FLD1445.MTH938("show_view_id", z) ? Pair.create(CLS27.MTH889("view_id"), "copy_userid") : null;
            }
            case 1: {
                ArrayList arrayList0 = new ArrayList();
                try {
                    String s = ᵎⁱ0.FLD1445.MTH925("auto_remark_list", "");
                    String s1 = ᵎⁱ0.FLD1445.MTH925("auto_remark_list_temp", "");
                    CLS371 ʻ0 = ᵎⁱ0.FLD1444;
                    if(ᵎⁱ0.FLD1239) {
                        HashSet hashSet0 = new HashSet();
                        hashSet0.addAll(Arrays.asList(CLS502.MTH6941(s)));
                        hashSet0.addAll(Arrays.asList(CLS502.MTH6941(s1)));
                        for(Object object0: hashSet0) {
                            arrayList0.add(ʻ0.MTH5311(((String)object0)));
                        }
                        return arrayList0;
                    }
                    ArrayDeque arrayDeque0 = ᵎⁱ0.FLD1241;
                    if(arrayDeque0.isEmpty() && !TextUtils.isEmpty(s)) {
                        arrayDeque0.addAll(Arrays.asList(CLS502.MTH6941(s)));
                    }
                    if(!arrayDeque0.isEmpty()) {
                        int v1 = arrayDeque0.size();
                        String[] arr_s = new String[v1];
                        arrayDeque0.toArray(arr_s);
                    label_32:
                        for(int v = 0; v < v1; ++v) {
                            arrayList0.add(ʻ0.MTH5311(arr_s[v]));
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                    if(true) {
                        return arrayList0;
                    }
                    goto label_32;
                }
                return arrayList0;
            }
            case 2: {
                if(!ᵎⁱ0.FLD1447.FLD1407.MTH5947("_config_custom_avatar")) {
                    String s2 = (String)arr_object[0];
                    if(!TextUtils.isEmpty(s2) && !s2.equals(CLS27.MTH904()) && (CLS426.MTH6126(s2) || ᵎⁱ0.FLD1444.MTH5302(s2))) {
                        return Pair.create(CLS27.MTH889("customize_avatars"), "avatar");
                    }
                }
                return null;
            }
            case 3: {
                ᵎⁱ0.getClass();
                String s3 = (String)arr_object[0];
                return !TextUtils.isEmpty(s3) && !s3.equals(CLS27.MTH904()) && (CLS500.FLD4928.MTH6895("scheduled_task") && (CLS426.MTH6126(s3) || ᵎⁱ0.FLD1444.MTH5302(s3))) ? Pair.create((CLS27.MTH889("scheduled_task") + ": " + CLS27.MTH889("send_msg")), "schedule_task_send_msg") : null;
            }
            case 4: {
                ᵎⁱ0.getClass();
                boolean z1 = CLS412.MTH6002();
                return ᵎⁱ0.FLD1445.MTH938("contact_tags", !z1) && ᵎⁱ0.FLD1447.FLD1438.MTH6895("contact_tags") ? Pair.create(CLS27.MTH889("contact_tags"), "config_contact") : null;
            }
            case 5: {
                return ᵎⁱ0.FLD1243;
            }
            case 6: {
                ᵎⁱ0.getClass();
                String s4 = (String)arr_object[0];
                return !CLS27.MTH904().equals(s4) ? Pair.create(CLS27.MTH889("delete_contact2"), "delete_contact") : null;
            }
            case 7: {
                ᵎⁱ0.getClass();
                String s5 = (String)arr_object[0];
                CLS91 ᵔʾ0 = ᵎⁱ0.MTH2791().MTH1184("hc_block_video_call_" + s5);
                return ᵔʾ0 != null ? ᵔʾ0.MTH1735() : null;
            }
            case 8: {
                ᵎⁱ0.getClass();
                boolean z2 = CLS412.MTH6002();
                return ᵎⁱ0.FLD1445.MTH938("contact_tags", !z2) && ᵎⁱ0.FLD1447.FLD1438.MTH6895("contact_tags") ? Pair.create(CLS27.MTH889("contact_tags"), "contact_tags") : null;
            }
            default: {
                return ᵎⁱ0.FLD1447.FLD1438.MTH6895("send_multple_friendcard") && ᵎⁱ0.FLD1445.MTH938("send_multple_friendcard", true) ? Pair.create(CLS27.MTH889("send_multple_friendcard"), "send_multple_friendcard") : null;
            }
        }
    }
}

