package androidx.profileinstaller;

import android.content.pm.PackageInfo;
import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.client.plugins.api.C3885;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.profileinstaller.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2439 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3885 f7106 = new C3885(11);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f7105 = {112, 114, 111, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f7104 = {112, 114, 109, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final byte[] f7103 = {48, 49, 53, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final byte[] f7102 = {48, 49, 48, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final byte[] f7101 = {48, 48, 57, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final byte[] f7108 = {48, 48, 53, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final byte[] f7107 = {48, 48, 49, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final byte[] f7109 = {48, 48, 49, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final byte[] f7110 = {48, 48, 50, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static byte[] m4528(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                C5919.m11250(AbstractC6136.m11556(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m4529(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m4530(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f7107;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f7108;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return AbstractC0053.m146(AbstractC0053.m149(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m4531(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m4531(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static byte[] m4532(C2443[] c2443Arr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (C2443 c2443 : c2443Arr) {
            length += ((((c2443.f7118 * 2) + 7) & (-8)) / 8) + (c2443.f7112 * 2) + m4530(c2443.f7116, c2443.f7115, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c2443.f7111;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f7101)) {
            int length2 = c2443Arr.length;
            while (i < length2) {
                C2443 c24432 = c2443Arr[i];
                m4540(byteArrayOutputStream, c24432, m4530(c24432.f7116, c24432.f7115, bArr));
                m4543(byteArrayOutputStream, c24432);
                i++;
            }
        } else {
            for (C2443 c24433 : c2443Arr) {
                m4540(byteArrayOutputStream, c24433, m4530(c24433.f7116, c24433.f7115, bArr));
            }
            int length3 = c2443Arr.length;
            while (i < length3) {
                m4543(byteArrayOutputStream, c2443Arr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static byte[] m4533(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m4534(android.content.Context r18, java.util.concurrent.Executor r19, androidx.profileinstaller.InterfaceC2440 r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.AbstractC2439.m4534(android.content.Context, java.util.concurrent.Executor, androidx.profileinstaller.飘花落叶言子楪世兰苏哲, boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m4535(ByteArrayOutputStream byteArrayOutputStream, C2443 c2443) throws IOException {
        int i = 0;
        for (Map.Entry entry : c2443.f7119.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m4537(byteArrayOutputStream, iIntValue - i);
                m4537(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m4536(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static void m4537(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m4536(byteArrayOutputStream, i, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C2443[] m4538(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C2443[0];
        }
        C2443[] c2443Arr = new C2443[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM4539 = (int) m4539(byteArrayInputStream, 2);
            int iM45392 = (int) m4539(byteArrayInputStream, 2);
            c2443Arr[i3] = new C2443(str, new String(m4528(byteArrayInputStream, iM4539), StandardCharsets.UTF_8), m4539(byteArrayInputStream, 4), iM45392, (int) m4539(byteArrayInputStream, 4), (int) m4539(byteArrayInputStream, 4), new int[iM45392], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C2443 c2443 = c2443Arr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c2443.f7111;
            int i6 = c2443.f7118;
            TreeMap treeMap = c2443.f7119;
            int i7 = iAvailable - i5;
            int iM45393 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM45393 += (int) m4539(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM45393), 1);
                int iM45394 = (int) m4539(byteArrayInputStream, 2);
                while (iM45394 > 0) {
                    m4539(byteArrayInputStream, 2);
                    int iM45395 = (int) m4539(byteArrayInputStream, 1);
                    if (iM45395 != 6 && iM45395 != 7) {
                        while (iM45395 > 0) {
                            m4539(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM45396 = (int) m4539(byteArrayInputStream, 1); iM45396 > 0; iM45396--) {
                                m4539(byteArrayInputStream, 2);
                            }
                            iM45395--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM45394--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                C5919.m11250("Read too much data during profile line parse");
                return null;
            }
            c2443.f7117 = m4545(byteArrayInputStream, c2443.f7112);
            BitSet bitSetValueOf = BitSet.valueOf(m4528(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return c2443Arr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static long m4539(InputStream inputStream, int i) throws IOException {
        byte[] bArrM4528 = m4528(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM4528[i2] & DefaultClassResolver.NAME)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static void m4540(ByteArrayOutputStream byteArrayOutputStream, C2443 c2443, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m4537(byteArrayOutputStream, str.getBytes(charset).length);
        m4537(byteArrayOutputStream, c2443.f7112);
        m4536(byteArrayOutputStream, c2443.f7111, 4);
        m4536(byteArrayOutputStream, c2443.f7114, 4);
        m4536(byteArrayOutputStream, c2443.f7118, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m4541(ByteArrayOutputStream byteArrayOutputStream, int i, C2443 c2443) throws IOException {
        int i2 = c2443.f7118;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c2443.f7119.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m4542(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C2443[] c2443Arr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f7103;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f7102;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM4532 = m4532(c2443Arr, bArr3);
                m4536(byteArrayOutputStream, c2443Arr.length, 1);
                m4536(byteArrayOutputStream, bArrM4532.length, 4);
                byte[] bArrM4533 = m4533(bArrM4532);
                m4536(byteArrayOutputStream, bArrM4533.length, 4);
                byteArrayOutputStream.write(bArrM4533);
                return true;
            }
            byte[] bArr4 = f7108;
            if (Arrays.equals(bArr, bArr4)) {
                m4536(byteArrayOutputStream, c2443Arr.length, 1);
                for (C2443 c2443 : c2443Arr) {
                    int size = c2443.f7119.size() * 4;
                    String strM4530 = m4530(c2443.f7116, c2443.f7115, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m4537(byteArrayOutputStream, strM4530.getBytes(charset).length);
                    m4537(byteArrayOutputStream, c2443.f7117.length);
                    m4536(byteArrayOutputStream, size, 4);
                    m4536(byteArrayOutputStream, c2443.f7114, 4);
                    byteArrayOutputStream.write(strM4530.getBytes(charset));
                    Iterator it = c2443.f7119.keySet().iterator();
                    while (it.hasNext()) {
                        m4537(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m4537(byteArrayOutputStream, 0);
                    }
                    for (int i2 : c2443.f7117) {
                        m4537(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = f7101;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM45322 = m4532(c2443Arr, bArr5);
                m4536(byteArrayOutputStream, c2443Arr.length, 1);
                m4536(byteArrayOutputStream, bArrM45322.length, 4);
                byte[] bArrM45332 = m4533(bArrM45322);
                m4536(byteArrayOutputStream, bArrM45332.length, 4);
                byteArrayOutputStream.write(bArrM45332);
                return true;
            }
            byte[] bArr6 = f7107;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m4537(byteArrayOutputStream, c2443Arr.length);
            for (C2443 c24432 : c2443Arr) {
                String str = c24432.f7116;
                TreeMap treeMap = c24432.f7119;
                String strM45302 = m4530(str, c24432.f7115, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m4537(byteArrayOutputStream, strM45302.getBytes(charset2).length);
                m4537(byteArrayOutputStream, treeMap.size());
                m4537(byteArrayOutputStream, c24432.f7117.length);
                m4536(byteArrayOutputStream, c24432.f7114, 4);
                byteArrayOutputStream.write(strM45302.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m4537(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : c24432.f7117) {
                    m4537(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m4537(byteArrayOutputStream2, c2443Arr.length);
            int i4 = 2;
            int i5 = 2;
            for (C2443 c24433 : c2443Arr) {
                m4536(byteArrayOutputStream2, c24433.f7114, 4);
                m4536(byteArrayOutputStream2, c24433.f7113, 4);
                m4536(byteArrayOutputStream2, c24433.f7118, 4);
                String strM45303 = m4530(c24433.f7116, c24433.f7115, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM45303.getBytes(charset3).length;
                m4537(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strM45303.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            C2447 c2447 = new C2447(FileSectionType.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c2447);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            for (int i7 = 0; i7 < c2443Arr.length; i7++) {
                try {
                    C2443 c24434 = c2443Arr[i7];
                    m4537(byteArrayOutputStream3, i7);
                    m4537(byteArrayOutputStream3, c24434.f7112);
                    i6 = i6 + 4 + (c24434.f7112 * i4);
                    int[] iArr = c24434.f7117;
                    int length3 = iArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        int i10 = iArr[i8];
                        m4537(byteArrayOutputStream3, i10 - i9);
                        i8++;
                        i4 = i4;
                        i9 = i10;
                    }
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i6 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
            }
            C2447 c24472 = new C2447(FileSectionType.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c24472);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < c2443Arr.length) {
                try {
                    C2443 c24435 = c2443Arr[i11];
                    Iterator it3 = c24435.f7119.entrySet().iterator();
                    int iIntValue = i;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m4541(byteArrayOutputStream4, iIntValue, c24435);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m4535(byteArrayOutputStream4, c24435);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m4537(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m4536(byteArrayOutputStream3, length4, 4);
                            m4537(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i = 0;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            C2447 c24473 = new C2447(FileSectionType.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c24473);
            long size2 = 12 + ((long) (arrayList2.size() * 16));
            m4536(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                C2447 c24474 = (C2447) arrayList2.get(i14);
                FileSectionType fileSectionType = c24474.f7132;
                byte[] bArr7 = c24474.f7131;
                m4536(byteArrayOutputStream, fileSectionType.getValue(), 4);
                m4536(byteArrayOutputStream, size2, 4);
                if (c24474.f7130) {
                    long length5 = bArr7.length;
                    byte[] bArrM45333 = m4533(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM45333);
                    m4536(byteArrayOutputStream, bArrM45333.length, 4);
                    m4536(byteArrayOutputStream, length5, 4);
                    length = bArrM45333.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m4536(byteArrayOutputStream, bArr7.length, 4);
                    m4536(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i14++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i15));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m4543(ByteArrayOutputStream byteArrayOutputStream, C2443 c2443) throws IOException {
        m4535(byteArrayOutputStream, c2443);
        int i = c2443.f7118;
        int[] iArr = c2443.f7117;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            m4537(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c2443.f7119.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static byte[] m4544(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int[] m4545(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM4539 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM4539 += (int) m4539(byteArrayInputStream, 2);
            iArr[i2] = iM4539;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C2443[] m4546(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C2443[] c2443Arr) throws IOException {
        C2443 c2443;
        if (byteArrayInputStream.available() == 0) {
            return new C2443[0];
        }
        if (i != c2443Arr.length) {
            C5919.m11250("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            m4539(byteArrayInputStream, 2);
            String str = new String(m4528(byteArrayInputStream, (int) m4539(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM4539 = m4539(byteArrayInputStream, 4);
            int iM4539 = (int) m4539(byteArrayInputStream, 2);
            if (c2443Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < c2443Arr.length; i3++) {
                    if (c2443Arr[i3].f7115.equals(strSubstring)) {
                        c2443 = c2443Arr[i3];
                        break;
                    }
                }
                c2443 = null;
            } else {
                c2443 = null;
            }
            if (c2443 == null) {
                C5919.m11250("Missing profile key: ".concat(str));
                return null;
            }
            c2443.f7113 = jM4539;
            int[] iArrM4545 = m4545(byteArrayInputStream, iM4539);
            if (Arrays.equals(bArr, f7107)) {
                c2443.f7112 = iM4539;
                c2443.f7117 = iArrM4545;
            }
        }
        return c2443Arr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C2443[] m4547(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f7102)) {
            C5919.m11250("Unsupported version");
            return null;
        }
        int iM4539 = (int) m4539(fileInputStream, 1);
        byte[] bArrM4544 = m4544(fileInputStream, (int) m4539(fileInputStream, 4), (int) m4539(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C5919.m11250("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM4544);
        try {
            C2443[] c2443ArrM4538 = m4538(byteArrayInputStream, str, iM4539);
            byteArrayInputStream.close();
            return c2443ArrM4538;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C2443[] m4548(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C2443[] c2443Arr) throws IOException {
        byte[] bArr3 = f7109;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f7110)) {
                C5919.m11250("Unsupported meta version");
                return null;
            }
            int iM4539 = (int) m4539(fileInputStream, 2);
            byte[] bArrM4544 = m4544(fileInputStream, (int) m4539(fileInputStream, 4), (int) m4539(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                C5919.m11250("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM4544);
            try {
                C2443[] c2443ArrM4546 = m4546(byteArrayInputStream, bArr2, iM4539, c2443Arr);
                byteArrayInputStream.close();
                return c2443ArrM4546;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f7103, bArr2)) {
            C5919.m11250("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            C5919.m11250("Unsupported meta version");
            return null;
        }
        int iM45392 = (int) m4539(fileInputStream, 1);
        byte[] bArrM45442 = m4544(fileInputStream, (int) m4539(fileInputStream, 4), (int) m4539(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C5919.m11250("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM45442);
        try {
            C2443[] c2443ArrM4549 = m4549(byteArrayInputStream2, iM45392, c2443Arr);
            byteArrayInputStream2.close();
            return c2443ArrM4549;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C2443[] m4549(ByteArrayInputStream byteArrayInputStream, int i, C2443[] c2443Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C2443[0];
        }
        if (i != c2443Arr.length) {
            C5919.m11250("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM4539 = (int) m4539(byteArrayInputStream, 2);
            iArr[i2] = (int) m4539(byteArrayInputStream, 2);
            strArr[i2] = new String(m4528(byteArrayInputStream, iM4539), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C2443 c2443 = c2443Arr[i3];
            if (!c2443.f7115.equals(strArr[i3])) {
                C5919.m11250("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            c2443.f7112 = i4;
            c2443.f7117 = m4545(byteArrayInputStream, i4);
        }
        return c2443Arr;
    }
}
