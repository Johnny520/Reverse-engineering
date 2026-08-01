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
    public final /* synthetic */ int f5245a;

    /* JADX INFO: renamed from: b */
    public final Object f5246b;

    /* JADX INFO: renamed from: c */
    public final Serializable f5247c;

    /* JADX INFO: renamed from: d */
    public final Serializable f5248d;

    /* JADX INFO: renamed from: e */
    public final Object f5249e;

    /* JADX INFO: renamed from: f */
    public final Object f5250f;

    public C0914y1(String str, String str2, String str3, List list) {
        this.f5245a = 1;
        str.getClass();
        this.f5246b = str;
        str2.getClass();
        this.f5247c = str2;
        this.f5248d = str3;
        list.getClass();
        this.f5249e = list;
        this.f5250f = str + "-" + str2 + "-" + str3;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2643a(int i) {
        ArrayList arrayList = (ArrayList) this.f5248d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0877x1 c0877x1 = (C0877x1) arrayList.get(i2);
            int i3 = c0877x1.f5080a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c0877x1.f5081b;
                    int i5 = c0877x1.f5082c + i4;
                    while (i4 < i5) {
                        if (m2647e(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m2647e(c0877x1.f5082c, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m2644b() {
        C0205ez c0205ez = (C0205ez) this.f5249e;
        ArrayList arrayList = (ArrayList) this.f5248d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0205ez) this.f5249e).m1093a((C0877x1) arrayList.get(i));
        }
        m2651i(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f5247c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0877x1 c0877x1 = (C0877x1) arrayList2.get(i2);
            int i3 = c0877x1.f5080a;
            if (i3 == 1) {
                c0205ez.m1093a(c0877x1);
                c0205ez.m1096d(c0877x1.f5081b, c0877x1.f5082c);
            } else if (i3 == 2) {
                c0205ez.m1093a(c0877x1);
                int i4 = c0877x1.f5081b;
                int i5 = c0877x1.f5082c;
                RecyclerView recyclerView = c0205ez.f1865a;
                recyclerView.m385O(i4, i5, true);
                recyclerView.f594f0 = true;
                recyclerView.f588c0.f5417c += i5;
            } else if (i3 == 4) {
                c0205ez.m1093a(c0877x1);
                c0205ez.m1095c(c0877x1.f5081b, c0877x1.f5082c);
            } else if (i3 == 8) {
                c0205ez.m1093a(c0877x1);
                c0205ez.m1097e(c0877x1.f5081b, c0877x1.f5082c);
            }
        }
        m2651i(arrayList2);
    }

    /* JADX INFO: renamed from: c */
    public void m2645c(C0877x1 c0877x1) {
        int i;
        C0724sx c0724sx = (C0724sx) this.f5246b;
        int i2 = c0877x1.f5080a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM2652j = m2652j(c0877x1.f5081b, i2);
        int i3 = c0877x1.f5081b;
        int i4 = c0877x1.f5080a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0877x1);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c0877x1.f5082c; i6++) {
            int iM2652j2 = m2652j((i * i6) + c0877x1.f5081b, c0877x1.f5080a);
            int i7 = c0877x1.f5080a;
            if (i7 == 2 ? iM2652j2 != iM2652j : !(i7 == 4 && iM2652j2 == iM2652j + 1)) {
                C0877x1 c0877x1M2649g = m2649g(i7, iM2652j, i5);
                m2646d(c0877x1M2649g, i3);
                c0724sx.mo2340c(c0877x1M2649g);
                if (c0877x1.f5080a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM2652j = iM2652j2;
            } else {
                i5++;
            }
        }
        c0724sx.mo2340c(c0877x1);
        if (i5 > 0) {
            C0877x1 c0877x1M2649g2 = m2649g(c0877x1.f5080a, iM2652j, i5);
            m2646d(c0877x1M2649g2, i3);
            c0724sx.mo2340c(c0877x1M2649g2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2646d(C0877x1 c0877x1, int i) {
        C0205ez c0205ez = (C0205ez) this.f5249e;
        c0205ez.m1093a(c0877x1);
        int i2 = c0877x1.f5080a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0205ez.m1095c(i, c0877x1.f5082c);
        } else {
            int i3 = c0877x1.f5082c;
            RecyclerView recyclerView = c0205ez.f1865a;
            recyclerView.m385O(i, i3, true);
            recyclerView.f594f0 = true;
            recyclerView.f588c0.f5417c += i3;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m2647e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f5248d;
        int size = arrayList.size();
        while (i2 < size) {
            C0877x1 c0877x1 = (C0877x1) arrayList.get(i2);
            int i3 = c0877x1.f5080a;
            if (i3 == 8) {
                int i4 = c0877x1.f5081b;
                if (i4 == i) {
                    i = c0877x1.f5082c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0877x1.f5082c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0877x1.f5081b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0877x1.f5082c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0877x1.f5082c;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    public boolean m2648f() {
        return ((ArrayList) this.f5247c).size() > 0;
    }

    /* JADX INFO: renamed from: g */
    public C0877x1 m2649g(int i, int i2, int i3) {
        C0877x1 c0877x1 = (C0877x1) ((C0724sx) this.f5246b).mo2338a();
        if (c0877x1 != null) {
            c0877x1.f5080a = i;
            c0877x1.f5081b = i2;
            c0877x1.f5082c = i3;
            return c0877x1;
        }
        C0877x1 c0877x12 = new C0877x1();
        c0877x12.f5080a = i;
        c0877x12.f5081b = i2;
        c0877x12.f5082c = i3;
        return c0877x12;
    }

    /* JADX INFO: renamed from: h */
    public void m2650h(C0877x1 c0877x1) {
        C0205ez c0205ez = (C0205ez) this.f5249e;
        ((ArrayList) this.f5248d).add(c0877x1);
        int i = c0877x1.f5080a;
        if (i == 1) {
            c0205ez.m1096d(c0877x1.f5081b, c0877x1.f5082c);
            return;
        }
        if (i == 2) {
            int i2 = c0877x1.f5081b;
            int i3 = c0877x1.f5082c;
            RecyclerView recyclerView = c0205ez.f1865a;
            recyclerView.m385O(i2, i3, false);
            recyclerView.f594f0 = true;
            return;
        }
        if (i == 4) {
            c0205ez.m1095c(c0877x1.f5081b, c0877x1.f5082c);
        } else if (i == 8) {
            c0205ez.m1097e(c0877x1.f5081b, c0877x1.f5082c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0877x1);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2651i(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0877x1 c0877x1 = (C0877x1) arrayList.get(i);
            c0877x1.getClass();
            ((C0724sx) this.f5246b).mo2340c(c0877x1);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: j */
    public int m2652j(int i, int i2) {
        int i3;
        int i4;
        C0724sx c0724sx = (C0724sx) this.f5246b;
        ArrayList arrayList = (ArrayList) this.f5248d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0877x1 c0877x1 = (C0877x1) arrayList.get(size);
            int i5 = c0877x1.f5080a;
            if (i5 == 8) {
                int i6 = c0877x1.f5081b;
                int i7 = c0877x1.f5082c;
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
                            c0877x1.f5081b = i6 + 1;
                            c0877x1.f5082c = i7 + 1;
                        } else if (i2 == 2) {
                            c0877x1.f5081b = i6 - 1;
                            c0877x1.f5082c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0877x1.f5082c = i7 + 1;
                    } else if (i2 == 2) {
                        c0877x1.f5082c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0877x1.f5081b = i6 + 1;
                    } else if (i2 == 2) {
                        c0877x1.f5081b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0877x1.f5081b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0877x1.f5082c;
                    } else if (i5 == 2) {
                        i += c0877x1.f5082c;
                    }
                } else if (i2 == 1) {
                    c0877x1.f5081b = i8 + 1;
                } else if (i2 == 2) {
                    c0877x1.f5081b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0877x1 c0877x12 = (C0877x1) arrayList.get(size2);
            if (c0877x12.f5080a == 8) {
                int i9 = c0877x12.f5082c;
                if (i9 == c0877x12.f5081b || i9 < 0) {
                    arrayList.remove(size2);
                    c0724sx.mo2340c(c0877x12);
                }
            } else if (c0877x12.f5082c <= 0) {
                arrayList.remove(size2);
                c0724sx.mo2340c(c0877x12);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f5245a) {
            case Base64.NO_PADDING /* 1 */:
                List list = (List) this.f5249e;
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f5246b) + ", mProviderPackage: " + ((String) this.f5247c) + ", mQuery: " + ((String) this.f5248d) + ", mCertificates:");
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

    public C0914y1(C0205ez c0205ez) {
        this.f5245a = 0;
        this.f5246b = new C0724sx(30);
        this.f5247c = new ArrayList();
        this.f5248d = new ArrayList();
        this.f5249e = c0205ez;
        this.f5250f = new C0431l0(22, this);
    }
}
