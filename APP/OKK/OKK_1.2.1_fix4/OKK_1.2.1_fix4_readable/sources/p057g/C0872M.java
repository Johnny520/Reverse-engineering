package p057g;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: renamed from: g.M */
/* JADX INFO: loaded from: classes.dex */
public class C0872M extends AbstractC0876O {
    @Override // p057g.AbstractC0876O
    /* JADX INFO: renamed from: a */
    public void mo2194a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C0878P.m2202e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }
}
