package p002c;

import java.util.Iterator;
import java.util.LinkedHashMap;
import p003d.C0016a;
import p006g.C0094e;
import p006g.C0103n;
import p010k.C0190t;
import p010k.C0191u;

/* JADX INFO: renamed from: c.e */
/* JADX INFO: loaded from: classes.dex */
final class C0008e {

    /* JADX INFO: renamed from: a */
    private final C0013j f14a;

    /* JADX INFO: renamed from: b */
    private boolean f15b;

    /* JADX INFO: renamed from: c */
    private int f16c;

    /* JADX INFO: renamed from: d */
    private C0013j f17d;

    /* JADX INFO: renamed from: e */
    private String f18e;

    /* JADX INFO: renamed from: f */
    private C0014k f19f;

    /* JADX INFO: renamed from: g */
    private C0094e f20g;

    /* JADX INFO: renamed from: h */
    private final LinkedHashMap f21h = new LinkedHashMap();

    /* JADX INFO: renamed from: i */
    private final LinkedHashMap f22i = new LinkedHashMap();

    C0008e(C0013j c0013j) {
        this.f14a = c0013j;
    }

    /* JADX INFO: renamed from: h */
    final C0094e m56h() {
        boolean z = this.f15b;
        LinkedHashMap linkedHashMap = this.f22i;
        LinkedHashMap linkedHashMap2 = this.f21h;
        C0013j c0013j = this.f14a;
        if (!z) {
            throw new IllegalStateException("Undeclared type " + c0013j + " declares members: " + linkedHashMap2.keySet() + " " + linkedHashMap.keySet());
        }
        C0016a c0016a = new C0016a();
        c0016a.f64a = 13;
        C0191u c0191u = c0013j.f54c;
        if (this.f20g == null) {
            this.f20g = new C0094e(c0191u, this.f16c, this.f17d.f54c, this.f19f.f56b, new C0190t(this.f18e));
            for (C0006c c0006c : linkedHashMap.values()) {
                C0103n c0103nM46d = c0006c.m46d(c0016a);
                if (c0006c.m44b()) {
                    this.f20g.m275i(c0103nM46d);
                } else {
                    this.f20g.m276j(c0103nM46d);
                }
            }
            Iterator it = linkedHashMap2.values().iterator();
            if (it.hasNext()) {
                AbstractC0007d.m47a(it.next());
                throw null;
            }
        }
        return this.f20g;
    }
}
