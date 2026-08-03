package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1758;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8986 {

    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC1779 f3980;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠۟$ۥ */
    public interface InterfaceC1779 {
        /* JADX INFO: renamed from: ۥ */
        void mo4963(C1758.C8945 c8945);

        /* JADX INFO: renamed from: ۥ۟ */
        C1758.C8945 mo4964(int i, int i2, int i3, Object obj);
    }

    public C8986(InterfaceC1779 interfaceC1779) {
        this.f3980 = interfaceC1779;
    }

    /* JADX INFO: renamed from: ۥ */
    public final int m5001(List<C1758.C8945> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f3914 != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m5002(List<C1758.C8945> list) {
        while (true) {
            int iM5001 = m5001(list);
            if (iM5001 == -1) {
                return;
            } else {
                m30696(list, iM5001, iM5001 + 1);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m30695(List<C1758.C8945> list, int i, C1758.C8945 c8945, int i2, C1758.C8945 c89452) {
        int i3 = c8945.f30084;
        int i4 = c89452.f3915;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = c8945.f3915;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            c8945.f3915 = i6 + c89452.f30084;
        }
        int i7 = c89452.f3915;
        if (i7 <= i3) {
            c8945.f30084 = i3 + c89452.f30084;
        }
        c89452.f3915 = i7 + i5;
        list.set(i, c89452);
        list.set(i2, c8945);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m30696(List<C1758.C8945> list, int i, int i2) {
        C1758.C8945 c8945 = list.get(i);
        C1758.C8945 c89452 = list.get(i2);
        int i3 = c89452.f3914;
        if (i3 == 1) {
            m30695(list, i, c8945, i2, c89452);
        } else if (i3 == 2) {
            m30697(list, i, c8945, i2, c89452);
        } else {
            if (i3 != 4) {
                return;
            }
            m30698(list, i, c8945, i2, c89452);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m30697(List<C1758.C8945> list, int i, C1758.C8945 c8945, int i2, C1758.C8945 c89452) {
        boolean z;
        int i3 = c8945.f3915;
        int i4 = c8945.f30084;
        boolean z2 = false;
        if (i3 < i4) {
            if (c89452.f3915 == i3 && c89452.f30084 == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (c89452.f3915 == i4 + 1 && c89452.f30084 == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = c89452.f3915;
        if (i4 < i5) {
            c89452.f3915 = i5 - 1;
        } else {
            int i6 = c89452.f30084;
            if (i4 < i5 + i6) {
                c89452.f30084 = i6 - 1;
                c8945.f3914 = 2;
                c8945.f30084 = 1;
                if (c89452.f30084 == 0) {
                    list.remove(i2);
                    this.f3980.mo4963(c89452);
                    return;
                }
                return;
            }
        }
        int i7 = c8945.f3915;
        int i8 = c89452.f3915;
        C1758.C8945 c8945Mo4964 = null;
        if (i7 <= i8) {
            c89452.f3915 = i8 + 1;
        } else {
            int i9 = c89452.f30084;
            if (i7 < i8 + i9) {
                c8945Mo4964 = this.f3980.mo4964(2, i7 + 1, (i8 + i9) - i7, null);
                c89452.f30084 = c8945.f3915 - c89452.f3915;
            }
        }
        if (z2) {
            list.set(i, c89452);
            list.remove(i2);
            this.f3980.mo4963(c8945);
            return;
        }
        if (z) {
            if (c8945Mo4964 != null) {
                int i10 = c8945.f3915;
                if (i10 > c8945Mo4964.f3915) {
                    c8945.f3915 = i10 - c8945Mo4964.f30084;
                }
                int i11 = c8945.f30084;
                if (i11 > c8945Mo4964.f3915) {
                    c8945.f30084 = i11 - c8945Mo4964.f30084;
                }
            }
            int i12 = c8945.f3915;
            if (i12 > c89452.f3915) {
                c8945.f3915 = i12 - c89452.f30084;
            }
            int i13 = c8945.f30084;
            if (i13 > c89452.f3915) {
                c8945.f30084 = i13 - c89452.f30084;
            }
        } else {
            if (c8945Mo4964 != null) {
                int i14 = c8945.f3915;
                if (i14 >= c8945Mo4964.f3915) {
                    c8945.f3915 = i14 - c8945Mo4964.f30084;
                }
                int i15 = c8945.f30084;
                if (i15 >= c8945Mo4964.f3915) {
                    c8945.f30084 = i15 - c8945Mo4964.f30084;
                }
            }
            int i16 = c8945.f3915;
            if (i16 >= c89452.f3915) {
                c8945.f3915 = i16 - c89452.f30084;
            }
            int i17 = c8945.f30084;
            if (i17 >= c89452.f3915) {
                c8945.f30084 = i17 - c89452.f30084;
            }
        }
        list.set(i, c89452);
        if (c8945.f3915 != c8945.f30084) {
            list.set(i2, c8945);
        } else {
            list.remove(i2);
        }
        if (c8945Mo4964 != null) {
            list.add(i, c8945Mo4964);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m30698(List<C1758.C8945> list, int i, C1758.C8945 c8945, int i2, C1758.C8945 c89452) {
        C1758.C8945 c8945Mo4964;
        int i3;
        int i4;
        int i5 = c8945.f30084;
        int i6 = c89452.f3915;
        C1758.C8945 c8945Mo49642 = null;
        if (i5 >= i6) {
            int i7 = c89452.f30084;
            if (i5 < i6 + i7) {
                c89452.f30084 = i7 - 1;
                c8945Mo4964 = this.f3980.mo4964(4, c8945.f3915, 1, c89452.f30083);
            }
            i3 = c8945.f3915;
            i4 = c89452.f3915;
            if (i3 > i4) {
                c89452.f3915 = i4 + 1;
            } else {
                int i8 = c89452.f30084;
                if (i3 < i4 + i8) {
                    int i9 = (i4 + i8) - i3;
                    c8945Mo49642 = this.f3980.mo4964(4, i3 + 1, i9, c89452.f30083);
                    c89452.f30084 -= i9;
                }
            }
            list.set(i2, c8945);
            if (c89452.f30084 <= 0) {
                list.set(i, c89452);
            } else {
                list.remove(i);
                this.f3980.mo4963(c89452);
            }
            if (c8945Mo4964 != null) {
                list.add(i, c8945Mo4964);
            }
            if (c8945Mo49642 == null) {
                list.add(i, c8945Mo49642);
                return;
            }
            return;
        }
        c89452.f3915 = i6 - 1;
        c8945Mo4964 = null;
        i3 = c8945.f3915;
        i4 = c89452.f3915;
        if (i3 > i4) {
        }
        list.set(i2, c8945);
        if (c89452.f30084 <= 0) {
        }
        if (c8945Mo4964 != null) {
        }
        if (c8945Mo49642 == null) {
        }
    }
}
