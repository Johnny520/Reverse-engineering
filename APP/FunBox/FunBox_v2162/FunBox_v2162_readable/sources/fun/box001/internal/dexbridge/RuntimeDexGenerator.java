package fun.box001.internal.dexbridge;

import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.output.InterfaceC0199a;
import fun.box001.internal.dexformat.writer.C0159j;
import fun.box001.internal.dexformat.writer.C0169t;
import fun.box001.internal.dexformat.writer.C0170u;
import fun.box001.internal.dexformat.writer.InterfaceC0155f;
import fun.box001.internal.dexmaker.C0004a;
import fun.box001.internal.dexmaker.C0009f;
import fun.box001.internal.dexmaker.C0011h;
import fun.box001.internal.dexmaker.C0012i;
import fun.box001.internal.dexmaker.C0013j;
import fun.box001.internal.hookbackend.HookRecord;
import fun.box001.loader.utils.FileUtils;
import fun.box001.shared.Env;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: a.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class RuntimeDexGenerator implements InterfaceC0155f {
    /* JADX INFO: renamed from: e */
    public static byte[] m0e(String str, String str2, Class cls, Class[] clsArr, boolean z, int i2) {
        C0013j c0013jM65b;
        Integer num;
        C0009f c0009f;
        Integer num2;
        C0013j[] c0013jArr;
        C0013j c0013j;
        C0009f c0009f2 = new C0009f();
        str.getClass();
        Integer num3 = 0;
        switch (str) {
            case "double":
                c0013jM65b = C0013j.f44g;
                break;
            case "int":
                c0013jM65b = C0013j.f46i;
                break;
            case "byte":
                c0013jM65b = C0013j.f42e;
                break;
            case "char":
                c0013jM65b = C0013j.f43f;
                break;
            case "long":
                c0013jM65b = C0013j.f47j;
                break;
            case "void":
                c0013jM65b = C0013j.f49l;
                break;
            case "boolean":
                c0013jM65b = C0013j.f41d;
                break;
            case "float":
                c0013jM65b = C0013j.f45h;
                break;
            case "short":
                c0013jM65b = C0013j.f48k;
                break;
            default:
                if (str.startsWith("[")) {
                    c0013jM65b = C0013j.m65b(str);
                    break;
                } else {
                    c0013jM65b = C0013j.m65b("L" + str.replace(".", "/") + ";");
                    break;
                }
                break;
        }
        c0009f2.m58b(c0013jM65b, C0013j.f50m, new C0013j[0]);
        C0013j c0013jM64a = C0013j.m64a(Object[].class);
        C0013j[] c0013jArr2 = new C0013j[clsArr.length];
        for (int i3 = 0; i3 < clsArr.length; i3++) {
            if (m5j(clsArr[i3].getName())) {
                c0013jArr2[i3] = C0013j.m64a(clsArr[i3]);
            } else {
                c0013jArr2[i3] = C0013j.f50m;
            }
        }
        C0013j c0013jM64a2 = m5j(cls.getName()) ? C0013j.m64a(cls) : C0013j.f50m;
        C0012i c0012iM66c = c0013jM65b.m66c(c0013jM64a2, str2, c0013jArr2);
        C0004a c0004aM57a = z ? c0009f2.m57a(c0012iM66c, 9) : c0009f2.m57a(c0012iM66c, 1);
        C0011h c0011hM37n = c0004aM57a.m37n(C0013j.f46i);
        C0013j c0013j2 = C0013j.f50m;
        C0011h c0011hM37n2 = c0004aM57a.m37n(c0013j2);
        C0011h c0011hM37n3 = c0004aM57a.m37n(c0013jM64a);
        C0011h c0011hM37n4 = c0004aM57a.m37n(c0013jM64a2);
        C0011h c0011hM37n5 = c0004aM57a.m37n(c0013j2);
        c0004aM57a.m35k(c0011hM37n, Integer.valueOf(clsArr.length));
        c0004aM57a.m36m(c0011hM37n3, c0011hM37n);
        int i4 = 0;
        while (i4 < clsArr.length) {
            c0004aM57a.m35k(c0011hM37n, Integer.valueOf(i4));
            if (m5j(clsArr[i4].getName())) {
                c0009f = c0009f2;
                if (clsArr[i4].equals(Integer.TYPE)) {
                    C0013j c0013jM64a3 = C0013j.m64a(Integer.class);
                    c0013jArr = c0013jArr2;
                    C0013j c0013jM64a4 = C0013j.m64a(Integer.class);
                    c0013j = c0013jM64a2;
                    C0013j c0013j3 = C0013j.f46i;
                    num2 = num3;
                    c0004aM57a.m33i(c0013jM64a3.m66c(c0013jM64a4, "valueOf", c0013j3), c0011hM37n2, c0004aM57a.m30e(i4, c0013j3));
                } else {
                    num2 = num3;
                    c0013jArr = c0013jArr2;
                    c0013j = c0013jM64a2;
                    if (clsArr[i4].equals(Long.TYPE)) {
                        C0013j c0013jM64a5 = C0013j.m64a(Long.class);
                        C0013j c0013jM64a6 = C0013j.m64a(Long.class);
                        C0013j c0013j4 = C0013j.f47j;
                        c0004aM57a.m33i(c0013jM64a5.m66c(c0013jM64a6, "valueOf", c0013j4), c0011hM37n2, c0004aM57a.m30e(i4, c0013j4));
                    } else if (clsArr[i4].equals(Float.TYPE)) {
                        C0013j c0013jM64a7 = C0013j.m64a(Float.class);
                        C0013j c0013jM64a8 = C0013j.m64a(Float.class);
                        C0013j c0013j5 = C0013j.f45h;
                        c0004aM57a.m33i(c0013jM64a7.m66c(c0013jM64a8, "valueOf", c0013j5), c0011hM37n2, c0004aM57a.m30e(i4, c0013j5));
                    } else if (clsArr[i4].equals(Boolean.TYPE)) {
                        C0013j c0013jM64a9 = C0013j.m64a(Boolean.class);
                        C0013j c0013jM64a10 = C0013j.m64a(Boolean.class);
                        C0013j c0013j6 = C0013j.f41d;
                        c0004aM57a.m33i(c0013jM64a9.m66c(c0013jM64a10, "valueOf", c0013j6), c0011hM37n2, c0004aM57a.m30e(i4, c0013j6));
                    } else if (clsArr[i4].equals(Double.TYPE)) {
                        C0013j c0013jM64a11 = C0013j.m64a(Double.class);
                        C0013j c0013jM64a12 = C0013j.m64a(Double.class);
                        C0013j c0013j7 = C0013j.f44g;
                        c0004aM57a.m33i(c0013jM64a11.m66c(c0013jM64a12, "valueOf", c0013j7), c0011hM37n2, c0004aM57a.m30e(i4, c0013j7));
                    } else if (clsArr[i4].equals(Byte.TYPE)) {
                        C0013j c0013jM64a13 = C0013j.m64a(Byte.class);
                        C0013j c0013jM64a14 = C0013j.m64a(Byte.class);
                        C0013j c0013j8 = C0013j.f42e;
                        c0004aM57a.m33i(c0013jM64a13.m66c(c0013jM64a14, "valueOf", c0013j8), c0011hM37n2, c0004aM57a.m30e(i4, c0013j8));
                    } else if (clsArr[i4].equals(Character.TYPE)) {
                        C0013j c0013jM64a15 = C0013j.m64a(Character.class);
                        C0013j c0013jM64a16 = C0013j.m64a(Character.class);
                        C0013j c0013j9 = C0013j.f43f;
                        c0004aM57a.m33i(c0013jM64a15.m66c(c0013jM64a16, "valueOf", c0013j9), c0011hM37n2, c0004aM57a.m30e(i4, c0013j9));
                    } else if (clsArr[i4].equals(Short.TYPE)) {
                        C0013j c0013jM64a17 = C0013j.m64a(Short.class);
                        C0013j c0013jM64a18 = C0013j.m64a(Short.class);
                        C0013j c0013j10 = C0013j.f48k;
                        c0004aM57a.m33i(c0013jM64a17.m66c(c0013jM64a18, "valueOf", c0013j10), c0011hM37n2, c0004aM57a.m30e(i4, c0013j10));
                    }
                }
                c0004aM57a.m28b(c0011hM37n3, c0011hM37n, c0011hM37n2);
            } else {
                c0009f = c0009f2;
                num2 = num3;
                c0013jArr = c0013jArr2;
                c0013j = c0013jM64a2;
                c0004aM57a.m28b(c0011hM37n3, c0011hM37n, c0004aM57a.m30e(i4, C0013j.f50m));
            }
            i4++;
            c0013jArr2 = c0013jArr;
            c0009f2 = c0009f;
            c0013jM64a2 = c0013j;
            num3 = num2;
        }
        C0009f c0009f3 = c0009f2;
        Integer num4 = num3;
        C0013j[] c0013jArr3 = c0013jArr2;
        C0013j c0013j11 = c0013jM64a2;
        c0004aM57a.m35k(c0011hM37n, Integer.valueOf(i2));
        if (z) {
            c0004aM57a.m35k(c0011hM37n4, null);
            C0013j c0013jM65b2 = C0013j.m65b("Lcom/shooker/ReplaceCallback;");
            C0013j c0013j12 = C0013j.f50m;
            c0004aM57a.m33i(c0013jM65b2.m66c(c0013j12, "doCall", C0013j.f46i, c0013j12, c0013jM64a), c0011hM37n5, c0011hM37n, c0011hM37n4, c0011hM37n3);
        } else {
            C0013j c0013jM65b3 = C0013j.m65b("Lcom/shooker/ReplaceCallback;");
            C0013j c0013j13 = C0013j.f50m;
            c0004aM57a.m33i(c0013jM65b3.m66c(c0013j13, "doCall", C0013j.f46i, c0013j13, c0013jM64a), c0011hM37n5, c0011hM37n, c0004aM57a.m31f(c0013jM65b), c0011hM37n3);
        }
        if (cls.equals(Void.TYPE)) {
            c0004aM57a.m40q();
            num = num4;
        } else {
            String name = cls.getName();
            if (name.equals("double")) {
                num = num4;
                c0004aM57a.m34j(C0013j.m64a(Double.class).m66c(C0013j.f44g, "doubleValue", new C0013j[0]), c0011hM37n4, c0011hM37n5, new C0011h[0]);
            } else if (name.equals("int")) {
                num = num4;
                c0004aM57a.m34j(C0013j.m64a(Integer.class).m66c(C0013j.f46i, "intValue", new C0013j[0]), c0011hM37n4, c0011hM37n5, new C0011h[0]);
            } else if (name.equals("byte")) {
                num = num4;
                c0004aM57a.m34j(C0013j.m64a(Byte.class).m66c(C0013j.f42e, "byteValue", new C0013j[0]), c0011hM37n4, c0011hM37n5, new C0011h[0]);
            } else if (name.equals("char")) {
                num = num4;
                c0004aM57a.m34j(C0013j.m64a(Character.class).m66c(C0013j.f43f, "charValue", new C0013j[0]), c0011hM37n4, c0011hM37n5, new C0011h[0]);
            } else if (name.equals("long")) {
                num = num4;
                c0004aM57a.m34j(C0013j.m64a(Long.class).m66c(C0013j.f47j, "longValue", new C0013j[0]), c0011hM37n4, c0011hM37n5, new C0011h[0]);
            } else if (name.equals("void")) {
                num = num4;
                c0004aM57a.m35k(c0011hM37n4, num);
            } else {
                if (name.equals("boolean")) {
                    c0004aM57a.m34j(C0013j.m64a(Boolean.class).m66c(C0013j.f41d, "booleanValue", new C0013j[0]), c0011hM37n4, c0011hM37n5, new C0011h[0]);
                } else if (name.equals("float")) {
                    c0004aM57a.m34j(C0013j.m64a(Float.class).m66c(C0013j.f45h, "floatValue", new C0013j[0]), c0011hM37n4, c0011hM37n5, new C0011h[0]);
                } else if (name.equals("short")) {
                    c0004aM57a.m34j(C0013j.m64a(Short.class).m66c(C0013j.f48k, "shortValue", new C0013j[0]), c0011hM37n4, c0011hM37n5, new C0011h[0]);
                } else {
                    c0004aM57a.m29c(c0011hM37n4, c0011hM37n5);
                }
                num = num4;
            }
            c0004aM57a.m39p(c0011hM37n4);
        }
        C0004a c0004aM57a2 = c0009f3.m57a(c0013jM65b.m66c(c0013j11, "backup", c0013jArr3), 1);
        C0011h c0011hM37n6 = c0004aM57a2.m37n(c0013j11);
        if (cls.equals(Void.TYPE)) {
            c0004aM57a2.m40q();
        } else {
            if (cls.isPrimitive()) {
                c0004aM57a2.m35k(c0011hM37n6, num);
            } else {
                c0004aM57a2.m35k(c0011hM37n6, null);
            }
            c0004aM57a2.m39p(c0011hM37n6);
        }
        return c0009f3.m59c();
    }

    /* JADX INFO: renamed from: f */
    public static String m1f(int i2) {
        return m4i(i2, 30257, 1);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2g(int[] iArr, int i2) {
        return (iArr[i2 >> 5] & (1 << (i2 & 31))) != 0;
    }

    /* JADX INFO: renamed from: h */
    public static String m3h(String str) {
        String strValueOf = String.valueOf(Math.abs((str + Env.process_name).hashCode()));
        StringBuilder sb = new StringBuilder("4cd6974be1_10096_null_");
        sb.append(strValueOf);
        return Env.data_dir + "/files/mmkv\u200b/" + sb.toString();
    }

    /* JADX INFO: renamed from: i */
    private static String m4i(int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder(80);
        int i5 = (~i3) & i2;
        int i6 = i2 & i3;
        if ((i6 & 1) != 0) {
            sb.append("|public");
        }
        if ((i6 & 2) != 0) {
            sb.append("|private");
        }
        if ((i6 & 4) != 0) {
            sb.append("|protected");
        }
        if ((i6 & 8) != 0) {
            sb.append("|static");
        }
        if ((i6 & 16) != 0) {
            sb.append("|final");
        }
        if ((i6 & 32) != 0) {
            sb.append(i4 == 1 ? "|super" : "|synchronized");
        }
        if ((i6 & 64) != 0) {
            sb.append(i4 == 3 ? "|bridge" : "|volatile");
        }
        if ((i6 & 128) != 0) {
            sb.append(i4 == 3 ? "|varargs" : "|transient");
        }
        if ((i6 & 256) != 0) {
            sb.append("|native");
        }
        if ((i6 & 512) != 0) {
            sb.append("|interface");
        }
        if ((i6 & 1024) != 0) {
            sb.append("|abstract");
        }
        if ((i6 & 2048) != 0) {
            sb.append("|strictfp");
        }
        if ((i6 & 4096) != 0) {
            sb.append("|synthetic");
        }
        if ((i6 & 8192) != 0) {
            sb.append("|annotation");
        }
        if ((i6 & 16384) != 0) {
            sb.append("|enum");
        }
        if ((65536 & i6) != 0) {
            sb.append("|constructor");
        }
        if ((i6 & 131072) != 0) {
            sb.append("|declared_synchronized");
        }
        if (i5 != 0 || sb.length() == 0) {
            sb.append('|');
            sb.append(m11q(i5));
        }
        return sb.substring(1);
    }

    /* JADX INFO: renamed from: j */
    private static boolean m5j(String str) {
        switch (str) {
            case "double":
            case "int":
            case "byte":
            case "char":
            case "long":
            case "void":
            case "boolean":
            case "float":
            case "short":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m6k(int i2) {
        int i3;
        if (i2 < -1) {
            return false;
        }
        return i2 == -1 || (i3 = i2 & 255) == 0 || i3 == 255 || (i2 & 65280) == 0;
    }

    /* JADX INFO: renamed from: l */
    public static void m7l() throws IOException {
        FileUtils.m223d(m3h("fun_loader"), FileUtils.readZipEntry(Env.module_path, "lib/arm64-v8a/libloader.so"));
        System.load(m3h("fun_loader"));
    }

    /* JADX INFO: renamed from: m */
    public static String m8m(int i2) {
        return m4i(i2, 204287, 3);
    }

    /* JADX INFO: renamed from: o */
    public static void m9o() {
        new File(Env.data_dir + "/files/mmkv\u200b").mkdirs();
        String strM3h = m3h("app.bin");
        String strM222c = FileUtils.m222c(strM3h);
        String strM222c2 = FileUtils.m222c(Env.module_core_path);
        if (strM222c == null || strM222c2 == null || !strM222c.equals(strM222c2)) {
            FileUtils.m220a(Env.module_core_path, strM3h);
        }
        Env.isHotLoading = false;
    }

    /* JADX INFO: renamed from: p */
    public static String m10p(int i2) {
        char[] cArr = new char[2];
        for (int i3 = 0; i3 < 2; i3++) {
            cArr[1 - i3] = Character.forDigit(i2 & 15, 16);
            i2 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: q */
    public static String m11q(int i2) {
        char[] cArr = new char[4];
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[3 - i3] = Character.forDigit(i2 & 15, 16);
            i2 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: r */
    public static String m12r(int i2) {
        return i2 == ((char) i2) ? m11q(i2) : m13s(i2);
    }

    /* JADX INFO: renamed from: s */
    public static String m13s(int i2) {
        char[] cArr = new char[8];
        for (int i3 = 0; i3 < 8; i3++) {
            cArr[7 - i3] = Character.forDigit(i2 & 15, 16);
            i2 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: t */
    public static String m14t(long j2) {
        char[] cArr = new char[16];
        for (int i2 = 0; i2 < 16; i2++) {
            cArr[15 - i2] = Character.forDigit(((int) j2) & 15, 16);
            j2 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: u */
    public static int m15u(int i2) {
        int i3 = i2 >> 7;
        int i4 = 0;
        while (i3 != 0) {
            i3 >>= 7;
            i4++;
        }
        return i4 + 1;
    }

    /* JADX INFO: renamed from: v */
    public static void m16v(InterfaceC0199a interfaceC0199a, int i2, long j2) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j2);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i3 = (iNumberOfTrailingZeros + 7) >> 3;
        long j3 = j2 >> (64 - (i3 * 8));
        C0202d c0202d = (C0202d) interfaceC0199a;
        c0202d.m496p(i2 | ((i3 - 1) << 5));
        while (i3 > 0) {
            c0202d.m496p((byte) j3);
            j3 >>= 8;
            i3--;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m17w(InterfaceC0199a interfaceC0199a, int i2, long j2) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j2);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i3 = (iNumberOfLeadingZeros + 7) >> 3;
        C0202d c0202d = (C0202d) interfaceC0199a;
        c0202d.m496p(i2 | ((i3 - 1) << 5));
        while (i3 > 0) {
            c0202d.m496p((byte) j2);
            j2 >>= 8;
            i3--;
        }
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: a */
    public void mo18a(C0170u c0170u) {
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: c */
    public void mo19c(C0159j c0159j) {
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: d */
    public void mo20d(C0169t c0169t) {
    }

    /* JADX INFO: renamed from: n */
    public abstract Object mo21n(HookRecord hookRecord, Object obj, Object[] objArr);
}
