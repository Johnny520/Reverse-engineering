package defpackage;

import android.app.Dialog;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements sm {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.sm
    public final Object f(Object r5) {
        switch(this.a) {
            case 0: goto L24;
            case 1: goto L22;
            case 2: goto L19;
            default: goto L4;
        };
    L4:
        Dialog r0 = (Dialog) this.b;
        int r52 = ((Integer) r5).intValue();
        Window r02 = r0.getWindow();     // Catch: Throwable -> L16
        if (r02 == null) goto L18;
        WindowManager.LayoutParams r1 = r02.getAttributes();     // Catch: Throwable -> L16
        int r2 = (int) ((r52 / 100.0f) * 150);     // Catch: Throwable -> L16
        if (r2 >= 1) goto L10;
        r2 = 1;
    L10:
        p7.n(r1, r2);     // Catch: Throwable -> L16
        if (r52 != 0) goto L13;
        r02.clearFlags(4);     // Catch: Throwable -> L16
    L14:
        r02.setAttributes(r1);     // Catch: Throwable -> L16
        goto L18
    L13:
        r02.addFlags(4);     // Catch: Throwable -> L16
    L18:
        return vh.n;
    L16:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("G/D3921Ql7gX1+/2dm6CrA==\n", "SJWDgwQ+8Ms=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
        goto L18
    L19:
        TextView r03 = (TextView) this.b;
        String r53 = (String) r5;
        ip.o(u40.a("Xjm7mKqv7Xc=\n", "MFzMzsvDmBI=\n"), r53);
        r03.setText(r53);
    L21:
        return vh.n;
    L22:
        d9.b.post(new t5((o9) this.b, 1, (String) r5));
        goto L21
    L24:
        if (r5 != ((l) this.b)) goto L27;
        return "(this Collection)";
    L27:
        return String.valueOf(r5);
    }
}
