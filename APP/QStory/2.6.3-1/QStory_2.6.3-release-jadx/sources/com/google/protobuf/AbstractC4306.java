package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import p160.C8376;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4306 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final CodedInputStream$VarintExperiment f11497 = CodedInputStream$VarintExperiment.CONTROL;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C4296 f11498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f11499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f11500;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static int m8249(InputStream inputStream, int i) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static long m8250(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m8251(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static AbstractC4309 m8252(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return m8253(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return m8253(bArr, 0, iRemaining, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static AbstractC4309 m8253(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        C4308 c4308;
        C4308 c43082;
        int iOrdinal = f11497.ordinal();
        try {
            if (iOrdinal == 1) {
                i3 = i2;
                c4308 = new C4308(bArr, i, i3, z, 0);
            } else {
                if (iOrdinal != 2) {
                    c43082 = new C4308(bArr, i, i2, z, 2);
                    i3 = i2;
                    c43082.mo8286(i3);
                    return c43082;
                }
                i3 = i2;
                c4308 = new C4308(bArr, i, i3, z, 1);
            }
            c43082.mo8286(i3);
            return c43082;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
        c43082 = c4308;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static AbstractC4306 m8254(InputStream inputStream) {
        if (inputStream != null) {
            return new C4307(inputStream);
        }
        byte[] bArr = AbstractC4234.f11402;
        return m8253(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m8255() throws InvalidProtocolBufferException {
        int iMo8264;
        do {
            iMo8264 = mo8264();
            if (iMo8264 == 0) {
                return;
            }
            m8270();
            this.f11499++;
            this.f11499--;
        } while (mo8256(iMo8264));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public abstract boolean mo8256(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public abstract int mo8257();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public abstract long mo8258();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public abstract int mo8259();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public abstract int mo8260();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Serializable m8261(WireFormat$FieldType wireFormat$FieldType, WireFormat$Utf8Validation wireFormat$Utf8Validation) {
        switch (AbstractC4310.f11517[wireFormat$FieldType.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                int i = AbstractC4310.f11518[wireFormat$Utf8Validation.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            C8376.m13333(wireFormat$Utf8Validation, "Unknown UTF8 validation: ");
                        }
                    }
                }
                break;
            case 16:
                C6755.m11869("readPrimitiveField() cannot handle nested groups.");
                break;
            case 17:
                C6755.m11869("readPrimitiveField() cannot handle embedded messages.");
                break;
            case 18:
                C6755.m11869("readPrimitiveField() cannot handle enums.");
                break;
            default:
                C8376.m13333(wireFormat$FieldType, "Unknown field type: ");
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public abstract long mo8262();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public abstract int mo8263();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public abstract int mo8264();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public abstract String mo8265();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public abstract String mo8266();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public abstract long mo8267();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract int mo8268();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract int mo8269();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8270() throws InvalidProtocolBufferException {
        if (this.f11500 + this.f11499 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract void mo8271(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public abstract void mo8272(int i, InterfaceC4282 interfaceC4282, C4529 c4529);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public abstract float mo8273();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public abstract InterfaceC4273 mo8274(InterfaceC4207 interfaceC4207, C4529 c4529);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public abstract void mo8275(InterfaceC4282 interfaceC4282, C4529 c4529);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public abstract int mo8276();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public abstract long mo8277();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public abstract ByteString mo8278();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public abstract boolean mo8279();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public abstract int mo8280();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public abstract long mo8281();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public abstract double mo8282();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public abstract int mo8283();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract boolean mo8284();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public abstract void mo8285(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public abstract int mo8286(int i);
}
