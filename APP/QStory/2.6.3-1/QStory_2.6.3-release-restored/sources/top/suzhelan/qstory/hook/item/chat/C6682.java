package top.suzhelan.qstory.hook.item.chat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import lin.xposed.hook.util.p011qq.QQEnvTool;
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
        "uid";
        str.getClass();
        "troopUin";
        this.f16358 = str;
        this.f16357 = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        "widget";
        view.getClass();
        String str = this.f16358;
        String uinFromUid = QQEnvTool.getUinFromUid(str);
        Class clsM15228 = AbstractC9919.m15228("com.tencent.mobileqq.profilecard.data.AllInOne");
        clsM15228.getClass();
        Object objM15226 = C9917.m15226(clsM15228, uinFromUid, 20);
        C9915.m15223(objM15226, "uid", str);
        String strM14531 = "troopUin";
        String str2 = this.f16357;
        C9915.m15223(objM15226, strM14531, str2);
        C9915.m15223(objM15226, "troopCode", str2);
        C9915.m15223(objM15226, "profileEntryType", 1);
        C9915.m15223(objM15226, "subSourceId", 11);
        String strM14532 = "extras";
        Bundle bundle = new Bundle();
        bundle.putInt("enter_page_sourceid", 1);
        bundle.putInt("enter_page_subsourceid", 11);
        C9915.m15223(objM15226, strM14532, bundle);
        Intent intent = new Intent();
        intent.setClassName(view.getContext(), "com.tencent.mobileqq.profilecard.activity.FriendProfileCardActivity");
        intent.putExtra("memberUin", str);
        intent.putExtra("troopUin", str2);
        String strM145312 = "AllInOne";
        "null cannot be cast to non-null type android.os.Parcelable";
        intent.putExtra(strM145312, (Parcelable) objM15226);
        intent.addFlags(268435456);
        view.getContext().startActivity(intent);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        "ds";
        textPaint.getClass();
        super.updateDrawState(textPaint);
        textPaint.setColor(Color.parseColor("#1E88E5"));
        textPaint.setUnderlineText(false);
    }
}
