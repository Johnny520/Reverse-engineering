package p332wb;

import ac.AbstractC0063p;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p051db.C0763a;
import p051db.C0765c;
import p085fg.InterfaceC1231l;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import tf.AbstractC4156d0;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: renamed from: wb.rg */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5275rg implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20456g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f20457h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0765c f20458i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5275rg(C0765c c0765c, InterfaceC1231l interfaceC1231l) {
        this.f20456g = 5;
        this.f20458i = c0765c;
        this.f20457h = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Set set;
        int i9;
        int iIntValue;
        switch (this.f20456g) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Integer numM6741e0 = AbstractC3156t.m6741e0(10, str);
                this.f20457h.invoke(C0765c.m1980a(this.f20458i, 0, null, null, null, null, 0L, 0, null, numM6741e0 != null ? AbstractC3754e0.m7909r(numM6741e0.intValue(), 0, 3600) : 0, 0, false, null, 0L, 0, 0, null, 0, 0, null, 0, null, 4193791));
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                Integer numM6741e02 = AbstractC3156t.m6741e0(10, str2);
                this.f20457h.invoke(C0765c.m1980a(this.f20458i, 0, null, null, null, null, 0L, 0, null, 0, numM6741e02 != null ? AbstractC3754e0.m7909r(numM6741e02.intValue(), 0, 3600) : 0, false, null, 0L, 0, 0, null, 0, 0, null, 0, null, 4193279));
                break;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                Integer numM6741e03 = AbstractC3156t.m6741e0(10, str3);
                int iIntValue2 = numM6741e03 != null ? numM6741e03.intValue() : 0;
                Integer numValueOf = Integer.valueOf(iIntValue2);
                if (iIntValue2 < 0 || iIntValue2 >= 5) {
                    numValueOf = null;
                }
                this.f20457h.invoke(C0765c.m1980a(this.f20458i, 0, null, null, null, null, 0L, 0, null, 0, 0, false, null, 0L, 0, 0, null, 0, numValueOf != null ? numValueOf.intValue() : 0, null, 0, null, 3932159));
                break;
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                C0765c c0765c = this.f20458i;
                List list = c0765c.f2307t;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((C0763a) obj2).f2286a != 0) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.add(0, new C0763a(0, str4));
                this.f20457h.invoke(C0765c.m1980a(c0765c, 0, null, null, null, null, 0L, 0, null, 0, 0, false, null, 0L, 0, 0, null, 0, 0, arrayList2, 0, null, 3670015));
                break;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                Integer numM6741e04 = AbstractC3156t.m6741e0(10, str5);
                int iIntValue3 = numM6741e04 != null ? numM6741e04.intValue() : 0;
                C0765c c0765c2 = this.f20458i;
                if (iIntValue3 == 2) {
                    Set setM404N = c0765c2.f2296i;
                    if (setM404N.isEmpty()) {
                        setM404N = AbstractC0063p.m404N(2);
                    }
                    set = setM404N;
                } else {
                    set = C4175v.f13712g;
                }
                this.f20457h.invoke(C0765c.m1980a(c0765c2, 0, null, null, null, null, 0L, iIntValue3, set, 0, 0, false, null, 0L, 0, 0, null, 0, 0, null, 0, null, 4193919));
                break;
            case 5:
                Integer num = (Integer) obj;
                num.getClass();
                C0765c c0765c3 = this.f20458i;
                boolean zContains = c0765c3.f2296i.contains(num);
                Set set2 = c0765c3.f2296i;
                this.f20457h.invoke(C0765c.m1980a(c0765c3, 0, null, null, null, null, 0L, 0, zContains ? AbstractC4156d0.m8351S(set2, num) : AbstractC4156d0.m8354V(set2, num), 0, 0, false, null, 0L, 0, 0, null, 0, 0, null, 0, null, 4194047));
                break;
            case 6:
                this.f20457h.invoke(C0765c.m1980a(this.f20458i, 0, null, null, null, null, 0L, 0, null, 0, 0, ((Boolean) obj).booleanValue(), null, 0L, 0, 0, null, 0, 0, null, 0, null, 4192255));
                break;
            case 7:
                String str6 = (String) obj;
                str6.getClass();
                Integer numM6741e05 = AbstractC3156t.m6741e0(10, str6);
                this.f20457h.invoke(C0765c.m1980a(this.f20458i, 0, null, null, null, null, 0L, 0, null, numM6741e05 != null ? AbstractC3754e0.m7909r(numM6741e05.intValue(), 0, 3600) : 0, 0, false, null, 0L, 0, 0, null, 0, 0, null, 0, null, 4193791));
                break;
            case 8:
                String str7 = (String) obj;
                str7.getClass();
                Integer numM6741e06 = AbstractC3156t.m6741e0(10, str7);
                this.f20457h.invoke(C0765c.m1980a(this.f20458i, 0, null, null, null, null, 0L, 0, null, 0, numM6741e06 != null ? AbstractC3754e0.m7909r(numM6741e06.intValue(), 0, 3600) : 0, false, null, 0L, 0, 0, null, 0, 0, null, 0, null, 4193279));
                break;
            case 9:
                String str8 = (String) obj;
                str8.getClass();
                this.f20457h.invoke(C0765c.m1980a(this.f20458i, 0, null, null, null, null, 0L, 0, null, 0, 0, false, null, 0L, 0, 0, str8, 0, 0, null, 0, null, 4128767));
                break;
            case 10:
                String str9 = (String) obj;
                str9.getClass();
                Integer numM6741e07 = AbstractC3156t.m6741e0(10, str9);
                int i10 = 0;
                int iIntValue4 = numM6741e07 != null ? numM6741e07.intValue() : 0;
                Integer numValueOf2 = Integer.valueOf(iIntValue4);
                if (iIntValue4 != 0 && iIntValue4 != 1) {
                    numValueOf2 = null;
                }
                int iIntValue5 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                C0765c c0765cM1980a = this.f20458i;
                if (iIntValue5 != c0765cM1980a.f2305r) {
                    if (iIntValue5 == 0) {
                        c0765cM1980a = C0765c.m1980a(c0765cM1980a, 0, null, null, null, null, 0L, 0, null, 0, 0, false, null, 0L, 0, 0, null, iIntValue5, 0, null, 0, null, 4063231);
                    } else {
                        int i11 = iIntValue5;
                        boolean zM6721t0 = AbstractC3149m.m6721t0(AbstractC4955ho.m9477X6(c0765cM1980a));
                        boolean zIsEmpty = AbstractC4955ho.m9469W6(c0765cM1980a, 1).isEmpty();
                        boolean zIsEmpty2 = AbstractC4955ho.m9469W6(c0765cM1980a, 2).isEmpty();
                        if (!zM6721t0 && !zIsEmpty) {
                            i9 = 1;
                        } else if (zM6721t0 || zIsEmpty2) {
                            if (!zIsEmpty) {
                                i10 = 3;
                            } else if (!zIsEmpty2) {
                                i10 = 4;
                            }
                            i9 = i10;
                        } else {
                            i9 = 2;
                        }
                        c0765cM1980a = C0765c.m1980a(c0765cM1980a, 0, null, null, null, C4173t.f13710g, 0L, 0, null, 0, 0, false, null, 0L, 0, 0, null, i11, i9, null, 0, null, 2752479);
                    }
                }
                this.f20457h.invoke(c0765cM1980a);
                break;
            default:
                String str10 = (String) obj;
                str10.getClass();
                Integer numM6741e08 = AbstractC3156t.m6741e0(10, str10);
                if (numM6741e08 == null) {
                    iIntValue = 0;
                    C0765c c0765c4 = this.f20458i;
                    this.f20457h.invoke(C0765c.m1980a(c0765c4, 0, null, null, null, iIntValue != c0765c4.f2308u ? c0765c4.f2293f : C4173t.f13710g, 0L, 0, null, 0, 0, false, null, 0L, 0, 0, null, 0, 0, null, iIntValue, null, 3145695));
                } else {
                    int iIntValue6 = numM6741e08.intValue();
                    if (iIntValue6 != 0 && iIntValue6 != 1) {
                        numM6741e08 = null;
                    }
                    if (numM6741e08 != null) {
                        iIntValue = numM6741e08.intValue();
                    }
                    C0765c c0765c42 = this.f20458i;
                    this.f20457h.invoke(C0765c.m1980a(c0765c42, 0, null, null, null, iIntValue != c0765c42.f2308u ? c0765c42.f2293f : C4173t.f13710g, 0L, 0, null, 0, 0, false, null, 0L, 0, 0, null, 0, 0, null, iIntValue, null, 3145695));
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5275rg(int i9, C0765c c0765c, InterfaceC1231l interfaceC1231l) {
        this.f20456g = i9;
        this.f20457h = interfaceC1231l;
        this.f20458i = c0765c;
    }
}
