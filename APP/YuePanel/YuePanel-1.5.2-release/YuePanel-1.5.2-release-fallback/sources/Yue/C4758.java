package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4758 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f15076 = "name";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f15077 = "icon";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f15078 = "uri";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f15079 = "key";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.String f15080 = "isBot";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.lang.String f15081 = "isImportant";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public java.lang.CharSequence f15082;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public androidx.core.graphics.drawable.IconCompat f15083;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public java.lang.String f15084;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public java.lang.String f15085;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f15086;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f15087;

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠ۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(22)
    public static class C4759 {
        public C4759() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static Yue.C4758 m18969(android.os.PersistableBundle r2) {
                Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = new Yue.ۥۡۤ۠ۥ$ۥ۟۟
                r0.<init>()
                java.lang.String r1 = "name"
                java.lang.String r1 = r2.getString(r1)
                Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = r0.m18978(r1)
                java.lang.String r1 = "uri"
                java.lang.String r1 = r2.getString(r1)
                Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = r0.m18979(r1)
                java.lang.String r1 = "key"
                java.lang.String r1 = r2.getString(r1)
                Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = r0.m18977(r1)
                java.lang.String r1 = "isBot"
                boolean r1 = r2.getBoolean(r1)
                Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = r0.m18974(r1)
                java.lang.String r1 = "isImportant"
                boolean r2 = r2.getBoolean(r1)
                Yue.ۥۡۤ۠ۥ$ۥ۟۟ r2 = r0.m18976(r2)
                Yue.ۥۡۤ۠ۥ r2 = r2.m18973()
                return r2
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.os.PersistableBundle m18970(Yue.C4758 r3) {
                android.os.PersistableBundle r0 = new android.os.PersistableBundle
                r0.<init>()
                java.lang.CharSequence r1 = r3.f15082
                if (r1 == 0) goto Le
                java.lang.String r1 = r1.toString()
                goto Lf
            Le:
                r1 = 0
            Lf:
                java.lang.String r2 = "name"
                r0.putString(r2, r1)
                java.lang.String r1 = "uri"
                java.lang.String r2 = r3.f15084
                r0.putString(r1, r2)
                java.lang.String r1 = "key"
                java.lang.String r2 = r3.f15085
                r0.putString(r1, r2)
                java.lang.String r1 = "isBot"
                boolean r2 = r3.f15086
                r0.putBoolean(r1, r2)
                java.lang.String r1 = "isImportant"
                boolean r3 = r3.f15087
                r0.putBoolean(r1, r3)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠ۥ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C4760 {
        public C4760() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static Yue.C4758 m18971(android.app.Person r2) {
                Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = new Yue.ۥۡۤ۠ۥ$ۥ۟۟
                r0.<init>()
                java.lang.CharSequence r1 = r2.getName()
                Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = r0.m18978(r1)
                android.graphics.drawable.Icon r1 = r2.getIcon()
                if (r1 == 0) goto L1c
                android.graphics.drawable.Icon r1 = r2.getIcon()
                androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.m28833(r1)
                goto L1d
            L1c:
                r1 = 0
            L1d:
                Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = r0.m18975(r1)
                java.lang.String r1 = r2.getUri()
                Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = r0.m18979(r1)
                java.lang.String r1 = r2.getKey()
                Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = r0.m18977(r1)
                boolean r1 = r2.isBot()
                Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = r0.m18974(r1)
                boolean r2 = r2.isImportant()
                Yue.ۥۡۤ۠ۥ$ۥ۟۟ r2 = r0.m18976(r2)
                Yue.ۥۡۤ۠ۥ r2 = r2.m18973()
                return r2
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.Person m18972(Yue.C4758 r2) {
                android.app.Person$Builder r0 = new android.app.Person$Builder
                r0.<init>()
                java.lang.CharSequence r1 = r2.m18960()
                android.app.Person$Builder r0 = r0.setName(r1)
                androidx.core.graphics.drawable.IconCompat r1 = r2.m18958()
                if (r1 == 0) goto L1c
                androidx.core.graphics.drawable.IconCompat r1 = r2.m18958()
                android.graphics.drawable.Icon r1 = r1.m28863()
                goto L1d
            L1c:
                r1 = 0
            L1d:
                android.app.Person$Builder r0 = r0.setIcon(r1)
                java.lang.String r1 = r2.m18961()
                android.app.Person$Builder r0 = r0.setUri(r1)
                java.lang.String r1 = r2.m18959()
                android.app.Person$Builder r0 = r0.setKey(r1)
                boolean r1 = r2.m18962()
                android.app.Person$Builder r0 = r0.setBot(r1)
                boolean r2 = r2.m18963()
                android.app.Person$Builder r2 = r0.setImportant(r2)
                android.app.Person r2 = r2.build()
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠ۥ$ۥ۟۟, reason: contains not printable characters */
    public static class C4761 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public java.lang.CharSequence f15088;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public androidx.core.graphics.drawable.IconCompat f15089;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public java.lang.String f15090;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public java.lang.String f15091;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f15092;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f15093;

        public C4761() {
                r0 = this;
                r0.<init>()
                return
        }

        public C4761(Yue.C4758 r2) {
                r1 = this;
                r1.<init>()
                java.lang.CharSequence r0 = r2.f15082
                r1.f15088 = r0
                androidx.core.graphics.drawable.IconCompat r0 = r2.f15083
                r1.f15089 = r0
                java.lang.String r0 = r2.f15084
                r1.f15090 = r0
                java.lang.String r0 = r2.f15085
                r1.f15091 = r0
                boolean r0 = r2.f15086
                r1.f15092 = r0
                boolean r2 = r2.f15087
                r1.f15093 = r2
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C4758 m18973() {
                r1 = this;
                Yue.ۥۡۤ۠ۥ r0 = new Yue.ۥۡۤ۠ۥ
                r0.<init>(r1)
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C4758.C4761 m18974(boolean r1) {
                r0 = this;
                r0.f15092 = r1
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C4758.C4761 m18975(@Yue.InterfaceC4544 androidx.core.graphics.drawable.IconCompat r1) {
                r0 = this;
                r0.f15089 = r1
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Yue.C4758.C4761 m18976(boolean r1) {
                r0 = this;
                r0.f15093 = r1
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Yue.C4758.C4761 m18977(@Yue.InterfaceC4544 java.lang.String r1) {
                r0 = this;
                r0.f15091 = r1
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Yue.C4758.C4761 m18978(@Yue.InterfaceC4544 java.lang.CharSequence r1) {
                r0 = this;
                r0.f15088 = r1
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Yue.C4758.C4761 m18979(@Yue.InterfaceC4544 java.lang.String r1) {
                r0 = this;
                r0.f15090 = r1
                return r0
        }
    }

    public C4758(Yue.C4758.C4761 r2) {
            r1 = this;
            r1.<init>()
            java.lang.CharSequence r0 = r2.f15088
            r1.f15082 = r0
            androidx.core.graphics.drawable.IconCompat r0 = r2.f15089
            r1.f15083 = r0
            java.lang.String r0 = r2.f15090
            r1.f15084 = r0
            java.lang.String r0 = r2.f15091
            r1.f15085 = r0
            boolean r0 = r2.f15092
            r1.f15086 = r0
            boolean r2 = r2.f15093
            r1.f15087 = r2
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC5336(28)
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C4758 m18955(@Yue.InterfaceC4410 android.app.Person r0) {
            Yue.ۥۡۤ۠ۥ r0 = Yue.C4758.C4760.m18971(r0)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C4758 m18956(@Yue.InterfaceC4410 android.os.Bundle r3) {
            java.lang.String r0 = "icon"
            android.os.Bundle r0 = r3.getBundle(r0)
            Yue.ۥۡۤ۠ۥ$ۥ۟۟ r1 = new Yue.ۥۡۤ۠ۥ$ۥ۟۟
            r1.<init>()
            java.lang.String r2 = "name"
            java.lang.CharSequence r2 = r3.getCharSequence(r2)
            Yue.ۥۡۤ۠ۥ$ۥ۟۟ r1 = r1.m18978(r2)
            if (r0 == 0) goto L1c
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.m28831(r0)
            goto L1d
        L1c:
            r0 = 0
        L1d:
            Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = r1.m18975(r0)
            java.lang.String r1 = "uri"
            java.lang.String r1 = r3.getString(r1)
            Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = r0.m18979(r1)
            java.lang.String r1 = "key"
            java.lang.String r1 = r3.getString(r1)
            Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = r0.m18977(r1)
            java.lang.String r1 = "isBot"
            boolean r1 = r3.getBoolean(r1)
            Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = r0.m18974(r1)
            java.lang.String r1 = "isImportant"
            boolean r3 = r3.getBoolean(r1)
            Yue.ۥۡۤ۠ۥ$ۥ۟۟ r3 = r0.m18976(r3)
            Yue.ۥۡۤ۠ۥ r3 = r3.m18973()
            return r3
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC5336(22)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C4758 m18957(@Yue.InterfaceC4410 android.os.PersistableBundle r0) {
            Yue.ۥۡۤ۠ۥ r0 = Yue.C4758.C4759.m18969(r0)
            return r0
    }

    public boolean equals(@Yue.InterfaceC4544 java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof Yue.C4758
            if (r1 != 0) goto L9
            return r0
        L9:
            Yue.ۥۡۤ۠ۥ r4 = (Yue.C4758) r4
            java.lang.String r1 = r3.m18959()
            java.lang.String r2 = r4.m18959()
            if (r1 != 0) goto L6a
            if (r2 == 0) goto L18
            goto L6a
        L18:
            java.lang.CharSequence r1 = r3.m18960()
            java.lang.String r1 = java.util.Objects.toString(r1)
            java.lang.CharSequence r2 = r4.m18960()
            java.lang.String r2 = java.util.Objects.toString(r2)
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L69
            java.lang.String r1 = r3.m18961()
            java.lang.String r2 = r4.m18961()
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L69
            boolean r1 = r3.m18962()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r2 = r4.m18962()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L69
            boolean r1 = r3.m18963()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r4 = r4.m18963()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L69
            r0 = 1
        L69:
            return r0
        L6a:
            boolean r4 = java.util.Objects.equals(r1, r2)
            return r4
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.m18959()
            if (r0 == 0) goto Lb
            int r0 = r0.hashCode()
            return r0
        Lb:
            java.lang.CharSequence r0 = r4.m18960()
            java.lang.String r1 = r4.m18961()
            boolean r2 = r4.m18962()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r4.m18963()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public androidx.core.graphics.drawable.IconCompat m18958() {
            r1 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r1.f15083
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.String m18959() {
            r1 = this;
            java.lang.String r0 = r1.f15085
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.CharSequence m18960() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f15082
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.lang.String m18961() {
            r1 = this;
            java.lang.String r0 = r1.f15084
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m18962() {
            r1 = this;
            boolean r0 = r1.f15086
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m18963() {
            r1 = this;
            boolean r0 = r1.f15087
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public java.lang.String m18964() {
            r2 = this;
            java.lang.String r0 = r2.f15084
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.CharSequence r0 = r2.f15082
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "name:"
            r0.append(r1)
            java.lang.CharSequence r1 = r2.f15082
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1d:
            java.lang.String r0 = ""
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC5336(28)
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public android.app.Person m18965() {
            r1 = this;
            android.app.Person r0 = Yue.C4758.C4760.m18972(r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Yue.C4758.C4761 m18966() {
            r1 = this;
            Yue.ۥۡۤ۠ۥ$ۥ۟۟ r0 = new Yue.ۥۡۤ۠ۥ$ۥ۟۟
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public android.os.Bundle m18967() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.CharSequence r2 = r3.f15082
            r0.putCharSequence(r1, r2)
            androidx.core.graphics.drawable.IconCompat r1 = r3.f15083
            if (r1 == 0) goto L15
            android.os.Bundle r1 = r1.m28862()
            goto L16
        L15:
            r1 = 0
        L16:
            java.lang.String r2 = "icon"
            r0.putBundle(r2, r1)
            java.lang.String r1 = "uri"
            java.lang.String r2 = r3.f15084
            r0.putString(r1, r2)
            java.lang.String r1 = "key"
            java.lang.String r2 = r3.f15085
            r0.putString(r1, r2)
            java.lang.String r1 = "isBot"
            boolean r2 = r3.f15086
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "isImportant"
            boolean r2 = r3.f15087
            r0.putBoolean(r1, r2)
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC5336(22)
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public android.os.PersistableBundle m18968() {
            r1 = this;
            android.os.PersistableBundle r0 = Yue.C4758.C4759.m18970(r1)
            return r0
    }
}
