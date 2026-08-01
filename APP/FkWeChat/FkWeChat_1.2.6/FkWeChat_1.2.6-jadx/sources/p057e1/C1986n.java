package p057e1;

import p024b9.AbstractC1043k;
import p299ub.AbstractC8610a;

/* JADX INFO: renamed from: e1.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1986n {

    /* JADX INFO: renamed from: a */
    public int f5519a;

    public /* synthetic */ C1986n(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    /* JADX INFO: renamed from: a */
    public final int m7168a() {
        return this.f5519a;
    }

    /* JADX INFO: renamed from: b */
    public final void m7169b(int i10) {
        this.f5519a = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f5519a);
        sb2.append(")@");
        String string = Integer.toString(hashCode(), AbstractC8610a.m33053a(16));
        string.getClass();
        sb2.append(string);
        return sb2.toString();
    }

    public C1986n(int i10) {
        this.f5519a = i10;
    }
}
