package com.bumptech.glide.integration.gifencoder;

import Yue.InterfaceC6391;
import Yue.InterfaceC8392;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.gifencoder.AnimatedGifEncoder;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.gif.GifBitmapProvider;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.LogTime;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class ReEncodingGifResourceEncoder implements ResourceEncoder<GifDrawable> {
    private static final String TAG = "GifEncoder";
    private final BitmapPool bitmapPool;
    private final Context context;
    private final Factory factory;
    private final GifDecoder.BitmapProvider provider;
    private static final String KEY_ENCODE_TRANSFORMATION = "com.bumptech.glide.load.resource.gif.GifResourceEncoder.EncodeTransformation";
    public static final Option<Boolean> ENCODE_TRANSFORMATION = Option.disk(KEY_ENCODE_TRANSFORMATION, Boolean.FALSE, new Option.CacheKeyUpdater<Boolean>() { // from class: com.bumptech.glide.integration.gifencoder.ReEncodingGifResourceEncoder.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: update([BLjava/lang/Object;Ljava/security/MessageDigest;)V */
        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public void update(@InterfaceC6391 byte[] bArr, @InterfaceC6391 Boolean bool, @InterfaceC6391 MessageDigest messageDigest) {
            if (bool.booleanValue()) {
                messageDigest.update(bArr);
            }
        }
    });
    private static final Factory FACTORY = new Factory();

    @InterfaceC8392
    public static class Factory {
        public GifDecoder buildDecoder(GifDecoder.BitmapProvider bitmapProvider) {
            return new StandardGifDecoder(bitmapProvider);
        }

        public AnimatedGifEncoder buildEncoder() {
            return new AnimatedGifEncoder();
        }

        @InterfaceC6391
        public Resource<Bitmap> buildFrameResource(@InterfaceC6391 Bitmap bitmap, @InterfaceC6391 BitmapPool bitmapPool) {
            return new BitmapResource(bitmap, bitmapPool);
        }

        public GifHeaderParser buildParser() {
            return new GifHeaderParser();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ReEncodingGifResourceEncoder(@InterfaceC6391 Context context, @InterfaceC6391 BitmapPool bitmapPool) {
        this(context, bitmapPool, FACTORY);
    }

    private GifDecoder decodeHeaders(ByteBuffer byteBuffer) {
        GifHeaderParser gifHeaderParserBuildParser = this.factory.buildParser();
        gifHeaderParserBuildParser.setData(byteBuffer);
        GifHeader header = gifHeaderParserBuildParser.parseHeader();
        GifDecoder gifDecoderBuildDecoder = this.factory.buildDecoder(this.provider);
        gifDecoderBuildDecoder.setData(header, byteBuffer);
        gifDecoderBuildDecoder.advance();
        return gifDecoderBuildDecoder;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean encodeTransformedToFile(GifDrawable gifDrawable, File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        long logTime = LogTime.getLogTime();
        BufferedOutputStream bufferedOutputStream2 = null;
        boolean zEncodeTransformedToStream = false;
        try {
            try {
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                } catch (IOException unused) {
                }
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            zEncodeTransformedToStream = encodeTransformedToStream(gifDrawable, bufferedOutputStream);
            bufferedOutputStream.close();
            bufferedOutputStream.close();
        } catch (IOException e2) {
            e = e2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Failed to encode GIF", e);
            }
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            if (Log.isLoggable(TAG, 2)) {
            }
            return zEncodeTransformedToStream;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "Re-encoded GIF with " + gifDrawable.getFrameCount() + " frames and " + gifDrawable.getBuffer().limit() + " bytes in " + LogTime.getElapsedMillis(logTime) + " ms");
        }
        return zEncodeTransformedToStream;
    }

    private boolean encodeTransformedToStream(GifDrawable gifDrawable, OutputStream outputStream) {
        Transformation<Bitmap> frameTransformation = gifDrawable.getFrameTransformation();
        GifDecoder gifDecoderDecodeHeaders = decodeHeaders(gifDrawable.getBuffer());
        AnimatedGifEncoder animatedGifEncoderBuildEncoder = this.factory.buildEncoder();
        if (!animatedGifEncoderBuildEncoder.start(outputStream)) {
            return false;
        }
        for (int i = 0; i < gifDecoderDecodeHeaders.getFrameCount(); i++) {
            Resource<Bitmap> transformedFrame = getTransformedFrame(gifDecoderDecodeHeaders.getNextFrame(), frameTransformation, gifDrawable);
            try {
                if (!animatedGifEncoderBuildEncoder.addFrame(transformedFrame.get())) {
                    return false;
                }
                animatedGifEncoderBuildEncoder.setDelay(gifDecoderDecodeHeaders.getDelay(gifDecoderDecodeHeaders.getCurrentFrameIndex()));
                gifDecoderDecodeHeaders.advance();
                transformedFrame.recycle();
            } finally {
                transformedFrame.recycle();
            }
        }
        return animatedGifEncoderBuildEncoder.finish();
    }

    private Resource<Bitmap> getTransformedFrame(Bitmap bitmap, Transformation<Bitmap> transformation, GifDrawable gifDrawable) {
        Resource<Bitmap> resourceBuildFrameResource = this.factory.buildFrameResource(bitmap, this.bitmapPool);
        Resource<Bitmap> resourceTransform = transformation.transform(this.context, resourceBuildFrameResource, gifDrawable.getIntrinsicWidth(), gifDrawable.getIntrinsicHeight());
        if (!resourceBuildFrameResource.equals(resourceTransform)) {
            resourceBuildFrameResource.recycle();
        }
        return resourceTransform;
    }

    private boolean writeDataDirect(ByteBuffer byteBuffer, File file) throws Throwable {
        try {
            ByteBufferUtil.toFile(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable(TAG, 5)) {
                return false;
            }
            Log.w(TAG, "Failed to write GIF data", e);
            return false;
        }
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    @InterfaceC6391
    public EncodeStrategy getEncodeStrategy(@InterfaceC6391 Options options) {
        Boolean bool = (Boolean) options.get(ENCODE_TRANSFORMATION);
        return (bool == null || !bool.booleanValue()) ? EncodeStrategy.SOURCE : EncodeStrategy.TRANSFORMED;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC8392
    public ReEncodingGifResourceEncoder(Context context, BitmapPool bitmapPool, Factory factory) {
        this.context = context;
        this.bitmapPool = bitmapPool;
        this.provider = new GifBitmapProvider(bitmapPool);
        this.factory = factory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/io/File;Lcom/bumptech/glide/load/Options;)Z */
    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(@InterfaceC6391 Resource<GifDrawable> resource, @InterfaceC6391 File file, @InterfaceC6391 Options options) {
        GifDrawable gifDrawable = resource.get();
        return (((gifDrawable.getFrameTransformation() instanceof UnitTransformation) ^ true) && ((Boolean) options.get(ENCODE_TRANSFORMATION)).booleanValue()) ? encodeTransformedToFile(gifDrawable, file) : writeDataDirect(gifDrawable.getBuffer(), file);
    }
}
