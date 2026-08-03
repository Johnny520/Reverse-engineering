package Yue;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: renamed from: Yue.ۥۡۢۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6405 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final String f16170 = "miscellaneous";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final boolean f16171 = true;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f16172 = 0;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final String f2052;

    /* JADX INFO: renamed from: ۥ۟ */
    public CharSequence f2053;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f16173;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String f16174;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public String f16175;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f16176;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Uri f16177;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public AudioAttributes f16178;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f16179;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f16180;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f16181;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public long[] f16182;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public String f16183;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public String f16184;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean f16185;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int f16186;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean f16187;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean f16188;

    /* JADX INFO: renamed from: Yue.ۥۡۢۥۦ$ۥ */
    @InterfaceC7113(26)
    public static class C0968 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m2847(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m2848(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static NotificationChannel m19969(String str, CharSequence charSequence, int i) {
            return new NotificationChannel(str, charSequence, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m19970(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableLights(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m19971(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableVibration(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static AudioAttributes m19972(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static String m19973(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static String m19974(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static String m19975(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static int m19976(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static int m19977(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static int m19978(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static CharSequence m19979(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static Uri m19980(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static long[] m19981(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static void m19982(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static void m19983(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static void m19984(NotificationChannel notificationChannel, int i) {
            notificationChannel.setLightColor(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static void m19985(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.setShowBadge(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static void m19986(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static void m19987(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static boolean m19988(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static boolean m19989(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۥۦ$ۥ۟ */
    @InterfaceC7113(29)
    public static class C0969 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m2849(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۥۦ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C6406 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static String m2850(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static String m2851(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m19990(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m19991(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۥۦ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C6407 {

        /* JADX INFO: renamed from: ۥ */
        public final C6405 f2054;

        public C6407(@InterfaceC6391 String str, int i) {
            this.f2054 = new C6405(str, i);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C6405 m2852() {
            return this.f2054;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C6407 m2853(@InterfaceC6391 String str, @InterfaceC6391 String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                C6405 c6405 = this.f2054;
                c6405.f16183 = str;
                c6405.f16184 = str2;
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C6407 m19992(@InterfaceC6490 String str) {
            this.f2054.f16174 = str;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C6407 m19993(@InterfaceC6490 String str) {
            this.f2054.f16175 = str;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C6407 m19994(int i) {
            this.f2054.f16173 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C6407 m19995(int i) {
            this.f2054.f16180 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C6407 m19996(boolean z) {
            this.f2054.f16179 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public C6407 m19997(@InterfaceC6490 CharSequence charSequence) {
            this.f2054.f2053 = charSequence;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public C6407 m19998(boolean z) {
            this.f2054.f16176 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public C6407 m19999(@InterfaceC6490 Uri uri, @InterfaceC6490 AudioAttributes audioAttributes) {
            C6405 c6405 = this.f2054;
            c6405.f16177 = uri;
            c6405.f16178 = audioAttributes;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public C6407 m20000(boolean z) {
            this.f2054.f16181 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public C6407 m20001(@InterfaceC6490 long[] jArr) {
            C6405 c6405 = this.f2054;
            c6405.f16181 = jArr != null && jArr.length > 0;
            c6405.f16182 = jArr;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6405(@InterfaceC6391 String str, int i) {
        this.f16176 = true;
        this.f16177 = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f16180 = 0;
        this.f2052 = (String) C6740.m21415(str);
        this.f16173 = i;
        this.f16178 = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m2845() {
        return this.f16187;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m2846() {
        return this.f16185;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m19951() {
        return this.f16176;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public AudioAttributes m19952() {
        return this.f16178;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public String m19953() {
        return this.f16184;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public String m19954() {
        return this.f16174;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public String m19955() {
        return this.f16175;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public String m19956() {
        return this.f2052;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m19957() {
        return this.f16173;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m19958() {
        return this.f16180;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int m19959() {
        return this.f16186;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public CharSequence m19960() {
        return this.f2053;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public NotificationChannel m19961() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        NotificationChannel notificationChannelM19969 = C0968.m19969(this.f2052, this.f2053, this.f16173);
        C0968.m19982(notificationChannelM19969, this.f16174);
        C0968.m19983(notificationChannelM19969, this.f16175);
        C0968.m19985(notificationChannelM19969, this.f16176);
        C0968.m19986(notificationChannelM19969, this.f16177, this.f16178);
        C0968.m19970(notificationChannelM19969, this.f16179);
        C0968.m19984(notificationChannelM19969, this.f16180);
        C0968.m19987(notificationChannelM19969, this.f16182);
        C0968.m19971(notificationChannelM19969, this.f16181);
        if (i >= 30 && (str = this.f16183) != null && (str2 = this.f16184) != null) {
            C6406.m19991(notificationChannelM19969, str, str2);
        }
        return notificationChannelM19969;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public String m19962() {
        return this.f16183;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public Uri m19963() {
        return this.f16177;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public long[] m19964() {
        return this.f16182;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean m19965() {
        return this.f16188;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m19966() {
        return this.f16179;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m19967() {
        return this.f16181;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C6407 m19968() {
        return new C6407(this.f2052, this.f16173).m19997(this.f2053).m19992(this.f16174).m19993(this.f16175).m19998(this.f16176).m19999(this.f16177, this.f16178).m19996(this.f16179).m19995(this.f16180).m20000(this.f16181).m20001(this.f16182).m2853(this.f16183, this.f16184);
    }

    @InterfaceC7113(26)
    public C6405(@InterfaceC6391 NotificationChannel notificationChannel) {
        this(C0968.m19975(notificationChannel), C0968.m19976(notificationChannel));
        this.f2053 = C0968.m19979(notificationChannel);
        this.f16174 = C0968.m19973(notificationChannel);
        this.f16175 = C0968.m19974(notificationChannel);
        this.f16176 = C0968.m2848(notificationChannel);
        this.f16177 = C0968.m19980(notificationChannel);
        this.f16178 = C0968.m19972(notificationChannel);
        this.f16179 = C0968.m19988(notificationChannel);
        this.f16180 = C0968.m19977(notificationChannel);
        this.f16181 = C0968.m19989(notificationChannel);
        this.f16182 = C0968.m19981(notificationChannel);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f16183 = C6406.m2851(notificationChannel);
            this.f16184 = C6406.m2850(notificationChannel);
        }
        this.f16185 = C0968.m2847(notificationChannel);
        this.f16186 = C0968.m19978(notificationChannel);
        if (i >= 29) {
            this.f16187 = C0969.m2849(notificationChannel);
        }
        if (i >= 30) {
            this.f16188 = C6406.m19990(notificationChannel);
        }
    }
}
