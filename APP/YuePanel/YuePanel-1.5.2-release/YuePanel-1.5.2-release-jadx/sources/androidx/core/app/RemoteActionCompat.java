package androidx.core.app;

import Yue.C6740;
import Yue.InterfaceC4482;
import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC8181;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteActionCompat implements InterfaceC8181 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public IconCompat f3750;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public CharSequence f3751;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public CharSequence f29453;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public PendingIntent f29454;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean f29455;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean f29456;

    /* JADX INFO: renamed from: androidx.core.app.RemoteActionCompat$ۥ */
    @InterfaceC7113(26)
    public static class C1658 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static RemoteAction m4750(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static PendingIntent m4751(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static CharSequence m29535(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static Icon m29536(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static CharSequence m29537(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean m29538(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m29539(RemoteAction remoteAction, boolean z) {
            remoteAction.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.RemoteActionCompat$ۥ۟ */
    @InterfaceC7113(28)
    public static class C1659 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4752(RemoteAction remoteAction, boolean z) {
            remoteAction.setShouldShowIcon(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m4753(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RemoteActionCompat(@InterfaceC6391 IconCompat iconCompat, @InterfaceC6391 CharSequence charSequence, @InterfaceC6391 CharSequence charSequence2, @InterfaceC6391 PendingIntent pendingIntent) {
        this.f3750 = (IconCompat) C6740.m21415(iconCompat);
        this.f3751 = (CharSequence) C6740.m21415(charSequence);
        this.f29453 = (CharSequence) C6740.m21415(charSequence2);
        this.f29454 = (PendingIntent) C6740.m21415(pendingIntent);
        this.f29455 = true;
        this.f29456 = true;
    }

    @InterfaceC6391
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ */
    public static RemoteActionCompat m4748(@InterfaceC6391 RemoteAction remoteAction) {
        C6740.m21415(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.m29542(C1658.m29536(remoteAction)), C1658.m29537(remoteAction), C1658.m29535(remoteAction), C1658.m4751(remoteAction));
        remoteActionCompat.m29531(C1658.m29538(remoteAction));
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.m29532(C1659.m4753(remoteAction));
        }
        return remoteActionCompat;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public PendingIntent m4749() {
        return this.f29454;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public CharSequence m29527() {
        return this.f29453;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public IconCompat m29528() {
        return this.f3750;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public CharSequence m29529() {
        return this.f3751;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m29530() {
        return this.f29455;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m29531(boolean z) {
        this.f29455 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m29532(boolean z) {
        this.f29456 = z;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m29533() {
        return this.f29456;
    }

    @InterfaceC6391
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public RemoteAction m29534() {
        RemoteAction remoteActionM4750 = C1658.m4750(this.f3750.m29570(), this.f3751, this.f29453, this.f29454);
        C1658.m29539(remoteActionM4750, m29530());
        if (Build.VERSION.SDK_INT >= 28) {
            C1659.m4752(remoteActionM4750, m29533());
        }
        return remoteActionM4750;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@InterfaceC6391 RemoteActionCompat remoteActionCompat) {
        C6740.m21415(remoteActionCompat);
        this.f3750 = remoteActionCompat.f3750;
        this.f3751 = remoteActionCompat.f3751;
        this.f29453 = remoteActionCompat.f29453;
        this.f29454 = remoteActionCompat.f29454;
        this.f29455 = remoteActionCompat.f29455;
        this.f29456 = remoteActionCompat.f29456;
    }
}
