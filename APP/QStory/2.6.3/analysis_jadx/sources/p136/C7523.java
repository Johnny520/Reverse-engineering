package p136;

import android.graphics.Rect;
import androidx.window.core.VerificationMode;
import androidx.window.layout.C2589;
import androidx.window.layout.C2590;
import androidx.window.layout.C2598;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import p147.C7567;
import p147.C7568;
import p147.C7571;

/* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f20390 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final VerificationMode f20391;

    public C7523() {
        VerificationMode verificationMode = VerificationMode.QUIET;
        verificationMode.getClass();
        this.f20391 = verificationMode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m12737(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean m12738(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m12739(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (m12740((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m12740(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (AbstractC4395.m8907(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return AbstractC4395.m8907(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m12741(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m12742(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList m12743(List list, SidecarDeviceState sidecarDeviceState) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2589 c2589M12745 = m12745((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (c2589M12745 != null) {
                arrayList.add(c2589M12745);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2598 m12744(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new C2598(EmptyList.INSTANCE);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        AbstractC7516.m12733(sidecarDeviceState2, AbstractC7516.m12735(sidecarDeviceState));
        return new C2598(m12743(AbstractC7516.m12734(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C2589 m12745(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C2590 c2590;
        C2590 c25902 = C2590.f7769;
        sidecarDisplayFeature.getClass();
        VerificationMode verificationMode = this.f20391;
        verificationMode.getClass();
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new C7571(sidecarDisplayFeature, verificationMode, C7568.f20483).mo6869("Type must be either TYPE_FOLD or TYPE_HINGE", new C7520()).mo6869("Feature bounds must not be 0", new C7519()).mo6869("TYPE_FOLD must have 0 area", new C7518()).mo6869("Feature be pinned to either left or top", new C7517()).mo6872();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            c2590 = C2590.f7767;
        } else {
            if (type != 2) {
                return null;
            }
            c2590 = C2590.f7766;
        }
        int iM12735 = AbstractC7516.m12735(sidecarDeviceState);
        if (iM12735 == 0 || iM12735 == 1) {
            return null;
        }
        if (iM12735 == 2) {
            c25902 = C2590.f7768;
        } else if (iM12735 != 3 && iM12735 == 4) {
            return null;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        rect.getClass();
        return new C2589(new C7567(rect), c2590, c25902);
    }
}
