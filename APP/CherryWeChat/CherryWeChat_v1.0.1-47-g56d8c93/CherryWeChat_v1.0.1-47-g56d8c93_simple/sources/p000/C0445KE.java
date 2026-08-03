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
    public final ArrayList f1462b;

    /* JADX INFO: renamed from: c */
    public ViewTreeObserverOnPreDrawListenerC0877Ub f1463c;

    public C0445KE(ImageView r2) {
        this.f1462b = new ArrayList();
        this.f1461a = r2;
    }

    /* JADX INFO: renamed from: a */
    public final int m894a(int r2, int r3, int r4) {
        int r0 = r3 - r4;
        if (r0 <= 0) goto L5;
        return r0;
    L5:
        int r22 = r2 - r4;
        if (r22 <= 0) goto L8;
        return r22;
    L8:
        View r23 = this.f1461a;
        if (r23.isLayoutRequested() == false) goto L11;
        return 0;
    L11:
        if (r3 != (-2)) goto L19;
        Context r24 = r23.getContext();
        if (f1460d != null) goto L16;
        WindowManager r25 = (WindowManager) r24.getSystemService("window");
        AbstractC0714Qj.m1488j("Argument must not be null", r25);
        Display r26 = r25.getDefaultDisplay();
        Point r32 = new Point();
        r26.getSize(r32);
        f1460d = Integer.valueOf(Math.max(r32.x, r32.y));
    L16:
        return f1460d.intValue();
    L19:
        return 0;
    }
}
