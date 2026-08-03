package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public class C6683 extends Yue.AbstractC6680 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final boolean f23362 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final java.lang.String f23363 = "VersionedParcelParcel";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final android.util.SparseIntArray f23364;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final android.os.Parcel f23365;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f23366;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f23367;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final java.lang.String f23368;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f23369;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f23370;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f23371;

    public C6683(android.os.Parcel r9) {
            r8 = this;
            int r2 = r9.dataPosition()
            int r3 = r9.dataSize()
            Yue.ۥ۟ۡۨۡ r5 = new Yue.ۥ۟ۡۨۡ
            r5.<init>()
            Yue.ۥ۟ۡۨۡ r6 = new Yue.ۥ۟ۡۨۡ
            r6.<init>()
            Yue.ۥ۟ۡۨۡ r7 = new Yue.ۥ۟ۡۨۡ
            r7.<init>()
            java.lang.String r4 = ""
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public C6683(android.os.Parcel r1, int r2, int r3, java.lang.String r4, Yue.C0573<java.lang.String, java.lang.reflect.Method> r5, Yue.C0573<java.lang.String, java.lang.reflect.Method> r6, Yue.C0573<java.lang.String, java.lang.Class> r7) {
            r0 = this;
            r0.<init>(r5, r6, r7)
            android.util.SparseIntArray r5 = new android.util.SparseIntArray
            r5.<init>()
            r0.f23364 = r5
            r5 = -1
            r0.f23369 = r5
            r0.f23371 = r5
            r0.f23365 = r1
            r0.f23366 = r2
            r0.f23367 = r3
            r0.f23370 = r2
            r0.f23368 = r4
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ */
    public void mo25724() {
            r4 = this;
            int r0 = r4.f23369
            if (r0 < 0) goto L21
            android.util.SparseIntArray r1 = r4.f23364
            int r0 = r1.get(r0)
            android.os.Parcel r1 = r4.f23365
            int r1 = r1.dataPosition()
            int r2 = r1 - r0
            android.os.Parcel r3 = r4.f23365
            r3.setDataPosition(r0)
            android.os.Parcel r0 = r4.f23365
            r0.writeInt(r2)
            android.os.Parcel r0 = r4.f23365
            r0.setDataPosition(r1)
        L21:
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Yue.AbstractC6680 mo25726() {
            r9 = this;
            Yue.ۥۣۢۦۢ r8 = new Yue.ۥۣۢۦۢ
            android.os.Parcel r1 = r9.f23365
            int r2 = r1.dataPosition()
            int r0 = r9.f23370
            int r3 = r9.f23366
            if (r0 != r3) goto L10
            int r0 = r9.f23367
        L10:
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r9.f23368
            r0.append(r4)
            java.lang.String r4 = "  "
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.reflect.Method> r5 = r9.f23358
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.reflect.Method> r6 = r9.f23359
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.Class> r7 = r9.f23360
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo25734() {
            r1 = this;
            android.os.Parcel r0 = r1.f23365
            int r0 = r0.readInt()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public android.os.Bundle mo25738() {
            r2 = this;
            android.os.Parcel r0 = r2.f23365
            java.lang.Class r1 = r2.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Bundle r0 = r0.readBundle(r1)
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public byte[] mo25741() {
            r2 = this;
            android.os.Parcel r0 = r2.f23365
            int r0 = r0.readInt()
            if (r0 >= 0) goto La
            r0 = 0
            return r0
        La:
            byte[] r0 = new byte[r0]
            android.os.Parcel r1 = r2.f23365
            r1.readByteArray(r0)
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public java.lang.CharSequence mo25744() {
            r2 = this;
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            android.os.Parcel r1 = r2.f23365
            java.lang.Object r0 = r0.createFromParcel(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public double mo25747() {
            r2 = this;
            android.os.Parcel r0 = r2.f23365
            double r0 = r0.readDouble()
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo25754(int r5) {
            r4 = this;
        L0:
            int r0 = r4.f23370
            int r1 = r4.f23367
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L37
            int r0 = r4.f23371
            if (r0 != r5) goto Ld
            return r3
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r0 = r0.compareTo(r1)
            if (r0 <= 0) goto L1c
            return r2
        L1c:
            android.os.Parcel r0 = r4.f23365
            int r1 = r4.f23370
            r0.setDataPosition(r1)
            android.os.Parcel r0 = r4.f23365
            int r0 = r0.readInt()
            android.os.Parcel r1 = r4.f23365
            int r1 = r1.readInt()
            r4.f23371 = r1
            int r1 = r4.f23370
            int r1 = r1 + r0
            r4.f23370 = r1
            goto L0
        L37:
            int r0 = r4.f23371
            if (r0 != r5) goto L3c
            r2 = r3
        L3c:
            return r2
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public float mo25755() {
            r1 = this;
            android.os.Parcel r0 = r1.f23365
            float r0 = r0.readFloat()
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public int mo25760() {
            r1 = this;
            android.os.Parcel r0 = r1.f23365
            int r0 = r0.readInt()
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public long mo25765() {
            r2 = this;
            android.os.Parcel r0 = r2.f23365
            long r0 = r0.readLong()
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public <T extends android.os.Parcelable> T mo25770() {
            r2 = this;
            android.os.Parcel r0 = r2.f23365
            java.lang.Class r1 = r2.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r0 = r0.readParcelable(r1)
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public java.lang.String mo25777() {
            r1 = this;
            android.os.Parcel r0 = r1.f23365
            java.lang.String r0 = r0.readString()
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public android.os.IBinder mo25779() {
            r1 = this;
            android.os.Parcel r0 = r1.f23365
            android.os.IBinder r0 = r0.readStrongBinder()
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public void mo25783(int r3) {
            r2 = this;
            r2.mo25724()
            r2.f23369 = r3
            android.util.SparseIntArray r0 = r2.f23364
            android.os.Parcel r1 = r2.f23365
            int r1 = r1.dataPosition()
            r0.put(r3, r1)
            r0 = 0
            r2.mo25812(r0)
            r2.mo25812(r3)
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ */
    public void mo25787(boolean r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f23365
            r0.writeInt(r2)
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ */
    public void mo25791(android.os.Bundle r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f23365
            r0.writeBundle(r2)
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public void mo25794(byte[] r3) {
            r2 = this;
            if (r3 == 0) goto Le
            android.os.Parcel r0 = r2.f23365
            int r1 = r3.length
            r0.writeInt(r1)
            android.os.Parcel r0 = r2.f23365
            r0.writeByteArray(r3)
            goto L14
        Le:
            android.os.Parcel r3 = r2.f23365
            r0 = -1
            r3.writeInt(r0)
        L14:
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ */
    public void mo25796(byte[] r3, int r4, int r5) {
            r2 = this;
            if (r3 == 0) goto Le
            android.os.Parcel r0 = r2.f23365
            int r1 = r3.length
            r0.writeInt(r1)
            android.os.Parcel r0 = r2.f23365
            r0.writeByteArray(r3, r4, r5)
            goto L14
        Le:
            android.os.Parcel r3 = r2.f23365
            r4 = -1
            r3.writeInt(r4)
        L14:
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ */
    public void mo25799(java.lang.CharSequence r3) {
            r2 = this;
            android.os.Parcel r0 = r2.f23365
            r1 = 0
            android.text.TextUtils.writeToParcel(r3, r0, r1)
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۦ */
    public void mo25803(double r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f23365
            r0.writeDouble(r2)
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ */
    public void mo25808(float r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f23365
            r0.writeFloat(r2)
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ */
    public void mo25812(int r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f23365
            r0.writeInt(r2)
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ */
    public void mo25817(long r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f23365
            r0.writeLong(r2)
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ */
    public void mo25823(android.os.Parcelable r3) {
            r2 = this;
            android.os.Parcel r0 = r2.f23365
            r1 = 0
            r0.writeParcelable(r3, r1)
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ */
    public void mo25831(java.lang.String r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f23365
            r0.writeString(r2)
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ */
    public void mo25833(android.os.IBinder r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f23365
            r0.writeStrongBinder(r2)
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۨۨ */
    public void mo25835(android.os.IInterface r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f23365
            r0.writeStrongInterface(r2)
            return
    }
}
