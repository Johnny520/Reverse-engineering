package p260x;

import java.util.ArrayList;
import p011B4.AbstractC0231b;
import p041H0.C0566K;
import p041H0.InterfaceC0605m;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: x.q */
/* JADX INFO: loaded from: classes.dex */
public final class C3434q extends AbstractC2206o implements InterfaceC0605m {

    /* JADX INFO: renamed from: r */
    public C3436s f10723r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public final void mo143B0() {
        this.f10723r.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        C3436s c3436s = this.f10723r;
        c3436s.m5701c();
        c3436s.f10727b = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0605m
    /* JADX INFO: renamed from: R */
    public final void mo940R(C0566K c0566k) {
        ArrayList arrayList = this.f10723r.f10733h;
        if (arrayList.size() <= 0) {
            c0566k.m857a();
        } else {
            AbstractC0231b.m408s(arrayList.get(0));
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3434q) && AbstractC1665j.m2981a(this.f10723r, ((C3434q) obj).f10723r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10723r.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f10723r + ')';
    }
}
