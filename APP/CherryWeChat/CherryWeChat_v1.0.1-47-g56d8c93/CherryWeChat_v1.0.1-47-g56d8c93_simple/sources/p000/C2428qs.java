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
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: qs */
/* JADX INFO: loaded from: classes.dex */
public final class C2428qs implements InterfaceC0302H0 {

    /* JADX INFO: renamed from: e */
    public static final C0668Pg f8518e = null;

    /* JADX INFO: renamed from: f */
    public static final C0872UC f8519f = null;

    /* JADX INFO: renamed from: a */
    public Object f8520a;

    /* JADX INFO: renamed from: b */
    public Object f8521b;

    /* JADX INFO: renamed from: c */
    public Object f8522c;

    /* JADX INFO: renamed from: d */
    public Object f8523d;

    static {
        f8518e = new C0668Pg(22);
        f8519f = new C0872UC(2);
    }

    public C2428qs(XC_MethodHook.MethodHookParam r4) {
        AbstractC0295Gu.m625r(-577514187520053L);
        Member r0 = r4.method;
        AbstractC0295Gu.m625r(-578089713137717L);
        this.f8520a = r0;
        this.f8521b = r4.thisObject;
        Object[] r02 = r4.args;
        AbstractC0295Gu.m625r(-578119777908789L);
        this.f8522c = r02;
        this.f8523d = r4;
    }

