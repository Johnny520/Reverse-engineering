package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪子兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4566 extends AbstractC4559 {
    @Override // com.google.protobuf.AbstractC4559
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final double mo8560(Object obj, long j) {
        return this.f11898.getDouble(obj, j);
    }

    @Override // com.google.protobuf.AbstractC4559
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final byte mo8561(Object obj, long j) {
        return this.f11898.getByte(obj, j);
    }

    @Override // com.google.protobuf.AbstractC4559
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final byte mo8562(long j) {
        return this.f11898.getByte(j);
    }

    @Override // com.google.protobuf.AbstractC4559
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8563(Object obj, long j) {
        return this.f11898.getBoolean(obj, j);
    }

    @Override // com.google.protobuf.AbstractC4559
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final boolean mo8566() {
        if (!super.mo8566()) {
            return false;
        }
        try {
            Class<?> cls = this.f11898.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            AbstractC4558.m8549(th);
            return false;
        }
    }

    @Override // com.google.protobuf.AbstractC4559
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo8568() {
        Unsafe unsafe = this.f11898;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC4558.m8545() != null) {
                    try {
                        Class<?> cls3 = this.f11898.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        AbstractC4558.m8549(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                AbstractC4558.m8549(th2);
            }
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC4559
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo8569(Object obj, long j, byte b) {
        this.f11898.putByte(obj, j, b);
    }

    @Override // com.google.protobuf.AbstractC4559
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo8570(Object obj, long j, boolean z) {
        this.f11898.putBoolean(obj, j, z);
    }

    @Override // com.google.protobuf.AbstractC4559
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo8573(Object obj, long j, double d) {
        this.f11898.putDouble(obj, j, d);
    }

    @Override // com.google.protobuf.AbstractC4559
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo8574(Object obj, long j, float f) {
        this.f11898.putFloat(obj, j, f);
    }

    @Override // com.google.protobuf.AbstractC4559
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final float mo8576(Object obj, long j) {
        return this.f11898.getFloat(obj, j);
    }

    @Override // com.google.protobuf.AbstractC4559
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final long mo8579(long j) {
        return this.f11898.getLong(j);
    }
}
