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
    public static final Set f8156b = null;

    /* JADX INFO: renamed from: a */
    public final Object f8157a;

    static {
        f8156b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "content", "android.resource"})));
    }

    public C2313oD(C2270nD r1) {
        this.f8157a = r1;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final boolean mo994a(Object r2) {
        return f8156b.contains(((Uri) r2).getScheme());
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object r4, int r5, int r6, C2644vt r7) {
        Uri r42 = (Uri) r4;
        C1382et r62 = new C1382et(r42);
        C2270nD r72 = (C2270nD) this.f8157a;
        switch(r72.f7990a) {
            case 0: goto L6;
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        InterfaceC2541tc r0 = new C2121jz(r72.f7991b, r42, r72.f7992c);
    L8:
        return new C1108Zr(r62, r0);
    L5:
        r0 = new C0821T4(r72.f7991b, r42, r72.f7992c, 1);
        goto L8
    L6:
        r0 = new C0821T4(r72.f7991b, r42, r72.f7992c, 0);
        goto L8
    }
}
