package p000;

import androidx.recyclerview.widget.RecyclerView;
import com.github.megatronking.stringfog.Base64;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0914y1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5322a;

    /* JADX INFO: renamed from: b */
    public final Object f5323b;

    /* JADX INFO: renamed from: c */
    public final Serializable f5324c;

    /* JADX INFO: renamed from: d */
    public final Serializable f5325d;

    /* JADX INFO: renamed from: e */
    public final Object f5326e;

    /* JADX INFO: renamed from: f */
    public final Object f5327f;

    public C0914y1(String str, String str2, String str3, List list) {
        this.f5322a = 1;
        str.getClass();
        this.f5323b = str;
        str2.getClass();
        this.f5324c = str2;
        this.f5325d = str3;
        list.getClass();
        this.f5326e = list;
        this.f5327f = str + "-" + str2 + "-" + str3;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2713a(int i) {
        ArrayList arrayList = (ArrayList) this.f5325d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0877x1 c0877x1 = (C0877x1) arrayList.get(i2);
            int i3 = c0877x1.f5152a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c0877x1.f5153b;
                    int i5 = c0877x1.f5154c + i4;
                    while (i4 < i5) {
                        if (m2717e(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m2717e(c0877x1.f5154c, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m2714b() {
        C0466lz c0466lz = (C0466lz) this.f5326e;
        ArrayList arrayList = (ArrayList) this.f5325d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0466lz) this.f5326e).m1781a((C0877x1) arrayList.get(i));
        }
        m2721i(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f5324c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0877x1 c0877x1 = (C0877x1) arrayList2.get(i2);
            int i3 = c0877x1.f5152a;
            if (i3 == 1) {
                c0466lz.m1781a(c0877x1);
                c0466lz.m1784d(c0877x1.f5153b, c0877x1.f5154c);
            } else if (i3 == 2) {
                c0466lz.m1781a(c0877x1);
                int i4 = c0877x1.f5153b;
                int i5 = c0877x1.f5154c;
                RecyclerView recyclerView = c0466lz.f3055a;
                recyclerView.m370O(i4, i5, true);
                recyclerView.f557f0 = true;
                recyclerView.f551c0.f1707c += i5;
            } else if (i3 == 4) {
                c0466lz.m1781a(c0877x1);
                c0466lz.m1783c(c0877x1.f5153b, c0877x1.f5154c);
            } else if (i3 == 8) {
                c0466lz.m1781a(c0877x1);
                c0466lz.m1785e(c0877x1.f5153b, c0877x1.f5154c);
            }
        }
        m2721i(arrayList2);
    }

    /* JADX INFO: renamed from: c */
    public void m2715c(C0877x1 c0877x1) {
        int i;
        C0048ay c0048ay = (C0048ay) this.f5323b;
        int i2 = c0877x1.f5152a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM2722j = m2722j(c0877x1.f5153b, i2);
        int i3 = c0877x1.f5153b;
        int i4 = c0877x1.f5152a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0877x1);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c0877x1.f5154c; i6++) {
            int iM2722j2 = m2722j((i * i6) + c0877x1.f5153b, c0877x1.f5152a);
            int i7 = c0877x1.f5152a;
            if (i7 == 2 ? iM2722j2 != iM2722j : !(i7 == 4 && iM2722j2 == iM2722j + 1)) {
                C0877x1 c0877x1M2719g = m2719g(i7, iM2722j, i5);
                m2716d(c0877x1M2719g, i3);
                c0048ay.mo477c(c0877x1M2719g);
                if (c0877x1.f5152a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM2722j = iM2722j2;
            } else {
                i5++;
            }
        }
        c0048ay.mo477c(c0877x1);
        if (i5 > 0) {
            C0877x1 c0877x1M2719g2 = m2719g(c0877x1.f5152a, iM2722j, i5);
            m2716d(c0877x1M2719g2, i3);
            c0048ay.mo477c(c0877x1M2719g2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2716d(C0877x1 c0877x1, int i) {
        C0466lz c0466lz = (C0466lz) this.f5326e;
        c0466lz.m1781a(c0877x1);
        int i2 = c0877x1.f5152a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0466lz.m1783c(i, c0877x1.f5154c);
        } else {
            int i3 = c0877x1.f5154c;
            RecyclerView recyclerView = c0466lz.f3055a;
            recyclerView.m370O(i, i3, true);
            recyclerView.f557f0 = true;
            recyclerView.f551c0.f1707c += i3;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m2717e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f5325d;
        int size = arrayList.size();
        while (i2 < size) {
            C0877x1 c0877x1 = (C0877x1) arrayList.get(i2);
            int i3 = c0877x1.f5152a;
            if (i3 == 8) {
                int i4 = c0877x1.f5153b;
                if (i4 == i) {
                    i = c0877x1.f5154c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0877x1.f5154c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0877x1.f5153b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0877x1.f5154c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0877x1.f5154c;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    public boolean m2718f() {
        return ((ArrayList) this.f5324c).size() > 0;
    }

    /* JADX INFO: renamed from: g */
    public C0877x1 m2719g(int i, int i2, int i3) {
        C0877x1 c0877x1 = (C0877x1) ((C0048ay) this.f5323b).mo475a();
        if (c0877x1 != null) {
            c0877x1.f5152a = i;
            c0877x1.f5153b = i2;
            c0877x1.f5154c = i3;
            return c0877x1;
        }
        C0877x1 c0877x12 = new C0877x1();
        c0877x12.f5152a = i;
        c0877x12.f5153b = i2;
        c0877x12.f5154c = i3;
        return c0877x12;
    }

    /* JADX INFO: renamed from: h */
    public void m2720h(C0877x1 c0877x1) {
        C0466lz c0466lz = (C0466lz) this.f5326e;
        ((ArrayList) this.f5325d).add(c0877x1);
        int i = c0877x1.f5152a;
        if (i == 1) {
            c0466lz.m1784d(c0877x1.f5153b, c0877x1.f5154c);
            return;
        }
        if (i == 2) {
            int i2 = c0877x1.f5153b;
            int i3 = c0877x1.f5154c;
            RecyclerView recyclerView = c0466lz.f3055a;
            recyclerView.m370O(i2, i3, false);
            recyclerView.f557f0 = true;
            return;
        }
        if (i == 4) {
            c0466lz.m1783c(c0877x1.f5153b, c0877x1.f5154c);
        } else if (i == 8) {
            c0466lz.m1785e(c0877x1.f5153b, c0877x1.f5154c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0877x1);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2721i(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0877x1 c0877x1 = (C0877x1) arrayList.get(i);
            c0877x1.getClass();
            ((C0048ay) this.f5323b).mo477c(c0877x1);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: j */
    public int m2722j(int i, int i2) {
        int i3;
        int i4;
        C0048ay c0048ay = (C0048ay) this.f5323b;
        ArrayList arrayList = (ArrayList) this.f5325d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0877x1 c0877x1 = (C0877x1) arrayList.get(size);
            int i5 = c0877x1.f5152a;
            if (i5 == 8) {
                int i6 = c0877x1.f5153b;
                int i7 = c0877x1.f5154c;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c0877x1.f5153b = i6 + 1;
                            c0877x1.f5154c = i7 + 1;
                        } else if (i2 == 2) {
                            c0877x1.f5153b = i6 - 1;
                            c0877x1.f5154c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0877x1.f5154c = i7 + 1;
                    } else if (i2 == 2) {
                        c0877x1.f5154c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0877x1.f5153b = i6 + 1;
                    } else if (i2 == 2) {
                        c0877x1.f5153b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0877x1.f5153b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0877x1.f5154c;
                    } else if (i5 == 2) {
                        i += c0877x1.f5154c;
                    }
                } else if (i2 == 1) {
                    c0877x1.f5153b = i8 + 1;
                } else if (i2 == 2) {
                    c0877x1.f5153b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0877x1 c0877x12 = (C0877x1) arrayList.get(size2);
            if (c0877x12.f5152a == 8) {
                int i9 = c0877x12.f5154c;
                if (i9 == c0877x12.f5153b || i9 < 0) {
                    arrayList.remove(size2);
                    c0048ay.mo477c(c0877x12);
                }
            } else if (c0877x12.f5154c <= 0) {
                arrayList.remove(size2);
                c0048ay.mo477c(c0877x12);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f5322a) {
            case Base64.NO_PADDING /* 1 */:
                List list = (List) this.f5326e;
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f5323b) + ", mProviderPackage: " + ((String) this.f5324c) + ", mQuery: " + ((String) this.f5325d) + ", mCertificates:");
                for (int i = 0; i < list.size(); i++) {
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        sb.append(" \"");
                        sb.append(android.util.Base64.encodeToString((byte[]) list2.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0914y1(C0466lz c0466lz) {
        this.f5322a = 0;
        this.f5323b = new C0048ay(30);
        this.f5324c = new ArrayList();
        this.f5325d = new ArrayList();
        this.f5326e = c0466lz;
        this.f5327f = new C0431l0(22, this);
    }
}
