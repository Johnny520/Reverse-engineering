package me.yun.silk;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.os.SystemClock;
import android.view.Surface;
import bsh.org.objectweb.asm.Opcodes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;
import p288tb.C4143c;

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
        void onMessage(String str);

        void onProgress(int i9);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class AudioInfo {
        int channelCount;
        int sampleRate;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AudioInfo(int i9, int i10) {
            this.sampleRate = i9;
            this.channelCount = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class DecodeResult {
        AudioInfo audioInfo;
        int code;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public DecodeResult(int i9, AudioInfo audioInfo) {
            this.code = i9;
            this.audioInfo = audioInfo;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int aacToPcm(String str, String str2) {
        return decodeAacFile(str, str2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int aacToSilk(String str, String str2, SilkCodec silkCodec, int i9) {
        return mp4ToSilk(str, str2, silkCodec, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int autoAacToSilk(String str, String str2, SilkCodec silkCodec, int i9) {
        return m4aToSilk(str, str2, silkCodec, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int autoToAac(String str, String str2, SilkCodec silkCodec, int i9) {
        if (isOggOpusFile(str)) {
            return oggToAac(str, str2, i9);
        }
        switch (silkCodec.getFileType(str)) {
            case 1:
                return silkToAac(str, str2, silkCodec, i9);
            case 2:
                return mp3ToAac(str, str2, i9);
            case 3:
                return wavToAac(str, str2, i9);
            case 4:
                return flacToAac(str, str2, i9);
            case 5:
                return oggToAac(str, str2, i9);
            case 6:
            default:
                return -2;
            case 7:
                return m4aToAac(str, str2, i9);
            case 8:
                return mp4ToAac(str, str2, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int autoToM4a(String str, String str2, SilkCodec silkCodec, int i9) {
        if (isOggOpusFile(str)) {
            return oggToM4a(str, str2, i9);
        }
        switch (silkCodec.getFileType(str)) {
            case 1:
                return silkToM4a(str, str2, silkCodec, i9);
            case 2:
                return mp3ToM4a(str, str2, i9);
            case 3:
                return wavToM4a(str, str2, i9);
            case 4:
                return flacToM4a(str, str2, i9);
            case 5:
                return oggToM4a(str, str2, i9);
            case 6:
            default:
                return -2;
            case 7:
                return m4aToM4a(str, str2, i9);
            case 8:
                return mp4ToM4a(str, str2, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int autoToPcmCompat(String str, String str2, SilkCodec silkCodec) {
        return (isOggOpusFile(str) || silkCodec.getFileType(str) == 5) ? oggToPcmCompat(str, str2, silkCodec) : silkCodec.autoToPcm(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int autoToSilkCompat(String str, String str2, SilkCodec silkCodec, int i9) {
        return (isOggOpusFile(str) || silkCodec.getFileType(str) == 5) ? oggToSilkCompat(str, str2, silkCodec, i9) : silkCodec.autoToSilk(str, str2, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static byte[] createAdtsHeader(int i9, int i10, int i11) {
        int i12 = i11 + 7;
        return new byte[]{-1, -15, (byte) ((getSampleRateIndex(i9) << 2) | 64 | (i10 >> 2)), (byte) (((i10 & 3) << 6) | (i12 >> 11)), (byte) ((i12 >> 3) & 255), (byte) (((i12 & 7) << 5) | 31), -4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int decodeAacFile(String str, String str2, AacCallback aacCallback) {
        return decodeAacFileWithInfo(str, str2, aacCallback).code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v20, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v21, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x039b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x036b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:? A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static DecodeResult decodeAacFileWithInfo(String str, String str2, AacCallback aacCallback) throws Throwable {
        MediaExtractor mediaExtractor;
        MediaCodec mediaCodec;
        MediaCodec mediaCodec2;
        MediaFormat trackFormat;
        MediaCodec.BufferInfo bufferInfo;
        ByteBuffer[] byteBufferArr;
        long jElapsedRealtime;
        int i9;
        boolean z9;
        if (aacCallback != null) {
            aacCallback.onMessage("开始解码: " + str);
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        FileOutputStream fileOutputStream = null;
        int i10 = 0;
        try {
            try {
                if (!new File(str).exists()) {
                    if (aacCallback != null) {
                        aacCallback.onMessage("文件不存在: " + str);
                    }
                    DecodeResult decodeResult = new DecodeResult(-801, new AudioInfo(DEFAULT_SAMPLE_RATE, 1));
                    try {
                        mediaExtractor2.release();
                    } catch (Exception unused) {
                    }
                    if (str2 != null && str2.length() > 0) {
                        AbstractC3199a.m6849v(str2);
                    }
                    return decodeResult;
                }
                mediaExtractor2.setDataSource(str);
                int i11 = 0;
                while (true) {
                    if (i11 >= mediaExtractor2.getTrackCount()) {
                        trackFormat = null;
                        i11 = -1;
                        break;
                    }
                    trackFormat = mediaExtractor2.getTrackFormat(i11);
                    String string = trackFormat.getString("mime");
                    if (string == null || !string.startsWith("audio/")) {
                        i11++;
                    } else if (aacCallback != null) {
                        aacCallback.onMessage("找到音频轨道: " + i11);
                    }
                }
                if (i11 == -1) {
                    if (aacCallback != null) {
                        aacCallback.onMessage("未找到音频轨道");
                    }
                    DecodeResult decodeResult2 = new DecodeResult(-802, new AudioInfo(DEFAULT_SAMPLE_RATE, 1));
                    try {
                        mediaExtractor2.release();
                    } catch (Exception unused2) {
                    }
                    if (str2 != null && str2.length() > 0) {
                        AbstractC3199a.m6849v(str2);
                    }
                    return decodeResult2;
                }
                mediaExtractor2.selectTrack(i11);
                int integer = trackFormat.containsKey("sample-rate") ? trackFormat.getInteger("sample-rate") : DEFAULT_SAMPLE_RATE;
                int integer2 = trackFormat.containsKey("channel-count") ? trackFormat.getInteger("channel-count") : 1;
                if (aacCallback != null) {
                    aacCallback.onMessage("参数: " + integer + "Hz, " + integer2 + "通道");
                }
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
                try {
                    mediaCodecCreateDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                    mediaCodecCreateDecoderByType.start();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(str2);
                    try {
                        ByteBuffer[] inputBuffers = mediaCodecCreateDecoderByType.getInputBuffers();
                        ByteBuffer[] outputBuffers = mediaCodecCreateDecoderByType.getOutputBuffers();
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        boolean z10 = false;
                        boolean z11 = false;
                        ByteBuffer[] byteBufferArr2 = outputBuffers;
                        long j3 = 0;
                        while (!z10) {
                            if (!z11) {
                                try {
                                    int iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(10000L);
                                    if (iDequeueInputBuffer >= 0) {
                                        ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
                                        byteBuffer.clear();
                                        int sampleData = mediaExtractor2.readSampleData(byteBuffer, i10);
                                        if (sampleData < 0) {
                                            mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                                            z11 = true;
                                        } else {
                                            mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, mediaExtractor2.getSampleTime(), 0);
                                            mediaExtractor2.advance();
                                        }
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    fileOutputStream = fileOutputStream2;
                                    mediaExtractor = mediaExtractor2;
                                    mediaCodec2 = mediaCodecCreateDecoderByType;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileOutputStream = fileOutputStream2;
                                    mediaExtractor = mediaExtractor2;
                                    mediaCodec = mediaCodecCreateDecoderByType;
                                    if (fileOutputStream != null) {
                                    }
                                    if (mediaCodec != null) {
                                    }
                                    if (mediaCodec != null) {
                                    }
                                    try {
                                        mediaExtractor.release();
                                    } catch (Exception unused3) {
                                    }
                                    if (i10 != 0) {
                                    }
                                }
                            }
                            try {
                                int iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo2, 10000L);
                                if (iDequeueOutputBuffer >= 0) {
                                    int i12 = (bufferInfo2.flags & 4) != 0 ? 1 : i10;
                                    if (bufferInfo2.size > 0) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                        ByteBuffer byteBuffer2 = byteBufferArr2[iDequeueOutputBuffer];
                                        byteBuffer2.position(bufferInfo2.offset);
                                        byteBuffer2.limit(bufferInfo2.offset + bufferInfo2.size);
                                        int i13 = bufferInfo2.size;
                                        byte[] bArr = new byte[i13];
                                        byteBuffer2.get(bArr);
                                        if (integer2 == 1) {
                                            try {
                                                fileOutputStream2.write(bArr);
                                                byteBufferArr = inputBuffers;
                                                j3 += (long) i13;
                                                mediaExtractor = mediaExtractor2;
                                                i9 = i12;
                                                bufferInfo = bufferInfo2;
                                            } catch (Exception e7) {
                                                e = e7;
                                                fileOutputStream = fileOutputStream2;
                                                mediaExtractor = mediaExtractor2;
                                                i10 = 0;
                                                mediaCodec2 = mediaCodecCreateDecoderByType;
                                                if (aacCallback != null) {
                                                }
                                                e.printStackTrace();
                                                DecodeResult decodeResult3 = new DecodeResult(-803, new AudioInfo(DEFAULT_SAMPLE_RATE, 1));
                                                if (fileOutputStream != null) {
                                                }
                                                if (mediaCodec2 != null) {
                                                }
                                                if (mediaCodec2 != null) {
                                                }
                                                mediaExtractor.release();
                                                if (i10 == 0) {
                                                    AbstractC3199a.m6849v(str2);
                                                }
                                                return decodeResult3;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                fileOutputStream = fileOutputStream2;
                                                mediaExtractor = mediaExtractor2;
                                                i10 = 0;
                                                mediaCodec = mediaCodecCreateDecoderByType;
                                                if (fileOutputStream != null) {
                                                }
                                                if (mediaCodec != null) {
                                                }
                                                if (mediaCodec != null) {
                                                }
                                                mediaExtractor.release();
                                                if (i10 != 0) {
                                                }
                                            }
                                        } else {
                                            byteBufferArr = inputBuffers;
                                            int iMax = Math.max(1, integer2);
                                            int i14 = bufferInfo2.size / (iMax * 2);
                                            int i15 = i14 * 2;
                                            byte[] bArr2 = new byte[i15];
                                            mediaExtractor = mediaExtractor2;
                                            int i16 = 0;
                                            while (i16 < i14) {
                                                int i17 = i16;
                                                long j4 = 0;
                                                int i18 = 0;
                                                while (i18 < iMax) {
                                                    int i19 = ((i17 * iMax) + i18) * 2;
                                                    int i20 = i18;
                                                    j4 += (long) ((short) ((bArr[i19] & 255) | (bArr[i19 + 1] << 8)));
                                                    i18 = i20 + 1;
                                                    bufferInfo2 = bufferInfo2;
                                                    i12 = i12;
                                                }
                                                int i21 = i12;
                                                int i22 = (int) (j4 / ((long) iMax));
                                                int i23 = i17 * 2;
                                                bArr2[i23] = (byte) (i22 & 255);
                                                bArr2[i23 + 1] = (byte) ((i22 >> 8) & 255);
                                                i16 = i17 + 1;
                                                bufferInfo2 = bufferInfo2;
                                                i12 = i21;
                                            }
                                            i9 = i12;
                                            bufferInfo = bufferInfo2;
                                            fileOutputStream2.write(bArr2);
                                            j3 += (long) i15;
                                        }
                                        z9 = 0;
                                    } else {
                                        mediaExtractor = mediaExtractor2;
                                        i9 = i12;
                                        bufferInfo = bufferInfo2;
                                        byteBufferArr = inputBuffers;
                                        z9 = i10;
                                    }
                                    try {
                                        mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, z9);
                                        if (i9 != 0) {
                                            jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                            z10 = true;
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        fileOutputStream = fileOutputStream2;
                                        i10 = 0;
                                        mediaCodec2 = mediaCodecCreateDecoderByType;
                                        if (aacCallback != null) {
                                        }
                                        e.printStackTrace();
                                        DecodeResult decodeResult32 = new DecodeResult(-803, new AudioInfo(DEFAULT_SAMPLE_RATE, 1));
                                        if (fileOutputStream != null) {
                                        }
                                        if (mediaCodec2 != null) {
                                        }
                                        if (mediaCodec2 != null) {
                                        }
                                        mediaExtractor.release();
                                        if (i10 == 0) {
                                        }
                                        return decodeResult32;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fileOutputStream = fileOutputStream2;
                                        i10 = 0;
                                        mediaCodec = mediaCodecCreateDecoderByType;
                                        if (fileOutputStream != null) {
                                        }
                                        if (mediaCodec != null) {
                                        }
                                        if (mediaCodec != null) {
                                        }
                                        mediaExtractor.release();
                                        if (i10 != 0) {
                                        }
                                    }
                                } else {
                                    mediaExtractor = mediaExtractor2;
                                    bufferInfo = bufferInfo2;
                                    byteBufferArr = inputBuffers;
                                    if (iDequeueOutputBuffer == -3) {
                                        ByteBuffer[] outputBuffers2 = mediaCodecCreateDecoderByType.getOutputBuffers();
                                        jElapsedRealtime = SystemClock.elapsedRealtime();
                                        byteBufferArr2 = outputBuffers2;
                                    } else if (iDequeueOutputBuffer == -2) {
                                        MediaFormat outputFormat = mediaCodecCreateDecoderByType.getOutputFormat();
                                        if (outputFormat.containsKey("sample-rate")) {
                                            integer = outputFormat.getInteger("sample-rate");
                                        }
                                        if (outputFormat.containsKey("channel-count")) {
                                            integer2 = outputFormat.getInteger("channel-count");
                                        }
                                        jElapsedRealtime = SystemClock.elapsedRealtime();
                                    }
                                    jElapsedRealtime2 = jElapsedRealtime;
                                }
                                if (SystemClock.elapsedRealtime() - jElapsedRealtime2 > DECODE_STALL_TIMEOUT_MS) {
                                    if (aacCallback != null) {
                                        aacCallback.onMessage("解码超时: 解码器长时间无输出");
                                    }
                                    DecodeResult decodeResult4 = new DecodeResult(-803, new AudioInfo(integer, Math.max(1, integer2)));
                                    try {
                                        fileOutputStream2.close();
                                    } catch (Exception unused4) {
                                    }
                                    try {
                                        mediaCodecCreateDecoderByType.stop();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        mediaCodecCreateDecoderByType.release();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        mediaExtractor.release();
                                    } catch (Exception unused7) {
                                    }
                                    if (str2 != null && str2.length() > 0) {
                                        AbstractC3199a.m6849v(str2);
                                    }
                                    return decodeResult4;
                                }
                                inputBuffers = byteBufferArr;
                                mediaExtractor2 = mediaExtractor;
                                bufferInfo2 = bufferInfo;
                                i10 = 0;
                            } catch (Exception e11) {
                                e = e11;
                                mediaExtractor = mediaExtractor2;
                            } catch (Throwable th5) {
                                th = th5;
                                mediaExtractor = mediaExtractor2;
                            }
                        }
                        mediaExtractor = mediaExtractor2;
                        if (j3 <= 0) {
                            if (aacCallback != null) {
                                aacCallback.onMessage("解码失败: 未产生音频数据");
                            }
                            DecodeResult decodeResult5 = new DecodeResult(-803, new AudioInfo(integer, 1));
                            try {
                                fileOutputStream2.close();
                            } catch (Exception unused8) {
                            }
                            try {
                                mediaCodecCreateDecoderByType.stop();
                            } catch (Exception unused9) {
                            }
                            try {
                                mediaCodecCreateDecoderByType.release();
                            } catch (Exception unused10) {
                            }
                            try {
                                mediaExtractor.release();
                            } catch (Exception unused11) {
                            }
                            if (str2 != null && str2.length() > 0) {
                                AbstractC3199a.m6849v(str2);
                            }
                            return decodeResult5;
                        }
                        try {
                            fileOutputStream2.close();
                            if (aacCallback != null) {
                                try {
                                    aacCallback.onMessage("解码完成");
                                } catch (Exception e12) {
                                    e = e12;
                                    fileOutputStream = null;
                                    i10 = 0;
                                    mediaCodec2 = mediaCodecCreateDecoderByType;
                                } catch (Throwable th6) {
                                    th = th6;
                                    fileOutputStream = null;
                                    i10 = 0;
                                    mediaCodec = mediaCodecCreateDecoderByType;
                                    if (fileOutputStream != null) {
                                    }
                                    if (mediaCodec != null) {
                                    }
                                    if (mediaCodec != null) {
                                    }
                                    mediaExtractor.release();
                                    if (i10 != 0) {
                                    }
                                }
                            }
                            try {
                                DecodeResult decodeResult6 = new DecodeResult(0, new AudioInfo(integer, 1));
                                try {
                                    mediaCodecCreateDecoderByType.stop();
                                } catch (Exception unused12) {
                                }
                                try {
                                    mediaCodecCreateDecoderByType.release();
                                } catch (Exception unused13) {
                                }
                                try {
                                    mediaExtractor.release();
                                } catch (Exception unused14) {
                                }
                                return decodeResult6;
                            } catch (Exception e13) {
                                e = e13;
                                fileOutputStream = null;
                                i10 = 1;
                                mediaCodec2 = mediaCodecCreateDecoderByType;
                            } catch (Throwable th7) {
                                th = th7;
                                fileOutputStream = null;
                                i10 = 1;
                                mediaCodec = mediaCodecCreateDecoderByType;
                                if (fileOutputStream != null) {
                                }
                                if (mediaCodec != null) {
                                }
                                if (mediaCodec != null) {
                                }
                                mediaExtractor.release();
                                if (i10 != 0) {
                                    throw th;
                                }
                                throw th;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            i10 = 0;
                            fileOutputStream = fileOutputStream2;
                            mediaCodec2 = mediaCodecCreateDecoderByType;
                        } catch (Throwable th8) {
                            th = th8;
                            i10 = 0;
                            fileOutputStream = fileOutputStream2;
                            mediaCodec = mediaCodecCreateDecoderByType;
                            if (fileOutputStream != null) {
                            }
                            if (mediaCodec != null) {
                            }
                            if (mediaCodec != null) {
                            }
                            mediaExtractor.release();
                            if (i10 != 0) {
                            }
                        }
                    } catch (Exception e15) {
                        e = e15;
                        mediaExtractor = mediaExtractor2;
                    } catch (Throwable th9) {
                        th = th9;
                        mediaExtractor = mediaExtractor2;
                    }
                } catch (Exception e16) {
                    e = e16;
                    mediaExtractor = mediaExtractor2;
                    fileOutputStream = null;
                    mediaCodec2 = mediaCodecCreateDecoderByType;
                } catch (Throwable th10) {
                    th = th10;
                    mediaExtractor = mediaExtractor2;
                    fileOutputStream = null;
                    mediaCodec = mediaCodecCreateDecoderByType;
                }
            } catch (Exception e17) {
                e = e17;
                mediaExtractor = mediaExtractor2;
                mediaCodec2 = null;
            } catch (Throwable th11) {
                th = th11;
                mediaExtractor = mediaExtractor2;
                mediaCodec = null;
            }
        } catch (Exception e18) {
            e = e18;
            mediaExtractor = mediaExtractor2;
            fileOutputStream = null;
            mediaCodec2 = null;
        } catch (Throwable th12) {
            th = th12;
            mediaExtractor = mediaExtractor2;
            fileOutputStream = null;
            mediaCodec = null;
        }
        if (aacCallback != null) {
            try {
                aacCallback.onMessage("解码异常: " + e.getMessage());
            } catch (Throwable th13) {
                th = th13;
                mediaCodec = mediaCodec2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception unused15) {
                    }
                }
                if (mediaCodec != null) {
                    try {
                        mediaCodec.stop();
                    } catch (Exception unused16) {
                    }
                }
                if (mediaCodec != null) {
                    try {
                        mediaCodec.release();
                    } catch (Exception unused17) {
                    }
                }
                mediaExtractor.release();
                if (i10 != 0 || str2 == null || str2.length() <= 0) {
                    throw th;
                }
                AbstractC3199a.m6849v(str2);
                throw th;
            }
        }
        e.printStackTrace();
        DecodeResult decodeResult322 = new DecodeResult(-803, new AudioInfo(DEFAULT_SAMPLE_RATE, 1));
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (Exception unused18) {
            }
        }
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (Exception unused19) {
            }
        }
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.release();
            } catch (Exception unused20) {
            }
        }
        try {
            mediaExtractor.release();
        } catch (Exception unused21) {
        }
        if (i10 == 0 && str2 != null && str2.length() > 0) {
            AbstractC3199a.m6849v(str2);
        }
        return decodeResult322;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int decodeM4aFile(String str, String str2, AacCallback aacCallback) {
        return decodeAacFile(str, str2, aacCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static DecodeResult decodeOggToPcmWithInfo(String str, String str2, SilkCodec silkCodec, int i9) throws Throwable {
        if (!isOggOpusFile(str)) {
            return new DecodeResult(silkCodec.oggToPcm(str, str2), new AudioInfo(getMetadataSampleRate(str, i9), 1));
        }
        DecodeResult decodeResultDecodeAacFileWithInfo = decodeAacFileWithInfo(str, str2, null);
        if (decodeResultDecodeAacFileWithInfo.code == 0) {
            return decodeResultDecodeAacFileWithInfo;
        }
        new File(str2).delete();
        return new DecodeResult(-401, decodeResultDecodeAacFileWithInfo.audioInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104 A[Catch: Exception -> 0x00c1, TryCatch #0 {Exception -> 0x00c1, blocks: (B:11:0x0032, B:15:0x0082, B:17:0x0089, B:19:0x00a7, B:26:0x00dd, B:31:0x00fe, B:33:0x0104, B:36:0x010c, B:38:0x0110, B:39:0x0121, B:43:0x012b, B:22:0x00c4, B:45:0x0137, B:47:0x0145), top: B:54:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int encodePcmToAac(String str, String str2, int i9, int i10, AacCallback aacCallback) {
        ByteBuffer[] byteBufferArr;
        MediaCodec.BufferInfo bufferInfo;
        ByteBuffer[] byteBufferArr2;
        long j3;
        int iDequeueOutputBuffer;
        if (aacCallback != null) {
            aacCallback.onMessage("开始编码 AAC: " + str);
        }
        File file = new File(str);
        if (!file.exists()) {
            if (aacCallback == null) {
                return -901;
            }
            aacCallback.onMessage("PCM 文件不存在");
            return -901;
        }
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i9, i10);
            mediaFormatCreateAudioFormat.setInteger("bitrate", DEFAULT_BIT_RATE);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
            mediaFormatCreateAudioFormat.setInteger("max-input-size", 16384);
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            mediaCodecCreateEncoderByType.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            mediaCodecCreateEncoderByType.start();
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            ByteBuffer[] inputBuffers = mediaCodecCreateEncoderByType.getInputBuffers();
            ByteBuffer[] outputBuffers = mediaCodecCreateEncoderByType.getOutputBuffers();
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            long length = file.length();
            int i11 = 0;
            int i12 = 0;
            boolean z9 = false;
            boolean z10 = false;
            while (!z9) {
                if (z10) {
                    byteBufferArr = inputBuffers;
                    bufferInfo = bufferInfo2;
                } else {
                    MediaCodec.BufferInfo bufferInfo3 = bufferInfo2;
                    int iDequeueInputBuffer = mediaCodecCreateEncoderByType.dequeueInputBuffer(10000L);
                    if (iDequeueInputBuffer >= 0) {
                        ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
                        byteBuffer.clear();
                        byteBufferArr2 = outputBuffers;
                        byte[] bArr = new byte[Math.min(4096, (int) (length - randomAccessFile.getFilePointer()))];
                        int i13 = randomAccessFile.read(bArr);
                        if (i13 > 0) {
                            byteBuffer.put(bArr, i11, i13);
                            byteBufferArr = inputBuffers;
                            bufferInfo = bufferInfo3;
                            j3 = 10000;
                            mediaCodecCreateEncoderByType.queueInputBuffer(iDequeueInputBuffer, 0, i13, (((long) i12) * 1024000000) / ((long) i9), 0);
                            i12++;
                        } else {
                            byteBufferArr = inputBuffers;
                            bufferInfo = bufferInfo3;
                            j3 = 10000;
                            mediaCodecCreateEncoderByType.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                            i12 = i12;
                            z10 = true;
                        }
                        if (aacCallback != null && length > 0) {
                            aacCallback.onProgress(Math.min((int) ((randomAccessFile.getFilePointer() * 100) / length), 99));
                        }
                        iDequeueOutputBuffer = mediaCodecCreateEncoderByType.dequeueOutputBuffer(bufferInfo, j3);
                        if (iDequeueOutputBuffer < 0) {
                            if ((bufferInfo.flags & 4) != 0) {
                                z9 = true;
                            }
                            int i14 = bufferInfo.size;
                            if (i14 > 0) {
                                byte[] bArr2 = new byte[i14];
                                byteBufferArr2[iDequeueOutputBuffer].get(bArr2);
                                fileOutputStream.write(createAdtsHeader(i9, i10, i14));
                                fileOutputStream.write(bArr2);
                            }
                            mediaCodecCreateEncoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        } else {
                            if (iDequeueOutputBuffer == -3) {
                                outputBuffers = mediaCodecCreateEncoderByType.getOutputBuffers();
                            }
                            bufferInfo2 = bufferInfo;
                            i11 = 0;
                            inputBuffers = byteBufferArr;
                        }
                        outputBuffers = byteBufferArr2;
                        bufferInfo2 = bufferInfo;
                        i11 = 0;
                        inputBuffers = byteBufferArr;
                    } else {
                        byteBufferArr = inputBuffers;
                        bufferInfo = bufferInfo3;
                    }
                }
                byteBufferArr2 = outputBuffers;
                j3 = 10000;
                i12 = i12;
                iDequeueOutputBuffer = mediaCodecCreateEncoderByType.dequeueOutputBuffer(bufferInfo, j3);
                if (iDequeueOutputBuffer < 0) {
                }
                outputBuffers = byteBufferArr2;
                bufferInfo2 = bufferInfo;
                i11 = 0;
                inputBuffers = byteBufferArr;
            }
            randomAccessFile.close();
            fileOutputStream.close();
            mediaCodecCreateEncoderByType.stop();
            mediaCodecCreateEncoderByType.release();
            if (aacCallback == null) {
                return 0;
            }
            aacCallback.onMessage("编码完成");
            aacCallback.onProgress(100);
            return 0;
        } catch (Exception e6) {
            if (aacCallback != null) {
                aacCallback.onMessage("编码异常: " + e6.getMessage());
            }
            e6.printStackTrace();
            return -902;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int encodePcmToM4a(String str, String str2, int i9, int i10, AacCallback aacCallback) {
        ByteBuffer[] byteBufferArr;
        RandomAccessFile randomAccessFile;
        MediaCodec.BufferInfo bufferInfo;
        long j3;
        int iDequeueInputBuffer;
        int i11 = i9;
        if (aacCallback != null) {
            aacCallback.onMessage("开始编码 M4A: " + str);
        }
        File file = new File(str);
        if (!file.exists()) {
            if (aacCallback == null) {
                return -911;
            }
            aacCallback.onMessage("PCM 文件不存在");
            return -911;
        }
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i11, i10);
            mediaFormatCreateAudioFormat.setInteger("bitrate", DEFAULT_BIT_RATE);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
            mediaFormatCreateAudioFormat.setInteger("max-input-size", 16384);
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            mediaCodecCreateEncoderByType.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            mediaCodecCreateEncoderByType.start();
            int i12 = 0;
            MediaMuxer mediaMuxer = new MediaMuxer(str2, 0);
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
            ByteBuffer[] inputBuffers = mediaCodecCreateEncoderByType.getInputBuffers();
            ByteBuffer[] outputBuffers = mediaCodecCreateEncoderByType.getOutputBuffers();
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            long length = file.length();
            int i13 = i10 * Opcodes.ACC_STRICT;
            int iAddTrack = -1;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            ByteBuffer[] outputBuffers2 = outputBuffers;
            int i14 = 0;
            while (!z9) {
                if (z10 || (iDequeueInputBuffer = mediaCodecCreateEncoderByType.dequeueInputBuffer(10000L)) < 0) {
                    byteBufferArr = inputBuffers;
                    randomAccessFile = randomAccessFile2;
                    bufferInfo = bufferInfo2;
                    j3 = 10000;
                    i14 = i14;
                } else {
                    ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
                    byteBuffer.clear();
                    byte[] bArr = new byte[Math.min(i13, (int) (length - randomAccessFile2.getFilePointer()))];
                    int i15 = randomAccessFile2.read(bArr);
                    if (i15 > 0) {
                        byteBuffer.put(bArr, i12, i15);
                        randomAccessFile = randomAccessFile2;
                        byteBufferArr = inputBuffers;
                        j3 = 10000;
                        bufferInfo = bufferInfo2;
                        mediaCodecCreateEncoderByType.queueInputBuffer(iDequeueInputBuffer, 0, i15, (((long) i14) * 1024000000) / ((long) i11), 0);
                        i14++;
                    } else {
                        byteBufferArr = inputBuffers;
                        randomAccessFile = randomAccessFile2;
                        bufferInfo = bufferInfo2;
                        j3 = 10000;
                        mediaCodecCreateEncoderByType.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                        i14 = i14;
                        z10 = true;
                    }
                    if (aacCallback != null && length > 0) {
                        aacCallback.onProgress(Math.min((int) ((randomAccessFile.getFilePointer() * 100) / length), 99));
                    }
                }
                int iDequeueOutputBuffer = mediaCodecCreateEncoderByType.dequeueOutputBuffer(bufferInfo, j3);
                if (iDequeueOutputBuffer >= 0) {
                    if ((bufferInfo.flags & 4) != 0) {
                        z9 = true;
                    }
                    if (bufferInfo.size > 0 && !z9) {
                        if (!z11) {
                            iAddTrack = mediaMuxer.addTrack(mediaCodecCreateEncoderByType.getOutputFormat());
                            mediaMuxer.start();
                            z11 = true;
                        }
                        mediaMuxer.writeSampleData(iAddTrack, outputBuffers2[iDequeueOutputBuffer], bufferInfo);
                    }
                    mediaCodecCreateEncoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                } else if (iDequeueOutputBuffer == -3) {
                    outputBuffers2 = mediaCodecCreateEncoderByType.getOutputBuffers();
                }
                inputBuffers = byteBufferArr;
                i11 = i9;
                bufferInfo2 = bufferInfo;
                randomAccessFile2 = randomAccessFile;
                i12 = 0;
            }
            randomAccessFile2.close();
            mediaCodecCreateEncoderByType.stop();
            mediaCodecCreateEncoderByType.release();
            if (z11) {
                mediaMuxer.stop();
            }
            mediaMuxer.release();
            if (aacCallback == null) {
                return 0;
            }
            aacCallback.onMessage("编码完成");
            aacCallback.onProgress(100);
            return 0;
        } catch (Exception e6) {
            if (aacCallback != null) {
                aacCallback.onMessage("编码异常: " + e6.getMessage());
            }
            e6.printStackTrace();
            return -912;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int flacToAac(String str, String str2, int i9) {
        String strM1020i = AbstractC0255e.m1020i(str2, ".temp.pcm");
        try {
            try {
                int iFlacToPcm = new SilkCodec().flacToPcm(str, strM1020i);
                return iFlacToPcm != 0 ? iFlacToPcm : encodePcmToAac(strM1020i, str2, getMetadataSampleRate(str, i9), 1, null);
            } catch (Exception e6) {
                e6.printStackTrace();
                AbstractC3199a.m6849v(strM1020i);
                return -1051;
            }
        } finally {
            AbstractC3199a.m6849v(strM1020i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int flacToM4a(String str, String str2, int i9) {
        String strM1020i = AbstractC0255e.m1020i(str2, ".temp.pcm");
        try {
            try {
                int iFlacToPcm = new SilkCodec().flacToPcm(str, strM1020i);
                return iFlacToPcm != 0 ? iFlacToPcm : encodePcmToM4a(strM1020i, str2, getMetadataSampleRate(str, i9), 1, null);
            } catch (Exception e6) {
                e6.printStackTrace();
                AbstractC3199a.m6849v(strM1020i);
                return -1061;
            }
        } finally {
            AbstractC3199a.m6849v(strM1020i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AudioInfo getAudioInfo(String str) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(str);
            for (int i9 = 0; i9 < mediaExtractor.getTrackCount(); i9++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i9);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("audio/")) {
                    int integer = trackFormat.containsKey("sample-rate") ? trackFormat.getInteger("sample-rate") : DEFAULT_SAMPLE_RATE;
                    int integer2 = trackFormat.containsKey("channel-count") ? trackFormat.getInteger("channel-count") : 1;
                    mediaExtractor.release();
                    return new AudioInfo(integer, integer2);
                }
            }
            mediaExtractor.release();
            return new AudioInfo(DEFAULT_SAMPLE_RATE, 1);
        } catch (Exception unused) {
            mediaExtractor.release();
            return new AudioInfo(DEFAULT_SAMPLE_RATE, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long getDuration(String str) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Exception unused) {
                return 0L;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            mediaMetadataRetriever.setDataSource(str);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (strExtractMetadata != null) {
                long j3 = Long.parseLong(strExtractMetadata);
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused3) {
                }
                return j3;
            }
            mediaMetadataRetriever.release();
        } catch (Exception unused4) {
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 == null) {
                return 0L;
            }
            mediaMetadataRetriever2.release();
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getErrorMessage(int i9) {
        return i9 == 0 ? "成功" : (i9 < -801 || i9 > -802) ? i9 == -803 ? "AAC/M4A 解码错误 (格式不支持)" : (i9 < -901 || i9 > -902) ? (i9 < -911 || i9 > -912) ? (i9 < -1001 || i9 > -1009) ? (i9 < -1011 || i9 > -1012) ? (i9 < -1021 || i9 > -1022) ? (i9 < -1031 || i9 > -1039) ? (i9 < -1051 || i9 > -1059) ? (i9 < -1061 || i9 > -1069) ? i9 == -2000 ? "M4A/AAC 转 Silk 错误 (解码失败)" : AbstractC0921a.m2250m(i9, "错误码: ", " → 未知错误") : "M4A/AAC 转 M4A 错误" : "M4A/AAC 转 AAC 错误" : "M4A/AAC 转 Silk 错误" : "WAV 转 AAC/M4A 错误" : "MP3 转 AAC/M4A 错误" : "Silk 转 AAC/M4A 错误" : "M4A 编码错误 (Muxer 失败)" : "AAC 编码错误 (文件操作失败)" : "AAC/M4A 解码错误 (文件读取失败)";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int getMetadataSampleRate(String str, int i9) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Exception unused) {
            }
            try {
                mediaMetadataRetriever.setDataSource(str);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(38);
                if (strExtractMetadata != null && strExtractMetadata.length() > 0) {
                    int iValidSampleRate = validSampleRate(Integer.parseInt(strExtractMetadata), i9);
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused2) {
                    }
                    return iValidSampleRate;
                }
                mediaMetadataRetriever.release();
            } catch (Exception unused3) {
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                if (mediaMetadataRetriever2 != null) {
                    mediaMetadataRetriever2.release();
                }
                return validSampleRate(i9, DEFAULT_SAMPLE_RATE);
            } catch (Throwable th2) {
                th = th2;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                if (mediaMetadataRetriever2 != null) {
                    try {
                        mediaMetadataRetriever2.release();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th3) {
            th = th3;
        }
        return validSampleRate(i9, DEFAULT_SAMPLE_RATE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int getSampleRateIndex(int i9) {
        switch (i9) {
            case 8000:
                return 11;
            case 11025:
                return 10;
            case 12000:
                return 9;
            case 16000:
                return 8;
            case 22050:
                return 7;
            case C4143c.DEFAULT_HZ /* 24000 */:
                return 6;
            case 32000:
                return 5;
            case 48000:
                return 3;
            case 64000:
                return 2;
            case 88200:
                return 1;
            case 96000:
                return 0;
            default:
                return 4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int getWavSampleRate(String str, int i9) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(str, "r");
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (randomAccessFile.length() >= 28) {
                randomAccessFile.seek(24L);
                int iValidSampleRate = validSampleRate(randomAccessFile.readUnsignedByte() | (randomAccessFile.readUnsignedByte() << 8) | (randomAccessFile.readUnsignedByte() << 16) | (randomAccessFile.readUnsignedByte() << 24), i9);
                try {
                    randomAccessFile.close();
                } catch (Exception unused3) {
                }
                return iValidSampleRate;
            }
            randomAccessFile.close();
        } catch (Exception unused4) {
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            return validSampleRate(i9, DEFAULT_SAMPLE_RATE);
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
        return validSampleRate(i9, DEFAULT_SAMPLE_RATE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isOggOpusFile(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        boolean z9;
        boolean z10 = false;
        if (str != null && str.length() != 0) {
            RandomAccessFile randomAccessFile2 = null;
            try {
                randomAccessFile = new RandomAccessFile(str, "r");
            } catch (Exception unused) {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (randomAccessFile.length() < 36) {
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused2) {
                    }
                    return false;
                }
                byte[] bArr = new byte[27];
                randomAccessFile.readFully(bArr);
                if (bArr[0] == 79 && bArr[1] == 103 && bArr[2] == 103 && bArr[3] == 83 && bArr[4] == 0) {
                    int i9 = bArr[26] & 255;
                    if (i9 == 0) {
                        try {
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        return false;
                    }
                    byte[] bArr2 = new byte[i9];
                    randomAccessFile.readFully(bArr2);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i10 >= i9) {
                            z9 = false;
                            break;
                        }
                        int i12 = bArr2[i10] & 255;
                        i11 += i12;
                        if (i12 < 255) {
                            z9 = true;
                            break;
                        }
                        i10++;
                    }
                    if (z9 && i11 >= 8) {
                        byte[] bArr3 = new byte[8];
                        randomAccessFile.readFully(bArr3);
                        if (bArr3[0] == 79 && bArr3[1] == 112 && bArr3[2] == 117 && bArr3[3] == 115 && bArr3[4] == 72 && bArr3[5] == 101 && bArr3[6] == 97) {
                            if (bArr3[7] == 100) {
                                z10 = true;
                            }
                        }
                        try {
                            randomAccessFile.close();
                        } catch (Exception unused4) {
                        }
                        return z10;
                    }
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused5) {
                    }
                    return false;
                }
                try {
                    randomAccessFile.close();
                } catch (Exception unused6) {
                }
                return false;
            } catch (Exception unused7) {
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (Exception unused8) {
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (Exception unused9) {
                    }
                }
                throw th;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int m4aToAac(String str, String str2, int i9) {
        return mp4ToAac(str, str2, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int m4aToM4a(String str, String str2, int i9) {
        return mp4ToM4a(str, str2, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int m4aToPcm(String str, String str2) {
        return decodeAacFile(str, str2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int m4aToSilk(String str, String str2, SilkCodec silkCodec, int i9) {
        return mp4ToSilk(str, str2, silkCodec, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int mp3ToAac(String str, String str2, int i9) {
        String strM1020i = AbstractC0255e.m1020i(str2, ".temp.pcm");
        try {
            try {
                int iMp3ToPcm = new SilkCodec().mp3ToPcm(str, strM1020i);
                return iMp3ToPcm != 0 ? iMp3ToPcm : encodePcmToAac(strM1020i, str2, getMetadataSampleRate(str, i9), 1, null);
            } catch (Exception e6) {
                e6.printStackTrace();
                AbstractC3199a.m6849v(strM1020i);
                return -1011;
            }
        } finally {
            AbstractC3199a.m6849v(strM1020i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int mp3ToM4a(String str, String str2, int i9) {
        String strM1020i = AbstractC0255e.m1020i(str2, ".temp.pcm");
        try {
            try {
                int iMp3ToPcm = new SilkCodec().mp3ToPcm(str, strM1020i);
                return iMp3ToPcm != 0 ? iMp3ToPcm : encodePcmToM4a(strM1020i, str2, getMetadataSampleRate(str, i9), 1, null);
            } catch (Exception e6) {
                e6.printStackTrace();
                AbstractC3199a.m6849v(strM1020i);
                return -1012;
            }
        } finally {
            AbstractC3199a.m6849v(strM1020i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int mp4ToAac(String str, String str2, int i9) {
        String strM1020i = AbstractC0255e.m1020i(str2, ".temp.pcm");
        try {
            try {
                DecodeResult decodeResultDecodeAacFileWithInfo = decodeAacFileWithInfo(str, strM1020i, null);
                int i10 = decodeResultDecodeAacFileWithInfo.code;
                if (i10 != 0) {
                    return i10 - 2000;
                }
                return encodePcmToAac(strM1020i, str2, decodeResultDecodeAacFileWithInfo.audioInfo.sampleRate, 1, null);
            } catch (Exception e6) {
                e6.printStackTrace();
                AbstractC3199a.m6849v(strM1020i);
                return -1051;
            }
        } finally {
            AbstractC3199a.m6849v(strM1020i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int mp4ToM4a(String str, String str2, int i9) {
        String strM1020i = AbstractC0255e.m1020i(str2, ".temp.pcm");
        try {
            try {
                DecodeResult decodeResultDecodeAacFileWithInfo = decodeAacFileWithInfo(str, strM1020i, null);
                int i10 = decodeResultDecodeAacFileWithInfo.code;
                if (i10 != 0) {
                    return i10 - 2000;
                }
                return encodePcmToM4a(strM1020i, str2, decodeResultDecodeAacFileWithInfo.audioInfo.sampleRate, 1, null);
            } catch (Exception e6) {
                e6.printStackTrace();
                AbstractC3199a.m6849v(strM1020i);
                return -1061;
            }
        } finally {
            AbstractC3199a.m6849v(strM1020i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int mp4ToSilk(String str, String str2, SilkCodec silkCodec, int i9) {
        int i10;
        String str3;
        String strM1020i = AbstractC0255e.m1020i(str2, ".temp.pcm");
        String str4 = str2 + ".temp." + i9 + ".pcm";
        try {
            try {
                DecodeResult decodeResultDecodeAacFileWithInfo = decodeAacFileWithInfo(str, strM1020i, null);
                int i11 = decodeResultDecodeAacFileWithInfo.code;
                if (i11 != 0) {
                    int i12 = i11 - 2000;
                    new File(strM1020i).delete();
                    new File(str4).delete();
                    return i12;
                }
                int i13 = decodeResultDecodeAacFileWithInfo.audioInfo.sampleRate;
                if (i13 == i9) {
                    i10 = i13;
                    str3 = strM1020i;
                } else {
                    if (!resampleMonoPcm16(strM1020i, str4, i13, i9)) {
                        new File(strM1020i).delete();
                        new File(str4).delete();
                        return -701;
                    }
                    i10 = i9;
                    str3 = str4;
                }
                int iPcmToSilk = silkCodec.pcmToSilk(str3, str2, i9, i10, 1);
                new File(strM1020i).delete();
                new File(str4).delete();
                return iPcmToSilk;
            } catch (Exception e6) {
                e6.printStackTrace();
                new File(strM1020i).delete();
                new File(str4).delete();
                return -1031;
            }
        } catch (Throwable th2) {
            new File(strM1020i).delete();
            new File(str4).delete();
            throw th2;
        }
        new File(strM1020i).delete();
        new File(str4).delete();
        throw th2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int oggToAac(String str, String str2, int i9) {
        String strM1020i = AbstractC0255e.m1020i(str2, ".temp.pcm");
        AbstractC3199a.m6849v(str2);
        try {
            try {
                DecodeResult decodeResultDecodeOggToPcmWithInfo = decodeOggToPcmWithInfo(str, strM1020i, new SilkCodec(), i9);
                int i10 = decodeResultDecodeOggToPcmWithInfo.code;
                if (i10 != 0) {
                    return i10;
                }
                int iEncodePcmToAac = encodePcmToAac(strM1020i, str2, decodeResultDecodeOggToPcmWithInfo.audioInfo.sampleRate, 1, null);
                if (iEncodePcmToAac != 0) {
                    new File(str2).delete();
                }
                return iEncodePcmToAac;
            } catch (Exception e6) {
                e6.printStackTrace();
                new File(str2).delete();
                AbstractC3199a.m6849v(strM1020i);
                return -1051;
            }
        } finally {
            AbstractC3199a.m6849v(strM1020i);
        }
        AbstractC3199a.m6849v(strM1020i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int oggToM4a(String str, String str2, int i9) {
        String strM1020i = AbstractC0255e.m1020i(str2, ".temp.pcm");
        AbstractC3199a.m6849v(str2);
        try {
            try {
                DecodeResult decodeResultDecodeOggToPcmWithInfo = decodeOggToPcmWithInfo(str, strM1020i, new SilkCodec(), i9);
                int i10 = decodeResultDecodeOggToPcmWithInfo.code;
                if (i10 != 0) {
                    return i10;
                }
                int iEncodePcmToM4a = encodePcmToM4a(strM1020i, str2, decodeResultDecodeOggToPcmWithInfo.audioInfo.sampleRate, 1, null);
                if (iEncodePcmToM4a != 0) {
                    new File(str2).delete();
                }
                return iEncodePcmToM4a;
            } catch (Exception e6) {
                e6.printStackTrace();
                new File(str2).delete();
                AbstractC3199a.m6849v(strM1020i);
                return -1061;
            }
        } finally {
            AbstractC3199a.m6849v(strM1020i);
        }
        AbstractC3199a.m6849v(strM1020i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int oggToPcmCompat(String str, String str2, SilkCodec silkCodec) {
        return decodeOggToPcmWithInfo(str, str2, silkCodec, DEFAULT_SAMPLE_RATE).code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int oggToSilkCompat(String str, String str2, SilkCodec silkCodec, int i9) {
        if (!isOggOpusFile(str)) {
            return silkCodec.oggToSilk(str, str2, i9);
        }
        new File(str2).delete();
        int iMp4ToSilk = mp4ToSilk(str, str2, silkCodec, i9);
        if (iMp4ToSilk == 0) {
            return 0;
        }
        AbstractC3199a.m6849v(str2);
        if (iMp4ToSilk < -2803 || iMp4ToSilk > -2801) {
            return iMp4ToSilk;
        }
        return -401;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int pcmToAac(String str, String str2, int i9, int i10) {
        return encodePcmToAac(str, str2, i9, i10, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int pcmToM4a(String str, String str2, int i9, int i10) {
        return encodePcmToM4a(str, str2, i9, i10, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int readPcm16(byte[] bArr, int i9) {
        int i10 = i9 * 2;
        return (short) ((bArr[i10 + 1] << 8) | (bArr[i10] & 255));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean resampleMonoPcm16(String str, String str2, int i9, int i10) throws IOException {
        if (i9 > 0 && i10 > 0) {
            File file = new File(str);
            long length = file.length();
            if (length >= 2 && length <= 2147483646) {
                int i11 = (int) (length & (-2));
                byte[] bArr = new byte[i11];
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.readFully(bArr);
                    randomAccessFile.close();
                    int i12 = i11 / 2;
                    double d10 = i10;
                    double d11 = i9;
                    int iMax = Math.max(1, (int) Math.round((((double) i12) * d10) / d11));
                    byte[] bArr2 = new byte[iMax * 2];
                    double d12 = d11 / d10;
                    for (int i13 = 0; i13 < iMax; i13++) {
                        double d13 = ((double) i13) * d12;
                        int i14 = (int) d13;
                        int i15 = i12 - 1;
                        int pcm16 = readPcm16(bArr, Math.min(i14, i15));
                        int iMax2 = Math.max(-32768, Math.min(32767, (int) Math.round((((double) (readPcm16(bArr, Math.min(i14 + 1, i15)) - pcm16)) * (d13 - ((double) i14))) + ((double) pcm16))));
                        int i16 = i13 * 2;
                        bArr2[i16] = (byte) (iMax2 & 255);
                        bArr2[i16 + 1] = (byte) ((iMax2 >> 8) & 255);
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(str2);
                    try {
                        fileOutputStream.write(bArr2);
                        return true;
                    } finally {
                        fileOutputStream.close();
                    }
                } catch (Throwable th2) {
                    randomAccessFile.close();
                    throw th2;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int silkToAac(String str, String str2, SilkCodec silkCodec, int i9) {
        try {
            String str3 = str2 + ".temp.pcm";
            int iSilkToPcm = silkCodec.silkToPcm(str, str3, i9);
            if (iSilkToPcm != 0) {
                return iSilkToPcm;
            }
            int iEncodePcmToAac = encodePcmToAac(str3, str2, i9, 1, null);
            new File(str3).delete();
            return iEncodePcmToAac;
        } catch (Exception e6) {
            e6.printStackTrace();
            return -1001;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int silkToM4a(String str, String str2, SilkCodec silkCodec, int i9) {
        try {
            String str3 = str2 + ".temp.pcm";
            int iSilkToPcm = silkCodec.silkToPcm(str, str3, i9);
            if (iSilkToPcm != 0) {
                return iSilkToPcm;
            }
            int iEncodePcmToM4a = encodePcmToM4a(str3, str2, i9, 1, null);
            new File(str3).delete();
            return iEncodePcmToM4a;
        } catch (Exception e6) {
            e6.printStackTrace();
            return -1001;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int validSampleRate(int i9, int i10) {
        switch (i9) {
            case 8000:
            case 11025:
            case 12000:
            case 16000:
            case 22050:
            case C4143c.DEFAULT_HZ /* 24000 */:
            case 32000:
            case DEFAULT_SAMPLE_RATE /* 44100 */:
            case 48000:
            case 64000:
            case 88200:
            case 96000:
                return i9;
            default:
                return i10 > 0 ? i10 : DEFAULT_SAMPLE_RATE;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int wavToAac(String str, String str2, int i9) {
        String strM1020i = AbstractC0255e.m1020i(str2, ".temp.pcm");
        try {
            try {
                int iWavToPcm = new SilkCodec().wavToPcm(str, strM1020i);
                return iWavToPcm != 0 ? iWavToPcm : encodePcmToAac(strM1020i, str2, getWavSampleRate(str, i9), 1, null);
            } catch (Exception e6) {
                e6.printStackTrace();
                AbstractC3199a.m6849v(strM1020i);
                return -1021;
            }
        } finally {
            AbstractC3199a.m6849v(strM1020i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int wavToM4a(String str, String str2, int i9) {
        String strM1020i = AbstractC0255e.m1020i(str2, ".temp.pcm");
        try {
            try {
                int iWavToPcm = new SilkCodec().wavToPcm(str, strM1020i);
                return iWavToPcm != 0 ? iWavToPcm : encodePcmToM4a(strM1020i, str2, getWavSampleRate(str, i9), 1, null);
            } catch (Exception e6) {
                e6.printStackTrace();
                AbstractC3199a.m6849v(strM1020i);
                return -1022;
            }
        } finally {
            AbstractC3199a.m6849v(strM1020i);
        }
    }
}
