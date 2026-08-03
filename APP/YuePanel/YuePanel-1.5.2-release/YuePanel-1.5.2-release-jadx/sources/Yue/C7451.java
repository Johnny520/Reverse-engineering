package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۢ۟۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7451 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final String f22556 = "extraPersonCount";

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final String f22557 = "extraPerson_";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final String f22558 = "extraLocusId";

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final String f22559 = "extraLongLived";

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final String f22560 = "extraSliceUri";

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f22561 = 1;

    /* JADX INFO: renamed from: ۥ */
    public Context f2893;

    /* JADX INFO: renamed from: ۥ۟ */
    public String f2894;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String f22562;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Intent[] f22563;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public ComponentName f22564;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public CharSequence f22565;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public CharSequence f22566;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public CharSequence f22567;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public IconCompat f22568;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean f22569;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C6659[] f22570;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Set<String> f22571;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC6490
    public C5861 f22572;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean f22573;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int f22574;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public PersistableBundle f22575;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Bundle f22576;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public long f22577;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public UserHandle f22578;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f22579;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f22580;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f22581;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f22582;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f22583;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f22584 = true;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f22585;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f22586;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f22587;

    /* JADX INFO: renamed from: Yue.ۥۢ۟۟ۦ$ۥ */
    @InterfaceC7113(33)
    public static class C1264 {
        /* JADX INFO: renamed from: ۥ */
        public static void m3649(@InterfaceC6391 ShortcutInfo.Builder builder, int i) {
            builder.setExcludedFromSurfaces(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟۟ۦ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7452 {
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC7113(25)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static List<C7451> m23328(@InterfaceC6391 Context context, @InterfaceC6391 List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1265(context, it.next()).m23360());
        }
        return arrayList;
    }

    @InterfaceC6490
    @InterfaceC7113(25)
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static C5861 m23329(@InterfaceC6391 ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            return m23330(shortcutInfo.getExtras());
        }
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return C5861.m18148(shortcutInfo.getLocusId());
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    @InterfaceC7113(25)
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static C5861 m23330(@InterfaceC6490 PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString(f22558)) == null) {
            return null;
        }
        return new C5861(string);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC8392
    @InterfaceC7113(25)
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static boolean m23331(@InterfaceC6490 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(f22559)) {
            return false;
        }
        return persistableBundle.getBoolean(f22559);
    }

    @InterfaceC6490
    @InterfaceC7113(25)
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static C6659[] m23332(@InterfaceC6391 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(f22556)) {
            return null;
        }
        int i = persistableBundle.getInt(f22556);
        C6659[] c6659Arr = new C6659[i];
        int i2 = 0;
        while (i2 < i) {
            StringBuilder sb = new StringBuilder();
            sb.append(f22557);
            int i3 = i2 + 1;
            sb.append(i3);
            c6659Arr[i2] = C6659.m21278(persistableBundle.getPersistableBundle(sb.toString()));
            i2 = i3;
        }
        return c6659Arr;
    }

    /* JADX INFO: renamed from: ۥ */
    public Intent m3647(Intent intent) {
        intent.putExtra("android.intent.extra.shortcut.INTENT", this.f22563[r0.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f22565.toString());
        if (this.f22568 != null) {
            Drawable activityIcon = null;
            if (this.f22569) {
                PackageManager packageManager = this.f2893.getPackageManager();
                ComponentName componentName = this.f22564;
                if (componentName != null) {
                    try {
                        activityIcon = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (activityIcon == null) {
                    activityIcon = this.f2893.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f22568.m29556(intent, activityIcon, this.f2893);
        }
        return intent;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC7113(22)
    /* JADX INFO: renamed from: ۥ۟ */
    public final PersistableBundle m3648() {
        if (this.f22575 == null) {
            this.f22575 = new PersistableBundle();
        }
        C6659[] c6659Arr = this.f22570;
        if (c6659Arr != null && c6659Arr.length > 0) {
            this.f22575.putInt(f22556, c6659Arr.length);
            int i = 0;
            while (i < this.f22570.length) {
                PersistableBundle persistableBundle = this.f22575;
                StringBuilder sb = new StringBuilder();
                sb.append(f22557);
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.f22570[i].m21289());
                i = i2;
            }
        }
        C5861 c5861 = this.f22572;
        if (c5861 != null) {
            this.f22575.putString(f22558, c5861.m2529());
        }
        this.f22575.putBoolean(f22559, this.f22573);
        return this.f22575;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public ComponentName m23333() {
        return this.f22564;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Set<String> m23334() {
        return this.f22571;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public CharSequence m23335() {
        return this.f22567;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m23336() {
        return this.f22586;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m23337() {
        return this.f22587;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public PersistableBundle m23338() {
        return this.f22575;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public IconCompat m23339() {
        return this.f22568;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public String m23340() {
        return this.f2894;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Intent m23341() {
        return this.f22563[r0.length - 1];
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Intent[] m23342() {
        Intent[] intentArr = this.f22563;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public long m23343() {
        return this.f22577;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public C5861 m23344() {
        return this.f22572;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public CharSequence m23345() {
        return this.f22566;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String m23346() {
        return this.f22562;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int m23347() {
        return this.f22574;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public CharSequence m23348() {
        return this.f22565;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Bundle m23349() {
        return this.f22576;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public UserHandle m23350() {
        return this.f22578;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean m23351() {
        return this.f22585;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m23352() {
        return this.f22579;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean m23353() {
        return this.f22582;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean m23354() {
        return this.f22580;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean m23355() {
        return this.f22584;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean m23356(int i) {
        return (i & this.f22587) != 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean m23357() {
        return this.f22583;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean m23358() {
        return this.f22581;
    }

    @InterfaceC7113(25)
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public ShortcutInfo m23359() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f2893, this.f2894).setShortLabel(this.f22565).setIntents(this.f22563);
        IconCompat iconCompat = this.f22568;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m29571(this.f2893));
        }
        if (!TextUtils.isEmpty(this.f22566)) {
            intents.setLongLabel(this.f22566);
        }
        if (!TextUtils.isEmpty(this.f22567)) {
            intents.setDisabledMessage(this.f22567);
        }
        ComponentName componentName = this.f22564;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f22571;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f22574);
        PersistableBundle persistableBundle = this.f22575;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C6659[] c6659Arr = this.f22570;
            if (c6659Arr != null && c6659Arr.length > 0) {
                int length = c6659Arr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    personArr[i] = this.f22570[i].m21286();
                }
                intents.setPersons(personArr);
            }
            C5861 c5861 = this.f22572;
            if (c5861 != null) {
                intents.setLocusId(c5861.m18149());
            }
            intents.setLongLived(this.f22573);
        } else {
            intents.setExtras(m3648());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            C1264.m3649(intents, this.f22587);
        }
        return intents.build();
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟۟ۦ$ۥ۟ */
    public static class C1265 {

        /* JADX INFO: renamed from: ۥ */
        public final C7451 f2895;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f2896;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Set<String> f22588;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Map<String, Map<String, List<String>>> f22589;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Uri f22590;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1265(@InterfaceC6391 Context context, @InterfaceC6391 String str) {
            C7451 c7451 = new C7451();
            this.f2895 = c7451;
            c7451.f2893 = context;
            c7451.f2894 = str;
        }

        @InterfaceC6391
        @SuppressLint({"MissingGetterMatchingBuilder"})
        /* JADX INFO: renamed from: ۥ */
        public C1265 m3650(@InterfaceC6391 String str) {
            if (this.f22588 == null) {
                this.f22588 = new HashSet();
            }
            this.f22588.add(str);
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"MissingGetterMatchingBuilder"})
        /* JADX INFO: renamed from: ۥ۟ */
        public C1265 m3651(@InterfaceC6391 String str, @InterfaceC6391 String str2, @InterfaceC6391 List<String> list) {
            m3650(str);
            if (!list.isEmpty()) {
                if (this.f22589 == null) {
                    this.f22589 = new HashMap();
                }
                if (this.f22589.get(str) == null) {
                    this.f22589.put(str, new HashMap());
                }
                this.f22589.get(str).put(str2, list);
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C7451 m23360() {
            if (TextUtils.isEmpty(this.f2895.f22565)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            C7451 c7451 = this.f2895;
            Intent[] intentArr = c7451.f22563;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f2896) {
                if (c7451.f22572 == null) {
                    c7451.f22572 = new C5861(c7451.f2894);
                }
                this.f2895.f22573 = true;
            }
            if (this.f22588 != null) {
                C7451 c74512 = this.f2895;
                if (c74512.f22571 == null) {
                    c74512.f22571 = new HashSet();
                }
                this.f2895.f22571.addAll(this.f22588);
            }
            if (this.f22589 != null) {
                C7451 c74513 = this.f2895;
                if (c74513.f22575 == null) {
                    c74513.f22575 = new PersistableBundle();
                }
                for (String str : this.f22589.keySet()) {
                    Map<String, List<String>> map = this.f22589.get(str);
                    this.f2895.f22575.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f2895.f22575.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f22590 != null) {
                C7451 c74514 = this.f2895;
                if (c74514.f22575 == null) {
                    c74514.f22575 = new PersistableBundle();
                }
                this.f2895.f22575.putString(C7451.f22560, C8134.m4157(this.f22590));
            }
            return this.f2895;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C1265 m23361(@InterfaceC6391 ComponentName componentName) {
            this.f2895.f22564 = componentName;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C1265 m23362() {
            this.f2895.f22569 = true;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C1265 m23363(@InterfaceC6391 Set<String> set) {
            C3399 c3399 = new C3399();
            c3399.addAll(set);
            this.f2895.f22571 = c3399;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C1265 m23364(@InterfaceC6391 CharSequence charSequence) {
            this.f2895.f22567 = charSequence;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public C1265 m23365(int i) {
            this.f2895.f22587 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public C1265 m23366(@InterfaceC6391 PersistableBundle persistableBundle) {
            this.f2895.f22575 = persistableBundle;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public C1265 m23367(IconCompat iconCompat) {
            this.f2895.f22568 = iconCompat;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public C1265 m23368(@InterfaceC6391 Intent intent) {
            return m23369(new Intent[]{intent});
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public C1265 m23369(@InterfaceC6391 Intent[] intentArr) {
            this.f2895.f22563 = intentArr;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public C1265 m23370() {
            this.f2896 = true;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public C1265 m23371(@InterfaceC6490 C5861 c5861) {
            this.f2895.f22572 = c5861;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public C1265 m23372(@InterfaceC6391 CharSequence charSequence) {
            this.f2895.f22566 = charSequence;
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public C1265 m23373() {
            this.f2895.f22573 = true;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public C1265 m23374(boolean z) {
            this.f2895.f22573 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public C1265 m23375(@InterfaceC6391 C6659 c6659) {
            return m23376(new C6659[]{c6659});
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public C1265 m23376(@InterfaceC6391 C6659[] c6659Arr) {
            this.f2895.f22570 = c6659Arr;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public C1265 m23377(int i) {
            this.f2895.f22574 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public C1265 m23378(@InterfaceC6391 CharSequence charSequence) {
            this.f2895.f22565 = charSequence;
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"MissingGetterMatchingBuilder"})
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public C1265 m23379(@InterfaceC6391 Uri uri) {
            this.f22590 = uri;
            return this;
        }

        @InterfaceC6391
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public C1265 m23380(@InterfaceC6391 Bundle bundle) {
            this.f2895.f22576 = (Bundle) C6740.m21415(bundle);
            return this;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public C1265(@InterfaceC6391 C7451 c7451) {
            C7451 c74512 = new C7451();
            this.f2895 = c74512;
            c74512.f2893 = c7451.f2893;
            c74512.f2894 = c7451.f2894;
            c74512.f22562 = c7451.f22562;
            Intent[] intentArr = c7451.f22563;
            c74512.f22563 = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            c74512.f22564 = c7451.f22564;
            c74512.f22565 = c7451.f22565;
            c74512.f22566 = c7451.f22566;
            c74512.f22567 = c7451.f22567;
            c74512.f22586 = c7451.f22586;
            c74512.f22568 = c7451.f22568;
            c74512.f22569 = c7451.f22569;
            c74512.f22578 = c7451.f22578;
            c74512.f22577 = c7451.f22577;
            c74512.f22579 = c7451.f22579;
            c74512.f22580 = c7451.f22580;
            c74512.f22581 = c7451.f22581;
            c74512.f22582 = c7451.f22582;
            c74512.f22583 = c7451.f22583;
            c74512.f22584 = c7451.f22584;
            c74512.f22572 = c7451.f22572;
            c74512.f22573 = c7451.f22573;
            c74512.f22585 = c7451.f22585;
            c74512.f22574 = c7451.f22574;
            C6659[] c6659Arr = c7451.f22570;
            if (c6659Arr != null) {
                c74512.f22570 = (C6659[]) Arrays.copyOf(c6659Arr, c6659Arr.length);
            }
            if (c7451.f22571 != null) {
                c74512.f22571 = new HashSet(c7451.f22571);
            }
            PersistableBundle persistableBundle = c7451.f22575;
            if (persistableBundle != null) {
                c74512.f22575 = persistableBundle;
            }
            c74512.f22587 = c7451.f22587;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        @InterfaceC7113(25)
        public C1265(@InterfaceC6391 Context context, @InterfaceC6391 ShortcutInfo shortcutInfo) {
            C7451 c7451 = new C7451();
            this.f2895 = c7451;
            c7451.f2893 = context;
            c7451.f2894 = shortcutInfo.getId();
            c7451.f22562 = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            c7451.f22563 = (Intent[]) Arrays.copyOf(intents, intents.length);
            c7451.f22564 = shortcutInfo.getActivity();
            c7451.f22565 = shortcutInfo.getShortLabel();
            c7451.f22566 = shortcutInfo.getLongLabel();
            c7451.f22567 = shortcutInfo.getDisabledMessage();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                c7451.f22586 = shortcutInfo.getDisabledReason();
            } else {
                c7451.f22586 = shortcutInfo.isEnabled() ? 0 : 3;
            }
            c7451.f22571 = shortcutInfo.getCategories();
            c7451.f22570 = C7451.m23332(shortcutInfo.getExtras());
            c7451.f22578 = shortcutInfo.getUserHandle();
            c7451.f22577 = shortcutInfo.getLastChangedTimestamp();
            if (i >= 30) {
                c7451.f22579 = shortcutInfo.isCached();
            }
            c7451.f22580 = shortcutInfo.isDynamic();
            c7451.f22581 = shortcutInfo.isPinned();
            c7451.f22582 = shortcutInfo.isDeclaredInManifest();
            c7451.f22583 = shortcutInfo.isImmutable();
            c7451.f22584 = shortcutInfo.isEnabled();
            c7451.f22585 = shortcutInfo.hasKeyFieldsOnly();
            c7451.f22572 = C7451.m23329(shortcutInfo);
            c7451.f22574 = shortcutInfo.getRank();
            c7451.f22575 = shortcutInfo.getExtras();
        }
    }
}
