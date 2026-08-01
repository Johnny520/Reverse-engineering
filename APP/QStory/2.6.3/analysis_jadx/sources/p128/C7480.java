package p128;

import android.animation.ObjectAnimator;
import android.view.View;
import com.davemorrissey.labs.subscaleview.R;
import java.util.HashMap;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7480 extends AbstractC7483 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final String[] f20236 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final int f20237;

    public C7480() {
        this.f20237 = 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p128.C7461 m12698(p128.C7469 r8, p128.C7469 r9) {
        /*
            飘花落叶言子兰世哲楪苏.飘花落叶言子世楪苏哲兰 r0 = new 飘花落叶言子兰世哲楪苏.飘花落叶言子世楪苏哲兰
            r0.<init>()
            r1 = 0
            r0.f20183 = r1
            r0.f20182 = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f20210
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f20181 = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f20179 = r6
            goto L33
        L2f:
            r0.f20181 = r3
            r0.f20179 = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f20210
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f20180 = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f20178 = r2
            goto L56
        L52:
            r0.f20180 = r3
            r0.f20178 = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f20181
            int r9 = r0.f20180
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f20179
            android.view.ViewGroup r4 = r0.f20178
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f20182 = r1
            r0.f20183 = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f20182 = r2
            r0.f20183 = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f20178
            if (r8 != 0) goto L81
            r0.f20182 = r1
            r0.f20183 = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f20179
            if (r8 != 0) goto L9f
            r0.f20182 = r2
            r0.f20183 = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f20180
            if (r8 != 0) goto L95
            r0.f20182 = r2
            r0.f20183 = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f20181
            if (r8 != 0) goto L9f
            r0.f20182 = r1
            r0.f20183 = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p128.C7480.m12698(飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲, 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲):飘花落叶言子兰世哲楪苏.飘花落叶言子世楪苏哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static void m12699(C7469 c7469) {
        View view = c7469.f20209;
        int visibility = view.getVisibility();
        HashMap map = c7469.f20210;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static float m12700(C7469 c7469, float f) {
        Float f2;
        return (c7469 == null || (f2 = (Float) c7469.f20210.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final ObjectAnimator m12701(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC7468.f20207.mo12694(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC7468.f20206, f2);
        C7481 c7481 = new C7481(view);
        objectAnimatorOfFloat.addListener(c7481);
        m12713().m12710(c7481);
        return objectAnimatorOfFloat;
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12661(C7469 c7469) {
        m12699(c7469);
        View view = c7469.f20209;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC7468.f20207.mo12695(view)) : Float.valueOf(0.0f);
        }
        c7469.f20210.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo12662(C7469 c7469) {
        m12699(c7469);
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final String[] mo12663() {
        return f20236;
    }

    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean mo12702(C7469 c7469, C7469 c74692) {
        if (c7469 == null && c74692 == null) {
            return false;
        }
        if (c7469 != null && c74692 != null && c74692.f20210.containsKey("android:visibility:visibility") != c7469.f20210.containsKey("android:visibility:visibility")) {
            return false;
        }
        C7461 c7461M12698 = m12698(c7469, c74692);
        if (c7461M12698.f20183) {
            return c7461M12698.f20181 == 0 || c7461M12698.f20180 == 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (m12698(m12715(r3, false), m12711(r3, false)).f20183 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    @Override // p128.AbstractC7483
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator mo12664(android.view.ViewGroup r25, p128.C7469 r26, p128.C7469 r27) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p128.C7480.mo12664(android.view.ViewGroup, 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲, 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲):android.animation.Animator");
    }

    public C7480(int i) {
        this();
        this.f20237 = i;
    }
}
