package p000;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: W7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0953W7 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewOnClickListenerC0996X7 f2983a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ListView f2984b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0382Iv f2985c;

    public C0953W7(ViewOnClickListenerC0996X7 r1, ListView r2, C0382Iv r3) {
        this.f2983a = r1;
        this.f2984b = r2;
        this.f2985c = r3;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2983a.f3181c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int r1) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        return r3;
    }

    @Override // android.widget.Adapter
    public final View getView(int r7, View r8, ViewGroup r9) {
        FrameLayout r82 = new FrameLayout(this.f2984b.getContext());
        r82.setMinimumHeight(AbstractC0295Gu.m616i(50));
        TextView r92 = new TextView(r82.getContext());
        ViewOnClickListenerC0996X7 r0 = this.f2983a;
        r92.setText((CharSequence) r0.f3181c.get(r7));
        r92.setTextColor(r92.getContext().getColor(R.color.textTitle));
        r92.setTextSize(16.0f);
        FrameLayout.LayoutParams r1 = new FrameLayout.LayoutParams(-1, -2);
        r1.gravity = 19;
        r1.setMargins(AbstractC0295Gu.m616i(20), 0, AbstractC0295Gu.m616i(20), 0);
        r82.addView(r92, r1);
        ImageView r93 = new ImageView(r82.getContext());
        r93.setImageResource(R.drawable.ic_panel_delete);
        r93.setColorFilter(r93.getContext().getColor(R.color.colorError), PorterDuff.Mode.SRC_IN);
        r93.setOnClickListener(new ViewOnClickListenerC2219m5(r0, r7, this));
        FrameLayout.LayoutParams r12 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(25), AbstractC0295Gu.m616i(25));
        r12.gravity = 21;
        r12.rightMargin = AbstractC0295Gu.m616i(20);
        r82.addView(r93, r12);
        r82.setOnClickListener(new ViewOnClickListenerC0910V7(r82, r0, r7, this.f2985c));
        r82.setOnTouchListener(new ViewOnTouchListenerC2586ue(2, r82));
        return r82;
    }
}
