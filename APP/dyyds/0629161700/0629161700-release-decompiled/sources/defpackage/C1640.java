package defpackage;

/* JADX INFO: renamed from: ᲀᛳᛱᛶ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1640 implements android.text.TextWatcher {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ android.view.View f7324;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7325;

    static {
            r0 = 59
            com.android.NativeUtil.classesInit0(r0)
            return
    }

    public /* synthetic */ C1640(android.view.View r1, int r2) {
            r0 = this;
            r0.f7325 = r2
            r0.f7324 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    private final native void m3013(int r1, int r2, int r3, java.lang.CharSequence r4);

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    private final native void m3014(int r1, int r2, int r3, java.lang.CharSequence r4);

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    private final native void m3015(int r1, int r2, int r3, java.lang.CharSequence r4);

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    private final native void m3016(int r1, int r2, int r3, java.lang.CharSequence r4);

    @Override // android.text.TextWatcher
    public final native void afterTextChanged(android.text.Editable r1);

    @Override // android.text.TextWatcher
    public final native void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4);

    @Override // android.text.TextWatcher
    public final native void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4);
}
