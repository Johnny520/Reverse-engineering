package p096w0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p003B0.AbstractC0055a;
import p009E0.C0103c;
import p079n0.AbstractC0774b;
import p079n0.C0773a;

/* JADX INFO: renamed from: w0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1032a extends AbstractC0774b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p079n0.AbstractC0774b
    /* JADX INFO: renamed from: a */
    public final void mo1429a(C0773a c0773a, int i2, ViewGroup viewGroup) {
        View view = c0773a.f2594a;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            C0103c c0103c = (C0103c) this.f2596b.get(i2);
            textView.setText(c0103c != null ? (String) c0103c.f395b : null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p079n0.AbstractC0774b
    /* JADX INFO: renamed from: b */
    public final C0773a mo1430b(ViewGroup viewGroup) {
        TextView textView = new TextView(viewGroup.getContext());
        int iM101b = AbstractC0055a.m101b(4);
        textView.setPadding(iM101b, iM101b, iM101b, iM101b);
        C0773a c0773a = new C0773a();
        c0773a.f2594a = textView;
        return c0773a;
    }
}
