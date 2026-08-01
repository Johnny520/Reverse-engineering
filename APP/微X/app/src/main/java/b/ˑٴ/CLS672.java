// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ᐧˉ.CLS182;
import java.io.File;
import java.util.Set;

public final class CLS672 implements CLS12 {
    public final int FLD709;
    public final ContentValues FLD710;
    public final Set FLD711;
    public final CLS662 FLD712;
    public final String FLD713;
    public final CLS3 FLD714;

    public CLS672(CLS662 ʿʿ0, Set set0, String s, ContentValues contentValues0, CLS702 ˊᵔ0, int v) {
        this.FLD709 = v;
        this.FLD712 = ʿʿ0;
        this.FLD711 = set0;
        this.FLD713 = s;
        this.FLD710 = contentValues0;
        this.FLD714 = ˊᵔ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        ContentValues contentValues0 = this.FLD710;
        CLS3 ˆٴ0 = this.FLD714;
        String s = this.FLD713;
        Set set0 = this.FLD711;
        CLS662 ʿʿ0 = this.FLD712;
        if(this.FLD709 == 0) {
            ʿʿ0.getClass();
            set0.remove(s);
            ʿʿ0.FLD677.getClass();
            String s1 = CLS31.MTH1013(CLS27.MTH900());
            if(CLS31.MTH1033(new File(s1), ((byte[])object0))) {
                contentValues0.remove("url");
                contentValues0.put(CLS182.MTH3479(-2, contentValues0, "type", 4101451661098930997L), CLS27.MTH889("image"));
                contentValues0.put("img", s1);
                CLS31.MTH996(s1);
            }
            ˆٴ0.MTH774();
            return;
        }
        ʿʿ0.getClass();
        set0.remove(s);
        if(((byte[])object0) != null) {
            ʿʿ0.FLD677.getClass();
            String s2 = CLS31.MTH1013(CLS27.MTH900());
            if(CLS31.MTH1033(new File(s2), ((byte[])object0))) {
                contentValues0.remove("url");
                contentValues0.put(CLS182.MTH3479(-16, contentValues0, "type", 4101452103480562485L), CLS27.MTH889("video"));
                contentValues0.put("path", s2);
                CLS31.MTH996(s2);
            }
        }
        ˆٴ0.MTH774();
    }
}

