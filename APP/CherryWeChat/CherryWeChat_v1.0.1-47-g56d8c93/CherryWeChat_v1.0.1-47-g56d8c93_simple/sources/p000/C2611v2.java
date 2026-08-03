package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import io.github.cherrywechat.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: v2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2611v2 {

    /* JADX INFO: renamed from: A */
    public final int f9028A;

    /* JADX INFO: renamed from: B */
    public final int f9029B;

    /* JADX INFO: renamed from: C */
    public final boolean f9030C;

    /* JADX INFO: renamed from: D */
    public final HandlerC2525t2 f9031D;

    /* JADX INFO: renamed from: E */
    public final ViewOnClickListenerC2343p0 f9032E;

    /* JADX INFO: renamed from: a */
    public final Context f9033a;

    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC2697x2 f9034b;

    /* JADX INFO: renamed from: c */
    public final Window f9035c;

    /* JADX INFO: renamed from: d */
    public CharSequence f9036d;

    /* JADX INFO: renamed from: e */
    public AlertController$RecycleListView f9037e;

    /* JADX INFO: renamed from: f */
    public View f9038f;

    /* JADX INFO: renamed from: g */
    public boolean f9039g;

    /* JADX INFO: renamed from: h */
    public Button f9040h;

    /* JADX INFO: renamed from: i */
    public CharSequence f9041i;

    /* JADX INFO: renamed from: j */
    public Message f9042j;

    /* JADX INFO: renamed from: k */
    public Button f9043k;

    /* JADX INFO: renamed from: l */
    public CharSequence f9044l;

    /* JADX INFO: renamed from: m */
    public Message f9045m;

    /* JADX INFO: renamed from: n */
    public Button f9046n;

    /* JADX INFO: renamed from: o */
    public CharSequence f9047o;

    /* JADX INFO: renamed from: p */
    public Message f9048p;

    /* JADX INFO: renamed from: q */
    public NestedScrollView f9049q;

    /* JADX INFO: renamed from: r */
    public Drawable f9050r;

    /* JADX INFO: renamed from: s */
    public ImageView f9051s;

    /* JADX INFO: renamed from: t */
    public TextView f9052t;

    /* JADX INFO: renamed from: u */
    public TextView f9053u;

    /* JADX INFO: renamed from: v */
    public View f9054v;

    /* JADX INFO: renamed from: w */
    public ListAdapter f9055w;

    /* JADX INFO: renamed from: x */
    public int f9056x;

    /* JADX INFO: renamed from: y */
    public final int f9057y;

    /* JADX INFO: renamed from: z */
    public final int f9058z;

    public C2611v2(Context r4, DialogInterfaceC2697x2 r5, Window r6) {
        this.f9039g = false;
        this.f9056x = -1;
        this.f9032E = new ViewOnClickListenerC2343p0(1, this);
        this.f9033a = r4;
        this.f9034b = r5;
        this.f9035c = r6;
        HandlerC2525t2 r62 = new HandlerC2525t2();
        r62.f8822a = new WeakReference(r5);
        this.f9031D = r62;
        TypedArray r42 = r4.obtainStyledAttributes(null, AbstractC0982Wu.f3070e, R.attr.alertDialogStyle, 0);
        this.f9057y = r42.getResourceId(0, 0);
        r42.getResourceId(2, 0);
        this.f9058z = r42.getResourceId(4, 0);
        r42.getResourceId(5, 0);
        this.f9028A = r42.getResourceId(7, 0);
        this.f9029B = r42.getResourceId(3, 0);
        this.f9030C = r42.getBoolean(6, true);
        r42.getDimensionPixelSize(1, 0);
        r42.recycle();
        r5.m5272c().mo344g(1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5119a(View r4) {
        if (r4.onCheckIsTextEditor() == false) goto L6;
        return true;
    L6:
        if ((r4 instanceof ViewGroup) == true) goto L8;
        return false;
    L8:
        ViewGroup r42 = (ViewGroup) r4;
        int r0 = r42.getChildCount();
    L9:
        if (r0 <= 0) goto L13;
        r0 = r0 - 1;
        if (m5119a(r42.getChildAt(r0)) == false) goto L9;
        return true;
    L13:
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static ViewGroup m5120b(View r2, View r3) {
        if (r2 == null) goto L4;
        if (r3 == null) goto L13;
        ViewParent r0 = r3.getParent();
        if ((r0 instanceof ViewGroup) == false) goto L13;
        ((ViewGroup) r0).removeView(r3);
    L13:
        if ((r2 instanceof ViewStub) == false) goto L16;
        r2 = ((ViewStub) r2).inflate();
    L16:
        return (ViewGroup) r2;
    L4:
        if ((r3 instanceof ViewStub) == false) goto L7;
        r3 = ((ViewStub) r3).inflate();
    L7:
        return (ViewGroup) r3;
    }

    /* JADX INFO: renamed from: c */
    public final void m5121c(int r2, CharSequence r3, DialogInterface.OnClickListener r4) {
        if (r4 == null) goto L4;
        Message r42 = this.f9031D.obtainMessage(r2, r4);
    L6:
        if (r2 != (-3)) goto L8;
        this.f9047o = r3;
        this.f9048p = r42;
        return;
    L8:
        if (r2 != (-2)) goto L10;
        this.f9044l = r3;
        this.f9045m = r42;
        return;
    L10:
        if (r2 != (-1)) goto L14;
        this.f9041i = r3;
        this.f9042j = r42;
        return;
    L14:
        throw new IllegalArgumentException("Button does not exist");
    L4:
        r42 = null;
        goto L6
    }
}
