package defpackage;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class k5 extends m5 {
    public k5() {
    }

    @Override // defpackage.m5
    public void a(StaticLayout.Builder r3, TextView r4) {
        r3.setTextDirection((TextDirectionHeuristic) n5.e(r4, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
