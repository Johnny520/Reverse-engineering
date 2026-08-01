package com.google.protobuf;

import bsh.C2632;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;
import lin.xposed.hook.javaplugin.C5553;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3706 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3706 f11511 = new C3706(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f11512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f11513;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object[] f11514;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int[] f11515;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f11516;

    public C3706(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f11513 = -1;
        this.f11516 = i;
        this.f11515 = iArr;
        this.f11514 = objArr;
        this.f11512 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C3706 m7964(C3706 c3706, C3706 c37062) {
        int i = c3706.f11516 + c37062.f11516;
        int[] iArrCopyOf = Arrays.copyOf(c3706.f11515, i);
        System.arraycopy(c37062.f11515, 0, iArrCopyOf, c3706.f11516, c37062.f11516);
        Object[] objArrCopyOf = Arrays.copyOf(c3706.f11514, i);
        System.arraycopy(c37062.f11514, 0, objArrCopyOf, c3706.f11516, c37062.f11516);
        return new C3706(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3706)) {
            return false;
        }
        C3706 c3706 = (C3706) obj;
        int i = this.f11516;
        if (i == c3706.f11516) {
            int[] iArr = this.f11515;
            int[] iArr2 = c3706.f11515;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f11514;
                    Object[] objArr2 = c3706.f11514;
                    int i3 = this.f11516;
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
        int i = this.f11516;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f11515;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f11514;
        int i6 = this.f11516;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7965(int i, Object obj) {
        m7969();
        m7968(this.f11516 + 1);
        int[] iArr = this.f11515;
        int i2 = this.f11516;
        iArr[i2] = i;
        this.f11514[i2] = obj;
        this.f11516 = i2 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m7966(int i, AbstractC3473 abstractC3473) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo7718;
        m7969();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            m7965(i, Long.valueOf(abstractC3473.mo7731()));
            return true;
        }
        if (i3 == 1) {
            m7965(i, Long.valueOf(abstractC3473.mo7735()));
            return true;
        }
        if (i3 == 2) {
            m7965(i, abstractC3473.mo7732());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (abstractC3473.f11149 == 0) {
                    abstractC3473.mo7725(0);
                }
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            m7965(i, Integer.valueOf(abstractC3473.mo7734()));
            return true;
        }
        C3706 c3706 = new C3706();
        do {
            iMo7718 = abstractC3473.mo7718();
            if (iMo7718 == 0) {
                break;
            }
        } while (c3706.m7966(iMo7718, abstractC3473));
        abstractC3473.mo7725((i2 << 3) | 4);
        m7965(i, c3706);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7967() {
        int iM7650;
        int i = this.f11513;
        if (i != -1) {
            return i;
        }
        int iM7967 = 0;
        for (int i2 = 0; i2 < this.f11516; i2++) {
            int i3 = this.f11515[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM7650 = AbstractC3461.m7650(i4, ((Long) this.f11514[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f11514[i2]).getClass();
                iM7650 = AbstractC3461.m7655(i4) + 8;
            } else if (i5 == 2) {
                iM7650 = AbstractC3461.m7646(i4, (ByteString) this.f11514[i2]);
            } else if (i5 == 3) {
                iM7967 = ((C3706) this.f11514[i2]).m7967() + (AbstractC3461.m7655(i4) * 2) + iM7967;
            } else {
                if (i5 != 5) {
                    C2632.m5292(InvalidProtocolBufferException.invalidWireType());
                    return 0;
                }
                ((Integer) this.f11514[i2]).getClass();
                iM7650 = AbstractC3461.m7655(i4) + 4;
            }
            iM7967 = iM7650 + iM7967;
        }
        this.f11513 = iM7967;
        return iM7967;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7968(int i) {
        int[] iArr = this.f11515;
        if (i > iArr.length) {
            int i2 = this.f11516;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f11515 = Arrays.copyOf(iArr, i);
            this.f11514 = Arrays.copyOf(this.f11514, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7969() {
        if (this.f11512) {
            return;
        }
        C5553.m10825();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7970(C3426 c3426) {
        if (this.f11516 == 0) {
            return;
        }
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        for (int i = 0; i < this.f11516; i++) {
            int i2 = this.f11515[i];
            Object obj = this.f11514[i];
            AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c3426.m7560(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c3426.m7565(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c3426.m7576(i3, (ByteString) obj);
            } else if (i4 == 3) {
                Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.ASCENDING;
                abstractC3461.mo7668(i3, 3);
                ((C3706) obj).m7970(c3426);
                abstractC3461.mo7668(i3, 4);
            } else {
                if (i4 != 5) {
                    C5919.m11252(InvalidProtocolBufferException.invalidWireType());
                    return;
                }
                c3426.m7574(i3, ((Integer) obj).intValue());
            }
        }
    }

    public C3706() {
        this(0, new int[8], new Object[8], true);
    }
}
