package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: renamed from: ni */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C2281ni implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2805zi f8016a;

    public LayoutInflaterFactory2C2281ni(AbstractC2805zi r1) {
        this.f8016a = r1;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String r2, Context r3, AttributeSet r4) {
        return onCreateView(null, r2, r3, r4);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View r11, String r12, Context r13, AttributeSet r14) {
        boolean r0 = FragmentContainerView.class.getName().equals(r12);
        AbstractC2805zi r1 = this.f8016a;
        if (r0 == true) goto L5;
        AbstractActivityC1244c3 r02 = null;
        if ("fragment".equals(r12) == false) goto L75;
        String r122 = r14.getAttributeValue(null, "class");
        TypedArray r2 = r13.obtainStyledAttributes(r14, AbstractC0767Ru.f2438a);
        int r3 = 0;
        if (r122 != null) goto L12;
        r122 = r2.getString(0);
    L12:
        int r6 = r2.getResourceId(1, -1);
        String r8 = r2.getString(2);
        r2.recycle();
        if (r122 == null) goto L75;
        boolean r22 = AbstractComponentCallbacksC1503hi.class.isAssignableFrom(C2547ti.m5031b(r122, r13.getClassLoader()));     // Catch: ClassNotFoundException -> L17
    L18:
        if (r22 == false) goto L75;
        if (r11 == null) goto L22;
        r3 = r11.getId();
    L22:
        if (r3 != (-1)) goto L28;
        if (r6 != (-1)) goto L28;
        if (r8 != null) goto L28;
        throw new IllegalArgumentException(r14.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + r122);
    L28:
        if (r6 == (-1)) goto L30;
        AbstractComponentCallbacksC1503hi r23 = r1.m5379B(r6);
    L31:
        if (r23 != null) goto L34;
        if (r8 == null) goto L34;
        r23 = r1.m5380C(r8);
    L34:
        if (r23 != null) goto L37;
        if (r3 == (-1)) goto L37;
        r23 = r1.m5379B(r3);
    L37:
        if (r23 != null) goto L52;
        C2547ti r142 = r1.m5382E();
        r13.getClassLoader();
        r23 = r142.m5033a(r122);
        r23.f5322m = true;
        if (r6 == 0) goto L41;
        int r132 = r6;
    L42:
        r23.f5331v = r132;
        r23.f5332w = r3;
        r23.f5333x = r8;
        r23.f5323n = true;
        r23.f5327r = r1;
        C2104ji r133 = r1.f9512u;
        r23.f5328s = r133;
        AbstractActivityC1244c3 r143 = r133.f7401m;
        r23.f5294C = true;
        if (r133 == null) goto L46;
        r02 = r133.f7400l;
    L46:
        if (r02 == null) goto L48;
        r23.f5294C = true;
    L48:
        C0326Hi r134 = r1.m5400a(r23);
        if (AbstractC2805zi.m5374G(2) == false) goto L62;
        r23.toString();
        Integer.toHexString(r6);
    L62:
        ViewGroup r112 = (ViewGroup) r11;
        C0369Ii r144 = AbstractC0412Ji.f1381a;
        AbstractC0412Ji.m855b(new C0240Fi(r23, "Attempting to use <fragment> tag to add fragment " + r23 + " to container " + r112));
        AbstractC0412Ji.m854a(r23).getClass();
        r23.f5295D = r112;
        r134.m704k();
        r134.m703j();
        View r113 = r23.f5296E;
        if (r113 == null) goto L72;
        if (r6 == 0) goto L67;
        r113.setId(r6);
    L67:
        if (r23.f5296E.getTag() != null) goto L69;
        r23.f5296E.setTag(r8);
    L69:
        r23.f5296E.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2238mi(this, r134));
        return r23.f5296E;
    L72:
        throw new IllegalStateException(AbstractC2374ph.m4814k("Fragment ", r122, " did not create a view."));
    L41:
        r132 = r3;
        goto L42
    L52:
        if (r23.f5323n == true) goto L74;
        r23.f5323n = true;
        r23.f5327r = r1;
        C2104ji r135 = r1.f9512u;
        r23.f5328s = r135;
        AbstractActivityC1244c3 r145 = r135.f7401m;
        r23.f5294C = true;
        if (r135 == null) goto L57;
        r02 = r135.f7400l;
    L57:
        if (r02 == null) goto L59;
        r23.f5294C = true;
    L59:
        r134 = r1.m5408f(r23);
        if (AbstractC2805zi.m5374G(2) == false) goto L62;
        r23.toString();
        Integer.toHexString(r6);
        goto L62
    L74:
        throw new IllegalArgumentException(r14.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(r6) + ", tag " + r8 + ", or parent id 0x" + Integer.toHexString(r3) + " with another fragment for " + r122);
    L30:
        r23 = null;
    L17:
        r22 = false;
    L75:
        return null;
    L5:
        return new FragmentContainerView(r13, r14, r1);
    }
}
