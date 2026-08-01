package p352y3;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: y3.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C9562u {

    /* JADX INFO: renamed from: a */
    public final Object f32593a;

    /* JADX INFO: renamed from: y3.u$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a */
        public final C9562u f32594a;

        public a(C9562u c9562u) {
            this.f32594a = c9562u;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            C9561t c9561tMo19806b = this.f32594a.mo19806b(i10);
            if (c9561tMo19806b == null) {
                return null;
            }
            return c9561tMo19806b.m37398N0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List listM37475c = this.f32594a.m37475c(str, i10);
            if (listM37475c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listM37475c.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((C9561t) listM37475c.get(i11)).m37398N0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            C9561t c9561tMo19807d = this.f32594a.mo19807d(i10);
            if (c9561tMo19807d == null) {
                return null;
            }
            return c9561tMo19807d.m37398N0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f32594a.mo19808f(i10, i11, bundle);
        }
    }

    /* JADX INFO: renamed from: y3.u$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b extends a {
        public b(C9562u c9562u) {
            super(c9562u);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f32594a.mo19805a(i10, C9561t.m37367O0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C9562u() {
        this.f32593a = new b(this);
    }

    /* JADX INFO: renamed from: b */
    public C9561t mo19806b(int i10) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public List m37475c(String str, int i10) {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public C9561t mo19807d(int i10) {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Object m37476e() {
        return this.f32593a;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo19808f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public C9562u(Object obj) {
        this.f32593a = obj;
    }

    /* JADX INFO: renamed from: a */
    public void mo19805a(int i10, C9561t c9561t, String str, Bundle bundle) {
    }
}
