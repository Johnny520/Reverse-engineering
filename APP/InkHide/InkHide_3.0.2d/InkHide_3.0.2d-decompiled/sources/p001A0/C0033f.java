package p001A0;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Locale;
import p006D.AbstractC0079h;
import p009E0.C0103c;
import p027N0.AbstractC0223g;
import p052b1.C0505j;
import p069i.C0716t;
import p088s0.C0987i;

/* JADX INFO: renamed from: A0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0033f implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f225a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f226b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0033f(int i2, Object obj) {
        this.f225a = i2;
        this.f226b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f225a) {
            case 0:
                int iCompare = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare != 0 ? iCompare : AbstractC0079h.m184h(Integer.valueOf(((C0505j) ((C0103c) obj).f394a).m1006b().f1869a.length()), Integer.valueOf(((C0505j) ((C0103c) obj2).f394a).m1006b().f1869a.length()));
            case 1:
                int iCompare2 = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : AbstractC0079h.m184h(Integer.valueOf(((C0505j) obj).m1006b().f1869a.length()), Integer.valueOf(((C0505j) obj2).m1006b().f1869a.length()));
            case 2:
                int iCompare3 = ((C0033f) this.f226b).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : AbstractC0079h.m184h(((C0505j) obj).m1006b().f1870b, ((C0505j) obj2).m1006b().f1870b);
            case 3:
                int iCompare4 = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : AbstractC0079h.m184h(Integer.valueOf(((C0505j) obj).m1006b().f1869a.length()), Integer.valueOf(((C0505j) obj2).m1006b().f1869a.length()));
            case 4:
                int iCompare5 = ((C0033f) this.f226b).compare(obj, obj2);
                return iCompare5 != 0 ? iCompare5 : AbstractC0079h.m184h(((C0505j) obj).m1006b().f1870b, ((C0505j) obj2).m1006b().f1870b);
            case 5:
                int iCompare6 = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare6 != 0 ? iCompare6 : AbstractC0079h.m184h(Integer.valueOf(((C0505j) obj).m1006b().f1869a.length()), Integer.valueOf(((C0505j) obj2).m1006b().f1869a.length()));
            case 6:
                int iCompare7 = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare7 != 0 ? iCompare7 : AbstractC0079h.m184h(Integer.valueOf(((Field) obj).getName().length()), Integer.valueOf(((Field) obj2).getName().length()));
            case 7:
                int iCompare8 = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare8 != 0 ? iCompare8 : AbstractC0079h.m184h(Integer.valueOf(((Class) obj).getName().length()), Integer.valueOf(((Class) obj2).getName().length()));
            case 8:
                int iCompare9 = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare9 != 0 ? iCompare9 : AbstractC0079h.m184h(Integer.valueOf(((Field) obj).getName().length()), Integer.valueOf(((Field) obj2).getName().length()));
            case 9:
                int iCompare10 = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare10 != 0 ? iCompare10 : AbstractC0079h.m184h(Integer.valueOf(((Field) obj).getName().length()), Integer.valueOf(((Field) obj2).getName().length()));
            case 10:
                int iCompare11 = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare11 != 0 ? iCompare11 : AbstractC0079h.m184h(Integer.valueOf(((String) obj).length()), Integer.valueOf(((String) obj2).length()));
            case 11:
                int iCompare12 = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare12 != 0 ? iCompare12 : AbstractC0079h.m184h(((Method) obj).getName(), ((Method) obj2).getName());
            case 12:
                int iCompare13 = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare13 != 0 ? iCompare13 : AbstractC0079h.m184h(Integer.valueOf(((Class) obj).getName().length()), Integer.valueOf(((Class) obj2).getName().length()));
            case 13:
                int iCompare14 = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare14 != 0 ? iCompare14 : AbstractC0079h.m184h(Integer.valueOf(((Class) ((C0103c) obj).f394a).getName().length()), Integer.valueOf(((Class) ((C0103c) obj2).f394a).getName().length()));
            case 14:
                int iCompare15 = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare15 != 0 ? iCompare15 : AbstractC0079h.m184h(Integer.valueOf(((Class) obj).getName().length()), Integer.valueOf(((Class) obj2).getName().length()));
            case 15:
                int iCompare16 = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare16 != 0 ? iCompare16 : AbstractC0079h.m184h(Integer.valueOf(((Class) obj).getName().length()), Integer.valueOf(((Class) obj2).getName().length()));
            case 16:
                int iCompare17 = ((C0032e) this.f226b).compare(obj, obj2);
                return iCompare17 != 0 ? iCompare17 : AbstractC0079h.m184h(Integer.valueOf(((Class) obj).getName().length()), Integer.valueOf(((Class) obj2).getName().length()));
            case 17:
                int iCompare18 = ((C0017Q) this.f226b).compare(obj, obj2);
                if (iCompare18 != 0) {
                    return iCompare18;
                }
                String str = ((C0987i) obj).f3532b;
                Locale locale = Locale.getDefault();
                AbstractC0223g.m417d(locale, "getDefault(...)");
                String lowerCase = str.toLowerCase(locale);
                AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
                String str2 = ((C0987i) obj2).f3532b;
                Locale locale2 = Locale.getDefault();
                AbstractC0223g.m417d(locale2, "getDefault(...)");
                String lowerCase2 = str2.toLowerCase(locale2);
                AbstractC0223g.m417d(lowerCase2, "toLowerCase(...)");
                return AbstractC0079h.m184h(lowerCase, lowerCase2);
            case 18:
                int iCompare19 = ((C0017Q) this.f226b).compare(obj, obj2);
                if (iCompare19 != 0) {
                    return iCompare19;
                }
                String str3 = ((C0987i) obj).f3532b;
                Locale locale3 = Locale.getDefault();
                AbstractC0223g.m417d(locale3, "getDefault(...)");
                String lowerCase3 = str3.toLowerCase(locale3);
                AbstractC0223g.m417d(lowerCase3, "toLowerCase(...)");
                String str4 = ((C0987i) obj2).f3532b;
                Locale locale4 = Locale.getDefault();
                AbstractC0223g.m417d(locale4, "getDefault(...)");
                String lowerCase4 = str4.toLowerCase(locale4);
                AbstractC0223g.m417d(lowerCase4, "toLowerCase(...)");
                return AbstractC0079h.m184h(lowerCase3, lowerCase4);
            case 19:
                C0716t c0716t = (C0716t) this.f226b;
                return AbstractC0079h.m184h(Integer.valueOf(C0716t.m1348a(c0716t, (String) obj)), Integer.valueOf(C0716t.m1348a(c0716t, (String) obj2)));
            default:
                int iCompare20 = ((C0033f) this.f226b).compare(obj, obj2);
                return iCompare20 != 0 ? iCompare20 : AbstractC0079h.m184h((String) obj, (String) obj2);
        }
    }
}
