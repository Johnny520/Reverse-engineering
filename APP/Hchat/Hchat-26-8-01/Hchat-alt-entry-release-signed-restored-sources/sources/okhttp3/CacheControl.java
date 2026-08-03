package okhttp3;

import gg.AbstractC1411g;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.InterfaceC3954a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final Companion Companion = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final int clampToInt(long j3) {
            if (j3 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder maxAge(int i9, TimeUnit timeUnit) {
            timeUnit.getClass();
            if (i9 >= 0) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i9));
                return this;
            }
            C2104o.m5291q(AbstractC0921a.m2249l(i9, "maxAge < 0: "));
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder maxStale(int i9, TimeUnit timeUnit) {
            timeUnit.getClass();
            if (i9 >= 0) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i9));
                return this;
            }
            C2104o.m5291q(AbstractC0921a.m2249l(i9, "maxStale < 0: "));
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder minFresh(int i9, TimeUnit timeUnit) {
            timeUnit.getClass();
            if (i9 >= 0) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i9));
                return this;
            }
            C2104o.m5291q(AbstractC0921a.m2249l(i9, "minFresh < 0: "));
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private CacheControl(boolean z9, boolean z10, int i9, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, String str) {
        this.noCache = z9;
        this.noStore = z10;
        this.maxAgeSeconds = i9;
        this.sMaxAgeSeconds = i10;
        this.isPrivate = z11;
        this.isPublic = z12;
        this.mustRevalidate = z13;
        this.maxStaleSeconds = i11;
        this.minFreshSeconds = i12;
        this.onlyIfCached = z14;
        this.noTransform = z15;
        this.immutable = z16;
        this.headerValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m10939deprecated_immutable() {
        return this.immutable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m10940deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m10941deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m10942deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m10943deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m10944deprecated_noCache() {
        return this.noCache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m10945deprecated_noStore() {
        return this.noStore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m10946deprecated_noTransform() {
        return this.noTransform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m10947deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m10948deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean immutable() {
        return this.immutable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isPrivate() {
        return this.isPrivate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isPublic() {
        return this.isPublic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean noCache() {
        return this.noCache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean noStore() {
        return this.noStore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean noTransform() {
        return this.noTransform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.noCache) {
            sb2.append("no-cache, ");
        }
        if (this.noStore) {
            sb2.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb2.append("max-age=");
            sb2.append(this.maxAgeSeconds);
            sb2.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.sMaxAgeSeconds);
            sb2.append(", ");
        }
        if (this.isPrivate) {
            sb2.append("private, ");
        }
        if (this.isPublic) {
            sb2.append("public, ");
        }
        if (this.mustRevalidate) {
            sb2.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb2.append("max-stale=");
            sb2.append(this.maxStaleSeconds);
            sb2.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.minFreshSeconds);
            sb2.append(", ");
        }
        if (this.onlyIfCached) {
            sb2.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb2.append("no-transform, ");
        }
        if (this.immutable) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        this.headerValue = string;
        return string;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.CacheControl.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final int indexOfElement(String str, String str2, int i9) {
            int length = str.length();
            while (i9 < length) {
                if (AbstractC3149m.m6710i0(str2, str.charAt(i9))) {
                    return i9;
                }
                i9++;
            }
            return str.length();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i9, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                i9 = 0;
            }
            return companion.indexOfElement(str, str2, i9);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CacheControl parse(Headers headers) {
            int i9;
            int iIndexOfElement;
            String string;
            Headers headers2 = headers;
            headers2.getClass();
            int size = headers2.size();
            int i10 = 0;
            boolean z9 = true;
            String str = null;
            boolean z10 = false;
            boolean z11 = false;
            int nonNegativeInt = -1;
            int nonNegativeInt2 = -1;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            int nonNegativeInt3 = -1;
            int nonNegativeInt4 = -1;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            while (i10 < size) {
                String strName = headers2.name(i10);
                String strValue = headers2.value(i10);
                if (AbstractC3156t.m6734X(strName, "Cache-Control")) {
                    if (str == null) {
                        str = strValue;
                    }
                    i9 = 0;
                    while (i9 < strValue.length()) {
                        int iIndexOfElement2 = indexOfElement(strValue, "=,;", i9);
                        String string2 = AbstractC3149m.m6703R0(strValue.substring(i9, iIndexOfElement2)).toString();
                        if (iIndexOfElement2 == strValue.length() || strValue.charAt(iIndexOfElement2) == ',' || strValue.charAt(iIndexOfElement2) == ';') {
                            iIndexOfElement = iIndexOfElement2 + 1;
                            string = null;
                        } else {
                            int iIndexOfNonWhitespace = Util.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
                            if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
                                iIndexOfElement = indexOfElement(strValue, ",;", iIndexOfNonWhitespace);
                                string = AbstractC3149m.m6703R0(strValue.substring(iIndexOfNonWhitespace, iIndexOfElement)).toString();
                            } else {
                                int i11 = iIndexOfNonWhitespace + 1;
                                int iM6718q0 = AbstractC3149m.m6718q0(strValue, '\"', i11, 4);
                                string = strValue.substring(i11, iM6718q0);
                                iIndexOfElement = iM6718q0 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string2)) {
                            i9 = iIndexOfElement;
                            z10 = true;
                        } else if ("no-store".equalsIgnoreCase(string2)) {
                            i9 = iIndexOfElement;
                            z11 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(string2)) {
                                nonNegativeInt = Util.toNonNegativeInt(string, -1);
                            } else if ("s-maxage".equalsIgnoreCase(string2)) {
                                nonNegativeInt2 = Util.toNonNegativeInt(string, -1);
                            } else if ("private".equalsIgnoreCase(string2)) {
                                i9 = iIndexOfElement;
                                z12 = true;
                            } else if ("public".equalsIgnoreCase(string2)) {
                                i9 = iIndexOfElement;
                                z13 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(string2)) {
                                i9 = iIndexOfElement;
                                z14 = true;
                            } else if ("max-stale".equalsIgnoreCase(string2)) {
                                nonNegativeInt3 = Util.toNonNegativeInt(string, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(string2)) {
                                nonNegativeInt4 = Util.toNonNegativeInt(string, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(string2)) {
                                i9 = iIndexOfElement;
                                z15 = true;
                            } else if ("no-transform".equalsIgnoreCase(string2)) {
                                i9 = iIndexOfElement;
                                z16 = true;
                            } else if ("immutable".equalsIgnoreCase(string2)) {
                                i9 = iIndexOfElement;
                                z17 = true;
                            }
                            i9 = iIndexOfElement;
                        }
                    }
                    i10++;
                    headers2 = headers;
                } else if (!AbstractC3156t.m6734X(strName, "Pragma")) {
                    i10++;
                    headers2 = headers;
                }
                z9 = false;
                i9 = 0;
                while (i9 < strValue.length()) {
                }
                i10++;
                headers2 = headers;
            }
            return new CacheControl(z10, z11, nonNegativeInt, nonNegativeInt2, z12, z13, z14, nonNegativeInt3, nonNegativeInt4, z15, z16, z17, !z9 ? null : str, null);
        }

        private Companion() {
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
 A[MD:(boolean, boolean, int, int, boolean, boolean, boolean, int, int, boolean, boolean, boolean, java.lang.String):void (m)] (LINE:31) call: okhttp3.CacheControl.<init>(boolean, boolean, int, int, boolean, boolean, boolean, int, int, boolean, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ CacheControl(boolean z9, boolean z10, int i9, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, String str, AbstractC1411g abstractC1411g) {
        this(z9, z10, i9, i10, z11, z12, z13, i11, i12, z14, z15, z16, str);
    }
}
