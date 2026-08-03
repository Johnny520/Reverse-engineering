package Yue;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3067 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f56 = -1;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6490
    public final Object f57;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۡ$ۥ */
    public static class C0037 extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: ۥ */
        public final C3067 f58;

        public C0037(C3067 c3067) {
            this.f58 = c3067;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C3055 c3055Mo144 = this.f58.mo144(i);
            if (c3055Mo144 == null) {
                return null;
            }
            return c3055Mo144.m6116();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C3055> listM6161 = this.f58.m6161(str, i);
            if (listM6161 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listM6161.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(listM6161.get(i2).m6116());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            C3055 c3055Mo6162 = this.f58.mo6162(i);
            if (c3055Mo6162 == null) {
                return null;
            }
            return c3055Mo6162.m6116();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f58.mo6164(i, i2, bundle);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۡ$ۥ۟ */
    @InterfaceC7113(26)
    public static class C0038 extends C0037 {
        public C0038(C3067 c3067) {
            super(c3067);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f58.m143(i, C3055.m5950(accessibilityNodeInfo), str, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3067() {
        this.f57 = new C0038(this);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m143(int i, @InterfaceC6391 C3055 c3055, @InterfaceC6391 String str, @InterfaceC6490 Bundle bundle) {
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public C3055 mo144(int i) {
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public List<C3055> m6161(@InterfaceC6391 String str, int i) {
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C3055 mo6162(int i) {
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Object m6163() {
        return this.f57;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean mo6164(int i, int i2, @InterfaceC6490 Bundle bundle) {
        return false;
    }

    public C3067(@InterfaceC6490 Object obj) {
        this.f57 = obj;
    }
}
