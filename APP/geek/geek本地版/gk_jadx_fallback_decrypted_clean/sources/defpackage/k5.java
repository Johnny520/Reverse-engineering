package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class k5 extends defpackage.m5 {
    public k5() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.m5
    public void a(android.text.StaticLayout.Builder r3, android.widget.TextView r4) {
            r2 = this;
            java.lang.String r0 = "getTextDirectionHeuristic"
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            java.lang.Object r4 = defpackage.n5.e(r4, r0, r1)
            android.text.TextDirectionHeuristic r4 = (android.text.TextDirectionHeuristic) r4
            r3.setTextDirection(r4)
            return
    }
}
