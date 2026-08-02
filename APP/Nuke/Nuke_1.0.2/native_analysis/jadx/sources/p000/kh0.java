package p000;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kh0 {

    /* JADX INFO: renamed from: A */
    public static final byte[] f5535A;

    /* JADX INFO: renamed from: B */
    public static final String[] f5536B;

    /* JADX INFO: renamed from: C */
    public static final int[] f5537C;

    /* JADX INFO: renamed from: D */
    public static final byte[] f5538D;

    /* JADX INFO: renamed from: E */
    public static final hh0 f5539E;

    /* JADX INFO: renamed from: F */
    public static final hh0[][] f5540F;

    /* JADX INFO: renamed from: G */
    public static final hh0[] f5541G;

    /* JADX INFO: renamed from: H */
    public static final HashMap[] f5542H;

    /* JADX INFO: renamed from: I */
    public static final HashMap[] f5543I;

    /* JADX INFO: renamed from: J */
    public static final HashSet f5544J;

    /* JADX INFO: renamed from: K */
    public static final HashMap f5545K;

    /* JADX INFO: renamed from: L */
    public static final Charset f5546L;

    /* JADX INFO: renamed from: M */
    public static final byte[] f5547M;

    /* JADX INFO: renamed from: N */
    public static final byte[] f5548N;

    /* JADX INFO: renamed from: l */
    public static final boolean f5549l = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: m */
    public static final int[] f5550m;

    /* JADX INFO: renamed from: n */
    public static final int[] f5551n;

    /* JADX INFO: renamed from: o */
    public static final byte[] f5552o;

    /* JADX INFO: renamed from: p */
    public static final byte[] f5553p;

    /* JADX INFO: renamed from: q */
    public static final byte[] f5554q;

    /* JADX INFO: renamed from: r */
    public static final byte[] f5555r;

    /* JADX INFO: renamed from: s */
    public static final byte[] f5556s;

    /* JADX INFO: renamed from: t */
    public static final byte[] f5557t;

    /* JADX INFO: renamed from: u */
    public static final byte[] f5558u;

    /* JADX INFO: renamed from: v */
    public static final byte[] f5559v;

    /* JADX INFO: renamed from: w */
    public static final byte[] f5560w;

    /* JADX INFO: renamed from: x */
    public static final byte[] f5561x;

    /* JADX INFO: renamed from: y */
    public static final byte[] f5562y;

    /* JADX INFO: renamed from: z */
    public static final byte[] f5563z;

    /* JADX INFO: renamed from: a */
    public final FileDescriptor f5564a;

    /* JADX INFO: renamed from: b */
    public final AssetManager.AssetInputStream f5565b;

    /* JADX INFO: renamed from: c */
    public int f5566c;

    /* JADX INFO: renamed from: d */
    public final HashMap[] f5567d;

    /* JADX INFO: renamed from: e */
    public final HashSet f5568e;

    /* JADX INFO: renamed from: f */
    public ByteOrder f5569f;

    /* JADX INFO: renamed from: g */
    public boolean f5570g;

    /* JADX INFO: renamed from: h */
    public int f5571h;

    /* JADX INFO: renamed from: i */
    public int f5572i;

    /* JADX INFO: renamed from: j */
    public int f5573j;

    /* JADX INFO: renamed from: k */
    public int f5574k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f5550m = new int[]{8, 8, 8};
        f5551n = new int[]{8};
        f5552o = new byte[]{-1, -40, -1};
        f5553p = new byte[]{102, 116, 121, 112};
        f5554q = new byte[]{109, 105, 102, 49};
        f5555r = new byte[]{104, 101, 105, 99};
        f5556s = new byte[]{79, 76, 89, 77, 80, 0};
        f5557t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f5558u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f5559v = new byte[]{101, 88, 73, 102};
        f5560w = new byte[]{73, 72, 68, 82};
        f5561x = new byte[]{73, 69, 78, 68};
        f5562y = new byte[]{82, 73, 70, 70};
        f5563z = new byte[]{87, 69, 66, 80};
        f5535A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f5536B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f5537C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f5538D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        hh0[] hh0VarArr = {new hh0("NewSubfileType", 254, 4), new hh0("SubfileType", 255, 4), new hh0("ImageWidth", 256, 3, 4), new hh0("ImageLength", 257, 3, 4), new hh0("BitsPerSample", 258, 3), new hh0("Compression", 259, 3), new hh0("PhotometricInterpretation", 262, 3), new hh0("ImageDescription", 270, 2), new hh0("Make", 271, 2), new hh0("Model", 272, 2), new hh0("StripOffsets", 273, 3, 4), new hh0("Orientation", 274, 3), new hh0("SamplesPerPixel", 277, 3), new hh0("RowsPerStrip", 278, 3, 4), new hh0("StripByteCounts", 279, 3, 4), new hh0("XResolution", 282, 5), new hh0("YResolution", 283, 5), new hh0("PlanarConfiguration", 284, 3), new hh0("ResolutionUnit", 296, 3), new hh0("TransferFunction", 301, 3), new hh0("Software", 305, 2), new hh0("DateTime", 306, 2), new hh0("Artist", 315, 2), new hh0("WhitePoint", 318, 5), new hh0("PrimaryChromaticities", 319, 5), new hh0("SubIFDPointer", 330, 4), new hh0("JPEGInterchangeFormat", 513, 4), new hh0("JPEGInterchangeFormatLength", 514, 4), new hh0("YCbCrCoefficients", 529, 5), new hh0("YCbCrSubSampling", 530, 3), new hh0("YCbCrPositioning", 531, 3), new hh0("ReferenceBlackWhite", 532, 5), new hh0("Copyright", 33432, 2), new hh0("ExifIFDPointer", 34665, 4), new hh0("GPSInfoIFDPointer", 34853, 4), new hh0("SensorTopBorder", 4, 4), new hh0("SensorLeftBorder", 5, 4), new hh0("SensorBottomBorder", 6, 4), new hh0("SensorRightBorder", 7, 4), new hh0("ISO", 23, 3), new hh0("JpgFromRaw", 46, 7), new hh0("Xmp", 700, 1)};
        hh0[] hh0VarArr2 = {new hh0("ExposureTime", 33434, 5), new hh0("FNumber", 33437, 5), new hh0("ExposureProgram", 34850, 3), new hh0("SpectralSensitivity", 34852, 2), new hh0("PhotographicSensitivity", 34855, 3), new hh0("OECF", 34856, 7), new hh0("SensitivityType", 34864, 3), new hh0("StandardOutputSensitivity", 34865, 4), new hh0("RecommendedExposureIndex", 34866, 4), new hh0("ISOSpeed", 34867, 4), new hh0("ISOSpeedLatitudeyyy", 34868, 4), new hh0("ISOSpeedLatitudezzz", 34869, 4), new hh0("ExifVersion", 36864, 2), new hh0("DateTimeOriginal", 36867, 2), new hh0("DateTimeDigitized", 36868, 2), new hh0("OffsetTime", 36880, 2), new hh0("OffsetTimeOriginal", 36881, 2), new hh0("OffsetTimeDigitized", 36882, 2), new hh0("ComponentsConfiguration", 37121, 7), new hh0("CompressedBitsPerPixel", 37122, 5), new hh0("ShutterSpeedValue", 37377, 10), new hh0("ApertureValue", 37378, 5), new hh0("BrightnessValue", 37379, 10), new hh0("ExposureBiasValue", 37380, 10), new hh0("MaxApertureValue", 37381, 5), new hh0("SubjectDistance", 37382, 5), new hh0("MeteringMode", 37383, 3), new hh0("LightSource", 37384, 3), new hh0("Flash", 37385, 3), new hh0("FocalLength", 37386, 5), new hh0("SubjectArea", 37396, 3), new hh0("MakerNote", 37500, 7), new hh0("UserComment", 37510, 7), new hh0("SubSecTime", 37520, 2), new hh0("SubSecTimeOriginal", 37521, 2), new hh0("SubSecTimeDigitized", 37522, 2), new hh0("FlashpixVersion", 40960, 7), new hh0("ColorSpace", 40961, 3), new hh0("PixelXDimension", 40962, 3, 4), new hh0("PixelYDimension", 40963, 3, 4), new hh0("RelatedSoundFile", 40964, 2), new hh0("InteroperabilityIFDPointer", 40965, 4), new hh0("FlashEnergy", 41483, 5), new hh0("SpatialFrequencyResponse", 41484, 7), new hh0("FocalPlaneXResolution", 41486, 5), new hh0("FocalPlaneYResolution", 41487, 5), new hh0("FocalPlaneResolutionUnit", 41488, 3), new hh0("SubjectLocation", 41492, 3), new hh0("ExposureIndex", 41493, 5), new hh0("SensingMethod", 41495, 3), new hh0("FileSource", 41728, 7), new hh0("SceneType", 41729, 7), new hh0("CFAPattern", 41730, 7), new hh0("CustomRendered", 41985, 3), new hh0("ExposureMode", 41986, 3), new hh0("WhiteBalance", 41987, 3), new hh0("DigitalZoomRatio", 41988, 5), new hh0("FocalLengthIn35mmFilm", 41989, 3), new hh0("SceneCaptureType", 41990, 3), new hh0("GainControl", 41991, 3), new hh0("Contrast", 41992, 3), new hh0("Saturation", 41993, 3), new hh0("Sharpness", 41994, 3), new hh0("DeviceSettingDescription", 41995, 7), new hh0("SubjectDistanceRange", 41996, 3), new hh0("ImageUniqueID", 42016, 2), new hh0("CameraOwnerName", 42032, 2), new hh0("BodySerialNumber", 42033, 2), new hh0("LensSpecification", 42034, 5), new hh0("LensMake", 42035, 2), new hh0("LensModel", 42036, 2), new hh0("Gamma", 42240, 5), new hh0("DNGVersion", 50706, 1), new hh0("DefaultCropSize", 50720, 3, 4)};
        hh0[] hh0VarArr3 = {new hh0("GPSVersionID", 0, 1), new hh0("GPSLatitudeRef", 1, 2), new hh0("GPSLatitude", 2, 5, 10), new hh0("GPSLongitudeRef", 3, 2), new hh0("GPSLongitude", 4, 5, 10), new hh0("GPSAltitudeRef", 5, 1), new hh0("GPSAltitude", 6, 5), new hh0("GPSTimeStamp", 7, 5), new hh0("GPSSatellites", 8, 2), new hh0("GPSStatus", 9, 2), new hh0("GPSMeasureMode", 10, 2), new hh0("GPSDOP", 11, 5), new hh0("GPSSpeedRef", 12, 2), new hh0("GPSSpeed", 13, 5), new hh0("GPSTrackRef", 14, 2), new hh0("GPSTrack", 15, 5), new hh0("GPSImgDirectionRef", 16, 2), new hh0("GPSImgDirection", 17, 5), new hh0("GPSMapDatum", 18, 2), new hh0("GPSDestLatitudeRef", 19, 2), new hh0("GPSDestLatitude", 20, 5), new hh0("GPSDestLongitudeRef", 21, 2), new hh0("GPSDestLongitude", 22, 5), new hh0("GPSDestBearingRef", 23, 2), new hh0("GPSDestBearing", 24, 5), new hh0("GPSDestDistanceRef", 25, 2), new hh0("GPSDestDistance", 26, 5), new hh0("GPSProcessingMethod", 27, 7), new hh0("GPSAreaInformation", 28, 7), new hh0("GPSDateStamp", 29, 2), new hh0("GPSDifferential", 30, 3), new hh0("GPSHPositioningError", 31, 5)};
        hh0[] hh0VarArr4 = {new hh0("InteroperabilityIndex", 1, 2)};
        hh0[] hh0VarArr5 = {new hh0("NewSubfileType", 254, 4), new hh0("SubfileType", 255, 4), new hh0("ThumbnailImageWidth", 256, 3, 4), new hh0("ThumbnailImageLength", 257, 3, 4), new hh0("BitsPerSample", 258, 3), new hh0("Compression", 259, 3), new hh0("PhotometricInterpretation", 262, 3), new hh0("ImageDescription", 270, 2), new hh0("Make", 271, 2), new hh0("Model", 272, 2), new hh0("StripOffsets", 273, 3, 4), new hh0("ThumbnailOrientation", 274, 3), new hh0("SamplesPerPixel", 277, 3), new hh0("RowsPerStrip", 278, 3, 4), new hh0("StripByteCounts", 279, 3, 4), new hh0("XResolution", 282, 5), new hh0("YResolution", 283, 5), new hh0("PlanarConfiguration", 284, 3), new hh0("ResolutionUnit", 296, 3), new hh0("TransferFunction", 301, 3), new hh0("Software", 305, 2), new hh0("DateTime", 306, 2), new hh0("Artist", 315, 2), new hh0("WhitePoint", 318, 5), new hh0("PrimaryChromaticities", 319, 5), new hh0("SubIFDPointer", 330, 4), new hh0("JPEGInterchangeFormat", 513, 4), new hh0("JPEGInterchangeFormatLength", 514, 4), new hh0("YCbCrCoefficients", 529, 5), new hh0("YCbCrSubSampling", 530, 3), new hh0("YCbCrPositioning", 531, 3), new hh0("ReferenceBlackWhite", 532, 5), new hh0("Copyright", 33432, 2), new hh0("ExifIFDPointer", 34665, 4), new hh0("GPSInfoIFDPointer", 34853, 4), new hh0("DNGVersion", 50706, 1), new hh0("DefaultCropSize", 50720, 3, 4)};
        f5539E = new hh0("StripOffsets", 273, 3);
        f5540F = new hh0[][]{hh0VarArr, hh0VarArr2, hh0VarArr3, hh0VarArr4, hh0VarArr5, hh0VarArr, new hh0[]{new hh0("ThumbnailImage", 256, 7), new hh0("CameraSettingsIFDPointer", 8224, 4), new hh0("ImageProcessingIFDPointer", 8256, 4)}, new hh0[]{new hh0("PreviewImageStart", 257, 4), new hh0("PreviewImageLength", 258, 4)}, new hh0[]{new hh0("AspectFrame", 4371, 3)}, new hh0[]{new hh0("ColorSpace", 55, 3)}};
        f5541G = new hh0[]{new hh0("SubIFDPointer", 330, 4), new hh0("ExifIFDPointer", 34665, 4), new hh0("GPSInfoIFDPointer", 34853, 4), new hh0("InteroperabilityIFDPointer", 40965, 4), new hh0("CameraSettingsIFDPointer", 8224, 1), new hh0("ImageProcessingIFDPointer", 8256, 1)};
        f5542H = new HashMap[10];
        f5543I = new HashMap[10];
        f5544J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f5545K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f5546L = charsetForName;
        f5547M = "Exif\u0000\u0000".getBytes(charsetForName);
        f5548N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            hh0[][] hh0VarArr6 = f5540F;
            if (i >= hh0VarArr6.length) {
                HashMap map = f5545K;
                hh0[] hh0VarArr7 = f5541G;
                map.put(Integer.valueOf(hh0VarArr7[0].f4014a), 5);
                map.put(Integer.valueOf(hh0VarArr7[1].f4014a), 1);
                map.put(Integer.valueOf(hh0VarArr7[2].f4014a), 2);
                map.put(Integer.valueOf(hh0VarArr7[3].f4014a), 3);
                map.put(Integer.valueOf(hh0VarArr7[4].f4014a), 7);
                map.put(Integer.valueOf(hh0VarArr7[5].f4014a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f5542H[i] = new HashMap();
            f5543I[i] = new HashMap();
            for (hh0 hh0Var : hh0VarArr6[i]) {
                f5542H[i].put(Integer.valueOf(hh0Var.f4014a), hh0Var);
                f5543I[i].put(hh0Var.f4015b, hh0Var);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:39:0x00a5, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:65:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kh0(InputStream inputStream) throws IOException {
        hh0[][] hh0VarArr = f5540F;
        this.f5567d = new HashMap[hh0VarArr.length];
        this.f5568e = new HashSet(hh0VarArr.length);
        this.f5569f = ByteOrder.BIG_ENDIAN;
        boolean z = inputStream instanceof AssetManager.AssetInputStream;
        boolean z2 = f5549l;
        if (z) {
            this.f5565b = (AssetManager.AssetInputStream) inputStream;
            this.f5564a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                mh0.m3109c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f5565b = null;
                this.f5564a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z2) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f5565b = null;
                this.f5564a = null;
            }
        } else {
            this.f5565b = null;
            this.f5564a = null;
        }
        for (int i = 0; i < hh0VarArr.length; i++) {
            try {
                try {
                    this.f5567d[i] = new HashMap();
                } catch (Throwable th) {
                    m2669a();
                    if (z2) {
                        m2684p();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m2669a();
                if (!z2) {
                    return;
                }
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z2) {
                }
                m2669a();
                if (!z2) {
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iM2674f = m2674f(bufferedInputStream);
        this.f5566c = iM2674f;
        if (iM2674f == 4 || iM2674f == 9 || iM2674f == 13 || iM2674f == 14) {
            fh0 fh0Var = new fh0(bufferedInputStream);
            int i2 = this.f5566c;
            if (i2 == 4) {
                m2673e(fh0Var, 0, 0);
            } else if (i2 == 13) {
                m2676h(fh0Var);
            } else if (i2 == 9) {
                m2677i(fh0Var);
            } else if (i2 == 14) {
                m2680l(fh0Var);
            }
        } else {
            jh0 jh0Var = new jh0(bufferedInputStream);
            int i3 = this.f5566c;
            if (i3 == 12) {
                m2672d(jh0Var);
            } else if (i3 == 7) {
                m2675g(jh0Var);
            } else if (i3 == 10) {
                m2679k(jh0Var);
            } else {
                m2678j(jh0Var);
            }
            jh0Var.m2498c(this.f5571h);
            m2688u(jh0Var);
        }
        m2669a();
        if (!z2) {
            return;
        }
        m2684p();
    }

    /* JADX INFO: renamed from: q */
    public static ByteOrder m2668q(fh0 fh0Var) throws IOException {
        short s = fh0Var.readShort();
        boolean z = f5549l;
        if (s == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            c80.m679w("Invalid byte order: ", Integer.toHexString(s));
            return null;
        }
        if (z) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public final void m2669a() {
        String strM2670b = m2670b("DateTimeOriginal");
        HashMap[] mapArr = this.f5567d;
        if (strM2670b != null && m2670b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM2670b.concat("\u0000").getBytes(f5546L);
            map.put("DateTime", new gh0(bytes, 2, bytes.length));
        }
        if (m2670b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", gh0.m1916a(0L, this.f5569f));
        }
        if (m2670b("ImageLength") == null) {
            mapArr[0].put("ImageLength", gh0.m1916a(0L, this.f5569f));
        }
        if (m2670b("Orientation") == null) {
            mapArr[0].put("Orientation", gh0.m1916a(0L, this.f5569f));
        }
        if (m2670b("LightSource") == null) {
            mapArr[1].put("LightSource", gh0.m1916a(0L, this.f5569f));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m2670b(String str) {
        gh0 gh0VarM2671c = m2671c(str);
        if (gh0VarM2671c != null) {
            int i = gh0VarM2671c.f3523a;
            if (!f5544J.contains(str)) {
                return gh0VarM2671c.m1921f(this.f5569f);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                ih0[] ih0VarArr = (ih0[]) gh0VarM2671c.m1922g(this.f5569f);
                if (ih0VarArr == null || ih0VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(ih0VarArr));
                    return null;
                }
                ih0 ih0Var = ih0VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (ih0Var.f4614a / ih0Var.f4615b));
                ih0 ih0Var2 = ih0VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (ih0Var2.f4614a / ih0Var2.f4615b));
                ih0 ih0Var3 = ih0VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (ih0Var3.f4614a / ih0Var3.f4615b)));
            }
            try {
                return Double.toString(gh0VarM2671c.m1919d(this.f5569f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final gh0 m2671c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f5549l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f5540F.length; i++) {
            gh0 gh0Var = (gh0) this.f5567d[i].get(str);
            if (gh0Var != null) {
                return gh0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m2672d(jh0 jh0Var) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            c80.m676t("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                nh0.m3308a(mediaMetadataRetriever, new eh0(jh0Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f5567d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", gh0.m1918c(Integer.parseInt(strExtractMetadata), this.f5569f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", gh0.m1918c(Integer.parseInt(strExtractMetadata2), this.f5569f));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", gh0.m1918c(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f5569f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    jh0Var.m2498c(i2);
                    byte[] bArr = new byte[6];
                    if (jh0Var.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, f5547M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (jh0Var.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.f5571h = i4;
                    m2685r(0, bArr2);
                }
                if (f5549l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2673e(p000.fh0 r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kh0.m2673e(fh0, int, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:167|12|(4:150|13|151|14)|(17:17|(2:19|(1:21))(1:26)|27|(1:29)|30|(1:32)(2:33|(3:34|35|(4:37|153|38|(1:175)(3:41|(3:44|(1:46)(2:47|(1:49))|(1:178)(3:176|52|53))(1:179)|54))(2:174|57)))|62|(1:64)|(1:40)|159|67|161|68|69|(1:75)(1:74)|76|(1:89)(8:157|91|155|92|93|(1:95)(1:96)|97|(1:109)(3:111|(2:112|(2:114|(2:169|116)(1:117))(2:168|118))|(1:120)(4:122|(2:123|(2:125|(1:171)(1:128))(3:170|129|(2:130|(1:172)(2:132|(1:173)(1:135)))))|127|(1:137)(1:139)))))|16|159|67|161|68|69|(3:71|75|76)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f7, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fb, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fd, code lost:
    
        if (r4 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ff, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0102, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        if (r3 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0108, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ca A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:14:0x0039, B:19:0x005a, B:30:0x0076, B:33:0x007c, B:34:0x0082, B:38:0x008c, B:44:0x009b, B:47:0x00a5, B:62:0x00c6, B:64:0x00ca), top: B:150:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2674f(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        fh0 fh0Var;
        int i2;
        int i3;
        int i4;
        long j;
        byte[] bArr;
        long j2;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr3 = f5552o;
            if (i5 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i5] != bArr3[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    byte b = bArr2[i6];
                    ?? r7 = bytes[i6];
                    if (b != r7) {
                        ?? r4 = 0;
                        fh0 fh0Var2 = null;
                        fh0 fh0Var3 = null;
                        fh0 fh0Var4 = null;
                        int i7 = 1;
                        try {
                            try {
                                fh0Var = new fh0(bArr2);
                                try {
                                    j = fh0Var.readInt();
                                    bArr = new byte[4];
                                    fh0Var.read(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                r4 = r7;
                                if (r4 != 0) {
                                    r4.close();
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            fh0Var = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (r4 != 0) {
                            }
                            throw th;
                        }
                        if (Arrays.equals(bArr, f5553p)) {
                            if (j == 1) {
                                j = fh0Var.readLong();
                                j2 = 16;
                                if (j < 16) {
                                }
                            } else {
                                j2 = 8;
                            }
                            if (j > 5000) {
                                j = 5000;
                            }
                            long j3 = j - j2;
                            if (j3 >= 8) {
                                byte[] bArr4 = new byte[4];
                                long j4 = 0;
                                boolean z = false;
                                boolean z2 = false;
                                while (true) {
                                    if (j4 >= j3 / 4) {
                                        i = 0;
                                        break;
                                    }
                                    i = 0;
                                    try {
                                        if (fh0Var.read(bArr4) != 4) {
                                            break;
                                        }
                                        if (j4 != 1) {
                                            if (Arrays.equals(bArr4, f5554q)) {
                                                z = true;
                                            } else if (Arrays.equals(bArr4, f5555r)) {
                                                z2 = true;
                                            }
                                            if (z && z2) {
                                                fh0Var.close();
                                                return 12;
                                            }
                                        }
                                        j4++;
                                    } catch (Exception e3) {
                                        e = e3;
                                        if (f5549l) {
                                        }
                                        if (fh0Var != null) {
                                            break;
                                        }
                                        fh0 fh0Var5 = new fh0(bArr2);
                                        ByteOrder byteOrderM2668q = m2668q(fh0Var5);
                                        this.f5569f = byteOrderM2668q;
                                        fh0Var5.f3003i = byteOrderM2668q;
                                        short s = fh0Var5.readShort();
                                        if (s == 20306) {
                                        }
                                        if (i2 != 0) {
                                        }
                                    }
                                }
                            }
                            if (f5549l) {
                                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                            }
                            if (fh0Var != null) {
                                fh0Var.close();
                            }
                            fh0 fh0Var52 = new fh0(bArr2);
                            ByteOrder byteOrderM2668q2 = m2668q(fh0Var52);
                            this.f5569f = byteOrderM2668q2;
                            fh0Var52.f3003i = byteOrderM2668q2;
                            short s2 = fh0Var52.readShort();
                            i2 = (s2 == 20306 || s2 == 21330) ? 1 : i;
                            fh0Var52.close();
                            if (i2 != 0) {
                                return 7;
                            }
                            try {
                                fh0 fh0Var6 = new fh0(bArr2);
                                try {
                                    ByteOrder byteOrderM2668q3 = m2668q(fh0Var6);
                                    this.f5569f = byteOrderM2668q3;
                                    fh0Var6.f3003i = byteOrderM2668q3;
                                    i3 = fh0Var6.readShort() == 85 ? 1 : i;
                                    fh0Var6.close();
                                } catch (Exception unused) {
                                    fh0Var2 = fh0Var6;
                                    if (fh0Var2 != null) {
                                        fh0Var2.close();
                                    }
                                    i3 = i;
                                } catch (Throwable th3) {
                                    th = th3;
                                    fh0Var3 = fh0Var6;
                                    if (fh0Var3 != null) {
                                        fh0Var3.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused2) {
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            if (i3 != 0) {
                                return 10;
                            }
                            int i8 = i;
                            while (true) {
                                byte[] bArr5 = f5558u;
                                if (i8 >= bArr5.length) {
                                    i4 = 1;
                                    break;
                                }
                                if (bArr2[i8] != bArr5[i8]) {
                                    i4 = i;
                                    break;
                                }
                                i8++;
                            }
                            if (i4 != 0) {
                                return 13;
                            }
                            int i9 = i;
                            while (true) {
                                byte[] bArr6 = f5562y;
                                if (i9 >= bArr6.length) {
                                    int i10 = i;
                                    while (true) {
                                        byte[] bArr7 = f5563z;
                                        if (i10 >= bArr7.length) {
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i10 + 4] != bArr7[i10]) {
                                            break;
                                        }
                                        i10++;
                                    }
                                } else {
                                    if (bArr2[i9] != bArr6[i9]) {
                                        break;
                                    }
                                    i9++;
                                }
                            }
                            i7 = i;
                            if (i7 != 0) {
                                return 14;
                            }
                            return i;
                        }
                        fh0Var.close();
                        i = 0;
                        fh0 fh0Var522 = new fh0(bArr2);
                        ByteOrder byteOrderM2668q22 = m2668q(fh0Var522);
                        this.f5569f = byteOrderM2668q22;
                        fh0Var522.f3003i = byteOrderM2668q22;
                        short s22 = fh0Var522.readShort();
                        if (s22 == 20306) {
                            fh0Var522.close();
                        }
                        if (i2 != 0) {
                        }
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2675g(jh0 jh0Var) throws Throwable {
        int i;
        int i2;
        m2678j(jh0Var);
        HashMap[] mapArr = this.f5567d;
        gh0 gh0Var = (gh0) mapArr[1].get("MakerNote");
        if (gh0Var != null) {
            jh0 jh0Var2 = new jh0(gh0Var.f3526d);
            jh0Var2.f3003i = this.f5569f;
            byte[] bArr = f5556s;
            byte[] bArr2 = new byte[bArr.length];
            jh0Var2.readFully(bArr2);
            jh0Var2.m2498c(0L);
            byte[] bArr3 = f5557t;
            byte[] bArr4 = new byte[bArr3.length];
            jh0Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                jh0Var2.m2498c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                jh0Var2.m2498c(12L);
            }
            m2686s(jh0Var2, 6);
            gh0 gh0Var2 = (gh0) mapArr[7].get("PreviewImageStart");
            gh0 gh0Var3 = (gh0) mapArr[7].get("PreviewImageLength");
            if (gh0Var2 != null && gh0Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", gh0Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", gh0Var3);
            }
            gh0 gh0Var4 = (gh0) mapArr[8].get("AspectFrame");
            if (gh0Var4 != null) {
                int[] iArr = (int[]) gh0Var4.m1922g(this.f5569f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                gh0 gh0VarM1918c = gh0.m1918c(i5, this.f5569f);
                gh0 gh0VarM1918c2 = gh0.m1918c(i6, this.f5569f);
                mapArr[0].put("ImageWidth", gh0VarM1918c);
                mapArr[0].put("ImageLength", gh0VarM1918c2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2676h(fh0 fh0Var) throws Throwable {
        if (f5549l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + fh0Var);
        }
        fh0Var.f3003i = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f5558u;
        fh0Var.m1654b(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = fh0Var.readInt();
                byte[] bArr2 = new byte[4];
                if (fh0Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f5560w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f5561x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f5559v)) {
                    byte[] bArr3 = new byte[i];
                    if (fh0Var.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + xe1.m6123h(bArr2));
                    }
                    int i3 = fh0Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f5571h = i2;
                        m2685r(0, bArr3);
                        m2691x();
                        m2688u(new fh0(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                fh0Var.m1654b(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                c80.m678v("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2677i(fh0 fh0Var) throws Throwable {
        boolean z = f5549l;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + fh0Var);
        }
        fh0Var.m1654b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        fh0Var.read(bArr);
        fh0Var.read(bArr2);
        fh0Var.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        fh0Var.m1654b(i - fh0Var.f3004j);
        fh0Var.read(bArr4);
        m2673e(new fh0(bArr4), i, 5);
        fh0Var.m1654b(i3 - fh0Var.f3004j);
        fh0Var.f3003i = ByteOrder.BIG_ENDIAN;
        int i4 = fh0Var.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = fh0Var.readUnsignedShort();
            int unsignedShort2 = fh0Var.readUnsignedShort();
            if (unsignedShort == f5539E.f4014a) {
                short s = fh0Var.readShort();
                short s2 = fh0Var.readShort();
                gh0 gh0VarM1918c = gh0.m1918c(s, this.f5569f);
                gh0 gh0VarM1918c2 = gh0.m1918c(s2, this.f5569f);
                HashMap[] mapArr = this.f5567d;
                mapArr[0].put("ImageLength", gh0VarM1918c);
                mapArr[0].put("ImageWidth", gh0VarM1918c2);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            fh0Var.m1654b(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2678j(jh0 jh0Var) throws Throwable {
        m2683o(jh0Var);
        m2686s(jh0Var, 0);
        m2690w(jh0Var, 0);
        m2690w(jh0Var, 5);
        m2690w(jh0Var, 4);
        m2691x();
        if (this.f5566c == 8) {
            HashMap[] mapArr = this.f5567d;
            gh0 gh0Var = (gh0) mapArr[1].get("MakerNote");
            if (gh0Var != null) {
                jh0 jh0Var2 = new jh0(gh0Var.f3526d);
                jh0Var2.f3003i = this.f5569f;
                jh0Var2.m1654b(6);
                m2686s(jh0Var2, 9);
                gh0 gh0Var2 = (gh0) mapArr[9].get("ColorSpace");
                if (gh0Var2 != null) {
                    mapArr[1].put("ColorSpace", gh0Var2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2679k(jh0 jh0Var) throws Throwable {
        if (f5549l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + jh0Var);
        }
        m2678j(jh0Var);
        HashMap[] mapArr = this.f5567d;
        gh0 gh0Var = (gh0) mapArr[0].get("JpgFromRaw");
        if (gh0Var != null) {
            m2673e(new fh0(gh0Var.f3526d), (int) gh0Var.f3525c, 5);
        }
        gh0 gh0Var2 = (gh0) mapArr[0].get("ISO");
        gh0 gh0Var3 = (gh0) mapArr[1].get("PhotographicSensitivity");
        if (gh0Var2 == null || gh0Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", gh0Var2);
    }

    /* JADX INFO: renamed from: l */
    public final void m2680l(fh0 fh0Var) throws Throwable {
        if (f5549l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + fh0Var);
        }
        fh0Var.f3003i = ByteOrder.LITTLE_ENDIAN;
        fh0Var.m1654b(f5562y.length);
        int i = fh0Var.readInt() + 8;
        byte[] bArr = f5563z;
        fh0Var.m1654b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (fh0Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = fh0Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f5535A, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (fh0Var.read(bArr3) == i2) {
                        this.f5571h = i3;
                        m2685r(0, bArr3);
                        m2688u(new fh0(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + xe1.m6123h(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                fh0Var.m1654b(i2);
            } catch (EOFException unused) {
                c80.m678v("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2681m(fh0 fh0Var, HashMap map) throws Throwable {
        gh0 gh0Var = (gh0) map.get("JPEGInterchangeFormat");
        gh0 gh0Var2 = (gh0) map.get("JPEGInterchangeFormatLength");
        if (gh0Var == null || gh0Var2 == null) {
            return;
        }
        int iM1920e = gh0Var.m1920e(this.f5569f);
        int iM1920e2 = gh0Var2.m1920e(this.f5569f);
        if (this.f5566c == 7) {
            iM1920e += this.f5572i;
        }
        if (iM1920e > 0 && iM1920e2 > 0 && this.f5565b == null && this.f5564a == null) {
            fh0Var.skip(iM1920e);
            fh0Var.read(new byte[iM1920e2]);
        }
        if (f5549l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM1920e + ", length: " + iM1920e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2682n(HashMap map) {
        gh0 gh0Var = (gh0) map.get("ImageLength");
        gh0 gh0Var2 = (gh0) map.get("ImageWidth");
        if (gh0Var == null || gh0Var2 == null) {
            return false;
        }
        return gh0Var.m1920e(this.f5569f) <= 512 && gh0Var2.m1920e(this.f5569f) <= 512;
    }

    /* JADX INFO: renamed from: o */
    public final void m2683o(jh0 jh0Var) throws IOException {
        ByteOrder byteOrderM2668q = m2668q(jh0Var);
        this.f5569f = byteOrderM2668q;
        jh0Var.f3003i = byteOrderM2668q;
        int unsignedShort = jh0Var.readUnsignedShort();
        int i = this.f5566c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            c80.m679w("Invalid start code: ", Integer.toHexString(unsignedShort));
            return;
        }
        int i2 = jh0Var.readInt();
        if (i2 < 8) {
            c80.m678v(vi0.m5688g("Invalid first Ifd offset: ", i2));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            jh0Var.m1654b(i3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2684p() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f5567d;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbM5695n = vi0.m5695n(i, "The size of tag group[", "]: ");
            sbM5695n.append(mapArr[i].size());
            Log.d("ExifInterface", sbM5695n.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                gh0 gh0Var = (gh0) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + gh0Var.toString() + ", tagValue: '" + gh0Var.m1921f(this.f5569f) + "'");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2685r(int i, byte[] bArr) throws IOException {
        jh0 jh0Var = new jh0(bArr);
        m2683o(jh0Var);
        m2686s(jh0Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2686s(jh0 jh0Var, int i) throws IOException {
        HashMap[] mapArr;
        short s;
        boolean z;
        short s2;
        HashMap[] mapArr2;
        long j;
        long j2;
        boolean z2;
        int i2;
        long j3;
        int i3;
        int i4;
        int unsignedShort;
        long j4;
        Integer numValueOf = Integer.valueOf(jh0Var.f3004j);
        HashSet hashSet = this.f5568e;
        hashSet.add(numValueOf);
        short s3 = jh0Var.readShort();
        boolean z3 = f5549l;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s3));
        }
        if (s3 <= 0) {
            return;
        }
        short s4 = 0;
        while (true) {
            mapArr = this.f5567d;
            if (s4 >= s3) {
                break;
            }
            int unsignedShort2 = jh0Var.readUnsignedShort();
            int unsignedShort3 = jh0Var.readUnsignedShort();
            int i5 = jh0Var.readInt();
            long j5 = ((long) jh0Var.f3004j) + 4;
            hh0 hh0Var = (hh0) f5542H[i].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                s = s3;
                z = z3;
                s2 = s4;
                mapArr2 = mapArr;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), hh0Var != null ? hh0Var.f4015b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i5)));
            } else {
                s = s3;
                z = z3;
                s2 = s4;
                mapArr2 = mapArr;
            }
            if (hh0Var != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f5537C;
                    if (unsignedShort3 < iArr.length) {
                        int i6 = hh0Var.f4016c;
                        if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3 || (i2 = hh0Var.f4017d) == unsignedShort3 || (((i6 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i6 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i6 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i6;
                            }
                            j = j5;
                            j2 = ((long) i5) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i5);
                                }
                                z2 = false;
                                if (z2) {
                                    jh0Var.m2498c(j);
                                } else {
                                    long j6 = j;
                                    if (j2 > 4) {
                                        int i7 = jh0Var.readInt();
                                        if (z) {
                                            i3 = unsignedShort2;
                                            Log.d("ExifInterface", "seek to data offset: " + i7);
                                        } else {
                                            i3 = unsignedShort2;
                                        }
                                        if (this.f5566c != 7) {
                                            j3 = j6;
                                            i4 = unsignedShort3;
                                            jh0Var.m2498c(i7);
                                        } else {
                                            if ("MakerNote".equals(hh0Var.f4015b)) {
                                                this.f5572i = i7;
                                            } else {
                                                if (i == 6 && "ThumbnailImage".equals(hh0Var.f4015b)) {
                                                    this.f5573j = i7;
                                                    this.f5574k = i5;
                                                    gh0 gh0VarM1918c = gh0.m1918c(6, this.f5569f);
                                                    j3 = j6;
                                                    gh0 gh0VarM1916a = gh0.m1916a(this.f5573j, this.f5569f);
                                                    i4 = unsignedShort3;
                                                    gh0 gh0VarM1916a2 = gh0.m1916a(this.f5574k, this.f5569f);
                                                    mapArr2[4].put("Compression", gh0VarM1918c);
                                                    mapArr2[4].put("JPEGInterchangeFormat", gh0VarM1916a);
                                                    mapArr2[4].put("JPEGInterchangeFormatLength", gh0VarM1916a2);
                                                }
                                                jh0Var.m2498c(i7);
                                            }
                                            j3 = j6;
                                            i4 = unsignedShort3;
                                            jh0Var.m2498c(i7);
                                        }
                                    } else {
                                        j3 = j6;
                                        i3 = unsignedShort2;
                                        i4 = unsignedShort3;
                                    }
                                    Integer num = (Integer) f5545K.get(Integer.valueOf(i3));
                                    if (z) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                                    }
                                    if (num != null) {
                                        int i8 = i4;
                                        if (i8 != 3) {
                                            if (i8 == 4) {
                                                j4 = ((long) jh0Var.readInt()) & 4294967295L;
                                            } else if (i8 == 8) {
                                                unsignedShort = jh0Var.readShort();
                                            } else if (i8 == 9 || i8 == 13) {
                                                unsignedShort = jh0Var.readInt();
                                            } else {
                                                j4 = -1;
                                            }
                                            if (z) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), hh0Var.f4015b));
                                            }
                                            if (j4 <= 0) {
                                                if (!hashSet.contains(Integer.valueOf((int) j4))) {
                                                    jh0Var.m2498c(j4);
                                                    m2686s(jh0Var, num.intValue());
                                                } else if (z) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j4 + ")");
                                                }
                                            } else if (z) {
                                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                                            }
                                            jh0Var.m2498c(j3);
                                        } else {
                                            unsignedShort = jh0Var.readUnsignedShort();
                                        }
                                        j4 = unsignedShort;
                                        if (z) {
                                        }
                                        if (j4 <= 0) {
                                        }
                                        jh0Var.m2498c(j3);
                                    } else {
                                        long j7 = j3;
                                        int i9 = jh0Var.f3004j + this.f5571h;
                                        byte[] bArr = new byte[(int) j2];
                                        jh0Var.readFully(bArr);
                                        gh0 gh0Var = new gh0(i9, bArr, i4, i5);
                                        HashMap map = mapArr2[i];
                                        String str = hh0Var.f4015b;
                                        map.put(str, gh0Var);
                                        if ("DNGVersion".equals(str)) {
                                            this.f5566c = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && gh0Var.m1921f(this.f5569f).contains("PENTAX")) || ("Compression".equals(str) && gh0Var.m1920e(this.f5569f) == 65535)) {
                                            this.f5566c = 8;
                                        }
                                        if (jh0Var.f3004j != j7) {
                                            jh0Var.m2498c(j7);
                                        }
                                    }
                                }
                                s4 = (short) (s2 + 1);
                                s3 = s;
                                z3 = z;
                            } else {
                                z2 = true;
                                if (z2) {
                                }
                                s4 = (short) (s2 + 1);
                                s3 = s;
                                z3 = z;
                            }
                        } else if (z) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f5536B[unsignedShort3] + ") is unexpected for tag: " + hh0Var.f4015b);
                        }
                    }
                }
                j = j5;
                if (z) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z2 = false;
                if (z2) {
                }
                s4 = (short) (s2 + 1);
                s3 = s;
                z3 = z;
            } else if (z) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j5;
            j2 = 0;
            z2 = false;
            if (z2) {
            }
            s4 = (short) (s2 + 1);
            s3 = s;
            z3 = z;
        }
        boolean z4 = z3;
        int i10 = jh0Var.readInt();
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i10)));
        }
        long j8 = i10;
        if (j8 <= 0) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        if (hashSet.contains(Integer.valueOf(i10))) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        jh0Var.m2498c(j8);
        if (mapArr[4].isEmpty()) {
            m2686s(jh0Var, 4);
        } else if (mapArr[5].isEmpty()) {
            m2686s(jh0Var, 5);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2687t(int i, String str, String str2) {
        HashMap[] mapArr = this.f5567d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: renamed from: u */
    public final void m2688u(fh0 fh0Var) throws Throwable {
        gh0 gh0Var;
        int iM1920e;
        HashMap map = this.f5567d[4];
        gh0 gh0Var2 = (gh0) map.get("Compression");
        if (gh0Var2 == null) {
            m2681m(fh0Var, map);
            return;
        }
        int iM1920e2 = gh0Var2.m1920e(this.f5569f);
        if (iM1920e2 != 1) {
            if (iM1920e2 == 6) {
                m2681m(fh0Var, map);
                return;
            } else if (iM1920e2 != 7) {
                return;
            }
        }
        gh0 gh0Var3 = (gh0) map.get("BitsPerSample");
        if (gh0Var3 != null) {
            int[] iArr = (int[]) gh0Var3.m1922g(this.f5569f);
            int[] iArr2 = f5550m;
            if (Arrays.equals(iArr2, iArr) || (this.f5566c == 3 && (gh0Var = (gh0) map.get("PhotometricInterpretation")) != null && (((iM1920e = gh0Var.m1920e(this.f5569f)) == 1 && Arrays.equals(iArr, f5551n)) || (iM1920e == 6 && Arrays.equals(iArr, iArr2))))) {
                gh0 gh0Var4 = (gh0) map.get("StripOffsets");
                gh0 gh0Var5 = (gh0) map.get("StripByteCounts");
                if (gh0Var4 == null || gh0Var5 == null) {
                    return;
                }
                long[] jArrM6131l = xe1.m6131l(gh0Var4.m1922g(this.f5569f));
                long[] jArrM6131l2 = xe1.m6131l(gh0Var5.m1922g(this.f5569f));
                if (jArrM6131l == null || jArrM6131l.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM6131l2 == null || jArrM6131l2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM6131l.length != jArrM6131l2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrM6131l2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f5570g = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM6131l.length; i3++) {
                    int i4 = (int) jArrM6131l[i3];
                    int i5 = (int) jArrM6131l2[i3];
                    if (i3 < jArrM6131l.length - 1 && i4 + i5 != jArrM6131l[i3 + 1]) {
                        this.f5570g = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (fh0Var.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (fh0Var.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.f5570g) {
                    long j4 = jArrM6131l[0];
                    return;
                }
                return;
            }
        }
        if (f5549l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2689v(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f5567d;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f5549l;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        gh0 gh0Var = (gh0) mapArr[i].get("ImageLength");
        gh0 gh0Var2 = (gh0) mapArr[i].get("ImageWidth");
        gh0 gh0Var3 = (gh0) mapArr[i2].get("ImageLength");
        gh0 gh0Var4 = (gh0) mapArr[i2].get("ImageWidth");
        if (gh0Var == null || gh0Var2 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (gh0Var3 == null || gh0Var4 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM1920e = gh0Var.m1920e(this.f5569f);
        int iM1920e2 = gh0Var2.m1920e(this.f5569f);
        int iM1920e3 = gh0Var3.m1920e(this.f5569f);
        int iM1920e4 = gh0Var4.m1920e(this.f5569f);
        if (iM1920e >= iM1920e3 || iM1920e2 >= iM1920e4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: w */
    public final void m2690w(jh0 jh0Var, int i) throws Throwable {
        gh0 gh0VarM1918c;
        gh0 gh0VarM1918c2;
        HashMap[] mapArr = this.f5567d;
        gh0 gh0Var = (gh0) mapArr[i].get("DefaultCropSize");
        gh0 gh0Var2 = (gh0) mapArr[i].get("SensorTopBorder");
        gh0 gh0Var3 = (gh0) mapArr[i].get("SensorLeftBorder");
        gh0 gh0Var4 = (gh0) mapArr[i].get("SensorBottomBorder");
        gh0 gh0Var5 = (gh0) mapArr[i].get("SensorRightBorder");
        if (gh0Var != null) {
            int i2 = gh0Var.f3523a;
            ByteOrder byteOrder = this.f5569f;
            if (i2 == 5) {
                ih0[] ih0VarArr = (ih0[]) gh0Var.m1922g(byteOrder);
                if (ih0VarArr == null || ih0VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(ih0VarArr));
                    return;
                }
                gh0VarM1918c = gh0.m1917b(ih0VarArr[0], this.f5569f);
                gh0VarM1918c2 = gh0.m1917b(ih0VarArr[1], this.f5569f);
            } else {
                int[] iArr = (int[]) gh0Var.m1922g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                gh0VarM1918c = gh0.m1918c(iArr[0], this.f5569f);
                gh0VarM1918c2 = gh0.m1918c(iArr[1], this.f5569f);
            }
            mapArr[i].put("ImageWidth", gh0VarM1918c);
            mapArr[i].put("ImageLength", gh0VarM1918c2);
            return;
        }
        if (gh0Var2 != null && gh0Var3 != null && gh0Var4 != null && gh0Var5 != null) {
            int iM1920e = gh0Var2.m1920e(this.f5569f);
            int iM1920e2 = gh0Var4.m1920e(this.f5569f);
            int iM1920e3 = gh0Var5.m1920e(this.f5569f);
            int iM1920e4 = gh0Var3.m1920e(this.f5569f);
            if (iM1920e2 <= iM1920e || iM1920e3 <= iM1920e4) {
                return;
            }
            gh0 gh0VarM1918c3 = gh0.m1918c(iM1920e2 - iM1920e, this.f5569f);
            gh0 gh0VarM1918c4 = gh0.m1918c(iM1920e3 - iM1920e4, this.f5569f);
            mapArr[i].put("ImageLength", gh0VarM1918c3);
            mapArr[i].put("ImageWidth", gh0VarM1918c4);
            return;
        }
        gh0 gh0Var6 = (gh0) mapArr[i].get("ImageLength");
        gh0 gh0Var7 = (gh0) mapArr[i].get("ImageWidth");
        if (gh0Var6 == null || gh0Var7 == null) {
            gh0 gh0Var8 = (gh0) mapArr[i].get("JPEGInterchangeFormat");
            gh0 gh0Var9 = (gh0) mapArr[i].get("JPEGInterchangeFormatLength");
            if (gh0Var8 == null || gh0Var9 == null) {
                return;
            }
            int iM1920e5 = gh0Var8.m1920e(this.f5569f);
            int iM1920e6 = gh0Var8.m1920e(this.f5569f);
            jh0Var.m2498c(iM1920e5);
            byte[] bArr = new byte[iM1920e6];
            jh0Var.read(bArr);
            m2673e(new fh0(bArr), iM1920e5, i);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2691x() throws Throwable {
        m2689v(0, 5);
        m2689v(0, 4);
        m2689v(5, 4);
        HashMap[] mapArr = this.f5567d;
        gh0 gh0Var = (gh0) mapArr[1].get("PixelXDimension");
        gh0 gh0Var2 = (gh0) mapArr[1].get("PixelYDimension");
        if (gh0Var != null && gh0Var2 != null) {
            mapArr[0].put("ImageWidth", gh0Var);
            mapArr[0].put("ImageLength", gh0Var2);
        }
        if (mapArr[4].isEmpty() && m2682n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m2682n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m2687t(0, "ThumbnailOrientation", "Orientation");
        m2687t(0, "ThumbnailImageLength", "ImageLength");
        m2687t(0, "ThumbnailImageWidth", "ImageWidth");
        m2687t(5, "ThumbnailOrientation", "Orientation");
        m2687t(5, "ThumbnailImageLength", "ImageLength");
        m2687t(5, "ThumbnailImageWidth", "ImageWidth");
        m2687t(4, "Orientation", "ThumbnailOrientation");
        m2687t(4, "ImageLength", "ThumbnailImageLength");
        m2687t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
