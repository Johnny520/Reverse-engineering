// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.content.ContentValues;
import android.content.Context;
import java.lang.ref.WeakReference;

public final class CLS52 {
    public final ContentValues FLD511;
    public final WeakReference FLD512;

    public CLS52(ContentValues contentValues0, Context context0) {
        this.FLD511 = contentValues0;
        this.FLD512 = new WeakReference(context0);
    }

    // 此方法包含解密的字符串
    public final String MTH1475() {
        ContentValues contentValues0 = this.FLD511;
        if(contentValues0.containsKey("modulePath")) {
            return contentValues0.getAsString("modulePath");
        }
        return this.FLD512 == null ? null : ((Context)this.FLD512.get()).getPackageCodePath();
    }
}

