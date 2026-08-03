package p000;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: w2 */
/* JADX INFO: loaded from: classes.dex */
public class C2654w2 {

    /* JADX INFO: renamed from: a */
    public final C2482s2 f9188a;

    /* JADX INFO: renamed from: b */
    public final int f9189b;

    public C2654w2(Context r2) {
        this(r2, DialogInterfaceC2697x2.m5271e(r2, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public DialogInterfaceC2697x2 create() {
        C2482s2 r1 = this.f9188a;
        DialogInterfaceC2697x2 r0 = new DialogInterfaceC2697x2(r1.f8718a, this.f9189b);
        View r2 = r1.f8722e;
        C2611v2 r3 = r0.f9274f;
        if (r2 == null) goto L5;
        r3.f9054v = r2;
    L15:
        CharSequence r22 = r1.f8723f;
        if (r22 == null) goto L19;
        r3.m5121c(-1, r22, r1.f8724g);
    L19:
        CharSequence r23 = r1.f8725h;
        if (r23 == null) goto L24;
        r3.m5121c(-2, r23, r1.f8726i);
    L24:
        if (r1.f8728k == null) goto L40;
        AlertController$RecycleListView r24 = (AlertController$RecycleListView) r1.f8719b.inflate(r3.f9058z, null);
        if (r1.f8731n == false) goto L28;
        int r7 = r3.f9028A;
    L29:
        Object r8 = r1.f8728k;
        ?? r82 = r8;
        if (r8 != null) goto L33;
        r82 = new C2568u2(r1.f8718a, r7, R.id.text1, null);
    L33:
        r3.f9055w = r82;
        r3.f9056x = r1.f8732o;
        if (r1.f8729l == null) goto L37;
        r24.setOnItemClickListener(new C2439r2(r1, r3));
    L37:
        if (r1.f8731n == false) goto L39;
        r24.setChoiceMode(1);
    L39:
        r3.f9037e = r24;
        goto L40
    L28:
        r7 = r3.f9029B;
    L40:
        View r25 = r1.f8730m;
        if (r25 == null) goto L43;
        r3.f9038f = r25;
        r3.f9039g = false;
    L43:
        r0.setCancelable(true);
        r0.setCanceledOnTouchOutside(true);
        r0.setOnCancelListener(null);
        r0.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC2247mr r12 = r1.f8727j;
        if (r12 == null) goto L46;
        r0.setOnKeyListener(r12);
    L46:
        return r0;
    L5:
        CharSequence r26 = r1.f8721d;
        if (r26 == null) goto L10;
        r3.f9036d = r26;
        TextView r5 = r3.f9052t;
        if (r5 == null) goto L10;
        r5.setText(r26);
    L10:
        Drawable r27 = r1.f8720c;
        if (r27 == null) goto L15;
        r3.f9050r = r27;
        ImageView r52 = r3.f9051s;
        if (r52 == null) goto L15;
        r52.setVisibility(0);
        r3.f9051s.setImageDrawable(r27);
        goto L15
    }

    public Context getContext() {
        return this.f9188a.f8718a;
    }

    public C2654w2 setNegativeButton(int r3, DialogInterface.OnClickListener r4) {
        C2482s2 r0 = this.f9188a;
        r0.f8725h = r0.f8718a.getText(r3);
        r0.f8726i = r4;
        return this;
    }

    public C2654w2 setPositiveButton(int r3, DialogInterface.OnClickListener r4) {
        C2482s2 r0 = this.f9188a;
        r0.f8723f = r0.f8718a.getText(r3);
        r0.f8724g = r4;
        return this;
    }

    public C2654w2 setTitle(CharSequence r2) {
        this.f9188a.f8721d = r2;
        return this;
    }

    public C2654w2 setView(View r2) {
        this.f9188a.f8730m = r2;
        return this;
    }

    public C2654w2(Context r4, int r5) {
        this.f9188a = new C2482s2(new ContextThemeWrapper(r4, DialogInterfaceC2697x2.m5271e(r4, r5)));
        this.f9189b = r5;
    }
}
