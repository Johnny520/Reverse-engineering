package md;

import ae.C0074e;
import ae.C0076g;
import be.C0294m0;
import java.util.ArrayList;
import p199nd.AbstractC2986r;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;

/* JADX INFO: renamed from: md.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2828e implements InterfaceC2832i {

    /* JADX INFO: renamed from: h */
    public static final C2830g f9216h = C2830g.f9221d;

    /* JADX INFO: renamed from: g */
    public C2829f f9217g = f9216h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m6224A(AbstractC2986r abstractC2986r, C2825b c2825b) {
        InterfaceC3125b interfaceC3125bMo6237c = abstractC2986r.f9217g.mo6237c(c2825b);
        if (interfaceC3125bMo6237c != null) {
            m6233y(interfaceC3125bMo6237c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m6225B(AbstractC2828e abstractC2828e) {
        C2829f c2829f = abstractC2828e.f9217g;
        if (c2829f.mo6240f()) {
            return;
        }
        C2829f c2829fM6226C = m6226C();
        c2829fM6226C.f9219a.addAll(c2829f.f9219a);
        if (c2829f.f9220b.isEmpty()) {
            return;
        }
        c2829fM6226C.m6243i(new C2827d(c2829f, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final C2829f m6226C() {
        C2829f c2829f = this.f9217g;
        if (c2829f != f9216h) {
            return c2829f;
        }
        C2829f c2829f2 = new C2829f();
        this.f9217g = c2829f2;
        return c2829f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final void m6227D(EnumC2824a enumC2824a) {
        this.f9217g.mo6241g(enumC2824a);
        m6230G();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final void m6228E(InterfaceC3124a interfaceC3124a) {
        this.f9217g.mo6242h(interfaceC3124a);
        m6230G();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m6229F() {
        C2829f c2829f = this.f9217g;
        if (c2829f == f9216h) {
            return;
        }
        if (!c2829f.f9220b.isEmpty()) {
            c2829f.m6243i(new C0074e(23));
        }
        this.f9217g.f9219a.clear();
        m6230G();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m6230G() {
        if (this.f9217g.mo6240f()) {
            C2829f c2829f = this.f9217g;
            C2830g c2830g = f9216h;
            if (c2829f != c2830g) {
                this.f9217g = c2830g;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m6231w(EnumC2824a enumC2824a) {
        m6226C().f9219a.add(enumC2824a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m6232x(C2825b c2825b, Object obj) {
        C2829f c2829fM6226C = m6226C();
        C2826c c2826c = (C2826c) c2829fM6226C.mo6237c(c2825b);
        if (c2826c == null) {
            c2826c = new C2826c(c2825b);
            c2829fM6226C.m6243i(new C0076g(c2826c, 12));
        }
        c2826c.f9213h.add(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m6233y(InterfaceC3125b interfaceC3125b) {
        C2829f c2829fM6226C = m6226C();
        c2829fM6226C.getClass();
        c2829fM6226C.m6243i(new C0076g(interfaceC3125b, 12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m6234z(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        C2829f c2829fM6226C = m6226C();
        c2829fM6226C.getClass();
        c2829fM6226C.m6243i(new C0294m0(4, arrayList));
    }
}
