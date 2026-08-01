package p121i3;

import com.alibaba.fastjson2.JSONWriter;
import p152k3.AbstractC3950d;

/* JADX INFO: renamed from: i3.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3194x {
    /* JADX INFO: renamed from: a */
    public static final long m12109a(float f10, long j10) {
        return m12116h(j10, f10);
    }

    /* JADX INFO: renamed from: b */
    public static final void m12110b(long j10) {
        if (C3193w.m12101f(j10) == 0) {
            AbstractC3184n.m12039a("Cannot perform operation for Unspecified type.");
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m12111c(long j10, long j11) {
        if (!((C3193w.m12101f(j10) == 0 || C3193w.m12101f(j11) == 0) ? false : true)) {
            AbstractC3184n.m12039a("Cannot perform operation for Unspecified type.");
        }
        if (C3195y.m12123g(C3193w.m12102g(j10), C3193w.m12102g(j11))) {
            return;
        }
        AbstractC3184n.m12039a("Cannot perform operation for " + ((Object) C3195y.m12125i(C3193w.m12102g(j10))) + " and " + ((Object) C3195y.m12125i(C3193w.m12102g(j11))));
    }

    /* JADX INFO: renamed from: d */
    public static final long m12112d(double d10) {
        return m12116h(JSONWriter.MASK_IGNORE_NON_FIELD_GETTER, (float) d10);
    }

    /* JADX INFO: renamed from: e */
    public static final long m12113e(float f10) {
        return m12116h(JSONWriter.MASK_IGNORE_NON_FIELD_GETTER, f10);
    }

    /* JADX INFO: renamed from: f */
    public static final long m12114f(int i10) {
        return m12116h(JSONWriter.MASK_IGNORE_NON_FIELD_GETTER, i10);
    }

    /* JADX INFO: renamed from: g */
    public static final long m12115g(long j10, long j11, float f10) {
        m12111c(j10, j11);
        return m12116h(C3193w.m12101f(j10), AbstractC3950d.m15660b(C3193w.m12103h(j10), C3193w.m12103h(j11), f10));
    }

    /* JADX INFO: renamed from: h */
    public static final long m12116h(long j10, float f10) {
        return C3193w.m12098c(j10 | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
    }
}
