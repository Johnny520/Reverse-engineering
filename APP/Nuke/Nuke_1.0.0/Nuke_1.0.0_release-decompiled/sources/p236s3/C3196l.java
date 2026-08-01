package p236s3;

import com.bumptech.glide.AbstractC1924f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import me.dartcv.nuke.BuildConfig;
import p049I2.AbstractC0797o;
import p056K2.EnumC0880f;
import p061L2.C0981u;
import p061L2.C0982v;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p214o3.InterfaceC2798a;
import p225q3.C2936g;
import p225q3.InterfaceC2933d;

/* JADX INFO: renamed from: s3.l */
/* JADX INFO: loaded from: classes.dex */
public class C3196l implements InterfaceC2933d, InterfaceC3188d {

    /* JADX INFO: renamed from: a */
    public final String f9956a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3190f f9957b;

    /* JADX INFO: renamed from: c */
    public final int f9958c;

    /* JADX INFO: renamed from: d */
    public int f9959d = -1;

    /* JADX INFO: renamed from: e */
    public final String[] f9960e;

    /* JADX INFO: renamed from: f */
    public final List[] f9961f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f9962g;

    /* JADX INFO: renamed from: h */
    public Object f9963h;

    /* JADX INFO: renamed from: i */
    public final Object f9964i;

    /* JADX INFO: renamed from: j */
    public final Object f9965j;

    /* JADX INFO: renamed from: k */
    public final Object f9966k;

