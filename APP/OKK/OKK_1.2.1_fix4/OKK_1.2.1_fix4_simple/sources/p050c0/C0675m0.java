package p050c0;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.luckypray.dexkit.C1031R;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0675m0 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2102b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0678n0 f2103c;

    public C0675m0(int r1) {
        this.f2102b = r1;
        switch(r1) {
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        this.f2103c = C0678n0.f2116a;
        return;
    L6:
        this.f2103c = C0678n0.f2116a;
        return;
    L8:
        this.f2103c = C0678n0.f2116a;
        return;
    L10:
        this.f2103c = C0678n0.f2116a;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b r3) {
        switch(this.f2102b) {
            case 3: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C0678n0 r02 = this.f2103c;
        r02.getClass();
        if (C0678n0.m1725p() == false) goto L16;
        Object r32 = r3.f2669b;
        if ((r32 instanceof Menu) == false) goto L11;
        Menu r33 = (Menu) r32;
    L12:
        if (r33 == null) goto L17;
        C0678n0.m1713b(r02, r33);
        return;
    L17:
        return;
    L11:
        r33 = null;
        goto L12
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b r12) {
        String r1 = null;
        String r13 = null;
        MenuItem r14 = null;
        switch(this.f2102b) {
            case 0: goto L84;
            case 1: goto L63;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        return;
    L63:
        this.f2103c.getClass();
        if (C0678n0.m1725p() == false) goto L127;
        Object r02 = r12.f2669b;
        if ((r02 instanceof MenuItem) == false) goto L69;
        r14 = (MenuItem) r02;
    L69:
        if (r14 != null) goto L72;
        return;
    L72:
        if (r14.getItemId() != 1212368196) goto L129;
        WeakReference r03 = C0678n0.f2131p;
        if (r03 == null) goto L126;
        TextView r04 = (TextView) r03.get();
        if (r04 == null) goto L130;
        this.f2103c.getClass();
        if (C0678n0.m1723n(r04) == false) goto L131;
        this.f2103c.getClass();
        C0678n0.m1709A(r04);
        r12.m1946c(Boolean.TRUE);
        return;
    L131:
        return;
    L130:
        return;
    L126:
        return;
    L129:
        return;
    L127:
        return;
    L84:
        this.f2103c.getClass();
        if (C0678n0.m1725p() == false) goto L132;
        Object r122 = r12.f2669b;
        if ((r122 instanceof View) == false) goto L90;
        View r123 = (View) r122;
    L91:
        if (r123 != null) goto L94;
        return;
    L94:
        if (C0678n0.m1714c(r123) == false) goto L134;
        TextView r2 = C0678n0.m1712a(this.f2103c, r123);
        if (r2 == null) goto L135;
        this.f2103c.getClass();
        C0678n0.f2130o = C0678n0.m1730u(r123, r2);
        C0678n0.f2131p = new WeakReference(r2);
        C0666j0 r124 = C0678n0.f2130o;
        if (r124 == null) goto L103;
        String r125 = r124.f2068b;
        if (r125 == null) goto L103;
    L104:
        C0678n0.f2132q = r125;
        C0678n0.f2133r = System.currentTimeMillis();
        C0678n0 r126 = this.f2103c;
        String r3 = r2.getClass().getName();
        C0678n0 r4 = this.f2103c;
        CharSequence r22 = r2.getText();
        if (r22 == null) goto L107;
        r1 = r22.toString();
    L107:
        if (r1 != null) goto L109;
        r1 = "";
    L109:
        r4.getClass();
        String r05 = "long press target=" + r3 + " text=" + AbstractC0425j.m1021Z0(AbstractC0433r.m1032G0(r1, '\n', ' '), 32);
        r126.getClass();
        C0678n0.m1711C(r05);
        return;
    L103:
        this.f2103c.getClass();
        r125 = C0678n0.m1734y(r2);
        goto L104
    L135:
        return;
    L134:
        return;
    L90:
        r123 = null;
        goto L91
    L132:
        return;
    L6:
        if (C0678n0.f2129n == true) goto L114;
        this.f2103c.getClass();
        if (C0678n0.m1725p() == false) goto L116;
        ConcurrentHashMap r23 = C0678n0.f2122g;
        if (r23.isEmpty() == true) goto L13;
    L15:
        Object r32 = r12.f2669b;
        if ((r32 instanceof TextView) == false) goto L18;
        TextView r33 = (TextView) r32;
    L19:
        if (r33 != null) goto L22;
        return;
    L22:
        if (AbstractC0307g.m699a(r33.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) == false) goto L25;
        return;
    L25:
        if (C0678n0.m1714c(r33) == false) goto L120;
        Object[] r42 = r12.f2670c;
        AbstractC0307g.m702d(r42, "args");
        Object r43 = AbstractC0179j.m537n0(0, r42);
        if (r43 == null) goto L115;
        String r44 = r43.toString();
        if (r44 == null) goto L121;
        String r6 = (String) C0678n0.f2121f.get(r44);
        long r7 = 0;
        if (r6 != null) goto L53;
        C0678n0 r62 = this.f2103c;
        if (r23.isEmpty() == true) goto L122;
        r62.getClass();
        Object r63 = r33;
        int r24 = 0;
    L38:
        if (r24 >= 10) goto L44;
        if ((r63 instanceof View) == false) goto L42;
        View r64 = (View) r63;
    L43:
        if (r64 == null) goto L44;
        C0678n0 r9 = C0678n0.f2116a;
        C0666j0 r92 = C0678n0.m1730u(r64, r33);
        if (r92 != null) goto L47;
        r24 = r24 + 1;
        r63 = r64.getParent();
        goto L38
    L47:
        long r93 = r92.f2067a;
    L50:
        if (r93 <= 0) goto L52;
        r13 = (String) C0678n0.f2122g.get(Long.valueOf(r93));
    L52:
        r6 = r13;
        r7 = r93;
        goto L53
    L42:
        r64 = null;
    L44:
        r93 = 0;
        goto L50
    L122:
        return;
    L53:
        if (r6 == null) goto L123;
        this.f2103c.getClass();
        if (C0678n0.m1726q(r33) == true) goto L59;
        return;
    L59:
        if (r6.equals(r44) == true) goto L125;
        r12.f2670c[0] = r6;
        C0678n0 r127 = this.f2103c;
        String r06 = "rebind edited text msgId=" + r7 + " len=" + r44.length() + "->" + r6.length();
        r127.getClass();
        C0678n0.m1711C(r06);
        return;
    L125:
        return;
    L123:
        return;
    L121:
        return;
    L115:
        return;
    L120:
        return;
    L18:
        r33 = null;
        goto L19
    L13:
        if (C0678n0.f2121f.isEmpty() == false) goto L15;
        return;
    L116:
        return;
    }
}
