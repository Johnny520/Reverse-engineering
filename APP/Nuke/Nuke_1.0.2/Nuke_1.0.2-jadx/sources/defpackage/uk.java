package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uk implements n92, kh1 {
    public final /* synthetic */ int h;
    public final Resources i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ uk(Resources resources, int i) {
        this.h = i;
        this.i = resources;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n92
    public d92 i(d92 d92Var, ov1 ov1Var) {
        if (d92Var == null) {
            return null;
        }
        return new al(this.i, d92Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kh1
    public jh1 q(kj1 kj1Var) {
        int i = this.h;
        Resources resources = this.i;
        switch (i) {
            case 1:
                return new tg(resources, kj1Var.g(Uri.class, AssetFileDescriptor.class));
            case 2:
                return new tg(resources, kj1Var.g(Uri.class, InputStream.class));
            default:
                return new tg(resources, b83.b);
        }
    }
}
