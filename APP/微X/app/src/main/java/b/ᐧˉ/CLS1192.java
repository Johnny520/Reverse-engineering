// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import b.ʻˑ.CLS12;

public final class CLS1192 implements CLS12 {
    public final int FLD2791;
    public final ContentValues FLD2792;

    public CLS1192(ContentValues contentValues0, int v) {
        this.FLD2791 = v;
        this.FLD2792 = contentValues0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        ContentValues contentValues0 = this.FLD2792;
        if(this.FLD2791 == 0) {
            long v = (long)(((Long)object0));
            if(v != ((long)(((int)v)))) {
                throw new ArithmeticException();
            }
            contentValues0.put("delay", ((int)v));
            return;
        }
        long v1 = (long)(((Long)object0));
        if(v1 != ((long)(((int)v1)))) {
            throw new ArithmeticException();
        }
        contentValues0.put("delay", ((int)v1));
    }
}

