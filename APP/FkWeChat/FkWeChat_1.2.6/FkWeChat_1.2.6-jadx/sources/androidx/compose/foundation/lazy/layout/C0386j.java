package androidx.compose.foundation.lazy.layout;

import p263s.AbstractC6635e;
import p349y0.C9508c;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0386j {

    /* JADX INFO: renamed from: b */
    public static final int f1109b = C9508c.f32298t;

    /* JADX INFO: renamed from: a */
    public final C9508c f1110a = new C9508c(new a[16], 0);

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f1111a;

        /* JADX INFO: renamed from: b */
        public final int f1112b;

        public a(int i10, int i11) {
            this.f1111a = i10;
            this.f1112b = i11;
            if (!(i10 >= 0)) {
                AbstractC6635e.m26318a("negative start index");
            }
            if (i11 >= i10) {
                return;
            }
            AbstractC6635e.m26318a("end index greater than start");
        }

        /* JADX INFO: renamed from: a */
        public final int m1221a() {
            return this.f1112b;
        }

        /* JADX INFO: renamed from: b */
        public final int m1222b() {
            return this.f1111a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1111a == aVar.f1111a && this.f1112b == aVar.f1112b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f1111a) * 31) + Integer.hashCode(this.f1112b);
        }

        public String toString() {
            return "Interval(start=" + this.f1111a + ", end=" + this.f1112b + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m1216a(int i10, int i11) {
        a aVar = new a(i10, i11);
        this.f1110a.m37029b(aVar);
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public final int m1217b() {
        int iM1221a = ((a) this.f1110a.m37038k()).m1221a();
        C9508c c9508c = this.f1110a;
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            a aVar = (a) objArr[i10];
            if (aVar.m1221a() > iM1221a) {
                iM1221a = aVar.m1221a();
            }
        }
        return iM1221a;
    }

    /* JADX INFO: renamed from: c */
    public final int m1218c() {
        int iM1222b = ((a) this.f1110a.m37038k()).m1222b();
        C9508c c9508c = this.f1110a;
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            a aVar = (a) objArr[i10];
            if (aVar.m1222b() < iM1222b) {
                iM1222b = aVar.m1222b();
            }
        }
        if (!(iM1222b >= 0)) {
            AbstractC6635e.m26318a("negative minIndex");
        }
        return iM1222b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1219d() {
        return this.f1110a.m37039l() != 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m1220e(a aVar) {
        this.f1110a.m37043p(aVar);
    }
}
