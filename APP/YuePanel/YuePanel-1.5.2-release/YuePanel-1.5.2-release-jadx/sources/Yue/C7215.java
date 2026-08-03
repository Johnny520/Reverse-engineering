package Yue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۡۧۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7215 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f21795 = ":all";

    /* JADX INFO: renamed from: ۥ */
    public final Set<C7217> f2740;

    /* JADX INFO: renamed from: ۥ۟ */
    public final Map<C7217, Set<C1214>> f2741;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Map<C7217, Map<C1214, C1215>> f21796;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Map<C7217, Map<C1214, Set<C7216>>> f21797;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f21798;

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۧ$ۥ */
    public static class C1214 extends AbstractC7218 {
        public C1214(String str) {
            super(str);
        }

        /* JADX INFO: renamed from: ۥ */
        public static C1214 m3509(String str) {
            return new C1214(C6396.m2839(str));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۧ$ۥ۟ */
    public static class C1215 extends AbstractC7218 {
        public C1215(String str) {
            super(str);
        }

        /* JADX INFO: renamed from: ۥ */
        public static C1215 m3510(String str) {
            return new C1215(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۧ$ۥ۟۟, reason: contains not printable characters */
    public static class C7216 extends AbstractC7218 {
        public C7216(String str) {
            super(str);
        }

        /* JADX INFO: renamed from: ۥ */
        public static C7216 m3511(String str) {
            return new C7216(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۧ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C7217 extends AbstractC7218 {
        public C7217(String str) {
            super(str);
        }

        /* JADX INFO: renamed from: ۥ */
        public static C7217 m3512(String str) {
            return new C7217(C6396.m2839(str));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC7218 {

        /* JADX INFO: renamed from: ۥ */
        public final String f2742;

        public AbstractC7218(String str) {
            C8159.m26910(str);
            this.f2742 = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AbstractC7218 abstractC7218 = (AbstractC7218) obj;
            String str = this.f2742;
            return str == null ? abstractC7218.f2742 == null : str.equals(abstractC7218.f2742);
        }

        public int hashCode() {
            String str = this.f2742;
            return 31 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return this.f2742;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7215() {
        this.f2740 = new HashSet();
        this.f2741 = new HashMap();
        this.f21796 = new HashMap();
        this.f21797 = new HashMap();
        this.f21798 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C7215 m22592() {
        return new C7215().m22598(C6608.f2171, "b", "blockquote", "br", "cite", "code", "dd", "dl", "dt", "em", "i", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "u", "ul").m3507(C6608.f2171, "href").m3507("blockquote", "cite").m3507("q", "cite").m22597(C6608.f2171, "href", "ftp", "http", "https", C5905.f14737).m22597("blockquote", "cite", "http", "https").m22597("cite", "cite", "http", "https").m3508(C6608.f2171, "rel", "nofollow");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static C7215 m22593() {
        return m22592().m22598("img").m3507("img", "align", "alt", "height", "src", C6468.f16546, "width").m22597("img", "src", "http", "https");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static C7215 m22594() {
        return new C7215();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static C7215 m22595() {
        return new C7215().m22598(C6608.f2171, "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", "i", "img", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u", "ul").m3507(C6608.f2171, "href", C6468.f16546).m3507("blockquote", "cite").m3507("col", "span", "width").m3507("colgroup", "span", "width").m3507("img", "align", "alt", "height", "src", C6468.f16546, "width").m3507("ol", "start", "type").m3507("q", "cite").m3507("table", "summary", "width").m3507("td", "abbr", "axis", "colspan", "rowspan", "width").m3507("th", "abbr", "axis", "colspan", "rowspan", "scope", "width").m3507("ul", "type").m22597(C6608.f2171, "href", "ftp", "http", "https", C5905.f14737).m22597("blockquote", "cite", "http", "https").m22597("cite", "cite", "http", "https").m22597("img", "src", "http", "https").m22597("q", "cite", "http", "https");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static C7215 m22596() {
        return new C7215().m22598("b", "em", "i", "strong", "u");
    }

    /* JADX INFO: renamed from: ۥ */
    public C7215 m3507(String str, String... strArr) {
        C8159.m26907(str);
        C8159.m26910(strArr);
        C8159.m26904(strArr.length > 0, "No attribute names supplied.");
        m22598(str);
        C7217 c7217M3512 = C7217.m3512(str);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            C8159.m26907(str2);
            hashSet.add(C1214.m3509(str2));
        }
        if (this.f2741.containsKey(c7217M3512)) {
            this.f2741.get(c7217M3512).addAll(hashSet);
        } else {
            this.f2741.put(c7217M3512, hashSet);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public C7215 m3508(String str, String str2, String str3) {
        C8159.m26907(str);
        C8159.m26907(str2);
        C8159.m26907(str3);
        C7217 c7217M3512 = C7217.m3512(str);
        this.f2740.add(c7217M3512);
        C1214 c1214M3509 = C1214.m3509(str2);
        C1215 c1215M3510 = C1215.m3510(str3);
        if (this.f21796.containsKey(c7217M3512)) {
            this.f21796.get(c7217M3512).put(c1214M3509, c1215M3510);
        } else {
            HashMap map = new HashMap();
            map.put(c1214M3509, c1215M3510);
            this.f21796.put(c7217M3512, map);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C7215 m22597(String str, String str2, String... strArr) {
        Map<C1214, Set<C7216>> map;
        Set<C7216> set;
        C8159.m26907(str);
        C8159.m26907(str2);
        C8159.m26910(strArr);
        C7217 c7217M3512 = C7217.m3512(str);
        C1214 c1214M3509 = C1214.m3509(str2);
        if (this.f21797.containsKey(c7217M3512)) {
            map = this.f21797.get(c7217M3512);
        } else {
            HashMap map2 = new HashMap();
            this.f21797.put(c7217M3512, map2);
            map = map2;
        }
        if (map.containsKey(c1214M3509)) {
            set = map.get(c1214M3509);
        } else {
            HashSet hashSet = new HashSet();
            map.put(c1214M3509, hashSet);
            set = hashSet;
        }
        for (String str3 : strArr) {
            C8159.m26907(str3);
            set.add(C7216.m3511(str3));
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C7215 m22598(String... strArr) {
        C8159.m26910(strArr);
        for (String str : strArr) {
            C8159.m26907(str);
            C8159.m26902(str.equalsIgnoreCase("noscript"), "noscript is unsupported in Safelists, due to incompatibilities between parsers with and without script-mode enabled");
            this.f2740.add(C7217.m3512(str));
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C3456 m22599(String str) {
        C3456 c3456 = new C3456();
        C7217 c7217M3512 = C7217.m3512(str);
        if (this.f21796.containsKey(c7217M3512)) {
            for (Map.Entry<C1214, C1215> entry : this.f21796.get(c7217M3512).entrySet()) {
                c3456.m9208(entry.getKey().toString(), entry.getValue().toString());
            }
        }
        return c3456;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m22600(String str, C4605 c4605, C3454 c3454) {
        C7217 c7217M3512 = C7217.m3512(str);
        C1214 c1214M3509 = C1214.m3509(c3454.getKey());
        Set<C1214> set = this.f2741.get(c7217M3512);
        if (set != null && set.contains(c1214M3509)) {
            if (!this.f21797.containsKey(c7217M3512)) {
                return true;
            }
            Map<C1214, Set<C7216>> map = this.f21797.get(c7217M3512);
            return !map.containsKey(c1214M3509) || m22608(c4605, c3454, map.get(c1214M3509));
        }
        if (this.f21796.get(c7217M3512) != null) {
            C3456 c3456M22599 = m22599(str);
            String key = c3454.getKey();
            if (c3456M22599.m9201(key)) {
                return c3456M22599.m9196(key).equals(c3454.getValue());
            }
        }
        return !str.equals(f21795) && m22600(f21795, c4605, c3454);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m22601(String str) {
        return this.f2740.contains(C7217.m3512(str));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m22602(String str) {
        return str.startsWith("#") && !str.matches(".*\\s.*");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C7215 m22603(boolean z) {
        this.f21798 = z;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public C7215 m22604(String str, String... strArr) {
        C8159.m26907(str);
        C8159.m26910(strArr);
        C8159.m26904(strArr.length > 0, "No attribute names supplied.");
        C7217 c7217M3512 = C7217.m3512(str);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            C8159.m26907(str2);
            hashSet.add(C1214.m3509(str2));
        }
        if (this.f2740.contains(c7217M3512) && this.f2741.containsKey(c7217M3512)) {
            Set<C1214> set = this.f2741.get(c7217M3512);
            set.removeAll(hashSet);
            if (set.isEmpty()) {
                this.f2741.remove(c7217M3512);
            }
        }
        if (str.equals(f21795)) {
            Iterator<Map.Entry<C7217, Set<C1214>>> it = this.f2741.entrySet().iterator();
            while (it.hasNext()) {
                Set<C1214> value = it.next().getValue();
                value.removeAll(hashSet);
                if (value.isEmpty()) {
                    it.remove();
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public C7215 m22605(String str, String str2) {
        C8159.m26907(str);
        C8159.m26907(str2);
        C7217 c7217M3512 = C7217.m3512(str);
        if (this.f2740.contains(c7217M3512) && this.f21796.containsKey(c7217M3512)) {
            C1214 c1214M3509 = C1214.m3509(str2);
            Map<C1214, C1215> map = this.f21796.get(c7217M3512);
            map.remove(c1214M3509);
            if (map.isEmpty()) {
                this.f21796.remove(c7217M3512);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public C7215 m22606(String str, String str2, String... strArr) {
        C8159.m26907(str);
        C8159.m26907(str2);
        C8159.m26910(strArr);
        C7217 c7217M3512 = C7217.m3512(str);
        C1214 c1214M3509 = C1214.m3509(str2);
        C8159.m26904(this.f21797.containsKey(c7217M3512), "Cannot remove a protocol that is not set.");
        Map<C1214, Set<C7216>> map = this.f21797.get(c7217M3512);
        C8159.m26904(map.containsKey(c1214M3509), "Cannot remove a protocol that is not set.");
        Set<C7216> set = map.get(c1214M3509);
        for (String str3 : strArr) {
            C8159.m26907(str3);
            set.remove(C7216.m3511(str3));
        }
        if (set.isEmpty()) {
            map.remove(c1214M3509);
            if (map.isEmpty()) {
                this.f21797.remove(c7217M3512);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C7215 m22607(String... strArr) {
        C8159.m26910(strArr);
        for (String str : strArr) {
            C8159.m26907(str);
            C7217 c7217M3512 = C7217.m3512(str);
            if (this.f2740.remove(c7217M3512)) {
                this.f2741.remove(c7217M3512);
                this.f21796.remove(c7217M3512);
                this.f21797.remove(c7217M3512);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final boolean m22608(C4605 c4605, C3454 c3454, Set<C7216> set) {
        String strMo17593 = c4605.mo17593(c3454.getKey());
        if (strMo17593.length() == 0) {
            strMo17593 = c3454.getValue();
        }
        if (!this.f21798) {
            c3454.setValue(strMo17593);
        }
        Iterator<C7216> it = set.iterator();
        while (it.hasNext()) {
            String string = it.next().toString();
            if (!string.equals("#")) {
                if (C6396.m2839(strMo17593).startsWith(string + ":")) {
                    return true;
                }
            } else if (m22602(strMo17593)) {
                return true;
            }
        }
        return false;
    }

    public C7215(C7215 c7215) {
        this();
        this.f2740.addAll(c7215.f2740);
        for (Map.Entry<C7217, Set<C1214>> entry : c7215.f2741.entrySet()) {
            this.f2741.put(entry.getKey(), new HashSet(entry.getValue()));
        }
        for (Map.Entry<C7217, Map<C1214, C1215>> entry2 : c7215.f21796.entrySet()) {
            this.f21796.put(entry2.getKey(), new HashMap(entry2.getValue()));
        }
        for (Map.Entry<C7217, Map<C1214, Set<C7216>>> entry3 : c7215.f21797.entrySet()) {
            HashMap map = new HashMap();
            for (Map.Entry<C1214, Set<C7216>> entry4 : entry3.getValue().entrySet()) {
                map.put(entry4.getKey(), new HashSet(entry4.getValue()));
            }
            this.f21797.put(entry3.getKey(), map);
        }
        this.f21798 = c7215.f21798;
    }
}
