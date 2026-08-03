package pa;

import android.text.TextUtils;
import com.alibaba.fastjson2.JSONB;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import na.C2914b;
import p096g8.C1361b;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p116i.C1746e0;
import p136j8.C2104o;
import p162l3.C2458l;
import p294u3.InterfaceC4250c;
import p304uf.C4330d;

/* JADX INFO: renamed from: pa.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3377c {

    /* JADX INFO: renamed from: a */
    public boolean f10905a;

    /* JADX INFO: renamed from: b */
    public boolean f10906b;

    /* JADX INFO: renamed from: c */
    public final Object f10907c;

    /* JADX INFO: renamed from: d */
    public final Object f10908d;

    /* JADX INFO: renamed from: e */
    public final Object f10909e;

    /* JADX INFO: renamed from: f */
    public final Object f10910f;

    /* JADX INFO: renamed from: g */
    public Object f10911g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3377c(InterfaceC4250c interfaceC4250c, C1746e0 c1746e0) {
        interfaceC4250c.getClass();
        this.f10907c = interfaceC4250c;
        this.f10908d = c1746e0;
        this.f10909e = new C4330d(4);
        this.f10910f = new LinkedHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Object m7157c(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            Object field = KavaReflector.readField(obj, "a");
            if (field != null) {
                return field;
            }
        } catch (Throwable unused) {
        }
        try {
            Iterator<Field> it = KavaReflector.declaredFields(obj.getClass()).iterator();
            while (it.hasNext()) {
                try {
                    Object field2 = KavaReflector.readField(it.next(), obj);
                    if (field2 != null && KavaReflector.findMethod(field2.getClass(), "toByteArray", new Class[0]) != null && KavaReflector.findMethod(field2.getClass(), "parseFrom", byte[].class) != null) {
                        return field2;
                    }
                } catch (Throwable unused2) {
                }
            }
            return null;
        } catch (Throwable unused3) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static long[] m7158e(byte[] bArr, int i9, int i10) {
        long j3 = 0;
        int i11 = 0;
        while (i9 < i10 && i11 < 64) {
            int i12 = i9 + 1;
            byte b10 = bArr[i9];
            j3 |= ((long) (b10 & JSONB.Constants.BC_SYMBOL)) << i11;
            if ((b10 & 128) == 0) {
                return new long[]{j3, i12};
            }
            i11 += 7;
            i9 = i12;
        }
        C2104o.m5294t("bad varint");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static C1361b m7159g(byte[] bArr, int i9, int i10) {
        int i11;
        int i12;
        byte[] bArr2;
        if (i9 >= 0 && i9 <= bArr.length && i10 <= 12) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < i9) {
                try {
                    long[] jArrM7158e = m7158e(bArr, i13, i9);
                    long j3 = jArrM7158e[0];
                    i13 = (int) jArrM7158e[1];
                    if (j3 != 0) {
                        int i15 = (int) (7 & j3);
                        if (((int) (j3 >>> 3)) > 0 && i15 != 3 && i15 != 4 && i15 <= 5) {
                            m7161i(byteArrayOutputStream, j3);
                            if (i15 == 0) {
                                long[] jArrM7158e2 = m7158e(bArr, i13, i9);
                                m7161i(byteArrayOutputStream, jArrM7158e2[0]);
                                i13 = (int) jArrM7158e2[1];
                            } else if (i15 == 1) {
                                i11 = i13 + 8;
                                if (i11 <= i9) {
                                    byteArrayOutputStream.write(bArr, i13, 8);
                                    i13 = i11;
                                }
                            } else if (i15 == 2) {
                                long[] jArrM7158e3 = m7158e(bArr, i13, i9);
                                int i16 = (int) jArrM7158e3[0];
                                int i17 = (int) jArrM7158e3[1];
                                if (i16 >= 0 && (i11 = i16 + i17) <= i9) {
                                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i17, i11);
                                    C1361b c1361bM7159g = bArrCopyOfRange.length > 0 ? m7159g(bArrCopyOfRange, bArrCopyOfRange.length, 1 + i10) : null;
                                    if (c1361bM7159g == null || (i12 = c1361bM7159g.f4512c) <= 0) {
                                        i12 = 0;
                                        bArr2 = bArrCopyOfRange;
                                    } else {
                                        bArr2 = c1361bM7159g.f4511b;
                                    }
                                    if (i12 == 0) {
                                        byte[] bArrM7160h = m7160h(bArrCopyOfRange);
                                        if (!Arrays.equals(bArrCopyOfRange, bArrM7160h)) {
                                            i12++;
                                            bArr2 = bArrM7160h;
                                        }
                                    }
                                    m7161i(byteArrayOutputStream, bArr2.length);
                                    byteArrayOutputStream.write(bArr2, 0, bArr2.length);
                                    i14 += i12;
                                    i13 = i11;
                                }
                            } else if (i15 != 5) {
                                continue;
                            } else {
                                i11 = i13 + 4;
                                if (i11 <= i9) {
                                    byteArrayOutputStream.write(bArr, i13, 4);
                                    i13 = i11;
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            return new C1361b(byteArrayOutputStream.toByteArray(), i14);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static byte[] m7160h(byte[] bArr) {
        if (bArr.length == 0) {
            return bArr;
        }
        try {
            Charset charset = StandardCharsets.UTF_8;
            String str = new String(bArr, charset);
            int iIndexOf = str.indexOf("username=");
            if (iIndexOf < 0) {
                return bArr;
            }
            int i9 = iIndexOf + 9;
            int iIndexOf2 = str.indexOf("&", i9);
            if (iIndexOf2 < 0) {
                iIndexOf2 = str.length();
            }
            String strSubstring = str.substring(0, i9);
            String strSubstring2 = str.substring(i9, iIndexOf2);
            String strSubstring3 = str.substring(iIndexOf2);
            ConcurrentHashMap concurrentHashMap = AbstractC3375a.f10902a;
            String strReplace = TextUtils.isEmpty(strSubstring2) ? strSubstring2 : strSubstring2.replace("%40", "%40%40").replace("@", "@@");
            if (strReplace.equals(strSubstring2)) {
                return bArr;
            }
            AbstractC3375a.m7155b(strSubstring2, strReplace);
            return (strSubstring + strReplace + strSubstring3).getBytes(charset);
        } catch (Throwable unused) {
            return bArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m7161i(ByteArrayOutputStream byteArrayOutputStream, long j3) {
        while (((-128) & j3) != 0) {
            byteArrayOutputStream.write((int) ((127 & j3) | 128));
            j3 >>>= 7;
        }
        byteArrayOutputStream.write((int) j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m7162a(String str, ArrayList arrayList) {
        try {
            Class<?> clsLoadClass = KavaReflector.loadClass(str, (ClassLoader) this.f10907c);
            if (clsLoadClass == null || arrayList.contains(clsLoadClass)) {
                return;
            }
            arrayList.add(clsLoadClass);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m7163b(ArrayList arrayList) {
        try {
            Iterator<Class<?>> it = ((DexFinder) this.f10908d).packetQueueClasses.iterator();
            while (it.hasNext()) {
                Iterator<Method> it2 = KavaReflector.declaredMethods(it.next()).iterator();
                while (it2.hasNext()) {
                    Class<?>[] parameterTypes = it2.next().getParameterTypes();
                    if (parameterTypes != null) {
                        for (Class<?> cls : parameterTypes) {
                            try {
                                Iterator<Method> it3 = KavaReflector.declaredMethods(cls).iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        Method next = it3.next();
                                        if ("dispatch".equals(next.getName()) && next.getParameterTypes().length == 3 && !arrayList.contains(cls)) {
                                            arrayList.add(cls);
                                            break;
                                        }
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m7164d(String str) {
        C2914b c2914b = (C2914b) this.f10910f;
        if (c2914b != null) {
            c2914b.f9449h.m6327d(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m7165f(byte[] bArr) {
        byte[] bArrCopyOfRange;
        C1361b c1361bM7159g;
        try {
            if (bArr.length != 0) {
                byte[] bArrCopyOfRange2 = new byte[0];
                if (bArr.length < 4 || (bArr[0] & 255) != 0) {
                    bArrCopyOfRange = bArr;
                } else {
                    bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 0, 4);
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, 4, bArr.length);
                }
                if (bArrCopyOfRange != null) {
                    byte[] bArr2 = (bArrCopyOfRange.length == 0 || (c1361bM7159g = m7159g(bArrCopyOfRange, bArrCopyOfRange.length, 0)) == null || c1361bM7159g.f4512c <= 0) ? bArrCopyOfRange : c1361bM7159g.f4511b;
                    if (!Arrays.equals(bArrCopyOfRange, bArr2)) {
                        if (bArrCopyOfRange2 == null || bArrCopyOfRange2.length == 0) {
                            bArrCopyOfRange2 = bArr2 == null ? new byte[0] : bArr2;
                        } else if (bArr2 != null && bArr2.length != 0) {
                            byte[] bArr3 = new byte[bArrCopyOfRange2.length + bArr2.length];
                            System.arraycopy(bArrCopyOfRange2, 0, bArr3, 0, bArrCopyOfRange2.length);
                            System.arraycopy(bArr2, 0, bArr3, bArrCopyOfRange2.length, bArr2.length);
                            bArrCopyOfRange2 = bArr3;
                        }
                        if (Arrays.equals(bArr, bArrCopyOfRange2)) {
                            return null;
                        }
                        return bArrCopyOfRange2;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            m7164d("ERROR 发包PB篡改失败: " + th2.getMessage());
            return null;
        }
    }

    public C3377c(ClassLoader classLoader, DexFinder dexFinder, C2458l c2458l, C2914b c2914b) {
        this.f10911g = new ConcurrentHashMap();
        this.f10907c = classLoader;
        this.f10908d = dexFinder;
        this.f10909e = c2458l;
        this.f10910f = c2914b;
    }
}
