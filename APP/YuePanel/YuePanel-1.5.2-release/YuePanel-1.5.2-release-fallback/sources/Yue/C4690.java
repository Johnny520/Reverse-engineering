package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class C4690 {

    /* JADX INFO: renamed from: Yue.ۥۣۡۧ$ۥ, reason: contains not printable characters */
    public static class C4691<T> implements android.os.Parcelable.ClassLoaderCreator<T> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.InterfaceC4692<T> f14907;

        public C4691(Yue.InterfaceC4692<T> r1) {
                r0 = this;
                r0.<init>()
                r0.f14907 = r1
                return
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(android.os.Parcel r3) {
                r2 = this;
                Yue.ۥۣۡۧ۟<T> r0 = r2.f14907
                r1 = 0
                java.lang.Object r3 = r0.createFromParcel(r3, r1)
                return r3
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                Yue.ۥۣۡۧ۟<T> r0 = r1.f14907
                java.lang.Object r2 = r0.createFromParcel(r2, r3)
                return r2
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int r2) {
                r1 = this;
                Yue.ۥۣۡۧ۟<T> r0 = r1.f14907
                java.lang.Object[] r2 = r0.newArray(r2)
                return r2
        }
    }

    public C4690() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static <T> android.os.Parcelable.Creator<T> m18587(Yue.InterfaceC4692<T> r1) {
            Yue.ۥۣۡۧ$ۥ r0 = new Yue.ۥۣۡۧ$ۥ
            r0.<init>(r1)
            return r0
    }
}
