package p000;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: renamed from: k5 */
/* JADX INFO: loaded from: classes.dex */
public class C0399k5 extends AbstractC0473m5 {
    @Override // p000.AbstractC0473m5
    /* JADX INFO: renamed from: a */
    public void mo1649a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C0510n5.m1918e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
