package p293u4;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* JADX INFO: renamed from: u4.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8506c implements InterfaceC8505b {

    /* JADX INFO: renamed from: b */
    public static final C8506c f28401b = new C8506c();

    @Override // p293u4.InterfaceC8505b
    /* JADX INFO: renamed from: a */
    public Rect mo32753a(Activity activity) {
        activity.getClass();
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!C8504a.f28397a.m32752a(activity)) {
            Point pointM32775a = C8522s.f28411a.m32775a(defaultDisplay);
            int iM32762e = AbstractC8512i.m32762e(activity);
            int i10 = rect.bottom;
            if (i10 + iM32762e == pointM32775a.y) {
                rect.bottom = i10 + iM32762e;
                return rect;
            }
            int i11 = rect.right;
            if (i11 + iM32762e == pointM32775a.x) {
                rect.right = i11 + iM32762e;
            }
        }
        return rect;
    }
}
