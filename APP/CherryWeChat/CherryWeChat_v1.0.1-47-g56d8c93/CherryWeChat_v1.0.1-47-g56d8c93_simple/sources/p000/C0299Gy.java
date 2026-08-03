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
        int[] r0 = (int[]) this.f1012b;
        if (r0 == null) goto L5;
        Arrays.fill(r0, -1);
    L5:
        this.f1013c = null;
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: b */
    public void mo635b(Exception r5) {
        C0342Hy r0 = (C0342Hy) this.f1013c;
        C1108Zr r1 = (C1108Zr) this.f1012b;
        C1108Zr r02 = r0.f1154f;
        if (r02 == null) goto L7;
        if (r02 != r1) goto L8;
        C0342Hy r03 = (C0342Hy) this.f1013c;
        C1108Zr r12 = (C1108Zr) this.f1012b;
        RunnableC0320Hc r2 = r03.f1150b;
        C2455rc r04 = r03.f1155g;
        InterfaceC2541tc r13 = r12.f3503c;
        r2.mo670a(r04, r5, r13, r13.mo916f());
        return;
    L8:
        return;
    }

    @Override // p000.InterfaceC2500se
    /* JADX INFO: renamed from: c */
    public void mo636c(InterfaceC0565N5 r2, Bitmap r3) {
        IOException r0 = ((C2631vg) this.f1013c).f9141b;
        if (r0 == null) goto L7;
        if (r3 == null) goto L8;
        r2.mo53h(r3);
        throw r0;
    L8:
        throw r0;
    }

    /* JADX INFO: renamed from: d */
    public void m637d(int r5) {
        int[] r0 = (int[]) this.f1012b;
        if (r0 != null) goto L7;
        int[] r52 = new int[Math.max(r5, 10) + 1];
        this.f1012b = r52;
        Arrays.fill(r52, -1);
        return;
    L7:
        if (r5 < r0.length) goto L14;
        int r2 = r0.length;
    L9:
        if (r2 > r5) goto L11;
        r2 = r2 * 2;
        goto L9
    L11:
        int[] r53 = new int[r2];
        this.f1012b = r53;
        System.arraycopy(r0, 0, r53, 0, r0.length);
        int[] r54 = (int[]) this.f1012b;
        Arrays.fill(r54, r0.length, r54.length, -1);
        return;
    }

    @Override // p000.InterfaceC2498sc
    /* JADX INFO: renamed from: e */
    public void mo638e(Object r8) {
        C0342Hy r0 = (C0342Hy) this.f1013c;
        C1108Zr r1 = (C1108Zr) this.f1012b;
        C1108Zr r02 = r0.f1154f;
        if (r02 == null) goto L13;
        if (r02 != r1) goto L14;
        C0342Hy r03 = (C0342Hy) this.f1013c;
        C1108Zr r12 = (C1108Zr) this.f1012b;
        C0922Vd r2 = r03.f1149a.f748p;
        if (r8 != null) goto L8;
    L11:
        RunnableC0320Hc r13 = r03.f1150b;
        InterfaceC0802Sm r22 = r12.f3501a;
        InterfaceC2541tc r4 = r12.f3503c;
        r13.mo671b(r22, r8, r4, r4.mo916f(), r03.f1155g);
        return;
    L8:
        if (r2.m1782a(r12.f3503c.mo916f()) == false) goto L11;
        r03.f1153e = r8;
        r03.f1150b.m680k(2);
        return;
    L14:
        return;
    }

    @Override // p000.InterfaceC2500se
    /* JADX INFO: renamed from: f */
    public void mo639f() {
        C1340dv r0 = (C1340dv) this.f1012b;
        monitor-enter(r0);
        r0.f4827c = r0.f4825a.length;     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: g */
    public void m640g(int r4, int r5) {
        int[] r0 = (int[]) this.f1012b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r4 >= r0.length) goto L21;
        int r02 = r4 + r5;
        m637d(r02);
        int[] r1 = (int[]) this.f1012b;
        System.arraycopy(r1, r4, r1, r02, (r1.length - r4) - r5);
        Arrays.fill((int[]) this.f1012b, r4, r02, -1);
        ArrayList r03 = (ArrayList) this.f1013c;
        if (r03 == null) goto L22;
        int r04 = r03.size() - 1;
    L11:
        if (r04 < 0) goto L23;
        C0814Sy r12 = (C0814Sy) ((ArrayList) this.f1013c).get(r04);
        int r2 = r12.f2579a;
        if (r2 < r4) goto L16;
        r12.f2579a = r2 + r5;
    L16:
        r04 = r04 - 1;
        goto L11
    L23:
        return;
    L22:
        return;
    }

    /* JADX INFO: renamed from: h */
    public void m641h(int r6, int r7) {
        int[] r0 = (int[]) this.f1012b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r6 >= r0.length) goto L24;
        int r02 = r6 + r7;
        m637d(r02);
        int[] r1 = (int[]) this.f1012b;
        System.arraycopy(r1, r02, r1, r6, (r1.length - r6) - r7);
        int[] r12 = (int[]) this.f1012b;
        Arrays.fill(r12, r12.length - r7, r12.length, -1);
        ArrayList r13 = (ArrayList) this.f1013c;
        if (r13 == null) goto L25;
        int r14 = r13.size() - 1;
    L11:
        if (r14 < 0) goto L26;
        C0814Sy r2 = (C0814Sy) ((ArrayList) this.f1013c).get(r14);
        int r3 = r2.f2579a;
        if (r3 < r6) goto L18;
        if (r3 >= r02) goto L17;
        ((ArrayList) this.f1013c).remove(r14);
        goto L18
    L17:
        r2.f2579a = r3 - r7;
    L18:
        r14 = r14 - 1;
        goto L11
    L26:
        return;
    L25:
        return;
    }

    @Override // p000.InterfaceC1470gt
    public C0489LF onApplyWindowInsets(View r20, C0489LF r21) {
        switch(this.f1011a) {
            case 4: goto L49;
            default: goto L4;
        };
    L4:
        C1037Y5 r3 = (C1037Y5) this.f1012b;
        C1512hr r4 = (C1512hr) this.f1013c;
        int r5 = r4.f5354a;
        int r6 = r4.f5355b;
        int r42 = r4.f5356c;
        C0317HF r7 = r21.f1602a;
        C2765yl r8 = r7.mo14g(519);
        C2765yl r72 = r7.mo14g(32);
        BottomSheetBehavior r9 = (BottomSheetBehavior) r3.f3311b;
        int r10 = r8.f9406b;
        int r11 = r8.f9407c;
        int r12 = r8.f9405a;
        r9.f4463w = r10;
        if (r20.getLayoutDirection() != 1) goto L7;
        boolean r102 = true;
    L8:
        int r15 = r20.getPaddingBottom();
        int r16 = r20.getPaddingLeft();
        int r17 = r20.getPaddingRight();
        boolean r13 = r9.f4455o;
        if (r13 == false) goto L12;
        int r152 = r21.m940a();
        r9.f4462v = r152;
        r15 = r152 + r42;
    L12:
        if (r9.f4456p == false) goto L17;
        if (r102 == false) goto L15;
        int r43 = r6;
    L16:
        r16 = r43 + r12;
        goto L17
    L15:
        r43 = r5;
    L17:
        int r44 = r16;
        if (r9.f4457q == false) goto L23;
        if (r102 == true) goto L22;
        r5 = r6;
    L22:
        r17 = r5 + r11;
    L23:
        int r52 = r17;
        ViewGroup.MarginLayoutParams r62 = (ViewGroup.MarginLayoutParams) r20.getLayoutParams();
        if (r9.f4459s == true) goto L26;
    L28:
        boolean r18 = false;
    L30:
        if (r9.f4460t == false) goto L35;
        if (r62.rightMargin == r11) goto L35;
        r62.rightMargin = r11;
        r18 = true;
    L35:
        if (r9.f4461u == false) goto L39;
        int r103 = r62.topMargin;
        int r82 = r8.f9406b;
        if (r103 == r82) goto L39;
        r62.topMargin = r82;
        boolean r14 = true;
    L40:
        if (r14 == false) goto L42;
        r20.setLayoutParams(r62);
    L42:
        r20.setPadding(r44, r20.getPaddingTop(), r52, r15);
        boolean r1 = r3.f3310a;
        if (r1 == false) goto L45;
        r9.f4453m = r72.f9408d;
    L45:
        if (r13 == true) goto L47;
        if (r1 == true) goto L47;
    L48:
        return r21;
    L47:
        r9.m2437I();
    L39:
        r14 = r18;
        goto L40
    L26:
        if (r62.leftMargin == r12) goto L28;
        r62.leftMargin = r12;
        r18 = true;
        goto L30
    L7:
        r102 = false;
        goto L8
    L49:
        C0230FE r32 = (C0230FE) this.f1013c;
        C0489LF r19 = AbstractC2185lE.m4394g(r20, r21);
        if (r19.f1602a.mo94n() == true) goto L58;
        Rect r2 = (Rect) this.f1012b;
        r2.left = r19.m941b();
        r2.top = r19.m943d();
        r2.right = r19.m942c();
        r2.bottom = r19.m940a();
        int r45 = r32.getChildCount();
        int r53 = 0;
    L53:
        if (r53 >= r45) goto L56;
        C0489LF r63 = AbstractC2185lE.m4389b(r32.getChildAt(r53), r19);
        r2.left = Math.min(r63.m941b(), r2.left);
        r2.top = Math.min(r63.m943d(), r2.top);
        r2.right = Math.min(r63.m942c(), r2.right);
        r2.bottom = Math.min(r63.m940a(), r2.bottom);
        r53 = r53 + 1;
        goto L53
    L56:
        return r19.m944f(r2.left, r2.top, r2.right, r2.bottom);
    L58:
        return r19;
    }

    public String toString() {
        switch(this.f1011a) {
            case 6: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "Bounds{lower=" + ((C2765yl) this.f1012b) + " upper=" + ((C2765yl) this.f1013c) + "}";
    }

    public /* synthetic */ C0299Gy(int r1, Object r2, Object r3) {
        this.f1011a = r1;
        this.f1012b = r2;
        this.f1013c = r3;
    }

    public C0299Gy(C0342Hy r2, C1108Zr r3) {
        this.f1011a = 0;
        this.f1013c = r2;
        this.f1012b = r3;
    }

    public C0299Gy(C0230FE r2) {
        this.f1011a = 4;
        this.f1013c = r2;
        this.f1012b = new Rect();
    }
}
