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

    public /* synthetic */ C1037Y5(Object r1) {
        this.f3311b = r1;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1984a() {
        return this.f3310a;
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: b */
    public void mo193b(MenuC2204lr r3, boolean r4) {
        C2577uB r42 = (C2577uB) this.f3311b;
        if (this.f3310a == false) goto L5;
        return;
    L5:
        this.f3310a = true;
        ActionMenuView r0 = r42.f8929a.f9213a.f3823a;
        if (r0 == null) goto L14;
        C0130D0 r02 = r0.f3781t;
        if (r02 == null) goto L14;
        r02.m214c();
        C2781z0 r03 = r02.f321t;
        if (r03 == null) goto L14;
        if (r03.m5291b() == false) goto L14;
        r03.f9323i.dismiss();
    L14:
        r42.f8930b.onPanelClosed(108, r3);
        this.f3310a = false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m1985c(CharSequence r7, int r8) {
        if (r7 == null) goto L30;
        if (r8 < 0) goto L30;
        if ((r7.length() - r8) < 0) goto L30;
        C1456gf r0 = (C1456gf) this.f3311b;
        if (r0 == null) goto L9;
        r0.getClass();
        int r2 = 0;
        char r3 = 2;
    L12:
        if (r2 >= r8) goto L23;
        if (r3 != 2) goto L23;
        byte r32 = Character.getDirectionality(r7.charAt(r2));
        C1037Y5 r5 = AbstractC2447rA.f8572a;
        if (r32 == 0) goto L21;
        if (r32 == 1) goto L20;
        if (r32 == 2) goto L36;
        switch(r32) {
            case 14: goto L21;
            case 15: goto L21;
            case 16: goto L37;
            case 17: goto L37;
            default: goto L19;
        };
    L19:
        r3 = 2;
    L22:
        r2 = r2 + 1;
        goto L12
    L37:
        r3 = 0;
        goto L22
    L36:
        r3 = 0;
        goto L22
    L20:
        r3 = 0;
    L21:
        r3 = 1;
    L23:
        if (r3 == 0) goto L28;
        if (r3 != 1) goto L26;
        return false;
    L26:
        return m1984a();
    L28:
        return true;
    L9:
        return m1984a();
    L30:
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m1986d(InterfaceC2389pw r3, boolean r4) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.f3310a == true) goto L10;
        if (r4 == true) goto L10;
        this.f3310a = true;     // Catch: Throwable -> L8
        r3.mo118e();     // Catch: Throwable -> L8
        this.f3310a = false;     // Catch: Throwable -> L8
    L11:
        monitor-exit(this);
        return;
    L10:
        ((Handler) this.f3311b).obtainMessage(1, r3).sendToTarget();     // Catch: Throwable -> L8
        goto L11
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: s */
    public boolean mo194s(MenuC2204lr r3) {
        ((C2577uB) this.f3311b).f8930b.onMenuOpened(108, r3);
        return true;
    }

    public /* synthetic */ C1037Y5(boolean r1, Serializable r2) {
        this.f3310a = r1;
        this.f3311b = r2;
    }

    public C1037Y5() {
        this.f3311b = new Handler(Looper.getMainLooper(), new C2786z5(1));
    }

    public C1037Y5(C1456gf r1, boolean r2) {
        this(r1);
        this.f3310a = r2;
    }

    public C1037Y5(BottomSheetBehavior r1, boolean r2) {
        this.f3311b = r1;
        this.f3310a = r2;
    }
}
