package p000;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: z8 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0565z8 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final Context f1140a;

    /* JADX INFO: renamed from: b */
    public final C0362o8 f1141b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1142c = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0565z8(Activity activity, C0362o8 c0362o8) {
        this.f1140a = activity;
        this.f1141b = c0362o8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1142c.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f1142c.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0549y8 c0549y8;
        View view2;
        if (view == null || !(view.getTag() instanceof C0549y8)) {
            Context context = this.f1140a;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setGravity(16);
            linearLayout.setMinimumHeight(AbstractC0260i5.m591a0(context, 56.0f));
            linearLayout.setPadding(AbstractC0260i5.m591a0(context, 12.0f), AbstractC0260i5.m591a0(context, 6.0f), AbstractC0260i5.m591a0(context, 10.0f), AbstractC0260i5.m591a0(context, 6.0f));
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, AbstractC0260i5.m523D1(context, AbstractC0486u9.m1062o(context) ? -13947080 : -1052171, AbstractC0486u9.m1062o(context) ? -13282697 : -3876617, 12.0f));
            stateListDrawable.addState(new int[0], AbstractC0260i5.m523D1(context, AbstractC0486u9.m1072y(context), AbstractC0486u9.m1062o(context) ? -11775650 : -1841171, 12.0f));
            linearLayout.setBackground(stateListDrawable);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            TextView textViewM574U1 = AbstractC0260i5.m574U1(context, "", 14.0f, AbstractC0486u9.m1045G(context), true);
            textViewM574U1.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textViewM574U1.setEllipsize(truncateAt);
            linearLayout2.addView(textViewM574U1, AbstractC0260i5.m604d1());
            TextView textViewM574U12 = AbstractC0260i5.m574U1(context, "", 11.0f, AbstractC0486u9.m1043E(context), false);
            textViewM574U12.setSingleLine(true);
            textViewM574U12.setEllipsize(truncateAt);
            linearLayout2.addView(textViewM574U12, AbstractC0260i5.m604d1());
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textViewM655t = AbstractC0260i5.m655t(context, "使用", false);
            textViewM655t.setClickable(true);
            textViewM655t.setFocusable(false);
            linearLayout.addView(textViewM655t, new LinearLayout.LayoutParams(AbstractC0260i5.m591a0(context, 56.0f), AbstractC0260i5.m591a0(context, 30.0f)));
            c0549y8 = new C0549y8(textViewM574U1, textViewM574U12, textViewM655t);
            linearLayout.setTag(c0549y8);
            view2 = linearLayout;
        } else {
            c0549y8 = (C0549y8) view.getTag();
            view2 = view;
        }
        C0026b9 c0026b9 = (C0026b9) this.f1142c.get(i);
        c0549y8.f1098a.setText(c0026b9.f66b);
        c0549y8.f1099b.setText(c0026b9.f67c);
        View.OnClickListener viewOnClickListenerC0478u1 = new ViewOnClickListenerC0478u1(this, c0026b9, 2);
        view2.setOnClickListener(viewOnClickListenerC0478u1);
        c0549y8.f1100c.setOnClickListener(viewOnClickListenerC0478u1);
        return view2;
    }
}
