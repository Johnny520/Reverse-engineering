package p001;

/* JADX INFO: renamed from: ۟.i3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0250i3 {

    /* JADX INFO: renamed from: ۥ */
    public final String f853;

    /* JADX INFO: renamed from: ۥ۟ */
    public final String f854;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Long f1515;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final Long f1516;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final String f1517;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final String f1518;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final boolean f1519;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final String f1520;

    /* JADX INFO: renamed from: ۟.i3$a */
    public static final class a {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C0250i3 m871(Object obj) {
            String string;
            String string2;
            long j;
            long j2;
            String strM915;
            Object objM926;
            Object objM9262;
            String string3;
            Object objM9263;
            Object objM1202;
            if (obj == null) {
                return null;
            }
            Object objM12022 = C0373r3.m1202(obj, "original", false);
            if (objM12022 == null || (string = objM12022.toString()) == null) {
                string = "";
            }
            String str = ((string.length() == 0) && ((objM1202 = C0373r3.m1202(obj, "url", false)) == null || (string = objM1202.toString()) == null)) ? "" : string;
            Object objM12023 = C0373r3.m1202(obj, "livePhoto", false);
            if (objM12023 != null) {
                Object objM12024 = C0373r3.m1202(objM12023, "media", false);
                Object objM9264 = objM12024 != null ? C0373r3.m926(objM12024, "get", "stream") : null;
                Object objM9265 = objM9264 != null ? C0373r3.m926(objM9264, "getAsJsonArray", "h265") : null;
                if (objM9265 == null) {
                    objM9265 = objM9264 != null ? C0373r3.m926(objM9264, "getAsJsonArray", "h264") : null;
                    if (objM9265 != null) {
                        Integer num = (Integer) C0373r3.m927(objM9265, "size", new Object[0]);
                        if ((num != null ? num.intValue() : 0) > 0) {
                            Object objM9266 = C0373r3.m926(objM9265, "get", 0);
                            if (objM9266 == null) {
                                return null;
                            }
                            Object objM9267 = C0373r3.m926(objM9266, "get", "master_url");
                            if (objM9267 == null || (objM9263 = C0373r3.m926(objM9267, "getAsString", new Object[0])) == null || (string2 = objM9263.toString()) == null) {
                                string2 = "";
                            }
                            Object objM9268 = C0373r3.m926(objM9266, "get", "duration");
                            if (objM9268 == null || (j = (Long) C0373r3.m927(objM9268, "getAsLong", new Object[0])) == null) {
                                j = 0L;
                            }
                            Object objM9269 = C0373r3.m926(objM9266, "get", "size");
                            if (objM9269 == null || (j2 = (Long) C0373r3.m927(objM9269, "getAsLong", new Object[0])) == null) {
                                j2 = 0L;
                            }
                            Long l = j2;
                            Object objM92610 = C0373r3.m926(objM9266, "get", "quality_type");
                            String str2 = (objM92610 == null || (objM9262 = C0373r3.m926(objM92610, "getAsString", new Object[0])) == null || (string3 = objM9262.toString()) == null) ? "" : string3;
                            Object objM92611 = C0373r3.m926(objM9266, "get", "format");
                            if (objM92611 == null || (objM926 = C0373r3.m926(objM92611, "getAsString", new Object[0])) == null || (strM915 = objM926.toString()) == null) {
                                strM915 = "mp4";
                            }
                            return new C0250i3(str, string2, j, l, str2, strM915);
                        }
                    }
                } else {
                    Integer num2 = (Integer) C0373r3.m927(objM9265, "size", new Object[0]);
                    if ((num2 != null ? num2.intValue() : 0) <= 0) {
                    }
                    if (objM9265 != null) {
                    }
                }
            }
            return new C0250i3(str);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r10v0 java.lang.String)
  ("")
  (0 long)
  (0 long)
  ("")
  (wrap:java.lang.String:0x0016: INVOKE 
  (wrap:byte[]:0x000b: FILLED_NEW_ARRAY (-34 byte), (13 byte), (8 byte) A[WRAPPED] elemType: byte)
  (wrap:byte[]:0x0011: FILLED_NEW_ARRAY (-77 byte), (125 byte), (60 byte), (72 byte), (62 byte), (41 byte) A[WRAPPED] elemType: byte)
 STATIC call: ۟.oa.ۥ(byte[], byte[]):java.lang.String A[MD:(byte[], byte[]):java.lang.String (m), WRAPPED])
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String):void (m)] call: ۟.i3.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C0250i3(String str) {
        this(str, "", 0L, 0L, "", "mp4");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0250i3(String str, String str2, Long l, Long l2, String str3, String str4) {
        "url";
        this.f853 = str;
        this.f854 = str2;
        this.f1515 = l;
        this.f1516 = l2;
        this.f1517 = str3;
        this.f1518 = str4;
        boolean z = true;
        if (str2 == null) {
            z = false;
        } else {
            if (!(str2.length() > 0)) {
            }
        }
        this.f1519 = z;
        this.f1520 = str4 == null ? "mp4" : str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0250i3)) {
            return false;
        }
        C0250i3 c0250i3 = (C0250i3) obj;
        return C0237h4.m864(this.f853, c0250i3.f853) && C0237h4.m864(this.f854, c0250i3.f854) && C0237h4.m864(this.f1515, c0250i3.f1515) && C0237h4.m864(this.f1516, c0250i3.f1516) && C0237h4.m864(this.f1517, c0250i3.f1517) && C0237h4.m864(this.f1518, c0250i3.f1518);
    }

    public final int hashCode() {
        int iHashCode = this.f853.hashCode() * 31;
        String str = this.f854;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f1515;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f1516;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.f1517;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1518;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return super.toString();
    }
}
