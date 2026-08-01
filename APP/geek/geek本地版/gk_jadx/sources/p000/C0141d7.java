package p000;

/* JADX INFO: renamed from: d7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0141d7 extends AbstractC0182ec {

    /* JADX INFO: renamed from: g */
    public int f1395g;

    /* JADX INFO: renamed from: h */
    public int f1396h;

    /* JADX INFO: renamed from: i */
    public C0177e7 f1397i;

    @Override // p000.AbstractC0182ec
    /* JADX INFO: renamed from: f */
    public final void mo206f(C0592pc c0592pc, boolean z) {
        int i = this.f1395g;
        this.f1396h = i;
        if (z) {
            if (i == 5) {
                this.f1396h = 1;
            } else if (i == 6) {
                this.f1396h = 0;
            }
        } else if (i == 5) {
            this.f1396h = 0;
        } else if (i == 6) {
            this.f1396h = 1;
        }
        if (c0592pc instanceof C0177e7) {
            ((C0177e7) c0592pc).f1742f0 = this.f1396h;
        }
    }

    public int getMargin() {
        return this.f1397i.f1744h0;
    }

    public int getType() {
        return this.f1395g;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1397i.f1743g0 = z;
    }

    public void setDpMargin(int i) {
        this.f1397i.f1744h0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f1397i.f1744h0 = i;
    }

    public void setType(int i) {
        this.f1395g = i;
    }
}
