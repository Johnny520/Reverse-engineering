package p007B0;

import android.view.KeyEvent;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1925g;
import java.lang.reflect.Array;
import me.dartcv.nuke.BuildConfig;
import p002A1.AbstractC0142o;
import p029F0.AbstractC0387Z;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.C0590e0;
import p041H0.InterfaceC0632z0;
import p047I0.AbstractC0713b;
import p047I0.C0682L0;
import p047I0.C0695S0;
import p047I0.ViewOnAttachStateChangeListenerC0667E;
import p047I0.ViewOnAttachStateChangeListenerC0690P0;
import p056K2.C0891q;
import p077P0.C1122i;
import p077P0.C1125l;
import p077P0.C1128o;
import p077P0.C1129p;
import p077P0.InterfaceC1136w;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p117X2.C1675t;
import p149d3.AbstractC1983k;
import p169h0.AbstractC2206o;
import p170h1.C2230u;
import p193l0.C2480c;
import p193l0.C2481d;
import p198m0.C2567A;
import p204n0.C2684c;
import p211o0.C2735J;
import p211o0.InterfaceC2738M;
import p234s1.C3175g;
import p271y4.AbstractC3502d;

/* JADX INFO: renamed from: B0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0190d extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f662e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f663f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f664g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0190d(int i5, Object obj, Object obj2) {
        super(0);
        this.f662e = i5;
        this.f663f = obj;
        this.f664g = obj2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: I0.y.g(I0.y, android.view.KeyEvent):boolean */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:127:0x0260 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:152:0x026f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:154:0x020b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:156:0x020b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:159:0x0269 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v11 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() throws ClassNotFoundException {
        C1128o c1128o;
        C0564I c0564i;
        C2684c c2684c;
        switch (this.f662e) {
            case 0:
                ((C0191e) this.f663f).m295d((AbstractC2206o) this.f664g);
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0590e0 c0590e0 = ((C0564I) this.f663f).f1699J;
                C1675t c1675t = (C1675t) this.f664g;
                if ((c0590e0.f1896f.f7189g & 8) != 0) {
                    for (AbstractC2206o abstractC2206o = c0590e0.f1895e; abstractC2206o != null; abstractC2206o = abstractC2206o.f7190h) {
                        if ((abstractC2206o.f7188f & 8) != 0) {
                            ?? M1029e = abstractC2206o;
                            ?? c1483e = 0;
                            while (M1029e != 0) {
                                if (M1029e instanceof InterfaceC0632z0) {
                                    InterfaceC0632z0 interfaceC0632z0 = (InterfaceC0632z0) M1029e;
                                    if (interfaceC0632z0.mo1084h0()) {
                                        C1125l c1125l = new C1125l();
                                        c1675t.f5710e = c1125l;
                                        c1125l.f3705g = true;
                                    }
                                    if (interfaceC0632z0.mo1085j0()) {
                                        ((C1125l) c1675t.f5710e).f3704f = true;
                                    }
                                    interfaceC0632z0.mo943X((InterfaceC1136w) c1675t.f5710e);
                                } else if ((M1029e.f7188f & 8) != 0 && (M1029e instanceof AbstractC0599j)) {
                                    AbstractC2206o abstractC2206o2 = ((AbstractC0599j) M1029e).f1943s;
                                    int i5 = 0;
                                    M1029e = M1029e;
                                    c1483e = c1483e;
                                    while (abstractC2206o2 != null) {
                                        if ((abstractC2206o2.f7188f & 8) != 0) {
                                            i5++;
                                            c1483e = c1483e;
                                            if (i5 == 1) {
                                                M1029e = abstractC2206o2;
                                            } else {
                                                if (c1483e == 0) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (M1029e != 0) {
                                                    c1483e.m2753b(M1029e);
                                                    M1029e = 0;
                                                }
                                                c1483e.m2753b(abstractC2206o2);
                                            }
                                        }
                                        abstractC2206o2 = abstractC2206o2.f7191i;
                                        M1029e = M1029e;
                                        c1483e = c1483e;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                M1029e = AbstractC0601k.m1029e(c1483e);
                            }
                        }
                    }
                }
                return C0891q.f2780a;
            case 2:
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f663f;
                C2735J c2735j = AbstractC0596h0.f1912P;
                interfaceC1601c.mo1h(c2735j);
                AbstractC0596h0 abstractC0596h0 = (AbstractC0596h0) this.f664g;
                InterfaceC2738M interfaceC2738M = abstractC0596h0.f1923G;
                InterfaceC2738M interfaceC2738M2 = c2735j.f8693q;
                boolean z5 = interfaceC2738M != interfaceC2738M2;
                boolean z6 = abstractC0596h0.f1924H;
                boolean z7 = c2735j.f8694r;
                boolean z8 = z6 != z7;
                if (z5 || z8) {
                    abstractC0596h0.f1923G = interfaceC2738M2;
                    abstractC0596h0.f1924H = z7;
                    if (abstractC0596h0.f1925I && (z8 || (z7 && z5))) {
                        abstractC0596h0.f1932r.m797E();
                    }
                }
                abstractC0596h0.f1925I = true;
                c2735j.f8700x = c2735j.f8693q.mo1116a(c2735j.f8695s, c2735j.f8697u, c2735j.f8696t);
                return C0891q.f2780a;
            case 3:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.f664g));
            case 4:
                ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E = (ViewOnAttachStateChangeListenerC0667E) this.f664g;
                C0682L0 c0682l0 = (C0682L0) this.f663f;
                C1122i c1122i = c0682l0.f2167h;
                C1122i c1122i2 = c0682l0.f2168i;
                Float f2 = c0682l0.f2165f;
                Float f5 = c0682l0.f2166g;
                float fFloatValue = (c1122i == null || f2 == null) ? 0.0f : ((Number) c1122i.f3649a.mo6a()).floatValue() - f2.floatValue();
                float fFloatValue2 = (c1122i2 == null || f5 == null) ? 0.0f : ((Number) c1122i2.f3649a.mo6a()).floatValue() - f5.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iM1158t = viewOnAttachStateChangeListenerC0667E.m1158t(c0682l0.f2163d);
                    C1129p c1129p = (C1129p) viewOnAttachStateChangeListenerC0667E.m1154l().m4318b(viewOnAttachStateChangeListenerC0667E.f2136o);
                    if (c1129p != null) {
                        try {
                            C3175g c3175g = viewOnAttachStateChangeListenerC0667E.f2138q;
                            if (c3175g != null) {
                                c3175g.f9931a.setBoundsInScreen(viewOnAttachStateChangeListenerC0667E.m1146d(c1129p));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    C1129p c1129p2 = (C1129p) viewOnAttachStateChangeListenerC0667E.m1154l().m4318b(viewOnAttachStateChangeListenerC0667E.f2137p);
                    if (c1129p2 != null) {
                        try {
                            C3175g c3175g2 = viewOnAttachStateChangeListenerC0667E.f2139r;
                            if (c3175g2 != null) {
                                c3175g2.f9931a.setBoundsInScreen(viewOnAttachStateChangeListenerC0667E.m1146d(c1129p2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    viewOnAttachStateChangeListenerC0667E.f2128g.invalidate();
                    C1129p c1129p3 = (C1129p) viewOnAttachStateChangeListenerC0667E.m1154l().m4318b(iM1158t);
                    if (c1129p3 != null && (c1128o = c1129p3.f3715a) != null && (c0564i = c1128o.f3710c) != null) {
                        if (c1122i != null) {
                            viewOnAttachStateChangeListenerC0667E.f2141t.m4344h(iM1158t, c1122i);
                        }
                        if (c1122i2 != null) {
                            viewOnAttachStateChangeListenerC0667E.f2142u.m4344h(iM1158t, c1122i2);
                        }
                        viewOnAttachStateChangeListenerC0667E.m1157p(c0564i);
                    }
                }
                if (c1122i != null) {
                    c0682l0.f2165f = (Float) c1122i.f3649a.mo6a();
                }
                if (c1122i2 != null) {
                    c0682l0.f2166g = (Float) c1122i2.f3649a.mo6a();
                }
                return C0891q.f2780a;
            case 5:
                ((AbstractC0713b) this.f663f).removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC0690P0) this.f664g);
                return C0891q.f2780a;
            case 6:
                ((AbstractC0142o) this.f663f).mo185b((C0695S0) this.f664g);
                return C0891q.f2780a;
            case 7:
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) this.f663f;
                if (interfaceC1599a != null && (c2684c = (C2684c) interfaceC1599a.mo6a()) != null) {
                    return c2684c;
                }
                AbstractC0596h0 abstractC0596h02 = (AbstractC0596h0) this.f664g;
                if (!abstractC0596h02.mo981R0().f7199q) {
                    abstractC0596h02 = null;
                }
                if (abstractC0596h02 != null) {
                    return AbstractC1922d.m3425d(0L, AbstractC1925g.m3523F(abstractC0596h02.f1208f));
                }
                return null;
            case 8:
                ((C1675t) this.f663f).f5710e = AbstractC0601k.m1032h((C2230u) this.f664g, AbstractC0387Z.f1202a);
                return C0891q.f2780a;
            case 9:
                ((C2480c) this.f663f).f7980t.mo1h((C2481d) this.f664g);
                return C0891q.f2780a;
            case 10:
                ((C1675t) this.f663f).f5710e = ((C2567A) this.f664g).m4485L0();
                return C0891q.f2780a;
            default:
                String strSubstring = (String) this.f663f;
                int i6 = 0;
                while (AbstractC1983k.m3650M(strSubstring, "[]")) {
                    i6++;
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    AbstractC1665j.m2984d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                Class<?> clsLoadClass = (Class) AbstractC3502d.f10911b.get(strSubstring);
                if (clsLoadClass == null) {
                    clsLoadClass = ((ClassLoader) this.f664g).loadClass(strSubstring);
                }
                AbstractC1665j.m2984d(clsLoadClass, "baseClass");
                for (int i7 = 0; i7 < i6; i7++) {
                    clsLoadClass = Array.newInstance(clsLoadClass, 0).getClass();
                }
                return clsLoadClass;
        }
    }
}
