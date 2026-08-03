package Yue;

import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۣۡۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6369 {
    int getNestedScrollAxes();

    boolean onNestedFling(@InterfaceC6391 View view, float f, float f2, boolean z);

    boolean onNestedPreFling(@InterfaceC6391 View view, float f, float f2);

    void onNestedPreScroll(@InterfaceC6391 View view, int i, int i2, @InterfaceC6391 int[] iArr);

    void onNestedScroll(@InterfaceC6391 View view, int i, int i2, int i3, int i4);

    void onNestedScrollAccepted(@InterfaceC6391 View view, @InterfaceC6391 View view2, int i);

    boolean onStartNestedScroll(@InterfaceC6391 View view, @InterfaceC6391 View view2, int i);

    void onStopNestedScroll(@InterfaceC6391 View view);
}
