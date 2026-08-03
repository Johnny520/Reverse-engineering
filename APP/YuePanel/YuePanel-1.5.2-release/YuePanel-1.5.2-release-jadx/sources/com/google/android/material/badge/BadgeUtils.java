package com.google.android.material.badge;

import Yue.C3024;
import Yue.C3055;
import Yue.C8273;
import Yue.InterfaceC5411;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.C1980R;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ToolbarUtils;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalBadgeUtils
public class BadgeUtils {
    private static final String LOG_TAG = "BadgeUtils";
    public static final boolean USE_COMPAT_PARENT = false;

    private BadgeUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void attachBadgeContentDescription(@InterfaceC6391 final BadgeDrawable badgeDrawable, @InterfaceC6391 View view) {
        if (Build.VERSION.SDK_INT < 29 || !C8273.m27389(view)) {
            C8273.m27439(view, new C3024() { // from class: com.google.android.material.badge.BadgeUtils.3
                @Override // Yue.C3024
                public void onInitializeAccessibilityNodeInfo(View view2, C3055 c3055) {
                    super.onInitializeAccessibilityNodeInfo(view2, c3055);
                    c3055.m6062(badgeDrawable.getContentDescription());
                }
            });
        } else {
            C8273.m27439(view, new C3024(view.getAccessibilityDelegate()) { // from class: com.google.android.material.badge.BadgeUtils.2
                @Override // Yue.C3024
                public void onInitializeAccessibilityNodeInfo(View view2, C3055 c3055) {
                    super.onInitializeAccessibilityNodeInfo(view2, c3055);
                    c3055.m6062(badgeDrawable.getContentDescription());
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void attachBadgeDrawable(@InterfaceC6391 BadgeDrawable badgeDrawable, @InterfaceC6391 View view) {
        attachBadgeDrawable(badgeDrawable, view, (FrameLayout) null);
    }

    @InterfaceC6391
    public static SparseArray<BadgeDrawable> createBadgeDrawablesFromSavedStates(Context context, @InterfaceC6391 ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int iKeyAt = parcelableSparseArray.keyAt(i);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i);
            sparseArray.put(iKeyAt, state != null ? BadgeDrawable.createFromSavedState(context, state) : null);
        }
        return sparseArray;
    }

    @InterfaceC6391
    public static ParcelableSparseArray createParcelableBadgeStates(@InterfaceC6391 SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            BadgeDrawable badgeDrawableValueAt = sparseArray.valueAt(i);
            parcelableSparseArray.put(iKeyAt, badgeDrawableValueAt != null ? badgeDrawableValueAt.getSavedState() : null);
        }
        return parcelableSparseArray;
    }

    private static void detachBadgeContentDescription(@InterfaceC6391 View view) {
        if (Build.VERSION.SDK_INT < 29 || !C8273.m27389(view)) {
            C8273.m27439(view, null);
        } else {
            C8273.m27439(view, new C3024(view.getAccessibilityDelegate()) { // from class: com.google.android.material.badge.BadgeUtils.4
                @Override // Yue.C3024
                public void onInitializeAccessibilityNodeInfo(View view2, C3055 c3055) {
                    super.onInitializeAccessibilityNodeInfo(view2, c3055);
                    c3055.m6062(null);
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void detachBadgeDrawable(@InterfaceC6490 BadgeDrawable badgeDrawable, @InterfaceC6391 View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (USE_COMPAT_PARENT || badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    @InterfaceC8392
    public static void removeToolbarOffset(BadgeDrawable badgeDrawable) {
        badgeDrawable.setAdditionalHorizontalOffset(0);
        badgeDrawable.setAdditionalVerticalOffset(0);
    }

    public static void setBadgeDrawableBounds(@InterfaceC6391 BadgeDrawable badgeDrawable, @InterfaceC6391 View view, @InterfaceC6490 FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.updateBadgeCoordinates(view, frameLayout);
    }

    @InterfaceC8392
    public static void setToolbarOffset(BadgeDrawable badgeDrawable, Resources resources) {
        badgeDrawable.setAdditionalHorizontalOffset(resources.getDimensionPixelOffset(C1980R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
        badgeDrawable.setAdditionalVerticalOffset(resources.getDimensionPixelOffset(C1980R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset));
    }

    public static void updateBadgeBounds(@InterfaceC6391 Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void attachBadgeDrawable(@InterfaceC6391 BadgeDrawable badgeDrawable, @InterfaceC6391 View view, @InterfaceC6490 FrameLayout frameLayout) {
        setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
        if (badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(badgeDrawable);
        } else {
            if (USE_COMPAT_PARENT) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void detachBadgeDrawable(@InterfaceC6490 BadgeDrawable badgeDrawable, @InterfaceC6391 Toolbar toolbar, @InterfaceC5411 int i) {
        if (badgeDrawable == null) {
            return;
        }
        ActionMenuItemView actionMenuItemView = ToolbarUtils.getActionMenuItemView(toolbar, i);
        if (actionMenuItemView != null) {
            removeToolbarOffset(badgeDrawable);
            detachBadgeDrawable(badgeDrawable, actionMenuItemView);
            detachBadgeContentDescription(actionMenuItemView);
        } else {
            Log.w(LOG_TAG, "Trying to remove badge from a null menuItemView: " + i);
        }
    }

    public static void attachBadgeDrawable(@InterfaceC6391 BadgeDrawable badgeDrawable, @InterfaceC6391 Toolbar toolbar, @InterfaceC5411 int i) {
        attachBadgeDrawable(badgeDrawable, toolbar, i, null);
    }

    public static void attachBadgeDrawable(@InterfaceC6391 final BadgeDrawable badgeDrawable, @InterfaceC6391 final Toolbar toolbar, @InterfaceC5411 final int i, @InterfaceC6490 final FrameLayout frameLayout) {
        toolbar.post(new Runnable() { // from class: com.google.android.material.badge.BadgeUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ActionMenuItemView actionMenuItemView = ToolbarUtils.getActionMenuItemView(toolbar, i);
                if (actionMenuItemView != null) {
                    BadgeUtils.setToolbarOffset(badgeDrawable, toolbar.getResources());
                    BadgeUtils.attachBadgeDrawable(badgeDrawable, actionMenuItemView, frameLayout);
                    BadgeUtils.attachBadgeContentDescription(badgeDrawable, actionMenuItemView);
                }
            }
        });
    }
}
