package me.yun.silk;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class AacCodec {
    private static final long DECODE_STALL_TIMEOUT_MS = 30000;
    private static final int DEFAULT_BIT_RATE = 128000;
    private static final int DEFAULT_CHANNEL_COUNT = 1;
    private static final int DEFAULT_SAMPLE_RATE = 44100;
    private static final int TIMEOUT_US = 10000;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface AacCallback {
        void onMessage(java.lang.String r1);

        void onProgress(int r1);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class AudioInfo {
        int channelCount;
        int sampleRate;

        public AudioInfo(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.sampleRate = r1
                r0.channelCount = r2
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class DecodeResult {
        me.yun.silk.AacCodec.AudioInfo audioInfo;
        int code;

        public DecodeResult(int r1, me.yun.silk.AacCodec.AudioInfo r2) {
                r0 = this;
                r0.<init>()
                r0.code = r1
                r0.audioInfo = r2
                return
        }
    }

    public AacCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int aacToPcm(java.lang.String r1, java.lang.String r2) {
            r0 = 0
            int r1 = decodeAacFile(r1, r2, r0)
            return r1
    }

    public static int aacToSilk(java.lang.String r0, java.lang.String r1, me.yun.silk.SilkCodec r2, int r3) {
            int r0 = mp4ToSilk(r0, r1, r2, r3)
            return r0
    }

    public static int autoAacToSilk(java.lang.String r0, java.lang.String r1, me.yun.silk.SilkCodec r2, int r3) {
            int r0 = m4aToSilk(r0, r1, r2, r3)
            return r0
    }

    public static int autoToAac(java.lang.String r1, java.lang.String r2, me.yun.silk.SilkCodec r3, int r4) {
            boolean r0 = isOggOpusFile(r1)
            if (r0 == 0) goto Lb
            int r1 = oggToAac(r1, r2, r4)
            return r1
        Lb:
            int r0 = r3.getFileType(r1)
            switch(r0) {
                case 1: goto L32;
                case 2: goto L2d;
                case 3: goto L28;
                case 4: goto L23;
                case 5: goto L1e;
                case 6: goto L12;
                case 7: goto L19;
                case 8: goto L14;
                default: goto L12;
            }
        L12:
            r1 = -2
            return r1
        L14:
            int r1 = mp4ToAac(r1, r2, r4)
            return r1
        L19:
            int r1 = m4aToAac(r1, r2, r4)
            return r1
        L1e:
            int r1 = oggToAac(r1, r2, r4)
            return r1
        L23:
            int r1 = flacToAac(r1, r2, r4)
            return r1
        L28:
            int r1 = wavToAac(r1, r2, r4)
            return r1
        L2d:
            int r1 = mp3ToAac(r1, r2, r4)
            return r1
        L32:
            int r1 = silkToAac(r1, r2, r3, r4)
            return r1
    }

    public static int autoToM4a(java.lang.String r1, java.lang.String r2, me.yun.silk.SilkCodec r3, int r4) {
            boolean r0 = isOggOpusFile(r1)
            if (r0 == 0) goto Lb
            int r1 = oggToM4a(r1, r2, r4)
            return r1
        Lb:
            int r0 = r3.getFileType(r1)
            switch(r0) {
                case 1: goto L32;
                case 2: goto L2d;
                case 3: goto L28;
                case 4: goto L23;
                case 5: goto L1e;
                case 6: goto L12;
                case 7: goto L19;
                case 8: goto L14;
                default: goto L12;
            }
        L12:
            r1 = -2
            return r1
        L14:
            int r1 = mp4ToM4a(r1, r2, r4)
            return r1
        L19:
            int r1 = m4aToM4a(r1, r2, r4)
            return r1
        L1e:
            int r1 = oggToM4a(r1, r2, r4)
            return r1
        L23:
            int r1 = flacToM4a(r1, r2, r4)
            return r1
        L28:
            int r1 = wavToM4a(r1, r2, r4)
            return r1
        L2d:
            int r1 = mp3ToM4a(r1, r2, r4)
            return r1
        L32:
            int r1 = silkToM4a(r1, r2, r3, r4)
            return r1
    }

    public static int autoToPcmCompat(java.lang.String r2, java.lang.String r3, me.yun.silk.SilkCodec r4) {
            boolean r0 = isOggOpusFile(r2)
            if (r0 != 0) goto L13
            int r0 = r4.getFileType(r2)
            r1 = 5
            if (r0 != r1) goto Le
            goto L13
        Le:
            int r2 = r4.autoToPcm(r2, r3)
            return r2
        L13:
            int r2 = oggToPcmCompat(r2, r3, r4)
            return r2
    }

    public static int autoToSilkCompat(java.lang.String r2, java.lang.String r3, me.yun.silk.SilkCodec r4, int r5) {
            boolean r0 = isOggOpusFile(r2)
            if (r0 != 0) goto L13
            int r0 = r4.getFileType(r2)
            r1 = 5
            if (r0 != r1) goto Le
            goto L13
        Le:
            int r2 = r4.autoToSilk(r2, r3, r5)
            return r2
        L13:
            int r2 = oggToSilkCompat(r2, r3, r4, r5)
            return r2
    }

    private static byte[] createAdtsHeader(int r8, int r9, int r10) {
            int r8 = getSampleRateIndex(r8)
            r0 = 2
            int r8 = r8 << r0
            r8 = r8 | 64
            int r1 = r9 >> 2
            r8 = r8 | r1
            byte r8 = (byte) r8
            r1 = 3
            r9 = r9 & r1
            r2 = 6
            int r9 = r9 << r2
            r3 = 7
            int r10 = r10 + r3
            int r4 = r10 >> 11
            r9 = r9 | r4
            byte r9 = (byte) r9
            int r4 = r10 >> 3
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r10 = r10 & r3
            r5 = 5
            int r10 = r10 << r5
            r10 = r10 | 31
            byte r10 = (byte) r10
            byte[] r3 = new byte[r3]
            r6 = -1
            r7 = 0
            r3[r7] = r6
            r6 = -15
            r7 = 1
            r3[r7] = r6
            r3[r0] = r8
            r3[r1] = r9
            r8 = 4
            r3[r8] = r4
            r3[r5] = r10
            r8 = -4
            r3[r2] = r8
            return r3
    }

    public static int decodeAacFile(java.lang.String r0, java.lang.String r1, me.yun.silk.AacCodec.AacCallback r2) {
            me.yun.silk.AacCodec$DecodeResult r0 = decodeAacFileWithInfo(r0, r1, r2)
            int r0 = r0.code
            return r0
    }

    private static me.yun.silk.AacCodec.DecodeResult decodeAacFileWithInfo(java.lang.String r33, java.lang.String r34, me.yun.silk.AacCodec.AacCallback r35) {
            r0 = r33
            r1 = r34
            r2 = r35
            java.lang.String r3 = "channel-count"
            java.lang.String r4 = "sample-rate"
            java.lang.String r5 = "文件不存在: "
            if (r2 == 0) goto L1f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "开始解码: "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r2.onMessage(r6)
        L1f:
            android.media.MediaExtractor r6 = new android.media.MediaExtractor
            r6.<init>()
            r8 = 44100(0xac44, float:6.1797E-41)
            r9 = 0
            r10 = 0
            r11 = 1
            java.io.File r12 = new java.io.File     // Catch: java.lang.Throwable -> L35c java.lang.Exception -> L363
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L35c java.lang.Exception -> L363
            boolean r12 = r12.exists()     // Catch: java.lang.Throwable -> L35c java.lang.Exception -> L363
            if (r12 != 0) goto L6e
            if (r2 == 0) goto L53
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r3.append(r0)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r2.onMessage(r0)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            goto L53
        L47:
            r0 = move-exception
            r19 = r6
            r14 = r9
            goto L3b9
        L4d:
            r0 = move-exception
            r19 = r6
            r14 = r9
            goto L369
        L53:
            me.yun.silk.AacCodec$DecodeResult r0 = new me.yun.silk.AacCodec$DecodeResult     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            me.yun.silk.AacCodec$AudioInfo r3 = new me.yun.silk.AacCodec$AudioInfo     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r3.<init>(r8, r11)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r4 = -801(0xfffffffffffffcdf, float:NaN)
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r6.release()     // Catch: java.lang.Exception -> L62
        L62:
            if (r1 == 0) goto L6d
            int r2 = r1.length()
            if (r2 <= 0) goto L6d
            p.a.v(r1)
        L6d:
            return r0
        L6e:
            r6.setDataSource(r0)     // Catch: java.lang.Throwable -> L35c java.lang.Exception -> L363
            r0 = r10
        L72:
            int r5 = r6.getTrackCount()     // Catch: java.lang.Throwable -> L35c java.lang.Exception -> L363
            java.lang.String r12 = "mime"
            r13 = -1
            if (r0 >= r5) goto La7
            android.media.MediaFormat r5 = r6.getTrackFormat(r0)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            java.lang.String r14 = r5.getString(r12)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            if (r14 == 0) goto La4
            java.lang.String r15 = "audio/"
            boolean r14 = r14.startsWith(r15)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            if (r14 == 0) goto La4
            if (r2 == 0) goto La9
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r14.<init>()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            java.lang.String r15 = "找到音频轨道: "
            r14.append(r15)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r14.append(r0)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r2.onMessage(r14)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            goto La9
        La4:
            int r0 = r0 + 1
            goto L72
        La7:
            r5 = r9
            r0 = r13
        La9:
            if (r0 != r13) goto Lcd
            if (r2 == 0) goto Lb2
            java.lang.String r0 = "未找到音频轨道"
            r2.onMessage(r0)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
        Lb2:
            me.yun.silk.AacCodec$DecodeResult r0 = new me.yun.silk.AacCodec$DecodeResult     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            me.yun.silk.AacCodec$AudioInfo r3 = new me.yun.silk.AacCodec$AudioInfo     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r3.<init>(r8, r11)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r4 = -802(0xfffffffffffffcde, float:NaN)
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r6.release()     // Catch: java.lang.Exception -> Lc1
        Lc1:
            if (r1 == 0) goto Lcc
            int r2 = r1.length()
            if (r2 <= 0) goto Lcc
            p.a.v(r1)
        Lcc:
            return r0
        Lcd:
            r6.selectTrack(r0)     // Catch: java.lang.Throwable -> L35c java.lang.Exception -> L363
            boolean r0 = r5.containsKey(r4)     // Catch: java.lang.Throwable -> L35c java.lang.Exception -> L363
            if (r0 == 0) goto Ldb
            int r0 = r5.getInteger(r4)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            goto Ldc
        Ldb:
            r0 = r8
        Ldc:
            boolean r13 = r5.containsKey(r3)     // Catch: java.lang.Throwable -> L35c java.lang.Exception -> L363
            if (r13 == 0) goto Le7
            int r13 = r5.getInteger(r3)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            goto Le8
        Le7:
            r13 = r11
        Le8:
            if (r2 == 0) goto L10b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r14.<init>()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            java.lang.String r15 = "参数: "
            r14.append(r15)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r14.append(r0)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            java.lang.String r15 = "Hz, "
            r14.append(r15)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r14.append(r13)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            java.lang.String r15 = "通道"
            r14.append(r15)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
            r2.onMessage(r14)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4d
        L10b:
            java.lang.String r12 = r5.getString(r12)     // Catch: java.lang.Throwable -> L35c java.lang.Exception -> L363
            android.media.MediaCodec r14 = android.media.MediaCodec.createDecoderByType(r12)     // Catch: java.lang.Throwable -> L35c java.lang.Exception -> L363
            r14.configure(r5, r9, r9, r10)     // Catch: java.lang.Throwable -> L350 java.lang.Exception -> L356
            r14.start()     // Catch: java.lang.Throwable -> L350 java.lang.Exception -> L356
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L350 java.lang.Exception -> L356
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L350 java.lang.Exception -> L356
            java.nio.ByteBuffer[] r12 = r14.getInputBuffers()     // Catch: java.lang.Throwable -> L346 java.lang.Exception -> L34b
            java.nio.ByteBuffer[] r15 = r14.getOutputBuffers()     // Catch: java.lang.Throwable -> L346 java.lang.Exception -> L34b
            android.media.MediaCodec$BufferInfo r9 = new android.media.MediaCodec$BufferInfo     // Catch: java.lang.Throwable -> L346 java.lang.Exception -> L34b
            r9.<init>()     // Catch: java.lang.Throwable -> L346 java.lang.Exception -> L34b
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L346 java.lang.Exception -> L34b
            r21 = 0
            r24 = r10
            r27 = r24
            r23 = r15
            r25 = r21
        L139:
            if (r24 != 0) goto L2d7
            r7 = 10000(0x2710, double:4.9407E-320)
            if (r27 != 0) goto L17c
            int r15 = r14.dequeueInputBuffer(r7)     // Catch: java.lang.Throwable -> L15e java.lang.Exception -> L164
            if (r15 < 0) goto L17c
            r11 = r12[r15]     // Catch: java.lang.Throwable -> L15e java.lang.Exception -> L164
            r11.clear()     // Catch: java.lang.Throwable -> L15e java.lang.Exception -> L164
            int r17 = r6.readSampleData(r11, r10)     // Catch: java.lang.Throwable -> L15e java.lang.Exception -> L164
            if (r17 >= 0) goto L16a
            r18 = 0
            r20 = 4
            r16 = 0
            r17 = 0
            r14.queueInputBuffer(r15, r16, r17, r18, r20)     // Catch: java.lang.Throwable -> L15e java.lang.Exception -> L164
            r27 = 1
            goto L178
        L15e:
            r0 = move-exception
            r9 = r5
            r19 = r6
            goto L3b9
        L164:
            r0 = move-exception
            r9 = r5
            r19 = r6
            goto L369
        L16a:
            long r18 = r6.getSampleTime()     // Catch: java.lang.Throwable -> L15e java.lang.Exception -> L164
            r20 = 0
            r16 = 0
            r14.queueInputBuffer(r15, r16, r17, r18, r20)     // Catch: java.lang.Throwable -> L15e java.lang.Exception -> L164
            r6.advance()     // Catch: java.lang.Throwable -> L15e java.lang.Exception -> L164
        L178:
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L15e java.lang.Exception -> L164
        L17c:
            int r7 = r14.dequeueOutputBuffer(r9, r7)     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            if (r7 < 0) goto L256
            int r8 = r9.flags     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            r8 = r8 & 4
            if (r8 == 0) goto L18a
            r8 = 1
            goto L18b
        L18a:
            r8 = r10
        L18b:
            int r11 = r9.size     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            if (r11 <= 0) goto L241
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            r11 = r23[r7]     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            int r15 = r9.offset     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            r11.position(r15)     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            int r15 = r9.offset     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            int r10 = r9.size     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            int r15 = r15 + r10
            r11.limit(r15)     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            int r10 = r9.size     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            byte[] r15 = new byte[r10]     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            r11.get(r15)     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            r11 = 1
            if (r13 != r11) goto L1cb
            r5.write(r15)     // Catch: java.lang.Throwable -> L1bd java.lang.Exception -> L1c4
            r33 = r12
            long r11 = (long) r10
            long r25 = r25 + r11
            r19 = r6
            r32 = r8
            r30 = r9
        L1ba:
            r1 = 0
            goto L24a
        L1bd:
            r0 = move-exception
            r9 = r5
            r19 = r6
        L1c1:
            r10 = 0
            goto L3b9
        L1c4:
            r0 = move-exception
            r9 = r5
            r19 = r6
        L1c8:
            r10 = 0
            goto L369
        L1cb:
            r33 = r12
            int r10 = java.lang.Math.max(r11, r13)     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            int r11 = r9.size     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            int r12 = r10 * 2
            int r11 = r11 / r12
            int r12 = r11 * 2
            byte[] r1 = new byte[r12]     // Catch: java.lang.Throwable -> L239 java.lang.Exception -> L23d
            r19 = r6
            r6 = 0
        L1dd:
            if (r6 >= r11) goto L22e
            r20 = r6
            r28 = r21
            r6 = 0
        L1e4:
            if (r6 >= r10) goto L20f
            int r30 = r20 * r10
            int r30 = r30 + r6
            int r30 = r30 * 2
            r31 = r6
            r6 = r15[r30]     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r30 = r30 + 1
            r30 = r15[r30]     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            int r30 = r30 << 8
            r6 = r6 | r30
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            r32 = r8
            r30 = r9
            long r8 = (long) r6     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            long r28 = r28 + r8
            int r6 = r31 + 1
            r9 = r30
            r8 = r32
            goto L1e4
        L209:
            r0 = move-exception
        L20a:
            r9 = r5
            goto L1c1
        L20c:
            r0 = move-exception
        L20d:
            r9 = r5
            goto L1c8
        L20f:
            r32 = r8
            r30 = r9
            long r8 = (long) r10     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            long r8 = r28 / r8
            int r6 = (int) r8     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            int r8 = r20 * 2
            r9 = r6 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            r1[r8] = r9     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            int r8 = r8 + 1
            int r6 = r6 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            r1[r8] = r6     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            int r6 = r20 + 1
            r9 = r30
            r8 = r32
            goto L1dd
        L22e:
            r32 = r8
            r30 = r9
            r5.write(r1)     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            long r8 = (long) r12     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            long r25 = r25 + r8
            goto L1ba
        L239:
            r0 = move-exception
            r19 = r6
            goto L20a
        L23d:
            r0 = move-exception
            r19 = r6
            goto L20d
        L241:
            r19 = r6
            r32 = r8
            r30 = r9
            r33 = r12
            r1 = r10
        L24a:
            r14.releaseOutputBuffer(r7, r1)     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            if (r32 == 0) goto L28c
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            r24 = 1
            goto L28c
        L256:
            r19 = r6
            r30 = r9
            r33 = r12
            r1 = -3
            if (r7 != r1) goto L26c
            java.nio.ByteBuffer[] r1 = r14.getOutputBuffers()     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            r23 = r1
        L269:
            r16 = r6
            goto L28c
        L26c:
            r1 = -2
            if (r7 != r1) goto L28c
            android.media.MediaFormat r1 = r14.getOutputFormat()     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            boolean r6 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            if (r6 == 0) goto L27d
            int r0 = r1.getInteger(r4)     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
        L27d:
            boolean r6 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            if (r6 == 0) goto L287
            int r13 = r1.getInteger(r3)     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
        L287:
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            goto L269
        L28c:
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            long r6 = r6 - r16
            r8 = 30000(0x7530, double:1.4822E-319)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 <= 0) goto L2c8
            if (r2 == 0) goto L29f
            java.lang.String r1 = "解码超时: 解码器长时间无输出"
            r2.onMessage(r1)     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
        L29f:
            me.yun.silk.AacCodec$DecodeResult r1 = new me.yun.silk.AacCodec$DecodeResult     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            me.yun.silk.AacCodec$AudioInfo r3 = new me.yun.silk.AacCodec$AudioInfo     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            r11 = 1
            int r4 = java.lang.Math.max(r11, r13)     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            r4 = -803(0xfffffffffffffcdd, float:NaN)
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            r5.close()     // Catch: java.lang.Exception -> L2b3
        L2b3:
            r14.stop()     // Catch: java.lang.Exception -> L2b6
        L2b6:
            r14.release()     // Catch: java.lang.Exception -> L2b9
        L2b9:
            r19.release()     // Catch: java.lang.Exception -> L2bc
        L2bc:
            if (r34 == 0) goto L2c7
            int r0 = r34.length()
            if (r0 <= 0) goto L2c7
            p.a.v(r34)
        L2c7:
            return r1
        L2c8:
            r12 = r33
            r1 = r34
            r6 = r19
            r9 = r30
            r8 = 44100(0xac44, float:6.1797E-41)
            r10 = 0
            r11 = 1
            goto L139
        L2d7:
            r19 = r6
            int r1 = (r25 > r21 ? 1 : (r25 == r21 ? 0 : -1))
            if (r1 > 0) goto L309
            if (r2 == 0) goto L2e4
            java.lang.String r1 = "解码失败: 未产生音频数据"
            r2.onMessage(r1)     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
        L2e4:
            me.yun.silk.AacCodec$DecodeResult r1 = new me.yun.silk.AacCodec$DecodeResult     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            me.yun.silk.AacCodec$AudioInfo r3 = new me.yun.silk.AacCodec$AudioInfo     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            r11 = 1
            r3.<init>(r0, r11)     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            r4 = -803(0xfffffffffffffcdd, float:NaN)
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> L209 java.lang.Exception -> L20c
            r5.close()     // Catch: java.lang.Exception -> L2f4
        L2f4:
            r14.stop()     // Catch: java.lang.Exception -> L2f7
        L2f7:
            r14.release()     // Catch: java.lang.Exception -> L2fa
        L2fa:
            r19.release()     // Catch: java.lang.Exception -> L2fd
        L2fd:
            if (r34 == 0) goto L308
            int r0 = r34.length()
            if (r0 <= 0) goto L308
            p.a.v(r34)
        L308:
            return r1
        L309:
            r5.close()     // Catch: java.lang.Throwable -> L33b java.lang.Exception -> L341
            if (r2 == 0) goto L31c
            java.lang.String r1 = "解码完成"
            r2.onMessage(r1)     // Catch: java.lang.Throwable -> L314 java.lang.Exception -> L318
            goto L31c
        L314:
            r0 = move-exception
            r9 = 0
            goto L1c1
        L318:
            r0 = move-exception
            r9 = 0
            goto L1c8
        L31c:
            me.yun.silk.AacCodec$DecodeResult r1 = new me.yun.silk.AacCodec$DecodeResult     // Catch: java.lang.Throwable -> L332 java.lang.Exception -> L337
            me.yun.silk.AacCodec$AudioInfo r3 = new me.yun.silk.AacCodec$AudioInfo     // Catch: java.lang.Throwable -> L332 java.lang.Exception -> L337
            r11 = 1
            r3.<init>(r0, r11)     // Catch: java.lang.Throwable -> L332 java.lang.Exception -> L337
            r4 = 0
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> L332 java.lang.Exception -> L337
            r14.stop()     // Catch: java.lang.Exception -> L32b
        L32b:
            r14.release()     // Catch: java.lang.Exception -> L32e
        L32e:
            r19.release()     // Catch: java.lang.Exception -> L331
        L331:
            return r1
        L332:
            r0 = move-exception
            r9 = 0
            r10 = 1
            goto L3b9
        L337:
            r0 = move-exception
            r9 = 0
            r10 = 1
            goto L369
        L33b:
            r0 = move-exception
            r4 = 0
            r10 = r4
        L33e:
            r9 = r5
            goto L3b9
        L341:
            r0 = move-exception
            r4 = 0
            r10 = r4
        L344:
            r9 = r5
            goto L369
        L346:
            r0 = move-exception
            r19 = r6
            r4 = r10
            goto L33e
        L34b:
            r0 = move-exception
            r19 = r6
            r4 = r10
            goto L344
        L350:
            r0 = move-exception
            r19 = r6
            r4 = r10
            r9 = 0
            goto L3b9
        L356:
            r0 = move-exception
            r19 = r6
            r4 = r10
            r9 = 0
            goto L369
        L35c:
            r0 = move-exception
            r19 = r6
            r4 = r10
            r9 = 0
            r14 = 0
            goto L3b9
        L363:
            r0 = move-exception
            r19 = r6
            r4 = r10
            r9 = 0
            r14 = 0
        L369:
            if (r2 == 0) goto L386
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L384
            r1.<init>()     // Catch: java.lang.Throwable -> L384
            java.lang.String r3 = "解码异常: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L384
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L384
            r1.append(r3)     // Catch: java.lang.Throwable -> L384
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L384
            r2.onMessage(r1)     // Catch: java.lang.Throwable -> L384
            goto L386
        L384:
            r0 = move-exception
            goto L3b9
        L386:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L384
            me.yun.silk.AacCodec$DecodeResult r0 = new me.yun.silk.AacCodec$DecodeResult     // Catch: java.lang.Throwable -> L384
            me.yun.silk.AacCodec$AudioInfo r1 = new me.yun.silk.AacCodec$AudioInfo     // Catch: java.lang.Throwable -> L384
            r2 = 44100(0xac44, float:6.1797E-41)
            r11 = 1
            r1.<init>(r2, r11)     // Catch: java.lang.Throwable -> L384
            r4 = -803(0xfffffffffffffcdd, float:NaN)
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L384
            if (r9 == 0) goto L39e
            r9.close()     // Catch: java.lang.Exception -> L39e
        L39e:
            if (r14 == 0) goto L3a3
            r14.stop()     // Catch: java.lang.Exception -> L3a3
        L3a3:
            if (r14 == 0) goto L3a8
            r14.release()     // Catch: java.lang.Exception -> L3a8
        L3a8:
            r19.release()     // Catch: java.lang.Exception -> L3ab
        L3ab:
            if (r10 != 0) goto L3b8
            if (r34 == 0) goto L3b8
            int r1 = r34.length()
            if (r1 <= 0) goto L3b8
            p.a.v(r34)
        L3b8:
            return r0
        L3b9:
            if (r9 == 0) goto L3be
            r9.close()     // Catch: java.lang.Exception -> L3be
        L3be:
            if (r14 == 0) goto L3c3
            r14.stop()     // Catch: java.lang.Exception -> L3c3
        L3c3:
            if (r14 == 0) goto L3c8
            r14.release()     // Catch: java.lang.Exception -> L3c8
        L3c8:
            r19.release()     // Catch: java.lang.Exception -> L3cb
        L3cb:
            if (r10 != 0) goto L3d8
            if (r34 == 0) goto L3d8
            int r1 = r34.length()
            if (r1 <= 0) goto L3d8
            p.a.v(r34)
        L3d8:
            throw r0
    }

    public static int decodeM4aFile(java.lang.String r0, java.lang.String r1, me.yun.silk.AacCodec.AacCallback r2) {
            int r0 = decodeAacFile(r0, r1, r2)
            return r0
    }

    private static me.yun.silk.AacCodec.DecodeResult decodeOggToPcmWithInfo(java.lang.String r1, java.lang.String r2, me.yun.silk.SilkCodec r3, int r4) {
            boolean r0 = isOggOpusFile(r1)
            if (r0 == 0) goto L22
            r3 = 0
            me.yun.silk.AacCodec$DecodeResult r1 = decodeAacFileWithInfo(r1, r2, r3)
            int r3 = r1.code
            if (r3 != 0) goto L10
            return r1
        L10:
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            r3.delete()
            me.yun.silk.AacCodec$DecodeResult r2 = new me.yun.silk.AacCodec$DecodeResult
            r3 = -401(0xfffffffffffffe6f, float:NaN)
            me.yun.silk.AacCodec$AudioInfo r1 = r1.audioInfo
            r2.<init>(r3, r1)
            return r2
        L22:
            int r2 = r3.oggToPcm(r1, r2)
            me.yun.silk.AacCodec$DecodeResult r3 = new me.yun.silk.AacCodec$DecodeResult
            me.yun.silk.AacCodec$AudioInfo r0 = new me.yun.silk.AacCodec$AudioInfo
            int r1 = getMetadataSampleRate(r1, r4)
            r4 = 1
            r0.<init>(r1, r4)
            r3.<init>(r2, r0)
            return r3
    }

    public static int encodePcmToAac(java.lang.String r24, java.lang.String r25, int r26, int r27, me.yun.silk.AacCodec.AacCallback r28) {
            r0 = r24
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "audio/mp4a-latm"
            if (r3 == 0) goto L1d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "开始编码 AAC: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r3.onMessage(r5)
        L1d:
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            boolean r6 = r5.exists()
            if (r6 != 0) goto L32
            if (r3 == 0) goto L2f
            java.lang.String r0 = "PCM 文件不存在"
            r3.onMessage(r0)
        L2f:
            r0 = -901(0xfffffffffffffc7b, float:NaN)
            return r0
        L32:
            android.media.MediaFormat r6 = android.media.MediaFormat.createAudioFormat(r4, r1, r2)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r7 = "bitrate"
            r8 = 128000(0x1f400, float:1.79366E-40)
            r6.setInteger(r7, r8)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r7 = "aac-profile"
            r8 = 2
            r6.setInteger(r7, r8)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r7 = "max-input-size"
            r8 = 16384(0x4000, float:2.2959E-41)
            r6.setInteger(r7, r8)     // Catch: java.lang.Exception -> Lc1
            android.media.MediaCodec r9 = android.media.MediaCodec.createEncoderByType(r4)     // Catch: java.lang.Exception -> Lc1
            r4 = 0
            r7 = 1
            r9.configure(r6, r4, r4, r7)     // Catch: java.lang.Exception -> Lc1
            r9.start()     // Catch: java.lang.Exception -> Lc1
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> Lc1
            java.lang.String r6 = "r"
            r4.<init>(r0, r6)     // Catch: java.lang.Exception -> Lc1
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> Lc1
            r6 = r25
            r0.<init>(r6)     // Catch: java.lang.Exception -> Lc1
            java.nio.ByteBuffer[] r6 = r9.getInputBuffers()     // Catch: java.lang.Exception -> Lc1
            java.nio.ByteBuffer[] r8 = r9.getOutputBuffers()     // Catch: java.lang.Exception -> Lc1
            android.media.MediaCodec$BufferInfo r10 = new android.media.MediaCodec$BufferInfo     // Catch: java.lang.Exception -> Lc1
            r10.<init>()     // Catch: java.lang.Exception -> Lc1
            long r16 = r5.length()     // Catch: java.lang.Exception -> Lc1
            r5 = 0
            r11 = r5
            r18 = r11
            r19 = r18
        L7c:
            if (r18 != 0) goto L137
            r12 = 10000(0x2710, double:4.9407E-320)
            if (r19 != 0) goto Lf9
            r14 = r10
            int r10 = r9.dequeueInputBuffer(r12)     // Catch: java.lang.Exception -> Lc1
            if (r10 < 0) goto Lf1
            r15 = r6[r10]     // Catch: java.lang.Exception -> Lc1
            r15.clear()     // Catch: java.lang.Exception -> Lc1
            long r20 = r4.getFilePointer()     // Catch: java.lang.Exception -> Lc1
            r24 = r8
            long r7 = r16 - r20
            int r7 = (int) r7     // Catch: java.lang.Exception -> Lc1
            r8 = 4096(0x1000, float:5.74E-42)
            int r7 = java.lang.Math.min(r8, r7)     // Catch: java.lang.Exception -> Lc1
            byte[] r7 = new byte[r7]     // Catch: java.lang.Exception -> Lc1
            r20 = r12
            int r12 = r4.read(r7)     // Catch: java.lang.Exception -> Lc1
            if (r12 <= 0) goto Lc4
            r15.put(r7, r5, r12)     // Catch: java.lang.Exception -> Lc1
            long r7 = (long) r11     // Catch: java.lang.Exception -> Lc1
            r22 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r7 = r7 * r22
            r25 = r6
            long r5 = (long) r1     // Catch: java.lang.Exception -> Lc1
            long r7 = r7 / r5
            r5 = r11
            r11 = 0
            r15 = 0
            r6 = r14
            r13 = r7
            r7 = r20
            r9.queueInputBuffer(r10, r11, r12, r13, r15)     // Catch: java.lang.Exception -> Lc1
            int r11 = r5 + 1
            goto Ld5
        Lc1:
            r0 = move-exception
            goto L152
        Lc4:
            r25 = r6
            r5 = r11
            r6 = r14
            r7 = r20
            r13 = 0
            r15 = 4
            r11 = 0
            r12 = 0
            r9.queueInputBuffer(r10, r11, r12, r13, r15)     // Catch: java.lang.Exception -> Lc1
            r11 = r5
            r19 = 1
        Ld5:
            if (r3 == 0) goto Lfe
            r12 = 0
            int r5 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r5 <= 0) goto Lfe
            long r12 = r4.getFilePointer()     // Catch: java.lang.Exception -> Lc1
            r14 = 100
            long r12 = r12 * r14
            long r12 = r12 / r16
            int r5 = (int) r12     // Catch: java.lang.Exception -> Lc1
            r10 = 99
            int r5 = java.lang.Math.min(r5, r10)     // Catch: java.lang.Exception -> Lc1
            r3.onProgress(r5)     // Catch: java.lang.Exception -> Lc1
            goto Lfe
        Lf1:
            r25 = r6
            r6 = r14
        Lf4:
            r24 = r8
            r5 = r11
            r7 = r12
            goto Lfd
        Lf9:
            r25 = r6
            r6 = r10
            goto Lf4
        Lfd:
            r11 = r5
        Lfe:
            int r5 = r9.dequeueOutputBuffer(r6, r7)     // Catch: java.lang.Exception -> Lc1
            if (r5 < 0) goto L128
            int r7 = r6.flags     // Catch: java.lang.Exception -> Lc1
            r7 = r7 & 4
            if (r7 == 0) goto L10c
            r18 = 1
        L10c:
            int r7 = r6.size     // Catch: java.lang.Exception -> Lc1
            if (r7 <= 0) goto L121
            r8 = r24[r5]     // Catch: java.lang.Exception -> Lc1
            byte[] r10 = new byte[r7]     // Catch: java.lang.Exception -> Lc1
            r8.get(r10)     // Catch: java.lang.Exception -> Lc1
            byte[] r7 = createAdtsHeader(r1, r2, r7)     // Catch: java.lang.Exception -> Lc1
            r0.write(r7)     // Catch: java.lang.Exception -> Lc1
            r0.write(r10)     // Catch: java.lang.Exception -> Lc1
        L121:
            r7 = 0
            r9.releaseOutputBuffer(r5, r7)     // Catch: java.lang.Exception -> Lc1
        L125:
            r8 = r24
            goto L130
        L128:
            r7 = -3
            if (r5 != r7) goto L125
            java.nio.ByteBuffer[] r5 = r9.getOutputBuffers()     // Catch: java.lang.Exception -> Lc1
            r8 = r5
        L130:
            r10 = r6
            r5 = 0
            r7 = 1
            r6 = r25
            goto L7c
        L137:
            r4.close()     // Catch: java.lang.Exception -> Lc1
            r0.close()     // Catch: java.lang.Exception -> Lc1
            r9.stop()     // Catch: java.lang.Exception -> Lc1
            r9.release()     // Catch: java.lang.Exception -> Lc1
            if (r3 == 0) goto L14f
            java.lang.String r0 = "编码完成"
            r3.onMessage(r0)     // Catch: java.lang.Exception -> Lc1
            r0 = 100
            r3.onProgress(r0)     // Catch: java.lang.Exception -> Lc1
        L14f:
            r22 = 0
            return r22
        L152:
            if (r3 == 0) goto L169
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "编码异常: "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.onMessage(r1)
        L169:
            r0.printStackTrace()
            r0 = -902(0xfffffffffffffc7a, float:NaN)
            return r0
    }

    public static int encodePcmToM4a(java.lang.String r29, java.lang.String r30, int r31, int r32, me.yun.silk.AacCodec.AacCallback r33) {
            r0 = r29
            r1 = r31
            r2 = r32
            r3 = r33
            java.lang.String r4 = "audio/mp4a-latm"
            if (r3 == 0) goto L1d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "开始编码 M4A: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r3.onMessage(r5)
        L1d:
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            boolean r6 = r5.exists()
            if (r6 != 0) goto L32
            if (r3 == 0) goto L2f
            java.lang.String r0 = "PCM 文件不存在"
            r3.onMessage(r0)
        L2f:
            r0 = -911(0xfffffffffffffc71, float:NaN)
            return r0
        L32:
            android.media.MediaFormat r6 = android.media.MediaFormat.createAudioFormat(r4, r1, r2)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r7 = "bitrate"
            r8 = 128000(0x1f400, float:1.79366E-40)
            r6.setInteger(r7, r8)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r7 = "aac-profile"
            r8 = 2
            r6.setInteger(r7, r8)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r7 = "max-input-size"
            r8 = 16384(0x4000, float:2.2959E-41)
            r6.setInteger(r7, r8)     // Catch: java.lang.Exception -> Lcd
            android.media.MediaCodec r9 = android.media.MediaCodec.createEncoderByType(r4)     // Catch: java.lang.Exception -> Lcd
            r4 = 0
            r7 = 1
            r9.configure(r6, r4, r4, r7)     // Catch: java.lang.Exception -> Lcd
            r9.start()     // Catch: java.lang.Exception -> Lcd
            android.media.MediaMuxer r4 = new android.media.MediaMuxer     // Catch: java.lang.Exception -> Lcd
            r6 = 0
            r8 = r30
            r4.<init>(r8, r6)     // Catch: java.lang.Exception -> Lcd
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> Lcd
            java.lang.String r10 = "r"
            r8.<init>(r0, r10)     // Catch: java.lang.Exception -> Lcd
            java.nio.ByteBuffer[] r0 = r9.getInputBuffers()     // Catch: java.lang.Exception -> Lcd
            java.nio.ByteBuffer[] r10 = r9.getOutputBuffers()     // Catch: java.lang.Exception -> Lcd
            android.media.MediaCodec$BufferInfo r11 = new android.media.MediaCodec$BufferInfo     // Catch: java.lang.Exception -> Lcd
            r11.<init>()     // Catch: java.lang.Exception -> Lcd
            long r16 = r5.length()     // Catch: java.lang.Exception -> Lcd
            int r2 = r2 * 2048
            r5 = -1
            r19 = r6
            r20 = r19
            r21 = r20
            r18 = r10
            r10 = r21
        L84:
            if (r19 != 0) goto L149
            r12 = 10000(0x2710, double:4.9407E-320)
            if (r20 != 0) goto L100
            int r14 = r9.dequeueInputBuffer(r12)     // Catch: java.lang.Exception -> Lcd
            if (r14 < 0) goto L100
            r15 = r0[r14]     // Catch: java.lang.Exception -> Lcd
            r15.clear()     // Catch: java.lang.Exception -> Lcd
            long r22 = r8.getFilePointer()     // Catch: java.lang.Exception -> Lcd
            long r12 = r16 - r22
            int r12 = (int) r12     // Catch: java.lang.Exception -> Lcd
            int r12 = java.lang.Math.min(r2, r12)     // Catch: java.lang.Exception -> Lcd
            byte[] r12 = new byte[r12]     // Catch: java.lang.Exception -> Lcd
            int r13 = r8.read(r12)     // Catch: java.lang.Exception -> Lcd
            if (r13 <= 0) goto Ld0
            r15.put(r12, r6, r13)     // Catch: java.lang.Exception -> Lcd
            r23 = r8
            long r7 = (long) r10     // Catch: java.lang.Exception -> Lcd
            r24 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r7 = r7 * r24
            r25 = r7
            long r6 = (long) r1     // Catch: java.lang.Exception -> Lcd
            long r7 = r25 / r6
            r6 = r11
            r11 = 0
            r15 = 0
            r29 = r0
            r12 = r13
            r0 = 10000(0x2710, double:4.9407E-320)
            r27 = r7
            r7 = r6
            r6 = r10
            r10 = r14
            r13 = r27
            r9.queueInputBuffer(r10, r11, r12, r13, r15)     // Catch: java.lang.Exception -> Lcd
            int r10 = r6 + 1
            goto Le4
        Lcd:
            r0 = move-exception
            goto L16b
        Ld0:
            r29 = r0
            r23 = r8
            r6 = r10
            r7 = r11
            r10 = r14
            r0 = 10000(0x2710, double:4.9407E-320)
            r13 = 0
            r15 = 4
            r11 = 0
            r12 = 0
            r9.queueInputBuffer(r10, r11, r12, r13, r15)     // Catch: java.lang.Exception -> Lcd
            r10 = r6
            r20 = 1
        Le4:
            if (r3 == 0) goto L108
            r11 = 0
            int r6 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r6 <= 0) goto L108
            long r11 = r23.getFilePointer()     // Catch: java.lang.Exception -> Lcd
            r13 = 100
            long r11 = r11 * r13
            long r11 = r11 / r16
            int r6 = (int) r11     // Catch: java.lang.Exception -> Lcd
            r8 = 99
            int r6 = java.lang.Math.min(r6, r8)     // Catch: java.lang.Exception -> Lcd
            r3.onProgress(r6)     // Catch: java.lang.Exception -> Lcd
            goto L108
        L100:
            r29 = r0
            r23 = r8
            r6 = r10
            r7 = r11
            r0 = r12
            r10 = r6
        L108:
            int r0 = r9.dequeueOutputBuffer(r7, r0)     // Catch: java.lang.Exception -> Lcd
            if (r0 < 0) goto L135
            int r1 = r7.flags     // Catch: java.lang.Exception -> Lcd
            r1 = r1 & 4
            if (r1 == 0) goto L116
            r19 = 1
        L116:
            int r1 = r7.size     // Catch: java.lang.Exception -> Lcd
            if (r1 <= 0) goto L130
            if (r19 != 0) goto L130
            if (r21 != 0) goto L12b
            android.media.MediaFormat r1 = r9.getOutputFormat()     // Catch: java.lang.Exception -> Lcd
            int r5 = r4.addTrack(r1)     // Catch: java.lang.Exception -> Lcd
            r4.start()     // Catch: java.lang.Exception -> Lcd
            r21 = 1
        L12b:
            r1 = r18[r0]     // Catch: java.lang.Exception -> Lcd
            r4.writeSampleData(r5, r1, r7)     // Catch: java.lang.Exception -> Lcd
        L130:
            r1 = 0
            r9.releaseOutputBuffer(r0, r1)     // Catch: java.lang.Exception -> Lcd
            goto L13e
        L135:
            r1 = -3
            if (r0 != r1) goto L13e
            java.nio.ByteBuffer[] r0 = r9.getOutputBuffers()     // Catch: java.lang.Exception -> Lcd
            r18 = r0
        L13e:
            r0 = r29
            r1 = r31
            r11 = r7
            r8 = r23
            r6 = 0
            r7 = 1
            goto L84
        L149:
            r23 = r8
            r23.close()     // Catch: java.lang.Exception -> Lcd
            r9.stop()     // Catch: java.lang.Exception -> Lcd
            r9.release()     // Catch: java.lang.Exception -> Lcd
            if (r21 == 0) goto L159
            r4.stop()     // Catch: java.lang.Exception -> Lcd
        L159:
            r4.release()     // Catch: java.lang.Exception -> Lcd
            if (r3 == 0) goto L168
            java.lang.String r0 = "编码完成"
            r3.onMessage(r0)     // Catch: java.lang.Exception -> Lcd
            r0 = 100
            r3.onProgress(r0)     // Catch: java.lang.Exception -> Lcd
        L168:
            r24 = 0
            return r24
        L16b:
            if (r3 == 0) goto L182
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "编码异常: "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.onMessage(r1)
        L182:
            r0.printStackTrace()
            r0 = -912(0xfffffffffffffc70, float:NaN)
            return r0
    }

    private static int flacToAac(java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.String r0 = ".temp.pcm"
            java.lang.String r0 = bc.e.i(r3, r0)
            me.yun.silk.SilkCodec r1 = new me.yun.silk.SilkCodec     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            int r1 = r1.flacToPcm(r2, r0)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            if (r1 == 0) goto L15
            p.a.v(r0)
            return r1
        L15:
            int r2 = getMetadataSampleRate(r2, r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r4 = 1
            r1 = 0
            int r2 = encodePcmToAac(r0, r3, r2, r4, r1)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            p.a.v(r0)
            return r2
        L23:
            r2 = move-exception
            goto L2f
        L25:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L23
            p.a.v(r0)
            r2 = -1051(0xfffffffffffffbe5, float:NaN)
            return r2
        L2f:
            p.a.v(r0)
            throw r2
    }

    private static int flacToM4a(java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.String r0 = ".temp.pcm"
            java.lang.String r0 = bc.e.i(r3, r0)
            me.yun.silk.SilkCodec r1 = new me.yun.silk.SilkCodec     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            int r1 = r1.flacToPcm(r2, r0)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            if (r1 == 0) goto L15
            p.a.v(r0)
            return r1
        L15:
            int r2 = getMetadataSampleRate(r2, r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r4 = 1
            r1 = 0
            int r2 = encodePcmToM4a(r0, r3, r2, r4, r1)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            p.a.v(r0)
            return r2
        L23:
            r2 = move-exception
            goto L2f
        L25:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L23
            p.a.v(r0)
            r2 = -1061(0xfffffffffffffbdb, float:NaN)
            return r2
        L2f:
            p.a.v(r0)
            throw r2
    }

    public static me.yun.silk.AacCodec.AudioInfo getAudioInfo(java.lang.String r8) {
            java.lang.String r0 = "channel-count"
            java.lang.String r1 = "sample-rate"
            android.media.MediaExtractor r2 = new android.media.MediaExtractor
            r2.<init>()
            r3 = 44100(0xac44, float:6.1797E-41)
            r4 = 1
            r2.setDataSource(r8)     // Catch: java.lang.Exception -> L58
            r8 = 0
        L11:
            int r5 = r2.getTrackCount()     // Catch: java.lang.Exception -> L58
            if (r8 >= r5) goto L4f
            android.media.MediaFormat r5 = r2.getTrackFormat(r8)     // Catch: java.lang.Exception -> L58
            java.lang.String r6 = "mime"
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Exception -> L58
            if (r6 == 0) goto L4c
            java.lang.String r7 = "audio/"
            boolean r6 = r6.startsWith(r7)     // Catch: java.lang.Exception -> L58
            if (r6 == 0) goto L4c
            boolean r8 = r5.containsKey(r1)     // Catch: java.lang.Exception -> L58
            if (r8 == 0) goto L36
            int r8 = r5.getInteger(r1)     // Catch: java.lang.Exception -> L58
            goto L37
        L36:
            r8 = r3
        L37:
            boolean r1 = r5.containsKey(r0)     // Catch: java.lang.Exception -> L58
            if (r1 == 0) goto L42
            int r0 = r5.getInteger(r0)     // Catch: java.lang.Exception -> L58
            goto L43
        L42:
            r0 = r4
        L43:
            r2.release()     // Catch: java.lang.Exception -> L58
            me.yun.silk.AacCodec$AudioInfo r1 = new me.yun.silk.AacCodec$AudioInfo     // Catch: java.lang.Exception -> L58
            r1.<init>(r8, r0)     // Catch: java.lang.Exception -> L58
            return r1
        L4c:
            int r8 = r8 + 1
            goto L11
        L4f:
            r2.release()     // Catch: java.lang.Exception -> L58
            me.yun.silk.AacCodec$AudioInfo r8 = new me.yun.silk.AacCodec$AudioInfo     // Catch: java.lang.Exception -> L58
            r8.<init>(r3, r4)     // Catch: java.lang.Exception -> L58
            return r8
        L58:
            r2.release()
            me.yun.silk.AacCodec$AudioInfo r8 = new me.yun.silk.AacCodec$AudioInfo
            r8.<init>(r3, r4)
            return r8
    }

    public static long getDuration(java.lang.String r4) {
            r0 = 0
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L29
            r1.setDataSource(r4)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            r4 = 9
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            if (r4 == 0) goto L1e
            long r2 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            r1.release()     // Catch: java.lang.Exception -> L18
        L18:
            return r2
        L19:
            r4 = move-exception
            r0 = r1
            goto L23
        L1c:
            r0 = r1
            goto L29
        L1e:
            r1.release()     // Catch: java.lang.Exception -> L2e
            goto L2e
        L22:
            r4 = move-exception
        L23:
            if (r0 == 0) goto L28
            r0.release()     // Catch: java.lang.Exception -> L28
        L28:
            throw r4
        L29:
            if (r0 == 0) goto L2e
            r0.release()     // Catch: java.lang.Exception -> L2e
        L2e:
            r0 = 0
            return r0
    }

    public static java.lang.String getErrorMessage(int r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "成功"
            return r2
        L5:
            r0 = -801(0xfffffffffffffcdf, float:NaN)
            if (r2 < r0) goto L10
            r0 = -802(0xfffffffffffffcde, float:NaN)
            if (r2 > r0) goto L10
            java.lang.String r2 = "AAC/M4A 解码错误 (文件读取失败)"
            return r2
        L10:
            r0 = -803(0xfffffffffffffcdd, float:NaN)
            if (r2 != r0) goto L17
            java.lang.String r2 = "AAC/M4A 解码错误 (格式不支持)"
            return r2
        L17:
            r0 = -901(0xfffffffffffffc7b, float:NaN)
            if (r2 < r0) goto L22
            r0 = -902(0xfffffffffffffc7a, float:NaN)
            if (r2 > r0) goto L22
            java.lang.String r2 = "AAC 编码错误 (文件操作失败)"
            return r2
        L22:
            r0 = -911(0xfffffffffffffc71, float:NaN)
            if (r2 < r0) goto L2d
            r0 = -912(0xfffffffffffffc70, float:NaN)
            if (r2 > r0) goto L2d
            java.lang.String r2 = "M4A 编码错误 (Muxer 失败)"
            return r2
        L2d:
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            if (r2 < r0) goto L38
            r0 = -1009(0xfffffffffffffc0f, float:NaN)
            if (r2 > r0) goto L38
            java.lang.String r2 = "Silk 转 AAC/M4A 错误"
            return r2
        L38:
            r0 = -1011(0xfffffffffffffc0d, float:NaN)
            if (r2 < r0) goto L43
            r0 = -1012(0xfffffffffffffc0c, float:NaN)
            if (r2 > r0) goto L43
            java.lang.String r2 = "MP3 转 AAC/M4A 错误"
            return r2
        L43:
            r0 = -1021(0xfffffffffffffc03, float:NaN)
            if (r2 < r0) goto L4e
            r0 = -1022(0xfffffffffffffc02, float:NaN)
            if (r2 > r0) goto L4e
            java.lang.String r2 = "WAV 转 AAC/M4A 错误"
            return r2
        L4e:
            r0 = -1031(0xfffffffffffffbf9, float:NaN)
            if (r2 < r0) goto L59
            r0 = -1039(0xfffffffffffffbf1, float:NaN)
            if (r2 > r0) goto L59
            java.lang.String r2 = "M4A/AAC 转 Silk 错误"
            return r2
        L59:
            r0 = -1051(0xfffffffffffffbe5, float:NaN)
            if (r2 < r0) goto L64
            r0 = -1059(0xfffffffffffffbdd, float:NaN)
            if (r2 > r0) goto L64
            java.lang.String r2 = "M4A/AAC 转 AAC 错误"
            return r2
        L64:
            r0 = -1061(0xfffffffffffffbdb, float:NaN)
            if (r2 < r0) goto L6f
            r0 = -1069(0xfffffffffffffbd3, float:NaN)
            if (r2 > r0) goto L6f
            java.lang.String r2 = "M4A/AAC 转 M4A 错误"
            return r2
        L6f:
            r0 = -2000(0xfffffffffffff830, float:NaN)
            if (r2 != r0) goto L76
            java.lang.String r2 = "M4A/AAC 转 Silk 错误 (解码失败)"
            return r2
        L76:
            java.lang.String r0 = "错误码: "
            java.lang.String r1 = " → 未知错误"
            java.lang.String r2 = eh.a.m(r2, r0, r1)
            return r2
    }

    private static int getMetadataSampleRate(java.lang.String r2, int r3) {
            r0 = 0
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
            r1.setDataSource(r2)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26
            r2 = 38
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26
            if (r2 == 0) goto L28
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26
            if (r0 <= 0) goto L28
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26
            int r2 = validSampleRate(r2, r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26
            r1.release()     // Catch: java.lang.Exception -> L22
        L22:
            return r2
        L23:
            r2 = move-exception
            r0 = r1
            goto L2d
        L26:
            r0 = r1
            goto L33
        L28:
            r1.release()     // Catch: java.lang.Exception -> L38
            goto L38
        L2c:
            r2 = move-exception
        L2d:
            if (r0 == 0) goto L32
            r0.release()     // Catch: java.lang.Exception -> L32
        L32:
            throw r2
        L33:
            if (r0 == 0) goto L38
            r0.release()     // Catch: java.lang.Exception -> L38
        L38:
            r2 = 44100(0xac44, float:6.1797E-41)
            int r2 = validSampleRate(r3, r2)
            return r2
    }

    private static int getSampleRateIndex(int r0) {
            switch(r0) {
                case 8000: goto L1c;
                case 11025: goto L19;
                case 12000: goto L16;
                case 16000: goto L13;
                case 22050: goto L11;
                case 24000: goto Lf;
                case 32000: goto Ld;
                case 48000: goto Lb;
                case 64000: goto L9;
                case 88200: goto L7;
                case 96000: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 4
            return r0
        L5:
            r0 = 0
            return r0
        L7:
            r0 = 1
            return r0
        L9:
            r0 = 2
            return r0
        Lb:
            r0 = 3
            return r0
        Ld:
            r0 = 5
            return r0
        Lf:
            r0 = 6
            return r0
        L11:
            r0 = 7
            return r0
        L13:
            r0 = 8
            return r0
        L16:
            r0 = 9
            return r0
        L19:
            r0 = 10
            return r0
        L1c:
            r0 = 11
            return r0
    }

    private static int getWavSampleRate(java.lang.String r6, int r7) {
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L48
            java.lang.String r2 = "r"
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L48
            long r2 = r1.length()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            r4 = 28
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L3d
            r2 = 24
            r1.seek(r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            int r6 = r1.readUnsignedByte()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            int r0 = r1.readUnsignedByte()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            int r0 = r0 << 8
            r6 = r6 | r0
            int r0 = r1.readUnsignedByte()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            int r0 = r0 << 16
            r6 = r6 | r0
            int r0 = r1.readUnsignedByte()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            int r0 = r0 << 24
            r6 = r6 | r0
            int r6 = validSampleRate(r6, r7)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            r1.close()     // Catch: java.lang.Exception -> L37
        L37:
            return r6
        L38:
            r6 = move-exception
            r0 = r1
            goto L42
        L3b:
            r0 = r1
            goto L48
        L3d:
            r1.close()     // Catch: java.lang.Exception -> L4d
            goto L4d
        L41:
            r6 = move-exception
        L42:
            if (r0 == 0) goto L47
            r0.close()     // Catch: java.lang.Exception -> L47
        L47:
            throw r6
        L48:
            if (r0 == 0) goto L4d
            r0.close()     // Catch: java.lang.Exception -> L4d
        L4d:
            r6 = 44100(0xac44, float:6.1797E-41)
            int r6 = validSampleRate(r7, r6)
            return r6
    }

    public static boolean isOggOpusFile(java.lang.String r12) {
            r0 = 0
            if (r12 == 0) goto Lc5
            int r1 = r12.length()
            if (r1 != 0) goto Lb
            goto Lc5
        Lb:
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lc0
            java.lang.String r3 = "r"
            r2.<init>(r12, r3)     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lc0
            long r3 = r2.length()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r5 = 36
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 >= 0) goto L21
            r2.close()     // Catch: java.lang.Exception -> L20
        L20:
            return r0
        L21:
            r12 = 27
            byte[] r12 = new byte[r12]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r2.readFully(r12)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r1 = r12[r0]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r3 = 79
            if (r1 != r3) goto Lb5
            r1 = 1
            r4 = r12[r1]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r5 = 103(0x67, float:1.44E-43)
            if (r4 != r5) goto Lb5
            r4 = 2
            r6 = r12[r4]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            if (r6 != r5) goto Lb5
            r5 = 3
            r6 = r12[r5]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r7 = 83
            if (r6 != r7) goto Lb5
            r6 = 4
            r7 = r12[r6]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            if (r7 == 0) goto L48
            goto Lb5
        L48:
            r7 = 26
            r12 = r12[r7]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r7 = 255(0xff, float:3.57E-43)
            r12 = r12 & r7
            if (r12 != 0) goto L55
            r2.close()     // Catch: java.lang.Exception -> L54
        L54:
            return r0
        L55:
            byte[] r8 = new byte[r12]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r2.readFully(r8)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r9 = r0
            r10 = r9
        L5c:
            if (r9 >= r12) goto L6e
            r11 = r8[r9]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r11 = r11 & r7
            int r10 = r10 + r11
            if (r11 >= r7) goto L66
            r12 = r1
            goto L6f
        L66:
            int r9 = r9 + 1
            goto L5c
        L69:
            r12 = move-exception
            r1 = r2
            goto Lba
        L6c:
            r1 = r2
            goto Lc0
        L6e:
            r12 = r0
        L6f:
            if (r12 == 0) goto Lb1
            r12 = 8
            if (r10 >= r12) goto L76
            goto Lb1
        L76:
            byte[] r12 = new byte[r12]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r2.readFully(r12)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r7 = r12[r0]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            if (r7 != r3) goto Lad
            r3 = r12[r1]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r7 = 112(0x70, float:1.57E-43)
            if (r3 != r7) goto Lad
            r3 = r12[r4]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r4 = 117(0x75, float:1.64E-43)
            if (r3 != r4) goto Lad
            r3 = r12[r5]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r4 = 115(0x73, float:1.61E-43)
            if (r3 != r4) goto Lad
            r3 = r12[r6]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r4 = 72
            if (r3 != r4) goto Lad
            r3 = 5
            r3 = r12[r3]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r4 = 101(0x65, float:1.42E-43)
            if (r3 != r4) goto Lad
            r3 = 6
            r3 = r12[r3]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r4 = 97
            if (r3 != r4) goto Lad
            r3 = 7
            r12 = r12[r3]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r3 = 100
            if (r12 != r3) goto Lad
            r0 = r1
        Lad:
            r2.close()     // Catch: java.lang.Exception -> Lb0
        Lb0:
            return r0
        Lb1:
            r2.close()     // Catch: java.lang.Exception -> Lb4
        Lb4:
            return r0
        Lb5:
            r2.close()     // Catch: java.lang.Exception -> Lb8
        Lb8:
            return r0
        Lb9:
            r12 = move-exception
        Lba:
            if (r1 == 0) goto Lbf
            r1.close()     // Catch: java.lang.Exception -> Lbf
        Lbf:
            throw r12
        Lc0:
            if (r1 == 0) goto Lc5
            r1.close()     // Catch: java.lang.Exception -> Lc5
        Lc5:
            return r0
    }

    public static int m4aToAac(java.lang.String r0, java.lang.String r1, int r2) {
            int r0 = mp4ToAac(r0, r1, r2)
            return r0
    }

    public static int m4aToM4a(java.lang.String r0, java.lang.String r1, int r2) {
            int r0 = mp4ToM4a(r0, r1, r2)
            return r0
    }

    public static int m4aToPcm(java.lang.String r1, java.lang.String r2) {
            r0 = 0
            int r1 = decodeAacFile(r1, r2, r0)
            return r1
    }

    public static int m4aToSilk(java.lang.String r0, java.lang.String r1, me.yun.silk.SilkCodec r2, int r3) {
            int r0 = mp4ToSilk(r0, r1, r2, r3)
            return r0
    }

    private static int mp3ToAac(java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.String r0 = ".temp.pcm"
            java.lang.String r0 = bc.e.i(r3, r0)
            me.yun.silk.SilkCodec r1 = new me.yun.silk.SilkCodec     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            int r1 = r1.mp3ToPcm(r2, r0)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            if (r1 == 0) goto L15
            p.a.v(r0)
            return r1
        L15:
            int r2 = getMetadataSampleRate(r2, r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r4 = 1
            r1 = 0
            int r2 = encodePcmToAac(r0, r3, r2, r4, r1)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            p.a.v(r0)
            return r2
        L23:
            r2 = move-exception
            goto L2f
        L25:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L23
            p.a.v(r0)
            r2 = -1011(0xfffffffffffffc0d, float:NaN)
            return r2
        L2f:
            p.a.v(r0)
            throw r2
    }

    private static int mp3ToM4a(java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.String r0 = ".temp.pcm"
            java.lang.String r0 = bc.e.i(r3, r0)
            me.yun.silk.SilkCodec r1 = new me.yun.silk.SilkCodec     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            int r1 = r1.mp3ToPcm(r2, r0)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            if (r1 == 0) goto L15
            p.a.v(r0)
            return r1
        L15:
            int r2 = getMetadataSampleRate(r2, r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r4 = 1
            r1 = 0
            int r2 = encodePcmToM4a(r0, r3, r2, r4, r1)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            p.a.v(r0)
            return r2
        L23:
            r2 = move-exception
            goto L2f
        L25:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L23
            p.a.v(r0)
            r2 = -1012(0xfffffffffffffc0c, float:NaN)
            return r2
        L2f:
            p.a.v(r0)
            throw r2
    }

    public static int mp4ToAac(java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.String r4 = ".temp.pcm"
            java.lang.String r4 = bc.e.i(r3, r4)
            r0 = 0
            me.yun.silk.AacCodec$DecodeResult r2 = decodeAacFileWithInfo(r2, r4, r0)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            int r1 = r2.code     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            if (r1 == 0) goto L15
            int r1 = r1 + (-2000)
            p.a.v(r4)
            return r1
        L15:
            me.yun.silk.AacCodec$AudioInfo r2 = r2.audioInfo     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            int r2 = r2.sampleRate     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            r1 = 1
            int r2 = encodePcmToAac(r4, r3, r2, r1, r0)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            p.a.v(r4)
            return r2
        L22:
            r2 = move-exception
            goto L2e
        L24:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L22
            p.a.v(r4)
            r2 = -1051(0xfffffffffffffbe5, float:NaN)
            return r2
        L2e:
            p.a.v(r4)
            throw r2
    }

    public static int mp4ToM4a(java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.String r4 = ".temp.pcm"
            java.lang.String r4 = bc.e.i(r3, r4)
            r0 = 0
            me.yun.silk.AacCodec$DecodeResult r2 = decodeAacFileWithInfo(r2, r4, r0)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            int r1 = r2.code     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            if (r1 == 0) goto L15
            int r1 = r1 + (-2000)
            p.a.v(r4)
            return r1
        L15:
            me.yun.silk.AacCodec$AudioInfo r2 = r2.audioInfo     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            int r2 = r2.sampleRate     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            r1 = 1
            int r2 = encodePcmToM4a(r4, r3, r2, r1, r0)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            p.a.v(r4)
            return r2
        L22:
            r2 = move-exception
            goto L2e
        L24:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L22
            p.a.v(r4)
            r2 = -1061(0xfffffffffffffbdb, float:NaN)
            return r2
        L2e:
            p.a.v(r4)
            throw r2
    }

    public static int mp4ToSilk(java.lang.String r9, java.lang.String r10, me.yun.silk.SilkCodec r11, int r12) {
            java.lang.String r0 = ".temp.pcm"
            java.lang.String r1 = bc.e.i(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r2 = ".temp."
            r0.append(r2)
            r0.append(r12)
            java.lang.String r2 = ".pcm"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r0 = 0
            me.yun.silk.AacCodec$DecodeResult r9 = decodeAacFileWithInfo(r9, r1, r0)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            int r0 = r9.code     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            if (r0 == 0) goto L3b
            int r0 = r0 + (-2000)
            java.io.File r9 = new java.io.File
            r9.<init>(r1)
            r9.delete()
            java.io.File r9 = new java.io.File
            r9.<init>(r2)
            r9.delete()
            return r0
        L3b:
            me.yun.silk.AacCodec$AudioInfo r9 = r9.audioInfo     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            int r9 = r9.sampleRate     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            if (r9 == r12) goto L63
            boolean r9 = resampleMonoPcm16(r1, r2, r9, r12)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            if (r9 != 0) goto L5a
            java.io.File r9 = new java.io.File
            r9.<init>(r1)
            r9.delete()
            java.io.File r9 = new java.io.File
            r9.<init>(r2)
            r9.delete()
            r9 = -701(0xfffffffffffffd43, float:NaN)
            return r9
        L5a:
            r7 = r12
            r4 = r2
            goto L65
        L5d:
            r0 = move-exception
            r9 = r0
            goto L94
        L60:
            r0 = move-exception
            r9 = r0
            goto L7e
        L63:
            r7 = r9
            r4 = r1
        L65:
            r8 = 1
            r5 = r10
            r3 = r11
            r6 = r12
            int r9 = r3.pcmToSilk(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.io.File r10 = new java.io.File
            r10.<init>(r1)
            r10.delete()
            java.io.File r10 = new java.io.File
            r10.<init>(r2)
            r10.delete()
            return r9
        L7e:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L5d
            java.io.File r9 = new java.io.File
            r9.<init>(r1)
            r9.delete()
            java.io.File r9 = new java.io.File
            r9.<init>(r2)
            r9.delete()
            r9 = -1031(0xfffffffffffffbf9, float:NaN)
            return r9
        L94:
            java.io.File r10 = new java.io.File
            r10.<init>(r1)
            r10.delete()
            java.io.File r10 = new java.io.File
            r10.<init>(r2)
            r10.delete()
            throw r9
    }

    private static int oggToAac(java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.String r0 = ".temp.pcm"
            java.lang.String r0 = bc.e.i(r3, r0)
            p.a.v(r3)
            me.yun.silk.SilkCodec r1 = new me.yun.silk.SilkCodec     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            me.yun.silk.AacCodec$DecodeResult r2 = decodeOggToPcmWithInfo(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            int r4 = r2.code     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r4 == 0) goto L1a
            p.a.v(r0)
            return r4
        L1a:
            me.yun.silk.AacCodec$AudioInfo r2 = r2.audioInfo     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            int r2 = r2.sampleRate     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r4 = 1
            r1 = 0
            int r2 = encodePcmToAac(r0, r3, r2, r4, r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r2 == 0) goto L33
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r4.delete()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            goto L33
        L2f:
            r2 = move-exception
            goto L48
        L31:
            r2 = move-exception
            goto L37
        L33:
            p.a.v(r0)
            return r2
        L37:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L2f
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            r2.delete()     // Catch: java.lang.Throwable -> L2f
            p.a.v(r0)
            r2 = -1051(0xfffffffffffffbe5, float:NaN)
            return r2
        L48:
            p.a.v(r0)
            throw r2
    }

    private static int oggToM4a(java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.String r0 = ".temp.pcm"
            java.lang.String r0 = bc.e.i(r3, r0)
            p.a.v(r3)
            me.yun.silk.SilkCodec r1 = new me.yun.silk.SilkCodec     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            me.yun.silk.AacCodec$DecodeResult r2 = decodeOggToPcmWithInfo(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            int r4 = r2.code     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r4 == 0) goto L1a
            p.a.v(r0)
            return r4
        L1a:
            me.yun.silk.AacCodec$AudioInfo r2 = r2.audioInfo     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            int r2 = r2.sampleRate     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r4 = 1
            r1 = 0
            int r2 = encodePcmToM4a(r0, r3, r2, r4, r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r2 == 0) goto L33
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r4.delete()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            goto L33
        L2f:
            r2 = move-exception
            goto L48
        L31:
            r2 = move-exception
            goto L37
        L33:
            p.a.v(r0)
            return r2
        L37:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L2f
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            r2.delete()     // Catch: java.lang.Throwable -> L2f
            p.a.v(r0)
            r2 = -1061(0xfffffffffffffbdb, float:NaN)
            return r2
        L48:
            p.a.v(r0)
            throw r2
    }

    public static int oggToPcmCompat(java.lang.String r1, java.lang.String r2, me.yun.silk.SilkCodec r3) {
            r0 = 44100(0xac44, float:6.1797E-41)
            me.yun.silk.AacCodec$DecodeResult r1 = decodeOggToPcmWithInfo(r1, r2, r3, r0)
            int r1 = r1.code
            return r1
    }

    public static int oggToSilkCompat(java.lang.String r1, java.lang.String r2, me.yun.silk.SilkCodec r3, int r4) {
            boolean r0 = isOggOpusFile(r1)
            if (r0 != 0) goto Lb
            int r1 = r3.oggToSilk(r1, r2, r4)
            return r1
        Lb:
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r0.delete()
            int r1 = mp4ToSilk(r1, r2, r3, r4)
            if (r1 != 0) goto L1b
            r1 = 0
            return r1
        L1b:
            p.a.v(r2)
            r2 = -2803(0xfffffffffffff50d, float:NaN)
            if (r1 < r2) goto L28
            r2 = -2801(0xfffffffffffff50f, float:NaN)
            if (r1 > r2) goto L28
            r1 = -401(0xfffffffffffffe6f, float:NaN)
        L28:
            return r1
    }

    public static int pcmToAac(java.lang.String r1, java.lang.String r2, int r3, int r4) {
            r0 = 0
            int r1 = encodePcmToAac(r1, r2, r3, r4, r0)
            return r1
    }

    public static int pcmToM4a(java.lang.String r1, java.lang.String r2, int r3, int r4) {
            r0 = 0
            int r1 = encodePcmToM4a(r1, r2, r3, r4, r0)
            return r1
    }

    private static int readPcm16(byte[] r1, int r2) {
            int r2 = r2 * 2
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + 1
            r1 = r1[r2]
            int r1 = r1 << 8
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
    }

    private static boolean resampleMonoPcm16(java.lang.String r12, java.lang.String r13, int r14, int r15) {
            r0 = 0
            if (r14 <= 0) goto La0
            if (r15 > 0) goto L7
            goto La0
        L7:
            java.io.File r1 = new java.io.File
            r1.<init>(r12)
            long r2 = r1.length()
            r4 = 2
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 < 0) goto La0
            r4 = 2147483646(0x7ffffffe, double:1.0609978945E-314)
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 <= 0) goto L1f
            goto La0
        L1f:
            r4 = -2
            long r2 = r2 & r4
            int r12 = (int) r2
            byte[] r2 = new byte[r12]
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile
            java.lang.String r4 = "r"
            r3.<init>(r1, r4)
            r3.readFully(r2)     // Catch: java.lang.Throwable -> L9b
            r3.close()
            int r12 = r12 / 2
            double r3 = (double) r12
            double r5 = (double) r15
            double r3 = r3 * r5
            double r14 = (double) r14
            double r3 = r3 / r14
            long r3 = java.lang.Math.round(r3)
            int r1 = (int) r3
            r3 = 1
            int r1 = java.lang.Math.max(r3, r1)
            int r4 = r1 * 2
            byte[] r4 = new byte[r4]
            double r14 = r14 / r5
        L48:
            if (r0 >= r1) goto L8a
            double r5 = (double) r0
            double r5 = r5 * r14
            int r7 = (int) r5
            double r8 = (double) r7
            double r5 = r5 - r8
            int r8 = r12 + (-1)
            int r9 = java.lang.Math.min(r7, r8)
            int r9 = readPcm16(r2, r9)
            int r7 = r7 + r3
            int r7 = java.lang.Math.min(r7, r8)
            int r7 = readPcm16(r2, r7)
            double r10 = (double) r9
            int r7 = r7 - r9
            double r7 = (double) r7
            double r7 = r7 * r5
            double r7 = r7 + r10
            long r5 = java.lang.Math.round(r7)
            int r5 = (int) r5
            r6 = 32767(0x7fff, float:4.5916E-41)
            int r5 = java.lang.Math.min(r6, r5)
            r6 = -32768(0xffffffffffff8000, float:NaN)
            int r5 = java.lang.Math.max(r6, r5)
            int r6 = r0 * 2
            r7 = r5 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r6 + r3
            int r5 = r5 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r4[r6] = r5
            int r0 = r0 + 1
            goto L48
        L8a:
            java.io.FileOutputStream r12 = new java.io.FileOutputStream
            r12.<init>(r13)
            r12.write(r4)     // Catch: java.lang.Throwable -> L96
            r12.close()
            return r3
        L96:
            r13 = move-exception
            r12.close()
            throw r13
        L9b:
            r12 = move-exception
            r3.close()
            throw r12
        La0:
            return r0
    }

    public static int silkToAac(java.lang.String r2, java.lang.String r3, me.yun.silk.SilkCodec r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r0.<init>()     // Catch: java.lang.Exception -> L27
            r0.append(r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = ".temp.pcm"
            r0.append(r1)     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L27
            int r2 = r4.silkToPcm(r2, r0, r5)     // Catch: java.lang.Exception -> L27
            if (r2 == 0) goto L18
            return r2
        L18:
            r2 = 1
            r4 = 0
            int r2 = encodePcmToAac(r0, r3, r5, r2, r4)     // Catch: java.lang.Exception -> L27
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L27
            r3.<init>(r0)     // Catch: java.lang.Exception -> L27
            r3.delete()     // Catch: java.lang.Exception -> L27
            return r2
        L27:
            r2 = move-exception
            r2.printStackTrace()
            r2 = -1001(0xfffffffffffffc17, float:NaN)
            return r2
    }

    public static int silkToM4a(java.lang.String r2, java.lang.String r3, me.yun.silk.SilkCodec r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r0.<init>()     // Catch: java.lang.Exception -> L27
            r0.append(r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = ".temp.pcm"
            r0.append(r1)     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L27
            int r2 = r4.silkToPcm(r2, r0, r5)     // Catch: java.lang.Exception -> L27
            if (r2 == 0) goto L18
            return r2
        L18:
            r2 = 1
            r4 = 0
            int r2 = encodePcmToM4a(r0, r3, r5, r2, r4)     // Catch: java.lang.Exception -> L27
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L27
            r3.<init>(r0)     // Catch: java.lang.Exception -> L27
            r3.delete()     // Catch: java.lang.Exception -> L27
            return r2
        L27:
            r2 = move-exception
            r2.printStackTrace()
            r2 = -1001(0xfffffffffffffc17, float:NaN)
            return r2
    }

    private static int validSampleRate(int r0, int r1) {
            switch(r0) {
                case 8000: goto L9;
                case 11025: goto L9;
                case 12000: goto L9;
                case 16000: goto L9;
                case 22050: goto L9;
                case 24000: goto L9;
                case 32000: goto L9;
                case 44100: goto L9;
                case 48000: goto L9;
                case 64000: goto L9;
                case 88200: goto L9;
                case 96000: goto L9;
                default: goto L3;
            }
        L3:
            if (r1 <= 0) goto L6
            return r1
        L6:
            r0 = 44100(0xac44, float:6.1797E-41)
        L9:
            return r0
    }

    private static int wavToAac(java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.String r0 = ".temp.pcm"
            java.lang.String r0 = bc.e.i(r3, r0)
            me.yun.silk.SilkCodec r1 = new me.yun.silk.SilkCodec     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            int r1 = r1.wavToPcm(r2, r0)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            if (r1 == 0) goto L15
            p.a.v(r0)
            return r1
        L15:
            int r2 = getWavSampleRate(r2, r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r4 = 1
            r1 = 0
            int r2 = encodePcmToAac(r0, r3, r2, r4, r1)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            p.a.v(r0)
            return r2
        L23:
            r2 = move-exception
            goto L2f
        L25:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L23
            p.a.v(r0)
            r2 = -1021(0xfffffffffffffc03, float:NaN)
            return r2
        L2f:
            p.a.v(r0)
            throw r2
    }

    private static int wavToM4a(java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.String r0 = ".temp.pcm"
            java.lang.String r0 = bc.e.i(r3, r0)
            me.yun.silk.SilkCodec r1 = new me.yun.silk.SilkCodec     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            int r1 = r1.wavToPcm(r2, r0)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            if (r1 == 0) goto L15
            p.a.v(r0)
            return r1
        L15:
            int r2 = getWavSampleRate(r2, r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r4 = 1
            r1 = 0
            int r2 = encodePcmToM4a(r0, r3, r2, r4, r1)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            p.a.v(r0)
            return r2
        L23:
            r2 = move-exception
            goto L2f
        L25:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L23
            p.a.v(r0)
            r2 = -1022(0xfffffffffffffc02, float:NaN)
            return r2
        L2f:
            p.a.v(r0)
            throw r2
    }
}
