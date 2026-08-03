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

    public C0953W7(ViewOnClickListenerC0996X7 viewOnClickListenerC0996X7, ListView listView, C0382Iv c0382Iv) {
        this.f2983a = viewOnClickListenerC0996X7;
        this.f2984b = listView;
        this.f2985c = c0382Iv;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2983a.f3181c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this.f2984b.getContext());
        frameLayout.setMinimumHeight(AbstractC0295Gu.m616i(50));
        TextView textView = new TextView(frameLayout.getContext());
        ViewOnClickListenerC0996X7 viewOnClickListenerC0996X7 = this.f2983a;
        textView.setText((CharSequence) viewOnClickListenerC0996X7.f3181c.get(i));
        textView.setTextColor(textView.getContext().getColor(R.color.textTitle));
        textView.setTextSize(16.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 19;
        layoutParams.setMargins(AbstractC0295Gu.m616i(20), 0, AbstractC0295Gu.m616i(20), 0);
        frameLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setImageResource(R.drawable.ic_panel_delete);
        imageView.setColorFilter(imageView.getContext().getColor(R.color.colorError), PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new ViewOnClickListenerC2219m5(viewOnClickListenerC0996X7, i, this));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(25), AbstractC0295Gu.m616i(25));
        layoutParams2.gravity = 21;
        layoutParams2.rightMargin = AbstractC0295Gu.m616i(20);
        frameLayout.addView(imageView, layoutParams2);
        frameLayout.setOnClickListener(new ViewOnClickListenerC0910V7(frameLayout, viewOnClickListenerC0996X7, i, this.f2985c));
        frameLayout.setOnTouchListener(new ViewOnTouchListenerC2586ue(2, frameLayout));
        return frameLayout;
    }
}
