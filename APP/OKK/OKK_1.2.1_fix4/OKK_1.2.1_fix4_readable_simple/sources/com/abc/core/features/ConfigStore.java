package com.abc.core.features;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p009E0.AbstractC0193x;
import p026N0.AbstractC0270k;
import p031Q0.AbstractC0307g;
import p034S.RunnableC0321a;
import p040V0.C0401d;
import p040V0.C0402e;
import p040V0.C0403f;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class ConfigStore {

    /* JADX INFO: renamed from: a */
    public static final ConfigStore f2048a = null;

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f2049b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicLong f2050c = null;

    /* JADX INFO: renamed from: d */
    public static final AtomicInteger f2051d = null;

    /* JADX INFO: renamed from: e */
    public static final Object f2052e = null;

    /* JADX INFO: renamed from: f */
    public static final ExecutorService f2053f = null;

    /* JADX INFO: renamed from: g */
    public static volatile boolean f2054g;

    /* JADX INFO: renamed from: h */
    public static final LinkedHashMap f2055h = null;

    static {
        f2048a = new ConfigStore();
        f2049b = new ConcurrentHashMap();
        f2050c = new AtomicLong(0);
        f2051d = new AtomicInteger(0);
        f2052e = new Object();
        f2053f = Executors.newSingleThreadExecutor(new ThreadFactoryC0658g1(0));
        C0139e[] r02 = {new C0139e("anti_revoke", "true"), new C0139e("revoke_notice_enabled", "true"), new C0139e("anti_revoke_keep_self", "false"), new C0139e("anti_revoke_notice_text", "{name}撤回了一条消息"), new C0139e("media_protect_enabled", "true"), new C0139e("anti_moments_delete", "true"), new C0139e("swipe_quote", "true"), new C0139e("swipe_repeat", "false"), new C0139e("quote_delete_clear", "false"), new C0139e("bubble_enabled", "true"), new C0139e("settings_entry_enabled", "true"), new C0139e("module_log_enabled", "false"), new C0139e("bottom_tab_hide_title", "false"), new C0139e("detail_enabled", "true"), new C0139e("detail_template", "${time} ${relativeTime}"), new C0139e("detail_time_pattern", "MM-dd HH:mm:ss"), new C0139e("detail_text_size", "12"), new C0139e("detail_left_margin", "0"), new C0139e("detail_right_margin", "0"), new C0139e("detail_text_color_light", "#E6000000"), new C0139e("detail_text_color_dark", "#CCFFFFFF"), new C0139e("detail_click_show", "false"), new C0139e("input_stats_enabled", "true"), new C0139e("input_stats_count_send", "true"), new C0139e("input_stats_template", "今日已发${totalMsg}条"), new C0139e("round_avatar_enabled", "false"), new C0139e("round_avatar_radius", "0.36"), new C0139e("anti_moments_comment_revoke", "true"), new C0139e("virtual_location_enabled", "false"), new C0139e("virtual_location_latitude", ""), new C0139e("virtual_location_longitude", ""), new C0139e("auto_login_win_enabled", "false"), new C0139e("auto_login_win_sync_msg", "true"), new C0139e("auto_login_win_show_device", "true"), new C0139e("auto_login_win_auto_device", "false"), new C0139e("auto_login_win_auto_click", "true"), new C0139e("remove_moments_ads", "false"), new C0139e("profile_id", "false"), new C0139e("home_avatar_entry", "true"), new C0139e("home_drawer_shortcuts", "qrcode,pay,favorite"), new C0139e("home_drawer_signature", "OKK 快捷面板"), new C0139e("home_status_custom", ""), new C0139e("theme_wallpaper_enabled", "false"), new C0139e("theme_wallpaper_alpha", "0.28"), new C0139e("theme_wallpaper_path", ""), new C0139e("disable_hot_update", "false"), new C0139e("real_name_tail", "false"), new C0139e("real_name_tail_color", "#9E9E9E"), new C0139e("member_title", "false"), new C0139e("member_title_show_member", "true"), new C0139e("member_title_owner", "群主"), new C0139e("member_title_admin", "管理员"), new C0139e("member_title_member", "成员"), new C0139e("edit_message", "false"), new C0139e("hide_home_divider", "false"), new C0139e("fold_banner_fixed", "true"), new C0139e("bottom_tab_floating", "false"), new C0139e("bottom_tab_floating_labels", "true"), new C0139e("bottom_tab_floating_badge", "true"), new C0139e("bottom_tab_title_chats", "微信"), new C0139e("bottom_tab_title_contacts", "通讯录"), new C0139e("bottom_tab_title_discover", "发现"), new C0139e("bottom_tab_title_me", "我"), new C0139e("night_mode_follow", "true"), new C0139e("night_mode", "false")};
        LinkedHashMap r1 = new LinkedHashMap(AbstractC0193x.m563g0(65));
        AbstractC0193x.m565i0(r1, r02);
        f2055h = r1;
    }

    /* JADX INFO: renamed from: a */
    public static void m1659a() {
        boolean r02 = true;
        m1665i(true);
        List r1 = AbstractC0040p.m82F(new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "achat_config.properties"));
        if (r1.isEmpty() == false) goto L5;
    L4:
        boolean r12 = true;
    L11:
        LinkedHashMap r2 = f2055h;
        Iterator r4 = r2.entrySet().iterator();
    L12:
        boolean r5 = r4.hasNext();
        ConcurrentHashMap r6 = f2049b;
        if (r5 == false) goto L17;
        Map.Entry r52 = (Map.Entry) r4.next();
        String r7 = (String) r52.getKey();
        String r53 = (String) r52.getValue();
        if (r6.containsKey(r7) == true) goto L12;
        r6.put(r7, r53);
        r12 = true;
        goto L12
    L17:
        Object r54 = r2.get("detail_template");
        AbstractC0307g.m700b(r54);
        String r55 = (String) r54;
        Object r22 = r2.get("detail_time_pattern");
        AbstractC0307g.m700b(r22);
        String r23 = (String) r22;
        Set r8 = AbstractC0040p.m92W(new String[]{"${time}|${relativeTime}", "${time} ${weekday} ${relativeTime}", "${time}"});
        Set r9 = AbstractC0040p.m92W(new String[]{"MM-dd 周一 HH:mm:ss", "MM-dd HH:mm", "yyyy-MM-dd HH:mm:ss"});
        if (r8.contains(r6.get("detail_template")) == true) goto L23;
        CharSequence r82 = (CharSequence) r6.get("detail_template");
        if (r82 == null) goto L23;
        if (AbstractC0425j.m1013R0(r82) == true) goto L23;
    L25:
        if (r9.contains(r6.get("detail_time_pattern")) == true) goto L32;
        CharSequence r42 = (CharSequence) r6.get("detail_time_pattern");
        if (r42 == null) goto L32;
        if (AbstractC0425j.m1013R0(r42) == true) goto L32;
        r02 = r12;
    L33:
        if (r02 == false) goto L44;
        m1660b(false);
        return;
    L44:
        return;
    L32:
        r6.put("detail_time_pattern", r23);
    L23:
        r6.put("detail_template", r55);
        r12 = true;
        goto L25
    L5:
        Iterator r13 = r1.iterator();
    L7:
        if (r13.hasNext() == false) goto L4;
        if (((File) r13.next()).isFile() == false) goto L7;
        r12 = false;
        goto L11
    }

    /* JADX INFO: renamed from: b */
    public static void m1660b(boolean r6) {
        StringBuilder r02 = new StringBuilder("# OKK public config\n");
        r02.append("updated=" + System.currentTimeMillis());
        r02.append('\n');
        ConcurrentHashMap r2 = f2049b;
        AbstractC0307g.m703e(r2, "<this>");
        Iterator r22 = new TreeMap(r2).entrySet().iterator();
    L4:
        if (r22.hasNext() == false) goto L8;
        Map.Entry r3 = (Map.Entry) r22.next();
        String r4 = (String) r3.getKey();
        String r32 = (String) r3.getValue();
        if (AbstractC0307g.m699a(r4, "updated") == true) goto L4;
        r02.append(r4 + "=" + r32);
        r02.append('\n');
        goto L4
    L8:
        String r03 = r02.toString();
        AbstractC0307g.m702d(r03, "toString(...)");
        List r1 = AbstractC0040p.m82F(new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "achat_config.properties"));
        if (r6 == false) goto L11;
        f2053f.execute(new RunnableC0321a(f2051d.incrementAndGet(), r1, r03, 2));
        return;
    L11:
        f2051d.incrementAndGet();
        Object r62 = f2052e;
        monitor-enter(r62);
        Iterator r12 = r1.iterator();     // Catch: Throwable -> L26
    L14:
        if (r12.hasNext() == false) goto L28;
        File r23 = (File) r12.next();     // Catch: Throwable -> L26
        File r33 = r23.getParentFile();     // Catch: Throwable -> L20
    L18:
        if (r33 == null) goto L22;
        r33.mkdirs();     // Catch: Throwable -> L20
    L22:
        AbstractC0270k.m693j0(r23, r03, AbstractC0416a.f921a);     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L26
        goto L14
    L28:
        monitor-exit(r62);
        return;
    L26:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1661c(String r2, boolean r3) {
        AbstractC0307g.m703e(r2, "key");
        ConcurrentHashMap r02 = f2049b;
        m1665i(r02.isEmpty());
        String r22 = (String) r02.get(r2);
        if (r22 != null) goto L6;
        return r3;
    L6:
        if (r22.equalsIgnoreCase("true") == false) goto L8;
    L15:
        return true;
    L8:
        if (r22.equals("1") == true) goto L15;
        if (r22.equalsIgnoreCase("yes") == true) goto L15;
        if (r22.equalsIgnoreCase("on") == true) goto L15;
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static String m1662d(String r2, String r3) {
        AbstractC0307g.m703e(r3, "default");
        ConcurrentHashMap r02 = f2049b;
        m1665i(r02.isEmpty());
        String r22 = (String) r02.get(r2);
        if (r22 != null) goto L6;
        return r3;
    L6:
        return r22;
    }

    /* JADX INFO: renamed from: e */
    public static LinkedHashMap m1663e(String r3) {
        C0402e r02 = new C0402e(new C0403f(new C0402e(new C0403f(AbstractC0425j.m1014S0(AbstractC0425j.m1016U0(r3, "\ufeff")), new C0570A(17)), true, new C0570A(18)), new C0570A(19)), true, new C0570A(20));
        LinkedHashMap r32 = new LinkedHashMap();
        C0401d r1 = new C0401d(r02);
    L4:
        if (r1.hasNext() == false) goto L6;
        C0139e r03 = (C0139e) r1.next();
        r32.put(r03.f328a, r03.f329b);
        goto L4
    L6:
        return r32;
    }

    /* JADX INFO: renamed from: h */
    public static void m1664h(String r1, String r2) {
        m1665i(true);
        f2049b.put(r1, r2);
        m1660b(false);
    }

    /* JADX INFO: renamed from: i */
    public static void m1665i(boolean r10) {
        if (f2054g == true) goto L26;
        f2054g = true;
        File r02 = new File("/storage/emulated/0/Android/media/com.tencent.mm/AChat");     // Catch: Throwable -> L22
        File r4 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK");     // Catch: Throwable -> L22
        if (r02.isDirectory() == false) goto L26;
        if (new File(r4, "achat_config.properties").isFile() == true) goto L26;
        r4.mkdirs();     // Catch: Throwable -> L22
        File[] r03 = r02.listFiles();     // Catch: Throwable -> L22
        if (r03 == null) goto L26;
        int r5 = r03.length;     // Catch: Throwable -> L22
        int r6 = 0;
    L15:
        if (r6 >= r5) goto L26;
        File r7 = r03[r6];     // Catch: Throwable -> L22
        if (r7.isFile() == false) goto L24;
        File r8 = new File(r4, r7.getName());     // Catch: Throwable -> L22
        if (r8.isFile() == true) goto L24;
        AbstractC0270k.m690g0(r7, r8);     // Catch: Throwable -> L22
    L24:
        r6 = r6 + 1;
    L22:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L26:
        long r42 = System.currentTimeMillis();
        if (r10 == false) goto L29;
    L33:
        LinkedHashMap r102 = new LinkedHashMap(f2055h);
        Iterator r04 = AbstractC0040p.m82F(new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "achat_config.properties")).iterator();
    L35:
        if (r04.hasNext() == false) goto L45;
        File r1 = (File) r04.next();
        if (r1.isFile() == false) goto L35;
        Iterator r12 = m1663e(AbstractC0270k.m692i0(r1, AbstractC0416a.f921a)).entrySet().iterator();     // Catch: Throwable -> L43
    L39:
        if (r12.hasNext() == false) goto L35;
        Map.Entry r2 = (Map.Entry) r12.next();     // Catch: Throwable -> L43
        r102.put((String) r2.getKey(), (String) r2.getValue());     // Catch: Throwable -> L43
    L43:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L35
    L45:
        ConcurrentHashMap r05 = f2049b;
        r05.clear();
        r05.putAll(r102);
        f2050c.set(r42);
        return;
    L29:
        if ((r42 - f2050c.get()) >= 2000) goto L33;
        if ((!f2049b.isEmpty()) == false) goto L33;
    }

    /* JADX INFO: renamed from: f */
    public final void m1666f(String r2, String r3, boolean r4) {
        AbstractC0307g.m703e(r2, "key");
        AbstractC0307g.m703e(r3, "value");
        m1665i(false);
        f2049b.put(r2, r3);
        m1660b(r4);
    }

    /* JADX INFO: renamed from: g */
    public final void m1667g(String r2, boolean r3, boolean r4) {
        AbstractC0307g.m703e(r2, "key");
        m1666f(r2, String.valueOf(r3), r4);
    }
}
