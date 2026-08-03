package Yue;

import Yue.InterfaceC5395;
import Yue.InterfaceC7144;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۡۢۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6470 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f16568 = "NotifManCompat";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f16569 = "checkOpNoThrow";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f16570 = "OP_POST_NOTIFICATION";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f16571 = "android.support.useSideChannel";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f16572 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f16573 = 19;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f16574 = 1000;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f16575 = 6;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f16576 = "enabled_notification_listeners";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC5225("sEnabledNotificationListenersLock")
    public static String f16578 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    @InterfaceC5225("sLock")
    public static ServiceConnectionC6480 f16581 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f16582 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f16583 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f16584 = 3;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f16585 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f16586 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f16587 = -1000;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f16588 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f16589 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f16590 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f16591 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f16592 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f16593 = 5;

    /* JADX INFO: renamed from: ۥ */
    public final Context f2092;

    /* JADX INFO: renamed from: ۥ۟ */
    public final NotificationManager f2093;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final Object f16577 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC5225("sEnabledNotificationListenersLock")
    public static Set<String> f16579 = new HashSet();

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final Object f16580 = new Object();

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ */
    @InterfaceC7113(23)
    public static class C0996 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static List<StatusBarNotification> m2973(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static int m2974(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟ */
    @InterfaceC7113(24)
    public static class C0997 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m2975(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static int m2976(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static class C6471 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m2977(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m2978(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m20457(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m20458(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m20459(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static void m20460(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static String m20461(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static String m20462(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static NotificationChannel m20463(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static List<NotificationChannelGroup> m20464(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static List<NotificationChannel> m20465(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(28)
    public static class C6472 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static NotificationChannelGroup m2979(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C6473 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static NotificationChannel m2980(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static String m2981(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7113(34)
    public static class C6474 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m2982(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6476 {
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C6478 implements InterfaceC6481 {

        /* JADX INFO: renamed from: ۥ */
        public final String f2098;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f2099;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final String f16597;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Notification f16598;

        public C6478(String str, int i, String str2, Notification notification) {
            this.f2098 = str;
            this.f2099 = i;
            this.f16597 = str2;
            this.f16598 = notification;
        }

        @InterfaceC6391
        public String toString() {
            return "NotifyTask[packageName:" + this.f2098 + ", id:" + this.f2099 + ", tag:" + this.f16597 + "]";
        }

        @Override // Yue.C6470.InterfaceC6481
        /* JADX INFO: renamed from: ۥ */
        public void mo2983(InterfaceC5395 interfaceC5395) throws RemoteException {
            interfaceC5395.mo16879(this.f2098, this.f2099, this.f16597, this.f16598);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static class C6479 {

        /* JADX INFO: renamed from: ۥ */
        public final ComponentName f2100;

        /* JADX INFO: renamed from: ۥ۟ */
        public final IBinder f2101;

        public C6479(ComponentName componentName, IBinder iBinder) {
            this.f2100 = componentName;
            this.f2101 = iBinder;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class ServiceConnectionC6480 implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f16599 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f16600 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f16601 = 2;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f16602 = 3;

        /* JADX INFO: renamed from: ۥ */
        public final Context f2102;

        /* JADX INFO: renamed from: ۥ۟ */
        public final HandlerThread f2103;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Handler f16603;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Map<ComponentName, C0998> f16604 = new HashMap();

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Set<String> f16605 = new HashSet();

        /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟ۦ$ۥ */
        public static class C0998 {

            /* JADX INFO: renamed from: ۥ */
            public final ComponentName f2104;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public InterfaceC5395 f16606;

            /* JADX INFO: renamed from: ۥ۟ */
            public boolean f2105 = false;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public ArrayDeque<InterfaceC6481> f16607 = new ArrayDeque<>();

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public int f16608 = 0;

            public C0998(ComponentName componentName) {
                this.f2104 = componentName;
            }
        }

        public ServiceConnectionC6480(Context context) {
            this.f2102 = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f2103 = handlerThread;
            handlerThread.start();
            this.f16603 = new Handler(handlerThread.getLooper(), this);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m20466((InterfaceC6481) message.obj);
                return true;
            }
            if (i == 1) {
                C6479 c6479 = (C6479) message.obj;
                m20468(c6479.f2100, c6479.f2101);
                return true;
            }
            if (i == 2) {
                m20469((ComponentName) message.obj);
                return true;
            }
            if (i != 3) {
                return false;
            }
            m20467((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(C6470.f16568, 3)) {
                Log.d(C6470.f16568, "Connected to service " + componentName);
            }
            this.f16603.obtainMessage(1, new C6479(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(C6470.f16568, 3)) {
                Log.d(C6470.f16568, "Disconnected from service " + componentName);
            }
            this.f16603.obtainMessage(2, componentName).sendToTarget();
        }

        /* JADX INFO: renamed from: ۥ */
        public final boolean m2984(C0998 c0998) {
            if (c0998.f2105) {
                return true;
            }
            boolean zBindService = this.f2102.bindService(new Intent(C6470.f16572).setComponent(c0998.f2104), this, 33);
            c0998.f2105 = zBindService;
            if (zBindService) {
                c0998.f16608 = 0;
            } else {
                Log.w(C6470.f16568, "Unable to bind to listener " + c0998.f2104);
                this.f2102.unbindService(this);
            }
            return c0998.f2105;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m2985(C0998 c0998) {
            if (c0998.f2105) {
                this.f2102.unbindService(this);
                c0998.f2105 = false;
            }
            c0998.f16606 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m20466(InterfaceC6481 interfaceC6481) {
            m20473();
            for (C0998 c0998 : this.f16604.values()) {
                c0998.f16607.add(interfaceC6481);
                m20470(c0998);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m20467(ComponentName componentName) {
            C0998 c0998 = this.f16604.get(componentName);
            if (c0998 != null) {
                m20470(c0998);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m20468(ComponentName componentName, IBinder iBinder) {
            C0998 c0998 = this.f16604.get(componentName);
            if (c0998 != null) {
                c0998.f16606 = InterfaceC5395.AbstractBinderC0743.m16880(iBinder);
                c0998.f16608 = 0;
                m20470(c0998);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m20469(ComponentName componentName) {
            C0998 c0998 = this.f16604.get(componentName);
            if (c0998 != null) {
                m2985(c0998);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m20470(C0998 c0998) {
            if (Log.isLoggable(C6470.f16568, 3)) {
                Log.d(C6470.f16568, "Processing component " + c0998.f2104 + ", " + c0998.f16607.size() + " queued tasks");
            }
            if (c0998.f16607.isEmpty()) {
                return;
            }
            if (!m2984(c0998) || c0998.f16606 == null) {
                m20472(c0998);
                return;
            }
            while (true) {
                InterfaceC6481 interfaceC6481Peek = c0998.f16607.peek();
                if (interfaceC6481Peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable(C6470.f16568, 3)) {
                        Log.d(C6470.f16568, "Sending task " + interfaceC6481Peek);
                    }
                    interfaceC6481Peek.mo2983(c0998.f16606);
                    c0998.f16607.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable(C6470.f16568, 3)) {
                        Log.d(C6470.f16568, "Remote service has died: " + c0998.f2104);
                    }
                } catch (RemoteException e) {
                    Log.w(C6470.f16568, "RemoteException communicating with " + c0998.f2104, e);
                }
            }
            if (c0998.f16607.isEmpty()) {
                return;
            }
            m20472(c0998);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m20471(InterfaceC6481 interfaceC6481) {
            this.f16603.obtainMessage(0, interfaceC6481).sendToTarget();
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m20472(C0998 c0998) {
            if (this.f16603.hasMessages(3, c0998.f2104)) {
                return;
            }
            int i = c0998.f16608;
            int i2 = i + 1;
            c0998.f16608 = i2;
            if (i2 <= 6) {
                int i3 = (1 << i) * 1000;
                if (Log.isLoggable(C6470.f16568, 3)) {
                    Log.d(C6470.f16568, "Scheduling retry for " + i3 + " ms");
                }
                this.f16603.sendMessageDelayed(this.f16603.obtainMessage(3, c0998.f2104), i3);
                return;
            }
            Log.w(C6470.f16568, "Giving up on delivering " + c0998.f16607.size() + " tasks to " + c0998.f2104 + " after " + c0998.f16608 + " retries");
            c0998.f16607.clear();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m20473() {
            Set<String> setM20424 = C6470.m20424(this.f2102);
            if (setM20424.equals(this.f16605)) {
                return;
            }
            this.f16605 = setM20424;
            List<ResolveInfo> listQueryIntentServices = this.f2102.getPackageManager().queryIntentServices(new Intent().setAction(C6470.f16572), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setM20424.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w(C6470.f16568, "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f16604.containsKey(componentName2)) {
                    if (Log.isLoggable(C6470.f16568, 3)) {
                        Log.d(C6470.f16568, "Adding listener record for " + componentName2);
                    }
                    this.f16604.put(componentName2, new C0998(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, C0998>> it = this.f16604.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, C0998> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable(C6470.f16568, 3)) {
                        Log.d(C6470.f16568, "Removing listener record for " + next.getKey());
                    }
                    m2985(next.getValue());
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public interface InterfaceC6481 {
        /* JADX INFO: renamed from: ۥ */
        void mo2983(InterfaceC5395 interfaceC5395) throws RemoteException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6470(Context context) {
        this.f2092 = context;
        this.f2093 = (NotificationManager) context.getSystemService("notification");
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static C6470 m20423(@InterfaceC6391 Context context) {
        return new C6470(context);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static Set<String> m20424(@InterfaceC6391 Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), f16576);
        synchronized (f16577) {
            if (string != null) {
                try {
                    if (!string.equals(f16578)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f16579 = hashSet;
                        f16578 = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f16579;
        }
        return set;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static boolean m20425(Notification notification) {
        Bundle bundleM20024 = C6411.m20024(notification);
        return bundleM20024 != null && bundleM20024.getBoolean(f16571);
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m2971() {
        return C0997.m2975(this.f2093);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m2972() {
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            return true;
        }
        return i < 34 ? this.f2092.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0 : C6474.m2982(this.f2093);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m20426(int i) {
        m20427(null, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m20427(@InterfaceC6490 String str, int i) {
        this.f2093.cancel(str, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m20428() {
        this.f2093.cancelAll();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m20429(@InterfaceC6391 C6405 c6405) {
        m20430(c6405.m19961());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m20430(@InterfaceC6391 NotificationChannel notificationChannel) {
        C6471.m2977(this.f2093, notificationChannel);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m20431(@InterfaceC6391 C6408 c6408) {
        m20432(c6408.m20005());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m20432(@InterfaceC6391 NotificationChannelGroup notificationChannelGroup) {
        C6471.m2978(this.f2093, notificationChannelGroup);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m20433(@InterfaceC6391 List<NotificationChannelGroup> list) {
        C6471.m20457(this.f2093, list);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m20434(@InterfaceC6391 List<C6408> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C6408> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m20005());
        }
        C6471.m20457(this.f2093, arrayList);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m20435(@InterfaceC6391 List<NotificationChannel> list) {
        C6471.m20458(this.f2093, list);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m20436(@InterfaceC6391 List<C6405> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C6405> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m19961());
        }
        C6471.m20458(this.f2093, arrayList);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m20437(@InterfaceC6391 String str) {
        C6471.m20459(this.f2093, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m20438(@InterfaceC6391 String str) {
        C6471.m20460(this.f2093, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m20439(@InterfaceC6391 Collection<String> collection) {
        for (NotificationChannel notificationChannel : C6471.m20465(this.f2093)) {
            if (!collection.contains(C6471.m20461(notificationChannel)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(C6473.m2981(notificationChannel)))) {
                C6471.m20459(this.f2093, C6471.m20461(notificationChannel));
            }
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public List<StatusBarNotification> m20440() {
        return C0996.m2973(this.f2093);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int m20441() {
        return C0996.m2974(this.f2093);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int m20442() {
        return C0997.m2976(this.f2093);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public NotificationChannel m20443(@InterfaceC6391 String str) {
        return C6471.m20463(this.f2093, str);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public NotificationChannel m20444(@InterfaceC6391 String str, @InterfaceC6391 String str2) {
        return Build.VERSION.SDK_INT >= 30 ? C6473.m2980(this.f2093, str, str2) : m20443(str);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public C6405 m20445(@InterfaceC6391 String str) {
        NotificationChannel notificationChannelM20443 = m20443(str);
        if (notificationChannelM20443 != null) {
            return new C6405(notificationChannelM20443);
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public C6405 m20446(@InterfaceC6391 String str, @InterfaceC6391 String str2) {
        NotificationChannel notificationChannelM20444 = m20444(str, str2);
        if (notificationChannelM20444 != null) {
            return new C6405(notificationChannelM20444);
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public NotificationChannelGroup m20447(@InterfaceC6391 String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C6472.m2979(this.f2093, str);
        }
        for (NotificationChannelGroup notificationChannelGroup : m20449()) {
            if (C6471.m20462(notificationChannelGroup).equals(str)) {
                return notificationChannelGroup;
            }
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public C6408 m20448(@InterfaceC6391 String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            NotificationChannelGroup notificationChannelGroupM20447 = m20447(str);
            if (notificationChannelGroupM20447 != null) {
                return new C6408(notificationChannelGroupM20447);
            }
            return null;
        }
        NotificationChannelGroup notificationChannelGroupM204472 = m20447(str);
        if (notificationChannelGroupM204472 != null) {
            return new C6408(notificationChannelGroupM204472, m20451());
        }
        return null;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public List<NotificationChannelGroup> m20449() {
        return C6471.m20464(this.f2093);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public List<C6408> m20450() {
        int i = Build.VERSION.SDK_INT;
        List<NotificationChannelGroup> listM20449 = m20449();
        if (listM20449.isEmpty()) {
            return Collections.emptyList();
        }
        List<NotificationChannel> listEmptyList = i >= 28 ? Collections.emptyList() : m20451();
        ArrayList arrayList = new ArrayList(listM20449.size());
        for (NotificationChannelGroup notificationChannelGroup : listM20449) {
            if (Build.VERSION.SDK_INT >= 28) {
                arrayList.add(new C6408(notificationChannelGroup));
            } else {
                arrayList.add(new C6408(notificationChannelGroup, listEmptyList));
            }
        }
        return arrayList;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public List<NotificationChannel> m20451() {
        return C6471.m20465(this.f2093);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public List<C6405> m20452() {
        List<NotificationChannel> listM20451 = m20451();
        if (listM20451.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(listM20451.size());
        Iterator<NotificationChannel> it = listM20451.iterator();
        while (it.hasNext()) {
            arrayList.add(new C6405(it.next()));
        }
        return arrayList;
    }

    @InterfaceC7118("android.permission.POST_NOTIFICATIONS")
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m20453(int i, @InterfaceC6391 Notification notification) {
        m20454(null, i, notification);
    }

    @InterfaceC7118("android.permission.POST_NOTIFICATIONS")
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m20454(@InterfaceC6490 String str, int i, @InterfaceC6391 Notification notification) {
        if (!m20425(notification)) {
            this.f2093.notify(str, i, notification);
        } else {
            m20456(new C6478(this.f2092.getPackageName(), i, str, notification));
            this.f2093.cancel(str, i);
        }
    }

    @InterfaceC7118("android.permission.POST_NOTIFICATIONS")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m20455(@InterfaceC6391 List<C6477> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C6477 c6477 = list.get(i);
            m20454(c6477.f2096, c6477.f2097, c6477.f16596);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m20456(InterfaceC6481 interfaceC6481) {
        synchronized (f16580) {
            try {
                if (f16581 == null) {
                    f16581 = new ServiceConnectionC6480(this.f2092.getApplicationContext());
                }
                f16581.m20471(interfaceC6481);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C6477 {

        /* JADX INFO: renamed from: ۥ */
        public final String f2096;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f2097;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Notification f16596;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C6477(@InterfaceC6490 String str, int i, @InterfaceC6391 Notification notification) {
            this.f2096 = str;
            this.f2097 = i;
            this.f16596 = notification;
        }

        public C6477(int i, @InterfaceC6391 Notification notification) {
            this(null, i, notification);
        }
    }

    @InterfaceC8392
    public C6470(@InterfaceC6391 NotificationManager notificationManager, @InterfaceC6391 Context context) {
        this.f2092 = context;
        this.f2093 = notificationManager;
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C6475 implements InterfaceC6481 {

        /* JADX INFO: renamed from: ۥ */
        public final String f2094;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f2095;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final String f16594;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean f16595;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C6475(String str) {
            this.f2094 = str;
            this.f2095 = 0;
            this.f16594 = null;
            this.f16595 = true;
        }

        @InterfaceC6391
        public String toString() {
            return "CancelTask[packageName:" + this.f2094 + ", id:" + this.f2095 + ", tag:" + this.f16594 + ", all:" + this.f16595 + "]";
        }

        @Override // Yue.C6470.InterfaceC6481
        /* JADX INFO: renamed from: ۥ */
        public void mo2983(InterfaceC5395 interfaceC5395) throws RemoteException {
            if (this.f16595) {
                interfaceC5395.mo2167(this.f2094);
            } else {
                interfaceC5395.mo16878(this.f2094, this.f2095, this.f16594);
            }
        }

        public C6475(String str, int i, String str2) {
            this.f2094 = str;
            this.f2095 = i;
            this.f16594 = str2;
            this.f16595 = false;
        }
    }
}
