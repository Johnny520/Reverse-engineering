package Yue;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5040 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥۤ$ۥ */
    public interface InterfaceC0619<T> {
        /* JADX INFO: renamed from: ۥ */
        void mo1681(T t, Rect rect);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥۤ$ۥ۟ */
    public interface InterfaceC0620<T, V> {
        /* JADX INFO: renamed from: ۥ */
        V mo1683(T t, int i);

        /* JADX INFO: renamed from: ۥ۟ */
        int mo1684(T t);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥۤ$ۥ۟۟, reason: contains not printable characters */
    public static class C5041<T> implements Comparator<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final Rect f11953 = new Rect();

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final Rect f11954 = new Rect();

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final boolean f11955;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final InterfaceC0619<T> f11956;

        public C5041(boolean z, InterfaceC0619<T> interfaceC0619) {
            this.f11955 = z;
            this.f11956 = interfaceC0619;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.f11953;
            Rect rect2 = this.f11954;
            this.f11956.mo1681(t, rect);
            this.f11956.mo1681(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f11955 ? 1 : -1;
            }
            if (i3 > i4) {
                return this.f11955 ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return this.f11955 ? 1 : -1;
            }
            if (i7 > i8) {
                return this.f11955 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m1853(int i, @InterfaceC6391 Rect rect, @InterfaceC6391 Rect rect2, @InterfaceC6391 Rect rect3) {
        boolean zM1854 = m1854(i, rect, rect2);
        if (m1854(i, rect, rect3) || !zM1854) {
            return false;
        }
        return !m15542(i, rect, rect3) || i == 17 || i == 66 || m15543(i, rect, rect2) < m15545(i, rect, rect3);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m1854(int i, @InterfaceC6391 Rect rect, @InterfaceC6391 Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static <L, T> T m15535(@InterfaceC6391 L l, @InterfaceC6391 InterfaceC0620<L, T> interfaceC0620, @InterfaceC6391 InterfaceC0619<T> interfaceC0619, @InterfaceC6490 T t, @InterfaceC6391 Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int iMo1684 = interfaceC0620.mo1684(l);
        Rect rect3 = new Rect();
        T t2 = null;
        for (int i2 = 0; i2 < iMo1684; i2++) {
            T tMo1683 = interfaceC0620.mo1683(l, i2);
            if (tMo1683 != t) {
                interfaceC0619.mo1681(tMo1683, rect3);
                if (m15540(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = tMo1683;
                }
            }
        }
        return t2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <L, T> T m15536(@InterfaceC6391 L l, @InterfaceC6391 InterfaceC0620<L, T> interfaceC0620, @InterfaceC6391 InterfaceC0619<T> interfaceC0619, @InterfaceC6490 T t, int i, boolean z, boolean z2) {
        int iMo1684 = interfaceC0620.mo1684(l);
        ArrayList arrayList = new ArrayList(iMo1684);
        for (int i2 = 0; i2 < iMo1684; i2++) {
            arrayList.add(interfaceC0620.mo1683(l, i2));
        }
        Collections.sort(arrayList, new C5041(z, interfaceC0619));
        if (i == 1) {
            return (T) m15538(t, arrayList, z2);
        }
        if (i == 2) {
            return (T) m15537(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static <T> T m15537(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int iLastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static <T> T m15538(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int iIndexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m15539(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m15540(int i, @InterfaceC6391 Rect rect, @InterfaceC6391 Rect rect2, @InterfaceC6391 Rect rect3) {
        if (!m15541(rect, rect2, i)) {
            return false;
        }
        if (m15541(rect, rect3, i) && !m1853(i, rect, rect2, rect3)) {
            return !m1853(i, rect, rect3, rect2) && m15539(m15543(i, rect, rect2), m15547(i, rect, rect2)) < m15539(m15543(i, rect, rect3), m15547(i, rect, rect3));
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m15541(@InterfaceC6391 Rect rect, @InterfaceC6391 Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m15542(int i, @InterfaceC6391 Rect rect, @InterfaceC6391 Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        }
        if (i == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i == 66) {
            return rect.right <= rect2.left;
        }
        if (i == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m15543(int i, @InterfaceC6391 Rect rect, @InterfaceC6391 Rect rect2) {
        return Math.max(0, m15544(i, rect, rect2));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static int m15544(int i, @InterfaceC6391 Rect rect, @InterfaceC6391 Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static int m15545(int i, @InterfaceC6391 Rect rect, @InterfaceC6391 Rect rect2) {
        return Math.max(1, m15546(i, rect, rect2));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static int m15546(int i, @InterfaceC6391 Rect rect, @InterfaceC6391 Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.bottom;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static int m15547(int i, @InterfaceC6391 Rect rect, @InterfaceC6391 Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
