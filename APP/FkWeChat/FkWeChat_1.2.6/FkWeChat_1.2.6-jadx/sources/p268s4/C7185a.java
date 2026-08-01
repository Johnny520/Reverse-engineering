package p268s4;

import android.graphics.Rect;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p376zd.C10028y0;

/* JADX INFO: renamed from: s4.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7185a {

    /* JADX INFO: renamed from: e */
    public static final a f23775e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final C7185a f23776f = new C7185a(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f23777a;

    /* JADX INFO: renamed from: b */
    public final int f23778b;

    /* JADX INFO: renamed from: c */
    public final int f23779c;

    /* JADX INFO: renamed from: d */
    public final int f23780d;

    public C7185a(int i10, int i11, int i12, int i13) {
        this.f23777a = i10;
        this.f23778b = i11;
        this.f23779c = i12;
        this.f23780d = i13;
        if (i10 > i12) {
            C10028y0.m38849a("Left must be less than or equal to right, left: ", i10, ", right: ", i12);
            throw null;
        }
        if (i11 <= i13) {
            return;
        }
        C10028y0.m38849a("top must be less than or equal to bottom, top: ", i11, ", bottom: ", i13);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final Rect m28377a() {
        return new Rect(this.f23777a, this.f23778b, this.f23779c, this.f23780d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC1061t.m3842c(C7185a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C7185a c7185a = (C7185a) obj;
        return this.f23777a == c7185a.f23777a && this.f23778b == c7185a.f23778b && this.f23779c == c7185a.f23779c && this.f23780d == c7185a.f23780d;
    }

    public int hashCode() {
        return (((((this.f23777a * 31) + this.f23778b) * 31) + this.f23779c) * 31) + this.f23780d;
    }

    public String toString() {
        return C7185a.class.getSimpleName() + " { [" + this.f23777a + ',' + this.f23778b + ',' + this.f23779c + ',' + this.f23780d + "] }";
    }

    /* JADX INFO: renamed from: s4.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7185a(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
