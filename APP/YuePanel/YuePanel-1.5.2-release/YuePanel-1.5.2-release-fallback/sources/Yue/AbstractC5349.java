package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5349 extends Yue.AbstractC1676 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f19932;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int f19933;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public android.view.LayoutInflater f19934;

    @java.lang.Deprecated
    public AbstractC5349(android.content.Context r1, int r2, android.database.Cursor r3) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.f19933 = r2
            r0.f19932 = r2
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            r0.f19934 = r1
            return
    }

    public AbstractC5349(android.content.Context r1, int r2, android.database.Cursor r3, int r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r0.f19933 = r2
            r0.f19932 = r2
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            r0.f19934 = r1
            return
    }

    @java.lang.Deprecated
    public AbstractC5349(android.content.Context r1, int r2, android.database.Cursor r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r0.f19933 = r2
            r0.f19932 = r2
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            r0.f19934 = r1
            return
    }

    @Override // Yue.AbstractC1676
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public android.view.View mo8063(android.content.Context r2, android.database.Cursor r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.LayoutInflater r2 = r1.f19934
            int r3 = r1.f19933
            r0 = 0
            android.view.View r2 = r2.inflate(r3, r4, r0)
            return r2
    }

    @Override // Yue.AbstractC1676
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public android.view.View mo8064(android.content.Context r2, android.database.Cursor r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.LayoutInflater r2 = r1.f19934
            int r3 = r1.f19932
            r0 = 0
            android.view.View r2 = r2.inflate(r3, r4, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m20177(int r1) {
            r0 = this;
            r0.f19933 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m20178(int r1) {
            r0 = this;
            r0.f19932 = r1
            return
    }
}
