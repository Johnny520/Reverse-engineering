package p146jd;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p053dd.C1951c;
import p068ed.InterfaceC2214c;

/* JADX INFO: renamed from: jd.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3843h implements InterfaceC2214c {
    @Override // p068ed.InterfaceC2214c
    /* JADX INFO: renamed from: b */
    public void mo7977b(View view, C1951c c1951c) {
        LinearLayout linearLayout;
        boolean z10 = getBoolean("msg_show_time", false);
        boolean z11 = getBoolean("hide_self_avatar", false);
        boolean z12 = getBoolean("hide_friend_avatar", false);
        View viewM7978c = m7978c("MaskLayout", view);
        if (viewM7978c == null) {
            viewM7978c = m7978c("ChattingAvatarImageView", view);
        }
        if (viewM7978c == null) {
            return;
        }
        int i10 = c1951c.isSend;
        boolean z13 = (i10 == 1 && z11) || (i10 == 0 && z12);
        if (!z10 || z13 || viewM7978c.getVisibility() != 0) {
            m15278f(viewM7978c);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) viewM7978c.getParent();
        if (viewGroup == null) {
            return;
        }
        if (viewGroup.getTag() == null || !viewGroup.getTag().equals("avatar_time_wrapper")) {
            LinearLayout linearLayout2 = new LinearLayout(view.getContext());
            linearLayout2.setTag("avatar_time_wrapper");
            linearLayout2.setOrientation(1);
            linearLayout2.setGravity(1);
            int id2 = viewM7978c.getId();
            ViewGroup.LayoutParams layoutParams = viewM7978c.getLayoutParams();
            int iIndexOfChild = viewGroup.indexOfChild(viewM7978c);
            if (id2 != -1) {
                linearLayout2.setId(id2);
                viewM7978c.setId(View.generateViewId());
            }
            viewGroup.removeView(viewM7978c);
            linearLayout2.addView(viewM7978c, new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height));
            viewGroup.addView(linearLayout2, iIndexOfChild, layoutParams);
            linearLayout2.getLayoutParams().height = -2;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (viewGroup.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewGroup.getParent()).setClipChildren(false);
            }
            linearLayout = linearLayout2;
        } else {
            linearLayout = (LinearLayout) viewGroup;
        }
        linearLayout.setVisibility(0);
        TextView textView = (TextView) linearLayout.findViewWithTag("msg_time");
        if (textView == null) {
            textView = new TextView(view.getContext());
            textView.setTag("msg_time");
            textView.getPaint().setFakeBoldText(true);
            textView.setGravity(17);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = m7979d(view, 0.0f);
            linearLayout.addView(textView, layoutParams2);
        }
        textView.setTextSize(getInt("msg_time_text_size", 6));
        try {
            textView.setTextColor(Color.parseColor(getString("msg_time_text_color", "#FF8D8D8D")));
        } catch (Exception unused) {
            textView.setTextColor(-7500403);
        }
        textView.setText(m15277e(c1951c.createTime));
        textView.setVisibility(0);
    }

    /* JADX INFO: renamed from: e */
    public final String m15277e(long j10) {
        return new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(j10));
    }

    /* JADX INFO: renamed from: f */
    public final void m15278f(View view) {
        View view2 = (View) view.getParent();
        if ((view2 instanceof LinearLayout) && "avatar_time_wrapper".equals(view2.getTag())) {
            View viewFindViewWithTag = view2.findViewWithTag("msg_time");
            if (viewFindViewWithTag != null) {
                viewFindViewWithTag.setVisibility(8);
            }
            if (view.getVisibility() != 0) {
                view2.setVisibility(view.getVisibility());
            }
        }
    }
}
