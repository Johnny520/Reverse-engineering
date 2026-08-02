package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v70 {
    public final String a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v70(String str) {
        this.a = str;
    }

    public abstract void a(DexKitBridge dexKitBridge);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(DexKitBridge dexKitBridge, in0 in0Var) {
        dexKitBridge.getClass();
        cj0 cj0Var = new cj0();
        in0Var.j(cj0Var);
        byte[] bArrB0 = cj0Var.b0();
        ReentrantReadWriteLock.ReadLock lock = dexKitBridge.i.readLock();
        lock.lock();
        try {
            long j = dexKitBridge.h;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeFindClass = DexKitBridge.nativeFindClass(j, bArrB0);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindClass);
            byteBufferWrap.getClass();
            a aVar = new a();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            aVar.c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            ws wsVar = new ws();
            int iB = aVar.b(4);
            int iF = iB != 0 ? aVar.f(iB) : 0;
            for (int i = 0; i < iF; i++) {
                f fVarH = aVar.h(i);
                fVarH.getClass();
                wsVar.add(tl.z(dexKitBridge, fVarH));
            }
            if (wsVar.size() > 1) {
                hu.f0(wsVar, new sl0(11));
            }
            us usVar = (us) wsVar.a();
            ClassLoader classLoader = up0.j;
            if (classLoader == null) {
                t11.S("hostClassLoader");
                throw null;
            }
            usVar.getClass();
            u70 u70VarK = usVar.k();
            u70VarK.getClass();
            kj1 kj1Var = m01.a;
            String strB = i80.b(m01.a(classLoader, u70VarK.a));
            pp1 pp1Var = pp1.a;
            pp1.b().e(this.a, i80.e(strB));
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(DexKitBridge dexKitBridge, in0 in0Var) {
        dexKitBridge.getClass();
        dj0 dj0Var = new dj0();
        in0Var.j(dj0Var);
        byte[] bArrB0 = dj0Var.b0();
        ReentrantReadWriteLock.ReadLock lock = dexKitBridge.i.readLock();
        lock.lock();
        try {
            long j = dexKitBridge.h;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeFindMethod = DexKitBridge.nativeFindMethod(j, bArrB0);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindMethod);
            byteBufferWrap.getClass();
            a aVar = new a();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            aVar.c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            ki0 ki0Var = new ki0(1);
            int i = aVar.i();
            for (int i2 = 0; i2 < i; i2++) {
                r rVarJ = aVar.j(i2);
                rVarJ.getClass();
                ki0Var.add(p40.t(dexKitBridge, rVarJ));
            }
            if (ki0Var.size() > 1) {
                hu.f0(ki0Var, new sl0(12));
            }
            ug1 ug1Var = (ug1) ki0Var.a();
            ClassLoader classLoader = up0.j;
            if (classLoader == null) {
                t11.S("hostClassLoader");
                throw null;
            }
            ug1Var.getClass();
            g80 g80Var = new g80(ug1Var.k().a(classLoader, Boolean.valueOf(Modifier.isStatic(ug1Var.j))));
            pp1 pp1Var = pp1.a;
            pp1.b().e(this.a, g80Var.toString());
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class d() {
        pp1 pp1Var = pp1.a;
        op1 op1VarB = pp1.b();
        String str = this.a;
        String strC = op1VarB.c(str);
        if (strC == null) {
            strC = "";
        }
        if (strC.length() == 0) {
            s.i(vi0.j("DexDesc ", str, " not found in cache!"));
            return null;
        }
        String strC2 = i80.c(strC);
        ClassLoader classLoader = up0.j;
        if (classLoader != null) {
            return m01.a(classLoader, strC2);
        }
        t11.S("hostClassLoader");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Method e() {
        pp1 pp1Var = pp1.a;
        op1 op1VarB = pp1.b();
        String str = this.a;
        String strC = op1VarB.c(str);
        if (strC == null) {
            strC = "";
        }
        if (strC.length() == 0) {
            s.i(vi0.j("DexDesc ", str, " not found in cache!"));
            return null;
        }
        g80 g80Var = new g80(strC);
        ClassLoader classLoader = up0.j;
        if (classLoader != null) {
            return g80Var.a(classLoader, null);
        }
        t11.S("hostClassLoader");
        throw null;
    }
}
