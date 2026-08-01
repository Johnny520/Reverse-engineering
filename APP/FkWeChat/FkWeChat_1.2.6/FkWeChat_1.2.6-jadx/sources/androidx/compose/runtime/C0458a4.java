package androidx.compose.runtime;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: androidx.compose.runtime.a4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0458a4 extends AbstractC0543m5 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0543m5 f1299a;

    /* JADX INFO: renamed from: b */
    public final int f1300b;

    public C0458a4(AbstractC0543m5 abstractC0543m5, int i10) {
        super(null);
        this.f1299a = abstractC0543m5;
        this.f1300b = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0458a4)) {
            return false;
        }
        C0458a4 c0458a4 = (C0458a4) obj;
        return AbstractC1061t.m3842c(c0458a4.f1299a, this.f1299a) && c0458a4.f1300b == this.f1300b;
    }

    public int hashCode() {
        return (this.f1300b * 31) + this.f1299a.hashCode();
    }
}
