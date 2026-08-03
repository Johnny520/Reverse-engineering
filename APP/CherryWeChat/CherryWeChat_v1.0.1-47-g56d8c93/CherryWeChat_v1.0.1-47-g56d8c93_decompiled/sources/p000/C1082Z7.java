package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Z7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1082Z7 implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3450a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3451b;

    public /* synthetic */ C1082Z7(int i, Object obj) {
        this.f3450a = i;
        this.f3451b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo446d(Object obj, Object obj2) {
        Object next;
        C0208Et c0208Et;
        Object next2;
        switch (this.f3450a) {
            case 0:
                C1206b8 c1206b8 = (C1206b8) this.f3451b;
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC0295Gu.m625r(-89794881255477L);
                ArrayList arrayList = c1206b8.f4133c;
                int iIndexOf = arrayList.indexOf((C2629ve) obj);
                int iM1639f = AbstractC0828TB.m1639f(((int) (fFloatValue / AbstractC0295Gu.m616i(50))) + iIndexOf, arrayList.size() - 1);
                c1206b8.f4136f = iM1639f;
                if (iIndexOf != iM1639f) {
                    float fM616i = AbstractC0295Gu.m616i(50);
                    int i = 0;
                    for (Object obj3 : arrayList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC2496sa.m4978c0();
                            throw null;
                        }
                        C2629ve c2629ve = (C2629ve) obj3;
                        if (i != iIndexOf) {
                            c2629ve.animate().translationY((iIndexOf >= iM1639f || iIndexOf + 1 > i || i > iM1639f) ? (iIndexOf <= iM1639f || iM1639f > i || i >= iIndexOf) ? 0.0f : fM616i : -fM616i).setDuration(180L).start();
                        }
                        i = i2;
                    }
                }
                return C0829TC.f2620a;
            case 1:
                List list = (List) this.f3451b;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str = (String) list.get(0);
                    int iM5057R = AbstractC2564tz.m5057R(charSequence, str, iIntValue, false, 4);
                    c0208Et = iM5057R < 0 ? null : new C0208Et(Integer.valueOf(iM5057R), str);
                } else {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    boolean z = charSequence instanceof String;
                    int i3 = new C0286Gl(iIntValue, charSequence.length(), 1).f433b;
                    if (z) {
                        if (iIntValue <= i3) {
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
                                    c0208Et = new C0208Et(Integer.valueOf(iIntValue), str3);
                                } else if (iIntValue != i3) {
                                    iIntValue++;
                                }
                            }
                        }
                    } else if (iIntValue <= i3) {
                        int i4 = iIntValue;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str4 = (String) next;
                                    if (AbstractC2564tz.m5062W(str4, 0, charSequence, i4, str4.length(), false)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                c0208Et = new C0208Et(Integer.valueOf(i4), str5);
                            } else if (i4 != i3) {
                                i4++;
                            }
                        }
                    }
                }
                if (c0208Et != null) {
                    return new C0208Et(c0208Et.f613a, Integer.valueOf(((String) c0208Et.f614b).length()));
                }
                return null;
            default:
                int iM5058S = AbstractC2564tz.m5058S((CharSequence) obj, (char[]) this.f3451b, ((Integer) obj2).intValue(), false);
                if (iM5058S < 0) {
                    return null;
                }
                return new C0208Et(Integer.valueOf(iM5058S), 1);
        }
    }
}
