package p014b;

import android.window.BackEvent;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: b.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0700b {

    /* JADX INFO: renamed from: e */
    public static final a f2051e = new a(null);

    /* JADX INFO: renamed from: a */
    public final float f2052a;

    /* JADX INFO: renamed from: b */
    public final float f2053b;

    /* JADX INFO: renamed from: c */
    public final float f2054c;

    /* JADX INFO: renamed from: d */
    public final int f2055d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0700b(BackEvent backEvent) {
        backEvent.getClass();
        C0699a c0699a = C0699a.f2050a;
        this(c0699a.m2765d(backEvent), c0699a.m2766e(backEvent), c0699a.m2763b(backEvent), c0699a.m2764c(backEvent));
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f2052a + ", touchY=" + this.f2053b + ", progress=" + this.f2054c + ", swipeEdge=" + this.f2055d + '}';
    }

    /* JADX INFO: renamed from: b.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public C0700b(float f10, float f11, float f12, int i10) {
        this.f2052a = f10;
        this.f2053b = f11;
        this.f2054c = f12;
        this.f2055d = i10;
    }
}
