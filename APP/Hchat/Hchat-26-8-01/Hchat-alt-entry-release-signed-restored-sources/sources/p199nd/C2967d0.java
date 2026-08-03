package p199nd;

import java.util.Objects;
import md.C2825b;
import p025bc.AbstractC0255e;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;
import p246qd.AbstractC3506j;

/* JADX INFO: renamed from: nd.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2967d0 implements InterfaceC3125b {

    /* JADX INFO: renamed from: g */
    public final AbstractC3506j f9721g;

    /* JADX INFO: renamed from: h */
    public final String f9722h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2967d0(String str, AbstractC3506j abstractC3506j) {
        this.f9721g = abstractC3506j;
        this.f9722h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C2825b.f9185L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2967d0.class == obj.getClass()) {
            C2967d0 c2967d0 = (C2967d0) obj;
            if (Objects.equals(this.f9721g, c2967d0.f9721g) && Objects.equals(this.f9722h, c2967d0.f9722h)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(this.f9721g, this.f9722h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("D('", this.f9722h, "' ", String.valueOf(this.f9721g), ")");
    }
}
