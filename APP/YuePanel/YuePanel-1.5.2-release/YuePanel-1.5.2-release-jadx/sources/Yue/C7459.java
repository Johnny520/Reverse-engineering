package Yue;

import Yue.AbstractC7455;
import Yue.C7451;
import Yue.InterfaceC7144;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import androidx.appcompat.widget.C1629;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: Yue.ۥۢ۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7459 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f2897 = 1;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f2898 = 2;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f22591 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f22592 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC8392
    public static final String f22593 = "com.android.launcher.action.INSTALL_SHORTCUT";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC8392
    public static final String f22594 = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f22595 = 96;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f22596 = 48;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f22597 = "android.intent.extra.shortcut.ID";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile AbstractC7455<?> f22598 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile List<AbstractC7446> f22599 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f22600 = "androidx.core.content.pm.SHORTCUT_LISTENER";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final String f22601 = "androidx.core.content.pm.shortcut_listener_impl";

    /* JADX INFO: renamed from: Yue.ۥۢ۟۠ۢ$ۥ */
    public class C1267 extends BroadcastReceiver {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ IntentSender f2899;

        public C1267(IntentSender intentSender) {
            this.f2899 = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.f2899.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟۠ۢ$ۥ۟ */
    @InterfaceC7113(25)
    public static class C1268 {
        /* JADX INFO: renamed from: ۥ */
        public static String m3661(@InterfaceC6391 List<ShortcutInfo> list) {
            int rank = -1;
            String id = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > rank) {
                    id = shortcutInfo.getId();
                    rank = shortcutInfo.getRank();
                }
            }
            return id;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟۠ۢ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7460 {
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m3659(@InterfaceC6391 Context context, @InterfaceC6391 List<C7451> list) {
        List<C7451> listM23406 = m23406(list, 1);
        if (Build.VERSION.SDK_INT <= 29) {
            m23386(context, listM23406);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C7451> it = listM23406.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m23359());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
            return false;
        }
        m23398(context).mo3654(listM23406);
        Iterator<AbstractC7446> it2 = m23397(context).iterator();
        while (it2.hasNext()) {
            it2.next().m3642(list);
        }
        return true;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m3660(@InterfaceC6391 Context context, @InterfaceC6391 C7451 c7451) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompat = c7451.f22568;
        if (iconCompat == null) {
            return false;
        }
        int i = iconCompat.f3752;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream inputStreamM29563 = iconCompat.m29563(context);
        if (inputStreamM29563 == null || (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM29563)) == null) {
            return false;
        }
        c7451.f22568 = i == 6 ? IconCompat.m29545(bitmapDecodeStream) : IconCompat.m29548(bitmapDecodeStream);
        return true;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m23386(@InterfaceC6391 Context context, @InterfaceC6391 List<C7451> list) {
        for (C7451 c7451 : new ArrayList(list)) {
            if (!m3660(context, c7451)) {
                list.remove(c7451);
            }
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Intent m23387(@InterfaceC6391 Context context, @InterfaceC6391 C7451 c7451) {
        Intent intentCreateShortcutResultIntent = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(c7451.m23359());
        if (intentCreateShortcutResultIntent == null) {
            intentCreateShortcutResultIntent = new Intent();
        }
        return c7451.m3647(intentCreateShortcutResultIntent);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m23388(@InterfaceC6391 Context context, @InterfaceC6391 List<String> list, @InterfaceC6490 CharSequence charSequence) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(list, charSequence);
        m23398(context).mo23382(list);
        Iterator<AbstractC7446> it = m23397(context).iterator();
        while (it.hasNext()) {
            it.next().m23325(list);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m23389(@InterfaceC6391 Context context, @InterfaceC6391 List<C7451> list) {
        List<C7451> listM23406 = m23406(list, 1);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C7451> it = listM23406.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f2894);
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList);
        m23398(context).mo3654(listM23406);
        Iterator<AbstractC7446> it2 = m23397(context).iterator();
        while (it2.hasNext()) {
            it2.next().m3642(list);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static List<C7451> m23390(@InterfaceC6391 Context context) {
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new C7451.C1265(context, it.next()).m23360());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int m23391(@InterfaceC6391 Context context, boolean z) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C1629.f26361);
        int iMax = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (iMax * ((z ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static int m23392(@InterfaceC6391 Context context) {
        C6740.m21415(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxHeight();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m23393(@InterfaceC6391 Context context) {
        C6740.m21415(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxWidth();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m23394(@InterfaceC6391 Context context) {
        C6740.m21415(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static List<AbstractC7446> m23395() {
        return f22599;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static String m23396(@InterfaceC6391 List<C7451> list) {
        int iM23347 = -1;
        String strM23340 = null;
        for (C7451 c7451 : list) {
            if (c7451.m23347() > iM23347) {
                strM23340 = c7451.m23340();
                iM23347 = c7451.m23347();
            }
        }
        return strM23340;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static List<AbstractC7446> m23397(Context context) {
        Bundle bundle;
        String string;
        if (f22599 == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(f22600);
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString(f22601)) != null) {
                    try {
                        arrayList.add((AbstractC7446) Class.forName(string, false, C7459.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f22599 == null) {
                f22599 = arrayList;
            }
        }
        return f22599;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static AbstractC7455<?> m23398(Context context) {
        if (f22598 == null) {
            try {
                f22598 = (AbstractC7455) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C7459.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f22598 == null) {
                f22598 = new AbstractC7455.C1266();
            }
        }
        return f22598;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static List<C7451> m23399(@InterfaceC6391 Context context, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C7451.m23328(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i));
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.addAll(shortcutManager.getManifestShortcuts());
        }
        if ((i & 2) != 0) {
            arrayList.addAll(shortcutManager.getDynamicShortcuts());
        }
        if ((i & 4) != 0) {
            arrayList.addAll(shortcutManager.getPinnedShortcuts());
        }
        return C7451.m23328(context, arrayList);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static boolean m23400(@InterfaceC6391 Context context) {
        C6740.m21415(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRateLimitingActive();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static boolean m23401(@InterfaceC6391 Context context) {
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static boolean m23402(@InterfaceC6391 Context context, @InterfaceC6391 C7451 c7451) {
        C6740.m21415(context);
        C6740.m21415(c7451);
        int i = Build.VERSION.SDK_INT;
        if (i <= 32 && c7451.m23356(1)) {
            Iterator<AbstractC7446> it = m23397(context).iterator();
            while (it.hasNext()) {
                it.next().m3642(Collections.singletonList(c7451));
            }
            return true;
        }
        int iM23394 = m23394(context);
        if (iM23394 == 0) {
            return false;
        }
        if (i <= 29) {
            m3660(context, c7451);
        }
        if (i >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(c7451.m23359());
        } else {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= iM23394) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(C1268.m3661(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(c7451.m23359()));
        }
        AbstractC7455<?> abstractC7455M23398 = m23398(context);
        try {
            List<C7451> listM3655 = abstractC7455M23398.m3655();
            if (listM3655.size() >= iM23394) {
                abstractC7455M23398.mo23382(Arrays.asList(m23396(listM3655)));
            }
            abstractC7455M23398.mo3654(Arrays.asList(c7451));
            Iterator<AbstractC7446> it2 = m23397(context).iterator();
            while (it2.hasNext()) {
                it2.next().m3642(Collections.singletonList(c7451));
            }
            m23407(context, c7451.m23340());
            return true;
        } catch (Exception unused) {
            Iterator<AbstractC7446> it3 = m23397(context).iterator();
            while (it3.hasNext()) {
                it3.next().m3642(Collections.singletonList(c7451));
            }
            m23407(context, c7451.m23340());
            return false;
        } catch (Throwable th) {
            Iterator<AbstractC7446> it4 = m23397(context).iterator();
            while (it4.hasNext()) {
                it4.next().m3642(Collections.singletonList(c7451));
            }
            m23407(context, c7451.m23340());
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m23403(@InterfaceC6391 Context context) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        m23398(context).mo23381();
        Iterator<AbstractC7446> it = m23397(context).iterator();
        while (it.hasNext()) {
            it.next().m3641();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static void m23404(@InterfaceC6391 Context context, @InterfaceC6391 List<String> list) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        m23398(context).mo23382(list);
        Iterator<AbstractC7446> it = m23397(context).iterator();
        while (it.hasNext()) {
            it.next().m23325(list);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static void m23405(@InterfaceC6391 Context context, @InterfaceC6391 List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            m23404(context, list);
            return;
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(list);
        m23398(context).mo23382(list);
        Iterator<AbstractC7446> it = m23397(context).iterator();
        while (it.hasNext()) {
            it.next().m23325(list);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static List<C7451> m23406(@InterfaceC6391 List<C7451> list, int i) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (C7451 c7451 : list) {
            if (c7451.m23356(i)) {
                arrayList.remove(c7451);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static void m23407(@InterfaceC6391 Context context, @InterfaceC6391 String str) {
        C6740.m21415(context);
        C6740.m21415(str);
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator<AbstractC7446> it = m23397(context).iterator();
        while (it.hasNext()) {
            it.next().m23327(Collections.singletonList(str));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static boolean m23408(@InterfaceC6391 Context context, @InterfaceC6391 C7451 c7451, @InterfaceC6490 IntentSender intentSender) {
        if (Build.VERSION.SDK_INT > 32 || !c7451.m23356(1)) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(c7451.m23359(), intentSender);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static boolean m23409(@InterfaceC6391 Context context, @InterfaceC6391 List<C7451> list) {
        C6740.m21415(context);
        C6740.m21415(list);
        List<C7451> listM23406 = m23406(list, 1);
        ArrayList arrayList = new ArrayList(listM23406.size());
        Iterator<C7451> it = listM23406.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m23359());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
            return false;
        }
        m23398(context).mo23381();
        m23398(context).mo3654(listM23406);
        for (AbstractC7446 abstractC7446 : m23397(context)) {
            abstractC7446.m3641();
            abstractC7446.m3642(list);
        }
        return true;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static void m23410(List<AbstractC7446> list) {
        f22599 = list;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static void m23411(AbstractC7455<Void> abstractC7455) {
        f22598 = abstractC7455;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static boolean m23412(@InterfaceC6391 Context context, @InterfaceC6391 List<C7451> list) {
        List<C7451> listM23406 = m23406(list, 1);
        if (Build.VERSION.SDK_INT <= 29) {
            m23386(context, listM23406);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C7451> it = listM23406.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m23359());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
            return false;
        }
        m23398(context).mo3654(listM23406);
        Iterator<AbstractC7446> it2 = m23397(context).iterator();
        while (it2.hasNext()) {
            it2.next().m23326(list);
        }
        return true;
    }
}
