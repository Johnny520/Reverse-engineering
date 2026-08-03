package p042W0;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p007D0.C0139e;
import p029P0.InterfaceC0290p;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;
import p036T0.C0340c;

/* JADX INFO: renamed from: W0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0434s extends AbstractC0308h implements InterfaceC0290p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f945a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f946b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f947c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0434s(Object obj, boolean z2, int i2) {
        super(2);
        this.f945a = i2;
        this.f947c = obj;
        this.f946b = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    @Override // p029P0.InterfaceC0290p
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo518b(Object obj, Object obj2) {
        Object next;
        C0139e c0139e;
        Object next2;
        switch (this.f945a) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Number) obj2).intValue();
                AbstractC0307g.m703e(charSequence, "$this$$receiver");
                int iM1012Q0 = AbstractC0425j.m1012Q0(charSequence, (char[]) this.f947c, iIntValue, this.f946b);
                if (iM1012Q0 < 0) {
                    return null;
                }
                return new C0139e(Integer.valueOf(iM1012Q0), 1);
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                AbstractC0307g.m703e(charSequence2, "$this$$receiver");
                List list = (List) this.f947c;
                boolean z2 = this.f946b;
                if (z2 || list.size() != 1) {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    boolean z3 = charSequence2 instanceof String;
                    int i2 = new C0340c(iIntValue2, charSequence2.length(), 1).f658b;
                    if (z3) {
                        if (iIntValue2 > i2) {
                            c0139e = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str = (String) next2;
                                        if (AbstractC0433r.m1030E0(0, iIntValue2, str.length(), str, (String) charSequence2, z2)) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                String str2 = (String) next2;
                                if (str2 != null) {
                                    c0139e = new C0139e(Integer.valueOf(iIntValue2), str2);
                                } else if (iIntValue2 != i2) {
                                    iIntValue2++;
                                }
                            }
                            c0139e = null;
                        }
                    } else if (iIntValue2 <= i2) {
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str3 = (String) next;
                                    if (AbstractC0425j.m1015T0(str3, 0, charSequence2, iIntValue2, str3.length(), z2)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            String str4 = (String) next;
                            if (str4 != null) {
                                c0139e = new C0139e(Integer.valueOf(iIntValue2), str4);
                            } else if (iIntValue2 != i2) {
                                iIntValue2++;
                            }
                        }
                        c0139e = null;
                    }
                } else {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str5 = (String) list.get(0);
                    int iM1011P0 = AbstractC0425j.m1011P0(charSequence2, str5, iIntValue2, false, 4);
                    if (iM1011P0 >= 0) {
                        c0139e = new C0139e(Integer.valueOf(iM1011P0), str5);
                    }
                }
                if (c0139e == null) {
                    return null;
                }
                return new C0139e(c0139e.f328a, Integer.valueOf(((String) c0139e.f329b).length()));
        }
    }
}
