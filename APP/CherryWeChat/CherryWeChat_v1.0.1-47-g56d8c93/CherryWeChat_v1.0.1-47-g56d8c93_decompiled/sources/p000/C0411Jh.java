package p000;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: renamed from: Jh */
/* JADX INFO: loaded from: classes.dex */
public final class C0411Jh implements Comparator {

    /* JADX INFO: renamed from: a */
    public final Rect f1377a = new Rect();

    /* JADX INFO: renamed from: b */
    public final Rect f1378b = new Rect();

    /* JADX INFO: renamed from: c */
    public final boolean f1379c;

    /* JADX INFO: renamed from: d */
    public final C0668Pg f1380d;

    public C0411Jh(boolean z, C0668Pg c0668Pg) {
        this.f1379c = z;
        this.f1380d = c0668Pg;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f1380d.getClass();
        Rect rect = this.f1377a;
        ((C1118a0) obj).m2044f(rect);
        Rect rect2 = this.f1378b;
        ((C1118a0) obj2).m2044f(rect2);
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
        boolean z = this.f1379c;
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
