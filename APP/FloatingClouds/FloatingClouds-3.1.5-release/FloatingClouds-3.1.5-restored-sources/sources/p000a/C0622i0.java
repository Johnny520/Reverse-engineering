package p000a;

import android.app.ProgressDialog;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: a.i0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0622i0 implements InterfaceC0136H7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2296a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2297b;

    public /* synthetic */ C0622i0(int i, Object obj) {
        this.f2296a = i;
        this.f2297b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: B */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    @Override // p000a.InterfaceC0136H7
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo146e(Object obj, Object obj2) {
        int i;
        Object next;
        C0710mc c0710mc;
        Object next2;
        switch (this.f2296a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                String str = (String) obj2;
                C0631i9.m1482e(str, "taskName");
                C0698m0.f2636b.post(new RunnableC0660k0((ProgressDialog) this.f2297b, iIntValue, str, 0));
                return C0413Wf.f1577a;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C0631i9.m1482e(charSequence, "$this$DelimitedRangesSequence");
                List list = (List) this.f2297b;
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str2 = (String) list.get(0);
                    int iM99N = C0034Be.m99N(charSequence, str2, iIntValue2, false, 4);
                    c0710mc = iM99N < 0 ? null : new C0710mc(Integer.valueOf(iM99N), str2);
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    boolean z = charSequence instanceof String;
                    int i2 = new C0574f9(iIntValue2, charSequence.length(), 1).f1930b;
                    if (z) {
                        if (iIntValue2 <= i2) {
                            int i3 = iIntValue2;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str3 = (String) next2;
                                        if (C0015Ae.m46E(0, i3, str3.length(), str3, (String) charSequence, false)) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                String str4 = (String) next2;
                                if (str4 != null) {
                                    c0710mc = new C0710mc(Integer.valueOf(i3), str4);
                                } else if (i3 != i2) {
                                    i3++;
                                }
                            }
                        }
                    } else if (iIntValue2 <= i2) {
                        int i4 = iIntValue2;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    int i5 = i2;
                                    String str5 = (String) next;
                                    i = i5;
                                    if (!C0034Be.m103R(str5, 0, charSequence, i4, str5.length(), false)) {
                                        i2 = i;
                                    }
                                } else {
                                    i = i2;
                                    next = null;
                                }
                            }
                            String str6 = (String) next;
                            if (str6 != null) {
                                c0710mc = new C0710mc(Integer.valueOf(i4), str6);
                            } else if (i4 != i) {
                                i4++;
                                i2 = i;
                            }
                        }
                    }
                }
                if (c0710mc != null) {
                    return new C0710mc(c0710mc.f2680a, Integer.valueOf(((String) c0710mc.f2681b).length()));
                }
                return null;
        }
    }
}
