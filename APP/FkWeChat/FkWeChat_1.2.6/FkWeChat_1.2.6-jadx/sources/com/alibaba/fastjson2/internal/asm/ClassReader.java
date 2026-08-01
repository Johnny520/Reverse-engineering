package com.alibaba.fastjson2.internal.asm;

import com.alibaba.fastjson2.JSONB;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ClassReader {

    /* JADX INFO: renamed from: b */
    public final byte[] f4557b;
    public final int header;
    private final int[] items;
    private final int maxStringLength;
    private final String[] strings;

    public ClassReader(InputStream inputStream) throws IOException {
        int i10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i11 = inputStream.read(bArr);
            i10 = 0;
            if (i11 == -1) {
                break;
            } else if (i11 > 0) {
                byteArrayOutputStream.write(bArr, 0, i11);
            }
        }
        inputStream.close();
        this.f4557b = byteArrayOutputStream.toByteArray();
        int[] iArr = new int[readUnsignedShort(8)];
        this.items = iArr;
        int length = iArr.length;
        this.strings = new String[length];
        int i12 = 10;
        int i13 = 1;
        while (i13 < length) {
            int i14 = i12 + 1;
            this.items[i13] = i14;
            byte b10 = this.f4557b[i12];
            int unsignedShort = 3;
            if (b10 == 1) {
                unsignedShort = 3 + readUnsignedShort(i14);
                if (unsignedShort > i10) {
                    i10 = unsignedShort;
                }
            } else if (b10 == 15) {
                unsignedShort = 4;
            } else if (b10 != 18 && b10 != 3 && b10 != 4) {
                if (b10 != 5 && b10 != 6) {
                    switch (b10) {
                        case 9:
                        case 10:
                        case Opcodes.FCONST_0 /* 11 */:
                        case Opcodes.FCONST_1 /* 12 */:
                            unsignedShort = 5;
                            break;
                    }
                } else {
                    i13++;
                    unsignedShort = 9;
                }
            } else {
                unsignedShort = 5;
            }
            i12 += unsignedShort;
            i13++;
        }
        this.maxStringLength = i10;
        this.header = i12;
    }

    private int readInt(int i10) {
        byte[] bArr = this.f4557b;
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int readMethod(TypeCollector typeCollector, char[] cArr, int i10) {
        int unsignedShort = readUnsignedShort(i10);
        String utf8 = readUTF8(i10 + 2, cArr);
        String utf82 = readUTF8(i10 + 4, cArr);
        int i11 = i10 + 8;
        int i12 = 0;
        int i13 = 0;
        for (int unsignedShort2 = readUnsignedShort(i10 + 6); unsignedShort2 > 0; unsignedShort2--) {
            String utf83 = readUTF8(i11, cArr);
            int i14 = readInt(i11 + 2);
            int i15 = i11 + 6;
            if ("Code".equals(utf83)) {
                i13 = i15;
            }
            i11 = i15 + i14;
        }
        MethodCollector methodCollectorVisitMethod = typeCollector.visitMethod(unsignedShort, utf8, utf82);
        if (methodCollectorVisitMethod != null && i13 != 0) {
            int i16 = i13 + 8 + readInt(i13 + 4);
            int i17 = i16 + 2;
            for (int unsignedShort3 = readUnsignedShort(i16); unsignedShort3 > 0; unsignedShort3--) {
                i17 += 8;
            }
            int i18 = i17 + 2;
            int i19 = 0;
            for (int unsignedShort4 = readUnsignedShort(i17); unsignedShort4 > 0; unsignedShort4--) {
                String utf84 = readUTF8(i18, cArr);
                if ("LocalVariableTable".equals(utf84)) {
                    i12 = i18 + 6;
                } else if ("LocalVariableTypeTable".equals(utf84)) {
                    i19 = i18 + 6;
                }
                i18 += readInt(i18 + 2) + 6;
            }
            if (i12 != 0) {
                if (i19 != 0) {
                    for (int unsignedShort5 = readUnsignedShort(i19) * 3; unsignedShort5 > 0; unsignedShort5 -= 3) {
                    }
                }
                int i20 = i12 + 2;
                for (int unsignedShort6 = readUnsignedShort(i12); unsignedShort6 > 0; unsignedShort6--) {
                    methodCollectorVisitMethod.visitLocalVariable(readUTF8(i20 + 4, cArr), readUnsignedShort(i20 + 8));
                    i20 += 10;
                }
            }
        }
        return i11;
    }

    private String readUTF(int i10, int i11, char[] cArr) {
        int i12;
        int i13 = i11 + i10;
        byte[] bArr = this.f4557b;
        int i14 = 0;
        char c10 = 0;
        char c11 = 0;
        while (i10 < i13) {
            int i15 = i10 + 1;
            byte b10 = bArr[i10];
            if (c10 == 0) {
                int i16 = b10 & 255;
                if (i16 < 128) {
                    cArr[i14] = (char) i16;
                    i14++;
                } else if (i16 >= 224 || i16 <= 191) {
                    c11 = (char) (b10 & 15);
                    c10 = 2;
                } else {
                    i12 = b10 & 31;
                    c11 = (char) i12;
                    c10 = 1;
                }
            } else if (c10 == 1) {
                cArr[i14] = (char) ((b10 & JSONB.Constants.BC_INT32_BYTE_MAX) | (c11 << 6));
                i14++;
                c10 = 0;
            } else if (c10 == 2) {
                i12 = (b10 & JSONB.Constants.BC_INT32_BYTE_MAX) | (c11 << 6);
                c11 = (char) i12;
                c10 = 1;
            }
            i10 = i15;
        }
        return new String(cArr, 0, i14);
    }

    private String readUTF8(int i10, char[] cArr) {
        int unsignedShort = readUnsignedShort(i10);
        String[] strArr = this.strings;
        String str = strArr[unsignedShort];
        if (str != null) {
            return str;
        }
        int i11 = this.items[unsignedShort];
        String utf = readUTF(i11 + 2, readUnsignedShort(i11), cArr);
        strArr[unsignedShort] = utf;
        return utf;
    }

    private int readUnsignedShort(int i10) {
        byte[] bArr = this.f4557b;
        return (bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8);
    }

    public void accept(TypeCollector typeCollector) {
        char[] cArr = new char[this.maxStringLength];
        int i10 = this.header;
        int unsignedShort = readUnsignedShort(i10 + 6);
        int i11 = i10 + 8;
        for (int i12 = 0; i12 < unsignedShort; i12++) {
            i11 += 2;
        }
        int i13 = i11 + 2;
        int i14 = i13;
        for (int unsignedShort2 = readUnsignedShort(i11); unsignedShort2 > 0; unsignedShort2--) {
            i14 += 8;
            for (int unsignedShort3 = readUnsignedShort(i14 + 6); unsignedShort3 > 0; unsignedShort3--) {
                i14 += readInt(i14 + 2) + 6;
            }
        }
        int i15 = i14 + 2;
        for (int unsignedShort4 = readUnsignedShort(i14); unsignedShort4 > 0; unsignedShort4--) {
            i15 += 8;
            for (int unsignedShort5 = readUnsignedShort(i15 + 6); unsignedShort5 > 0; unsignedShort5--) {
                i15 += readInt(i15 + 2) + 6;
            }
        }
        int i16 = i15 + 2;
        for (int unsignedShort6 = readUnsignedShort(i15); unsignedShort6 > 0; unsignedShort6--) {
            i16 += readInt(i16 + 2) + 6;
        }
        for (int unsignedShort7 = readUnsignedShort(i11); unsignedShort7 > 0; unsignedShort7--) {
            i13 += 8;
            for (int unsignedShort8 = readUnsignedShort(i13 + 6); unsignedShort8 > 0; unsignedShort8--) {
                i13 += readInt(i13 + 2) + 6;
            }
        }
        int method = i13 + 2;
        for (int unsignedShort9 = readUnsignedShort(i13); unsignedShort9 > 0; unsignedShort9--) {
            method = readMethod(typeCollector, cArr, method);
        }
    }
}
