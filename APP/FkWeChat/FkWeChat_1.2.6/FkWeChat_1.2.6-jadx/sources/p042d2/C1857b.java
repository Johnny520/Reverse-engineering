package p042d2;

import android.view.KeyEvent;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: d2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1857b {

    /* JADX INFO: renamed from: a */
    public final KeyEvent f5186a;

    public /* synthetic */ C1857b(KeyEvent keyEvent) {
        this.f5186a = keyEvent;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C1857b m6591a(KeyEvent keyEvent) {
        return new C1857b(keyEvent);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6593c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof C1857b) && AbstractC1061t.m3842c(keyEvent, ((C1857b) obj).m6596f());
    }

    /* JADX INFO: renamed from: d */
    public static int m6594d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* JADX INFO: renamed from: e */
    public static String m6595e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m6593c(this.f5186a, obj);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ KeyEvent m6596f() {
        return this.f5186a;
    }

    public int hashCode() {
        return m6594d(this.f5186a);
    }

    public String toString() {
        return m6595e(this.f5186a);
    }

    /* JADX INFO: renamed from: b */
    public static KeyEvent m6592b(KeyEvent keyEvent) {
        return keyEvent;
    }
}
