package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int[] f6552;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f6553;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ViewGroup f6554;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ViewParent f6555;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ViewParent f6556;

    public C2250(ViewGroup viewGroup) {
        this.f6554 = viewGroup;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m4192(int i) {
        return m4193(i) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ViewParent m4193(int i) {
        if (i == 0) {
            return this.f6556;
        }
        if (i != 1) {
            return null;
        }
        return this.f6555;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m4194(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM4193;
        int i6;
        int i7;
        int[] iArr3;
        if (this.f6553 && (viewParentM4193 = m4193(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.f6554;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f6552 == null) {
                        this.f6552 = new int[2];
                    }
                    int[] iArr4 = this.f6552;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM4193 instanceof InterfaceC2206) {
                    ((InterfaceC2206) viewParentM4193).mo473(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM4193 instanceof InterfaceC2251) {
                        ((InterfaceC2251) viewParentM4193).mo472(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentM4193.onNestedScroll(viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM4193 + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m4195(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentM4193;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f6553 || (viewParentM4193 = m4193(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f6554;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f6552 == null) {
                this.f6552 = new int[2];
            }
            iArr3 = this.f6552;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM4193 instanceof InterfaceC2251) {
            ((InterfaceC2251) viewParentM4193).mo475(viewGroup, i, i2, iArr3, i3);
            viewGroup = viewGroup;
        } else if (i3 == 0) {
            try {
                viewParentM4193.onNestedPreScroll(viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM4193 + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m4196(float f, float f2) {
        ViewParent viewParentM4193;
        if (this.f6553 && (viewParentM4193 = m4193(0)) != null) {
            try {
                return viewParentM4193.onNestedPreFling(this.f6554, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM4193 + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m4197(float f, float f2, boolean z) {
        ViewParent viewParentM4193;
        if (this.f6553 && (viewParentM4193 = m4193(0)) != null) {
            try {
                return viewParentM4193.onNestedFling(this.f6554, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM4193 + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m4198(int i) {
        ViewParent viewParentM4193 = m4193(i);
        if (viewParentM4193 != null) {
            boolean z = viewParentM4193 instanceof InterfaceC2251;
            ViewGroup viewGroup = this.f6554;
            if (z) {
                ((InterfaceC2251) viewParentM4193).mo476(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentM4193.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM4193 + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f6556 = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f6555 = null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m4199(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (!m4192(i2)) {
            if (this.f6553) {
                View view = this.f6554;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC2251;
                    if (z) {
                        zOnStartNestedScroll = ((InterfaceC2251) parent).mo471(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i2 == 0) {
                            this.f6556 = parent;
                        } else if (i2 == 1) {
                            this.f6555 = parent;
                        }
                        if (z) {
                            ((InterfaceC2251) parent).mo470(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
