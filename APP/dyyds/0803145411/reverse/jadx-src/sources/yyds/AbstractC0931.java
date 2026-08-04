package yyds;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛴᲀᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0931 extends AbstractC0694 implements InterfaceC0970, InterfaceC2067 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public AbstractC0986 f4255;

    @Override // yyds.AbstractC0694
    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC2408.m4457(this));
        sb.append("[job@");
        AbstractC0986 abstractC0986 = this.f4255;
        if (abstractC0986 == null) {
            abstractC0986 = null;
        }
        sb.append(AbstractC2408.m4457(abstractC0986));
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public abstract void mo925(Throwable th);

    @Override // yyds.InterfaceC2067
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean mo2048() {
        return true;
    }

    @Override // yyds.InterfaceC0970
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1720() {
        AbstractC0931 abstractC0931;
        Unsafe unsafe;
        long j;
        AbstractC0986 abstractC0986 = this.f4255;
        if (abstractC0986 == null) {
            abstractC0986 = null;
        }
        AbstractC0986 abstractC09862 = abstractC0986;
        while (true) {
            Object objM2163 = abstractC09862.m2163();
            if (objM2163 instanceof AbstractC0931) {
                if (objM2163 != this) {
                    return;
                }
                do {
                    unsafe = AbstractC2112.f10448;
                    j = AbstractC0986.f4496;
                    if (unsafe.compareAndSwapObject(abstractC09862, j, objM2163, AbstractC0395.f2036)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(abstractC09862, j) == objM2163);
            } else {
                if (!(objM2163 instanceof InterfaceC2067) || ((InterfaceC2067) objM2163).mo2049() == null) {
                    return;
                }
                while (true) {
                    Object objM1601 = this.m1601();
                    if (objM1601 instanceof C1201) {
                        return;
                    }
                    if (objM1601 == this) {
                        return;
                    }
                    AbstractC0694 abstractC0694 = (AbstractC0694) objM1601;
                    abstractC0694.getClass();
                    Unsafe unsafe2 = AbstractC2112.f10448;
                    long j2 = AbstractC0694.f3283;
                    C1201 c1201 = (C1201) unsafe2.getObjectVolatile(abstractC0694, j2);
                    if (c1201 == null) {
                        c1201 = new C1201(abstractC0694);
                        unsafe2.putObjectVolatile(abstractC0694, j2, c1201);
                    }
                    C1201 c12012 = c1201;
                    while (true) {
                        Unsafe unsafe3 = AbstractC2112.f10448;
                        long j3 = AbstractC0694.f3284;
                        abstractC0931 = this;
                        if (unsafe3.compareAndSwapObject(abstractC0931, j3, objM1601, c12012)) {
                            abstractC0694.m1607();
                            return;
                        } else if (unsafe3.getObjectVolatile(abstractC0931, j3) != objM1601) {
                            break;
                        } else {
                            this = abstractC0931;
                        }
                    }
                    this = abstractC0931;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public abstract boolean mo926();

    @Override // yyds.InterfaceC2067
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1518 mo2049() {
        return null;
    }
}