    /* JADX INFO: renamed from: A */
    public void m4862A(C0337Ht r4) {
        r4.getClass();
        C0384Ix r0 = new C0384Ix(AbstractC0295Gu.class, r4.f1143a);
        HashMap r1 = (HashMap) this.f8523d;
        if (r1.containsKey(r0) == false) goto L11;
        C0337Ht r12 = (C0337Ht) r1.get(r0);
        if (r12.equals(r4) == false) goto L10;
        if (r4.equals(r12) == false) goto L10;
        return;
    L10:
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + r0);
    L11:
        r1.put(r0, r4);
    }

    /* JADX INFO: renamed from: B */
    public void m4863B(C0380It r4) {
        C0427Jx r0 = new C0427Jx(r4.f1311a, AbstractC0295Gu.class);
        HashMap r1 = (HashMap) this.f8522c;
        if (r1.containsKey(r0) == false) goto L11;
        C0380It r12 = (C0380It) r1.get(r0);
        if (r12.equals(r4) == false) goto L10;
        if (r4.equals(r12) == false) goto L10;
        return;
    L10:
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + r0);
    L11:
        r1.put(r0, r4);
    }

    /* JADX INFO: renamed from: C */
    public void m4864C(Object r2) {
        ((XC_MethodHook.MethodHookParam) this.f8523d).setResult(r2);
    }

    /* JADX INFO: renamed from: D */
    public Bundle m4865D(Bundle r2, String r3) {
        HashMap r0 = (HashMap) this.f8522c;
        if (r2 == null) goto L7;
        return (Bundle) r0.put(r3, r2);
    L7:
        return (Bundle) r0.remove(r3);
    }

    /* JADX INFO: renamed from: E */
    public void m4866E() {
        XposedBridge.hookAllConstructors((Class) this.f8520a, new C1362eG(0, this));
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m4867a(InterfaceC0802Sm r3, C2236mg r4) {
        monitor-enter(this);
        C0517M0 r0 = new C0517M0(r3, r4, (ReferenceQueue) this.f8522c);     // Catch: Throwable -> L8
        C0517M0 r32 = (C0517M0) ((HashMap) this.f8521b).put(r3, r0);     // Catch: Throwable -> L8
        if (r32 == null) goto L6;
        r32.f1685c = null;     // Catch: Throwable -> L8
        r32.clear();     // Catch: Throwable -> L8
    L6:
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: b */
    public boolean mo642b(AbstractC0345I0 r6, Menu r7) {
        ActionMode.Callback r0 = (ActionMode.Callback) this.f8521b;
        C0386Iz r62 = m4878p(r6);
        C2520sy r1 = (C2520sy) this.f8523d;
        Menu r2 = (Menu) r1.get(r7);
        if (r2 != null) goto L6;
        r2 = new MenuC0335Hr((Context) this.f8522c, (MenuC2204lr) r7);
        r1.put(r7, r2);
    L6:
        return r0.onCreateActionMode(r62, r2);
    }

    /* JADX INFO: renamed from: c */
    public void m4868c(AbstractComponentCallbacksC1503hi r4) {
        if (((ArrayList) this.f8520a).contains(r4) == true) goto L14;
        ArrayList r0 = (ArrayList) this.f8520a;
        monitor-enter(r0);
        ((ArrayList) this.f8520a).add(r4);     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        r4.f5320k = true;
        return;
    L10:
        th = move-exception;
        throw th;
    L14:
        throw new IllegalStateException("Fragment already added: " + r4);
    }

    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: d */
    public boolean mo643d(AbstractC0345I0 r4, MenuItem r5) {
        return ((ActionMode.Callback) this.f8521b).onActionItemClicked(m4878p(r4), new MenuItemC2599ur((Context) this.f8522c, (InterfaceMenuItemC0558Mz) r5));
    }

    /* JADX INFO: renamed from: e */
    public void m4869e(Object r15, Object r16, C2243mn r17, boolean r18) {
        if (((ConcurrentHashMap) this.f8521b) == null) goto L47;
        if (r15 != null) goto L10;
        if (r16 != null) goto L10;
        throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
    L10:
        if (r17.m4559D() != EnumC1271cn.f4327c) goto L45;
        ConcurrentHashMap r0 = (ConcurrentHashMap) this.f8521b;
        Integer r1 = Integer.valueOf(r17.m4557B());
        byte[] r4 = null;
        if (r17.m4558C() != EnumC2773yt.f9420e) goto L14;
        r1 = null;
    L14:
        AbstractC0828TB r13 = C2815zs.f9535b.m5449a(C0252Fu.m524d(r17.m4556A().m1792B(), r17.m4556A().m1793C(), r17.m4556A().m1791A(), r17.m4558C(), r1));
        int r12 = r17.m4558C().ordinal();
        if (r12 != 1) goto L17;
        byte[] r14 = ByteBuffer.allocate(5).put((byte) 1).putInt(r17.m4557B()).array();
    L29:
        C2516su r5 = new C2516su(r15, r16, r14, r17.m4559D(), r17.m4558C(), r17.m4557B(), r17.m4556A().m1792B(), r13);
        ArrayList r152 = new ArrayList();
        r152.add(r5);
        byte[] r2 = r5.f8809c;
        if (r2 == null) goto L33;
        r4 = Arrays.copyOf(r2, r2.length);
    L33:
        C2559tu r19 = new C2559tu(r4);
        List r153 = (List) r0.put(r19, Collections.unmodifiableList(r152));
        if (r153 == null) goto L36;
        ArrayList r22 = new ArrayList();
        r22.addAll(r153);
        r22.add(r5);
        r0.put(r19, Collections.unmodifiableList(r22));
    L36:
        if (r18 == true) goto L38;
        return;
    L38:
        if (((C2516su) this.f8522c) != null) goto L42;
        this.f8522c = r5;
        return;
    L42:
        throw new IllegalStateException("you cannot set two primary primitives");
    L17:
        if (r12 != 2) goto L19;
    L27:
        r14 = ByteBuffer.allocate(5).put((byte) 0).putInt(r17.m4557B()).array();
        goto L29
    L19:
        if (r12 != 3) goto L21;
        r14 = AbstractC1293cr.f4725a;
        goto L29
    L21:
        if (r12 == 4) goto L27;
        throw new GeneralSecurityException("unknown output prefix type");
    L45:
        throw new GeneralSecurityException("only ENABLED key is allowed");
    L47:
        throw new IllegalStateException("addPrimitive cannot be called after build");
    }

    /* JADX INFO: renamed from: f */
    public void m4870f(InterfaceC1416fj r3) {
        AbstractC0295Gu.m625r(-578802677708853L);
        this.f8523d = r3;
        m4866E();
    }

    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: g */
    public boolean mo644g(AbstractC0345I0 r6, Menu r7) {
        ActionMode.Callback r0 = (ActionMode.Callback) this.f8521b;
        C0386Iz r62 = m4878p(r6);
        C2520sy r1 = (C2520sy) this.f8523d;
        Menu r2 = (Menu) r1.get(r7);
        if (r2 != null) goto L6;
        r2 = new MenuC0335Hr((Context) this.f8522c, (MenuC2204lr) r7);
        r1.put(r7, r2);
    L6:
        return r0.onPrepareActionMode(r62, r2);
    }

    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: h */
    public void mo645h(AbstractC0345I0 r2) {
        ((ActionMode.Callback) this.f8521b).onDestroyActionMode(m4878p(r2));
    }

    /* JADX INFO: renamed from: i */
    public C0285Gk m4871i() {
        Integer r0 = (Integer) this.f8520a;
        if (r0 == null) goto L63;
        if (((Integer) this.f8521b) == null) goto L61;
        if (((C2610v1) this.f8522c) == null) goto L59;
        if (((C2610v1) this.f8523d) == null) goto L57;
        if (r0.intValue() < 16) goto L55;
        Integer r02 = (Integer) this.f8521b;
        int r1 = r02.intValue();
        C2610v1 r2 = (C2610v1) this.f8522c;
        if (r1 < 10) goto L53;
        if (r2 != C2610v1.f9018s) goto L22;
        if (r1 <= 20) goto L47;
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{r02}));
    L47:
        return new C0285Gk(((Integer) this.f8520a).intValue(), ((Integer) this.f8521b).intValue(), (C2610v1) this.f8523d, (C2610v1) this.f8522c);
    L22:
        if (r2 != C2610v1.f9019t) goto L29;
        if (r1 <= 28) goto L47;
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{r02}));
    L29:
        if (r2 != C2610v1.f9020u) goto L36;
        if (r1 <= 32) goto L47;
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{r02}));
    L36:
        if (r2 != C2610v1.f9021v) goto L43;
        if (r1 <= 48) goto L47;
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{r02}));
    L43:
        if (r2 != C2610v1.f9022w) goto L51;
        if (r1 <= 64) goto L47;
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{r02}));
    L51:
        throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
    L53:
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{r02}));
    L55:
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{(Integer) this.f8520a}));
    L57:
        throw new GeneralSecurityException("variant is not set");
    L59:
        throw new GeneralSecurityException("hash type is not set");
    L61:
        throw new GeneralSecurityException("tag size is not set");
    L63:
        throw new GeneralSecurityException("key size is not set");
    }

    /* JADX INFO: renamed from: j */
    public synchronized InterfaceC1189as m4872j(Class r8, Class r9) {
        monitor-enter(this);
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L14
        Iterator r1 = ((ArrayList) this.f8520a).iterator();     // Catch: Throwable -> L14
        boolean r3 = false;
    L5:
        if (r1.hasNext() == false) goto L17;
        C2385ps r4 = (C2385ps) r1.next();     // Catch: Throwable -> L14
        if (((HashSet) this.f8522c).contains(r4) == true) goto L8;
        if (r4.f8383a.isAssignableFrom(r8) == false) goto L5;
        if (r4.f8384b.isAssignableFrom(r9) == false) goto L5;
        ((HashSet) this.f8522c).add(r4);     // Catch: Throwable -> L14
        r0.add(r4.f8385c.mo88p(this));     // Catch: Throwable -> L14
        ((HashSet) this.f8522c).remove(r4);     // Catch: Throwable -> L14
        goto L5
    L8:
        r3 = true;
        goto L5
    L17:
        if (r0.size() <= 1) goto L22;
        C0668Pg r82 = (C0668Pg) this.f8521b;     // Catch: Throwable -> L14
        C2656w4 r92 = (C2656w4) this.f8523d;     // Catch: Throwable -> L14
        r82.getClass();     // Catch: Throwable -> L14
        C0907V4 r83 = new C0907V4(2, r0, r92);     // Catch: Throwable -> L14
        monitor-exit(this);
        return r83;
    L22:
        if (r0.size() != 1) goto L26;
        InterfaceC1189as r84 = (InterfaceC1189as) r0.get(0);     // Catch: Throwable -> L14
        monitor-exit(this);
        return r84;
    L26:
        if (r3 == false) goto L31;
        C0872UC r85 = f8519f;     // Catch: Throwable -> L14
        monitor-exit(this);
        return r85;
    L31:
        throw new C0597Nv("Failed to find any ModelLoaders for model: " + r8 + " and data: " + r9);     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        ((HashSet) this.f8522c).clear();     // Catch: Throwable -> L34
        throw th;     // Catch: Throwable -> L34
    L34:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: k */
    public synchronized ArrayList m4873k(Class r5) {
        monitor-enter(this);
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L13
        Iterator r1 = ((ArrayList) this.f8520a).iterator();     // Catch: Throwable -> L13
    L4:
        if (r1.hasNext() == false) goto L15;
        C2385ps r2 = (C2385ps) r1.next();     // Catch: Throwable -> L13
        if (((HashSet) this.f8522c).contains(r2) == true) goto L4;
        if (r2.f8383a.isAssignableFrom(r5) == false) goto L4;
        ((HashSet) this.f8522c).add(r2);     // Catch: Throwable -> L13
        r0.add(r2.f8385c.mo88p(this));     // Catch: Throwable -> L13
        ((HashSet) this.f8522c).remove(r2);     // Catch: Throwable -> L13
        goto L4
    L15:
        monitor-exit(this);
        return r0;
    L13:
        th = move-exception;
        ((HashSet) this.f8522c).clear();     // Catch: Throwable -> L19
        throw th;     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: l */
    public void m4874l(C0517M0 r8) {
        monitor-enter(this);
        ((HashMap) this.f8521b).remove(r8.f1683a);     // Catch: Throwable -> L11
        if (r8.f1684b == false) goto L13;
        InterfaceC2389pw r2 = r8.f1685c;     // Catch: Throwable -> L11
        if (r2 == null) goto L13;
        monitor-exit(this);     // Catch: Throwable -> L11
        C2236mg r1 = new C2236mg(r2, true, false, r8.f1683a, (C1264cg) this.f8523d);
        ((C1264cg) this.f8523d).m2404d(r8.f1683a, r1);
        return;
    L13:
        monitor-exit(this);     // Catch: Throwable -> L11
        return;
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: m */
    public void m4875m(Object r5, ArrayList r6, HashSet r7) {
        if (r6.contains(r5) == false) goto L6;
        return;
    L6:
        if (r7.contains(r5) == true) goto L15;
        r7.add(r5);
        ArrayList r0 = (ArrayList) ((C2520sy) this.f8523d).get(r5);
        if (r0 == null) goto L12;
        int r1 = r0.size();
        int r2 = 0;
    L10:
        if (r2 >= r1) goto L12;
        m4875m(r0.get(r2), r6, r7);
        r2 = r2 + 1;
    L12:
        r7.remove(r5);
        r6.add(r5);
        return;
    L15:
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    /* JADX INFO: renamed from: n */
    public AbstractComponentCallbacksC1503hi m4876n(String r2) {
        C0326Hi r22 = (C0326Hi) ((HashMap) this.f8521b).get(r2);
        if (r22 != null) goto L5;
        return null;
    L5:
        return r22.f1110c;
    }

    /* JADX INFO: renamed from: o */
    public AbstractComponentCallbacksC1503hi m4877o(String r4) {
        Iterator r0 = ((HashMap) this.f8521b).values().iterator();
    L4:
        if (r0.hasNext() == false) goto L13;
        C0326Hi r1 = (C0326Hi) r0.next();
        if (r1 == null) goto L4;
        AbstractComponentCallbacksC1503hi r12 = r1.f1110c;
        if (r4.equals(r12.f5314e) == true) goto L11;
        r12 = r12.f5329t.f9494c.m4877o(r4);
    L11:
        if (r12 == null) goto L4;
        return r12;
    L13:
        return null;
    }

    /* JADX INFO: renamed from: p */
    public C0386Iz m4878p(AbstractC0345I0 r6) {
        ArrayList r0 = (ArrayList) this.f8520a;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L10;
        C0386Iz r3 = (C0386Iz) r0.get(r2);
        if (r3 == null) goto L9;
        if (r3.f1323b != r6) goto L9;
        return r3;
    L9:
        r2 = r2 + 1;
        goto L3
    L10:
        C0386Iz r12 = new C0386Iz((Context) this.f8522c, r6);
        r0.add(r12);
        return r12;
    }

    /* JADX INFO: renamed from: q */
    public ArrayList m4879q() {
        ArrayList r0 = new ArrayList();
        Iterator r1 = ((HashMap) this.f8521b).values().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        C0326Hi r2 = (C0326Hi) r1.next();
        if (r2 == null) goto L4;
        r0.add(r2);
        goto L4
    L8:
        return r0;
    }

    /* JADX INFO: renamed from: r */
    public ArrayList m4880r() {
        ArrayList r0 = new ArrayList();
        Iterator r1 = ((HashMap) this.f8521b).values().iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        C0326Hi r2 = (C0326Hi) r1.next();
        if (r2 != null) goto L7;
        r0.add(null);
        goto L4
    L7:
        r0.add(r2.f1110c);
        goto L4
    L9:
        return r0;
    }

    /* JADX INFO: renamed from: s */
    public synchronized ArrayList m4881s(Class r5) {
        monitor-enter(this);
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L12
        Iterator r1 = ((ArrayList) this.f8520a).iterator();     // Catch: Throwable -> L12
    L4:
        if (r1.hasNext() == false) goto L14;
        C2385ps r2 = (C2385ps) r1.next();     // Catch: Throwable -> L12
        if (r0.contains(r2.f8384b) == true) goto L4;
        if (r2.f8383a.isAssignableFrom(r5) == false) goto L4;
        r0.add(r2.f8384b);     // Catch: Throwable -> L12
        goto L4
    L14:
        monitor-exit(this);
        return r0;
    L12:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: t */
    public List m4882t() {
        if (((ArrayList) this.f8520a).isEmpty() == true) goto L5;
        ArrayList r0 = (ArrayList) this.f8520a;
        monitor-enter(r0);
        ArrayList r1 = new ArrayList((ArrayList) this.f8520a);     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return r1;
    L11:
        th = move-exception;
        throw th;
    L5:
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: u */
    public void m4883u(C0326Hi r4) {
        AbstractComponentCallbacksC1503hi r0 = r4.f1110c;
        String r1 = r0.f5314e;
        HashMap r2 = (HashMap) this.f8521b;
        if (r2.get(r1) == null) goto L5;
        return;
    L5:
        r2.put(r0.f5314e, r4);
        if (AbstractC2805zi.m5374G(2) == false) goto L9;
        r0.toString();
        return;
    }

    /* JADX INFO: renamed from: v */
    public void m4884v(C0326Hi r4) {
        HashMap r0 = (HashMap) this.f8521b;
        AbstractComponentCallbacksC1503hi r1 = r4.f1110c;
        if (r1.f5292A == false) goto L6;
        ((C0154Di) this.f8523d).m299d(r1);
    L6:
        if (r0.get(r1.f5314e) == r4) goto L9;
        return;
    L9:
        if (((C0326Hi) r0.put(r1.f5314e, null)) != null) goto L12;
        return;
    L12:
        if (AbstractC2805zi.m5374G(2) == false) goto L15;
        r1.toString();
        return;
    }

    /* JADX INFO: renamed from: w */
    public Object m4885w(Object... r10) {
        AbstractC0295Gu.m625r(-580207132014645L);
        Class r0 = (Class) this.f8520a;
        C1319dG r1 = (C1319dG) this.f8521b;
        Constructor<?> r3 = null;
        if (r1 == null) goto L28;
        Constructor<?>[] r02 = r0.getConstructors();
        int r4 = 0;
    L10:
        if (r4 >= r02.length) goto L20;
        int r5 = r4 + 1;
        Constructor<?> r42 = r02[r4];     // Catch: ArrayIndexOutOfBoundsException -> L17
        Class<?>[] r6 = r42.getParameterTypes();
        AbstractC0295Gu.m625r(-578841332414517L);
        if (((Boolean) r1.mo90g(r6)).booleanValue() == true) goto L15;
        r4 = r5;
        goto L10
    L15:
        r42.setAccessible(true);
        r3 = r42;
    L17:
        e = move-exception;
        throw new NoSuchElementException(e.getMessage());
    L20:
        if (r3 != null) goto L26;
        return null;
    L26:
        return r3.newInstance(Arrays.copyOf(r10, r10.length));
    L34:
        return null;
    L28:
        Constructor<?> r03 = r0.getConstructor(null);     // Catch: NoSuchMethodException -> L6
        r03.setAccessible(true);     // Catch: NoSuchMethodException -> L6
        r3 = r03;
    L6:
        e = move-exception;
        e.printStackTrace();
        goto L20
    }

    /* JADX INFO: renamed from: x */
    public void m4886x(Object... r3) {
        AbstractC0295Gu.m625r(-580417585412149L);
        this.f8521b = new C1319dG(r3, 0);
    }

    /* JADX INFO: renamed from: y */
    public void m4887y(C1148an r4) {
        r4.getClass();
        C0384Ix r0 = new C0384Ix(C0252Fu.class, r4.f3643a);
        HashMap r1 = (HashMap) this.f8521b;
        if (r1.containsKey(r0) == false) goto L11;
        C1148an r12 = (C1148an) r1.get(r0);
        if (r12.equals(r4) == false) goto L10;
        if (r4.equals(r12) == false) goto L10;
        return;
    L10:
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + r0);
    L11:
        r1.put(r0, r4);
    }

    /* JADX INFO: renamed from: z */
    public void m4888z(C1228bn r4) {
        C0427Jx r0 = new C0427Jx(r4.f4192a, C0252Fu.class);
        HashMap r1 = (HashMap) this.f8520a;
        if (r1.containsKey(r0) == false) goto L11;
        C1228bn r12 = (C1228bn) r1.get(r0);
        if (r12.equals(r4) == false) goto L10;
        if (r4.equals(r12) == false) goto L10;
        return;
    L10:
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + r0);
    L11:
        r1.put(r0, r4);
    }

    public C2428qs(int r3) {
        switch(r3) {
            case 3: goto L11;
            case 4: goto L9;
            case 8: goto L7;
            case 10: goto L5;
            default: goto L3;
        };
    L3:
        ExecutorService r32 = Executors.newSingleThreadExecutor(new ThreadFactoryC0474L0(0));
        this.f8521b = new HashMap();
        this.f8522c = new ReferenceQueue();
        this.f8520a = r32;
        r32.execute(new RunnableC0431K0(1, this));
        return;
    L5:
        this.f8520a = new C0521M4(0);
        this.f8521b = new SparseArray();
        this.f8522c = new C2640vp();
        this.f8523d = new C0521M4(0);
        return;
    L7:
        this.f8520a = new HashMap();
        this.f8521b = new HashMap();
        this.f8522c = new HashMap();
        this.f8523d = new HashMap();
        return;
    L9:
        this.f8520a = new ArrayList();
        this.f8521b = new HashMap();
        this.f8522c = new HashMap();
        return;
    L11:
        this.f8521b = new C1067Yt(10);
        this.f8523d = new C2520sy(0);
        this.f8520a = new ArrayList();
        this.f8522c = new HashSet();
    }

    public C2428qs(C0470Kx r3) {
        this.f8520a = new HashMap(r3.f1525a);
        this.f8521b = new HashMap(r3.f1526b);
        this.f8522c = new HashMap(r3.f1527c);
        this.f8523d = new HashMap(r3.f1528d);
    }

    public C2428qs(Typeface r8, C0679Pr r9) {
        this.f8523d = r8;
        this.f8520a = r9;
        this.f8522c = new C0722Qr(1024);
        int r0 = r9.m4624a(6);
        if (r0 == 0) goto L5;
        int r02 = r0 + r9.f8034a;
        int r03 = ((ByteBuffer) r9.f8037d).getInt(((ByteBuffer) r9.f8037d).getInt(r02) + r02);
    L6:
        this.f8521b = new char[r03 * 2];
        int r82 = r9.m4624a(6);
        if (r82 == 0) goto L9;
        int r83 = r82 + r9.f8034a;
        int r84 = ((ByteBuffer) r9.f8037d).getInt(((ByteBuffer) r9.f8037d).getInt(r83) + r83);
    L10:
        int r92 = 0;
    L11:
        if (r92 >= r84) goto L29;
        C1043YB r04 = new C1043YB(this, r92);
        C0636Or r2 = r04.m1992b();
        int r3 = r2.m4624a(4);
        if (r3 == 0) goto L15;
        int r22 = ((ByteBuffer) r2.f8037d).getInt(r3 + r2.f8034a);
    L16:
        Character.toChars(r22, (char[]) this.f8521b, r92 * 2);
        C0636Or r23 = r04.m1992b();
        int r4 = r23.m4624a(16);
        if (r4 == 0) goto L19;
        int r42 = r4 + r23.f8034a;
        int r24 = ((ByteBuffer) r23.f8037d).getInt(((ByteBuffer) r23.f8037d).getInt(r42) + r42);
    L21:
        if (r24 <= 0) goto L23;
        boolean r25 = true;
    L24:
        AbstractC1293cr.m2545d("invalid metadata codepoint length", r25);
        C0722Qr r26 = (C0722Qr) this.f8522c;
        C0636Or r5 = r04.m1992b();
        int r32 = r5.m4624a(16);
        if (r32 == 0) goto L27;
        int r33 = r32 + r5.f8034a;
        int r34 = ((ByteBuffer) r5.f8037d).getInt(((ByteBuffer) r5.f8037d).getInt(r33) + r33);
    L28:
        r26.m1509a(r04, 0, r34 - 1);
        r92 = r92 + 1;
        goto L11
    L27:
        r34 = 0;
        goto L28
    L23:
        r25 = false;
        goto L24
    L19:
        r24 = 0;
        goto L21
    L15:
        r22 = 0;
        goto L16
    L29:
        return;
    L9:
        r84 = 0;
        goto L10
    L5:
        r03 = 0;
        goto L6
    }

    public C2428qs(int r1, Class r2) {
        switch(r1) {
            case 11: goto L5;
            default: goto L3;
        };
    L3:
        this.f8521b = new ConcurrentHashMap();
        this.f8520a = r2;
        this.f8523d = C1381es.f4925b;
        return;
    L5:
        this.f8520a = r2;
    }
}
