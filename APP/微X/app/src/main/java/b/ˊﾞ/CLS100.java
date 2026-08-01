// Decompiled by JEB v5.42.0.202606242140

package b.ˊﾞ;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ﾞᐧ.CLS557;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.ByteBuffer;

public final class CLS100 {
    public int FLD502;
    public int FLD503;

    public CLS100() {
        this.FLD502 = 0;
        this.FLD503 = 0;
    }

    public final CLS557 MTH1941(long v, long v1, String s) {
        byte[] arr_b;
        int v14;
        ByteBuffer byteBuffer1;
        int v13;
        ByteBuffer[] arr_byteBuffer3;
        int v12;
        int v11;
        long v10;
        ByteBuffer byteBuffer0;
        int v8;
        MediaCodec mediaCodec0;
        boolean z;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        long v2 = 1000L * v1;
        MediaExtractor mediaExtractor0 = new MediaExtractor();
        try {
            mediaExtractor0.setDataSource(s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            try {
                mediaExtractor0.setDataSource(new FileInputStream(s).getFD());
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
                CLS27.MTH906("Wrong path setting for decoding audio files");
            }
        }
        MediaFormat mediaFormat0 = mediaExtractor0.getTrackFormat(0);
        this.FLD502 = mediaFormat0.containsKey("sample-rate") ? mediaFormat0.getInteger("sample-rate") : 44100;
        this.FLD503 = mediaFormat0.containsKey("channel-count") ? mediaFormat0.getInteger("channel-count") : 1;
        long v3 = mediaFormat0.containsKey("durationUs") ? mediaFormat0.getLong("durationUs") : 0L;
        String s1 = mediaFormat0.containsKey("mime") ? mediaFormat0.getString("mime") : "";
        if(TextUtils.isEmpty(s1)) {
            CLS27.MTH906(("The decoded file is not an audio file mime:" + s1));
            z = false;
        }
        else {
            String s2 = s1;
            if(s2.startsWith("audio")) {
                if(s2.equals("audio/ffmpeg")) {
                    mediaFormat0.setString("mime", "audio/mpeg");
                    s2 = "audio/mpeg";
                }
                if(v3 <= 0L) {
                    CLS27.MTH906(("audio file duration" + v3));
                    z = false;
                }
                else {
                    long v4 = Math.max(v * 1000L, 0L);
                    if(v2 <= 0L) {
                        v2 = v3;
                    }
                    long v5 = Math.min(v2, v3);
                    if(v4 < v5) {
                        try {
                            mediaCodec0 = MediaCodec.createDecoderByType(s2);
                            mediaCodec0.configure(mediaFormat0, null, null, 0);
                        }
                        catch(Throwable unused_ex) {
                            CLS27.MTH906("Decoder configure error");
                            z = false;
                            goto label_142;
                        }
                        mediaCodec0.start();
                        ByteBuffer[] arr_byteBuffer = mediaCodec0.getInputBuffers();
                        ByteBuffer[] arr_byteBuffer1 = mediaCodec0.getOutputBuffers();
                        mediaExtractor0.selectTrack(0);
                        MediaCodec.BufferInfo mediaCodec$BufferInfo0 = new MediaCodec.BufferInfo();
                        BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
                        long v6 = 0L;
                        int v7 = 0;
                        ByteBuffer[] arr_byteBuffer2 = arr_byteBuffer1;
                        boolean z1 = false;
                        while(true) {
                            if(!z1) {
                                if(v7 != 0) {
                                    break;
                                }
                                try {
                                    v8 = mediaCodec0.dequeueInputBuffer(100L);
                                    if(v8 >= 0) {
                                        byteBuffer0 = arr_byteBuffer[v8];
                                        goto label_53;
                                    }
                                    goto label_72;
                                }
                                catch(Throwable throwable2) {
                                    arr_byteBuffer3 = arr_byteBuffer2;
                                    v10 = v6;
                                    z1 = false;
                                    CLS27.MTH893(throwable2);
                                    arr_byteBuffer2 = arr_byteBuffer3;
                                    v6 = v10;
                                    continue;
                                }
                                try {
                                label_53:
                                    int v9 = mediaExtractor0.readSampleData(byteBuffer0, 0);
                                    if(v9 < 0) {
                                        v10 = v6;
                                        v11 = 1;
                                        v12 = 0;
                                    }
                                    else {
                                        v12 = v9;
                                        v10 = mediaExtractor0.getSampleTime();
                                        v11 = 0;
                                    }
                                }
                                catch(Throwable throwable2) {
                                    goto label_119;
                                }
                                try {
                                    mediaCodec0.queueInputBuffer(v8, 0, v12, v10, (v11 == 0 ? 0 : 4));
                                    if(v11 == 0) {
                                        mediaExtractor0.advance();
                                    }
                                }
                                catch(Throwable throwable2) {
                                    arr_byteBuffer3 = arr_byteBuffer2;
                                    v7 = v11;
                                    CLS27.MTH893(throwable2);
                                    arr_byteBuffer2 = arr_byteBuffer3;
                                    v6 = v10;
                                    continue;
                                }
                                v7 = v11;
                                v6 = v10;
                                try {
                                label_72:
                                    v13 = mediaCodec0.dequeueOutputBuffer(mediaCodec$BufferInfo0, 100L);
                                    if(v13 >= 0) {
                                        byteBuffer1 = arr_byteBuffer2[v13];
                                        v14 = mediaCodec$BufferInfo0.size;
                                        arr_byteBuffer3 = arr_byteBuffer2;
                                        goto label_81;
                                    }
                                    else {
                                        goto label_107;
                                    }
                                    goto label_125;
                                }
                                catch(Throwable throwable2) {
                                    arr_byteBuffer3 = arr_byteBuffer2;
                                    v10 = v6;
                                    z1 = false;
                                    CLS27.MTH893(throwable2);
                                    arr_byteBuffer2 = arr_byteBuffer3;
                                    v6 = v10;
                                    continue;
                                }
                                try {
                                label_81:
                                    arr_b = new byte[v14];
                                    byteBuffer1.get(arr_b);
                                    byteBuffer1.clear();
                                    mediaCodec0.releaseOutputBuffer(v13, false);
                                }
                                catch(Throwable throwable2) {
                                    v10 = v6;
                                    z1 = false;
                                    CLS27.MTH893(throwable2);
                                    arr_byteBuffer2 = arr_byteBuffer3;
                                    v6 = v10;
                                    continue;
                                }
                                if((mediaCodec$BufferInfo0.flags & 4) != 0) {
                                    z1 = true;
                                }
                                if(v14 > 0) {
                                    if(v6 >= v4) {
                                        try {
                                            try {
                                                bufferedOutputStream0.write(arr_b);
                                            }
                                            catch(Exception exception0) {
                                                CLS27.MTH906(("The output decompressed audio data is abnormal" + exception0));
                                            }
                                        }
                                        catch(Throwable throwable2) {
                                            v10 = v6;
                                            CLS27.MTH893(throwable2);
                                            arr_byteBuffer2 = arr_byteBuffer3;
                                            v6 = v10;
                                            continue;
                                        }
                                    }
                                    else {
                                        arr_byteBuffer2 = arr_byteBuffer3;
                                        continue;
                                    }
                                }
                                if(v6 <= v5) {
                                    arr_byteBuffer2 = arr_byteBuffer3;
                                    continue;
                                    try {
                                    label_107:
                                        switch(v13) {
                                            case -3: {
                                                arr_byteBuffer2 = mediaCodec0.getOutputBuffers();
                                                continue;
                                            }
                                            case -2: {
                                                MediaFormat mediaFormat1 = mediaCodec0.getOutputFormat();
                                                if(mediaFormat1.containsKey("sample-rate")) {
                                                    mediaFormat1.getInteger("sample-rate");
                                                }
                                                if(!mediaFormat1.containsKey("channel-count")) {
                                                    continue;
                                                }
                                                mediaFormat1.getInteger("channel-count");
                                                continue;
                                            }
                                            default: {
                                                continue;
                                            }
                                        }
                                    }
                                    catch(Throwable throwable2) {
                                    label_119:
                                        arr_byteBuffer3 = arr_byteBuffer2;
                                        v10 = v6;
                                    }
                                    CLS27.MTH893(throwable2);
                                    arr_byteBuffer2 = arr_byteBuffer3;
                                    v6 = v10;
                                    continue;
                                }
                            }
                            try {
                            label_125:
                                bufferedOutputStream0.close();
                            }
                            catch(Throwable throwable3) {
                                CLS27.MTH893(throwable3);
                            }
                            mediaCodec0.stop();
                            mediaCodec0.release();
                            mediaExtractor0.release();
                            break;
                        }
                        z = true;
                    }
                    else {
                        z = false;
                    }
                }
            }
            else {
                CLS27.MTH906(("The decoded file is not an audio file mime:" + s2));
                z = false;
            }
        }
    label_142:
        if(z) {
            ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
            byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
            int v15 = this.FLD502;
            int v16 = this.FLD503;
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b1);
            byte[] arr_b2 = new byte[0x400];
            try {
                try {
                    CLS100.MTH1942(byteArrayOutputStream1, ((long)arr_b1.length), 36L + ((long)arr_b1.length), v15, v16, ((long)v15) * ((long)v16) * 16L / 8L);
                    int v17;
                    while((v17 = byteArrayInputStream0.read(arr_b2)) > 0) {
                        byteArrayOutputStream1.write(arr_b2, 0, v17);
                    }
                }
                catch(Exception exception1) {
                    exception1.printStackTrace();
                }
            }
            catch(Throwable throwable4) {
                try {
                    byteArrayInputStream0.close();
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                try {
                    byteArrayOutputStream1.close();
                }
                catch(Throwable throwable6) {
                    CLS27.MTH893(throwable6);
                }
                throw throwable4;
            }
            try {
                byteArrayInputStream0.close();
            }
            catch(Throwable throwable7) {
                CLS27.MTH893(throwable7);
            }
            try {
                byteArrayOutputStream1.close();
                return new CLS557(byteArrayOutputStream1.toByteArray());
            }
            catch(Throwable throwable8) {
                CLS27.MTH893(throwable8);
                return new CLS557(byteArrayOutputStream1.toByteArray());
            }
        }
        return null;
    }

    public static void MTH1942(ByteArrayOutputStream byteArrayOutputStream0, long v, long v1, int v2, int v3, long v4) {
        byteArrayOutputStream0.write(new byte[]{82, 73, 70, 70, ((byte)(((int)(v1 & 0xFFL)))), ((byte)(((int)(v1 >> 8 & 0xFFL)))), ((byte)(((int)(v1 >> 16 & 0xFFL)))), ((byte)(((int)(v1 >> 24 & 0xFFL)))), 87, 65, 86, 69, 102, 109, 0x74, 0x20, 16, 0, 0, 0, 1, 0, ((byte)v3), 0, ((byte)(v2 & 0xFF)), ((byte)(v2 >> 8 & 0xFF)), ((byte)(v2 >> 16 & 0xFF)), ((byte)(v2 >> 24 & 0xFF)), ((byte)(((int)(v4 & 0xFFL)))), ((byte)(((int)(v4 >> 8 & 0xFFL)))), ((byte)(((int)(v4 >> 16 & 0xFFL)))), ((byte)(((int)(v4 >> 24 & 0xFFL)))), ((byte)(v3 * 16 / 8)), 0, 16, 0, 100, 97, 0x74, 97, ((byte)(((int)(v & 0xFFL)))), ((byte)(((int)(v >> 8 & 0xFFL)))), ((byte)(((int)(v >> 16 & 0xFFL)))), ((byte)(((int)(v >> 24 & 0xFFL))))}, 0, 44);
    }
}

