package p273;

import android.graphics.Paint;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.util.views.C4594;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p277.AbstractC9077;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9029 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public RelativeLayout f22928;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C4594 f22929;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public RelativeLayout f22930;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public MaxRelativeLayout f22931;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public DialogXBaseRelativeLayout f22932;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ArrayList f22933;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f22934;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public TextView f22935;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f22936 = -1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* synthetic */ C9027 f22937;

    public C9029(C9027 c9027, int i) {
        this.f22937 = c9027;
        this.f22934 = c9027.m8618(c9027.mo8603()) != 0 ? c9027.m8618(c9027.mo8603()) : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14274() {
        C9027 c9027 = this.f22937;
        AbstractC5754 abstractC5754 = c9027.f11928;
        if (this.f22932 == null || c9027.m8617() == null) {
            return;
        }
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f22932;
        dialogXBaseRelativeLayout.f11984 = c9027.f11939;
        int[] iArr = c9027.f11933;
        dialogXBaseRelativeLayout.m8631(iArr[0], iArr[1], iArr[2], iArr[3]);
        MaxRelativeLayout maxRelativeLayout = this.f22931;
        AbstractC5754 abstractC57542 = AbstractC9077.f23168;
        maxRelativeLayout.m8634(0);
        MaxRelativeLayout maxRelativeLayout2 = this.f22931;
        int i = c9027.f11935;
        if (i == 0) {
            i = 0;
        }
        maxRelativeLayout2.m8635(i);
        this.f22931.setMinWidth(0);
        MaxRelativeLayout maxRelativeLayout3 = this.f22931;
        int i2 = c9027.f11934;
        if (i2 == 0) {
            i2 = 0;
        }
        maxRelativeLayout3.setMinHeight(i2);
        abstractC5754.mo10459();
        int iMo10617 = abstractC5754.mo10459().mo10617(c9027.mo8603());
        Integer numValueOf = Integer.valueOf(iMo10617);
        Integer numValueOf2 = Integer.valueOf(c9027.mo8603() ? C0328R.color.white : C0328R.color.black);
        if (iMo10617 <= 0) {
            numValueOf = numValueOf2;
        }
        int iIntValue = numValueOf.intValue();
        this.f22935.setTextColor(c9027.m8615().getColor(iIntValue));
        C4594 c4594 = this.f22929;
        int color = c9027.m8615().getColor(iIntValue);
        c4594.f12053 = color;
        Paint paint = c4594.f12038;
        if (paint != null) {
            paint.setColor(color);
        }
        float f = c9027.f22916;
        if (f >= 0.0f && f <= 1.0f && this.f22936 != f) {
            this.f22929.m8643(f);
            this.f22936 = c9027.f22916;
        }
        if (c9027.f22918 > -1.0f) {
            this.f22931.setOutlineProvider(new C9049(this, 4));
            this.f22931.setClipToOutline(true);
            ArrayList arrayList = this.f22933;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((View) it.next()).getClass();
                    C3775.m6954();
                    return;
                }
            }
        }
        TextView textView = this.f22935;
        CharSequence charSequence = c9027.f22919;
        if (charSequence == null) {
            int i3 = AbstractC9030.f22938[c9027.f22925.ordinal()];
            charSequence = null;
        }
        AbstractC4570.m8583(textView, charSequence);
        AbstractC4570.m8582(this.f22935, null);
        this.f22928.setVisibility(8);
        this.f22930.setVisibility(0);
        boolean z = c9027.f22921;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = this.f22932;
        if (z) {
            dialogXBaseRelativeLayout2.setOnClickListener(null);
        } else {
            dialogXBaseRelativeLayout2.setClickable(false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m14275(Animation animation) {
        if (animation == null && this.f22931.getAnimation() != null) {
            animation = this.f22931.getAnimation();
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = this.f22937.f11936;
        return j != -1 ? j : duration;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14276(View view) {
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout;
        if (this.f22932 == null) {
            return;
        }
        C9027 c9027 = this.f22937;
        if (c9027.m8617() == null || c9027.f11932 || (dialogXBaseRelativeLayout = this.f22932) == null) {
            return;
        }
        c9027.f11932 = true;
        dialogXBaseRelativeLayout.post(new RunnableC9033(this, 1));
    }
}
