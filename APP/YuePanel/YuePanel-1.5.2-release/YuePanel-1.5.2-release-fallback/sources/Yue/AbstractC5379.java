package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n1#1,321:1\n140#1,11:322\n140#1,11:333\n*S KotlinDebug\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n124#1:322,11\n134#1:333,11\n*E\n"})
public abstract class AbstractC5379 implements java.io.Closeable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.AbstractC5379.C5381 f20012 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public java.io.Reader f20013;

    /* JADX INFO: renamed from: Yue.ۥۡۦۧ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody$BomAwareReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
    public static final class C5380 extends java.io.Reader {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.InterfaceC0849 f20014;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.nio.charset.Charset f20015;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f20016;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public java.io.Reader f20017;

        public C5380(@Yue.InterfaceC4418 Yue.InterfaceC0849 r2, @Yue.InterfaceC4418 java.nio.charset.Charset r3) {
                r1 = this;
                java.lang.String r0 = "source"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "charset"
                Yue.C3329.m13906(r3, r0)
                r1.<init>()
                r1.f20014 = r2
                r1.f20015 = r3
                return
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                r0 = 1
                r1.f20016 = r0
                java.io.Reader r0 = r1.f20017
                if (r0 == 0) goto Ld
                r0.close()
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
                goto Le
            Ld:
                r0 = 0
            Le:
                if (r0 != 0) goto L15
                Yue.ۥۣۣ۟۠ r0 = r1.f20014
                r0.close()
            L15:
                return
        }

        @Override // java.io.Reader
        public int read(@Yue.InterfaceC4418 char[] r5, int r6, int r7) throws java.io.IOException {
                r4 = this;
                java.lang.String r0 = "cbuf"
                Yue.C3329.m13906(r5, r0)
                boolean r0 = r4.f20016
                if (r0 != 0) goto L27
                java.io.Reader r0 = r4.f20017
                if (r0 != 0) goto L22
                java.io.InputStreamReader r0 = new java.io.InputStreamReader
                Yue.ۥۣۣ۟۠ r1 = r4.f20014
                java.io.InputStream r1 = r1.mo4812()
                Yue.ۥۣۣ۟۠ r2 = r4.f20014
                java.nio.charset.Charset r3 = r4.f20015
                java.nio.charset.Charset r2 = Yue.C6656.m25598(r2, r3)
                r0.<init>(r1, r2)
                r4.f20017 = r0
            L22:
                int r5 = r0.read(r5, r6, r7)
                return r5
            L27:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r6 = "Stream closed"
                r5.<init>(r6)
                throw r5
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۧ۟$ۥ۟, reason: contains not printable characters */
    public static final class C5381 {

        /* JADX INFO: renamed from: Yue.ۥۡۦۧ۟$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C5382 extends Yue.AbstractC5379 {

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C4116 f20018;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ long f20019;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC0849 f20020;

            public C5382(Yue.C4116 r1, long r2, Yue.InterfaceC0849 r4) {
                    r0 = this;
                    r0.f20018 = r1
                    r0.f20019 = r2
                    r0.f20020 = r4
                    r0.<init>()
                    return
            }

            @Override // Yue.AbstractC5379
            /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
            public long mo5163() {
                    r2 = this;
                    long r0 = r2.f20019
                    return r0
            }

            @Override // Yue.AbstractC5379
            @Yue.InterfaceC4543
            /* JADX INFO: renamed from: ۥ۟۟۠ */
            public Yue.C4116 mo5164() {
                    r1 = this;
                    Yue.ۥۡ۠ۥۨ r0 = r1.f20018
                    return r0
            }

            @Override // Yue.AbstractC5379
            @Yue.InterfaceC4418
            /* JADX INFO: renamed from: ۥ۟۟ۢ */
            public Yue.InterfaceC0849 mo5165() {
                    r1 = this;
                    Yue.ۥۣۣ۟۠ r0 = r1.f20020
                    return r0
            }
        }

        public C5381() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5381(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ Yue.AbstractC5379 m20363(Yue.AbstractC5379.C5381 r0, Yue.InterfaceC0849 r1, Yue.C4116 r2, long r3, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                if (r6 == 0) goto L5
                r2 = 0
            L5:
                r5 = r5 & 2
                if (r5 == 0) goto Lb
                r3 = -1
            Lb:
                Yue.ۥۡۦۧ۟ r0 = r0.m20367(r1, r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static /* synthetic */ Yue.AbstractC5379 m20364(Yue.AbstractC5379.C5381 r0, Yue.C0879 r1, Yue.C4116 r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                Yue.ۥۡۦۧ۟ r0 = r0.m20368(r1, r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static /* synthetic */ Yue.AbstractC5379 m20365(Yue.AbstractC5379.C5381 r0, java.lang.String r1, Yue.C4116 r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                Yue.ۥۡۦۧ۟ r0 = r0.m20373(r1, r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static /* synthetic */ Yue.AbstractC5379 m20366(Yue.AbstractC5379.C5381 r0, byte[] r1, Yue.C4116 r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                Yue.ۥۡۦۧ۟ r0 = r0.m20374(r1, r2)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC3421(name = "create")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.AbstractC5379 m20367(@Yue.InterfaceC4418 Yue.InterfaceC0849 r2, @Yue.InterfaceC4543 Yue.C4116 r3, long r4) {
                r1 = this;
                java.lang.String r0 = "<this>"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥۡۦۧ۟$ۥ۟$ۥ r0 = new Yue.ۥۡۦۧ۟$ۥ۟$ۥ
                r0.<init>(r3, r4, r2)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC3421(name = "create")
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.AbstractC5379 m20368(@Yue.InterfaceC4418 Yue.C0879 r4, @Yue.InterfaceC4543 Yue.C4116 r5) {
                r3 = this;
                java.lang.String r0 = "<this>"
                Yue.C3329.m13906(r4, r0)
                Yue.ۥۣ۟ۢۨ r0 = new Yue.ۥۣ۟ۢۨ
                r0.<init>()
                Yue.ۥۣ۟ۢۨ r0 = r0.m4893(r4)
                int r4 = r4.m5095()
                long r1 = (long) r4
                Yue.ۥۡۦۧ۟ r4 = r3.m20367(r0, r5, r1)
                return r4
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @Yue.InterfaceC5313(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.AbstractC5379 m20369(@Yue.InterfaceC4543 Yue.C4116 r2, long r3, @Yue.InterfaceC4418 Yue.InterfaceC0849 r5) {
                r1 = this;
                java.lang.String r0 = "content"
                Yue.C3329.m13906(r5, r0)
                Yue.ۥۡۦۧ۟ r2 = r1.m20367(r5, r2, r3)
                return r2
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @Yue.InterfaceC5313(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Yue.AbstractC5379 m20370(@Yue.InterfaceC4543 Yue.C4116 r2, @Yue.InterfaceC4418 Yue.C0879 r3) {
                r1 = this;
                java.lang.String r0 = "content"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥۡۦۧ۟ r2 = r1.m20368(r3, r2)
                return r2
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @Yue.InterfaceC5313(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final Yue.AbstractC5379 m20371(@Yue.InterfaceC4543 Yue.C4116 r2, @Yue.InterfaceC4418 java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "content"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥۡۦۧ۟ r2 = r1.m20373(r3, r2)
                return r2
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @Yue.InterfaceC5313(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final Yue.AbstractC5379 m20372(@Yue.InterfaceC4543 Yue.C4116 r2, @Yue.InterfaceC4418 byte[] r3) {
                r1 = this;
                java.lang.String r0 = "content"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥۡۦۧ۟ r2 = r1.m20374(r3, r2)
                return r2
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC3421(name = "create")
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final Yue.AbstractC5379 m20373(@Yue.InterfaceC4418 java.lang.String r4, @Yue.InterfaceC4543 Yue.C4116 r5) {
                r3 = this;
                java.lang.String r0 = "<this>"
                Yue.C3329.m13906(r4, r0)
                java.nio.charset.Charset r0 = Yue.C1099.f3261
                if (r5 == 0) goto L2a
                r1 = 1
                r2 = 0
                java.nio.charset.Charset r1 = Yue.C4116.m16140(r5, r2, r1, r2)
                if (r1 != 0) goto L29
                Yue.ۥۡ۠ۥۨ$ۥ r1 = Yue.C4116.f12664
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r5)
                java.lang.String r5 = "; charset=utf-8"
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                Yue.ۥۡ۠ۥۨ r5 = r1.m16153(r5)
                goto L2a
            L29:
                r0 = r1
            L2a:
                Yue.ۥۣ۟ۢۨ r1 = new Yue.ۥۣ۟ۢۨ
                r1.<init>()
                Yue.ۥۣ۟ۢۨ r4 = r1.m4908(r4, r0)
                long r0 = r4.m4889()
                Yue.ۥۡۦۧ۟ r4 = r3.m20367(r4, r5, r0)
                return r4
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC3421(name = "create")
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final Yue.AbstractC5379 m20374(@Yue.InterfaceC4418 byte[] r4, @Yue.InterfaceC4543 Yue.C4116 r5) {
                r3 = this;
                java.lang.String r0 = "<this>"
                Yue.C3329.m13906(r4, r0)
                Yue.ۥۣ۟ۢۨ r0 = new Yue.ۥۣ۟ۢۨ
                r0.<init>()
                Yue.ۥۣ۟ۢۨ r0 = r0.m4896(r4)
                int r4 = r4.length
                long r1 = (long) r4
                Yue.ۥۡۦۧ۟ r4 = r3.m20367(r0, r5, r1)
                return r4
        }
    }

    static {
            Yue.ۥۡۦۧ۟$ۥ۟ r0 = new Yue.ۥۡۦۧ۟$ۥ۟
            r1 = 0
            r0.<init>(r1)
            Yue.AbstractC5379.f20012 = r0
            return
    }

    public AbstractC5379() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC3421(name = "create")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final Yue.AbstractC5379 m20348(@Yue.InterfaceC4418 Yue.InterfaceC0849 r1, @Yue.InterfaceC4543 Yue.C4116 r2, long r3) {
            Yue.ۥۡۦۧ۟$ۥ۟ r0 = Yue.AbstractC5379.f20012
            Yue.ۥۡۦۧ۟ r1 = r0.m20367(r1, r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC3421(name = "create")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final Yue.AbstractC5379 m20349(@Yue.InterfaceC4418 Yue.C0879 r1, @Yue.InterfaceC4543 Yue.C4116 r2) {
            Yue.ۥۡۦۧ۟$ۥ۟ r0 = Yue.AbstractC5379.f20012
            Yue.ۥۡۦۧ۟ r1 = r0.m20368(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @Yue.InterfaceC5313(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final Yue.AbstractC5379 m20350(@Yue.InterfaceC4543 Yue.C4116 r1, long r2, @Yue.InterfaceC4418 Yue.InterfaceC0849 r4) {
            Yue.ۥۡۦۧ۟$ۥ۟ r0 = Yue.AbstractC5379.f20012
            Yue.ۥۡۦۧ۟ r1 = r0.m20369(r1, r2, r4)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @Yue.InterfaceC5313(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final Yue.AbstractC5379 m20351(@Yue.InterfaceC4543 Yue.C4116 r1, @Yue.InterfaceC4418 Yue.C0879 r2) {
            Yue.ۥۡۦۧ۟$ۥ۟ r0 = Yue.AbstractC5379.f20012
            Yue.ۥۡۦۧ۟ r1 = r0.m20370(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @Yue.InterfaceC5313(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final Yue.AbstractC5379 m20352(@Yue.InterfaceC4543 Yue.C4116 r1, @Yue.InterfaceC4418 java.lang.String r2) {
            Yue.ۥۡۦۧ۟$ۥ۟ r0 = Yue.AbstractC5379.f20012
            Yue.ۥۡۦۧ۟ r1 = r0.m20371(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @Yue.InterfaceC5313(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final Yue.AbstractC5379 m20353(@Yue.InterfaceC4543 Yue.C4116 r1, @Yue.InterfaceC4418 byte[] r2) {
            Yue.ۥۡۦۧ۟$ۥ۟ r0 = Yue.AbstractC5379.f20012
            Yue.ۥۡۦۧ۟ r1 = r0.m20372(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC3421(name = "create")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final Yue.AbstractC5379 m20354(@Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4543 Yue.C4116 r2) {
            Yue.ۥۡۦۧ۟$ۥ۟ r0 = Yue.AbstractC5379.f20012
            Yue.ۥۡۦۧ۟ r1 = r0.m20373(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC3421(name = "create")
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final Yue.AbstractC5379 m20355(@Yue.InterfaceC4418 byte[] r1, @Yue.InterfaceC4543 Yue.C4116 r2) {
            Yue.ۥۡۦۧ۟$ۥ۟ r0 = Yue.AbstractC5379.f20012
            Yue.ۥۡۦۧ۟ r1 = r0.m20374(r1, r2)
            return r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            Yue.ۥۣۣ۟۠ r0 = r1.mo5165()
            Yue.C6656.m25567(r0)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.io.InputStream m20356() {
            r1 = this;
            Yue.ۥۣۣ۟۠ r0 = r1.mo5165()
            java.io.InputStream r0 = r0.mo4812()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C0879 m20357() throws java.io.IOException {
            r6 = this;
            long r0 = r6.mo5163()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L53
            Yue.ۥۣۣ۟۠ r2 = r6.mo5165()
            Yue.ۥۣ۟ۥۤ r3 = r2.mo4853()     // Catch: java.lang.Throwable -> L4c
            r4 = 0
            Yue.C1173.m6114(r2, r4)
            int r2 = r3.m5095()
            r4 = -1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L4b
            long r4 = (long) r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L27
            goto L4b
        L27:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L4b:
            return r3
        L4c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4e
        L4e:
            r1 = move-exception
            Yue.C1173.m6114(r2, r0)
            throw r1
        L53:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final byte[] m20358() throws java.io.IOException {
            r6 = this;
            long r0 = r6.mo5163()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L50
            Yue.ۥۣۣ۟۠ r2 = r6.mo5165()
            byte[] r3 = r2.mo4823()     // Catch: java.lang.Throwable -> L49
            r4 = 0
            Yue.C1173.m6114(r2, r4)
            int r2 = r3.length
            r4 = -1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L48
            long r4 = (long) r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L24
            goto L48
        L24:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L48:
            return r3
        L49:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4b
        L4b:
            r1 = move-exception
            Yue.C1173.m6114(r2, r0)
            throw r1
        L50:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.io.Reader m20359() {
            r3 = this;
            java.io.Reader r0 = r3.f20013
            if (r0 != 0) goto L13
            Yue.ۥۡۦۧ۟$ۥ r0 = new Yue.ۥۡۦۧ۟$ۥ
            Yue.ۥۣۣ۟۠ r1 = r3.mo5165()
            java.nio.charset.Charset r2 = r3.m20360()
            r0.<init>(r1, r2)
            r3.f20013 = r0
        L13:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.nio.charset.Charset m20360() {
            r2 = this;
            Yue.ۥۡ۠ۥۨ r0 = r2.mo5164()
            if (r0 == 0) goto Le
            java.nio.charset.Charset r1 = Yue.C1099.f3261
            java.nio.charset.Charset r0 = r0.m16146(r1)
            if (r0 != 0) goto L10
        Le:
            java.nio.charset.Charset r0 = Yue.C1099.f3261
        L10:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final <T> T m20361(Yue.InterfaceC2825<? super Yue.InterfaceC0849, ? extends T> r6, Yue.InterfaceC2825<? super T, java.lang.Integer> r7) {
            r5 = this;
            long r0 = r5.mo5163()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L66
            Yue.ۥۣۣ۟۠ r2 = r5.mo5165()
            r3 = 1
            java.lang.Object r6 = r6.invoke(r2)     // Catch: java.lang.Throwable -> L59
            Yue.C3249.m13687(r3)
            r4 = 0
            Yue.C1173.m6114(r2, r4)
            Yue.C3249.m13686(r3)
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L58
            long r2 = (long) r7
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L34
            goto L58
        L34:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Content-Length ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") and stream length ("
            r2.append(r0)
            r2.append(r7)
            java.lang.String r7 = ") disagree"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r6.<init>(r7)
            throw r6
        L58:
            return r6
        L59:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L5b
        L5b:
            r7 = move-exception
            Yue.C3249.m13687(r3)
            Yue.C1173.m6114(r2, r6)
            Yue.C3249.m13686(r3)
            throw r7
        L66:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Cannot buffer entire body for content length: "
            r7.append(r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public abstract long mo5163();

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public abstract Yue.C4116 mo5164();

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public abstract Yue.InterfaceC0849 mo5165();

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final java.lang.String m20362() throws java.io.IOException {
            r3 = this;
            Yue.ۥۣۣ۟۠ r0 = r3.mo5165()
            java.nio.charset.Charset r1 = r3.m20360()     // Catch: java.lang.Throwable -> L15
            java.nio.charset.Charset r1 = Yue.C6656.m25598(r0, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r0.mo4847(r1)     // Catch: java.lang.Throwable -> L15
            r2 = 0
            Yue.C1173.m6114(r0, r2)
            return r1
        L15:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            Yue.C1173.m6114(r0, r1)
            throw r2
    }
}
