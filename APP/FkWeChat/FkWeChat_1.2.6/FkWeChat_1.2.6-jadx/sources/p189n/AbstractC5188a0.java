package p189n;

import p121i3.C3173c;
import p219p.EnumC5898w0;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: n.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5188a0 {
    /* JADX INFO: renamed from: a */
    public static final void m21278a(long j10, EnumC5898w0 enumC5898w0) {
        if (enumC5898w0 == EnumC5898w0.f18786q) {
            if (C3173c.m11972k(j10) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC6635e.m26320c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (C3173c.m11973l(j10) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC6635e.m26320c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }
}
