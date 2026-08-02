package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v70 {

    /* JADX INFO: renamed from: a */
    public final String f11803a;

    public v70(String str) {
        this.f11803a = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo129a(DexKitBridge dexKitBridge);

    /* JADX INFO: renamed from: b */
    public void m5637b(DexKitBridge dexKitBridge, in0 in0Var) {
        dexKitBridge.getClass();
        cj0 cj0Var = new cj0();
        in0Var.mo5j(cj0Var);
        byte[] bArrM5507b0 = cj0Var.m5507b0();
        ReentrantReadWriteLock.ReadLock lock = dexKitBridge.f7819i.readLock();
        lock.lock();
        try {
            long j = dexKitBridge.f7818h;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeFindClass = DexKitBridge.nativeFindClass(j, bArrM5507b0);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindClass);
            byteBufferWrap.getClass();
            C0000a c0000a = new C0000a();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0000a.m3662c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C0858ws c0858ws = new C0858ws();
            int iM3661b = c0000a.m3661b(4);
            int iM3665f = iM3661b != 0 ? c0000a.m3665f(iM3661b) : 0;
            for (int i = 0; i < iM3665f; i++) {
                C0185f c0185fM1h = c0000a.m1h(i);
                c0185fM1h.getClass();
                c0858ws.add(AbstractC0738tl.m5327z(dexKitBridge, c0185fM1h));
            }
            if (c0858ws.size() > 1) {
                AbstractC0290hu.m2231f0(c0858ws, new sl0(11));
            }
            C0784us c0784us = (C0784us) c0858ws.m5273a();
            ClassLoader classLoader = up0.f11402j;
            if (classLoader == null) {
                t11.m5067S("hostClassLoader");
                throw null;
            }
            c0784us.getClass();
            u70 u70VarM5573k = c0784us.m5573k();
            u70VarM5573k.getClass();
            kj1 kj1Var = m01.f6424a;
            String strM2299b = i80.m2299b(m01.m3022a(classLoader, u70VarM5573k.f11124a));
            pp1 pp1Var = pp1.f8445a;
            pp1.m3930b().m3608e(this.f11803a, i80.m2302e(strM2299b));
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5638c(DexKitBridge dexKitBridge, in0 in0Var) {
        dexKitBridge.getClass();
        dj0 dj0Var = new dj0();
        in0Var.mo5j(dj0Var);
        byte[] bArrM5507b0 = dj0Var.m5507b0();
        ReentrantReadWriteLock.ReadLock lock = dexKitBridge.f7819i.readLock();
        lock.lock();
        try {
            long j = dexKitBridge.f7818h;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeFindMethod = DexKitBridge.nativeFindMethod(j, bArrM5507b0);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindMethod);
            byteBufferWrap.getClass();
            C0000a c0000a = new C0000a();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0000a.m3662c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            ki0 ki0Var = new ki0(1);
            int iM2i = c0000a.m2i();
            for (int i = 0; i < iM2i; i++) {
                C0638r c0638rM3j = c0000a.m3j(i);
                c0638rM3j.getClass();
                ki0Var.add(p40.m3737t(dexKitBridge, c0638rM3j));
            }
            if (ki0Var.size() > 1) {
                AbstractC0290hu.m2231f0(ki0Var, new sl0(12));
            }
            ug1 ug1Var = (ug1) ki0Var.m5273a();
            ClassLoader classLoader = up0.f11402j;
            if (classLoader == null) {
                t11.m5067S("hostClassLoader");
                throw null;
            }
            ug1Var.getClass();
            g80 g80Var = new g80(ug1Var.m5492k().m1811a(classLoader, Boolean.valueOf(Modifier.isStatic(ug1Var.f11291j))));
            pp1 pp1Var = pp1.f8445a;
            pp1.m3930b().m3608e(this.f11803a, g80Var.toString());
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public Class m5639d() {
        pp1 pp1Var = pp1.f8445a;
        op1 op1VarM3930b = pp1.m3930b();
        String str = this.f11803a;
        String strM3606c = op1VarM3930b.m3606c(str);
        if (strM3606c == null) {
            strM3606c = "";
        }
        if (strM3606c.length() == 0) {
            C0676s.m4650i(vi0.m5691j("DexDesc ", str, " not found in cache!"));
            return null;
        }
        String strM2300c = i80.m2300c(strM3606c);
        ClassLoader classLoader = up0.f11402j;
        if (classLoader != null) {
            return m01.m3022a(classLoader, strM2300c);
        }
        t11.m5067S("hostClassLoader");
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public Method m5640e() {
        pp1 pp1Var = pp1.f8445a;
        op1 op1VarM3930b = pp1.m3930b();
        String str = this.f11803a;
        String strM3606c = op1VarM3930b.m3606c(str);
        if (strM3606c == null) {
            strM3606c = "";
        }
        if (strM3606c.length() == 0) {
            C0676s.m4650i(vi0.m5691j("DexDesc ", str, " not found in cache!"));
            return null;
        }
        g80 g80Var = new g80(strM3606c);
        ClassLoader classLoader = up0.f11402j;
        if (classLoader != null) {
            return g80Var.m1811a(classLoader, null);
        }
        t11.m5067S("hostClassLoader");
        throw null;
    }
}
