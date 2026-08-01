package top.suzhelan.qstory.hook.item.chat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bumptech.glide.AbstractC3056;
import lin.xposed.hook.util.qq.QQEnvTool;
import p007.AbstractC6136;
import p392.AbstractC9121;
import p392.C9117;
import p392.C9119;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5847 extends ClickableSpan {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f16005;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f16006;

    public C5847(String str, String str2) {
        AbstractC6136.m11546(-3937636127411013031L, -3937774549911995815L, str);
        this.f16006 = str;
        this.f16005 = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        AbstractC3056.m6668(-3937774554206963111L);
        view.getClass();
        String str = this.f16006;
        String uinFromUid = QQEnvTool.getUinFromUid(str);
        Class clsM14657 = AbstractC9121.m14657(AbstractC3056.m6668(-3937774481192519079L));
        clsM14657.getClass();
        Object objM14655 = C9119.m14655(clsM14657, uinFromUid, 20);
        C9117.m14650(objM14655, AbstractC3056.m6668(-3937636127411013031L), str);
        String strM6668 = AbstractC3056.m6668(-3937774549911995815L);
        String str2 = this.f16005;
        C9117.m14650(objM14655, strM6668, str2);
        C9117.m14650(objM14655, AbstractC3056.m6668(-3937774270739121575L), str2);
        C9117.m14650(objM14655, AbstractC3056.m6668(-3937774279329056167L), 1);
        C9117.m14650(objM14655, AbstractC3056.m6668(-3937774214904546727L), 11);
        String strM66682 = AbstractC3056.m6668(-3937774163364939175L);
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC3056.m6668(-3937774055990756775L), 1);
        bundle.putInt(AbstractC3056.m6668(-3937773970091410855L), 11);
        C9117.m14650(objM14655, strM66682, bundle);
        Intent intent = new Intent();
        intent.setClassName(view.getContext(), AbstractC3056.m6668(-3937767622129747367L));
        intent.putExtra(AbstractC3056.m6668(-3937773965796443559L), str);
        intent.putExtra(AbstractC3056.m6668(-3937774549911995815L), str2);
        String strM66683 = AbstractC3056.m6668(-3937773836947424679L);
        AbstractC3056.m6668(-3937773875602130343L);
        intent.putExtra(strM66683, (Parcelable) objM14655);
        intent.addFlags(268435456);
        view.getContext().startActivity(intent);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC3056.m6668(-3937773613609125287L);
        textPaint.getClass();
        super.updateDrawState(textPaint);
        textPaint.setColor(Color.parseColor(AbstractC3056.m6668(-3937773592134288807L)));
        textPaint.setUnderlineText(false);
    }
}
