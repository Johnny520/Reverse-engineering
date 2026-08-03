package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f11754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gg.u f11755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r9.f0 f11756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ gg.u f11757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r9.z f11758k;

    public /* synthetic */ k(r9.d0 r1, long r2, gg.u r4, r9.f0 r5, gg.u r6, r9.z r7) {
            r0 = this;
            r0.<init>()
            r0.f11754g = r2
            r0.f11755h = r4
            r0.f11756i = r5
            r0.f11757j = r6
            r0.f11758k = r7
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            java.lang.String r10 = (java.lang.String) r10
            r10.getClass()
            int r0 = r10.hashCode()
            long r1 = r9.f11754g
            r9.f0 r3 = r9.f11756i
            r4 = 2
            r5 = 1
            r6 = 3
            switch(r0) {
                case -2137767260: goto L1fe;
                case -1295335332: goto L1e0;
                case -1294411543: goto L1d0;
                case -1207901313: goto L193;
                case -853116312: goto L182;
                case -853112447: goto L169;
                case -70681671: goto Ldd;
                case 3560141: goto Lb0;
                case 3575610: goto L26;
                case 104191100: goto L15;
                default: goto L13;
            }
        L13:
            goto L206
        L15:
            java.lang.String r0 = "msgId"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L1f
            goto L206
        L1f:
            long r0 = r3.f11704b
            java.lang.String r10 = java.lang.String.valueOf(r0)
            return r10
        L26:
            java.lang.String r0 = "type"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L30
            goto L206
        L30:
            gg.u r10 = r9.f11755h
            java.lang.Object r0 = r10.f4564g
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 10002(0x2712, float:1.4016E-41)
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r0 == 0) goto L41
            int r10 = r0.intValue()
            goto L63
        L41:
            int r0 = r3.f11703a
            if (r0 > 0) goto L46
            goto L5c
        L46:
            r3 = r0 & 255(0xff, float:3.57E-43)
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r0
            int r7 = r0 >>> 16
            if (r7 != 0) goto L51
            goto L5c
        L51:
            if (r4 == r2) goto L5b
            if (r4 == r1) goto L5b
            if (r3 == 0) goto L5c
            if (r4 != r3) goto L5c
            r0 = r3
            goto L5c
        L5b:
            r0 = r4
        L5c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r10.f4564g = r3
            r10 = r0
        L63:
            if (r10 == r5) goto Lad
            if (r10 == r6) goto Laa
            r0 = 34
            if (r10 == r0) goto La7
            r0 = 37
            if (r10 == r0) goto La4
            r0 = 62
            if (r10 == r0) goto La1
            r0 = 66
            if (r10 == r0) goto L9e
            if (r10 == r2) goto L9b
            if (r10 == r1) goto L98
            r0 = 42
            if (r10 == r0) goto L9e
            r0 = 43
            if (r10 == r0) goto L95
            switch(r10) {
                case 47: goto L92;
                case 48: goto L8f;
                case 49: goto L8c;
                case 50: goto L89;
                case 51: goto L89;
                case 52: goto L89;
                case 53: goto L89;
                default: goto L86;
            }
        L86:
            java.lang.String r10 = "未知消息"
            return r10
        L89:
            java.lang.String r10 = "通话消息"
            return r10
        L8c:
            java.lang.String r10 = "链接/卡片"
            return r10
        L8f:
            java.lang.String r10 = "位置"
            return r10
        L92:
            java.lang.String r10 = "表情"
            return r10
        L95:
            java.lang.String r10 = "视频"
            return r10
        L98:
            java.lang.String r10 = "撤回消息"
            return r10
        L9b:
            java.lang.String r10 = "系统消息"
            return r10
        L9e:
            java.lang.String r10 = "名片"
            return r10
        La1:
            java.lang.String r10 = "小视频"
            return r10
        La4:
            java.lang.String r10 = "好友申请"
            return r10
        La7:
            java.lang.String r10 = "语音"
            return r10
        Laa:
            java.lang.String r10 = "图片"
            return r10
        Lad:
            java.lang.String r10 = "文字"
            return r10
        Lb0:
            java.lang.String r0 = "time"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto Lba
            goto L206
        Lba:
            gg.u r10 = r9.f11757j
            java.lang.Object r0 = r10.f4564g
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lc3
            return r0
        Lc3:
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r1)
            java.time.ZoneId r1 = java.time.ZoneId.systemDefault()
            java.time.LocalDateTime r0 = java.time.LocalDateTime.ofInstant(r0, r1)
            r9.z r1 = r9.f11758k
            java.time.format.DateTimeFormatter r1 = r1.f11819e
            java.lang.String r0 = r0.format(r1)
            r10.f4564g = r0
            r0.getClass()
            return r0
        Ldd:
            java.lang.String r0 = "relativeTime"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto Le7
            goto L206
        Le7:
            java.time.ZoneId r10 = java.time.ZoneId.systemDefault()
            java.time.LocalDate r0 = java.time.LocalDate.now(r10)
            long r3 = r0.toEpochDay()
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r1)
            java.time.ZonedDateTime r10 = r0.atZone(r10)
            java.time.LocalDate r10 = r10.toLocalDate()
            long r5 = r10.toEpochDay()
            long r3 = r3 - r5
            r5 = 1
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 <= 0) goto L11c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            java.lang.String r0 = "天前"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            return r10
        L11c:
            if (r10 != 0) goto L121
            java.lang.String r10 = "昨天"
            return r10
        L121:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r0 = 0
            int r10 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r10 > 0) goto L12d
            goto L13a
        L12d:
            r0 = 60000(0xea60, double:2.9644E-319)
            long r0 = r3 / r0
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            long r3 = r3 / r7
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 >= 0) goto L13d
        L13a:
            java.lang.String r10 = "刚刚"
            return r10
        L13d:
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 >= 0) goto L153
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r0 = "分钟前"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            return r10
        L153:
            if (r10 >= 0) goto L156
            goto L157
        L156:
            r5 = r3
        L157:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r0 = "小时前"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            return r10
        L169:
            java.lang.String r0 = "typeHex"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L173
            goto L206
        L173:
            int r10 = r3.f11703a
            r0 = 16
            java.lang.String r10 = java.lang.Integer.toUnsignedString(r10, r0)
            java.lang.String r0 = "0x"
            java.lang.String r10 = wb.en.g(r0, r10)
            return r10
        L182:
            java.lang.String r0 = "typeDec"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L18c
            goto L206
        L18c:
            int r10 = r3.f11703a
            java.lang.String r10 = java.lang.String.valueOf(r10)
            return r10
        L193:
            java.lang.String r0 = "mentionedUsers"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L19c
            goto L206
        L19c:
            l8.c r10 = r9.d0.f(r3)
            int r10 = r10.ordinal()
            if (r10 == 0) goto L1cd
            if (r10 == r5) goto L1ca
            if (r10 == r4) goto L1fb
            if (r10 == r6) goto L1c7
            r0 = 4
            if (r10 != r0) goto L1c2
            java.lang.String r10 = r3.f11711i
            java.util.List r10 = r9.d0.f0(r10)
            int r10 = r10.size()
            java.lang.String r0 = "@"
            java.lang.String r1 = "人"
            java.lang.String r10 = eh.a.m(r10, r0, r1)
            return r10
        L1c2:
            okio.a.k()
            r10 = 0
            return r10
        L1c7:
            java.lang.String r10 = "群公告"
            return r10
        L1ca:
            java.lang.String r10 = "@我"
            return r10
        L1cd:
            java.lang.String r10 = ""
            return r10
        L1d0:
            java.lang.String r0 = "msgSvrId"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L1d9
            goto L206
        L1d9:
            long r0 = r3.f11705c
            java.lang.String r10 = java.lang.String.valueOf(r0)
            return r10
        L1e0:
            java.lang.String r0 = "atUserList"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L1e9
            goto L206
        L1e9:
            l8.c r10 = r9.d0.f(r3)
            int r10 = r10.ordinal()
            if (r10 == r4) goto L1fb
            if (r10 == r6) goto L1f8
            java.lang.String r10 = r3.f11711i
            return r10
        L1f8:
            java.lang.String r10 = "群公告全体"
            return r10
        L1fb:
            java.lang.String r10 = "@所有人"
            return r10
        L1fe:
            java.lang.String r0 = "rawAtUserList"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L208
        L206:
            r10 = 0
            return r10
        L208:
            java.lang.String r10 = r3.f11711i
            return r10
    }
}
