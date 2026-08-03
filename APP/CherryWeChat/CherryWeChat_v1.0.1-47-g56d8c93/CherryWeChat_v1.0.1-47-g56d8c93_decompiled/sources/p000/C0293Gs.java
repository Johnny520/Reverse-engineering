package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;

/* JADX INFO: renamed from: Gs */
/* JADX INFO: loaded from: classes.dex */
public final class C0293Gs {

    /* JADX INFO: renamed from: a */
    public ViewParent f989a;

    /* JADX INFO: renamed from: b */
    public ViewParent f990b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f991c;

    /* JADX INFO: renamed from: d */
    public boolean f992d;

    /* JADX INFO: renamed from: e */
    public int[] f993e;

    public C0293Gs(ViewGroup viewGroup) {
        this.f991c = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m592a(float f, float f2, boolean z) {
        ViewParent viewParentM596e;
        if (this.f992d && (viewParentM596e = m596e(0)) != null) {
            try {
                return viewParentM596e.onNestedFling(this.f991c, f, f2, z);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentM596e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m593b(float f, float f2) {
        ViewParent viewParentM596e;
        if (this.f992d && (viewParentM596e = m596e(0)) != null) {
            try {
                return viewParentM596e.onNestedPreFling(this.f991c, f, f2);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentM596e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m594c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM596e;
        int i4;
        int i5;
        if (!this.f992d || (viewParentM596e = m596e(i3)) == null) {
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
        ViewGroup viewGroup = this.f991c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f993e == null) {
                this.f993e = new int[2];
            }
            iArr = this.f993e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM596e instanceof InterfaceC0336Hs) {
            ((InterfaceC0336Hs) viewParentM596e).mo722c(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                viewParentM596e.onNestedPreScroll(viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentM596e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m595d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM596e;
        int i6;
        int i7;
        int[] iArr3;
        ViewGroup viewGroup;
        if (this.f992d && (viewParentM596e = m596e(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup2 = this.f991c;
                if (iArr != null) {
                    viewGroup2.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f993e == null) {
                        this.f993e = new int[2];
                    }
                    int[] iArr4 = this.f993e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM596e instanceof InterfaceC0379Is) {
                    InterfaceC0379Is interfaceC0379Is = (InterfaceC0379Is) viewParentM596e;
                    viewGroup = viewGroup2;
                    interfaceC0379Is.mo820d(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (!(viewParentM596e instanceof InterfaceC0336Hs)) {
                        if (i5 == 0) {
                            try {
                                viewParentM596e.onNestedScroll(viewGroup2, i, i2, i3, i4);
                            } catch (AbstractMethodError unused) {
                                Objects.toString(viewParentM596e);
                            }
                        }
                        if (iArr != null) {
                            viewGroup2.getLocationInWindow(iArr);
                            iArr[0] = iArr[0] - i6;
                            iArr[1] = iArr[1] - i7;
                        }
                        return true;
                    }
                    InterfaceC0336Hs interfaceC0336Hs = (InterfaceC0336Hs) viewParentM596e;
                    viewGroup = viewGroup2;
                    interfaceC0336Hs.mo723e(viewGroup, i, i2, i3, i4, i5);
                }
                viewGroup2 = viewGroup;
                if (iArr != null) {
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
    public final ViewParent m596e(int i) {
        if (i == 0) {
            return this.f989a;
        }
        if (i != 1) {
            return null;
        }
        return this.f990b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m597f(int i) {
        return m596e(i) != null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m598g(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (!m597f(i2)) {
            if (this.f992d) {
                View view = this.f991c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC0336Hs;
                    if (z) {
                        zOnStartNestedScroll = ((InterfaceC0336Hs) parent).mo724f(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i2 == 0) {
                            this.f989a = parent;
                        } else if (i2 == 1) {
                            this.f990b = parent;
                        }
                        if (z) {
                            ((InterfaceC0336Hs) parent).mo720a(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError unused2) {
                                Objects.toString(parent);
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

    /* JADX INFO: renamed from: h */
    public final void m599h(int i) {
        ViewParent viewParentM596e = m596e(i);
        if (viewParentM596e != null) {
            boolean z = viewParentM596e instanceof InterfaceC0336Hs;
            ViewGroup viewGroup = this.f991c;
            if (z) {
                ((InterfaceC0336Hs) viewParentM596e).mo721b(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentM596e.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentM596e);
                }
            }
            if (i == 0) {
                this.f989a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f990b = null;
            }
        }
    }
}
