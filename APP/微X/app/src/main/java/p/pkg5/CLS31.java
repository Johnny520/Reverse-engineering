// Decompiled by JEB v5.42.0.202606242140

package p.pkg5;

import android.content.ContentValues;
import android.content.Context;
import java.lang.ref.WeakReference;

public final class CLS31 {
    public final ContentValues FLD304;
    public final WeakReference FLD305;

    public CLS31(ContentValues contentValues0, Context context0) {
        this.FLD304 = contentValues0;
        this.FLD305 = new WeakReference(context0);
    }

    // 此方法包含解密的字符串
    public final String MTH836() {
        ContentValues contentValues0 = this.FLD304;
        if(contentValues0.containsKey("modulePath")) {
            return contentValues0.getAsString("modulePath");
        }
        return this.FLD305 == null ? null : ((Context)this.FLD305.get()).getPackageCodePath();
    }
}

