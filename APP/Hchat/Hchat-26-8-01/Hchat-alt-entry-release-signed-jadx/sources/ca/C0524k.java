package ca;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p051db.C0765c;
import p063e9.C0846q;
import p069f.C0925b0;
import p085fg.InterfaceC1231l;
import p109hb.C1697t;
import p117i0.C1829f1;
import p117i0.C1892x;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p154k9.C2366j;
import p174m.EnumC2640p1;
import p190n2.C2891z;
import p218og.AbstractC3149m;
import p222p.C3207c1;
import p222p.C3213e1;
import p222p.C3267x;
import p230p8.C3348c;
import p230p8.C3370v;
import p266s0.C3875e;
import p276sf.C3967n;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p304uf.C4329c;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4418p0;
import p308v1.InterfaceC4428t;
import p321w.AbstractC4634s;
import p321w.C4609j1;
import p321w.C4614l0;
import p321w.C4618m1;
import p322w0.InterfaceC4670u;
import p332wb.AbstractC4955ho;
import p332wb.C5026jv;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: ca.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0524k implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1622g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1623h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1624i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1625j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1626k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0524k(SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f1622g = 8;
        this.f1625j = i9;
        this.f1623h = context;
        this.f1624i = sharedPreferences;
        this.f1626k = interfaceC1809a1;
    }

    /* JADX DEBUG: Class process forced to load method for inline: v1.a1.B(v1.a1, v1.b1, int, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int i9 = this.f1622g;
        int i10 = 0;
        int i11 = this.f1625j;
        C3967n c3967n = C3967n.f12976a;
        Object obj2 = this.f1626k;
        Object obj3 = this.f1624i;
        Object obj4 = this.f1623h;
        switch (i9) {
            case 0:
                C0517e0 c0517e0 = (C0517e0) obj4;
                Activity activity = (Activity) obj3;
                List list = (List) obj;
                list.getClass();
                c0517e0.m1526k(activity, (C3370v) obj2, "群发助手", new C0524k(c0517e0, activity, list, this.f1625j, 2));
                break;
            case 1:
                C0517e0 c0517e02 = (C0517e0) obj4;
                Activity activity2 = (Activity) obj3;
                C1697t c1697t = (C1697t) obj2;
                List list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5026jv) it.next()).f18249a);
                }
                c0517e02.m1529o(activity2, c1697t, arrayList, this.f1625j, "群发助手");
                break;
            case 2:
                C0517e0 c0517e03 = (C0517e0) obj4;
                Activity activity3 = (Activity) obj3;
                List list3 = (List) obj2;
                C3348c c3348c = (C3348c) obj;
                c3348c.getClass();
                C4329c c4329cM7064a = c3348c.m7064a();
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list3));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C5026jv) it2.next()).f18249a);
                }
                c0517e03.m1528n(activity3, c4329cM7064a, arrayList2, this.f1625j, "群发助手");
                break;
            case 3:
                C3875e c3875e = (C3875e) obj3;
                C0925b0 c0925b0 = (C0925b0) obj2;
                if (obj == ((C1892x) obj4)) {
                    C2104o.m5276A("A derived state calculation cannot read itself");
                } else if (obj instanceof InterfaceC4670u) {
                    int i12 = c3875e.f12724a - i11;
                    int iM2270d = c0925b0.m2270d(obj);
                    c0925b0.m2273g(Math.min(i12, iM2270d >= 0 ? c0925b0.f2896c[iM2270d] : Integer.MAX_VALUE), obj);
                }
                break;
            case 4:
                AbstractC4377b1[] abstractC4377b1Arr = (AbstractC4377b1[]) obj4;
                C3213e1 c3213e1 = (C3213e1) obj3;
                int[] iArr = (int[]) obj2;
                AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
                int length = abstractC4377b1Arr.length;
                int i13 = 0;
                while (i10 < length) {
                    AbstractC4377b1 abstractC4377b1 = abstractC4377b1Arr[i10];
                    int i14 = i13 + 1;
                    abstractC4377b1.getClass();
                    Object objMo8824X = abstractC4377b1.mo8824X();
                    C3207c1 c3207c1 = objMo8824X instanceof C3207c1 ? (C3207c1) objMo8824X : null;
                    C3267x c3267x = c3207c1 != null ? c3207c1.f10245c : null;
                    abstractC4374a1.m8816A(abstractC4377b1, iArr[i13], c3267x != null ? c3267x.f10409a.m10546a(abstractC4377b1.f14594h, i11) : c3213e1.f10265b.m10546a(abstractC4377b1.f14594h, i11), 0.0f);
                    i10++;
                    i13 = i14;
                }
                break;
            case 5:
                C4614l0 c4614l0 = (C4614l0) obj4;
                InterfaceC4418p0 interfaceC4418p0 = (InterfaceC4418p0) obj3;
                AbstractC4377b1 abstractC4377b12 = (AbstractC4377b1) obj2;
                AbstractC4374a1 abstractC4374a12 = (AbstractC4374a1) obj;
                int i15 = c4614l0.f15227b;
                C4609j1 c4609j1 = c4614l0.f15226a;
                C2891z c2891z = c4614l0.f15228c;
                C4618m1 c4618m1 = (C4618m1) c4614l0.f15229d.invoke();
                c4609j1.m9033a(EnumC2640p1.f8623h, AbstractC4634s.m9068k(abstractC4374a12, i15, c2891z, c4618m1 != null ? c4618m1.f15293a : null, interfaceC4418p0.getLayoutDirection() == EnumC4243m.f13920h, abstractC4377b12.f14593g), i11, abstractC4377b12.f14593g);
                AbstractC4374a1.m8811E(abstractC4374a12, abstractC4377b12, Math.round(-c4609j1.f15206a.m4488g()), 0);
                break;
            case 6:
                C1829f1 c1829f1 = (C1829f1) obj3;
                C1829f1 c1829f12 = (C1829f1) obj2;
                ((InterfaceC4428t) obj).getClass();
                c1829f1.m4489h((int) (r1.mo8858F() >> 32));
                float fM4488g = (c1829f1.m4488g() - ((InterfaceC4233c) obj4).mo1601x0(8)) / i11;
                if (fM4488g < 0.0f) {
                    fM4488g = 0.0f;
                }
                c1829f12.m4489h(fM4488g);
                break;
            case 7:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1((List) interfaceC1809a1.getValue());
                arrayListM8409R1.set(i11, C2366j.m5671a((C2366j) obj3, null, null, null, null, null, zBooleanValue, 63));
                AbstractC4955ho.m9455V0((Context) obj2, interfaceC1809a1, arrayListM8409R1);
                break;
            case 8:
                Context context = (Context) obj4;
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) obj2;
                String strM2123h = (String) obj;
                strM2123h.getClass();
                if (!AbstractC3149m.m6721t0(strM2123h)) {
                    if (i11 == 1) {
                        AtomicBoolean atomicBoolean = C0846q.f2580a;
                        strM2123h = C0846q.m2123h(context, strM2123h);
                    }
                    interfaceC1809a12.setValue(strM2123h);
                    sharedPreferences.edit().putInt("hb_notify_sound_mode", i11).putString("hb_notify_sound_uri", strM2123h).apply();
                }
                break;
            default:
                Long l10 = (Long) obj;
                l10.getClass();
                ArrayList arrayList3 = new ArrayList((List) obj4);
                arrayList3.set(i11, l10);
                ((InterfaceC1231l) obj3).invoke(AbstractC4955ho.m9637p7((C0765c) obj2, arrayList3));
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C0524k(Object obj, int i9, Object obj2, Object obj3, int i10) {
        this.f1622g = i10;
        this.f1623h = obj;
        this.f1625j = i9;
        this.f1624i = obj2;
        this.f1626k = obj3;
    }

    public /* synthetic */ C0524k(Object obj, Object obj2, Object obj3, int i9, int i10) {
        this.f1622g = i10;
        this.f1623h = obj;
        this.f1624i = obj2;
        this.f1626k = obj3;
        this.f1625j = i9;
    }

    public /* synthetic */ C0524k(AbstractC4377b1[] abstractC4377b1Arr, C3213e1 c3213e1, int i9, int[] iArr) {
        this.f1622g = 4;
        this.f1623h = abstractC4377b1Arr;
        this.f1624i = c3213e1;
        this.f1625j = i9;
        this.f1626k = iArr;
    }
}
