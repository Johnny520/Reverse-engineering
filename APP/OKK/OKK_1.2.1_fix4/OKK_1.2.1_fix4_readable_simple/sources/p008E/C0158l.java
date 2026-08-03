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

    public C0158l(int r3) {
        switch(r3) {
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        this.f362a = new C0157k(this);
        return;
    L5:
        this.f362a = new Object();
        new Handler(Looper.getMainLooper(), new C1147e(this));
    }

    /* JADX INFO: renamed from: a */
    public C0156j mo512a(int r1) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public C0156j mo513b(int r1) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo514c(int r1, int r2, Bundle r3) {
        return false;
    }

    public C0158l(AccessibilityNodeProvider r1) {
        this.f362a = r1;
    }
}
