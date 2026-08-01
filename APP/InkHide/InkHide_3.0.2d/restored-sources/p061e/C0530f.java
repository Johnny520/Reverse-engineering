package p061e;

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
import com.p055lu.wxmask272.R;
import java.lang.ref.WeakReference;
import p058d.AbstractC0515a;

/* JADX INFO: renamed from: e.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0530f {

    /* JADX INFO: renamed from: a */
    public final Context f1723a;

    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC0532h f1724b;

    /* JADX INFO: renamed from: c */
    public final Window f1725c;

    /* JADX INFO: renamed from: d */
    public CharSequence f1726d;

    /* JADX INFO: renamed from: e */
    public AlertController$RecycleListView f1727e;

    /* JADX INFO: renamed from: f */
    public Button f1728f;

    /* JADX INFO: renamed from: g */
    public Button f1729g;

    /* JADX INFO: renamed from: h */
    public Button f1730h;

    /* JADX INFO: renamed from: i */
    public NestedScrollView f1731i;

    /* JADX INFO: renamed from: j */
    public Drawable f1732j;

    /* JADX INFO: renamed from: k */
    public ImageView f1733k;

    /* JADX INFO: renamed from: l */
    public TextView f1734l;

    /* JADX INFO: renamed from: m */
    public TextView f1735m;

    /* JADX INFO: renamed from: n */
    public View f1736n;

    /* JADX INFO: renamed from: o */
    public ListAdapter f1737o;

    /* JADX INFO: renamed from: q */
    public final int f1739q;

    /* JADX INFO: renamed from: r */
    public final int f1740r;

    /* JADX INFO: renamed from: s */
    public final int f1741s;

    /* JADX INFO: renamed from: t */
    public final int f1742t;

    /* JADX INFO: renamed from: u */
    public final boolean f1743u;

    /* JADX INFO: renamed from: v */
    public final HandlerC0528d f1744v;

    /* JADX INFO: renamed from: p */
    public int f1738p = -1;

    /* JADX INFO: renamed from: w */
    public final ViewOnClickListenerC0525a f1745w = new ViewOnClickListenerC0525a(0, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0530f(Context context, DialogInterfaceC0532h dialogInterfaceC0532h, Window window) {
        this.f1723a = context;
        this.f1724b = dialogInterfaceC0532h;
        this.f1725c = window;
        HandlerC0528d handlerC0528d = new HandlerC0528d();
        handlerC0528d.f1722a = new WeakReference(dialogInterfaceC0532h);
        this.f1744v = handlerC0528d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0515a.f1641e, R.attr.alertDialogStyle, 0);
        this.f1739q = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f1740r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f1741s = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f1742t = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f1743u = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC0532h.m1121d().mo1087h(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static ViewGroup m1068a(View view, View view2) {
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
