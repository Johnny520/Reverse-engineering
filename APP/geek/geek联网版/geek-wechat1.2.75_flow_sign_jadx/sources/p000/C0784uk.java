package p000;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: renamed from: uk */
/* JADX INFO: loaded from: classes.dex */
public final class C0784uk implements Comparator {

    /* JADX INFO: renamed from: a */
    public final Rect f4832a = new Rect();

    /* JADX INFO: renamed from: b */
    public final Rect f4833b = new Rect();

    /* JADX INFO: renamed from: c */
    public final boolean f4834c;

    /* JADX INFO: renamed from: d */
    public final C0893xh f4835d;

    public C0784uk(C0893xh c0893xh, boolean z) {
        this.f4834c = z;
        this.f4835d = c0893xh;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f4835d.getClass();
        Rect rect = this.f4832a;
        ((C0357j0) obj).m1550d(rect);
        Rect rect2 = this.f4833b;
        ((C0357j0) obj2).m1550d(rect2);
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
        boolean z = this.f4834c;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
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
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
