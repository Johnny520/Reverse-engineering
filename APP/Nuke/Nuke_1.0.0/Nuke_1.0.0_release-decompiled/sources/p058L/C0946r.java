package p058L;

import me.dartcv.nuke.BuildConfig;
import p049I2.AbstractC0797o;
import p092S0.C1257J;
import p100U.C1439L;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: L.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0946r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2974a = 2;

    /* JADX INFO: renamed from: b */
    public int f2975b;

    /* JADX INFO: renamed from: c */
    public int f2976c;

    /* JADX INFO: renamed from: d */
    public int f2977d;

    /* JADX INFO: renamed from: e */
    public Object f2978e;

    public /* synthetic */ C0946r() {
    }

    /* JADX INFO: renamed from: a */
    public C0948t m1950a(int i5) {
        return new C0948t(AbstractC0797o.m1394s((C1257J) this.f2978e, i5), i5, 1L);
    }

    /* JADX INFO: renamed from: b */
    public int m1951b() {
        return this.f2977d - this.f2976c;
    }

    /* JADX INFO: renamed from: c */
    public int m1952c(int i5) {
        return ((C1439L) this.f2978e).f5098j[this.f2976c + i5];
    }

    /* JADX INFO: renamed from: d */
    public Object m1953d(int i5) {
        return ((C1439L) this.f2978e).f5100l[this.f2977d + i5];
    }

    public String toString() {
        switch (this.f2974a) {
            case 0:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i5 = this.f2975b;
                sb.append(i5);
                sb.append('-');
                C1257J c1257j = (C1257J) this.f2978e;
                sb.append(AbstractC0797o.m1394s(c1257j, i5));
                sb.append(',');
                int i6 = this.f2976c;
                sb.append(i6);
                sb.append('-');
                sb.append(AbstractC0797o.m1394s(c1257j, i6));
                sb.append("), prevOffset=");
                return AbstractC3202a.m5466a(sb, this.f2977d, ')');
            case BuildConfig.VERSION_CODE /* 1 */:
            default:
                return super.toString();
            case 2:
                return "";
        }
    }

    public C0946r(C1439L c1439l) {
        this.f2978e = c1439l;
    }

    public C0946r(int i5, int i6, int i7, C1257J c1257j) {
        this.f2975b = i5;
        this.f2976c = i6;
        this.f2977d = i7;
        this.f2978e = c1257j;
    }
}
