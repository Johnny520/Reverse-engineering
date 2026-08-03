package p000;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: renamed from: KE */
/* JADX INFO: loaded from: classes.dex */
public final class C0445KE {

    /* JADX INFO: renamed from: d */
    public static Integer f1460d;

    /* JADX INFO: renamed from: a */
    public final View f1461a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1462b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ViewTreeObserverOnPreDrawListenerC0877Ub f1463c;

    public C0445KE(ImageView imageView) {
        this.f1461a = imageView;
    }

    /* JADX INFO: renamed from: a */
    public final int m894a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        View view = this.f1461a;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = view.getContext();
        if (f1460d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            AbstractC0714Qj.m1488j("Argument must not be null", windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f1460d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f1460d.intValue();
    }
}
