package top.suzhelan.qstory.hook.item.chat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import lin.xposed.hook.util.qq.QQEnvTool;
import p287.AbstractC8405;
import p389.AbstractC9090;
import p389.C9086;
import p389.C9088;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5852 extends ClickableSpan {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f16012;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f16013;

    public C5852(String str, String str2) {
        AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵");
        str.getClass();
        AbstractC8405.m13972(2121);
        this.f16013 = str;
        this.f16012 = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        AbstractC8405.m13973("喵喵喵喵喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜喵喵喵");
        view.getClass();
        String str = this.f16013;
        String uinFromUid = QQEnvTool.getUinFromUid(str);
        Class clsM14669 = AbstractC9090.m14669(AbstractC8405.m13972(2122));
        clsM14669.getClass();
        Object objM14667 = C9088.m14667(clsM14669, uinFromUid, 20);
        C9086.m14664(objM14667, AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵"), str);
        String strM13972 = AbstractC8405.m13972(2121);
        String str2 = this.f16012;
        C9086.m14664(objM14667, strM13972, str2);
        C9086.m14664(objM14667, AbstractC8405.m13972(2123), str2);
        C9086.m14664(objM14667, AbstractC8405.m13972(2124), 1);
        C9086.m14664(objM14667, AbstractC8405.m13972(2125), 11);
        String strM13973 = AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜呜");
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC8405.m13972(2126), 1);
        bundle.putInt(AbstractC8405.m13972(2127), 11);
        C9086.m14664(objM14667, strM13973, bundle);
        Intent intent = new Intent();
        intent.setClassName(view.getContext(), AbstractC8405.m13972(2047));
        intent.putExtra(AbstractC8405.m13972(2128), str);
        intent.putExtra(AbstractC8405.m13972(2121), str2);
        String strM139722 = AbstractC8405.m13972(2129);
        AbstractC8405.m13972(2130);
        intent.putExtra(strM139722, (Parcelable) objM14667);
        intent.addFlags(268435456);
        view.getContext().startActivity(intent);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵喵喵呜呜喵");
        textPaint.getClass();
        super.updateDrawState(textPaint);
        textPaint.setColor(Color.parseColor(AbstractC8405.m13973("喵呜喵呜喵喵喵喵~喵呜喵喵喵呜喵喵~喵喵呜呜呜呜呜呜~喵呜喵呜喵喵喵喵~喵呜喵呜呜呜喵呜~喵喵呜喵呜喵喵呜~喵呜喵呜喵呜喵喵")));
        textPaint.setUnderlineText(false);
    }
}
