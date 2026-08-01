package p152;

import android.graphics.Rect;
import androidx.window.core.VerificationMode;
import androidx.window.layout.C3422;
import androidx.window.layout.C3423;
import androidx.window.layout.C3431;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import p163.C8396;
import p163.C8397;
import p163.C8400;

/* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f20735 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final VerificationMode f20736;

    public C8352() {
        VerificationMode verificationMode = VerificationMode.QUIET;
        verificationMode.getClass();
        this.f20736 = verificationMode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m13296(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean m13297(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m13298(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (m13299((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m13299(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (AbstractC5227.m9466(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return AbstractC5227.m9466(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m13300(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m13301(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList m13302(List list, SidecarDeviceState sidecarDeviceState) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3422 c3422M13304 = m13304((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (c3422M13304 != null) {
                arrayList.add(c3422M13304);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3431 m13303(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new C3431(EmptyList.INSTANCE);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        AbstractC8345.m13292(sidecarDeviceState2, AbstractC8345.m13294(sidecarDeviceState));
        return new C3431(m13302(AbstractC8345.m13293(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C3422 m13304(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C3423 c3423;
        C3423 c34232 = C3423.f8114;
        sidecarDisplayFeature.getClass();
        VerificationMode verificationMode = this.f20736;
        verificationMode.getClass();
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new C8400(sidecarDisplayFeature, verificationMode, C8397.f20828).mo7429("Type must be either TYPE_FOLD or TYPE_HINGE", new C8349()).mo7429("Feature bounds must not be 0", new C8348()).mo7429("TYPE_FOLD must have 0 area", new C8347()).mo7429("Feature be pinned to either left or top", new C8346()).mo7432();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            c3423 = C3423.f8112;
        } else {
            if (type != 2) {
                return null;
            }
            c3423 = C3423.f8111;
        }
        int iM13294 = AbstractC8345.m13294(sidecarDeviceState);
        if (iM13294 == 0 || iM13294 == 1) {
            return null;
        }
        if (iM13294 == 2) {
            c34232 = C3423.f8113;
        } else if (iM13294 != 3 && iM13294 == 4) {
            return null;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        rect.getClass();
        return new C3422(new C8396(rect), c3423, c34232);
    }
}
