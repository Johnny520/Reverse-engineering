package p199nd;

import java.util.Objects;
import md.C2825b;
import p025bc.AbstractC0255e;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;
import p302ud.C4305a;
import p302ud.C4320p;

/* JADX INFO: renamed from: nd.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2970f implements InterfaceC3125b {

    /* JADX INFO: renamed from: g */
    public final C4305a f9725g;

    /* JADX INFO: renamed from: h */
    public final C4305a f9726h;

    /* JADX INFO: renamed from: i */
    public final C4320p f9727i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2970f(C4305a c4305a, C4305a c4305a2, C4320p c4320p) {
        this.f9725g = c4305a;
        this.f9726h = c4305a2;
        this.f9727i = c4320p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C2825b.f9174A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2970f.class != obj.getClass()) {
            return false;
        }
        C2970f c2970f = (C2970f) obj;
        return this.f9725g.equals(c2970f.f9725g) && this.f9726h.equals(c2970f.f9726h) && this.f9727i.m8687X(c2970f.f9727i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(this.f9725g, this.f9726h, this.f9727i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strValueOf = String.valueOf(this.f9725g);
        String strValueOf2 = String.valueOf(this.f9726h);
        String strValueOf3 = String.valueOf(this.f9727i);
        StringBuilder sbM1027p = AbstractC0255e.m1027p("EDGE_INSN: ", strValueOf, "->", strValueOf2, " ");
        sbM1027p.append(strValueOf3);
        return sbM1027p.toString();
    }
}
