package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6283 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f22354 = -1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.AbstractC6283.EnumC6293 f22355;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f22356;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f22357;

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ, reason: contains not printable characters */
    public static /* synthetic */ class C6284 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟, reason: contains not printable characters */
    public static final class C6285 extends Yue.AbstractC6283.C6286 {
        public C6285(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.m23419(r1)
                return
        }

        @Override // Yue.AbstractC6283.C6286
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "<![CDATA["
                r0.append(r1)
                java.lang.String r1 = r2.m23420()
                r0.append(r1)
                java.lang.String r1 = "]]>"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟۟, reason: contains not printable characters */
    public static class C6286 extends Yue.AbstractC6283 implements java.lang.Cloneable {

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public java.lang.String f22358;

        public C6286() {
                r2 = this;
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = Yue.AbstractC6283.EnumC6293.f22390
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                Yue.ۥۢۡۧ۠$ۥ۟۟ r0 = r1.m23418()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.m23420()
                return r0
        }

        @Override // Yue.AbstractC6283
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public Yue.AbstractC6283 mo23414() {
                r1 = this;
                super.mo23414()
                r0 = 0
                r1.f22358 = r0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public Yue.AbstractC6283.C6286 m23418() {
                r2 = this;
                java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
                Yue.ۥۢۡۧ۠$ۥ۟۟ r0 = (Yue.AbstractC6283.C6286) r0     // Catch: java.lang.CloneNotSupportedException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public Yue.AbstractC6283.C6286 m23419(java.lang.String r1) {
                r0 = this;
                r0.f22358 = r1
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public java.lang.String m23420() {
                r1 = this;
                java.lang.String r0 = r1.f22358
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C6287 extends Yue.AbstractC6283 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final java.lang.StringBuilder f22359;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public java.lang.String f22360;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public boolean f22361;

        public C6287() {
                r2 = this;
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = Yue.AbstractC6283.EnumC6293.f22389
                r1 = 0
                r2.<init>(r0, r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r2.f22359 = r0
                r0 = 0
                r2.f22361 = r0
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "<!--"
                r0.append(r1)
                java.lang.String r1 = r2.m23424()
                r0.append(r1)
                java.lang.String r1 = "-->"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.AbstractC6283
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public Yue.AbstractC6283 mo23414() {
                r1 = this;
                super.mo23414()
                java.lang.StringBuilder r0 = r1.f22359
                Yue.AbstractC6283.m23399(r0)
                r0 = 0
                r1.f22360 = r0
                r0 = 0
                r1.f22361 = r0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public Yue.AbstractC6283.C6287 m23421(char r2) {
                r1 = this;
                r1.m23423()
                java.lang.StringBuilder r0 = r1.f22359
                r0.append(r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public Yue.AbstractC6283.C6287 m23422(java.lang.String r2) {
                r1 = this;
                r1.m23423()
                java.lang.StringBuilder r0 = r1.f22359
                int r0 = r0.length()
                if (r0 != 0) goto Le
                r1.f22360 = r2
                goto L13
            Le:
                java.lang.StringBuilder r0 = r1.f22359
                r0.append(r2)
            L13:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final void m23423() {
                r2 = this;
                java.lang.String r0 = r2.f22360
                if (r0 == 0) goto Lc
                java.lang.StringBuilder r1 = r2.f22359
                r1.append(r0)
                r0 = 0
                r2.f22360 = r0
            Lc:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public java.lang.String m23424() {
                r1 = this;
                java.lang.String r0 = r1.f22360
                if (r0 == 0) goto L5
                goto Lb
            L5:
                java.lang.StringBuilder r0 = r1.f22359
                java.lang.String r0 = r0.toString()
            Lb:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C6288 extends Yue.AbstractC6283 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final java.lang.StringBuilder f22362;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public java.lang.String f22363;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final java.lang.StringBuilder f22364;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final java.lang.StringBuilder f22365;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public boolean f22366;

        public C6288() {
                r2 = this;
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = Yue.AbstractC6283.EnumC6293.f22386
                r1 = 0
                r2.<init>(r0, r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r2.f22362 = r0
                r2.f22363 = r1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r2.f22364 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r2.f22365 = r0
                r0 = 0
                r2.f22366 = r0
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "<!doctype "
                r0.append(r1)
                java.lang.String r1 = r2.m23425()
                r0.append(r1)
                java.lang.String r1 = ">"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.AbstractC6283
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public Yue.AbstractC6283 mo23414() {
                r1 = this;
                super.mo23414()
                java.lang.StringBuilder r0 = r1.f22362
                Yue.AbstractC6283.m23399(r0)
                r0 = 0
                r1.f22363 = r0
                java.lang.StringBuilder r0 = r1.f22364
                Yue.AbstractC6283.m23399(r0)
                java.lang.StringBuilder r0 = r1.f22365
                Yue.AbstractC6283.m23399(r0)
                r0 = 0
                r1.f22366 = r0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public java.lang.String m23425() {
                r1 = this;
                java.lang.StringBuilder r0 = r1.f22362
                java.lang.String r0 = r0.toString()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public java.lang.String m23426() {
                r1 = this;
                java.lang.String r0 = r1.f22363
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public java.lang.String m23427() {
                r1 = this;
                java.lang.StringBuilder r0 = r1.f22364
                java.lang.String r0 = r0.toString()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public java.lang.String m23428() {
                r1 = this;
                java.lang.StringBuilder r0 = r1.f22365
                java.lang.String r0 = r0.toString()
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public boolean m23429() {
                r1 = this;
                boolean r0 = r1.f22366
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C6289 extends Yue.AbstractC6283 {
        public C6289() {
                r2 = this;
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = Yue.AbstractC6283.EnumC6293.f22391
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = ""
                return r0
        }

        @Override // Yue.AbstractC6283
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public Yue.AbstractC6283 mo23414() {
                r0 = this;
                super.mo23414()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C6290 extends Yue.AbstractC6283.AbstractC6292 {
        public C6290(Yue.AbstractC6451 r2) {
                r1 = this;
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = Yue.AbstractC6283.EnumC6293.f22388
                r1.<init>(r0, r2)
                return
        }

        @Override // Yue.AbstractC6283.AbstractC6292
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "</"
                r0.append(r1)
                java.lang.String r1 = r2.m23452()
                r0.append(r1)
                java.lang.String r1 = ">"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C6291 extends Yue.AbstractC6283.AbstractC6292 {
        public C6291(Yue.AbstractC6451 r2) {
                r1 = this;
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = Yue.AbstractC6283.EnumC6293.f22387
                r1.<init>(r0, r2)
                return
        }

        @Override // Yue.AbstractC6283.AbstractC6292
        public java.lang.String toString() {
                r3 = this;
                boolean r0 = r3.m23445()
                if (r0 == 0) goto L9
                java.lang.String r0 = "/>"
                goto Lb
            L9:
                java.lang.String r0 = ">"
            Lb:
                boolean r1 = r3.m23444()
                java.lang.String r2 = "<"
                if (r1 == 0) goto L40
                Yue.ۥ۟ۢ۠ۤ r1 = r3.f22372
                int r1 = r1.size()
                if (r1 <= 0) goto L40
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = r3.m23452()
                r1.append(r2)
                java.lang.String r2 = " "
                r1.append(r2)
                Yue.ۥ۟ۢ۠ۤ r2 = r3.f22372
                java.lang.String r2 = r2.toString()
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L40:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = r3.m23452()
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }

        @Override // Yue.AbstractC6283.AbstractC6292, Yue.AbstractC6283
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public /* bridge */ /* synthetic */ Yue.AbstractC6283 mo23414() {
                r1 = this;
                Yue.ۥۢۡۧ۠$ۥۣ۟۟۟ r0 = r1.mo23430()
                return r0
        }

        @Override // Yue.AbstractC6283.AbstractC6292
        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
        public Yue.AbstractC6283.AbstractC6292 mo23430() {
                r1 = this;
                super.mo23430()
                r0 = 0
                r1.f22372 = r0
                return r1
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Yue.AbstractC6283.C6291 m23431(java.lang.String r1, Yue.C0648 r2) {
                r0 = this;
                r0.f22369 = r1
                r0.f22372 = r2
                java.lang.String r1 = Yue.C4699.m18611(r1)
                r0.f22370 = r1
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥۣ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC6292 extends Yue.AbstractC6283 {

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public static final int f22367 = 512;

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public static final /* synthetic */ boolean f22368 = false;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public java.lang.String f22369;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public java.lang.String f22370;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public boolean f22371;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public Yue.C0648 f22372;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public java.lang.String f22373;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final java.lang.StringBuilder f22374;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public boolean f22375;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public java.lang.String f22376;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public final java.lang.StringBuilder f22377;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public boolean f22378;

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public boolean f22379;

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public final Yue.AbstractC6451 f22380;

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public final boolean f22381;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public int f22382;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public int f22383;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public int f22384;

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public int f22385;

        static {
                return
        }

        public AbstractC6292(Yue.AbstractC6283.EnumC6293 r2, Yue.AbstractC6451 r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                r2 = 0
                r1.f22371 = r2
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1.f22374 = r0
                r1.f22375 = r2
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1.f22377 = r0
                r1.f22378 = r2
                r1.f22379 = r2
                r1.f22380 = r3
                boolean r2 = r3.f22734
                r1.f22381 = r2
                return
        }

        public abstract java.lang.String toString();

        @Override // Yue.AbstractC6283
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public /* bridge */ /* synthetic */ Yue.AbstractC6283 mo23414() {
                r1 = this;
                Yue.ۥۢۡۧ۠$ۥۣ۟۟۟ r0 = r1.mo23430()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final void m23432(char r1, int r2, int r3) {
                r0 = this;
                r0.m23439(r2, r3)
                java.lang.StringBuilder r2 = r0.f22374
                r2.append(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final void m23433(java.lang.String r3, int r4, int r5) {
                r2 = this;
                r0 = 0
                r1 = 65533(0xfffd, float:9.1831E-41)
                java.lang.String r3 = r3.replace(r0, r1)
                r2.m23439(r4, r5)
                java.lang.StringBuilder r4 = r2.f22374
                int r4 = r4.length()
                if (r4 != 0) goto L16
                r2.f22373 = r3
                goto L1b
            L16:
                java.lang.StringBuilder r4 = r2.f22374
                r4.append(r3)
            L1b:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final void m23434(char r1, int r2, int r3) {
                r0 = this;
                r0.m23440(r2, r3)
                java.lang.StringBuilder r2 = r0.f22377
                r2.append(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public final void m23435(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.m23440(r2, r3)
                java.lang.StringBuilder r2 = r0.f22377
                int r2 = r2.length()
                if (r2 != 0) goto Le
                r0.f22376 = r1
                goto L13
            Le:
                java.lang.StringBuilder r2 = r0.f22377
                r2.append(r1)
            L13:
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public final void m23436(int[] r3, int r4, int r5) {
                r2 = this;
                r2.m23440(r4, r5)
                int r4 = r3.length
                r5 = 0
            L5:
                if (r5 >= r4) goto L11
                r0 = r3[r5]
                java.lang.StringBuilder r1 = r2.f22377
                r1.appendCodePoint(r0)
                int r5 = r5 + 1
                goto L5
            L11:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public final void m23437(char r1) {
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.m23438(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public final void m23438(java.lang.String r3) {
                r2 = this;
                r0 = 0
                r1 = 65533(0xfffd, float:9.1831E-41)
                java.lang.String r3 = r3.replace(r0, r1)
                java.lang.String r0 = r2.f22369
                if (r0 != 0) goto Ld
                goto L11
            Ld:
                java.lang.String r3 = r0.concat(r3)
            L11:
                r2.f22369 = r3
                java.lang.String r3 = Yue.C4699.m18611(r3)
                r2.f22370 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public final void m23439(int r3, int r4) {
                r2 = this;
                r0 = 1
                r2.f22375 = r0
                java.lang.String r0 = r2.f22373
                if (r0 == 0) goto Lf
                java.lang.StringBuilder r1 = r2.f22374
                r1.append(r0)
                r0 = 0
                r2.f22373 = r0
            Lf:
                boolean r0 = r2.f22381
                if (r0 == 0) goto L1d
                int r0 = r2.f22382
                r1 = -1
                if (r0 <= r1) goto L19
                r3 = r0
            L19:
                r2.f22382 = r3
                r2.f22383 = r4
            L1d:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public final void m23440(int r3, int r4) {
                r2 = this;
                r0 = 1
                r2.f22378 = r0
                java.lang.String r0 = r2.f22376
                if (r0 == 0) goto Lf
                java.lang.StringBuilder r1 = r2.f22377
                r1.append(r0)
                r0 = 0
                r2.f22376 = r0
            Lf:
                boolean r0 = r2.f22381
                if (r0 == 0) goto L1d
                int r0 = r2.f22384
                r1 = -1
                if (r0 <= r1) goto L19
                r3 = r0
            L19:
                r2.f22384 = r3
                r2.f22385 = r4
            L1d:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public final void m23441() {
                r1 = this;
                boolean r0 = r1.f22375
                if (r0 == 0) goto L7
                r1.m23448()
            L7:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public final boolean m23442(java.lang.String r2) {
                r1 = this;
                Yue.ۥ۟ۢ۠ۤ r0 = r1.f22372
                if (r0 == 0) goto Lc
                boolean r2 = r0.m4286(r2)
                if (r2 == 0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public final boolean m23443(java.lang.String r2) {
                r1 = this;
                Yue.ۥ۟ۢ۠ۤ r0 = r1.f22372
                if (r0 == 0) goto Lc
                boolean r2 = r0.m4287(r2)
                if (r2 == 0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public final boolean m23444() {
                r1 = this;
                Yue.ۥ۟ۢ۠ۤ r0 = r1.f22372
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public final boolean m23445() {
                r1 = this;
                boolean r0 = r1.f22371
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public final Yue.AbstractC6283.AbstractC6292 m23446(java.lang.String r1) {
                r0 = this;
                r0.f22369 = r1
                java.lang.String r1 = Yue.C4699.m18611(r1)
                r0.f22370 = r1
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public final java.lang.String m23447() {
                r1 = this;
                java.lang.String r0 = r1.f22369
                if (r0 == 0) goto Ld
                int r0 = r0.length()
                if (r0 != 0) goto Lb
                goto Ld
            Lb:
                r0 = 0
                goto Le
            Ld:
                r0 = 1
            Le:
                Yue.C6657.m25626(r0)
                java.lang.String r0 = r1.f22369
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public final void m23448() {
                r3 = this;
                Yue.ۥ۟ۢ۠ۤ r0 = r3.f22372
                if (r0 != 0) goto Lb
                Yue.ۥ۟ۢ۠ۤ r0 = new Yue.ۥ۟ۢ۠ۤ
                r0.<init>()
                r3.f22372 = r0
            Lb:
                boolean r0 = r3.f22375
                if (r0 == 0) goto L5a
                Yue.ۥ۟ۢ۠ۤ r0 = r3.f22372
                int r0 = r0.size()
                r1 = 512(0x200, float:7.17E-43)
                if (r0 >= r1) goto L5a
                java.lang.StringBuilder r0 = r3.f22374
                int r0 = r0.length()
                if (r0 <= 0) goto L28
                java.lang.StringBuilder r0 = r3.f22374
                java.lang.String r0 = r0.toString()
                goto L2a
            L28:
                java.lang.String r0 = r3.f22373
            L2a:
                java.lang.String r0 = r0.trim()
                int r1 = r0.length()
                if (r1 <= 0) goto L5a
                boolean r1 = r3.f22378
                if (r1 == 0) goto L4a
                java.lang.StringBuilder r1 = r3.f22377
                int r1 = r1.length()
                if (r1 <= 0) goto L47
                java.lang.StringBuilder r1 = r3.f22377
                java.lang.String r1 = r1.toString()
                goto L52
            L47:
                java.lang.String r1 = r3.f22376
                goto L52
            L4a:
                boolean r1 = r3.f22379
                if (r1 == 0) goto L51
                java.lang.String r1 = ""
                goto L52
            L51:
                r1 = 0
            L52:
                Yue.ۥ۟ۢ۠ۤ r2 = r3.f22372
                r2.m4272(r0, r1)
                r3.m23453(r0)
            L5a:
                r3.m23450()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        public final java.lang.String m23449() {
                r1 = this;
                java.lang.String r0 = r1.f22370
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
        public Yue.AbstractC6283.AbstractC6292 mo23430() {
                r2 = this;
                super.mo23414()
                r0 = 0
                r2.f22369 = r0
                r2.f22370 = r0
                r1 = 0
                r2.f22371 = r1
                r2.f22372 = r0
                r2.m23450()
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        public final void m23450() {
                r3 = this;
                java.lang.StringBuilder r0 = r3.f22374
                Yue.AbstractC6283.m23399(r0)
                r0 = 0
                r3.f22373 = r0
                r1 = 0
                r3.f22375 = r1
                java.lang.StringBuilder r2 = r3.f22377
                Yue.AbstractC6283.m23399(r2)
                r3.f22376 = r0
                r3.f22379 = r1
                r3.f22378 = r1
                boolean r0 = r3.f22381
                if (r0 == 0) goto L23
                r0 = -1
                r3.f22385 = r0
                r3.f22384 = r0
                r3.f22383 = r0
                r3.f22382 = r0
            L23:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
        public final void m23451() {
                r1 = this;
                r0 = 1
                r1.f22379 = r0
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
        public final java.lang.String m23452() {
                r1 = this;
                java.lang.String r0 = r1.f22369
                if (r0 == 0) goto L5
                goto L7
            L5:
                java.lang.String r0 = "[unset]"
            L7:
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m23453(java.lang.String r11) {
                r10 = this;
                boolean r0 = r10.f22381
                if (r0 == 0) goto L9b
                boolean r0 = r10.m23413()
                if (r0 == 0) goto L9b
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۢ r0 = r10.m23404()
                Yue.ۥۢۢۡۧ r0 = r0.f22380
                Yue.ۥۣ۟ۤۤ r1 = r0.f22724
                Yue.ۥۣۡۧۥ r0 = r0.f22730
                boolean r0 = r0.m18615()
                Yue.ۥ۟ۢ۠ۤ r2 = r10.f22372
                java.lang.String r3 = "jsoup.attrs"
                java.lang.Object r2 = r2.m4302(r3)
                java.util.Map r2 = (java.util.Map) r2
                if (r2 != 0) goto L2e
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                Yue.ۥ۟ۢ۠ۤ r4 = r10.f22372
                r4.m4301(r3, r2)
            L2e:
                if (r0 != 0) goto L34
                java.lang.String r11 = Yue.C4415.m17326(r11)
            L34:
                boolean r0 = r2.containsKey(r11)
                if (r0 == 0) goto L3b
                return
            L3b:
                boolean r0 = r10.f22378
                if (r0 != 0) goto L45
                int r0 = r10.f22383
                r10.f22385 = r0
                r10.f22384 = r0
            L45:
                Yue.ۥۡۥۨۦ$ۥ r0 = new Yue.ۥۡۥۨۦ$ۥ
                Yue.ۥۡۥۨۦ r3 = new Yue.ۥۡۥۨۦ
                Yue.ۥۡۥۨۦ$ۥ۟ r4 = new Yue.ۥۡۥۨۦ$ۥ۟
                int r5 = r10.f22382
                int r6 = r1.m5810(r5)
                int r7 = r10.f22382
                int r7 = r1.m5788(r7)
                r4.<init>(r5, r6, r7)
                Yue.ۥۡۥۨۦ$ۥ۟ r5 = new Yue.ۥۡۥۨۦ$ۥ۟
                int r6 = r10.f22383
                int r7 = r1.m5810(r6)
                int r8 = r10.f22383
                int r8 = r1.m5788(r8)
                r5.<init>(r6, r7, r8)
                r3.<init>(r4, r5)
                Yue.ۥۡۥۨۦ r4 = new Yue.ۥۡۥۨۦ
                Yue.ۥۡۥۨۦ$ۥ۟ r5 = new Yue.ۥۡۥۨۦ$ۥ۟
                int r6 = r10.f22384
                int r7 = r1.m5810(r6)
                int r8 = r10.f22384
                int r8 = r1.m5788(r8)
                r5.<init>(r6, r7, r8)
                Yue.ۥۡۥۨۦ$ۥ۟ r6 = new Yue.ۥۡۥۨۦ$ۥ۟
                int r7 = r10.f22385
                int r8 = r1.m5810(r7)
                int r9 = r10.f22385
                int r1 = r1.m5788(r9)
                r6.<init>(r7, r8, r1)
                r4.<init>(r5, r6)
                r0.<init>(r3, r4)
                r2.put(r11, r0)
            L9b:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public enum EnumC6293 extends java.lang.Enum<Yue.AbstractC6283.EnumC6293> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.AbstractC6283.EnumC6293 f22386 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final Yue.AbstractC6283.EnumC6293 f22387 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final Yue.AbstractC6283.EnumC6293 f22388 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final Yue.AbstractC6283.EnumC6293 f22389 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static final Yue.AbstractC6283.EnumC6293 f22390 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static final Yue.AbstractC6283.EnumC6293 f22391 = null;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static final /* synthetic */ Yue.AbstractC6283.EnumC6293[] f22392 = null;

        static {
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = new Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ
                java.lang.String r1 = "Doctype"
                r2 = 0
                r0.<init>(r1, r2)
                Yue.AbstractC6283.EnumC6293.f22386 = r0
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = new Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ
                java.lang.String r1 = "StartTag"
                r2 = 1
                r0.<init>(r1, r2)
                Yue.AbstractC6283.EnumC6293.f22387 = r0
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = new Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ
                java.lang.String r1 = "EndTag"
                r2 = 2
                r0.<init>(r1, r2)
                Yue.AbstractC6283.EnumC6293.f22388 = r0
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = new Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ
                java.lang.String r1 = "Comment"
                r2 = 3
                r0.<init>(r1, r2)
                Yue.AbstractC6283.EnumC6293.f22389 = r0
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = new Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ
                java.lang.String r1 = "Character"
                r2 = 4
                r0.<init>(r1, r2)
                Yue.AbstractC6283.EnumC6293.f22390 = r0
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = new Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ
                java.lang.String r1 = "EOF"
                r2 = 5
                r0.<init>(r1, r2)
                Yue.AbstractC6283.EnumC6293.f22391 = r0
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ[] r0 = m23454()
                Yue.AbstractC6283.EnumC6293.f22392 = r0
                return
        }

        EnumC6293(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static Yue.AbstractC6283.EnumC6293 valueOf(java.lang.String r1) {
                java.lang.Class<Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ> r0 = Yue.AbstractC6283.EnumC6293.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r1 = (Yue.AbstractC6283.EnumC6293) r1
                return r1
        }

        public static Yue.AbstractC6283.EnumC6293[] values() {
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ[] r0 = Yue.AbstractC6283.EnumC6293.f22392
                java.lang.Object r0 = r0.clone()
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ[] r0 = (Yue.AbstractC6283.EnumC6293[]) r0
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ Yue.AbstractC6283.EnumC6293[] m23454() {
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = Yue.AbstractC6283.EnumC6293.f22386
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r1 = Yue.AbstractC6283.EnumC6293.f22387
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r2 = Yue.AbstractC6283.EnumC6293.f22388
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r3 = Yue.AbstractC6283.EnumC6293.f22389
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r4 = Yue.AbstractC6283.EnumC6293.f22390
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r5 = Yue.AbstractC6283.EnumC6293.f22391
                Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ[] r0 = new Yue.AbstractC6283.EnumC6293[]{r0, r1, r2, r3, r4, r5}
                return r0
        }
    }

    public AbstractC6283(Yue.AbstractC6283.EnumC6293 r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f22357 = r0
            r1.f22355 = r2
            return
    }

    public /* synthetic */ AbstractC6283(Yue.AbstractC6283.EnumC6293 r1, Yue.AbstractC6283.C6284 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m23399(java.lang.StringBuilder r2) {
            if (r2 == 0) goto La
            r0 = 0
            int r1 = r2.length()
            r2.delete(r0, r1)
        La:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.AbstractC6283.C6286 m23400() {
            r1 = this;
            r0 = r1
            Yue.ۥۢۡۧ۠$ۥ۟۟ r0 = (Yue.AbstractC6283.C6286) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.AbstractC6283.C6287 m23401() {
            r1 = this;
            r0 = r1
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ r0 = (Yue.AbstractC6283.C6287) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Yue.AbstractC6283.C6288 m23402() {
            r1 = this;
            r0 = r1
            Yue.ۥۢۡۧ۠$ۥ۟۟۟۟ r0 = (Yue.AbstractC6283.C6288) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Yue.AbstractC6283.C6290 m23403() {
            r1 = this;
            r0 = r1
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ۡ r0 = (Yue.AbstractC6283.C6290) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Yue.AbstractC6283.C6291 m23404() {
            r1 = this;
            r0 = r1
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ۢ r0 = (Yue.AbstractC6283.C6291) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m23405() {
            r1 = this;
            int r0 = r1.f22357
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m23406(int r1) {
            r0 = this;
            r0.f22357 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m23407() {
            r1 = this;
            boolean r0 = r1 instanceof Yue.AbstractC6283.C6285
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m23408() {
            r2 = this;
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = r2.f22355
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r1 = Yue.AbstractC6283.EnumC6293.f22390
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m23409() {
            r2 = this;
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = r2.f22355
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r1 = Yue.AbstractC6283.EnumC6293.f22389
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m23410() {
            r2 = this;
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = r2.f22355
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r1 = Yue.AbstractC6283.EnumC6293.f22386
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final boolean m23411() {
            r2 = this;
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = r2.f22355
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r1 = Yue.AbstractC6283.EnumC6293.f22391
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final boolean m23412() {
            r2 = this;
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = r2.f22355
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r1 = Yue.AbstractC6283.EnumC6293.f22388
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m23413() {
            r2 = this;
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r0 = r2.f22355
            Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ r1 = Yue.AbstractC6283.EnumC6293.f22387
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public Yue.AbstractC6283 mo23414() {
            r1 = this;
            r0 = -1
            r1.f22356 = r0
            r1.f22357 = r0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int m23415() {
            r1 = this;
            int r0 = r1.f22356
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m23416(int r1) {
            r0 = this;
            r0.f22356 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public java.lang.String m23417() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }
}
