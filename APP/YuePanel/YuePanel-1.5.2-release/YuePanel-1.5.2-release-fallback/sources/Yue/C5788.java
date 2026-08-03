package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5788 extends Yue.AbstractC5349 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public int[] f21280;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public int[] f21281;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int f21282;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public Yue.C5788.InterfaceC5789 f21283;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public Yue.C5788.InterfaceC5790 f21284;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public java.lang.String[] f21285;

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۡ۟$ۥ, reason: contains not printable characters */
    public interface InterfaceC5789 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        java.lang.CharSequence m21634(android.database.Cursor r1);
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۡ۟$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC5790 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        boolean m21635(android.view.View r1, android.database.Cursor r2, int r3);
    }

    @java.lang.Deprecated
    public C5788(android.content.Context r1, int r2, android.database.Cursor r3, java.lang.String[] r4, int[] r5) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.f21282 = r1
            r0.f21281 = r5
            r0.f21285 = r4
            r0.m21625(r3, r4)
            return
    }

    public C5788(android.content.Context r1, int r2, android.database.Cursor r3, java.lang.String[] r4, int[] r5, int r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r6)
            r1 = -1
            r0.f21282 = r1
            r0.f21281 = r5
            r0.f21285 = r4
            r0.m21625(r3, r4)
            return
    }

    @Override // Yue.AbstractC1676, Yue.C1679.InterfaceC1680
    /* JADX INFO: renamed from: ۥ */
    public java.lang.CharSequence mo8056(android.database.Cursor r3) {
            r2 = this;
            Yue.ۥۢ۟ۡ۟$ۥ r0 = r2.f21283
            if (r0 == 0) goto L9
            java.lang.CharSequence r3 = r0.m21634(r3)
            return r3
        L9:
            int r0 = r2.f21282
            r1 = -1
            if (r0 <= r1) goto L13
            java.lang.String r3 = r3.getString(r0)
            return r3
        L13:
            java.lang.CharSequence r3 = super.mo8056(r3)
            return r3
    }

    @Override // Yue.AbstractC1676
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo8059(android.view.View r9, android.content.Context r10, android.database.Cursor r11) {
            r8 = this;
            Yue.ۥۢ۟ۡ۟$ۥ۟ r10 = r8.f21284
            int[] r0 = r8.f21281
            int r1 = r0.length
            int[] r2 = r8.f21280
            r3 = 0
            r4 = r3
        L9:
            if (r4 >= r1) goto L64
            r5 = r0[r4]
            android.view.View r5 = r9.findViewById(r5)
            if (r5 == 0) goto L61
            if (r10 == 0) goto L1c
            r6 = r2[r4]
            boolean r6 = r10.m21635(r5, r11, r6)
            goto L1d
        L1c:
            r6 = r3
        L1d:
            if (r6 != 0) goto L61
            r6 = r2[r4]
            java.lang.String r6 = r11.getString(r6)
            if (r6 != 0) goto L29
            java.lang.String r6 = ""
        L29:
            boolean r7 = r5 instanceof android.widget.TextView
            if (r7 == 0) goto L33
            android.widget.TextView r5 = (android.widget.TextView) r5
            r8.m21633(r5, r6)
            goto L61
        L33:
            boolean r7 = r5 instanceof android.widget.ImageView
            if (r7 == 0) goto L3d
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r8.m21632(r5, r6)
            goto L61
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.Class r11 = r5.getClass()
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = " is not a "
            r10.append(r11)
            java.lang.String r11 = " view that can be bounds by this SimpleCursorAdapter"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L61:
            int r4 = r4 + 1
            goto L9
        L64:
            return
    }

    @Override // Yue.AbstractC1676
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public android.database.Cursor mo8067(android.database.Cursor r2) {
            r1 = this;
            java.lang.String[] r0 = r1.f21285
            r1.m21625(r2, r0)
            android.database.Cursor r2 = super.mo8067(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m21624(android.database.Cursor r1, java.lang.String[] r2, int[] r3) {
            r0 = this;
            r0.f21285 = r2
            r0.f21281 = r3
            r0.m21625(r1, r2)
            super.mo8057(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m21625(android.database.Cursor r5, java.lang.String[] r6) {
            r4 = this;
            if (r5 == 0) goto L1e
            int r0 = r6.length
            int[] r1 = r4.f21280
            if (r1 == 0) goto La
            int r1 = r1.length
            if (r1 == r0) goto Le
        La:
            int[] r1 = new int[r0]
            r4.f21280 = r1
        Le:
            r1 = 0
        Lf:
            if (r1 >= r0) goto L21
            int[] r2 = r4.f21280
            r3 = r6[r1]
            int r3 = r5.getColumnIndexOrThrow(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lf
        L1e:
            r5 = 0
            r4.f21280 = r5
        L21:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Yue.C5788.InterfaceC5789 m21626() {
            r1 = this;
            Yue.ۥۢ۟ۡ۟$ۥ r0 = r1.f21283
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int m21627() {
            r1 = this;
            int r0 = r1.f21282
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public Yue.C5788.InterfaceC5790 m21628() {
            r1 = this;
            Yue.ۥۢ۟ۡ۟$ۥ۟ r0 = r1.f21284
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m21629(Yue.C5788.InterfaceC5789 r1) {
            r0 = this;
            r0.f21283 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m21630(int r1) {
            r0 = this;
            r0.f21282 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m21631(Yue.C5788.InterfaceC5790 r1) {
            r0 = this;
            r0.f21284 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m21632(android.widget.ImageView r2, java.lang.String r3) {
            r1 = this;
            int r0 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L8
            r2.setImageResource(r0)     // Catch: java.lang.NumberFormatException -> L8
            goto Lf
        L8:
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r2.setImageURI(r3)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m21633(android.widget.TextView r1, java.lang.String r2) {
            r0 = this;
            r1.setText(r2)
            return
    }
}
