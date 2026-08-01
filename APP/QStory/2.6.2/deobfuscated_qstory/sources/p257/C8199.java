package p257;

import android.graphics.Paint;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.C2941;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.util.views.C3761;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import p033.AbstractC6325;
import p261.AbstractC8247;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8199 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public RelativeLayout f22584;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C3761 f22585;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public RelativeLayout f22586;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public MaxRelativeLayout f22587;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public DialogXBaseRelativeLayout f22588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ArrayList f22589;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f22590;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public TextView f22591;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f22592 = -1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* synthetic */ C8197 f22593;

    public C8199(C8197 c8197, int i) {
        this.f22593 = c8197;
        this.f22590 = c8197.m8072(c8197.mo8057()) != 0 ? c8197.m8072(c8197.mo8057()) : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13698() {
        C8197 c8197 = this.f22593;
        AbstractC6325 abstractC6325 = c8197.f11578;
        if (this.f22588 == null || c8197.m8071() == null) {
            return;
        }
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f22588;
        dialogXBaseRelativeLayout.f11634 = c8197.f11589;
        int[] iArr = c8197.f11583;
        dialogXBaseRelativeLayout.m8085(iArr[0], iArr[1], iArr[2], iArr[3]);
        MaxRelativeLayout maxRelativeLayout = this.f22587;
        AbstractC6325 abstractC63252 = AbstractC8247.f22824;
        maxRelativeLayout.m8088(0);
        MaxRelativeLayout maxRelativeLayout2 = this.f22587;
        int i = c8197.f11585;
        if (i == 0) {
            i = 0;
        }
        maxRelativeLayout2.m8089(i);
        this.f22587.setMinWidth(0);
        MaxRelativeLayout maxRelativeLayout3 = this.f22587;
        int i2 = c8197.f11584;
        if (i2 == 0) {
            i2 = 0;
        }
        maxRelativeLayout3.setMinHeight(i2);
        abstractC6325.mo11875();
        int iMo11429 = abstractC6325.mo11875().mo11429(c8197.mo8057());
        Integer numValueOf = Integer.valueOf(iMo11429);
        Integer numValueOf2 = Integer.valueOf(c8197.mo8057() ? R.color.white : R.color.black);
        if (iMo11429 <= 0) {
            numValueOf = numValueOf2;
        }
        int iIntValue = numValueOf.intValue();
        this.f22591.setTextColor(c8197.m8069().getColor(iIntValue));
        C3761 c3761 = this.f22585;
        int color = c8197.m8069().getColor(iIntValue);
        c3761.f11703 = color;
        Paint paint = c3761.f11688;
        if (paint != null) {
            paint.setColor(color);
        }
        float f = c8197.f22572;
        if (f >= 0.0f && f <= 1.0f && this.f22592 != f) {
            this.f22585.m8097(f);
            this.f22592 = c8197.f22572;
        }
        if (c8197.f22574 > -1.0f) {
            this.f22587.setOutlineProvider(new C8219(this, 4));
            this.f22587.setClipToOutline(true);
            ArrayList arrayList = this.f22589;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((View) it.next()).getClass();
                    C2941.m6336();
                    return;
                }
            }
        }
        TextView textView = this.f22591;
        CharSequence charSequence = c8197.f22575;
        if (charSequence == null) {
            int i3 = AbstractC8200.f22594[c8197.f22581.ordinal()];
            charSequence = null;
        }
        AbstractC3737.m8037(textView, charSequence);
        AbstractC3737.m8036(this.f22591, null);
        this.f22584.setVisibility(8);
        this.f22586.setVisibility(0);
        boolean z = c8197.f22577;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = this.f22588;
        if (z) {
            dialogXBaseRelativeLayout2.setOnClickListener(null);
        } else {
            dialogXBaseRelativeLayout2.setClickable(false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m13699(Animation animation) {
        if (animation == null && this.f22587.getAnimation() != null) {
            animation = this.f22587.getAnimation();
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = this.f22593.f11586;
        return j != -1 ? j : duration;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13700(View view) {
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout;
        if (this.f22588 == null) {
            return;
        }
        C8197 c8197 = this.f22593;
        if (c8197.m8071() == null || c8197.f11582 || (dialogXBaseRelativeLayout = this.f22588) == null) {
            return;
        }
        c8197.f11582 = true;
        dialogXBaseRelativeLayout.post(new RunnableC8203(this, 1));
    }
}
