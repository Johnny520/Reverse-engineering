package p000;

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

/* JADX INFO: renamed from: e2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0172e2 {

    /* JADX INFO: renamed from: a */
    public final Context f1465a;

    /* JADX INFO: renamed from: b */
    public final DialogC0246g2 f1466b;

    /* JADX INFO: renamed from: c */
    public final Window f1467c;

    /* JADX INFO: renamed from: d */
    public CharSequence f1468d;

    /* JADX INFO: renamed from: e */
    public AlertController$RecycleListView f1469e;

    /* JADX INFO: renamed from: f */
    public Button f1470f;

    /* JADX INFO: renamed from: g */
    public Button f1471g;

    /* JADX INFO: renamed from: h */
    public Button f1472h;

    /* JADX INFO: renamed from: i */
    public NestedScrollView f1473i;

    /* JADX INFO: renamed from: j */
    public Drawable f1474j;

    /* JADX INFO: renamed from: k */
    public ImageView f1475k;

    /* JADX INFO: renamed from: l */
    public TextView f1476l;

    /* JADX INFO: renamed from: m */
    public TextView f1477m;

    /* JADX INFO: renamed from: n */
    public View f1478n;

    /* JADX INFO: renamed from: o */
    public ListAdapter f1479o;

    /* JADX INFO: renamed from: q */
    public final int f1481q;

    /* JADX INFO: renamed from: r */
    public final int f1482r;

    /* JADX INFO: renamed from: s */
    public final int f1483s;

    /* JADX INFO: renamed from: t */
    public final int f1484t;

    /* JADX INFO: renamed from: u */
    public final boolean f1485u;

    /* JADX INFO: renamed from: v */
    public final HandlerC0089c2 f1486v;

    /* JADX INFO: renamed from: p */
    public int f1480p = -1;

    /* JADX INFO: renamed from: w */
    public final ViewOnClickListenerC0876x0 f1487w = new ViewOnClickListenerC0876x0(1, this);

    public C0172e2(Context context, DialogC0246g2 dialogC0246g2, Window window) {
        this.f1465a = context;
        this.f1466b = dialogC0246g2;
        this.f1467c = window;
        HandlerC0089c2 handlerC0089c2 = new HandlerC0089c2();
        handlerC0089c2.f810a = new WeakReference(dialogC0246g2);
        this.f1486v = handlerC0089c2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0205ez.f1681e, R.attr.alertDialogStyle, 0);
        this.f1481q = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f1482r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f1483s = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f1484t = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f1485u = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC0246g2.m1124c().mo961g(1);
    }

    /* JADX INFO: renamed from: a */
    public static ViewGroup m954a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
