package p000;

import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ak0 implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f186d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ TextView f187e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ GradientDrawable f188f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ak0(TextView textView, GradientDrawable gradientDrawable, int i) {
        this.f186d = i;
        this.f187e = textView;
        this.f188f = gradientDrawable;
    }

    /* JADX DEBUG: Class process forced to load method for inline: ck0.c(android.widget.TextView, android.graphics.drawable.GradientDrawable):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f186d) {
            case 0:
                ck0.m560K(this.f187e, this.f188f);
                break;
            default:
                ck0.m558I(this.f187e, this.f188f);
                break;
        }
    }
}
