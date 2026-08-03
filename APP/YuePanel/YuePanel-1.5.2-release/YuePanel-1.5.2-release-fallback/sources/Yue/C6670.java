package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C6670 extends Yue.C5376 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f23300 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f23301 = 20;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.ref.WeakReference<android.content.Context> f23302;

    static {
            return
    }

    public C6670(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.content.res.Resources r2) {
            r0 = this;
            r0.<init>(r2)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.f23302 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m25685() {
            boolean r0 = Yue.C6670.f23300
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m25686(boolean r0) {
            Yue.C6670.f23300 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m25687() {
            m25685()
            r0 = 0
            return r0
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.XmlResourceParser getAnimation(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.content.res.XmlResourceParser r1 = super.getAnimation(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            boolean r1 = super.getBoolean(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            int r1 = super.getColor(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getColorStateList(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.content.res.ColorStateList r1 = super.getColorStateList(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.Configuration getConfiguration() {
            r1 = this;
            android.content.res.Configuration r0 = super.getConfiguration()
            return r0
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            float r1 = super.getDimension(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            int r1 = super.getDimensionPixelOffset(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            int r1 = super.getDimensionPixelSize(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.util.DisplayMetrics getDisplayMetrics() {
            r1 = this;
            android.util.DisplayMetrics r0 = super.getDisplayMetrics()
            return r0
    }

    @Override // Yue.C5376, android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int r3) throws android.content.res.Resources.NotFoundException {
            r2 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.f23302
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L13
            Yue.ۥۡۦۦۢ r1 = Yue.C5354.m20196()
            android.graphics.drawable.Drawable r3 = r1.m20214(r0, r2, r3)
            return r3
        L13:
            android.graphics.drawable.Drawable r3 = r2.m20257(r3)
            return r3
    }

    @Override // Yue.C5376, android.content.res.Resources
    @Yue.InterfaceC5336(21)
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawable(int r1, android.content.res.Resources.Theme r2) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.graphics.drawable.Drawable r1 = super.getDrawable(r1, r2)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawableForDensity(int r1, int r2) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.graphics.drawable.Drawable r1 = super.getDrawableForDensity(r1, r2)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    @Yue.InterfaceC5336(21)
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawableForDensity(int r1, int r2, android.content.res.Resources.Theme r3) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = super.getDrawableForDensity(r1, r2, r3)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int r1, int r2, int r3) {
            r0 = this;
            float r1 = super.getFraction(r1, r2, r3)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            int r1 = super.getIdentifier(r1, r2, r3)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            int[] r1 = super.getIntArray(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            int r1 = super.getInteger(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.XmlResourceParser getLayout(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.content.res.XmlResourceParser r1 = super.getLayout(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.graphics.Movie getMovie(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.graphics.Movie r1 = super.getMovie(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getQuantityString(int r1, int r2) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getQuantityString(r1, r2)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getQuantityString(int r1, int r2, java.lang.Object[] r3) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getQuantityString(r1, r2, r3)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence getQuantityText(int r1, int r2) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.CharSequence r1 = super.getQuantityText(r1, r2)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourceEntryName(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getResourceEntryName(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourceName(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getResourceName(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourcePackageName(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getResourcePackageName(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourceTypeName(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getResourceTypeName(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getString(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getString(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getString(int r1, java.lang.Object[] r2) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String r1 = super.getString(r1, r2)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String[] getStringArray(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.String[] r1 = super.getStringArray(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.CharSequence r1 = super.getText(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText(int r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.CharSequence r1 = super.getText(r1, r2)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence[] getTextArray(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.lang.CharSequence[] r1 = super.getTextArray(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int r1, android.util.TypedValue r2, boolean r3) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            super.getValue(r1, r2, r3)
            return
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.XmlResourceParser getXml(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.content.res.XmlResourceParser r1 = super.getXml(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.TypedArray obtainTypedArray(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.content.res.TypedArray r1 = super.obtainTypedArray(r1)
            return r1
    }

    @Override // Yue.C5376, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.io.InputStream openRawResource(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.io.InputStream r1 = super.openRawResource(r1)
            return r1
    }

    @Override // Yue.C5376
    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ /* synthetic */ void mo20258(java.lang.String r1, android.util.TypedValue r2, boolean r3) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            super.mo20258(r1, r2, r3)
            return
    }

    @Override // Yue.C5376
    /* JADX INFO: renamed from: ۥ۟۟ */
    public /* bridge */ /* synthetic */ void mo20259(int r1, int r2, android.util.TypedValue r3, boolean r4) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            super.mo20259(r1, r2, r3, r4)
            return
    }

    @Override // Yue.C5376
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public /* bridge */ /* synthetic */ android.content.res.TypedArray mo20260(android.util.AttributeSet r1, int[] r2) {
            r0 = this;
            android.content.res.TypedArray r1 = super.mo20260(r1, r2)
            return r1
    }

    @Override // Yue.C5376
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public /* bridge */ /* synthetic */ java.io.InputStream mo20261(int r1, android.util.TypedValue r2) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            java.io.InputStream r1 = super.mo20261(r1, r2)
            return r1
    }

    @Override // Yue.C5376
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public /* bridge */ /* synthetic */ android.content.res.AssetFileDescriptor mo20262(int r1) throws android.content.res.Resources.NotFoundException {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = super.mo20262(r1)
            return r1
    }

    @Override // Yue.C5376
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public /* bridge */ /* synthetic */ void mo20263(java.lang.String r1, android.util.AttributeSet r2, android.os.Bundle r3) throws org.xmlpull.v1.XmlPullParserException {
            r0 = this;
            super.mo20263(r1, r2, r3)
            return
    }

    @Override // Yue.C5376
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public /* bridge */ /* synthetic */ void mo20264(android.content.res.XmlResourceParser r1, android.os.Bundle r2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = this;
            super.mo20264(r1, r2)
            return
    }

    @Override // Yue.C5376
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public /* bridge */ /* synthetic */ void mo20265(android.content.res.Configuration r1, android.util.DisplayMetrics r2) {
            r0 = this;
            super.mo20265(r1, r2)
            return
    }
}
