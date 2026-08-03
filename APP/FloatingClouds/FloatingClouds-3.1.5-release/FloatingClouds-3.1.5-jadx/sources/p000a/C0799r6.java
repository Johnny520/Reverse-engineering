package p000a;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.DexKitBridge;
import p000a.C0690lb;
import p000a.C0907x0;

/* JADX INFO: renamed from: a.r6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0799r6 extends AbstractC0417X1 {

    /* JADX INFO: renamed from: b */
    public final int f3139b;

    /* JADX INFO: renamed from: c */
    public final int f3140c;

    /* JADX INFO: renamed from: d */
    public final String f3141d;

    /* JADX INFO: renamed from: e */
    public final int f3142e;

    /* JADX INFO: renamed from: f */
    public final C0233Me f3143f;

    /* JADX INFO: renamed from: g */
    public final C0233Me f3144g;

    /* JADX INFO: renamed from: a.r6$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C0799r6 m1858a(DexKitBridge dexKitBridge, C0735o c0735o) {
            C0631i9.m1482e(dexKitBridge, "bridge");
            int iM780b = c0735o.m780b(4);
            int i = iM780b != 0 ? c0735o.f981b.getInt(iM780b + c0735o.f980a) : 0;
            int iM780b2 = c0735o.m780b(6);
            int i2 = iM780b2 != 0 ? c0735o.f981b.getInt(iM780b2 + c0735o.f980a) : 0;
            int iM780b3 = c0735o.m780b(8);
            int i3 = iM780b3 != 0 ? c0735o.f981b.getInt(iM780b3 + c0735o.f980a) : 0;
            int iM780b4 = c0735o.m780b(10);
            int i4 = iM780b4 != 0 ? c0735o.f981b.getInt(iM780b4 + c0735o.f980a) : 0;
            int iM780b5 = c0735o.m780b(12);
            String strM782d = iM780b5 != 0 ? c0735o.m782d(iM780b5 + c0735o.f980a) : null;
            C0631i9.m1479b(strM782d);
            int iM780b6 = c0735o.m780b(14);
            return new C0799r6(dexKitBridge, i, i2, i3, i4, strM782d, iM780b6 != 0 ? c0735o.f981b.getInt(iM780b6 + c0735o.f980a) : 0);
        }
    }

    /* JADX INFO: renamed from: a.r6$b */
    public static final class b extends AbstractC0859u9 implements InterfaceC0819s7<List<? extends C0907x0>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DexKitBridge f3145b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0799r6 f3146c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f3147d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f3148e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DexKitBridge dexKitBridge, C0799r6 c0799r6, int i, int i2) {
            super(0);
            this.f3145b = dexKitBridge;
            this.f3146c = c0799r6;
            this.f3147d = i;
            this.f3148e = i2;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000a.InterfaceC0819s7
        /* JADX INFO: renamed from: a */
        public final List<? extends C0907x0> mo31a() {
            int i = this.f3147d;
            int i2 = this.f3148e;
            this.f3146c.getClass();
            long jM1061a = AbstractC0417X1.m1061a(i, i2);
            DexKitBridge dexKitBridge = this.f3145b;
            dexKitBridge.getClass();
            ReentrantReadWriteLock.ReadLock lock = dexKitBridge.f6031b.readLock();
            lock.lock();
            try {
                long j = dexKitBridge.f6030a;
                if (j == 0) {
                    throw new IllegalStateException("DexKitBridge is not valid");
                }
                byte[] bArrNativeGetFieldAnnotations = DexKitBridge.nativeGetFieldAnnotations(j, jM1061a);
                lock.unlock();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetFieldAnnotations);
                C0631i9.m1481d(byteBufferWrap, "wrap(res)");
                C0469a c0469a = new C0469a();
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                c0469a.m781c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
                ArrayList arrayList = new ArrayList();
                int iM780b = c0469a.m780b(4);
                int iM784f = iM780b != 0 ? c0469a.m784f(iM780b) : 0;
                for (int i3 = 0; i3 < iM784f; i3++) {
                    C0507c c0507cM1140g = c0469a.m1140g(i3);
                    C0631i9.m1479b(c0507cM1140g);
                    arrayList.add(C0907x0.a.m2192a(dexKitBridge, c0507cM1140g));
                }
                return arrayList;
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a.r6$c */
    public static final class c extends AbstractC0859u9 implements InterfaceC0819s7<C0492b3> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DexKitBridge f3149b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0799r6 f3150c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f3151d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DexKitBridge dexKitBridge, C0799r6 c0799r6, int i) {
            super(0);
            this.f3149b = dexKitBridge;
            this.f3150c = c0799r6;
            this.f3151d = i;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000a.InterfaceC0819s7
        /* JADX INFO: renamed from: a */
        public final C0492b3 mo31a() {
            return this.f3149b.m3326r(new long[]{AbstractC0417X1.m1061a(this.f3151d, this.f3150c.f3139b)}).m1090a();
        }
    }

    /* JADX INFO: renamed from: a.r6$d */
    public static final class d extends AbstractC0859u9 implements InterfaceC0819s7<C0438Y4> {
        public d() {
            super(0);
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000a.InterfaceC0819s7
        /* JADX INFO: renamed from: a */
        public final C0438Y4 mo31a() {
            return new C0438Y4(C0799r6.this.f3141d);
        }
    }

    /* JADX INFO: renamed from: a.r6$e */
    public static final class e extends AbstractC0859u9 implements InterfaceC0819s7<C0747ob> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DexKitBridge f3153b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0799r6 f3154c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f3155d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f3156e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DexKitBridge dexKitBridge, C0799r6 c0799r6, int i, int i2) {
            super(0);
            this.f3153b = dexKitBridge;
            this.f3154c = c0799r6;
            this.f3155d = i;
            this.f3156e = i2;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000a.InterfaceC0819s7
        /* JADX INFO: renamed from: a */
        public final C0747ob mo31a() {
            int i = this.f3155d;
            int i2 = this.f3156e;
            this.f3154c.getClass();
            long jM1061a = AbstractC0417X1.m1061a(i, i2);
            DexKitBridge dexKitBridge = this.f3153b;
            dexKitBridge.getClass();
            ReentrantReadWriteLock.ReadLock lock = dexKitBridge.f6031b.readLock();
            lock.lock();
            try {
                long j = dexKitBridge.f6030a;
                if (j == 0) {
                    throw new IllegalStateException("DexKitBridge is not valid");
                }
                byte[] bArrNativeFieldGetMethods = DexKitBridge.nativeFieldGetMethods(j, jM1061a);
                lock.unlock();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFieldGetMethods);
                C0631i9.m1481d(byteBufferWrap, "wrap(res)");
                C0469a c0469a = new C0469a();
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                c0469a.m781c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
                C0747ob c0747ob = new C0747ob();
                int iM1143j = c0469a.m1143j();
                for (int i3 = 0; i3 < iM1143j; i3++) {
                    C0754p c0754pM1144k = c0469a.m1144k(i3);
                    C0631i9.m1479b(c0754pM1144k);
                    c0747ob.add(C0690lb.a.m1552a(dexKitBridge, c0754pM1144k));
                }
                return c0747ob;
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a.r6$f */
    public static final class f extends AbstractC0859u9 implements InterfaceC0819s7<C0492b3> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DexKitBridge f3157b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0799r6 f3158c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f3159d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DexKitBridge dexKitBridge, C0799r6 c0799r6, int i) {
            super(0);
            this.f3157b = dexKitBridge;
            this.f3158c = c0799r6;
            this.f3159d = i;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000a.InterfaceC0819s7
        /* JADX INFO: renamed from: a */
        public final C0492b3 mo31a() {
            return this.f3157b.m3326r(new long[]{AbstractC0417X1.m1061a(this.f3159d, this.f3158c.f3142e)}).m1090a();
        }
    }

    /* JADX INFO: renamed from: a.r6$g */
    public static final class g extends AbstractC0859u9 implements InterfaceC0819s7<C0747ob> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DexKitBridge f3160b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0799r6 f3161c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f3162d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f3163e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(DexKitBridge dexKitBridge, C0799r6 c0799r6, int i, int i2) {
            super(0);
            this.f3160b = dexKitBridge;
            this.f3161c = c0799r6;
            this.f3162d = i;
            this.f3163e = i2;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000a.InterfaceC0819s7
        /* JADX INFO: renamed from: a */
        public final C0747ob mo31a() {
            int i = this.f3162d;
            int i2 = this.f3163e;
            this.f3161c.getClass();
            long jM1061a = AbstractC0417X1.m1061a(i, i2);
            DexKitBridge dexKitBridge = this.f3160b;
            dexKitBridge.getClass();
            ReentrantReadWriteLock.ReadLock lock = dexKitBridge.f6031b.readLock();
            lock.lock();
            try {
                long j = dexKitBridge.f6030a;
                if (j == 0) {
                    throw new IllegalStateException("DexKitBridge is not valid");
                }
                byte[] bArrNativeFieldPutMethods = DexKitBridge.nativeFieldPutMethods(j, jM1061a);
                lock.unlock();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFieldPutMethods);
                C0631i9.m1481d(byteBufferWrap, "wrap(res)");
                C0469a c0469a = new C0469a();
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                c0469a.m781c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
                C0747ob c0747ob = new C0747ob();
                int iM1143j = c0469a.m1143j();
                for (int i3 = 0; i3 < iM1143j; i3++) {
                    C0754p c0754pM1144k = c0469a.m1144k(i3);
                    C0631i9.m1479b(c0754pM1144k);
                    c0747ob.add(C0690lb.a.m1552a(dexKitBridge, c0754pM1144k));
                }
                return c0747ob;
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }
    }

    public C0799r6(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5) {
        super(dexKitBridge, i, i2);
        this.f3139b = i3;
        this.f3140c = i4;
        this.f3141d = str;
        this.f3142e = i5;
        this.f3143f = new C0233Me(new d());
        new C0233Me(new c(dexKitBridge, this, i2));
        this.f3144g = new C0233Me(new f(dexKitBridge, this, i2));
        new C0233Me(new b(dexKitBridge, this, i2, i));
        new C0233Me(new e(dexKitBridge, this, i2, i));
        new C0233Me(new g(dexKitBridge, this, i2, i));
    }

    /* JADX INFO: renamed from: b */
    public final C0438Y4 m1856b() {
        return (C0438Y4) this.f3143f.m625a();
    }

    /* JADX INFO: renamed from: c */
    public final C0492b3 m1857c() {
        return (C0492b3) this.f3144g.m625a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0799r6) && C0631i9.m1478a(((C0799r6) obj).f3141d, this.f3141d);
    }

    public final int hashCode() {
        return this.f3141d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3140c;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(m1856b().f1642c);
        sb.append(" ");
        sb.append(m1856b().f1640a);
        sb.append(".");
        sb.append(m1856b().f1641b);
        String string = sb.toString();
        C0631i9.m1481d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
