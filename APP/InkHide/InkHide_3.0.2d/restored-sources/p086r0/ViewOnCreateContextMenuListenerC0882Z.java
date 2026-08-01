package p086r0;

import android.view.ContextMenu;
import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import java.io.Serializable;
import java.util.List;
import p009E0.C0103c;
import p027N0.AbstractC0223g;
import p062e0.InterfaceC0551a;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.Z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnCreateContextMenuListenerC0882Z implements View.OnCreateContextMenuListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3051b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View.OnCreateContextMenuListener f3052c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ XC_MethodHook.MethodHookParam f3053d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0551a f3054e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Serializable f3055f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnCreateContextMenuListenerC0882Z(View.OnCreateContextMenuListener onCreateContextMenuListener, InterfaceC0551a interfaceC0551a, Serializable serializable, XC_MethodHook.MethodHookParam methodHookParam, int i2) {
        this.f3051b = i2;
        this.f3052c = onCreateContextMenuListener;
        this.f3054e = interfaceC0551a;
        this.f3055f = serializable;
        this.f3053d = methodHookParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Serializable serializable = this.f3055f;
        InterfaceC0551a interfaceC0551a = this.f3054e;
        XC_MethodHook.MethodHookParam methodHookParam = this.f3053d;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.f3052c;
        switch (this.f3051b) {
            case 0:
                onCreateContextMenuListener.onCreateContextMenu(contextMenu, view, contextMenuInfo);
                boolean z2 = AbstractC1126i.f3786a;
                if (C1124g.m2415F()) {
                    C0103c c0103c = (C0103c) serializable;
                    Object obj = c0103c.f394a;
                    String str = (String) c0103c.f395b;
                    Object obj2 = methodHookParam.thisObject;
                    List list = C0894d0.f3085U;
                    C0894d0 c0894d0 = (C0894d0) interfaceC0551a;
                    c0894d0.m1879O0((String) obj, str, obj2);
                    AbstractC0223g.m415b(contextMenu);
                    C0894d0.m1834a(c0894d0, contextMenu, (String) obj, str);
                    break;
                }
                break;
            default:
                onCreateContextMenuListener.onCreateContextMenu(contextMenu, view, contextMenuInfo);
                Object obj3 = methodHookParam.thisObject;
                List list2 = C0842H0.f2813g0;
                C0842H0 c0842h0 = (C0842H0) interfaceC0551a;
                String str2 = (String) serializable;
                c0842h0.m1687l1(str2, str2, obj3);
                AbstractC0223g.m415b(contextMenu);
                c0842h0.m1693o(contextMenu, str2, str2);
                break;
        }
    }
}
