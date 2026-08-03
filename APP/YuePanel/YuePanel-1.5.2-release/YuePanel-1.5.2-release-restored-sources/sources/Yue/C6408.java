package Yue;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۢۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6408 {

    /* JADX INFO: renamed from: ۥ */
    public final String f2055;

    /* JADX INFO: renamed from: ۥ۟ */
    public CharSequence f2056;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String f16189;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f16190;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public List<C6405> f16191;

    /* JADX INFO: renamed from: Yue.ۥۡۢۥۧ$ۥ */
    @InterfaceC7113(26)
    public static class C0970 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static NotificationChannelGroup m2856(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static List<NotificationChannel> m2857(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static String m20008(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static String m20009(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static CharSequence m20010(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۥۧ$ۥ۟ */
    @InterfaceC7113(28)
    public static class C0971 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static String m2858(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m2859(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m20011(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۥۧ$ۥ۟۟, reason: contains not printable characters */
    public static class C6409 {

        /* JADX INFO: renamed from: ۥ */
        public final C6408 f2057;

        public C6409(@InterfaceC6391 String str) {
            this.f2057 = new C6408(str);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C6408 m2860() {
            return this.f2057;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C6409 m2861(@InterfaceC6490 String str) {
            this.f2057.f16189 = str;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C6409 m20012(@InterfaceC6490 CharSequence charSequence) {
            this.f2057.f2056 = charSequence;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6408(@InterfaceC6391 String str) {
        this.f16191 = Collections.emptyList();
        this.f2055 = (String) C6740.m21415(str);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public List<C6405> m2854() {
        return this.f16191;
    }

    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ۟ */
    public final List<C6405> m2855(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : list) {
            if (this.f2055.equals(C0970.m20008(notificationChannel))) {
                arrayList.add(new C6405(notificationChannel));
            }
        }
        return arrayList;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String m20002() {
        return this.f16189;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m20003() {
        return this.f2055;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public CharSequence m20004() {
        return this.f2056;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public NotificationChannelGroup m20005() {
        int i = Build.VERSION.SDK_INT;
        NotificationChannelGroup notificationChannelGroupM2856 = C0970.m2856(this.f2055, this.f2056);
        if (i >= 28) {
            C0971.m20011(notificationChannelGroupM2856, this.f16189);
        }
        return notificationChannelGroupM2856;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m20006() {
        return this.f16190;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C6409 m20007() {
        return new C6409(this.f2055).m20012(this.f2056).m2861(this.f16189);
    }

    @InterfaceC7113(28)
    public C6408(@InterfaceC6391 NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    @InterfaceC7113(26)
    public C6408(@InterfaceC6391 NotificationChannelGroup notificationChannelGroup, @InterfaceC6391 List<NotificationChannel> list) {
        this(C0970.m20009(notificationChannelGroup));
        this.f2056 = C0970.m20010(notificationChannelGroup);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f16189 = C0971.m2858(notificationChannelGroup);
        }
        if (i >= 28) {
            this.f16190 = C0971.m2859(notificationChannelGroup);
            this.f16191 = m2855(C0970.m2857(notificationChannelGroup));
        } else {
            this.f16191 = m2855(list);
        }
    }
}
