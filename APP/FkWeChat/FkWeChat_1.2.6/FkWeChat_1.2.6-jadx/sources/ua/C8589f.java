package ua;

import p024b9.AbstractC1061t;
import p213oa.C5691b;

/* JADX INFO: renamed from: ua.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8589f {

    /* JADX INFO: renamed from: a */
    public final C5691b f28624a;

    /* JADX INFO: renamed from: b */
    public final int f28625b;

    public C8589f(C5691b c5691b, int i10) {
        c5691b.getClass();
        this.f28624a = c5691b;
        this.f28625b = i10;
    }

    /* JADX INFO: renamed from: a */
    public final C5691b m33005a() {
        return this.f28624a;
    }

    /* JADX INFO: renamed from: b */
    public final int m33006b() {
        return this.f28625b;
    }

    /* JADX INFO: renamed from: c */
    public final int m33007c() {
        return this.f28625b;
    }

    /* JADX INFO: renamed from: d */
    public final C5691b m33008d() {
        return this.f28624a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8589f)) {
            return false;
        }
        C8589f c8589f = (C8589f) obj;
        return AbstractC1061t.m3842c(this.f28624a, c8589f.f28624a) && this.f28625b == c8589f.f28625b;
    }

    public int hashCode() {
        return (this.f28624a.hashCode() * 31) + Integer.hashCode(this.f28625b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f28625b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f28624a);
        int i12 = this.f28625b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        return sb2.toString();
    }
}
