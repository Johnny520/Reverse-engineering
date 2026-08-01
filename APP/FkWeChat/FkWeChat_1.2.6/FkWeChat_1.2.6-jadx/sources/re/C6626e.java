package re;

import java.util.ArrayList;
import java.util.List;
import p080f9.C2363j;

/* JADX INFO: renamed from: re.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6626e {

    /* JADX INFO: renamed from: a */
    public final ArrayList f20753a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f20754b = -239;

    /* JADX INFO: renamed from: c */
    public int f20755c = -239;

    /* JADX INFO: renamed from: a */
    public final List m26253a() {
        if (this.f20754b != -239) {
            this.f20753a.add(new C2363j(this.f20754b, this.f20755c));
        }
        this.f20754b = -239;
        this.f20755c = -239;
        return this.f20753a;
    }

    /* JADX INFO: renamed from: b */
    public final void m26254b(int i10) {
        if (this.f20755c + 1 == i10) {
            this.f20755c = i10;
            return;
        }
        if (this.f20754b != -239) {
            this.f20753a.add(new C2363j(this.f20754b, this.f20755c));
        }
        this.f20754b = i10;
        this.f20755c = i10;
    }
}
