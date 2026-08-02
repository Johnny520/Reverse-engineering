package p000;

import android.view.MotionEvent;
import android.view.ViewGroup;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bx2 extends gx2 {

    /* JADX INFO: renamed from: d */
    public static final bx2 f1067d = new bx2(false);

    /* JADX INFO: renamed from: e */
    public static final int f1068e = R.string.swipe_to_delete_conversation;

    /* JADX INFO: renamed from: f */
    public static final int f1069f = R.string.swipe_to_delete_conversation_description;

    /* JADX INFO: renamed from: g */
    public static final wm0 f1070g = wm0.f12575i;

    /* JADX INFO: renamed from: h */
    public static final String f1071h = "SwipeToDeleteConversation";

    /* JADX INFO: renamed from: i */
    public static final boolean f1072i = true;

    /* JADX INFO: renamed from: j */
    public static final hx2 f1073j = new hx2(new hn1(24));

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f1071h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: e */
    public final boolean mo139e() {
        return f1072i;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() throws NoSuchMethodException {
        Class cls;
        Class cls2;
        cls = ViewGroup.class;
        Class<ViewGroup> clsM3691A = p40.m3691A(d72.m967a(cls));
        cls = clsM3691A != null ? clsM3691A : ViewGroup.class;
        cls2 = MotionEvent.class;
        Class<MotionEvent> clsM3691A2 = p40.m3691A(d72.m967a(cls2));
        Method declaredMethod = cls.getDeclaredMethod("dispatchTouchEvent", clsM3691A2 != null ? clsM3691A2 : MotionEvent.class);
        declaredMethod.getClass();
        XposedBridge.hookMethod(declaredMethod, new kg3(this, new ml2(26), null)).getClass();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f1069f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f1068e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f1070g;
    }
}
