package p000;

import android.view.View;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wf3 {

    /* JADX INFO: renamed from: a */
    public static final rk1 f12494a;

    static {
        long[] jArr = ed2.f2401a;
        f12494a = new rk1();
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC0941yx m5885a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC0941yx) {
            return (AbstractC0941yx) tag;
        }
        return null;
    }
}
