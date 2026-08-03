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
    public static final Set f8241b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a */
    public final InterfaceC1189as f8242a;

    public C2356pD(InterfaceC1189as interfaceC1189as) {
        this.f8242a = interfaceC1189as;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final boolean mo994a(Object obj) {
        return f8241b.contains(((Uri) obj).getScheme());
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object obj, int i, int i2, C2644vt c2644vt) {
        return this.f8242a.mo995b(new C1057Yj(((Uri) obj).toString()), i, i2, c2644vt);
    }
}
