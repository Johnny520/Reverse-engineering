// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS86;
import b.ˈˈ.CLS91;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS1112;
import b.ᐧˉ.CLS174;
import b.ᐧˉ.CLS210;
import b.ᐧˉ.CLS219;
import b.ᐧˉ.CLS244;
import b.ᵔʾ.CLS1259;
import b.ᵔʾ.CLS304.CLS303;
import b.ⁱᵔ.CLS523;
import java.util.LinkedHashMap;

public final class CLS116 implements AdapterView.OnItemLongClickListener {
    public final int FLD792;
    public final Object FLD793;

    public CLS116(int v, Object object0) {
        this.FLD792 = v;
        this.FLD793 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        String s1;
        String s;
        Object object0 = this.FLD793;
        switch(this.FLD792) {
            case 0: {
                CLS629 ʻˋ0 = (CLS629)object0;
                ʻˋ0.getClass();
                if(view0 != null) {
                    try {
                        Object object1 = CLS166.MTH3194(view0.getTag(), CLS27.MTH897("favFieldItem"));
                        int v2 = CLS166.MTH3181(object1, "field_type");
                        CLS139 ﹶʼ0 = ʻˋ0.FLD1447;
                        if(v2 == 1 || v2 == 2 || v2 == 3 || v2 == 5) {
                            goto label_16;
                        }
                        switch(v2) {
                            case 4: 
                            case 7: 
                            case 16: {
                                goto label_16;
                            }
                            case 8: 
                            case 18: {
                                goto label_15;
                            }
                        }
                        return true;
                    label_15:
                        if(ﹶʼ0.FLD1438.MTH6895("fav_wenote")) {
                        label_16:
                            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                            if(v2 == 3 || v2 == 8 || v2 == 18) {
                                s = CLS27.MTH889("forward") + " (" + CLS27.MTH889("appname") + ")";
                                s1 = "forward";
                            }
                            else {
                                if(v2 != 7) {
                                    linkedHashMap0.put(CLS27.MTH889("forward") + " (" + CLS27.MTH889("appname") + ")", "forward");
                                }
                                s = CLS27.MTH889("forward_to_moments");
                                s1 = "forward_to_moments";
                            }
                            linkedHashMap0.put(s, s1);
                            switch(v2) {
                                case 3: {
                                    if(ﹶʼ0.FLD1438.MTH6895("fav_voice_mass_send")) {
                                        goto label_29;
                                    }
                                    break;
                                }
                                case 1: 
                                case 2: 
                                case 4: 
                                case 16: {
                                label_29:
                                    if(ʻˋ0.FLD1445.MTH938("broadcast_forward_enable", true)) {
                                        linkedHashMap0.put(CLS27.MTH889("mass_send"), "mass_send");
                                    }
                                }
                            }
                            CLS523.MTH7159(((CLS140)ʻˋ0).MTH3042(), null, linkedHashMap0, ((CLS7)new CLS687(ʻˋ0, object1)));
                            return true;
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return true;
            }
            case 1: {
                CLS303 ᵔʾ$ˆٴ0 = (CLS303)((CLS174)object0).FLD1681.getItem(v);
                Activity activity1 = (Activity)((CLS174)object0).FLD1682.get();
                CLS523.MTH7150(activity1, "", ((CLS17)new CLS1259(((CLS174)object0), activity1, ᵔʾ$ˆٴ0, 14)));
                return true;
            }
            case 2: {
                CLS91 ᵔʾ0 = (CLS91)((CLS244)object0).FLD2543.getItem(v);
                Activity activity2 = ((CLS244)object0).MTH4269();
                CLS523.MTH7150(activity2, "", ((CLS17)new CLS1259(((CLS244)object0), activity2, ᵔʾ0, 16)));
                return true;
            }
            case 3: {
                CLS91 ᵔʾ1 = (CLS91)((CLS210)object0).FLD2020.getItem(v);
                Activity activity3 = ((CLS210)object0).MTH3745();
                CLS523.MTH7150(activity3, "", ((CLS17)new CLS1259(((CLS210)object0), activity3, ᵔʾ1, 18)));
                return true;
            }
            default: {
                CLS86 ٴـ0 = (CLS86)((CLS1112)object0).FLD2465.getItem(v);
                Activity activity0 = ((CLS219)(((CLS1112)object0))).MTH3883();
                CLS523.MTH7150(activity0, "", ((CLS17)new CLS1259(((CLS1112)object0), activity0, ٴـ0, 21)));
                return true;
            }
        }
    }
}

