package p301ud;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import me.yun.fkwechat.core.config.ConfigRepo;

/* JADX INFO: renamed from: ud.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8676d {

    /* JADX INFO: renamed from: a */
    public static final C8676d f28769a = new C8676d();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0512i2 f28770b = AbstractC0522j5.m1773e(ConfigRepo.getString("ui_theme_color", "Green"), null, 2, null);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0512i2 f28771c = AbstractC0522j5.m1773e(Boolean.valueOf(ConfigRepo.getBoolean("ui_dynamic_color", false)), null, 2, null);

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0512i2 f28772d = AbstractC0522j5.m1773e(Boolean.valueOf(ConfigRepo.getBoolean("ui_fluid_bg", false)), null, 2, null);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final long m33319a() {
        String strM33320b = m33320b();
        if (strM33320b != null) {
            switch (strM33320b.hashCode()) {
                case -2100368654:
                    if (strM33320b.equals("Indigo")) {
                        return C8673a.f28743a.m33304i();
                    }
                    break;
                case -1997386916:
                    if (strM33320b.equals("Matcha")) {
                        return C8673a.f28743a.m33307l();
                    }
                    break;
                case -1924984242:
                    if (strM33320b.equals("Orange")) {
                        return C8673a.f28743a.m33296a();
                    }
                    break;
                case -1893076004:
                    if (strM33320b.equals("Purple")) {
                        return C8673a.f28743a.m33310o();
                    }
                    break;
                case -1818443987:
                    if (strM33320b.equals("Silver")) {
                        return C8673a.f28743a.m33312q();
                    }
                    break;
                case -1650372460:
                    if (strM33320b.equals("Yellow")) {
                        return C8673a.f28743a.m33315t();
                    }
                    break;
                case -1597708609:
                    if (strM33320b.equals("Crimson")) {
                        return C8673a.f28743a.m33299d();
                    }
                    break;
                case -1086019677:
                    if (strM33320b.equals("DeepSea")) {
                        return C8673a.f28743a.m33303h();
                    }
                    break;
                case 82033:
                    if (strM33320b.equals("Red")) {
                        return C8673a.f28743a.m33305j();
                    }
                    break;
                case 2073722:
                    if (strM33320b.equals("Blue")) {
                        return C8673a.f28743a.m33313r();
                    }
                    break;
                case 2115395:
                    if (strM33320b.equals("Cyan")) {
                        return C8673a.f28743a.m33300e();
                    }
                    break;
                case 2227843:
                    if (strM33320b.equals("Gray")) {
                        return C8673a.f28743a.m33309n();
                    }
                    break;
                case 2368501:
                    if (strM33320b.equals("Lime")) {
                        return C8673a.f28743a.m33306k();
                    }
                    break;
                case 2487702:
                    if (strM33320b.equals("Pink")) {
                        return C8673a.f28743a.m33311p();
                    }
                    break;
                case 2602620:
                    if (strM33320b.equals("Teal")) {
                        return C8673a.f28743a.m33308m();
                    }
                    break;
                case 64266207:
                    if (strM33320b.equals("Black")) {
                        return C8673a.f28743a.m33297b();
                    }
                    break;
                case 64459030:
                    if (strM33320b.equals("Brown")) {
                        return C8673a.f28743a.m33298c();
                    }
                    break;
                case 274041434:
                    if (strM33320b.equals("DeepOrange")) {
                        return C8673a.f28743a.m33301f();
                    }
                    break;
                case 305949672:
                    if (strM33320b.equals("DeepPurple")) {
                        return C8673a.f28743a.m33302g();
                    }
                    break;
            }
        }
        return C8673a.f28743a.m33314s();
    }

    /* JADX INFO: renamed from: b */
    public final String m33320b() {
        return (String) f28770b.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m33321c() {
        return ((Boolean) f28771c.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m33322d() {
        return ((Boolean) f28772d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m33323e(String str) {
        f28770b.setValue(str);
    }

    /* JADX INFO: renamed from: f */
    public final void m33324f(boolean z10) {
        f28771c.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: g */
    public final void m33325g(boolean z10) {
        f28772d.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: h */
    public final void m33326h(boolean z10) {
        m33324f(z10);
        ConfigRepo.setBoolean("ui_dynamic_color", z10);
    }

    /* JADX INFO: renamed from: i */
    public final void m33327i(boolean z10) {
        m33325g(z10);
        ConfigRepo.setBoolean("ui_fluid_bg", z10);
    }

    /* JADX INFO: renamed from: j */
    public final void m33328j(String str) {
        str.getClass();
        m33323e(str);
        ConfigRepo.setString("ui_theme_color", str);
        m33326h(false);
    }
}
