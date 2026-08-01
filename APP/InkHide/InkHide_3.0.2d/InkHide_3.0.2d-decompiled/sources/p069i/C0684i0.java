package p069i;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: i.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0684i0 extends C0681h0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.C0681h0, p069i.AbstractC0687j0
    /* JADX INFO: renamed from: a */
    public void mo1306a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractC0687j0
    /* JADX INFO: renamed from: b */
    public boolean mo1307b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
