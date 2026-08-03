package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: jd */
/* JADX INFO: loaded from: classes.dex */
public final class C2099jd extends AbstractC0047B3 {

    /* JADX INFO: renamed from: c */
    public final boolean f7386c;

    /* JADX INFO: renamed from: d */
    public boolean f7387d;

    /* JADX INFO: renamed from: e */
    public C0649P3 f7388e;

    public C2099jd(C0557My r1, C0609O6 r2, boolean r3) {
        super(r1, r2);
        this.f7386c = r3;
    }

    /* JADX INFO: renamed from: o */
    public final C0649P3 m4293o(Context r9) {
        if (this.f7387d == true) goto L5;
        C0557My r0 = (C0557My) this.f96a;
        AbstractComponentCallbacksC1503hi r1 = r0.f1827c;
        if (r0.f1825a != 2) goto L9;
        boolean r02 = true;
    L10:
        C1415fi r2 = r1.f5299H;
        if (r2 != null) goto L13;
        int r5 = 0;
    L15:
        if (this.f7386c == false) goto L23;
        if (r02 == false) goto L20;
        if (r2 != null) goto L19;
    L18:
        int r22 = 0;
    L30:
        r1.m2866A(0, 0, 0, 0);
        ViewGroup r3 = r1.f5295D;
        C0649P3 r6 = null;
        if (r3 != null) goto L33;
    L35:
        ViewGroup r12 = r1.f5295D;
        if (r12 != null) goto L38;
    L40:
        if (r22 != 0) goto L69;
        if (r5 == 0) goto L69;
        if (r5 != 4097) goto L45;
        if (r02 == false) goto L68;
        int r03 = R.animator.fragment_open_enter;
    L53:
        r22 = r03;
        goto L69
    L68:
        r03 = R.animator.fragment_open_exit;
        goto L53
    L45:
        if (r5 != 8194) goto L47;
        if (r02 == false) goto L65;
        r03 = R.animator.fragment_close_enter;
        goto L53
    L65:
        r03 = R.animator.fragment_close_exit;
        goto L53
    L47:
        if (r5 != 8197) goto L49;
        if (r02 == false) goto L62;
        r03 = AbstractC0295Gu.m603D(r9, android.R.attr.activityCloseEnterAnimation);
        goto L53
    L62:
        r03 = AbstractC0295Gu.m603D(r9, android.R.attr.activityCloseExitAnimation);
        goto L53
    L49:
        if (r5 != 4099) goto L51;
        if (r02 == false) goto L59;
        r03 = R.animator.fragment_fade_enter;
        goto L53
    L59:
        r03 = R.animator.fragment_fade_exit;
        goto L53
    L51:
        if (r5 == 4100) goto L54;
        r03 = -1;
        goto L53
    L54:
        if (r02 == false) goto L56;
        r03 = AbstractC0295Gu.m603D(r9, android.R.attr.activityOpenEnterAnimation);
        goto L53
    L56:
        r03 = AbstractC0295Gu.m603D(r9, android.R.attr.activityOpenExitAnimation);
    L69:
        if (r22 == 0) goto L88;
        boolean r04 = "anim".equals(r9.getResources().getResourceTypeName(r22));
        if (r04 == true) goto L93;
    L91:
        Animator r13 = AnimatorInflater.loadAnimator(r9, r22);     // Catch: RuntimeException -> L82
        if (r13 == null) goto L88;
        C0649P3 r32 = new C0649P3(r13);     // Catch: RuntimeException -> L82
    L75:
        r6 = r32;
    L82:
        e = move-exception;
        if (r04 == true) goto L87;
        Animation r92 = AnimationUtils.loadAnimation(r9, r22);
        if (r92 == null) goto L88;
        r6 = new C0649P3(r92);
        goto L88
    L87:
        throw e;
    L93:
        Animation r14 = AnimationUtils.loadAnimation(r9, r22);     // Catch: Resources.NotFoundException -> L76 RuntimeException -> L90
        if (r14 == null) goto L88;
        r32 = new C0649P3(r14);     // Catch: Resources.NotFoundException -> L76 RuntimeException -> L90
    L76:
        e = move-exception;
        throw e;
    L88:
        this.f7388e = r6;
        this.f7387d = true;
        return r6;
    L38:
        if (r12.getLayoutTransition() == null) goto L40;
    L33:
        if (r3.getTag(R.id.visible_removing_fragment_view_tag) == null) goto L35;
        r1.f5295D.setTag(R.id.visible_removing_fragment_view_tag, null);
        goto L35
    L19:
        r22 = r2.f5000d;
        goto L30
    L20:
        if (r2 == null) goto L18;
        r22 = r2.f5001e;
        goto L30
    L23:
        if (r02 == false) goto L27;
        if (r2 == null) goto L18;
        r22 = r2.f4998b;
        goto L30
    L27:
        if (r2 == null) goto L18;
        r22 = r2.f4999c;
        goto L30
    L13:
        r5 = r2.f5002f;
        goto L15
    L9:
        r02 = false;
        goto L10
    L5:
        return this.f7388e;
    }
}
