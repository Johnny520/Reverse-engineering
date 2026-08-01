package p273;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.util.views.C4594;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p246.C8878;
import p277.AbstractC9077;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9031 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9027 f22939;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22940;

    public /* synthetic */ RunnableC9031(C9027 c9027, int i) {
        this.f22940 = i;
        this.f22939 = c9027;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22940;
        C9027 c9027 = this.f22939;
        switch (i) {
            case 0:
                AbstractC5754 abstractC5754 = c9027.f11928;
                abstractC5754.mo10459();
                abstractC5754.mo10459();
                c9027.mo8603();
                abstractC5754.mo10459();
                c9027.mo8603();
                c9027.f22924 = new WeakReference(new C9029(c9027, C0328R.layout.layout_dialogx_wait));
                if (c9027.m14272() != null) {
                    C9029 c9029M14272 = c9027.m14272();
                    C9027 c90272 = c9029M14272.f22937;
                    View viewM8610 = c90272.m8610(c9029M14272.f22934);
                    AbstractC5754 abstractC57542 = c90272.f11928;
                    if (viewM8610 != null) {
                        c90272.f22922 = new WeakReference(viewM8610);
                        c90272.m8606(viewM8610);
                        c9029M14272.f22932 = (DialogXBaseRelativeLayout) viewM8610.findViewById(C0328R.id.box_root);
                        c9029M14272.f22931 = (MaxRelativeLayout) viewM8610.findViewById(C0328R.id.bkg);
                        c9029M14272.f22930 = (RelativeLayout) viewM8610.findViewById(C0328R.id.box_progress);
                        AbstractC5894 abstractC5894Mo10459 = abstractC57542.mo10459();
                        Activity activityM8617 = c90272.m8617();
                        c90272.mo8603();
                        C4594 c4594Mo10616 = abstractC5894Mo10459.mo10616(activityM8617);
                        c9029M14272.f22929 = c4594Mo10616;
                        c9029M14272.f22930.addView(c4594Mo10616, new RelativeLayout.LayoutParams(-1, -1));
                        c9029M14272.f22928 = (RelativeLayout) viewM8610.findViewById(C0328R.id.box_customView);
                        c9029M14272.f22935 = (TextView) viewM8610.findViewById(C0328R.id.txt_info);
                        c9029M14272.f22933 = AbstractC4570.m8598(viewM8610);
                        if (c90272.m8614() != null) {
                            c90272.m8614().setTranslationZ(0.0f);
                        }
                        AbstractC5754 abstractC57543 = AbstractC9077.f23168;
                        c9029M14272.f22933 = AbstractC4570.m8598((View) c90272.f22922.get());
                        boolean zMo8603 = c90272.mo8603();
                        int i2 = C0328R.color.dialogxWaitBkgLight;
                        c90272.m8619(zMo8603 ? C0328R.color.dialogxWaitBkgDark : C0328R.color.dialogxWaitBkgLight);
                        Float fValueOf = Float.valueOf(c90272.m8608(15.0f));
                        c90272.mo8603();
                        if (c90272.mo8603()) {
                            i2 = C0328R.color.dialogxWaitBkgDark;
                        }
                        Integer numValueOf = Integer.valueOf(c90272.m8619(Integer.valueOf(i2).intValue()));
                        ArrayList arrayList = c9029M14272.f22933;
                        if (arrayList != null) {
                            Iterator it = arrayList.iterator();
                            if (it.hasNext()) {
                                ((View) it.next()).getClass();
                                C3775.m6954();
                            }
                        } else {
                            GradientDrawable gradientDrawable = (GradientDrawable) c90272.m8615().getDrawable(C0328R.drawable.rect_dialogx_material_wait_bkg);
                            gradientDrawable.setColor(numValueOf.intValue());
                            gradientDrawable.setCornerRadius(fValueOf.floatValue());
                            c9029M14272.f22931.setBackground(gradientDrawable);
                        }
                        c9029M14272.f22932.setClickable(true);
                        c9029M14272.f22932.m8632(c90272);
                        c9029M14272.f22932.f11981 = new C9065(c9029M14272, 5);
                        WaitDialog$TYPE waitDialog$TYPE = c90272.f22925;
                        if (waitDialog$TYPE != null && waitDialog$TYPE != WaitDialog$TYPE.NONE) {
                            C4594 c4594 = c9029M14272.f22929;
                            c4594.f12027 = true;
                            c4594.postDelayed(new RunnableC9033(c9029M14272, 0), 100L);
                        }
                        c9029M14272.f22932.f11982 = new C8878(c9029M14272, 8);
                        WeakReference weakReference = c90272.f22924;
                        if (weakReference != null && weakReference.get() != c9029M14272) {
                            c90272.f22924 = new WeakReference(c9029M14272);
                        }
                        c9029M14272.m14274();
                    }
                    WeakReference weakReference2 = c9027.f22922;
                    if ((weakReference2 == null ? null : (View) weakReference2.get()) != null) {
                        WeakReference weakReference3 = c9027.f22922;
                        (weakReference3 == null ? null : (View) weakReference3.get()).setTag(c9027);
                        WeakReference weakReference4 = c9027.f22922;
                        AbstractC4570.m8587(weakReference4 != null ? (View) weakReference4.get() : null);
                    }
                }
                break;
            case 1:
                if (c9027.m14272() != null) {
                    c9027.m14272().m14274();
                }
                break;
            default:
                if (c9027.m14272() != null) {
                    c9027.m14272().m14276(null);
                }
                break;
        }
    }
}
