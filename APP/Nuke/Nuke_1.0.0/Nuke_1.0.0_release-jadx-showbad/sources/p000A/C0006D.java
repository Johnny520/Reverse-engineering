package p000A;

import android.util.Log;
import java.util.Collection;
import me.dartcv.nuke.BuildConfig;
import p003A2.AbstractC0155b;
import p005A4.InterfaceC0162b;
import p011B4.AbstractC0231b;
import p031F2.C0452b;
import p056K2.C0887m;
import p056K2.C0891q;
import p095T.C1366i0;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p115X0.C1623A;
import p115X0.C1636k;
import p115X0.C1646u;
import p115X0.C1647v;
import p115X0.InterfaceC1641p;
import p117X2.AbstractC1665j;
import p117X2.C1671p;
import p117X2.C1672q;
import p117X2.C1675t;
import p149d3.AbstractC1983k;
import p203n.AbstractC2649d;
import p203n.C2647c;
import p203n.C2657h;
import p203n.C2661j;
import p227r.AbstractC2972W;
import p227r.C2981c0;
import p227r.C2996k;
import p227r.C3021w0;
import p227r.C3025y0;
import p275z2.C3516b;

/* JADX INFO: renamed from: A.D */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0006D implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f29d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f30e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f31f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f32g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f33h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0006D(Object obj, Object obj2, Object obj3, Object obj4, int i5) {
        this.f29d = i5;
        this.f30e = obj;
        this.f31f = obj2;
        this.f32g = obj3;
        this.f33h = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1h(Object obj) {
        int i5 = this.f29d;
        boolean zBooleanValue = true;
        C0891q c0891q = C0891q.f2780a;
        Object obj2 = this.f33h;
        Object obj3 = this.f32g;
        Object obj4 = this.f31f;
        Object obj5 = this.f30e;
        switch (i5) {
            case 0:
                C0078o0 c0078o0 = (C0078o0) obj5;
                C1647v c1647v = (C1647v) obj4;
                C1646u c1646u = (C1646u) obj3;
                C1636k c1636k = (C1636k) obj2;
                if (c0078o0.m121b()) {
                    C0038T0 c0038t0 = c0078o0.f340d;
                    C0012G c0012g = c0078o0.f358v;
                    C0012G c0012g2 = c0078o0.f359w;
                    C1675t c1675t = new C1675t();
                    C0075n c0075n = new C0075n(c0038t0, c0012g, c1675t);
                    InterfaceC1641p interfaceC1641p = c1647v.f5653a;
                    interfaceC1641p.mo1411a(c1646u, c1636k, c0075n, c0012g2);
                    C1623A c1623a = new C1623A(c1647v, interfaceC1641p);
                    c1647v.f5654b.set(c1623a);
                    c1675t.f5710e = c1623a;
                    c0078o0.f341e = c1623a;
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1603e interfaceC1603e = (InterfaceC1603e) obj4;
                C3516b c3516b = (C3516b) obj3;
                String str = (String) obj2;
                if ((obj5 instanceof Collection) && ((Collection) obj5).isEmpty()) {
                    obj5 = null;
                }
                if (obj5 != null) {
                    zBooleanValue = ((Boolean) interfaceC1603e.mo0g(obj5, obj)).booleanValue();
                    String strM227a = AbstractC0155b.m227a(obj5);
                    String strM3654Q = strM227a != null ? AbstractC1983k.m3654Q(strM227a.toString(), " (Kotlin reflection is not available)", "") : null;
                    String strM3654Q2 = obj != null ? AbstractC1983k.m3654Q(obj.toString(), " (Kotlin reflection is not available)", "") : null;
                    c3516b.getClass();
                    C0887m c0887m = C0452b.f1350a;
                    StringBuilder sbM405p = AbstractC0231b.m405p("[FILTER] [", zBooleanValue ? "HIT" : "MISS", "] ", str, ": ");
                    sbM405p.append(strM3654Q);
                    sbM405p.append(" [RESOLVED] ");
                    sbM405p.append(strM3654Q2);
                    String string = sbM405p.toString();
                    if (C0452b.f1353d.ordinal() <= 0) {
                        C0452b.f1352c.getClass();
                        if (((Boolean) C0452b.f1351b.getValue()).booleanValue()) {
                            Log.d("KavaRef", String.valueOf(string), null);
                        } else {
                            ((InterfaceC0162b) C0452b.f1350a.getValue()).mo235g(String.valueOf(string));
                        }
                    }
                }
                break;
            case 2:
                C2647c c2647c = (C2647c) obj5;
                C2661j c2661j = (C2661j) obj4;
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) obj3;
                C1671p c1671p = (C1671p) obj2;
                C2657h c2657h = (C2657h) obj;
                AbstractC2649d.m4619l(c2657h, c2647c.f8428c);
                C1366i0 c1366i0 = c2657h.f8469e;
                Object objM4602a = C2647c.m4602a(c2647c, c1366i0.getValue());
                if (!AbstractC1665j.m2981a(objM4602a, c1366i0.getValue())) {
                    c2647c.f8428c.f8478e.setValue(objM4602a);
                    c2661j.f8478e.setValue(objM4602a);
                    if (interfaceC1601c != null) {
                        interfaceC1601c.mo1h(c2647c);
                    }
                    c2657h.f8473i.setValue(Boolean.FALSE);
                    c2657h.f8468d.mo6a();
                    c1671p.f5705d = true;
                } else if (interfaceC1601c != null) {
                    interfaceC1601c.mo1h(c2647c);
                }
                break;
            case 3:
                C1672q c1672q = (C1672q) obj5;
                C2996k c2996k = (C2996k) obj2;
                C2657h c2657h2 = (C2657h) obj;
                float fFloatValue = ((Number) c2657h2.f8469e.getValue()).floatValue() - c1672q.f5706d;
                float fMo5202a = ((C3021w0) obj4).mo5202a(fFloatValue);
                c1672q.f5706d = ((Number) c2657h2.f8469e.getValue()).floatValue();
                ((C1672q) obj3).f5706d = ((Number) c2657h2.f8465a.f8460b.mo1h(c2657h2.f8470f)).floatValue();
                if (Math.abs(fFloatValue - fMo5202a) > 0.5f) {
                    c2657h2.f8473i.setValue(Boolean.FALSE);
                    c2657h2.f8468d.mo6a();
                }
                c2996k.getClass();
                break;
            default:
                C1672q c1672q2 = (C1672q) obj5;
                C2981c0 c2981c0 = (C2981c0) obj4;
                C3025y0 c3025y0 = (C3025y0) obj3;
                C0096x0 c0096x0 = (C0096x0) obj2;
                C2657h c2657h3 = (C2657h) obj;
                C1366i0 c1366i02 = c2657h3.f8469e;
                InterfaceC1599a interfaceC1599a = c2657h3.f8468d;
                C1366i0 c1366i03 = c2657h3.f8473i;
                float fFloatValue2 = ((Number) c1366i02.getValue()).floatValue() - c1672q2.f5706d;
                if (AbstractC2972W.m5170a(fFloatValue2)) {
                    if (((Boolean) c0096x0.mo1h(Float.valueOf(c1672q2.f5706d))).booleanValue()) {
                        c1366i03.setValue(Boolean.FALSE);
                        interfaceC1599a.mo6a();
                    }
                    break;
                } else if (!AbstractC2972W.m5170a(fFloatValue2 - c2981c0.m5187m(c3025y0, fFloatValue2))) {
                    c1366i03.setValue(Boolean.FALSE);
                    interfaceC1599a.mo6a();
                    break;
                } else {
                    c1672q2.f5706d += fFloatValue2;
                    if (((Boolean) c0096x0.mo1h(Float.valueOf(c1672q2.f5706d))).booleanValue()) {
                    }
                }
                break;
        }
        return c0891q;
    }
}
