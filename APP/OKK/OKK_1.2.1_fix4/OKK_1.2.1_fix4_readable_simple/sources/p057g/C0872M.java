package p057g;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: renamed from: g.M */
/* JADX INFO: loaded from: classes.dex */
public class C0872M extends AbstractC0876O {
    public C0872M() {
    }

    @Override // p057g.AbstractC0876O
    /* JADX INFO: renamed from: a */
    public void mo2194a(StaticLayout.Builder r3, TextView r4) {
        r3.setTextDirection((TextDirectionHeuristic) C0878P.m2202e(r4, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }
}
