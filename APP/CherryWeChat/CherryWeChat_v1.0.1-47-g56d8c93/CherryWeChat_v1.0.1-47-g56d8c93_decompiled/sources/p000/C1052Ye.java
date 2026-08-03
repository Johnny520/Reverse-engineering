package p000;

import android.app.Application;
import android.database.ContentObserver;
import android.provider.Settings;
import android.view.View;
import android.widget.FrameLayout;
import com.gyf.immersionbar.RunnableC1286a;
import io.github.cherrywechat.R;
import java.util.ArrayList;

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
    public final void onChange(boolean z) {
        ArrayList arrayList;
        int i;
        int i2;
        super.onChange(z);
        Application application = this.f3354b;
        if (application == null || application.getContentResolver() == null || (arrayList = this.f3353a) == null || arrayList.isEmpty()) {
            return;
        }
        int i3 = Settings.System.getInt(this.f3354b.getContentResolver(), "navigationbar_is_min", 0);
        for (RunnableC1286a runnableC1286a : this.f3353a) {
            boolean z2 = i3 == 0;
            View viewFindViewById = runnableC1286a.f4710c.findViewById(R.id.immersion_navigation_bar_view);
            if (viewFindViewById != null) {
                runnableC1286a.f4716i = new C2262n5(runnableC1286a.f4708a);
                runnableC1286a.f4711d.getPaddingBottom();
                runnableC1286a.f4711d.getPaddingRight();
                if (z2) {
                    viewFindViewById.setVisibility(0);
                    if (!RunnableC1286a.m2510a(runnableC1286a.f4710c.findViewById(android.R.id.content))) {
                        if (runnableC1286a.f4717j == 0) {
                            runnableC1286a.f4717j = runnableC1286a.f4716i.f7977d;
                        }
                        if (runnableC1286a.f4718k == 0) {
                            runnableC1286a.f4718k = runnableC1286a.f4716i.f7978e;
                        }
                        runnableC1286a.f4715h.getClass();
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById.getLayoutParams();
                        if (runnableC1286a.f4716i.m4601c()) {
                            layoutParams.gravity = 80;
                            layoutParams.height = runnableC1286a.f4717j;
                            runnableC1286a.f4715h.getClass();
                            i2 = runnableC1286a.f4717j;
                            i = 0;
                        } else {
                            layoutParams.gravity = 8388613;
                            layoutParams.width = runnableC1286a.f4718k;
                            runnableC1286a.f4715h.getClass();
                            i = runnableC1286a.f4718k;
                            i2 = 0;
                        }
                        viewFindViewById.setLayoutParams(layoutParams);
                    }
                    runnableC1286a.m2517g(runnableC1286a.f4711d.getPaddingTop(), i, i2);
                } else {
                    viewFindViewById.setVisibility(8);
                }
                i2 = 0;
                i = 0;
                runnableC1286a.m2517g(runnableC1286a.f4711d.getPaddingTop(), i, i2);
            }
        }
    }
}
