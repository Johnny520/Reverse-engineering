package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public BaseTransientBottomBar$Behavior() {
        Math.min(Math.max(0.0f, 0.1f), 1.0f);
        Math.min(Math.max(0.0f, 0.6f), 1.0f);
    }
}
