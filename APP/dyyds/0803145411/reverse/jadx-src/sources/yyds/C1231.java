package yyds;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛵᲇᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1231 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Object f5644;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f5645;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f5646;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f5647;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Object f5648;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f5649;

    public C1231(C2378 c2378) {
        this.f5646 = new C1135(30);
        this.f5647 = new ArrayList();
        this.f5649 = new ArrayList();
        this.f5645 = 0;
        this.f5644 = c2378;
        this.f5648 = new C2014(11, this);
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static C1231 m2504(C1231 c1231, C0680 c0680, C0680 c06802) {
        if (c1231 == null) {
            return null;
        }
        C0680 c06803 = (C0680) c1231.f5646;
        C1231 c1231M2504 = m2504((C1231) c1231.f5648, c0680, c06802);
        c1231.f5648 = c1231M2504;
        int i = c06803.f3242;
        C0680 c06804 = (C0680) c1231.f5647;
        int i2 = c06804.f3242;
        int i3 = c0680.f3242;
        int i4 = c06802 == null ? Integer.MAX_VALUE : c06802.f3242;
        if (i3 >= i2 || i4 <= i) {
            return c1231;
        }
        if (i3 <= i) {
            return i4 >= i2 ? c1231M2504 : new C1231(c1231, c06802, c06804);
        }
        if (i4 >= i2) {
            return new C1231(c1231, c06803, c0680);
        }
        c1231.f5648 = new C1231(c1231, c06802, c06804);
        return new C1231(c1231, c06803, c0680);
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public void m2505(int i) {
        ColorStateList colorStateListM3180;
        this.f5645 = i;
        C1541 c1541 = (C1541) this.f5647;
        if (c1541 != null) {
            Context context = ((View) this.f5646).getContext();
            synchronized (c1541) {
                colorStateListM3180 = c1541.f7388.m3180(context, i);
            }
        } else {
            colorStateListM3180 = null;
        }
        m2521(colorStateListM3180);
        m2510();
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public ColorStateList m2506() {
        C2731 c2731 = (C2731) this.f5644;
        if (c2731 != null) {
            return (ColorStateList) c2731.f13430;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public void m2507() {
        this.f5645 = -1;
        m2521(null);
        m2510();
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public PorterDuff.Mode m2508() {
        C2731 c2731 = (C2731) this.f5644;
        if (c2731 != null) {
            return (PorterDuff.Mode) c2731.f13431;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public void m2509(C1931 c1931) {
        int i;
        C1135 c1135 = (C1135) this.f5646;
        int i2 = c1931.f9729;
        if (i2 == 1 || i2 == 8) {
            C0188.m798("should not dispatch add or move for pre layout");
            return;
        }
        int iM2516 = m2516(c1931.f9730, i2);
        int i3 = c1931.f9730;
        int i4 = c1931.f9729;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                C0188.m795(c1931, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c1931.f9732; i6++) {
            int iM25162 = m2516((i * i6) + c1931.f9730, c1931.f9729);
            int i7 = c1931.f9729;
            if (i7 == 2 ? iM25162 != iM2516 : !(i7 == 4 && iM25162 == iM2516 + 1)) {
                C1931 c1931M2519 = m2519(c1931.f9731, i7, iM2516, i5);
                m2524(c1931M2519, i3);
                c1931M2519.f9731 = null;
                c1135.mo1557(c1931M2519);
                if (c1931.f9729 == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM2516 = iM25162;
            } else {
                i5++;
            }
        }
        Object obj = c1931.f9731;
        c1931.f9731 = null;
        c1135.mo1557(c1931);
        if (i5 > 0) {
            C1931 c1931M25192 = m2519(obj, c1931.f9729, iM2516, i5);
            m2524(c1931M25192, i3);
            c1931M25192.f9731 = null;
            c1135.mo1557(c1931M25192);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m2510() {
        View view = (View) this.f5646;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C2731) this.f5649) != null) {
                C2731 c2731 = (C2731) this.f5648;
                if (c2731 == null) {
                    c2731 = new C2731();
                    this.f5648 = c2731;
                }
                c2731.f13430 = null;
                c2731.f13429 = false;
                c2731.f13431 = null;
                c2731.f13428 = false;
                WeakHashMap weakHashMap = AbstractC1640.f8352;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    c2731.f13429 = true;
                    c2731.f13430 = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    c2731.f13428 = true;
                    c2731.f13431 = backgroundTintMode;
                }
                if (c2731.f13429 || c2731.f13428) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = C1541.f7386;
                    C1542.m3173(background, c2731, drawableState);
                    return;
                }
            }
            C2731 c27312 = (C2731) this.f5644;
            if (c27312 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = C1541.f7386;
                C1542.m3173(background, c27312, drawableState2);
            } else {
                C2731 c27313 = (C2731) this.f5649;
                if (c27313 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = C1541.f7386;
                    C1542.m3173(background, c27313, drawableState3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public void m2511(ColorStateList colorStateList) {
        C2731 c2731 = (C2731) this.f5644;
        if (c2731 == null) {
            c2731 = new C2731();
            this.f5644 = c2731;
        }
        c2731.f13430 = colorStateList;
        c2731.f13429 = true;
        m2510();
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public void m2512(C1931 c1931) {
        C2378 c2378 = (C2378) this.f5644;
        ((ArrayList) this.f5649).add(c1931);
        int i = c1931.f9729;
        if (i == 1) {
            c2378.m4422(c1931.f9730, c1931.f9732);
            return;
        }
        if (i == 2) {
            int i2 = c1931.f9730;
            int i3 = c1931.f9732;
            C1213 c1213 = c2378.f11724;
            c1213.m2420(i2, i3, false);
            c1213.f5538 = true;
            return;
        }
        if (i == 4) {
            c2378.m4421(c1931.f9730, c1931.f9732, c1931.f9731);
        } else if (i == 8) {
            c2378.m4417(c1931.f9730, c1931.f9732);
        } else {
            C0188.m795(c1931, "Unknown update op type for ");
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public boolean m2513(int i) {
        ArrayList arrayList = (ArrayList) this.f5649;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1931 c1931 = (C1931) arrayList.get(i2);
            int i3 = c1931.f9729;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c1931.f9730;
                    int i5 = c1931.f9732 + i4;
                    while (i4 < i5) {
                        if (m2515(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m2515(c1931.f9732, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public void m2514(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1931 c1931 = (C1931) arrayList.get(i);
            c1931.f9731 = null;
            ((C1135) this.f5646).mo1557(c1931);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int m2515(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f5649;
        int size = arrayList.size();
        while (i2 < size) {
            C1931 c1931 = (C1931) arrayList.get(i2);
            int i3 = c1931.f9729;
            int i4 = c1931.f9730;
            if (i3 == 8) {
                if (i4 == i) {
                    i = c1931.f9732;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c1931.f9732 <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = c1931.f9732;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += c1931.f9732;
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public int m2516(int i, int i2) {
        int i3;
        int i4;
        C1135 c1135 = (C1135) this.f5646;
        ArrayList arrayList = (ArrayList) this.f5649;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1931 c1931 = (C1931) arrayList.get(size);
            int i5 = c1931.f9729;
            int i6 = c1931.f9730;
            if (i5 == 8) {
                int i7 = c1931.f9732;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c1931.f9730 = i6 + 1;
                            c1931.f9732 = i7 + 1;
                        } else if (i2 == 2) {
                            c1931.f9730 = i6 - 1;
                            c1931.f9732 = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        c1931.f9732 = i7 + 1;
                    } else if (i2 == 2) {
                        c1931.f9732 = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c1931.f9730 = i6 + 1;
                    } else if (i2 == 2) {
                        c1931.f9730 = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= c1931.f9732;
                } else if (i5 == 2) {
                    i += c1931.f9732;
                }
            } else if (i2 == 1) {
                c1931.f9730 = i6 + 1;
            } else if (i2 == 2) {
                c1931.f9730 = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C1931 c19312 = (C1931) arrayList.get(size2);
            int i8 = c19312.f9729;
            int i9 = c19312.f9732;
            if (i8 == 8) {
                if (i9 == c19312.f9730 || i9 < 0) {
                    arrayList.remove(size2);
                    c19312.f9731 = null;
                    c1135.mo1557(c19312);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                c19312.f9731 = null;
                c1135.mo1557(c19312);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public void m2517(PorterDuff.Mode mode) {
        C2731 c2731 = (C2731) this.f5644;
        if (c2731 == null) {
            c2731 = new C2731();
            this.f5644 = c2731;
        }
        c2731.f13431 = mode;
        c2731.f13428 = true;
        m2510();
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public void m2518(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM3180;
        View view = (View) this.f5646;
        Context context = view.getContext();
        int[] iArr = AbstractC1592.f8099;
        C0644 c0644M1535 = C0644.m1535(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0644M1535.f3099;
        View view2 = (View) this.f5646;
        Context context2 = view2.getContext();
        TypedArray typedArray2 = (TypedArray) c0644M1535.f3099;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        AbstractC1256.m2535(view2, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f5645 = typedArray.getResourceId(0, -1);
                C1541 c1541 = (C1541) this.f5647;
                Context context3 = view.getContext();
                int i2 = this.f5645;
                synchronized (c1541) {
                    colorStateListM3180 = c1541.f7388.m3180(context3, i2);
                }
                if (colorStateListM3180 != null) {
                    m2521(colorStateListM3180);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(c0644M1535.m1556(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AbstractC2137.m4076(typedArray.getInt(2, -1), null));
            }
            c0644M1535.m1568();
        } catch (Throwable th) {
            c0644M1535.m1568();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public C1931 m2519(Object obj, int i, int i2, int i3) {
        C1931 c1931 = (C1931) ((C1135) this.f5646).mo1548();
        if (c1931 != null) {
            c1931.f9729 = i;
            c1931.f9730 = i2;
            c1931.f9732 = i3;
            c1931.f9731 = obj;
            return c1931;
        }
        C1931 c19312 = new C1931();
        c19312.f9729 = i;
        c19312.f9730 = i2;
        c19312.f9732 = i3;
        c19312.f9731 = obj;
        return c19312;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean m2520() {
        return ((ArrayList) this.f5647).size() > 0;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public void m2521(ColorStateList colorStateList) {
        if (colorStateList != null) {
            C2731 c2731 = (C2731) this.f5649;
            if (c2731 == null) {
                c2731 = new C2731();
                this.f5649 = c2731;
            }
            c2731.f13430 = colorStateList;
            c2731.f13429 = true;
        } else {
            this.f5649 = null;
        }
        m2510();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void m2522() {
        ArrayList arrayList = (ArrayList) this.f5649;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C2378) this.f5644).m4418((C1931) arrayList.get(i));
        }
        m2514(arrayList);
        this.f5645 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2523() {
        boolean z;
        byte b;
        C1931 c1931M2519;
        int i;
        int i2;
        C1931 c1931M25192;
        boolean z2;
        boolean z3;
        Object obj;
        C1931 c1931;
        C1135 c1135 = (C1135) this.f5646;
        C2378 c2378 = (C2378) this.f5644;
        C2014 c2014 = (C2014) this.f5648;
        ArrayList arrayList = (ArrayList) this.f5647;
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C1931) arrayList.get(size)).f9729 == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i3 = size + 1;
            C1231 c1231 = (C1231) c2014.f10074;
            C1135 c11352 = (C1135) c1231.f5646;
            C1931 c19312 = (C1931) arrayList.get(size);
            C1931 c19313 = (C1931) arrayList.get(i3);
            int i4 = c19313.f9729;
            if (i4 == 1) {
                int i5 = c19312.f9732;
                int i6 = c19313.f9730;
                int i7 = i5 < i6 ? -1 : 0;
                int i8 = c19312.f9730;
                if (i8 < i6) {
                    i7++;
                }
                if (i6 <= i8) {
                    c19312.f9730 = i8 + c19313.f9732;
                }
                int i9 = c19313.f9730;
                if (i9 <= i5) {
                    c19312.f9732 = i5 + c19313.f9732;
                }
                c19313.f9730 = i9 + i7;
                arrayList.set(size, c19313);
                arrayList.set(i3, c19312);
            } else if (i4 == 2) {
                int i10 = c19312.f9730;
                int i11 = c19312.f9732;
                int i12 = c19313.f9730;
                if (i10 < i11) {
                    if (i12 == i10 && c19313.f9732 == i11 - i10) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i12 == i11 + 1 && c19313.f9732 == i10 - i11) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i11 < i12) {
                    i12--;
                    c19313.f9730 = i12;
                } else {
                    int i13 = c19313.f9732;
                    if (i11 < i12 + i13) {
                        c19313.f9732 = i13 - 1;
                        c19312.f9729 = 2;
                        c19312.f9732 = 1;
                        if (c19313.f9732 == 0) {
                            arrayList.remove(i3);
                            c19313.f9731 = null;
                            c11352.mo1557(c19313);
                        }
                    }
                }
                int i14 = c19312.f9730;
                if (i14 <= i12) {
                    c19313.f9730 = i12 + 1;
                } else {
                    int i15 = i12 + c19313.f9732;
                    if (i14 < i15) {
                        obj = null;
                        C1931 c1931M25193 = c1231.m2519(null, 2, i14 + 1, i15 - i14);
                        c19313.f9732 = c19312.f9730 - c19313.f9730;
                        c1931 = c1931M25193;
                    }
                    if (z3) {
                        if (z2) {
                            if (c1931 != null) {
                                int i16 = c19312.f9730;
                                if (i16 > c1931.f9730) {
                                    c19312.f9730 = i16 - c1931.f9732;
                                }
                                int i17 = c19312.f9732;
                                if (i17 > c1931.f9730) {
                                    c19312.f9732 = i17 - c1931.f9732;
                                }
                            }
                            int i18 = c19312.f9730;
                            if (i18 > c19313.f9730) {
                                c19312.f9730 = i18 - c19313.f9732;
                            }
                            int i19 = c19312.f9732;
                            if (i19 > c19313.f9730) {
                                c19312.f9732 = i19 - c19313.f9732;
                            }
                        } else {
                            if (c1931 != null) {
                                int i20 = c19312.f9730;
                                if (i20 >= c1931.f9730) {
                                    c19312.f9730 = i20 - c1931.f9732;
                                }
                                int i21 = c19312.f9732;
                                if (i21 >= c1931.f9730) {
                                    c19312.f9732 = i21 - c1931.f9732;
                                }
                            }
                            int i22 = c19312.f9730;
                            if (i22 >= c19313.f9730) {
                                c19312.f9730 = i22 - c19313.f9732;
                            }
                            int i23 = c19312.f9732;
                            if (i23 >= c19313.f9730) {
                                c19312.f9732 = i23 - c19313.f9732;
                            }
                        }
                        arrayList.set(size, c19313);
                        if (c19312.f9730 != c19312.f9732) {
                            arrayList.set(i3, c19312);
                        } else {
                            arrayList.remove(i3);
                        }
                        if (c1931 != null) {
                            arrayList.add(size, c1931);
                        }
                    } else {
                        arrayList.set(size, c19313);
                        arrayList.remove(i3);
                        c19312.f9731 = obj;
                        c11352.mo1557(c19312);
                    }
                }
                obj = null;
                c1931 = null;
                if (z3) {
                }
            } else if (i4 == 4) {
                int i24 = c19312.f9732;
                int i25 = c19313.f9730;
                if (i24 < i25) {
                    c19313.f9730 = i25 - 1;
                } else {
                    int i26 = c19313.f9732;
                    if (i24 < i25 + i26) {
                        c19313.f9732 = i26 - 1;
                        c1931M2519 = c1231.m2519(c19313.f9731, 4, c19312.f9730, 1);
                    }
                    i = c19312.f9730;
                    i2 = c19313.f9730;
                    if (i > i2) {
                        c19313.f9730 = i2 + 1;
                    } else {
                        int i27 = i2 + c19313.f9732;
                        if (i < i27) {
                            int i28 = i27 - i;
                            c1931M25192 = c1231.m2519(c19313.f9731, 4, i + 1, i28);
                            c19313.f9732 -= i28;
                        }
                        arrayList.set(i3, c19312);
                        if (c19313.f9732 > 0) {
                            arrayList.set(size, c19313);
                        } else {
                            arrayList.remove(size);
                            c19313.f9731 = null;
                            c11352.mo1557(c19313);
                        }
                        if (c1931M2519 != null) {
                            arrayList.add(size, c1931M2519);
                        }
                        if (c1931M25192 != null) {
                            arrayList.add(size, c1931M25192);
                        }
                    }
                    c1931M25192 = null;
                    arrayList.set(i3, c19312);
                    if (c19313.f9732 > 0) {
                    }
                    if (c1931M2519 != null) {
                    }
                    if (c1931M25192 != null) {
                    }
                }
                c1931M2519 = null;
                i = c19312.f9730;
                i2 = c19313.f9730;
                if (i > i2) {
                }
                c1931M25192 = null;
                arrayList.set(i3, c19312);
                if (c19313.f9732 > 0) {
                }
                if (c1931M2519 != null) {
                }
                if (c1931M25192 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        for (int i29 = 0; i29 < size2; i29++) {
            C1931 c1931M25194 = (C1931) arrayList.get(i29);
            int i30 = c1931M25194.f9729;
            if (i30 == 1) {
                m2512(c1931M25194);
            } else if (i30 == 2) {
                int i31 = c1931M25194.f9730;
                int i32 = c1931M25194.f9732 + i31;
                int i33 = i31;
                int i34 = 0;
                byte b2 = -1;
                while (i33 < i32) {
                    if (c2378.m4419(i33) != null || m2513(i33)) {
                        if (b2 == 0) {
                            m2509(m2519(null, 2, i31, i34));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            m2512(m2519(null, 2, i31, i34));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i33 -= i34;
                        i32 -= i34;
                        i34 = 1;
                    } else {
                        i34++;
                    }
                    i33++;
                    b2 = b;
                }
                if (i34 != c1931M25194.f9732) {
                    c1931M25194.f9731 = null;
                    c1135.mo1557(c1931M25194);
                    c1931M25194 = m2519(null, 2, i31, i34);
                }
                if (b2 == 0) {
                    m2509(c1931M25194);
                } else {
                    m2512(c1931M25194);
                }
            } else if (i30 == 4) {
                int i35 = c1931M25194.f9730;
                int i36 = c1931M25194.f9732 + i35;
                int i37 = i35;
                int i38 = 0;
                byte b3 = -1;
                while (i35 < i36) {
                    if (c2378.m4419(i35) != null || m2513(i35)) {
                        if (b3 == 0) {
                            m2509(m2519(c1931M25194.f9731, 4, i37, i38));
                            i37 = i35;
                            i38 = 0;
                        }
                        b3 = 1;
                    } else {
                        if (b3 == 1) {
                            m2512(m2519(c1931M25194.f9731, 4, i37, i38));
                            i37 = i35;
                            i38 = 0;
                        }
                        b3 = 0;
                    }
                    i38++;
                    i35++;
                }
                if (i38 != c1931M25194.f9732) {
                    Object obj2 = c1931M25194.f9731;
                    c1931M25194.f9731 = null;
                    c1135.mo1557(c1931M25194);
                    c1931M25194 = m2519(obj2, 4, i37, i38);
                }
                if (b3 == 0) {
                    m2509(c1931M25194);
                } else {
                    m2512(c1931M25194);
                }
            } else if (i30 == 8) {
                m2512(c1931M25194);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public void m2524(C1931 c1931, int i) {
        C2378 c2378 = (C2378) this.f5644;
        c2378.m4418(c1931);
        int i2 = c1931.f9729;
        if (i2 != 2) {
            if (i2 == 4) {
                c2378.m4421(i, c1931.f9732, c1931.f9731);
                return;
            } else {
                C0188.m798("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = c1931.f9732;
        C1213 c1213 = c2378.f11724;
        c1213.m2420(i, i3, true);
        c1213.f5538 = true;
        c1213.f5568.f12981 += i3;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public void m2525() {
        C2378 c2378 = (C2378) this.f5644;
        m2522();
        ArrayList arrayList = (ArrayList) this.f5647;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1931 c1931 = (C1931) arrayList.get(i);
            int i2 = c1931.f9729;
            if (i2 == 1) {
                c2378.m4418(c1931);
                c2378.m4422(c1931.f9730, c1931.f9732);
            } else if (i2 == 2) {
                c2378.m4418(c1931);
                int i3 = c1931.f9730;
                int i4 = c1931.f9732;
                C1213 c1213 = c2378.f11724;
                c1213.m2420(i3, i4, true);
                c1213.f5538 = true;
                c1213.f5568.f12981 += i4;
            } else if (i2 == 4) {
                c2378.m4418(c1931);
                c2378.m4421(c1931.f9730, c1931.f9732, c1931.f9731);
            } else if (i2 == 8) {
                c2378.m4418(c1931);
                c2378.m4417(c1931.f9730, c1931.f9732);
            }
        }
        m2514(arrayList);
        this.f5645 = 0;
    }

    public C1231(View view) {
        this.f5645 = -1;
        this.f5646 = view;
        this.f5647 = C1541.m3170();
    }

    public C1231(C0680 c0680, C0680 c06802, C0680 c06803, int i, String str) {
        this.f5646 = c0680;
        this.f5647 = c06802;
        this.f5649 = c06803;
        this.f5645 = i;
        this.f5644 = str;
    }

    public C1231(C1231 c1231, C0680 c0680, C0680 c06802) {
        this(c0680, c06802, (C0680) c1231.f5649, c1231.f5645, (String) c1231.f5644);
        this.f5648 = (C1231) c1231.f5648;
    }
}
