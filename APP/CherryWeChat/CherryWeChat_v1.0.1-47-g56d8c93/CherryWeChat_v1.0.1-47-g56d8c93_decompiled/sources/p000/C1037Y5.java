package p000;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Serializable;

/* JADX INFO: renamed from: Y5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1037Y5 implements InterfaceC0120Cr {

    /* JADX INFO: renamed from: a */
    public boolean f3310a;

    /* JADX INFO: renamed from: b */
    public final Object f3311b;

    public /* synthetic */ C1037Y5(Object obj) {
        this.f3311b = obj;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1984a() {
        return this.f3310a;
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: b */
    public void mo193b(MenuC2204lr menuC2204lr, boolean z) {
        C0130D0 c0130d0;
        C2577uB c2577uB = (C2577uB) this.f3311b;
        if (this.f3310a) {
            return;
        }
        this.f3310a = true;
        ActionMenuView actionMenuView = c2577uB.f8929a.f9213a.f3823a;
        if (actionMenuView != null && (c0130d0 = actionMenuView.f3781t) != null) {
            c0130d0.m214c();
            C2781z0 c2781z0 = c0130d0.f321t;
            if (c2781z0 != null && c2781z0.m5291b()) {
                c2781z0.f9323i.dismiss();
            }
        }
        c2577uB.f8930b.onPanelClosed(108, menuC2204lr);
        this.f3310a = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m1985c(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        C1456gf c1456gf = (C1456gf) this.f3311b;
        if (c1456gf == null) {
            return m1984a();
        }
        c1456gf.getClass();
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            C1037Y5 c1037y5 = AbstractC2447rA.f8572a;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        c = 0;
                        break;
                    default:
                        c = 2;
                        continue;
                }
            } else {
                c = 0;
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return m1984a();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m1986d(InterfaceC2389pw interfaceC2389pw, boolean z) {
        try {
            if (this.f3310a || z) {
                ((Handler) this.f3311b).obtainMessage(1, interfaceC2389pw).sendToTarget();
            } else {
                this.f3310a = true;
                interfaceC2389pw.mo118e();
                this.f3310a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: s */
    public boolean mo194s(MenuC2204lr menuC2204lr) {
        ((C2577uB) this.f3311b).f8930b.onMenuOpened(108, menuC2204lr);
        return true;
    }

    public /* synthetic */ C1037Y5(boolean z, Serializable serializable) {
        this.f3310a = z;
        this.f3311b = serializable;
    }

    public C1037Y5() {
        this.f3311b = new Handler(Looper.getMainLooper(), new C2786z5(1));
    }

    public C1037Y5(C1456gf c1456gf, boolean z) {
        this(c1456gf);
        this.f3310a = z;
    }

    public C1037Y5(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f3311b = bottomSheetBehavior;
        this.f3310a = z;
    }
}
