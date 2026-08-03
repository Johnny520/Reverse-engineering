package p141jf;

import ac.AbstractC0063p;
import java.util.List;
import mc.InterfaceC2823a;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: jf.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2131g implements InterfaceC2823a {

    /* JADX INFO: renamed from: a */
    public final List f7112a;

    /* JADX INFO: renamed from: b */
    public final String f7113b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2131g(List list, String str) {
        this.f7113b = str;
        this.f7112a = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mc.InterfaceC2823a
    /* JADX INFO: renamed from: c */
    public final List mo5353c() {
        return this.f7112a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mc.InterfaceC2823a
    /* JADX INFO: renamed from: e */
    public final String mo5354e() {
        return this.f7113b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC2823a)) {
            return false;
        }
        InterfaceC2823a interfaceC2823a = (InterfaceC2823a) obj;
        return this.f7112a.equals(interfaceC2823a.mo5353c()) && this.f7113b.equals(interfaceC2823a.mo5354e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7113b.hashCode() + (this.f7112a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1021j("(", AbstractC0063p.m394D(this.f7112a), ")", this.f7113b);
    }
}
