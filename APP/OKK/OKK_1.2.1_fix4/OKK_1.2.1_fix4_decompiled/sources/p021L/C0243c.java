package p021L;

import android.graphics.Rect;
import java.util.Comparator;
import p008E.C0156j;
import p089x0.C1121e;

/* JADX INFO: renamed from: L.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0243c implements Comparator {

    /* JADX INFO: renamed from: a */
    public final Rect f497a = new Rect();

    /* JADX INFO: renamed from: b */
    public final Rect f498b = new Rect();

    /* JADX INFO: renamed from: c */
    public final boolean f499c;

    /* JADX INFO: renamed from: d */
    public final C1121e f500d;

    public C0243c(boolean z2, C1121e c1121e) {
        this.f499c = z2;
        this.f500d = c1121e;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f500d.getClass();
        Rect rect = this.f497a;
        ((C0156j) obj).m509f(rect);
        Rect rect2 = this.f498b;
        ((C0156j) obj2).m509f(rect2);
        int i2 = rect.top;
        int i3 = rect2.top;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        int i4 = rect.left;
        int i5 = rect2.left;
        boolean z2 = this.f499c;
        if (i4 < i5) {
            return z2 ? 1 : -1;
        }
        if (i4 > i5) {
            return z2 ? -1 : 1;
        }
        int i6 = rect.bottom;
        int i7 = rect2.bottom;
        if (i6 < i7) {
            return -1;
        }
        if (i6 > i7) {
            return 1;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if (i8 < i9) {
            return z2 ? 1 : -1;
        }
        if (i8 > i9) {
            return z2 ? -1 : 1;
        }
        return 0;
    }
}
