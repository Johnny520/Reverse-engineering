package p199nd;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import md.C2825b;
import p025bc.AbstractC0255e;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;

/* JADX INFO: renamed from: nd.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2962b implements InterfaceC3125b {

    /* JADX INFO: renamed from: g */
    public final List f9714g;

    /* JADX INFO: renamed from: h */
    public final HashMap f9715h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2962b(List list, HashMap map) {
        this.f9714g = list;
        this.f9715h = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C2825b.f9192g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("ClassTypeVarsAttr{", String.valueOf(this.f9714g), ", super maps: ", String.valueOf(this.f9715h), "}");
    }
}
