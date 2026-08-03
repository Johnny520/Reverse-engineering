package p332wb;

import android.view.ViewGroup;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import p007a7.AbstractC0018a;
import p036c9.C0415a0;
import p036c9.C0505z;
import p063e9.C0832c;
import p085fg.InterfaceC1231l;
import p136j8.AbstractC2091b;
import p218og.C3147k;
import p255r4.C3683m;
import p276sf.C3958e;
import p304uf.C4330d;
import p317vb.InterfaceC4544a;
import p351xe.AbstractC5795p;
import p351xe.C5793n;
import p366ya.C6015e;
import p366ya.C6017g;

/* JADX INFO: renamed from: wb.kn */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5051kn implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18481g;

    /* JADX INFO: renamed from: h */
    public final Object f18482h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5051kn(List list) {
        this.f18481g = 11;
        this.f18482h = (Set) list.stream().map(new C5793n(0)).collect(Collectors.toSet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public boolean m9727a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Set) this.f18482h).contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        int i9 = this.f18481g;
        Object obj3 = this.f18482h;
        switch (i9) {
            case 0:
                int iCompare = ((C0415a0) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                Locale locale = Locale.US;
                String strM5165l = AbstractC2091b.m5165l(locale, (String) obj, locale);
                String lowerCase = ((String) obj2).toLowerCase(locale);
                lowerCase.getClass();
                return strM5165l.compareTo(lowerCase);
            case 1:
                int iCompare2 = ((C4834e2) obj3).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                String str = ((C0832c) obj).f2512c;
                Locale locale2 = Locale.US;
                String strM5165l2 = AbstractC2091b.m5165l(locale2, str, locale2);
                String lowerCase2 = ((C0832c) obj2).f2512c.toLowerCase(locale2);
                lowerCase2.getClass();
                return strM5165l2.compareTo(lowerCase2);
            case 2:
                int iCompare3 = ((C4834e2) obj3).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : Boolean.valueOf(((C0832c) obj).f2513d).compareTo(Boolean.valueOf(((C0832c) obj2).f2513d));
            case 3:
                int iCompare4 = ((C5051kn) obj3).compare(obj, obj2);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                String str2 = ((C0832c) obj).f2512c;
                Locale locale3 = Locale.US;
                String strM5165l3 = AbstractC2091b.m5165l(locale3, str2, locale3);
                String lowerCase3 = ((C0832c) obj2).f2512c.toLowerCase(locale3);
                lowerCase3.getClass();
                return strM5165l3.compareTo(lowerCase3);
            case 4:
                List list = (List) obj3;
                return Integer.valueOf(list.indexOf(((InterfaceC4544a) obj).mo4983a())).compareTo(Integer.valueOf(list.indexOf(((InterfaceC4544a) obj2).mo4983a())));
            case 5:
                int iCompare5 = ((C0505z) obj3).compare(obj, obj2);
                return iCompare5 != 0 ? iCompare5 : Boolean.valueOf(((C5292s0) obj).f20552c).compareTo(Boolean.valueOf(((C5292s0) obj2).f20552c));
            case 6:
                int iCompare6 = ((C5051kn) obj3).compare(obj, obj2);
                return iCompare6 != 0 ? iCompare6 : Boolean.valueOf(((C5292s0) obj).f20556g).compareTo(Boolean.valueOf(((C5292s0) obj2).f20556g));
            case 7:
                int iCompare7 = ((C5051kn) obj3).compare(obj, obj2);
                if (iCompare7 != 0) {
                    return iCompare7;
                }
                String str3 = ((C5292s0) obj).f20551b;
                Locale locale4 = Locale.US;
                String strM5165l4 = AbstractC2091b.m5165l(locale4, str3, locale4);
                String lowerCase4 = ((C5292s0) obj2).f20551b.toLowerCase(locale4);
                lowerCase4.getClass();
                return strM5165l4.compareTo(lowerCase4);
            case 8:
                int iCompare8 = ((C4834e2) obj3).compare(obj, obj2);
                if (iCompare8 != 0) {
                    return iCompare8;
                }
                String str4 = ((C5099m5) obj).f18836a.f20551b;
                Locale locale5 = Locale.US;
                String strM5165l5 = AbstractC2091b.m5165l(locale5, str4, locale5);
                String lowerCase5 = ((C5099m5) obj2).f18836a.f20551b.toLowerCase(locale5);
                lowerCase5.getClass();
                return strM5165l5.compareTo(lowerCase5);
            case 9:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) obj3;
                return Boolean.valueOf(!((Boolean) interfaceC1231l.invoke(((C3958e) obj).f12962h)).booleanValue()).compareTo(Boolean.valueOf(!((Boolean) interfaceC1231l.invoke(((C3958e) obj2).f12962h)).booleanValue()));
            case 10:
                int iCompare9 = ((C5051kn) obj3).compare(obj, obj2);
                return iCompare9 != 0 ? iCompare9 : AbstractC0018a.m249m((Comparable) ((C3958e) obj).f12961g, (Comparable) ((C3958e) obj2).f12961g);
            case 11:
                AbstractC5795p abstractC5795p = (AbstractC5795p) obj2;
                ((AbstractC5795p) obj).getClass();
                boolean z9 = m9727a(null) || m9727a(null);
                abstractC5795p.getClass();
                return -Boolean.compare(z9, m9727a(null) || m9727a(null));
            case 12:
                int iCompare10 = ((C3683m) obj3).compare(obj, obj2);
                if (iCompare10 != 0) {
                    return iCompare10;
                }
                C3147k c3147k = C6017g.f24443e;
                int iM8755e = C4330d.m8755e((ViewGroup) obj);
                Integer numValueOf2 = Integer.valueOf(iM8755e);
                if (!(iM8755e > 0)) {
                    numValueOf2 = null;
                }
                if (numValueOf2 == null) {
                    numValueOf2 = num;
                }
                int iM8755e2 = C4330d.m8755e((ViewGroup) obj2);
                numValueOf = iM8755e2 > 0 ? Integer.valueOf(iM8755e2) : null;
                return numValueOf2.compareTo(numValueOf != null ? numValueOf : Integer.MAX_VALUE);
            default:
                int iCompare11 = ((C3683m) obj3).compare(obj, obj2);
                if (iCompare11 != 0) {
                    return iCompare11;
                }
                int i10 = ((C6015e) obj).f24438c;
                Integer numValueOf3 = Integer.valueOf(i10);
                if (!(i10 > 0)) {
                    numValueOf3 = null;
                }
                if (numValueOf3 == null) {
                    numValueOf3 = num;
                }
                int i11 = ((C6015e) obj2).f24438c;
                numValueOf = i11 > 0 ? Integer.valueOf(i11) : null;
                return numValueOf3.compareTo(numValueOf != null ? numValueOf : Integer.MAX_VALUE);
        }
    }

    public /* synthetic */ C5051kn(Object obj, int i9) {
        this.f18481g = i9;
        this.f18482h = obj;
    }
}
