package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rl {
    public final /* synthetic */ int a;
    public final /* synthetic */ yl b;

    public /* synthetic */ rl(yl r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    public final void a(Object r5) {
        switch(this.a) {
            case 0: goto L27;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        u1 r52 = (u1) r5;
        yl r0 = this.b;
        vl r1 = (vl) r0.w.pollFirst();
        if (r1 != null) goto L7;
        Log.w("FragmentManager", "No Activities were started for result for " + this);
        return;
    L7:
        String r3 = r1.a;
        int r12 = r1.b;
        ml r02 = r0.c.h(r3);
        if (r02 != null) goto L10;
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + r3);
        return;
    L10:
        r02.k(r12, r52.a, r52.b);
        return;
    L12:
        Map r53 = (Map) r5;
        String[] r03 = (String[]) r53.keySet().toArray(new String[0]);
        ArrayList r04 = new ArrayList(r53.values());
        int[] r54 = new int[r04.size()];
        int r2 = 0;
    L14:
        if (r2 >= r04.size()) goto L20;
        if (((Boolean) r04.get(r2)).booleanValue() == false) goto L18;
        int r32 = 0;
    L19:
        r54[r2] = r32;
        r2 = r2 + 1;
        goto L14
    L18:
        r32 = -1;
        goto L19
    L20:
        yl r55 = this.b;
        vl r05 = (vl) r55.w.pollFirst();
        if (r05 != null) goto L23;
        Log.w("FragmentManager", "No permissions were requested for " + this);
        return;
    L23:
        String r06 = r05.a;
        if (r55.c.h(r06) != null) goto L41;
        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + r06);
        return;
    L41:
        return;
    L27:
        u1 r56 = (u1) r5;
        yl r07 = this.b;
        vl r13 = (vl) r07.w.pollFirst();
        if (r13 != null) goto L30;
        Log.w("FragmentManager", "No IntentSenders were started for " + this);
        return;
    L30:
        String r33 = r13.a;
        int r14 = r13.b;
        ml r08 = r07.c.h(r33);
        if (r08 != null) goto L33;
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + r33);
        return;
    L33:
        r08.k(r14, r56.a, r56.b);
    }
}
