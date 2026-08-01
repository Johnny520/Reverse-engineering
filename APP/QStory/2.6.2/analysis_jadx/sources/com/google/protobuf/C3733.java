package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪子兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3733 extends AbstractC3726 {
    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final double mo8014(Object obj, long j) {
        return this.f11548.getDouble(obj, j);
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final byte mo8015(Object obj, long j) {
        return this.f11548.getByte(obj, j);
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final byte mo8016(long j) {
        return this.f11548.getByte(j);
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8017(Object obj, long j) {
        return this.f11548.getBoolean(obj, j);
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final boolean mo8020() {
        if (!super.mo8020()) {
            return false;
        }
        try {
            Class<?> cls = this.f11548.getClass();
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
            AbstractC3725.m8003(th);
            return false;
        }
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo8022() {
        Unsafe unsafe = this.f11548;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC3725.m7999() != null) {
                    try {
                        Class<?> cls3 = this.f11548.getClass();
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
                        AbstractC3725.m8003(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                AbstractC3725.m8003(th2);
            }
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo8023(Object obj, long j, byte b) {
        this.f11548.putByte(obj, j, b);
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo8024(Object obj, long j, boolean z) {
        this.f11548.putBoolean(obj, j, z);
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo8027(Object obj, long j, double d) {
        this.f11548.putDouble(obj, j, d);
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo8028(Object obj, long j, float f) {
        this.f11548.putFloat(obj, j, f);
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final float mo8030(Object obj, long j) {
        return this.f11548.getFloat(obj, j);
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final long mo8033(long j) {
        return this.f11548.getLong(j);
    }
}
