package p050c0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.Toast;
import androidx.emoji2.text.RunnableC0486k;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import org.luckypray.dexkit.C1031R;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0137c;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C0636Z extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0639a0 f1952c;

    public C0636Z() {
        this.f1951b = 0;
        this.f1952c = C0639a0.f1967a;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b r12) {
        switch(this.f1951b) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C0639a0 r1 = this.f1952c;
        Object[] r3 = r12.f2670c;
        AbstractC0307g.m702d(r3, "args");
        Object r32 = AbstractC0179j.m537n0(0, r3);
        if ((r32 instanceof Integer) == false) goto L8;
        Integer r33 = (Integer) r32;
    L9:
        if (r33 == null) goto L87;
        int r34 = r33.intValue();
        if (r34 == 658452) goto L14;
        if (r34 == 658453) goto L14;
        return;
    L14:
        Object[] r6 = r12.f2670c;
        AbstractC0307g.m702d(r6, "args");
        Object r62 = AbstractC0179j.m537n0(1, r6);
        if ((r62 instanceof Integer) == false) goto L17;
        Integer r63 = (Integer) r62;
    L18:
        if (r63 != null) goto L21;
        return;
    L21:
        if (r63.intValue() != (-1)) goto L92;
        Object[] r64 = r12.f2670c;
        AbstractC0307g.m702d(r64, "args");
        Object r4 = AbstractC0179j.m537n0(2, r64);
        if ((r4 instanceof Intent) == false) goto L26;
        Intent r42 = (Intent) r4;
    L27:
        if (r42 == null) goto L88;
        Uri r43 = r42.getData();
        if (r43 == null) goto L93;
        Object r122 = r12.f2669b;
        if ((r122 instanceof Activity) == false) goto L34;
        Activity r123 = (Activity) r122;
    L35:
        if (r123 == null) goto L94;
        if (r34 != 658453) goto L39;
        boolean r35 = true;
    L81:
        File r65 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK");     // Catch: Throwable -> L43
        if (r65.exists() == true) goto L46;
        r65.mkdirs();     // Catch: Throwable -> L43
    L46:
        if (r35 == false) goto L48;
        String r10 = "right.9.png";
    L49:
        File r8 = new File(r65, r10);     // Catch: Throwable -> L43
        InputStream r44 = r123.getContentResolver().openInputStream(r43);     // Catch: Throwable -> L43
        if (r44 != null) goto L84;
    L68:
        C0661h1 r45 = C0661h1.f2048a;     // Catch: Throwable -> L43
        if (r35 == false) goto L71;
        String r36 = "bubble_path_right";
    L72:
        String r66 = r8.getAbsolutePath();     // Catch: Throwable -> L43
        AbstractC0307g.m702d(r66, "getAbsolutePath(...)");     // Catch: Throwable -> L43
        r45.m1666f(r36, r66, false);     // Catch: Throwable -> L43
        r45.m1667g("bubble_enabled", true, false);     // Catch: Throwable -> L43
        ConcurrentHashMap r37 = AbstractC0626U.f1936a;     // Catch: Throwable -> L43
        String r38 = r8.getAbsolutePath();     // Catch: Throwable -> L43
        AbstractC0307g.m702d(r38, "getAbsolutePath(...)");     // Catch: Throwable -> L43
        AbstractC0626U.m1530c(r38);     // Catch: Throwable -> L43
        Toast.makeText(r123, "气泡皮肤导入成功！", 0).show();     // Catch: Throwable -> L43
        String r02 = "bubble imported: " + r8.getAbsolutePath();     // Catch: Throwable -> L43
        r1.getClass();     // Catch: Throwable -> L43
        C0639a0.m1601p0(r02);     // Catch: Throwable -> L43
        Object r03 = C0146l.f339a;     // Catch: Throwable -> L43
    L75:
        Throwable r04 = AbstractC0141g.m465a(r03);
        if (r04 == null) goto L89;
        String r2 = "bubble import fail: " + r04.getMessage();
        r1.getClass();
        C0639a0.m1601p0(r2);
        Toast.makeText(r123, "导入失败: " + r04.getMessage(), 0).show();
        return;
    L89:
        return;
    L71:
        r36 = "bubble_path_left";
        goto L72
    L84:
        FileOutputStream r67 = new FileOutputStream(r8);     // Catch: Throwable -> L57
        AbstractC0040p.m115t(r44, r67, 8192);     // Catch: Throwable -> L59
        AbstractC0040p.m108m(r67, null);     // Catch: Throwable -> L57
        AbstractC0040p.m108m(r44, null);     // Catch: Throwable -> L43
        goto L68
    L59:
        th = move-exception;
        throw th;     // Catch: Throwable -> L61
    L61:
        th = move-exception;
        AbstractC0040p.m108m(r67, th);     // Catch: Throwable -> L57
        throw th;     // Catch: Throwable -> L57
    L57:
        th = move-exception;
        throw th;     // Catch: Throwable -> L65
    L65:
        th = move-exception;
        AbstractC0040p.m108m(r44, th);     // Catch: Throwable -> L43
        throw th;     // Catch: Throwable -> L43
    L48:
        r10 = "left.9.png";
    L43:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L75
    L39:
        r35 = false;
        goto L81
    L94:
        return;
    L34:
        r123 = null;
        goto L35
    L93:
        return;
    L88:
        return;
    L26:
        r42 = null;
        goto L27
    L92:
        return;
    L17:
        r63 = null;
        goto L18
    L87:
        return;
    L8:
        r33 = null;
        goto L9
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b r15) {
        int r02 = 1;
        int r1 = 0;
        switch(this.f1951b) {
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        Object r2 = r15.f2669b;
        View r4 = null;
        if ((r2 instanceof View) == false) goto L8;
        View r22 = (View) r2;
    L9:
        if (r22 == null) goto L118;
        Object[] r3 = r15.f2670c;
        AbstractC0307g.m702d(r3, "args");
        Object r32 = AbstractC0179j.m537n0(0, r3);
        if ((r32 instanceof MotionEvent) == false) goto L14;
        MotionEvent r33 = (MotionEvent) r32;
    L15:
        if (r33 == null) goto L119;
        Object r5 = r22.getTag(C1031R.id.abc_tag_message_object);
        if (r5 == null) goto L120;
        this.f1952c.getClass();
        C0686q r6 = C0683p.m1753a();
        if (r6.f2151g == false) goto L121;
        Object r8 = r22.getTag(C1031R.id.abc_tag_swipe_state);
        if ((r8 instanceof C0632X) == false) goto L26;
        C0632X r82 = (C0632X) r8;
    L27:
        int r9 = r33.getActionMasked();
        if (r9 == 0) goto L114;
        float r12 = 0.0f;
        if (r9 == 1) goto L62;
        if (r9 != 2) goto L33;
        if (r82 == null) goto L123;
        float r13 = r33.getRawX() - r82.f1944a;
        float r34 = r33.getRawY() - r82.f1945b;
        if (r82.f1947d == true) goto L51;
        int r42 = r82.f1946c;
        boolean r52 = r6.f2151g;
        if (Math.abs(r13) <= Math.max(4.0f, r42 * 0.75f)) goto L51;
        if (Math.abs(r13) <= Math.abs(r34)) goto L51;
        if (r13 >= 0.0f) goto L51;
        if (r52 == false) goto L51;
        r82.f1947d = true;
        ViewParent r35 = r22.getParent();
        if (r35 == null) goto L51;
        r35.requestDisallowInterceptTouchEvent(true);
    L51:
        if (r82.f1947d == false) goto L116;
        Context r03 = r22.getContext();
        AbstractC0307g.m702d(r03, "getContext(...)");
        float r04 = C0639a0.m1607u(r03, 120);
        if (r6.f2151g == true) goto L58;
        if (r13 >= 0.0f) goto L58;
        r13 = 0.0f;
    L58:
        if (r13 > 0.0f) goto L61;
        r12 = r13;
    L61:
        r22.setTranslationX(Math.max(-r04, Math.min(r04, r12)));
    L113:
        r15.m1946c(Boolean.TRUE);
        return;
    L116:
        return;
    L123:
        return;
    L33:
        if (r9 == 3) goto L62;
        return;
    L62:
        if (r82 == null) goto L124;
        r22.setTag(C1031R.id.abc_tag_swipe_state, null);
        ViewParent r7 = r22.getParent();
        if (r7 == null) goto L68;
        r7.requestDisallowInterceptTouchEvent(false);
    L68:
        if (r82.f1947d == false) goto L125;
        float r72 = r33.getRawX() - r82.f1944a;
        if (r33.getActionMasked() != 1) goto L112;
        Context r36 = r22.getContext();
        AbstractC0307g.m702d(r36, "getContext(...)");
        int r37 = C0639a0.m1607u(r36, 32);
        boolean r62 = r6.f2151g;
        if (r72 >= (-r37)) goto L76;
        if (r62 == false) goto L76;
        EnumC0640a1 r38 = EnumC0640a1.f1994b;
    L77:
        int r39 = r38.ordinal();
        if (r39 == 0) goto L112;
        if (r39 == 1) goto L96;
        if (r39 != 2) goto L95;
        C0639a0.m1601p0("right swipe repeat delta=" + ((int) r72));
        if (C0639a0.m1563T(C0639a0.f1961A, r5, "ChatFooter") == true) goto L112;
        if (C0639a0.m1563T(C0639a0.f1962B, r5, "quoteComponent") == true) goto L112;
        if (C0639a0.m1562S(r5) == false) goto L90;
    L93:
        C0639a0.m1601p0("right swipe fallback to quote for ".concat(r5.getClass().getName()));
        goto L112
    L90:
        if (C0639a0.m1561R(r5) == true) goto L93;
        C0639a0.m1601p0("right swipe repeat not ready for ".concat(r5.getClass().getName()));
        goto L112
    L95:
        throw new C0137c();
    L96:
        C0639a0.m1601p0("left swipe quote delta=" + ((int) r72));
        Object r310 = C0639a0.m1587i0(r22, r5);
        Object r53 = C0639a0.f1961A;
        if ((r53 instanceof View) == false) goto L99;
        r4 = (View) r53;
    L99:
        C0670k1 r54 = C0670k1.f2084a;
        if (C0670k1.m1689k(C0670k1.m1681c(), "swipe.quote.prepare") == false) goto L104;
        if (r4 == null) goto L104;
        r4.post(new RunnableC0486k(r310, r4, r22, r02));
    L104:
        if (C0639a0.m1562S(r310) == true) goto L112;
        if (C0639a0.m1561R(r310) == true) goto L112;
        if (r4 == null) goto L111;
        r4.post(new RunnableC0603L(r1, r22, r310));
        goto L112
    L111:
        C0639a0.m1601p0("left swipe quote target not ready for ".concat(r310.getClass().getName()));
    L76:
        r38 = EnumC0640a1.f1993a;
    L112:
        r22.animate().translationX(0.0f).setDuration(180).start();
        goto L113
    L125:
        return;
    L124:
        return;
    L114:
        r22.animate().cancel();
        r22.setTag(C1031R.id.abc_tag_swipe_state, new C0632X(r33.getRawX(), r33.getRawY(), ViewConfiguration.get(r22.getContext()).getScaledTouchSlop()));
        return;
    L26:
        r82 = null;
        goto L27
    L121:
        return;
    L120:
        return;
    L119:
        return;
    L14:
        r33 = null;
        goto L15
    L118:
        return;
    L8:
        r22 = null;
        goto L9
    }

    public C0636Z(C0639a0 r2) {
        this.f1951b = 1;
        this.f1952c = r2;
    }
}
