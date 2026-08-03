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

    /* JADX INFO: renamed from: y */
    public final int f9057y;

    /* JADX INFO: renamed from: z */
    public final int f9058z;

    /* JADX INFO: renamed from: g */
    public boolean f9039g = false;

    /* JADX INFO: renamed from: x */
    public int f9056x = -1;

    /* JADX INFO: renamed from: E */
    public final ViewOnClickListenerC2343p0 f9032E = new ViewOnClickListenerC2343p0(1, this);

    public C2611v2(Context context, DialogInterfaceC2697x2 dialogInterfaceC2697x2, Window window) {
        this.f9033a = context;
        this.f9034b = dialogInterfaceC2697x2;
        this.f9035c = window;
        HandlerC2525t2 handlerC2525t2 = new HandlerC2525t2();
        handlerC2525t2.f8822a = new WeakReference(dialogInterfaceC2697x2);
        this.f9031D = handlerC2525t2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0982Wu.f3070e, R.attr.alertDialogStyle, 0);
        this.f9057y = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f9058z = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f9028A = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f9029B = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f9030C = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC2697x2.m5272c().mo344g(1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5119a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m5119a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static ViewGroup m5120b(View view, View view2) {
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

    /* JADX INFO: renamed from: c */
    public final void m5121c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f9031D.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f9047o = charSequence;
            this.f9048p = messageObtainMessage;
        } else if (i == -2) {
            this.f9044l = charSequence;
            this.f9045m = messageObtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f9041i = charSequence;
            this.f9042j = messageObtainMessage;
        }
    }
}
