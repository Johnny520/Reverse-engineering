package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0860U0 extends AbstractC0817T0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2720a;

    public /* synthetic */ C0860U0(int r1) {
        this.f2720a = r1;
    }

    @Override // p000.AbstractC0817T0
    /* JADX INFO: renamed from: a */
    public final Intent mo1620a(Object r6) {
        switch(this.f2720a) {
            case 0: goto L17;
            case 1: goto L16;
            default: goto L4;
        };
    L4:
        C0372Il r62 = (C0372Il) r6;
        Intent r0 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent r1 = r62.f1297b;
        if (r1 == null) goto L11;
        Bundle r3 = r1.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        if (r3 == null) goto L11;
        r0.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", r3);
        r1.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        if (r1.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false) == false) goto L11;
        IntentSender r12 = r62.f1296a;
        int r2 = r62.f1299d;
        r62 = new C0372Il(r12, null, r62.f1298c, r2);
    L11:
        r0.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", r62);
        if (AbstractC2805zi.m5374G(2) == false) goto L14;
        r0.toString();
    L14:
        return r0;
    L17:
        Intent r02 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS");
        return r02.putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) r6);
    L16:
        return (Intent) r6;
    }

    @Override // p000.AbstractC0817T0
    /* JADX INFO: renamed from: b */
    public C0774S0 mo1621b(AbstractActivityC2148ki r5, Object r6) {
        switch(this.f2720a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        String[] r62 = (String[]) r6;
        if (r62.length == 0) goto L26;
        int r0 = r62.length;
        int r1 = 0;
        int r2 = 0;
    L10:
        if (r2 >= r0) goto L15;
        if (AbstractC0295Gu.m610c(r5, r62[r2]) != 0) goto L14;
        r2 = r2 + 1;
        goto L10
    L14:
        return null;
    L15:
        int r52 = AbstractC2598uq.m5109K(r62.length);
        if (r52 >= 16) goto L18;
        r52 = 16;
    L18:
        LinkedHashMap r02 = new LinkedHashMap(r52);
        int r53 = r62.length;
    L19:
        if (r1 >= r53) goto L22;
        r02.put(r62[r1], Boolean.TRUE);
        r1 = r1 + 1;
        goto L19
    L22:
        return new C0774S0(r02);
    L26:
        return new C0774S0(C0495Lf.f1620a);
    L5:
        return super.mo1621b(r5, r6);
    }

    @Override // p000.AbstractC0817T0
    /* JADX INFO: renamed from: c */
    public final Object mo1622c(Intent r6, int r7) {
        switch(this.f2720a) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new C0689Q0(r6, r7);
    L7:
        return new C0689Q0(r6, r7);
    L9:
        if (r7 != (-1)) goto L38;
        if (r6 == null) goto L38;
        String[] r72 = r6.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] r62 = r6.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (r62 == null) goto L38;
        if (r72 == null) goto L38;
        ArrayList r0 = new ArrayList(r62.length);
        int r1 = r62.length;
        int r2 = 0;
        int r3 = 0;
    L18:
        if (r3 >= r1) goto L24;
        if (r62[r3] != 0) goto L22;
        boolean r4 = true;
    L23:
        r0.add(Boolean.valueOf(r4));
        r3 = r3 + 1;
        goto L18
    L22:
        r4 = false;
        goto L23
    L24:
        ArrayList r63 = new ArrayList();
        int r12 = r72.length;
    L25:
        if (r2 >= r12) goto L30;
        String r32 = r72[r2];
        if (r32 == null) goto L29;
        r63.add(r32);
    L29:
        r2 = r2 + 1;
        goto L25
    L30:
        Iterator r73 = r63.iterator();
        Iterator r13 = r0.iterator();
        ArrayList r22 = new ArrayList(Math.min(AbstractC2539ta.m5019d0(r63, 10), AbstractC2539ta.m5019d0(r0, 10)));
    L32:
        if (r73.hasNext() == false) goto L47;
        if (r13.hasNext() == false) goto L47;
        r22.add(new C0208Et(r73.next(), r13.next()));
    L47:
        return AbstractC2598uq.m5111M(r22);
    L38:
        return C0495Lf.f1620a;
    }
}
