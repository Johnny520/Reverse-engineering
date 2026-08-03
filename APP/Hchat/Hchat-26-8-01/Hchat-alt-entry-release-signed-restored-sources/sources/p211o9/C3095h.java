package p211o9;

import gg.AbstractC1416l;
import java.util.ArrayList;

/* JADX INFO: renamed from: o9.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3095h {

    /* JADX INFO: renamed from: a */
    public final C3096i f9997a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f9998b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3095h(C3096i c3096i, ArrayList arrayList) {
        c3096i.getClass();
        this.f9997a = c3096i;
        this.f9998b = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3095h)) {
            return false;
        }
        C3095h c3095h = (C3095h) obj;
        return AbstractC1416l.m3825a(this.f9997a, c3095h.f9997a) && this.f9998b.equals(c3095h.f9998b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9998b.hashCode() + (this.f9997a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "InviteDetail(inviter=" + this.f9997a + ", invitees=" + this.f9998b + ")";
    }
}
