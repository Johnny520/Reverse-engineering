package top.suzhelan.qstory.hook.item.chat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p303.AbstractC9234;
import p405.AbstractC9919;
import p405.C9915;
import p405.C9917;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6682 extends ClickableSpan {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f16357;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f16358;

    public C6682(String str, String str2) {
        AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵");
        str.getClass();
        AbstractC9234.m14531(2121);
        this.f16358 = str;
        this.f16357 = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        AbstractC9234.m14532("喵喵喵喵喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜喵喵喵");
        view.getClass();
        String str = this.f16358;
        String uinFromUid = QQEnvTool.getUinFromUid(str);
        Class clsM15228 = AbstractC9919.m15228(AbstractC9234.m14531(2122));
        clsM15228.getClass();
        Object objM15226 = C9917.m15226(clsM15228, uinFromUid, 20);
        C9915.m15223(objM15226, AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵"), str);
        String strM14531 = AbstractC9234.m14531(2121);
        String str2 = this.f16357;
        C9915.m15223(objM15226, strM14531, str2);
        C9915.m15223(objM15226, AbstractC9234.m14531(2123), str2);
        C9915.m15223(objM15226, AbstractC9234.m14531(2124), 1);
        C9915.m15223(objM15226, AbstractC9234.m14531(2125), 11);
        String strM14532 = AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜呜");
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC9234.m14531(2126), 1);
        bundle.putInt(AbstractC9234.m14531(2127), 11);
        C9915.m15223(objM15226, strM14532, bundle);
        Intent intent = new Intent();
        intent.setClassName(view.getContext(), AbstractC9234.m14531(2047));
        intent.putExtra(AbstractC9234.m14531(2128), str);
        intent.putExtra(AbstractC9234.m14531(2121), str2);
        String strM145312 = AbstractC9234.m14531(2129);
        AbstractC9234.m14531(2130);
        intent.putExtra(strM145312, (Parcelable) objM15226);
        intent.addFlags(268435456);
        view.getContext().startActivity(intent);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵喵喵呜呜喵");
        textPaint.getClass();
        super.updateDrawState(textPaint);
        textPaint.setColor(Color.parseColor(AbstractC9234.m14532("喵呜喵呜喵喵喵喵~喵呜喵喵喵呜喵喵~喵喵呜呜呜呜呜呜~喵呜喵呜喵喵喵喵~喵呜喵呜呜呜喵呜~喵喵呜喵呜喵喵呜~喵呜喵呜喵呜喵喵")));
        textPaint.setUnderlineText(false);
    }
}
