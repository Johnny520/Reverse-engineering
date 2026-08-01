package p000;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: renamed from: sk */
/* JADX INFO: loaded from: classes.dex */
public final class C0711sk implements Comparator {

    /* JADX INFO: renamed from: a */
    public final Rect f4442a = new Rect();

    /* JADX INFO: renamed from: b */
    public final Rect f4443b = new Rect();

    /* JADX INFO: renamed from: c */
    public final boolean f4444c;

    /* JADX INFO: renamed from: d */
    public final C0819vh f4445d;

    public C0711sk(C0819vh c0819vh, boolean z) {
        this.f4444c = z;
        this.f4445d = c0819vh;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f4445d.getClass();
        Rect rect = this.f4442a;
        ((C0357j0) obj).m1536d(rect);
        Rect rect2 = this.f4443b;
        ((C0357j0) obj2).m1536d(rect2);
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
        boolean z = this.f4444c;
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
