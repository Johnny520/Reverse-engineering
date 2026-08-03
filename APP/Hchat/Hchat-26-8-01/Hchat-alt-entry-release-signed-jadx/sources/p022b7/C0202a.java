package p022b7;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import p007a7.AbstractC0018a;
import p007a7.C0021d;
import p034c7.C0405a;
import p068eh.AbstractC0921a;
import p124i7.C1994d;
import p136j8.C2104o;

/* JADX INFO: renamed from: b7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0202a {

    /* JADX INFO: renamed from: c */
    public static final C0202a f501c = new C0202a();

    /* JADX INFO: renamed from: a */
    public C0021d f502a;

    /* JADX INFO: renamed from: b */
    public HashMap f503b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0021d m864a() {
        synchronized (this) {
            try {
                C0021d c0021d = this.f502a;
                if (c0021d == null) {
                    return null;
                }
                c0021d.m281x();
                return c0021d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Map m865b() {
        HashMap map;
        HashMap map2 = this.f503b;
        if (map2 != null) {
            return map2;
        }
        synchronized (this) {
            map = new HashMap();
            int i9 = 36;
            for (int i10 = 23; i10 < i9; i10++) {
                String str = "/frameworks/android/android-" + i10 + ".apk";
                InputStream resourceAsStream = C0202a.class.getResourceAsStream(str);
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (IOException unused) {
                    }
                    map.put(Integer.valueOf(i10), str);
                    if (i10 + 1 == i9) {
                        i9++;
                    }
                }
            }
            this.f503b = map;
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0021d m866c(int i9) throws IOException {
        String str = (String) ((HashMap) m865b()).get(Integer.valueOf(i9));
        if (str == null) {
            C2104o.m5299y(AbstractC0921a.m2249l(i9, "No resource found for version: "));
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            iLastIndexOf = str.lastIndexOf(File.separatorChar);
        }
        String strSubstring = iLastIndexOf > 0 ? str.substring(iLastIndexOf + 1) : str;
        int iLastIndexOf2 = strSubstring.lastIndexOf(46);
        if (iLastIndexOf2 >= 0) {
            strSubstring = strSubstring.substring(0, iLastIndexOf2);
        }
        InputStream resourceAsStream = AbstractC0018a.class.getResourceAsStream(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024000];
        while (true) {
            int i10 = resourceAsStream.read(bArr, 0, bArr.length);
            if (i10 < 0) {
                resourceAsStream.close();
                byteArrayOutputStream.close();
                C0021d c0021d = new C0021d(strSubstring, new C0405a(new C1994d(byteArrayOutputStream.toByteArray()), 0).m1364a());
                c0021d.m280w();
                return c0021d;
            }
            byteArrayOutputStream.write(bArr, 0, i10);
            int length = bArr.length;
            if (i10 == length && length < 10240000) {
                bArr = new byte[length + 1024000];
            }
        }
    }
}
