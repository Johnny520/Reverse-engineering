package p006D;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.abc.core.features.InputStatsDatabase;
import com.abc.core.features.MessageDetailHook;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p009E0.AbstractC0181l;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: D.u */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0129u implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f318a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f319b;

    public /* synthetic */ RunnableC0129u(View r1, int r2) {
        this.f318a = r2;
        this.f319b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f318a) {
            case 0: goto L23;
            case 1: goto L21;
            case 2: goto L19;
            default: goto L4;
        };
    L4:
        View r02 = this.f319b;
        AbstractC0307g.m703e(r02, "$footer");
        InputStatsDatabase r1 = InputStatsDatabase.f1818a;
        InputStatsDatabase.m1474b(r02);
        EditText r03 = InputStatsDatabase.m1476d(r02);
        if (r03 == null) goto L7;
        InputStatsDatabase.m1473a(r03);
    L7:
        Set r04 = InputStatsDatabase.f1823f;
        monitor-enter(r04);
        List r12 = AbstractC0181l.m553y0(r04);     // Catch: Throwable -> L16
        monitor-exit(r04);
        Iterator r05 = r12.iterator();
    L13:
        if (r05.hasNext() == false) goto L15;
        View r13 = (View) r05.next();
        InputStatsDatabase r2 = InputStatsDatabase.f1818a;
        InputStatsDatabase.m1473a(r13);
        goto L13
    L15:
        return;
    L16:
        th = move-exception;
        throw th;
    L19:
        View r06 = this.f319b;
        AbstractC0307g.m703e(r06, "$view");
        MessageDetailHook r14 = MessageDetailHook.f1967a;
        MessageDetailHook.m1581f0(r06);
        return;
    L21:
        View r07 = this.f319b;
        AbstractC0307g.m703e(r07, "$view");
        MessageDetailHook r15 = MessageDetailHook.f1967a;
        MessageDetailHook.m1581f0(r07);
        return;
    L23:
        View r08 = this.f319b;
        ((InputMethodManager) r08.getContext().getSystemService("input_method")).showSoftInput(r08, 0);
    }
}
