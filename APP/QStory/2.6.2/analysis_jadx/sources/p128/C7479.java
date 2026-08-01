package p128;

import android.animation.ObjectAnimator;
import android.view.View;
import com.davemorrissey.labs.subscaleview.R;
import java.util.HashMap;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7479 extends AbstractC7482 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final String[] f20241 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final int f20242;

    public C7479() {
        this.f20242 = 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p128.C7460 m12669(p128.C7468 r8, p128.C7468 r9) {
        /*
            飘花落叶言子兰世哲楪苏.飘花落叶言子世楪苏哲兰 r0 = new 飘花落叶言子兰世哲楪苏.飘花落叶言子世楪苏哲兰
            r0.<init>()
            r1 = 0
            r0.f20188 = r1
            r0.f20187 = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f20215
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f20186 = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f20184 = r6
            goto L33
        L2f:
            r0.f20186 = r3
            r0.f20184 = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f20215
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f20185 = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f20183 = r2
            goto L56
        L52:
            r0.f20185 = r3
            r0.f20183 = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f20186
            int r9 = r0.f20185
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f20184
            android.view.ViewGroup r4 = r0.f20183
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f20187 = r1
            r0.f20188 = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f20187 = r2
            r0.f20188 = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f20183
            if (r8 != 0) goto L81
            r0.f20187 = r1
            r0.f20188 = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f20184
            if (r8 != 0) goto L9f
            r0.f20187 = r2
            r0.f20188 = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f20185
            if (r8 != 0) goto L95
            r0.f20187 = r2
            r0.f20188 = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f20186
            if (r8 != 0) goto L9f
            r0.f20187 = r1
            r0.f20188 = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p128.C7479.m12669(飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲, 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲):飘花落叶言子兰世哲楪苏.飘花落叶言子世楪苏哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static void m12670(C7468 c7468) {
        View view = c7468.f20214;
        int visibility = view.getVisibility();
        HashMap map = c7468.f20215;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static float m12671(C7468 c7468, float f) {
        Float f2;
        return (c7468 == null || (f2 = (Float) c7468.f20215.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final ObjectAnimator m12672(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC7467.f20212.mo9904(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC7467.f20211, f2);
        C7480 c7480 = new C7480(view);
        objectAnimatorOfFloat.addListener(c7480);
        m12684().m12681(c7480);
        return objectAnimatorOfFloat;
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12634(C7468 c7468) {
        m12670(c7468);
        View view = c7468.f20214;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC7467.f20212.mo9908(view)) : Float.valueOf(0.0f);
        }
        c7468.f20215.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo12635(C7468 c7468) {
        m12670(c7468);
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final String[] mo12636() {
        return f20241;
    }

    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean mo12673(C7468 c7468, C7468 c74682) {
        if (c7468 == null && c74682 == null) {
            return false;
        }
        if (c7468 != null && c74682 != null && c74682.f20215.containsKey("android:visibility:visibility") != c7468.f20215.containsKey("android:visibility:visibility")) {
            return false;
        }
        C7460 c7460M12669 = m12669(c7468, c74682);
        if (c7460M12669.f20188) {
            return c7460M12669.f20186 == 0 || c7460M12669.f20185 == 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (m12669(m12686(r3, false), m12682(r3, false)).f20188 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    @Override // p128.AbstractC7482
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator mo12637(android.view.ViewGroup r25, p128.C7468 r26, p128.C7468 r27) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p128.C7479.mo12637(android.view.ViewGroup, 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲, 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世苏哲):android.animation.Animator");
    }

    public C7479(int i) {
        this();
        this.f20242 = i;
    }
}
