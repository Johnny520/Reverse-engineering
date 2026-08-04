package yyds;

import android.graphics.Paint;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲇᛵᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2458 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int f12147;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public float f12148 = -1.0f;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C2312 f12149;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public ArrayList f12150;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public DialogXBaseRelativeLayout f12151;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public TextView f12152;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1624 f12153;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public MaxRelativeLayout f12154;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public RelativeLayout f12155;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public RelativeLayout f12156;

    public C2458(C1624 c1624) {
        this.f12153 = c1624;
        this.f12147 = c1624.m276(c1624.mo277()) != 0 ? c1624.m276(c1624.mo277()) : R.layout.layout_dialogx_wait;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4498(View view) {
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout;
        if (this.f12151 == null) {
            return;
        }
        C1624 c1624 = this.f12153;
        if (c1624.m282() == null || c1624.f403 || (dialogXBaseRelativeLayout = this.f12151) == null) {
            return;
        }
        c1624.f403 = true;
        dialogXBaseRelativeLayout.post(new RunnableC2177(this, 1));
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final long m4499(Animation animation) {
        if (animation == null && this.f12154.getAnimation() != null) {
            animation = this.f12154.getAnimation();
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = this.f12153.f411;
        return j != -1 ? j : duration;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m4500() {
        C1624 c1624 = this.f12153;
        C0469 c0469 = c1624.f398;
        if (this.f12151 == null || c1624.m282() == null) {
            return;
        }
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f12151;
        dialogXBaseRelativeLayout.f435 = c1624.f397;
        int[] iArr = c1624.f404;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = 2;
        int i4 = iArr[2];
        int i5 = iArr[3];
        int[] iArr2 = dialogXBaseRelativeLayout.f427;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i4;
        iArr2[3] = i5;
        MaxRelativeLayout maxRelativeLayout = this.f12154;
        WeakReference weakReference = AbstractC1655.f8450;
        maxRelativeLayout.getClass();
        this.f12154.getClass();
        this.f12154.setMinWidth(0);
        this.f12154.setMinHeight(0);
        c0469.getClass();
        c0469.getClass();
        boolean zMo277 = c1624.mo277();
        int i6 = R.color.black;
        if (zMo277) {
            i6 = R.color.white;
        }
        Integer numValueOf = Integer.valueOf(i6);
        c1624.mo277();
        int iIntValue = numValueOf.intValue();
        this.f12152.setTextColor(c1624.m286().getColor(iIntValue));
        C2312 c2312 = this.f12149;
        int color = c1624.m286().getColor(iIntValue);
        c2312.f11330 = color;
        Paint paint = c2312.f11327;
        if (paint != null) {
            paint.setColor(color);
        }
        float f = c1624.f8274;
        if (f >= 0.0f && f <= 1.0f && this.f12148 != f) {
            this.f12149.m4324(f);
            this.f12148 = c1624.f8274;
        }
        if (c1624.f8267 > -1.0f) {
            this.f12154.setOutlineProvider(new C1559(i3, this));
            this.f12154.setClipToOutline(true);
            ArrayList arrayList = this.f12150;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((View) it.next()).getClass();
                    C0188.m794();
                    return;
                }
            }
        }
        TextView textView = this.f12152;
        CharSequence charSequence = c1624.f8272;
        if (charSequence == null) {
            AbstractC2104.m4012(c1624.f8266);
            charSequence = null;
        }
        AbstractC0041.m270(textView, charSequence);
        AbstractC0041.m272(this.f12152, null);
        this.f12155.setVisibility(8);
        this.f12156.setVisibility(0);
        boolean z = c1624.f8268;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = this.f12151;
        if (z) {
            dialogXBaseRelativeLayout2.setOnClickListener(null);
        } else {
            dialogXBaseRelativeLayout2.setClickable(false);
        }
    }
}
