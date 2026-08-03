package p000;

import android.content.Context;
import android.util.Base64;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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

    public C1361eF(Context context) {
        super(context, null);
        this.f4865c = Collections.EMPTY_LIST;
        this.f4866d = C0737R6.f2350e;
        this.f4867e = 0.0533f;
        C0695Q6 c0695q6 = new C0695Q6(context, 0);
        this.f4863a = c0695q6;
        C1318dF c1318dF = new C1318dF(context, null);
        this.f4864b = c1318dF;
        c1318dF.setBackgroundColor(0);
        addView(c0695q6);
        addView(c1318dF);
    }

    @Override // p000.InterfaceC0257Fz
    /* JADX INFO: renamed from: a */
    public final void mo538a(List list, C0737R6 c0737r6, float f, float f2) {
        this.f4866d = c0737r6;
        this.f4867e = f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list.size() > 0) {
            list.get(0).getClass();
            throw new ClassCastException();
        }
        if (!this.f4865c.isEmpty() || !arrayList2.isEmpty()) {
            this.f4865c = arrayList2;
            m2642b();
        }
        this.f4863a.mo538a(arrayList, c0737r6, f, f2);
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final void m2642b() {
        String str;
        StringBuilder sb = new StringBuilder();
        String strM2541V = AbstractC1293cr.m2541V(this.f4866d.f2351a);
        float f = this.f4867e;
        getHeight();
        float height = f == -3.4028235E38f ? -3.4028235E38f : f * ((getHeight() - getPaddingTop()) - getPaddingBottom());
        String strConcat = "unset";
        if (height == -3.4028235E38f) {
            str = "unset";
        } else {
            Object[] objArr = {Float.valueOf(height / getContext().getResources().getDisplayMetrics().density)};
            int i = AbstractC2665wD.f9229a;
            str = String.format(Locale.US, "%.2fpx", objArr);
        }
        Float fValueOf = Float.valueOf(1.2f);
        C0737R6 c0737r6 = this.f4866d;
        int i2 = c0737r6.f2353c;
        int i3 = c0737r6.f2354d;
        if (i2 == 1) {
            Object[] objArr2 = {AbstractC1293cr.m2541V(i3)};
            int i4 = AbstractC2665wD.f9229a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i2 == 2) {
            String strM2541V2 = AbstractC1293cr.m2541V(i3);
            int i5 = AbstractC2665wD.f9229a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strM2541V2);
        } else if (i2 == 3) {
            String strM2541V3 = AbstractC1293cr.m2541V(i3);
            int i6 = AbstractC2665wD.f9229a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strM2541V3);
        } else if (i2 == 4) {
            String strM2541V4 = AbstractC1293cr.m2541V(i3);
            int i7 = AbstractC2665wD.f9229a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strM2541V4);
        }
        Object[] objArr3 = {strM2541V, str, fValueOf, strConcat};
        int i8 = AbstractC2665wD.f9229a;
        sb.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap map = new HashMap();
        map.put(".default_bg,.default_bg *", "background-color:" + AbstractC1293cr.m2541V(this.f4866d.f2352b) + ";");
        if (this.f4865c.size() > 0) {
            this.f4865c.get(0).getClass();
            throw new ClassCastException();
        }
        sb.append("</div></body></html>");
        StringBuilder sb2 = new StringBuilder("<html><head><style>");
        for (String str2 : map.keySet()) {
            sb2.append(str2);
            sb2.append("{");
            sb2.append((String) map.get(str2));
            sb2.append("}");
        }
        sb2.append("</style></head>");
        sb.insert(0, sb2.toString());
        this.f4864b.loadData(Base64.encodeToString(sb.toString().getBytes(AbstractC2702x7.f9276a), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.f4865c.isEmpty()) {
            return;
        }
        m2642b();
    }
}
