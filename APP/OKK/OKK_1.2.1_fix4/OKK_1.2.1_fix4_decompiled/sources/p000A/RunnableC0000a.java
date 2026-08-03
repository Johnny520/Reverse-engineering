package p000A;

import android.graphics.Typeface;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Field;
import p004C.InterfaceC0060a;
import p006D.AbstractC0080Q;
import p006D.C0095d;
import p021L.C0245e;
import p055f.InterfaceC0777h;
import p055f.MenuC0779j;
import p057g.C0900f;
import p057g.C0906i;
import p083u.AbstractC1083b;

/* JADX INFO: renamed from: A.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0000a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f0a;

    /* JADX INFO: renamed from: b */
    public final Object f1b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2c;

    public /* synthetic */ RunnableC0000a(Object obj, Object obj2, int i2) {
        this.f0a = i2;
        this.f1b = obj;
        this.f2c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0777h interfaceC0777h;
        Object obj = this.f1b;
        Object obj2 = this.f2c;
        switch (this.f0a) {
            case 0:
                AbstractC1083b abstractC1083b = (AbstractC1083b) ((C0095d) obj).f251b;
                if (abstractC1083b != null) {
                    abstractC1083b.mo2164g((Typeface) obj2);
                }
                break;
            case 1:
                ((InterfaceC0060a) obj).mo16a(obj2);
                break;
            case 2:
                C0906i c0906i = (C0906i) obj2;
                MenuC0779j menuC0779j = c0906i.f3205c;
                if (menuC0779j != null && (interfaceC0777h = menuC0779j.f2789e) != null) {
                    interfaceC0777h.mo346l(menuC0779j);
                }
                ActionMenuView actionMenuView = c0906i.f3209g;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C0900f c0900f = (C0900f) obj;
                    if (c0900f.m2027b()) {
                        c0906i.f3220r = c0900f;
                    } else if (c0900f.f2840f != null) {
                        c0900f.m2029d(0, 0, false, false);
                        c0906i.f3220r = c0900f;
                    }
                }
                c0906i.f3222t = null;
                break;
            default:
                C0245e c0245e = ((SwipeDismissBehavior) obj2).f2273a;
                if (c0245e != null && c0245e.m674f()) {
                    Field field = AbstractC0080Q.f219a;
                    ((View) obj).postOnAnimation(this);
                    break;
                }
                break;
        }
    }

    public RunnableC0000a(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f0a = 3;
        this.f2c = swipeDismissBehavior;
        this.f1b = view;
    }

    public RunnableC0000a(C0906i c0906i, C0900f c0900f) {
        this.f0a = 2;
        this.f2c = c0906i;
        this.f1b = c0900f;
    }
}
