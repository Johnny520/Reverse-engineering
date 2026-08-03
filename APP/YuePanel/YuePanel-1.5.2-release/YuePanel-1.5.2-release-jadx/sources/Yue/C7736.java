package Yue;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣۢۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7736 implements Iterable<Intent> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final String f23270 = "TaskStackBuilder";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final ArrayList<Intent> f23271 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Context f23272;

    /* JADX INFO: renamed from: Yue.ۥۣۢۡ۟$ۥ */
    public interface InterfaceC1340 {
        @InterfaceC6490
        Intent getSupportParentActivityIntent();
    }

    public C7736(Context context) {
        this.f23272 = context;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static C7736 m24610(@InterfaceC6391 Context context) {
        return new C7736(context);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static C7736 m24611(Context context) {
        return m24610(context);
    }

    @Override // java.lang.Iterable
    @InterfaceC6391
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f23271.iterator();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public C7736 m3832(@InterfaceC6391 Intent intent) {
        this.f23271.add(intent);
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public C7736 m3833(@InterfaceC6391 Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f23272.getPackageManager());
        }
        if (component != null) {
            m24613(component);
        }
        m3832(intent);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C7736 m24612(@InterfaceC6391 Activity activity) {
        Intent supportParentActivityIntent = activity instanceof InterfaceC1340 ? ((InterfaceC1340) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C6355.m2817(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f23272.getPackageManager());
            }
            m24613(component);
            m3832(supportParentActivityIntent);
        }
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C7736 m24613(@InterfaceC6391 ComponentName componentName) {
        int size = this.f23271.size();
        try {
            Intent intentM2818 = C6355.m2818(this.f23272, componentName);
            while (intentM2818 != null) {
                this.f23271.add(size, intentM2818);
                intentM2818 = C6355.m2818(this.f23272, intentM2818.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(f23270, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C7736 m24614(@InterfaceC6391 Class<?> cls) {
        return m24613(new ComponentName(this.f23272, cls));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Intent m24615(int i) {
        return this.f23271.get(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Intent m24616(int i) {
        return m24615(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m24617() {
        return this.f23271.size();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Intent[] m24618() {
        int size = this.f23271.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.f23271.get(0)).addFlags(268484608);
        for (int i = 1; i < size; i++) {
            intentArr[i] = new Intent(this.f23271.get(i));
        }
        return intentArr;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public PendingIntent m24619(int i, int i2) {
        return m24620(i, i2, null);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public PendingIntent m24620(int i, int i2, @InterfaceC6490 Bundle bundle) {
        if (this.f23271.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f23271.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.f23272, i, intentArr, i2, bundle);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m24621() {
        m24622(null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m24622(@InterfaceC6490 Bundle bundle) {
        if (this.f23271.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f23271.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C4187.m12079(this.f23272, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f23272.startActivity(intent);
    }
}
