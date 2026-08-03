package Yue;

import Yue.C6411;
import Yue.InterfaceC7144;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۢۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C6460 implements InterfaceC6404 {

    /* JADX INFO: renamed from: ۥ */
    public final Context f2086;

    /* JADX INFO: renamed from: ۥ۟ */
    public final Notification.Builder f2087;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C6411.C6434 f16533;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public RemoteViews f16534;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public RemoteViews f16535;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final List<Bundle> f16536 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Bundle f16537 = new Bundle();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f16538;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public RemoteViews f16539;

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ */
    @InterfaceC7113(20)
    public static class C0993 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Notification.Builder m2951(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Notification.Action.Builder m2952(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Notification.Action.Builder m20385(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static Notification.Action m20386(Notification.Action.Builder builder) {
            return builder.build();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static Notification.Action.Builder m20387(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static String m20388(Notification notification) {
            return notification.getGroup();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static Notification.Builder m20389(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static Notification.Builder m20390(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static Notification.Builder m20391(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static Notification.Builder m20392(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ۟ */
    @InterfaceC7113(21)
    public static class C0994 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Notification.Builder m2953(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Notification.Builder m2954(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Notification.Builder m20393(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static Notification.Builder m20394(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static Notification.Builder m20395(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static Notification.Builder m20396(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(23)
    public static class C6461 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Notification.Action.Builder m2955(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Notification.Builder m2956(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Notification.Builder m20397(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(24)
    public static class C6462 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Notification.Action.Builder m2957(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Notification.Builder m2958(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Notification.Builder m20398(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static Notification.Builder m20399(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static Notification.Builder m20400(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static class C6463 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Notification.Builder m2959(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Notification.Builder m2960(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Notification.Builder m20401(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static Notification.Builder m20402(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static Notification.Builder m20403(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static Notification.Builder m20404(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static Notification.Builder m20405(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7113(28)
    public static class C6464 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Notification.Builder m2961(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Notification.Action.Builder m2962(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7113(29)
    public static class C6465 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Notification.Builder m2963(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Notification.Builder m2964(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Notification.Action.Builder m20406(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static Notification.Builder m20407(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC7113(31)
    public static class C6466 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Notification.Action.Builder m2965(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Notification.Builder m2966(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    public C6460(C6411.C6434 c6434) {
        int i;
        this.f16533 = c6434;
        Context context = c6434.f2070;
        this.f2086 = context;
        Notification.Builder builderM2959 = C6463.m2959(context, c6434.f16400);
        this.f2087 = builderM2959;
        Notification notification = c6434.f16409;
        builderM2959.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, c6434.f16371).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c6434.f16367).setContentText(c6434.f16368).setContentInfo(c6434.f16373).setContentIntent(c6434.f16369).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c6434.f16370, (notification.flags & 128) != 0).setNumber(c6434.f16374).setProgress(c6434.f16383, c6434.f16384, c6434.f16385);
        IconCompat iconCompat = c6434.f16372;
        C6461.m2956(builderM2959, iconCompat == null ? null : iconCompat.m29571(context));
        builderM2959.setSubText(c6434.f16380).setUsesChronometer(c6434.f16377).setPriority(c6434.f16375);
        C6411.AbstractC6454 abstractC6454 = c6434.f16379;
        if (abstractC6454 instanceof C6411.C6436) {
            Iterator<C6411.C0973> it = ((C6411.C6436) abstractC6454).m20220().iterator();
            while (it.hasNext()) {
                m2950(it.next());
            }
        } else {
            Iterator<C6411.C0973> it2 = c6434.f2071.iterator();
            while (it2.hasNext()) {
                m2950(it2.next());
            }
        }
        Bundle bundle = c6434.f16393;
        if (bundle != null) {
            this.f16537.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f16534 = c6434.f16397;
        this.f16535 = c6434.f16398;
        this.f2087.setShowWhen(c6434.f16376);
        C0993.m20391(this.f2087, c6434.f16389);
        C0993.m20389(this.f2087, c6434.f16386);
        C0993.m20392(this.f2087, c6434.f16388);
        C0993.m20390(this.f2087, c6434.f16387);
        this.f16538 = c6434.f16405;
        C0994.m2954(this.f2087, c6434.f16392);
        C0994.m20393(this.f2087, c6434.f16394);
        C0994.m20396(this.f2087, c6434.f16395);
        C0994.m20394(this.f2087, c6434.f16396);
        C0994.m20395(this.f2087, notification.sound, notification.audioAttributes);
        List listM20379 = i2 < 28 ? m20379(m20380(c6434.f16365), c6434.f16412) : c6434.f16412;
        if (listM20379 != null && !listM20379.isEmpty()) {
            Iterator it3 = listM20379.iterator();
            while (it3.hasNext()) {
                C0994.m2953(this.f2087, (String) it3.next());
            }
        }
        this.f16539 = c6434.f16399;
        if (c6434.f16366.size() > 0) {
            Bundle bundle2 = c6434.m20145().getBundle(C6411.C6442.f16429);
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < c6434.f16366.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), C6468.m20415(c6434.f16366.get(i3)));
            }
            bundle2.putBundle(C6411.C6442.f16433, bundle4);
            bundle3.putBundle(C6411.C6442.f16433, bundle4);
            c6434.m20145().putBundle(C6411.C6442.f16429, bundle2);
            this.f16537.putBundle(C6411.C6442.f16429, bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        Object obj = c6434.f16411;
        if (obj != null) {
            C6461.m20397(this.f2087, obj);
        }
        this.f2087.setExtras(c6434.f16393);
        C6462.m20400(this.f2087, c6434.f16382);
        RemoteViews remoteViews = c6434.f16397;
        if (remoteViews != null) {
            C6462.m20398(this.f2087, remoteViews);
        }
        RemoteViews remoteViews2 = c6434.f16398;
        if (remoteViews2 != null) {
            C6462.m2958(this.f2087, remoteViews2);
        }
        RemoteViews remoteViews3 = c6434.f16399;
        if (remoteViews3 != null) {
            C6462.m20399(this.f2087, remoteViews3);
        }
        C6463.m2960(this.f2087, c6434.f16401);
        C6463.m20403(this.f2087, c6434.f16381);
        C6463.m20404(this.f2087, c6434.f16402);
        C6463.m20405(this.f2087, c6434.f16404);
        C6463.m20402(this.f2087, c6434.f16405);
        if (c6434.f16391) {
            C6463.m20401(this.f2087, c6434.f16390);
        }
        if (!TextUtils.isEmpty(c6434.f16400)) {
            this.f2087.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i4 >= 28) {
            Iterator<C6659> it4 = c6434.f16365.iterator();
            while (it4.hasNext()) {
                C6464.m2961(this.f2087, it4.next().m21286());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            C6465.m2963(this.f2087, c6434.f16407);
            C6465.m2964(this.f2087, C6411.C6432.m20110(c6434.f16408));
            C5861 c5861 = c6434.f16403;
            if (c5861 != null) {
                C6465.m20407(this.f2087, c5861.m18149());
            }
        }
        if (i5 >= 31 && (i = c6434.f16406) != 0) {
            C6466.m2966(this.f2087, i);
        }
        if (c6434.f16410) {
            if (this.f16533.f16387) {
                this.f16538 = 2;
            } else {
                this.f16538 = 1;
            }
            this.f2087.setVibrate(null);
            this.f2087.setSound(null);
            int i6 = notification.defaults & (-4);
            notification.defaults = i6;
            this.f2087.setDefaults(i6);
            if (TextUtils.isEmpty(this.f16533.f16386)) {
                C0993.m20389(this.f2087, C6411.f16298);
            }
            C6463.m20402(this.f2087, this.f16538);
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static List<String> m20379(@InterfaceC6490 List<String> list, @InterfaceC6490 List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C3399 c3399 = new C3399(list.size() + list2.size());
        c3399.addAll(list);
        c3399.addAll(list2);
        return new ArrayList(c3399);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static List<String> m20380(@InterfaceC6490 List<C6659> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C6659> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m21285());
        }
        return arrayList;
    }

    @Override // Yue.InterfaceC6404
    /* JADX INFO: renamed from: ۥ */
    public Notification.Builder mo2844() {
        return this.f2087;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m2950(C6411.C0973 c0973) {
        IconCompat iconCompatM20049 = c0973.m20049();
        Notification.Action.Builder builderM2955 = C6461.m2955(iconCompatM20049 != null ? iconCompatM20049.m29570() : null, c0973.m20053(), c0973.m2865());
        if (c0973.m20050() != null) {
            for (RemoteInput remoteInput : C7086.m22117(c0973.m20050())) {
                C0993.m20385(builderM2955, remoteInput);
            }
        }
        Bundle bundle = c0973.m20047() != null ? new Bundle(c0973.m20047()) : new Bundle();
        bundle.putBoolean(C6468.f16544, c0973.m2866());
        int i = Build.VERSION.SDK_INT;
        C6462.m2957(builderM2955, c0973.m2866());
        bundle.putInt(C6411.C0973.f16314, c0973.m20051());
        if (i >= 28) {
            C6464.m2962(builderM2955, c0973.m20051());
        }
        if (i >= 29) {
            C6465.m20406(builderM2955, c0973.m20055());
        }
        if (i >= 31) {
            C6466.m2965(builderM2955, c0973.m20054());
        }
        bundle.putBoolean(C6411.C0973.f16313, c0973.m20052());
        C0993.m2952(builderM2955, bundle);
        C0993.m2951(this.f2087, C0993.m20386(builderM2955));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Notification m20381() {
        Bundle bundleM20024;
        RemoteViews remoteViewsMo20270;
        RemoteViews remoteViewsMo20268;
        C6411.AbstractC6454 abstractC6454 = this.f16533.f16379;
        if (abstractC6454 != null) {
            abstractC6454.mo2888(this);
        }
        RemoteViews remoteViewsMo20269 = abstractC6454 != null ? abstractC6454.mo20269(this) : null;
        Notification notificationM20382 = m20382();
        if (remoteViewsMo20269 != null) {
            notificationM20382.contentView = remoteViewsMo20269;
        } else {
            RemoteViews remoteViews = this.f16533.f16397;
            if (remoteViews != null) {
                notificationM20382.contentView = remoteViews;
            }
        }
        if (abstractC6454 != null && (remoteViewsMo20268 = abstractC6454.mo20268(this)) != null) {
            notificationM20382.bigContentView = remoteViewsMo20268;
        }
        if (abstractC6454 != null && (remoteViewsMo20270 = this.f16533.f16379.mo20270(this)) != null) {
            notificationM20382.headsUpContentView = remoteViewsMo20270;
        }
        if (abstractC6454 != null && (bundleM20024 = C6411.m20024(notificationM20382)) != null) {
            abstractC6454.mo2892(bundleM20024);
        }
        return notificationM20382;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Notification m20382() {
        return this.f2087.build();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Context m20383() {
        return this.f2086;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m20384(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}
