package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k42 {
    /* JADX INFO: renamed from: α */
    public static /* bridge */ /* synthetic */ int m3161(android.graphics.text.PositionedGlyphs r0) {
            int r0 = r0.glyphCount()
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static /* bridge */ /* synthetic */ android.graphics.Shader.TileMode m3162() {
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.DECAL
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static /* synthetic */ android.graphics.fonts.Font.Builder m3163(android.graphics.fonts.Font r1) {
            android.graphics.fonts.Font$Builder r0 = new android.graphics.fonts.Font$Builder
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static /* bridge */ /* synthetic */ android.graphics.fonts.Font m3164(android.graphics.text.PositionedGlyphs r1) {
            r0 = 0
            android.graphics.fonts.Font r1 = r1.getFont(r0)
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static /* bridge */ /* synthetic */ android.graphics.text.PositionedGlyphs m3165(android.graphics.Paint r9) {
            r6 = 0
            r7 = 0
            java.lang.String r0 = " "
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 1
            r5 = 0
            r8 = r9
            android.graphics.text.PositionedGlyphs r9 = android.graphics.text.TextRunShaper.shapeTextRun(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }
}
