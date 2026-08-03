package p050c0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0622S {

    /* JADX INFO: renamed from: a */
    public final Bitmap f1918a;

    /* JADX INFO: renamed from: b */
    public final byte[] f1919b;

    /* JADX INFO: renamed from: c */
    public final Rect f1920c;

    public C0622S(Bitmap bitmap, byte[] bArr, Rect rect) {
        this.f1918a = bitmap;
        this.f1919b = bArr;
        this.f1920c = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0622S)) {
            return false;
        }
        C0622S c0622s = (C0622S) obj;
        return AbstractC0307g.m699a(this.f1918a, c0622s.f1918a) && AbstractC0307g.m699a(this.f1919b, c0622s.f1919b) && AbstractC0307g.m699a(this.f1920c, c0622s.f1920c);
    }

    public final int hashCode() {
        return this.f1920c.hashCode() + ((Arrays.hashCode(this.f1919b) + (this.f1918a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Patch(bitmap=" + this.f1918a + ", chunk=" + Arrays.toString(this.f1919b) + ", padding=" + this.f1920c + ")";
    }
}
