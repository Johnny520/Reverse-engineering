package Yue;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3641 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0203 f6415 = new C0203(null);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C3641 f6416 = new C0202().m9958().m699();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C3641 f6417 = new C0202().m9961().m9956(Integer.MAX_VALUE, TimeUnit.SECONDS).m699();

    /* JADX INFO: renamed from: ۥ */
    public final boolean f430;

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean f431;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f6418;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int f6419;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean f6420;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean f6421;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean f6422;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int f6423;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int f6424;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean f6425;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean f6426;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean f6427;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC6489
    public String f6428;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۦ۟$ۥ */
    @InterfaceC7507({"SMAP\nCacheControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheControl.kt\nokhttp3/CacheControl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    public static final class C0202 {

        /* JADX INFO: renamed from: ۥ */
        public boolean f432;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f433;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f6429 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f6430 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f6431 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f6432;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f6433;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean f6434;

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C3641 m699() {
            return new C3641(this.f432, this.f433, this.f6429, -1, false, false, false, this.f6430, this.f6431, this.f6432, this.f6433, this.f6434, null, null);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final int m700(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C0202 m9954() {
            this.f6434 = true;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C0202 m9955(int i, @InterfaceC6399 TimeUnit timeUnit) {
            C5499.m17103(timeUnit, "timeUnit");
            if (i >= 0) {
                this.f6429 = m700(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + i).toString());
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C0202 m9956(int i, @InterfaceC6399 TimeUnit timeUnit) {
            C5499.m17103(timeUnit, "timeUnit");
            if (i >= 0) {
                this.f6430 = m700(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C0202 m9957(int i, @InterfaceC6399 TimeUnit timeUnit) {
            C5499.m17103(timeUnit, "timeUnit");
            if (i >= 0) {
                this.f6431 = m700(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + i).toString());
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final C0202 m9958() {
            this.f432 = true;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final C0202 m9959() {
            this.f433 = true;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final C0202 m9960() {
            this.f6433 = true;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final C0202 m9961() {
            this.f6432 = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۦ۟$ۥ۟ */
    public static final class C0203 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟ۦ۟.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0203(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static /* synthetic */ int m701(C0203 c0203, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return c0203.m702(str, str2, i);
        }

        /* JADX INFO: renamed from: ۥ */
        public final int m702(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (C7628.m24034(str2, str.charAt(i), false, 2, null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C3641 m9962(@InterfaceC6399 C5256 c5256) {
            int i;
            int i2;
            int iM702;
            String string;
            C5256 c52562 = c5256;
            C5499.m17103(c52562, "headers");
            int size = c5256.size();
            boolean z = true;
            boolean z2 = true;
            int i3 = 0;
            String str = null;
            boolean z3 = false;
            boolean z4 = false;
            int iM26892 = -1;
            int iM268922 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int iM268923 = -1;
            int iM268924 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (i3 < size) {
                String strM16114 = c52562.m16114(i3);
                String strM16118 = c52562.m16118(i3);
                if (C7627.m23974(strM16114, "Cache-Control", z)) {
                    if (str == null) {
                        str = strM16118;
                    }
                    i = 0;
                    while (i < strM16118.length()) {
                        int iM7022 = m702(strM16118, "=,;", i);
                        String strSubstring = strM16118.substring(i, iM7022);
                        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        String string2 = C7628.m24174(strSubstring).toString();
                        if (iM7022 != strM16118.length()) {
                            i2 = size;
                            if (strM16118.charAt(iM7022) != ',' && strM16118.charAt(iM7022) != ';') {
                                int iM26865 = C8158.m26865(strM16118, iM7022 + 1);
                                if (iM26865 >= strM16118.length() || strM16118.charAt(iM26865) != '\"') {
                                    iM702 = m702(strM16118, ",;", iM26865);
                                    String strSubstring2 = strM16118.substring(iM26865, iM702);
                                    C5499.m17102(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    string = C7628.m24174(strSubstring2).toString();
                                } else {
                                    int i4 = iM26865 + 1;
                                    int iM24056 = C7628.m24056(strM16118, C8039.f3212, i4, false, 4, null);
                                    string = strM16118.substring(i4, iM24056);
                                    C5499.m17102(string, "this as java.lang.String…ing(startIndex, endIndex)");
                                    iM702 = iM24056 + 1;
                                }
                            }
                            z = true;
                            if (!C7627.m23974("no-cache", string2, true)) {
                                i = iM702;
                                z3 = true;
                            } else if (C7627.m23974("no-store", string2, true)) {
                                i = iM702;
                                z4 = true;
                            } else {
                                if (C7627.m23974("max-age", string2, true)) {
                                    iM26892 = C8158.m26892(string, -1);
                                } else if (C7627.m23974("s-maxage", string2, true)) {
                                    iM268922 = C8158.m26892(string, -1);
                                } else if (C7627.m23974("private", string2, true)) {
                                    i = iM702;
                                    z5 = true;
                                } else if (C7627.m23974("public", string2, true)) {
                                    i = iM702;
                                    z6 = true;
                                } else if (C7627.m23974("must-revalidate", string2, true)) {
                                    i = iM702;
                                    z7 = true;
                                } else if (C7627.m23974("max-stale", string2, true)) {
                                    iM268923 = C8158.m26892(string, Integer.MAX_VALUE);
                                } else if (C7627.m23974("min-fresh", string2, true)) {
                                    iM268924 = C8158.m26892(string, -1);
                                } else if (C7627.m23974("only-if-cached", string2, true)) {
                                    i = iM702;
                                    z8 = true;
                                } else if (C7627.m23974("no-transform", string2, true)) {
                                    i = iM702;
                                    z9 = true;
                                } else if (C7627.m23974("immutable", string2, true)) {
                                    i = iM702;
                                    z10 = true;
                                }
                                i = iM702;
                            }
                            size = i2;
                        } else {
                            i2 = size;
                        }
                        iM702 = iM7022 + 1;
                        string = null;
                        z = true;
                        if (!C7627.m23974("no-cache", string2, true)) {
                        }
                        size = i2;
                    }
                    i3++;
                    c52562 = c5256;
                    size = size;
                } else if (!C7627.m23974(strM16114, "Pragma", z)) {
                    i3++;
                    c52562 = c5256;
                    size = size;
                }
                z2 = false;
                i = 0;
                while (i < strM16118.length()) {
                }
                i3++;
                c52562 = c5256;
                size = size;
            }
            return new C3641(z3, z4, iM26892, iM268922, z5, z6, z7, iM268923, iM268924, z8, z9, z10, !z2 ? null : str, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0203() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 boolean)
  (r2v0 boolean)
  (r3v0 int)
  (r4v0 int)
  (r5v0 boolean)
  (r6v0 boolean)
  (r7v0 boolean)
  (r8v0 int)
  (r9v0 int)
  (r10v0 boolean)
  (r11v0 boolean)
  (r12v0 boolean)
  (r13v0 java.lang.String)
 A[MD:(boolean, boolean, int, int, boolean, boolean, boolean, int, int, boolean, boolean, boolean, java.lang.String):void (m)] (LINE:1) call: Yue.ۥۣ۟ۦ۟.<init>(boolean, boolean, int, int, boolean, boolean, boolean, int, int, boolean, boolean, boolean, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3641(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, C4335 c4335) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final C3641 m9933(@InterfaceC6399 C5256 c5256) {
        return f6415.m9962(c5256);
    }

    @InterfaceC6399
    public String toString() {
        String str = this.f6428;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f430) {
            sb.append("no-cache, ");
        }
        if (this.f431) {
            sb.append("no-store, ");
        }
        if (this.f6418 != -1) {
            sb.append("max-age=");
            sb.append(this.f6418);
            sb.append(", ");
        }
        if (this.f6419 != -1) {
            sb.append("s-maxage=");
            sb.append(this.f6419);
            sb.append(", ");
        }
        if (this.f6420) {
            sb.append("private, ");
        }
        if (this.f6421) {
            sb.append("public, ");
        }
        if (this.f6422) {
            sb.append("must-revalidate, ");
        }
        if (this.f6423 != -1) {
            sb.append("max-stale=");
            sb.append(this.f6423);
            sb.append(", ");
        }
        if (this.f6424 != -1) {
            sb.append("min-fresh=");
            sb.append(this.f6424);
            sb.append(", ");
        }
        if (this.f6425) {
            sb.append("only-if-cached, ");
        }
        if (this.f6426) {
            sb.append("no-transform, ");
        }
        if (this.f6427) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        this.f6428 = string;
        return string;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "immutable", imports = {}))
    @InterfaceC5572(name = "-deprecated_immutable")
    /* JADX INFO: renamed from: ۥ */
    public final boolean m697() {
        return this.f6427;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "maxAgeSeconds", imports = {}))
    @InterfaceC5572(name = "-deprecated_maxAgeSeconds")
    /* JADX INFO: renamed from: ۥ۟ */
    public final int m698() {
        return this.f6418;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "maxStaleSeconds", imports = {}))
    @InterfaceC5572(name = "-deprecated_maxStaleSeconds")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m9934() {
        return this.f6423;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "minFreshSeconds", imports = {}))
    @InterfaceC5572(name = "-deprecated_minFreshSeconds")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m9935() {
        return this.f6424;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "mustRevalidate", imports = {}))
    @InterfaceC5572(name = "-deprecated_mustRevalidate")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m9936() {
        return this.f6422;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "noCache", imports = {}))
    @InterfaceC5572(name = "-deprecated_noCache")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m9937() {
        return this.f430;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "noStore", imports = {}))
    @InterfaceC5572(name = "-deprecated_noStore")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m9938() {
        return this.f431;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "noTransform", imports = {}))
    @InterfaceC5572(name = "-deprecated_noTransform")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m9939() {
        return this.f6426;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "onlyIfCached", imports = {}))
    @InterfaceC5572(name = "-deprecated_onlyIfCached")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m9940() {
        return this.f6425;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "sMaxAgeSeconds", imports = {}))
    @InterfaceC5572(name = "-deprecated_sMaxAgeSeconds")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final int m9941() {
        return this.f6419;
    }

    @InterfaceC5572(name = "immutable")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m9942() {
        return this.f6427;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m9943() {
        return this.f6420;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m9944() {
        return this.f6421;
    }

    @InterfaceC5572(name = "maxAgeSeconds")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final int m9945() {
        return this.f6418;
    }

    @InterfaceC5572(name = "maxStaleSeconds")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final int m9946() {
        return this.f6423;
    }

    @InterfaceC5572(name = "minFreshSeconds")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final int m9947() {
        return this.f6424;
    }

    @InterfaceC5572(name = "mustRevalidate")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m9948() {
        return this.f6422;
    }

    @InterfaceC5572(name = "noCache")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final boolean m9949() {
        return this.f430;
    }

    @InterfaceC5572(name = "noStore")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final boolean m9950() {
        return this.f431;
    }

    @InterfaceC5572(name = "noTransform")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m9951() {
        return this.f6426;
    }

    @InterfaceC5572(name = "onlyIfCached")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean m9952() {
        return this.f6425;
    }

    @InterfaceC5572(name = "sMaxAgeSeconds")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int m9953() {
        return this.f6419;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3641(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f430 = z;
        this.f431 = z2;
        this.f6418 = i;
        this.f6419 = i2;
        this.f6420 = z3;
        this.f6421 = z4;
        this.f6422 = z5;
        this.f6423 = i3;
        this.f6424 = i4;
        this.f6425 = z6;
        this.f6426 = z7;
        this.f6427 = z8;
        this.f6428 = str;
    }
}
