package p006D;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import org.luckypray.dexkit.C1031R;
import p008E.AbstractC0152f;
import p008E.C0151e;
import p008E.C0156j;
import p008E.C0158l;

/* JADX INFO: renamed from: D.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0089a extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final C0091b f237a;

    public C0089a(C0091b c0091b) {
        this.f237a = c0091b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f237a.mo313a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0158l c0158lMo314b = this.f237a.mo314b(view);
        if (c0158lMo314b != null) {
            return (AccessibilityNodeProvider) c0158lMo314b.f362a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f237a.mo315c(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object objValueOf;
        C0156j c0156j = new C0156j(accessibilityNodeInfo);
        Field field = AbstractC0080Q.f219a;
        int i2 = Build.VERSION.SDK_INT;
        Object objM274b = null;
        if (i2 >= 28) {
            tag = Boolean.valueOf(AbstractC0074K.m260d(view));
        } else {
            tag = view.getTag(C1031R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z2 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        if (i2 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z2);
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z2 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            objValueOf = Boolean.valueOf(AbstractC0074K.m259c(view));
        } else {
            Object tag2 = view.getTag(C1031R.id.tag_accessibility_heading);
            objValueOf = Boolean.class.isInstance(tag2) ? tag2 : null;
        }
        Boolean bool2 = (Boolean) objValueOf;
        boolean z3 = bool2 != null && bool2.booleanValue();
        if (i2 >= 28) {
            accessibilityNodeInfo.setHeading(z3);
        } else {
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z3 ? 2 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
            }
        }
        CharSequence charSequenceM283b = AbstractC0080Q.m283b(view);
        if (i2 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequenceM283b);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceM283b);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            objM274b = AbstractC0076M.m274b(view);
        } else {
            Object tag3 = view.getTag(C1031R.id.tag_state_description);
            if (CharSequence.class.isInstance(tag3)) {
                objM274b = tag3;
            }
        }
        CharSequence charSequence = (CharSequence) objM274b;
        if (i2 >= 30) {
            AbstractC0152f.m480c(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f237a.mo55d(view, c0156j);
        accessibilityNodeInfo.getText();
        List listEmptyList = (List) view.getTag(C1031R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        for (int i3 = 0; i3 < listEmptyList.size(); i3++) {
            c0156j.m506b((C0151e) listEmptyList.get(i3));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f237a.mo56e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f237a.mo316f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        return this.f237a.mo317g(view, i2, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i2) {
        this.f237a.mo318h(view, i2);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f237a.mo319i(view, accessibilityEvent);
    }
}
