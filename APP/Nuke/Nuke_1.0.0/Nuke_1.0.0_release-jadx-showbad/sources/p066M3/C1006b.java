package p066M3;

import android.os.Bundle;
import com.bumptech.glide.AbstractC1924f;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.DexKitBridge;
import p000A.C0071l;
import p011B4.AbstractC0231b;
import p015C2.C0243c;
import p016C3.C0245b;
import p021D3.C0274k;
import p026E3.C0286b;
import p044H3.AbstractC0646a;
import p044H3.InterfaceC0647b;
import p056K2.C0887m;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p061L2.AbstractC0977q;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1676u;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;
import p220p4.C2892a;
import p226q4.C2938a;
import p243t4.C3229i;
import p254v4.C3366m;
import p254v4.C3368o;
import p263x2.AbstractC3448a;
import p265x4.C3455a;
import p265x4.C3470p;
import p269y2.C3492b;
import p277z4.C3526d;

/* JADX INFO: renamed from: M3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1006b extends AbstractC0646a implements InterfaceC0647b {

    /* JADX INFO: renamed from: d */
    public static final C1006b f3118d = new C1006b(true);

    /* JADX INFO: renamed from: e */
    public static final String f3119e = "SettingMenuInject";

    /* JADX INFO: renamed from: f */
    public static final boolean f3120f = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p044H3.InterfaceC0647b
    /* JADX INFO: renamed from: a */
    public final void mo1121a(DexKitBridge dexKitBridge) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        String str = (String) C1005a.f3117e.f1354d;
        C2938a c2938a = new C2938a();
        c2938a.f9260b = AbstractC0972l.m2007e0(new String[]{"com.tencent.mm.ui.base.preference"});
        C0071l c0071l = new C0071l(26);
        C3229i c3229i = new C3229i();
        c0071l.mo1h(c3229i);
        c2938a.f9261c = c3229i;
        byte[] bArrM5140K = c2938a.m5140K();
        ReentrantReadWriteLock.ReadLock lock = dexKitBridge.f8837e.readLock();
        lock.lock();
        try {
            long j5 = dexKitBridge.f8836d;
            if (j5 == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeFindMethod = DexKitBridge.nativeFindMethod(j5, bArrM5140K);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindMethod);
            AbstractC1665j.m2984d(byteBufferWrap, "wrap(res)");
            C3455a c3455a = new C3455a();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c3455a.m4686c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C3366m c3366m = new C3366m(1);
            int iM5706h = c3455a.m5706h();
            int i5 = 0;
            for (int i6 = 0; i6 < iM5706h; i6++) {
                C3470p c3470pM5707i = c3455a.m5707i(i6);
                AbstractC1665j.m2982b(c3470pM5707i);
                c3366m.add(AbstractC1784a.m3234t(dexKitBridge, c3470pM5707i));
            }
            if (c3366m.size() > 1) {
                AbstractC0977q.m2031M(c3366m, new C2892a(i5));
            }
            C3368o c3368o = (C3368o) c3366m.m5604a();
            if (c3368o == null) {
                throw new AssertionError(AbstractC0231b.m400k("DexMethod for ", str, " not found!"));
            }
            ClassLoader classLoader = AbstractC1785a.f6096b;
            if (classLoader == null) {
                AbstractC1665j.m2991k("hostClassLoader");
                throw null;
            }
            C3526d c3526d = new C3526d(c3368o.m5606f().m5774a(classLoader, Boolean.valueOf(Modifier.isStatic(c3368o.f10461f))));
            C0887m c0887m = C0274k.f881a;
            C0245b c0245bM466i = C0274k.m466i();
            String string = c3526d.toString();
            c0245bM466i.getClass();
            c0245bM466i.m451e(str, string);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p044H3.AbstractC0646a
    /* JADX INFO: renamed from: b */
    public final boolean mo1117b() {
        return f3120f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p044H3.AbstractC0646a
    /* JADX INFO: renamed from: c */
    public final String mo1118c() {
        return f3119e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p044H3.AbstractC0646a
    /* JADX INFO: renamed from: d */
    public final void mo1119d() {
        int i5 = AbstractC3448a.f10763a;
        C3492b c3492bM3111E = AbstractC1924f.m3507u(AbstractC1924f.m3512z("com.tencent.mm.ui.base.preference.MMPreference")).m3111E();
        c3492bM3111E.f10965b = "createAdapter";
        Constructor<?>[] declaredConstructors = ((C0243c) AbstractC0973m.m2012S(c3492bM3111E.m5751b())).f814g.getReturnType().getDeclaredConstructors();
        AbstractC1665j.m2982b(declaredConstructors);
        for (Constructor<?> constructor : declaredConstructors) {
            AbstractC1665j.m2982b(constructor);
            AbstractC1665j.m2984d(XposedBridge.hookMethod(constructor, new C0286b(null, f3118d, new C0071l(23))), "hookMethod(...)");
        }
        C3526d c3526d = new C3526d("Lcom/tencent/mm/ui/widget/listview/PullDownListView;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        ClassLoader classLoader = AbstractC1785a.f6096b;
        if (classLoader == null) {
            AbstractC1665j.m2991k("hostClassLoader");
            throw null;
        }
        AbstractC1665j.m2984d(XposedBridge.hookMethod(c3526d.m5774a(classLoader, null), new C0286b(new C0071l(24), this, null)), "hookMethod(...)");
        try {
            int i6 = AbstractC3448a.f10763a;
            C3492b c3492bM3111E2 = AbstractC1924f.m3507u(AbstractC1924f.m3512z("com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI")).m3111E();
            c3492bM3111E2.f10965b = "onCreate";
            Object[] objArrCopyOf = Arrays.copyOf(new Object[]{AbstractC1676u.m2995a(Bundle.class)}, 1);
            ArrayList arrayList = c3492bM3111E2.f10870g;
            AbstractC1665j.m2985e(arrayList, "<this>");
            AbstractC1665j.m2985e(objArrCopyOf, "elements");
            arrayList.addAll(AbstractC0972l.m1987K(objArrCopyOf));
            Method method = ((C0243c) AbstractC0973m.m2012S(c3492bM3111E2.m5751b())).f814g;
            AbstractC1665j.m2985e(method, "member");
            AbstractC1665j.m2984d(XposedBridge.hookMethod(method, new C0286b(null, this, new C0071l(25))), "hookMethod(...)");
        } catch (Exception unused) {
        }
    }
}
