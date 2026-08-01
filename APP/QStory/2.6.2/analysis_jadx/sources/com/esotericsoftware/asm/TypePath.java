package com.esotericsoftware.asm;

import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;

/* JADX INFO: loaded from: classes.dex */
public class TypePath {
    public static final int ARRAY_ELEMENT = 0;
    public static final int INNER_TYPE = 1;
    public static final int TYPE_ARGUMENT = 3;
    public static final int WILDCARD_BOUND = 2;
    byte[] a;
    int b;

    public TypePath(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }

    public static TypePath fromString(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length();
        ByteVector byteVector = new ByteVector(length);
        byteVector.putByte(0);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt == '[') {
                byteVector.a(0, 0);
            } else if (cCharAt == '.') {
                byteVector.a(1, 0);
            } else if (cCharAt == '*') {
                byteVector.a(2, 0);
            } else if (cCharAt >= '0' && cCharAt <= '9') {
                int i3 = cCharAt - '0';
                while (i2 < length) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i3 = ((i3 * 10) + cCharAt2) - 48;
                    i2++;
                }
                if (i2 < length && str.charAt(i2) == ';') {
                    i2++;
                }
                byteVector.a(3, i3);
            }
            i = i2;
        }
        byte[] bArr = byteVector.a;
        bArr[0] = (byte) (byteVector.b / 2);
        return new TypePath(bArr, 0);
    }

    public int getLength() {
        return this.a[this.b];
    }

    public int getStep(int i) {
        return this.a[AbstractC6136.m11541(i, 2, this.b, 1)];
    }

    public int getStepArgument(int i) {
        return this.a[AbstractC6136.m11541(i, 2, this.b, 2)];
    }

    public String toString() {
        char c;
        int length = getLength();
        StringBuffer stringBuffer = new StringBuffer(length * 2);
        for (int i = 0; i < length; i++) {
            int step = getStep(i);
            if (step == 0) {
                c = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
            } else if (step == 1) {
                c = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            } else if (step == 2) {
                c = TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH;
            } else if (step != 3) {
                c = '_';
            } else {
                stringBuffer.append(getStepArgument(i));
                c = TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER;
            }
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }
}
