package androidx.window.layout.adapter.extensions;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.C3422;
import androidx.window.layout.C3423;
import androidx.window.layout.C3431;
import androidx.window.layout.C3432;
import java.util.ArrayList;
import java.util.List;
import p050.AbstractC7176;
import p150.C8337;
import p150.C8339;
import p150.C8340;
import p150.InterfaceC8338;
import p150.InterfaceC8343;
import p163.C8396;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3412 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C3431 m5663(C3432 c3432, WindowLayoutInfo windowLayoutInfo) {
        c3432.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            C3422 c3422M5665 = foldingFeature instanceof FoldingFeature ? m5665(c3432, foldingFeature) : null;
            if (c3422M5665 != null) {
                arrayList.add(c3422M5665);
            }
        }
        return new C3431(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3431 m5664(Context context, WindowLayoutInfo windowLayoutInfo) {
        InterfaceC8343 interfaceC8343 = C8340.f20728;
        C8339 c8339 = C8339.f20722;
        C8337 c8337 = C8337.f20720;
        context.getClass();
        windowLayoutInfo.getClass();
        int i = Build.VERSION.SDK_INT;
        InterfaceC8338 interfaceC8338 = i >= 34 ? C8337.f20721 : C8340.f20724;
        AbstractC7176.m12471(1, 2, 4, 8, 16, 32, 64, 128);
        if (i >= 30) {
            if (i >= 34) {
                interfaceC8343 = c8337;
            } else if (i >= 30) {
                interfaceC8343 = c8339;
            }
            return m5663(interfaceC8343.mo13288(context, interfaceC8338), windowLayoutInfo);
        }
        if (i < 29 || !(context instanceof Activity)) {
            C6755.m11867("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        }
        Activity activity = (Activity) context;
        if (i >= 34) {
            interfaceC8343 = c8337;
        } else if (i >= 30) {
            interfaceC8343 = c8339;
        }
        return m5663(interfaceC8343.mo13289(activity, interfaceC8338), windowLayoutInfo);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3422 m5665(C3432 c3432, FoldingFeature foldingFeature) {
        C3423 c3423;
        C3423 c34232;
        c3432.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            c3423 = C3423.f8112;
        } else {
            if (type != 2) {
                return null;
            }
            c3423 = C3423.f8111;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c34232 = C3423.f8114;
        } else {
            if (state != 2) {
                return null;
            }
            c34232 = C3423.f8113;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        C8396 c8396 = new C8396(bounds);
        Rect rectM5673 = c3432.m5673();
        if (c8396.m13353() == 0 && c8396.m13352() == 0) {
            return null;
        }
        if (c8396.m13352() != rectM5673.width() && c8396.m13353() != rectM5673.height()) {
            return null;
        }
        if (c8396.m13352() < rectM5673.width() && c8396.m13353() < rectM5673.height()) {
            return null;
        }
        if (c8396.m13352() == rectM5673.width() && c8396.m13353() == rectM5673.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new C3422(new C8396(bounds2), c3423, c34232);
    }
}
