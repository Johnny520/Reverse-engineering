package defpackage;

import android.animation.Animator;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class l0 implements cv, iu, e5, nu, zc, bd, qw, j8, di, kt, jy, v0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ l0(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.cv
    public void a(ku r3, boolean r4) {
        if ((r3 instanceof c50) == false) goto L5;
        ((c50) r3).z.k().c(false);
    L5:
        cv r0 = ((j1) this.b).e;
        if (r0 == null) goto L9;
        r0.a(r3, r4);
        return;
    }

    @Override // defpackage.bd
    public ClipData b() {
        return p7.d((ContentInfo) this.b);
    }

    @Override // defpackage.zc
    public cd build() {
        return new cd(new l0(p7.g((ContentInfo.Builder) this.b)));
    }

    @Override // defpackage.v0
    public boolean c(View r5) {
        SwipeDismissBehavior r0 = (SwipeDismissBehavior) this.b;
        boolean r2 = false;
        if (r0.r(r5) == false) goto L16;
        WeakHashMap r1 = ja0.a;
        if (t90.d(r5) != 1) goto L7;
        r2 = true;
    L7:
        int r02 = r0.d;
        if (r02 != 0) goto L10;
        if (r2 == false) goto L10;
    L12:
        int r03 = -r5.getWidth();
    L14:
        r5.offsetLeftAndRight(r03);
        r5.setAlpha(0.0f);
        return true;
    L10:
        if (r02 != 1) goto L13;
        if (r2 == false) goto L12;
    L13:
        r03 = r5.getWidth();
        goto L14
    L16:
        return false;
    }

    @Override // defpackage.qw
    public wc0 d(View r6, wc0 r7) {
        tc0 r62 = r7.a;
        CoordinatorLayout r0 = (CoordinatorLayout) this.b;
        if (pw.a(r0.n, r7) == true) goto L28;
        r0.n = r7;
        int r2 = 0;
        boolean r3 = true;
        if (r7.d() <= 0) goto L7;
        boolean r1 = true;
    L8:
        r0.o = r1;
        if (r1 == false) goto L11;
    L13:
        r3 = false;
    L14:
        r0.setWillNotDraw(r3);
        if (r62.m() == true) goto L27;
        int r12 = r0.getChildCount();
    L18:
        if (r2 >= r12) goto L27;
        View r32 = r0.getChildAt(r2);
        WeakHashMap r4 = ja0.a;
        if (s90.b(r32) == false) goto L26;
        if (((zd) r32.getLayoutParams()).a == null) goto L26;
        if (r62.m() == true) goto L27;
    L26:
        r2 = r2 + 1;
    L27:
        r0.requestLayout();
        goto L28
    L11:
        if (r0.getBackground() != null) goto L13;
    L7:
        r1 = false;
    L28:
        return r7;
    }

    @Override // defpackage.di
    public void e(ip r9) {
        yb r7 = new yb("EmojiCompatInitializer");
        ThreadPoolExecutor r0 = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), r7);
        r0.allowCoreThreadTimeOut(true);
        r0.execute(new fi(this, r9, r0, 0));
    }

    @Override // defpackage.bd
    public int f() {
        return p7.b((ContentInfo) this.b);
    }

    @Override // defpackage.jy
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.bd
    public ContentInfo h() {
        return (ContentInfo) this.b;
    }

    @Override // defpackage.jy
    public void i(int r4, Object r5) {
        switch(r4) {
            case 1: goto L13;
            case 2: goto L12;
            case 3: goto L11;
            case 4: goto L10;
            case 5: goto L9;
            case 6: goto L8;
            case 7: goto L7;
            case 8: goto L6;
            case 9: goto L3;
            case 10: goto L5;
            case 11: goto L4;
            default: goto L3;
        };
    L3:
        String r0 = "";
    L15:
        if (r4 != 6) goto L17;
    L21:
        Log.e("ProfileInstaller", r0, (Throwable) r5);
    L22:
        ((ProfileInstallReceiver) this.b).setResultCode(r4);
        return;
    L17:
        if (r4 == 7) goto L21;
        if (r4 == 8) goto L21;
        Log.d("ProfileInstaller", r0);
        goto L22
    L4:
        r0 = "RESULT_DELETE_SKIP_FILE_SUCCESS";
        goto L15
    L5:
        r0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
        goto L15
    L6:
        r0 = "RESULT_PARSE_EXCEPTION";
        goto L15
    L7:
        r0 = "RESULT_IO_EXCEPTION";
        goto L15
    L8:
        r0 = "RESULT_BASELINE_PROFILE_NOT_FOUND";
        goto L15
    L9:
        r0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
        goto L15
    L10:
        r0 = "RESULT_NOT_WRITABLE";
        goto L15
    L11:
        r0 = "RESULT_UNSUPPORTED_ART_VERSION";
        goto L15
    L12:
        r0 = "RESULT_ALREADY_INSTALLED";
        goto L15
    L13:
        r0 = "RESULT_INSTALL_SUCCESS";
        goto L15
    }

    @Override // defpackage.iu
    public void k(ku r2) {
        d70 r0 = ((ActionMenuView) this.b).u;
        if (r0 == null) goto L6;
        r0.k(r2);
        return;
    }

    @Override // defpackage.zc
    public void m(Uri r2) {
        p7.k((ContentInfo.Builder) this.b, r2);
    }

    @Override // defpackage.iu
    public boolean n(ku r1, MenuItem r2) {
        m1 r12 = ((ActionMenuView) this.b).z;
        if (r12 == null) goto L9;
        Iterator r13 = ((CopyOnWriteArrayList) ((d70) r12).a.G.c).iterator();
        if (r13.hasNext() == true) goto L8;
        return false;
    L8:
        throw z30.h(r13);
    L9:
        return false;
    }

    @Override // defpackage.bd
    public int o() {
        return p7.s((ContentInfo) this.b);
    }

    @Override // defpackage.j8
    public void onCancel() {
        switch(this.a) {
            case 10: goto L6;
            default: goto L4;
        };
    L4:
        ((g40) this.b).a();
        return;
    L6:
        ((Animator) this.b).end();
    }

    @Override // defpackage.nu
    public void p(ku r1, MenuItem r2) {
        ((t8) this.b).f.removeCallbacksAndMessages(r1);
    }

    @Override // defpackage.cv
    public boolean q(ku r4) {
        j1 r0 = (j1) this.b;
        if (r4 != r0.c) goto L5;
        return false;
    L5:
        ((c50) r4).A.getClass();
        r0.getClass();
        cv r02 = r0.e;
        if (r02 != null) goto L8;
        return false;
    L8:
        return r02.q(r4);
    }

    @Override // defpackage.nu
    public void r(ku r8, ou r9) {
        t8 r0 = (t8) this.b;
        Handler r1 = r0.f;
        s8 r2 = null;
        r1.removeCallbacksAndMessages(null);
        ArrayList r02 = r0.h;
        int r3 = r02.size();
        int r4 = 0;
    L4:
        if (r4 >= r3) goto L9;
        if (r8 == ((s8) r02.get(r4)).b) goto L10;
        r4 = r4 + 1;
    L10:
        if (r4 != (-1)) goto L12;
        return;
    L12:
        int r42 = r4 + 1;
        if (r42 >= r02.size()) goto L15;
        r2 = (s8) r02.get(r42);
    L15:
        r1.postAtTime(new r8(this, r2, r9, r8), r8, SystemClock.uptimeMillis() + 200);
        return;
    L9:
        r4 = -1;
        goto L10
    }

    @Override // defpackage.zc
    public void s(int r2) {
        p7.j((ContentInfo.Builder) this.b, r2);
    }

    @Override // defpackage.zc
    public void setExtras(Bundle r2) {
        p7.l((ContentInfo.Builder) this.b, r2);
    }

    public j0 t(int r1) {
        return null;
    }

    public String toString() {
        switch(this.a) {
            case 8: goto L9;
            case 27: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "<" + ((String) this.b) + '>';
    L9:
        return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
    }

    public j0 u(int r1) {
        return null;
    }

    public void v() {
        ((nl) this.b).F.F();
    }

    public boolean w(int r1, int r2, Bundle r3) {
        return false;
    }

    public l0(TextView r2) {
        this.a = 14;
        this.b = new qi(r2);
    }

    public l0(EditText r3) {
        this.a = 13;
        this.b = new d4(r3, 8);
    }

    public l0(int r1) {
        this.a = r1;
        switch(r1) {
            case 28: goto L7;
            default: goto L4;
        };
    L4:
        this.b = new k0(this);
        return;
    }

    public l0(Context r2) {
        this.a = 12;
        this.b = r2.getApplicationContext();
    }

    public l0(ContentInfo r2) {
        this.a = 8;
        r2.getClass();
        this.b = p7.h(r2);
    }

    public l0(ClipData r2, int r3) {
        this.a = 7;
        this.b = p7.f(r2, r3);
    }

    public void j(int r1) {
    }

    public void l(int r1) {
    }
}
