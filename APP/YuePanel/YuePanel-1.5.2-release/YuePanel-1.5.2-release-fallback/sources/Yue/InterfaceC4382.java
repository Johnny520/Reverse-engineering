package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4382 {
    boolean dispatchNestedFling(float r1, float r2, boolean r3);

    boolean dispatchNestedPreFling(float r1, float r2);

    boolean dispatchNestedPreScroll(int r1, int r2, @Yue.InterfaceC4544 int[] r3, @Yue.InterfaceC4544 int[] r4);

    boolean dispatchNestedScroll(int r1, int r2, int r3, int r4, @Yue.InterfaceC4544 int[] r5);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean r1);

    boolean startNestedScroll(int r1);

    void stopNestedScroll();
}
