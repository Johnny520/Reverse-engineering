package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: oD */
/* JADX INFO: loaded from: classes.dex */
public final class C2313oD implements InterfaceC1189as {

    /* JADX INFO: renamed from: b */
    public static final Set f8156b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a */
    public final Object f8157a;

    public C2313oD(C2270nD c2270nD) {
        this.f8157a = c2270nD;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final boolean mo994a(Object obj) {
        return f8156b.contains(((Uri) obj).getScheme());
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object obj, int i, int i2, C2644vt c2644vt) {
        InterfaceC2541tc c0821t4;
        Uri uri = (Uri) obj;
        C1382et c1382et = new C1382et(uri);
        C2270nD c2270nD = (C2270nD) this.f8157a;
        switch (c2270nD.f7990a) {
            case 0:
                c0821t4 = new C0821T4(c2270nD.f7991b, uri, c2270nD.f7992c, 0);
                break;
            case 1:
                c0821t4 = new C0821T4(c2270nD.f7991b, uri, c2270nD.f7992c, 1);
                break;
            default:
                c0821t4 = new C2121jz(c2270nD.f7991b, uri, c2270nD.f7992c);
                break;
        }
        return new C1108Zr(c1382et, c0821t4);
    }
}
