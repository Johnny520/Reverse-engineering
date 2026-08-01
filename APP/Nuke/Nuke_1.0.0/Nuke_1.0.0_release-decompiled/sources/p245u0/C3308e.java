package p245u0;

import java.util.ArrayList;
import p023E0.AbstractC0277a;
import p211o0.C2740O;
import p211o0.C2762u;

/* JADX INFO: renamed from: u0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3308e {

    /* JADX INFO: renamed from: a */
    public final String f10264a;

    /* JADX INFO: renamed from: b */
    public final float f10265b;

    /* JADX INFO: renamed from: c */
    public final float f10266c;

    /* JADX INFO: renamed from: d */
    public final float f10267d;

    /* JADX INFO: renamed from: e */
    public final float f10268e;

    /* JADX INFO: renamed from: f */
    public final long f10269f;

    /* JADX INFO: renamed from: g */
    public final int f10270g;

    /* JADX INFO: renamed from: h */
    public final boolean f10271h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f10272i;

    /* JADX INFO: renamed from: j */
    public final C3307d f10273j;

    /* JADX INFO: renamed from: k */
    public boolean f10274k;

    public C3308e(String str, float f2, float f5, float f6, float f7, long j5, int i5, boolean z5, int i6) {
        str = (i6 & 1) != 0 ? "" : str;
        long j6 = (i6 & 32) != 0 ? C2762u.f8762g : j5;
        int i7 = (i6 & 64) != 0 ? 5 : i5;
        this.f10264a = str;
        this.f10265b = f2;
        this.f10266c = f5;
        this.f10267d = f6;
        this.f10268e = f7;
        this.f10269f = j6;
        this.f10270g = i7;
        this.f10271h = z5;
        ArrayList arrayList = new ArrayList();
        this.f10272i = arrayList;
        C3307d c3307d = new C3307d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f10273j = c3307d;
        arrayList.add(c3307d);
    }

    /* JADX INFO: renamed from: a */
    public static void m5578a(C3308e c3308e, ArrayList arrayList, C2740O c2740o) {
        if (c3308e.f10274k) {
            AbstractC0277a.m483b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((C3307d) c3308e.f10272i.get(r0.size() - 1)).f10263j.add(new C3303J("", arrayList, 0, c2740o, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    /* JADX INFO: renamed from: b */
    public final C3309f m5579b() {
        if (this.f10274k) {
            AbstractC0277a.m483b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f10272i;
            if (arrayList.size() <= 1) {
                C3307d c3307d = this.f10273j;
                C3309f c3309f = new C3309f(this.f10264a, this.f10265b, this.f10266c, this.f10267d, this.f10268e, new C3299F(c3307d.f10254a, c3307d.f10255b, c3307d.f10256c, c3307d.f10257d, c3307d.f10258e, c3307d.f10259f, c3307d.f10260g, c3307d.f10261h, c3307d.f10262i, c3307d.f10263j), this.f10269f, this.f10270g, this.f10271h);
                this.f10274k = true;
                return c3309f;
            }
            if (this.f10274k) {
                AbstractC0277a.m483b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            C3307d c3307d2 = (C3307d) arrayList.remove(arrayList.size() - 1);
            ((C3307d) arrayList.get(arrayList.size() - 1)).f10263j.add(new C3299F(c3307d2.f10254a, c3307d2.f10255b, c3307d2.f10256c, c3307d2.f10257d, c3307d2.f10258e, c3307d2.f10259f, c3307d2.f10260g, c3307d2.f10261h, c3307d2.f10262i, c3307d2.f10263j));
        }
    }
}
