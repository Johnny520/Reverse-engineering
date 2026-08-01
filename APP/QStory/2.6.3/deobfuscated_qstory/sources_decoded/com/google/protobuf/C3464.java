package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3464 implements InterfaceC3359 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f11132 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f11133;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f11134;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3474 f11135;

    public C3464(AbstractC3474 abstractC3474) {
        AbstractC3402.m7505(abstractC3474, "input");
        this.f11135 = abstractC3474;
        abstractC3474.f11153 = this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static void m7670(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static void m7671(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.InterfaceC3359
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(1);
        return this.f11135.mo7723();
    }

    @Override // com.google.protobuf.InterfaceC3359
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(5);
        return this.f11135.mo7714();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m7672(int i) throws InvalidProtocolBufferException {
        if (this.f11135.mo7709() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m7673(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f11134 & 7) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m7674(Object obj, InterfaceC3345 interfaceC3345, C3697 c3697) throws InvalidProtocolBufferException {
        AbstractC3474 abstractC3474 = this.f11135;
        int iMo7704 = abstractC3474.mo7704();
        abstractC3474.m7711();
        int iMo7727 = abstractC3474.mo7727(iMo7704);
        abstractC3474.f11155++;
        interfaceC3345.mo7392(obj, this, c3697);
        abstractC3474.mo7712(0);
        abstractC3474.f11155--;
        abstractC3474.mo7726(iMo7727);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m7675(Object obj, InterfaceC3345 interfaceC3345, C3697 c3697) {
        int i = this.f11133;
        this.f11133 = ((this.f11134 >>> 3) << 3) | 4;
        try {
            interfaceC3345.mo7392(obj, this, c3697);
            if (this.f11134 == this.f11133) {
            } else {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } finally {
            this.f11133 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m7676(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo7705;
        int iMo77052;
        if ((this.f11134 & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        boolean z2 = list instanceof InterfaceC3425;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z2 || z) {
            do {
                list.add(z ? mo7413() : mo7422());
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo7705 = abstractC3474.mo7705();
                }
            } while (iMo7705 == this.f11134);
            this.f11132 = iMo7705;
            return;
        }
        InterfaceC3425 interfaceC3425 = (InterfaceC3425) list;
        do {
            interfaceC3425.mo7495(mo7428());
            if (abstractC3474.mo7725()) {
                return;
            } else {
                iMo77052 = abstractC3474.mo7705();
            }
        } while (iMo77052 == this.f11134);
        this.f11132 = iMo77052;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final Object m7677(WireFormat$FieldType wireFormat$FieldType, Class cls, C3697 c3697) {
        switch (AbstractC3465.f11136[wireFormat$FieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo7452());
            case 2:
                return mo7428();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo7441());
            case 5:
                return Integer.valueOf(mo7451());
            case 6:
                return Long.valueOf(mo7434());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo7426());
            case 9:
                return Long.valueOf(mo7417());
            case 10:
                return mo7453(cls, c3697);
            case 11:
                return Integer.valueOf(mo7416());
            case 12:
                return Long.valueOf(mo7443());
            case 13:
                return Integer.valueOf(mo7440());
            case 14:
                return Long.valueOf(mo7424());
            case 15:
                return mo7413();
            case 16:
                return Integer.valueOf(mo7448());
            case 17:
                return Long.valueOf(mo7435());
            default:
                C5925.m11310("unsupported field type.");
                return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final String mo7413() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(2);
        return this.f11135.mo7706();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final void mo7414(List list) throws InvalidProtocolBufferException {
        int iMo7705;
        int iMo77052;
        boolean z = list instanceof C3430;
        int i = this.f11134;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(abstractC3474.mo7722()));
                    if (abstractC3474.mo7725()) {
                        return;
                    } else {
                        iMo7705 = abstractC3474.mo7705();
                    }
                } while (iMo7705 == this.f11134);
                this.f11132 = iMo7705;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7704 = abstractC3474.mo7704();
            m7670(iMo7704);
            int iMo7709 = abstractC3474.mo7709() + iMo7704;
            do {
                list.add(Long.valueOf(abstractC3474.mo7722()));
            } while (abstractC3474.mo7709() < iMo7709);
            return;
        }
        C3430 c3430 = (C3430) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                c3430.m7566(abstractC3474.mo7722());
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo77052 = abstractC3474.mo7705();
                }
            } while (iMo77052 == this.f11134);
            this.f11132 = iMo77052;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77042 = abstractC3474.mo7704();
        m7670(iMo77042);
        int iMo77092 = abstractC3474.mo7709() + iMo77042;
        do {
            c3430.m7566(abstractC3474.mo7722());
        } while (abstractC3474.mo7709() < iMo77092);
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo7415(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo7705;
        if ((this.f11134 & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(mo7428());
            AbstractC3474 abstractC3474 = this.f11135;
            if (abstractC3474.mo7725()) {
                return;
            } else {
                iMo7705 = abstractC3474.mo7705();
            }
        } while (iMo7705 == this.f11134);
        this.f11132 = iMo7705;
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final int mo7416() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(5);
        return this.f11135.mo7700();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final long mo7417() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(0);
        return this.f11135.mo7718();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo7418(List list) throws InvalidProtocolBufferException {
        int iMo7705;
        int iMo77052;
        boolean z = list instanceof C3591;
        int i = this.f11134;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(abstractC3474.mo7723()));
                    if (abstractC3474.mo7725()) {
                        return;
                    } else {
                        iMo7705 = abstractC3474.mo7705();
                    }
                } while (iMo7705 == this.f11134);
                this.f11132 = iMo7705;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7704 = abstractC3474.mo7704();
            m7670(iMo7704);
            int iMo7709 = abstractC3474.mo7709() + iMo7704;
            do {
                list.add(Double.valueOf(abstractC3474.mo7723()));
            } while (abstractC3474.mo7709() < iMo7709);
            return;
        }
        C3591 c3591 = (C3591) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                c3591.m7795(abstractC3474.mo7723());
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo77052 = abstractC3474.mo7705();
                }
            } while (iMo77052 == this.f11134);
            this.f11132 = iMo77052;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77042 = abstractC3474.mo7704();
        m7670(iMo77042);
        int iMo77092 = abstractC3474.mo7709() + iMo77042;
        do {
            c3591.m7795(abstractC3474.mo7723());
        } while (abstractC3474.mo7709() < iMo77092);
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo7419(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7676(list, false);
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final int mo7420() {
        int i = this.f11132;
        if (i != 0) {
            this.f11134 = i;
            this.f11132 = 0;
        } else {
            this.f11134 = this.f11135.mo7705();
        }
        int i2 = this.f11134;
        if (i2 == 0 || i2 == this.f11133) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo7421(Class cls, C3697 c3697) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(3);
        InterfaceC3345 interfaceC3345M7480 = C3372.f11018.m7480(cls);
        Object objNewInstance = interfaceC3345M7480.newInstance();
        m7675(objNewInstance, interfaceC3345M7480, c3697);
        interfaceC3345M7480.mo7394(objNewInstance);
        return objNewInstance;
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final String mo7422() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(2);
        return this.f11135.mo7707();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo7423(List list) throws InvalidProtocolBufferException {
        int iMo7705;
        int iMo77052;
        boolean z = list instanceof C3535;
        int i = this.f11134;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC3474.mo7720()));
                    if (abstractC3474.mo7725()) {
                        return;
                    } else {
                        iMo7705 = abstractC3474.mo7705();
                    }
                } while (iMo7705 == this.f11134);
                this.f11132 = iMo7705;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7709 = abstractC3474.mo7709() + abstractC3474.mo7704();
            do {
                list.add(Boolean.valueOf(abstractC3474.mo7720()));
            } while (abstractC3474.mo7709() < iMo7709);
            m7672(iMo7709);
            return;
        }
        C3535 c3535 = (C3535) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3535.m7761(abstractC3474.mo7720());
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo77052 = abstractC3474.mo7705();
                }
            } while (iMo77052 == this.f11134);
            this.f11132 = iMo77052;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77092 = abstractC3474.mo7709() + abstractC3474.mo7704();
        do {
            c3535.m7761(abstractC3474.mo7720());
        } while (abstractC3474.mo7709() < iMo77092);
        m7672(iMo77092);
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final long mo7424() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(0);
        return this.f11135.mo7708();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final boolean mo7425() {
        int i;
        AbstractC3474 abstractC3474 = this.f11135;
        if (abstractC3474.mo7725() || (i = this.f11134) == this.f11133) {
            return false;
        }
        return abstractC3474.mo7697(i);
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final int mo7426() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(0);
        return this.f11135.mo7717();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo7427(List list) throws InvalidProtocolBufferException {
        int iMo7705;
        int iMo77052;
        boolean z = list instanceof C3639;
        int i = this.f11134;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo7704 = abstractC3474.mo7704();
                m7671(iMo7704);
                int iMo7709 = abstractC3474.mo7709() + iMo7704;
                do {
                    list.add(Float.valueOf(abstractC3474.mo7714()));
                } while (abstractC3474.mo7709() < iMo7709);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(abstractC3474.mo7714()));
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo7705 = abstractC3474.mo7705();
                }
            } while (iMo7705 == this.f11134);
            this.f11132 = iMo7705;
            return;
        }
        C3639 c3639 = (C3639) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo77042 = abstractC3474.mo7704();
            m7671(iMo77042);
            int iMo77092 = abstractC3474.mo7709() + iMo77042;
            do {
                c3639.m7842(abstractC3474.mo7714());
            } while (abstractC3474.mo7709() < iMo77092);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c3639.m7842(abstractC3474.mo7714());
            if (abstractC3474.mo7725()) {
                return;
            } else {
                iMo77052 = abstractC3474.mo7705();
            }
        } while (iMo77052 == this.f11134);
        this.f11132 = iMo77052;
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final ByteString mo7428() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(2);
        return this.f11135.mo7719();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo7429(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7676(list, true);
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo7430(Object obj, InterfaceC3345 interfaceC3345, C3697 c3697) throws InvalidProtocolBufferException {
        m7673(2);
        m7674(obj, interfaceC3345, c3697);
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo7431(List list, InterfaceC3345 interfaceC3345, C3697 c3697) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo7705;
        int i = this.f11134;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Object objNewInstance = interfaceC3345.newInstance();
            m7675(objNewInstance, interfaceC3345, c3697);
            interfaceC3345.mo7394(objNewInstance);
            list.add(objNewInstance);
            AbstractC3474 abstractC3474 = this.f11135;
            if (abstractC3474.mo7725() || this.f11132 != 0) {
                return;
            } else {
                iMo7705 = abstractC3474.mo7705();
            }
        } while (iMo7705 == i);
        this.f11132 = iMo7705;
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo7432(List list) throws InvalidProtocolBufferException {
        int iMo7705;
        int iMo77052;
        boolean z = list instanceof C3430;
        int i = this.f11134;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC3474.mo7708()));
                    if (abstractC3474.mo7725()) {
                        return;
                    } else {
                        iMo7705 = abstractC3474.mo7705();
                    }
                } while (iMo7705 == this.f11134);
                this.f11132 = iMo7705;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7709 = abstractC3474.mo7709() + abstractC3474.mo7704();
            do {
                list.add(Long.valueOf(abstractC3474.mo7708()));
            } while (abstractC3474.mo7709() < iMo7709);
            m7672(iMo7709);
            return;
        }
        C3430 c3430 = (C3430) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3430.m7566(abstractC3474.mo7708());
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo77052 = abstractC3474.mo7705();
                }
            } while (iMo77052 == this.f11134);
            this.f11132 = iMo77052;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77092 = abstractC3474.mo7709() + abstractC3474.mo7704();
        do {
            c3430.m7566(abstractC3474.mo7708());
        } while (abstractC3474.mo7709() < iMo77092);
        m7672(iMo77092);
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo7433(List list) throws InvalidProtocolBufferException {
        int iMo7705;
        int iMo77052;
        boolean z = list instanceof C3613;
        int i = this.f11134;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo7704 = abstractC3474.mo7704();
                m7671(iMo7704);
                int iMo7709 = abstractC3474.mo7709() + iMo7704;
                do {
                    list.add(Integer.valueOf(abstractC3474.mo7700()));
                } while (abstractC3474.mo7709() < iMo7709);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(abstractC3474.mo7700()));
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo7705 = abstractC3474.mo7705();
                }
            } while (iMo7705 == this.f11134);
            this.f11132 = iMo7705;
            return;
        }
        C3613 c3613 = (C3613) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo77042 = abstractC3474.mo7704();
            m7671(iMo77042);
            int iMo77092 = abstractC3474.mo7709() + iMo77042;
            do {
                c3613.m7812(abstractC3474.mo7700());
            } while (abstractC3474.mo7709() < iMo77092);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c3613.m7812(abstractC3474.mo7700());
            if (abstractC3474.mo7725()) {
                return;
            } else {
                iMo77052 = abstractC3474.mo7705();
            }
        } while (iMo77052 == this.f11134);
        this.f11132 = iMo77052;
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final long mo7434() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(1);
        return this.f11135.mo7722();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final long mo7435() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(0);
        return this.f11135.mo7703();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7436(List list) throws InvalidProtocolBufferException {
        int iMo7705;
        int iMo77052;
        boolean z = list instanceof C3613;
        int i = this.f11134;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC3474.mo7698()));
                    if (abstractC3474.mo7725()) {
                        return;
                    } else {
                        iMo7705 = abstractC3474.mo7705();
                    }
                } while (iMo7705 == this.f11134);
                this.f11132 = iMo7705;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7709 = abstractC3474.mo7709() + abstractC3474.mo7704();
            do {
                list.add(Integer.valueOf(abstractC3474.mo7698()));
            } while (abstractC3474.mo7709() < iMo7709);
            m7672(iMo7709);
            return;
        }
        C3613 c3613 = (C3613) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3613.m7812(abstractC3474.mo7698());
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo77052 = abstractC3474.mo7705();
                }
            } while (iMo77052 == this.f11134);
            this.f11132 = iMo77052;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77092 = abstractC3474.mo7709() + abstractC3474.mo7704();
        do {
            c3613.m7812(abstractC3474.mo7698());
        } while (abstractC3474.mo7709() < iMo77092);
        m7672(iMo77092);
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo7437(List list) throws InvalidProtocolBufferException {
        int iMo7705;
        int iMo77052;
        boolean z = list instanceof C3613;
        int i = this.f11134;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC3474.mo7724()));
                    if (abstractC3474.mo7725()) {
                        return;
                    } else {
                        iMo7705 = abstractC3474.mo7705();
                    }
                } while (iMo7705 == this.f11134);
                this.f11132 = iMo7705;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7709 = abstractC3474.mo7709() + abstractC3474.mo7704();
            do {
                list.add(Integer.valueOf(abstractC3474.mo7724()));
            } while (abstractC3474.mo7709() < iMo7709);
            m7672(iMo7709);
            return;
        }
        C3613 c3613 = (C3613) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3613.m7812(abstractC3474.mo7724());
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo77052 = abstractC3474.mo7705();
                }
            } while (iMo77052 == this.f11134);
            this.f11132 = iMo77052;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77092 = abstractC3474.mo7709() + abstractC3474.mo7704();
        do {
            c3613.m7812(abstractC3474.mo7724());
        } while (abstractC3474.mo7709() < iMo77092);
        m7672(iMo77092);
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo7438(List list) throws InvalidProtocolBufferException {
        int iMo7705;
        int iMo77052;
        boolean z = list instanceof C3613;
        int i = this.f11134;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC3474.mo7717()));
                    if (abstractC3474.mo7725()) {
                        return;
                    } else {
                        iMo7705 = abstractC3474.mo7705();
                    }
                } while (iMo7705 == this.f11134);
                this.f11132 = iMo7705;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7709 = abstractC3474.mo7709() + abstractC3474.mo7704();
            do {
                list.add(Integer.valueOf(abstractC3474.mo7717()));
            } while (abstractC3474.mo7709() < iMo7709);
            m7672(iMo7709);
            return;
        }
        C3613 c3613 = (C3613) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3613.m7812(abstractC3474.mo7717());
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo77052 = abstractC3474.mo7705();
                }
            } while (iMo77052 == this.f11134);
            this.f11132 = iMo77052;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77092 = abstractC3474.mo7709() + abstractC3474.mo7704();
        do {
            c3613.m7812(abstractC3474.mo7717());
        } while (abstractC3474.mo7709() < iMo77092);
        m7672(iMo77092);
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo7439(List list) throws InvalidProtocolBufferException {
        int iMo7705;
        int iMo77052;
        boolean z = list instanceof C3613;
        int i = this.f11134;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo7704 = abstractC3474.mo7704();
                m7671(iMo7704);
                int iMo7709 = abstractC3474.mo7709() + iMo7704;
                do {
                    list.add(Integer.valueOf(abstractC3474.mo7721()));
                } while (abstractC3474.mo7709() < iMo7709);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(abstractC3474.mo7721()));
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo7705 = abstractC3474.mo7705();
                }
            } while (iMo7705 == this.f11134);
            this.f11132 = iMo7705;
            return;
        }
        C3613 c3613 = (C3613) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo77042 = abstractC3474.mo7704();
            m7671(iMo77042);
            int iMo77092 = abstractC3474.mo7709() + iMo77042;
            do {
                c3613.m7812(abstractC3474.mo7721());
            } while (abstractC3474.mo7709() < iMo77092);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c3613.m7812(abstractC3474.mo7721());
            if (abstractC3474.mo7725()) {
                return;
            } else {
                iMo77052 = abstractC3474.mo7705();
            }
        } while (iMo77052 == this.f11134);
        this.f11132 = iMo77052;
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo7440() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(0);
        return this.f11135.mo7698();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final int mo7441() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(0);
        return this.f11135.mo7724();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo7442() {
        return this.f11134;
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final long mo7443() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(1);
        return this.f11135.mo7699();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo7444(List list, InterfaceC3345 interfaceC3345, C3697 c3697) throws InvalidProtocolBufferException {
        int iMo7705;
        int i = this.f11134;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Object objNewInstance = interfaceC3345.newInstance();
            m7674(objNewInstance, interfaceC3345, c3697);
            interfaceC3345.mo7394(objNewInstance);
            list.add(objNewInstance);
            AbstractC3474 abstractC3474 = this.f11135;
            if (abstractC3474.mo7725() || this.f11132 != 0) {
                return;
            } else {
                iMo7705 = abstractC3474.mo7705();
            }
        } while (iMo7705 == i);
        this.f11132 = iMo7705;
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo7445(List list) throws InvalidProtocolBufferException {
        int iMo7705;
        int iMo77052;
        boolean z = list instanceof C3430;
        int i = this.f11134;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC3474.mo7718()));
                    if (abstractC3474.mo7725()) {
                        return;
                    } else {
                        iMo7705 = abstractC3474.mo7705();
                    }
                } while (iMo7705 == this.f11134);
                this.f11132 = iMo7705;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7709 = abstractC3474.mo7709() + abstractC3474.mo7704();
            do {
                list.add(Long.valueOf(abstractC3474.mo7718()));
            } while (abstractC3474.mo7709() < iMo7709);
            m7672(iMo7709);
            return;
        }
        C3430 c3430 = (C3430) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3430.m7566(abstractC3474.mo7718());
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo77052 = abstractC3474.mo7705();
                }
            } while (iMo77052 == this.f11134);
            this.f11132 = iMo77052;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77092 = abstractC3474.mo7709() + abstractC3474.mo7704();
        do {
            c3430.m7566(abstractC3474.mo7718());
        } while (abstractC3474.mo7709() < iMo77092);
        m7672(iMo77092);
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo7446(List list) throws InvalidProtocolBufferException {
        int iMo7705;
        int iMo77052;
        boolean z = list instanceof C3430;
        int i = this.f11134;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(abstractC3474.mo7699()));
                    if (abstractC3474.mo7725()) {
                        return;
                    } else {
                        iMo7705 = abstractC3474.mo7705();
                    }
                } while (iMo7705 == this.f11134);
                this.f11132 = iMo7705;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7704 = abstractC3474.mo7704();
            m7670(iMo7704);
            int iMo7709 = abstractC3474.mo7709() + iMo7704;
            do {
                list.add(Long.valueOf(abstractC3474.mo7699()));
            } while (abstractC3474.mo7709() < iMo7709);
            return;
        }
        C3430 c3430 = (C3430) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                c3430.m7566(abstractC3474.mo7699());
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo77052 = abstractC3474.mo7705();
                }
            } while (iMo77052 == this.f11134);
            this.f11132 = iMo77052;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77042 = abstractC3474.mo7704();
        m7670(iMo77042);
        int iMo77092 = abstractC3474.mo7709() + iMo77042;
        do {
            c3430.m7566(abstractC3474.mo7699());
        } while (abstractC3474.mo7709() < iMo77092);
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo7447(List list) throws InvalidProtocolBufferException {
        int iMo7705;
        int iMo77052;
        boolean z = list instanceof C3430;
        int i = this.f11134;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC3474.mo7703()));
                    if (abstractC3474.mo7725()) {
                        return;
                    } else {
                        iMo7705 = abstractC3474.mo7705();
                    }
                } while (iMo7705 == this.f11134);
                this.f11132 = iMo7705;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7709 = abstractC3474.mo7709() + abstractC3474.mo7704();
            do {
                list.add(Long.valueOf(abstractC3474.mo7703()));
            } while (abstractC3474.mo7709() < iMo7709);
            m7672(iMo7709);
            return;
        }
        C3430 c3430 = (C3430) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3430.m7566(abstractC3474.mo7703());
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo77052 = abstractC3474.mo7705();
                }
            } while (iMo77052 == this.f11134);
            this.f11132 = iMo77052;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77092 = abstractC3474.mo7709() + abstractC3474.mo7704();
        do {
            c3430.m7566(abstractC3474.mo7703());
        } while (abstractC3474.mo7709() < iMo77092);
        m7672(iMo77092);
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo7448() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(0);
        return this.f11135.mo7704();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo7449(List list) throws InvalidProtocolBufferException {
        int iMo7705;
        int iMo77052;
        boolean z = list instanceof C3613;
        int i = this.f11134;
        AbstractC3474 abstractC3474 = this.f11135;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC3474.mo7704()));
                    if (abstractC3474.mo7725()) {
                        return;
                    } else {
                        iMo7705 = abstractC3474.mo7705();
                    }
                } while (iMo7705 == this.f11134);
                this.f11132 = iMo7705;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo7709 = abstractC3474.mo7709() + abstractC3474.mo7704();
            do {
                list.add(Integer.valueOf(abstractC3474.mo7704()));
            } while (abstractC3474.mo7709() < iMo7709);
            m7672(iMo7709);
            return;
        }
        C3613 c3613 = (C3613) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c3613.m7812(abstractC3474.mo7704());
                if (abstractC3474.mo7725()) {
                    return;
                } else {
                    iMo77052 = abstractC3474.mo7705();
                }
            } while (iMo77052 == this.f11134);
            this.f11132 = iMo77052;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo77092 = abstractC3474.mo7709() + abstractC3474.mo7704();
        do {
            c3613.m7812(abstractC3474.mo7704());
        } while (abstractC3474.mo7709() < iMo77092);
        m7672(iMo77092);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r1.mo7726(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        return;
     */
    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo7450(java.util.Map r10, com.google.protobuf.C3419 r11, com.google.protobuf.C3697 r12) throws com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r9 = this;
            r0 = 2
            r9.m7673(r0)
            com.google.protobuf.飘花落叶言子世苏兰哲楪 r1 = r9.f11135
            int r2 = r1.mo7704()
            int r2 = r1.mo7727(r2)
            java.lang.Object r3 = r11.f11083
            java.lang.Object r4 = r11.f11081
            r5 = r4
        L13:
            int r6 = r9.mo7420()     // Catch: java.lang.Throwable -> L37
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L5b
            boolean r7 = r1.mo7725()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L23
            goto L5b
        L23:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L46
            if (r6 == r0) goto L3b
            boolean r6 = r9.mo7425()     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
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
            com.google.protobuf.WireFormat$FieldType r6 = r11.f11082     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
            java.lang.Class r7 = r4.getClass()     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
            java.lang.Object r5 = r9.m7677(r6, r7, r12)     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
            goto L13
        L46:
            com.google.protobuf.WireFormat$FieldType r6 = r11.f11084     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
            r7 = 0
            java.lang.Object r3 = r9.m7677(r6, r7, r7)     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L39
            goto L13
        L4e:
            boolean r7 = r9.mo7425()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L55
            goto L13
        L55:
            com.google.protobuf.InvalidProtocolBufferException r9 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L37
            r9.<init>(r8, r6)     // Catch: java.lang.Throwable -> L37
            throw r9     // Catch: java.lang.Throwable -> L37
        L5b:
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L37
            r1.mo7726(r2)
            return
        L62:
            r1.mo7726(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3464.mo7450(java.util.Map, com.google.protobuf.飘花落叶言世楪哲苏子兰, com.google.protobuf.飘花落叶言楪苏子哲兰世):void");
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final int mo7451() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(5);
        return this.f11135.mo7721();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo7452() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(0);
        return this.f11135.mo7720();
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo7453(Class cls, C3697 c3697) throws InvalidProtocolBufferException {
        m7673(2);
        InterfaceC3345 interfaceC3345M7480 = C3372.f11018.m7480(cls);
        Object objNewInstance = interfaceC3345M7480.newInstance();
        m7674(objNewInstance, interfaceC3345M7480, c3697);
        interfaceC3345M7480.mo7394(objNewInstance);
        return objNewInstance;
    }

    @Override // com.google.protobuf.InterfaceC3359
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo7454(Object obj, InterfaceC3345 interfaceC3345, C3697 c3697) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m7673(3);
        m7675(obj, interfaceC3345, c3697);
    }
}
