package sd;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: sd.qe */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7616qe {

    /* JADX INFO: renamed from: a */
    public final String f25226a;

    /* JADX INFO: renamed from: b */
    public final int f25227b;

    /* JADX INFO: renamed from: c */
    public final boolean f25228c;

    public C7616qe(String str, int i10, boolean z10) {
        str.getClass();
        this.f25226a = str;
        this.f25227b = i10;
        this.f25228c = z10;
    }

    /* JADX INFO: renamed from: a */
    public final int m29496a() {
        return this.f25227b;
    }

    /* JADX INFO: renamed from: b */
    public final String m29497b() {
        return this.f25226a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m29498c() {
        return this.f25228c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7616qe)) {
            return false;
        }
        C7616qe c7616qe = (C7616qe) obj;
        return AbstractC1061t.m3842c(this.f25226a, c7616qe.f25226a) && this.f25227b == c7616qe.f25227b && this.f25228c == c7616qe.f25228c;
    }

    public int hashCode() {
        return (((this.f25226a.hashCode() * 31) + Integer.hashCode(this.f25227b)) * 31) + Boolean.hashCode(this.f25228c);
    }

    public String toString() {
        return "RankItem(name=" + this.f25226a + ", count=" + this.f25227b + ", isMe=" + this.f25228c + ")";
    }
}
