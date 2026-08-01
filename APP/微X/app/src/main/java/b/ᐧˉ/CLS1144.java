// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˆʿ.CLS54;
import b.ˈˈ.CLS82;
import b.ᵔʾ.CLS1262;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS338;
import b.ⁱʾ.CLS347;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS523;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;

public final class CLS1144 implements CLS3 {
    public final int FLD2590;
    public final Object FLD2591;
    public final int FLD2592;
    public final Object FLD2593;

    public CLS1144(int v, ContentValues contentValues0, String s) {
        this.FLD2590 = 0;
        super();
        this.FLD2591 = contentValues0;
        this.FLD2593 = s;
        this.FLD2592 = v;
    }

    public CLS1144(Object object0, int v, Object object1, int v1) {
        this.FLD2590 = v1;
        this.FLD2591 = object0;
        this.FLD2592 = v;
        this.FLD2593 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        File file0;
        long v1;
        String s;
        int v = this.FLD2592;
        Object object0 = this.FLD2593;
        Object object1 = this.FLD2591;
        switch(this.FLD2590) {
            case 0: {
                ((ContentValues)object1).put("url", ((String)object0));
                switch(v) {
                    case -104: {
                        s = CLS182.MTH3484(4100629363840308021L, new StringBuilder(), ((String)object0));
                        CLS182.MTH3478(4100629428264817461L, new StringBuilder(), 4100630012380369717L, ((String)object0), ((ContentValues)object1), "desc");
                        v1 = 4100630025265271605L;
                        break;
                    }
                    case -103: {
                        s = CLS182.MTH3484(4100630171294159669L, new StringBuilder(), ((String)object0));
                        CLS182.MTH3478(4100630240013636405L, new StringBuilder(), 0x38E85D032B3CD335L, ((String)object0), ((ContentValues)object1), "desc");
                        v1 = 4100629741797430069L;
                        break;
                    }
                    case -102: {
                        s = CLS182.MTH3484(4100630042445140789L, new StringBuilder(), ((String)object0));
                        CLS182.MTH3478(4100630106869650229L, new StringBuilder(), 4100630141229388597L, ((String)object0), ((ContentValues)object1), "desc");
                        v1 = 4100630154114290485L;
                        break;
                    }
                    case -101: {
                        s = CLS182.MTH3484(0x38E85C902B3CD335L, new StringBuilder(), ((String)object0));
                        CLS182.MTH3478(0x38E85C9F2B3CD335L, new StringBuilder(), 4100629333775536949L, ((String)object0), ((ContentValues)object1), "desc");
                        v1 = 4100629346660438837L;
                        break;
                    }
                    case -100: {
                        s = CLS182.MTH3484(0x38E85CF02B3CD335L, new StringBuilder(), ((String)object0));
                        CLS182.MTH3478(4100629166271812405L, new StringBuilder(), 4100629204926518069L, ((String)object0), ((ContentValues)object1), "desc");
                        v1 = 4100629217811419957L;
                        break;
                    }
                    default: {
                        return;
                    }
                }
                ((ContentValues)object1).put(CLS370.MTH5289(v1), s);
                return;
            }
            case 1: {
                CLS523.MTH7165(((Activity)object1), CLS27.MTH889("order"), "", String.valueOf(v + 1), 2, ((CLS16)new CLS1262(((CLS347)object0), v, 4)));
                return;
            }
            case 2: {
                CLS523.MTH7165(((Activity)object1), CLS27.MTH889("order"), "", String.valueOf(v + 1), 2, ((CLS16)new CLS1262(((CLS338)object0), v, 5)));
                return;
            }
            case 3: {
                CLS82 יﹳ0 = (CLS82)object1;
                CLS54 ᐧˉ0 = CLS54.FLD172;
                ᐧˉ0.getClass();
                if(יﹳ0 == null) {
                    file0 = null;
                }
                else {
                    try {
                        InputStream inputStream0 = ᐧˉ0.FLD175.MTH857(יﹳ0.MTH1674(v));
                        if(inputStream0 == null) {
                            file0 = null;
                        }
                        else {
                            file0 = new File(CLS27.MTH900().getCacheDir(), יﹳ0.MTH1674(v));
                            CLS31.MTH996(file0.getAbsolutePath());
                            CLS31.MTH1037(inputStream0, file0);
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                        file0 = null;
                    }
                }
                if(CLS31.MTH1001(file0)) {
                    CLS476.MTH6641(((Activity)object0), new File(file0.getAbsolutePath()));
                }
                return;
            }
            default: {
                ArrayList arrayList0 = (ArrayList)object1;
                CLS335 ˑٴ0 = (CLS335)object0;
                try {
                    arrayList0.remove(v);
                    ˑٴ0.notifyDataSetChanged();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

