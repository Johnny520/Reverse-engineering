package p245u0;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p153e1.C2010f;
import p191k4.C2475a;
import p211o0.C2762u;

/* JADX INFO: renamed from: u0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3309f {

    /* JADX INFO: renamed from: k */
    public static int f10275k;

    /* JADX INFO: renamed from: l */
    public static final C2475a f10276l = new C2475a(13);

    /* JADX INFO: renamed from: a */
    public final String f10277a;

    /* JADX INFO: renamed from: b */
    public final float f10278b;

    /* JADX INFO: renamed from: c */
    public final float f10279c;

    /* JADX INFO: renamed from: d */
    public final float f10280d;

    /* JADX INFO: renamed from: e */
    public final float f10281e;

    /* JADX INFO: renamed from: f */
    public final C3299F f10282f;

    /* JADX INFO: renamed from: g */
    public final long f10283g;

    /* JADX INFO: renamed from: h */
    public final int f10284h;

    /* JADX INFO: renamed from: i */
    public final boolean f10285i;

    /* JADX INFO: renamed from: j */
    public final int f10286j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3309f(String str, float f2, float f5, float f6, float f7, C3299F c3299f, long j5, int i5, boolean z5) {
        int i6;
        synchronized (f10276l) {
            i6 = f10275k;
            f10275k = i6 + 1;
        }
        this.f10277a = str;
        this.f10278b = f2;
        this.f10279c = f5;
        this.f10280d = f6;
        this.f10281e = f7;
        this.f10282f = c3299f;
        this.f10283g = j5;
        this.f10284h = i5;
        this.f10285i = z5;
        this.f10286j = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3309f)) {
            return false;
        }
        C3309f c3309f = (C3309f) obj;
        return AbstractC1665j.m2981a(this.f10277a, c3309f.f10277a) && C2010f.m3696b(this.f10278b, c3309f.f10278b) && C2010f.m3696b(this.f10279c, c3309f.f10279c) && this.f10280d == c3309f.f10280d && this.f10281e == c3309f.f10281e && this.f10282f.equals(c3309f.f10282f) && C2762u.m4921c(this.f10283g, c3309f.f10283g) && this.f10284h == c3309f.f10284h && this.f10285i == c3309f.f10285i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f10282f.hashCode() + AbstractC0231b.m390a(this.f10281e, AbstractC0231b.m390a(this.f10280d, AbstractC0231b.m390a(this.f10279c, AbstractC0231b.m390a(this.f10278b, this.f10277a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i5 = C2762u.f8763h;
        return Boolean.hashCode(this.f10285i) + AbstractC0231b.m391b(this.f10284h, AbstractC0231b.m392c(iHashCode, 31, this.f10283g), 31);
    }
}
