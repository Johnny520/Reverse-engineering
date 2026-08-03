package p015b0;

import af.C0081d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.lifecycle.C0119x;
import bsh.org.objectweb.asm.Opcodes;
import java.lang.ref.WeakReference;
import p010aa.C0035c;
import p011ab.C0041a;
import p028c1.AbstractC0378h;
import p040d0.AbstractC0649f;
import p040d0.InterfaceC0647d;
import p042d2.C0682b;
import p042d2.C0683c;
import p042d2.C0684d;
import p069f.C0965w;
import p071f1.C1003g;
import p071f1.C1017n;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1869p1;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p146k1.C2232a;
import p158l.AbstractC2415f;
import p158l.AbstractC2418i;
import p218og.AbstractC3149m;
import p222p.AbstractC3222h1;
import p222p.AbstractC3241o;
import p259r9.AbstractC3754e0;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p276sf.C3967n;
import p308v1.C4390g;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5891i0;
import p358y2.AbstractC5978m;
import p358y2.C5967c0;
import p358y2.EnumC5969d0;
import p372z.C6055c;
import p372z.InterfaceC6059g;

/* JADX INFO: renamed from: b0.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0157w {

    /* JADX INFO: renamed from: a */
    public static final C5967c0 f415a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        f415a = new C5967c0((30 & 1) == 0, EnumC5969d0.f24261g, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m735a(InterfaceC6059g interfaceC6059g, C6055c c6055c, C1836h0 c1836h0, int i9) {
        C1836h0 c1836h02;
        Context context;
        c1836h0.m4527b0(1904307118);
        int i10 = (c1836h0.m4534f(interfaceC6059g) ? 4 : 2) | i9 | (c1836h0.m4538h(c6055c) ? 32 : 16);
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                c1836h0.m4525a0(-1009482584);
                context = (Context) c1836h0.m4542j(AbstractC5891i0.f23946b);
                c1836h0.m4553p(false);
            } else {
                c1836h0.m4525a0(-1009433480);
                c1836h0.m4553p(false);
                context = null;
            }
            boolean zM4538h = c1836h0.m4538h(c6055c) | ((i10 & 14) == 4) | c1836h0.m4538h(context);
            Object objM4514P = c1836h0.m4514P();
            if (zM4538h || objM4514P == C1851l.f6155a) {
                objM4514P = new C0153s(c6055c, context, interfaceC6059g, 0);
                c1836h0.m4545k0(objM4514P);
            }
            c1836h02 = c1836h0;
            AbstractC2418i.m5754b(null, null, (InterfaceC1231l) objM4514P, c1836h02, 0, 3);
        } else {
            c1836h02 = c1836h0;
            c1836h02.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0151q(interfaceC6059g, c6055c, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m736b(final int i9, final long j3, C1836h0 c1836h0, final int i10) {
        final int i11;
        int i12;
        C1876r1 c1876r1M4557t;
        InterfaceC1235p interfaceC1235p;
        TypedValue typedValue;
        c1836h0.m4527b0(-1240244237);
        if ((i10 & 6) == 0) {
            i11 = i9;
            i12 = i10 | (c1836h0.m4530d(i11) ? 4 : 2);
        } else {
            i11 = i9;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c1836h0.m4532e(j3) ? 32 : 16;
        }
        if (c1836h0.m4516S(i12 & 1, (i12 & 19) != 18)) {
            AbstractC1869p1 abstractC1869p1 = AbstractC5891i0.f23946b;
            Context context = (Context) c1836h0.m4542j(abstractC1869p1);
            boolean zM4534f = ((i12 & 14) == 4) | c1836h0.m4534f(context);
            Object objM4514P = c1836h0.m4514P();
            if (zM4534f || objM4514P == C1851l.f6155a) {
                objM4514P = Integer.valueOf(context.obtainStyledAttributes(new int[]{i11}).getResourceId(0, -1));
                c1836h0.m4545k0(objM4514P);
            }
            int iIntValue = ((Number) objM4514P).intValue();
            if (iIntValue == -1) {
                c1876r1M4557t = c1836h0.m4557t();
                if (c1876r1M4557t != null) {
                    final int i13 = 1;
                    interfaceC1235p = new InterfaceC1235p() { // from class: b0.p
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj, Object obj2) {
                            int i14 = i13;
                            C1836h0 c1836h02 = (C1836h0) obj;
                            ((Integer) obj2).getClass();
                            switch (i14) {
                                case 0:
                                    AbstractC0157w.m736b(i11, j3, c1836h02, AbstractC1874r.m4617C(i10 | 1));
                                    break;
                                default:
                                    AbstractC0157w.m736b(i11, j3, c1836h02, AbstractC1874r.m4617C(i10 | 1));
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    };
                    c1876r1M4557t.f6241d = interfaceC1235p;
                }
                return;
            }
            Context context2 = (Context) c1836h0.m4542j(abstractC1869p1);
            Resources resources = (Resources) c1836h0.m4542j(AbstractC5891i0.f23947c);
            C0684d c0684d = (C0684d) c1836h0.m4542j(AbstractC5891i0.f23949e);
            synchronized (c0684d) {
                typedValue = (TypedValue) c0684d.f2091a.m2313b(iIntValue);
                if (typedValue == null) {
                    typedValue = new TypedValue();
                    resources.getValue(iIntValue, typedValue, true);
                    C0965w c0965w = c0684d.f2091a;
                    int iM2375d = c0965w.m2375d(iIntValue);
                    Object[] objArr = c0965w.f2965c;
                    Object obj = objArr[iM2375d];
                    c0965w.f2964b[iM2375d] = iIntValue;
                    objArr[iM2375d] = typedValue;
                }
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null && AbstractC3149m.m6714m0(charSequence, ".xml")) {
                c1836h0.m4525a0(-1771798434);
                WeakReference weakReference = (WeakReference) ((C0683c) c1836h0.m4542j(AbstractC5891i0.f23948d)).f2090a.get(new C0682b(context2.getTheme(), iIntValue));
                if (weakReference != null) {
                }
                resources.getXml(iIntValue);
                throw null;
            }
            c1836h0.m4525a0(-1771643000);
            boolean zM4534f2 = c1836h0.m4534f(context2.getTheme()) | c1836h0.m4534f(charSequence) | c1836h0.m4530d(iIntValue);
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                try {
                    Drawable drawable = resources.getDrawable(iIntValue, null);
                    drawable.getClass();
                    objM4514P2 = new C1003g(((BitmapDrawable) drawable).getBitmap());
                    c1836h0.m4545k0(objM4514P2);
                } catch (Exception e6) {
                    throw new C0081d("Error attempting to load resource: " + ((Object) charSequence), e6);
                }
            }
            C1003g c1003g = (C1003g) objM4514P2;
            C2232a c2232a = new C2232a(c1003g, (((long) c1003g.f3179a.getHeight()) & 4294967295L) | (((long) c1003g.f3179a.getWidth()) << 32));
            c1836h0.m4553p(false);
            boolean z9 = (i12 & 112) == 32;
            Object objM4514P3 = c1836h0.m4514P();
            if (z9 || objM4514P3 == C1851l.f6155a) {
                Object c1017n = j3 != 16 ? new C1017n(j3, 5) : null;
                c1836h0.m4545k0(c1017n);
                objM4514P3 = c1017n;
            }
            AbstractC3241o.m6927a(AbstractC0378h.m1342g(AbstractC3222h1.m6907j(C5850l.f23787a, AbstractC2415f.f7903j), c2232a, C4390g.f14628b, (C1017n) objM4514P3, 22), c1836h0, 0);
        } else {
            c1836h0.m4519V();
        }
        c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            final int i14 = 0;
            interfaceC1235p = new InterfaceC1235p() { // from class: b0.p
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj2, Object obj22) {
                    int i142 = i14;
                    C1836h0 c1836h02 = (C1836h0) obj2;
                    ((Integer) obj22).getClass();
                    switch (i142) {
                        case 0:
                            AbstractC0157w.m736b(i9, j3, c1836h02, AbstractC1874r.m4617C(i10 | 1));
                            break;
                        default:
                            AbstractC0157w.m736b(i9, j3, c1836h02, AbstractC1874r.m4617C(i10 | 1));
                            break;
                    }
                    return C3967n.f12976a;
                }
            };
            c1876r1M4557t.f6241d = interfaceC1235p;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m737c(InterfaceC6059g interfaceC6059g, InterfaceC0647d interfaceC0647d, InterfaceC1220a interfaceC1220a, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(-2040393164);
        if ((i9 & 6) == 0) {
            i10 = ((i9 & 8) == 0 ? c1836h0.m4534f(interfaceC6059g) : c1836h0.m4538h(interfaceC6059g) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= (i9 & 64) == 0 ? c1836h0.m4534f(interfaceC0647d) : c1836h0.m4538h(interfaceC0647d) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4538h(interfaceC1220a) ? Opcodes.ACC_NATIVE : 128;
        }
        boolean z9 = false;
        if (c1836h0.m4516S(i10 & 1, (i10 & 147) != 146)) {
            boolean z10 = (i10 & 112) == 32 || ((i10 & 64) != 0 && c1836h0.m4534f(interfaceC0647d));
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (z10 || objM4514P == c1823e) {
                objM4514P = new C0159y(new C0119x(new C0035c(interfaceC0647d, 2, interfaceC1220a), 29));
                c1836h0.m4545k0(objM4514P);
            }
            C0159y c0159y = (C0159y) objM4514P;
            if ((i10 & 14) == 4 || ((i10 & 8) != 0 && c1836h0.m4538h(interfaceC6059g))) {
                z9 = true;
            }
            Object objM4514P2 = c1836h0.m4514P();
            if (z9 || objM4514P2 == c1823e) {
                objM4514P2 = new C0041a(interfaceC6059g, 2);
                c1836h0.m4545k0(objM4514P2);
            }
            AbstractC5978m.m10712a(c0159y, (InterfaceC1220a) objM4514P2, f415a, AbstractC3879i.m8071e(1315155414, new C0151q(interfaceC0647d, 0, interfaceC6059g), c1836h0), c1836h0, 3456, 0);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0152r(interfaceC6059g, interfaceC0647d, interfaceC1220a, i9, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m738d(InterfaceC5853o interfaceC5853o, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(1392105195);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4538h(c3874d) ? 32 : 16;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            AbstractC3754e0.m7886e(interfaceC5853o, AbstractC0649f.f2014a, c3874d, c1836h0, ((i10 << 6) & 7168) | (i10 & 14) | 432);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0143i(interfaceC5853o, c3874d, i9, 2);
        }
    }
}
