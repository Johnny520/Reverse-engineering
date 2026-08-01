package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4296 implements InterfaceC4191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f11477 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f11478;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f11479;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4306 f11480;

    public C4296(AbstractC4306 abstractC4306) {
        AbstractC4234.m8064(abstractC4306, "input");
        this.f11480 = abstractC4306;
        abstractC4306.f11498 = this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static void m8229(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static void m8230(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.InterfaceC4191
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(1);
        return this.f11480.mo8282();
    }

    @Override // com.google.protobuf.InterfaceC4191
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(5);
        return this.f11480.mo8273();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m8231(int i) throws InvalidProtocolBufferException {
        if (this.f11480.mo8268() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m8232(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f11479 & 7) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m8233(Object obj, InterfaceC4177 interfaceC4177, C4529 c4529) throws InvalidProtocolBufferException {
        AbstractC4306 abstractC4306 = this.f11480;
        int iMo8263 = abstractC4306.mo8263();
        abstractC4306.m8270();
        int iMo8286 = abstractC4306.mo8286(iMo8263);
        abstractC4306.f11500++;
        interfaceC4177.mo7951(obj, this, c4529);
        abstractC4306.mo8271(0);
        abstractC4306.f11500--;
        abstractC4306.mo8285(iMo8286);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m8234(Object obj, InterfaceC4177 interfaceC4177, C4529 c4529) {
        int i = this.f11478;
        this.f11478 = ((this.f11479 >>> 3) << 3) | 4;
        try {
            interfaceC4177.mo7951(obj, this, c4529);
            if (this.f11479 == this.f11478) {
            } else {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } finally {
            this.f11478 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m8235(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo8264;
        int iMo82642;
        if ((this.f11479 & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        boolean z2 = list instanceof InterfaceC4257;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z2 || z) {
            do {
                list.add(z ? mo7972() : mo7981());
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo8264 = abstractC4306.mo8264();
                }
            } while (iMo8264 == this.f11479);
            this.f11477 = iMo8264;
            return;
        }
        InterfaceC4257 interfaceC4257 = (InterfaceC4257) list;
        do {
            interfaceC4257.mo8054(mo7987());
            if (abstractC4306.mo8284()) {
                return;
            } else {
                iMo82642 = abstractC4306.mo8264();
            }
        } while (iMo82642 == this.f11479);
        this.f11477 = iMo82642;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final Object m8236(WireFormat$FieldType wireFormat$FieldType, Class cls, C4529 c4529) {
        switch (AbstractC4297.f11481[wireFormat$FieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo8011());
            case 2:
                return mo7987();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo8000());
            case 5:
                return Integer.valueOf(mo8010());
            case 6:
                return Long.valueOf(mo7993());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo7985());
            case 9:
                return Long.valueOf(mo7976());
            case 10:
                return mo8012(cls, c4529);
            case 11:
                return Integer.valueOf(mo7975());
            case 12:
                return Long.valueOf(mo8002());
            case 13:
                return Integer.valueOf(mo7999());
            case 14:
                return Long.valueOf(mo7983());
            case 15:
                return mo7972();
            case 16:
                return Integer.valueOf(mo8007());
            case 17:
                return Long.valueOf(mo7994());
            default:
                C6755.m11869("unsupported field type.");
                return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final String mo7972() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(2);
        return this.f11480.mo8265();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final void mo7973(List list) throws InvalidProtocolBufferException {
        int iMo8264;
        int iMo82642;
        boolean z = list instanceof C4262;
        int i = this.f11479;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(abstractC4306.mo8281()));
                    if (abstractC4306.mo8284()) {
                        return;
                    } else {
                        iMo8264 = abstractC4306.mo8264();
                    }
                } while (iMo8264 == this.f11479);
                this.f11477 = iMo8264;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo8263 = abstractC4306.mo8263();
            m8229(iMo8263);
            int iMo8268 = abstractC4306.mo8268() + iMo8263;
            do {
                list.add(Long.valueOf(abstractC4306.mo8281()));
            } while (abstractC4306.mo8268() < iMo8268);
            return;
        }
        C4262 c4262 = (C4262) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                c4262.m8125(abstractC4306.mo8281());
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo82642 = abstractC4306.mo8264();
                }
            } while (iMo82642 == this.f11479);
            this.f11477 = iMo82642;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo82632 = abstractC4306.mo8263();
        m8229(iMo82632);
        int iMo82682 = abstractC4306.mo8268() + iMo82632;
        do {
            c4262.m8125(abstractC4306.mo8281());
        } while (abstractC4306.mo8268() < iMo82682);
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo7974(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo8264;
        if ((this.f11479 & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(mo7987());
            AbstractC4306 abstractC4306 = this.f11480;
            if (abstractC4306.mo8284()) {
                return;
            } else {
                iMo8264 = abstractC4306.mo8264();
            }
        } while (iMo8264 == this.f11479);
        this.f11477 = iMo8264;
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final int mo7975() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(5);
        return this.f11480.mo8259();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final long mo7976() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(0);
        return this.f11480.mo8277();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo7977(List list) throws InvalidProtocolBufferException {
        int iMo8264;
        int iMo82642;
        boolean z = list instanceof C4423;
        int i = this.f11479;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(abstractC4306.mo8282()));
                    if (abstractC4306.mo8284()) {
                        return;
                    } else {
                        iMo8264 = abstractC4306.mo8264();
                    }
                } while (iMo8264 == this.f11479);
                this.f11477 = iMo8264;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo8263 = abstractC4306.mo8263();
            m8229(iMo8263);
            int iMo8268 = abstractC4306.mo8268() + iMo8263;
            do {
                list.add(Double.valueOf(abstractC4306.mo8282()));
            } while (abstractC4306.mo8268() < iMo8268);
            return;
        }
        C4423 c4423 = (C4423) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                c4423.m8354(abstractC4306.mo8282());
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo82642 = abstractC4306.mo8264();
                }
            } while (iMo82642 == this.f11479);
            this.f11477 = iMo82642;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo82632 = abstractC4306.mo8263();
        m8229(iMo82632);
        int iMo82682 = abstractC4306.mo8268() + iMo82632;
        do {
            c4423.m8354(abstractC4306.mo8282());
        } while (abstractC4306.mo8268() < iMo82682);
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo7978(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8235(list, false);
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final int mo7979() {
        int i = this.f11477;
        if (i != 0) {
            this.f11479 = i;
            this.f11477 = 0;
        } else {
            this.f11479 = this.f11480.mo8264();
        }
        int i2 = this.f11479;
        if (i2 == 0 || i2 == this.f11478) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo7980(Class cls, C4529 c4529) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(3);
        InterfaceC4177 interfaceC4177M8039 = C4204.f11363.m8039(cls);
        Object objNewInstance = interfaceC4177M8039.newInstance();
        m8234(objNewInstance, interfaceC4177M8039, c4529);
        interfaceC4177M8039.mo7953(objNewInstance);
        return objNewInstance;
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final String mo7981() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(2);
        return this.f11480.mo8266();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo7982(List list) throws InvalidProtocolBufferException {
        int iMo8264;
        int iMo82642;
        boolean z = list instanceof C4367;
        int i = this.f11479;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC4306.mo8279()));
                    if (abstractC4306.mo8284()) {
                        return;
                    } else {
                        iMo8264 = abstractC4306.mo8264();
                    }
                } while (iMo8264 == this.f11479);
                this.f11477 = iMo8264;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo8268 = abstractC4306.mo8268() + abstractC4306.mo8263();
            do {
                list.add(Boolean.valueOf(abstractC4306.mo8279()));
            } while (abstractC4306.mo8268() < iMo8268);
            m8231(iMo8268);
            return;
        }
        C4367 c4367 = (C4367) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c4367.m8320(abstractC4306.mo8279());
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo82642 = abstractC4306.mo8264();
                }
            } while (iMo82642 == this.f11479);
            this.f11477 = iMo82642;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo82682 = abstractC4306.mo8268() + abstractC4306.mo8263();
        do {
            c4367.m8320(abstractC4306.mo8279());
        } while (abstractC4306.mo8268() < iMo82682);
        m8231(iMo82682);
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final long mo7983() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(0);
        return this.f11480.mo8267();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final boolean mo7984() {
        int i;
        AbstractC4306 abstractC4306 = this.f11480;
        if (abstractC4306.mo8284() || (i = this.f11479) == this.f11478) {
            return false;
        }
        return abstractC4306.mo8256(i);
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final int mo7985() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(0);
        return this.f11480.mo8276();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo7986(List list) throws InvalidProtocolBufferException {
        int iMo8264;
        int iMo82642;
        boolean z = list instanceof C4471;
        int i = this.f11479;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo8263 = abstractC4306.mo8263();
                m8230(iMo8263);
                int iMo8268 = abstractC4306.mo8268() + iMo8263;
                do {
                    list.add(Float.valueOf(abstractC4306.mo8273()));
                } while (abstractC4306.mo8268() < iMo8268);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(abstractC4306.mo8273()));
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo8264 = abstractC4306.mo8264();
                }
            } while (iMo8264 == this.f11479);
            this.f11477 = iMo8264;
            return;
        }
        C4471 c4471 = (C4471) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo82632 = abstractC4306.mo8263();
            m8230(iMo82632);
            int iMo82682 = abstractC4306.mo8268() + iMo82632;
            do {
                c4471.m8401(abstractC4306.mo8273());
            } while (abstractC4306.mo8268() < iMo82682);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c4471.m8401(abstractC4306.mo8273());
            if (abstractC4306.mo8284()) {
                return;
            } else {
                iMo82642 = abstractC4306.mo8264();
            }
        } while (iMo82642 == this.f11479);
        this.f11477 = iMo82642;
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final ByteString mo7987() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(2);
        return this.f11480.mo8278();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo7988(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8235(list, true);
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo7989(Object obj, InterfaceC4177 interfaceC4177, C4529 c4529) throws InvalidProtocolBufferException {
        m8232(2);
        m8233(obj, interfaceC4177, c4529);
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo7990(List list, InterfaceC4177 interfaceC4177, C4529 c4529) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo8264;
        int i = this.f11479;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Object objNewInstance = interfaceC4177.newInstance();
            m8234(objNewInstance, interfaceC4177, c4529);
            interfaceC4177.mo7953(objNewInstance);
            list.add(objNewInstance);
            AbstractC4306 abstractC4306 = this.f11480;
            if (abstractC4306.mo8284() || this.f11477 != 0) {
                return;
            } else {
                iMo8264 = abstractC4306.mo8264();
            }
        } while (iMo8264 == i);
        this.f11477 = iMo8264;
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo7991(List list) throws InvalidProtocolBufferException {
        int iMo8264;
        int iMo82642;
        boolean z = list instanceof C4262;
        int i = this.f11479;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC4306.mo8267()));
                    if (abstractC4306.mo8284()) {
                        return;
                    } else {
                        iMo8264 = abstractC4306.mo8264();
                    }
                } while (iMo8264 == this.f11479);
                this.f11477 = iMo8264;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo8268 = abstractC4306.mo8268() + abstractC4306.mo8263();
            do {
                list.add(Long.valueOf(abstractC4306.mo8267()));
            } while (abstractC4306.mo8268() < iMo8268);
            m8231(iMo8268);
            return;
        }
        C4262 c4262 = (C4262) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c4262.m8125(abstractC4306.mo8267());
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo82642 = abstractC4306.mo8264();
                }
            } while (iMo82642 == this.f11479);
            this.f11477 = iMo82642;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo82682 = abstractC4306.mo8268() + abstractC4306.mo8263();
        do {
            c4262.m8125(abstractC4306.mo8267());
        } while (abstractC4306.mo8268() < iMo82682);
        m8231(iMo82682);
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo7992(List list) throws InvalidProtocolBufferException {
        int iMo8264;
        int iMo82642;
        boolean z = list instanceof C4445;
        int i = this.f11479;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo8263 = abstractC4306.mo8263();
                m8230(iMo8263);
                int iMo8268 = abstractC4306.mo8268() + iMo8263;
                do {
                    list.add(Integer.valueOf(abstractC4306.mo8259()));
                } while (abstractC4306.mo8268() < iMo8268);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(abstractC4306.mo8259()));
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo8264 = abstractC4306.mo8264();
                }
            } while (iMo8264 == this.f11479);
            this.f11477 = iMo8264;
            return;
        }
        C4445 c4445 = (C4445) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo82632 = abstractC4306.mo8263();
            m8230(iMo82632);
            int iMo82682 = abstractC4306.mo8268() + iMo82632;
            do {
                c4445.m8371(abstractC4306.mo8259());
            } while (abstractC4306.mo8268() < iMo82682);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c4445.m8371(abstractC4306.mo8259());
            if (abstractC4306.mo8284()) {
                return;
            } else {
                iMo82642 = abstractC4306.mo8264();
            }
        } while (iMo82642 == this.f11479);
        this.f11477 = iMo82642;
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final long mo7993() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(1);
        return this.f11480.mo8281();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final long mo7994() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(0);
        return this.f11480.mo8262();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7995(List list) throws InvalidProtocolBufferException {
        int iMo8264;
        int iMo82642;
        boolean z = list instanceof C4445;
        int i = this.f11479;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC4306.mo8257()));
                    if (abstractC4306.mo8284()) {
                        return;
                    } else {
                        iMo8264 = abstractC4306.mo8264();
                    }
                } while (iMo8264 == this.f11479);
                this.f11477 = iMo8264;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo8268 = abstractC4306.mo8268() + abstractC4306.mo8263();
            do {
                list.add(Integer.valueOf(abstractC4306.mo8257()));
            } while (abstractC4306.mo8268() < iMo8268);
            m8231(iMo8268);
            return;
        }
        C4445 c4445 = (C4445) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c4445.m8371(abstractC4306.mo8257());
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo82642 = abstractC4306.mo8264();
                }
            } while (iMo82642 == this.f11479);
            this.f11477 = iMo82642;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo82682 = abstractC4306.mo8268() + abstractC4306.mo8263();
        do {
            c4445.m8371(abstractC4306.mo8257());
        } while (abstractC4306.mo8268() < iMo82682);
        m8231(iMo82682);
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo7996(List list) throws InvalidProtocolBufferException {
        int iMo8264;
        int iMo82642;
        boolean z = list instanceof C4445;
        int i = this.f11479;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC4306.mo8283()));
                    if (abstractC4306.mo8284()) {
                        return;
                    } else {
                        iMo8264 = abstractC4306.mo8264();
                    }
                } while (iMo8264 == this.f11479);
                this.f11477 = iMo8264;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo8268 = abstractC4306.mo8268() + abstractC4306.mo8263();
            do {
                list.add(Integer.valueOf(abstractC4306.mo8283()));
            } while (abstractC4306.mo8268() < iMo8268);
            m8231(iMo8268);
            return;
        }
        C4445 c4445 = (C4445) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c4445.m8371(abstractC4306.mo8283());
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo82642 = abstractC4306.mo8264();
                }
            } while (iMo82642 == this.f11479);
            this.f11477 = iMo82642;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo82682 = abstractC4306.mo8268() + abstractC4306.mo8263();
        do {
            c4445.m8371(abstractC4306.mo8283());
        } while (abstractC4306.mo8268() < iMo82682);
        m8231(iMo82682);
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo7997(List list) throws InvalidProtocolBufferException {
        int iMo8264;
        int iMo82642;
        boolean z = list instanceof C4445;
        int i = this.f11479;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC4306.mo8276()));
                    if (abstractC4306.mo8284()) {
                        return;
                    } else {
                        iMo8264 = abstractC4306.mo8264();
                    }
                } while (iMo8264 == this.f11479);
                this.f11477 = iMo8264;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo8268 = abstractC4306.mo8268() + abstractC4306.mo8263();
            do {
                list.add(Integer.valueOf(abstractC4306.mo8276()));
            } while (abstractC4306.mo8268() < iMo8268);
            m8231(iMo8268);
            return;
        }
        C4445 c4445 = (C4445) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c4445.m8371(abstractC4306.mo8276());
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo82642 = abstractC4306.mo8264();
                }
            } while (iMo82642 == this.f11479);
            this.f11477 = iMo82642;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo82682 = abstractC4306.mo8268() + abstractC4306.mo8263();
        do {
            c4445.m8371(abstractC4306.mo8276());
        } while (abstractC4306.mo8268() < iMo82682);
        m8231(iMo82682);
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo7998(List list) throws InvalidProtocolBufferException {
        int iMo8264;
        int iMo82642;
        boolean z = list instanceof C4445;
        int i = this.f11479;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo8263 = abstractC4306.mo8263();
                m8230(iMo8263);
                int iMo8268 = abstractC4306.mo8268() + iMo8263;
                do {
                    list.add(Integer.valueOf(abstractC4306.mo8280()));
                } while (abstractC4306.mo8268() < iMo8268);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(abstractC4306.mo8280()));
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo8264 = abstractC4306.mo8264();
                }
            } while (iMo8264 == this.f11479);
            this.f11477 = iMo8264;
            return;
        }
        C4445 c4445 = (C4445) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo82632 = abstractC4306.mo8263();
            m8230(iMo82632);
            int iMo82682 = abstractC4306.mo8268() + iMo82632;
            do {
                c4445.m8371(abstractC4306.mo8280());
            } while (abstractC4306.mo8268() < iMo82682);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c4445.m8371(abstractC4306.mo8280());
            if (abstractC4306.mo8284()) {
                return;
            } else {
                iMo82642 = abstractC4306.mo8264();
            }
        } while (iMo82642 == this.f11479);
        this.f11477 = iMo82642;
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo7999() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(0);
        return this.f11480.mo8257();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final int mo8000() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(0);
        return this.f11480.mo8283();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo8001() {
        return this.f11479;
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final long mo8002() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(1);
        return this.f11480.mo8258();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo8003(List list, InterfaceC4177 interfaceC4177, C4529 c4529) throws InvalidProtocolBufferException {
        int iMo8264;
        int i = this.f11479;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Object objNewInstance = interfaceC4177.newInstance();
            m8233(objNewInstance, interfaceC4177, c4529);
            interfaceC4177.mo7953(objNewInstance);
            list.add(objNewInstance);
            AbstractC4306 abstractC4306 = this.f11480;
            if (abstractC4306.mo8284() || this.f11477 != 0) {
                return;
            } else {
                iMo8264 = abstractC4306.mo8264();
            }
        } while (iMo8264 == i);
        this.f11477 = iMo8264;
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo8004(List list) throws InvalidProtocolBufferException {
        int iMo8264;
        int iMo82642;
        boolean z = list instanceof C4262;
        int i = this.f11479;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC4306.mo8277()));
                    if (abstractC4306.mo8284()) {
                        return;
                    } else {
                        iMo8264 = abstractC4306.mo8264();
                    }
                } while (iMo8264 == this.f11479);
                this.f11477 = iMo8264;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo8268 = abstractC4306.mo8268() + abstractC4306.mo8263();
            do {
                list.add(Long.valueOf(abstractC4306.mo8277()));
            } while (abstractC4306.mo8268() < iMo8268);
            m8231(iMo8268);
            return;
        }
        C4262 c4262 = (C4262) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c4262.m8125(abstractC4306.mo8277());
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo82642 = abstractC4306.mo8264();
                }
            } while (iMo82642 == this.f11479);
            this.f11477 = iMo82642;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo82682 = abstractC4306.mo8268() + abstractC4306.mo8263();
        do {
            c4262.m8125(abstractC4306.mo8277());
        } while (abstractC4306.mo8268() < iMo82682);
        m8231(iMo82682);
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo8005(List list) throws InvalidProtocolBufferException {
        int iMo8264;
        int iMo82642;
        boolean z = list instanceof C4262;
        int i = this.f11479;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(abstractC4306.mo8258()));
                    if (abstractC4306.mo8284()) {
                        return;
                    } else {
                        iMo8264 = abstractC4306.mo8264();
                    }
                } while (iMo8264 == this.f11479);
                this.f11477 = iMo8264;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo8263 = abstractC4306.mo8263();
            m8229(iMo8263);
            int iMo8268 = abstractC4306.mo8268() + iMo8263;
            do {
                list.add(Long.valueOf(abstractC4306.mo8258()));
            } while (abstractC4306.mo8268() < iMo8268);
            return;
        }
        C4262 c4262 = (C4262) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                c4262.m8125(abstractC4306.mo8258());
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo82642 = abstractC4306.mo8264();
                }
            } while (iMo82642 == this.f11479);
            this.f11477 = iMo82642;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo82632 = abstractC4306.mo8263();
        m8229(iMo82632);
        int iMo82682 = abstractC4306.mo8268() + iMo82632;
        do {
            c4262.m8125(abstractC4306.mo8258());
        } while (abstractC4306.mo8268() < iMo82682);
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo8006(List list) throws InvalidProtocolBufferException {
        int iMo8264;
        int iMo82642;
        boolean z = list instanceof C4262;
        int i = this.f11479;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC4306.mo8262()));
                    if (abstractC4306.mo8284()) {
                        return;
                    } else {
                        iMo8264 = abstractC4306.mo8264();
                    }
                } while (iMo8264 == this.f11479);
                this.f11477 = iMo8264;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo8268 = abstractC4306.mo8268() + abstractC4306.mo8263();
            do {
                list.add(Long.valueOf(abstractC4306.mo8262()));
            } while (abstractC4306.mo8268() < iMo8268);
            m8231(iMo8268);
            return;
        }
        C4262 c4262 = (C4262) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c4262.m8125(abstractC4306.mo8262());
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo82642 = abstractC4306.mo8264();
                }
            } while (iMo82642 == this.f11479);
            this.f11477 = iMo82642;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo82682 = abstractC4306.mo8268() + abstractC4306.mo8263();
        do {
            c4262.m8125(abstractC4306.mo8262());
        } while (abstractC4306.mo8268() < iMo82682);
        m8231(iMo82682);
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo8007() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(0);
        return this.f11480.mo8263();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo8008(List list) throws InvalidProtocolBufferException {
        int iMo8264;
        int iMo82642;
        boolean z = list instanceof C4445;
        int i = this.f11479;
        AbstractC4306 abstractC4306 = this.f11480;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC4306.mo8263()));
                    if (abstractC4306.mo8284()) {
                        return;
                    } else {
                        iMo8264 = abstractC4306.mo8264();
                    }
                } while (iMo8264 == this.f11479);
                this.f11477 = iMo8264;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iMo8268 = abstractC4306.mo8268() + abstractC4306.mo8263();
            do {
                list.add(Integer.valueOf(abstractC4306.mo8263()));
            } while (abstractC4306.mo8268() < iMo8268);
            m8231(iMo8268);
            return;
        }
        C4445 c4445 = (C4445) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c4445.m8371(abstractC4306.mo8263());
                if (abstractC4306.mo8284()) {
                    return;
                } else {
                    iMo82642 = abstractC4306.mo8264();
                }
            } while (iMo82642 == this.f11479);
            this.f11477 = iMo82642;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iMo82682 = abstractC4306.mo8268() + abstractC4306.mo8263();
        do {
            c4445.m8371(abstractC4306.mo8263());
        } while (abstractC4306.mo8268() < iMo82682);
        m8231(iMo82682);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r1.mo8285(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        return;
     */
    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo8009(Map map, C4251 c4251, C4529 c4529) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(2);
        AbstractC4306 abstractC4306 = this.f11480;
        int iMo8286 = abstractC4306.mo8286(abstractC4306.mo8263());
        Object objM8236 = c4251.f11428;
        Object obj = c4251.f11426;
        Object objM82362 = obj;
        while (true) {
            try {
                int iMo7979 = mo7979();
                if (iMo7979 == Integer.MAX_VALUE || abstractC4306.mo8284()) {
                    break;
                }
                if (iMo7979 == 1) {
                    objM8236 = m8236(c4251.f11429, null, null);
                } else if (iMo7979 != 2) {
                    try {
                        if (!mo7984()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException e) {
                        if (!mo7984()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.", (IOException) e);
                        }
                    }
                } else {
                    objM82362 = m8236(c4251.f11427, obj.getClass(), c4529);
                }
            } catch (Throwable th) {
                abstractC4306.mo8285(iMo8286);
                throw th;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final int mo8010() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(5);
        return this.f11480.mo8280();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo8011() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(0);
        return this.f11480.mo8279();
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo8012(Class cls, C4529 c4529) throws InvalidProtocolBufferException {
        m8232(2);
        InterfaceC4177 interfaceC4177M8039 = C4204.f11363.m8039(cls);
        Object objNewInstance = interfaceC4177M8039.newInstance();
        m8233(objNewInstance, interfaceC4177M8039, c4529);
        interfaceC4177M8039.mo7953(objNewInstance);
        return objNewInstance;
    }

    @Override // com.google.protobuf.InterfaceC4191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo8013(Object obj, InterfaceC4177 interfaceC4177, C4529 c4529) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8232(3);
        m8234(obj, interfaceC4177, c4529);
    }
}
