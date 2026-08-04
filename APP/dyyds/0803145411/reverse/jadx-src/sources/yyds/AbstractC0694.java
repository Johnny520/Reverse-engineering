package yyds;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛳᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0694 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final /* synthetic */ long f3283;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final /* synthetic */ long f3284;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final /* synthetic */ long f3285;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = AbstractC2112.f10448;
        f3284 = unsafe.objectFieldOffset(AbstractC0694.class.getDeclaredField("_next$volatile"));
        f3285 = unsafe.objectFieldOffset(AbstractC0694.class.getDeclaredField("_prev$volatile"));
        f3283 = unsafe.objectFieldOffset(AbstractC0694.class.getDeclaredField("_removedRef$volatile"));
    }

    public String toString() {
        return new C2404(this, AbstractC2408.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC2408.m4457(this);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Object m1601() {
        return AbstractC2112.f10448.getObjectVolatile(this, f3284);
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final AbstractC0694 m1602() {
        Object objM1601 = m1601();
        C1201 c1201 = objM1601 instanceof C1201 ? (C1201) objM1601 : null;
        return c1201 != null ? c1201.f5474 : (AbstractC0694) objM1601;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m1603(AbstractC0694 abstractC0694, int i) {
        AbstractC0694 abstractC06942;
        AbstractC0694 abstractC06943;
        while (true) {
            AbstractC0694 abstractC0694M1606 = this.m1606();
            if (abstractC0694M1606 instanceof C2031) {
                return (((C2031) abstractC0694M1606).f10132 & i) == 0 && abstractC0694M1606.m1603(abstractC0694, i);
            }
            Unsafe unsafe = AbstractC2112.f10448;
            unsafe.putObjectVolatile(abstractC0694, f3285, abstractC0694M1606);
            long j = f3284;
            unsafe.putObjectVolatile(abstractC0694, j, this);
            while (true) {
                Unsafe unsafe2 = AbstractC2112.f10448;
                abstractC06942 = this;
                abstractC06943 = abstractC0694;
                if (unsafe2.compareAndSwapObject(abstractC0694M1606, f3284, abstractC06942, abstractC06943)) {
                    abstractC06943.m1604(abstractC06942);
                    return true;
                }
                if (unsafe2.getObjectVolatile(abstractC0694M1606, j) != abstractC06942) {
                    break;
                }
                this = abstractC06942;
                abstractC0694 = abstractC06943;
            }
            this = abstractC06942;
            abstractC0694 = abstractC06943;
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m1604(AbstractC0694 abstractC0694) {
        AbstractC0694 abstractC06942;
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f3285;
            AbstractC0694 abstractC06943 = (AbstractC0694) unsafe.getObjectVolatile(abstractC0694, j);
            if (this.m1601() != abstractC0694) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = AbstractC2112.f10448;
                abstractC06942 = this;
                AbstractC0694 abstractC06944 = abstractC0694;
                if (unsafe2.compareAndSwapObject(abstractC06944, f3285, abstractC06943, abstractC06942)) {
                    if (abstractC06942.mo1605()) {
                        abstractC06944.m1607();
                        return;
                    }
                    return;
                } else {
                    abstractC0694 = abstractC06944;
                    if (unsafe2.getObjectVolatile(abstractC06944, j) != abstractC06943) {
                        break;
                    } else {
                        this = abstractC06942;
                    }
                }
            }
            this = abstractC06942;
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean mo1605() {
        return m1601() instanceof C1201;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final AbstractC0694 m1606() {
        AbstractC0694 abstractC0694M1607 = m1607();
        if (abstractC0694M1607 != null) {
            return abstractC0694M1607;
        }
        Unsafe unsafe = AbstractC2112.f10448;
        long j = f3285;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            AbstractC0694 abstractC0694 = (AbstractC0694) objectVolatile;
            if (!abstractC0694.mo1605()) {
                return abstractC0694;
            }
            objectVolatile = AbstractC2112.f10448.getObjectVolatile(abstractC0694, j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0694 m1607() {
        AbstractC0694 abstractC0694;
        Unsafe unsafe;
        loop0: while (true) {
            Unsafe unsafe2 = AbstractC2112.f10448;
            long j = f3285;
            AbstractC0694 abstractC06942 = (AbstractC0694) unsafe2.getObjectVolatile(this, j);
            AbstractC0694 abstractC06943 = null;
            AbstractC0694 abstractC06944 = abstractC06942;
            while (abstractC06944 != null) {
                Unsafe unsafe3 = AbstractC2112.f10448;
                long j2 = f3284;
                Object objectVolatile = unsafe3.getObjectVolatile(abstractC06944, j2);
                if (objectVolatile != this) {
                    AbstractC0694 abstractC06945 = abstractC06942;
                    abstractC0694 = this;
                    if (abstractC0694.mo1605()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof C1201)) {
                        abstractC06943 = abstractC06944;
                        abstractC06944 = (AbstractC0694) objectVolatile;
                    } else if (abstractC06943 != null) {
                        AbstractC0694 abstractC06946 = ((C1201) objectVolatile).f5474;
                        do {
                            AbstractC0694 abstractC06947 = abstractC06944;
                            unsafe = AbstractC2112.f10448;
                            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(abstractC06943, f3284, abstractC06947, abstractC06946);
                            abstractC06944 = abstractC06947;
                            if (zCompareAndSwapObject) {
                                this = abstractC0694;
                                abstractC06944 = abstractC06943;
                                abstractC06942 = abstractC06945;
                                abstractC06943 = null;
                            }
                        } while (unsafe.getObjectVolatile(abstractC06943, j2) == abstractC06944);
                    } else {
                        if (abstractC06944 == null) {
                            C0188.m794();
                            return null;
                        }
                        abstractC06944 = (AbstractC0694) unsafe3.getObjectVolatile(abstractC06944, j);
                    }
                    this = abstractC0694;
                    abstractC06942 = abstractC06945;
                } else {
                    if (abstractC06942 == abstractC06944) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = AbstractC2112.f10448;
                        AbstractC0694 abstractC06948 = this;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(abstractC06948, f3285, abstractC06942, abstractC06944);
                        AbstractC0694 abstractC06949 = abstractC06942;
                        abstractC0694 = abstractC06948;
                        if (zCompareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(abstractC0694, j) != abstractC06949) {
                            break;
                        }
                        this = abstractC0694;
                        abstractC06942 = abstractC06949;
                    }
                }
                this = abstractC0694;
            }
            C0188.m794();
            return null;
        }
    }
}
