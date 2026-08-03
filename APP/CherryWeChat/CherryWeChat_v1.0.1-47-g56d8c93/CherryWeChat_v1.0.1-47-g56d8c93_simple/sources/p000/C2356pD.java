package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: pD */
/* JADX INFO: loaded from: classes.dex */
public final class C2356pD implements InterfaceC1189as {

    /* JADX INFO: renamed from: b */
    public static final Set f8241b = null;

    /* JADX INFO: renamed from: a */
    public final InterfaceC1189as f8242a;

    static {
        f8241b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    }

    public C2356pD(InterfaceC1189as r1) {
        this.f8242a = r1;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final boolean mo994a(Object r2) {
        return f8241b.contains(((Uri) r2).getScheme());
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object r2, int r3, int r4, C2644vt r5) {
        C1057Yj r0 = new C1057Yj(((Uri) r2).toString());
        return this.f8242a.mo995b(r0, r3, r4, r5);
    }
}
