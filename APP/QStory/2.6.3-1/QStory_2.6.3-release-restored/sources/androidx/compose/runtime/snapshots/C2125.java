package androidx.compose.runtime.snapshots;

import com.android.p002dx.p003cf.attrib.AttCode;
import com.android.p002dx.p003cf.attrib.AttLocalVariableTable;
import com.android.p002dx.p003cf.attrib.AttLocalVariableTypeTable;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Modifier;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.pool.TypePool;
import p313.C9417;
import p313.C9422;
import p313.C9424;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f4118;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f4119;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f4120;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f4121;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int[] f4122;

    public C2125(InputStream inputStream) throws IOException {
        int i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr);
            i = 0;
            if (i2 == -1) {
                break;
            } else if (i2 > 0) {
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        }
        inputStream.close();
        this.f4119 = byteArrayOutputStream.toByteArray();
        int iM2854 = m2854(8);
        this.f4122 = new int[iM2854];
        this.f4118 = new String[iM2854];
        int i3 = 10;
        int i4 = 1;
        while (i4 < iM2854) {
            int i5 = i3 + 1;
            this.f4122[i4] = i5;
            byte b = ((byte[]) this.f4119)[i3];
            int iM28542 = 3;
            if (b == 1) {
                iM28542 = 3 + m2854(i5);
                if (iM28542 > i) {
                    i = iM28542;
                }
            } else if (b == 15) {
                iM28542 = 4;
            } else if (b != 18 && b != 3 && b != 4) {
                if (b != 5 && b != 6) {
                    switch (b) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            iM28542 = 5;
                            break;
                    }
                } else {
                    i4++;
                    iM28542 = 9;
                }
            } else {
                iM28542 = 5;
            }
            i3 += iM28542;
            i4++;
        }
        this.f4121 = i;
        this.f4120 = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m2853(int i, int i2) {
        long[] jArr = (long[]) this.f4119;
        int[] iArr = this.f4122;
        int[] iArr2 = (int[]) this.f4118;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int m2854(int i) {
        byte[] bArr = (byte[]) this.f4119;
        return (bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String m2855(int i, char[] cArr) {
        int i2;
        int iM2854 = m2854(i);
        String[] strArr = (String[]) this.f4118;
        String str = strArr[iM2854];
        if (str != null) {
            return str;
        }
        int i3 = this.f4122[iM2854];
        int i4 = i3 + 2;
        int iM28542 = m2854(i3) + i4;
        byte[] bArr = (byte[]) this.f4119;
        int i5 = 0;
        char c = 0;
        char c2 = 0;
        while (i4 < iM28542) {
            int i6 = i4 + 1;
            byte b = bArr[i4];
            if (c == 0) {
                int i7 = b & DefaultClassResolver.NAME;
                if (i7 < 128) {
                    cArr[i5] = (char) i7;
                    i5++;
                } else if (i7 >= 224 || i7 <= 191) {
                    c2 = (char) (b & 15);
                    c = 2;
                } else {
                    i2 = b & 31;
                    c2 = (char) i2;
                    c = 1;
                }
            } else if (c == 1) {
                cArr[i5] = (char) ((b & 63) | (c2 << 6));
                i5++;
                c = 0;
            } else if (c == 2) {
                i2 = (b & 63) | (c2 << 6);
                c2 = (char) i2;
                c = 1;
            }
            i4 = i6;
        }
        String str2 = new String(cArr, 0, i5);
        strArr[iM2854] = str2;
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int m2856(int i) {
        byte[] bArr = (byte[]) this.f4119;
        return (bArr[i + 3] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 24) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m2857(long j) {
        int i = this.f4121 + 1;
        long[] jArr = (long[]) this.f4119;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            AbstractC5179.m9401(jArr, jArr2, 0, 0, jArr.length);
            AbstractC5179.m9400(0, 0, 14, this.f4122, iArr);
            this.f4119 = jArr2;
            this.f4122 = iArr;
        }
        int i3 = this.f4121;
        this.f4121 = i3 + 1;
        int length2 = ((int[]) this.f4118).length;
        if (this.f4120 >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            AbstractC5179.m9400(0, 0, 14, (int[]) this.f4118, iArr2);
            this.f4118 = iArr2;
        }
        int i7 = this.f4120;
        int[] iArr3 = (int[]) this.f4118;
        this.f4120 = iArr3[i7];
        long[] jArr3 = (long[]) this.f4119;
        jArr3[i3] = j;
        this.f4122[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (AbstractC5227.m9463(jArr3[i8], j) <= 0) {
                break;
            }
            m2853(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2858(C9424 c9424) {
        boolean z;
        C9417 c9417;
        boolean z2;
        char[] cArr = new char[this.f4121];
        int i = this.f4120;
        int iM2854 = m2854(i + 6);
        int i2 = i + 8;
        for (int i3 = 0; i3 < iM2854; i3++) {
            i2 += 2;
        }
        int iM2856 = i2 + 2;
        int iM28562 = iM2856;
        for (int iM28542 = m2854(i2); iM28542 > 0; iM28542--) {
            iM28562 += 8;
            for (int iM28543 = m2854(iM28562 + 6); iM28543 > 0; iM28543--) {
                iM28562 += m2856(iM28562 + 2) + 6;
            }
        }
        int iM28563 = iM28562 + 2;
        for (int iM28544 = m2854(iM28562); iM28544 > 0; iM28544--) {
            iM28563 += 8;
            for (int iM28545 = m2854(iM28563 + 6); iM28545 > 0; iM28545--) {
                iM28563 += m2856(iM28563 + 2) + 6;
            }
        }
        int iM28564 = iM28563 + 2;
        for (int iM28546 = m2854(iM28563); iM28546 > 0; iM28546--) {
            iM28564 += m2856(iM28564 + 2) + 6;
        }
        for (int iM28547 = m2854(i2); iM28547 > 0; iM28547--) {
            iM2856 += 8;
            for (int iM28548 = m2854(iM2856 + 6); iM28548 > 0; iM28548--) {
                iM2856 += m2856(iM2856 + 2) + 6;
            }
        }
        int i4 = iM2856 + 2;
        for (int iM28549 = m2854(iM2856); iM28549 > 0; iM28549--) {
            int iM285410 = m2854(i4);
            String strM2855 = m2855(i4 + 2, cArr);
            String strM28552 = m2855(i4 + 4, cArr);
            i4 += 8;
            int i5 = 0;
            for (int iM285411 = m2854(i4 + 6); iM285411 > 0; iM285411--) {
                String strM28553 = m2855(i4, cArr);
                int iM28565 = m2856(i4 + 2);
                int i6 = i4 + 6;
                if (AttCode.ATTRIBUTE_NAME.equals(strM28553)) {
                    i5 = i6;
                }
                i4 = i6 + iM28565;
            }
            Class[] clsArr = c9424.f24408;
            if (c9424.f24407 == null && strM2855.equals(c9424.f24409)) {
                C9422[] c9422ArrM14780 = C9422.m14780(strM28552);
                int i7 = 0;
                for (C9422 c9422 : c9422ArrM14780) {
                    String strM14782 = c9422.m14782();
                    if ("long".equals(strM14782) || "double".equals(strM14782)) {
                        i7++;
                    }
                }
                if (c9422ArrM14780.length == clsArr.length) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= c9422ArrM14780.length) {
                            z = true;
                            c9417 = new C9417(!Modifier.isStatic(iM285410) ? 1 : 0, c9422ArrM14780.length + i7);
                            c9424.f24407 = c9417;
                            break;
                        }
                        C9422 c94222 = c9422ArrM14780[i8];
                        String name = clsArr[i8].getName();
                        String strM147822 = c94222.m14782();
                        StringBuilder sb = new StringBuilder();
                        z = true;
                        while (strM147822.endsWith("[]")) {
                            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
                            strM147822 = strM147822.substring(0, strM147822.length() - 2);
                        }
                        if (sb.length() != 0) {
                            String str = (String) C9424.f24406.get(strM147822);
                            if (str != null) {
                                sb.append(str);
                                strM147822 = sb.toString();
                            } else {
                                sb.append('L');
                                sb.append(strM147822);
                                sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
                                strM147822 = sb.toString();
                            }
                        }
                        if (!strM147822.equals(name)) {
                            c9417 = null;
                            break;
                        }
                        i8++;
                    }
                } else {
                    c9417 = null;
                    z = true;
                }
            }
            if (c9417 != null && i5 != 0) {
                int iM28566 = i5 + 8 + m2856(i5 + 4);
                int i9 = iM28566 + 2;
                for (int iM285412 = m2854(iM28566); iM285412 > 0; iM285412--) {
                    i9 += 8;
                }
                int iM28567 = i9 + 2;
                int i10 = 0;
                int i11 = 0;
                for (int iM285413 = m2854(i9); iM285413 > 0; iM285413--) {
                    String strM28554 = m2855(iM28567, cArr);
                    if (AttLocalVariableTable.ATTRIBUTE_NAME.equals(strM28554)) {
                        i10 = iM28567 + 6;
                    } else if (AttLocalVariableTypeTable.ATTRIBUTE_NAME.equals(strM28554)) {
                        i11 = iM28567 + 6;
                    }
                    iM28567 += m2856(iM28567 + 2) + 6;
                }
                if (i10 != 0) {
                    if (i11 != 0) {
                        for (int iM285414 = m2854(i11) * 3; iM285414 > 0; iM285414 -= 3) {
                        }
                    }
                    int iM285415 = m2854(i10);
                    int i12 = i10 + 2;
                    while (iM285415 > 0) {
                        int iM285416 = m2854(i12 + 8);
                        String strM28555 = m2855(i12 + 4, cArr);
                        StringBuilder sb2 = c9417.f24294;
                        int i13 = c9417.f24296;
                        if (iM285416 < i13 || iM285416 >= i13 + c9417.f24297) {
                            z2 = z;
                        } else {
                            if ((ParameterDescription.NAME_PREFIX + c9417.f24295).equals(strM28555)) {
                                z2 = z;
                            } else {
                                z2 = z;
                                c9417.f24293 = z2;
                            }
                            sb2.append(',');
                            sb2.append(strM28555);
                            c9417.f24295 += z2 ? 1 : 0;
                        }
                        i12 += 10;
                        iM285415--;
                        z = z2;
                    }
                }
            }
        }
    }
}
