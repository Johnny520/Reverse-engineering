package com.bumptech.glide.load.resource.bitmap;

import Yue.C4750;
import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(27)
public final class ExifInterfaceImageHeaderParser implements ImageHeaderParser {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@InterfaceC6391 InputStream inputStream, @InterfaceC6391 ArrayPool arrayPool) throws IOException {
        int iM14330 = new C4750(inputStream).m14330(C4750.f10215, 1);
        if (iM14330 == 0) {
            return -1;
        }
        return iM14330;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.ImageHeaderParser
    @InterfaceC6391
    public ImageHeaderParser.ImageType getType(@InterfaceC6391 InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bumptech.glide.load.ImageHeaderParser
    @InterfaceC6391
    public ImageHeaderParser.ImageType getType(@InterfaceC6391 ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@InterfaceC6391 ByteBuffer byteBuffer, @InterfaceC6391 ArrayPool arrayPool) throws IOException {
        return getOrientation(ByteBufferUtil.toStream(byteBuffer), arrayPool);
    }
}
