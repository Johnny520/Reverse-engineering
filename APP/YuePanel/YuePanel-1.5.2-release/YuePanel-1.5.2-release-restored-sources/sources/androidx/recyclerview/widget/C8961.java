package androidx.recyclerview.widget;

import Yue.C3528;
import Yue.InterfaceC5459;
import Yue.InterfaceC5736;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8961 {

    /* JADX INFO: renamed from: ۥ */
    public static final Comparator<C8966> f3941 = new C1767();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ */
    public static class C1767 implements Comparator<C8966> {
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public int compare(C8966 c8966, C8966 c89662) {
            int i = c8966.f3948 - c89662.f3948;
            return i == 0 ? c8966.f3949 - c89662.f3949 : i;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟ */
    public static abstract class AbstractC1768 {
        /* JADX INFO: renamed from: ۥ */
        public abstract boolean mo4972(int i, int i2);

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract boolean mo4973(int i, int i2);

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟ */
        public Object mo30527(int i, int i2) {
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public abstract int mo30528();

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public abstract int mo30529();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟, reason: contains not printable characters */
    public static class C8962 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f30147 = -1;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f30148 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f30149 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final int f30150 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final int f30151 = 8;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static final int f30152 = 16;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static final int f30153 = 5;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final int f30154 = 31;

        /* JADX INFO: renamed from: ۥ */
        public final List<C8966> f3942;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int[] f3943;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int[] f30155;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final AbstractC1768 f30156;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final int f30157;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int f30158;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean f30159;

        public C8962(AbstractC1768 abstractC1768, List<C8966> list, int[] iArr, int[] iArr2, boolean z) {
            this.f3942 = list;
            this.f3943 = iArr;
            this.f30155 = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f30156 = abstractC1768;
            this.f30157 = abstractC1768.mo30529();
            this.f30158 = abstractC1768.mo30528();
            this.f30159 = z;
            m4982();
            m30577();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static C8964 m30569(List<C8964> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C8964 c8964 = list.get(size);
                if (c8964.f3944 == i && c8964.f30160 == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f3945 += z ? 1 : -1;
                        size++;
                    }
                    return c8964;
                }
                size--;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m4982() {
            C8966 c8966 = this.f3942.isEmpty() ? null : this.f3942.get(0);
            if (c8966 != null && c8966.f3948 == 0 && c8966.f3949 == 0) {
                return;
            }
            C8966 c89662 = new C8966();
            c89662.f3948 = 0;
            c89662.f3949 = 0;
            c89662.f30164 = false;
            c89662.f30163 = 0;
            c89662.f30165 = false;
            this.f3942.add(0, c89662);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m4983(@InterfaceC5459(from = 0) int i) {
            if (i >= 0 && i < this.f30158) {
                int i2 = this.f30155[i];
                if ((i2 & 31) == 0) {
                    return -1;
                }
                return i2 >> 5;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", new list size = " + this.f30158);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m30570(@InterfaceC5459(from = 0) int i) {
            if (i >= 0 && i < this.f30157) {
                int i2 = this.f3943[i];
                if ((i2 & 31) == 0) {
                    return -1;
                }
                return i2 >> 5;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.f30157);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m30571(List<C8964> list, InterfaceC5736 interfaceC5736, int i, int i2, int i3) {
            if (!this.f30159) {
                interfaceC5736.mo596(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f30155[i5];
                int i7 = i6 & 31;
                if (i7 == 0) {
                    interfaceC5736.mo596(i, 1);
                    Iterator<C8964> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().f3945++;
                    }
                } else if (i7 == 4 || i7 == 8) {
                    int i8 = i6 >> 5;
                    interfaceC5736.mo595(m30569(list, i8, true).f3945, i);
                    if (i7 == 4) {
                        interfaceC5736.mo9455(i, 1, this.f30156.mo30527(i8, i5));
                    }
                } else {
                    if (i7 != 16) {
                        throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString(i7));
                    }
                    list.add(new C8964(i5, i, false));
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m30572(List<C8964> list, InterfaceC5736 interfaceC5736, int i, int i2, int i3) {
            if (!this.f30159) {
                interfaceC5736.mo9454(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f3943[i5];
                int i7 = i6 & 31;
                if (i7 == 0) {
                    interfaceC5736.mo9454(i + i4, 1);
                    Iterator<C8964> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().f3945--;
                    }
                } else if (i7 == 4 || i7 == 8) {
                    int i8 = i6 >> 5;
                    C8964 c8964M30569 = m30569(list, i8, false);
                    interfaceC5736.mo595(i + i4, c8964M30569.f3945 - 1);
                    if (i7 == 4) {
                        interfaceC5736.mo9455(c8964M30569.f3945 - 1, 1, this.f30156.mo30527(i5, i8));
                    }
                } else {
                    if (i7 != 16) {
                        throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString(i7));
                    }
                    list.add(new C8964(i5, i + i4, true));
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m30573(@InterfaceC6391 InterfaceC5736 interfaceC5736) {
            C3528 c3528 = interfaceC5736 instanceof C3528 ? (C3528) interfaceC5736 : new C3528(interfaceC5736);
            List<C8964> arrayList = new ArrayList<>();
            int i = this.f30157;
            int i2 = this.f30158;
            for (int size = this.f3942.size() - 1; size >= 0; size--) {
                C8966 c8966 = this.f3942.get(size);
                int i3 = c8966.f30163;
                int i4 = c8966.f3948 + i3;
                int i5 = c8966.f3949 + i3;
                if (i4 < i) {
                    m30572(arrayList, c3528, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m30571(arrayList, c3528, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.f3943;
                    int i7 = c8966.f3948;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        c3528.mo9455(i7 + i6, 1, this.f30156.mo30527(i7 + i6, c8966.f3949 + i6));
                    }
                }
                i = c8966.f3948;
                i2 = c8966.f3949;
            }
            c3528.m9456();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m30574(@InterfaceC6391 RecyclerView.AbstractC8909 abstractC8909) {
            m30573(new C1759(abstractC8909));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m30575(int i, int i2, int i3) {
            if (this.f3943[i - 1] != 0) {
                return;
            }
            m30576(i, i2, i3, false);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final boolean m30576(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            int i6;
            if (z) {
                i2--;
                i5 = i;
                i4 = i2;
            } else {
                i4 = i - 1;
                i5 = i4;
            }
            while (i3 >= 0) {
                C8966 c8966 = this.f3942.get(i3);
                int i7 = c8966.f3948;
                int i8 = c8966.f30163;
                int i9 = i7 + i8;
                int i10 = c8966.f3949 + i8;
                if (z) {
                    for (int i11 = i5 - 1; i11 >= i9; i11--) {
                        if (this.f30156.mo4973(i11, i4)) {
                            i6 = this.f30156.mo4972(i11, i4) ? 8 : 4;
                            this.f30155[i4] = (i11 << 5) | 16;
                            this.f3943[i11] = (i4 << 5) | i6;
                            return true;
                        }
                    }
                } else {
                    for (int i12 = i2 - 1; i12 >= i10; i12--) {
                        if (this.f30156.mo4973(i4, i12)) {
                            i6 = this.f30156.mo4972(i4, i12) ? 8 : 4;
                            int i13 = i - 1;
                            this.f3943[i13] = (i12 << 5) | 16;
                            this.f30155[i12] = (i13 << 5) | i6;
                            return true;
                        }
                    }
                }
                i5 = c8966.f3948;
                i2 = c8966.f3949;
                i3--;
            }
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m30577() {
            int i = this.f30157;
            int i2 = this.f30158;
            for (int size = this.f3942.size() - 1; size >= 0; size--) {
                C8966 c8966 = this.f3942.get(size);
                int i3 = c8966.f3948;
                int i4 = c8966.f30163;
                int i5 = i3 + i4;
                int i6 = c8966.f3949 + i4;
                if (this.f30159) {
                    while (i > i5) {
                        m30575(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        m30578(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < c8966.f30163; i7++) {
                    int i8 = c8966.f3948 + i7;
                    int i9 = c8966.f3949 + i7;
                    int i10 = this.f30156.mo4972(i8, i9) ? 1 : 2;
                    this.f3943[i8] = (i9 << 5) | i10;
                    this.f30155[i9] = (i8 << 5) | i10;
                }
                i = c8966.f3948;
                i2 = c8966.f3949;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final void m30578(int i, int i2, int i3) {
            if (this.f30155[i2 - 1] != 0) {
                return;
            }
            m30576(i, i2, i3, true);
        }

        @InterfaceC8392
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public List<C8966> m30579() {
            return this.f3942;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC8963<T> {
        /* JADX INFO: renamed from: ۥ */
        public abstract boolean m4984(@InterfaceC6391 T t, @InterfaceC6391 T t2);

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract boolean m4985(@InterfaceC6391 T t, @InterfaceC6391 T t2);

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Object m30580(@InterfaceC6391 T t, @InterfaceC6391 T t2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C8964 {

        /* JADX INFO: renamed from: ۥ */
        public int f3944;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3945;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f30160;

        public C8964(int i, int i2, boolean z) {
            this.f3944 = i;
            this.f3945 = i2;
            this.f30160 = z;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C8965 {

        /* JADX INFO: renamed from: ۥ */
        public int f3946;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3947;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f30161;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f30162;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8965() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8965(int i, int i2, int i3, int i4) {
            this.f3946 = i;
            this.f3947 = i2;
            this.f30161 = i3;
            this.f30162 = i4;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C8966 {

        /* JADX INFO: renamed from: ۥ */
        public int f3948;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3949;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f30163;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f30164;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f30165;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static C8962 m4979(@InterfaceC6391 AbstractC1768 abstractC1768) {
        return m4980(abstractC1768, true);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static C8962 m4980(@InterfaceC6391 AbstractC1768 abstractC1768, boolean z) {
        int iMo30529 = abstractC1768.mo30529();
        int iMo30528 = abstractC1768.mo30528();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C8965(0, iMo30529, 0, iMo30528));
        int iAbs = iMo30529 + iMo30528 + Math.abs(iMo30529 - iMo30528);
        int i = iAbs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C8965 c8965 = (C8965) arrayList2.remove(arrayList2.size() - 1);
            C8966 c8966M30568 = m30568(abstractC1768, c8965.f3946, c8965.f3947, c8965.f30161, c8965.f30162, iArr, iArr2, iAbs);
            if (c8966M30568 != null) {
                if (c8966M30568.f30163 > 0) {
                    arrayList.add(c8966M30568);
                }
                c8966M30568.f3948 += c8965.f3946;
                c8966M30568.f3949 += c8965.f30161;
                C8965 c89652 = arrayList3.isEmpty() ? new C8965() : (C8965) arrayList3.remove(arrayList3.size() - 1);
                c89652.f3946 = c8965.f3946;
                c89652.f30161 = c8965.f30161;
                if (c8966M30568.f30165) {
                    c89652.f3947 = c8966M30568.f3948;
                    c89652.f30162 = c8966M30568.f3949;
                } else if (c8966M30568.f30164) {
                    c89652.f3947 = c8966M30568.f3948 - 1;
                    c89652.f30162 = c8966M30568.f3949;
                } else {
                    c89652.f3947 = c8966M30568.f3948;
                    c89652.f30162 = c8966M30568.f3949 - 1;
                }
                arrayList2.add(c89652);
                if (!c8966M30568.f30165) {
                    int i2 = c8966M30568.f3948;
                    int i3 = c8966M30568.f30163;
                    c8965.f3946 = i2 + i3;
                    c8965.f30161 = c8966M30568.f3949 + i3;
                } else if (c8966M30568.f30164) {
                    int i4 = c8966M30568.f3948;
                    int i5 = c8966M30568.f30163;
                    c8965.f3946 = i4 + i5 + 1;
                    c8965.f30161 = c8966M30568.f3949 + i5;
                } else {
                    int i6 = c8966M30568.f3948;
                    int i7 = c8966M30568.f30163;
                    c8965.f3946 = i6 + i7;
                    c8965.f30161 = c8966M30568.f3949 + i7 + 1;
                }
                arrayList2.add(c8965);
            } else {
                arrayList3.add(c8965);
            }
        }
        Collections.sort(arrayList, f3941);
        return new C8962(abstractC1768, arrayList, iArr, iArr2, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r14v7, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r14v8, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r14v9, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:52:0x00ca
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.recyclerview.widget.C8961.C8966 m30568(androidx.recyclerview.widget.C8961.AbstractC1768 r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L129
            if (r4 >= r5) goto L11
            goto L129
        L11:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L2d
            r8 = r5
            goto L2e
        L2d:
            r8 = r10
        L2e:
            r9 = r10
        L2f:
            if (r9 > r7) goto L121
            int r11 = -r9
            r12 = r11
        L33:
            if (r12 > r9) goto L9d
            if (r12 == r11) goto L4d
            if (r12 == r9) goto L45
            int r13 = r26 + r12
            int r14 = r13 + (-1)
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L45
            goto L4d
        L45:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = r5
            goto L53
        L4d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = r10
        L53:
            int r15 = r13 - r12
        L55:
            if (r13 >= r3) goto L6a
            if (r15 >= r4) goto L6a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.mo4973(r10, r5)
            if (r5 == 0) goto L6a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L55
        L6a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L97
            int r10 = r6 - r9
            r15 = 1
            int r10 = r10 + r15
            if (r12 < r10) goto L97
            int r10 = r6 + r9
            int r10 = r10 - r15
            if (r12 > r10) goto L97
            r10 = r2[r5]
            if (r13 < r10) goto L97
            androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ r0 = new androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ
            r0.<init>()
            r2 = r2[r5]
            r0.f3948 = r2
            int r3 = r2 - r12
            r0.f3949 = r3
            r1 = r1[r5]
            int r1 = r1 - r2
            r0.f30163 = r1
            r0.f30164 = r14
            r15 = 0
            r0.f30165 = r15
            return r0
        L97:
            r15 = 0
            int r12 = r12 + 2
            r10 = r15
            r5 = 1
            goto L33
        L9d:
            r15 = r10
            r5 = r11
        L9f:
            if (r5 > r9) goto L116
            int r10 = r5 + r6
            int r12 = r9 + r6
            if (r10 == r12) goto Lc1
            int r12 = r11 + r6
            if (r10 == r12) goto Lb8
            int r12 = r26 + r10
            int r13 = r12 + (-1)
            r13 = r2[r13]
            r14 = 1
            int r12 = r12 + r14
            r12 = r2[r12]
            if (r13 >= r12) goto Lb9
            goto Lc2
        Lb8:
            r14 = 1
        Lb9:
            int r12 = r26 + r10
            int r12 = r12 + r14
            r12 = r2[r12]
            int r12 = r12 - r14
            r13 = r14
            goto Lc8
        Lc1:
            r14 = 1
        Lc2:
            int r12 = r26 + r10
            int r12 = r12 - r14
            r12 = r2[r12]
            r13 = r15
        Lc8:
            int r16 = r12 - r10
        Lca:
            if (r12 <= 0) goto Le7
            if (r16 <= 0) goto Le7
            int r17 = r20 + r12
            int r15 = r17 + (-1)
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + (-1)
            boolean r3 = r0.mo4973(r15, r3)
            if (r3 == 0) goto Le9
            int r12 = r12 + (-1)
            int r16 = r16 + (-1)
            r3 = r18
            r14 = 1
            r15 = 0
            goto Lca
        Le7:
            r18 = r3
        Le9:
            int r3 = r26 + r10
            r2[r3] = r12
            if (r8 != 0) goto L10f
            if (r10 < r11) goto L10f
            if (r10 > r9) goto L10f
            r14 = r1[r3]
            if (r14 < r12) goto L10f
            androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ r0 = new androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ
            r0.<init>()
            r2 = r2[r3]
            r0.f3948 = r2
            int r4 = r2 - r10
            r0.f3949 = r4
            r1 = r1[r3]
            int r1 = r1 - r2
            r0.f30163 = r1
            r0.f30164 = r13
            r3 = 1
            r0.f30165 = r3
            return r0
        L10f:
            r3 = 1
            int r5 = r5 + 2
            r3 = r18
            r15 = 0
            goto L9f
        L116:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r5 = r3
            r3 = r18
            r10 = 0
            goto L2f
        L121:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L129:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C8961.m30568(androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.ۥ۟۟۟ۡ$ۥ۟۟۟ۡ");
    }
}
