package yyds;

import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲈᛳᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2619 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f12872;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final ArrayList f12873;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f12874;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public CharSequence f12875;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Context f12876;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f12878;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final String f12879;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final Notification f12880;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public Bundle f12881;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public CharSequence f12883;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList f12877 = new ArrayList();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ArrayList f12882 = new ArrayList();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ArrayList f12884 = new ArrayList();

    public C2619(Context context, String str) {
        Notification notification = new Notification();
        this.f12880 = notification;
        this.f12876 = context;
        this.f12879 = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f12878 = 0;
        this.f12873 = new ArrayList();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static CharSequence m4724(String str) {
        return str.length() > 5120 ? str.subSequence(0, 5120) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0179  */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.app.Notification, java.lang.String] */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Notification m4725() {
        int i;
        Notification notification;
        boolean z;
        Icon icon;
        String resPackage;
        Icon iconCreateWithBitmap;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        Icon iconCreateWithContentUri;
        Uri uri;
        int i2;
        Bundle bundle = new Bundle();
        Context context = this.f12876;
        String str = this.f12879;
        Notification.Builder builder = new Notification.Builder(context, str);
        Notification notification2 = this.f12880;
        Notification notification3 = null;
        boolean z2 = false;
        builder.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(this.f12875).setContentText(this.f12883).setContentInfo(null).setContentIntent(null).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(this.f12872, this.f12874, false);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(null).setUsesChronometer(false).setPriority(this.f12878);
        for (C0582 c0582 : this.f12877) {
            IconCompat iconCompatM97 = c0582.f2786;
            if (iconCompatM97 == null && (i2 = c0582.f2789) != 0) {
                iconCompatM97 = IconCompat.m97(i2);
                c0582.f2786 = iconCompatM97;
            }
            Bundle bundle2 = c0582.f2785;
            if (iconCompatM97 != null) {
                int i3 = iconCompatM97.f265;
                Notification notification4 = notification3;
                switch (i3) {
                    case -1:
                        z = z2;
                        icon = (Icon) iconCompatM97.f266;
                        notification = notification4;
                        break;
                    case 0:
                    default:
                        C0188.m798("Unknown type");
                        break;
                    case 1:
                        z = z2;
                        iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompatM97.f266);
                        colorStateList = iconCompatM97.f267;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompatM97.f262;
                        icon = iconCreateWithBitmap;
                        notification = notification4;
                        if (mode != IconCompat.f261) {
                            iconCreateWithBitmap.setTintMode(mode);
                            icon = iconCreateWithBitmap;
                            notification = notification4;
                        }
                        break;
                    case 2:
                        z = z2;
                        if (i3 == -1) {
                            resPackage = ((Icon) iconCompatM97.f266).getResPackage();
                        } else if (i3 != 2) {
                            C0188.m799(iconCompatM97, "called getResPackage() on ");
                        } else {
                            String str2 = iconCompatM97.f268;
                            resPackage = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompatM97.f266).split(":", -1)[z ? 1 : 0] : iconCompatM97.f268;
                        }
                        iconCreateWithBitmap = Icon.createWithResource(resPackage, iconCompatM97.f264);
                        colorStateList = iconCompatM97.f267;
                        if (colorStateList != null) {
                        }
                        mode = iconCompatM97.f262;
                        icon = iconCreateWithBitmap;
                        notification = notification4;
                        if (mode != IconCompat.f261) {
                        }
                        break;
                    case 3:
                        z = z2;
                        iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompatM97.f266, iconCompatM97.f264, iconCompatM97.f270);
                        colorStateList = iconCompatM97.f267;
                        if (colorStateList != null) {
                        }
                        mode = iconCompatM97.f262;
                        icon = iconCreateWithBitmap;
                        notification = notification4;
                        if (mode != IconCompat.f261) {
                        }
                        break;
                    case 4:
                        iconCreateWithContentUri = Icon.createWithContentUri((String) iconCompatM97.f266);
                        z = z2;
                        iconCreateWithBitmap = iconCreateWithContentUri;
                        colorStateList = iconCompatM97.f267;
                        if (colorStateList != null) {
                        }
                        mode = iconCompatM97.f262;
                        icon = iconCreateWithBitmap;
                        notification = notification4;
                        if (mode != IconCompat.f261) {
                        }
                        break;
                    case 5:
                        iconCreateWithContentUri = Icon.createWithAdaptiveBitmap((Bitmap) iconCompatM97.f266);
                        z = z2;
                        iconCreateWithBitmap = iconCreateWithContentUri;
                        colorStateList = iconCompatM97.f267;
                        if (colorStateList != null) {
                        }
                        mode = iconCompatM97.f262;
                        icon = iconCreateWithBitmap;
                        notification = notification4;
                        if (mode != IconCompat.f261) {
                        }
                        break;
                    case 6:
                        if (i3 == -1) {
                            uri = ((Icon) iconCompatM97.f266).getUri();
                        } else if (i3 == 4 || i3 == 6) {
                            uri = Uri.parse((String) iconCompatM97.f266);
                        } else {
                            C0188.m799(iconCompatM97, "called getUri() on ");
                        }
                        iconCreateWithContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
                        z = z2;
                        iconCreateWithBitmap = iconCreateWithContentUri;
                        colorStateList = iconCompatM97.f267;
                        if (colorStateList != null) {
                        }
                        mode = iconCompatM97.f262;
                        icon = iconCreateWithBitmap;
                        notification = notification4;
                        if (mode != IconCompat.f261) {
                        }
                        break;
                }
                return notification4;
            }
            notification = notification3;
            z = z2;
            icon = notification3;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(icon, c0582.f2784, c0582.f2788);
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putBoolean("android.support.allowGeneratedReplies", true);
            builder2.setAllowGeneratedReplies(true);
            boolean z3 = z;
            bundle3.putInt("android.support.action.semanticAction", z3 ? 1 : 0);
            builder2.setSemanticAction(z3 ? 1 : 0);
            builder2.setContextual(z3);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 31) {
                AbstractC1100.m2304(builder2);
            }
            if (i4 >= 37) {
                AbstractC2372.m4412(builder2);
                AbstractC2372.m4413(builder2);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", c0582.f2787);
            builder2.addExtras(bundle3);
            builder.addAction(builder2.build());
            notification3 = notification;
            z2 = false;
        }
        ?? r16 = notification3;
        Bundle bundle4 = this.f12881;
        if (bundle4 != null) {
            bundle.putAll(bundle4);
        }
        builder.setShowWhen(true);
        builder.setLocalOnly(false);
        builder.setGroup(r16);
        builder.setSortKey(r16);
        builder.setGroupSummary(false);
        builder.setCategory(r16);
        builder.setColor(0);
        builder.setVisibility(0);
        builder.setPublicVersion(r16);
        builder.setSound(notification2.sound, notification2.audioAttributes);
        ArrayList arrayList = this.f12873;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                builder.addPerson((String) it.next());
            }
        }
        ArrayList arrayList2 = this.f12884;
        if (arrayList2.size() > 0) {
            Bundle bundle5 = this.f12881;
            if (bundle5 == null) {
                bundle5 = new Bundle();
                this.f12881 = bundle5;
            }
            Bundle bundle6 = bundle5.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            int i5 = 0;
            while (i5 < arrayList2.size()) {
                String string = Integer.toString(i5);
                C0582 c05822 = (C0582) arrayList2.get(i5);
                Bundle bundle9 = new Bundle();
                IconCompat iconCompatM972 = c05822.f2786;
                if (iconCompatM972 == null && (i = c05822.f2789) != 0) {
                    iconCompatM972 = IconCompat.m97(i);
                    c05822.f2786 = iconCompatM972;
                }
                Bundle bundle10 = c05822.f2785;
                ArrayList arrayList3 = arrayList2;
                bundle9.putInt("icon", iconCompatM972 != null ? iconCompatM972.m98() : 0);
                bundle9.putCharSequence("title", c05822.f2784);
                bundle9.putParcelable("actionIntent", c05822.f2788);
                Bundle bundle11 = new Bundle(bundle10);
                bundle11.putBoolean("android.support.allowGeneratedReplies", true);
                bundle9.putBundle("extras", bundle11);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", c05822.f2787);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(string, bundle9);
                i5++;
                arrayList2 = arrayList3;
            }
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            Bundle bundle12 = this.f12881;
            if (bundle12 == null) {
                bundle12 = new Bundle();
                this.f12881 = bundle12;
            }
            bundle12.putBundle("android.car.EXTENSIONS", bundle6);
            bundle.putBundle("android.car.EXTENSIONS", bundle7);
        }
        builder.setExtras(this.f12881);
        builder.setRemoteInputHistory(null);
        builder.setBadgeIconType(0);
        builder.setSettingsText(null);
        builder.setShortcutId(null);
        builder.setTimeoutAfter(0L);
        builder.setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(str)) {
            builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it2 = this.f12882.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            C0188.m794();
            return null;
        }
        builder.setAllowSystemGeneratedContextualActions(true);
        builder.setBubbleMetadata(null);
        if (Build.VERSION.SDK_INT >= 36) {
            AbstractC1345.m2749(builder);
        }
        return builder.build();
    }
}
