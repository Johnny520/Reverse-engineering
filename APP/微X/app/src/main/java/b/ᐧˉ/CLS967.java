// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS56;
import b.ˈˈ.CLS86;
import b.ⁱʾ.CLS332;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public final class CLS967 implements CLS3 {
    public final int FLD1890;
    public final CLS1112 FLD1891;

    public CLS967(CLS1112 ᐧˏ0, int v) {
        this.FLD1890 = v;
        this.FLD1891 = ᐧˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS1112 ᐧˏ0 = this.FLD1891;
        switch(this.FLD1890) {
            case 0: {
                CLS523.MTH7142(((CLS219)ᐧˏ0).MTH3883(), ((CLS11)new CLS1097(ᐧˏ0)));
                return;
            }
            case 1: {
                ᐧˏ0.getClass();
                String s = CLS27.MTH889("createTemplate");
                Activity activity0 = ((CLS219)ᐧˏ0).MTH3883();
                CLS523.MTH7162(true, activity0, s, ((CLS379)new CLS1035(ᐧˏ0, activity0)), ((CLS378)new CLS1035(ᐧˏ0, activity0)), null);
                return;
            }
            case 2: {
                try {
                    CLS371 ʻ0 = ᐧˏ0.FLD2472;
                    Iterator iterator0 = ᐧˏ0.FLD2454.iterator();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        CLS86 ٴـ0 = (CLS86)object0;
                        if(!TextUtils.isEmpty(ٴـ0.FLD346)) {
                            boolean z = ʻ0.MTH5382(ٴـ0.FLD346);
                            CLS56 ᵔʾ0 = ᐧˏ0.FLD2466;
                            if(z) {
                                if(!CLS426.MTH6126(ٴـ0.FLD346)) {
                                    continue;
                                }
                                String s1 = ٴـ0.FLD345;
                                if(TextUtils.isEmpty(s1)) {
                                    continue;
                                }
                                ArrayList arrayList0 = new ArrayList();
                                String[] arr_s = CLS502.MTH6941(s1);
                                for(int v = 0; v < arr_s.length; ++v) {
                                    String s2 = arr_s[v];
                                    if(ʻ0.MTH5337(ٴـ0.FLD346, s2)) {
                                        arrayList0.add(s2);
                                    }
                                }
                                String s3 = TextUtils.join(",", arrayList0);
                                if(!s1.equals(s3)) {
                                    continue;
                                }
                                ٴـ0.FLD345 = s3;
                                ᵔʾ0.MTH1267(ٴـ0);
                                continue;
                            }
                            else {
                                ᵔʾ0.MTH1272(ٴـ0);
                            }
                        }
                        iterator0.remove();
                    }
                    CLS332 ˊﾞ0 = ᐧˏ0.FLD2465;
                    if(ˊﾞ0 != null) {
                        ˊﾞ0.notifyDataSetChanged();
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 3: {
                CLS523.MTH7133(((CLS219)ᐧˏ0).MTH3883(), CLS27.MTH889("add_multi_members"), ((CLS379)new CLS1198(ᐧˏ0, 4)), null, ((CLS11)new CLS992(ᐧˏ0)));
                return;
            }
            case 4: {
                ᐧˏ0.getClass();
                ᐧˏ0.MTH4198(null, CLS27.MTH889("add_member"));
                return;
            }
            case 5: {
                ᐧˏ0.getClass();
                ᐧˏ0.MTH4202("friends");
                return;
            }
            case 6: {
                ᐧˏ0.getClass();
                ᐧˏ0.MTH4202("chatroom");
                return;
            }
            case 7: {
                ᐧˏ0.getClass();
                String s4 = CLS27.MTH889("new_contact_chat_blacklist");
                Activity activity1 = ((CLS219)ᐧˏ0).MTH3883();
                CLS523.MTH7169(activity1, s4, ((CLS379)new CLS955(ᐧˏ0, activity1, "new_contact_chat_blacklist", 0)));
                return;
            }
            case 8: {
                ᐧˏ0.getClass();
                String s5 = CLS27.MTH889("new_chatroom_chat_blacklist");
                Activity activity2 = ((CLS219)ᐧˏ0).MTH3883();
                CLS523.MTH7169(activity2, s5, ((CLS379)new CLS955(ᐧˏ0, activity2, "new_chatroom_chat_blacklist", 0)));
                return;
            }
            default: {
                ᐧˏ0.getClass();
                ᐧˏ0.MTH4200(new JSONObject());
            }
        }
    }
}

