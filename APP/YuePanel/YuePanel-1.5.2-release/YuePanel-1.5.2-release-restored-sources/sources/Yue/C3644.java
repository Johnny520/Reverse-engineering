package Yue;

import Yue.C5256;
import Yue.C7141;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3644 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0206 f6440 = new C0206(null);

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public final C7101 f435;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public final C7141 f436;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۦۢ$ۥ */
    public static final class C0206 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟ۦۢ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0206(C4335 c4335) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean m708(@InterfaceC6399 C7141 c7141, @InterfaceC6399 C7101 c7101) {
            C5499.m17103(c7141, "response");
            C5499.m17103(c7101, "request");
            int iM22315 = c7141.m22315();
            if (iM22315 != 200 && iM22315 != 410 && iM22315 != 414 && iM22315 != 501 && iM22315 != 203 && iM22315 != 204) {
                if (iM22315 == 307) {
                    if (C7141.m22298(c7141, "Expires", null, 2, null) == null && c7141.m22312().m9945() == -1 && !c7141.m22312().m9944() && !c7141.m22312().m9943()) {
                        return false;
                    }
                } else if (iM22315 != 308 && iM22315 != 404 && iM22315 != 405) {
                    switch (iM22315) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (c7141.m22312().m9950() || c7101.m22150().m9950()) ? false : true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0206() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۦۢ$ۥ۟ */
    public static final class C0207 {

        /* JADX INFO: renamed from: ۥ */
        public final long f437;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public final C7101 f438;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6489
        public final C7141 f6441;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6489
        public Date f6442;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6489
        public String f6443;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @InterfaceC6489
        public Date f6444;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @InterfaceC6489
        public String f6445;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        @InterfaceC6489
        public Date f6446;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public long f6447;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public long f6448;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        @InterfaceC6489
        public String f6449;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public int f6450;

        public C0207(long j, @InterfaceC6399 C7101 c7101, @InterfaceC6489 C7141 c7141) {
            C5499.m17103(c7101, "request");
            this.f437 = j;
            this.f438 = c7101;
            this.f6441 = c7141;
            this.f6450 = -1;
            if (c7141 != null) {
                this.f6447 = c7141.m22332();
                this.f6448 = c7141.m22330();
                C5256 c5256M22320 = c7141.m22320();
                int size = c5256M22320.size();
                for (int i = 0; i < size; i++) {
                    String strM16114 = c5256M22320.m16114(i);
                    String strM16118 = c5256M22320.m16118(i);
                    if (C7627.m23974(strM16114, "Date", true)) {
                        this.f6442 = C4305.m1259(strM16118);
                        this.f6443 = strM16118;
                    } else if (C7627.m23974(strM16114, "Expires", true)) {
                        this.f6446 = C4305.m1259(strM16118);
                    } else if (C7627.m23974(strM16114, "Last-Modified", true)) {
                        this.f6444 = C4305.m1259(strM16118);
                        this.f6445 = strM16118;
                    } else if (C7627.m23974(strM16114, "ETag", true)) {
                        this.f6449 = strM16118;
                    } else if (C7627.m23974(strM16114, "Age", true)) {
                        this.f6450 = C8158.m26892(strM16118, -1);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public final long m709() {
            Date date = this.f6442;
            long jMax = date != null ? Math.max(0L, this.f6448 - date.getTime()) : 0L;
            int i = this.f6450;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.f6448;
            return jMax + (j - this.f6447) + (this.f437 - j);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final C3644 m710() {
            C3644 c3644M9968 = m9968();
            return (c3644M9968.m707() == null || !this.f438.m22150().m9952()) ? c3644M9968 : new C3644(null, null);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C3644 m9968() {
            String str;
            if (this.f6441 == null) {
                return new C3644(this.f438, null);
            }
            if ((!this.f438.m22155() || this.f6441.m22317() != null) && C3644.f6440.m708(this.f6441, this.f438)) {
                C3641 c3641M22150 = this.f438.m22150();
                if (c3641M22150.m9949() || m9971(this.f438)) {
                    return new C3644(this.f438, null);
                }
                C3641 c3641M22312 = this.f6441.m22312();
                long jM709 = m709();
                long jM9969 = m9969();
                if (c3641M22150.m9945() != -1) {
                    jM9969 = Math.min(jM9969, TimeUnit.SECONDS.toMillis(c3641M22150.m9945()));
                }
                long millis = 0;
                long millis2 = c3641M22150.m9947() != -1 ? TimeUnit.SECONDS.toMillis(c3641M22150.m9947()) : 0L;
                if (!c3641M22312.m9948() && c3641M22150.m9946() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(c3641M22150.m9946());
                }
                if (!c3641M22312.m9949()) {
                    long j = millis2 + jM709;
                    if (j < millis + jM9969) {
                        C7141.C1185 c1185M22326 = this.f6441.m22326();
                        if (j >= jM9969) {
                            c1185M22326.m3431("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jM709 > 86400000 && m9972()) {
                            c1185M22326.m3431("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new C3644(null, c1185M22326.m22334());
                    }
                }
                String str2 = this.f6449;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f6444 != null) {
                        str2 = this.f6445;
                    } else {
                        if (this.f6442 == null) {
                            return new C3644(this.f438, null);
                        }
                        str2 = this.f6443;
                    }
                    str = "If-Modified-Since";
                }
                C5256.C0687 c0687M16116 = this.f438.m22153().m16116();
                C5499.m17100(str2);
                c0687M16116.m16124(str, str2);
                return new C3644(this.f438.m22157().m22173(c0687M16116.m16126()).m3393(), this.f6441);
            }
            return new C3644(this.f438, null);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final long m9969() {
            C7141 c7141 = this.f6441;
            C5499.m17100(c7141);
            if (c7141.m22312().m9945() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m9945());
            }
            Date date = this.f6446;
            if (date != null) {
                Date date2 = this.f6442;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f6448);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f6444 == null || this.f6441.m22331().m22160().m16780() != null) {
                return 0L;
            }
            Date date3 = this.f6442;
            long time2 = date3 != null ? date3.getTime() : this.f6447;
            Date date4 = this.f6444;
            C5499.m17100(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / ((long) 10);
            }
            return 0L;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C7101 m9970() {
            return this.f438;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final boolean m9971(C7101 c7101) {
            return (c7101.m22152("If-Modified-Since") == null && c7101.m22152("If-None-Match") == null) ? false : true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean m9972() {
            C7141 c7141 = this.f6441;
            C5499.m17100(c7141);
            return c7141.m22312().m9945() == -1 && this.f6446 == null;
        }
    }

    public C3644(@InterfaceC6489 C7101 c7101, @InterfaceC6489 C7141 c7141) {
        this.f435 = c7101;
        this.f436 = c7141;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final C7141 m706() {
        return this.f436;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final C7101 m707() {
        return this.f435;
    }
}
