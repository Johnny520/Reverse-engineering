package p050c0;

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
public final class C0661h1 {

    /* JADX INFO: renamed from: a */
    public static final C0661h1 f2048a = new C0661h1();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f2049b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final AtomicLong f2050c = new AtomicLong(0);

    /* JADX INFO: renamed from: d */
    public static final AtomicInteger f2051d = new AtomicInteger(0);

    /* JADX INFO: renamed from: e */
    public static final Object f2052e = new Object();

    /* JADX INFO: renamed from: f */
    public static final ExecutorService f2053f = Executors.newSingleThreadExecutor(new ThreadFactoryC0658g1(0));

    /* JADX INFO: renamed from: g */
    public static volatile boolean f2054g;

    /* JADX INFO: renamed from: h */
    public static final LinkedHashMap f2055h;

    static {
        C0139e[] c0139eArr = {new C0139e("anti_revoke", "true"), new C0139e("revoke_notice_enabled", "true"), new C0139e("anti_revoke_keep_self", "false"), new C0139e("anti_revoke_notice_text", "{name}撤回了一条消息"), new C0139e("media_protect_enabled", "true"), new C0139e("anti_moments_delete", "true"), new C0139e("swipe_quote", "true"), new C0139e("swipe_repeat", "false"), new C0139e("quote_delete_clear", "false"), new C0139e("bubble_enabled", "true"), new C0139e("settings_entry_enabled", "true"), new C0139e("module_log_enabled", "false"), new C0139e("bottom_tab_hide_title", "false"), new C0139e("detail_enabled", "true"), new C0139e("detail_template", "${time} ${relativeTime}"), new C0139e("detail_time_pattern", "MM-dd HH:mm:ss"), new C0139e("detail_text_size", "12"), new C0139e("detail_left_margin", "0"), new C0139e("detail_right_margin", "0"), new C0139e("detail_text_color_light", "#E6000000"), new C0139e("detail_text_color_dark", "#CCFFFFFF"), new C0139e("detail_click_show", "false"), new C0139e("input_stats_enabled", "true"), new C0139e("input_stats_count_send", "true"), new C0139e("input_stats_template", "今日已发${totalMsg}条"), new C0139e("round_avatar_enabled", "false"), new C0139e("round_avatar_radius", "0.36"), new C0139e("anti_moments_comment_revoke", "true"), new C0139e("virtual_location_enabled", "false"), new C0139e("virtual_location_latitude", ""), new C0139e("virtual_location_longitude", ""), new C0139e("auto_login_win_enabled", "false"), new C0139e("auto_login_win_sync_msg", "true"), new C0139e("auto_login_win_show_device", "true"), new C0139e("auto_login_win_auto_device", "false"), new C0139e("auto_login_win_auto_click", "true"), new C0139e("remove_moments_ads", "false"), new C0139e("profile_id", "false"), new C0139e("home_avatar_entry", "true"), new C0139e("home_drawer_shortcuts", "qrcode,pay,favorite"), new C0139e("home_drawer_signature", "OKK 快捷面板"), new C0139e("home_status_custom", ""), new C0139e("theme_wallpaper_enabled", "false"), new C0139e("theme_wallpaper_alpha", "0.28"), new C0139e("theme_wallpaper_path", ""), new C0139e("disable_hot_update", "false"), new C0139e("real_name_tail", "false"), new C0139e("real_name_tail_color", "#9E9E9E"), new C0139e("member_title", "false"), new C0139e("member_title_show_member", "true"), new C0139e("member_title_owner", "群主"), new C0139e("member_title_admin", "管理员"), new C0139e("member_title_member", "成员"), new C0139e("edit_message", "false"), new C0139e("hide_home_divider", "false"), new C0139e("fold_banner_fixed", "true"), new C0139e("bottom_tab_floating", "false"), new C0139e("bottom_tab_floating_labels", "true"), new C0139e("bottom_tab_floating_badge", "true"), new C0139e("bottom_tab_title_chats", "微信"), new C0139e("bottom_tab_title_contacts", "通讯录"), new C0139e("bottom_tab_title_discover", "发现"), new C0139e("bottom_tab_title_me", "我"), new C0139e("night_mode_follow", "true"), new C0139e("night_mode", "false")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0193x.m563g0(65));
        AbstractC0193x.m565i0(linkedHashMap, c0139eArr);
        f2055h = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public static void m1659a() {
        boolean z2;
        ConcurrentHashMap concurrentHashMap;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z3 = true;
        m1665i(true);
        List listM82F = AbstractC0040p.m82F(new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "achat_config.properties"));
        if (listM82F.isEmpty()) {
            z2 = true;
        } else {
            Iterator it = listM82F.iterator();
            while (it.hasNext()) {
                if (((File) it.next()).isFile()) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
        }
        LinkedHashMap linkedHashMap = f2055h;
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            concurrentHashMap = f2049b;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!concurrentHashMap.containsKey(str)) {
                concurrentHashMap.put(str, str2);
                z2 = true;
            }
        }
        Object obj = linkedHashMap.get("detail_template");
        AbstractC0307g.m700b(obj);
        String str3 = (String) obj;
        Object obj2 = linkedHashMap.get("detail_time_pattern");
        AbstractC0307g.m700b(obj2);
        String str4 = (String) obj2;
        Set setM92W = AbstractC0040p.m92W("${time}|${relativeTime}", "${time} ${weekday} ${relativeTime}", "${time}");
        Set setM92W2 = AbstractC0040p.m92W("MM-dd 周一 HH:mm:ss", "MM-dd HH:mm", "yyyy-MM-dd HH:mm:ss");
        if (setM92W.contains(concurrentHashMap.get("detail_template")) || (charSequence2 = (CharSequence) concurrentHashMap.get("detail_template")) == null || AbstractC0425j.m1013R0(charSequence2)) {
            concurrentHashMap.put("detail_template", str3);
            z2 = true;
        }
        if (setM92W2.contains(concurrentHashMap.get("detail_time_pattern")) || (charSequence = (CharSequence) concurrentHashMap.get("detail_time_pattern")) == null || AbstractC0425j.m1013R0(charSequence)) {
            concurrentHashMap.put("detail_time_pattern", str4);
        } else {
            z3 = z2;
        }
        if (z3) {
            m1660b(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1660b(boolean z2) {
        StringBuilder sb = new StringBuilder("# OKK public config\n");
        sb.append("updated=" + System.currentTimeMillis());
        sb.append('\n');
        ConcurrentHashMap concurrentHashMap = f2049b;
        AbstractC0307g.m703e(concurrentHashMap, "<this>");
        for (Map.Entry entry : new TreeMap(concurrentHashMap).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!AbstractC0307g.m699a(str, "updated")) {
                sb.append(str + "=" + str2);
                sb.append('\n');
            }
        }
        String string = sb.toString();
        AbstractC0307g.m702d(string, "toString(...)");
        List<File> listM82F = AbstractC0040p.m82F(new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "achat_config.properties"));
        if (z2) {
            f2053f.execute(new RunnableC0321a(f2051d.incrementAndGet(), listM82F, string, 2));
            return;
        }
        f2051d.incrementAndGet();
        synchronized (f2052e) {
            for (File file : listM82F) {
                try {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    AbstractC0270k.m693j0(file, string, AbstractC0416a.f921a);
                } catch (Throwable th) {
                    AbstractC0040p.m116u(th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1661c(String str, boolean z2) {
        AbstractC0307g.m703e(str, "key");
        ConcurrentHashMap concurrentHashMap = f2049b;
        m1665i(concurrentHashMap.isEmpty());
        String str2 = (String) concurrentHashMap.get(str);
        return str2 == null ? z2 : str2.equalsIgnoreCase("true") || str2.equals("1") || str2.equalsIgnoreCase("yes") || str2.equalsIgnoreCase("on");
    }

    /* JADX INFO: renamed from: d */
    public static String m1662d(String str, String str2) {
        AbstractC0307g.m703e(str2, "default");
        ConcurrentHashMap concurrentHashMap = f2049b;
        m1665i(concurrentHashMap.isEmpty());
        String str3 = (String) concurrentHashMap.get(str);
        return str3 == null ? str2 : str3;
    }

    /* JADX INFO: renamed from: e */
    public static LinkedHashMap m1663e(String str) {
        C0402e c0402e = new C0402e(new C0403f(new C0402e(new C0403f(AbstractC0425j.m1014S0(AbstractC0425j.m1016U0(str, "\ufeff")), new C0570A(17)), true, new C0570A(18)), new C0570A(19)), true, new C0570A(20));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0401d c0401d = new C0401d(c0402e);
        while (c0401d.hasNext()) {
            C0139e c0139e = (C0139e) c0401d.next();
            linkedHashMap.put(c0139e.f328a, c0139e.f329b);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: h */
    public static void m1664h(String str, String str2) {
        m1665i(true);
        f2049b.put(str, str2);
        m1660b(false);
    }

    /* JADX INFO: renamed from: i */
    public static void m1665i(boolean z2) {
        if (!f2054g) {
            f2054g = true;
            try {
                File file = new File("/storage/emulated/0/Android/media/com.tencent.mm/AChat");
                File file2 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK");
                if (file.isDirectory() && !new File(file2, "achat_config.properties").isFile()) {
                    file2.mkdirs();
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file3 : fileArrListFiles) {
                            if (file3.isFile()) {
                                File file4 = new File(file2, file3.getName());
                                if (!file4.isFile()) {
                                    AbstractC0270k.m690g0(file3, file4);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                AbstractC0040p.m116u(th);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z2 || jCurrentTimeMillis - f2050c.get() >= 2000 || !(!f2049b.isEmpty())) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(f2055h);
            for (File file5 : AbstractC0040p.m82F(new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "achat_config.properties"))) {
                if (file5.isFile()) {
                    try {
                        for (Map.Entry entry : m1663e(AbstractC0270k.m692i0(file5, AbstractC0416a.f921a)).entrySet()) {
                            linkedHashMap.put((String) entry.getKey(), (String) entry.getValue());
                        }
                    } catch (Throwable th2) {
                        AbstractC0040p.m116u(th2);
                    }
                }
            }
            ConcurrentHashMap concurrentHashMap = f2049b;
            concurrentHashMap.clear();
            concurrentHashMap.putAll(linkedHashMap);
            f2050c.set(jCurrentTimeMillis);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1666f(String str, String str2, boolean z2) {
        AbstractC0307g.m703e(str, "key");
        AbstractC0307g.m703e(str2, "value");
        m1665i(false);
        f2049b.put(str, str2);
        m1660b(z2);
    }

    /* JADX INFO: renamed from: g */
    public final void m1667g(String str, boolean z2, boolean z3) {
        AbstractC0307g.m703e(str, "key");
        m1666f(str, String.valueOf(z2), z3);
    }
}
