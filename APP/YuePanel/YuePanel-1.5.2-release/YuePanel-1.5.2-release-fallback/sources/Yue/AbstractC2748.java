package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1620#2,3:244\n1620#2,3:247\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n166#1:244,3\n174#1:247,3\n*E\n"})
public abstract class AbstractC2748 extends Yue.AbstractC2370 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.AbstractC2370 f9028;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۧ$ۥ, reason: contains not printable characters */
    public static final class C2749 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<Yue.C4701, Yue.C4701> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC2748 f9029;

        public C2749(Yue.AbstractC2748 r1) {
                r0 = this;
                r0.f9029 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C4701 invoke(Yue.C4701 r1) {
                r0 = this;
                Yue.ۥۣۡۧۧ r1 = (Yue.C4701) r1
                Yue.ۥۣۡۧۧ r1 = r0.m12044(r1)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C4701 m12044(@Yue.InterfaceC4418 Yue.C4701 r3) {
                r2 = this;
                java.lang.String r0 = "it"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥ۠ۢۦۧ r0 = r2.f9029
                java.lang.String r1 = "listRecursively"
                Yue.ۥۣۡۧۧ r3 = r0.m12043(r3, r1)
                return r3
        }
    }

    public AbstractC2748(@Yue.InterfaceC4418 Yue.AbstractC2370 r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f9028 = r2
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            Yue.ۥ۠ۦۢۢ r1 = Yue.C5277.m19888(r1)
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            Yue.ۥ۠ۡۨۤ r1 = r2.f9028
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Yue.InterfaceC5794 mo10919(@Yue.InterfaceC4418 Yue.C4701 r3, boolean r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r1 = "appendingSink"
            Yue.ۥۣۡۧۧ r3 = r2.m12042(r3, r1, r0)
            Yue.ۥ۠ۡۨۤ r0 = r2.f9028
            Yue.ۥۣۢ۟ۡ r3 = r0.mo10919(r3, r4)
            return r3
    }

    @Override // Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo10920(@Yue.InterfaceC4418 Yue.C4701 r4, @Yue.InterfaceC4418 Yue.C4701 r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r1 = "target"
            Yue.C3329.m13906(r5, r1)
            java.lang.String r2 = "atomicMove"
            Yue.ۥۣۡۧۧ r4 = r3.m12042(r4, r2, r0)
            Yue.ۥۣۡۧۧ r5 = r3.m12042(r5, r2, r1)
            Yue.ۥ۠ۡۨۤ r0 = r3.f9028
            r0.mo10920(r4, r5)
            return
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public Yue.C4701 mo10921(@Yue.InterfaceC4418 Yue.C4701 r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r1 = "canonicalize"
            Yue.ۥۣۡۧۧ r3 = r2.m12042(r3, r1, r0)
            Yue.ۥ۠ۡۨۤ r0 = r2.f9028
            Yue.ۥۣۡۧۧ r3 = r0.mo10921(r3)
            Yue.ۥۣۡۧۧ r3 = r2.m12043(r3, r1)
            return r3
    }

    @Override // Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo10926(@Yue.InterfaceC4418 Yue.C4701 r3, boolean r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r1 = "createDirectory"
            Yue.ۥۣۡۧۧ r3 = r2.m12042(r3, r1, r0)
            Yue.ۥ۠ۡۨۤ r0 = r2.f9028
            r0.mo10926(r3, r4)
            return
    }

    @Override // Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo10927(@Yue.InterfaceC4418 Yue.C4701 r4, @Yue.InterfaceC4418 Yue.C4701 r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r1 = "target"
            Yue.C3329.m13906(r5, r1)
            java.lang.String r2 = "createSymlink"
            Yue.ۥۣۡۧۧ r4 = r3.m12042(r4, r2, r0)
            Yue.ۥۣۡۧۧ r5 = r3.m12042(r5, r2, r1)
            Yue.ۥ۠ۡۨۤ r0 = r3.f9028
            r0.mo10927(r4, r5)
            return
    }

    @Override // Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo10929(@Yue.InterfaceC4418 Yue.C4701 r3, boolean r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r1 = "delete"
            Yue.ۥۣۡۧۧ r3 = r2.m12042(r3, r1, r0)
            Yue.ۥ۠ۡۨۤ r0 = r2.f9028
            r0.mo10929(r3, r4)
            return
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public java.util.List<Yue.C4701> mo10933(@Yue.InterfaceC4418 Yue.C4701 r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r1 = "list"
            Yue.ۥۣۡۧۧ r4 = r3.m12042(r4, r1, r0)
            Yue.ۥ۠ۡۨۤ r0 = r3.f9028
            java.util.List r4 = r0.mo10933(r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1a:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r4.next()
            Yue.ۥۣۡۧۧ r2 = (Yue.C4701) r2
            Yue.ۥۣۡۧۧ r2 = r3.m12043(r2, r1)
            r0.add(r2)
            goto L1a
        L2e:
            Yue.C1215.m6242(r0)
            return r0
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public java.util.List<Yue.C4701> mo10934(@Yue.InterfaceC4418 Yue.C4701 r4) {
            r3 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r1 = "listOrNull"
            Yue.ۥۣۡۧۧ r4 = r3.m12042(r4, r1, r0)
            Yue.ۥ۠ۡۨۤ r0 = r3.f9028
            java.util.List r4 = r0.mo10934(r4)
            if (r4 != 0) goto L15
            r4 = 0
            return r4
        L15:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1e:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r4.next()
            Yue.ۥۣۡۧۧ r2 = (Yue.C4701) r2
            Yue.ۥۣۡۧۧ r2 = r3.m12043(r2, r1)
            r0.add(r2)
            goto L1e
        L32:
            Yue.C1215.m6242(r0)
            return r0
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public Yue.InterfaceC5609<Yue.C4701> mo10936(@Yue.InterfaceC4418 Yue.C4701 r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r1 = "listRecursively"
            Yue.ۥۣۡۧۧ r3 = r2.m12042(r3, r1, r0)
            Yue.ۥ۠ۡۨۤ r0 = r2.f9028
            Yue.ۥۡۨۢ r3 = r0.mo10936(r3, r4)
            Yue.ۥ۠ۢۦۧ$ۥ r4 = new Yue.ۥ۠ۢۦۧ$ۥ
            r4.<init>(r2)
            Yue.ۥۡۨۢ r3 = Yue.C5629.m21101(r3, r4)
            return r3
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public Yue.C2359 mo10938(@Yue.InterfaceC4418 Yue.C4701 r14) throws java.io.IOException {
            r13 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r14, r0)
            java.lang.String r1 = "metadataOrNull"
            Yue.ۥۣۡۧۧ r14 = r13.m12042(r14, r1, r0)
            Yue.ۥ۠ۡۨۤ r0 = r13.f9028
            Yue.ۥ۠ۡۨ r2 = r0.mo10938(r14)
            if (r2 != 0) goto L15
            r14 = 0
            return r14
        L15:
            Yue.ۥۣۡۧۧ r14 = r2.m10863()
            if (r14 != 0) goto L1c
            return r2
        L1c:
            Yue.ۥۣۡۧۧ r14 = r2.m10863()
            Yue.ۥۣۡۧۧ r5 = r13.m12043(r14, r1)
            r11 = 251(0xfb, float:3.52E-43)
            r12 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            Yue.ۥ۠ۡۨ r14 = Yue.C2359.m10855(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public Yue.AbstractC2355 mo10939(@Yue.InterfaceC4418 Yue.C4701 r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r1 = "openReadOnly"
            Yue.ۥۣۡۧۧ r3 = r2.m12042(r3, r1, r0)
            Yue.ۥ۠ۡۨۤ r0 = r2.f9028
            Yue.ۥ۠ۡۧۧ r3 = r0.mo10939(r3)
            return r3
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public Yue.AbstractC2355 mo10941(@Yue.InterfaceC4418 Yue.C4701 r3, boolean r4, boolean r5) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r1 = "openReadWrite"
            Yue.ۥۣۡۧۧ r3 = r2.m12042(r3, r1, r0)
            Yue.ۥ۠ۡۨۤ r0 = r2.f9028
            Yue.ۥ۠ۡۧۧ r3 = r0.mo10941(r3, r4, r5)
            return r3
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public Yue.InterfaceC5794 mo10943(@Yue.InterfaceC4418 Yue.C4701 r3, boolean r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r1 = "sink"
            Yue.ۥۣۡۧۧ r3 = r2.m12042(r3, r1, r0)
            Yue.ۥ۠ۡۨۤ r0 = r2.f9028
            Yue.ۥۣۢ۟ۡ r3 = r0.mo10943(r3, r4)
            return r3
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public Yue.InterfaceC5839 mo10944(@Yue.InterfaceC4418 Yue.C4701 r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r1 = "source"
            Yue.ۥۣۡۧۧ r3 = r2.m12042(r3, r1, r0)
            Yue.ۥ۠ۡۨۤ r0 = r2.f9028
            Yue.ۥۣۢ۟ۦ r3 = r0.mo10944(r3)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "delegate")
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final Yue.AbstractC2370 m12041() {
            r1 = this;
            Yue.ۥ۠ۡۨۤ r0 = r1.f9028
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public Yue.C4701 m12042(@Yue.InterfaceC4418 Yue.C4701 r2, @Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "functionName"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r3 = "parameterName"
            Yue.C3329.m13906(r4, r3)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public Yue.C4701 m12043(@Yue.InterfaceC4418 Yue.C4701 r2, @Yue.InterfaceC4418 java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "functionName"
            Yue.C3329.m13906(r3, r0)
            return r2
    }
}
