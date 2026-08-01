package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import p144.C7547;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3474 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final CodedInputStream$VarintExperiment f11152 = CodedInputStream$VarintExperiment.CONTROL;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C3464 f11153;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f11154;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f11155;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static int m7690(InputStream inputStream, int i) throws IOException {
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
    public static long m7691(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m7692(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static AbstractC3477 m7693(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return m7694(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return m7694(bArr, 0, iRemaining, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static AbstractC3477 m7694(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        C3476 c3476;
        C3476 c34762;
        int iOrdinal = f11152.ordinal();
        try {
            if (iOrdinal == 1) {
                i3 = i2;
                c3476 = new C3476(bArr, i, i3, z, 0);
            } else {
                if (iOrdinal != 2) {
                    c34762 = new C3476(bArr, i, i2, z, 2);
                    i3 = i2;
                    c34762.mo7727(i3);
                    return c34762;
                }
                i3 = i2;
                c3476 = new C3476(bArr, i, i3, z, 1);
            }
            c34762.mo7727(i3);
            return c34762;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
        c34762 = c3476;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static AbstractC3474 m7695(InputStream inputStream) {
        if (inputStream != null) {
            return new C3475(inputStream);
        }
        byte[] bArr = AbstractC3402.f11057;
        return m7694(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m7696() throws InvalidProtocolBufferException {
        int iMo7705;
        do {
            iMo7705 = mo7705();
            if (iMo7705 == 0) {
                return;
            }
            m7711();
            this.f11154++;
            this.f11154--;
        } while (mo7697(iMo7705));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public abstract boolean mo7697(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public abstract int mo7698();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public abstract long mo7699();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public abstract int mo7700();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public abstract int mo7701();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Serializable m7702(WireFormat$FieldType wireFormat$FieldType, WireFormat$Utf8Validation wireFormat$Utf8Validation) {
        switch (AbstractC3478.f11172[wireFormat$FieldType.ordinal()]) {
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
                int i = AbstractC3478.f11173[wireFormat$Utf8Validation.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            C7547.m12774(wireFormat$Utf8Validation, "Unknown UTF8 validation: ");
                        }
                    }
                }
                break;
            case 16:
                C5925.m11310("readPrimitiveField() cannot handle nested groups.");
                break;
            case 17:
                C5925.m11310("readPrimitiveField() cannot handle embedded messages.");
                break;
            case 18:
                C5925.m11310("readPrimitiveField() cannot handle enums.");
                break;
            default:
                C7547.m12774(wireFormat$FieldType, "Unknown field type: ");
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public abstract long mo7703();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public abstract int mo7704();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public abstract int mo7705();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public abstract String mo7706();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public abstract String mo7707();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public abstract long mo7708();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract int mo7709();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract int mo7710();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7711() throws InvalidProtocolBufferException {
        if (this.f11155 + this.f11154 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract void mo7712(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public abstract void mo7713(int i, InterfaceC3450 interfaceC3450, C3697 c3697);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public abstract float mo7714();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public abstract InterfaceC3441 mo7715(InterfaceC3375 interfaceC3375, C3697 c3697);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public abstract void mo7716(InterfaceC3450 interfaceC3450, C3697 c3697);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public abstract int mo7717();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public abstract long mo7718();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public abstract ByteString mo7719();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public abstract boolean mo7720();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public abstract int mo7721();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public abstract long mo7722();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public abstract double mo7723();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public abstract int mo7724();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract boolean mo7725();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public abstract void mo7726(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public abstract int mo7727(int i);
}
