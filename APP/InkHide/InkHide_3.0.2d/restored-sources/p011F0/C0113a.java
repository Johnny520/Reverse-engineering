package p011F0;

import androidx.activity.AbstractActivityC0376g;
import androidx.lifecycle.AbstractC0455G;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p009E0.C0103c;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p025M0.InterfaceC0208p;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0224h;
import p034R0.C0244c;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.C0499d;
import p052b1.C0501f;
import p052b1.C0505j;
import p063e1.AbstractC0553a;
import p065f1.C0557a;
import p065f1.C0558b;
import p065f1.C0559c;
import p065f1.C0560d;

/* JADX INFO: renamed from: F0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0113a extends AbstractC0224h implements InterfaceC0204l, InterfaceC0193a, InterfaceC0208p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f408a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f409b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0113a(int i2, Object obj) {
        this.f408a = i2;
        this.f409b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    @Override // p025M0.InterfaceC0208p
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo248a(Object obj, Object obj2) {
        int i2;
        Object next;
        C0103c c0103c;
        Object next2;
        switch (this.f408a) {
            case 2:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Number) obj2).intValue();
                AbstractC0223g.m418e(charSequence, "$this$$receiver");
                int iM519q0 = AbstractC0299i.m519q0(charSequence, (char[]) this.f409b, iIntValue, false);
                if (iM519q0 < 0) {
                    return null;
                }
                return new C0103c(Integer.valueOf(iM519q0), 1);
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                AbstractC0223g.m418e(charSequence2, "$this$$receiver");
                List list = (List) this.f409b;
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str = (String) list.get(0);
                    int iM518p0 = AbstractC0299i.m518p0(charSequence2, str, iIntValue2, false, 4);
                    c0103c = iM518p0 < 0 ? null : new C0103c(Integer.valueOf(iM518p0), str);
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    boolean z2 = charSequence2 instanceof String;
                    int i3 = new C0244c(iIntValue2, charSequence2.length(), 1).f584b;
                    if (z2) {
                        if (iIntValue2 <= i3) {
                            int i4 = iIntValue2;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str2 = (String) next2;
                                        if (AbstractC0307q.m535e0(0, i4, str2.length(), str2, (String) charSequence2, false)) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                String str3 = (String) next2;
                                if (str3 != null) {
                                    c0103c = new C0103c(Integer.valueOf(i4), str3);
                                } else if (i4 != i3) {
                                    i4++;
                                }
                            }
                        }
                    } else if (iIntValue2 <= i3) {
                        int i5 = iIntValue2;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    int i6 = i3;
                                    String str4 = (String) next;
                                    i2 = i6;
                                    if (!AbstractC0299i.m521s0(str4, 0, charSequence2, i5, str4.length(), false)) {
                                        i3 = i2;
                                    }
                                } else {
                                    i2 = i3;
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                c0103c = new C0103c(Integer.valueOf(i5), str5);
                            } else if (i5 != i2) {
                                i5++;
                                i3 = i2;
                            }
                        }
                    }
                }
                if (c0103c != null) {
                    return new C0103c(c0103c.f394a, Integer.valueOf(((String) c0103c.f395b).length()));
                }
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public Object mo7b() {
        switch (this.f408a) {
            case 1:
                return (Throwable) this.f409b;
            case 2:
            case 3:
            case 4:
            default:
                StringBuilder sb = new StringBuilder("(");
                C0560d c0560d = (C0560d) this.f409b;
                sb.append(AbstractC0123k.m271m0(c0560d.f1871c, "", null, null, C0559c.f1868a, 30));
                sb.append(")");
                sb.append(AbstractC0553a.m1128b(c0560d.f1872d));
                String string = sb.toString();
                AbstractC0223g.m417d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            case 5:
                return AbstractC0455G.m912d((AbstractActivityC0376g) this.f409b);
            case 6:
                return new C0557a(((C0499d) this.f409b).f1579c);
            case 7:
                return new C0558b(((C0501f) this.f409b).f1588c);
            case 8:
                return new C0560d(((C0505j) this.f409b).f1612c);
            case 9:
                return AbstractC0553a.m1128b(((C0558b) this.f409b).f1866c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public Object mo8c(Object obj) {
        switch (this.f408a) {
            case 0:
                return obj == ((AbstractC0118f) this.f409b) ? "(this Collection)" : String.valueOf(obj);
            default:
                C0244c c0244c = (C0244c) obj;
                AbstractC0223g.m418e(c0244c, "it");
                String str = (String) this.f409b;
                AbstractC0223g.m418e(str, "<this>");
                return str.subSequence(c0244c.f583a, c0244c.f584b + 1).toString();
        }
    }
}
