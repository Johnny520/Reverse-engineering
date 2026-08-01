package p198m0;

import p023E0.AbstractC0277a;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p105V.C1483e;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: m0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2590u {

    /* JADX INFO: renamed from: b */
    public static final C2590u f8246b = new C2590u();

    /* JADX INFO: renamed from: c */
    public static final C2590u f8247c = new C2590u();

    /* JADX INFO: renamed from: d */
    public static final C2590u f8248d = new C2590u();

    /* JADX INFO: renamed from: a */
    public final C1483e f8249a = new C1483e(new InterfaceC2592w[16]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0048, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4539a(C2590u c2590u) {
        c2590u.getClass();
        if (c2590u == f8246b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (c2590u == f8247c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        C1483e c1483e = c2590u.f8249a;
        int i5 = c1483e.f5183f;
        if (i5 == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = c1483e.f5181d;
        for (int i6 = 0; i6 < i5; i6++) {
            AbstractC2206o abstractC2206o = (AbstractC2206o) ((InterfaceC2592w) objArr[i6]);
            if (!abstractC2206o.f7186d.f7199q) {
                AbstractC0277a.m483b("visitChildren called on an unattached node");
            }
            C1483e c1483e2 = new C1483e(new AbstractC2206o[16]);
            AbstractC2206o abstractC2206o2 = abstractC2206o.f7186d;
            AbstractC2206o abstractC2206o3 = abstractC2206o2.f7191i;
            if (abstractC2206o3 == null) {
                AbstractC0601k.m1026b(c1483e2, abstractC2206o2);
            } else {
                c1483e2.m2753b(abstractC2206o3);
            }
            while (true) {
                int i7 = c1483e2.f5183f;
                if (i7 != 0) {
                    AbstractC2206o abstractC2206oM1029e = (AbstractC2206o) c1483e2.m2762k(i7 - 1);
                    if ((abstractC2206oM1029e.f7189g & 1024) == 0) {
                        AbstractC0601k.m1026b(c1483e2, abstractC2206oM1029e);
                    } else {
                        while (true) {
                            if (abstractC2206oM1029e == null) {
                                break;
                            }
                            if ((abstractC2206oM1029e.f7188f & 1024) != 0) {
                                C1483e c1483e3 = null;
                                while (abstractC2206oM1029e != null) {
                                    if (abstractC2206oM1029e instanceof C2567A) {
                                        if (((C2567A) abstractC2206oM1029e).m4490Q0(7)) {
                                            break;
                                        }
                                    } else if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                        int i8 = 0;
                                        for (AbstractC2206o abstractC2206o4 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o4 != null; abstractC2206o4 = abstractC2206o4.f7191i) {
                                            if ((abstractC2206o4.f7188f & 1024) != 0) {
                                                i8++;
                                                if (i8 == 1) {
                                                    abstractC2206oM1029e = abstractC2206o4;
                                                } else {
                                                    if (c1483e3 == null) {
                                                        c1483e3 = new C1483e(new AbstractC2206o[16]);
                                                    }
                                                    if (abstractC2206oM1029e != null) {
                                                        c1483e3.m2753b(abstractC2206oM1029e);
                                                        abstractC2206oM1029e = null;
                                                    }
                                                    c1483e3.m2753b(abstractC2206o4);
                                                }
                                            }
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e3);
                                }
                            } else {
                                abstractC2206oM1029e = abstractC2206oM1029e.f7191i;
                            }
                        }
                    }
                }
            }
        }
    }
}
