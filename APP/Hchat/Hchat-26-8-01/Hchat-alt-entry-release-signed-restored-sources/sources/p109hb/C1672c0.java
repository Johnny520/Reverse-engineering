package p109hb;

import android.app.Activity;
import android.text.Layout;
import androidx.lifecycle.C0119x;
import gg.C1422r;
import gg.C1423s;
import gg.C1425u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p036c9.C0423c0;
import p036c9.C0446i;
import p057e1.C0808c;
import p058e2.C0817g;
import p071f1.C1003g;
import p071f1.C1017n;
import p085fg.InterfaceC1231l;
import p101h1.C1565b;
import p101h1.InterfaceC1567d;
import p119i2.AbstractC1923e0;
import p119i2.C1914a;
import p119i2.C1939m0;
import p119i2.C1947r;
import p133j2.C2061k;
import p144k.C2209s1;
import p172lg.C2563c;
import p172lg.C2564d;
import p204o2.AbstractC3042a;
import p276sf.C3958e;
import p276sf.C3967n;
import p332wb.C5491y2;
import p339x1.C5610h0;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4175v;

/* JADX INFO: renamed from: hb.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1672c0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5524g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f5525h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5526i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f5527j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5528k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1672c0(long j3, float[] fArr, C1423s c1423s, C1422r c1422r) {
        this.f5525h = j3;
        this.f5526i = fArr;
        this.f5527j = c1423s;
        this.f5528k = c1422r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        float[] fArr;
        long j3;
        C1914a c1914a;
        int i9;
        float fM2064a;
        float fM2064a2;
        switch (this.f5524g) {
            case 0:
                C0423c0 c0423c0 = (C0423c0) this.f5526i;
                C1684i0 c1684i0 = (C1684i0) this.f5527j;
                Activity activity = (Activity) this.f5528k;
                int iIntValue = ((Integer) obj).intValue();
                C4175v c4175v = C4175v.f13712g;
                if (iIntValue == 1) {
                    c0423c0.invoke(1, c4175v);
                } else if (iIntValue != 2) {
                    c0423c0.invoke(0, c4175v);
                } else {
                    c1684i0.getClass();
                    List listM101y0 = AbstractC0000a.m101y0(new C3958e(2, "周一"), new C3958e(3, "周二"), new C3958e(4, "周三"), new C3958e(5, "周四"), new C3958e(6, "周五"), new C3958e(7, "周六"), new C3958e(1, "周日"));
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(this.f5525h);
                    int i10 = calendar.get(7);
                    C2564d c2564dM45X = AbstractC0000a.m45X(listM101y0);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c2564dM45X.iterator();
                    while (true) {
                        C2563c c2563c = (C2563c) it;
                        if (c2563c.f8317i) {
                            Object next = c2563c.next();
                            if (((Number) ((C3958e) listM101y0.get(((Number) next).intValue())).f12961g).intValue() == i10) {
                                arrayList.add(next);
                            }
                        } else {
                            Set setM8412U1 = AbstractC4166m.m8412U1(arrayList);
                            ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(listM101y0));
                            Iterator it2 = listM101y0.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(new C3958e(((C3958e) it2.next()).f12962h, HttpUrl.FRAGMENT_ENCODE_SET));
                            }
                            C5491y2.m9818Z1(activity, "选择重复日期", HttpUrl.FRAGMENT_ENCODE_SET, arrayList2, setM8412U1, new C0446i(c0423c0, listM101y0), new C2209s1(7), 288);
                        }
                    }
                }
                return C3967n.f12976a;
            case 1:
                float[] fArr2 = (float[]) this.f5526i;
                C1423s c1423s = (C1423s) this.f5527j;
                C1422r c1422r = (C1422r) this.f5528k;
                C1947r c1947r = (C1947r) obj;
                int i11 = c1947r.f6597b;
                C1914a c1914a2 = c1947r.f6596a;
                int iM4815e = c1947r.f6598c;
                long j4 = this.f5525h;
                int iM4816f = i11 > C1939m0.m4816f(j4) ? c1947r.f6597b : C1939m0.m4816f(j4);
                if (iM4815e >= C1939m0.m4815e(j4)) {
                    iM4815e = C1939m0.m4815e(j4);
                }
                long jM4784b = AbstractC1923e0.m4784b(c1947r.m4838d(iM4816f), c1947r.m4838d(iM4815e));
                int i12 = c1423s.f4736g;
                C2061k c2061k = c1914a2.f6459d;
                int iM4816f2 = C1939m0.m4816f(jM4784b);
                int iM4815e2 = C1939m0.m4815e(jM4784b);
                Layout layout = c2061k.f6920f;
                int length = layout.getText().length();
                if (iM4816f2 < 0) {
                    AbstractC3042a.m6486a("startOffset must be > 0");
                }
                if (iM4816f2 >= length) {
                    AbstractC3042a.m6486a("startOffset must be less than text length");
                }
                if (iM4815e2 <= iM4816f2) {
                    AbstractC3042a.m6486a("endOffset must be greater than startOffset");
                }
                if (iM4815e2 > length) {
                    AbstractC3042a.m6486a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i12 < (iM4815e2 - iM4816f2) * 4) {
                    AbstractC3042a.m6486a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iM4816f2);
                int lineForOffset2 = layout.getLineForOffset(iM4815e2 - 1);
                C0817g c0817g = new C0817g(c2061k);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        fArr = fArr2;
                        int iM5114f = c2061k.m5114f(lineForOffset);
                        int iMax = Math.max(iM4816f2, lineStart);
                        int iMin = Math.min(iM4815e2, iM5114f);
                        float fM5115g = c2061k.m5115g(lineForOffset);
                        float fM5113e = c2061k.m5113e(lineForOffset);
                        j3 = jM4784b;
                        c1914a = c1914a2;
                        boolean z9 = false;
                        boolean z10 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z10 || zIsRtlCharAt) {
                                if (z10 && zIsRtlCharAt) {
                                    z9 = false;
                                    float fM2064a3 = c0817g.m2064a(iMax, false, false, false);
                                    i9 = iMin;
                                    fM2064a = c0817g.m2064a(iMax + 1, true, true, false);
                                    fM2064a2 = fM2064a3;
                                } else {
                                    i9 = iMin;
                                    z9 = false;
                                    if (z10 || !zIsRtlCharAt) {
                                        fM2064a = c0817g.m2064a(iMax, false, false, false);
                                        fM2064a2 = c0817g.m2064a(iMax + 1, true, true, false);
                                    } else {
                                        fM2064a2 = c0817g.m2064a(iMax, false, false, true);
                                        fM2064a = c0817g.m2064a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i12] = fM2064a;
                                fArr[i12 + 1] = fM5115g;
                                fArr[i12 + 2] = fM2064a2;
                                fArr[i12 + 3] = fM5113e;
                                i12 += 4;
                                iMax++;
                                iMin = i9;
                            } else {
                                fM2064a = c0817g.m2064a(iMax, z9, z9, true);
                                i9 = iMin;
                                fM2064a2 = c0817g.m2064a(iMax + 1, true, true, true);
                            }
                            z9 = false;
                            fArr[i12] = fM2064a;
                            fArr[i12 + 1] = fM5115g;
                            fArr[i12 + 2] = fM2064a2;
                            fArr[i12 + 3] = fM5113e;
                            i12 += 4;
                            iMax++;
                            iMin = i9;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            c1914a2 = c1914a;
                            fArr2 = fArr;
                            jM4784b = j3;
                        }
                    }
                } else {
                    fArr = fArr2;
                    j3 = jM4784b;
                    c1914a = c1914a2;
                }
                int iM4814d = (C1939m0.m4814d(j3) * 4) + c1423s.f4736g;
                for (int i13 = c1423s.f4736g; i13 < iM4814d; i13 += 4) {
                    int i14 = i13 + 1;
                    float f3 = fArr[i14];
                    float f10 = c1422r.f4735g;
                    fArr[i14] = f3 + f10;
                    int i15 = i13 + 3;
                    fArr[i15] = fArr[i15] + f10;
                }
                c1423s.f4736g = iM4814d;
                c1422r.f4735g = c1914a.m4767b() + c1422r.f4735g;
                break;
            default:
                C0808c c0808c = (C0808c) this.f5526i;
                C1425u c1425u = (C1425u) this.f5527j;
                long j5 = this.f5525h;
                C1017n c1017n = (C1017n) this.f5528k;
                C5610h0 c5610h0 = (C5610h0) obj;
                c5610h0.m10064e();
                float f11 = c0808c.f2416a;
                float f12 = c0808c.f2417b;
                C1565b c1565b = c5610h0.f22833g;
                ((C0119x) c1565b.f5220h.f469a).m598c0(f11, f12);
                try {
                    InterfaceC1567d.m4085U0(c5610h0, (C1003g) c1425u.f4738g, j5, 0L, 0.0f, c1017n, 0, 890);
                } finally {
                    ((C0119x) c1565b.f5220h.f469a).m598c0(-f11, -f12);
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C1672c0(C0423c0 c0423c0, C1684i0 c1684i0, Activity activity, long j3) {
        this.f5526i = c0423c0;
        this.f5527j = c1684i0;
        this.f5528k = activity;
        this.f5525h = j3;
    }

    public /* synthetic */ C1672c0(C0808c c0808c, C1425u c1425u, long j3, C1017n c1017n) {
        this.f5526i = c0808c;
        this.f5527j = c1425u;
        this.f5525h = j3;
        this.f5528k = c1017n;
    }
}
