// Decompiled by JEB v5.42.0.202606242140

package c.ٴˈ;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import c.ˈⁱ.CLS95;
import c.ˋﹳ.CLS107;
import c.ˋﹳ.CLS108;
import c.ˑʼ.CLS125;
import c.ـˉ.CLS172;
import c.ـˉ.CLS204;
import c.ـˉ.CLS258;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class CLS291 {
    public final WeakReference FLD1347;
    public final LinkedHashMap FLD1348;
    public final HashMap FLD1349;
    public final LinearLayout FLD1350;
    public final Menu FLD1351;

    public CLS291(Activity activity0, LinearLayout linearLayout0, Menu menu0) {
        this.FLD1347 = new WeakReference(activity0);
        this.FLD1350 = linearLayout0;
        this.FLD1351 = menu0;
        this.FLD1348 = new LinkedHashMap();
        this.FLD1349 = new HashMap();
    }

    public void MTH4328() {
        int v;
        if(this.FLD1348.isEmpty()) {
            return;
        }
        if(this.FLD1351 == null) {
            this.MTH4334();
        }
        else {
            Iterator iterator0 = this.FLD1348.keySet().iterator();
            while(true) {
                v = 0;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                String s = this.MTH4332(((String)object0));
                this.FLD1351.add(s).setOnMenuItemClickListener((MenuItem menuItem0) -> {
                    try {
                        CLS107 ˆٴ0 = (CLS107)this.FLD1348.get(((String)object0));
                        if(ˆٴ0 != null) {
                            ˆٴ0.MTH2281();
                            return true;
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS204.MTH3257(throwable0);
                    }
                    return true;
                });
            }
            if(CLS172.MTH3035()) {
                while(v < this.FLD1351.size()) {
                    CLS258.MTH3810(this.FLD1351.getItem(v), CLS172.MTH3033(), CLS172.MTH3039());
                    ++v;
                }
            }
            else {
                while(v < this.FLD1351.size()) {
                    CLS258.MTH3810(this.FLD1351.getItem(v), 0xFF000000, -1);
                    ++v;
                }
            }
            if(this.FLD1351.size() != this.FLD1348.size()) {
                this.FLD1351.clear();
                this.MTH4334();
            }
        }
    }

    // 检测为 Lambda 实现
    private void MTH4330(Activity activity0, View view0) [...]

    public CLS291 MTH4331(String s, CLS107 ˆٴ0) {
        return this.MTH4335(CLS95.MTH1980(s, s), s, ˆٴ0);
    }

    // 去混淆评级： 低(20)
    public final String MTH4332(String s) {
        return this.FLD1349.containsKey(s) ? ((String)this.FLD1349.get(s)) : s;
    }

    // 检测为 Lambda 实现
    private boolean MTH4333(String s, MenuItem menuItem0) [...]

    // 此方法包含解密的字符串
    public final void MTH4334() {
        Activity activity0 = (Activity)this.FLD1347.get();
        CLS790 ʿˊ0 = new CLS790(activity0);
        ʿˊ0.MTH4208("");
        ʿˊ0.MTH4211((View view0) -> {
            CLS125 ʻᵢ0 = new CLS125(activity0);
            for(Object object0: this.FLD1348.keySet()) {
                ʻᵢ0.MTH2417(this.MTH4332(((String)object0)), ((String)object0), ((CLS107)this.FLD1348.get(((String)object0))));
            }
            ʻᵢ0.MTH2418();
        });
        CLS258.MTH3783(this.FLD1350, ((CLS108)ʿˊ0));
    }

    // 此方法包含解密的字符串
    public CLS291 MTH4335(String s, String s1, CLS107 ˆٴ0) {
        new CLS284(s);
        this.FLD1348.put(s1, ˆٴ0);
        this.FLD1349.put(s1, "");
        return this;
    }
}

