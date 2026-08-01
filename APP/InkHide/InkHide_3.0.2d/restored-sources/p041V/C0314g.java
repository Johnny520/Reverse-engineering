package p041V;

import java.io.IOException;
import java.util.List;
import p037T.AbstractC0274y;
import p037T.C0261l;
import p037T.InterfaceC0275z;
import p049a0.C0367a;
import p051b0.C0493b;
import p051b0.C0494c;
import p051b0.C0495d;

/* JADX INFO: renamed from: V.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0314g extends AbstractC0274y {

    /* JADX INFO: renamed from: a */
    public AbstractC0274y f689a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f690b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f691c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0261l f692d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0367a f693e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0315h f694f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0314g(C0315h c0315h, boolean z2, boolean z3, C0261l c0261l, C0367a c0367a) {
        this.f694f = c0315h;
        this.f690b = z2;
        this.f691c = z3;
        this.f692d = c0261l;
        this.f693e = c0367a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: a */
    public final Object mo476a(C0493b c0493b) throws C0495d {
        if (this.f690b) {
            c0493b.mo563D();
            return null;
        }
        AbstractC0274y abstractC0274y = this.f689a;
        if (abstractC0274y == null) {
            C0367a c0367a = this.f693e;
            C0261l c0261l = this.f692d;
            List<InterfaceC0275z> list = c0261l.f616e;
            InterfaceC0275z interfaceC0275z = this.f694f;
            if (!list.contains(interfaceC0275z)) {
                interfaceC0275z = c0261l.f615d;
            }
            boolean z2 = false;
            for (InterfaceC0275z interfaceC0275z2 : list) {
                if (z2) {
                    AbstractC0274y abstractC0274yMo493a = interfaceC0275z2.mo493a(c0261l, c0367a);
                    if (abstractC0274yMo493a != null) {
                        this.f689a = abstractC0274yMo493a;
                        abstractC0274y = abstractC0274yMo493a;
                    }
                } else if (interfaceC0275z2 == interfaceC0275z) {
                    z2 = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + c0367a);
        }
        return abstractC0274y.mo476a(c0493b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: b */
    public final void mo477b(C0494c c0494c, Object obj) throws IOException {
        if (this.f691c) {
            c0494c.mo591i();
            return;
        }
        AbstractC0274y abstractC0274y = this.f689a;
        if (abstractC0274y == null) {
            C0367a c0367a = this.f693e;
            C0261l c0261l = this.f692d;
            List<InterfaceC0275z> list = c0261l.f616e;
            InterfaceC0275z interfaceC0275z = this.f694f;
            if (!list.contains(interfaceC0275z)) {
                interfaceC0275z = c0261l.f615d;
            }
            boolean z2 = false;
            for (InterfaceC0275z interfaceC0275z2 : list) {
                if (z2) {
                    AbstractC0274y abstractC0274yMo493a = interfaceC0275z2.mo493a(c0261l, c0367a);
                    if (abstractC0274yMo493a != null) {
                        this.f689a = abstractC0274yMo493a;
                        abstractC0274y = abstractC0274yMo493a;
                    }
                } else if (interfaceC0275z2 == interfaceC0275z) {
                    z2 = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + c0367a);
        }
        abstractC0274y.mo477b(c0494c, obj);
    }
}
