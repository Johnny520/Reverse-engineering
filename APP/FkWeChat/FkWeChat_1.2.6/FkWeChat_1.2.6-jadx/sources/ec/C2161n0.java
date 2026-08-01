package ec;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p228p8.AbstractC5971a;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: ec.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2161n0 extends AbstractC5971a {

    /* JADX INFO: renamed from: s */
    public static final a f5988s = new a(null);

    /* JADX INFO: renamed from: r */
    public final String f5989r;

    public C2161n0(String str) {
        super(f5988s);
        this.f5989r = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2161n0) && AbstractC1061t.m3842c(this.f5989r, ((C2161n0) obj).f5989r);
    }

    public int hashCode() {
        return this.f5989r.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f5989r + ')';
    }

    /* JADX INFO: renamed from: x */
    public final String m7844x() {
        return this.f5989r;
    }

    /* JADX INFO: renamed from: ec.n0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC5980j.c {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
