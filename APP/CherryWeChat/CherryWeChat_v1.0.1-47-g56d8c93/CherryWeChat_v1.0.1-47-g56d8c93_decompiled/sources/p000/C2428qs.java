package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: qs */
/* JADX INFO: loaded from: classes.dex */
public final class C2428qs implements InterfaceC0302H0 {

    /* JADX INFO: renamed from: e */
    public static final C0668Pg f8518e = new C0668Pg(22);

    /* JADX INFO: renamed from: f */
    public static final C0872UC f8519f = new C0872UC(2);

    /* JADX INFO: renamed from: a */
    public Object f8520a;

    /* JADX INFO: renamed from: b */
    public Object f8521b;

    /* JADX INFO: renamed from: c */
    public Object f8522c;

    /* JADX INFO: renamed from: d */
    public Object f8523d;

    public C2428qs(XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC0295Gu.m625r(-577514187520053L);
        Member member = methodHookParam.method;
        AbstractC0295Gu.m625r(-578089713137717L);
        this.f8520a = member;
        this.f8521b = methodHookParam.thisObject;
        Object[] objArr = methodHookParam.args;
        AbstractC0295Gu.m625r(-578119777908789L);
        this.f8522c = objArr;
        this.f8523d = methodHookParam;
    }

    /* JADX INFO: renamed from: A */
    public void m4862A(C0337Ht c0337Ht) throws GeneralSecurityException {
        c0337Ht.getClass();
        C0384Ix c0384Ix = new C0384Ix(AbstractC0295Gu.class, c0337Ht.f1143a);
        HashMap map = (HashMap) this.f8523d;
        if (!map.containsKey(c0384Ix)) {
            map.put(c0384Ix, c0337Ht);
            return;
        }
        C0337Ht c0337Ht2 = (C0337Ht) map.get(c0384Ix);
        if (c0337Ht2.equals(c0337Ht) && c0337Ht.equals(c0337Ht2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + c0384Ix);
    }

    /* JADX INFO: renamed from: B */
    public void m4863B(C0380It c0380It) throws GeneralSecurityException {
        C0427Jx c0427Jx = new C0427Jx(c0380It.f1311a, AbstractC0295Gu.class);
        HashMap map = (HashMap) this.f8522c;
        if (!map.containsKey(c0427Jx)) {
            map.put(c0427Jx, c0380It);
            return;
        }
        C0380It c0380It2 = (C0380It) map.get(c0427Jx);
        if (c0380It2.equals(c0380It) && c0380It.equals(c0380It2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + c0427Jx);
    }

    /* JADX INFO: renamed from: C */
    public void m4864C(Object obj) {
        ((XC_MethodHook.MethodHookParam) this.f8523d).setResult(obj);
    }

    /* JADX INFO: renamed from: D */
    public Bundle m4865D(Bundle bundle, String str) {
        HashMap map = (HashMap) this.f8522c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    /* JADX INFO: renamed from: E */
    public void m4866E() {
        XposedBridge.hookAllConstructors((Class) this.f8520a, new C1362eG(0, this));
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m4867a(InterfaceC0802Sm interfaceC0802Sm, C2236mg c2236mg) {
        C0517M0 c0517m0 = (C0517M0) ((HashMap) this.f8521b).put(interfaceC0802Sm, new C0517M0(interfaceC0802Sm, c2236mg, (ReferenceQueue) this.f8522c));
        if (c0517m0 != null) {
            c0517m0.f1685c = null;
            c0517m0.clear();
        }
    }

    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: b */
    public boolean mo642b(AbstractC0345I0 abstractC0345I0, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f8521b;
        C0386Iz c0386IzM4878p = m4878p(abstractC0345I0);
        C2520sy c2520sy = (C2520sy) this.f8523d;
        Menu menuC0335Hr = (Menu) c2520sy.get(menu);
        if (menuC0335Hr == null) {
            menuC0335Hr = new MenuC0335Hr((Context) this.f8522c, (MenuC2204lr) menu);
            c2520sy.put(menu, menuC0335Hr);
        }
        return callback.onCreateActionMode(c0386IzM4878p, menuC0335Hr);
    }

    /* JADX INFO: renamed from: c */
    public void m4868c(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        if (((ArrayList) this.f8520a).contains(abstractComponentCallbacksC1503hi)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC1503hi);
        }
        synchronized (((ArrayList) this.f8520a)) {
            ((ArrayList) this.f8520a).add(abstractComponentCallbacksC1503hi);
        }
        abstractComponentCallbacksC1503hi.f5320k = true;
    }

    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: d */
    public boolean mo643d(AbstractC0345I0 abstractC0345I0, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f8521b).onActionItemClicked(m4878p(abstractC0345I0), new MenuItemC2599ur((Context) this.f8522c, (InterfaceMenuItemC0558Mz) menuItem));
    }

    /* JADX INFO: renamed from: e */
    public void m4869e(Object obj, Object obj2, C2243mn c2243mn, boolean z) throws GeneralSecurityException {
        byte[] bArrArray;
        if (((ConcurrentHashMap) this.f8521b) == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (c2243mn.m4559D() != EnumC1271cn.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f8521b;
        Integer numValueOf = Integer.valueOf(c2243mn.m4557B());
        if (c2243mn.m4558C() == EnumC2773yt.RAW) {
            numValueOf = null;
        }
        AbstractC0828TB abstractC0828TBM5449a = C2815zs.f9535b.m5449a(C0252Fu.m524d(c2243mn.m4556A().m1792B(), c2243mn.m4556A().m1793C(), c2243mn.m4556A().m1791A(), c2243mn.m4558C(), numValueOf));
        int iOrdinal = c2243mn.m4558C().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(c2243mn.m4557B()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(c2243mn.m4557B()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(c2243mn.m4557B()).array();
        } else {
            bArrArray = AbstractC1293cr.f4725a;
        }
        C2516su c2516su = new C2516su(obj, obj2, bArrArray, c2243mn.m4559D(), c2243mn.m4558C(), c2243mn.m4557B(), c2243mn.m4556A().m1792B(), abstractC0828TBM5449a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c2516su);
        byte[] bArr = c2516su.f8809c;
        C2559tu c2559tu = new C2559tu(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
        List list = (List) concurrentHashMap.put(c2559tu, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(c2516su);
            concurrentHashMap.put(c2559tu, Collections.unmodifiableList(arrayList2));
        }
        if (z) {
            if (((C2516su) this.f8522c) != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f8522c = c2516su;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m4870f(InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-578802677708853L);
        this.f8523d = interfaceC1416fj;
        m4866E();
    }

    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: g */
    public boolean mo644g(AbstractC0345I0 abstractC0345I0, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f8521b;
        C0386Iz c0386IzM4878p = m4878p(abstractC0345I0);
        C2520sy c2520sy = (C2520sy) this.f8523d;
        Menu menuC0335Hr = (Menu) c2520sy.get(menu);
        if (menuC0335Hr == null) {
            menuC0335Hr = new MenuC0335Hr((Context) this.f8522c, (MenuC2204lr) menu);
            c2520sy.put(menu, menuC0335Hr);
        }
        return callback.onPrepareActionMode(c0386IzM4878p, menuC0335Hr);
    }

    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: h */
    public void mo645h(AbstractC0345I0 abstractC0345I0) {
        ((ActionMode.Callback) this.f8521b).onDestroyActionMode(m4878p(abstractC0345I0));
    }

    /* JADX INFO: renamed from: i */
    public C0285Gk m4871i() throws GeneralSecurityException {
        Integer num = (Integer) this.f8520a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f8521b) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((C2610v1) this.f8522c) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((C2610v1) this.f8523d) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f8520a));
        }
        Integer num2 = (Integer) this.f8521b;
        int iIntValue = num2.intValue();
        C2610v1 c2610v1 = (C2610v1) this.f8522c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (c2610v1 == C2610v1.f9018s) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (c2610v1 == C2610v1.f9019t) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (c2610v1 == C2610v1.f9020u) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (c2610v1 == C2610v1.f9021v) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (c2610v1 != C2610v1.f9022w) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new C0285Gk(((Integer) this.f8520a).intValue(), ((Integer) this.f8521b).intValue(), (C2610v1) this.f8523d, (C2610v1) this.f8522c);
    }

    /* JADX INFO: renamed from: j */
    public synchronized InterfaceC1189as m4872j(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C2385ps c2385ps : (ArrayList) this.f8520a) {
                if (((HashSet) this.f8522c).contains(c2385ps)) {
                    z = true;
                } else if (c2385ps.f8383a.isAssignableFrom(cls) && c2385ps.f8384b.isAssignableFrom(cls2)) {
                    ((HashSet) this.f8522c).add(c2385ps);
                    arrayList.add(c2385ps.f8385c.mo88p(this));
                    ((HashSet) this.f8522c).remove(c2385ps);
                }
            }
            if (arrayList.size() > 1) {
                C0668Pg c0668Pg = (C0668Pg) this.f8521b;
                C2656w4 c2656w4 = (C2656w4) this.f8523d;
                c0668Pg.getClass();
                return new C0907V4(2, arrayList, c2656w4);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC1189as) arrayList.get(0);
            }
            if (z) {
                return f8519f;
            }
            throw new C0597Nv("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.f8522c).clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public synchronized ArrayList m4873k(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C2385ps c2385ps : (ArrayList) this.f8520a) {
                if (!((HashSet) this.f8522c).contains(c2385ps) && c2385ps.f8383a.isAssignableFrom(cls)) {
                    ((HashSet) this.f8522c).add(c2385ps);
                    arrayList.add(c2385ps.f8385c.mo88p(this));
                    ((HashSet) this.f8522c).remove(c2385ps);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public void m4874l(C0517M0 c0517m0) {
        InterfaceC2389pw interfaceC2389pw;
        synchronized (this) {
            ((HashMap) this.f8521b).remove(c0517m0.f1683a);
            if (c0517m0.f1684b && (interfaceC2389pw = c0517m0.f1685c) != null) {
                ((C1264cg) this.f8523d).m2404d(c0517m0.f1683a, new C2236mg(interfaceC2389pw, true, false, c0517m0.f1683a, (C1264cg) this.f8523d));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m4875m(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C2520sy) this.f8523d).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m4875m(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: n */
    public AbstractComponentCallbacksC1503hi m4876n(String str) {
        C0326Hi c0326Hi = (C0326Hi) ((HashMap) this.f8521b).get(str);
        if (c0326Hi != null) {
            return c0326Hi.f1110c;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public AbstractComponentCallbacksC1503hi m4877o(String str) {
        for (C0326Hi c0326Hi : ((HashMap) this.f8521b).values()) {
            if (c0326Hi != null) {
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hiM4877o = c0326Hi.f1110c;
                if (!str.equals(abstractComponentCallbacksC1503hiM4877o.f5314e)) {
                    abstractComponentCallbacksC1503hiM4877o = abstractComponentCallbacksC1503hiM4877o.f5329t.f9494c.m4877o(str);
                }
                if (abstractComponentCallbacksC1503hiM4877o != null) {
                    return abstractComponentCallbacksC1503hiM4877o;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public C0386Iz m4878p(AbstractC0345I0 abstractC0345I0) {
        ArrayList arrayList = (ArrayList) this.f8520a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0386Iz c0386Iz = (C0386Iz) arrayList.get(i);
            if (c0386Iz != null && c0386Iz.f1323b == abstractC0345I0) {
                return c0386Iz;
            }
        }
        C0386Iz c0386Iz2 = new C0386Iz((Context) this.f8522c, abstractC0345I0);
        arrayList.add(c0386Iz2);
        return c0386Iz2;
    }

    /* JADX INFO: renamed from: q */
    public ArrayList m4879q() {
        ArrayList arrayList = new ArrayList();
        for (C0326Hi c0326Hi : ((HashMap) this.f8521b).values()) {
            if (c0326Hi != null) {
                arrayList.add(c0326Hi);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public ArrayList m4880r() {
        ArrayList arrayList = new ArrayList();
        for (C0326Hi c0326Hi : ((HashMap) this.f8521b).values()) {
            if (c0326Hi != null) {
                arrayList.add(c0326Hi.f1110c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public synchronized ArrayList m4881s(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C2385ps c2385ps : (ArrayList) this.f8520a) {
            if (!arrayList.contains(c2385ps.f8384b) && c2385ps.f8383a.isAssignableFrom(cls)) {
                arrayList.add(c2385ps.f8384b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public List m4882t() {
        ArrayList arrayList;
        if (((ArrayList) this.f8520a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f8520a)) {
            arrayList = new ArrayList((ArrayList) this.f8520a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public void m4883u(C0326Hi c0326Hi) {
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = c0326Hi.f1110c;
        String str = abstractComponentCallbacksC1503hi.f5314e;
        HashMap map = (HashMap) this.f8521b;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC1503hi.f5314e, c0326Hi);
        if (AbstractC2805zi.m5374G(2)) {
            abstractComponentCallbacksC1503hi.toString();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m4884v(C0326Hi c0326Hi) {
        HashMap map = (HashMap) this.f8521b;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = c0326Hi.f1110c;
        if (abstractComponentCallbacksC1503hi.f5292A) {
            ((C0154Di) this.f8523d).m299d(abstractComponentCallbacksC1503hi);
        }
        if (map.get(abstractComponentCallbacksC1503hi.f5314e) == c0326Hi && ((C0326Hi) map.put(abstractComponentCallbacksC1503hi.f5314e, null)) != null && AbstractC2805zi.m5374G(2)) {
            abstractComponentCallbacksC1503hi.toString();
        }
    }

    /* JADX INFO: renamed from: w */
    public Object m4885w(Object... objArr) {
        AbstractC0295Gu.m625r(-580207132014645L);
        Class cls = (Class) this.f8520a;
        C1319dG c1319dG = (C1319dG) this.f8521b;
        Constructor<?> constructor = null;
        if (c1319dG != null) {
            Constructor<?>[] constructors = cls.getConstructors();
            int i = 0;
            while (true) {
                if (i >= constructors.length) {
                    break;
                }
                int i2 = i + 1;
                try {
                    Constructor<?> constructor2 = constructors[i];
                    Class<?>[] parameterTypes = constructor2.getParameterTypes();
                    AbstractC0295Gu.m625r(-578841332414517L);
                    if (((Boolean) c1319dG.mo90g(parameterTypes)).booleanValue()) {
                        constructor2.setAccessible(true);
                        constructor = constructor2;
                        break;
                    }
                    i = i2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }
        } else {
            try {
                Constructor<?> constructor3 = cls.getConstructor(null);
                constructor3.setAccessible(true);
                constructor = constructor3;
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m4886x(Object... objArr) {
        AbstractC0295Gu.m625r(-580417585412149L);
        this.f8521b = new C1319dG(objArr, 0);
    }

    /* JADX INFO: renamed from: y */
    public void m4887y(C1148an c1148an) throws GeneralSecurityException {
        c1148an.getClass();
        C0384Ix c0384Ix = new C0384Ix(C0252Fu.class, c1148an.f3643a);
        HashMap map = (HashMap) this.f8521b;
        if (!map.containsKey(c0384Ix)) {
            map.put(c0384Ix, c1148an);
            return;
        }
        C1148an c1148an2 = (C1148an) map.get(c0384Ix);
        if (c1148an2.equals(c1148an) && c1148an.equals(c1148an2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + c0384Ix);
    }

    /* JADX INFO: renamed from: z */
    public void m4888z(C1228bn c1228bn) throws GeneralSecurityException {
        C0427Jx c0427Jx = new C0427Jx(c1228bn.f4192a, C0252Fu.class);
        HashMap map = (HashMap) this.f8520a;
        if (!map.containsKey(c0427Jx)) {
            map.put(c0427Jx, c1228bn);
            return;
        }
        C1228bn c1228bn2 = (C1228bn) map.get(c0427Jx);
        if (c1228bn2.equals(c1228bn) && c1228bn.equals(c1228bn2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + c0427Jx);
    }

    public C2428qs(int i) {
        switch (i) {
            case 3:
                this.f8521b = new C1067Yt(10);
                this.f8523d = new C2520sy(0);
                this.f8520a = new ArrayList();
                this.f8522c = new HashSet();
                break;
            case 4:
                this.f8520a = new ArrayList();
                this.f8521b = new HashMap();
                this.f8522c = new HashMap();
                break;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                this.f8520a = new HashMap();
                this.f8521b = new HashMap();
                this.f8522c = new HashMap();
                this.f8523d = new HashMap();
                break;
            case 10:
                this.f8520a = new C0521M4(0);
                this.f8521b = new SparseArray();
                this.f8522c = new C2640vp();
                this.f8523d = new C0521M4(0);
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0474L0(0));
                this.f8521b = new HashMap();
                this.f8522c = new ReferenceQueue();
                this.f8520a = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new RunnableC0431K0(1, this));
                break;
        }
    }

    public C2428qs(C0470Kx c0470Kx) {
        this.f8520a = new HashMap(c0470Kx.f1525a);
        this.f8521b = new HashMap(c0470Kx.f1526b);
        this.f8522c = new HashMap(c0470Kx.f1527c);
        this.f8523d = new HashMap(c0470Kx.f1528d);
    }

    public C2428qs(Typeface typeface, C0679Pr c0679Pr) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f8523d = typeface;
        this.f8520a = c0679Pr;
        this.f8522c = new C0722Qr(1024);
        int iM4624a = c0679Pr.m4624a(6);
        if (iM4624a != 0) {
            int i5 = iM4624a + c0679Pr.f8034a;
            i = ((ByteBuffer) c0679Pr.f8037d).getInt(((ByteBuffer) c0679Pr.f8037d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f8521b = new char[i * 2];
        int iM4624a2 = c0679Pr.m4624a(6);
        if (iM4624a2 != 0) {
            int i6 = iM4624a2 + c0679Pr.f8034a;
            i2 = ((ByteBuffer) c0679Pr.f8037d).getInt(((ByteBuffer) c0679Pr.f8037d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C1043YB c1043yb = new C1043YB(this, i7);
            C0636Or c0636OrM1992b = c1043yb.m1992b();
            int iM4624a3 = c0636OrM1992b.m4624a(4);
            Character.toChars(iM4624a3 != 0 ? ((ByteBuffer) c0636OrM1992b.f8037d).getInt(iM4624a3 + c0636OrM1992b.f8034a) : 0, (char[]) this.f8521b, i7 * 2);
            C0636Or c0636OrM1992b2 = c1043yb.m1992b();
            int iM4624a4 = c0636OrM1992b2.m4624a(16);
            if (iM4624a4 != 0) {
                int i8 = iM4624a4 + c0636OrM1992b2.f8034a;
                i3 = ((ByteBuffer) c0636OrM1992b2.f8037d).getInt(((ByteBuffer) c0636OrM1992b2.f8037d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            AbstractC1293cr.m2545d("invalid metadata codepoint length", i3 > 0);
            C0722Qr c0722Qr = (C0722Qr) this.f8522c;
            C0636Or c0636OrM1992b3 = c1043yb.m1992b();
            int iM4624a5 = c0636OrM1992b3.m4624a(16);
            if (iM4624a5 != 0) {
                int i9 = iM4624a5 + c0636OrM1992b3.f8034a;
                i4 = ((ByteBuffer) c0636OrM1992b3.f8037d).getInt(((ByteBuffer) c0636OrM1992b3.f8037d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            c0722Qr.m1509a(c1043yb, 0, i4 - 1);
        }
    }

    public C2428qs(int i, Class cls) {
        switch (i) {
            case 11:
                this.f8520a = cls;
                break;
            default:
                this.f8521b = new ConcurrentHashMap();
                this.f8520a = cls;
                this.f8523d = C1381es.f4925b;
                break;
        }
    }
}
