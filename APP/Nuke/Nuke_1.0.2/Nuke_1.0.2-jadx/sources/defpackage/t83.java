package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t83 implements jh1 {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    public final s83 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t83(s83 s83Var) {
        this.a = s83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jh1
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jh1
    public final ih1 b(Object obj, int i, int i2, ov1 ov1Var) {
        f40 rgVar;
        Uri uri = (Uri) obj;
        is1 is1Var = new is1(uri);
        s83 s83Var = this.a;
        switch (s83Var.h) {
            case 0:
                rgVar = new rg(s83Var.i, uri, s83Var.j, 0);
                break;
            case 1:
                rgVar = new rg(s83Var.i, uri, s83Var.j, 1);
                break;
            default:
                rgVar = new zu2(s83Var.i, uri, s83Var.j);
                break;
        }
        return new ih1(is1Var, rgVar);
    }
}
