package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2360 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.nio.channels.FileChannel f7727;

    public C2360(@Yue.InterfaceC4418 java.nio.channels.FileChannel r2) {
            r1 = this;
            java.lang.String r0 = "fileChannel"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f7727 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m10866(long r10, @Yue.InterfaceC4418 Yue.C0843 r12, long r13) {
            r9 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L1c
        Lb:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1b
            java.nio.channels.FileChannel r3 = r9.f7727
            r4 = r10
            r6 = r13
            r8 = r12
            long r2 = r3.transferTo(r4, r6, r8)
            long r10 = r10 + r2
            long r13 = r13 - r2
            goto Lb
        L1b:
            return
        L1c:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            r10.<init>()
            throw r10
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m10867(long r10, @Yue.InterfaceC4418 Yue.C0843 r12, long r13) throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L24
            long r2 = r12.m4889()
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 > 0) goto L24
        L13:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L23
            java.nio.channels.FileChannel r3 = r9.f7727
            r4 = r12
            r5 = r10
            r7 = r13
            long r2 = r3.transferFrom(r4, r5, r7)
            long r10 = r10 + r2
            long r13 = r13 - r2
            goto L13
        L23:
            return
        L24:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            r10.<init>()
            throw r10
    }
}
