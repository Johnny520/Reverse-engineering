package yyds;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: yyds.ᛱᛴᲈᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0116 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int[] f801;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public ViewParent f802;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public ViewParent f803;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ViewGroup f804;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f805;

    public C0116(ViewGroup viewGroup) {
        this.f804 = viewGroup;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m523(int i) {
        ViewParent viewParentM524 = m524(i);
        if (viewParentM524 != null) {
            boolean z = viewParentM524 instanceof InterfaceC1503;
            ViewGroup viewGroup = this.f804;
            if (z) {
                ((InterfaceC1503) viewParentM524).mo50(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentM524.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM524 + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f802 = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f803 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final ViewParent m524(int i) {
        if (i == 0) {
            return this.f802;
        }
        if (i != 1) {
            return null;
        }
        return this.f803;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m525(float f, float f2, boolean z) {
        ViewParent viewParentM524;
        if (this.f805 && (viewParentM524 = m524(0)) != null) {
            try {
                return viewParentM524.onNestedFling(this.f804, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM524 + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean m526(float f, float f2) {
        ViewParent viewParentM524;
        if (this.f805 && (viewParentM524 = m524(0)) != null) {
            try {
                return viewParentM524.onNestedPreFling(this.f804, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM524 + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean m527(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (!m529(i2)) {
            if (this.f805) {
                View view = this.f804;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC1503;
                    if (z) {
                        zOnStartNestedScroll = ((InterfaceC1503) parent).mo51(view2, view, i, i2);
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
                            this.f802 = parent;
                        } else if (i2 == 1) {
                            this.f803 = parent;
                        }
                        if (z) {
                            ((InterfaceC1503) parent).mo45(view2, view, i, i2);
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

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean m528(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentM524;
        int i4;
        int i5;
        if (!this.f805 || (viewParentM524 = m524(i3)) == null) {
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
        ViewGroup viewGroup = this.f804;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null && (iArr = this.f801) == null) {
            iArr = new int[2];
            this.f801 = iArr;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (viewParentM524 instanceof InterfaceC1503) {
            ((InterfaceC1503) viewParentM524).mo52(i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                viewParentM524.onNestedPreScroll(viewGroup, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM524 + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean m529(int i) {
        return m524(i) != null;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean m530(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM524;
        int i6;
        int i7;
        int[] iArr3;
        if (this.f805 && (viewParentM524 = m524(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.f804;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    int[] iArr4 = this.f801;
                    if (iArr4 == null) {
                        iArr4 = new int[2];
                        this.f801 = iArr4;
                    }
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM524 instanceof InterfaceC1567) {
                    ((InterfaceC1567) viewParentM524).mo44(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM524 instanceof InterfaceC1503) {
                        ((InterfaceC1503) viewParentM524).mo46(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentM524.onNestedScroll(viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM524 + " does not implement interface method onNestedScroll", e);
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
}
