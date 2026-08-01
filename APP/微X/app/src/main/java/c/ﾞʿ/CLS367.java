// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʿ;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.DocumentsContract;
import java.io.File;

public abstract class CLS367 {
    public final CLS367 FLD1658;

    public CLS367(CLS367 ʾʻ0) {
        this.FLD1658 = ʾʻ0;
    }

    public abstract CLS367 MTH5049(String arg1);

    public static CLS367 MTH5050(Context context0, Uri uri0) {
        return Build.VERSION.SDK_INT >= 19 ? new CLS822(null, context0, uri0) : null;
    }

    public CLS367 MTH5051() {
        return this.FLD1658;
    }

    public abstract boolean MTH5052();

    public abstract String MTH5053();

    public abstract CLS367 MTH5054(String arg1, String arg2);

    public abstract String MTH5055();

    public abstract boolean MTH5056();

    public abstract Uri MTH5057();

    public abstract boolean MTH5058(String arg1);

    public abstract long MTH5059();

    public abstract CLS367[] MTH5060();

    public abstract boolean MTH5061();

    public static CLS367 MTH5062(File file0) {
        return new CLS821(null, file0);
    }

    public static CLS367 MTH5063(Context context0, Uri uri0) {
        return Build.VERSION.SDK_INT >= 21 ? new CLS820(null, context0, DocumentsContract.buildDocumentUriUsingTree(uri0, DocumentsContract.getTreeDocumentId(uri0))) : null;
    }

    public abstract boolean MTH5064();

    public abstract boolean MTH5065();

    public CLS367 MTH5066(String s) {
        CLS367[] arr_ʾʻ = this.MTH5060();
        for(int v = 0; v < arr_ʾʻ.length; ++v) {
            CLS367 ʾʻ0 = arr_ʾʻ[v];
            if(s.equals(ʾʻ0.MTH5055())) {
                return ʾʻ0;
            }
        }
        return null;
    }

    public abstract boolean MTH5067();
}

