package p136;

import android.graphics.Rect;
import androidx.window.core.VerificationMode;
import androidx.window.layout.C2588;
import androidx.window.layout.C2589;
import androidx.window.layout.C2597;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import p147.C7566;
import p147.C7567;
import p147.C7570;

/* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7522 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f20395 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final VerificationMode f20396;

    public C7522() {
        VerificationMode verificationMode = VerificationMode.QUIET;
        verificationMode.getClass();
        this.f20396 = verificationMode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m12708(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean m12709(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m12710(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (m12711((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m12711(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (AbstractC4394.m8917(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return AbstractC4394.m8917(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m12712(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m12713(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList m12714(List list, SidecarDeviceState sidecarDeviceState) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2588 c2588M12716 = m12716((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (c2588M12716 != null) {
                arrayList.add(c2588M12716);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2597 m12715(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new C2597(EmptyList.INSTANCE);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        AbstractC7515.m12704(sidecarDeviceState2, AbstractC7515.m12706(sidecarDeviceState));
        return new C2597(m12714(AbstractC7515.m12705(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C2588 m12716(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C2589 c2589;
        C2589 c25892 = C2589.f7767;
        sidecarDisplayFeature.getClass();
        VerificationMode verificationMode = this.f20396;
        verificationMode.getClass();
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new C7570(sidecarDisplayFeature, verificationMode, C7567.f20488).mo6273("Type must be either TYPE_FOLD or TYPE_HINGE", new C7519()).mo6273("Feature bounds must not be 0", new C7518()).mo6273("TYPE_FOLD must have 0 area", new C7517()).mo6273("Feature be pinned to either left or top", new C7516()).mo6283();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            c2589 = C2589.f7765;
        } else {
            if (type != 2) {
                return null;
            }
            c2589 = C2589.f7764;
        }
        int iM12706 = AbstractC7515.m12706(sidecarDeviceState);
        if (iM12706 == 0 || iM12706 == 1) {
            return null;
        }
        if (iM12706 == 2) {
            c25892 = C2589.f7766;
        } else if (iM12706 != 3 && iM12706 == 4) {
            return null;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        rect.getClass();
        return new C2588(new C7566(rect), c2589, c25892);
    }
}
