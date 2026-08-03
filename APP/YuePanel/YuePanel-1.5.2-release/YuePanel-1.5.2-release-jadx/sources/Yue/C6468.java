package Yue;

import Yue.C6411;
import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۡۢۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6468 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f2090 = "NotificationCompat";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f2091 = "android.support.dataRemoteInputs";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f16544 = "android.support.allowGeneratedReplies";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f16545 = "icon";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f16546 = "title";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f16547 = "actionIntent";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f16548 = "extras";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f16549 = "remoteInputs";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f16550 = "dataOnlyRemoteInputs";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f16551 = "resultKey";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f16552 = "label";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f16553 = "choices";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final String f16554 = "allowFreeFormInput";

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final String f16555 = "allowedDataTypes";

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final String f16556 = "semanticAction";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final String f16557 = "showsUserInterface";

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static Field f16559;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static boolean f16560;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static Field f16562;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static Field f16563;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static Field f16564;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static Field f16565;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static boolean f16566;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final Object f16558 = new Object();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final Object f16561 = new Object();

    /* JADX INFO: renamed from: ۥ */
    public static SparseArray<Bundle> m2967(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m2968() {
        if (f16566) {
            return false;
        }
        try {
            if (f16562 == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f16563 = cls.getDeclaredField("icon");
                f16564 = cls.getDeclaredField(f16546);
                f16565 = cls.getDeclaredField(f16547);
                Field declaredField = Notification.class.getDeclaredField(C6411.C6456.f16497);
                f16562 = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException e) {
            Log.e(f2090, "Unable to access notification actions", e);
            f16566 = true;
        } catch (NoSuchFieldException e2) {
            Log.e(f2090, "Unable to access notification actions", e2);
            f16566 = true;
        }
        return !f16566;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C7086 m20408(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f16555);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new C7086(bundle.getString(f16551), bundle.getCharSequence(f16552), bundle.getCharSequenceArray(f16553), bundle.getBoolean(f16554), 0, bundle.getBundle("extras"), hashSet);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C7086[] m20409(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        C7086[] c7086Arr = new C7086[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            c7086Arr[i] = m20408(bundleArr[i]);
        }
        return c7086Arr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C6411.C0973 m20410(Notification notification, int i) {
        SparseArray sparseParcelableArray;
        synchronized (f16561) {
            try {
                try {
                    Object[] objArrM20413 = m20413(notification);
                    if (objArrM20413 != null) {
                        Object obj = objArrM20413[i];
                        Bundle bundleM20416 = m20416(notification);
                        return m20417(f16563.getInt(obj), (CharSequence) f16564.get(obj), (PendingIntent) f16565.get(obj), (bundleM20416 == null || (sparseParcelableArray = bundleM20416.getSparseParcelableArray(C6467.f16542)) == null) ? null : (Bundle) sparseParcelableArray.get(i));
                    }
                } catch (IllegalAccessException e) {
                    Log.e(f2090, "Unable to access notification actions", e);
                    f16566 = true;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m20411(Notification notification) {
        int length;
        synchronized (f16561) {
            try {
                Object[] objArrM20413 = m20413(notification);
                length = objArrM20413 != null ? objArrM20413.length : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C6411.C0973 m20412(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new C6411.C0973(bundle.getInt("icon"), bundle.getCharSequence(f16546), (PendingIntent) bundle.getParcelable(f16547), bundle.getBundle("extras"), m20409(m20414(bundle, f16549)), m20409(m20414(bundle, f16550)), bundle2 != null ? bundle2.getBoolean(f16544, false) : false, bundle.getInt(f16556), bundle.getBoolean(f16557), false, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Object[] m20413(Notification notification) {
        synchronized (f16561) {
            if (!m2968()) {
                return null;
            }
            try {
                return (Object[]) f16562.get(notification);
            } catch (IllegalAccessException e) {
                Log.e(f2090, "Unable to access notification actions", e);
                f16566 = true;
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Bundle[] m20414(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Bundle m20415(C6411.C0973 c0973) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatM20049 = c0973.m20049();
        bundle.putInt("icon", iconCompatM20049 != null ? iconCompatM20049.m29559() : 0);
        bundle.putCharSequence(f16546, c0973.m20053());
        bundle.putParcelable(f16547, c0973.m2865());
        Bundle bundle2 = c0973.m20047() != null ? new Bundle(c0973.m20047()) : new Bundle();
        bundle2.putBoolean(f16544, c0973.m2866());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray(f16549, m20419(c0973.m20050()));
        bundle.putBoolean(f16557, c0973.m20052());
        bundle.putInt(f16556, c0973.m20051());
        return bundle;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Bundle m20416(Notification notification) {
        synchronized (f16558) {
            if (f16560) {
                return null;
            }
            try {
                if (f16559 == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(f2090, "Notification.extras field is not of type Bundle");
                        f16560 = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f16559 = declaredField;
                }
                Bundle bundle = (Bundle) f16559.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f16559.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e(f2090, "Unable to access notification extras", e);
                f16560 = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e(f2090, "Unable to access notification extras", e2);
                f16560 = true;
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static C6411.C0973 m20417(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        C7086[] c7086ArrM20409;
        C7086[] c7086ArrM204092;
        boolean z;
        if (bundle != null) {
            c7086ArrM20409 = m20409(m20414(bundle, C6467.f16543));
            c7086ArrM204092 = m20409(m20414(bundle, f2091));
            z = bundle.getBoolean(f16544);
        } else {
            c7086ArrM20409 = null;
            c7086ArrM204092 = null;
            z = false;
        }
        return new C6411.C0973(i, charSequence, pendingIntent, bundle, c7086ArrM20409, c7086ArrM204092, z, 0, true, false, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static Bundle m20418(C7086 c7086) {
        Bundle bundle = new Bundle();
        bundle.putString(f16551, c7086.m22131());
        bundle.putCharSequence(f16552, c7086.m22130());
        bundle.putCharSequenceArray(f16553, c7086.m22127());
        bundle.putBoolean(f16554, c7086.m22125());
        bundle.putBundle("extras", c7086.m22129());
        Set<String> setM22126 = c7086.m22126();
        if (setM22126 != null && !setM22126.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setM22126.size());
            Iterator<String> it = setM22126.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList(f16555, arrayList);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static Bundle[] m20419(C7086[] c7086Arr) {
        if (c7086Arr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c7086Arr.length];
        for (int i = 0; i < c7086Arr.length; i++) {
            bundleArr[i] = m20418(c7086Arr[i]);
        }
        return bundleArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static Bundle m20420(Notification.Builder builder, C6411.C0973 c0973) {
        IconCompat iconCompatM20049 = c0973.m20049();
        builder.addAction(iconCompatM20049 != null ? iconCompatM20049.m29559() : 0, c0973.m20053(), c0973.m2865());
        Bundle bundle = new Bundle(c0973.m20047());
        if (c0973.m20050() != null) {
            bundle.putParcelableArray(C6467.f16543, m20419(c0973.m20050()));
        }
        if (c0973.m20046() != null) {
            bundle.putParcelableArray(f2091, m20419(c0973.m20046()));
        }
        bundle.putBoolean(f16544, c0973.m2866());
        return bundle;
    }
}
