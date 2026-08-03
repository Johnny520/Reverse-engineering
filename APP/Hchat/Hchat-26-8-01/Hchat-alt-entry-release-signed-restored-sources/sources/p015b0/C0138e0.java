package p015b0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import p028c1.AbstractC0378h;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p158l.AbstractC2415f;
import p222p.AbstractC3222h1;
import p222p.AbstractC3241o;
import p276sf.C3967n;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5891i0;

/* JADX INFO: renamed from: b0.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0138e0 {

    /* JADX INFO: renamed from: a */
    public static final C0138e0 f360a = new C0138e0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m714a(Drawable drawable, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(257732500);
        int i10 = (c1836h0.m4538h(drawable) ? 4 : 2) | i9;
        if (c1836h0.m4516S(i10 & 1, (i10 & 3) != 2)) {
            InterfaceC5853o interfaceC5853oM6907j = AbstractC3222h1.m6907j(C5850l.f23787a, AbstractC2415f.f7903j);
            boolean zM4538h = c1836h0.m4538h(drawable);
            Object objM4514P = c1836h0.m4514P();
            if (zM4538h || objM4514P == C1851l.f6155a) {
                objM4514P = new C0136d0(drawable, 0);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC3241o.m6927a(AbstractC0378h.m1339d(interfaceC5853oM6907j, (InterfaceC1231l) objM4514P), c1836h0, 0);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0151q(this, drawable, i9, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m715b(final Icon icon, C1836h0 c1836h0, final int i9) {
        C1876r1 c1876r1M4557t;
        InterfaceC1235p interfaceC1235p;
        c1836h0.m4527b0(2116504409);
        int i10 = (c1836h0.m4538h(icon) ? 4 : 2) | i9;
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            Context context = (Context) c1836h0.m4542j(AbstractC5891i0.f23946b);
            boolean zM4534f = c1836h0.m4534f(icon) | c1836h0.m4534f(context);
            Object objM4514P = c1836h0.m4514P();
            if (zM4534f || objM4514P == C1851l.f6155a) {
                objM4514P = icon.loadDrawable(context);
                c1836h0.m4545k0(objM4514P);
            }
            Drawable drawable = (Drawable) objM4514P;
            if (drawable == null) {
                c1876r1M4557t = c1836h0.m4557t();
                if (c1876r1M4557t != null) {
                    final int i11 = 0;
                    interfaceC1235p = new InterfaceC1235p(this, icon, i9, i11) { // from class: b0.c0

                        /* JADX INFO: renamed from: g */
                        public final /* synthetic */ int f348g;

                        /* JADX INFO: renamed from: h */
                        public final /* synthetic */ C0138e0 f349h;

                        /* JADX INFO: renamed from: i */
                        public final /* synthetic */ Icon f350i;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        {
                            this.f348g = i11;
                            this.f349h = this;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj, Object obj2) {
                            int i12 = this.f348g;
                            C1836h0 c1836h02 = (C1836h0) obj;
                            ((Integer) obj2).getClass();
                            switch (i12) {
                                case 0:
                                    this.f349h.m715b(this.f350i, c1836h02, AbstractC1874r.m4617C(49));
                                    break;
                                default:
                                    this.f349h.m715b(this.f350i, c1836h02, AbstractC1874r.m4617C(49));
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    };
                    c1876r1M4557t.f6241d = interfaceC1235p;
                }
                return;
            }
            m714a(drawable, c1836h0, 48);
        } else {
            c1836h0.m4519V();
        }
        c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            final int i12 = 1;
            interfaceC1235p = new InterfaceC1235p(this, icon, i9, i12) { // from class: b0.c0

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ int f348g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C0138e0 f349h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ Icon f350i;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f348g = i12;
                    this.f349h = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj, Object obj2) {
                    int i122 = this.f348g;
                    C1836h0 c1836h02 = (C1836h0) obj;
                    ((Integer) obj2).getClass();
                    switch (i122) {
                        case 0:
                            this.f349h.m715b(this.f350i, c1836h02, AbstractC1874r.m4617C(49));
                            break;
                        default:
                            this.f349h.m715b(this.f350i, c1836h02, AbstractC1874r.m4617C(49));
                            break;
                    }
                    return C3967n.f12976a;
                }
            };
            c1876r1M4557t.f6241d = interfaceC1235p;
        }
    }
}
