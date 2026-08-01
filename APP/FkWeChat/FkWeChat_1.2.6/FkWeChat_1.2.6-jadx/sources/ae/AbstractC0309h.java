package ae;

import com.alibaba.fastjson2.JSONWriter;
import p376zd.AbstractC9978b;
import p376zd.C10003m;
import p376zd.C10008o0;
import p376zd.C10010p0;
import p376zd.C9995i;

/* JADX INFO: renamed from: ae.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0309h {
    /* JADX INFO: renamed from: a */
    public static final long m943a(C10008o0 c10008o0, C10003m c10003m, int i10, int i11, long j10, long j11) {
        c10008o0.getClass();
        c10003m.getClass();
        int i12 = i10;
        int i13 = i11;
        long j12 = i13;
        AbstractC9978b.m38615b(c10003m.m38765G(), i12, j12);
        if (c10008o0.f33604s) {
            C10010p0.m38820a("closed");
            return 0L;
        }
        long jMax = j10;
        while (true) {
            long j13 = jMax;
            long jM897b = AbstractC0302a.m897b(c10008o0.f33603r, c10003m, j13, j11, i12, i13);
            if (jM897b != -1) {
                return jM897b;
            }
            long size = (c10008o0.f33603r.size() - j12) + 1;
            if (size >= j11 || !m945c(c10008o0.f33603r, c10003m, i10, i11, j13, j11) || c10008o0.f33602q.read(c10008o0.f33603r, JSONWriter.MASK_WRITE_ENUMS_USING_NAME) == -1) {
                return -1L;
            }
            jMax = Math.max(j13, size);
            i12 = i10;
            i13 = i11;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m944b(C10008o0 c10008o0, C10003m c10003m, int i10, int i11, long j10, long j11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = c10003m.m38765G();
        }
        return m943a(c10008o0, c10003m, i13, i11, j10, (i12 & 16) != 0 ? Long.MAX_VALUE : j11);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m945c(C9995i c9995i, C10003m c10003m, int i10, int i11, long j10, long j11) {
        if (c9995i.size() < j11) {
            return true;
        }
        int iMax = (int) Math.max(1L, (c9995i.size() - j11) + 1);
        int iMin = ((int) Math.min(i11, (c9995i.size() - j10) + 1)) - 1;
        if (iMax > iMin) {
            return false;
        }
        int i12 = iMin;
        while (true) {
            C9995i c9995i2 = c9995i;
            C10003m c10003m2 = c10003m;
            int i13 = i10;
            if (c9995i2.m38727t(c9995i.size() - ((long) i12), c10003m2, i13, i12)) {
                return true;
            }
            if (i12 == iMax) {
                return false;
            }
            i12--;
            c9995i = c9995i2;
            c10003m = c10003m2;
            i10 = i13;
        }
    }
}
