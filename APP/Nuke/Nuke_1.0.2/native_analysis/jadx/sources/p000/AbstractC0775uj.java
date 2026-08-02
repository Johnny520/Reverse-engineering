package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: uj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0775uj extends qp0 {
    /* JADX INFO: renamed from: b0 */
    public final byte[] m5507b0() {
        mj0 mj0Var = new mj0();
        mo170D(mj0Var);
        int i = mj0Var.f6674b;
        int iCapacity = mj0Var.f6673a.capacity() - mj0Var.f6674b;
        if (!mj0Var.f6679g) {
            C0676s.m4650i("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
            return null;
        }
        byte[] bArr = new byte[iCapacity];
        mj0Var.f6673a.position(i);
        mj0Var.f6673a.get(bArr);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(m5507b0(), ((AbstractC0775uj) obj).m5507b0());
    }

    public final int hashCode() {
        int i = -2128831035;
        for (byte b : m5507b0()) {
            i = (i ^ (b & 255)) * 16777619;
        }
        return i;
    }
}
