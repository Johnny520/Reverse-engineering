package androidx.recyclerview.widget;

import java.util.ArrayList;
import p000a.C0051Cc;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1196a {

    /* JADX INFO: renamed from: d */
    public final C1218w f5060d;

    /* JADX INFO: renamed from: a */
    public final C0051Cc f5057a = new C0051Cc(30);

    /* JADX INFO: renamed from: b */
    public final ArrayList<a> f5058b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<a> f5059c = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final C1211p f5061e = new C1211p(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f5062a;

        /* JADX INFO: renamed from: b */
        public int f5063b;

        /* JADX INFO: renamed from: c */
        public int f5064c;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                int i = this.f5062a;
                if (i != aVar.f5062a) {
                    return false;
                }
                if (i != 8 || Math.abs(this.f5064c - this.f5063b) != 1 || this.f5064c != aVar.f5063b || this.f5063b != aVar.f5064c) {
                    return this.f5064c == aVar.f5064c && this.f5063b == aVar.f5063b;
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f5062a * 31) + this.f5063b) * 31) + this.f5064c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f5062a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f5063b);
            sb.append("c:");
            sb.append(this.f5064c);
            sb.append(",p:null]");
            return sb.toString();
        }
    }

    public C1196a(C1218w c1218w) {
        this.f5060d = c1218w;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2933a(int i) {
        ArrayList<a> arrayList = this.f5059c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = arrayList.get(i2);
            int i3 = aVar.f5062a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = aVar.f5063b;
                    int i5 = aVar.f5064c + i4;
                    while (i4 < i5) {
                        if (m2937e(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m2937e(aVar.f5064c, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m2934b() {
        ArrayList<a> arrayList = this.f5059c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f5060d.m2999a(arrayList.get(i));
        }
        m2941i(arrayList);
        ArrayList<a> arrayList2 = this.f5058b;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a aVar = arrayList2.get(i2);
            int i3 = aVar.f5062a;
            C1218w c1218w = this.f5060d;
            if (i3 == 1) {
                c1218w.m2999a(aVar);
                c1218w.m3002d(aVar.f5063b, aVar.f5064c);
            } else if (i3 == 2) {
                c1218w.m2999a(aVar);
                int i4 = aVar.f5063b;
                int i5 = aVar.f5064c;
                RecyclerView recyclerView = c1218w.f5198a;
                recyclerView.m2759R(i4, i5, true);
                recyclerView.f4857i0 = true;
                recyclerView.f4851f0.f4985c += i5;
            } else if (i3 == 4) {
                c1218w.m2999a(aVar);
                c1218w.m3001c(aVar.f5063b, aVar.f5064c);
            } else if (i3 == 8) {
                c1218w.m2999a(aVar);
                c1218w.m3003e(aVar.f5063b, aVar.f5064c);
            }
        }
        m2941i(arrayList2);
    }

    /* JADX INFO: renamed from: c */
    public final void m2935c(a aVar) {
        int i;
        C0051Cc c0051Cc;
        int i2 = aVar.f5062a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM2942j = m2942j(aVar.f5063b, i2);
        int i3 = aVar.f5063b;
        int i4 = aVar.f5062a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = aVar.f5064c;
            c0051Cc = this.f5057a;
            if (i5 >= i7) {
                break;
            }
            int iM2942j2 = m2942j((i * i5) + aVar.f5063b, aVar.f5062a);
            int i8 = aVar.f5062a;
            if (i8 == 2 ? iM2942j2 != iM2942j : !(i8 == 4 && iM2942j2 == iM2942j + 1)) {
                a aVarM2939g = m2939g(i8, iM2942j, i6);
                m2936d(aVarM2939g, i3);
                c0051Cc.mo130c(aVarM2939g);
                if (aVar.f5062a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                iM2942j = iM2942j2;
            } else {
                i6++;
            }
            i5++;
        }
        c0051Cc.mo130c(aVar);
        if (i6 > 0) {
            a aVarM2939g2 = m2939g(aVar.f5062a, iM2942j, i6);
            m2936d(aVarM2939g2, i3);
            c0051Cc.mo130c(aVarM2939g2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2936d(a aVar, int i) {
        C1218w c1218w = this.f5060d;
        c1218w.m2999a(aVar);
        int i2 = aVar.f5062a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c1218w.m3001c(i, aVar.f5064c);
        } else {
            int i3 = aVar.f5064c;
            RecyclerView recyclerView = c1218w.f5198a;
            recyclerView.m2759R(i, i3, true);
            recyclerView.f4857i0 = true;
            recyclerView.f4851f0.f4985c += i3;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m2937e(int i, int i2) {
        ArrayList<a> arrayList = this.f5059c;
        int size = arrayList.size();
        while (i2 < size) {
            a aVar = arrayList.get(i2);
            int i3 = aVar.f5062a;
            if (i3 == 8) {
                int i4 = aVar.f5063b;
                if (i4 == i) {
                    i = aVar.f5064c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (aVar.f5064c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = aVar.f5063b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = aVar.f5064c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += aVar.f5064c;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2938f() {
        return this.f5058b.size() > 0;
    }

    /* JADX INFO: renamed from: g */
    public final a m2939g(int i, int i2, int i3) {
        a aVar = (a) this.f5057a.mo128a();
        if (aVar != null) {
            aVar.f5062a = i;
            aVar.f5063b = i2;
            aVar.f5064c = i3;
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f5062a = i;
        aVar2.f5063b = i2;
        aVar2.f5064c = i3;
        return aVar2;
    }

    /* JADX INFO: renamed from: h */
    public final void m2940h(a aVar) {
        this.f5059c.add(aVar);
        int i = aVar.f5062a;
        C1218w c1218w = this.f5060d;
        if (i == 1) {
            c1218w.m3002d(aVar.f5063b, aVar.f5064c);
            return;
        }
        if (i == 2) {
            int i2 = aVar.f5063b;
            int i3 = aVar.f5064c;
            RecyclerView recyclerView = c1218w.f5198a;
            recyclerView.m2759R(i2, i3, false);
            recyclerView.f4857i0 = true;
            return;
        }
        if (i == 4) {
            c1218w.m3001c(aVar.f5063b, aVar.f5064c);
        } else if (i == 8) {
            c1218w.m3003e(aVar.f5063b, aVar.f5064c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2941i(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) arrayList.get(i);
            aVar.getClass();
            this.f5057a.mo130c(aVar);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: j */
    public final int m2942j(int i, int i2) {
        int i3;
        int i4;
        ArrayList<a> arrayList = this.f5059c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = arrayList.get(size);
            int i5 = aVar.f5062a;
            if (i5 == 8) {
                int i6 = aVar.f5063b;
                int i7 = aVar.f5064c;
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
                            aVar.f5063b = i6 + 1;
                            aVar.f5064c = i7 + 1;
                        } else if (i2 == 2) {
                            aVar.f5063b = i6 - 1;
                            aVar.f5064c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        aVar.f5064c = i7 + 1;
                    } else if (i2 == 2) {
                        aVar.f5064c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        aVar.f5063b = i6 + 1;
                    } else if (i2 == 2) {
                        aVar.f5063b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = aVar.f5063b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= aVar.f5064c;
                    } else if (i5 == 2) {
                        i += aVar.f5064c;
                    }
                } else if (i2 == 1) {
                    aVar.f5063b = i8 + 1;
                } else if (i2 == 2) {
                    aVar.f5063b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = arrayList.get(size2);
            int i9 = aVar2.f5062a;
            C0051Cc c0051Cc = this.f5057a;
            if (i9 == 8) {
                int i10 = aVar2.f5064c;
                if (i10 == aVar2.f5063b || i10 < 0) {
                    arrayList.remove(size2);
                    c0051Cc.mo130c(aVar2);
                }
            } else if (aVar2.f5064c <= 0) {
                arrayList.remove(size2);
                c0051Cc.mo130c(aVar2);
            }
        }
        return i;
    }
}
