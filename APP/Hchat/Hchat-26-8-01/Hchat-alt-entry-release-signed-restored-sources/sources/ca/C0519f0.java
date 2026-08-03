package ca;

import android.content.SharedPreferences;
import p011ab.C0042b;
import p015b0.C0154t;
import p015b0.C0156v;
import p068eh.AbstractC0921a;
import p211o9.C3092e;
import p230p8.C3357i;
import p230p8.C3358j;
import p230p8.C3363o;
import p258r8.C3742g;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: ca.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0519f0 {

    /* JADX INFO: renamed from: a */
    public final C3742g f1597a;

    /* JADX INFO: renamed from: b */
    public final C3363o f1598b;

    /* JADX INFO: renamed from: c */
    public final C0154t f1599c;

    /* JADX INFO: renamed from: d */
    public final C0042b f1600d;

    /* JADX INFO: renamed from: e */
    public final SharedPreferences f1601e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0519f0(C3742g c3742g, C3363o c3363o, C0154t c0154t, C0042b c0042b) {
        c3742g.getClass();
        this.f1597a = c3742g;
        this.f1598b = c3363o;
        this.f1599c = c0154t;
        this.f1600d = c0042b;
        this.f1601e = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_message_forward_config");
        C3358j c3358j = C3358j.f10833a;
        C3358j.f10834b.put("message_forward", new C3357i("message_forward", 1212371790, "转发[H]", 10, null, "icons_filled_share", new C0156v(0, this, AbstractC0921a.m2246i(C0519f0.class), "isEnabled", "isEnabled()Z", 0, 0, 1), new C3092e(9), new C0154t(this, 4)));
    }
}
