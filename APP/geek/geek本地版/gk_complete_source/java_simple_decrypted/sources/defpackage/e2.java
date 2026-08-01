package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
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
import com.ljx.wechatmod.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class e2 {
    public final Context a;
    public final g2 b;
    public final Window c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public Button f;
    public Button g;
    public Button h;
    public NestedScrollView i;
    public Drawable j;
    public ImageView k;
    public TextView l;
    public TextView m;
    public View n;
    public ListAdapter o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final c2 v;
    public final x0 w;

    public e2(Context r4, g2 r5, Window r6) {
        this.p = -1;
        this.w = new x0(1, this);
        this.a = r4;
        this.b = r5;
        this.c = r6;
        c2 r62 = new c2();
        r62.a = new WeakReference(r5);
        this.v = r62;
        TypedArray r42 = r4.obtainStyledAttributes(null, xy.e, R.attr.alertDialogStyle, 0);
        this.q = r42.getResourceId(0, 0);
        r42.getResourceId(2, 0);
        this.r = r42.getResourceId(4, 0);
        r42.getResourceId(5, 0);
        this.s = r42.getResourceId(7, 0);
        this.t = r42.getResourceId(3, 0);
        this.u = r42.getBoolean(6, true);
        r42.getDimensionPixelSize(1, 0);
        r42.recycle();
        r5.c().g(1);
    }

    public static ViewGroup a(View r2, View r3) {
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
}
