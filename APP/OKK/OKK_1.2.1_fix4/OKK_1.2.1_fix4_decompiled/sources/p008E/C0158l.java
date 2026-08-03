package p008E;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeProvider;
import p092z0.C1147e;

/* JADX INFO: renamed from: E.l */
/* JADX INFO: loaded from: classes.dex */
public class C0158l {

    /* JADX INFO: renamed from: b */
    public static C0158l f361b;

    /* JADX INFO: renamed from: a */
    public final Object f362a;

    public C0158l(int i2) {
        switch (i2) {
            case 1:
                this.f362a = new Object();
                new Handler(Looper.getMainLooper(), new C1147e(this));
                break;
            default:
                this.f362a = new C0157k(this);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public C0156j mo512a(int i2) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public C0156j mo513b(int i2) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo514c(int i2, int i3, Bundle bundle) {
        return false;
    }

    public C0158l(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f362a = accessibilityNodeProvider;
    }
}
