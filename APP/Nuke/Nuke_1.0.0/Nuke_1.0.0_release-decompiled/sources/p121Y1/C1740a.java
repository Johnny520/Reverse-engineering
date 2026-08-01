package p121Y1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;
import me.dartcv.nuke.BuildConfig;
import p000A.C0038T0;
import p000A.C0072l0;
import p078P1.C1147i;
import p078P1.InterfaceC1149k;
import p088R1.InterfaceC1194D;
import p093S1.C1294f;
import p093S1.InterfaceC1289a;
import p131a2.C1799c;
import p131a2.C1800d;
import p195l2.C2501e;
import p195l2.C2508l;

/* JADX INFO: renamed from: Y1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1740a implements InterfaceC1149k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6007a;

    /* JADX INFO: renamed from: b */
    public final Object f6008b;

    /* JADX INFO: renamed from: c */
    public final Object f6009c;

    public /* synthetic */ C1740a(int i5, Object obj, Object obj2) {
        this.f6007a = i5;
        this.f6008b = obj;
        this.f6009c = obj2;
    }

    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: a */
    public final InterfaceC1194D mo2202a(Object obj, int i5, int i6, C1147i c1147i) {
        boolean z5;
        C1733A c1733a;
        C2501e c2501e;
        switch (this.f6007a) {
            case 0:
                InterfaceC1194D interfaceC1194DMo2202a = ((InterfaceC1149k) this.f6008b).mo2202a(obj, i5, i6, c1147i);
                Resources resources = (Resources) this.f6009c;
                if (interfaceC1194DMo2202a == null) {
                    return null;
                }
                return new C1743d(resources, interfaceC1194DMo2202a);
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1194D interfaceC1194DM3273c = ((C1800d) this.f6008b).m3273c((Uri) obj, c1147i);
                if (interfaceC1194DM3273c == null) {
                    return null;
                }
                return AbstractC1759t.m3134a((InterfaceC1289a) this.f6009c, (Drawable) ((C1799c) interfaceC1194DM3273c).get(), i5, i6);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C1733A) {
                    c1733a = (C1733A) inputStream;
                    z5 = false;
                } else {
                    z5 = true;
                    c1733a = new C1733A(inputStream, (C1294f) this.f6009c);
                }
                ArrayDeque arrayDeque = C2501e.f8011f;
                synchronized (arrayDeque) {
                    c2501e = (C2501e) arrayDeque.poll();
                    break;
                }
                if (c2501e == null) {
                    c2501e = new C2501e();
                }
                C2501e c2501e2 = c2501e;
                c2501e2.f8012d = c1733a;
                C2508l c2508l = new C2508l(c2501e2);
                C0038T0 c0038t0 = new C0038T0(24, c1733a, c2501e2);
                try {
                    C1757r c1757r = (C1757r) this.f6008b;
                    C1743d c1743dM3132a = c1757r.m3132a(new C0072l0(c2508l, c1757r.f6049d, c1757r.f6048c), i5, i6, c1147i, c0038t0);
                    c2501e2.f8013e = null;
                    c2501e2.f8012d = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(c2501e2);
                        break;
                    }
                    if (z5) {
                        c1733a.m3091c();
                    }
                    return c1743dM3132a;
                } catch (Throwable th) {
                    c2501e2.f8013e = null;
                    c2501e2.f8012d = null;
                    ArrayDeque arrayDeque2 = C2501e.f8011f;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(c2501e2);
                        if (!z5) {
                            throw th;
                        }
                        c1733a.m3091c();
                        throw th;
                    }
                }
        }
    }

    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: b */
    public final boolean mo2203b(Object obj, C1147i c1147i) {
        switch (this.f6007a) {
            case 0:
                return ((InterfaceC1149k) this.f6008b).mo2203b(obj, c1147i);
            case BuildConfig.VERSION_CODE /* 1 */:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    public C1740a(Resources resources, InterfaceC1149k interfaceC1149k) {
        this.f6007a = 0;
        this.f6009c = resources;
        this.f6008b = interfaceC1149k;
    }
}
