package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4689 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f14906 = "a";

    public C4689() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static <T extends Yue.InterfaceC6687> T m18579(java.io.InputStream r2) {
            Yue.ۥۣۢۦۣ r0 = new Yue.ۥۣۢۦۣ
            r1 = 0
            r0.<init>(r2, r1)
            Yue.ۥۣۢۦۤ r2 = r0.m25781()
            return r2
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static <T extends Yue.InterfaceC6687> T m18580(android.os.Parcelable r1) {
            boolean r0 = r1 instanceof androidx.versionedparcelable.ParcelImpl
            if (r0 == 0) goto Lb
            androidx.versionedparcelable.ParcelImpl r1 = (androidx.versionedparcelable.ParcelImpl) r1
            Yue.ۥۣۢۦۤ r1 = r1.m30370()
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid parcel"
            r1.<init>(r0)
            throw r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static <T extends Yue.InterfaceC6687> T m18581(@Yue.InterfaceC4410 android.os.Bundle r1, @Yue.InterfaceC4410 java.lang.String r2) {
            r0 = 0
            android.os.Parcelable r1 = r1.getParcelable(r2)     // Catch: java.lang.RuntimeException -> L1e
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch: java.lang.RuntimeException -> L1e
            if (r1 != 0) goto La
            return r0
        La:
            java.lang.Class<Yue.ۥۣۡۦۨ> r2 = Yue.C4689.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.RuntimeException -> L1e
            r1.setClassLoader(r2)     // Catch: java.lang.RuntimeException -> L1e
            java.lang.String r2 = "a"
            android.os.Parcelable r1 = r1.getParcelable(r2)     // Catch: java.lang.RuntimeException -> L1e
            Yue.ۥۣۢۦۤ r1 = m18580(r1)     // Catch: java.lang.RuntimeException -> L1e
            return r1
        L1e:
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <T extends Yue.InterfaceC6687> java.util.List<T> m18582(android.os.Bundle r1, java.lang.String r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Parcelable r1 = r1.getParcelable(r2)     // Catch: java.lang.RuntimeException -> L33
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch: java.lang.RuntimeException -> L33
            java.lang.Class<Yue.ۥۣۡۦۨ> r2 = Yue.C4689.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.RuntimeException -> L33
            r1.setClassLoader(r2)     // Catch: java.lang.RuntimeException -> L33
            java.lang.String r2 = "a"
            java.util.ArrayList r1 = r1.getParcelableArrayList(r2)     // Catch: java.lang.RuntimeException -> L33
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.RuntimeException -> L33
        L1e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.RuntimeException -> L33
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()     // Catch: java.lang.RuntimeException -> L33
            android.os.Parcelable r2 = (android.os.Parcelable) r2     // Catch: java.lang.RuntimeException -> L33
            Yue.ۥۣۢۦۤ r2 = m18580(r2)     // Catch: java.lang.RuntimeException -> L33
            r0.add(r2)     // Catch: java.lang.RuntimeException -> L33
            goto L1e
        L32:
            return r0
        L33:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m18583(@Yue.InterfaceC4410 android.os.Bundle r2, @Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4544 Yue.InterfaceC6687 r4) {
            if (r4 != 0) goto L3
            return
        L3:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "a"
            android.os.Parcelable r4 = m18586(r4)
            r0.putParcelable(r1, r4)
            r2.putParcelable(r3, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m18584(@Yue.InterfaceC4410 android.os.Bundle r3, @Yue.InterfaceC4410 java.lang.String r4, @Yue.InterfaceC4410 java.util.List<? extends Yue.InterfaceC6687> r5) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r5.next()
            Yue.ۥۣۢۦۤ r2 = (Yue.InterfaceC6687) r2
            android.os.Parcelable r2 = m18586(r2)
            r1.add(r2)
            goto Le
        L22:
            java.lang.String r5 = "a"
            r0.putParcelableArrayList(r5, r1)
            r3.putParcelable(r4, r0)
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m18585(Yue.InterfaceC6687 r2, java.io.OutputStream r3) {
            Yue.ۥۣۢۦۣ r0 = new Yue.ۥۣۢۦۣ
            r1 = 0
            r0.<init>(r1, r3)
            r0.m25838(r2)
            r0.mo25724()
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static android.os.Parcelable m18586(Yue.InterfaceC6687 r1) {
            androidx.versionedparcelable.ParcelImpl r0 = new androidx.versionedparcelable.ParcelImpl
            r0.<init>(r1)
            return r0
    }
}
