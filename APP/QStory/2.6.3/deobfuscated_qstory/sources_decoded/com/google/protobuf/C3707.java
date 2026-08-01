package com.google.protobuf;

import bsh.C2633;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;
import lin.xposed.hook.javaplugin.C5554;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3707 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3707 f11516 = new C3707(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f11517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f11518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object[] f11519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int[] f11520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f11521;

    public C3707(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f11518 = -1;
        this.f11521 = i;
        this.f11520 = iArr;
        this.f11519 = objArr;
        this.f11517 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C3707 m7951(C3707 c3707, C3707 c37072) {
        int i = c3707.f11521 + c37072.f11521;
        int[] iArrCopyOf = Arrays.copyOf(c3707.f11520, i);
        System.arraycopy(c37072.f11520, 0, iArrCopyOf, c3707.f11521, c37072.f11521);
        Object[] objArrCopyOf = Arrays.copyOf(c3707.f11519, i);
        System.arraycopy(c37072.f11519, 0, objArrCopyOf, c3707.f11521, c37072.f11521);
        return new C3707(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3707)) {
            return false;
        }
        C3707 c3707 = (C3707) obj;
        int i = this.f11521;
        if (i == c3707.f11521) {
            int[] iArr = this.f11520;
            int[] iArr2 = c3707.f11520;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f11519;
                    Object[] objArr2 = c3707.f11519;
                    int i3 = this.f11521;
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
        int i = this.f11521;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f11520;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f11519;
        int i6 = this.f11521;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7952(int i, Object obj) {
        m7956();
        m7955(this.f11521 + 1);
        int[] iArr = this.f11520;
        int i2 = this.f11521;
        iArr[i2] = i;
        this.f11519[i2] = obj;
        this.f11521 = i2 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m7953(int i, AbstractC3474 abstractC3474) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo7705;
        m7956();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            m7952(i, Long.valueOf(abstractC3474.mo7718()));
            return true;
        }
        if (i3 == 1) {
            m7952(i, Long.valueOf(abstractC3474.mo7722()));
            return true;
        }
        if (i3 == 2) {
            m7952(i, abstractC3474.mo7719());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (abstractC3474.f11154 == 0) {
                    abstractC3474.mo7712(0);
                }
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            m7952(i, Integer.valueOf(abstractC3474.mo7721()));
            return true;
        }
        C3707 c3707 = new C3707();
        do {
            iMo7705 = abstractC3474.mo7705();
            if (iMo7705 == 0) {
                break;
            }
        } while (c3707.m7953(iMo7705, abstractC3474));
        abstractC3474.mo7712((i2 << 3) | 4);
        m7952(i, c3707);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7954() {
        int iM7637;
        int i = this.f11518;
        if (i != -1) {
            return i;
        }
        int iM7954 = 0;
        for (int i2 = 0; i2 < this.f11521; i2++) {
            int i3 = this.f11520[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM7637 = AbstractC3462.m7637(i4, ((Long) this.f11519[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f11519[i2]).getClass();
                iM7637 = AbstractC3462.m7642(i4) + 8;
            } else if (i5 == 2) {
                iM7637 = AbstractC3462.m7633(i4, (ByteString) this.f11519[i2]);
            } else if (i5 == 3) {
                iM7954 = ((C3707) this.f11519[i2]).m7954() + (AbstractC3462.m7642(i4) * 2) + iM7954;
            } else {
                if (i5 != 5) {
                    C2633.m5337(InvalidProtocolBufferException.invalidWireType());
                    return 0;
                }
                ((Integer) this.f11519[i2]).getClass();
                iM7637 = AbstractC3462.m7642(i4) + 4;
            }
            iM7954 = iM7637 + iM7954;
        }
        this.f11518 = iM7954;
        return iM7954;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7955(int i) {
        int[] iArr = this.f11520;
        if (i > iArr.length) {
            int i2 = this.f11521;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f11520 = Arrays.copyOf(iArr, i);
            this.f11519 = Arrays.copyOf(this.f11519, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7956() {
        if (this.f11517) {
            return;
        }
        C5554.m10882();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7957(C3427 c3427) {
        if (this.f11521 == 0) {
            return;
        }
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        for (int i = 0; i < this.f11521; i++) {
            int i2 = this.f11520[i];
            Object obj = this.f11519[i];
            AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c3427.m7547(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c3427.m7552(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c3427.m7563(i3, (ByteString) obj);
            } else if (i4 == 3) {
                Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.ASCENDING;
                abstractC3462.mo7655(i3, 3);
                ((C3707) obj).m7957(c3427);
                abstractC3462.mo7655(i3, 4);
            } else {
                if (i4 != 5) {
                    C5925.m11313(InvalidProtocolBufferException.invalidWireType());
                    return;
                }
                c3427.m7561(i3, ((Integer) obj).intValue());
            }
        }
    }

    public C3707() {
        this(0, new int[8], new Object[8], true);
    }
}
