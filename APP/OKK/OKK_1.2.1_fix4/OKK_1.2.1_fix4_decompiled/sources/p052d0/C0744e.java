package p052d0;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.abc.core.hooks.ModuleLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p007D0.C0139e;
import p007D0.C0146l;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0193x;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;
import p049b0.C0551a;
import p049b0.C0569s;
import p050c0.C0570A;
import p050c0.C0661h1;
import p056f0.C0798I;
import p056f0.C0810V;

/* JADX INFO: renamed from: d0.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0744e implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2583a = 3;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f2584b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2585c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2586d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2587e;

    public /* synthetic */ C0744e(Activity activity, C0569s c0569s, C0551a c0551a, String str) {
        this.f2584b = activity;
        this.f2586d = c0569s;
        this.f2587e = c0551a;
        this.f2585c = str;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        C0146l c0146l = C0146l.f339a;
        Object obj = this.f2587e;
        Object obj2 = this.f2586d;
        Object obj3 = this.f2585c;
        Activity activity = this.f2584b;
        switch (this.f2583a) {
            case 0:
                EditText editText = (EditText) obj2;
                AbstractC0307g.m703e(editText, "$input");
                TextView textView = (TextView) obj;
                AbstractC0307g.m703e(textView, "$target");
                AbstractC0307g.m703e(activity, "$activity");
                Dialog dialog = (Dialog) obj3;
                AbstractC0307g.m703e(dialog, "$dialog");
                Editable text = editText.getText();
                String string = text != null ? text.toString() : null;
                if (string == null) {
                    string = "";
                }
                String string2 = AbstractC0425j.m1022a1(string).toString();
                if (AbstractC0425j.m1013R0(string2)) {
                    string2 = "OKK 快捷面板";
                }
                C0661h1 c0661h1 = C0661h1.f2048a;
                String string3 = AbstractC0425j.m1022a1(string2).toString();
                C0661h1.m1664h("home_drawer_signature", AbstractC0425j.m1013R0(string3) ? "OKK 快捷面板" : string3);
                C0661h1.m1664h("home_drawer_signature_tip_shown", "true");
                textView.setText(string2);
                Toast.makeText(activity, "签名已保存", 0).show();
                dialog.dismiss();
                break;
            case 1:
                List list = (List) obj2;
                AbstractC0307g.m703e(list, "$selected");
                AbstractC0307g.m703e(activity, "$activity");
                Dialog dialog2 = (Dialog) obj3;
                AbstractC0307g.m703e(dialog2, "$dialog");
                InterfaceC0275a interfaceC0275a = (InterfaceC0275a) obj;
                AbstractC0307g.m703e(interfaceC0275a, "$onDone");
                if (!list.isEmpty()) {
                    C0661h1.f2048a.m1666f("home_drawer_shortcuts", AbstractC0181l.m546r0(AbstractC0181l.m549u0(3, AbstractC0181l.m543o0(AbstractC0181l.m553y0(list))), ",", null, null, new C0570A(9), 30), true);
                    Toast.makeText(activity, "已保存 " + list.size() + " 个快捷", 0).show();
                    dialog2.dismiss();
                    interfaceC0275a.invoke();
                } else {
                    Toast.makeText(activity, "至少保留 1 个快捷", 0).show();
                }
                break;
            case 2:
                C0798I c0798i = (C0798I) obj2;
                AbstractC0307g.m703e(c0798i, "$owner");
                C0798I c0798i2 = (C0798I) obj;
                AbstractC0307g.m703e(c0798i2, "$admin");
                C0798I c0798i3 = (C0798I) obj3;
                AbstractC0307g.m703e(c0798i3, "$member");
                AbstractC0307g.m703e(activity, "$host");
                C0661h1 c0661h12 = C0661h1.f2048a;
                String string4 = AbstractC0425j.m1022a1(c0798i.f2899b.getText().toString()).toString();
                if (AbstractC0425j.m1013R0(string4)) {
                    string4 = "群主";
                }
                C0139e c0139e = new C0139e("member_title_owner", string4);
                String string5 = AbstractC0425j.m1022a1(c0798i2.f2899b.getText().toString()).toString();
                if (AbstractC0425j.m1013R0(string5)) {
                    string5 = "管理员";
                }
                C0139e c0139e2 = new C0139e("member_title_admin", string5);
                String string6 = AbstractC0425j.m1022a1(c0798i3.f2899b.getText().toString()).toString();
                if (AbstractC0425j.m1013R0(string6)) {
                    string6 = "成员";
                }
                Map mapM564h0 = AbstractC0193x.m564h0(c0139e, c0139e2, new C0139e("member_title_member", string6));
                C0661h1.m1665i(false);
                C0661h1.f2049b.putAll(mapM564h0);
                C0661h1.m1660b(false);
                C0810V c0810v = C0810V.f2933a;
                C0810V.m2105z(activity, "已保存群头衔文案");
                break;
            default:
                AbstractC0307g.m703e(activity, "$host");
                String str = (String) obj3;
                AbstractC0307g.m703e(str, "$hookSum");
                StringBuilder sb = new StringBuilder("=== OKK 诊断报告 ===\nModule: v1.2.1\n");
                C0569s c0569s = (C0569s) obj2;
                sb.append("WeChat: " + (c0569s != null ? c0569s.m1383a() : null));
                sb.append('\n');
                C0551a c0551a = (C0551a) obj;
                sb.append("Report: " + (c0551a != null ? c0551a.m1361e() : null));
                sb.append('\n');
                sb.append("Hooks: ".concat(str));
                sb.append("\n\n--- 日志片段 ---\n");
                sb.append(ModuleLog.INSTANCE.text(300));
                sb.append('\n');
                String string7 = sb.toString();
                AbstractC0307g.m702d(string7, "toString(...)");
                Object systemService = activity.getSystemService("clipboard");
                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("OKK-diag", string7));
                }
                C0810V c0810v2 = C0810V.f2933a;
                C0810V.m2105z(activity, "诊断信息已复制");
                break;
        }
        return c0146l;
    }

    public /* synthetic */ C0744e(EditText editText, TextView textView, Activity activity, Dialog dialog) {
        this.f2586d = editText;
        this.f2587e = textView;
        this.f2584b = activity;
        this.f2585c = dialog;
    }

    public /* synthetic */ C0744e(C0798I c0798i, C0798I c0798i2, C0798I c0798i3, Activity activity) {
        this.f2586d = c0798i;
        this.f2587e = c0798i2;
        this.f2585c = c0798i3;
        this.f2584b = activity;
    }

    public /* synthetic */ C0744e(ArrayList arrayList, Activity activity, Dialog dialog, C0742c c0742c) {
        this.f2586d = arrayList;
        this.f2584b = activity;
        this.f2585c = dialog;
        this.f2587e = c0742c;
    }
}
