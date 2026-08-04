package yyds;

import android.os.Build;
import android.util.Log;
import android.view.View;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛷᲁᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1640 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static WeakHashMap f8352;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C2563 f8353 = new C2563();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final ViewTreeObserverOnGlobalLayoutListenerC1033 f8354 = new ViewTreeObserverOnGlobalLayoutListenerC1033();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static void m3342(View view, CharSequence charSequence) {
        AbstractC2278.m4289(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC1033 viewTreeObserverOnGlobalLayoutListenerC1033 = f8354;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC1033.f4691.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1033);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1033);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC1033.f4691.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1033);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1033);
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0140 m3343(View view) {
        WeakHashMap weakHashMap = f8352;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            f8352 = weakHashMap;
        }
        C0140 c0140 = (C0140) weakHashMap.get(view);
        if (c0140 != null) {
            return c0140;
        }
        C0140 c01402 = new C0140(view);
        f8352.put(view, c01402);
        return c01402;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static String[] m3344(C0555 c0555) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC1365.m2762(c0555) : (String[]) c0555.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C1167 m3345(View view, C1167 c1167) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1167 + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1365.m2763(view, c1167);
        }
        C1179 c1179 = (C1179) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC1403 interfaceC1403 = f8353;
        if (c1179 == null) {
            if (view instanceof InterfaceC1403) {
                interfaceC1403 = (InterfaceC1403) view;
            }
            return interfaceC1403.mo1403(c1167);
        }
        C1167 c1167M2374 = C1179.m2374(view, c1167);
        if (c1167M2374 == null) {
            return null;
        }
        if (view instanceof InterfaceC1403) {
            interfaceC1403 = (InterfaceC1403) view;
        }
        return interfaceC1403.mo1403(c1167M2374);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m3346(View view, C2060 c2060) {
        if (c2060 == null && (AbstractC1256.m2534(view) instanceof C1862)) {
            c2060 = new C2060();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c2060 == null ? null : c2060.f10202);
    }
}
