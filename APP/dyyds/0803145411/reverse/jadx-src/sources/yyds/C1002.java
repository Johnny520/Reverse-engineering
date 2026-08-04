package yyds;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: yyds.ᛴᲈᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1002 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C0217 f4559;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f4560;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f4561;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC2266 f4562;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C1276 f4563;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ReentrantLock f4564 = new ReentrantLock();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2184[] f4565;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f4566;

    public C1002(int i, InterfaceC2266 interfaceC2266) {
        this.f4561 = i;
        this.f4562 = interfaceC2266;
        this.f4565 = new C2184[i];
        int i2 = AbstractC0891.f4077;
        this.f4563 = new C1276(i);
        this.f4559 = new C0217(i);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m2179(C2184 c2184) {
        ReentrantLock reentrantLock = this.f4564;
        reentrantLock.lock();
        try {
            this.f4559.addLast(c2184);
            reentrantLock.unlock();
            this.f4563.m3539();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.mo3311(r0.f8930);
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2180(AbstractC1320 abstractC1320) throws Throwable {
        C0820 c0820;
        int andDecrement;
        C1276 c1276 = this.f4563;
        int i = c1276.f8929;
        C0217 c0217 = this.f4559;
        if (abstractC1320 instanceof C0820) {
            c0820 = (C0820) abstractC1320;
            int i2 = c0820.f3754;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0820.f3754 = i2 - Integer.MIN_VALUE;
            } else {
                c0820 = new C0820(this, abstractC1320);
            }
        }
        Object obj = c0820.f3756;
        int i3 = c0820.f3754;
        if (i3 == 0) {
            AbstractC1544.m3189(obj);
            c0820.f3754 = 1;
            do {
                andDecrement = C1778.f8926.getAndDecrement(c1276);
            } while (andDecrement > i);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            Object obj2 = C2746.f13459;
            if (andDecrement <= 0) {
                C1853 c1853M1140 = AbstractC0395.m1140(AbstractC1367.m2783(c0820));
                try {
                    if (!c1276.m3538(c1853M1140)) {
                        while (true) {
                            int andDecrement2 = C1778.f8926.getAndDecrement(c1276);
                            if (andDecrement2 <= i) {
                                if (andDecrement2 > 0) {
                                    break;
                                }
                                if (c1276.m3538(c1853M1140)) {
                                    break;
                                }
                            }
                        }
                    }
                    Object objM3629 = c1853M1140.m3629();
                    if (objM3629 != enumC1765) {
                        objM3629 = obj2;
                    }
                    if (objM3629 == enumC1765) {
                        obj2 = objM3629;
                    }
                } catch (Throwable th) {
                    c1853M1140.m3618();
                    throw th;
                }
            }
            if (obj2 == enumC1765) {
                return enumC1765;
            }
        } else {
            if (i3 != 1) {
                C0188.m800("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1544.m3189(obj);
        }
        try {
            ReentrantLock reentrantLock = this.f4564;
            reentrantLock.lock();
            try {
                if (this.f4560) {
                    AbstractC2328.m4346(21, "Connection pool is closed");
                    throw null;
                }
                if (c0217.isEmpty() && this.f4566 < this.f4561) {
                    C2184 c2184 = new C2184((InterfaceC0124) this.f4562.mo731());
                    C2184[] c2184Arr = this.f4565;
                    int i4 = this.f4566;
                    this.f4566 = i4 + 1;
                    c2184Arr[i4] = c2184;
                    c0217.addLast(c2184);
                }
                return (C2184) c0217.removeLast();
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th2) {
            c1276.m3539();
            throw th2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:48|12)|46|29|(1:(1:39)(2:35|(1:37)))(1:31)|38|19|44|20|21|(1:23)(11:24|25|46|29|(0)(0)|38|19|44|20|21|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r10 = r10;
        r9 = r9;
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068 A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:29:0x0064, B:31:0x0068, B:35:0x0070, B:39:0x0077), top: B:46:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0053 -> B:25:0x0055). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2181(long j, C1717 c1717, AbstractC1320 abstractC1320) throws Throwable {
        C0081 c0081;
        InterfaceC2266 interfaceC2266;
        C0172 c0172;
        InterfaceC2266 interfaceC22662;
        C0081 c00812;
        Throwable th;
        Object objM1192;
        EnumC1765 enumC1765;
        InterfaceC2266 interfaceC22663;
        if (abstractC1320 instanceof C0081) {
            c0081 = (C0081) abstractC1320;
            int i = c0081.f660;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0081.f660 = i - Integer.MIN_VALUE;
            } else {
                c0081 = new C0081(this, abstractC1320);
            }
        }
        Object obj = c0081.f658;
        int i2 = c0081.f660;
        InterfaceC0274 interfaceC0274 = null;
        if (i2 == 0) {
            AbstractC1544.m3189(obj);
            interfaceC2266 = c1717;
            C0172 c01722 = new C0172();
            C1647 c1647 = new C1647(c01722, this, interfaceC0274, 4);
            c0081.f659 = interfaceC2266;
            c0081.f657 = c01722;
            c0081.f662 = j;
            c0081.f660 = 1;
            objM1192 = AbstractC0427.m1192(j, c1647, c0081);
            enumC1765 = EnumC1765.f8858;
            if (objM1192 != enumC1765) {
            }
        } else {
            if (i2 != 1) {
                C0188.m800("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = c0081.f662;
            C0172 c01723 = c0081.f657;
            InterfaceC2266 interfaceC22664 = c0081.f659;
            try {
                try {
                    AbstractC1544.m3189(obj);
                    interfaceC22663 = interfaceC22664;
                } catch (Throwable th2) {
                    c0172 = c01723;
                    interfaceC22662 = interfaceC22664;
                    c00812 = c0081;
                    th = th2;
                    if (th instanceof C1263) {
                    }
                    c0081 = c00812;
                    interfaceC2266 = interfaceC22662;
                    C0172 c017222 = new C0172();
                    C1647 c16472 = new C1647(c017222, this, interfaceC0274, 4);
                    c0081.f659 = interfaceC2266;
                    c0081.f657 = c017222;
                    c0081.f662 = j;
                    c0081.f660 = 1;
                    objM1192 = AbstractC0427.m1192(j, c16472, c0081);
                    enumC1765 = EnumC1765.f8858;
                    if (objM1192 != enumC1765) {
                    }
                }
                if (th instanceof C1263) {
                    interfaceC22662.mo731();
                } else {
                    if (th != null) {
                        throw th;
                    }
                    Object obj2 = c0172.f997;
                    if (obj2 != null) {
                        return obj2;
                    }
                }
                c0081 = c00812;
                interfaceC2266 = interfaceC22662;
                C0172 c0172222 = new C0172();
                C1647 c164722 = new C1647(c0172222, this, interfaceC0274, 4);
                c0081.f659 = interfaceC2266;
                c0081.f657 = c0172222;
                c0081.f662 = j;
                c0081.f660 = 1;
                objM1192 = AbstractC0427.m1192(j, c164722, c0081);
                enumC1765 = EnumC1765.f8858;
                if (objM1192 != enumC1765) {
                    return enumC1765;
                }
                interfaceC22663 = interfaceC2266;
                c01723 = c0172222;
                c0172 = c01723;
                interfaceC22662 = interfaceC22663;
                c00812 = c0081;
                th = null;
                if (th instanceof C1263) {
                }
                c0081 = c00812;
                interfaceC2266 = interfaceC22662;
                C0172 c01722222 = new C0172();
                C1647 c1647222 = new C1647(c01722222, this, interfaceC0274, 4);
                c0081.f659 = interfaceC2266;
                c0081.f657 = c01722222;
                c0081.f662 = j;
                c0081.f660 = 1;
                objM1192 = AbstractC0427.m1192(j, c1647222, c0081);
                enumC1765 = EnumC1765.f8858;
                if (objM1192 != enumC1765) {
                }
            } catch (Throwable th3) {
                C2184 c2184 = (C2184) c0172.f997;
                if (c2184 != null) {
                    m2179(c2184);
                }
                throw th3;
            }
            c0172 = c01723;
            interfaceC22662 = interfaceC22663;
            c00812 = c0081;
            th = null;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2182() {
        ReentrantLock reentrantLock = this.f4564;
        reentrantLock.lock();
        try {
            this.f4560 = true;
            for (C2184 c2184 : this.f4565) {
                if (c2184 != null) {
                    c2184.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m2183(StringBuilder sb) {
        C0217 c0217 = this.f4559;
        ReentrantLock reentrantLock = this.f4564;
        reentrantLock.lock();
        try {
            C2578 c2578M3296 = AbstractC0024.m3296();
            int i = c0217.f1227;
            for (int i2 = 0; i2 < i; i2++) {
                c2578M3296.add(c0217.get(i2));
            }
            C2578 c2578M3305 = AbstractC0024.m3305(c2578M3296);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.f4561 + ", ");
            sb.append("permits=" + Math.max(AbstractC2112.f10448.getIntVolatile(this.f4563, C1778.f8923), 0) + ", ");
            sb.append("queue=(size=" + c2578M3305.mo868() + ")[" + AbstractC1595.m3285(c2578M3305, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            C2184[] c2184Arr = this.f4565;
            int length = c2184Arr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                C2184 c2184 = c2184Arr[i4];
                i3++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i3);
                sb2.append("] - ");
                sb2.append(c2184 != null ? c2184.f10741.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (c2184 != null) {
                    c2184.m4175(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
