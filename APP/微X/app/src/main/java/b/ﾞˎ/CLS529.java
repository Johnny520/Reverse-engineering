// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ˑٴ.CLS140;
import b.ˑٴ.CLS677;
import b.ˑٴ.CLS770;
import b.ˑٴ.CLS818.CLS817;
import b.ˑٴ.CLS818;
import b.ˑٴ.CLS877;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS529 implements MenuItem.OnMenuItemClickListener {
    public final int FLD5181;
    public final Object FLD5182;
    public final Object FLD5183;

    public CLS529(Object object0, Object object1, int v) {
        this.FLD5181 = v;
        this.FLD5183 = object0;
        this.FLD5182 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        Object object0 = this.FLD5182;
        Object object1 = this.FLD5183;
        switch(this.FLD5181) {
            case 0: {
                CLS525 ʻˑ0 = (CLS525)object1;
                String s1 = (String)object0;
                ʻˑ0.getClass();
                try {
                    CLS3 ˆٴ0 = (CLS3)ʻˑ0.FLD5146.get(s1);
                    if(ˆٴ0 != null) {
                        ˆٴ0.MTH774();
                        return true;
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return true;
            }
            case 1: {
                ((CLS818)object1).getClass();
                if(!CLS412.MTH6002() && !CLS27.MTH895().MTH938("add_contacts_warn_disable", false)) {
                    CLS395.MTH5745(((Activity)object0), ((CLS11)new CLS817(((Activity)object0))), CLS27.MTH889("add_contacts_disclaimer"), "add_contacts_warn_disable");
                    return true;
                }
                CLS387.MTH5594(((Activity)object0), new ArrayList(), false);
                return true;
            }
            case 2: {
                CLS404.MTH5910(((Activity)object1), ((String)object0));
                return true;
            }
            case 3: {
                CLS770 ٴʿ0 = (CLS770)object1;
                CLS167 ᵔʾ1 = (CLS167)object0;
                ٴʿ0.getClass();
                try {
                    Object object2 = ᵔʾ1.MTH3205();
                    String s2 = ((Activity)ᵔʾ1.MTH3205()).getIntent().getStringExtra("rank_id");
                    if(ٴʿ0.FLD1063 == null) {
                        ٴʿ0.FLD1063 = CLS164.MTH3174(object2, null, Void.TYPE, new Object[]{String.class, Integer.TYPE});
                    }
                    if(CLS27.MTH890("werun_like_rankIdField")) {
                        s2 = (String)CLS166.MTH3194(object2, CLS27.MTH897("werun_like_rankIdField"));
                    }
                    HashMap hashMap0 = CLS66.MTH1517(object2);
                    if(TextUtils.isEmpty(s2) || "#".equals(s2)) {
                        s2 = CLS371.FLD3470.MTH5378();
                    }
                    if(hashMap0.isEmpty()) {
                        hashMap0 = CLS371.FLD3470.MTH5338(s2);
                    }
                    CLS395.MTH5723(((CLS140)ٴʿ0).MTH3042(), new ArrayList(hashMap0.keySet()), new CLS677(ٴʿ0, hashMap0, s2, object2));
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return true;
            }
            default: {
                CLS167 ᵔʾ0 = (CLS167)object0;
                ((CLS877)object1).getClass();
                try {
                    Intent intent0 = new Intent();
                    String s = CLS27.MTH904();
                    intent0.putExtra("Select_Contact", TextUtils.join(",", CLS371.FLD3470.MTH5341(s)));
                    CLS166.MTH3195(ᵔʾ0.MTH3205(), "setResult", new Object[]{-1, intent0});
                    CLS166.MTH3195(ᵔʾ0.MTH3205(), "finish", new Object[0]);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return true;
            }
        }
    }
}

