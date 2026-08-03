package p199nd;

import java.util.Collections;
import java.util.Set;
import md.C2825b;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;

/* JADX INFO: renamed from: nd.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2961a0 implements InterfaceC3125b {

    /* JADX INFO: renamed from: h */
    public static final C2961a0 f9712h = new C2961a0(Collections.EMPTY_SET);

    /* JADX INFO: renamed from: g */
    public final Set f9713g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2961a0(Set set) {
        this.f9713g = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C2825b.f9204s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this == f9712h ? "TYPE_VARS: EMPTY" : "TYPE_VARS: ".concat(String.valueOf(this.f9713g));
    }
}
