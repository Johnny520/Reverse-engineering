package p331we;

import com.alibaba.fastjson2.util.Fnv;
import java.util.Arrays;
import p024b9.AbstractC1061t;
import p172l8.C4688c0;
import p172l8.C4718y;
import p299ub.AbstractC8621f0;
import p299ub.AbstractC8627i0;
import p322w5.C9186a;

/* JADX INFO: renamed from: we.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9231a extends AbstractC9232b {
    /* JADX INFO: renamed from: c */
    public final String m35948c() {
        byte[] bArrM35949d = m35949d();
        long jM18729c = Fnv.MAGIC_HASH_CODE;
        for (byte b10 : bArrM35949d) {
            jM18729c = C4688c0.m18729c(C4688c0.m18729c(jM18729c ^ C4688c0.m18729c(((long) C4718y.m18817c(b10)) & 255)) * Fnv.MAGIC_PRIME);
        }
        return AbstractC8621f0.m33094A0(AbstractC8627i0.m33187a(jM18729c, 16), 16, '0');
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ byte[] m35949d() {
        C9186a c9186a = new C9186a();
        m35950a(c9186a);
        byte[] bArrM35751J = c9186a.m35751J();
        bArrM35751J.getClass();
        return bArrM35751J;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC1061t.m3842c(getClass(), obj.getClass())) {
            return false;
        }
        return Arrays.equals(m35949d(), ((AbstractC9231a) obj).m35949d());
    }

    public int hashCode() {
        int i10 = (int) 2166136261L;
        for (byte b10 : m35949d()) {
            i10 = (i10 ^ (b10 & 255)) * 16777619;
        }
        return i10;
    }
}
