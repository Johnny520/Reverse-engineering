package p265s;

import androidx.lifecycle.C0119x;
import gg.AbstractC1416l;
import java.util.ArrayList;
import p101h1.C1565b;
import p118i1.C1902b;
import p219oh.AbstractC3165h;
import p339x1.C5610h0;
import p339x1.InterfaceC5624m;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: s.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3863w extends AbstractC5852n implements InterfaceC5624m {

    /* JADX INFO: renamed from: u */
    public C3869z f12657u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5624m
    /* JADX INFO: renamed from: B */
    public final void mo1326B(C5610h0 c5610h0) {
        C1565b c1565b = c5610h0.f22833g;
        ArrayList arrayList = this.f12657u.f12692i;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            C3857t c3857t = (C3857t) arrayList.get(i9);
            C1902b c1902b = c3857t.f12643l;
            if (c1902b != null) {
                long j3 = c3857t.f12642k;
                long j4 = c1902b.f6359t;
                float f3 = ((int) (j3 >> 32)) - ((int) (j4 >> 32));
                float f10 = ((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L));
                ((C0119x) c1565b.f5220h.f469a).m598c0(f3, f10);
                try {
                    AbstractC3165h.m6794u(c5610h0, c1902b);
                } finally {
                    ((C0119x) c1565b.f5220h.f469a).m598c0(-f3, -f10);
                }
            }
        }
        c5610h0.m10064e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        this.f12657u.f12693j = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        C3869z c3869z = this.f12657u;
        c3869z.m8045d();
        c3869z.f12685b = null;
        c3869z.f12686c = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3863w) && AbstractC1416l.m3825a(this.f12657u, ((C3863w) obj).f12657u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12657u.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f12657u + ')';
    }
}
