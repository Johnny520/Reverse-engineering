package com.abc.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.abc.core.features.C0570A;
import com.abc.core.features.ConfigStore;
import com.abc.core.hooks.ModuleLog;
import com.abc.core.runtime.C0798I;
import com.abc.core.runtime.SettingsUiBuilder;
import com.abc.internal.probe.AppFingerprint;
import com.abc.internal.probe.CompatibilityReport;
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

/* JADX INFO: renamed from: d0.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SettingsCallback implements InterfaceC0275a {

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

    public /* synthetic */ SettingsCallback(Activity activity, CompatibilityReport compatibilityReport, AppFingerprint appFingerprint, String str) {
        this.f2584b = activity;
        this.f2586d = compatibilityReport;
        this.f2587e = appFingerprint;
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
                ConfigStore configStore = ConfigStore.f2048a;
                String string3 = AbstractC0425j.m1022a1(string2).toString();
                ConfigStore.m1664h("home_drawer_signature", AbstractC0425j.m1013R0(string3) ? "OKK 快捷面板" : string3);
                ConfigStore.m1664h("home_drawer_signature_tip_shown", "true");
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
                    ConfigStore.f2048a.m1666f("home_drawer_shortcuts", AbstractC0181l.m546r0(AbstractC0181l.m549u0(3, AbstractC0181l.m543o0(AbstractC0181l.m553y0(list))), ",", null, null, new C0570A(9), 30), true);
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
                ConfigStore configStore2 = ConfigStore.f2048a;
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
                ConfigStore.m1665i(false);
                ConfigStore.f2049b.putAll(mapM564h0);
                ConfigStore.m1660b(false);
                SettingsUiBuilder settingsUiBuilder = SettingsUiBuilder.f2933a;
                SettingsUiBuilder.m2105z(activity, "已保存群头衔文案");
                break;
            default:
                AbstractC0307g.m703e(activity, "$host");
                String str = (String) obj3;
                AbstractC0307g.m703e(str, "$hookSum");
                StringBuilder sb = new StringBuilder("=== OKK 诊断报告 ===\nModule: v1.2.1\n");
                CompatibilityReport compatibilityReport = (CompatibilityReport) obj2;
                sb.append("WeChat: " + (compatibilityReport != null ? compatibilityReport.m1383a() : null));
                sb.append('\n');
                AppFingerprint appFingerprint = (AppFingerprint) obj;
                sb.append("Report: " + (appFingerprint != null ? appFingerprint.m1361e() : null));
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
                SettingsUiBuilder settingsUiBuilder2 = SettingsUiBuilder.f2933a;
                SettingsUiBuilder.m2105z(activity, "诊断信息已复制");
                break;
        }
        return c0146l;
    }

    public /* synthetic */ SettingsCallback(EditText editText, TextView textView, Activity activity, Dialog dialog) {
        this.f2586d = editText;
        this.f2587e = textView;
        this.f2584b = activity;
        this.f2585c = dialog;
    }

    public /* synthetic */ SettingsCallback(C0798I c0798i, C0798I c0798i2, C0798I c0798i3, Activity activity) {
        this.f2586d = c0798i;
        this.f2587e = c0798i2;
        this.f2585c = c0798i3;
        this.f2584b = activity;
    }

    public /* synthetic */ SettingsCallback(ArrayList arrayList, Activity activity, Dialog dialog, SettingsAction settingsAction) {
        this.f2586d = arrayList;
        this.f2584b = activity;
        this.f2585c = dialog;
        this.f2587e = settingsAction;
    }
}
