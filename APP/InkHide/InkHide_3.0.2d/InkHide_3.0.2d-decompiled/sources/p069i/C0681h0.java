package p069i;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: renamed from: i.h0 */
/* JADX INFO: loaded from: classes.dex */
public class C0681h0 extends AbstractC0687j0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractC0687j0
    /* JADX INFO: renamed from: a */
    public void mo1306a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C0690k0.m1314e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }
}
