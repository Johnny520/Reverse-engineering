package p239q5;

import p254r5.C6492c0;
import p309v5.AbstractC8826h;
import p376zd.C9987e;

/* JADX INFO: renamed from: q5.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6274y {

    /* JADX INFO: renamed from: d */
    public static final C6274y f19672d = new C6274y(null, -1, -1);

    /* JADX INFO: renamed from: a */
    public final C6492c0 f19673a;

    /* JADX INFO: renamed from: b */
    public final int f19674b;

    /* JADX INFO: renamed from: c */
    public final int f19675c;

    public C6274y(C6492c0 c6492c0, int i10, int i11) {
        if (i10 < -1) {
            C9987e.m38645a("address < -1");
            throw null;
        }
        if (i11 < -1) {
            C9987e.m38645a("line < -1");
            throw null;
        }
        this.f19673a = c6492c0;
        this.f19674b = i10;
        this.f19675c = i11;
    }

    /* JADX INFO: renamed from: a */
    public int m24858a() {
        return this.f19675c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m24859b(C6274y c6274y) {
        return this.f19675c == c6274y.f19675c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m24860c(C6274y c6274y) {
        if (this.f19675c != c6274y.f19675c) {
            return false;
        }
        C6492c0 c6492c0 = this.f19673a;
        C6492c0 c6492c02 = c6274y.f19673a;
        if (c6492c0 != c6492c02) {
            return c6492c0 != null && c6492c0.equals(c6492c02);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6274y)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C6274y c6274y = (C6274y) obj;
        return this.f19674b == c6274y.f19674b && m24860c(c6274y);
    }

    public int hashCode() {
        return this.f19673a.hashCode() + this.f19674b + this.f19675c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(50);
        C6492c0 c6492c0 = this.f19673a;
        if (c6492c0 != null) {
            sb2.append(c6492c0.mo6828g());
            sb2.append(":");
        }
        int i10 = this.f19675c;
        if (i10 >= 0) {
            sb2.append(i10);
        }
        sb2.append('@');
        int i11 = this.f19674b;
        if (i11 < 0) {
            sb2.append("????");
        } else {
            sb2.append(AbstractC8826h.m33898g(i11));
        }
        return sb2.toString();
    }
}
