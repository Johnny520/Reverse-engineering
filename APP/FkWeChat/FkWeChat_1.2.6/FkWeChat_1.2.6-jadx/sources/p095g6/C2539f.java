package p095g6;

import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p119i1.AbstractC3137l;
import p172l8.C4700i0;

/* JADX INFO: renamed from: g6.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2539f {

    /* JADX INFO: renamed from: b */
    public static boolean f6802b;

    /* JADX INFO: renamed from: a */
    public static final C2539f f6801a = new C2539f();

    /* JADX INFO: renamed from: c */
    public static final int f6803c = 8;

    /* JADX INFO: renamed from: a */
    public final void m9054a(String str, InterfaceC0173a interfaceC0173a) {
        str.getClass();
        interfaceC0173a.getClass();
        m9055b(str, null, interfaceC0173a);
    }

    /* JADX INFO: renamed from: b */
    public final void m9055b(String str, Throwable th, InterfaceC0173a interfaceC0173a) {
        str.getClass();
        interfaceC0173a.getClass();
        if (f6802b) {
            AbstractC3137l.a aVar = AbstractC3137l.f8345e;
            AbstractC3137l abstractC3137lM11765d = aVar.m11765d();
            InterfaceC0184l interfaceC0184lMo11676g = abstractC3137lM11765d != null ? abstractC3137lM11765d.mo11676g() : null;
            AbstractC3137l abstractC3137lM11767f = aVar.m11767f(abstractC3137lM11765d);
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) interfaceC0173a.invoke());
                if (th != null) {
                    sb2.append(". Throwable: ");
                    sb2.append(th);
                }
                AbstractC2540g.m9057a(str, sb2.toString());
                C4700i0 c4700i0 = C4700i0.f13910a;
                aVar.m11772k(abstractC3137lM11765d, abstractC3137lM11767f, interfaceC0184lMo11676g);
            } catch (Throwable th2) {
                aVar.m11772k(abstractC3137lM11765d, abstractC3137lM11767f, interfaceC0184lMo11676g);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9056c() {
        return f6802b;
    }
}
