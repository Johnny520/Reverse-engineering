package p198m0;

import p105V.C1483e;

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

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0048, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m4539a(p198m0.C2590u r12) {
        /*
            r12.getClass()
            m0.u r0 = p198m0.C2590u.f8246b
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r12 == r0) goto Lc2
            m0.u r0 = p198m0.C2590u.f8247c
            if (r12 == r0) goto Lbc
            V.e r12 = r12.f8249a
            int r0 = r12.f5183f
            if (r0 != 0) goto L1b
            java.lang.String r12 = "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r12)
            return
        L1b:
            java.lang.Object[] r12 = r12.f5181d
            r1 = 0
            r2 = r1
        L1f:
            if (r2 >= r0) goto Lbb
            r3 = r12[r2]
            m0.w r3 = (p198m0.InterfaceC2592w) r3
            h0.o r3 = (p169h0.AbstractC2206o) r3
            h0.o r4 = r3.f7186d
            boolean r4 = r4.f7199q
            if (r4 != 0) goto L32
            java.lang.String r4 = "visitChildren called on an unattached node"
            p023E0.AbstractC0277a.m483b(r4)
        L32:
            V.e r4 = new V.e
            r5 = 16
            h0.o[] r6 = new p169h0.AbstractC2206o[r5]
            r4.<init>(r6)
            h0.o r3 = r3.f7186d
            h0.o r6 = r3.f7191i
            if (r6 != 0) goto L45
            p041H0.AbstractC0601k.m1026b(r4, r3)
            goto L48
        L45:
            r4.m2753b(r6)
        L48:
            int r3 = r4.f5183f
            if (r3 == 0) goto Lb7
            int r3 = r3 + (-1)
            java.lang.Object r3 = r4.m2762k(r3)
            h0.o r3 = (p169h0.AbstractC2206o) r3
            int r6 = r3.f7189g
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 != 0) goto L5e
            p041H0.AbstractC0601k.m1026b(r4, r3)
            goto L48
        L5e:
            if (r3 == 0) goto L48
            int r6 = r3.f7188f
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Lb4
            r6 = 0
            r7 = r6
        L68:
            if (r3 == 0) goto L48
            boolean r8 = r3 instanceof p198m0.C2567A
            if (r8 == 0) goto L78
            m0.A r3 = (p198m0.C2567A) r3
            r8 = 7
            boolean r3 = r3.m4490Q0(r8)
            if (r3 == 0) goto Laf
            goto Lb7
        L78:
            int r8 = r3.f7188f
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto Laf
            boolean r8 = r3 instanceof p041H0.AbstractC0599j
            if (r8 == 0) goto Laf
            r8 = r3
            H0.j r8 = (p041H0.AbstractC0599j) r8
            h0.o r8 = r8.f1943s
            r9 = r1
        L88:
            r10 = 1
            if (r8 == 0) goto Lac
            int r11 = r8.f7188f
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto La9
            int r9 = r9 + 1
            if (r9 != r10) goto L97
            r3 = r8
            goto La9
        L97:
            if (r7 != 0) goto La0
            V.e r7 = new V.e
            h0.o[] r10 = new p169h0.AbstractC2206o[r5]
            r7.<init>(r10)
        La0:
            if (r3 == 0) goto La6
            r7.m2753b(r3)
            r3 = r6
        La6:
            r7.m2753b(r8)
        La9:
            h0.o r8 = r8.f7191i
            goto L88
        Lac:
            if (r9 != r10) goto Laf
            goto L68
        Laf:
            h0.o r3 = p041H0.AbstractC0601k.m1029e(r7)
            goto L68
        Lb4:
            h0.o r3 = r3.f7191i
            goto L5e
        Lb7:
            int r2 = r2 + 1
            goto L1f
        Lbb:
            return
        Lbc:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r1)
            throw r12
        Lc2:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p198m0.C2590u.m4539a(m0.u):void");
    }
}
