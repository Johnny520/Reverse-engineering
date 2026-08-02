package p000;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ze1 extends gx2 {

    /* JADX INFO: renamed from: d */
    public static final ze1 f13859d = new ze1(false);

    /* JADX INFO: renamed from: e */
    public static final int f13860e = R.string.mask_all_as_read;

    /* JADX INFO: renamed from: f */
    public static final wm0 f13861f = wm0.f12575i;

    /* JADX INFO: renamed from: g */
    public static final String f13862g = "MaskAllAsRead";

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f13862g;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        CopyOnWriteArrayList copyOnWriteArrayList = ld3.f6074a;
        Context context = up0.f11401i;
        if (context == null) {
            t11.m5067S("hostContext");
            throw null;
        }
        String string = context.getString(R.string.mask_all_as_read);
        string.getClass();
        ld3.m2898a(114514, new n31(10), string);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f13860e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f13861f;
    }
}
