package p293u4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import p268s4.C7185a;
import p279t4.C8106a;
import p376zd.C9987e;

/* JADX INFO: renamed from: u4.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8526w implements InterfaceC8523t {

    /* JADX INFO: renamed from: b */
    public static final C8526w f28416b = new C8526w();

    @Override // p293u4.InterfaceC8523t
    /* JADX INFO: renamed from: a */
    public C8106a mo32776a(Context context, InterfaceC8514k interfaceC8514k) {
        context.getClass();
        interfaceC8514k.getClass();
        Context contextM32764a = C8513j.f28405a.m32764a(context);
        if (contextM32764a instanceof Activity) {
            return m32778b((Activity) contextM32764a, interfaceC8514k);
        }
        if (!(contextM32764a instanceof InputMethodService) && !(contextM32764a instanceof Application)) {
            C9987e.m38645a("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        C8522s c8522s = C8522s.f28411a;
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point pointM32775a = c8522s.m32775a(defaultDisplay);
        return new C8106a(new Rect(0, 0, pointM32775a.x, pointM32775a.y), interfaceC8514k.mo32765a(context));
    }

    /* JADX INFO: renamed from: b */
    public C8106a m32778b(Activity activity, InterfaceC8514k interfaceC8514k) {
        activity.getClass();
        interfaceC8514k.getClass();
        return new C8106a(new C7185a(InterfaceC8505b.f28398a.m32754a().mo32753a(activity)), interfaceC8514k.mo32765a(activity));
    }
}
