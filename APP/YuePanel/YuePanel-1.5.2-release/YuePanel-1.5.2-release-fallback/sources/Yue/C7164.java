package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7164 {
    public C7164() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m27602(int r1) {
            r0 = 32
            if (r1 < r0) goto L9
            r0 = 55295(0xd7ff, float:7.7485E-41)
            if (r1 <= r0) goto L2b
        L9:
            r0 = 10
            if (r1 == r0) goto L2b
            r0 = 9
            if (r1 == r0) goto L2b
            r0 = 13
            if (r1 == r0) goto L2b
            r0 = 57344(0xe000, float:8.0356E-41)
            if (r1 < r0) goto L1f
            r0 = 65533(0xfffd, float:9.1831E-41)
            if (r1 <= r0) goto L2b
        L1f:
            r0 = 65536(0x10000, float:9.1835E-41)
            if (r1 < r0) goto L29
            r0 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 > r0) goto L29
            goto L2b
        L29:
            r1 = 0
            goto L2c
        L2b:
            r1 = 1
        L2c:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m27603(char r4) {
            int r0 = r4 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18c
            if (r0 == r2) goto L162
            r3 = 2
            if (r0 == r3) goto L150
            r3 = 3
            if (r0 == r3) goto L14a
            r3 = 5
            if (r0 == r3) goto L144
            r3 = 14
            if (r0 == r3) goto L13a
            r3 = 17
            if (r0 == r3) goto L88
            r3 = 32
            if (r0 == r3) goto L82
            r3 = 33
            if (r0 == r3) goto L44
            r3 = 48
            if (r0 == r3) goto L3a
            r3 = 49
            if (r0 == r3) goto L30
            switch(r0) {
                case 249: goto L2f;
                case 250: goto L2f;
                case 251: goto L2f;
                case 252: goto L2f;
                case 253: goto L2f;
                case 254: goto L2f;
                case 255: goto L2f;
                default: goto L2e;
            }
        L2e:
            return r1
        L2f:
            return r2
        L30:
            r0 = 12593(0x3131, float:1.7647E-41)
            if (r4 < r0) goto L39
            r0 = 12686(0x318e, float:1.7777E-41)
            if (r4 > r0) goto L39
            r1 = r2
        L39:
            return r1
        L3a:
            r0 = 12443(0x309b, float:1.7436E-41)
            if (r4 < r0) goto L43
            r0 = 12444(0x309c, float:1.7438E-41)
            if (r4 > r0) goto L43
            r1 = r2
        L43:
            return r1
        L44:
            r0 = 8450(0x2102, float:1.1841E-41)
            if (r4 == r0) goto L80
            r0 = 8455(0x2107, float:1.1848E-41)
            if (r4 == r0) goto L80
            r0 = 8458(0x210a, float:1.1852E-41)
            if (r4 < r0) goto L54
            r0 = 8467(0x2113, float:1.1865E-41)
            if (r4 <= r0) goto L80
        L54:
            r0 = 8469(0x2115, float:1.1868E-41)
            if (r4 == r0) goto L80
            r0 = 8472(0x2118, float:1.1872E-41)
            if (r4 < r0) goto L60
            r0 = 8477(0x211d, float:1.1879E-41)
            if (r4 <= r0) goto L80
        L60:
            r0 = 8484(0x2124, float:1.1889E-41)
            if (r4 == r0) goto L80
            r0 = 8488(0x2128, float:1.1894E-41)
            if (r4 == r0) goto L80
            r0 = 8492(0x212c, float:1.19E-41)
            if (r4 < r0) goto L70
            r0 = 8493(0x212d, float:1.1901E-41)
            if (r4 <= r0) goto L80
        L70:
            r0 = 8495(0x212f, float:1.1904E-41)
            if (r4 < r0) goto L78
            r0 = 8504(0x2138, float:1.1917E-41)
            if (r4 <= r0) goto L80
        L78:
            r0 = 8544(0x2160, float:1.1973E-41)
            if (r4 < r0) goto L81
            r0 = 8575(0x217f, float:1.2016E-41)
            if (r4 > r0) goto L81
        L80:
            r1 = r2
        L81:
            return r1
        L82:
            r0 = 8319(0x207f, float:1.1657E-41)
            if (r4 != r0) goto L87
            r1 = r2
        L87:
            return r1
        L88:
            r0 = 4353(0x1101, float:6.1E-42)
            if (r4 == r0) goto L138
            r0 = 4356(0x1104, float:6.104E-42)
            if (r4 == r0) goto L138
            r0 = 4360(0x1108, float:6.11E-42)
            if (r4 == r0) goto L138
            r0 = 4362(0x110a, float:6.112E-42)
            if (r4 == r0) goto L138
            r0 = 4365(0x110d, float:6.117E-42)
            if (r4 == r0) goto L138
            r0 = 4371(0x1113, float:6.125E-42)
            if (r4 < r0) goto La4
            r0 = 4411(0x113b, float:6.181E-42)
            if (r4 <= r0) goto L138
        La4:
            r0 = 4413(0x113d, float:6.184E-42)
            if (r4 == r0) goto L138
            r0 = 4415(0x113f, float:6.187E-42)
            if (r4 == r0) goto L138
            r0 = 4417(0x1141, float:6.19E-42)
            if (r4 < r0) goto Lb4
            r0 = 4427(0x114b, float:6.204E-42)
            if (r4 <= r0) goto L138
        Lb4:
            r0 = 4429(0x114d, float:6.206E-42)
            if (r4 == r0) goto L138
            r0 = 4431(0x114f, float:6.209E-42)
            if (r4 == r0) goto L138
            r0 = 4433(0x1151, float:6.212E-42)
            if (r4 < r0) goto Lc4
            r0 = 4435(0x1153, float:6.215E-42)
            if (r4 <= r0) goto L138
        Lc4:
            r0 = 4438(0x1156, float:6.219E-42)
            if (r4 < r0) goto Lcc
            r0 = 4440(0x1158, float:6.222E-42)
            if (r4 <= r0) goto L138
        Lcc:
            r0 = 4450(0x1162, float:6.236E-42)
            if (r4 == r0) goto L138
            r0 = 4452(0x1164, float:6.239E-42)
            if (r4 == r0) goto L138
            r0 = 4454(0x1166, float:6.241E-42)
            if (r4 == r0) goto L138
            r0 = 4456(0x1168, float:6.244E-42)
            if (r4 == r0) goto L138
            r0 = 4458(0x116a, float:6.247E-42)
            if (r4 < r0) goto Le4
            r0 = 4460(0x116c, float:6.25E-42)
            if (r4 <= r0) goto L138
        Le4:
            r0 = 4463(0x116f, float:6.254E-42)
            if (r4 < r0) goto Lec
            r0 = 4465(0x1171, float:6.257E-42)
            if (r4 <= r0) goto L138
        Lec:
            r0 = 4468(0x1174, float:6.261E-42)
            if (r4 == r0) goto L138
            r0 = 4470(0x1176, float:6.264E-42)
            if (r4 < r0) goto Lf8
            r0 = 4509(0x119d, float:6.318E-42)
            if (r4 <= r0) goto L138
        Lf8:
            r0 = 4511(0x119f, float:6.321E-42)
            if (r4 < r0) goto L100
            r0 = 4514(0x11a2, float:6.325E-42)
            if (r4 <= r0) goto L138
        L100:
            r0 = 4521(0x11a9, float:6.335E-42)
            if (r4 < r0) goto L108
            r0 = 4522(0x11aa, float:6.337E-42)
            if (r4 <= r0) goto L138
        L108:
            r0 = 4524(0x11ac, float:6.34E-42)
            if (r4 < r0) goto L110
            r0 = 4525(0x11ad, float:6.341E-42)
            if (r4 <= r0) goto L138
        L110:
            r0 = 4528(0x11b0, float:6.345E-42)
            if (r4 < r0) goto L118
            r0 = 4534(0x11b6, float:6.353E-42)
            if (r4 <= r0) goto L138
        L118:
            r0 = 4537(0x11b9, float:6.358E-42)
            if (r4 == r0) goto L138
            r0 = 4539(0x11bb, float:6.36E-42)
            if (r4 == r0) goto L138
            r0 = 4547(0x11c3, float:6.372E-42)
            if (r4 < r0) goto L128
            r0 = 4586(0x11ea, float:6.426E-42)
            if (r4 <= r0) goto L138
        L128:
            r0 = 4588(0x11ec, float:6.429E-42)
            if (r4 < r0) goto L130
            r0 = 4591(0x11ef, float:6.433E-42)
            if (r4 <= r0) goto L138
        L130:
            r0 = 4593(0x11f1, float:6.436E-42)
            if (r4 < r0) goto L139
            r0 = 4600(0x11f8, float:6.446E-42)
            if (r4 > r0) goto L139
        L138:
            r1 = r2
        L139:
            return r1
        L13a:
            r0 = 3804(0xedc, float:5.33E-42)
            if (r4 < r0) goto L143
            r0 = 3805(0xedd, float:5.332E-42)
            if (r4 > r0) goto L143
            r1 = r2
        L143:
            return r1
        L144:
            r0 = 1415(0x587, float:1.983E-42)
            if (r4 != r0) goto L149
            r1 = r2
        L149:
            return r1
        L14a:
            r0 = 890(0x37a, float:1.247E-42)
            if (r4 != r0) goto L14f
            r1 = r2
        L14f:
            return r1
        L150:
            r0 = 688(0x2b0, float:9.64E-43)
            if (r4 < r0) goto L158
            r0 = 696(0x2b8, float:9.75E-43)
            if (r4 <= r0) goto L160
        L158:
            r0 = 736(0x2e0, float:1.031E-42)
            if (r4 < r0) goto L161
            r0 = 740(0x2e4, float:1.037E-42)
            if (r4 > r0) goto L161
        L160:
            r1 = r2
        L161:
            return r1
        L162:
            r0 = 306(0x132, float:4.29E-43)
            if (r4 < r0) goto L16a
            r0 = 307(0x133, float:4.3E-43)
            if (r4 <= r0) goto L18a
        L16a:
            r0 = 319(0x13f, float:4.47E-43)
            if (r4 < r0) goto L172
            r0 = 320(0x140, float:4.48E-43)
            if (r4 <= r0) goto L18a
        L172:
            r0 = 329(0x149, float:4.61E-43)
            if (r4 == r0) goto L18a
            r0 = 383(0x17f, float:5.37E-43)
            if (r4 == r0) goto L18a
            r0 = 452(0x1c4, float:6.33E-43)
            if (r4 < r0) goto L182
            r0 = 460(0x1cc, float:6.45E-43)
            if (r4 <= r0) goto L18a
        L182:
            r0 = 497(0x1f1, float:6.96E-43)
            if (r4 < r0) goto L18b
            r0 = 499(0x1f3, float:6.99E-43)
            if (r4 > r0) goto L18b
        L18a:
            r1 = r2
        L18b:
            return r1
        L18c:
            r0 = 170(0xaa, float:2.38E-43)
            if (r4 == r0) goto L198
            r0 = 181(0xb5, float:2.54E-43)
            if (r4 == r0) goto L198
            r0 = 186(0xba, float:2.6E-43)
            if (r4 != r0) goto L199
        L198:
            r1 = r2
        L199:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m27604(char r1) {
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 == 0) goto L12
            r0 = 65296(0xff10, float:9.1499E-41)
            if (r1 < r0) goto L10
            r0 = 65305(0xff19, float:9.1512E-41)
            if (r1 <= r0) goto L12
        L10:
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m27605(char r1) {
            r0 = 183(0xb7, float:2.56E-43)
            if (r1 == r0) goto L3b
            r0 = 720(0x2d0, float:1.009E-42)
            if (r1 == r0) goto L3b
            r0 = 721(0x2d1, float:1.01E-42)
            if (r1 == r0) goto L3b
            r0 = 903(0x387, float:1.265E-42)
            if (r1 == r0) goto L3b
            r0 = 1600(0x640, float:2.242E-42)
            if (r1 == r0) goto L3b
            r0 = 3654(0xe46, float:5.12E-42)
            if (r1 == r0) goto L3b
            r0 = 3782(0xec6, float:5.3E-42)
            if (r1 == r0) goto L3b
            r0 = 12293(0x3005, float:1.7226E-41)
            if (r1 == r0) goto L3b
            r0 = 12337(0x3031, float:1.7288E-41)
            if (r1 < r0) goto L28
            r0 = 12341(0x3035, float:1.7293E-41)
            if (r1 <= r0) goto L3b
        L28:
            r0 = 12445(0x309d, float:1.7439E-41)
            if (r1 < r0) goto L30
            r0 = 12446(0x309e, float:1.744E-41)
            if (r1 <= r0) goto L3b
        L30:
            r0 = 12540(0x30fc, float:1.7572E-41)
            if (r1 < r0) goto L39
            r0 = 12542(0x30fe, float:1.7575E-41)
            if (r1 > r0) goto L39
            goto L3b
        L39:
            r1 = 0
            goto L3c
        L3b:
            r1 = 1
        L3c:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m27606(char r4) {
            r0 = 97
            r1 = 1
            if (r4 < r0) goto La
            r0 = 122(0x7a, float:1.71E-43)
            if (r4 > r0) goto La
            return r1
        La:
            r0 = 47
            r2 = 0
            if (r4 != r0) goto L10
            return r2
        L10:
            r0 = 65
            if (r4 < r0) goto L19
            r0 = 90
            if (r4 > r0) goto L19
            return r1
        L19:
            int r0 = java.lang.Character.getType(r4)
            if (r0 == r1) goto L43
            r3 = 2
            if (r0 == r3) goto L43
            r3 = 3
            if (r0 == r3) goto L43
            r3 = 5
            if (r0 == r3) goto L43
            r3 = 10
            if (r0 == r3) goto L43
            r0 = 699(0x2bb, float:9.8E-43)
            if (r4 < r0) goto L34
            r0 = 705(0x2c1, float:9.88E-43)
            if (r4 <= r0) goto L42
        L34:
            r0 = 1369(0x559, float:1.918E-42)
            if (r4 == r0) goto L42
            r0 = 1765(0x6e5, float:2.473E-42)
            if (r4 == r0) goto L42
            r0 = 1766(0x6e6, float:2.475E-42)
            if (r4 != r0) goto L41
            goto L42
        L41:
            r1 = r2
        L42:
            return r1
        L43:
            boolean r0 = m27603(r4)
            if (r0 != 0) goto L52
            r0 = 8413(0x20dd, float:1.1789E-41)
            if (r4 < r0) goto L53
            r0 = 8416(0x20e0, float:1.1793E-41)
            if (r4 <= r0) goto L52
            goto L53
        L52:
            r1 = r2
        L53:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m27607(char r3) {
            r0 = 97
            r1 = 1
            if (r3 < r0) goto La
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 > r0) goto La
            return r1
        La:
            r0 = 62
            r2 = 0
            if (r3 != r0) goto L10
            return r2
        L10:
            r0 = 65
            if (r3 < r0) goto L19
            r0 = 90
            if (r3 > r0) goto L19
            return r1
        L19:
            int r0 = java.lang.Character.getType(r3)
            switch(r0) {
                case 1: goto L27;
                case 2: goto L27;
                case 3: goto L27;
                case 4: goto L27;
                case 5: goto L27;
                case 6: goto L27;
                case 7: goto L27;
                case 8: goto L27;
                case 9: goto L27;
                case 10: goto L27;
                default: goto L20;
            }
        L20:
            r0 = 903(0x387, float:1.265E-42)
            if (r3 != r0) goto L25
            goto L26
        L25:
            r1 = r2
        L26:
            return r1
        L27:
            boolean r0 = m27603(r3)
            if (r0 != 0) goto L36
            r0 = 8413(0x20dd, float:1.1789E-41)
            if (r3 < r0) goto L37
            r0 = 8416(0x20e0, float:1.1793E-41)
            if (r3 <= r0) goto L36
            goto L37
        L36:
            r1 = r2
        L37:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m27608(char r1) {
            r0 = 58
            if (r1 == r0) goto Lc
            boolean r1 = m27609(r1)
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m27609(char r3) {
            boolean r0 = m27607(r3)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 62
            r2 = 0
            if (r3 != r0) goto Le
            return r2
        Le:
            r0 = 46
            if (r3 == r0) goto L26
            r0 = 45
            if (r3 == r0) goto L26
            r0 = 95
            if (r3 == r0) goto L26
            r0 = 58
            if (r3 == r0) goto L26
            boolean r3 = m27605(r3)
            if (r3 == 0) goto L25
            goto L26
        L25:
            return r2
        L26:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m27610(char r1) {
            r0 = 32
            if (r1 == r0) goto L13
            r0 = 9
            if (r1 == r0) goto L13
            r0 = 10
            if (r1 == r0) goto L13
            r0 = 13
            if (r1 != r0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            return r1
    }
}
