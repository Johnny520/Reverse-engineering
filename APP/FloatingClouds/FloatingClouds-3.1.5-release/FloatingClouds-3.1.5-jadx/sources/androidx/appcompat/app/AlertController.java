package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.DialogInterfaceOnKeyListenerC0999g;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class AlertController {

    /* JADX INFO: renamed from: a */
    public final Context f3651a;

    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC0989b f3652b;

    /* JADX INFO: renamed from: c */
    public final Window f3653c;

    /* JADX INFO: renamed from: d */
    public CharSequence f3654d;

    /* JADX INFO: renamed from: e */
    public RecycleListView f3655e;

    /* JADX INFO: renamed from: f */
    public Button f3656f;

    /* JADX INFO: renamed from: g */
    public Button f3657g;

    /* JADX INFO: renamed from: h */
    public Button f3658h;

    /* JADX INFO: renamed from: i */
    public NestedScrollView f3659i;

    /* JADX INFO: renamed from: j */
    public Drawable f3660j;

    /* JADX INFO: renamed from: k */
    public ImageView f3661k;

    /* JADX INFO: renamed from: l */
    public TextView f3662l;

    /* JADX INFO: renamed from: m */
    public TextView f3663m;

    /* JADX INFO: renamed from: n */
    public View f3664n;

    /* JADX INFO: renamed from: o */
    public ListAdapter f3665o;

    /* JADX INFO: renamed from: q */
    public final int f3667q;

    /* JADX INFO: renamed from: r */
    public final int f3668r;

    /* JADX INFO: renamed from: s */
    public final int f3669s;

    /* JADX INFO: renamed from: t */
    public final int f3670t;

    /* JADX INFO: renamed from: u */
    public final boolean f3671u;

    /* JADX INFO: renamed from: v */
    public final HandlerC0986c f3672v;

    /* JADX INFO: renamed from: p */
    public int f3666p = -1;

    /* JADX INFO: renamed from: w */
    public final ViewOnClickListenerC0984a f3673w = new ViewOnClickListenerC0984a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a */
        public final int f3674a;

        /* JADX INFO: renamed from: b */
        public final int f3675b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0983R.styleable.RecycleListView);
            this.f3675b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C0983R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f3674a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C0983R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$a */
    public class ViewOnClickListenerC0984a implements View.OnClickListener {
        public ViewOnClickListenerC0984a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AlertController alertController = AlertController.this;
            Button button = alertController.f3656f;
            alertController.f3672v.obtainMessage(1, alertController.f3652b).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0985b {

        /* JADX INFO: renamed from: a */
        public final ContextThemeWrapper f3677a;

        /* JADX INFO: renamed from: b */
        public final LayoutInflater f3678b;

        /* JADX INFO: renamed from: c */
        public Drawable f3679c;

        /* JADX INFO: renamed from: d */
        public CharSequence f3680d;

        /* JADX INFO: renamed from: e */
        public View f3681e;

        /* JADX INFO: renamed from: f */
        public DialogInterfaceOnKeyListenerC0999g f3682f;

        /* JADX INFO: renamed from: g */
        public Object f3683g;

        /* JADX INFO: renamed from: h */
        public DialogInterface.OnClickListener f3684h;

        /* JADX INFO: renamed from: i */
        public boolean f3685i;

        /* JADX INFO: renamed from: j */
        public int f3686j = -1;

        public C0985b(ContextThemeWrapper contextThemeWrapper) {
            this.f3677a = contextThemeWrapper;
            this.f3678b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$c */
    public static final class HandlerC0986c extends Handler {

        /* JADX INFO: renamed from: a */
        public WeakReference<DialogInterface> f3687a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f3687a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0987d extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogInterfaceC0989b dialogInterfaceC0989b, Window window) {
        this.f3651a = context;
        this.f3652b = dialogInterfaceC0989b;
        this.f3653c = window;
        HandlerC0986c handlerC0986c = new HandlerC0986c();
        handlerC0986c.f3687a = new WeakReference<>(dialogInterfaceC0989b);
        this.f3672v = handlerC0986c;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C0983R.styleable.AlertDialog, C0983R.attr.alertDialogStyle, 0);
        this.f3667q = typedArrayObtainStyledAttributes.getResourceId(C0983R.styleable.AlertDialog_android_layout, 0);
        typedArrayObtainStyledAttributes.getResourceId(C0983R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.f3668r = typedArrayObtainStyledAttributes.getResourceId(C0983R.styleable.AlertDialog_listLayout, 0);
        typedArrayObtainStyledAttributes.getResourceId(C0983R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.f3669s = typedArrayObtainStyledAttributes.getResourceId(C0983R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.f3670t = typedArrayObtainStyledAttributes.getResourceId(C0983R.styleable.AlertDialog_listItemLayout, 0);
        this.f3671u = typedArrayObtainStyledAttributes.getBoolean(C0983R.styleable.AlertDialog_showTitle, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(C0983R.styleable.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC0989b.m1058c().mo715v(1);
    }

    /* JADX INFO: renamed from: a */
    public static ViewGroup m2296a(View view, View view2) {
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
