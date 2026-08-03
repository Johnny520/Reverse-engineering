package me.yun.silk.utils;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Conversion {
    public static final int $stable = 0;
    public static final me.yun.silk.utils.Conversion.Companion Companion = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(int r0, me.yun.silk.SilkCodec r1, java.lang.String r2, java.lang.String r3, int r4, me.yun.silk.utils.Conversion.ConversionCallback r5) {
                startTransform$lambda$0(r0, r1, r2, r3, r4, r5)
                return
        }

        private final java.lang.String getErrorMsg(int r3) {
                r2 = this;
                if (r3 == 0) goto Ld7
                r0 = -1
                if (r3 == r0) goto Ld4
                r0 = -2
                if (r3 == r0) goto Ld1
                r0 = -3
                if (r3 == r0) goto Lce
                r0 = -4
                if (r3 == r0) goto Lcb
                r0 = -5
                if (r3 == r0) goto Lc8
                r0 = -1022(0xfffffffffffffc02, float:NaN)
                java.lang.String r1 = "错误码:"
                if (r3 == r0) goto Lc1
                r0 = -1021(0xfffffffffffffc03, float:NaN)
                if (r3 == r0) goto Lc1
                r0 = -1012(0xfffffffffffffc0c, float:NaN)
                if (r3 == r0) goto Lba
                r0 = -1011(0xfffffffffffffc0d, float:NaN)
                if (r3 == r0) goto Lba
                r0 = -912(0xfffffffffffffc70, float:NaN)
                if (r3 == r0) goto Lb3
                r0 = -911(0xfffffffffffffc71, float:NaN)
                if (r3 == r0) goto Lb3
                r0 = -902(0xfffffffffffffc7a, float:NaN)
                if (r3 == r0) goto Lac
                r0 = -901(0xfffffffffffffc7b, float:NaN)
                if (r3 == r0) goto Lac
                r0 = -602(0xfffffffffffffda6, float:NaN)
                if (r3 == r0) goto La5
                r0 = -601(0xfffffffffffffda7, float:NaN)
                if (r3 == r0) goto La5
                r0 = -502(0xfffffffffffffe0a, float:NaN)
                if (r3 == r0) goto L9e
                r0 = -501(0xfffffffffffffe0b, float:NaN)
                if (r3 == r0) goto L9e
                r0 = -402(0xfffffffffffffe6e, float:NaN)
                if (r3 == r0) goto L97
                r0 = -401(0xfffffffffffffe6f, float:NaN)
                if (r3 == r0) goto L97
                r0 = -302(0xfffffffffffffed2, float:NaN)
                if (r3 == r0) goto L90
                r0 = -301(0xfffffffffffffed3, float:NaN)
                if (r3 == r0) goto L90
                switch(r3) {
                    case -2000: goto L8d;
                    case -1041: goto L8a;
                    case -1031: goto L87;
                    case -1001: goto L84;
                    case -803: goto L81;
                    case -802: goto L7a;
                    case -801: goto L7a;
                    case -202: goto L73;
                    case -201: goto L73;
                    case -13: goto L70;
                    case -12: goto L6d;
                    case -11: goto L6a;
                    case -10: goto L67;
                    case 0: goto Ld7;
                    default: goto L56;
                }
            L56:
                switch(r3) {
                    case -703: goto L60;
                    case -702: goto L60;
                    case -701: goto L60;
                    default: goto L59;
                }
            L59:
                java.lang.String r0 = " -> 未知错误"
                java.lang.String r3 = eh.a.m(r3, r1, r0)
                return r3
            L60:
                java.lang.String r0 = " -> PCM 参数错误"
                java.lang.String r3 = eh.a.m(r3, r1, r0)
                return r3
            L67:
                java.lang.String r3 = "错误码:-10 -> 输出必须是 .silk 或 .slk"
                return r3
            L6a:
                java.lang.String r3 = "错误码:-11 -> 输出必须是 .mp3"
                return r3
            L6d:
                java.lang.String r3 = "错误码:-12 -> 输出必须是 .pcm 或 .raw"
                return r3
            L70:
                java.lang.String r3 = "错误码:-13 -> 文件格式与方法不匹配"
                return r3
            L73:
                java.lang.String r0 = " -> Silk 转 MP3 文件错误"
                java.lang.String r3 = eh.a.m(r3, r1, r0)
                return r3
            L7a:
                java.lang.String r0 = " -> AAC/M4A 解码错误 (文件读取失败)"
                java.lang.String r3 = eh.a.m(r3, r1, r0)
                return r3
            L81:
                java.lang.String r3 = "错误码:-803 -> AAC/M4A 解码错误 (格式不支持)"
                return r3
            L84:
                java.lang.String r3 = "错误码:-1001 -> Silk 转 AAC/M4A 错误"
                return r3
            L87:
                java.lang.String r3 = "错误码:-1031 -> AAC/M4A 转 Silk 错误"
                return r3
            L8a:
                java.lang.String r3 = "错误码:-1041 -> 中间转换错误"
                return r3
            L8d:
                java.lang.String r3 = "错误码:-2000 -> M4A/AAC 转 Silk 错误 (解码失败)"
                return r3
            L90:
                java.lang.String r0 = " -> MP3 解码错误"
                java.lang.String r3 = eh.a.m(r3, r1, r0)
                return r3
            L97:
                java.lang.String r0 = " -> OGG 解码错误"
                java.lang.String r3 = eh.a.m(r3, r1, r0)
                return r3
            L9e:
                java.lang.String r0 = " -> WAV 解码错误"
                java.lang.String r3 = eh.a.m(r3, r1, r0)
                return r3
            La5:
                java.lang.String r0 = " -> FLAC 解码错误"
                java.lang.String r3 = eh.a.m(r3, r1, r0)
                return r3
            Lac:
                java.lang.String r0 = " -> AAC/M4A 编码错误"
                java.lang.String r3 = eh.a.m(r3, r1, r0)
                return r3
            Lb3:
                java.lang.String r0 = " -> M4A 编码错误"
                java.lang.String r3 = eh.a.m(r3, r1, r0)
                return r3
            Lba:
                java.lang.String r0 = " -> MP3 转 AAC/M4A 错误"
                java.lang.String r3 = eh.a.m(r3, r1, r0)
                return r3
            Lc1:
                java.lang.String r0 = " -> WAV 转 AAC/M4A 错误"
                java.lang.String r3 = eh.a.m(r3, r1, r0)
                return r3
            Lc8:
                java.lang.String r3 = "错误码:-5 -> 输入已经是 Silk 格式"
                return r3
            Lcb:
                java.lang.String r3 = "错误码:-4 -> 输入已经是 PCM 格式"
                return r3
            Lce:
                java.lang.String r3 = "错误码:-3 -> PCM 转 Silk 需要额外参数"
                return r3
            Ld1:
                java.lang.String r3 = "错误码:-2 -> 不支持的音频格式"
                return r3
            Ld4:
                java.lang.String r3 = "错误码:-1 -> 无法获取文件扩展名"
                return r3
            Ld7:
                java.lang.String r3 = "成功"
                return r3
        }

        private static final void startTransform$lambda$0(int r1, me.yun.silk.SilkCodec r2, java.lang.String r3, java.lang.String r4, int r5, me.yun.silk.utils.Conversion.ConversionCallback r6) {
                if (r1 == 0) goto L2a
                r0 = 1
                if (r1 == r0) goto L25
                switch(r1) {
                    case 5: goto L20;
                    case 6: goto L1b;
                    case 7: goto L16;
                    case 8: goto L11;
                    case 9: goto La;
                    default: goto L8;
                }
            L8:
                r1 = -2
                goto L2e
            La:
                int r1 = me.yun.silk.AacCodec.m4aToSilk(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> Lf
                goto L2e
            Lf:
                r1 = move-exception
                goto L40
            L11:
                int r1 = me.yun.silk.AacCodec.autoToM4a(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> Lf
                goto L2e
            L16:
                int r1 = me.yun.silk.AacCodec.autoToAac(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> Lf
                goto L2e
            L1b:
                int r1 = me.yun.silk.AacCodec.autoToPcmCompat(r3, r4, r2)     // Catch: java.lang.Throwable -> Lf
                goto L2e
            L20:
                int r1 = me.yun.silk.AacCodec.autoToSilkCompat(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> Lf
                goto L2e
            L25:
                int r1 = r2.mp3ToSilk(r3, r4, r5)     // Catch: java.lang.Throwable -> Lf
                goto L2e
            L2a:
                int r1 = r2.silkToMp3(r3, r4, r5)     // Catch: java.lang.Throwable -> Lf
            L2e:
                if (r1 != 0) goto L36
                r1 = 100
                r6.onProgress(r1)     // Catch: java.lang.Throwable -> Lf
                return
            L36:
                me.yun.silk.utils.Conversion$Companion r2 = me.yun.silk.utils.Conversion.Companion     // Catch: java.lang.Throwable -> Lf
                java.lang.String r1 = r2.getErrorMsg(r1)     // Catch: java.lang.Throwable -> Lf
                r6.onMessage(r1)     // Catch: java.lang.Throwable -> Lf
                return
            L40:
                java.lang.String r1 = r1.getMessage()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "异常: "
                r2.<init>(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r6.onMessage(r1)
                return
        }

        public final int m4aToPcm(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                int r1 = me.yun.silk.AacCodec.m4aToPcm(r1, r2)
                return r1
        }

        public final int m4aToSilk(me.yun.silk.SilkCodec r1, java.lang.String r2, java.lang.String r3, int r4) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r3.getClass()
                int r1 = me.yun.silk.AacCodec.m4aToSilk(r2, r3, r1, r4)
                return r1
        }

        public final int pcmToAac(java.lang.String r1, java.lang.String r2, int r3, int r4) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                int r1 = me.yun.silk.AacCodec.pcmToAac(r1, r2, r3, r4)
                return r1
        }

        public final int pcmToM4a(java.lang.String r1, java.lang.String r2, int r3, int r4) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                int r1 = me.yun.silk.AacCodec.pcmToM4a(r1, r2, r3, r4)
                return r1
        }

        public final int silkToAac(me.yun.silk.SilkCodec r1, java.lang.String r2, java.lang.String r3, int r4) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r3.getClass()
                int r1 = me.yun.silk.AacCodec.silkToAac(r2, r3, r1, r4)
                return r1
        }

        public final int silkToM4a(me.yun.silk.SilkCodec r1, java.lang.String r2, java.lang.String r3, int r4) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                r3.getClass()
                int r1 = me.yun.silk.AacCodec.silkToM4a(r2, r3, r1, r4)
                return r1
        }

        public final void startTransform(me.yun.silk.SilkCodec r9, int r10, java.lang.String r11, java.lang.String r12, int r13, me.yun.silk.utils.Conversion.ConversionCallback r14) {
                r8 = this;
                r9.getClass()
                r11.getClass()
                r12.getClass()
                r14.getClass()
                java.lang.Thread r0 = new java.lang.Thread
                zg.a r1 = new zg.a
                r3 = r9
                r2 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r0.<init>(r1)
                r0.start()
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface ConversionCallback {

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public static final class DefaultImpls {
            @java.lang.Deprecated
            public static void onProgress(me.yun.silk.utils.Conversion.ConversionCallback r0, int r1) {
                    me.yun.silk.utils.Conversion.ConversionCallback.access$onProgress$jd(r0, r1)
                    return
            }
        }

        static /* synthetic */ void access$onProgress$jd(me.yun.silk.utils.Conversion.ConversionCallback r0, int r1) {
                super.onProgress(r1)
                return
        }

        void onMessage(java.lang.String r1);

        default void onProgress(int r1) {
                r0 = this;
                return
        }
    }

    static {
            me.yun.silk.utils.Conversion$Companion r0 = new me.yun.silk.utils.Conversion$Companion
            r1 = 0
            r0.<init>(r1)
            me.yun.silk.utils.Conversion.Companion = r0
            return
    }

    public Conversion() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final int m4aToPcm(java.lang.String r1, java.lang.String r2) {
            me.yun.silk.utils.Conversion$Companion r0 = me.yun.silk.utils.Conversion.Companion
            int r1 = r0.m4aToPcm(r1, r2)
            return r1
    }

    public static final int m4aToSilk(me.yun.silk.SilkCodec r1, java.lang.String r2, java.lang.String r3, int r4) {
            me.yun.silk.utils.Conversion$Companion r0 = me.yun.silk.utils.Conversion.Companion
            int r1 = r0.m4aToSilk(r1, r2, r3, r4)
            return r1
    }

    public static final int pcmToAac(java.lang.String r1, java.lang.String r2, int r3, int r4) {
            me.yun.silk.utils.Conversion$Companion r0 = me.yun.silk.utils.Conversion.Companion
            int r1 = r0.pcmToAac(r1, r2, r3, r4)
            return r1
    }

    public static final int pcmToM4a(java.lang.String r1, java.lang.String r2, int r3, int r4) {
            me.yun.silk.utils.Conversion$Companion r0 = me.yun.silk.utils.Conversion.Companion
            int r1 = r0.pcmToM4a(r1, r2, r3, r4)
            return r1
    }

    public static final int silkToAac(me.yun.silk.SilkCodec r1, java.lang.String r2, java.lang.String r3, int r4) {
            me.yun.silk.utils.Conversion$Companion r0 = me.yun.silk.utils.Conversion.Companion
            int r1 = r0.silkToAac(r1, r2, r3, r4)
            return r1
    }

    public static final int silkToM4a(me.yun.silk.SilkCodec r1, java.lang.String r2, java.lang.String r3, int r4) {
            me.yun.silk.utils.Conversion$Companion r0 = me.yun.silk.utils.Conversion.Companion
            int r1 = r0.silkToM4a(r1, r2, r3, r4)
            return r1
    }

    public static final void startTransform(me.yun.silk.SilkCodec r7, int r8, java.lang.String r9, java.lang.String r10, int r11, me.yun.silk.utils.Conversion.ConversionCallback r12) {
            me.yun.silk.utils.Conversion$Companion r0 = me.yun.silk.utils.Conversion.Companion
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.startTransform(r1, r2, r3, r4, r5, r6)
            return
    }
}
