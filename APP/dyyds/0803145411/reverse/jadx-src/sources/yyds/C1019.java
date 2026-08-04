package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛱᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1019 extends AbstractC1145 {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public C0411 f4644;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f4645;

    public boolean getAllowsGoneWidget() {
        return this.f4644.f2145;
    }

    public int getMargin() {
        return this.f4644.f2147;
    }

    public int getType() {
        return this.f4645;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f4644.f2145 = z;
    }

    public void setDpMargin(int i) {
        this.f4644.f2147 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f4644.f2147 = i;
    }

    public void setType(int i) {
        this.f4645 = i;
    }
}
