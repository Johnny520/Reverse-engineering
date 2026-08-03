package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
public class C1097 extends Yue.C1096 {
    public C1097() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final char m5871(int r3) {
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            r1 = 0
            r2 = 9
            r0.<init>(r1, r2)
            boolean r0 = r0.m13745(r3)
            if (r0 == 0) goto L12
            int r3 = r3 + 48
            char r3 = (char) r3
            return r3
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Int "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is not a decimal digit"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final char m5872(int r3, int r4) {
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            r1 = 2
            r2 = 36
            r0.<init>(r1, r2)
            boolean r0 = r0.m13745(r4)
            if (r0 == 0) goto L3f
            if (r3 < 0) goto L20
            if (r3 >= r4) goto L20
            r4 = 10
            if (r3 >= r4) goto L1a
            int r3 = r3 + 48
        L18:
            char r3 = (char) r3
            goto L1f
        L1a:
            int r3 = r3 + 65
            char r3 = (char) r3
            int r3 = r3 - r4
            goto L18
        L1f:
            return r3
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Digit "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " does not represent a valid digit in radix "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L3f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid radix: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ". Valid radix values are in range 2..36"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int m5873(char r3) {
            r0 = 10
            int r0 = Yue.C1096.m5843(r3, r0)
            if (r0 < 0) goto L9
            return r0
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Char "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is not a decimal digit"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int m5874(char r3, int r4) {
            java.lang.Integer r0 = m5876(r3, r4)
            if (r0 == 0) goto Lb
            int r3 = r0.intValue()
            return r3
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Char "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is not a digit in the given radix="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final java.lang.Integer m5875(char r1) {
            r0 = 10
            int r1 = Yue.C1096.m5843(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r1.intValue()
            if (r0 < 0) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final java.lang.Integer m5876(char r0, int r1) {
            Yue.C1096.m5842(r1)
            int r0 = Yue.C1096.m5843(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            if (r1 < 0) goto L12
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final boolean m5877(char r2, char r3, boolean r4) {
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            char r2 = java.lang.Character.toUpperCase(r2)
            char r3 = java.lang.Character.toUpperCase(r3)
            if (r2 == r3) goto L1e
            char r2 = java.lang.Character.toLowerCase(r2)
            char r3 = java.lang.Character.toLowerCase(r3)
            if (r2 != r3) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ boolean m5878(char r0, char r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = m5877(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final boolean m5879(char r3) {
            Yue.ۥۣ۟ۤۡ r0 = new Yue.ۥۣ۟ۤۡ
            r1 = 55296(0xd800, float:7.7486E-41)
            r2 = 57343(0xdfff, float:8.0355E-41)
            r0.<init>(r1, r2)
            boolean r3 = r0.m5772(r3)
            return r3
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final java.lang.String m5880(char r1, java.lang.String r2) {
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final java.lang.String m5881(char r0) {
            java.lang.String r0 = Yue.C7190.m27678(r0)
            return r0
    }
}
