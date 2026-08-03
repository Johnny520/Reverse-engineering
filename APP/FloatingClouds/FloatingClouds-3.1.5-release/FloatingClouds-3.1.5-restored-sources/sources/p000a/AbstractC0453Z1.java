package p000a;

import java.util.Arrays;

/* JADX INFO: renamed from: a.Z1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0453Z1 extends AbstractC0472a2 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(m1115g(), ((AbstractC0453Z1) obj).m1115g());
    }

    /* JADX INFO: renamed from: g */
    public final byte[] m1115g() {
        C0026B6 c0026b6 = new C0026B6();
        mo1150b(c0026b6);
        int i = c0026b6.f77b;
        int iCapacity = c0026b6.f76a.capacity() - c0026b6.f77b;
        if (!c0026b6.f82g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        byte[] bArr = new byte[iCapacity];
        c0026b6.f76a.position(i);
        c0026b6.f76a.get(bArr);
        return bArr;
    }

    public final int hashCode() {
        int i = (int) 2166136261L;
        for (byte b : m1115g()) {
            i = (i ^ (b & 255)) * 16777619;
        }
        return i;
    }
}
