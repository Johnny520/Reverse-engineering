package p257;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.C2941;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.util.views.C3761;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC6087;
import p033.AbstractC6325;
import p230.C8048;
import p261.AbstractC8247;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8201 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8197 f22595;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22596;

    public /* synthetic */ RunnableC8201(C8197 c8197, int i) {
        this.f22596 = i;
        this.f22595 = c8197;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22596;
        C8197 c8197 = this.f22595;
        switch (i) {
            case 0:
                AbstractC6325 abstractC6325 = c8197.f11578;
                abstractC6325.mo11875();
                abstractC6325.mo11875();
                c8197.mo8057();
                abstractC6325.mo11875();
                c8197.mo8057();
                c8197.f22580 = new WeakReference(new C8199(c8197, R.layout.layout_dialogx_wait));
                if (c8197.m13696() != null) {
                    C8199 c8199M13696 = c8197.m13696();
                    C8197 c81972 = c8199M13696.f22593;
                    View viewM8064 = c81972.m8064(c8199M13696.f22590);
                    AbstractC6325 abstractC63252 = c81972.f11578;
                    if (viewM8064 != null) {
                        c81972.f22578 = new WeakReference(viewM8064);
                        c81972.m8060(viewM8064);
                        c8199M13696.f22588 = (DialogXBaseRelativeLayout) viewM8064.findViewById(R.id.box_root);
                        c8199M13696.f22587 = (MaxRelativeLayout) viewM8064.findViewById(R.id.bkg);
                        c8199M13696.f22586 = (RelativeLayout) viewM8064.findViewById(R.id.box_progress);
                        AbstractC6087 abstractC6087Mo11875 = abstractC63252.mo11875();
                        Activity activityM8071 = c81972.m8071();
                        c81972.mo8057();
                        C3761 c3761Mo11430 = abstractC6087Mo11875.mo11430(activityM8071);
                        c8199M13696.f22585 = c3761Mo11430;
                        c8199M13696.f22586.addView(c3761Mo11430, new RelativeLayout.LayoutParams(-1, -1));
                        c8199M13696.f22584 = (RelativeLayout) viewM8064.findViewById(R.id.box_customView);
                        c8199M13696.f22591 = (TextView) viewM8064.findViewById(R.id.txt_info);
                        c8199M13696.f22589 = AbstractC3737.m8052(viewM8064);
                        if (c81972.m8068() != null) {
                            c81972.m8068().setTranslationZ(0.0f);
                        }
                        AbstractC6325 abstractC63253 = AbstractC8247.f22824;
                        c8199M13696.f22589 = AbstractC3737.m8052((View) c81972.f22578.get());
                        boolean zMo8057 = c81972.mo8057();
                        int i2 = R.color.dialogxWaitBkgLight;
                        c81972.m8073(zMo8057 ? R.color.dialogxWaitBkgDark : R.color.dialogxWaitBkgLight);
                        Float fValueOf = Float.valueOf(c81972.m8062(15.0f));
                        c81972.mo8057();
                        if (c81972.mo8057()) {
                            i2 = R.color.dialogxWaitBkgDark;
                        }
                        Integer numValueOf = Integer.valueOf(c81972.m8073(Integer.valueOf(i2).intValue()));
                        ArrayList arrayList = c8199M13696.f22589;
                        if (arrayList != null) {
                            Iterator it = arrayList.iterator();
                            if (it.hasNext()) {
                                ((View) it.next()).getClass();
                                C2941.m6336();
                            }
                        } else {
                            GradientDrawable gradientDrawable = (GradientDrawable) c81972.m8069().getDrawable(R.drawable.rect_dialogx_material_wait_bkg);
                            gradientDrawable.setColor(numValueOf.intValue());
                            gradientDrawable.setCornerRadius(fValueOf.floatValue());
                            c8199M13696.f22587.setBackground(gradientDrawable);
                        }
                        c8199M13696.f22588.setClickable(true);
                        c8199M13696.f22588.m8086(c81972);
                        c8199M13696.f22588.f11631 = new C8235(c8199M13696, 5);
                        WaitDialog$TYPE waitDialog$TYPE = c81972.f22581;
                        if (waitDialog$TYPE != null && waitDialog$TYPE != WaitDialog$TYPE.NONE) {
                            C3761 c3761 = c8199M13696.f22585;
                            c3761.f11677 = true;
                            c3761.postDelayed(new RunnableC8203(c8199M13696, 0), 100L);
                        }
                        c8199M13696.f22588.f11632 = new C8048(c8199M13696, 8);
                        WeakReference weakReference = c81972.f22580;
                        if (weakReference != null && weakReference.get() != c8199M13696) {
                            c81972.f22580 = new WeakReference(c8199M13696);
                        }
                        c8199M13696.m13698();
                    }
                    WeakReference weakReference2 = c8197.f22578;
                    if ((weakReference2 == null ? null : (View) weakReference2.get()) != null) {
                        WeakReference weakReference3 = c8197.f22578;
                        (weakReference3 == null ? null : (View) weakReference3.get()).setTag(c8197);
                        WeakReference weakReference4 = c8197.f22578;
                        AbstractC3737.m8041(weakReference4 != null ? (View) weakReference4.get() : null);
                    }
                }
                break;
            case 1:
                if (c8197.m13696() != null) {
                    c8197.m13696().m13698();
                }
                break;
            default:
                if (c8197.m13696() != null) {
                    c8197.m13696().m13700(null);
                }
                break;
        }
    }
}
