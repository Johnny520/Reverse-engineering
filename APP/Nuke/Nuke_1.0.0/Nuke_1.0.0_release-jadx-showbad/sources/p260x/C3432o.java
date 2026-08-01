package p260x;

import p000A.C0034R0;
import p027E4.C0330q;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0597i;
import p041H0.InterfaceC0627x;
import p061L2.C0982v;
import p169h0.AbstractC2206o;
import p227r.C2976a;
import p227r.EnumC2983d0;
import p255w.C3374e;

/* JADX INFO: renamed from: x.o */
/* JADX INFO: loaded from: classes.dex */
public final class C3432o extends AbstractC2206o implements InterfaceC0627x, InterfaceC0597i {

    /* JADX INFO: renamed from: u */
    public static final C3430m f10718u = new C3430m();

    /* JADX INFO: renamed from: r */
    public C3374e f10719r;

    /* JADX INFO: renamed from: s */
    public C2976a f10720s;

    /* JADX INFO: renamed from: t */
    public EnumC2983d0 f10721t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final boolean m5696J0(C3427j c3427j, int i5) {
        if (i5 == 5 || i5 == 6) {
            if (this.f10721t == EnumC2983d0.f9448e) {
                return false;
            }
        } else if (i5 == 3 || i5 == 4) {
            if (this.f10721t == EnumC2983d0.f9447d) {
                return false;
            }
        } else if (i5 != 1 && i5 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (m5697K0(i5)) {
            if (c3427j.f10710b >= this.f10719r.f10489a.m5620g().f10531n - 1) {
                return false;
            }
        } else if (c3427j.f10709a <= 0) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public final boolean m5697K0(int i5) {
        if (i5 == 1) {
            return false;
        }
        if (i5 == 2) {
            return true;
        }
        if (i5 == 5) {
            return false;
        }
        if (i5 == 6) {
            return true;
        }
        if (i5 == 3) {
            int iOrdinal = AbstractC0601k.m1044t(this).f1693D.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new C0330q();
        }
        if (i5 != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = AbstractC0601k.m1044t(this).f1693D.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new C0330q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(j5);
        return interfaceC0379Q.mo604f0(abstractC0391b0Mo648e.f1206d, abstractC0391b0Mo648e.f1207e, C0982v.f3048d, new C0034R0(abstractC0391b0Mo648e, 7));
    }
}
