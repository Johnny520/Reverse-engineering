package com.bumptech.glide.load;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ImageHeaderParserUtils {
    private static final int MARK_READ_LIMIT = 5242880;

    public interface OrientationReader {
        int getOrientationAndRewind(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public interface TypeReader {
        ImageHeaderParser.ImageType getTypeAndRewind(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private ImageHeaderParserUtils() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getOrientation(@InterfaceC6391 List<ImageHeaderParser> list, @InterfaceC6490 final ByteBuffer byteBuffer, @InterfaceC6391 final ArrayPool arrayPool) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return getOrientationInternal(list, new OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.4
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public int getOrientationAndRewind(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.getOrientation(byteBuffer, arrayPool);
                } finally {
                    ByteBufferUtil.rewind(byteBuffer);
                }
            }
        });
    }

    private static int getOrientationInternal(@InterfaceC6391 List<ImageHeaderParser> list, OrientationReader orientationReader) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int orientationAndRewind = orientationReader.getOrientationAndRewind(list.get(i));
            if (orientationAndRewind != -1) {
                return orientationAndRewind;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static ImageHeaderParser.ImageType getType(@InterfaceC6391 List<ImageHeaderParser> list, @InterfaceC6490 final InputStream inputStream, @InterfaceC6391 ArrayPool arrayPool) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(MARK_READ_LIMIT);
        return getTypeInternal(list, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.1
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public ImageHeaderParser.ImageType getTypeAndRewind(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.getType(inputStream);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    @InterfaceC6391
    private static ImageHeaderParser.ImageType getTypeInternal(@InterfaceC6391 List<ImageHeaderParser> list, TypeReader typeReader) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType typeAndRewind = typeReader.getTypeAndRewind(list.get(i));
            if (typeAndRewind != ImageHeaderParser.ImageType.UNKNOWN) {
                return typeAndRewind;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static int getOrientation(@InterfaceC6391 List<ImageHeaderParser> list, @InterfaceC6490 final InputStream inputStream, @InterfaceC6391 final ArrayPool arrayPool) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(MARK_READ_LIMIT);
        return getOrientationInternal(list, new OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.5
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public int getOrientationAndRewind(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.getOrientation(inputStream, arrayPool);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    @InterfaceC7113(21)
    public static int getOrientation(@InterfaceC6391 List<ImageHeaderParser> list, @InterfaceC6391 final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @InterfaceC6391 final ArrayPool arrayPool) throws IOException {
        return getOrientationInternal(list, new OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.6
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public int getOrientationAndRewind(ImageHeaderParser imageHeaderParser) throws Throwable {
                RecyclableBufferedInputStream recyclableBufferedInputStream = null;
                try {
                    RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.rewindAndGet().getFileDescriptor()), arrayPool);
                    try {
                        int orientation = imageHeaderParser.getOrientation(recyclableBufferedInputStream2, arrayPool);
                        recyclableBufferedInputStream2.release();
                        parcelFileDescriptorRewinder.rewindAndGet();
                        return orientation;
                    } catch (Throwable th) {
                        th = th;
                        recyclableBufferedInputStream = recyclableBufferedInputStream2;
                        if (recyclableBufferedInputStream != null) {
                            recyclableBufferedInputStream.release();
                        }
                        parcelFileDescriptorRewinder.rewindAndGet();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        });
    }

    @InterfaceC6391
    public static ImageHeaderParser.ImageType getType(@InterfaceC6391 List<ImageHeaderParser> list, @InterfaceC6490 final ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return getTypeInternal(list, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.2
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public ImageHeaderParser.ImageType getTypeAndRewind(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.getType(byteBuffer);
                } finally {
                    ByteBufferUtil.rewind(byteBuffer);
                }
            }
        });
    }

    @InterfaceC6391
    @InterfaceC7113(21)
    public static ImageHeaderParser.ImageType getType(@InterfaceC6391 List<ImageHeaderParser> list, @InterfaceC6391 final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @InterfaceC6391 final ArrayPool arrayPool) throws IOException {
        return getTypeInternal(list, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.3
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public ImageHeaderParser.ImageType getTypeAndRewind(ImageHeaderParser imageHeaderParser) throws Throwable {
                RecyclableBufferedInputStream recyclableBufferedInputStream = null;
                try {
                    RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.rewindAndGet().getFileDescriptor()), arrayPool);
                    try {
                        ImageHeaderParser.ImageType type = imageHeaderParser.getType(recyclableBufferedInputStream2);
                        recyclableBufferedInputStream2.release();
                        parcelFileDescriptorRewinder.rewindAndGet();
                        return type;
                    } catch (Throwable th) {
                        th = th;
                        recyclableBufferedInputStream = recyclableBufferedInputStream2;
                        if (recyclableBufferedInputStream != null) {
                            recyclableBufferedInputStream.release();
                        }
                        parcelFileDescriptorRewinder.rewindAndGet();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        });
    }
}
