package p102z0;

import android.view.View;
import p025M0.InterfaceC0193a;
import p027N0.AbstractC0223g;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: z0.m */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1130m implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public View.OnClickListener f3804b;

    /* JADX INFO: renamed from: c */
    public View.OnClickListener f3805c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0193a f3806d;

    /* JADX INFO: renamed from: e */
    public int f3807e;

    /* JADX INFO: renamed from: f */
    public int f3808f;

    /* JADX INFO: renamed from: g */
    public long f3809g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC0223g.m418e(view, "v");
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC0731a.m1384a(Integer.valueOf(this.f3808f), Long.valueOf(this.f3809g), Long.valueOf(jCurrentTimeMillis));
        if (this.f3809g == 0) {
            this.f3809g = jCurrentTimeMillis;
        }
        if (jCurrentTimeMillis - this.f3809g < this.f3807e) {
            this.f3808f++;
        } else {
            this.f3808f = 0;
        }
        this.f3809g = jCurrentTimeMillis;
        if (this.f3808f > ((Number) this.f3806d.mo7b()).intValue()) {
            this.f3808f = 0;
            this.f3809g = 0L;
            this.f3805c.onClick(view);
        }
        View.OnClickListener onClickListener = this.f3804b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
