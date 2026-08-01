package p146jd;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import gd.C2777r;
import p053dd.C1951c;
import p068ed.InterfaceC2214c;

/* JADX INFO: renamed from: jd.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3848m implements InterfaceC2214c {
    @Override // p068ed.InterfaceC2214c
    /* JADX INFO: renamed from: b */
    public void mo7977b(View view, C1951c c1951c) {
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            return;
        }
        View viewFindViewWithTag = viewGroup.findViewWithTag("fk_revoke_hint");
        if (viewFindViewWithTag != null) {
            viewGroup.removeView(viewFindViewWithTag);
        }
        if (C2777r.m9917s(c1951c.msgId)) {
            TextView textView = new TextView(view.getContext());
            textView.setTag("fk_revoke_hint");
            textView.setText("该消息已撤回");
            textView.setTextSize(15.0f);
            textView.setTextColor(-48060);
            textView.getPaint().setFakeBoldText(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            layoutParams.bottomMargin = m7979d(view, 4.0f);
            viewGroup.addView(textView, layoutParams);
        }
    }
}
