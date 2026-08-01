// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.HashMap;

public final class CLS406 {
    public static void MTH5919(String s, String s1, int v, int v1) {
        MediaExtractor mediaExtractor0 = new MediaExtractor();
        mediaExtractor0.setDataSource(s);
        int v2 = mediaExtractor0.getTrackCount();
        MediaMuxer mediaMuxer0 = new MediaMuxer(s1, 0);
        HashMap hashMap0 = new HashMap(v2);
        int v3 = -1;
        for(int v4 = 0; v4 < v2; ++v4) {
            MediaFormat mediaFormat0 = mediaExtractor0.getTrackFormat(v4);
            if(mediaFormat0.getString("mime").startsWith("audio/")) {
                mediaExtractor0.selectTrack(v4);
                hashMap0.put(v4, mediaMuxer0.addTrack(mediaFormat0));
                if(mediaFormat0.containsKey("max-input-size")) {
                    v3 = Math.max(mediaFormat0.getInteger("max-input-size"), v3);
                }
            }
        }
        if(v3 < 0) {
            v3 = 0x100000;
        }
        MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
        mediaMetadataRetriever0.setDataSource(s);
        String s2 = mediaMetadataRetriever0.extractMetadata(24);
        if(s2 != null) {
            int v5 = Integer.parseInt(s2);
            if(v5 >= 0) {
                mediaMuxer0.setOrientationHint(v5);
            }
        }
        if(v > 0) {
            mediaExtractor0.seekTo(((long)v) * 1000L, 2);
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(v3);
        MediaCodec.BufferInfo mediaCodec$BufferInfo0 = new MediaCodec.BufferInfo();
        mediaMuxer0.start();
        while(true) {
            mediaCodec$BufferInfo0.offset = 0;
            int v6 = mediaExtractor0.readSampleData(byteBuffer0, 0);
            mediaCodec$BufferInfo0.size = v6;
            if(v6 < 0) {
                mediaCodec$BufferInfo0.size = 0;
                break;
            }
            long v7 = mediaExtractor0.getSampleTime();
            mediaCodec$BufferInfo0.presentationTimeUs = v7;
            if(v1 > 0 && v7 > ((long)v1) * 1000L) {
                break;
            }
            mediaCodec$BufferInfo0.flags = mediaExtractor0.getSampleFlags();
            mediaMuxer0.writeSampleData(((int)(((Integer)hashMap0.get(mediaExtractor0.getSampleTrackIndex())))), byteBuffer0, mediaCodec$BufferInfo0);
            mediaExtractor0.advance();
        }
        mediaMuxer0.stop();
        mediaMuxer0.release();
    }
}

