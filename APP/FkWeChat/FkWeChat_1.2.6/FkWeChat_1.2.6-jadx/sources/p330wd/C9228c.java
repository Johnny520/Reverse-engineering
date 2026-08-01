package p330wd;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.url._UrlKt;
import org.json.JSONArray;
import org.json.JSONObject;
import p024b9.C1062t0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;
import p299ub.AbstractC8621f0;
import p299ub.C8614c;

/* JADX INFO: renamed from: wd.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9228c {

    /* JADX INFO: renamed from: a */
    public final byte[] f31492a;

    /* JADX INFO: renamed from: b */
    public int f31493b;

    public C9228c(byte[] bArr) {
        bArr.getClass();
        this.f31492a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final String m35912a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            C1062t0 c1062t0 = C1062t0.f3215a;
            sb2.append(String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public final Map m35913b() {
        int i10;
        Object objValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            i10 = this.f31493b;
            if (i10 >= this.f31492a.length) {
                break;
            }
            try {
                long jM35920i = m35920i();
                if (jM35920i == 0 && this.f31493b == this.f31492a.length) {
                    break;
                }
                int i11 = (int) (7 & jM35920i);
                int i12 = (int) (jM35920i >>> 3);
                if (i12 <= 0 || i11 > 5) {
                    break;
                }
                if (i11 == 0) {
                    objValueOf = Long.valueOf(m35920i());
                } else if (i11 == 1) {
                    objValueOf = "f64->" + m35919h();
                } else if (i11 == 2) {
                    int iM35920i = (int) m35920i();
                    int i13 = this.f31493b;
                    int i14 = i13 + iM35920i;
                    byte[] bArr = this.f31492a;
                    if (i14 > bArr.length) {
                        byte[] bArrM20666r = AbstractC5102r.m20666r(bArr, i13, bArr.length);
                        this.f31493b = this.f31492a.length;
                        objValueOf = "hex->" + m35912a(bArrM20666r);
                    } else {
                        byte[] bArrM20666r2 = AbstractC5102r.m20666r(bArr, i13, i13 + iM35920i);
                        this.f31493b += iM35920i;
                        objValueOf = m35915d(bArrM20666r2);
                    }
                } else if (i11 != 5) {
                    objValueOf = null;
                } else {
                    objValueOf = "f32->" + m35918g();
                }
                if (objValueOf != null) {
                    try {
                        m35917f(linkedHashMap, String.valueOf(i12), objValueOf);
                    } catch (Exception unused) {
                        return linkedHashMap;
                    }
                }
            } catch (Exception unused2) {
                m35921j(linkedHashMap, "raw", i10);
            }
        }
        m35921j(linkedHashMap, "err", i10);
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        if (r2 != r3.length) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        return new p330wd.C9228c(r3).m35913b();
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map m35914c() {
        /*
            r6 = this;
            wd.c r0 = new wd.c
            byte[] r1 = r6.f31492a
            r0.<init>(r1)
        L7:
            r1 = 0
            int r2 = r0.f31493b     // Catch: java.lang.Exception -> L5b
            byte[] r3 = r6.f31492a     // Catch: java.lang.Exception -> L5b
            int r4 = r3.length     // Catch: java.lang.Exception -> L5b
            if (r2 >= r4) goto L4e
            long r2 = r0.m35920i()     // Catch: java.lang.Exception -> L5b
            r4 = 7
            long r4 = r4 & r2
            int r4 = (int) r4     // Catch: java.lang.Exception -> L5b
            r5 = 3
            long r2 = r2 >>> r5
            int r2 = (int) r2     // Catch: java.lang.Exception -> L5b
            if (r2 <= 0) goto L4d
            r2 = 5
            if (r4 <= r2) goto L20
            goto L4d
        L20:
            if (r4 == 0) goto L49
            r3 = 1
            if (r4 == r3) goto L45
            r3 = 2
            if (r4 == r3) goto L2f
            if (r4 == r2) goto L2b
            goto L7
        L2b:
            r0.m35918g()     // Catch: java.lang.Exception -> L5b
            goto L7
        L2f:
            long r2 = r0.m35920i()     // Catch: java.lang.Exception -> L5b
            int r2 = (int) r2     // Catch: java.lang.Exception -> L5b
            if (r2 < 0) goto L44
            int r3 = r0.f31493b     // Catch: java.lang.Exception -> L5b
            int r4 = r3 + r2
            byte[] r5 = r6.f31492a     // Catch: java.lang.Exception -> L5b
            int r5 = r5.length     // Catch: java.lang.Exception -> L5b
            if (r4 <= r5) goto L40
            goto L44
        L40:
            int r3 = r3 + r2
            r0.f31493b = r3     // Catch: java.lang.Exception -> L5b
            goto L7
        L44:
            return r1
        L45:
            r0.m35919h()     // Catch: java.lang.Exception -> L5b
            goto L7
        L49:
            r0.m35920i()     // Catch: java.lang.Exception -> L5b
            goto L7
        L4d:
            return r1
        L4e:
            int r0 = r3.length     // Catch: java.lang.Exception -> L5b
            if (r2 != r0) goto L5b
            wd.c r0 = new wd.c     // Catch: java.lang.Exception -> L5b
            r0.<init>(r3)     // Catch: java.lang.Exception -> L5b
            java.util.Map r0 = r0.m35913b()     // Catch: java.lang.Exception -> L5b
            return r0
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p330wd.C9228c.m35914c():java.util.Map");
    }

    /* JADX INFO: renamed from: d */
    public final Object m35915d(byte[] bArr) {
        if (bArr.length == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (!AbstractC5106t.m20696N(bArr, (byte) 0)) {
            try {
                String string = AbstractC8621f0.m33161r1(new String(bArr, C8614c.f28652b)).toString();
                if (m35916e(bArr, string)) {
                    return string;
                }
            } catch (Exception unused) {
            }
        }
        Map mapM35914c = new C9228c(bArr).m35914c();
        if (mapM35914c != null && !mapM35914c.isEmpty()) {
            return mapM35914c;
        }
        return "hex->" + m35912a(bArr);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m35916e(byte[] bArr, String str) {
        if (str.length() == 0) {
            return true;
        }
        if (AbstractC8621f0.m33124Z(str, (char) 65533, false, 2, null)) {
            return false;
        }
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt >= ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t') {
                i11++;
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            return false;
        }
        if (str.length() == 0) {
            if (!(bArr.length == 0)) {
                return bArr.length > 1;
            }
        }
        return i11 > 0 && ((double) (((float) i11) / ((float) str.length()))) >= 0.8d;
    }

    /* JADX INFO: renamed from: f */
    public final void m35917f(Map map, String str, Object obj) {
        if (obj instanceof Map) {
            obj = new JSONObject((Map) obj);
        }
        if (!map.containsKey(str)) {
            map.put(str, obj);
            return;
        }
        Object obj2 = map.get(str);
        if (obj2 instanceof JSONArray) {
            ((JSONArray) obj2).put(obj);
            return;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(obj2);
        jSONArray.put(obj);
        map.put(str, jSONArray);
    }

    /* JADX INFO: renamed from: g */
    public final long m35918g() {
        int i10 = this.f31493b;
        int i11 = i10 + 4;
        byte[] bArr = this.f31492a;
        if (i11 > bArr.length) {
            return 0L;
        }
        long j10 = ((((long) bArr[i10 + 3]) & 255) << 24) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16);
        this.f31493b = i10 + 4;
        return j10;
    }

    /* JADX INFO: renamed from: h */
    public final long m35919h() {
        long j10 = 0;
        if (this.f31493b + 8 > this.f31492a.length) {
            return 0L;
        }
        for (int i10 = 0; i10 < 8; i10++) {
            byte[] bArr = this.f31492a;
            int i11 = this.f31493b;
            this.f31493b = i11 + 1;
            j10 |= (((long) bArr[i11]) & 255) << (i10 * 8);
        }
        return j10;
    }

    /* JADX INFO: renamed from: i */
    public final long m35920i() {
        int i10 = 0;
        long j10 = 0;
        while (true) {
            int i11 = this.f31493b;
            byte[] bArr = this.f31492a;
            if (i11 >= bArr.length) {
                return j10;
            }
            this.f31493b = i11 + 1;
            long j11 = bArr[i11];
            j10 |= (127 & j11) << i10;
            if ((j11 & 128) == 0) {
                return j10;
            }
            i10 += 7;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m35921j(Map map, String str, int i10) {
        byte[] bArr = this.f31492a;
        if (i10 < bArr.length) {
            m35917f(map, str, "hex->" + m35912a(AbstractC5102r.m20666r(bArr, i10, bArr.length)));
        }
    }
}
