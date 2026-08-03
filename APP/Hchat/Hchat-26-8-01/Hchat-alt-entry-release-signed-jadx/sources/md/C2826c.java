package md;

import java.util.ArrayList;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: md.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2826c implements InterfaceC3125b {

    /* JADX INFO: renamed from: g */
    public final C2825b f9212g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f9213h = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2826c(C2825b c2825b) {
        this.f9212g = c2825b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final InterfaceC3124a mo441a() {
        return this.f9212g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC5798s.m10516j(this.f9213h, ", ");
    }
}
