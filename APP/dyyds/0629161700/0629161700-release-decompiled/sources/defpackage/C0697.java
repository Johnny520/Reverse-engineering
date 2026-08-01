package defpackage;

/* JADX INFO: renamed from: ᛴᛶᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0697 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C0697 f3343 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.List f3344 = null;

    static {
            r0 = -194871540751918(0xffff4ec3ef0961d2, double:NaN)
            r0 = -194961735065134(0xffff4eaeef0961d2, double:NaN)
            r0 = -195008979705390(0xffff4ea3ef0961d2, double:NaN)
            r0 = -195107763953198(0xffff4e8cef0961d2, double:NaN)
            ᛴᛶᲁᛲ r0 = new ᛴᛶᲁᛲ
            r0.<init>()
            defpackage.C0697.f3343 = r0
            r0 = -195159303560750(0xffff4e80ef0961d2, double:NaN)
            java.lang.String r2 = "❤️ 美女"
            r0 = -195185073364526(0xffff4e7aef0961d2, double:NaN)
            java.lang.String r3 = "😄 有趣"
            r0 = -195210843168302(0xffff4e74ef0961d2, double:NaN)
            java.lang.String r4 = "⏰ 稍后再看"
            r0 = -195240907939374(0xffff4e6def0961d2, double:NaN)
            java.lang.String r5 = "💡 重要内容"
            r0 = -195275267677742(0xffff4e65ef0961d2, double:NaN)
            java.lang.String r6 = "📚 学习"
            r0 = -195301037481518(0xffff4e5fef0961d2, double:NaN)
            java.lang.String r7 = "🎵 音乐"
            r0 = -195326807285294(0xffff4e59ef0961d2, double:NaN)
            java.lang.String r8 = "🎬 电影"
            r0 = -195352577089070(0xffff4e53ef0961d2, double:NaN)
            java.lang.String r9 = "🍔 美食"
            r0 = -195378346892846(0xffff4e4def0961d2, double:NaN)
            java.lang.String r10 = "✈️ 旅行"
            r0 = -195404116696622(0xffff4e47ef0961d2, double:NaN)
            java.lang.String r11 = "💼 工作"
            r0 = -195429886500398(0xffff4e41ef0961d2, double:NaN)
            java.lang.String r12 = "🎮 游戏"
            r0 = -195455656304174(0xffff4e3bef0961d2, double:NaN)
            java.lang.String r13 = "📱 科技"
            r0 = -195481426107950(0xffff4e35ef0961d2, double:NaN)
            java.lang.String r14 = "🌟 灵感"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}
            java.util.List r0 = defpackage.AbstractC0425.m1186(r0)
            defpackage.C0697.f3344 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m1576(android.content.Context r8, java.util.List r9) {
            r0 = -194695447092782(0xffff4eecef0961d2, double:NaN)
            r0 = -194729806831150(0xffff4ee4ef0961d2, double:NaN)
            android.content.SharedPreferences r8 = m1578(r8)
            r0 = -194832886046254(0xffff4eccef0961d2, double:NaN)
            java.lang.String r3 = ","
            r0 = -194841475980846(0xffff4ecaef0961d2, double:NaN)
            java.lang.String r4 = "["
            r0 = -194850065915438(0xffff4ec8ef0961d2, double:NaN)
            java.lang.String r5 = "]"
            ᛶᛳᛷᲀ r6 = new ᛶᛳᛷᲀ
            r0 = 9
            r6.<init>(r0)
            r7 = 24
            r2 = r9
            java.lang.String r9 = defpackage.AbstractC1107.m2125(r2, r3, r4, r5, r6, r7)
            android.content.SharedPreferences$Editor r8 = r8.edit()
            r0 = -194777051471406(0xffff4ed9ef0961d2, double:NaN)
            java.lang.String r0 = "categories"
            r8.putString(r0, r9)
            r8.apply()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.util.ArrayList m1577(android.content.Context r6) {
            r0 = -193797798927918(0xffff4fbdef0961d2, double:NaN)
            android.content.SharedPreferences r0 = m1578(r6)
            r1 = -193694719712814(0xffff4fd5ef0961d2, double:NaN)
            java.lang.String r1 = "initialized"
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            r3 = 1
            if (r1 != 0) goto L35
            java.util.List r1 = defpackage.C0697.f3344
            m1576(r6, r1)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r4 = -193746259320366(0xffff4fc9ef0961d2, double:NaN)
            java.lang.String r1 = "initialized"
            r0.putBoolean(r1, r3)
            r0.apply()
        L35:
            android.content.SharedPreferences r6 = m1578(r6)
            r0 = -193832158666286(0xffff4fb5ef0961d2, double:NaN)
            java.lang.String r0 = "categories"
            r4 = -193879403306542(0xffff4faaef0961d2, double:NaN)
            java.lang.String r1 = "[]"
            java.lang.String r6 = r6.getString(r0, r1)
            if (r6 != 0) goto L5a
            r0 = -193892288208430(0xffff4fa7ef0961d2, double:NaN)
            java.lang.String r6 = "[]"
        L5a:
            r0 = 2
            char[] r0 = new char[r0]     // Catch: java.lang.Exception -> Lc5
            r0 = {x00ce: FILL_ARRAY_DATA , data: [91, 93} // fill-array     // Catch: java.lang.Exception -> Lc5
            java.lang.String r6 = defpackage.AbstractC1347.m2503(r6, r0)     // Catch: java.lang.Exception -> Lc5
            r0 = -194824296111662(0xffff4eceef0961d2, double:NaN)
            java.lang.String r0 = ","     // Catch: java.lang.Exception -> Lc5
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> Lc5
            r1 = 6
            java.util.List r6 = defpackage.AbstractC1347.m2519(r6, r0, r1)     // Catch: java.lang.Exception -> Lc5
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lc5
            int r1 = defpackage.AbstractC0575.m1369(r6)     // Catch: java.lang.Exception -> Lc5
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lc5
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> Lc5
        L83:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> Lc5
            if (r1 == 0) goto La5
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lc5
            java.lang.CharSequence r1 = defpackage.AbstractC1347.m2521(r1)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lc5
            char[] r4 = new char[r3]     // Catch: java.lang.Exception -> Lc5
            r5 = 34
            r4[r2] = r5     // Catch: java.lang.Exception -> Lc5
            java.lang.String r1 = defpackage.AbstractC1347.m2503(r1, r4)     // Catch: java.lang.Exception -> Lc5
            r0.add(r1)     // Catch: java.lang.Exception -> Lc5
            goto L83
        La5:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lc5
            r6.<init>()     // Catch: java.lang.Exception -> Lc5
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Lc5
        Lae:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> Lc5
            if (r1 == 0) goto Lc7
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> Lc5
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lc5
            int r2 = r2.length()     // Catch: java.lang.Exception -> Lc5
            if (r2 <= 0) goto Lae
            r6.add(r1)     // Catch: java.lang.Exception -> Lc5
            goto Lae
        Lc5:
            ᲀᛶᲇ r6 = defpackage.C1698.f7558
        Lc7:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static android.content.SharedPreferences m1578(android.content.Context r2) {
            r0 = -194493583629870(0xffff4f1bef0961d2, double:NaN)
            java.lang.String r0 = "category_preferences"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            r0 = -194583777943086(0xffff4f06ef0961d2, double:NaN)
            return r2
    }
}
