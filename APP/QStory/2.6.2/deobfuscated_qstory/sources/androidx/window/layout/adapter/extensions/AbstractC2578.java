package androidx.window.layout.adapter.extensions;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.C2588;
import androidx.window.layout.C2589;
import androidx.window.layout.C2597;
import androidx.window.layout.C2598;
import java.util.ArrayList;
import java.util.List;
import p134.C7507;
import p134.C7509;
import p134.C7510;
import p134.InterfaceC7508;
import p134.InterfaceC7513;
import p147.C7566;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2578 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C2597 m5058(C2598 c2598, WindowLayoutInfo windowLayoutInfo) {
        c2598.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            C2588 c2588M5060 = foldingFeature instanceof FoldingFeature ? m5060(c2598, foldingFeature) : null;
            if (c2588M5060 != null) {
                arrayList.add(c2588M5060);
            }
        }
        return new C2597(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2597 m5059(Context context, WindowLayoutInfo windowLayoutInfo) {
        InterfaceC7513 interfaceC7513 = C7510.f20388;
        C7509 c7509 = C7509.f20382;
        C7507 c7507 = C7507.f20380;
        context.getClass();
        windowLayoutInfo.getClass();
        int i = Build.VERSION.SDK_INT;
        InterfaceC7508 interfaceC7508 = i >= 34 ? C7507.f20381 : C7510.f20384;
        AbstractC8189.m13670(1, 2, 4, 8, 16, 32, 64, 128);
        if (i >= 30) {
            if (i >= 34) {
                interfaceC7513 = c7507;
            } else if (i >= 30) {
                interfaceC7513 = c7509;
            }
            return m5058(interfaceC7513.mo12700(context, interfaceC7508), windowLayoutInfo);
        }
        if (i < 29 || !(context instanceof Activity)) {
            C5919.m11247("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        }
        Activity activity = (Activity) context;
        if (i >= 34) {
            interfaceC7513 = c7507;
        } else if (i >= 30) {
            interfaceC7513 = c7509;
        }
        return m5058(interfaceC7513.mo12701(activity, interfaceC7508), windowLayoutInfo);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2588 m5060(C2598 c2598, FoldingFeature foldingFeature) {
        C2589 c2589;
        C2589 c25892;
        c2598.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            c2589 = C2589.f7765;
        } else {
            if (type != 2) {
                return null;
            }
            c2589 = C2589.f7764;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c25892 = C2589.f7767;
        } else {
            if (state != 2) {
                return null;
            }
            c25892 = C2589.f7766;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        C7566 c7566 = new C7566(bounds);
        Rect rectM5068 = c2598.m5068();
        if (c7566.m12765() == 0 && c7566.m12764() == 0) {
            return null;
        }
        if (c7566.m12764() != rectM5068.width() && c7566.m12765() != rectM5068.height()) {
            return null;
        }
        if (c7566.m12764() < rectM5068.width() && c7566.m12765() < rectM5068.height()) {
            return null;
        }
        if (c7566.m12764() == rectM5068.width() && c7566.m12765() == rectM5068.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new C2588(new C7566(bounds2), c2589, c25892);
    }
}
