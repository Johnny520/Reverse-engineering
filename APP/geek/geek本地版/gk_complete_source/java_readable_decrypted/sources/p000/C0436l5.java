package p000;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: l5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0436l5 extends C0399k5 {
    @Override // p000.C0399k5, p000.AbstractC0473m5
    /* JADX INFO: renamed from: a */
    public void mo1622a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p000.AbstractC0473m5
    /* JADX INFO: renamed from: b */
    public boolean mo1743b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
