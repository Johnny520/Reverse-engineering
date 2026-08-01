// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import android.content.Context;
import b.ᐧˉ.CLS182;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class CLS408 {
    public final ContentValues FLD3943;
    public final WeakReference FLD3944;
    public final HashMap FLD3945;

    public CLS408(ContentValues contentValues0, Context context0) {
        this.FLD3943 = contentValues0;
        this.FLD3945 = new HashMap();
        this.FLD3944 = new WeakReference(context0);
    }

    public final void MTH5944(String s) {
        String s1 = CLS182.MTH3484(0x38EA7B502B3CD335L, new StringBuilder(), s);
        this.FLD3945.put(s1, Boolean.TRUE);
        this.FLD3943.put(s1, Boolean.TRUE);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final String MTH5945() {
        return this.FLD3943.getAsString("type");
    }

    // 此方法包含解密的字符串
    public final String MTH5946() {
        ContentValues contentValues0 = this.FLD3943;
        if(contentValues0.containsKey("modulePath")) {
            return contentValues0.getAsString("modulePath");
        }
        return this.FLD3944 == null ? null : ((Context)this.FLD3944.get()).getPackageCodePath();
    }

    // 此方法包含解密的字符串
    public final boolean MTH5947(String s) {
        HashMap hashMap0 = this.FLD3945;
        if(hashMap0.containsKey("disable_feature_" + s)) {
            return ((Boolean)hashMap0.get("disable_feature_" + s)).booleanValue();
        }
        boolean z = this.FLD3943.containsKey("disable_feature_" + s) ? this.FLD3943.getAsBoolean("disable_feature_" + s).booleanValue() : false;
        hashMap0.put("disable_feature_" + s, Boolean.valueOf(z));
        return z;
    }
}

