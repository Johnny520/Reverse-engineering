package yyds;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲀᛵᛵᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2006 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10028;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1624 f10029;

    public /* synthetic */ RunnableC2006(C1624 c1624, int i) {
        this.f10028 = i;
        this.f10029 = c1624;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10028) {
            case 0:
                C1624 c1624 = this.f10029;
                C0469 c0469 = c1624.f398;
                c0469.getClass();
                c0469.getClass();
                c1624.mo277();
                c0469.getClass();
                c1624.mo277();
                c1624.f8275 = new WeakReference(new C2458(c1624));
                if (c1624.m3325() != null) {
                    C2458 c2458M3325 = c1624.m3325();
                    C1624 c16242 = c2458M3325.f12153;
                    View viewM290 = c16242.m290(c2458M3325.f12147);
                    C0469 c04692 = c16242.f398;
                    if (viewM290 != null) {
                        c16242.f8271 = new WeakReference(viewM290);
                        c16242.f413 = new WeakReference(viewM290);
                        c2458M3325.f12151 = (DialogXBaseRelativeLayout) viewM290.findViewById(R.id.box_root);
                        c2458M3325.f12154 = (MaxRelativeLayout) viewM290.findViewById(R.id.bkg);
                        c2458M3325.f12156 = (RelativeLayout) viewM290.findViewById(R.id.box_progress);
                        c04692.getClass();
                        Activity activityM282 = c16242.m282();
                        c16242.mo277();
                        C2312 c2312 = new C2312(activityM282);
                        int i = 0;
                        c2312.f11347 = 0;
                        c2312.f11350 = (int) ((2.0f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
                        c2312.f11330 = -1;
                        c2312.f11344 = 180.0f;
                        c2312.f11341 = 80.0f;
                        c2312.f11327 = new Paint();
                        c2312.f11325 = false;
                        c2312.f11337 = 100.0f;
                        c2312.f11346 = 0;
                        c2312.f11336 = 0;
                        c2312.f11331 = 0;
                        c2312.m4322();
                        c2458M3325.f12149 = c2312;
                        c2458M3325.f12156.addView(c2312, new RelativeLayout.LayoutParams(-1, -1));
                        c2458M3325.f12155 = (RelativeLayout) viewM290.findViewById(R.id.box_customView);
                        c2458M3325.f12152 = (TextView) viewM290.findViewById(R.id.txt_info);
                        c2458M3325.f12150 = AbstractC0041.m265(viewM290);
                        if (c16242.m279() != null) {
                            c16242.m279().setTranslationZ(0.0f);
                        }
                        WeakReference weakReference = AbstractC1655.f8450;
                        c2458M3325.f12150 = AbstractC0041.m265((View) c16242.f8271.get());
                        boolean zMo277 = c16242.mo277();
                        int i2 = R.color.dialogxWaitBkgLight;
                        c16242.m284(zMo277 ? R.color.dialogxWaitBkgDark : R.color.dialogxWaitBkgLight);
                        float fM275 = c16242.m275(15.0f);
                        c16242.mo277();
                        if (c16242.mo277()) {
                            i2 = R.color.dialogxWaitBkgDark;
                        }
                        int iM284 = c16242.m284(i2);
                        ArrayList arrayList = c2458M3325.f12150;
                        if (arrayList != null) {
                            Iterator it = arrayList.iterator();
                            if (it.hasNext()) {
                                ((View) it.next()).getClass();
                                C0188.m794();
                            }
                        } else {
                            GradientDrawable gradientDrawable = (GradientDrawable) c16242.m286().getDrawable(R.drawable.rect_dialogx_material_wait_bkg);
                            gradientDrawable.setColor(iM284);
                            gradientDrawable.setCornerRadius(fM275);
                            c2458M3325.f12154.setBackground(gradientDrawable);
                        }
                        c2458M3325.f12151.setClickable(true);
                        c2458M3325.f12151.m294(c16242);
                        c2458M3325.f12151.f420 = new C0599(2, c2458M3325);
                        int i3 = c16242.f8266;
                        if (i3 != 0 && i3 != 1) {
                            C2312 c23122 = c2458M3325.f12149;
                            c23122.f11345 = true;
                            c23122.postDelayed(new RunnableC2177(c2458M3325, i), 100L);
                        }
                        c2458M3325.f12151.f430 = new C2014(22, c2458M3325);
                        WeakReference weakReference2 = c16242.f8275;
                        if (weakReference2 != null && weakReference2.get() != c2458M3325) {
                            c16242.f8275 = new WeakReference(c2458M3325);
                        }
                        c2458M3325.m4500();
                    }
                    WeakReference weakReference3 = c1624.f8271;
                    if ((weakReference3 == null ? null : (View) weakReference3.get()) != null) {
                        WeakReference weakReference4 = c1624.f8271;
                        (weakReference4 == null ? null : (View) weakReference4.get()).setTag(c1624);
                        WeakReference weakReference5 = c1624.f8271;
                        AbstractC0041.m258(weakReference5 != null ? (View) weakReference5.get() : null);
                    }
                }
                break;
            case 1:
                C1624 c16243 = this.f10029;
                if (c16243.m3325() != null) {
                    c16243.m3325().m4500();
                }
                break;
            default:
                C1624 c16244 = this.f10029;
                if (c16244.m3325() != null) {
                    c16244.m3325().m4498(null);
                }
                break;
        }
    }
}
