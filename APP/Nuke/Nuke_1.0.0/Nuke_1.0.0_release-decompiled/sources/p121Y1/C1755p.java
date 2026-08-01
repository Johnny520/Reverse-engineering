package p121Y1;

import me.dartcv.nuke.BuildConfig;
import p078P1.C1146h;

/* JADX INFO: renamed from: Y1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1755p {

    /* JADX INFO: renamed from: b */
    public static final C1755p f6032b = new C1755p(2);

    /* JADX INFO: renamed from: c */
    public static final C1755p f6033c = new C1755p(0);

    /* JADX INFO: renamed from: d */
    public static final C1755p f6034d;

    /* JADX INFO: renamed from: e */
    public static final C1755p f6035e;

    /* JADX INFO: renamed from: f */
    public static final C1755p f6036f;

    /* JADX INFO: renamed from: g */
    public static final C1146h f6037g;

    /* JADX INFO: renamed from: h */
    public static final boolean f6038h;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6039a;

    static {
        C1755p c1755p = new C1755p(1);
        f6034d = c1755p;
        f6035e = new C1755p(3);
        f6036f = c1755p;
        f6037g = C1146h.m2200a(c1755p, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f6038h = true;
    }

    public /* synthetic */ C1755p(int i5) {
        this.f6039a = i5;
    }

    /* JADX INFO: renamed from: a */
    public final int m3126a(int i5, int i6, int i7, int i8) {
        switch (this.f6039a) {
            case 0:
                if (m3127b(i5, i6, i7, i8) != 1.0f) {
                    break;
                }
                break;
            case 2:
                if (f6038h) {
                }
                break;
        }
        return 2;
    }

    /* JADX INFO: renamed from: b */
    public final float m3127b(int i5, int i6, int i7, int i8) {
        switch (this.f6039a) {
            case 0:
                return Math.min(1.0f, f6032b.m3127b(i5, i6, i7, i8));
            case BuildConfig.VERSION_CODE /* 1 */:
                return Math.max(i7 / i5, i8 / i6);
            case 2:
                if (f6038h) {
                    return Math.min(i7 / i5, i8 / i6);
                }
                if (Math.max(i6 / i8, i5 / i7) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }
}
