package com.google.protobuf;

import bsh.C3466;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;
import lin.xposed.hook.javaplugin.C6385;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4539 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4539 f11861 = new C4539(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f11862;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f11863;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object[] f11864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int[] f11865;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f11866;

    public C4539(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f11863 = -1;
        this.f11866 = i;
        this.f11865 = iArr;
        this.f11864 = objArr;
        this.f11862 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C4539 m8510(C4539 c4539, C4539 c45392) {
        int i = c4539.f11866 + c45392.f11866;
        int[] iArrCopyOf = Arrays.copyOf(c4539.f11865, i);
        System.arraycopy(c45392.f11865, 0, iArrCopyOf, c4539.f11866, c45392.f11866);
        Object[] objArrCopyOf = Arrays.copyOf(c4539.f11864, i);
        System.arraycopy(c45392.f11864, 0, objArrCopyOf, c4539.f11866, c45392.f11866);
        return new C4539(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4539)) {
            return false;
        }
        C4539 c4539 = (C4539) obj;
        int i = this.f11866;
        if (i == c4539.f11866) {
            int[] iArr = this.f11865;
            int[] iArr2 = c4539.f11865;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f11864;
                    Object[] objArr2 = c4539.f11864;
                    int i3 = this.f11866;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f11866;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f11865;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f11864;
        int i6 = this.f11866;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m8511(int i, Object obj) {
        m8515();
        m8514(this.f11866 + 1);
        int[] iArr = this.f11865;
        int i2 = this.f11866;
        iArr[i2] = i;
        this.f11864[i2] = obj;
        this.f11866 = i2 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m8512(int i, AbstractC4306 abstractC4306) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo8264;
        m8515();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            m8511(i, Long.valueOf(abstractC4306.mo8277()));
            return true;
        }
        if (i3 == 1) {
            m8511(i, Long.valueOf(abstractC4306.mo8281()));
            return true;
        }
        if (i3 == 2) {
            m8511(i, abstractC4306.mo8278());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (abstractC4306.f11499 == 0) {
                    abstractC4306.mo8271(0);
                }
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            m8511(i, Integer.valueOf(abstractC4306.mo8280()));
            return true;
        }
        C4539 c4539 = new C4539();
        do {
            iMo8264 = abstractC4306.mo8264();
            if (iMo8264 == 0) {
                break;
            }
        } while (c4539.m8512(iMo8264, abstractC4306));
        abstractC4306.mo8271((i2 << 3) | 4);
        m8511(i, c4539);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m8513() {
        int iM8196;
        int i = this.f11863;
        if (i != -1) {
            return i;
        }
        int iM8513 = 0;
        for (int i2 = 0; i2 < this.f11866; i2++) {
            int i3 = this.f11865[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM8196 = AbstractC4294.m8196(i4, ((Long) this.f11864[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f11864[i2]).getClass();
                iM8196 = AbstractC4294.m8201(i4) + 8;
            } else if (i5 == 2) {
                iM8196 = AbstractC4294.m8192(i4, (ByteString) this.f11864[i2]);
            } else if (i5 == 3) {
                iM8513 = ((C4539) this.f11864[i2]).m8513() + (AbstractC4294.m8201(i4) * 2) + iM8513;
            } else {
                if (i5 != 5) {
                    C3466.m5897(InvalidProtocolBufferException.invalidWireType());
                    return 0;
                }
                ((Integer) this.f11864[i2]).getClass();
                iM8196 = AbstractC4294.m8201(i4) + 4;
            }
            iM8513 = iM8196 + iM8513;
        }
        this.f11863 = iM8513;
        return iM8513;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8514(int i) {
        int[] iArr = this.f11865;
        if (i > iArr.length) {
            int i2 = this.f11866;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f11865 = Arrays.copyOf(iArr, i);
            this.f11864 = Arrays.copyOf(this.f11864, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8515() {
        if (this.f11862) {
            return;
        }
        C6385.m11441();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m8516(C4259 c4259) {
        if (this.f11866 == 0) {
            return;
        }
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        for (int i = 0; i < this.f11866; i++) {
            int i2 = this.f11865[i];
            Object obj = this.f11864[i];
            AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c4259.m8106(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c4259.m8111(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c4259.m8122(i3, (ByteString) obj);
            } else if (i4 == 3) {
                Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.ASCENDING;
                abstractC4294.mo8214(i3, 3);
                ((C4539) obj).m8516(c4259);
                abstractC4294.mo8214(i3, 4);
            } else {
                if (i4 != 5) {
                    C6755.m11872(InvalidProtocolBufferException.invalidWireType());
                    return;
                }
                c4259.m8120(i3, ((Integer) obj).intValue());
            }
        }
    }

    public C4539() {
        this(0, new int[8], new Object[8], true);
    }
}
