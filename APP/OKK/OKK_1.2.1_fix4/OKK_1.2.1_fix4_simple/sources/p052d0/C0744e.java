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
    public final /* synthetic */ int f2583a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f2584b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2585c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2586d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2587e;

    public /* synthetic */ C0744e(Activity r2, C0569s r3, C0551a r4, String r5) {
        this.f2583a = 3;
        this.f2584b = r2;
        this.f2586d = r3;
        this.f2587e = r4;
        this.f2585c = r5;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        String r3 = null;
        ClipboardManager r32 = null;
        C0146l r6 = C0146l.f339a;
        Object r7 = this.f2587e;
        Object r8 = this.f2586d;
        Object r9 = this.f2585c;
        Activity r10 = this.f2584b;
        switch(this.f2583a) {
            case 0: goto L35;
            case 1: goto L30;
            case 2: goto L19;
            default: goto L4;
        };
    L4:
        AbstractC0307g.m703e(r10, "$host");
        String r92 = (String) r9;
        AbstractC0307g.m703e(r92, "$hookSum");
        StringBuilder r1 = new StringBuilder("=== OKK 诊断报告 ===\nModule: v1.2.1\n");
        C0569s r82 = (C0569s) r8;
        if (r82 == null) goto L7;
        String r2 = r82.m1383a();
    L8:
        r1.append("WeChat: " + r2);
        r1.append('\n');
        C0551a r72 = (C0551a) r7;
        if (r72 == null) goto L11;
        String r4 = r72.m1361e();
    L12:
        r1.append("Report: " + r4);
        r1.append('\n');
        r1.append("Hooks: ".concat(r92));
        r1.append("\n\n--- 日志片段 ---\n");
        r1.append(ModuleLog.INSTANCE.text(300));
        r1.append('\n');
        String r12 = r1.toString();
        AbstractC0307g.m702d(r12, "toString(...)");
        Object r22 = r10.getSystemService("clipboard");
        if ((r22 instanceof ClipboardManager) == false) goto L15;
        r32 = (ClipboardManager) r22;
    L15:
        if (r32 == null) goto L17;
        r32.setPrimaryClip(ClipData.newPlainText("OKK-diag", r12));
    L17:
        C0810V r13 = C0810V.f2933a;
        C0810V.m2105z(r10, "诊断信息已复制");
        return r6;
    L11:
        r4 = null;
        goto L12
    L7:
        r2 = null;
        goto L8
    L19:
        C0798I r83 = (C0798I) r8;
        AbstractC0307g.m703e(r83, "$owner");
        C0798I r73 = (C0798I) r7;
        AbstractC0307g.m703e(r73, "$admin");
        C0798I r93 = (C0798I) r9;
        AbstractC0307g.m703e(r93, "$member");
        AbstractC0307g.m703e(r10, "$host");
        C0661h1 r14 = C0661h1.f2048a;
        String r15 = AbstractC0425j.m1022a1(r83.f2899b.getText().toString()).toString();
        if (AbstractC0425j.m1013R0(r15) == false) goto L22;
        r15 = "群主";
    L22:
        C0139e r23 = new C0139e("member_title_owner", r15);
        String r16 = AbstractC0425j.m1022a1(r73.f2899b.getText().toString()).toString();
        if (AbstractC0425j.m1013R0(r16) == false) goto L25;
        r16 = "管理员";
    L25:
        C0139e r33 = new C0139e("member_title_admin", r16);
        String r17 = AbstractC0425j.m1022a1(r93.f2899b.getText().toString()).toString();
        if (AbstractC0425j.m1013R0(r17) == false) goto L28;
        r17 = "成员";
    L28:
        Map r18 = AbstractC0193x.m564h0(new C0139e[]{r23, r33, new C0139e("member_title_member", r17)});
        C0661h1.m1665i(false);
        C0661h1.f2049b.putAll(r18);
        C0661h1.m1660b(false);
        C0810V r19 = C0810V.f2933a;
        C0810V.m2105z(r10, "已保存群头衔文案");
        return r6;
    L30:
        List r84 = (List) r8;
        AbstractC0307g.m703e(r84, "$selected");
        AbstractC0307g.m703e(r10, "$activity");
        Dialog r94 = (Dialog) r9;
        AbstractC0307g.m703e(r94, "$dialog");
        InterfaceC0275a r74 = (InterfaceC0275a) r7;
        AbstractC0307g.m703e(r74, "$onDone");
        if (r84.isEmpty() == false) goto L33;
        Toast.makeText(r10, "至少保留 1 个快捷", 0).show();
    L34:
        return r6;
    L33:
        C0661h1.f2048a.m1666f("home_drawer_shortcuts", AbstractC0181l.m546r0(AbstractC0181l.m549u0(3, AbstractC0181l.m543o0(AbstractC0181l.m553y0(r84))), ",", null, null, new C0570A(9), 30), true);
        Toast.makeText(r10, "已保存 " + r84.size() + " 个快捷", 0).show();
        r94.dismiss();
        r74.invoke();
        goto L34
    L35:
        EditText r85 = (EditText) r8;
        AbstractC0307g.m703e(r85, "$input");
        TextView r75 = (TextView) r7;
        AbstractC0307g.m703e(r75, "$target");
        AbstractC0307g.m703e(r10, "$activity");
        Dialog r95 = (Dialog) r9;
        AbstractC0307g.m703e(r95, "$dialog");
        Editable r110 = r85.getText();
        if (r110 == null) goto L38;
        r3 = r110.toString();
    L38:
        if (r3 != null) goto L40;
        r3 = "";
    L40:
        String r111 = AbstractC0425j.m1022a1(r3).toString();
        String r34 = "OKK 快捷面板";
        if (AbstractC0425j.m1013R0(r111) == false) goto L43;
        r111 = "OKK 快捷面板";
    L43:
        C0661h1 r24 = C0661h1.f2048a;
        String r25 = AbstractC0425j.m1022a1(r111).toString();
        if (AbstractC0425j.m1013R0(r25) == true) goto L47;
        r34 = r25;
    L47:
        C0661h1.m1664h("home_drawer_signature", r34);
        C0661h1.m1664h("home_drawer_signature_tip_shown", "true");
        r75.setText(r111);
        Toast.makeText(r10, "签名已保存", 0).show();
        r95.dismiss();
        return r6;
    }

    public /* synthetic */ C0744e(EditText r2, TextView r3, Activity r4, Dialog r5) {
        this.f2583a = 0;
        this.f2586d = r2;
        this.f2587e = r3;
        this.f2584b = r4;
        this.f2585c = r5;
    }

    public /* synthetic */ C0744e(C0798I r2, C0798I r3, C0798I r4, Activity r5) {
        this.f2583a = 2;
        this.f2586d = r2;
        this.f2587e = r3;
        this.f2585c = r4;
        this.f2584b = r5;
    }

    public /* synthetic */ C0744e(ArrayList r2, Activity r3, Dialog r4, C0742c r5) {
        this.f2583a = 1;
        this.f2586d = r2;
        this.f2584b = r3;
        this.f2585c = r4;
        this.f2587e = r5;
    }
}
