package p000;

import android.content.Context;
import android.util.Base64;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: eF */
/* JADX INFO: loaded from: classes.dex */
public final class C1361eF extends FrameLayout implements InterfaceC0257Fz {

    /* JADX INFO: renamed from: a */
    public final C0695Q6 f4863a;

    /* JADX INFO: renamed from: b */
    public final C1318dF f4864b;

    /* JADX INFO: renamed from: c */
    public List f4865c;

    /* JADX INFO: renamed from: d */
    public C0737R6 f4866d;

    /* JADX INFO: renamed from: e */
    public float f4867e;

    public C1361eF(Context r5) {
        super(r5, null);
        this.f4865c = Collections.EMPTY_LIST;
        this.f4866d = C0737R6.f2350e;
        this.f4867e = 0.0533f;
        C0695Q6 r1 = new C0695Q6(r5, 0);
        this.f4863a = r1;
        C1318dF r3 = new C1318dF(r5, null);
        this.f4864b = r3;
        r3.setBackgroundColor(0);
        addView(r1);
        addView(r3);
    }

    @Override // p000.InterfaceC0257Fz
    /* JADX INFO: renamed from: a */
    public final void mo538a(List r4, C0737R6 r5, float r6, float r7) {
        this.f4866d = r5;
        this.f4867e = r6;
        ArrayList r0 = new ArrayList();
        ArrayList r1 = new ArrayList();
        if (r4.size() <= 0) goto L5;
        r4.get(0).getClass();
        throw new ClassCastException();
    L5:
        if (this.f4865c.isEmpty() == true) goto L7;
    L8:
        this.f4865c = r1;
        m2642b();
    L9:
        this.f4863a.mo538a(r0, r5, r6, r7);
        invalidate();
        return;
    L7:
        if (r1.isEmpty() == true) goto L9;
        goto L8
    }

    /* JADX INFO: renamed from: b */
    public final void m2642b() {
        StringBuilder r0 = new StringBuilder();
        String r1 = AbstractC1293cr.m2541V(this.f4866d.f2351a);
        float r2 = this.f4867e;
        getHeight();
        int r3 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (r2 != (-3.4028235E38f)) goto L5;
        float r22 = -3.4028235E38f;
    L6:
        String r4 = "unset";
        if (r22 != (-3.4028235E38f)) goto L9;
        String r23 = "unset";
    L10:
        Float r32 = Float.valueOf(1.2f);
        C0737R6 r5 = this.f4866d;
        int r6 = r5.f2353c;
        int r52 = r5.f2354d;
        if (r6 != 1) goto L13;
        Object[] r42 = {AbstractC1293cr.m2541V(r52)};
        int r53 = AbstractC2665wD.f9229a;
        r4 = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", r42);
    L23:
        Object[] r12 = {r1, r23, r32, r4};
        int r24 = AbstractC2665wD.f9229a;
        r0.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", r12));
        HashMap r13 = new HashMap();
        r13.put(".default_bg,.default_bg *", "background-color:" + AbstractC1293cr.m2541V(this.f4866d.f2352b) + ";");
        if (this.f4865c.size() > 0) goto L31;
        r0.append("</div></body></html>");
        StringBuilder r25 = new StringBuilder("<html><head><style>");
        Iterator r43 = r13.keySet().iterator();
    L27:
        if (r43.hasNext() == false) goto L29;
        String r54 = (String) r43.next();
        r25.append(r54);
        r25.append("{");
        r25.append((String) r13.get(r54));
        r25.append("}");
        goto L27
    L29:
        r25.append("</style></head>");
        r0.insert(0, r25.toString());
        this.f4864b.loadData(Base64.encodeToString(r0.toString().getBytes(AbstractC2702x7.f9276a), 1), "text/html", "base64");
        return;
    L31:
        this.f4865c.get(0).getClass();
        throw new ClassCastException();
    L13:
        if (r6 != 2) goto L15;
        String r44 = AbstractC1293cr.m2541V(r52);
        int r55 = AbstractC2665wD.f9229a;
        Locale r56 = Locale.US;
        r4 = "0.1em 0.12em 0.15em ".concat(r44);
        goto L23
    L15:
        if (r6 != 3) goto L17;
        String r45 = AbstractC1293cr.m2541V(r52);
        int r57 = AbstractC2665wD.f9229a;
        Locale r58 = Locale.US;
        r4 = "0.06em 0.08em 0.15em ".concat(r45);
        goto L23
    L17:
        if (r6 != 4) goto L23;
        String r46 = AbstractC1293cr.m2541V(r52);
        int r59 = AbstractC2665wD.f9229a;
        Locale r510 = Locale.US;
        r4 = "-0.05em -0.05em 0.15em ".concat(r46);
        goto L23
    L9:
        Object[] r26 = {Float.valueOf(r22 / getContext().getResources().getDisplayMetrics().density)};
        int r33 = AbstractC2665wD.f9229a;
        r23 = String.format(Locale.US, "%.2fpx", r26);
        goto L10
    L5:
        r22 = r2 * r3;
        goto L6
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        if (r1 == true) goto L5;
        return;
    L5:
        if (this.f4865c.isEmpty() == true) goto L9;
        m2642b();
        return;
    }
}
