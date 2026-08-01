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
    public final Context f1661a;

    /* JADX INFO: renamed from: b */
    public final DialogC0246g2 f1662b;

    /* JADX INFO: renamed from: c */
    public final Window f1663c;

    /* JADX INFO: renamed from: d */
    public CharSequence f1664d;

    /* JADX INFO: renamed from: e */
    public AlertController$RecycleListView f1665e;

    /* JADX INFO: renamed from: f */
    public Button f1666f;

    /* JADX INFO: renamed from: g */
    public Button f1667g;

    /* JADX INFO: renamed from: h */
    public Button f1668h;

    /* JADX INFO: renamed from: i */
    public NestedScrollView f1669i;

    /* JADX INFO: renamed from: j */
    public Drawable f1670j;

    /* JADX INFO: renamed from: k */
    public ImageView f1671k;

    /* JADX INFO: renamed from: l */
    public TextView f1672l;

    /* JADX INFO: renamed from: m */
    public TextView f1673m;

    /* JADX INFO: renamed from: n */
    public View f1674n;

    /* JADX INFO: renamed from: o */
    public ListAdapter f1675o;

    /* JADX INFO: renamed from: q */
    public final int f1677q;

    /* JADX INFO: renamed from: r */
    public final int f1678r;

    /* JADX INFO: renamed from: s */
    public final int f1679s;

    /* JADX INFO: renamed from: t */
    public final int f1680t;

    /* JADX INFO: renamed from: u */
    public final boolean f1681u;

    /* JADX INFO: renamed from: v */
    public final HandlerC0089c2 f1682v;

    /* JADX INFO: renamed from: p */
    public int f1676p = -1;

    /* JADX INFO: renamed from: w */
    public final ViewOnClickListenerC0876x0 f1683w = new ViewOnClickListenerC0876x0(1, this);

    public C0172e2(Context context, DialogC0246g2 dialogC0246g2, Window window) {
        this.f1661a = context;
        this.f1662b = dialogC0246g2;
        this.f1663c = window;
        HandlerC0089c2 handlerC0089c2 = new HandlerC0089c2();
        handlerC0089c2.f882a = new WeakReference(dialogC0246g2);
        this.f1682v = handlerC0089c2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0910xy.f5221e, R.attr.alertDialogStyle, 0);
        this.f1677q = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f1678r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f1679s = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f1680t = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f1681u = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC0246g2.m1251c().mo977g(1);
    }

    /* JADX INFO: renamed from: a */
    public static ViewGroup m970a(View view, View view2) {
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
