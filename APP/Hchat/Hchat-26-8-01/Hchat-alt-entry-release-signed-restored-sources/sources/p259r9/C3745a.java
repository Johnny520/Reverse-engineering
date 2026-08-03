package p259r9;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p108ha.C1651k0;
import p116i.C1746e0;
import p126ia.C2026t;
import p243q9.C3465a;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: r9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3745a extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C3752d0 f12156e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "hchat_extra";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        Context context = c3742g.f12143a;
        synchronized (AbstractC3754e0.class) {
            try {
                SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_wekit_port_config");
                Map<String, ?> all = sharedPreferencesM8640c.getAll();
                if (!all.isEmpty()) {
                    SharedPreferences sharedPreferencesM8640c2 = AbstractC4302b.m8640c(context, "Hchat_extra_config");
                    if (sharedPreferencesM8640c2.getAll().isEmpty()) {
                        SharedPreferences.Editor editorEdit = sharedPreferencesM8640c2.edit();
                        for (Map.Entry<String, ?> entry : all.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (value instanceof Boolean) {
                                editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                            } else if (value instanceof Float) {
                                editorEdit.putFloat(key, ((Number) value).floatValue());
                            } else if (value instanceof Integer) {
                                editorEdit.putInt(key, ((Number) value).intValue());
                            } else if (value instanceof Long) {
                                editorEdit.putLong(key, ((Number) value).longValue());
                            } else if (value instanceof String) {
                                editorEdit.putString(key, (String) value);
                            } else if (value instanceof Set) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : (Iterable) value) {
                                    if (obj instanceof String) {
                                        arrayList.add(obj);
                                    }
                                }
                                editorEdit.putStringSet(key, AbstractC4166m.m8412U1(arrayList));
                            }
                        }
                        editorEdit.apply();
                    }
                    sharedPreferencesM8640c.edit().clear().apply();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m7751h(new C1651k0("hchat_message_time", "消息显示时间", "在聊天消息旁显示时间、类型等详情", "practical"));
        m7751h(new C1651k0("hchat_group_member_history", "历史发言记录", "在群成员资料页查看历史发言记录", "practical"));
        m7751h(new C1651k0("hchat_red_packet_details", "红包显示详情", "红包详情页显示金额、个数和领取时间", "practical"));
        m7751h(new C1651k0("hchat_skip_web_risk", "跳过网页风险", "跳过微信 WebView 高风险网页拦截提示", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        this.f12156e = new C3752d0(c3742g, new C2026t(2, this, AbstractC0921a.m2246i(C3745a.class), "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 20));
        C3740e.m7759f(12, new C1746e0(this, 15), "hchat_extra", "分支扩展功能", null);
        m7752i(C1085e.class, new C3465a(this, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "分支扩展功能";
    }
}
