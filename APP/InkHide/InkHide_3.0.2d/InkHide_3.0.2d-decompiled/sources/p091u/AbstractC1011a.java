package p091u;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* JADX INFO: renamed from: u.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1011a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m2212a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m2213b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
