package p073f2;

import android.view.MotionEvent;
import java.util.List;
import p117i.C3037a0;

/* JADX INFO: renamed from: f2.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2241g {

    /* JADX INFO: renamed from: a */
    public final C3037a0 f6155a;

    /* JADX INFO: renamed from: b */
    public final C2240f0 f6156b;

    /* JADX INFO: renamed from: c */
    public boolean f6157c;

    public C2241g(C3037a0 c3037a0, C2240f0 c2240f0) {
        this.f6155a = c3037a0;
        this.f6156b = c2240f0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8123a(long j10) {
        Object obj;
        List listM8121b = this.f6156b.m8121b();
        int size = listM8121b.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = listM8121b.get(i10);
            if (AbstractC2234c0.m8064b(((C2242g0) obj).m8131d(), j10)) {
                break;
            }
            i10++;
        }
        C2242g0 c2242g0 = (C2242g0) obj;
        if (c2242g0 != null) {
            return c2242g0.m8128a();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final C3037a0 m8124b() {
        return this.f6155a;
    }

    /* JADX INFO: renamed from: c */
    public final MotionEvent m8125c() {
        return this.f6156b.m8120a();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8126d() {
        return this.f6157c;
    }

    /* JADX INFO: renamed from: e */
    public final void m8127e(boolean z10) {
        this.f6157c = z10;
    }
}
