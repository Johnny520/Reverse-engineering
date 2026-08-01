package defpackage;

import android.app.C0000;
import android.os.Handler;
import android.support.v4.graphics.drawable.C0004;
import androidx.activity.result.C0008;
import androidx.appcompat.app.C0012;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0019;
import androidx.constraintlayout.widget.C0020;
import androidx.coordinatorlayout.widget.C0022;
import androidx.legacy.content.C0028;
import androidx.lifecycle.C0029;
import androidx.profileinstaller.C0031;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0041;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.C0047;
import com.github.megatronking.stringfog.C0048;
import com.github.megatronking.stringfog.annotation.C0044;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.carousel.C0054;
import com.google.android.material.carousel.C0055;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.theme.C0062;
import com.ljx.wechatmod.ui.C0067;
import de.robv.android.xposed.XposedHelpers;
import io.fastkv.C0068;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class y30 extends m50 implements wm {
    public int e;
    public Iterator f;
    public String g;
    public Object h;
    public long i;
    public int j;
    public final i00 k;
    public final ClassLoader l;

    public y30(i00 r4, ClassLoader r5, ld r6) {
        this.k = r4;
        this.l = r5;
        super(r6);
        Integer r1 = null;
        int r0 = C0028.m114("ۨۤۥ");
    L3:
        switch(r0) {
            case 56412: goto L5;
            case 1747930: goto L18;
            case 1749790: goto L17;
            case 1751525: goto L19;
            case 1752460: goto L13;
            case 1755497: goto L7;
            default: goto L3;
        };
    L5:
        r1 = Integer.decode(C0029.m119("Vh"));
        r0 = C0048.m193("ۢۦۢ");
        goto L3
    L7:
        if (C0054.m217() < 0) goto L13;
        if ((C0008.f8 * (C0060.f60 % (-9644))) >= 0) goto L10;
        r0 = (C0020.f20 + C0012.f12) + 56551;
        goto L3
    L10:
        C0062.f62 = 65;
        r0 = C0059.m239("۠ۨۢ");
    L13:
        if (C0038.f38 >= 0) goto L14;
        r0 = (C0018.f18 - C0000.f0) ^ (-1751210);
        goto L3
    L14:
        C0046.m185();
        String r02 = "ۣ۠۟";
    L15:
        r0 = C0058.m234(r02);
        goto L3
    L17:
        System.out.println(r1);
        r02 = "ۤ۠ۡ";
        goto L15
    L18:
        r0 = (C0004.f4 % C0022.f22) ^ (-1756155);
        goto L3
    }

    @Override // defpackage.m50
    public final ld a(ld r4) {
        int r0 = C0043.m173("ۡۢ۠");
    L3:
        switch(r0) {
            case 1748703: goto L6;
            case 1750564: goto L8;
            default: goto L3;
        };
    L6:
        return new y30(this.k, this.l, r4);
    L8:
        if (C0019.f19 <= 0) goto L9;
        r0 = (C0031.f31 ^ C0044.f44) + 1748969;
        goto L3
    L9:
        C0041.m167();
        r0 = C0020.m80("ۢۧۤ");
        goto L3
    }

    @Override // defpackage.wm
    public final Object e(Object r3, Object r4) {
        int r0 = C0068.m272("ۧۧۨ");
    L3:
        switch(r0) {
            case 1748738: goto L5;
            case 1749732: goto L11;
            case 1754632: goto L6;
            default: goto L3;
        };
    L5:
        r0 = (C0048.f48 ^ C0055.f55) + 1755492;
        goto L3
    L6:
        oe r02 = (oe) r3;
        if (C0047.m191() < 0) goto L9;
        C0062.m248();
    L9:
        r0 = C0067.m271("ۢۤۦ");
        goto L3
    L11:
        return ((y30) a((ld) r4)).g(vh.n);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00f9 -> B:11:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x02a1 -> B:7:0x0027). Please report as a decompilation issue!!! */
    @Override // defpackage.m50
    public final Object g(Object r17) {
        int r2 = this.j;
        ClassLoader r11 = this.l;
        if (r2 == 0) goto L34;
        if (r2 != 1) goto L33;
        long r8 = this.i;
        int r4 = this.e;
        Object r22 = this.h;
        String r5 = this.g;
        Iterator r3 = this.f;
        ct.y(r17);     // Catch: Throwable -> L87
        String r7 = r5;
    L7:
        Handler r52 = uv.a;     // Catch: Throwable -> L87
        ip.l(r22);     // Catch: Throwable -> L87
        uv.d(r11, r22);     // Catch: Throwable -> L87
        ip.o("tag", "SnsAutoLike");     // Catch: Throwable -> L87
        ip.o("msg", "❤️ 发包成功 -> " + r7 + " (SnsId: " + r8 + ")");     // Catch: Throwable -> L87
        int r23 = ((r4 + 16) + 1) - 16;
        new Integer(r4);     // Catch: Throwable -> L73
        r4 = r23;
        Iterator r53 = r3;
    L12:
        if (r53.hasNext() == false) goto L80;
        Object r6 = r53.next();
        ip.n("next(...)", r6);
        r8 = XposedHelpers.getLongField(r6, pb0.s1);     // Catch: Throwable -> L78
        Object r24 = XposedHelpers.getObjectField(r6, "Username");     // Catch: Throwable -> L78
        if ((r24 instanceof String) == false) goto L35;
        r7 = (String) r24;     // Catch: Throwable -> L78
    L17:
        if (r7 == null) goto L12;
        String r12 = t6.a;     // Catch: Throwable -> L78
        if (r7.equals(r12) == true) goto L12;
        gn r25 = gn.a;     // Catch: Throwable -> L78
        String r32 = "key_sns_like_blacklist";     // Catch: Throwable -> L78
        r25.getClass();     // Catch: Throwable -> L78
        List r26 = b50.M(gn.d(r32, ""), new String[]{","});     // Catch: Throwable -> L29
        ArrayList r13 = new ArrayList();     // Catch: Throwable -> L29
        Iterator r14 = r26.iterator();     // Catch: Throwable -> L29
    L23:
        if (r14.hasNext() == false) goto L37;
        Object r33 = r14.next();     // Catch: Throwable -> L29
        if (b50.H((String) r33) == true) goto L23;
        r13.add(r33);     // Catch: Throwable -> L29
        goto L23
    L37:
        if (r13.contains(r7) == true) goto L12;
        Object r27 = XposedHelpers.getObjectField(r6, "LikeUserList");     // Catch: Throwable -> L53
        if ((r27 instanceof LinkedList) == false) goto L51;
        LinkedList r28 = (LinkedList) r27;     // Catch: Throwable -> L53
    L41:
        if (r28 == null) goto L55;
        Iterator r34 = r28.iterator();     // Catch: Throwable -> L53
        ip.n("iterator(...)", r34);     // Catch: Throwable -> L53
    L44:
        if (r34.hasNext() == false) goto L55;
        Object r29 = XposedHelpers.getObjectField(r34.next(), pb0.x1);     // Catch: Throwable -> L53
        if ((r29 instanceof String) == false) goto L52;
        String r210 = (String) r29;     // Catch: Throwable -> L53
    L49:
        if (ip.i(r210, r12) == false) goto L44;
    L52:
        r210 = null;
    L55:
        Object r211 = XposedHelpers.findClass(pb0.f1, r11).newInstance();     // Catch: Throwable -> L29
        XposedHelpers.setObjectField(r211, "d", r12);     // Catch: Throwable -> L29
        XposedHelpers.setObjectField(r211, "e", r7);     // Catch: Throwable -> L29
        XposedHelpers.setIntField(r211, pb0.w1, 1);     // Catch: Throwable -> L78
        XposedHelpers.setIntField(r211, "n", 0);     // Catch: Throwable -> L83
    L61:
        Object r35 = XposedHelpers.findClass(pb0.v1, r11).newInstance();     // Catch: Throwable -> L29
        XposedHelpers.setLongField(r35, "d", r8);     // Catch: Throwable -> L29
        XposedHelpers.setObjectField(r35, "f", r211);     // Catch: Throwable -> L29
        Class r62 = XposedHelpers.findClass(pb0.u1, r11);     // Catch: Throwable -> L29
        sm r212 = pb0.y1;     // Catch: Throwable -> L29
        ip.l(r35);     // Catch: Throwable -> L29
        Object[] r213 = (Object[]) r212.f(r35);     // Catch: Throwable -> L29
        Object r63 = XposedHelpers.newInstance(r62, Arrays.copyOf(r213, r213.length));     // Catch: Throwable -> L29
        hp r214 = new hp(1500, 3500, 1);     // Catch: Throwable -> L78
        m r36 = az.a;     // Catch: Throwable -> L29
        long r215 = ct.u(r214);     // Catch: Throwable -> L29 IllegalArgumentException -> L75
        this.f = r53;     // Catch: Throwable -> L29
        this.g = r7;     // Catch: Throwable -> L29
        this.h = r63;     // Catch: Throwable -> L29
        this.e = r4;     // Catch: Throwable -> L29
        this.i = r8;     // Catch: Throwable -> L29
        this.j = 1;     // Catch: Throwable -> L78
        Object r37 = ff.n(r215, this);     // Catch: Throwable -> L78
        pe r216 = pe.a;
        if (r37 != r216) goto L89;
        return r216;
    L89:
        r22 = r63;
        r3 = r53;
        goto L7
    L75:
        e = move-exception;
        throw new NoSuchElementException(e.getMessage());     // Catch: Throwable -> L78
    L51:
        r28 = null;
        goto L41
    L54:
        ip.o("tag", "SnsAutoLike_CheckList");     // Catch: Throwable -> L29
        "e";     // Catch: Throwable -> L29
    L29:
        th = th;
        r23 = r4;
        r3 = r53;
    L31:
        ip.o(z30.k("xwGO\n", "s2Dpd1+FjZU=\n", "SnsAutoLike_Crash", "53vj\n", "igiEy7e+YPk=\n"), "执行异常: ".concat(ip.W(th)));
        r4 = r23;
        r53 = r3;
        goto L12
    L35:
        r7 = null;
    L78:
        th = th;
        r3 = r53;
        r23 = r4;
        goto L31
    L80:
        if (r4 <= 0) goto L123;
        ip.o(z30.k("xwGO\n", "s2Dpd1+FjZU=\n", "SnsAutoLike", "53vj\n", "igiEy7e+YPk=\n"), "✅ 本次共自动点赞 " + r4 + " 条。");
    L123:
        return vh.n;
    L73:
        th = move-exception;
        th = th;
    L87:
        th = th;
        r23 = r4;
        goto L31
    L33:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L34:
        ct.y(r17);
        Iterator r217 = ((LinkedList) this.k.b).iterator();
        ip.n("iterator(...)", r217);
        r4 = 0;
        r53 = r217;
        goto L12
    }
}
