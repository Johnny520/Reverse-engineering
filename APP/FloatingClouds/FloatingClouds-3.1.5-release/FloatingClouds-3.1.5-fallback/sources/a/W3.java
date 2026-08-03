package a;

/* JADX INFO: loaded from: classes.dex */
public final class W3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.W3.e f314a;

    public static final class a implements a.W3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.ContentInfo.Builder f315a;

        public a(android.content.ClipData r1, int r2) {
                r0 = this;
                r0.<init>()
                android.view.ContentInfo$Builder r1 = a.C0382t2.e(r1, r2)
                r0.f315a = r1
                return
        }

        @Override // a.W3.b
        public final a.W3 a() {
                r3 = this;
                a.W3 r0 = new a.W3
                a.W3$d r1 = new a.W3$d
                android.view.ContentInfo$Builder r2 = r3.f315a
                android.view.ContentInfo r2 = a.C0382t2.f(r2)
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        @Override // a.W3.b
        public final void b(android.net.Uri r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.f315a
                a.C0382t2.j(r0, r2)
                return
        }

        @Override // a.W3.b
        public final void c(int r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.f315a
                a.C0382t2.i(r0, r2)
                return
        }

        @Override // a.W3.b
        public final void setExtras(android.os.Bundle r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.f315a
                a.C0382t2.k(r0, r2)
                return
        }
    }

    public interface b {
        a.W3 a();

        void b(android.net.Uri r1);

        void c(int r1);

        void setExtras(android.os.Bundle r1);
    }

    public static final class c implements a.W3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.content.ClipData f316a;
        public int b;
        public int c;
        public android.net.Uri d;
        public android.os.Bundle e;

        @Override // a.W3.b
        public final a.W3 a() {
                r2 = this;
                a.W3 r0 = new a.W3
                a.W3$f r1 = new a.W3$f
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        @Override // a.W3.b
        public final void b(android.net.Uri r1) {
                r0 = this;
                r0.d = r1
                return
        }

        @Override // a.W3.b
        public final void c(int r1) {
                r0 = this;
                r0.c = r1
                return
        }

        @Override // a.W3.b
        public final void setExtras(android.os.Bundle r1) {
                r0 = this;
                r0.e = r1
                return
        }
    }

    public static final class d implements a.W3.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.ContentInfo f317a;

        public d(android.view.ContentInfo r1) {
                r0 = this;
                r0.<init>()
                r1.getClass()
                android.view.ContentInfo r1 = a.C0382t2.g(r1)
                r0.f317a = r1
                return
        }

        @Override // a.W3.e
        public final android.content.ClipData a() {
                r1 = this;
                android.view.ContentInfo r0 = r1.f317a
                android.content.ClipData r0 = a.C0382t2.d(r0)
                return r0
        }

        @Override // a.W3.e
        public final int b() {
                r1 = this;
                android.view.ContentInfo r0 = r1.f317a
                int r0 = a.C0382t2.b(r0)
                return r0
        }

        @Override // a.W3.e
        public final android.view.ContentInfo c() {
                r1 = this;
                android.view.ContentInfo r0 = r1.f317a
                return r0
        }

        @Override // a.W3.e
        public final int d() {
                r1 = this;
                android.view.ContentInfo r0 = r1.f317a
                int r0 = a.C0382t2.l(r0)
                return r0
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ContentInfoCompat{"
                r0.<init>(r1)
                android.view.ContentInfo r1 = r2.f317a
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public interface e {
        android.content.ClipData a();

        int b();

        android.view.ContentInfo c();

        int d();
    }

    public static final class f implements a.W3.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.content.ClipData f318a;
        public final int b;
        public final int c;
        public final android.net.Uri d;
        public final android.os.Bundle e;

        public f(a.W3.c r4) {
                r3 = this;
                r3.<init>()
                android.content.ClipData r0 = r4.f316a
                r0.getClass()
                r3.f318a = r0
                int r0 = r4.b
                if (r0 < 0) goto L58
                r1 = 5
                if (r0 > r1) goto L4e
                r3.b = r0
                int r0 = r4.c
                r1 = r0 & 1
                if (r1 != r0) goto L24
                r3.c = r0
                android.net.Uri r0 = r4.d
                r3.d = r0
                android.os.Bundle r4 = r4.e
                r3.e = r4
                return
            L24:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Requested flags 0x"
                r1.<init>(r2)
                java.lang.String r0 = java.lang.Integer.toHexString(r0)
                r1.append(r0)
                java.lang.String r0 = ", but only 0x"
                r1.append(r0)
                r0 = 1
                java.lang.String r0 = java.lang.Integer.toHexString(r0)
                r1.append(r0)
                java.lang.String r0 = " are allowed"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            L4e:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.util.Locale r0 = java.util.Locale.US
                java.lang.String r0 = "source is out of range of [0, 5] (too high)"
                r4.<init>(r0)
                throw r4
            L58:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.util.Locale r0 = java.util.Locale.US
                java.lang.String r0 = "source is out of range of [0, 5] (too low)"
                r4.<init>(r0)
                throw r4
        }

        @Override // a.W3.e
        public final android.content.ClipData a() {
                r1 = this;
                android.content.ClipData r0 = r1.f318a
                return r0
        }

        @Override // a.W3.e
        public final int b() {
                r1 = this;
                int r0 = r1.c
                return r0
        }

        @Override // a.W3.e
        public final android.view.ContentInfo c() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // a.W3.e
        public final int d() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        public final java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ContentInfoCompat{clip="
                r0.<init>(r1)
                android.content.ClipData r1 = r5.f318a
                android.content.ClipDescription r1 = r1.getDescription()
                r0.append(r1)
                java.lang.String r1 = ", source="
                r0.append(r1)
                int r1 = r5.b
                if (r1 == 0) goto L3c
                r2 = 1
                if (r1 == r2) goto L39
                r2 = 2
                if (r1 == r2) goto L36
                r2 = 3
                if (r1 == r2) goto L33
                r2 = 4
                if (r1 == r2) goto L30
                r2 = 5
                if (r1 == r2) goto L2d
                java.lang.String r1 = java.lang.String.valueOf(r1)
                goto L3e
            L2d:
                java.lang.String r1 = "SOURCE_PROCESS_TEXT"
                goto L3e
            L30:
                java.lang.String r1 = "SOURCE_AUTOFILL"
                goto L3e
            L33:
                java.lang.String r1 = "SOURCE_DRAG_AND_DROP"
                goto L3e
            L36:
                java.lang.String r1 = "SOURCE_INPUT_METHOD"
                goto L3e
            L39:
                java.lang.String r1 = "SOURCE_CLIPBOARD"
                goto L3e
            L3c:
                java.lang.String r1 = "SOURCE_APP"
            L3e:
                r0.append(r1)
                java.lang.String r1 = ", flags="
                r0.append(r1)
                int r1 = r5.c
                r2 = r1 & 1
                if (r2 == 0) goto L4f
                java.lang.String r1 = "FLAG_CONVERT_TO_PLAIN_TEXT"
                goto L53
            L4f:
                java.lang.String r1 = java.lang.String.valueOf(r1)
            L53:
                r0.append(r1)
                java.lang.String r1 = ""
                android.net.Uri r2 = r5.d
                if (r2 != 0) goto L5e
                r2 = r1
                goto L79
            L5e:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = ", hasLinkUri("
                r3.<init>(r4)
                java.lang.String r2 = r2.toString()
                int r2 = r2.length()
                r3.append(r2)
                java.lang.String r2 = ")"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
            L79:
                r0.append(r2)
                android.os.Bundle r2 = r5.e
                if (r2 != 0) goto L81
                goto L83
            L81:
                java.lang.String r1 = ", hasExtras"
            L83:
                java.lang.String r2 = "}"
                java.lang.String r0 = a.C0487z.h(r0, r1, r2)
                return r0
        }
    }

    public W3(a.W3.e r1) {
            r0 = this;
            r0.<init>()
            r0.f314a = r1
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            a.W3$e r0 = r1.f314a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
