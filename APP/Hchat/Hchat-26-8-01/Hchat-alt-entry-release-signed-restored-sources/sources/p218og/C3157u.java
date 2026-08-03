package p218og;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import p085fg.InterfaceC1235p;
import p172lg.C2564d;
import p276sf.C3958e;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: og.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3157u implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f10211g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f10212h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3157u(int i9, List list) {
        this.f10211g = i9;
        this.f10212h = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    @Override // p085fg.InterfaceC1235p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        C3958e c3958e;
        Object next2;
        switch (this.f10211g) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                charSequence.getClass();
                List list = this.f10212h;
                if (list.size() == 1) {
                    String str = (String) AbstractC4166m.m8399H1(list);
                    int iM6719r0 = AbstractC3149m.m6719r0(charSequence, str, iIntValue, false, 4);
                    c3958e = iM6719r0 < 0 ? null : new C3958e(Integer.valueOf(iM6719r0), str);
                } else {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    C2564d c2564d = new C2564d(iIntValue, charSequence.length(), 1);
                    boolean z9 = charSequence instanceof String;
                    int i9 = c2564d.f8314i;
                    int i10 = c2564d.f8313h;
                    if (z9) {
                        if ((i9 > 0 && iIntValue <= i10) || (i9 < 0 && i10 <= iIntValue)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str2 = (String) next2;
                                        if (str2.regionMatches(0, (String) charSequence, iIntValue, str2.length())) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                String str3 = (String) next2;
                                if (str3 != null) {
                                    c3958e = new C3958e(Integer.valueOf(iIntValue), str3);
                                } else if (iIntValue != i10) {
                                    iIntValue += i9;
                                }
                            }
                        }
                    } else if ((i9 > 0 && iIntValue <= i10) || (i9 < 0 && i10 <= iIntValue)) {
                        int i11 = iIntValue;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str4 = (String) next;
                                    if (AbstractC3149m.m6727z0(str4, 0, charSequence, i11, str4.length(), false)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                c3958e = new C3958e(Integer.valueOf(i11), str5);
                            } else if (i11 != i10) {
                                i11 += i9;
                            }
                        }
                    }
                }
                if (c3958e != null) {
                    return new C3958e(c3958e.f12961g, Integer.valueOf(((String) c3958e.f12962h).length()));
                }
                return null;
            default:
                Iterable iterable = (List) obj2;
                ((String) obj).getClass();
                if (iterable == null) {
                    iterable = C4173t.f13710g;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it3 = iterable.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    List<Cookie> list2 = this.f10212h;
                    if (!zHasNext) {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.addAll(list2);
                        return arrayList2;
                    }
                    Object next3 = it3.next();
                    Cookie cookie = (Cookie) next3;
                    if (!list2.isEmpty()) {
                        for (Cookie cookie2 : list2) {
                            if (!AbstractC1416l.m3825a(cookie2.name(), cookie.name()) || !AbstractC1416l.m3825a(cookie2.domain(), cookie.domain()) || !AbstractC1416l.m3825a(cookie2.path(), cookie.path())) {
                            }
                        }
                    }
                    arrayList.add(next3);
                }
                break;
        }
    }
}
