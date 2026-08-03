package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class RequestBody {
    public static final okhttp3.RequestBody.Companion Companion = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, java.io.File r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.RequestBody r0 = r0.create(r1, r2)
                return r0
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, java.lang.String r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.RequestBody r0 = r0.create(r1, r2)
                return r0
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, okhttp3.MediaType r1, byte[] r2, int r3, int r4, int r5, java.lang.Object r6) {
                r6 = r5 & 4
                if (r6 == 0) goto L5
                r3 = 0
            L5:
                r5 = r5 & 8
                if (r5 == 0) goto La
                int r4 = r2.length
            La:
                okhttp3.RequestBody r0 = r0.create(r1, r2, r3, r4)
                return r0
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, okio.ByteString r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.RequestBody r0 = r0.create(r1, r2)
                return r0
        }

        public static /* synthetic */ okhttp3.RequestBody create$default(okhttp3.RequestBody.Companion r0, byte[] r1, okhttp3.MediaType r2, int r3, int r4, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                if (r6 == 0) goto L5
                r2 = 0
            L5:
                r6 = r5 & 2
                if (r6 == 0) goto La
                r3 = 0
            La:
                r5 = r5 & 4
                if (r5 == 0) goto Lf
                int r4 = r1.length
            Lf:
                okhttp3.RequestBody r0 = r0.create(r1, r2, r3, r4)
                return r0
        }

        public final okhttp3.RequestBody create(java.io.File r2, okhttp3.MediaType r3) {
                r1 = this;
                r2.getClass()
                okhttp3.RequestBody$Companion$asRequestBody$1 r0 = new okhttp3.RequestBody$Companion$asRequestBody$1
                r0.<init>(r3, r2)
                return r0
        }

        public final okhttp3.RequestBody create(java.lang.String r4, okhttp3.MediaType r5) {
                r3 = this;
                r4.getClass()
                java.nio.charset.Charset r0 = og.a.f9804a
                if (r5 == 0) goto L28
                r1 = 1
                r2 = 0
                java.nio.charset.Charset r1 = okhttp3.MediaType.charset$default(r5, r2, r1, r2)
                if (r1 != 0) goto L27
                okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r5)
                java.lang.String r5 = "; charset=utf-8"
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                okhttp3.MediaType r5 = r1.parse(r5)
                goto L28
            L27:
                r0 = r1
            L28:
                byte[] r4 = r4.getBytes(r0)
                r4.getClass()
                r0 = 0
                int r1 = r4.length
                okhttp3.RequestBody r4 = r3.create(r4, r5, r0, r1)
                return r4
        }

        @sf.a
        public final okhttp3.RequestBody create(okhttp3.MediaType r1, java.io.File r2) {
                r0 = this;
                r2.getClass()
                okhttp3.RequestBody r1 = r0.create(r2, r1)
                return r1
        }

        @sf.a
        public final okhttp3.RequestBody create(okhttp3.MediaType r1, java.lang.String r2) {
                r0 = this;
                r2.getClass()
                okhttp3.RequestBody r1 = r0.create(r2, r1)
                return r1
        }

        @sf.a
        public final okhttp3.RequestBody create(okhttp3.MediaType r1, okio.ByteString r2) {
                r0 = this;
                r2.getClass()
                okhttp3.RequestBody r1 = r0.create(r2, r1)
                return r1
        }

        @sf.a
        public final okhttp3.RequestBody create(okhttp3.MediaType r8, byte[] r9) {
                r7 = this;
                r9.getClass()
                r5 = 12
                r6 = 0
                r3 = 0
                r4 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                okhttp3.RequestBody r8 = create$default(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }

        @sf.a
        public final okhttp3.RequestBody create(okhttp3.MediaType r8, byte[] r9, int r10) {
                r7 = this;
                r9.getClass()
                r5 = 8
                r6 = 0
                r4 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                okhttp3.RequestBody r8 = create$default(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }

        @sf.a
        public final okhttp3.RequestBody create(okhttp3.MediaType r1, byte[] r2, int r3, int r4) {
                r0 = this;
                r2.getClass()
                okhttp3.RequestBody r1 = r0.create(r2, r1, r3, r4)
                return r1
        }

        public final okhttp3.RequestBody create(okio.ByteString r2, okhttp3.MediaType r3) {
                r1 = this;
                r2.getClass()
                okhttp3.RequestBody$Companion$toRequestBody$1 r0 = new okhttp3.RequestBody$Companion$toRequestBody$1
                r0.<init>(r3, r2)
                return r0
        }

        public final okhttp3.RequestBody create(byte[] r8) {
                r7 = this;
                r8.getClass()
                r5 = 7
                r6 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r0 = r7
                r1 = r8
                okhttp3.RequestBody r8 = create$default(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }

        public final okhttp3.RequestBody create(byte[] r8, okhttp3.MediaType r9) {
                r7 = this;
                r8.getClass()
                r5 = 6
                r6 = 0
                r3 = 0
                r4 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                okhttp3.RequestBody r8 = create$default(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }

        public final okhttp3.RequestBody create(byte[] r8, okhttp3.MediaType r9, int r10) {
                r7 = this;
                r8.getClass()
                r5 = 4
                r6 = 0
                r4 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                okhttp3.RequestBody r8 = create$default(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }

        public final okhttp3.RequestBody create(byte[] r8, okhttp3.MediaType r9, int r10, int r11) {
                r7 = this;
                r8.getClass()
                int r0 = r8.length
                long r1 = (long) r0
                long r3 = (long) r10
                long r5 = (long) r11
                okhttp3.internal.Util.checkOffsetAndCount(r1, r3, r5)
                okhttp3.RequestBody$Companion$toRequestBody$2 r0 = new okhttp3.RequestBody$Companion$toRequestBody$2
                r0.<init>(r9, r11, r8, r10)
                return r0
        }
    }

    static {
            okhttp3.RequestBody$Companion r0 = new okhttp3.RequestBody$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.RequestBody.Companion = r0
            return
    }

    public RequestBody() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final okhttp3.RequestBody create(java.io.File r1, okhttp3.MediaType r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    public static final okhttp3.RequestBody create(java.lang.String r1, okhttp3.MediaType r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    @sf.a
    public static final okhttp3.RequestBody create(okhttp3.MediaType r1, java.io.File r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    @sf.a
    public static final okhttp3.RequestBody create(okhttp3.MediaType r1, java.lang.String r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    @sf.a
    public static final okhttp3.RequestBody create(okhttp3.MediaType r1, okio.ByteString r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    @sf.a
    public static final okhttp3.RequestBody create(okhttp3.MediaType r1, byte[] r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    @sf.a
    public static final okhttp3.RequestBody create(okhttp3.MediaType r1, byte[] r2, int r3) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2, r3)
            return r1
    }

    @sf.a
    public static final okhttp3.RequestBody create(okhttp3.MediaType r1, byte[] r2, int r3, int r4) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2, r3, r4)
            return r1
    }

    public static final okhttp3.RequestBody create(okio.ByteString r1, okhttp3.MediaType r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    public static final okhttp3.RequestBody create(byte[] r1) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1)
            return r1
    }

    public static final okhttp3.RequestBody create(byte[] r1, okhttp3.MediaType r2) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2)
            return r1
    }

    public static final okhttp3.RequestBody create(byte[] r1, okhttp3.MediaType r2, int r3) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2, r3)
            return r1
    }

    public static final okhttp3.RequestBody create(byte[] r1, okhttp3.MediaType r2, int r3, int r4) {
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            okhttp3.RequestBody r1 = r0.create(r1, r2, r3, r4)
            return r1
    }

    public long contentLength() {
            r2 = this;
            r0 = -1
            return r0
    }

    public abstract okhttp3.MediaType contentType();

    public boolean isDuplex() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isOneShot() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract void writeTo(okio.BufferedSink r1);
}
