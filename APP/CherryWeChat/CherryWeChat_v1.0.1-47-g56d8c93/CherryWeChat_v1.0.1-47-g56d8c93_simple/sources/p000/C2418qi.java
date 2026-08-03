package p000;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: qi */
/* JADX INFO: loaded from: classes.dex */
public final class C2418qi implements InterfaceC0731R0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8476a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC2805zi f8477b;

    public /* synthetic */ C2418qi(AbstractC2805zi r1, int r2) {
        this.f8476a = r2;
        this.f8477b = r1;
    }

    @Override // p000.InterfaceC0731R0
    /* JADX INFO: renamed from: a */
    public final void mo1524a(Object r5) {
        switch(this.f8476a) {
            case 0: goto L24;
            case 1: goto L14;
            default: goto L4;
        };
    L4:
        C0689Q0 r52 = (C0689Q0) r5;
        AbstractC2805zi r0 = this.f8477b;
        C2676wi r1 = (C2676wi) r0.f9481D.pollFirst();
        if (r1 == null) goto L41;
        AbstractComponentCallbacksC1503hi r02 = r0.f9494c.m4877o(r1.f9236a);
        if (r02 == null) goto L42;
        int r12 = r52.f2217a;
        Intent r53 = r52.f2218b;
        if (AbstractC2805zi.m5374G(2) == false) goto L40;
        r02.toString();
        Objects.toString(r53);
        return;
    L40:
        return;
    L42:
        return;
    L41:
        return;
    L14:
        C0689Q0 r54 = (C0689Q0) r5;
        AbstractC2805zi r03 = this.f8477b;
        C2676wi r13 = (C2676wi) r03.f9481D.pollLast();
        if (r13 == null) goto L44;
        AbstractComponentCallbacksC1503hi r04 = r03.f9494c.m4877o(r13.f9236a);
        if (r04 == null) goto L45;
        int r14 = r54.f2217a;
        Intent r55 = r54.f2218b;
        if (AbstractC2805zi.m5374G(2) == false) goto L43;
        r04.toString();
        Objects.toString(r55);
        return;
    L43:
        return;
    L45:
        return;
    L44:
        return;
    L24:
        Map r56 = (Map) r5;
        String[] r05 = (String[]) r56.keySet().toArray(new String[0]);
        ArrayList r06 = new ArrayList(r56.values());
        int[] r57 = new int[r06.size()];
        int r2 = 0;
    L26:
        if (r2 >= r06.size()) goto L32;
        if (((Boolean) r06.get(r2)).booleanValue() == false) goto L30;
        int r3 = 0;
    L31:
        r57[r2] = r3;
        r2 = r2 + 1;
        goto L26
    L30:
        r3 = -1;
        goto L31
    L32:
        AbstractC2805zi r58 = this.f8477b;
        C2676wi r07 = (C2676wi) r58.f9481D.pollFirst();
        if (r07 == null) goto L46;
        r58.f9494c.m4877o(r07.f9236a);
        return;
    }
}
