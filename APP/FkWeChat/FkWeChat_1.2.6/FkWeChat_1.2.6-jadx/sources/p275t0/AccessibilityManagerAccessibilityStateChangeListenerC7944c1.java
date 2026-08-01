package p275t0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import androidx.compose.runtime.InterfaceC0564p5;
import java.util.List;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: t0.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerAccessibilityStateChangeListenerC7944c1 implements AccessibilityManager.AccessibilityStateChangeListener, InterfaceC0564p5 {

    /* JADX INFO: renamed from: q */
    public final boolean f26485q;

    /* JADX INFO: renamed from: r */
    public final boolean f26486r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC0512i2 f26487s = AbstractC0522j5.m1773e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: t */
    public final c f26488t;

    /* JADX INFO: renamed from: u */
    public final b f26489u;

    /* JADX INFO: renamed from: t0.c1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f26490a = new a();

        /* JADX INFO: renamed from: a */
        public static final void m30667a(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }

        /* JADX INFO: renamed from: b */
        public static final void m30668b(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
    }

    /* JADX INFO: renamed from: t0.c1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements AccessibilityManager$AccessibilityServicesStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0512i2 f26491a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC0512i2 f26492b;

        public b() {
            Boolean bool = Boolean.FALSE;
            this.f26491a = AbstractC0522j5.m1773e(bool, null, 2, null);
            this.f26492b = AbstractC0522j5.m1773e(bool, null, 2, null);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m30669a() {
            return ((Boolean) this.f26491a.getValue()).booleanValue();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m30670b() {
            return ((Boolean) this.f26492b.getValue()).booleanValue();
        }

        /* JADX INFO: renamed from: c */
        public final void m30671c(boolean z10) {
            this.f26491a.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: renamed from: d */
        public final void m30672d(boolean z10) {
            this.f26492b.setValue(Boolean.valueOf(z10));
        }

        public void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
            m30671c(AccessibilityManagerAccessibilityStateChangeListenerC7944c1.this.m30661l(accessibilityManager));
            m30672d(AccessibilityManagerAccessibilityStateChangeListenerC7944c1.this.m30663o(accessibilityManager));
        }
    }

    /* JADX INFO: renamed from: t0.c1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: q */
        public final InterfaceC0512i2 f26494q = AbstractC0522j5.m1773e(Boolean.FALSE, null, 2, null);

        /* JADX INFO: renamed from: a */
        public final boolean m30673a() {
            return ((Boolean) this.f26494q.getValue()).booleanValue();
        }

        /* JADX INFO: renamed from: b */
        public final void m30674b(boolean z10) {
            this.f26494q.setValue(Boolean.valueOf(z10));
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            m30674b(z10);
        }
    }

    public AccessibilityManagerAccessibilityStateChangeListenerC7944c1(boolean z10, boolean z11, boolean z12) {
        this.f26485q = z11;
        this.f26486r = z12;
        b bVar = null;
        this.f26488t = z10 ? new c() : null;
        if ((z11 || z12) && Build.VERSION.SDK_INT >= 33) {
            bVar = new b();
        }
        this.f26489u = bVar;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m30660k() {
        return ((Boolean) this.f26487s.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m30661l(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i10).getSettingsActivityName();
            if (settingsActivityName != null && AbstractC8621f0.m33122Y(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    @Override // androidx.compose.runtime.InterfaceC0564p5
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean getValue() {
        /*
            r2 = this;
            boolean r0 = r2.m30660k()
            if (r0 == 0) goto L30
            t0.c1$c r0 = r2.f26488t
            r1 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.m30673a()
            if (r0 != r1) goto L12
            goto L31
        L12:
            boolean r0 = r2.f26485q
            if (r0 == 0) goto L21
            t0.c1$b r0 = r2.f26489u
            if (r0 == 0) goto L21
            boolean r0 = r0.m30669a()
            if (r0 != r1) goto L21
            goto L31
        L21:
            boolean r0 = r2.f26486r
            if (r0 == 0) goto L30
            t0.c1$b r0 = r2.f26489u
            if (r0 == 0) goto L30
            boolean r0 = r0.m30670b()
            if (r0 != r1) goto L30
            goto L31
        L30:
            r1 = 0
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p275t0.AccessibilityManagerAccessibilityStateChangeListenerC7944c1.getValue():java.lang.Boolean");
    }

    /* JADX INFO: renamed from: o */
    public final boolean m30663o(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i10).getSettingsActivityName();
            if (settingsActivityName != null && AbstractC8621f0.m33122Y(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z10) {
        m30665w(z10);
    }

    /* JADX INFO: renamed from: v */
    public final void m30664v(AccessibilityManager accessibilityManager) {
        b bVar;
        m30665w(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(this);
        c cVar = this.f26488t;
        if (cVar != null) {
            cVar.m30674b(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (bVar = this.f26489u) == null) {
            return;
        }
        bVar.m30671c(m30661l(accessibilityManager));
        bVar.m30672d(m30663o(accessibilityManager));
        a.m30667a(accessibilityManager, AbstractC7940b1.m30655a(bVar));
    }

    /* JADX INFO: renamed from: w */
    public final void m30665w(boolean z10) {
        this.f26487s.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: x */
    public final void m30666x(AccessibilityManager accessibilityManager) {
        b bVar;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        c cVar = this.f26488t;
        if (cVar != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(cVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (bVar = this.f26489u) == null) {
            return;
        }
        a.m30668b(accessibilityManager, AbstractC7940b1.m30655a(bVar));
    }
}
