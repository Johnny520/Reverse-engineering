package defpackage;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i6 implements rt {
    public final j6 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i6(j6 j6Var) {
        this.a = j6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(qt qtVar) {
        j6 j6Var = this.a;
        if (qtVar != null) {
            j6Var.a().setPrimaryClip(qtVar.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            j6Var.a().clearPrimaryClip();
        } else {
            j6Var.a().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
