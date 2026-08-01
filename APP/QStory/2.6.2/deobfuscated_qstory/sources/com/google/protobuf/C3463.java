package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3463 implements InterfaceC3358 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f11127 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f11128;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f11129;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3473 f11130;

    public C3463(AbstractC3473 abstractC3473) {
        AbstractC3401.m7518(abstractC3473, "input");
        this.f11130 = abstractC3473;
        abstractC3473.f11148 = this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static void m7683(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static void m7684(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.InterfaceC3358
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(1);
        return this.f11130.mo7736();
    }

    @Override // com.google.protobuf.InterfaceC3358
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(5);
        return this.f11130.mo7727();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m7685(int i) throws InvalidProtocolBufferException {
        if (this.f11130.mo7722() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m7686(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f11129 & 7) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m7687(Object obj, InterfaceC3344 interfaceC3344, C3696 c3696) throws InvalidProtocolBufferException {
        AbstractC3473 abstractC3473 = this.f11130;
        int iMo7717 = abstractC3473.mo7717();
        abstractC3473.m7724();
        int iMo7740 = abstractC3473.mo7740(iMo7717);
        abstractC3473.f11150++;
        interfaceC3344.mo7405(obj, this, c3696);
        abstractC3473.mo7725(0);
        abstractC3473.f11150--;
        abstractC3473.mo7739(iMo7740);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m7688(Object obj, InterfaceC3344 interfaceC3344, C3696 c3696) {
        int i = this.f11128;
        this.f11128 = ((this.f11129 >>> 3) << 3) | 4;
        try {
            interfaceC3344.mo7405(obj, this, c3696);
            if (this.f11129 == this.f11128) {
            } else {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } finally {
            this.f11128 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m7689(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo7718;
        int iMo77182;
        if ((this.f11129 & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        boolean z2 = list instanceof InterfaceC3424;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z2 || z) {
            do {
                list.add(z ? mo7426() : mo7435());
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo7718 = abstractC3473.mo7718();
                }
            } while (iMo7718 == this.f11129);
            this.f11127 = iMo7718;
            return;
        }
        InterfaceC3424 interfaceC3424 = (InterfaceC3424) list;
        do {
            interfaceC3424.mo7508(mo7441());
            if (abstractC3473.mo7738()) {
                return;
            } else {
                iMo77182 = abstractC3473.mo7718();
            }
        } while (iMo77182 == this.f11129);
        this.f11127 = iMo77182;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final Object m7690(WireFormat$FieldType wireFormat$FieldType, Class cls, C3696 c3696) {
        switch (AbstractC3464.f11131[wireFormat$FieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo7465());
            case 2:
                return mo7441();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo7454());
            case 5:
                return Integer.valueOf(mo7464());
            case 6:
                return Long.valueOf(mo7447());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo7439());
            case 9:
                return Long.valueOf(mo7430());
            case 10:
                return mo7466(cls, c3696);
            case 11:
                return Integer.valueOf(mo7429());
            case 12:
                return Long.valueOf(mo7456());
            case 13:
                return Integer.valueOf(mo7453());
            case 14:
                return Long.valueOf(mo7437());
            case 15:
                return mo7426();
            case 16:
                return Integer.valueOf(mo7461());
            case 17:
                return Long.valueOf(mo7448());
            default:
                C5919.m11249("unsupported field type.");
                return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final String mo7426() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(2);
        return this.f11130.mo7719();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final void mo7427(List list) throws InvalidProtocolBufferException {
        int iMo7718;
        int iMo77182;
        boolean z = list instanceof C3429;
        int i = this.f11129;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(abstractC3473.mo7735()));
                    if (abstractC3473.mo7738()) {
                        return;
                    } else {
                        iMo7718 = abstractC3473.mo7718();
                    }
                } while (iMo7718 == this.f11129);
                this.f11127 = iMo7718;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7717 = abstractC3473.mo7717();
            m7683(iMo7717);
            int iMo7722 = abstractC3473.mo7722() + iMo7717;
            do {
                list.add(Long.valueOf(abstractC3473.mo7735()));
            } while (abstractC3473.mo7722() < iMo7722);
            return;
        }
        C3429 c3429 = (C3429) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                c3429.m7579(abstractC3473.mo7735());
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo77182 = abstractC3473.mo7718();
                }
            } while (iMo77182 == this.f11129);
            this.f11127 = iMo77182;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77172 = abstractC3473.mo7717();
        m7683(iMo77172);
        int iMo77222 = abstractC3473.mo7722() + iMo77172;
        do {
            c3429.m7579(abstractC3473.mo7735());
        } while (abstractC3473.mo7722() < iMo77222);
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo7428(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo7718;
        if ((this.f11129 & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(mo7441());
            AbstractC3473 abstractC3473 = this.f11130;
            if (abstractC3473.mo7738()) {
                return;
            } else {
                iMo7718 = abstractC3473.mo7718();
            }
        } while (iMo7718 == this.f11129);
        this.f11127 = iMo7718;
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final int mo7429() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(5);
        return this.f11130.mo7713();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final long mo7430() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(0);
        return this.f11130.mo7731();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo7431(List list) throws InvalidProtocolBufferException {
        int iMo7718;
        int iMo77182;
        boolean z = list instanceof C3590;
        int i = this.f11129;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(abstractC3473.mo7736()));
                    if (abstractC3473.mo7738()) {
                        return;
                    } else {
                        iMo7718 = abstractC3473.mo7718();
                    }
                } while (iMo7718 == this.f11129);
                this.f11127 = iMo7718;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7717 = abstractC3473.mo7717();
            m7683(iMo7717);
            int iMo7722 = abstractC3473.mo7722() + iMo7717;
            do {
                list.add(Double.valueOf(abstractC3473.mo7736()));
            } while (abstractC3473.mo7722() < iMo7722);
            return;
        }
        C3590 c3590 = (C3590) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                c3590.m7808(abstractC3473.mo7736());
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo77182 = abstractC3473.mo7718();
                }
            } while (iMo77182 == this.f11129);
            this.f11127 = iMo77182;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77172 = abstractC3473.mo7717();
        m7683(iMo77172);
        int iMo77222 = abstractC3473.mo7722() + iMo77172;
        do {
            c3590.m7808(abstractC3473.mo7736());
        } while (abstractC3473.mo7722() < iMo77222);
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo7432(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7689(list, false);
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final int mo7433() {
        int i = this.f11127;
        if (i != 0) {
            this.f11129 = i;
            this.f11127 = 0;
        } else {
            this.f11129 = this.f11130.mo7718();
        }
        int i2 = this.f11129;
        if (i2 == 0 || i2 == this.f11128) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo7434(Class cls, C3696 c3696) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(3);
        InterfaceC3344 interfaceC3344M7493 = C3371.f11013.m7493(cls);
        Object objNewInstance = interfaceC3344M7493.newInstance();
        m7688(objNewInstance, interfaceC3344M7493, c3696);
        interfaceC3344M7493.mo7407(objNewInstance);
        return objNewInstance;
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final String mo7435() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(2);
        return this.f11130.mo7720();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo7436(List list) throws InvalidProtocolBufferException {
        int iMo7718;
        int iMo77182;
        boolean z = list instanceof C3534;
        int i = this.f11129;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC3473.mo7733()));
                    if (abstractC3473.mo7738()) {
                        return;
                    } else {
                        iMo7718 = abstractC3473.mo7718();
                    }
                } while (iMo7718 == this.f11129);
                this.f11127 = iMo7718;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7722 = abstractC3473.mo7722() + abstractC3473.mo7717();
            do {
                list.add(Boolean.valueOf(abstractC3473.mo7733()));
            } while (abstractC3473.mo7722() < iMo7722);
            m7685(iMo7722);
            return;
        }
        C3534 c3534 = (C3534) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3534.m7774(abstractC3473.mo7733());
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo77182 = abstractC3473.mo7718();
                }
            } while (iMo77182 == this.f11129);
            this.f11127 = iMo77182;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77222 = abstractC3473.mo7722() + abstractC3473.mo7717();
        do {
            c3534.m7774(abstractC3473.mo7733());
        } while (abstractC3473.mo7722() < iMo77222);
        m7685(iMo77222);
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final long mo7437() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(0);
        return this.f11130.mo7721();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final boolean mo7438() {
        int i;
        AbstractC3473 abstractC3473 = this.f11130;
        if (abstractC3473.mo7738() || (i = this.f11129) == this.f11128) {
            return false;
        }
        return abstractC3473.mo7710(i);
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final int mo7439() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(0);
        return this.f11130.mo7730();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo7440(List list) throws InvalidProtocolBufferException {
        int iMo7718;
        int iMo77182;
        boolean z = list instanceof C3638;
        int i = this.f11129;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo7717 = abstractC3473.mo7717();
                m7684(iMo7717);
                int iMo7722 = abstractC3473.mo7722() + iMo7717;
                do {
                    list.add(Float.valueOf(abstractC3473.mo7727()));
                } while (abstractC3473.mo7722() < iMo7722);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(abstractC3473.mo7727()));
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo7718 = abstractC3473.mo7718();
                }
            } while (iMo7718 == this.f11129);
            this.f11127 = iMo7718;
            return;
        }
        C3638 c3638 = (C3638) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo77172 = abstractC3473.mo7717();
            m7684(iMo77172);
            int iMo77222 = abstractC3473.mo7722() + iMo77172;
            do {
                c3638.m7855(abstractC3473.mo7727());
            } while (abstractC3473.mo7722() < iMo77222);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c3638.m7855(abstractC3473.mo7727());
            if (abstractC3473.mo7738()) {
                return;
            } else {
                iMo77182 = abstractC3473.mo7718();
            }
        } while (iMo77182 == this.f11129);
        this.f11127 = iMo77182;
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final ByteString mo7441() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(2);
        return this.f11130.mo7732();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo7442(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7689(list, true);
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo7443(Object obj, InterfaceC3344 interfaceC3344, C3696 c3696) throws InvalidProtocolBufferException {
        m7686(2);
        m7687(obj, interfaceC3344, c3696);
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo7444(List list, InterfaceC3344 interfaceC3344, C3696 c3696) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo7718;
        int i = this.f11129;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Object objNewInstance = interfaceC3344.newInstance();
            m7688(objNewInstance, interfaceC3344, c3696);
            interfaceC3344.mo7407(objNewInstance);
            list.add(objNewInstance);
            AbstractC3473 abstractC3473 = this.f11130;
            if (abstractC3473.mo7738() || this.f11127 != 0) {
                return;
            } else {
                iMo7718 = abstractC3473.mo7718();
            }
        } while (iMo7718 == i);
        this.f11127 = iMo7718;
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo7445(List list) throws InvalidProtocolBufferException {
        int iMo7718;
        int iMo77182;
        boolean z = list instanceof C3429;
        int i = this.f11129;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC3473.mo7721()));
                    if (abstractC3473.mo7738()) {
                        return;
                    } else {
                        iMo7718 = abstractC3473.mo7718();
                    }
                } while (iMo7718 == this.f11129);
                this.f11127 = iMo7718;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7722 = abstractC3473.mo7722() + abstractC3473.mo7717();
            do {
                list.add(Long.valueOf(abstractC3473.mo7721()));
            } while (abstractC3473.mo7722() < iMo7722);
            m7685(iMo7722);
            return;
        }
        C3429 c3429 = (C3429) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3429.m7579(abstractC3473.mo7721());
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo77182 = abstractC3473.mo7718();
                }
            } while (iMo77182 == this.f11129);
            this.f11127 = iMo77182;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77222 = abstractC3473.mo7722() + abstractC3473.mo7717();
        do {
            c3429.m7579(abstractC3473.mo7721());
        } while (abstractC3473.mo7722() < iMo77222);
        m7685(iMo77222);
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo7446(List list) throws InvalidProtocolBufferException {
        int iMo7718;
        int iMo77182;
        boolean z = list instanceof C3612;
        int i = this.f11129;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo7717 = abstractC3473.mo7717();
                m7684(iMo7717);
                int iMo7722 = abstractC3473.mo7722() + iMo7717;
                do {
                    list.add(Integer.valueOf(abstractC3473.mo7713()));
                } while (abstractC3473.mo7722() < iMo7722);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(abstractC3473.mo7713()));
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo7718 = abstractC3473.mo7718();
                }
            } while (iMo7718 == this.f11129);
            this.f11127 = iMo7718;
            return;
        }
        C3612 c3612 = (C3612) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo77172 = abstractC3473.mo7717();
            m7684(iMo77172);
            int iMo77222 = abstractC3473.mo7722() + iMo77172;
            do {
                c3612.m7825(abstractC3473.mo7713());
            } while (abstractC3473.mo7722() < iMo77222);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c3612.m7825(abstractC3473.mo7713());
            if (abstractC3473.mo7738()) {
                return;
            } else {
                iMo77182 = abstractC3473.mo7718();
            }
        } while (iMo77182 == this.f11129);
        this.f11127 = iMo77182;
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final long mo7447() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(1);
        return this.f11130.mo7735();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final long mo7448() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(0);
        return this.f11130.mo7716();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7449(List list) throws InvalidProtocolBufferException {
        int iMo7718;
        int iMo77182;
        boolean z = list instanceof C3612;
        int i = this.f11129;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC3473.mo7711()));
                    if (abstractC3473.mo7738()) {
                        return;
                    } else {
                        iMo7718 = abstractC3473.mo7718();
                    }
                } while (iMo7718 == this.f11129);
                this.f11127 = iMo7718;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7722 = abstractC3473.mo7722() + abstractC3473.mo7717();
            do {
                list.add(Integer.valueOf(abstractC3473.mo7711()));
            } while (abstractC3473.mo7722() < iMo7722);
            m7685(iMo7722);
            return;
        }
        C3612 c3612 = (C3612) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3612.m7825(abstractC3473.mo7711());
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo77182 = abstractC3473.mo7718();
                }
            } while (iMo77182 == this.f11129);
            this.f11127 = iMo77182;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77222 = abstractC3473.mo7722() + abstractC3473.mo7717();
        do {
            c3612.m7825(abstractC3473.mo7711());
        } while (abstractC3473.mo7722() < iMo77222);
        m7685(iMo77222);
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo7450(List list) throws InvalidProtocolBufferException {
        int iMo7718;
        int iMo77182;
        boolean z = list instanceof C3612;
        int i = this.f11129;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC3473.mo7737()));
                    if (abstractC3473.mo7738()) {
                        return;
                    } else {
                        iMo7718 = abstractC3473.mo7718();
                    }
                } while (iMo7718 == this.f11129);
                this.f11127 = iMo7718;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7722 = abstractC3473.mo7722() + abstractC3473.mo7717();
            do {
                list.add(Integer.valueOf(abstractC3473.mo7737()));
            } while (abstractC3473.mo7722() < iMo7722);
            m7685(iMo7722);
            return;
        }
        C3612 c3612 = (C3612) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3612.m7825(abstractC3473.mo7737());
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo77182 = abstractC3473.mo7718();
                }
            } while (iMo77182 == this.f11129);
            this.f11127 = iMo77182;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77222 = abstractC3473.mo7722() + abstractC3473.mo7717();
        do {
            c3612.m7825(abstractC3473.mo7737());
        } while (abstractC3473.mo7722() < iMo77222);
        m7685(iMo77222);
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo7451(List list) throws InvalidProtocolBufferException {
        int iMo7718;
        int iMo77182;
        boolean z = list instanceof C3612;
        int i = this.f11129;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC3473.mo7730()));
                    if (abstractC3473.mo7738()) {
                        return;
                    } else {
                        iMo7718 = abstractC3473.mo7718();
                    }
                } while (iMo7718 == this.f11129);
                this.f11127 = iMo7718;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7722 = abstractC3473.mo7722() + abstractC3473.mo7717();
            do {
                list.add(Integer.valueOf(abstractC3473.mo7730()));
            } while (abstractC3473.mo7722() < iMo7722);
            m7685(iMo7722);
            return;
        }
        C3612 c3612 = (C3612) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3612.m7825(abstractC3473.mo7730());
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo77182 = abstractC3473.mo7718();
                }
            } while (iMo77182 == this.f11129);
            this.f11127 = iMo77182;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77222 = abstractC3473.mo7722() + abstractC3473.mo7717();
        do {
            c3612.m7825(abstractC3473.mo7730());
        } while (abstractC3473.mo7722() < iMo77222);
        m7685(iMo77222);
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo7452(List list) throws InvalidProtocolBufferException {
        int iMo7718;
        int iMo77182;
        boolean z = list instanceof C3612;
        int i = this.f11129;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo7717 = abstractC3473.mo7717();
                m7684(iMo7717);
                int iMo7722 = abstractC3473.mo7722() + iMo7717;
                do {
                    list.add(Integer.valueOf(abstractC3473.mo7734()));
                } while (abstractC3473.mo7722() < iMo7722);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(abstractC3473.mo7734()));
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo7718 = abstractC3473.mo7718();
                }
            } while (iMo7718 == this.f11129);
            this.f11127 = iMo7718;
            return;
        }
        C3612 c3612 = (C3612) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo77172 = abstractC3473.mo7717();
            m7684(iMo77172);
            int iMo77222 = abstractC3473.mo7722() + iMo77172;
            do {
                c3612.m7825(abstractC3473.mo7734());
            } while (abstractC3473.mo7722() < iMo77222);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c3612.m7825(abstractC3473.mo7734());
            if (abstractC3473.mo7738()) {
                return;
            } else {
                iMo77182 = abstractC3473.mo7718();
            }
        } while (iMo77182 == this.f11129);
        this.f11127 = iMo77182;
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo7453() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(0);
        return this.f11130.mo7711();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final int mo7454() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(0);
        return this.f11130.mo7737();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo7455() {
        return this.f11129;
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final long mo7456() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(1);
        return this.f11130.mo7712();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo7457(List list, InterfaceC3344 interfaceC3344, C3696 c3696) throws InvalidProtocolBufferException {
        int iMo7718;
        int i = this.f11129;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Object objNewInstance = interfaceC3344.newInstance();
            m7687(objNewInstance, interfaceC3344, c3696);
            interfaceC3344.mo7407(objNewInstance);
            list.add(objNewInstance);
            AbstractC3473 abstractC3473 = this.f11130;
            if (abstractC3473.mo7738() || this.f11127 != 0) {
                return;
            } else {
                iMo7718 = abstractC3473.mo7718();
            }
        } while (iMo7718 == i);
        this.f11127 = iMo7718;
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo7458(List list) throws InvalidProtocolBufferException {
        int iMo7718;
        int iMo77182;
        boolean z = list instanceof C3429;
        int i = this.f11129;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC3473.mo7731()));
                    if (abstractC3473.mo7738()) {
                        return;
                    } else {
                        iMo7718 = abstractC3473.mo7718();
                    }
                } while (iMo7718 == this.f11129);
                this.f11127 = iMo7718;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7722 = abstractC3473.mo7722() + abstractC3473.mo7717();
            do {
                list.add(Long.valueOf(abstractC3473.mo7731()));
            } while (abstractC3473.mo7722() < iMo7722);
            m7685(iMo7722);
            return;
        }
        C3429 c3429 = (C3429) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3429.m7579(abstractC3473.mo7731());
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo77182 = abstractC3473.mo7718();
                }
            } while (iMo77182 == this.f11129);
            this.f11127 = iMo77182;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77222 = abstractC3473.mo7722() + abstractC3473.mo7717();
        do {
            c3429.m7579(abstractC3473.mo7731());
        } while (abstractC3473.mo7722() < iMo77222);
        m7685(iMo77222);
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo7459(List list) throws InvalidProtocolBufferException {
        int iMo7718;
        int iMo77182;
        boolean z = list instanceof C3429;
        int i = this.f11129;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(abstractC3473.mo7712()));
                    if (abstractC3473.mo7738()) {
                        return;
                    } else {
                        iMo7718 = abstractC3473.mo7718();
                    }
                } while (iMo7718 == this.f11129);
                this.f11127 = iMo7718;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7717 = abstractC3473.mo7717();
            m7683(iMo7717);
            int iMo7722 = abstractC3473.mo7722() + iMo7717;
            do {
                list.add(Long.valueOf(abstractC3473.mo7712()));
            } while (abstractC3473.mo7722() < iMo7722);
            return;
        }
        C3429 c3429 = (C3429) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                c3429.m7579(abstractC3473.mo7712());
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo77182 = abstractC3473.mo7718();
                }
            } while (iMo77182 == this.f11129);
            this.f11127 = iMo77182;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77172 = abstractC3473.mo7717();
        m7683(iMo77172);
        int iMo77222 = abstractC3473.mo7722() + iMo77172;
        do {
            c3429.m7579(abstractC3473.mo7712());
        } while (abstractC3473.mo7722() < iMo77222);
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo7460(List list) throws InvalidProtocolBufferException {
        int iMo7718;
        int iMo77182;
        boolean z = list instanceof C3429;
        int i = this.f11129;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC3473.mo7716()));
                    if (abstractC3473.mo7738()) {
                        return;
                    } else {
                        iMo7718 = abstractC3473.mo7718();
                    }
                } while (iMo7718 == this.f11129);
                this.f11127 = iMo7718;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7722 = abstractC3473.mo7722() + abstractC3473.mo7717();
            do {
                list.add(Long.valueOf(abstractC3473.mo7716()));
            } while (abstractC3473.mo7722() < iMo7722);
            m7685(iMo7722);
            return;
        }
        C3429 c3429 = (C3429) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3429.m7579(abstractC3473.mo7716());
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo77182 = abstractC3473.mo7718();
                }
            } while (iMo77182 == this.f11129);
            this.f11127 = iMo77182;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77222 = abstractC3473.mo7722() + abstractC3473.mo7717();
        do {
            c3429.m7579(abstractC3473.mo7716());
        } while (abstractC3473.mo7722() < iMo77222);
        m7685(iMo77222);
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo7461() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(0);
        return this.f11130.mo7717();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo7462(List list) throws InvalidProtocolBufferException {
        int iMo7718;
        int iMo77182;
        boolean z = list instanceof C3612;
        int i = this.f11129;
        AbstractC3473 abstractC3473 = this.f11130;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC3473.mo7717()));
                    if (abstractC3473.mo7738()) {
                        return;
                    } else {
                        iMo7718 = abstractC3473.mo7718();
                    }
                } while (iMo7718 == this.f11129);
                this.f11127 = iMo7718;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7722 = abstractC3473.mo7722() + abstractC3473.mo7717();
            do {
                list.add(Integer.valueOf(abstractC3473.mo7717()));
            } while (abstractC3473.mo7722() < iMo7722);
            m7685(iMo7722);
            return;
        }
        C3612 c3612 = (C3612) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3612.m7825(abstractC3473.mo7717());
                if (abstractC3473.mo7738()) {
                    return;
                } else {
                    iMo77182 = abstractC3473.mo7718();
                }
            } while (iMo77182 == this.f11129);
            this.f11127 = iMo77182;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77222 = abstractC3473.mo7722() + abstractC3473.mo7717();
        do {
            c3612.m7825(abstractC3473.mo7717());
        } while (abstractC3473.mo7722() < iMo77222);
        m7685(iMo77222);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r1.mo7739(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        return;
     */
    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo7463(java.util.Map r10, com.google.protobuf.C3418 r11, com.google.protobuf.C3696 r12) throws com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r9 = this;
            r0 = 2
            r9.m7686(r0)
            com.google.protobuf.飘花落叶言子世苏兰哲楪 r1 = r9.f11130
            int r2 = r1.mo7717()
            int r2 = r1.mo7740(r2)
            java.lang.Object r3 = r11.f11078
            java.lang.Object r4 = r11.f11076
            r5 = r4
        L13:
            int r6 = r9.mo7433()     // Catch: java.lang.Throwable -> L37
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L5b
            boolean r7 = r1.mo7738()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L23
            goto L5b
        L23:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L46
            if (r6 == r0) goto L3b
            boolean r6 = r9.mo7438()     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
            if (r6 == 0) goto L31
            goto L13
        L31:
            com.google.protobuf.InvalidProtocolBufferException r6 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
            throw r6     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
        L37:
            r9 = move-exception
            goto L62
        L39:
            r6 = move-exception
            goto L4e
        L3b:
            com.google.protobuf.WireFormat$FieldType r6 = r11.f11077     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
            java.lang.Class r7 = r4.getClass()     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
            java.lang.Object r5 = r9.m7690(r6, r7, r12)     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
            goto L13
        L46:
            com.google.protobuf.WireFormat$FieldType r6 = r11.f11079     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
            r7 = 0
            java.lang.Object r3 = r9.m7690(r6, r7, r7)     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
            goto L13
        L4e:
            boolean r7 = r9.mo7438()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L55
            goto L13
        L55:
            com.google.protobuf.InvalidProtocolBufferException r9 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L37
            r9.<init>(r8, r6)     // Catch: java.lang.Throwable -> L37
            throw r9     // Catch: java.lang.Throwable -> L37
        L5b:
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L37
            r1.mo7739(r2)
            return
        L62:
            r1.mo7739(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3463.mo7463(java.util.Map, com.google.protobuf.飘花落叶言世楪哲苏子兰, com.google.protobuf.飘花落叶言楪苏子哲兰世):void");
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final int mo7464() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(5);
        return this.f11130.mo7734();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo7465() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(0);
        return this.f11130.mo7733();
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo7466(Class cls, C3696 c3696) throws InvalidProtocolBufferException {
        m7686(2);
        InterfaceC3344 interfaceC3344M7493 = C3371.f11013.m7493(cls);
        Object objNewInstance = interfaceC3344M7493.newInstance();
        m7687(objNewInstance, interfaceC3344M7493, c3696);
        interfaceC3344M7493.mo7407(objNewInstance);
        return objNewInstance;
    }

    @Override // com.google.protobuf.InterfaceC3358
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo7467(Object obj, InterfaceC3344 interfaceC3344, C3696 c3696) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7686(3);
        m7688(obj, interfaceC3344, c3696);
    }
}
