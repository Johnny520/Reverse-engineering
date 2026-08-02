package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ze1 extends gx2 {
    public static final ze1 d = new ze1(false);
    public static final int e = R.string.mask_all_as_read;
    public static final wm0 f = wm0.i;
    public static final String g = "MaskAllAsRead";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        CopyOnWriteArrayList copyOnWriteArrayList = ld3.a;
        Context context = up0.i;
        if (context == null) {
            t11.S("hostContext");
            throw null;
        }
        String string = context.getString(R.string.mask_all_as_read);
        string.getClass();
        ld3.a(114514, new n31(10), string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final int m() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final wm0 n() {
        return f;
    }
}
