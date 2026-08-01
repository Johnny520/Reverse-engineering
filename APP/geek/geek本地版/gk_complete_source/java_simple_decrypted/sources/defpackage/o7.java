package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.ljx.wechatmod.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class o7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o7(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25) {
        switch(this.a) {
            case 0: goto L141;
            case 1: goto L16;
            default: goto L4;
        };
    L4:
        SearchView r1 = (SearchView) this.b;
        SearchView.SearchAutoComplete r2 = r1.p;
        View r3 = r1.x;
        if (r3.getWidth() <= 1) goto L184;
        Resources r4 = r1.getContext().getResources();
        int r5 = r1.r.getPaddingLeft();
        Rect r6 = new Rect();
        boolean r7 = cb0.a(r1);
        if (r1.M == false) goto L9;
        int r42 = r4.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + r4.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
    L10:
        r2.getDropDownBackground().getPadding(r6);
        if (r7 == false) goto L13;
        int r12 = -r6.left;
    L14:
        r2.setDropDownHorizontalOffset(r12);
        r2.setDropDownWidth((((r3.getWidth() + r6.left) + r6.right) + r42) - r5);
        return;
    L13:
        r12 = r5 - (r6.left + r42);
        goto L14
    L9:
        r42 = 0;
        goto L10
    L184:
        return;
    L16:
        ip.o("v", r17);
        r17.removeOnLayoutChangeListener(this);
        r17.setTag(2114650114, null);
        int r26 = r20 - r18;
        int r43 = r21 - r19;
        if (r26 <= 0) goto L185;
        if (r43 <= 0) goto L186;
        boolean r72 = false;
        boolean r52 = b50.B((String) this.b, "chattingui", false);
        Object r62 = r17.getParent();
        if ((r62 instanceof View) == false) goto L22;
        View r63 = (View) r62;
    L23:
        int r8 = 0;
    L24:
        int r9 = -1;
        String r10 = "";
        int r11 = 15;
        if (r63 == null) goto L41;
        if (r8 >= 15) goto L41;
        String r112 = r63.getClass().getName();
        "getName(...)";
        Locale r13 = Locale.ROOT;
        ip.n("ROOT", r13);
        String r113 = r112.toLowerCase(r13);
        ip.n("toLowerCase(...)", r113);
        if (r63.getId() == (-1)) goto L32;
        String r92 = r63.getContext().getResources().getResourceEntryName(r63.getId());     // Catch: Throwable -> L142
        ip.n("getResourceEntryName(...)", r92);     // Catch: Throwable -> L142
        "ROOT";     // Catch: Throwable -> L142
        String r93 = r92.toLowerCase(r13);     // Catch: Throwable -> L142
        ip.n("toLowerCase(...)", r93);     // Catch: Throwable -> L142
        r10 = r93;
    L32:
        if (b50.B(r10, "chatting", false) == false) goto L34;
    L35:
        r52 = true;
    L36:
        Object r64 = r63.getParent();
        if ((r64 instanceof View) == false) goto L39;
        r63 = (View) r64;
    L40:
        r8 = r8 + 1;
        goto L24
    L39:
        r63 = null;
        goto L40
    L34:
        if (b50.B(r113, "chatting", false) == false) goto L36;
    L41:
        Object r65 = r17.getParent();
        if ((r65 instanceof View) == false) goto L44;
        View r66 = (View) r65;
    L45:
        int r82 = 0;
    L47:
        if (r66 == null) goto L111;
        if (r82 >= r11) goto L111;
        String r14 = r66.getClass().getName();
        "getName(...)";
        Locale r32 = Locale.ROOT;
        ip.n("ROOT", r32);
        String r114 = r14.toLowerCase(r32);
        ip.n("toLowerCase(...)", r114);
        if (r66.getId() != r9) goto L147;
    L53:
        String r33 = "";
    L55:
        if (b50.B(r114, "emoji", false) == true) goto L110;
        if (b50.B(r33, "emoji", false) == true) goto L110;
        if (b50.B(r114, "smiley", false) == true) goto L110;
        if (b50.B(r33, "smiley", false) == true) goto L110;
        if (b50.B(r114, "emoticon", false) == true) goto L110;
        if (b50.B(r33, "emoticon", false) == true) goto L110;
        if (b50.B(r114, "keyboard", false) == true) goto L110;
        if (b50.B(r33, "input", false) == true) goto L110;
        if (r52 == true) goto L73;
    L105:
        Object r34 = r66.getParent();
        if ((r34 instanceof View) == false) goto L108;
        r66 = (View) r34;
    L109:
        r82 = r82 + 1;
        r9 = -1;
        r11 = 15;
        goto L47
    L108:
        r66 = null;
        goto L109
    L73:
        if (b50.B(r114, "quote", false) == true) goto L110;
        if (b50.B(r33, "quote", false) == true) goto L110;
        if (b50.B(r114, "reply", false) == true) goto L110;
        if (b50.B(r33, "reply", false) == true) goto L110;
        if (b50.B(r114, "panel", false) == true) goto L110;
        if (b50.B(r33, "panel", false) == true) goto L110;
        if (b50.B(r114, "footer", false) == true) goto L110;
        if (b50.B(r33, "footer", false) == true) goto L110;
        if (b50.B(r114, "bottom", false) == true) goto L110;
        if (b50.B(r33, "bottom", false) == true) goto L110;
        if (b50.B(r114, "grid", false) == true) goto L110;
        if (b50.B(r33, "grid", false) == true) goto L110;
        if (b50.B(r33, "chatting_content", false) == true) goto L110;
        if (b50.B(r33, "chatting_item_appmsg", false) == true) goto L110;
        if (b50.B(r33, "source", false) == true) goto L110;
        if (b50.B(r33, "card", false) == false) goto L105;
    L110:
        r17.setTag(2114650112, Boolean.FALSE);
        return;
    L147:
        String r142 = r66.getContext().getResources().getResourceEntryName(r66.getId());     // Catch: Throwable -> L143
        ip.n("getResourceEntryName(...)", r142);     // Catch: Throwable -> L143
        "ROOT";     // Catch: Throwable -> L143
        r33 = r142.toLowerCase(r32);     // Catch: Throwable -> L143
        ip.n("toLowerCase(...)", r33);     // Catch: Throwable -> L143
    L111:
        if (r52 == false) goto L113;
        float r35 = 34.0f;
    L115:
        if (Math.abs(r26 - r43) > 5) goto L138;
        float r27 = r26 / r17.getResources().getDisplayMetrics().density;
        if (r35 <= r27) goto L119;
    L137:
        r17.setTag(2114650112, Boolean.FALSE);
        return;
    L119:
        if (r27 > 85.0f) goto L137;
        r17.setTag(2114650112, Boolean.TRUE);
        String r28 = "key_rounded_avatar";
        ip.o("key", r28);
        gn.a.getClass();     // Catch: Throwable -> L123
        boolean r29 = gn.e(r28);     // Catch: Throwable -> L123
    L133:
        if (r29 == false) goto L188;
        ay r210 = dy.h;
        if (r210 == null) goto L189;
        r17.setOutlineProvider(r210);
        r17.setClipToOutline(true);
        r17.invalidateOutline();
        return;
    L189:
        return;
    L188:
        return;
    L123:
        gn r36 = gn.a;     // Catch: Throwable -> L144
        String r44 = String.valueOf(false);     // Catch: Throwable -> L144
        r36.getClass();     // Catch: Throwable -> L144
        String r211 = gn.d(r28, r44);     // Catch: Throwable -> L144
        if (r211.equals("true") == false) goto L127;
        Boolean r37 = Boolean.TRUE;     // Catch: Throwable -> L144
    L130:
        if (r37 == null) goto L132;
        r72 = r37.booleanValue();     // Catch: Throwable -> L144
        goto L132
    L127:
        if (r211.equals("false") == false) goto L129;
        r37 = Boolean.FALSE;     // Catch: Throwable -> L144
        goto L130
    L129:
        r37 = null;
    L132:
        r29 = r72;
        goto L133
    L138:
        r17.setTag(2114650112, Boolean.FALSE);
        return;
    L113:
        r35 = 12.0f;
        goto L115
    L44:
        r66 = null;
        goto L45
    L22:
        r63 = null;
        goto L23
    L186:
        return;
    L185:
        return;
    L141:
        throw null;
    }
}
