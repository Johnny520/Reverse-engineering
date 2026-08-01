package p108V3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import me.dartcv.nuke.BuildConfig;
import p056K2.C0882h;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p132a3.C1804d;
import p149d3.AbstractC1976d;
import p149d3.AbstractC1983k;

/* JADX INFO: renamed from: V3.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1554g implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5407d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f5408e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1554g(int i5, List list) {
        this.f5407d = i5;
        this.f5408e = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo0g(Object obj, Object obj2) {
        int i5;
        int i6;
        int i7;
        Object next;
        C0882h c0882h;
        Object next2;
        switch (this.f5407d) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1543P.m2796C(this.f5408e, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((Integer) obj2).getClass();
                AbstractC1543P.m2818c(this.f5408e, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            case 2:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1543P.m2818c(this.f5408e, c1383r, 0);
                } else {
                    c1383r.m2563R();
                }
                return C0891q.f2780a;
            case 3:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC1543P.m2796C(this.f5408e, c1383r2, 0);
                } else {
                    c1383r2.m2563R();
                }
                return C0891q.f2780a;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC1543P.m2830o(this.f5408e, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                AbstractC1665j.m2985e(charSequence, "$this$DelimitedRangesSequence");
                List list = this.f5408e;
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str = (String) list.get(0);
                    int iM3635c0 = AbstractC1976d.m3635c0(charSequence, str, iIntValue3, 4);
                    c0882h = iM3635c0 < 0 ? null : new C0882h(Integer.valueOf(iM3635c0), str);
                } else {
                    if (iIntValue3 < 0) {
                        iIntValue3 = 0;
                    }
                    C1804d c1804d = new C1804d(iIntValue3, charSequence.length(), 1);
                    boolean z5 = charSequence instanceof String;
                    int i8 = c1804d.f6142f;
                    int i9 = c1804d.f6141e;
                    if (z5) {
                        if ((i8 > 0 && iIntValue3 <= i9) || (i8 < 0 && i9 <= iIntValue3)) {
                            int i10 = iIntValue3;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str2 = (String) next2;
                                        if (AbstractC1983k.m3651N(str2, 0, (String) charSequence, i10, str2.length(), false)) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                String str3 = (String) next2;
                                if (str3 != null) {
                                    c0882h = new C0882h(Integer.valueOf(i10), str3);
                                } else if (i10 != i9) {
                                    i10 += i8;
                                }
                            }
                        }
                    } else if ((i8 > 0 && iIntValue3 <= i9) || (i8 < 0 && i9 <= iIntValue3)) {
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    int i11 = i9;
                                    String str4 = (String) next;
                                    int i12 = i8;
                                    i5 = iIntValue3;
                                    i6 = i12;
                                    i7 = i11;
                                    if (!AbstractC1976d.m3641i0(str4, 0, charSequence, i5, str4.length(), false)) {
                                        i8 = i6;
                                        iIntValue3 = i5;
                                        i9 = i7;
                                    }
                                } else {
                                    int i13 = i8;
                                    i5 = iIntValue3;
                                    i6 = i13;
                                    i7 = i9;
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                c0882h = new C0882h(Integer.valueOf(i5), str5);
                            } else if (i5 != i7) {
                                int i14 = i5 + i6;
                                i8 = i6;
                                iIntValue3 = i14;
                                i9 = i7;
                            }
                        }
                    }
                }
                if (c0882h != null) {
                    return new C0882h(c0882h.f2769d, Integer.valueOf(((String) c0882h.f2770e).length()));
                }
                return null;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1554g(List list, int i5, int i6) {
        this.f5407d = i6;
        this.f5408e = list;
    }
}
