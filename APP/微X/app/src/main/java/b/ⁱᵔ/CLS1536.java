// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS1087;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1536 implements CLS3 {
    public final int FLD4763;
    public final CLS359 FLD4764;
    public final Activity FLD4765;
    public final boolean FLD4766;
    public final ArrayList FLD4767;
    public final Object FLD4768;

    public CLS1536(Activity activity0, CLS359 ⁱˉ0, CLS500 ᵢﹶ0, ArrayList arrayList0, boolean z) {
        this.FLD4763 = 0;
        super();
        this.FLD4766 = z;
        this.FLD4768 = ᵢﹶ0;
        this.FLD4765 = activity0;
        this.FLD4767 = arrayList0;
        this.FLD4764 = ⁱˉ0;
    }

    public CLS1536(HashSet hashSet0, boolean z, Activity activity0, ArrayList arrayList0, CLS359 ⁱˉ0) {
        this.FLD4763 = 1;
        super();
        this.FLD4768 = hashSet0;
        this.FLD4766 = z;
        this.FLD4765 = activity0;
        this.FLD4767 = arrayList0;
        this.FLD4764 = ⁱˉ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS359 ⁱˉ0 = this.FLD4764;
        ArrayList arrayList0 = this.FLD4767;
        boolean z = this.FLD4766;
        Object object0 = this.FLD4768;
        if(this.FLD4763 == 0) {
            Activity activity0 = this.FLD4765;
            String s = CLS27.MTH889("text");
            if(!z && ((CLS500)object0).MTH6895("text_rep_nickname")) {
                StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                stringBuilder0.append("<br>");
                stringBuilder0.append(CLS27.MTH889("text_rep_desc"));
                s = stringBuilder0.toString();
            }
            CLS523.MTH7165(activity0, CLS27.MTH889("text"), s, "", 1, ((CLS16)new CLS1087(arrayList0, ⁱˉ0, 27)));
            return;
        }
        HashSet hashSet0 = new HashSet();
        if(((HashSet)object0).contains("fav_voice")) {
            hashSet0.add(3);
        }
        if(z) {
            hashSet0.add(5);
            hashSet0.add(7);
            hashSet0.add(8);
            hashSet0.add(18);
            hashSet0.add(14);
            hashSet0.add(19);
        }
        CLS1087 ٴ0 = new CLS1087(arrayList0, ⁱˉ0, 28);
        CLS395.MTH5740(this.FLD4765, ((CLS7)ٴ0), hashSet0);
    }
}

