package Yue;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: Yue.ۥۡۢۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6366 {

    /* JADX INFO: renamed from: ۥ */
    public ViewParent f2041;

    /* JADX INFO: renamed from: ۥ۟ */
    public ViewParent f2042;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final View f16127;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f16128;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int[] f16129;

    public C6366(@InterfaceC6391 View view) {
        this.f16127 = view;
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m2823(float f, float f2, boolean z) {
        ViewParent viewParentM19876;
        if (!m19880() || (viewParentM19876 = m19876(0)) == null) {
            return false;
        }
        return C8355.m27836(viewParentM19876, this.f16127, f, f2, z);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m2824(float f, float f2) {
        ViewParent viewParentM19876;
        if (!m19880() || (viewParentM19876 = m19876(0)) == null) {
            return false;
        }
        return C8355.m27837(viewParentM19876, this.f16127, f, f2);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m19870(int i, int i2, @InterfaceC6490 int[] iArr, @InterfaceC6490 int[] iArr2) {
        return m19871(i, i2, iArr, iArr2, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m19871(int i, int i2, @InterfaceC6490 int[] iArr, @InterfaceC6490 int[] iArr2, int i3) {
        ViewParent viewParentM19876;
        int i4;
        int i5;
        if (!m19880() || (viewParentM19876 = m19876(i3)) == null) {
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
        if (iArr2 != null) {
            this.f16127.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = m19877();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C8355.m27839(viewParentM19876, this.f16127, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f16127.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m19872(int i, int i2, int i3, int i4, @InterfaceC6490 int[] iArr, int i5, @InterfaceC6490 int[] iArr2) {
        m19875(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m19873(int i, int i2, int i3, int i4, @InterfaceC6490 int[] iArr) {
        return m19875(i, i2, i3, i4, iArr, 0, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m19874(int i, int i2, int i3, int i4, @InterfaceC6490 int[] iArr, int i5) {
        return m19875(i, i2, i3, i4, iArr, i5, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m19875(int i, int i2, int i3, int i4, @InterfaceC6490 int[] iArr, int i5, @InterfaceC6490 int[] iArr2) {
        ViewParent viewParentM19876;
        int i6;
        int i7;
        int[] iArr3;
        if (!m19880() || (viewParentM19876 = m19876(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f16127.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] iArrM19877 = m19877();
            iArrM19877[0] = 0;
            iArrM19877[1] = 0;
            iArr3 = iArrM19877;
        } else {
            iArr3 = iArr2;
        }
        C8355.m27842(viewParentM19876, this.f16127, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f16127.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final ViewParent m19876(int i) {
        if (i == 0) {
            return this.f2041;
        }
        if (i != 1) {
            return null;
        }
        return this.f2042;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final int[] m19877() {
        if (this.f16129 == null) {
            this.f16129 = new int[2];
        }
        return this.f16129;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m19878() {
        return m19879(0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m19879(int i) {
        return m19876(i) != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m19880() {
        return this.f16128;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m19881() {
        C8273.m27499(this.f16127);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m19882(@InterfaceC6391 View view) {
        C8273.m27499(this.f16127);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m19883(boolean z) {
        if (this.f16128) {
            C8273.m27499(this.f16127);
        }
        this.f16128 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m19884(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f2041 = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.f2042 = viewParent;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m19885(int i) {
        return m19886(i, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m19886(int i, int i2) {
        if (m19879(i2)) {
            return true;
        }
        if (!m19880()) {
            return false;
        }
        View view = this.f16127;
        for (ViewParent parent = this.f16127.getParent(); parent != null; parent = parent.getParent()) {
            if (C8355.m27846(parent, view, this.f16127, i, i2)) {
                m19884(i2, parent);
                C8355.m27844(parent, view, this.f16127, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m19887() {
        m19888(0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m19888(int i) {
        ViewParent viewParentM19876 = m19876(i);
        if (viewParentM19876 != null) {
            C8355.m27848(viewParentM19876, this.f16127, i);
            m19884(i, null);
        }
    }
}
