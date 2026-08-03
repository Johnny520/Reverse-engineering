package p006D;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;

/* JADX INFO: renamed from: D.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0113m {

    /* JADX INFO: renamed from: a */
    public ViewParent f295a;

    /* JADX INFO: renamed from: b */
    public ViewParent f296b;

    /* JADX INFO: renamed from: c */
    public final View f297c;

    /* JADX INFO: renamed from: d */
    public boolean f298d;

    /* JADX INFO: renamed from: e */
    public int[] f299e;

    public C0113m(View view) {
        this.f297c = view;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m409a(float f2, float f3, boolean z2) {
        ViewParent viewParentM414f;
        if (!this.f298d || (viewParentM414f = m414f(0)) == null) {
            return false;
        }
        try {
            return AbstractC0084V.m299a(viewParentM414f, this.f297c, f2, f3, z2);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParentM414f);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m410b(float f2, float f3) {
        ViewParent viewParentM414f;
        if (!this.f298d || (viewParentM414f = m414f(0)) == null) {
            return false;
        }
        try {
            return AbstractC0084V.m300b(viewParentM414f, this.f297c, f2, f3);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParentM414f);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m411c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent viewParentM414f;
        int i5;
        int i6;
        int[] iArr3;
        if (!this.f298d || (viewParentM414f = m414f(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f297c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (this.f299e == null) {
                this.f299e = new int[2];
            }
            iArr3 = this.f299e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z2 = viewParentM414f instanceof InterfaceC0115n;
        View view2 = this.f297c;
        if (z2) {
            ((InterfaceC0115n) viewParentM414f).mo424e(view2, i2, i3, iArr3, i4);
        } else if (i4 == 0) {
            try {
                AbstractC0084V.m301c(viewParentM414f, view2, i2, i3, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentM414f);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final void m412d(int i2, int i3, int i4, int[] iArr) {
        m413e(0, i2, 0, i3, null, i4, iArr);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m413e(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent viewParentM414f;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.f298d || (viewParentM414f = m414f(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f297c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            if (this.f299e == null) {
                this.f299e = new int[2];
            }
            int[] iArr4 = this.f299e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        boolean z2 = viewParentM414f instanceof InterfaceC0117o;
        View view2 = this.f297c;
        if (z2) {
            ((InterfaceC0117o) viewParentM414f).mo426b(view2, i2, i3, i4, i5, i6, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i4;
            iArr3[1] = iArr3[1] + i5;
            if (viewParentM414f instanceof InterfaceC0115n) {
                ((InterfaceC0115n) viewParentM414f).mo422c(view2, i2, i3, i4, i5, i6);
            } else if (i6 == 0) {
                try {
                    AbstractC0084V.m302d(viewParentM414f, view2, i2, i3, i4, i5);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentM414f);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final ViewParent m414f(int i2) {
        if (i2 == 0) {
            return this.f295a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f296b;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m415g(int i2) {
        return m414f(i2) != null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m416h(int i2, int i3) {
        boolean zM304f;
        if (m415g(i3)) {
            return true;
        }
        if (this.f298d) {
            View view = this.f297c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof InterfaceC0115n;
                if (z2) {
                    zM304f = ((InterfaceC0115n) parent).mo425f(view2, view, i2, i3);
                } else if (i3 == 0) {
                    try {
                        zM304f = AbstractC0084V.m304f(parent, view2, view, i2);
                    } catch (AbstractMethodError unused) {
                        Objects.toString(parent);
                        zM304f = false;
                    }
                } else {
                    zM304f = false;
                }
                if (zM304f) {
                    if (i3 == 0) {
                        this.f295a = parent;
                    } else if (i3 == 1) {
                        this.f296b = parent;
                    }
                    if (z2) {
                        ((InterfaceC0115n) parent).mo421a(view2, view, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            AbstractC0084V.m303e(parent, view2, view, i2);
                        } catch (AbstractMethodError unused2) {
                            Objects.toString(parent);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m417i(int i2) {
        ViewParent viewParentM414f = m414f(i2);
        if (viewParentM414f != null) {
            boolean z2 = viewParentM414f instanceof InterfaceC0115n;
            View view = this.f297c;
            if (z2) {
                ((InterfaceC0115n) viewParentM414f).mo423d(view, i2);
            } else if (i2 == 0) {
                try {
                    AbstractC0084V.m305g(viewParentM414f, view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentM414f);
                }
            }
            if (i2 == 0) {
                this.f295a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f296b = null;
            }
        }
    }
}
