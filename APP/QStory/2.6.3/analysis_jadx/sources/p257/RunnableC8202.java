package p257;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.C2942;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.util.views.C3762;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p230.C8049;
import p261.AbstractC8248;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8202 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8198 f22594;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22595;

    public /* synthetic */ RunnableC8202(C8198 c8198, int i) {
        this.f22595 = i;
        this.f22594 = c8198;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22595;
        C8198 c8198 = this.f22594;
        switch (i) {
            case 0:
                AbstractC4922 abstractC4922 = c8198.f11583;
                abstractC4922.mo9900();
                abstractC4922.mo9900();
                c8198.mo8044();
                abstractC4922.mo9900();
                c8198.mo8044();
                c8198.f22579 = new WeakReference(new C8200(c8198, R.layout.layout_dialogx_wait));
                if (c8198.m13713() != null) {
                    C8200 c8200M13713 = c8198.m13713();
                    C8198 c81982 = c8200M13713.f22592;
                    View viewM8051 = c81982.m8051(c8200M13713.f22589);
                    AbstractC4922 abstractC49222 = c81982.f11583;
                    if (viewM8051 != null) {
                        c81982.f22577 = new WeakReference(viewM8051);
                        c81982.m8047(viewM8051);
                        c8200M13713.f22587 = (DialogXBaseRelativeLayout) viewM8051.findViewById(R.id.box_root);
                        c8200M13713.f22586 = (MaxRelativeLayout) viewM8051.findViewById(R.id.bkg);
                        c8200M13713.f22585 = (RelativeLayout) viewM8051.findViewById(R.id.box_progress);
                        AbstractC5062 abstractC5062Mo9900 = abstractC49222.mo9900();
                        Activity activityM8058 = c81982.m8058();
                        c81982.mo8044();
                        C3762 c3762Mo10057 = abstractC5062Mo9900.mo10057(activityM8058);
                        c8200M13713.f22584 = c3762Mo10057;
                        c8200M13713.f22585.addView(c3762Mo10057, new RelativeLayout.LayoutParams(-1, -1));
                        c8200M13713.f22583 = (RelativeLayout) viewM8051.findViewById(R.id.box_customView);
                        c8200M13713.f22590 = (TextView) viewM8051.findViewById(R.id.txt_info);
                        c8200M13713.f22588 = AbstractC3738.m8039(viewM8051);
                        if (c81982.m8055() != null) {
                            c81982.m8055().setTranslationZ(0.0f);
                        }
                        AbstractC4922 abstractC49223 = AbstractC8248.f22823;
                        c8200M13713.f22588 = AbstractC3738.m8039((View) c81982.f22577.get());
                        boolean zMo8044 = c81982.mo8044();
                        int i2 = R.color.dialogxWaitBkgLight;
                        c81982.m8060(zMo8044 ? R.color.dialogxWaitBkgDark : R.color.dialogxWaitBkgLight);
                        Float fValueOf = Float.valueOf(c81982.m8049(15.0f));
                        c81982.mo8044();
                        if (c81982.mo8044()) {
                            i2 = R.color.dialogxWaitBkgDark;
                        }
                        Integer numValueOf = Integer.valueOf(c81982.m8060(Integer.valueOf(i2).intValue()));
                        ArrayList arrayList = c8200M13713.f22588;
                        if (arrayList != null) {
                            Iterator it = arrayList.iterator();
                            if (it.hasNext()) {
                                ((View) it.next()).getClass();
                                C2942.m6394();
                            }
                        } else {
                            GradientDrawable gradientDrawable = (GradientDrawable) c81982.m8056().getDrawable(R.drawable.rect_dialogx_material_wait_bkg);
                            gradientDrawable.setColor(numValueOf.intValue());
                            gradientDrawable.setCornerRadius(fValueOf.floatValue());
                            c8200M13713.f22586.setBackground(gradientDrawable);
                        }
                        c8200M13713.f22587.setClickable(true);
                        c8200M13713.f22587.m8073(c81982);
                        c8200M13713.f22587.f11636 = new C8236(c8200M13713, 5);
                        WaitDialog$TYPE waitDialog$TYPE = c81982.f22580;
                        if (waitDialog$TYPE != null && waitDialog$TYPE != WaitDialog$TYPE.NONE) {
                            C3762 c3762 = c8200M13713.f22584;
                            c3762.f11682 = true;
                            c3762.postDelayed(new RunnableC8204(c8200M13713, 0), 100L);
                        }
                        c8200M13713.f22587.f11637 = new C8049(c8200M13713, 8);
                        WeakReference weakReference = c81982.f22579;
                        if (weakReference != null && weakReference.get() != c8200M13713) {
                            c81982.f22579 = new WeakReference(c8200M13713);
                        }
                        c8200M13713.m13715();
                    }
                    WeakReference weakReference2 = c8198.f22577;
                    if ((weakReference2 == null ? null : (View) weakReference2.get()) != null) {
                        WeakReference weakReference3 = c8198.f22577;
                        (weakReference3 == null ? null : (View) weakReference3.get()).setTag(c8198);
                        WeakReference weakReference4 = c8198.f22577;
                        AbstractC3738.m8028(weakReference4 != null ? (View) weakReference4.get() : null);
                    }
                }
                break;
            case 1:
                if (c8198.m13713() != null) {
                    c8198.m13713().m13715();
                }
                break;
            default:
                if (c8198.m13713() != null) {
                    c8198.m13713().m13717(null);
                }
                break;
        }
    }
}
