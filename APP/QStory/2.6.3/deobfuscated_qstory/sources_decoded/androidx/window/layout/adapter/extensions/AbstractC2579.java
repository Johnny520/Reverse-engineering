package androidx.window.layout.adapter.extensions;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.C2589;
import androidx.window.layout.C2590;
import androidx.window.layout.C2598;
import androidx.window.layout.C2599;
import java.util.ArrayList;
import java.util.List;
import p034.AbstractC6347;
import p134.C7508;
import p134.C7510;
import p134.C7511;
import p134.InterfaceC7509;
import p134.InterfaceC7514;
import p147.C7567;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2579 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C2598 m5103(C2599 c2599, WindowLayoutInfo windowLayoutInfo) {
        c2599.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            C2589 c2589M5105 = foldingFeature instanceof FoldingFeature ? m5105(c2599, foldingFeature) : null;
            if (c2589M5105 != null) {
                arrayList.add(c2589M5105);
            }
        }
        return new C2598(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2598 m5104(Context context, WindowLayoutInfo windowLayoutInfo) {
        InterfaceC7514 interfaceC7514 = C7511.f20383;
        C7510 c7510 = C7510.f20377;
        C7508 c7508 = C7508.f20375;
        context.getClass();
        windowLayoutInfo.getClass();
        int i = Build.VERSION.SDK_INT;
        InterfaceC7509 interfaceC7509 = i >= 34 ? C7508.f20376 : C7511.f20379;
        AbstractC6347.m11912(1, 2, 4, 8, 16, 32, 64, 128);
        if (i >= 30) {
            if (i >= 34) {
                interfaceC7514 = c7508;
            } else if (i >= 30) {
                interfaceC7514 = c7510;
            }
            return m5103(interfaceC7514.mo12729(context, interfaceC7509), windowLayoutInfo);
        }
        if (i < 29 || !(context instanceof Activity)) {
            C5925.m11308("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        }
        Activity activity = (Activity) context;
        if (i >= 34) {
            interfaceC7514 = c7508;
        } else if (i >= 30) {
            interfaceC7514 = c7510;
        }
        return m5103(interfaceC7514.mo12730(activity, interfaceC7509), windowLayoutInfo);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2589 m5105(C2599 c2599, FoldingFeature foldingFeature) {
        C2590 c2590;
        C2590 c25902;
        c2599.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            c2590 = C2590.f7767;
        } else {
            if (type != 2) {
                return null;
            }
            c2590 = C2590.f7766;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c25902 = C2590.f7769;
        } else {
            if (state != 2) {
                return null;
            }
            c25902 = C2590.f7768;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        C7567 c7567 = new C7567(bounds);
        Rect rectM5113 = c2599.m5113();
        if (c7567.m12794() == 0 && c7567.m12793() == 0) {
            return null;
        }
        if (c7567.m12793() != rectM5113.width() && c7567.m12794() != rectM5113.height()) {
            return null;
        }
        if (c7567.m12793() < rectM5113.width() && c7567.m12794() < rectM5113.height()) {
            return null;
        }
        if (c7567.m12793() == rectM5113.width() && c7567.m12794() == rectM5113.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new C2589(new C7567(bounds2), c2590, c25902);
    }
}
