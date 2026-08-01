package p257;

import android.graphics.Paint;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.C2942;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.util.views.C3762;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p261.AbstractC8248;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8200 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public RelativeLayout f22583;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C3762 f22584;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public RelativeLayout f22585;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public MaxRelativeLayout f22586;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public DialogXBaseRelativeLayout f22587;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ArrayList f22588;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f22589;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public TextView f22590;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f22591 = -1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* synthetic */ C8198 f22592;

    public C8200(C8198 c8198, int i) {
        this.f22592 = c8198;
        this.f22589 = c8198.m8059(c8198.mo8044()) != 0 ? c8198.m8059(c8198.mo8044()) : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13715() {
        C8198 c8198 = this.f22592;
        AbstractC4922 abstractC4922 = c8198.f11583;
        if (this.f22587 == null || c8198.m8058() == null) {
            return;
        }
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f22587;
        dialogXBaseRelativeLayout.f11639 = c8198.f11594;
        int[] iArr = c8198.f11588;
        dialogXBaseRelativeLayout.m8072(iArr[0], iArr[1], iArr[2], iArr[3]);
        MaxRelativeLayout maxRelativeLayout = this.f22586;
        AbstractC4922 abstractC49222 = AbstractC8248.f22823;
        maxRelativeLayout.m8075(0);
        MaxRelativeLayout maxRelativeLayout2 = this.f22586;
        int i = c8198.f11590;
        if (i == 0) {
            i = 0;
        }
        maxRelativeLayout2.m8076(i);
        this.f22586.setMinWidth(0);
        MaxRelativeLayout maxRelativeLayout3 = this.f22586;
        int i2 = c8198.f11589;
        if (i2 == 0) {
            i2 = 0;
        }
        maxRelativeLayout3.setMinHeight(i2);
        abstractC4922.mo9900();
        int iMo10058 = abstractC4922.mo9900().mo10058(c8198.mo8044());
        Integer numValueOf = Integer.valueOf(iMo10058);
        Integer numValueOf2 = Integer.valueOf(c8198.mo8044() ? R.color.white : R.color.black);
        if (iMo10058 <= 0) {
            numValueOf = numValueOf2;
        }
        int iIntValue = numValueOf.intValue();
        this.f22590.setTextColor(c8198.m8056().getColor(iIntValue));
        C3762 c3762 = this.f22584;
        int color = c8198.m8056().getColor(iIntValue);
        c3762.f11708 = color;
        Paint paint = c3762.f11693;
        if (paint != null) {
            paint.setColor(color);
        }
        float f = c8198.f22571;
        if (f >= 0.0f && f <= 1.0f && this.f22591 != f) {
            this.f22584.m8084(f);
            this.f22591 = c8198.f22571;
        }
        if (c8198.f22573 > -1.0f) {
            this.f22586.setOutlineProvider(new C8220(this, 4));
            this.f22586.setClipToOutline(true);
            ArrayList arrayList = this.f22588;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((View) it.next()).getClass();
                    C2942.m6394();
                    return;
                }
            }
        }
        TextView textView = this.f22590;
        CharSequence charSequence = c8198.f22574;
        if (charSequence == null) {
            int i3 = AbstractC8201.f22593[c8198.f22580.ordinal()];
            charSequence = null;
        }
        AbstractC3738.m8024(textView, charSequence);
        AbstractC3738.m8023(this.f22590, null);
        this.f22583.setVisibility(8);
        this.f22585.setVisibility(0);
        boolean z = c8198.f22576;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = this.f22587;
        if (z) {
            dialogXBaseRelativeLayout2.setOnClickListener(null);
        } else {
            dialogXBaseRelativeLayout2.setClickable(false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m13716(Animation animation) {
        if (animation == null && this.f22586.getAnimation() != null) {
            animation = this.f22586.getAnimation();
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = this.f22592.f11591;
        return j != -1 ? j : duration;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13717(View view) {
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout;
        if (this.f22587 == null) {
            return;
        }
        C8198 c8198 = this.f22592;
        if (c8198.m8058() == null || c8198.f11587 || (dialogXBaseRelativeLayout = this.f22587) == null) {
            return;
        }
        c8198.f11587 = true;
        dialogXBaseRelativeLayout.post(new RunnableC8204(this, 1));
    }
}
