package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0954;
import androidx.appcompat.app.ViewOnClickListenerC0933;
import androidx.appcompat.widget.C1037;
import androidx.appcompat.widget.C1038;
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.datepicker.MaterialCalendar;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Timer;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import lin.xposed.hook.javaplugin.C6385;
import p025.AbstractC7012;
import p055.C7251;
import p069.AbstractC7390;
import p091.C7787;
import p191.AbstractC8568;
import p246.C8878;
import p273.AbstractC9043;
import p273.C9041;
import p273.C9049;
import p273.C9065;
import p273.RunnableC9042;
import p277.AbstractC9077;
import p330.AbstractC9490;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f7802;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f7803;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f7804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f7805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f7806;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f7807;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f7808;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f7809;

    public C3325(C9041 c9041, View view) {
        this.f7808 = c9041;
        if (view == null) {
            return;
        }
        c9041.m8606(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(C0328R.id.box_root);
        this.f7807 = dialogXBaseRelativeLayout;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0328R.id.box_body);
        this.f7806 = linearLayout;
        this.f7804 = (ImageView) view.findViewById(C0328R.id.img_dialogx_pop_icon);
        this.f7803 = (TextView) view.findViewById(C0328R.id.txt_dialogx_pop_text);
        this.f7802 = (RelativeLayout) view.findViewById(C0328R.id.box_custom);
        TextView textView = (TextView) view.findViewById(C0328R.id.txt_dialogx_button);
        this.f7809 = textView;
        this.f7805 = AbstractC4570.m8598(view);
        c9041.m8614().setTranslationZ(0.0f);
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        if (c9041.f23007 == null) {
            c9041.f23007 = null;
        }
        Timer timer = c9041.f23005;
        int i = 1;
        if (timer == null) {
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = new Timer();
            c9041.f23005 = timer2;
            timer2.schedule(new C7251(c9041, i), 2000L);
            if (!c9041.f11931 && !c9041.f11929) {
                c9041.m14297();
            }
        }
        dialogXBaseRelativeLayout.m8632(c9041.f23001);
        dialogXBaseRelativeLayout.f11984 = true;
        dialogXBaseRelativeLayout.f11981 = new C9065(this, 4);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        if (c9041.f22999 == null) {
            c9041.f22999 = DialogXStyle$PopTipSettings$ALIGN.BOTTOM;
        }
        int i2 = AbstractC9043.f23010[c9041.f22999.ordinal()];
        if (i2 == 1) {
            layoutParams.removeRule(12);
            layoutParams.removeRule(13);
            layoutParams.addRule(10);
        } else if (i2 == 2) {
            layoutParams.removeRule(10);
            layoutParams.removeRule(13);
            layoutParams.addRule(12);
        } else if (i2 == 3) {
            layoutParams.removeRule(10);
            layoutParams.removeRule(12);
            layoutParams.addRule(13);
        }
        linearLayout.setLayoutParams(layoutParams);
        int i3 = 7;
        dialogXBaseRelativeLayout.f11985 = new C8878(this, i3);
        dialogXBaseRelativeLayout.f11982 = new C7787(20);
        dialogXBaseRelativeLayout.post(new RunnableC9042(this, 0));
        textView.setOnClickListener(new ViewOnClickListenerC0933(this, i3));
        c9041.f22998 = this;
        m5496();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C3294 m5490(AbstractC3317 abstractC3317) {
        C3294 c3294 = (C3294) ((IdentityHashMap) this.f7803).get(abstractC3317);
        if (c3294 != null) {
            return c3294;
        }
        C6385.m11446("Cannot find wrapper for ", abstractC3317, ", seems like it is not bound by this adapter: ", this);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long m5491(Animation animation) {
        LinearLayout linearLayout = (LinearLayout) this.f7806;
        if (animation == null && linearLayout.getAnimation() != null) {
            animation = linearLayout.getAnimation();
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = ((C9041) this.f7808).f11936;
        return j != -1 ? j : duration;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C1037 m5492(int i) {
        C1037 c1037 = (C1037) this.f7802;
        if (c1037.f1089) {
            c1037 = new C1037();
        } else {
            c1037.f1089 = true;
        }
        Iterator it = ((ArrayList) this.f7804).iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C3294 c3294 = (C3294) it.next();
            int i3 = c3294.f7675;
            if (i3 > i2) {
                c1037.f1088 = c3294;
                c1037.f1090 = i2;
                break;
            }
            i2 -= i3;
        }
        if (((C3294) c1037.f1088) != null) {
            return c1037;
        }
        C6755.m11869(AbstractC7012.m12147(i, "Cannot find wrapper for "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m5493(View view) {
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout;
        C9041 c9041 = (C9041) this.f7808;
        if (view != null) {
            view.setEnabled(false);
        }
        if (c9041.f11932 || (dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) this.f7807) == null) {
            return;
        }
        c9041.f11932 = true;
        dialogXBaseRelativeLayout.post(new RunnableC9042(this, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m5494(C3294 c3294) {
        C3294 c32942;
        Iterator it = ((ArrayList) this.f7804).iterator();
        int i = 0;
        while (it.hasNext() && (c32942 = (C3294) it.next()) != c3294) {
            i += c32942.f7675;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m5495() {
        RecyclerView$Adapter$StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy;
        Iterator it = ((ArrayList) this.f7804).iterator();
        while (true) {
            if (!it.hasNext()) {
                recyclerView$Adapter$StateRestorationPolicy = RecyclerView$Adapter$StateRestorationPolicy.ALLOW;
                break;
            }
            C3294 c3294 = (C3294) it.next();
            RecyclerView$Adapter$StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy2 = c3294.f7677.f7641;
            recyclerView$Adapter$StateRestorationPolicy = RecyclerView$Adapter$StateRestorationPolicy.PREVENT;
            if (recyclerView$Adapter$StateRestorationPolicy2 == recyclerView$Adapter$StateRestorationPolicy || (recyclerView$Adapter$StateRestorationPolicy2 == RecyclerView$Adapter$StateRestorationPolicy.PREVENT_WHEN_EMPTY && c3294.f7675 == 0)) {
                break;
            }
        }
        C3326 c3326 = (C3326) this.f7807;
        if (recyclerView$Adapter$StateRestorationPolicy != c3326.f7641) {
            c3326.f7641 = recyclerView$Adapter$StateRestorationPolicy;
            c3326.f7643.m5375();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m5496() {
        GradientDrawable gradientDrawable;
        ArrayList arrayList = (ArrayList) this.f7805;
        ImageView imageView = (ImageView) this.f7804;
        TextView textView = (TextView) this.f7803;
        TextView textView2 = (TextView) this.f7809;
        LinearLayout linearLayout = (LinearLayout) this.f7806;
        C9041 c9041 = (C9041) this.f7808;
        float f = c9041.f22996;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) this.f7807;
        if (dialogXBaseRelativeLayout == null || c9041.m8617() == null) {
            return;
        }
        int[] iArr = c9041.f11933;
        int i = 3;
        dialogXBaseRelativeLayout.m8631(iArr[0], iArr[1], iArr[2], iArr[3]);
        ((RelativeLayout) this.f7802).setVisibility(8);
        AbstractC4570.m8583(textView, c9041.f23006);
        AbstractC4570.m8583(textView2, null);
        AbstractC4570.m8582(textView, null);
        AbstractC4570.m8582(textView2, c9041.f23007);
        if (c9041.f23002 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(c9041.f23002);
            AbstractC5754 abstractC5754 = c9041.f11928;
            BaseDialog$BOOLEAN baseDialog$BOOLEAN = c9041.f22995;
            if (baseDialog$BOOLEAN == null) {
                abstractC5754.mo10453();
            } else if (baseDialog$BOOLEAN != BaseDialog$BOOLEAN.TRUE) {
                imageView.setImageTintList(null);
            }
            imageView.setImageTintList(textView.getTextColors());
        } else {
            imageView.setVisibility(8);
        }
        if (f > -1.0f) {
            if ((linearLayout.getBackground() instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) linearLayout.getBackground()) != null) {
                gradientDrawable.setCornerRadius(f);
            }
            linearLayout.setOutlineProvider(new C9049(this, i));
            linearLayout.setClipToOutline(true);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((View) it.next()).getClass();
                    C3775.m6954();
                    return;
                }
            }
        }
        linearLayout.setOnClickListener(null);
        linearLayout.setClickable(false);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        int[] iArr2 = c9041.f23004;
        int i2 = iArr2[0];
        if (i2 != -1) {
            layoutParams.leftMargin = i2;
        }
        int i3 = iArr2[1];
        if (i3 != -1) {
            layoutParams.topMargin = i3;
        }
        int i4 = iArr2[2];
        if (i4 != -1) {
            layoutParams.rightMargin = i4;
        }
        int i5 = iArr2[3];
        if (i5 != -1) {
            layoutParams.bottomMargin = i5;
        }
        linearLayout.setLayoutParams(layoutParams);
    }

    public C3325(C3326 c3326, C3327 c3327) {
        this.f7805 = new ArrayList();
        this.f7803 = new IdentityHashMap();
        this.f7804 = new ArrayList();
        this.f7802 = new C1037();
        this.f7807 = c3326;
        c3327.getClass();
        C0954 c0954 = new C0954((byte) 0, 4);
        c0954.f660 = new SparseArray();
        c0954.f659 = 0;
        this.f7806 = c0954;
        ConcatAdapter$Config$StableIdMode concatAdapter$Config$StableIdMode = c3327.f7812;
        this.f7809 = concatAdapter$Config$StableIdMode;
        if (concatAdapter$Config$StableIdMode == ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS) {
            this.f7808 = new C3293(1);
            return;
        }
        if (concatAdapter$Config$StableIdMode == ConcatAdapter$Config$StableIdMode.ISOLATED_STABLE_IDS) {
            C3310 c3310 = new C3310();
            c3310.f7771 = 0L;
            this.f7808 = c3310;
        } else if (concatAdapter$Config$StableIdMode == ConcatAdapter$Config$StableIdMode.SHARED_STABLE_IDS) {
            this.f7808 = new C3293(2);
        } else {
            C6755.m11869("unknown stable id mode");
            throw null;
        }
    }

    public C3325(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC7390.m12626(context, MaterialCalendar.class.getCanonicalName(), C0328R.attr.materialCalendarStyle).data, AbstractC9490.f24782);
        this.f7807 = C1038.m1213(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.f7809 = C1038.m1213(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f7806 = C1038.m1213(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f7805 = C1038.m1213(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListM13632 = AbstractC8568.m13632(context, typedArrayObtainStyledAttributes, 7);
        this.f7804 = C1038.m1213(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f7803 = C1038.m1213(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f7802 = C1038.m1213(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f7808 = paint;
        paint.setColor(colorStateListM13632.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
