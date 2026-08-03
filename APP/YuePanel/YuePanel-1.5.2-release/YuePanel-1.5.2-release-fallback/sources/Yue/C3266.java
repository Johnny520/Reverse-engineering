package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n1#2:240\n86#3:241\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n*L\n92#1:241\n*E\n"})
public class C3266 implements Yue.InterfaceC5839 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.io.InputStream f10678;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C6250 f10679;

    public C3266(@Yue.InterfaceC4418 java.io.InputStream r2, @Yue.InterfaceC4418 Yue.C6250 r3) {
            r1 = this;
            java.lang.String r0 = "input"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "timeout"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f10678 = r2
            r1.f10679 = r3
            return
    }

    @Override // Yue.InterfaceC5839, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.InputStream r0 = r1.f10678
            r0.close()
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "source("
            r0.append(r1)
            java.io.InputStream r1 = r2.f10678
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC5839
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.C6250 mo4177() {
            r1 = this;
            Yue.ۥۢۡۤۧ r0 = r1.f10679
            return r0
    }

    @Override // Yue.InterfaceC5839
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r4, long r5) {
            r3 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r4, r0)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            return r0
        Lc:
            if (r2 < 0) goto L60
            Yue.ۥۢۡۤۧ r0 = r3.f10679     // Catch: java.lang.AssertionError -> L3f
            r0.mo12062()     // Catch: java.lang.AssertionError -> L3f
            r0 = 1
            Yue.ۥۡۧۨ r0 = r4.m4892(r0)     // Catch: java.lang.AssertionError -> L3f
            int r1 = r0.f20492     // Catch: java.lang.AssertionError -> L3f
            int r1 = 8192 - r1
            long r1 = (long) r1     // Catch: java.lang.AssertionError -> L3f
            long r5 = java.lang.Math.min(r5, r1)     // Catch: java.lang.AssertionError -> L3f
            int r5 = (int) r5     // Catch: java.lang.AssertionError -> L3f
            java.io.InputStream r6 = r3.f10678     // Catch: java.lang.AssertionError -> L3f
            byte[] r1 = r0.f20490     // Catch: java.lang.AssertionError -> L3f
            int r2 = r0.f20492     // Catch: java.lang.AssertionError -> L3f
            int r5 = r6.read(r1, r2, r5)     // Catch: java.lang.AssertionError -> L3f
            r6 = -1
            if (r5 != r6) goto L44
            int r5 = r0.f20491     // Catch: java.lang.AssertionError -> L3f
            int r6 = r0.f20492     // Catch: java.lang.AssertionError -> L3f
            if (r5 != r6) goto L41
            Yue.ۥۡۧۨ r5 = r0.m20804()     // Catch: java.lang.AssertionError -> L3f
            r4.f2378 = r5     // Catch: java.lang.AssertionError -> L3f
            Yue.C5550.m20825(r0)     // Catch: java.lang.AssertionError -> L3f
            goto L41
        L3f:
            r4 = move-exception
            goto L53
        L41:
            r4 = -1
            return r4
        L44:
            int r6 = r0.f20492     // Catch: java.lang.AssertionError -> L3f
            int r6 = r6 + r5
            r0.f20492 = r6     // Catch: java.lang.AssertionError -> L3f
            long r0 = r4.m4889()     // Catch: java.lang.AssertionError -> L3f
            long r5 = (long) r5     // Catch: java.lang.AssertionError -> L3f
            long r0 = r0 + r5
            r4.m4885(r0)     // Catch: java.lang.AssertionError -> L3f
            return r5
        L53:
            boolean r5 = Yue.C4603.m18387(r4)
            if (r5 == 0) goto L5f
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r4)
            throw r5
        L5f:
            throw r4
        L60:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }
}
