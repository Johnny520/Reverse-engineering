package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪子兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3734 extends AbstractC3727 {
    @Override // com.google.protobuf.AbstractC3727
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final double mo8001(Object obj, long j) {
        return this.f11553.getDouble(obj, j);
    }

    @Override // com.google.protobuf.AbstractC3727
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final byte mo8002(Object obj, long j) {
        return this.f11553.getByte(obj, j);
    }

    @Override // com.google.protobuf.AbstractC3727
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final byte mo8003(long j) {
        return this.f11553.getByte(j);
    }

    @Override // com.google.protobuf.AbstractC3727
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8004(Object obj, long j) {
        return this.f11553.getBoolean(obj, j);
    }

    @Override // com.google.protobuf.AbstractC3727
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final boolean mo8007() {
        if (!super.mo8007()) {
            return false;
        }
        try {
            Class<?> cls = this.f11553.getClass();
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
            AbstractC3726.m7990(th);
            return false;
        }
    }

    @Override // com.google.protobuf.AbstractC3727
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo8009() {
        Unsafe unsafe = this.f11553;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC3726.m7986() != null) {
                    try {
                        Class<?> cls3 = this.f11553.getClass();
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
                        AbstractC3726.m7990(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                AbstractC3726.m7990(th2);
            }
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC3727
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo8010(Object obj, long j, byte b) {
        this.f11553.putByte(obj, j, b);
    }

    @Override // com.google.protobuf.AbstractC3727
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo8011(Object obj, long j, boolean z) {
        this.f11553.putBoolean(obj, j, z);
    }

    @Override // com.google.protobuf.AbstractC3727
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo8014(Object obj, long j, double d) {
        this.f11553.putDouble(obj, j, d);
    }

    @Override // com.google.protobuf.AbstractC3727
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo8015(Object obj, long j, float f) {
        this.f11553.putFloat(obj, j, f);
    }

    @Override // com.google.protobuf.AbstractC3727
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final float mo8017(Object obj, long j) {
        return this.f11553.getFloat(obj, j);
    }

    @Override // com.google.protobuf.AbstractC3727
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final long mo8020(long j) {
        return this.f11553.getLong(j);
    }
}
