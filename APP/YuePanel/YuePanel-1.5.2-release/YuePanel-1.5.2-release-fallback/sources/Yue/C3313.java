package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public final class C3313 implements android.os.Parcelable {

    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final android.os.Parcelable.Creator<Yue.C3313> CREATOR = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3313.C3317 f10757 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final android.content.IntentSender f10758;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final android.content.Intent f10759;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f10760;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f10761;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۦۣ$ۥ, reason: contains not printable characters */
    public static final class C3314 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final android.content.IntentSender f10762;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public android.content.Intent f10763;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f10764;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f10765;

        /* JADX INFO: renamed from: Yue.ۥ۠ۥۦۣ$ۥ$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC5401(Yue.EnumC0409.f947)
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InterfaceC3315 {
        }

        public C3314(@Yue.InterfaceC4418 android.app.PendingIntent r2) {
                r1 = this;
                java.lang.String r0 = "pendingIntent"
                Yue.C3329.m13906(r2, r0)
                android.content.IntentSender r2 = r2.getIntentSender()
                java.lang.String r0 = "pendingIntent.intentSender"
                Yue.C3329.m13905(r2, r0)
                r1.<init>(r2)
                return
        }

        public C3314(@Yue.InterfaceC4418 android.content.IntentSender r2) {
                r1 = this;
                java.lang.String r0 = "intentSender"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f10762 = r2
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C3313 m13864() {
                r5 = this;
                Yue.ۥ۠ۥۦۣ r0 = new Yue.ۥ۠ۥۦۣ
                android.content.IntentSender r1 = r5.f10762
                android.content.Intent r2 = r5.f10763
                int r3 = r5.f10764
                int r4 = r5.f10765
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C3313.C3314 m13865(@Yue.InterfaceC4543 android.content.Intent r1) {
                r0 = this;
                r0.f10763 = r1
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C3313.C3314 m13866(int r1, int r2) {
                r0 = this;
                r0.f10765 = r1
                r0.f10764 = r2
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۦۣ$ۥ۟, reason: contains not printable characters */
    public static final class C3316 implements android.os.Parcelable.Creator<Yue.C3313> {
        public C3316() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Yue.C3313 createFromParcel(android.os.Parcel r1) {
                r0 = this;
                Yue.ۥ۠ۥۦۣ r1 = r0.m13867(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Yue.C3313[] newArray(int r1) {
                r0 = this;
                Yue.ۥ۠ۥۦۣ[] r1 = r0.m13868(r1)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C3313 m13867(@Yue.InterfaceC4418 android.os.Parcel r2) {
                r1 = this;
                java.lang.String r0 = "inParcel"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥ۠ۥۦۣ r0 = new Yue.ۥ۠ۥۦۣ
                r0.<init>(r2)
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C3313[] m13868(int r1) {
                r0 = this;
                Yue.ۥ۠ۥۦۣ[] r1 = new Yue.C3313[r1]
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۦۣ$ۥ۟۟, reason: contains not printable characters */
    public static final class C3317 {
        public C3317() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C3317(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m13869() {
                return
        }
    }

    static {
            Yue.ۥ۠ۥۦۣ$ۥ۟۟ r0 = new Yue.ۥ۠ۥۦۣ$ۥ۟۟
            r1 = 0
            r0.<init>(r1)
            Yue.C3313.f10757 = r0
            Yue.ۥ۠ۥۦۣ$ۥ۟ r0 = new Yue.ۥ۠ۥۦۣ$ۥ۟
            r0.<init>()
            Yue.C3313.CREATOR = r0
            return
    }

    public C3313(@Yue.InterfaceC4418 android.content.IntentSender r2, @Yue.InterfaceC4543 android.content.Intent r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "intentSender"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f10758 = r2
            r1.f10759 = r3
            r1.f10760 = r4
            r1.f10761 = r5
            return
    }

    public /* synthetic */ C3313(android.content.IntentSender r2, android.content.Intent r3, int r4, int r5, int r6, Yue.C1769 r7) {
            r1 = this;
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r3 = 0
        L5:
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            r1.<init>(r2, r3, r4, r5)
            return
    }

    public C3313(@Yue.InterfaceC4418 android.os.Parcel r4) {
            r3 = this;
            java.lang.String r0 = "parcel"
            Yue.C3329.m13906(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            Yue.C3329.m13903(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Yue.InterfaceC4418 android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r0 = "dest"
            Yue.C3329.m13906(r2, r0)
            android.content.IntentSender r0 = r1.f10758
            r2.writeParcelable(r0, r3)
            android.content.Intent r0 = r1.f10759
            r2.writeParcelable(r0, r3)
            int r3 = r1.f10760
            r2.writeInt(r3)
            int r3 = r1.f10761
            r2.writeInt(r3)
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Intent m13860() {
            r1 = this;
            android.content.Intent r0 = r1.f10759
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int m13861() {
            r1 = this;
            int r0 = r1.f10760
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m13862() {
            r1 = this;
            int r0 = r1.f10761
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final android.content.IntentSender m13863() {
            r1 = this;
            android.content.IntentSender r0 = r1.f10758
            return r0
    }
}
