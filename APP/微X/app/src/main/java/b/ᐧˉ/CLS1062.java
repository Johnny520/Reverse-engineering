// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS47;
import b.ˈˈ.CLS81;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1624;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public final class CLS1062 extends CLS219 {
    public final CLS47 FLD2276;
    public final LinkedHashMap FLD2277;
    public CLS369 FLD2278;
    public final ArrayList FLD2279;

    public CLS1062(String s, String s1) {
        super(s, s1);
        this.FLD2276 = CLS47.FLD167;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.FLD2277 = linkedHashMap0;
        this.FLD2279 = new ArrayList(linkedHashMap0.keySet());
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        if(z1) {
            return;
        }
        CLS380 ʼˎ0 = new CLS380(((CLS219)this).MTH3883(), this.FLD2156);
        ʼˎ0.FLD3527 = new CLS1115(this, 1);
        ʼˎ0.FLD3526 = new CLS1069(((CLS219)this), z, false, 12);
        ʼˎ0.show();
    }

    // 此方法包含解密的字符串
    public final void MTH4021() {
        try {
            ArrayList arrayList0 = this.FLD2279;
            LinkedHashMap linkedHashMap0 = this.FLD2277;
            linkedHashMap0.clear();
            arrayList0.clear();
            int v = 1;
            for(Object object0: this.FLD2276.MTH1198()) {
                String s = v + ": " + ((CLS81)object0).FLD307;
                HashSet hashSet0 = ((CLS81)object0).FLD309;
                if(!hashSet0.isEmpty() != 0) {
                    s = s + "<br>" + CLS27.MTH889("tags") + ": " + TextUtils.join(" ", hashSet0);
                }
                linkedHashMap0.put(s + "<br>" + CLS27.MTH889("status") + ((CLS81)object0).MTH1665(), ((CLS81)object0));
                ++v;
            }
            arrayList0.addAll(linkedHashMap0.keySet());
            this.FLD2278.notifyDataSetChanged();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        public final class CLS1057 implements CLS11 {
            public final CLS81 FLD2264;
            public final CLS1062 FLD2265;

            public CLS1057(CLS81 יᐧ0) {
                this.FLD2264 = יᐧ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS1062.this.FLD2276.MTH1195(this.FLD2264);
                CLS1062.this.MTH4021();
            }
        }


        public final class CLS1059 implements CLS8 {
            public final CLS81 FLD2267;
            public final CLS369 FLD2268;
            public final ArrayList FLD2269;

            public CLS1059(CLS81 יᐧ0, ArrayList arrayList0, CLS369 ﾞᵎ0) {
                this.FLD2269 = arrayList0;
                this.FLD2268 = ﾞᵎ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                if(((ArrayList)object0).isEmpty()) {
                    return;
                }
                for(Object object1: ((ArrayList)object0)) {
                    this.FLD2267.FLD309.add(((String)object1));
                    this.FLD2269.add(((String)object1));
                }
                this.FLD2268.notifyDataSetChanged();
            }
        }


        public final class CLS1060 implements CLS11 {
            public final CLS81 FLD2270;
            public final CLS1062 FLD2271;

            public CLS1060(CLS81 יᐧ0) {
                this.FLD2270 = יᐧ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
                CLS1062.this.FLD2276.MTH1194(this.FLD2270);
                CLS1062.this.MTH4021();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS1062.this.FLD2276.MTH1194(this.FLD2270);
                CLS1062.this.MTH4021();
            }
        }


        public final class CLS1061 implements CLS11 {
            public final CLS369 FLD2272;
            public final CLS81 FLD2273;
            public final int FLD2274;
            public final ArrayList FLD2275;

            public CLS1061(CLS369 ﾞᵎ0, int v, CLS81 יᐧ0, ArrayList arrayList0) {
                this.FLD2274 = v;
                this.FLD2273 = יᐧ0;
                this.FLD2275 = arrayList0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                String s = (String)this.FLD2272.getItem(this.FLD2274);
                this.FLD2273.FLD309.remove(s);
                this.FLD2275.remove(this.FLD2274);
                this.FLD2272.notifyDataSetChanged();
            }
        }

        Activity activity0 = ((CLS219)this).MTH3883();
        if(this.FLD2278 == null) {
            this.FLD2278 = new CLS369(activity0, this.FLD2279);
        }
        this.MTH4021();
        CLS1624 יﹳ0 = new CLS1624(activity0);
        יﹳ0.FLD5274 = new CLS1115(this, 2);
        יﹳ0.MTH7302();
        יﹳ0.MTH7311();
        יﹳ0.MTH7303(this.FLD2278);
        יﹳ0.MTH7301(new CLS211(this, activity0, 1));
        יﹳ0.MTH7305(new CLS220(2, activity0, this));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }

    // 此方法包含解密的字符串
    public static void MTH4023(Activity activity0, String s, Collection collection0, CLS8 ـˏ0) {
        public final class CLS1058 implements CLS8 {
            public final CLS8 FLD2266;

            public CLS1058(CLS8 ـˏ0) {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                this.FLD2266.MTH786(((ArrayList)object0));
            }
        }

        ArrayList arrayList0 = new ArrayList();
        for(Object object0: collection0) {
            String s1 = ((CLS81)object0).FLD307;
            HashSet hashSet0 = ((CLS81)object0).FLD309;
            if(!hashSet0.isEmpty() != 0) {
                StringBuilder stringBuilder0 = CLS182.MTH3483(s1);
                stringBuilder0.append("<br>");
                stringBuilder0.append(CLS27.MTH889("tags"));
                stringBuilder0.append(": ");
                stringBuilder0.append(TextUtils.join(" ", hashSet0));
                s1 = stringBuilder0.toString();
            }
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put(CLS182.MTH3496(4100947930154586933L, contentValues0, s1, 0x38E97E6F2B3CD335L), ((CLS81)object0).FLD308);
            arrayList0.add(contentValues0);
        }
        CLS395.MTH5722(activity0, ((CLS8)new CLS1058(ـˏ0)), s, arrayList0);
    }
}

