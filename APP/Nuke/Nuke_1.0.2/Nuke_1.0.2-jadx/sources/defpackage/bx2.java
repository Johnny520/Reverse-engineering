package defpackage;

import android.view.MotionEvent;
import android.view.ViewGroup;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bx2 extends gx2 {
    public static final bx2 d = new bx2(false);
    public static final int e = R.string.swipe_to_delete_conversation;
    public static final int f = R.string.swipe_to_delete_conversation_description;
    public static final wm0 g = wm0.i;
    public static final String h = "SwipeToDeleteConversation";
    public static final boolean i = true;
    public static final hx2 j = new hx2(new hn1(24));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final boolean e() {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() throws NoSuchMethodException {
        Class cls;
        Class cls2;
        cls = ViewGroup.class;
        Class<ViewGroup> clsA = p40.A(d72.a(cls));
        cls = clsA != null ? clsA : ViewGroup.class;
        cls2 = MotionEvent.class;
        Class<MotionEvent> clsA2 = p40.A(d72.a(cls2));
        Method declaredMethod = cls.getDeclaredMethod("dispatchTouchEvent", clsA2 != null ? clsA2 : MotionEvent.class);
        declaredMethod.getClass();
        XposedBridge.hookMethod(declaredMethod, new kg3(this, new ml2(26), null)).getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final Integer k() {
        return Integer.valueOf(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final int m() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final wm0 n() {
        return g;
    }
}
