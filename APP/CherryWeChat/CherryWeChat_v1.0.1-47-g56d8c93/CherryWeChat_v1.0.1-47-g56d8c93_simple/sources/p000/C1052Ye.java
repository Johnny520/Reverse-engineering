package p000;

import android.app.Application;
import android.database.ContentObserver;
import android.provider.Settings;
import android.view.View;
import android.widget.FrameLayout;
import com.gyf.immersionbar.RunnableC1286a;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Ye */
/* JADX INFO: loaded from: classes.dex */
public final class C1052Ye extends ContentObserver {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f3352d = 0;

    /* JADX INFO: renamed from: a */
    public ArrayList f3353a;

    /* JADX INFO: renamed from: b */
    public Application f3354b;

    /* JADX INFO: renamed from: c */
    public Boolean f3355c;

    @Override // android.database.ContentObserver
    public final void onChange(boolean r8) {
        super.onChange(r8);
        Application r82 = this.f3354b;
        if (r82 != null) goto L5;
        return;
    L5:
        if (r82.getContentResolver() == null) goto L44;
        ArrayList r83 = this.f3353a;
        if (r83 != null) goto L9;
        return;
    L9:
        if (r83.isEmpty() == true) goto L46;
        int r84 = Settings.System.getInt(this.f3354b.getContentResolver(), "navigationbar_is_min", 0);
        Iterator r0 = this.f3353a.iterator();
    L12:
        if (r0.hasNext() == false) goto L47;
        RunnableC1286a r2 = (RunnableC1286a) r0.next();
        if (r84 != 0) goto L16;
        boolean r3 = true;
    L17:
        View r4 = r2.f4710c.findViewById(R.id.immersion_navigation_bar_view);
        if (r4 == null) goto L12;
        r2.f4716i = new C2262n5(r2.f4708a);
        r2.f4711d.getPaddingBottom();
        r2.f4711d.getPaddingRight();
        if (r3 == true) goto L23;
        r4.setVisibility(8);
    L22:
        int r5 = 0;
        int r6 = 0;
    L37:
        r2.m2517g(r2.f4711d.getPaddingTop(), r6, r5);
        goto L12
    L23:
        r4.setVisibility(0);
        if (RunnableC1286a.m2510a(r2.f4710c.findViewById(android.R.id.content)) == true) goto L22;
        if (r2.f4717j != 0) goto L30;
        r2.f4717j = r2.f4716i.f7977d;
    L30:
        if (r2.f4718k != 0) goto L32;
        r2.f4718k = r2.f4716i.f7978e;
    L32:
        r2.f4715h.getClass();
        FrameLayout.LayoutParams r32 = (FrameLayout.LayoutParams) r4.getLayoutParams();
        if (r2.f4716i.m4601c() == false) goto L35;
        r32.gravity = 80;
        r32.height = r2.f4717j;
        r2.f4715h.getClass();
        r5 = r2.f4717j;
        r6 = 0;
    L36:
        r4.setLayoutParams(r32);
        goto L37
    L35:
        r32.gravity = 8388613;
        r32.width = r2.f4718k;
        r2.f4715h.getClass();
        r6 = r2.f4718k;
        r5 = 0;
        goto L36
    L16:
        r3 = false;
        goto L17
    L47:
        return;
    L46:
        return;
    }
}
