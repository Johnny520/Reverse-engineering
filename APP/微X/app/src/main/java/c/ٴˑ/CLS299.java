// Decompiled by JEB v5.42.0.202606242140

package c.ٴˑ;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.DocumentsContract;
import java.io.File;

public abstract class CLS299 {
    public final CLS299 FLD1354;

    public CLS299(CLS299 ـᵎ0) {
        this.FLD1354 = ـᵎ0;
    }

    public abstract boolean MTH4373();

    public CLS299 MTH4374() {
        return this.FLD1354;
    }

    public abstract boolean MTH4375();

    public abstract boolean MTH4376();

    public abstract boolean MTH4377();

    public abstract String MTH4378();

    public abstract Uri MTH4379();

    public static CLS299 MTH4380(Context context0, Uri uri0) {
        return Build.VERSION.SDK_INT >= 19 ? new CLS801(null, context0, uri0) : null;
    }

    public abstract boolean MTH4381();

    public abstract long MTH4382();

    public static CLS299 MTH4383(Context context0, Uri uri0) {
        return Build.VERSION.SDK_INT >= 21 ? new CLS800(null, context0, DocumentsContract.buildDocumentUriUsingTree(uri0, DocumentsContract.getTreeDocumentId(uri0))) : null;
    }

    public abstract String MTH4384();

    public abstract boolean MTH4385(String arg1);

    public abstract CLS299 MTH4386(String arg1);

    public abstract CLS299[] MTH4387();

    public CLS299 MTH4388(String s) {
        CLS299[] arr_ـᵎ = this.MTH4387();
        for(int v = 0; v < arr_ـᵎ.length; ++v) {
            CLS299 ـᵎ0 = arr_ـᵎ[v];
            if(s.equals(ـᵎ0.MTH4378())) {
                return ـᵎ0;
            }
        }
        return null;
    }

    public static CLS299 MTH4389(File file0) {
        return new CLS802(null, file0);
    }

    public abstract boolean MTH4390();

    public abstract CLS299 MTH4391(String arg1, String arg2);
}

