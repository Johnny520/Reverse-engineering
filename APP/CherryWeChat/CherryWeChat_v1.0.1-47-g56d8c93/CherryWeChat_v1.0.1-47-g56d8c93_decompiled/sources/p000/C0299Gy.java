package p000;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: Gy */
/* JADX INFO: loaded from: classes.dex */
public final class C0299Gy implements InterfaceC2498sc, InterfaceC2500se, InterfaceC0418Jo, InterfaceC1470gt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1011a;

    /* JADX INFO: renamed from: b */
    public Object f1012b;

    /* JADX INFO: renamed from: c */
    public Object f1013c;

    public /* synthetic */ C0299Gy() {
        this.f1011a = 1;
    }

    /* JADX INFO: renamed from: a */
    public void m634a() {
        int[] iArr = (int[]) this.f1012b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f1013c = null;
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: b */
    public void mo635b(Exception exc) {
        C0342Hy c0342Hy = (C0342Hy) this.f1013c;
        C1108Zr c1108Zr = (C1108Zr) this.f1012b;
        C1108Zr c1108Zr2 = c0342Hy.f1154f;
        if (c1108Zr2 == null || c1108Zr2 != c1108Zr) {
            return;
        }
        C0342Hy c0342Hy2 = (C0342Hy) this.f1013c;
        C1108Zr c1108Zr3 = (C1108Zr) this.f1012b;
        RunnableC0320Hc runnableC0320Hc = c0342Hy2.f1150b;
        C2455rc c2455rc = c0342Hy2.f1155g;
        InterfaceC2541tc interfaceC2541tc = c1108Zr3.f3503c;
        runnableC0320Hc.mo670a(c2455rc, exc, interfaceC2541tc, interfaceC2541tc.mo916f());
    }

    @Override // p000.InterfaceC2500se
    /* JADX INFO: renamed from: c */
    public void mo636c(InterfaceC0565N5 interfaceC0565N5, Bitmap bitmap) throws IOException {
        IOException iOException = ((C2631vg) this.f1013c).f9141b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC0565N5.mo53h(bitmap);
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m637d(int i) {
        int[] iArr = (int[]) this.f1012b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f1012b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f1012b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f1012b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: e */
    public void mo638e(Object obj) {
        C0342Hy c0342Hy = (C0342Hy) this.f1013c;
        C1108Zr c1108Zr = (C1108Zr) this.f1012b;
        C1108Zr c1108Zr2 = c0342Hy.f1154f;
        if (c1108Zr2 == null || c1108Zr2 != c1108Zr) {
            return;
        }
        C0342Hy c0342Hy2 = (C0342Hy) this.f1013c;
        C1108Zr c1108Zr3 = (C1108Zr) this.f1012b;
        C0922Vd c0922Vd = c0342Hy2.f1149a.f748p;
        if (obj != null && c0922Vd.m1782a(c1108Zr3.f3503c.mo916f())) {
            c0342Hy2.f1153e = obj;
            c0342Hy2.f1150b.m680k(2);
        } else {
            RunnableC0320Hc runnableC0320Hc = c0342Hy2.f1150b;
            InterfaceC0802Sm interfaceC0802Sm = c1108Zr3.f3501a;
            InterfaceC2541tc interfaceC2541tc = c1108Zr3.f3503c;
            runnableC0320Hc.mo671b(interfaceC0802Sm, obj, interfaceC2541tc, interfaceC2541tc.mo916f(), c0342Hy2.f1155g);
        }
    }

    @Override // p000.InterfaceC2500se
    /* JADX INFO: renamed from: f */
    public void mo639f() {
        C1340dv c1340dv = (C1340dv) this.f1012b;
        synchronized (c1340dv) {
            c1340dv.f4827c = c1340dv.f4825a.length;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m640g(int i, int i2) {
        int[] iArr = (int[]) this.f1012b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m637d(i3);
        int[] iArr2 = (int[]) this.f1012b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f1012b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f1013c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0814Sy c0814Sy = (C0814Sy) ((ArrayList) this.f1013c).get(size);
            int i4 = c0814Sy.f2579a;
            if (i4 >= i) {
                c0814Sy.f2579a = i4 + i2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m641h(int i, int i2) {
        int[] iArr = (int[]) this.f1012b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m637d(i3);
        int[] iArr2 = (int[]) this.f1012b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f1012b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f1013c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0814Sy c0814Sy = (C0814Sy) ((ArrayList) this.f1013c).get(size);
            int i4 = c0814Sy.f2579a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f1013c).remove(size);
                } else {
                    c0814Sy.f2579a = i4 - i2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    @Override // p000.InterfaceC1470gt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0489LF onApplyWindowInsets(View view, C0489LF c0489lf) {
        boolean z;
        boolean z2;
        switch (this.f1011a) {
            case 4:
                C0230FE c0230fe = (C0230FE) this.f1013c;
                C0489LF c0489lfM4394g = AbstractC2185lE.m4394g(view, c0489lf);
                if (c0489lfM4394g.f1602a.mo94n()) {
                    return c0489lfM4394g;
                }
                Rect rect = (Rect) this.f1012b;
                rect.left = c0489lfM4394g.m941b();
                rect.top = c0489lfM4394g.m943d();
                rect.right = c0489lfM4394g.m942c();
                rect.bottom = c0489lfM4394g.m940a();
                int childCount = c0230fe.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0489LF c0489lfM4389b = AbstractC2185lE.m4389b(c0230fe.getChildAt(i), c0489lfM4394g);
                    rect.left = Math.min(c0489lfM4389b.m941b(), rect.left);
                    rect.top = Math.min(c0489lfM4389b.m943d(), rect.top);
                    rect.right = Math.min(c0489lfM4389b.m942c(), rect.right);
                    rect.bottom = Math.min(c0489lfM4389b.m940a(), rect.bottom);
                }
                return c0489lfM4394g.m944f(rect.left, rect.top, rect.right, rect.bottom);
            default:
                C1037Y5 c1037y5 = (C1037Y5) this.f1012b;
                C1512hr c1512hr = (C1512hr) this.f1013c;
                int i2 = c1512hr.f5354a;
                int i3 = c1512hr.f5355b;
                int i4 = c1512hr.f5356c;
                C0317HF c0317hf = c0489lf.f1602a;
                C2765yl c2765ylMo14g = c0317hf.mo14g(519);
                C2765yl c2765ylMo14g2 = c0317hf.mo14g(32);
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c1037y5.f3311b;
                int i5 = c2765ylMo14g.f9406b;
                int i6 = c2765ylMo14g.f9407c;
                int i7 = c2765ylMo14g.f9405a;
                bottomSheetBehavior.f4463w = i5;
                boolean z3 = view.getLayoutDirection() == 1;
                int paddingBottom = view.getPaddingBottom();
                int paddingLeft = view.getPaddingLeft();
                int paddingRight = view.getPaddingRight();
                boolean z4 = bottomSheetBehavior.f4455o;
                if (z4) {
                    int iM940a = c0489lf.m940a();
                    bottomSheetBehavior.f4462v = iM940a;
                    paddingBottom = iM940a + i4;
                }
                if (bottomSheetBehavior.f4456p) {
                    paddingLeft = (z3 ? i3 : i2) + i7;
                }
                int i8 = paddingLeft;
                if (bottomSheetBehavior.f4457q) {
                    if (!z3) {
                        i2 = i3;
                    }
                    paddingRight = i2 + i6;
                }
                int i9 = paddingRight;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                if (!bottomSheetBehavior.f4459s || marginLayoutParams.leftMargin == i7) {
                    z = false;
                } else {
                    marginLayoutParams.leftMargin = i7;
                    z = true;
                }
                if (bottomSheetBehavior.f4460t && marginLayoutParams.rightMargin != i6) {
                    marginLayoutParams.rightMargin = i6;
                    z = true;
                }
                if (bottomSheetBehavior.f4461u) {
                    int i10 = marginLayoutParams.topMargin;
                    int i11 = c2765ylMo14g.f9406b;
                    if (i10 != i11) {
                        marginLayoutParams.topMargin = i11;
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                }
                if (z2) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(i8, view.getPaddingTop(), i9, paddingBottom);
                boolean z5 = c1037y5.f3310a;
                if (z5) {
                    bottomSheetBehavior.f4453m = c2765ylMo14g2.f9408d;
                }
                if (z4 || z5) {
                    bottomSheetBehavior.m2437I();
                }
                return c0489lf;
        }
    }

    public String toString() {
        switch (this.f1011a) {
            case 6:
                return "Bounds{lower=" + ((C2765yl) this.f1012b) + " upper=" + ((C2765yl) this.f1013c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0299Gy(int i, Object obj, Object obj2) {
        this.f1011a = i;
        this.f1012b = obj;
        this.f1013c = obj2;
    }

    public C0299Gy(C0342Hy c0342Hy, C1108Zr c1108Zr) {
        this.f1011a = 0;
        this.f1013c = c0342Hy;
        this.f1012b = c1108Zr;
    }

    public C0299Gy(C0230FE c0230fe) {
        this.f1011a = 4;
        this.f1013c = c0230fe;
        this.f1012b = new Rect();
    }
}
