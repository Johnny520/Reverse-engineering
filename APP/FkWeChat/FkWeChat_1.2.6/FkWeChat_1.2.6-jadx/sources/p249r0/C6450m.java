package p249r0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p265s1.AbstractC7138s1;
import p265s1.C7128q1;

/* JADX INFO: renamed from: r0.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6450m extends RippleDrawable {

    /* JADX INFO: renamed from: u */
    public static final a f20302u = new a(null);

    /* JADX INFO: renamed from: q */
    public final boolean f20303q;

    /* JADX INFO: renamed from: r */
    public C7128q1 f20304r;

    /* JADX INFO: renamed from: s */
    public Integer f20305s;

    /* JADX INFO: renamed from: t */
    public boolean f20306t;

    /* JADX INFO: renamed from: r0.m$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final b f20307a = new b();

        /* JADX INFO: renamed from: a */
        public final void m25525a(RippleDrawable rippleDrawable, int i10) {
            rippleDrawable.setRadius(i10);
        }
    }

    public C6450m(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f20303q = z10;
    }

    /* JADX INFO: renamed from: a */
    public final long m25522a(long j10, float f10) {
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        return C7128q1.m28129o(j10, AbstractC2368o.m8581h(f10, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m25523b(long j10, float f10) {
        long jM25522a = m25522a(j10, f10);
        C7128q1 c7128q1 = this.f20304r;
        if (c7128q1 == null ? false : C7128q1.m28131q(c7128q1.m28139y(), jM25522a)) {
            return;
        }
        this.f20304r = C7128q1.m28125k(jM25522a);
        setColor(ColorStateList.valueOf(AbstractC7138s1.m28205i(jM25522a)));
    }

    /* JADX INFO: renamed from: c */
    public final void m25524c(int i10) {
        Integer num = this.f20305s;
        if (num != null && num.intValue() == i10) {
            return;
        }
        this.f20305s = Integer.valueOf(i10);
        b.f20307a.m25525a(this, i10);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.f20303q) {
            this.f20306t = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f20306t = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f20306t;
    }

    /* JADX INFO: renamed from: r0.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
