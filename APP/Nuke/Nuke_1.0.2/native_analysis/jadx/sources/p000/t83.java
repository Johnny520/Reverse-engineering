package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t83 implements jh1 {

    /* JADX INFO: renamed from: b */
    public static final Set f10611b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a */
    public final s83 f10612a;

    public t83(s83 s83Var) {
        this.f10612a = s83Var;
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: a */
    public final boolean mo235a(Object obj) {
        return f10611b.contains(((Uri) obj).getScheme());
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: b */
    public final ih1 mo236b(Object obj, int i, int i2, ov1 ov1Var) {
        f40 c0655rg;
        Uri uri = (Uri) obj;
        is1 is1Var = new is1(uri);
        s83 s83Var = this.f10612a;
        switch (s83Var.f9989h) {
            case 0:
                c0655rg = new C0655rg(s83Var.f9990i, uri, s83Var.f9991j, 0);
                break;
            case 1:
                c0655rg = new C0655rg(s83Var.f9990i, uri, s83Var.f9991j, 1);
                break;
            default:
                c0655rg = new zu2(s83Var.f9990i, uri, s83Var.f9991j);
                break;
        }
        return new ih1(is1Var, c0655rg);
    }
}
