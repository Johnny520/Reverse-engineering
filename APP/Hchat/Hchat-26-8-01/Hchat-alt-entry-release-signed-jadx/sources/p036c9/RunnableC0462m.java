package p036c9;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000a.AbstractC0000a;
import p014b.C0126e;
import p085fg.InterfaceC1231l;
import p244qb.C3488i;
import p244qb.C3490k;
import p276sf.C3959f;
import p276sf.C3960g;
import p332wb.InterfaceC5059kv;

/* JADX INFO: renamed from: c9.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0462m implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1357g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AtomicBoolean f1358h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC5059kv f1359i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Activity f1360j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AtomicBoolean f1361k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1362l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1363m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f1364n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean f1365o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f1366p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0462m(List list, AtomicBoolean atomicBoolean, InterfaceC5059kv interfaceC5059kv, Activity activity, AtomicBoolean atomicBoolean2, InterfaceC1231l interfaceC1231l, String str, String str2, boolean z9) {
        this.f1366p = list;
        this.f1358h = atomicBoolean;
        this.f1359i = interfaceC5059kv;
        this.f1360j = activity;
        this.f1361k = atomicBoolean2;
        this.f1362l = interfaceC1231l;
        this.f1363m = str;
        this.f1364n = str2;
        this.f1365o = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        View decorView;
        Object c3959f;
        Object c3959f2;
        int i9 = this.f1357g;
        InterfaceC5059kv interfaceC5059kv = this.f1359i;
        AtomicBoolean atomicBoolean = this.f1358h;
        Object obj = this.f1366p;
        Object obj2 = this.f1364n;
        Object obj3 = this.f1363m;
        Object obj4 = this.f1362l;
        switch (i9) {
            case 0:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                atomicBoolean.set(true);
                interfaceC5059kv.close();
                Activity activity = this.f1360j;
                Window window = activity.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    decorView.postOnAnimation(new RunnableC0474p(this.f1361k, activity, this.f1366p, interfaceC1231l, str, str2, this.f1365o));
                    break;
                }
                break;
            case 1:
                List list = (List) obj;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                Handler handler = C0419b0.f1202a;
                try {
                    c3959f = C0419b0.m1404b(list);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                C0419b0.f1202a.post(new RunnableC0462m(this.f1358h, this.f1359i, this.f1360j, this.f1361k, c3959f, interfaceC1231l2, str3, str4, this.f1365o));
                break;
            case 2:
                C3490k c3490k = (C3490k) obj;
                ArrayList arrayList = (ArrayList) obj4;
                boolean z9 = this.f1365o;
                C0126e c0126e = (C0126e) obj3;
                List list2 = (List) obj2;
                try {
                    c3959f2 = c3490k.m7332x(arrayList, z9);
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f2);
                if (thM8182b != null) {
                    c3490k.f11331b.invoke("合并语音失败", thM8182b);
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC0462m(this.f1358h, c3490k, (C3488i) (c3959f2 instanceof C3959f ? null : c3959f2), this.f1361k, this.f1359i, this.f1360j, z9, c0126e, list2));
                break;
            default:
                final C3490k c3490k2 = (C3490k) obj;
                final C3488i c3488i = (C3488i) obj4;
                final C0126e c0126e2 = (C0126e) obj3;
                final List list3 = (List) obj2;
                if (!atomicBoolean.get()) {
                    this.f1361k.set(true);
                    interfaceC5059kv.close();
                    final Activity activity2 = this.f1360j;
                    if (activity2.isFinishing() || activity2.isDestroyed()) {
                        List listM1A0 = AbstractC0000a.m1A0(c3488i);
                        c3490k2.getClass();
                        C3490k.m7300i(listM1A0);
                    } else {
                        Window window2 = activity2.getWindow();
                        View decorView2 = window2 != null ? window2.getDecorView() : null;
                        if (decorView2 != null) {
                            final boolean z10 = this.f1365o;
                            decorView2.postOnAnimation(new Runnable() { // from class: qb.e
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Activity activity3 = activity2;
                                    boolean zIsFinishing = activity3.isFinishing();
                                    C3490k c3490k3 = c3490k2;
                                    C3488i c3488i2 = c3488i;
                                    if (zIsFinishing || activity3.isDestroyed()) {
                                        List listM1A02 = AbstractC0000a.m1A0(c3488i2);
                                        c3490k3.getClass();
                                        C3490k.m7300i(listM1A02);
                                        return;
                                    }
                                    if (c3488i2 == null) {
                                        c3490k3.getClass();
                                        C3490k.m7295N(activity3, "语音合并失败");
                                        return;
                                    }
                                    boolean z11 = z10;
                                    C0126e c0126e3 = c0126e2;
                                    if (z11) {
                                        String str5 = "合并语音已保存: " + c3488i2.f11325a;
                                        c3490k3.getClass();
                                        C3490k.m7295N(activity3, str5);
                                        c0126e3.m640r(c3490k3.f11331b);
                                        return;
                                    }
                                    List list4 = list3;
                                    if (!list4.isEmpty()) {
                                        c3490k3.m7316H(activity3, AbstractC0000a.m99x0(c3488i2), list4);
                                        c0126e3.m640r(c3490k3.f11331b);
                                    } else {
                                        List listM99x0 = AbstractC0000a.m99x0(c3488i2);
                                        c3490k3.getClass();
                                        C3490k.m7300i(listM99x0);
                                        C3490k.m7295N(activity3, "未选择转发对象");
                                    }
                                }
                            });
                        } else {
                            List listM1A02 = AbstractC0000a.m1A0(c3488i);
                            c3490k2.getClass();
                            C3490k.m7300i(listM1A02);
                        }
                    }
                } else {
                    List listM1A03 = AbstractC0000a.m1A0(c3488i);
                    c3490k2.getClass();
                    C3490k.m7300i(listM1A03);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0462m(AtomicBoolean atomicBoolean, C3490k c3490k, C3488i c3488i, AtomicBoolean atomicBoolean2, InterfaceC5059kv interfaceC5059kv, Activity activity, boolean z9, C0126e c0126e, List list) {
        this.f1358h = atomicBoolean;
        this.f1366p = c3490k;
        this.f1362l = c3488i;
        this.f1361k = atomicBoolean2;
        this.f1359i = interfaceC5059kv;
        this.f1360j = activity;
        this.f1365o = z9;
        this.f1363m = c0126e;
        this.f1364n = list;
    }

    public /* synthetic */ RunnableC0462m(AtomicBoolean atomicBoolean, InterfaceC5059kv interfaceC5059kv, Activity activity, AtomicBoolean atomicBoolean2, Object obj, InterfaceC1231l interfaceC1231l, String str, String str2, boolean z9) {
        this.f1358h = atomicBoolean;
        this.f1359i = interfaceC5059kv;
        this.f1360j = activity;
        this.f1361k = atomicBoolean2;
        this.f1366p = obj;
        this.f1362l = interfaceC1231l;
        this.f1363m = str;
        this.f1364n = str2;
        this.f1365o = z9;
    }

    public /* synthetic */ RunnableC0462m(C3490k c3490k, ArrayList arrayList, boolean z9, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, InterfaceC5059kv interfaceC5059kv, Activity activity, C0126e c0126e, List list) {
        this.f1366p = c3490k;
        this.f1362l = arrayList;
        this.f1365o = z9;
        this.f1358h = atomicBoolean;
        this.f1361k = atomicBoolean2;
        this.f1359i = interfaceC5059kv;
        this.f1360j = activity;
        this.f1363m = c0126e;
        this.f1364n = list;
    }
}
