// Decompiled by JEB v5.42.0.202606242140

package c.ᴵˉ;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import c.ˊﹶ.CLS98;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS226;
import c.יⁱ.CLS257;
import c.ﹶˆ.CLS341;
import c.ﹶˆ.CLS345;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class CLS283 {
    public final LinearLayout FLD1156;
    public final LinkedHashMap FLD1157;
    public final Menu FLD1158;
    public final HashMap FLD1159;
    public final WeakReference FLD1160;

    public CLS283(Activity activity0, LinearLayout linearLayout0, Menu menu0) {
        this.FLD1160 = new WeakReference(activity0);
        this.FLD1156 = linearLayout0;
        this.FLD1158 = menu0;
        this.FLD1157 = new LinkedHashMap();
        this.FLD1159 = new HashMap();
    }

    public CLS283 MTH3648(String s, CLS345 ⁱˋ0) {
        return this.MTH3651(CLS98.MTH1314(s, s), s, ⁱˋ0);
    }

    // 检测为 Lambda 实现
    private void MTH3649(Activity activity0, View view0) [...]

    public void MTH3650() {
        int v;
        if(this.FLD1157.isEmpty()) {
            return;
        }
        if(this.FLD1158 == null) {
            this.MTH3652();
        }
        else {
            Iterator iterator0 = this.FLD1157.keySet().iterator();
            while(true) {
                v = 0;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                String s = this.MTH3655(((String)object0));
                this.FLD1158.add(s).setOnMenuItemClickListener((MenuItem menuItem0) -> {
                    try {
                        CLS345 ⁱˋ0 = (CLS345)this.FLD1157.get(((String)object0));
                        if(ⁱˋ0 != null) {
                            ⁱˋ0.MTH4829();
                            return true;
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS185.MTH2708(throwable0);
                    }
                    return true;
                });
            }
            if(CLS226.MTH3102()) {
                while(v < this.FLD1158.size()) {
                    CLS144.MTH2181(this.FLD1158.getItem(v), CLS226.MTH3099(), CLS226.MTH3105());
                    ++v;
                }
            }
            else {
                while(v < this.FLD1158.size()) {
                    CLS144.MTH2181(this.FLD1158.getItem(v), 0xFF000000, -1);
                    ++v;
                }
            }
            if(this.FLD1158.size() != this.FLD1157.size()) {
                this.FLD1158.clear();
                this.MTH3652();
            }
        }
    }

    // 此方法包含解密的字符串
    public CLS283 MTH3651(String s, String s1, CLS345 ⁱˋ0) {
        new CLS284(s);
        this.FLD1157.put(s1, ⁱˋ0);
        this.FLD1159.put(s1, "");
        return this;
    }

    // 此方法包含解密的字符串
    public final void MTH3652() {
        Activity activity0 = (Activity)this.FLD1160.get();
        CLS596 ˈᴵ0 = new CLS596(activity0);
        ˈᴵ0.MTH3627("");
        ˈᴵ0.MTH3631((View view0) -> {
            CLS257 ﾞⁱ0 = new CLS257(activity0);
            for(Object object0: this.FLD1157.keySet()) {
                ﾞⁱ0.MTH3377(this.MTH3655(((String)object0)), ((String)object0), ((CLS345)this.FLD1157.get(((String)object0))));
            }
            ﾞⁱ0.MTH3380();
        });
        CLS144.MTH2186(this.FLD1156, ((CLS341)ˈᴵ0));
    }

    // 检测为 Lambda 实现
    private boolean MTH3653(String s, MenuItem menuItem0) [...]

    // 去混淆评级： 低(20)
    public final String MTH3655(String s) {
        return this.FLD1159.containsKey(s) ? ((String)this.FLD1159.get(s)) : s;
    }
}

