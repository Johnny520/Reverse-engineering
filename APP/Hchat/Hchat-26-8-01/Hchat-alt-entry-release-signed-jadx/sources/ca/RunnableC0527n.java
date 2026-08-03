package ca;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import gg.AbstractC1416l;
import gg.C1425u;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import p036c9.RunnableC0496w;
import p080fb.C1103b;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p230p8.C3370v;
import p276sf.C3959f;
import p332wb.C5491y2;
import p332wb.InterfaceC5059kv;

/* JADX INFO: renamed from: ca.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0527n implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1635g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Serializable f1636h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1637i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1638j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1639k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1640l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1641m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f1642n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f1643o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0527n(Serializable serializable, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i9) {
        this.f1635g = i9;
        this.f1636h = serializable;
        this.f1637i = obj;
        this.f1638j = obj2;
        this.f1639k = obj3;
        this.f1640l = obj4;
        this.f1641m = obj5;
        this.f1642n = obj6;
        this.f1643o = obj7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        View decorView;
        switch (this.f1635g) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1636h;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f1637i;
                InterfaceC5059kv interfaceC5059kv = (InterfaceC5059kv) this.f1638j;
                Activity activity = (Activity) this.f1639k;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1641m;
                C0517e0 c0517e0 = (C0517e0) this.f1642n;
                C3370v c3370v = (C3370v) this.f1643o;
                if (!atomicBoolean.get()) {
                    atomicBoolean2.set(true);
                    interfaceC5059kv.close();
                    Window window = activity.getWindow();
                    if (window != null && (decorView = window.getDecorView()) != null) {
                        decorView.postOnAnimation(new RunnableC0496w(atomicBoolean, activity, this.f1640l, interfaceC1231l, c0517e0, c3370v));
                        break;
                    }
                }
                break;
            default:
                String str = (String) this.f1636h;
                C1103b c1103b = (C1103b) this.f1637i;
                Context context = (Context) this.f1638j;
                Serializable serializable = (Serializable) this.f1639k;
                C1425u c1425u = (C1425u) this.f1640l;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1641m;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1642n;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1643o;
                if (AbstractC1416l.m3825a((String) interfaceC1809a1.getValue(), str)) {
                    interfaceC1809a12.setValue(Boolean.FALSE);
                    C5491y2.m9787L0(interfaceC1809a13, 0L);
                    if (!c1103b.f3553a.get()) {
                        Toast.makeText(context, !(serializable instanceof C3959f) ? (String) c1425u.f4738g : "自动压缩失败，已使用原上下文", 0).show();
                    }
                }
                break;
        }
    }
}
