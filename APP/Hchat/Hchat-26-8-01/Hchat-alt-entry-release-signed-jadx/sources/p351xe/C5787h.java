package p351xe;

import af.C0083f;
import java.util.HashSet;
import md.AbstractC2828e;
import md.C2825b;
import md.InterfaceC2832i;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p068eh.AbstractC0921a;
import p199nd.C2984p;
import p302ud.InterfaceC4315k;

/* JADX INFO: renamed from: xe.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5787h {

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2844b f23529c = AbstractC2846d.m6274b(C5787h.class);

    /* JADX INFO: renamed from: a */
    public final HashSet f23530a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final HashSet f23531b = new HashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m10468a(InterfaceC4315k interfaceC4315k, String str, Throwable th2) {
        C5787h c5787h = interfaceC4315k.mo8668n().f14436b;
        synchronized (c5787h) {
            try {
                c5787h.f23530a.add((InterfaceC2832i) interfaceC4315k);
                String strM10469b = m10469b(interfaceC4315k, str);
                if (th2 instanceof StackOverflowError) {
                    f23529c.mo6264r(strM10469b, "{}, error: StackOverflowError");
                } else if (th2 instanceof C0083f) {
                    String message = th2.getMessage();
                    C0083f c0083f = new C0083f(message);
                    if (message == null || message.isEmpty()) {
                        f23529c.mo6264r(strM10469b, "{}");
                    } else {
                        f23529c.mo6260n(strM10469b, "{}, details: {}", message);
                    }
                    th2 = c0083f;
                } else {
                    f23529c.mo6251e(strM10469b, th2);
                }
                ((AbstractC2828e) ((InterfaceC2832i) interfaceC4315k)).m6232x(C2825b.f9188c, new C2984p(str, th2));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m10469b(InterfaceC4315k interfaceC4315k, String str) {
        String strTypeName = interfaceC4315k.typeName();
        String strValueOf = String.valueOf(interfaceC4315k);
        String strMo8666m = interfaceC4315k.mo8666m();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(strTypeName);
        sb2.append(": ");
        sb2.append(strValueOf);
        return AbstractC0921a.m2255r(sb2, ", file: ", strMo8666m);
    }
}
