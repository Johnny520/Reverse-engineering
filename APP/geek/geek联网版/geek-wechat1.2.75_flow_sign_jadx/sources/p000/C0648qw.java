package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: qw */
/* JADX INFO: loaded from: classes.dex */
public final class C0648qw {

    /* JADX INFO: renamed from: a */
    public ViewParent f3979a;

    /* JADX INFO: renamed from: b */
    public ViewParent f3980b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f3981c;

    /* JADX INFO: renamed from: d */
    public boolean f3982d;

    /* JADX INFO: renamed from: e */
    public int[] f3983e;

    public C0648qw(ViewGroup viewGroup) {
        this.f3981c = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2180a(float f, float f2, boolean z) {
        ViewParent viewParentM2184e;
        if (this.f3982d && (viewParentM2184e = m2184e(0)) != null) {
            try {
                return za0.m2825a(viewParentM2184e, this.f3981c, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM2184e + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2181b(float f, float f2) {
        ViewParent viewParentM2184e;
        if (this.f3982d && (viewParentM2184e = m2184e(0)) != null) {
            try {
                return za0.m2826b(viewParentM2184e, this.f3981c, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM2184e + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2182c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM2184e;
        int i4;
        int i5;
        if (!this.f3982d || (viewParentM2184e = m2184e(i3)) == null) {
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
        ViewGroup viewGroup = this.f3981c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f3983e == null) {
                this.f3983e = new int[2];
            }
            iArr = this.f3983e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM2184e instanceof InterfaceC0685rw) {
            ((InterfaceC0685rw) viewParentM2184e).mo136c(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                za0.m2827c(viewParentM2184e, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM2184e + " does not implement interface method onNestedPreScroll", e);
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
    public final boolean m2183d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM2184e;
        int i6;
        int i7;
        int[] iArr3;
        if (this.f3982d && (viewParentM2184e = m2184e(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.f3981c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f3983e == null) {
                        this.f3983e = new int[2];
                    }
                    int[] iArr4 = this.f3983e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM2184e instanceof InterfaceC0722sw) {
                    ((InterfaceC0722sw) viewParentM2184e).mo137d(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM2184e instanceof InterfaceC0685rw) {
                        ((InterfaceC0685rw) viewParentM2184e).mo138e(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            za0.m2828d(viewParentM2184e, viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM2184e + " does not implement interface method onNestedScroll", e);
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
    public final ViewParent m2184e(int i) {
        if (i == 0) {
            return this.f3979a;
        }
        if (i != 1) {
            return null;
        }
        return this.f3980b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2185f(int i) {
        return m2184e(i) != null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2186g(int i, int i2) {
        boolean zM2830f;
        if (!m2185f(i2)) {
            if (this.f3982d) {
                ViewGroup viewGroup = this.f3981c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC0685rw;
                    if (z) {
                        zM2830f = ((InterfaceC0685rw) parent).mo139f(view, viewGroup, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zM2830f = za0.m2830f(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            zM2830f = false;
                        }
                    } else {
                        zM2830f = false;
                    }
                    if (zM2830f) {
                        if (i2 == 0) {
                            this.f3979a = parent;
                        } else if (i2 == 1) {
                            this.f3980b = parent;
                        }
                        if (z) {
                            ((InterfaceC0685rw) parent).mo134a(view, viewGroup, i, i2);
                        } else if (i2 == 0) {
                            try {
                                za0.m2829e(parent, view, viewGroup, i);
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
    public final void m2187h(int i) {
        ViewParent viewParentM2184e = m2184e(i);
        if (viewParentM2184e != null) {
            boolean z = viewParentM2184e instanceof InterfaceC0685rw;
            ViewGroup viewGroup = this.f3981c;
            if (z) {
                ((InterfaceC0685rw) viewParentM2184e).mo135b(viewGroup, i);
            } else if (i == 0) {
                try {
                    za0.m2831g(viewParentM2184e, viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM2184e + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f3979a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f3980b = null;
            }
        }
    }
}
