package p088s0;

import android.app.AlertDialog;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.p055lu.wxmask.bean.OptionData;
import p027N0.AbstractC0223g;
import p027N0.C0228l;
import p034R0.C0244c;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0306p;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: s0.C */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0969C implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3466b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EditText f3467c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ EditText f3468d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0976J f3469e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0228l f3470f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0969C(EditText editText, EditText editText2, C0976J c0976j, C0228l c0228l, int i2) {
        this.f3466b = i2;
        this.f3467c = editText;
        this.f3468d = editText2;
        this.f3469e = c0976j;
        this.f3470f = c0228l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        C0228l c0228l = this.f3470f;
        C0976J c0976j = this.f3469e;
        EditText editText = this.f3468d;
        EditText editText2 = this.f3467c;
        switch (this.f3466b) {
            case 0:
                Editable text = editText2.getText();
                Integer numM530Z = (text == null || (string3 = text.toString()) == null || (string4 = AbstractC0299i.m507C0(string3).toString()) == null) ? null : AbstractC0306p.m530Z(string4);
                if (numM530Z == null || !new C0244c(2, 8, 1).m459a(numM530Z.intValue())) {
                    AbstractC0503h.m978P("请输入 2-8 之间的点击次数");
                    return;
                }
                Editable text2 = editText.getText();
                Integer numM530Z2 = (text2 == null || (string = text2.toString()) == null || (string2 = AbstractC0299i.m507C0(string).toString()) == null) ? null : AbstractC0306p.m530Z(string2);
                if (numM530Z2 == null || !new C0244c(300, 5000, 1).m459a(numM530Z2.intValue())) {
                    AbstractC0503h.m978P("请输入 300-5000ms 之间的时间窗口");
                    return;
                }
                c0976j.f3494l.setChatHistoryQuickUnhideClickCount(numM530Z.intValue());
                int iIntValue = numM530Z2.intValue();
                OptionData optionData = c0976j.f3494l;
                optionData.setChatHistoryQuickUnhideDurationMs(iIntValue);
                boolean z2 = AbstractC1126i.f3786a;
                C1124g.m2424O(optionData);
                AbstractC0503h.m978P("已保存聊天记录快速解除：" + numM530Z + " 次，" + numM530Z2 + "ms");
                Object obj = c0228l.f568a;
                if (obj != null) {
                    ((AlertDialog) obj).dismiss();
                    return;
                } else {
                    AbstractC0223g.m420g("dialog");
                    throw null;
                }
            default:
                Editable text3 = editText2.getText();
                String string7 = (text3 == null || (string6 = text3.toString()) == null) ? null : AbstractC0299i.m507C0(string6).toString();
                if (string7 == null) {
                    string7 = "";
                }
                if (AbstractC0307q.m534d0(string7)) {
                    AbstractC0503h.m978P("请输入配置面板命令");
                    return;
                }
                Editable text4 = editText.getText();
                String string8 = (text4 == null || (string5 = text4.toString()) == null) ? null : AbstractC0299i.m507C0(string5).toString();
                String str = string8 != null ? string8 : "";
                if (AbstractC0307q.m534d0(str)) {
                    AbstractC0503h.m978P("请输入管理名单命令");
                    return;
                }
                if (string7.length() > 32 || str.length() > 32) {
                    AbstractC0503h.m978P("命令长度不能超过 32 个字符");
                    return;
                }
                if (string7.equals(str)) {
                    AbstractC0503h.m978P("两个命令不能相同");
                    return;
                }
                c0976j.f3494l.setSearchCommandText(string7);
                OptionData optionData2 = c0976j.f3494l;
                optionData2.setSearchListCommandText(str);
                optionData2.setEnableSearchCommand(true);
                boolean z3 = AbstractC1126i.f3786a;
                C1124g.m2424O(optionData2);
                AbstractC0503h.m978P("已保存搜索框命令");
                Object obj2 = c0228l.f568a;
                if (obj2 != null) {
                    ((AlertDialog) obj2).dismiss();
                    return;
                } else {
                    AbstractC0223g.m420g("dialog");
                    throw null;
                }
        }
    }
}
