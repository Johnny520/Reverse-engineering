package com.google.android.material.transformation;

import Yue.C8273;
import Yue.InterfaceC3647;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1980R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.Positioning;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    @InterfaceC6490
    private Map<View, Integer> importantForAccessibilityMap;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FabTransformationSheetBehavior() {
    }

    private void updateImportantForAccessibility(@InterfaceC6391 View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.importantForAccessibilityMap = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C8796) && (((CoordinatorLayout.C8796) childAt.getLayoutParams()).m29508() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (z) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        C8273.m27457(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.importantForAccessibilityMap;
                        if (map != null && map.containsKey(childAt)) {
                            C8273.m27457(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z) {
                return;
            }
            this.importantForAccessibilityMap = null;
        }
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @InterfaceC6391
    public FabTransformationBehavior.FabTransformationSpec onCreateMotionSpec(Context context, boolean z) {
        int i = z ? C1980R.animator.mtrl_fab_transformation_sheet_expand_spec : C1980R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.FabTransformationSpec fabTransformationSpec = new FabTransformationBehavior.FabTransformationSpec();
        fabTransformationSpec.timings = MotionSpec.createFromResource(context, i);
        fabTransformationSpec.positioning = new Positioning(17, 0.0f, 0.0f);
        return fabTransformationSpec;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @InterfaceC3647
    public boolean onExpandedStateChange(@InterfaceC6391 View view, @InterfaceC6391 View view2, boolean z, boolean z2) {
        updateImportantForAccessibility(view2, z);
        return super.onExpandedStateChange(view, view2, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
