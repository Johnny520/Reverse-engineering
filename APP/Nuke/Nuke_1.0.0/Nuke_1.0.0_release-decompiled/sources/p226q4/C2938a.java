package p226q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p061L2.AbstractC0973m;
import p061L2.AbstractC0974n;
import p179i4.AbstractC2352g;
import p206n2.C2690b;
import p243t4.C3229i;

/* JADX INFO: renamed from: q4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2938a extends AbstractC2352g {

    /* JADX INFO: renamed from: b */
    public List f9260b;

    /* JADX INFO: renamed from: c */
    public C3229i f9261c;

    /* JADX INFO: renamed from: K */
    public final byte[] m5140K() {
        C2690b c2690b = new C2690b();
        mo4213w(c2690b);
        int i5 = c2690b.f8579b;
        int iCapacity = c2690b.f8578a.capacity() - c2690b.f8579b;
        if (!c2690b.f8584g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        byte[] bArr = new byte[iCapacity];
        c2690b.f8578a.position(i5);
        c2690b.f8578a.get(bArr);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(m5140K(), ((C2938a) obj).m5140K());
    }

    public final int hashCode() {
        int i5 = (int) 2166136261L;
        for (byte b2 : m5140K()) {
            i5 = (i5 ^ (b2 & 255)) * 16777619;
        }
        return i5;
    }

    @Override // p179i4.AbstractC2352g
    /* JADX INFO: renamed from: w */
    public final int mo4213w(C2690b c2690b) {
        int iM4677g;
        List list = this.f9260b;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0974n.m2029K(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(c2690b.m4675e((String) it.next())));
            }
            int[] iArrM2023d0 = AbstractC0973m.m2023d0(arrayList);
            if (c2690b.f8583f) {
                throw new AssertionError("FlatBuffers: object serialization must not be nested.");
            }
            c2690b.m4683m(4, iArrM2023d0.length, 4);
            for (int length = iArrM2023d0.length - 1; length >= 0; length--) {
                c2690b.m4672b(iArrM2023d0[length]);
            }
            iM4677g = c2690b.m4677g();
        } else {
            iM4677g = 0;
        }
        C3229i c3229i = this.f9261c;
        int iMo4213w = c3229i != null ? c3229i.mo4213w(c2690b) : 0;
        c2690b.m4682l(7);
        c2690b.m4673c(6, iMo4213w);
        c2690b.m4673c(4, 0);
        c2690b.m4673c(3, 0);
        c2690b.m4673c(1, 0);
        c2690b.m4673c(0, iM4677g);
        int iM4676f = c2690b.m4676f();
        c2690b.m4678h(iM4676f);
        return iM4676f;
    }
}
