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
import com.alibaba.fastjson2.C2942;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.datepicker.MaterialCalendar;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Timer;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import lin.xposed.hook.javaplugin.C5554;
import p009.AbstractC6183;
import p039.C6422;
import p053.AbstractC6561;
import p075.C6958;
import p175.AbstractC7739;
import p230.C8049;
import p257.AbstractC8214;
import p257.C8212;
import p257.C8220;
import p257.C8236;
import p257.RunnableC8213;
import p261.AbstractC8248;
import p314.AbstractC8661;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2492 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f7457;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f7458;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f7459;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f7460;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f7461;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f7462;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f7463;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f7464;

    public C2492(C8212 c8212, View view) {
        this.f7463 = c8212;
        if (view == null) {
            return;
        }
        c8212.m8047(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f7462 = dialogXBaseRelativeLayout;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.box_body);
        this.f7461 = linearLayout;
        this.f7459 = (ImageView) view.findViewById(R.id.img_dialogx_pop_icon);
        this.f7458 = (TextView) view.findViewById(R.id.txt_dialogx_pop_text);
        this.f7457 = (RelativeLayout) view.findViewById(R.id.box_custom);
        TextView textView = (TextView) view.findViewById(R.id.txt_dialogx_button);
        this.f7464 = textView;
        this.f7460 = AbstractC3738.m8039(view);
        c8212.m8055().setTranslationZ(0.0f);
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        if (c8212.f22662 == null) {
            c8212.f22662 = null;
        }
        Timer timer = c8212.f22660;
        int i = 1;
        if (timer == null) {
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = new Timer();
            c8212.f22660 = timer2;
            timer2.schedule(new C6422(c8212, i), 2000L);
            if (!c8212.f11586 && !c8212.f11584) {
                c8212.m13738();
            }
        }
        dialogXBaseRelativeLayout.m8073(c8212.f22656);
        dialogXBaseRelativeLayout.f11639 = true;
        dialogXBaseRelativeLayout.f11636 = new C8236(this, 4);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        if (c8212.f22654 == null) {
            c8212.f22654 = DialogXStyle$PopTipSettings$ALIGN.BOTTOM;
        }
        int i2 = AbstractC8214.f22665[c8212.f22654.ordinal()];
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
        dialogXBaseRelativeLayout.f11640 = new C8049(this, i3);
        dialogXBaseRelativeLayout.f11637 = new C6958(20);
        dialogXBaseRelativeLayout.post(new RunnableC8213(this, 0));
        textView.setOnClickListener(new ViewOnClickListenerC0086(this, i3));
        c8212.f22653 = this;
        m4936();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C2461 m4930(AbstractC2484 abstractC2484) {
        C2461 c2461 = (C2461) ((IdentityHashMap) this.f7458).get(abstractC2484);
        if (c2461 != null) {
            return c2461;
        }
        C5554.m10887("Cannot find wrapper for ", abstractC2484, ", seems like it is not bound by this adapter: ", this);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long m4931(Animation animation) {
        LinearLayout linearLayout = (LinearLayout) this.f7461;
        if (animation == null && linearLayout.getAnimation() != null) {
            animation = linearLayout.getAnimation();
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = ((C8212) this.f7463).f11591;
        return j != -1 ? j : duration;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C0190 m4932(int i) {
        C0190 c0190 = (C0190) this.f7457;
        if (c0190.f744) {
            c0190 = new C0190();
        } else {
            c0190.f744 = true;
        }
        Iterator it = ((ArrayList) this.f7459).iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2461 c2461 = (C2461) it.next();
            int i3 = c2461.f7330;
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
        C5925.m11310(AbstractC6183.m11588(i, "Cannot find wrapper for "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m4933(View view) {
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout;
        C8212 c8212 = (C8212) this.f7463;
        if (view != null) {
            view.setEnabled(false);
        }
        if (c8212.f11587 || (dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) this.f7462) == null) {
            return;
        }
        c8212.f11587 = true;
        dialogXBaseRelativeLayout.post(new RunnableC8213(this, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m4934(C2461 c2461) {
        C2461 c24612;
        Iterator it = ((ArrayList) this.f7459).iterator();
        int i = 0;
        while (it.hasNext() && (c24612 = (C2461) it.next()) != c2461) {
            i += c24612.f7330;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m4935() {
        RecyclerView$Adapter$StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy;
        Iterator it = ((ArrayList) this.f7459).iterator();
        while (true) {
            if (!it.hasNext()) {
                recyclerView$Adapter$StateRestorationPolicy = RecyclerView$Adapter$StateRestorationPolicy.ALLOW;
                break;
            }
            C2461 c2461 = (C2461) it.next();
            RecyclerView$Adapter$StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy2 = c2461.f7332.f7296;
            recyclerView$Adapter$StateRestorationPolicy = RecyclerView$Adapter$StateRestorationPolicy.PREVENT;
            if (recyclerView$Adapter$StateRestorationPolicy2 == recyclerView$Adapter$StateRestorationPolicy || (recyclerView$Adapter$StateRestorationPolicy2 == RecyclerView$Adapter$StateRestorationPolicy.PREVENT_WHEN_EMPTY && c2461.f7330 == 0)) {
                break;
            }
        }
        C2493 c2493 = (C2493) this.f7462;
        if (recyclerView$Adapter$StateRestorationPolicy != c2493.f7296) {
            c2493.f7296 = recyclerView$Adapter$StateRestorationPolicy;
            c2493.f7298.m4815();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m4936() {
        GradientDrawable gradientDrawable;
        ArrayList arrayList = (ArrayList) this.f7460;
        ImageView imageView = (ImageView) this.f7459;
        TextView textView = (TextView) this.f7458;
        TextView textView2 = (TextView) this.f7464;
        LinearLayout linearLayout = (LinearLayout) this.f7461;
        C8212 c8212 = (C8212) this.f7463;
        float f = c8212.f22651;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) this.f7462;
        if (dialogXBaseRelativeLayout == null || c8212.m8058() == null) {
            return;
        }
        int[] iArr = c8212.f11588;
        int i = 3;
        dialogXBaseRelativeLayout.m8072(iArr[0], iArr[1], iArr[2], iArr[3]);
        ((RelativeLayout) this.f7457).setVisibility(8);
        AbstractC3738.m8024(textView, c8212.f22661);
        AbstractC3738.m8024(textView2, null);
        AbstractC3738.m8023(textView, null);
        AbstractC3738.m8023(textView2, c8212.f22662);
        if (c8212.f22657 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(c8212.f22657);
            AbstractC4922 abstractC4922 = c8212.f11583;
            BaseDialog$BOOLEAN baseDialog$BOOLEAN = c8212.f22650;
            if (baseDialog$BOOLEAN == null) {
                abstractC4922.mo9894();
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
            linearLayout.setOutlineProvider(new C8220(this, i));
            linearLayout.setClipToOutline(true);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((View) it.next()).getClass();
                    C2942.m6394();
                    return;
                }
            }
        }
        linearLayout.setOnClickListener(null);
        linearLayout.setClickable(false);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        int[] iArr2 = c8212.f22659;
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
        this.f7460 = new ArrayList();
        this.f7458 = new IdentityHashMap();
        this.f7459 = new ArrayList();
        this.f7457 = new C0190();
        this.f7462 = c2493;
        c2494.getClass();
        C0107 c0107 = new C0107((byte) 0, 4);
        c0107.f315 = new SparseArray();
        c0107.f314 = 0;
        this.f7461 = c0107;
        ConcatAdapter$Config$StableIdMode concatAdapter$Config$StableIdMode = c2494.f7467;
        this.f7464 = concatAdapter$Config$StableIdMode;
        if (concatAdapter$Config$StableIdMode == ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS) {
            this.f7463 = new C2460(1);
            return;
        }
        if (concatAdapter$Config$StableIdMode == ConcatAdapter$Config$StableIdMode.ISOLATED_STABLE_IDS) {
            C2477 c2477 = new C2477();
            c2477.f7426 = 0L;
            this.f7463 = c2477;
        } else if (concatAdapter$Config$StableIdMode == ConcatAdapter$Config$StableIdMode.SHARED_STABLE_IDS) {
            this.f7463 = new C2460(2);
        } else {
            C5925.m11310("unknown stable id mode");
            throw null;
        }
    }

    public C2492(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC6561.m12067(context, MaterialCalendar.class.getCanonicalName(), R.attr.materialCalendarStyle).data, AbstractC8661.f24437);
        this.f7462 = C0191.m653(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.f7464 = C0191.m653(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f7461 = C0191.m653(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f7460 = C0191.m653(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListM13073 = AbstractC7739.m13073(context, typedArrayObtainStyledAttributes, 7);
        this.f7459 = C0191.m653(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f7458 = C0191.m653(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f7457 = C0191.m653(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f7463 = paint;
        paint.setColor(colorStateListM13073.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
