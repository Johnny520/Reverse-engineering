package p229r1;

import android.graphics.Rect;
import com.bumptech.glide.AbstractC1925g;
import java.util.List;
import p205n1.C2688b;

/* JADX INFO: renamed from: r1.P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3055P {

    /* JADX INFO: renamed from: a */
    public final C3070c0 f9749a;

    /* JADX INFO: renamed from: b */
    public C2688b[] f9750b;

    /* JADX INFO: renamed from: c */
    public final Rect[][] f9751c;

    /* JADX INFO: renamed from: d */
    public final Rect[][] f9752d;

    public AbstractC3055P() {
        this(new C3070c0((C3070c0) null));
    }

    /* JADX INFO: renamed from: a */
    public final void m5349a() {
        C2688b[] c2688bArr = this.f9750b;
        if (c2688bArr != null) {
            C2688b c2688bMo5367i = c2688bArr[0];
            C2688b c2688bMo5367i2 = c2688bArr[1];
            C3070c0 c3070c0 = this.f9749a;
            if (c2688bMo5367i2 == null) {
                c2688bMo5367i2 = c3070c0.f9782a.mo5367i(2);
            }
            if (c2688bMo5367i == null) {
                c2688bMo5367i = c3070c0.f9782a.mo5367i(1);
            }
            mo5324h(C2688b.m4666a(c2688bMo5367i, c2688bMo5367i2));
            C2688b c2688b = this.f9750b[AbstractC1925g.m3545v(16)];
            if (c2688b != null) {
                mo5326g(c2688b);
            }
            C2688b c2688b2 = this.f9750b[AbstractC1925g.m3545v(32)];
            if (c2688b2 != null) {
                mo5325e(c2688b2);
            }
            C2688b c2688b3 = this.f9750b[AbstractC1925g.m3545v(64)];
            if (c2688b3 != null) {
                mo5327i(c2688b3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract C3070c0 mo5322b();

    /* JADX INFO: renamed from: c */
    public void mo5348c(C3070c0 c3070c0) {
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            List<Rect> listMo5365f = c3070c0.f9782a.mo5365f(i5);
            int iM3545v = AbstractC1925g.m3545v(i5);
            this.f9751c[iM3545v] = (Rect[]) listMo5365f.toArray(new Rect[listMo5365f.size()]);
            if (i5 != 8) {
                List<Rect> listMo5366g = c3070c0.f9782a.mo5366g(i5);
                this.f9752d[iM3545v] = (Rect[]) listMo5366g.toArray(new Rect[listMo5366g.size()]);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo5347d(int i5, C2688b c2688b) {
        if (this.f9750b == null) {
            this.f9750b = new C2688b[10];
        }
        for (int i6 = 1; i6 <= 512; i6 <<= 1) {
            if ((i5 & i6) != 0) {
                this.f9750b[AbstractC1925g.m3545v(i6)] = c2688b;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo5323f(C2688b c2688b);

    /* JADX INFO: renamed from: h */
    public abstract void mo5324h(C2688b c2688b);

    public AbstractC3055P(C3070c0 c3070c0) {
        this.f9751c = new Rect[10][];
        this.f9752d = new Rect[10][];
        this.f9749a = c3070c0;
        mo5348c(c3070c0);
    }

    /* JADX INFO: renamed from: e */
    public void mo5325e(C2688b c2688b) {
    }

    /* JADX INFO: renamed from: g */
    public void mo5326g(C2688b c2688b) {
    }

    /* JADX INFO: renamed from: i */
    public void mo5327i(C2688b c2688b) {
    }
}
