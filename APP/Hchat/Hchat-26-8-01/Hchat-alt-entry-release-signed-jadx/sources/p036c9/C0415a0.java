package p036c9;

import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import p007a7.AbstractC0018a;
import p009a9.C0031h;
import p050da.C0759e;
import p050da.C0760f;
import p050da.C0761g;
import p050da.C0762h;
import p072f2.C1054q;
import p080fb.C1113d1;
import p080fb.C1145l1;
import p080fb.C1160p0;
import p080fb.C1167r;
import p109hb.C1697t;
import p117i0.InterfaceC1809a1;
import p136j8.AbstractC2091b;
import p230p8.C3357i;
import p244qb.C3486g;
import p246qd.AbstractC3506j;
import p247qe.C3528k;
import p255r4.C3683m;
import p258r8.C3739d;
import p332wb.C5026jv;
import p339x1.C5602f0;
import tf.AbstractC4166m;
import tf.C4176w;

/* JADX INFO: renamed from: c9.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0415a0 implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1191g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1192h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0415a0(Comparator comparator) {
        this.f1191g = 8;
        this.f1192h = comparator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Collection collectionValues;
        Long l10;
        Collection collectionValues2;
        Long l11;
        switch (this.f1191g) {
            case 0:
                int iCompare = ((C0505z) this.f1192h).compare(obj, obj2);
                return iCompare != 0 ? iCompare : AbstractC0018a.m249m(((C5026jv) obj).f18250b, ((C5026jv) obj2).f18250b);
            case 1:
                int iCompare2 = ((C0444h1) this.f1192h).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : Integer.valueOf(((C4176w) obj).f13713a).compareTo(Integer.valueOf(((C4176w) obj2).f13713a));
            case 2:
                int iCompare3 = ((C0031h) this.f1192h).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : Long.valueOf(((C1697t) obj).f5646a).compareTo(Long.valueOf(((C1697t) obj2).f5646a));
            case 3:
                int iCompare4 = ((C0031h) this.f1192h).compare(obj, obj2);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                return (((C0759e) obj).f2269c ? 0 : num).compareTo(((C0759e) obj2).f2269c ? 0 : 1);
            case 4:
                int iCompare5 = ((C0761g) this.f1192h).compare(obj, obj2);
                return iCompare5 != 0 ? iCompare5 : Float.valueOf(((C0759e) obj2).f2267a.f2271b.getTextSize()).compareTo(Float.valueOf(((C0759e) obj).f2267a.f2271b.getTextSize()));
            case 5:
                C0760f c0760f = (C0760f) obj;
                C0762h c0762h = (C0762h) this.f1192h;
                View view = c0760f.f2270a;
                TextView textView = c0760f.f2271b;
                c0762h.getClass();
                C0760f c0760f2 = (C0760f) obj2;
                return Integer.valueOf(C0762h.m1962n(C0762h.m1965r(view, textView)).length()).compareTo(Integer.valueOf(C0762h.m1962n(C0762h.m1965r(c0760f2.f2270a, c0760f2.f2271b)).length()));
            case 6:
                int iCompare6 = ((C0415a0) this.f1192h).compare(obj, obj2);
                return iCompare6 != 0 ? iCompare6 : Float.valueOf(((C0760f) obj2).f2271b.getTextSize()).compareTo(Float.valueOf(((C0760f) obj).f2271b.getTextSize()));
            case 7:
                int iCompare7 = ((C0031h) this.f1192h).compare(obj, obj2);
                return iCompare7 != 0 ? iCompare7 : Integer.valueOf(((String) ((Map.Entry) obj2).getKey()).length()).compareTo(Integer.valueOf(((String) ((Map.Entry) obj).getKey()).length()));
            case 8:
                int iCompare8 = ((Comparator) this.f1192h).compare(obj, obj2);
                return iCompare8 != 0 ? iCompare8 : C5602f0.f22766Z.compare(((C1054q) obj).f3349c, ((C1054q) obj2).f3349c);
            case 9:
                int iCompare9 = ((C0415a0) this.f1192h).compare(obj, obj2);
                return iCompare9 != 0 ? iCompare9 : Integer.valueOf(((C1054q) obj).f3352f).compareTo(Integer.valueOf(((C1054q) obj2).f3352f));
            case 10:
                int iCompare10 = ((C1167r) this.f1192h).compare(obj, obj2);
                if (iCompare10 != 0) {
                    return iCompare10;
                }
                String name = ((File) obj).getName();
                name.getClass();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                lowerCase.getClass();
                String name2 = ((File) obj2).getName();
                name2.getClass();
                String lowerCase2 = name2.toLowerCase(locale);
                lowerCase2.getClass();
                return lowerCase.compareTo(lowerCase2);
            case 11:
                int iCompare11 = ((C1167r) this.f1192h).compare(obj, obj2);
                return iCompare11 != 0 ? iCompare11 : ((C1160p0) obj).f3850a.f3897a.compareTo(((C1160p0) obj2).f3850a.f3897a);
            case 12:
                int iCompare12 = ((C1167r) this.f1192h).compare(obj, obj2);
                return iCompare12 != 0 ? iCompare12 : Long.valueOf(((C1113d1) obj2).f3649n).compareTo(Long.valueOf(((C1113d1) obj).f3649n));
            case 13:
                int iCompare13 = ((C0415a0) this.f1192h).compare(obj, obj2);
                return iCompare13 != 0 ? iCompare13 : Long.valueOf(((C1113d1) obj2).f3639d).compareTo(Long.valueOf(((C1113d1) obj).f3639d));
            case 14:
                C1145l1 c1145l1 = (C1145l1) this.f1192h;
                String name3 = ((ZipEntry) obj).getName();
                name3.getClass();
                Integer numValueOf = Integer.valueOf(C1145l1.m2902a(c1145l1, name3));
                String name4 = ((ZipEntry) obj2).getName();
                name4.getClass();
                return numValueOf.compareTo(Integer.valueOf(C1145l1.m2902a(c1145l1, name4)));
            case 15:
                Spanned spanned = (Spanned) this.f1192h;
                return Integer.valueOf(spanned.getSpanStart((URLSpan) obj)).compareTo(Integer.valueOf(spanned.getSpanStart((URLSpan) obj2)));
            case 16:
                int iCompare14 = ((C0505z) this.f1192h).compare(obj, obj2);
                return iCompare14 != 0 ? iCompare14 : Boolean.valueOf(((C5026jv) obj).f18251c).compareTo(Boolean.valueOf(((C5026jv) obj2).f18251c));
            case 17:
                int iCompare15 = ((C0415a0) this.f1192h).compare(obj, obj2);
                return iCompare15 != 0 ? iCompare15 : Boolean.valueOf(((C5026jv) obj).f18255g).compareTo(Boolean.valueOf(((C5026jv) obj2).f18255g));
            case 18:
                int iCompare16 = ((C0415a0) this.f1192h).compare(obj, obj2);
                if (iCompare16 != 0) {
                    return iCompare16;
                }
                String str = ((C5026jv) obj).f18250b;
                Locale locale2 = Locale.US;
                String strM5165l = AbstractC2091b.m5165l(locale2, str, locale2);
                String lowerCase3 = ((C5026jv) obj2).f18250b.toLowerCase(locale2);
                lowerCase3.getClass();
                return strM5165l.compareTo(lowerCase3);
            case 19:
                int iCompare17 = ((C0031h) this.f1192h).compare(obj, obj2);
                return iCompare17 != 0 ? iCompare17 : Long.valueOf(((C1697t) obj).f5646a).compareTo(Long.valueOf(((C1697t) obj2).f5646a));
            case 20:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f1192h;
                return Boolean.valueOf(linkedHashSet.contains(((C5026jv) obj2).f18249a)).compareTo(Boolean.valueOf(linkedHashSet.contains(((C5026jv) obj).f18249a)));
            case 21:
                int iCompare18 = ((C0505z) this.f1192h).compare(obj, obj2);
                if (iCompare18 != 0) {
                    return iCompare18;
                }
                String str2 = ((C5026jv) obj).f18250b;
                Locale locale3 = Locale.CHINA;
                String strM5165l2 = AbstractC2091b.m5165l(locale3, str2, locale3);
                String lowerCase4 = ((C5026jv) obj2).f18250b.toLowerCase(locale3);
                lowerCase4.getClass();
                return strM5165l2.compareTo(lowerCase4);
            case 22:
                int iCompare19 = ((C0031h) this.f1192h).compare(obj, obj2);
                return iCompare19 != 0 ? iCompare19 : Integer.valueOf(((C3357i) obj).f10825b).compareTo(Integer.valueOf(((C3357i) obj2).f10825b));
            case 23:
                int iCompare20 = ((C0505z) this.f1192h).compare(obj, obj2);
                return iCompare20 != 0 ? iCompare20 : Boolean.valueOf(((C3486g) obj).f11317c).compareTo(Boolean.valueOf(((C3486g) obj2).f11317c));
            case 24:
                int iCompare21 = ((C0415a0) this.f1192h).compare(obj, obj2);
                if (iCompare21 != 0) {
                    return iCompare21;
                }
                String str3 = ((C3486g) obj).f11316b;
                Locale locale4 = Locale.US;
                String strM5165l3 = AbstractC2091b.m5165l(locale4, str3, locale4);
                String lowerCase5 = ((C3486g) obj2).f11316b.toLowerCase(locale4);
                lowerCase5.getClass();
                return strM5165l3.compareTo(lowerCase5);
            case 25:
                int iOrdinal = ((C3528k) this.f1192h).m7432d((AbstractC3506j) obj, (AbstractC3506j) obj2).ordinal();
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return 1;
                }
                if (iOrdinal == 3 || iOrdinal == 4) {
                    return -1;
                }
                return iOrdinal != 5 ? 0 : -2;
            case 26:
                int iCompare22 = ((C3683m) this.f1192h).compare(obj, obj2);
                return iCompare22 != 0 ? iCompare22 : Integer.valueOf(((C3739d) ((Map.Entry) obj).getValue()).f12132c).compareTo(Integer.valueOf(((C3739d) ((Map.Entry) obj2).getValue()).f12132c));
            case 27:
                int iCompare23 = ((C0415a0) this.f1192h).compare(obj, obj2);
                return iCompare23 != 0 ? iCompare23 : AbstractC0018a.m249m((Comparable) ((Map.Entry) obj).getKey(), (Comparable) ((Map.Entry) obj2).getKey());
            case 28:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1192h;
                Map map = (Map) linkedHashMap.get((String) obj);
                long jLongValue = Long.MAX_VALUE;
                Long lValueOf = Long.valueOf((map == null || (collectionValues2 = map.values()) == null || (l11 = (Long) AbstractC4166m.m8395D1(collectionValues2)) == null) ? Long.MAX_VALUE : l11.longValue());
                Map map2 = (Map) linkedHashMap.get((String) obj2);
                if (map2 != null && (collectionValues = map2.values()) != null && (l10 = (Long) AbstractC4166m.m8395D1(collectionValues)) != null) {
                    jLongValue = l10.longValue();
                }
                return lValueOf.compareTo(Long.valueOf(jLongValue));
            default:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1192h;
                return Boolean.valueOf(((Set) interfaceC1809a1.getValue()).contains((String) obj2)).compareTo(Boolean.valueOf(((Set) interfaceC1809a1.getValue()).contains((String) obj)));
        }
    }

    public /* synthetic */ C0415a0(Object obj, int i9) {
        this.f1191g = i9;
        this.f1192h = obj;
    }
}
