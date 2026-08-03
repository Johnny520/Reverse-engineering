package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: renamed from: My */
/* JADX INFO: loaded from: classes.dex */
public final class C0557My {

    /* JADX INFO: renamed from: a */
    public int f1825a;

    /* JADX INFO: renamed from: b */
    public int f1826b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC1503hi f1827c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f1828d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f1829e;

    /* JADX INFO: renamed from: f */
    public boolean f1830f;

    /* JADX INFO: renamed from: g */
    public boolean f1831g;

    /* JADX INFO: renamed from: h */
    public final C0326Hi f1832h;

    public C0557My(int r2, int r3, C0326Hi r4, C0609O6 r5) {
        AbstractComponentCallbacksC1503hi r0 = r4.f1110c;
        this.f1825a = r2;
        this.f1826b = r3;
        this.f1827c = r0;
        this.f1828d = new ArrayList();
        this.f1829e = new LinkedHashSet();
        r5.m1188a(new C2464rl(3, this));
        this.f1832h = r4;
    }

    /* JADX INFO: renamed from: a */
    public final void m1097a() {
        LinkedHashSet r0 = this.f1829e;
        if (this.f1830f == true) goto L43;
        this.f1830f = true;
        if (r0.isEmpty() == false) goto L9;
        m1098b();
        return;
    L9:
        Iterator r02 = new LinkedHashSet(r0).iterator();
    L11:
        if (r02.hasNext() == false) goto L58;
        C0609O6 r2 = (C0609O6) r02.next();
        monitor-enter(r2);
        if (r2.f1951a == true) goto L16;
        r2.f1951a = true;     // Catch: Throwable -> L18
        r2.f1953c = true;     // Catch: Throwable -> L18
        InterfaceC0566N6 r3 = r2.f1952b;     // Catch: Throwable -> L18
        monitor-exit(r2);     // Catch: Throwable -> L18
        if (r3 != null) goto L44;
    L34:
        monitor-enter(r2);
        r2.f1953c = false;     // Catch: Throwable -> L38
        r2.notifyAll();     // Catch: Throwable -> L38
        monitor-exit(r2);     // Catch: Throwable -> L38
    L38:
        th = move-exception;
        throw th;
    L44:
        r3.onCancel();     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        monitor-enter(r2);
        r2.f1953c = false;     // Catch: Throwable -> L31
        r2.notifyAll();     // Catch: Throwable -> L31
        throw th;
    L31:
        th = move-exception;
        throw th;
    L16:
        monitor-exit(r2);     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;
    L58:
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m1098b() {
        if (this.f1831g == false) goto L6;
    L12:
        this.f1832h.m704k();
        return;
    L6:
        if (AbstractC2805zi.m5374G(2) == false) goto L8;
        toString();
    L8:
        this.f1831g = true;
        Iterator r0 = this.f1828d.iterator();
    L10:
        if (r0.hasNext() == false) goto L12;
        ((Runnable) r0.next()).run();
        goto L10
    }

    /* JADX INFO: renamed from: c */
    public final void m1099c(int r4, int r5) {
        int r52 = AbstractC0213Ey.m424v(r5);
        AbstractComponentCallbacksC1503hi r0 = this.f1827c;
        if (r52 == 0) goto L20;
        if (r52 == 1) goto L13;
        if (r52 == 2) goto L8;
        return;
    L8:
        if (AbstractC2805zi.m5374G(2) == false) goto L10;
        Objects.toString(r0);
    L10:
        this.f1825a = 1;
        this.f1826b = 3;
        return;
    L13:
        if (this.f1825a == 1) goto L15;
        return;
    L15:
        if (AbstractC2805zi.m5374G(2) == false) goto L17;
        Objects.toString(r0);
    L17:
        this.f1825a = 2;
        this.f1826b = 2;
        return;
    L20:
        if (this.f1825a != 1) goto L22;
        return;
    L22:
        if (AbstractC2805zi.m5374G(2) == false) goto L34;
        Objects.toString(r0);
        if (r4 == 1) goto L34;
        if (r4 == 2) goto L34;
        if (r4 == 3) goto L34;
        if (r4 == 4) goto L34;
        throw null;
    L34:
        this.f1825a = r4;
    }

    /* JADX INFO: renamed from: d */
    public final void m1100d() {
        int r0 = this.f1826b;
        C0326Hi r2 = this.f1832h;
        if (r0 != 2) goto L24;
        AbstractComponentCallbacksC1503hi r02 = r2.f1110c;
        View r3 = r02.f5296E.findFocus();
        if (r3 == null) goto L9;
        r02.m2868b().f5007k = r3;
        if (AbstractC2805zi.m5374G(2) == false) goto L9;
        r3.toString();
        r02.toString();
    L9:
        View r1 = this.f1827c.m2879z();
        if (r1.getParent() != null) goto L13;
        r2.m695b();
        r1.setAlpha(0.0f);
    L13:
        if (r1.getAlpha() == 0.0f) goto L15;
    L17:
        C1415fi r03 = r02.f5299H;
        if (r03 != null) goto L20;
        float r04 = 1.0f;
    L21:
        r1.setAlpha(r04);
        return;
    L20:
        r04 = r03.f5006j;
        goto L21
    L15:
        if (r1.getVisibility() != 0) goto L17;
        r1.setVisibility(4);
        goto L17
    L24:
        if (r0 != 3) goto L30;
        AbstractComponentCallbacksC1503hi r05 = r2.f1110c;
        View r22 = r05.m2879z();
        if (AbstractC2805zi.m5374G(2) == false) goto L28;
        Objects.toString(r22.findFocus());
        r22.toString();
        r05.toString();
    L28:
        r22.clearFocus();
        return;
    }

    public final String toString() {
        String r0 = Integer.toHexString(System.identityHashCode(this));
        StringBuilder r1 = new StringBuilder("Operation {");
        r1.append(r0);
        r1.append("} {finalState = ");
        int r02 = this.f1825a;
        if (r02 != 1) goto L5;
        String r03 = "REMOVED";
    L15:
        r1.append(r03);
        r1.append(" lifecycleImpact = ");
        int r04 = this.f1826b;
        if (r04 != 1) goto L18;
        String r05 = "NONE";
    L25:
        r1.append(r05);
        r1.append(" fragment = ");
        r1.append(this.f1827c);
        r1.append('}');
        return r1.toString();
    L18:
        if (r04 != 2) goto L20;
        r05 = "ADDING";
        goto L25
    L20:
        if (r04 == 3) goto L22;
        r05 = "null";
        goto L25
    L22:
        r05 = "REMOVING";
        goto L25
    L5:
        if (r02 != 2) goto L7;
        r03 = "VISIBLE";
        goto L15
    L7:
        if (r02 != 3) goto L9;
        r03 = "GONE";
        goto L15
    L9:
        if (r02 == 4) goto L11;
        r03 = "null";
        goto L15
    L11:
        r03 = "INVISIBLE";
        goto L15
    }
}
