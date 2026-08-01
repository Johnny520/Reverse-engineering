package p107V1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p078P1.C1147i;

/* JADX INFO: renamed from: V1.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1501D implements InterfaceC1518q {

    /* JADX INFO: renamed from: b */
    public static final Set f5233b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a */
    public final InterfaceC1518q f5234a;

    public C1501D(InterfaceC1518q interfaceC1518q) {
        this.f5234a = interfaceC1518q;
    }

    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: a */
    public final boolean mo2773a(Object obj) {
        return f5233b.contains(((Uri) obj).getScheme());
    }

    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: b */
    public final C1517p mo2774b(Object obj, int i5, int i6, C1147i c1147i) {
        return this.f5234a.mo2774b(new C1508g(((Uri) obj).toString()), i5, i6, c1147i);
    }
}
