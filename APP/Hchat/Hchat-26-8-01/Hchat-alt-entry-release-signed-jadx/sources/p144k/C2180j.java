package p144k;

import android.content.Context;
import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p071f1.C1034w;
import p222p.InterfaceC3268x0;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: k.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2180j implements InterfaceC2188l1 {

    /* JADX INFO: renamed from: a */
    public final Context f7255a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4233c f7256b;

    /* JADX INFO: renamed from: c */
    public final long f7257c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3268x0 f7258d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2180j(Context context, InterfaceC4233c interfaceC4233c, long j3, InterfaceC3268x0 interfaceC3268x0) {
        this.f7255a = context;
        this.f7256b = interfaceC4233c;
        this.f7257c = j3;
        this.f7258d = interfaceC3268x0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2188l1
    /* JADX INFO: renamed from: a */
    public final InterfaceC2185k1 mo1629a() {
        return new C2177i(this.f7255a, this.f7256b, this.f7257c, this.f7258d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2180j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C2180j c2180j = (C2180j) obj;
        return AbstractC1416l.m3825a(this.f7255a, c2180j.f7255a) && AbstractC1416l.m3825a(this.f7256b, c2180j.f7256b) && C1034w.m2635c(this.f7257c, c2180j.f7257c) && AbstractC1416l.m3825a(this.f7258d, c2180j.f7258d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f7256b.hashCode() + (this.f7255a.hashCode() * 31)) * 31;
        int i9 = C1034w.f3264h;
        return this.f7258d.hashCode() + AbstractC0921a.m2243f(iHashCode, 31, this.f7257c);
    }
}
