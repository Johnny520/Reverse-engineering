package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@android.annotation.SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.InterfaceC6687 f30147;

    /* JADX INFO: renamed from: androidx.versionedparcelable.ParcelImpl$ۥ, reason: contains not printable characters */
    public static class C7820 implements android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> {
        public C7820() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.versionedparcelable.ParcelImpl createFromParcel(android.os.Parcel r1) {
                r0 = this;
                androidx.versionedparcelable.ParcelImpl r1 = r0.m30371(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.versionedparcelable.ParcelImpl[] newArray(int r1) {
                r0 = this;
                androidx.versionedparcelable.ParcelImpl[] r1 = r0.m30372(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.versionedparcelable.ParcelImpl m30371(android.os.Parcel r2) {
                r1 = this;
                androidx.versionedparcelable.ParcelImpl r0 = new androidx.versionedparcelable.ParcelImpl
                r0.<init>(r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.versionedparcelable.ParcelImpl[] m30372(int r1) {
                r0 = this;
                androidx.versionedparcelable.ParcelImpl[] r1 = new androidx.versionedparcelable.ParcelImpl[r1]
                return r1
        }
    }

    static {
            androidx.versionedparcelable.ParcelImpl$ۥ r0 = new androidx.versionedparcelable.ParcelImpl$ۥ
            r0.<init>()
            androidx.versionedparcelable.ParcelImpl.CREATOR = r0
            return
    }

    public ParcelImpl(Yue.InterfaceC6687 r1) {
            r0 = this;
            r0.<init>()
            r0.f30147 = r1
            return
    }

    public ParcelImpl(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            Yue.ۥۣۢۦۢ r0 = new Yue.ۥۣۢۦۢ
            r0.<init>(r2)
            Yue.ۥۣۢۦۤ r2 = r0.m25781()
            r1.f30147 = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            Yue.ۥۣۢۦۢ r2 = new Yue.ۥۣۢۦۢ
            r2.<init>(r1)
            Yue.ۥۣۢۦۤ r1 = r0.f30147
            r2.m25838(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public <T extends Yue.InterfaceC6687> T m30370() {
            r1 = this;
            Yue.ۥۣۢۦۤ r0 = r1.f30147
            return r0
    }
}
