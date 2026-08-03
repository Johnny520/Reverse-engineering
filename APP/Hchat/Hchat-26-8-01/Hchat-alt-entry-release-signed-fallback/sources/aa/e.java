package aa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f131e;

    public static boolean k(aa.a r2, java.util.LinkedHashMap r3) {
            java.util.Set r0 = r2.f110g
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            boolean r2 = r2.f111h
            return r2
        Lb:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L1b
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1b
            goto L33
        L1b:
            java.util.Iterator r2 = r0.iterator()
        L1f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L1f
            r2 = 1
            return r2
        L33:
            r2 = 0
            return r2
    }

    public static boolean l(boolean r3, java.util.Set r4, java.lang.String r5, l8.e r6, h.Hchat.hooks.api.model.WeChatMessage r7) {
            java.lang.String r6 = r6.f7909e
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L14
            boolean r3 = r7.isText()
            if (r3 == 0) goto L2cc
            boolean r3 = aa.f.c(r6, r5)
            if (r3 == 0) goto L2cd
            goto L2cc
        L14:
            boolean r3 = r7.isText()
            if (r3 == 0) goto L22
            boolean r3 = aa.f.c(r6, r5)
            if (r3 != 0) goto L22
            goto L2cd
        L22:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r3 = r4 instanceof java.util.Collection
            if (r3 == 0) goto L33
            r3 = r4
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L33
            goto L2cd
        L33:
            java.util.Iterator r3 = r4.iterator()
        L37:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2cd
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = j8.b.l(r5, r4, r5)
            int r5 = r4.hashCode()
            switch(r5) {
                case -1708154212: goto L2bd;
                case -1411060288: goto L290;
                case -1135566263: goto L282;
                case -1046338480: goto L279;
                case -887328209: goto L26b;
                case -828210691: goto L248;
                case -707675571: goto L23e;
                case -601741005: goto L22e;
                case -137702515: goto L224;
                case 96801: goto L21a;
                case 110755: goto L20a;
                case 661953: goto L1fa;
                case 696282: goto L1ea;
                case 714190: goto L1e0;
                case 719625: goto L1d0;
                case 825935: goto L1c6;
                case 829104: goto L1b6;
                case 832133: goto L1ac;
                case 837177: goto L1a2;
                case 1024324: goto L198;
                case 1026211: goto L188;
                case 1107293: goto L178;
                case 1132427: goto L168;
                case 1149350: goto L158;
                case 1174330: goto L148;
                case 1179395: goto L13e;
                case 1207911: goto L134;
                case 1225917: goto L124;
                case 3046160: goto L11a;
                case 3321850: goto L110;
                case 3556653: goto L106;
                case 3625376: goto Lfc;
                case 23640627: goto Lf2;
                case 23780314: goto Le8;
                case 24950874: goto Lde;
                case 35126732: goto Ld4;
                case 96632902: goto Lca;
                case 100313435: goto Lc0;
                case 104263205: goto Lb6;
                case 112202875: goto Lac;
                case 112386354: goto La2;
                case 660325424: goto L98;
                case 686998543: goto L8e;
                case 1089303274: goto L84;
                case 1102969846: goto L7a;
                case 1105566277: goto L70;
                case 1280882667: goto L66;
                case 1893962841: goto L5c;
                case 1901043637: goto L52;
                default: goto L50;
            }
        L50:
            goto L2c5
        L52:
            java.lang.String r5 = "location"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L204
            goto L2c5
        L5c:
            java.lang.String r5 = "redpacket"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L192
            goto L2c5
        L66:
            java.lang.String r5 = "transfer"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L152
            goto L2c5
        L70:
            java.lang.String r5 = "语音聊天"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L28b
            goto L2c5
        L7a:
            java.lang.String r5 = "red_packet"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L192
            goto L2c5
        L84:
            java.lang.String r5 = "视频聊天"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L28b
            goto L2c5
        L8e:
            java.lang.String r5 = "地图位置"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L204
            goto L2c5
        L98:
            java.lang.String r5 = "动画表情"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L182
            goto L2c5
        La2:
            java.lang.String r5 = "voice"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L162
            goto L2c5
        Lac:
            java.lang.String r5 = "video"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L172
            goto L2c5
        Lb6:
            java.lang.String r5 = "music"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L12e
            goto L2c5
        Lc0:
            java.lang.String r5 = "image"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1da
            goto L2c5
        Lca:
            java.lang.String r5 = "emoji"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L182
            goto L2c5
        Ld4:
            java.lang.String r5 = "视频号"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L238
            goto L2c5
        Lde:
            java.lang.String r5 = "拍一拍"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L214
            goto L2c5
        Le8:
            java.lang.String r5 = "小视频"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L172
            goto L2c5
        Lf2:
            java.lang.String r5 = "小程序"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L2c6
            goto L2c5
        Lfc:
            java.lang.String r5 = "voip"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L28b
            goto L2c5
        L106:
            java.lang.String r5 = "text"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1c0
            goto L2c5
        L110:
            java.lang.String r5 = "link"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L252
            goto L2c5
        L11a:
            java.lang.String r5 = "card"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1f4
            goto L2c5
        L124:
            java.lang.String r5 = "音乐"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L12e
            goto L2c5
        L12e:
            boolean r4 = r7.isMusic()
            goto L2ca
        L134:
            java.lang.String r5 = "链接"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L252
            goto L2c5
        L13e:
            java.lang.String r5 = "通话"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L28b
            goto L2c5
        L148:
            java.lang.String r5 = "转账"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L152
            goto L2c5
        L152:
            boolean r4 = r7.isTransfer()
            goto L2ca
        L158:
            java.lang.String r5 = "语音"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L162
            goto L2c5
        L162:
            boolean r4 = r7.isVoice()
            goto L2ca
        L168:
            java.lang.String r5 = "视频"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L172
            goto L2c5
        L172:
            boolean r4 = r7.isVideo()
            goto L2ca
        L178:
            java.lang.String r5 = "表情"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L182
            goto L2c5
        L182:
            boolean r4 = r7.isEmoji()
            goto L2ca
        L188:
            java.lang.String r5 = "红包"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L192
            goto L2c5
        L192:
            boolean r4 = r7.isRedPacket()
            goto L2ca
        L198:
            java.lang.String r5 = "系统"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L274
            goto L2c5
        L1a2:
            java.lang.String r5 = "文章"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L252
            goto L2c5
        L1ac:
            java.lang.String r5 = "文本"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1c0
            goto L2c5
        L1b6:
            java.lang.String r5 = "文字"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1c0
            goto L2c5
        L1c0:
            boolean r4 = r7.isText()
            goto L2ca
        L1c6:
            java.lang.String r5 = "文件"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L252
            goto L2c5
        L1d0:
            java.lang.String r5 = "图片"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1da
            goto L2c5
        L1da:
            boolean r4 = r7.isImage()
            goto L2ca
        L1e0:
            java.lang.String r5 = "地图"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L204
            goto L2c5
        L1ea:
            java.lang.String r5 = "名片"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1f4
            goto L2c5
        L1f4:
            boolean r4 = r7.isShareCard()
            goto L2ca
        L1fa:
            java.lang.String r5 = "位置"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L204
            goto L2c5
        L204:
            boolean r4 = r7.isLocation()
            goto L2ca
        L20a:
            java.lang.String r5 = "pat"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L214
            goto L2c5
        L214:
            boolean r4 = r7.isPat()
            goto L2ca
        L21a:
            java.lang.String r5 = "app"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L299
            goto L2c5
        L224:
            java.lang.String r5 = "video_number"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L238
            goto L2c5
        L22e:
            java.lang.String r5 = "视频号链接"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L238
            goto L2c5
        L238:
            boolean r4 = r7.isVideoNumberVideo()
            goto L2ca
        L23e:
            java.lang.String r5 = "miniprogram"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L2c6
            goto L2c5
        L248:
            java.lang.String r5 = "文章/链接"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L252
            goto L2c5
        L252:
            boolean r4 = r7.isLink()
            if (r4 != 0) goto L268
            boolean r4 = r7.isFile()
            if (r4 != 0) goto L268
            boolean r4 = r7.isNote()
            if (r4 == 0) goto L265
            goto L268
        L265:
            r4 = r1
            goto L2ca
        L268:
            r4 = r0
            goto L2ca
        L26b:
            java.lang.String r5 = "system"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L274
            goto L2c5
        L274:
            boolean r4 = r7.isSystem()
            goto L2ca
        L279:
            java.lang.String r5 = "视频语音聊天"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L28b
            goto L2c5
        L282:
            java.lang.String r5 = "视频/语音聊天"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L28b
            goto L2c5
        L28b:
            boolean r4 = r7.isVoip()
            goto L2ca
        L290:
            java.lang.String r5 = "appmsg"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L299
            goto L2c5
        L299:
            int r4 = r7.type
            if (r4 > 0) goto L29e
            goto L2b8
        L29e:
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r4
            int r2 = r4 >>> 16
            if (r2 != 0) goto L2a9
            goto L2b8
        L2a9:
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r6 == r2) goto L2b7
            r2 = 10002(0x2712, float:1.4016E-41)
            if (r6 == r2) goto L2b7
            if (r5 == 0) goto L2b8
            if (r6 != r5) goto L2b8
            r4 = r5
            goto L2b8
        L2b7:
            r4 = r6
        L2b8:
            r5 = 49
            if (r4 != r5) goto L265
            goto L268
        L2bd:
            java.lang.String r5 = "mini_program"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L2c6
        L2c5:
            goto L265
        L2c6:
            boolean r4 = r7.isMiniProgram()
        L2ca:
            if (r4 == 0) goto L37
        L2cc:
            return r0
        L2cd:
            return r1
    }

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "message_block"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            aa.g r5 = new aa.g
            java.lang.String r0 = "拦截指定成员或会话的消息，不显示也不弹通知"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "message_block"
            java.lang.String r3 = "屏蔽消息"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r5) {
            r4 = this;
            r5.getClass()
            android.os.Handler r0 = r8.e.f11615a
            aa.c r0 = new aa.c
            r1 = 0
            r0.<init>(r4, r1, r5)
            r5 = 8
            java.lang.String r1 = "message_block"
            java.lang.String r2 = "屏蔽消息"
            r8.c r3 = r8.c.f11604j
            r8.e.f(r5, r0, r1, r2, r3)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "屏蔽消息"
            return r0
    }
}
