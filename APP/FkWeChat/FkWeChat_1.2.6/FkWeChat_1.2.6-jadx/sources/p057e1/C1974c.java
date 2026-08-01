package p057e1;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: e1.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1974c extends AtomicInteger {
    public C1974c(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: a */
    public final int m7136a(int i10) {
        return addAndGet(i10);
    }

    /* JADX INFO: renamed from: b */
    public byte m7137b() {
        return (byte) intValue();
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        return m7137b();
    }

    /* JADX INFO: renamed from: c */
    public /* bridge */ double m7138c() {
        return super.doubleValue();
    }

    /* JADX INFO: renamed from: d */
    public /* bridge */ float m7139d() {
        return super.floatValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ double doubleValue() {
        return m7138c();
    }

    /* JADX INFO: renamed from: e */
    public /* bridge */ int m7140e() {
        return super.intValue();
    }

    /* JADX INFO: renamed from: f */
    public /* bridge */ long m7141f() {
        return super.longValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ float floatValue() {
        return m7139d();
    }

    /* JADX INFO: renamed from: g */
    public short m7142g() {
        return (short) intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ int intValue() {
        return m7140e();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ long longValue() {
        return m7141f();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        return m7142g();
    }
}
