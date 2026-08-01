package p156e4;

import java.io.IOException;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p058L.C0946r;
import p092S0.C1257J;
import p112W2.InterfaceC1599a;

/* JADX INFO: renamed from: e4.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2049l implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6834d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f6835e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f6836f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2049l(C0946r c0946r, int i5) {
        this.f6834d = 3;
        this.f6835e = c0946r;
        this.f6836f = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f6834d) {
            case 0:
                C2054q c2054q = (C2054q) this.f6835e;
                int i5 = this.f6836f;
                c2054q.f6856n.getClass();
                try {
                    c2054q.f6868z.m3784l(i5, EnumC2039b.f6789k);
                    synchronized (c2054q) {
                        c2054q.f6845B.remove(Integer.valueOf(i5));
                    }
                } catch (IOException unused) {
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                C2054q c2054q2 = (C2054q) this.f6835e;
                int i6 = this.f6836f;
                c2054q2.f6856n.getClass();
                synchronized (c2054q2) {
                    c2054q2.f6845B.remove(Integer.valueOf(i6));
                }
                return C0891q.f2780a;
            case 2:
                C2054q c2054q3 = (C2054q) this.f6835e;
                int i7 = this.f6836f;
                c2054q3.f6856n.getClass();
                try {
                    c2054q3.f6868z.m3784l(i7, EnumC2039b.f6789k);
                    synchronized (c2054q3) {
                        c2054q3.f6845B.remove(Integer.valueOf(i7));
                    }
                } catch (IOException unused2) {
                }
                return C0891q.f2780a;
            default:
                C0946r c0946r = (C0946r) this.f6835e;
                return Integer.valueOf(((C1257J) c0946r.f2978e).f4527b.m2363d(this.f6836f));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C2049l(C2054q c2054q, int i5, Object obj, int i6) {
        this.f6834d = i6;
        this.f6835e = c2054q;
        this.f6836f = i5;
    }

    public /* synthetic */ C2049l(C2054q c2054q, int i5, List list, boolean z5) {
        this.f6834d = 2;
        this.f6835e = c2054q;
        this.f6836f = i5;
    }
}
