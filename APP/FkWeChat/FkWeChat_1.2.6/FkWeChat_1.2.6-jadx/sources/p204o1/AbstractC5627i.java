package p204o1;

import p250r1.C6455e;

/* JADX INFO: renamed from: o1.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5627i {
    /* JADX INFO: renamed from: a */
    public static final long m22791a(C5621c c5621c) {
        float x10 = c5621c.m22767a().getX();
        float y10 = c5621c.m22767a().getY();
        return C6455e.m25551e((((long) Float.floatToRawIntBits(x10)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L));
    }
}