    public C3196l(String str, InterfaceC3190f interfaceC3190f, int i5) {
        this.f9956a = str;
        this.f9957b = interfaceC3190f;
        this.f9958c = i5;
        String[] strArr = new String[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            strArr[i6] = "[UNINITIALIZED]";
        }
        this.f9960e = strArr;
        int i7 = this.f9958c;
        this.f9961f = new List[i7];
        this.f9962g = new boolean[i7];
        this.f9963h = C0982v.f3048d;
        final int i8 = 0;
        InterfaceC1599a interfaceC1599a = new InterfaceC1599a(this) { // from class: s3.k

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C3196l f9955e;

            {
                this.f9955e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [K2.e, java.lang.Object] */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                ArrayList arrayList;
                switch (i8) {
                    case 0:
                        InterfaceC2798a[] interfaceC2798aArrMo1482a = this.f9955e.f9957b.mo1482a();
                        return interfaceC2798aArrMo1482a == null ? AbstractC3194j.f9953b : interfaceC2798aArrMo1482a;
                    case BuildConfig.VERSION_CODE /* 1 */:
                        InterfaceC2798a[] interfaceC2798aArrMo1485d = this.f9955e.f9957b.mo1485d();
                        if (interfaceC2798aArrMo1485d != null) {
                            arrayList = new ArrayList(interfaceC2798aArrMo1485d.length);
                            for (InterfaceC2798a interfaceC2798a : interfaceC2798aArrMo1485d) {
                                arrayList.add(interfaceC2798a.mo1486e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return AbstractC3194j.m5460b(arrayList);
                    default:
                        C3196l c3196l = this.f9955e;
                        return Integer.valueOf(AbstractC3194j.m5461c(c3196l, (InterfaceC2933d[]) c3196l.f9965j.getValue()));
                }
            }
        };
        EnumC0880f enumC0880f = EnumC0880f.f2766d;
        this.f9964i = AbstractC0797o.m1395t(enumC0880f, interfaceC1599a);
        final int i9 = 1;
        this.f9965j = AbstractC0797o.m1395t(enumC0880f, new InterfaceC1599a(this) { // from class: s3.k

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C3196l f9955e;

            {
                this.f9955e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [K2.e, java.lang.Object] */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                ArrayList arrayList;
                switch (i9) {
                    case 0:
                        InterfaceC2798a[] interfaceC2798aArrMo1482a = this.f9955e.f9957b.mo1482a();
                        return interfaceC2798aArrMo1482a == null ? AbstractC3194j.f9953b : interfaceC2798aArrMo1482a;
                    case BuildConfig.VERSION_CODE /* 1 */:
                        InterfaceC2798a[] interfaceC2798aArrMo1485d = this.f9955e.f9957b.mo1485d();
                        if (interfaceC2798aArrMo1485d != null) {
                            arrayList = new ArrayList(interfaceC2798aArrMo1485d.length);
                            for (InterfaceC2798a interfaceC2798a : interfaceC2798aArrMo1485d) {
                                arrayList.add(interfaceC2798a.mo1486e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return AbstractC3194j.m5460b(arrayList);
                    default:
                        C3196l c3196l = this.f9955e;
                        return Integer.valueOf(AbstractC3194j.m5461c(c3196l, (InterfaceC2933d[]) c3196l.f9965j.getValue()));
                }
            }
        });
        final int i10 = 2;
        this.f9966k = AbstractC0797o.m1395t(enumC0880f, new InterfaceC1599a(this) { // from class: s3.k

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C3196l f9955e;

            {
                this.f9955e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [K2.e, java.lang.Object] */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                ArrayList arrayList;
                switch (i10) {
                    case 0:
                        InterfaceC2798a[] interfaceC2798aArrMo1482a = this.f9955e.f9957b.mo1482a();
                        return interfaceC2798aArrMo1482a == null ? AbstractC3194j.f9953b : interfaceC2798aArrMo1482a;
                    case BuildConfig.VERSION_CODE /* 1 */:
                        InterfaceC2798a[] interfaceC2798aArrMo1485d = this.f9955e.f9957b.mo1485d();
                        if (interfaceC2798aArrMo1485d != null) {
                            arrayList = new ArrayList(interfaceC2798aArrMo1485d.length);
                            for (InterfaceC2798a interfaceC2798a : interfaceC2798aArrMo1485d) {
                                arrayList.add(interfaceC2798a.mo1486e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return AbstractC3194j.m5460b(arrayList);
                    default:
                        C3196l c3196l = this.f9955e;
                        return Integer.valueOf(AbstractC3194j.m5461c(c3196l, (InterfaceC2933d[]) c3196l.f9965j.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: a */
    public final int mo5130a(String str) {
        AbstractC1665j.m2985e(str, "name");
        Integer num = (Integer) this.f9963h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: b */
    public final String mo5131b() {
        return this.f9956a;
    }

    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: c */
    public final AbstractC1924f mo5132c() {
        return C2936g.f9256h;
    }

    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: d */
    public final int mo5133d() {
        return this.f9958c;
    }

    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: e */
    public final String mo5134e(int i5) {
        return this.f9960e[i5];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [K2.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [K2.e, java.lang.Object] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3196l) {
            InterfaceC2933d interfaceC2933d = (InterfaceC2933d) obj;
            if (this.f9956a.equals(interfaceC2933d.mo5131b()) && Arrays.equals((InterfaceC2933d[]) this.f9965j.getValue(), (InterfaceC2933d[]) ((C3196l) obj).f9965j.getValue())) {
                int iMo5133d = interfaceC2933d.mo5133d();
                int i5 = this.f9958c;
                if (i5 == iMo5133d) {
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (AbstractC1665j.m2981a(mo5138j(i6).mo5131b(), interfaceC2933d.mo5138j(i6).mo5131b()) && AbstractC1665j.m2981a(mo5138j(i6).mo5132c(), interfaceC2933d.mo5138j(i6).mo5132c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p236s3.InterfaceC3188d
    /* JADX INFO: renamed from: g */
    public final Set mo5458g() {
        return this.f9963h.keySet();
    }

    @Override // p225q3.InterfaceC2933d
    public final List getAnnotations() {
        return C0981u.f3047d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [K2.e, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f9966k.getValue()).intValue();
    }

    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: i */
    public final List mo5137i(int i5) {
        List list = this.f9961f[i5];
        return list == null ? C0981u.f3047d : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [K2.e, java.lang.Object] */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: j */
    public final InterfaceC2933d mo5138j(int i5) {
        return ((InterfaceC2798a[]) this.f9964i.getValue())[i5].mo1486e();
    }

    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: k */
    public final boolean mo5139k(int i5) {
        return this.f9962g[i5];
    }

    /* JADX INFO: renamed from: l */
    public final void m5464l(String str, boolean z5) {
        int i5 = this.f9959d + 1;
        this.f9959d = i5;
        String[] strArr = this.f9960e;
        strArr[i5] = str;
        this.f9962g[i5] = z5;
        this.f9961f[i5] = null;
        if (i5 == this.f9958c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                map.put(strArr[i6], Integer.valueOf(i6));
            }
            this.f9963h = map;
        }
    }

    public final String toString() {
        return AbstractC3194j.m5463e(this);
    }
}
