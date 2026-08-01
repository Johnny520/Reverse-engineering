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
import androidx.appcompat.app.C0107;
import androidx.appcompat.app.ViewOnClickListenerC0086;
import androidx.appcompat.widget.C0190;
import androidx.appcompat.widget.C0191;
import com.alibaba.fastjson2.C2941;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.datepicker.MaterialCalendar;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Timer;
import lin.xposed.hook.javaplugin.C5553;
import p007.AbstractC6136;
import p033.AbstractC6325;
import p038.C6400;
import p075.C6957;
import p230.C8048;
import p251.AbstractC8174;
import p253.AbstractC8189;
import p257.AbstractC8213;
import p257.C8211;
import p257.C8219;
import p257.C8235;
import p257.RunnableC8212;
import p261.AbstractC8247;
import p314.AbstractC8669;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2492 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f7456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f7457;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f7458;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f7459;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f7460;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f7461;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f7462;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f7463;

    public C2492(C8211 c8211, View view) {
        this.f7462 = c8211;
        if (view == null) {
            return;
        }
        c8211.m8060(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f7461 = dialogXBaseRelativeLayout;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.box_body);
        this.f7460 = linearLayout;
        this.f7458 = (ImageView) view.findViewById(R.id.img_dialogx_pop_icon);
        this.f7457 = (TextView) view.findViewById(R.id.txt_dialogx_pop_text);
        this.f7456 = (RelativeLayout) view.findViewById(R.id.box_custom);
        TextView textView = (TextView) view.findViewById(R.id.txt_dialogx_button);
        this.f7463 = textView;
        this.f7459 = AbstractC3737.m8052(view);
        c8211.m8068().setTranslationZ(0.0f);
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        if (c8211.f22663 == null) {
            c8211.f22663 = null;
        }
        Timer timer = c8211.f22661;
        int i = 1;
        if (timer == null) {
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = new Timer();
            c8211.f22661 = timer2;
            timer2.schedule(new C6400(c8211, i), 2000L);
            if (!c8211.f11581 && !c8211.f11579) {
                c8211.m13721();
            }
        }
        dialogXBaseRelativeLayout.m8086(c8211.f22657);
        dialogXBaseRelativeLayout.f11634 = true;
        dialogXBaseRelativeLayout.f11631 = new C8235(this, 4);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        if (c8211.f22655 == null) {
            c8211.f22655 = DialogXStyle$PopTipSettings$ALIGN.BOTTOM;
        }
        int i2 = AbstractC8213.f22666[c8211.f22655.ordinal()];
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
        dialogXBaseRelativeLayout.f11635 = new C8048(this, i3);
        dialogXBaseRelativeLayout.f11632 = new C6957(20);
        dialogXBaseRelativeLayout.post(new RunnableC8212(this, 0));
        textView.setOnClickListener(new ViewOnClickListenerC0086(this, i3));
        c8211.f22654 = this;
        m4926();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C2461 m4920(AbstractC2484 abstractC2484) {
        C2461 c2461 = (C2461) ((IdentityHashMap) this.f7457).get(abstractC2484);
        if (c2461 != null) {
            return c2461;
        }
        C5553.m10830("Cannot find wrapper for ", abstractC2484, ", seems like it is not bound by this adapter: ", this);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long m4921(Animation animation) {
        LinearLayout linearLayout = (LinearLayout) this.f7460;
        if (animation == null && linearLayout.getAnimation() != null) {
            animation = linearLayout.getAnimation();
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = ((C8211) this.f7462).f11586;
        return j != -1 ? j : duration;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C0190 m4922(int i) {
        C0190 c0190 = (C0190) this.f7456;
        if (c0190.f744) {
            c0190 = new C0190();
        } else {
            c0190.f744 = true;
        }
        Iterator it = ((ArrayList) this.f7458).iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2461 c2461 = (C2461) it.next();
            int i3 = c2461.f7329;
            if (i3 > i2) {
                c0190.f743 = c2461;
                c0190.f745 = i2;
                break;
            }
            i2 -= i3;
        }
        if (((C2461) c0190.f743) != null) {
            return c0190;
        }
        C5919.m11249(AbstractC6136.m11556(i, "Cannot find wrapper for "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m4923(View view) {
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout;
        C8211 c8211 = (C8211) this.f7462;
        if (view != null) {
            view.setEnabled(false);
        }
        if (c8211.f11582 || (dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) this.f7461) == null) {
            return;
        }
        c8211.f11582 = true;
        dialogXBaseRelativeLayout.post(new RunnableC8212(this, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m4924(C2461 c2461) {
        C2461 c24612;
        Iterator it = ((ArrayList) this.f7458).iterator();
        int i = 0;
        while (it.hasNext() && (c24612 = (C2461) it.next()) != c2461) {
            i += c24612.f7329;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m4925() {
        RecyclerView$Adapter$StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy;
        Iterator it = ((ArrayList) this.f7458).iterator();
        while (true) {
            if (!it.hasNext()) {
                recyclerView$Adapter$StateRestorationPolicy = RecyclerView$Adapter$StateRestorationPolicy.ALLOW;
                break;
            }
            C2461 c2461 = (C2461) it.next();
            RecyclerView$Adapter$StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy2 = c2461.f7331.f7295;
            recyclerView$Adapter$StateRestorationPolicy = RecyclerView$Adapter$StateRestorationPolicy.PREVENT;
            if (recyclerView$Adapter$StateRestorationPolicy2 == recyclerView$Adapter$StateRestorationPolicy || (recyclerView$Adapter$StateRestorationPolicy2 == RecyclerView$Adapter$StateRestorationPolicy.PREVENT_WHEN_EMPTY && c2461.f7329 == 0)) {
                break;
            }
        }
        C2493 c2493 = (C2493) this.f7461;
        if (recyclerView$Adapter$StateRestorationPolicy != c2493.f7295) {
            c2493.f7295 = recyclerView$Adapter$StateRestorationPolicy;
            c2493.f7297.m4805();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m4926() {
        GradientDrawable gradientDrawable;
        ArrayList arrayList = (ArrayList) this.f7459;
        ImageView imageView = (ImageView) this.f7458;
        TextView textView = (TextView) this.f7457;
        TextView textView2 = (TextView) this.f7463;
        LinearLayout linearLayout = (LinearLayout) this.f7460;
        C8211 c8211 = (C8211) this.f7462;
        float f = c8211.f22652;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) this.f7461;
        if (dialogXBaseRelativeLayout == null || c8211.m8071() == null) {
            return;
        }
        int[] iArr = c8211.f11583;
        int i = 3;
        dialogXBaseRelativeLayout.m8085(iArr[0], iArr[1], iArr[2], iArr[3]);
        ((RelativeLayout) this.f7456).setVisibility(8);
        AbstractC3737.m8037(textView, c8211.f22662);
        AbstractC3737.m8037(textView2, null);
        AbstractC3737.m8036(textView, null);
        AbstractC3737.m8036(textView2, c8211.f22663);
        if (c8211.f22658 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(c8211.f22658);
            AbstractC6325 abstractC6325 = c8211.f11578;
            BaseDialog$BOOLEAN baseDialog$BOOLEAN = c8211.f22651;
            if (baseDialog$BOOLEAN == null) {
                abstractC6325.mo11879();
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
            linearLayout.setOutlineProvider(new C8219(this, i));
            linearLayout.setClipToOutline(true);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((View) it.next()).getClass();
                    C2941.m6336();
                    return;
                }
            }
        }
        linearLayout.setOnClickListener(null);
        linearLayout.setClickable(false);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        int[] iArr2 = c8211.f22660;
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

    public C2492(C2493 c2493, C2494 c2494) {
        this.f7459 = new ArrayList();
        this.f7457 = new IdentityHashMap();
        this.f7458 = new ArrayList();
        this.f7456 = new C0190();
        this.f7461 = c2493;
        c2494.getClass();
        C0107 c0107 = new C0107((byte) 0, 4);
        c0107.f315 = new SparseArray();
        c0107.f314 = 0;
        this.f7460 = c0107;
        ConcatAdapter$Config$StableIdMode concatAdapter$Config$StableIdMode = c2494.f7466;
        this.f7463 = concatAdapter$Config$StableIdMode;
        if (concatAdapter$Config$StableIdMode == ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS) {
            this.f7462 = new C2460(1);
            return;
        }
        if (concatAdapter$Config$StableIdMode == ConcatAdapter$Config$StableIdMode.ISOLATED_STABLE_IDS) {
            C2477 c2477 = new C2477();
            c2477.f7425 = 0L;
            this.f7462 = c2477;
        } else if (concatAdapter$Config$StableIdMode == ConcatAdapter$Config$StableIdMode.SHARED_STABLE_IDS) {
            this.f7462 = new C2460(2);
        } else {
            C5919.m11249("unknown stable id mode");
            throw null;
        }
    }

    public C2492(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC8174.m13595(context, MaterialCalendar.class.getCanonicalName(), R.attr.materialCalendarStyle).data, AbstractC8669.f24446);
        this.f7461 = C0191.m652(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.f7463 = C0191.m652(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f7460 = C0191.m652(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f7459 = C0191.m652(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListM13678 = AbstractC8189.m13678(context, typedArrayObtainStyledAttributes, 7);
        this.f7458 = C0191.m652(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f7457 = C0191.m652(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f7456 = C0191.m652(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f7462 = paint;
        paint.setColor(colorStateListM13678.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
