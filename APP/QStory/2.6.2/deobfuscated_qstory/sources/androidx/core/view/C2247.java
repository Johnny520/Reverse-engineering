package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.os.AbstractC2173;
import com.davemorrissey.labs.subscaleview.R;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p155.C7606;
import p155.C7609;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2247 extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2246 f6547;

    public C2247(C2246 c2246) {
        this.f6547 = c2246;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f6547.mo4188(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C5851 c5851Mo3566 = this.f6547.mo3566(view);
        if (c5851Mo3566 != null) {
            return (AccessibilityNodeProvider) c5851Mo3566.f16007;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f6547.mo4187(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object tag2;
        C7606 c7606 = new C7606(accessibilityNodeInfo);
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        Object objM4275 = null;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(AbstractC2284.m4265(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z = bool != null && bool.booleanValue();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            c7606.m12809(1, z);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(AbstractC2284.m4266(view));
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (i >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            c7606.m12809(2, z2);
        }
        CharSequence charSequenceM4223 = AbstractC2270.m4223(view);
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequenceM4223);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceM4223);
        }
        if (i >= 30) {
            objM4275 = AbstractC2289.m4275(view);
        } else {
            Object tag3 = view.getTag(R.id.tag_state_description);
            if (CharSequence.class.isInstance(tag3)) {
                objM4275 = tag3;
            }
        }
        CharSequence charSequence = (CharSequence) objM4275;
        if (i >= 30) {
            AbstractC2173.m3945(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f6547.mo3581(view, c7606);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c7606.m12805((C7609) list.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f6547.mo4186(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f6547.mo4185(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f6547.mo4190(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f6547.mo4189(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f6547.mo4191(view, accessibilityEvent);
    }
}
