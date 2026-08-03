package p049d9;

import android.app.Activity;
import android.content.Intent;
import ba.C0223c;
import ba.C0226f;
import de.robv.android.xposed.XposedBridge;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p085fg.InterfaceC1231l;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;

/* JADX INFO: renamed from: d9.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0745f {

    /* JADX INFO: renamed from: a */
    public static final C0745f f2216a = new C0745f();

    /* JADX INFO: renamed from: b */
    public static final AtomicInteger f2217b = new AtomicInteger(27152);

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f2218c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap.KeySetView f2219d = ConcurrentHashMap.newKeySet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m1934a(Class cls) {
        Object c3959f;
        if (f2219d.add(cls)) {
            try {
                c3959f = XposedBridge.hookAllMethods(cls, "onActivityResult", new C0226f(this, 12));
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (C3960g.m8182b(c3959f) != null) {
                f2219d.remove(cls);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1935b(Activity activity, InterfaceC1231l interfaceC1231l, String str, boolean z9) {
        Object c3959f;
        C0744e c0744e;
        Object c3959f2 = C3967n.f12976a;
        String string = AbstractC3149m.m6703R0(str).toString();
        if (string.length() == 0) {
            interfaceC1231l.invoke(Boolean.FALSE);
            return;
        }
        m1934a(activity.getClass());
        m1934a(Activity.class);
        int iUpdateAndGet = f2217b.updateAndGet(new C0223c(2));
        Integer numValueOf = Integer.valueOf(iUpdateAndGet);
        C0744e c0744e2 = new C0744e(activity, interfaceC1231l, string, z9);
        ConcurrentHashMap concurrentHashMap = f2218c;
        concurrentHashMap.put(numValueOf, c0744e2);
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        intent.addFlags(1);
        intent.addFlags(64);
        try {
            activity.startActivityForResult(intent, iUpdateAndGet);
            c3959f = c3959f2;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.addCategory("android.intent.category.OPENABLE");
            intent2.setType("image/*");
            intent2.addFlags(1);
            try {
                activity.startActivityForResult(Intent.createChooser(intent2, "选择头像"), iUpdateAndGet);
            } catch (Throwable th3) {
                c3959f2 = new C3959f(th3);
            }
            if (C3960g.m8182b(c3959f2) == null || (c0744e = (C0744e) concurrentHashMap.remove(Integer.valueOf(iUpdateAndGet))) == null) {
                return;
            }
            c0744e.f2215d.invoke(Boolean.FALSE);
        }
    }
}
