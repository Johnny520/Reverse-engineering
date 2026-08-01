package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: iw */
/* JADX INFO: loaded from: classes.dex */
public final class C0352iw {

    /* JADX INFO: renamed from: a */
    public ViewParent f2505a;

    /* JADX INFO: renamed from: b */
    public ViewParent f2506b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f2507c;

    /* JADX INFO: renamed from: d */
    public boolean f2508d;

    /* JADX INFO: renamed from: e */
    public int[] f2509e;

    public C0352iw(ViewGroup viewGroup) {
        this.f2507c = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1518a(float f, float f2, boolean z) {
        ViewParent viewParentM1522e;
        if (this.f2508d && (viewParentM1522e = m1522e(0)) != null) {
            try {
                return ua0.m2434a(viewParentM1522e, this.f2507c, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM1522e + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1519b(float f, float f2) {
        ViewParent viewParentM1522e;
        if (this.f2508d && (viewParentM1522e = m1522e(0)) != null) {
            try {
                return ua0.m2435b(viewParentM1522e, this.f2507c, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM1522e + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1520c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM1522e;
        int i4;
        int i5;
        if (!this.f2508d || (viewParentM1522e = m1522e(i3)) == null) {
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
        ViewGroup viewGroup = this.f2507c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f2509e == null) {
                this.f2509e = new int[2];
            }
            iArr = this.f2509e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM1522e instanceof InterfaceC0389jw) {
            ((InterfaceC0389jw) viewParentM1522e).mo151c(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                ua0.m2436c(viewParentM1522e, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM1522e + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1521d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM1522e;
        int i6;
        int i7;
        int[] iArr3;
        if (this.f2508d && (viewParentM1522e = m1522e(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.f2507c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f2509e == null) {
                        this.f2509e = new int[2];
                    }
                    int[] iArr4 = this.f2509e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM1522e instanceof InterfaceC0426kw) {
                    ((InterfaceC0426kw) viewParentM1522e).mo152d(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM1522e instanceof InterfaceC0389jw) {
                        ((InterfaceC0389jw) viewParentM1522e).mo153e(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            ua0.m2437d(viewParentM1522e, viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM1522e + " does not implement interface method onNestedScroll", e);
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

    /* JADX INFO: renamed from: e */
    public final ViewParent m1522e(int i) {
        if (i == 0) {
            return this.f2505a;
        }
        if (i != 1) {
            return null;
        }
        return this.f2506b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1523f(int i) {
        return m1522e(i) != null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1524g(int i, int i2) {
        boolean zM2439f;
        if (!m1523f(i2)) {
            if (this.f2508d) {
                ViewGroup viewGroup = this.f2507c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC0389jw;
                    if (z) {
                        zM2439f = ((InterfaceC0389jw) parent).mo154f(view, viewGroup, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zM2439f = ua0.m2439f(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            zM2439f = false;
                        }
                    } else {
                        zM2439f = false;
                    }
                    if (zM2439f) {
                        if (i2 == 0) {
                            this.f2505a = parent;
                        } else if (i2 == 1) {
                            this.f2506b = parent;
                        }
                        if (z) {
                            ((InterfaceC0389jw) parent).mo149a(view, viewGroup, i, i2);
                        } else if (i2 == 0) {
                            try {
                                ua0.m2438e(parent, view, viewGroup, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m1525h(int i) {
        ViewParent viewParentM1522e = m1522e(i);
        if (viewParentM1522e != null) {
            boolean z = viewParentM1522e instanceof InterfaceC0389jw;
            ViewGroup viewGroup = this.f2507c;
            if (z) {
                ((InterfaceC0389jw) viewParentM1522e).mo150b(viewGroup, i);
            } else if (i == 0) {
                try {
                    ua0.m2440g(viewParentM1522e, viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM1522e + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f2505a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f2506b = null;
            }
        }
    }
}
