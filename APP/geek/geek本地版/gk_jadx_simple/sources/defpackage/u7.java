package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u7 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Runnable d;
    public final /* synthetic */ wd e;

    public u7(SideSheetBehavior r2) {
        this.a = 1;
        this.e = r2;
        this.d = new p1(12, this);
    }

    public final void a(int r5) {
        int r0 = this.a;
        Runnable r2 = this.d;
        wd r3 = this.e;
        switch(r0) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r32 = (SideSheetBehavior) r3;
        WeakReference r02 = r32.p;
        if (r02 != null) goto L7;
        return;
    L7:
        if (r02.get() == null) goto L24;
        this.b = r5;
        if (this.c == true) goto L23;
        WeakHashMap r03 = ja0.a;
        s90.m((View) r32.p.get(), (p1) r2);
        this.c = true;
        return;
    L23:
        return;
    L24:
        return;
    L13:
        BottomSheetBehavior r33 = (BottomSheetBehavior) r3;
        WeakReference r04 = r33.U;
        if (r04 != null) goto L16;
        return;
    L16:
        if (r04.get() == null) goto L27;
        this.b = r5;
        if (this.c == true) goto L26;
        WeakHashMap r05 = ja0.a;
        s90.m((View) r33.U.get(), (y6) r2);
        this.c = true;
        return;
    L26:
        return;
    }

    public u7(BottomSheetBehavior r2) {
        this.a = 0;
        this.e = r2;
        this.d = new y6(1, this);
    }
}
