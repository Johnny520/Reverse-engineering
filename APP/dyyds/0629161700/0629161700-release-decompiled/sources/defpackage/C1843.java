package defpackage;

/* JADX INFO: renamed from: ᲁᛴᛴᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1843 extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<defpackage.C1843> CREATOR = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean f8039;

    static {
            ᲈᛳᛸᲁ r0 = new ᲈᛳᛸᲁ
            r1 = 0
            r0.<init>(r1)
            defpackage.C1843.CREATOR = r0
            return
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            boolean r0 = r0.f8039
            byte r0 = (byte) r0
            r1.writeByte(r0)
            return
    }
}
