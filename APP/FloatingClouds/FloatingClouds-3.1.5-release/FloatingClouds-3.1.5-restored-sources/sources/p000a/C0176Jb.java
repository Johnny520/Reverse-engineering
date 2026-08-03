package p000a;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: a.Jb */
/* JADX INFO: loaded from: classes.dex */
public final class C0176Jb {

    /* JADX INFO: renamed from: a */
    public ViewParent f615a;

    /* JADX INFO: renamed from: b */
    public ViewParent f616b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f617c;

    /* JADX INFO: renamed from: d */
    public boolean f618d;

    /* JADX INFO: renamed from: e */
    public int[] f619e;

    public C0176Jb(ViewGroup viewGroup) {
        this.f617c = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m477a(float f, float f2, boolean z) {
        ViewParent viewParentM481e;
        if (this.f618d && (viewParentM481e = m481e(0)) != null) {
            try {
                return C0163Ig.m446a(viewParentM481e, this.f617c, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM481e + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m478b(float f, float f2) {
        ViewParent viewParentM481e;
        if (this.f618d && (viewParentM481e = m481e(0)) != null) {
            try {
                return C0163Ig.m447b(viewParentM481e, this.f617c, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM481e + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m479c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM481e;
        int i4;
        int i5;
        if (!this.f618d || (viewParentM481e = m481e(i3)) == null) {
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
        ViewGroup viewGroup = this.f617c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f619e == null) {
                this.f619e = new int[2];
            }
            iArr = this.f619e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM481e instanceof InterfaceC0194Kb) {
            ((InterfaceC0194Kb) viewParentM481e).mo530j(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                C0163Ig.m448c(viewParentM481e, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM481e + " does not implement interface method onNestedPreScroll", e);
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
    public final boolean m480d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM481e;
        int i6;
        int i7;
        int[] iArr3;
        if (this.f618d && (viewParentM481e = m481e(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.f617c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f619e == null) {
                        this.f619e = new int[2];
                    }
                    int[] iArr4 = this.f619e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM481e instanceof InterfaceC0212Lb) {
                    ((InterfaceC0212Lb) viewParentM481e).mo591m(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM481e instanceof InterfaceC0194Kb) {
                        ((InterfaceC0194Kb) viewParentM481e).mo531n(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            C0163Ig.m449d(viewParentM481e, viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM481e + " does not implement interface method onNestedScroll", e);
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
    public final ViewParent m481e(int i) {
        if (i == 0) {
            return this.f615a;
        }
        if (i != 1) {
            return null;
        }
        return this.f616b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m482f(int i) {
        return m481e(i) != null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m483g(int i, int i2) {
        boolean zM451f;
        if (!m482f(i2)) {
            if (this.f618d) {
                ViewGroup viewGroup = this.f617c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC0194Kb;
                    if (z) {
                        zM451f = ((InterfaceC0194Kb) parent).mo532o(view, viewGroup, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zM451f = C0163Ig.m451f(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            zM451f = false;
                        }
                    } else {
                        zM451f = false;
                    }
                    if (zM451f) {
                        if (i2 == 0) {
                            this.f615a = parent;
                        } else if (i2 == 1) {
                            this.f616b = parent;
                        }
                        if (z) {
                            ((InterfaceC0194Kb) parent).mo528c(view, viewGroup, i, i2);
                        } else if (i2 == 0) {
                            try {
                                C0163Ig.m450e(parent, view, viewGroup, i);
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
    public final void m484h(int i) {
        ViewParent viewParentM481e = m481e(i);
        if (viewParentM481e != null) {
            boolean z = viewParentM481e instanceof InterfaceC0194Kb;
            ViewGroup viewGroup = this.f617c;
            if (z) {
                ((InterfaceC0194Kb) viewParentM481e).mo529i(viewGroup, i);
            } else if (i == 0) {
                try {
                    C0163Ig.m452g(viewParentM481e, viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM481e + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f615a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f616b = null;
            }
        }
    }
}
