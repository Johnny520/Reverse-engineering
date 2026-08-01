package p000;

/* JADX INFO: renamed from: с */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1119 extends p000.AbstractC1118 {

    /* JADX INFO: renamed from: ε */
    public static p000.C1119 f13454;

    /* JADX INFO: renamed from: ζ */
    public static p000.C1119 f13455;

    /* JADX INFO: renamed from: η */
    public static p000.C1119 f13456;

    /* JADX INFO: renamed from: θ */
    public static final p000.rn1 f13457 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.rn1 f13458 = null;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ int f13459;

    /* JADX INFO: renamed from: δ */
    public java.lang.Object f13460;

    static {
            rn1 r0 = p000.rn1.f9421
            p000.C1119.f13457 = r0
            rn1 r0 = p000.rn1.f9420
            p000.C1119.f13458 = r0
            return
    }

    public /* synthetic */ C1119(int r1) {
            r0 = this;
            r0.f13459 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: Α */
    public int m7309(int r5, p000.rn1 r6) {
            r4 = this;
            java.lang.Object r0 = r4.f13460
            m32 r0 = (p000.m32) r0
            r1 = 0
            java.lang.String r2 = "layoutResult"
            if (r0 == 0) goto L56
            int r0 = r0.m3722(r5)
            java.lang.Object r3 = r4.f13460
            m32 r3 = (p000.m32) r3
            if (r3 == 0) goto L52
            rn1 r0 = r3.m3724(r0)
            java.lang.Object r4 = r4.f13460
            m32 r4 = (p000.m32) r4
            if (r6 == r0) goto L28
            if (r4 == 0) goto L24
            int r4 = r4.m3722(r5)
            return r4
        L24:
            p000.ln0.m3650(r2)
            throw r1
        L28:
            if (r4 == 0) goto L4e
            g11 r4 = r4.f6924
            r4.m2228(r5)
            java.lang.Object r4 = r4.f4209
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r6 = p000.AbstractC0073bd.m883(r5, r4)
            java.lang.Object r4 = r4.get(r6)
            m91 r4 = (p000.m91) r4
            s2 r6 = r4.f7033
            int r0 = r4.f7036
            int r5 = r5 - r0
            k32 r6 = r6.f9684
            int r5 = r6.m3152(r5)
            int r4 = r4.f7034
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            return r5
        L4e:
            p000.ln0.m3650(r2)
            throw r1
        L52:
            p000.ln0.m3650(r2)
            throw r1
        L56:
            p000.ln0.m3650(r2)
            throw r1
    }

    /* JADX INFO: renamed from: Β */
    public void m7310(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f13459
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            r1.f13452 = r2
            java.lang.Object r1 = r1.f13460
            java.text.BreakIterator r1 = (java.text.BreakIterator) r1
            if (r1 == 0) goto L11
            r1.setText(r2)
            return
        L11:
            java.lang.String r1 = "impl"
            p000.ln0.m3650(r1)
            r1 = 0
            throw r1
        L18:
            r1.f13452 = r2
            java.lang.Object r1 = r1.f13460
            java.text.BreakIterator r1 = (java.text.BreakIterator) r1
            if (r1 == 0) goto L24
            r1.setText(r2)
            return
        L24:
            java.lang.String r1 = "impl"
            p000.ln0.m3650(r1)
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: Γ */
    public boolean m7311(int r2) {
            r1 = this;
            if (r2 <= 0) goto L1c
            int r0 = r2 + (-1)
            boolean r0 = r1.m7312(r0)
            if (r0 == 0) goto L1c
            java.lang.String r0 = r1.m7306()
            int r0 = r0.length()
            if (r2 == r0) goto L1a
            boolean r1 = r1.m7312(r2)
            if (r1 != 0) goto L1c
        L1a:
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: Δ */
    public boolean m7312(int r2) {
            r1 = this;
            if (r2 < 0) goto L19
            java.lang.String r0 = r1.m7306()
            int r0 = r0.length()
            if (r2 >= r0) goto L19
            java.lang.String r1 = r1.m7306()
            int r1 = r1.codePointAt(r2)
            boolean r1 = java.lang.Character.isLetterOrDigit(r1)
            return r1
        L19:
            r1 = 0
            return r1
    }

    @Override // p000.AbstractC1118
    /* JADX INFO: renamed from: ζ */
    public final int[] mo7303(int r6) {
            r5 = this;
            int r0 = r5.f13459
            switch(r0) {
                case 0: goto Lc9;
                case 1: goto L68;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r5.m7306()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto L11
            goto L5f
        L11:
            java.lang.String r0 = r5.m7306()
            int r0 = r0.length()
            if (r6 < r0) goto L1c
            goto L5f
        L1c:
            java.lang.Object r0 = r5.f13460
            m32 r0 = (p000.m32) r0
            rn1 r2 = p000.C1119.f13457
            java.lang.String r3 = "layoutResult"
            if (r6 >= 0) goto L32
            if (r0 == 0) goto L2e
            r6 = 0
            int r6 = r0.m3720(r6)
            goto L42
        L2e:
            p000.ln0.m3650(r3)
            throw r1
        L32:
            if (r0 == 0) goto L64
            int r0 = r0.m3720(r6)
            int r4 = r5.m7309(r0, r2)
            if (r4 != r6) goto L40
            r6 = r0
            goto L42
        L40:
            int r6 = r0 + 1
        L42:
            java.lang.Object r0 = r5.f13460
            m32 r0 = (p000.m32) r0
            if (r0 == 0) goto L60
            g11 r0 = r0.f6924
            int r0 = r0.f4206
            if (r6 < r0) goto L4f
            goto L5f
        L4f:
            int r0 = r5.m7309(r6, r2)
            rn1 r1 = p000.C1119.f13458
            int r6 = r5.m7309(r6, r1)
            int r6 = r6 + 1
            int[] r1 = r5.m7305(r0, r6)
        L5f:
            return r1
        L60:
            p000.ln0.m3650(r3)
            throw r1
        L64:
            p000.ln0.m3650(r3)
            throw r1
        L68:
            java.lang.String r0 = r5.m7306()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto L74
            goto Lc4
        L74:
            java.lang.String r0 = r5.m7306()
            int r0 = r0.length()
            if (r6 < r0) goto L7f
            goto Lc4
        L7f:
            if (r6 >= 0) goto L82
            r6 = 0
        L82:
            boolean r0 = r5.m7312(r6)
            r2 = -1
            java.lang.String r3 = "impl"
            if (r0 != 0) goto Lad
            boolean r0 = r5.m7312(r6)
            if (r0 == 0) goto L9c
            if (r6 == 0) goto Lad
            int r0 = r6 + (-1)
            boolean r0 = r5.m7312(r0)
            if (r0 != 0) goto L9c
            goto Lad
        L9c:
            java.lang.Object r0 = r5.f13460
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            if (r0 == 0) goto La9
            int r6 = r0.following(r6)
            if (r6 != r2) goto L82
            goto Lc4
        La9:
            p000.ln0.m3650(r3)
            throw r1
        Lad:
            java.lang.Object r0 = r5.f13460
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            if (r0 == 0) goto Lc5
            int r0 = r0.following(r6)
            if (r0 == r2) goto Lc4
            boolean r2 = r5.m7311(r0)
            if (r2 != 0) goto Lc0
            goto Lc4
        Lc0:
            int[] r1 = r5.m7305(r6, r0)
        Lc4:
            return r1
        Lc5:
            p000.ln0.m3650(r3)
            throw r1
        Lc9:
            java.lang.String r0 = r5.m7306()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Ld5
            goto L108
        Ld5:
            if (r6 < r0) goto Ld8
            goto L108
        Ld8:
            if (r6 >= 0) goto Ldb
            r6 = 0
        Ldb:
            java.lang.Object r0 = r5.f13460
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            java.lang.String r2 = "impl"
            if (r0 == 0) goto L10d
            boolean r0 = r0.isBoundary(r6)
            java.lang.Object r3 = r5.f13460
            java.text.BreakIterator r3 = (java.text.BreakIterator) r3
            r4 = -1
            if (r0 != 0) goto Lfb
            if (r3 == 0) goto Lf7
            int r6 = r3.following(r6)
            if (r6 != r4) goto Ldb
            goto L108
        Lf7:
            p000.ln0.m3650(r2)
            throw r1
        Lfb:
            if (r3 == 0) goto L109
            int r0 = r3.following(r6)
            if (r0 != r4) goto L104
            goto L108
        L104:
            int[] r1 = r5.m7305(r6, r0)
        L108:
            return r1
        L109:
            p000.ln0.m3650(r2)
            throw r1
        L10d:
            p000.ln0.m3650(r2)
            throw r1
    }

    @Override // p000.AbstractC1118
    /* JADX INFO: renamed from: ψ */
    public final int[] mo7307(int r6) {
            r5 = this;
            int r0 = r5.f13459
            switch(r0) {
                case 0: goto Lbe;
                case 1: goto L63;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r5.m7306()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto L11
            goto L5e
        L11:
            if (r6 > 0) goto L14
            goto L5e
        L14:
            java.lang.String r0 = r5.m7306()
            int r0 = r0.length()
            java.lang.Object r2 = r5.f13460
            m32 r2 = (p000.m32) r2
            rn1 r3 = p000.C1119.f13458
            java.lang.String r4 = "layoutResult"
            if (r6 <= r0) goto L39
            if (r2 == 0) goto L35
            java.lang.String r6 = r5.m7306()
            int r6 = r6.length()
            int r6 = r2.m3720(r6)
            goto L4b
        L35:
            p000.ln0.m3650(r4)
            throw r1
        L39:
            if (r2 == 0) goto L5f
            int r0 = r2.m3720(r6)
            int r2 = r5.m7309(r0, r3)
            int r2 = r2 + 1
            if (r2 != r6) goto L49
            r6 = r0
            goto L4b
        L49:
            int r6 = r0 + (-1)
        L4b:
            if (r6 >= 0) goto L4e
            goto L5e
        L4e:
            rn1 r0 = p000.C1119.f13457
            int r0 = r5.m7309(r6, r0)
            int r6 = r5.m7309(r6, r3)
            int r6 = r6 + 1
            int[] r1 = r5.m7305(r0, r6)
        L5e:
            return r1
        L5f:
            p000.ln0.m3650(r4)
            throw r1
        L63:
            java.lang.String r0 = r5.m7306()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto L6f
            goto Lb9
        L6f:
            if (r6 > 0) goto L72
            goto Lb9
        L72:
            if (r6 <= r0) goto L75
            r6 = r0
        L75:
            r0 = -1
            java.lang.String r2 = "impl"
            if (r6 <= 0) goto L99
            int r3 = r6 + (-1)
            boolean r3 = r5.m7312(r3)
            if (r3 != 0) goto L99
            boolean r3 = r5.m7311(r6)
            if (r3 != 0) goto L99
            java.lang.Object r3 = r5.f13460
            java.text.BreakIterator r3 = (java.text.BreakIterator) r3
            if (r3 == 0) goto L95
            int r6 = r3.preceding(r6)
            if (r6 != r0) goto L75
            goto Lb9
        L95:
            p000.ln0.m3650(r2)
            throw r1
        L99:
            java.lang.Object r3 = r5.f13460
            java.text.BreakIterator r3 = (java.text.BreakIterator) r3
            if (r3 == 0) goto Lba
            int r2 = r3.preceding(r6)
            if (r2 == r0) goto Lb9
            boolean r0 = r5.m7312(r2)
            if (r0 == 0) goto Lb9
            if (r2 == 0) goto Lb5
            int r0 = r2 + (-1)
            boolean r0 = r5.m7312(r0)
            if (r0 != 0) goto Lb9
        Lb5:
            int[] r1 = r5.m7305(r2, r6)
        Lb9:
            return r1
        Lba:
            p000.ln0.m3650(r2)
            throw r1
        Lbe:
            java.lang.String r0 = r5.m7306()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Lca
            goto Lfd
        Lca:
            if (r6 > 0) goto Lcd
            goto Lfd
        Lcd:
            if (r6 <= r0) goto Ld0
            r6 = r0
        Ld0:
            java.lang.Object r0 = r5.f13460
            java.text.BreakIterator r0 = (java.text.BreakIterator) r0
            java.lang.String r2 = "impl"
            if (r0 == 0) goto L102
            boolean r0 = r0.isBoundary(r6)
            java.lang.Object r3 = r5.f13460
            java.text.BreakIterator r3 = (java.text.BreakIterator) r3
            r4 = -1
            if (r0 != 0) goto Lf0
            if (r3 == 0) goto Lec
            int r6 = r3.preceding(r6)
            if (r6 != r4) goto Ld0
            goto Lfd
        Lec:
            p000.ln0.m3650(r2)
            throw r1
        Lf0:
            if (r3 == 0) goto Lfe
            int r0 = r3.preceding(r6)
            if (r0 != r4) goto Lf9
            goto Lfd
        Lf9:
            int[] r1 = r5.m7305(r0, r6)
        Lfd:
            return r1
        Lfe:
            p000.ln0.m3650(r2)
            throw r1
        L102:
            p000.ln0.m3650(r2)
            throw r1
    }
}
