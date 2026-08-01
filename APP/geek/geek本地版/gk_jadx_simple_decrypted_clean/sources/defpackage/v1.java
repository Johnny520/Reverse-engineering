package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends ff {
    public final /* synthetic */ int A;

    public /* synthetic */ v1(int r1) {
        this.A = r1;
    }

    @Override // defpackage.ff
    public final Object D(int r6, Intent r7) {
        switch(this.A) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new u1(r6, r7);
    L7:
        return new u1(r6, r7);
    L9:
        if (r6 != (-1)) goto L38;
        if (r7 == null) goto L38;
        String[] r62 = r7.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] r72 = r7.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (r72 == null) goto L38;
        if (r62 == null) goto L38;
        ArrayList r0 = new ArrayList(r72.length);
        int r1 = r72.length;
        int r2 = 0;
        int r3 = 0;
    L18:
        if (r3 >= r1) goto L24;
        if (r72[r3] != 0) goto L22;
        boolean r4 = true;
    L23:
        r0.add(Boolean.valueOf(r4));
        r3 = r3 + 1;
        goto L18
    L22:
        r4 = false;
        goto L23
    L24:
        ArrayList r73 = new ArrayList();
        int r12 = r62.length;
    L25:
        if (r2 >= r12) goto L30;
        String r32 = r62[r2];
        if (r32 == null) goto L29;
        r73.add(r32);
    L29:
        r2 = r2 + 1;
        goto L25
    L30:
        Iterator r63 = r73.iterator();
        Iterator r13 = r0.iterator();
        ArrayList r22 = new ArrayList(Math.min(cb.h0(r73), cb.h0(r0)));
    L32:
        if (r63.hasNext() == false) goto L47;
        if (r13.hasNext() == false) goto L47;
        r22.add(new kx(r63.next(), r13.next()));
    L47:
        return dt.A(r22);
    L38:
        return zi.a;
    }
}
