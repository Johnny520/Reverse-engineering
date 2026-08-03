package p084ff;

import af.C0081d;
import bf.AbstractC0310b;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.zip.Adler32;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nf.C3001c;
import nf.EnumC3002d;
import nf.InterfaceC2999a;
import p014b.C0126e;
import p020b5.C0192k;
import p044d4.C0689b;
import p082fd.C1211h;
import p141jf.AbstractC2127c;
import p174m.C2571a;
import p262rf.C3803c;
import p332wb.AbstractC4855en;
import p343x6.AbstractC5700d;
import p368yc.AbstractC6026a;

/* JADX INFO: renamed from: ff.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1215a {

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2844b f4076c = AbstractC2846d.m6274b(C1215a.class);

    /* JADX INFO: renamed from: d */
    public static int f4077d = 1;

    /* JADX INFO: renamed from: a */
    public final C1211h f4078a;

    /* JADX INFO: renamed from: b */
    public C2571a f4079b = new C2571a(new C0126e(new C3803c(), 29, EnumSet.noneOf(EnumC3002d.class)), 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1215a(C1211h c1211h) {
        this.f4078a = c1211h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m3348b(byte[] bArr, byte[] bArr2) {
        int length = bArr2.length;
        if (bArr.length >= length) {
            for (int i9 = 0; i9 < length; i9++) {
                if (bArr[i9] == bArr2[i9]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final ArrayList m3349a(File file) {
        List listM3350c;
        InterfaceC2844b interfaceC2844b = f4076c;
        ArrayList arrayList = new ArrayList();
        try {
            C3001c c3001cM6036r = this.f4079b.m6036r(file);
            try {
                for (InterfaceC2999a interfaceC2999a : c3001cM6036r.f9779h) {
                    if (!interfaceC2999a.isDirectory()) {
                        try {
                            if (interfaceC2999a.mo6397a()) {
                                byte[] bytes = interfaceC2999a.getBytes();
                                String name = interfaceC2999a.getName();
                                listM3350c = (m3348b(bytes, AbstractC2127c.f7088a) || name.endsWith(".dex")) ? m3351d(name, bytes) : Collections.EMPTY_LIST;
                            } else {
                                listM3350c = m3350c(null, interfaceC2999a.mo6398b(), interfaceC2999a.getName());
                            }
                            if (!listM3350c.isEmpty()) {
                                arrayList.addAll(listM3350c);
                            }
                        } catch (Exception e6) {
                            interfaceC2844b.mo6260n(interfaceC2999a, "Failed to read zip entry: {}", e6);
                        }
                    }
                }
                c3001cM6036r.close();
            } finally {
            }
        } catch (Exception e7) {
            interfaceC2844b.mo6260n(file.getAbsolutePath(), "Failed to process zip file: {}", e7);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        if (r2 != false) goto L37;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m3350c(File file, InputStream inputStream, String str) throws IOException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            byte[] bArr = new byte[4];
            inputStream.mark(4);
            if (inputStream.read(bArr) != 4) {
                List list = Collections.EMPTY_LIST;
                inputStream.close();
                return list;
            }
            boolean zContains = false;
            if (!m3348b(bArr, AbstractC2127c.f7088a)) {
                if (str.endsWith(".dex")) {
                    f4076c.mo6255i("Invalid DEX magic: 0x{}(\"{}\") in file: {}", AbstractC0310b.m1227a(bArr), new String(bArr, StandardCharsets.US_ASCII), str);
                }
                if (file != null) {
                    if (!m3348b(bArr, AbstractC2127c.f7089b)) {
                        Set set = AbstractC6026a.f24474a;
                        int iLastIndexOf = str.lastIndexOf(46);
                        String strSubstring = iLastIndexOf == -1 ? null : str.substring(iLastIndexOf + 1);
                        if (strSubstring != null) {
                            zContains = AbstractC6026a.f24474a.contains(strSubstring);
                        }
                    }
                    ArrayList arrayListM3349a = m3349a(file);
                    inputStream.close();
                    return arrayListM3349a;
                }
                List list2 = Collections.EMPTY_LIST;
                inputStream.close();
                return list2;
            }
            inputStream.reset();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[8192];
            while (true) {
                int i9 = inputStream.read(bArr2);
                if (i9 == -1) {
                    List listM3351d = m3351d(str, byteArrayOutputStream.toByteArray());
                    inputStream.close();
                    return listM3351d;
                }
                byteArrayOutputStream.write(bArr2, 0, i9);
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final List m3351d(String str, byte[] bArr) {
        C0192k c0192k;
        if (AbstractC5700d.m10275e0(bArr, 36) < 120) {
            c0192k = null;
        } else {
            int iM10275e0 = AbstractC5700d.m10275e0(bArr, 32);
            int iM10275e02 = AbstractC5700d.m10275e0(bArr, 112);
            AbstractC5700d.m10275e0(bArr, 116);
            c0192k = new C0192k(iM10275e0, iM10275e02, 2);
        }
        int i9 = 0;
        if (c0192k == null) {
            return Collections.singletonList(m3352e(str, bArr, 0));
        }
        int iM10275e03 = c0192k.f488b;
        int iMin = Math.min(c0192k.f489c, bArr.length);
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(Integer.valueOf(i9));
            if (iM10275e03 >= iMin) {
                return (List) arrayList.stream().map(new C0689b(this, str, bArr)).collect(Collectors.toList());
            }
            int i10 = iM10275e03;
            iM10275e03 = AbstractC5700d.m10275e0(bArr, iM10275e03 + 32) + iM10275e03;
            i9 = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C1219e m3352e(String str, byte[] bArr, int i9) {
        int i10;
        if (this.f4078a.f4071g) {
            int i11 = i9 + 32;
            if (i9 + 36 > bArr.length) {
                throw new C0081d(AbstractC4855en.m9263g("Dex file truncated, can't read file length, file: ", str));
            }
            int iM10275e0 = AbstractC5700d.m10275e0(bArr, i11);
            if (i9 + iM10275e0 > bArr.length) {
                throw new C0081d("Dex file truncated, length in header: " + iM10275e0 + ", file: " + str);
            }
            int iM10275e02 = AbstractC5700d.m10275e0(bArr, i9 + 8);
            Adler32 adler32 = new Adler32();
            adler32.update(bArr, i9 + 12, iM10275e0 - 12);
            int value = (int) adler32.getValue();
            if (iM10275e02 != value) {
                throw new C0081d(String.format("Bad dex file checksum: 0x%08x, expected: 0x%08x, file: %s", Integer.valueOf(value), Integer.valueOf(iM10275e02), str));
            }
        }
        synchronized (C1215a.class) {
            try {
                int i12 = f4077d + 1;
                f4077d = i12;
                if (i12 >= 65535) {
                    f4077d = 1;
                }
                i10 = f4077d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new C1219e(i10, str, bArr, i9);
    }
}
