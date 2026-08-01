package p264s0;

import p080f9.C2363j;
import p275t0.C7991p0;

/* JADX INFO: renamed from: s0.y1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7018y1 {

    /* JADX INFO: renamed from: a */
    public final C2363j f23304a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6888p8 f23305b;

    /* JADX INFO: renamed from: c */
    public final C7991p0 f23306c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6706e2 f23307d;

    /* JADX INFO: renamed from: e */
    public final String f23308e;

    /* JADX INFO: renamed from: f */
    public final String f23309f;

    /* JADX INFO: renamed from: g */
    public final String f23310g;

    /* JADX INFO: renamed from: h */
    public final String f23311h;

    /* JADX INFO: renamed from: i */
    public Long f23312i;

    /* JADX INFO: renamed from: j */
    public Long f23313j;

    public C7018y1(C2363j c2363j, InterfaceC6888p8 interfaceC6888p8, C7991p0 c7991p0, InterfaceC6706e2 interfaceC6706e2, String str, String str2, String str3, String str4) {
        this.f23304a = c2363j;
        this.f23305b = interfaceC6888p8;
        this.f23306c = c7991p0;
        this.f23307d = interfaceC6706e2;
        this.f23308e = str;
        this.f23309f = str2;
        this.f23310g = str3;
        this.f23311h = str4;
    }

    /* JADX INFO: renamed from: a */
    public final void m27694a(Long l10) {
        this.f23312i = l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m27695b(p275t0.C7947d0 r8, int r9, java.util.Locale r10) {
        /*
            r7 = this;
            if (r8 != 0) goto L1c
            java.lang.String r8 = r7.f23308e
            t0.p0 r9 = r7.f23306c
            java.lang.String r9 = r9.m30767b()
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toUpperCase(r10)
            r9.getClass()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r8 = p275t0.AbstractC7980l1.m30748a(r8, r9)
            return r8
        L1c:
            f9.j r0 = r7.f23304a
            int r1 = r8.m30678h()
            boolean r0 = r0.m8566t(r1)
            if (r0 != 0) goto L4d
            java.lang.String r8 = r7.f23309f
            f9.j r9 = r7.f23304a
            int r0 = r9.m8560o()
            r5 = 7
            r6 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r10
            java.lang.String r9 = p264s0.AbstractC6800k0.m26977c(r0, r1, r2, r3, r4, r5, r6)
            f9.j r10 = r7.f23304a
            int r0 = r10.m8561p()
            java.lang.String r10 = p264s0.AbstractC6800k0.m26977c(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10}
            java.lang.String r8 = p275t0.AbstractC7980l1.m30748a(r8, r9)
            return r8
        L4d:
            r4 = r10
            s0.p8 r10 = r7.f23305b
            int r0 = r8.m30678h()
            boolean r0 = r10.m27336b(r0)
            if (r0 == 0) goto Laa
            long r0 = r8.m30677g()
            boolean r10 = r10.m27335a(r0)
            if (r10 != 0) goto L65
            goto Laa
        L65:
            s0.p5$a r10 = p264s0.AbstractC6885p5.f22406a
            int r0 = r10.m27334c()
            boolean r0 = p264s0.AbstractC6885p5.m27331e(r9, r0)
            if (r0 == 0) goto L87
            long r0 = r8.m30677g()
            java.lang.Long r2 = r7.f23313j
            if (r2 == 0) goto L7e
            long r2 = r2.longValue()
            goto L83
        L7e:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L83:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto La4
        L87:
            int r10 = r10.m27332a()
            boolean r9 = p264s0.AbstractC6885p5.m27331e(r9, r10)
            if (r9 == 0) goto La7
            long r8 = r8.m30677g()
            java.lang.Long r10 = r7.f23312i
            if (r10 == 0) goto L9e
            long r0 = r10.longValue()
            goto La0
        L9e:
            r0 = -9223372036854775808
        La0:
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto La7
        La4:
            java.lang.String r8 = r7.f23311h
            return r8
        La7:
            java.lang.String r8 = ""
            return r8
        Laa:
            java.lang.String r9 = r7.f23310g
            s0.e2 r0 = r7.f23307d
            long r1 = r8.m30677g()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = r4
            r4 = 4
            r5 = 0
            r3 = 0
            java.lang.String r8 = p264s0.InterfaceC6706e2.m26645a(r0, r1, r2, r3, r4, r5)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r8 = p275t0.AbstractC7980l1.m30748a(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p264s0.C7018y1.m27695b(t0.d0, int, java.util.Locale):java.lang.String");
    }
}
