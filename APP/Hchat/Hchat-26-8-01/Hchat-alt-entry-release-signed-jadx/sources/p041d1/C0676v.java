package p041d1;

import p131j0.C2046b;
import p136j8.C2104o;
import p292u1.AbstractC4229a;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: d1.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0676v {

    /* JADX INFO: renamed from: b */
    public static final C0676v f2078b = new C0676v();

    /* JADX INFO: renamed from: c */
    public static final C0676v f2079c = new C0676v();

    /* JADX INFO: renamed from: d */
    public static final C0676v f2080d = new C0676v();

    /* JADX INFO: renamed from: a */
    public final C2046b f2081a = new C2046b(new InterfaceC0678x[16]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0048, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1859a(C0676v c0676v) {
        c0676v.getClass();
        if (c0676v == f2078b) {
            C2104o.m5276A("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (c0676v == f2079c) {
            C2104o.m5276A("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        C2046b c2046b = c0676v.f2081a;
        int i9 = c2046b.f6893i;
        if (i9 == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = c2046b.f6891g;
        for (int i10 = 0; i10 < i9; i10++) {
            AbstractC5852n abstractC5852n = (AbstractC5852n) ((InterfaceC0678x) objArr[i10]);
            if (!abstractC5852n.f23788g.f23801t) {
                AbstractC4229a.m8494b("visitChildren called on an unattached node");
            }
            C2046b c2046b2 = new C2046b(new AbstractC5852n[16]);
            AbstractC5852n abstractC5852n2 = abstractC5852n.f23788g;
            AbstractC5852n abstractC5852n3 = abstractC5852n2.f23793l;
            if (abstractC5852n3 == null) {
                AbstractC5618k.m10146b(c2046b2, abstractC5852n2);
            } else {
                c2046b2.m5056b(abstractC5852n3);
            }
            while (true) {
                int i11 = c2046b2.f6893i;
                if (i11 != 0) {
                    AbstractC5852n abstractC5852nM10149e = (AbstractC5852n) c2046b2.m5065k(i11 - 1);
                    if ((abstractC5852nM10149e.f23791j & 1024) == 0) {
                        AbstractC5618k.m10146b(c2046b2, abstractC5852nM10149e);
                    } else {
                        while (true) {
                            if (abstractC5852nM10149e == null) {
                                break;
                            }
                            if ((abstractC5852nM10149e.f23790i & 1024) != 0) {
                                C2046b c2046b3 = null;
                                while (abstractC5852nM10149e != null) {
                                    if (abstractC5852nM10149e instanceof C0653b0) {
                                        if (((C0653b0) abstractC5852nM10149e).m1805r1(7)) {
                                            break;
                                        }
                                    } else if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                        int i12 = 0;
                                        for (AbstractC5852n abstractC5852n4 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n4 != null; abstractC5852n4 = abstractC5852n4.f23793l) {
                                            if ((abstractC5852n4.f23790i & 1024) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    abstractC5852nM10149e = abstractC5852n4;
                                                } else {
                                                    if (c2046b3 == null) {
                                                        c2046b3 = new C2046b(new AbstractC5852n[16]);
                                                    }
                                                    if (abstractC5852nM10149e != null) {
                                                        c2046b3.m5056b(abstractC5852nM10149e);
                                                        abstractC5852nM10149e = null;
                                                    }
                                                    c2046b3.m5056b(abstractC5852n4);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b3);
                                }
                            } else {
                                abstractC5852nM10149e = abstractC5852nM10149e.f23793l;
                            }
                        }
                    }
                }
            }
        }
    }
}
