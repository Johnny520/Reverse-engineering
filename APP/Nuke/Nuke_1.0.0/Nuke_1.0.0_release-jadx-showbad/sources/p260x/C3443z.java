package p260x;

import com.bumptech.glide.AbstractC1926h;
import p095T.C1357e;
import p095T.C1366i0;
import p095T.InterfaceC1339T0;
import p132a3.C1804d;

/* JADX INFO: renamed from: x.z */
/* JADX INFO: loaded from: classes.dex */
public final class C3443z implements InterfaceC1339T0 {

    /* JADX INFO: renamed from: d */
    public final C1366i0 f10759d;

    /* JADX INFO: renamed from: e */
    public int f10760e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3443z(int i5) {
        int i6 = (i5 / 30) * 30;
        this.f10759d = new C1366i0(AbstractC1926h.m3557J(Math.max(i6 - 100, 0), i6 + 130), C1357e.f4798j);
        this.f10760e = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1339T0
    public final Object getValue() {
        return (C1804d) this.f10759d.getValue();
    }
}
