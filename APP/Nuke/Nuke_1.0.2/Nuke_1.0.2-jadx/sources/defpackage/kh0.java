package defpackage;

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
    public static final byte[] A;
    public static final String[] B;
    public static final int[] C;
    public static final byte[] D;
    public static final hh0 E;
    public static final hh0[][] F;
    public static final hh0[] G;
    public static final HashMap[] H;
    public static final HashMap[] I;
    public static final HashSet J;
    public static final HashMap K;
    public static final Charset L;
    public static final byte[] M;
    public static final byte[] N;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final int[] m;
    public static final int[] n;
    public static final byte[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        m = new int[]{8, 8, 8};
        n = new int[]{8};
        o = new byte[]{-1, -40, -1};
        p = new byte[]{102, 116, 121, 112};
        q = new byte[]{109, 105, 102, 49};
        r = new byte[]{104, 101, 105, 99};
        s = new byte[]{79, 76, 89, 77, 80, 0};
        t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        v = new byte[]{101, 88, 73, 102};
        w = new byte[]{73, 72, 68, 82};
        x = new byte[]{73, 69, 78, 68};
        y = new byte[]{82, 73, 70, 70};
        z = new byte[]{87, 69, 66, 80};
        A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        hh0[] hh0VarArr = {new hh0("NewSubfileType", 254, 4), new hh0("SubfileType", 255, 4), new hh0("ImageWidth", 256, 3, 4), new hh0("ImageLength", 257, 3, 4), new hh0("BitsPerSample", 258, 3), new hh0("Compression", 259, 3), new hh0("PhotometricInterpretation", 262, 3), new hh0("ImageDescription", 270, 2), new hh0("Make", 271, 2), new hh0("Model", 272, 2), new hh0("StripOffsets", 273, 3, 4), new hh0("Orientation", 274, 3), new hh0("SamplesPerPixel", 277, 3), new hh0("RowsPerStrip", 278, 3, 4), new hh0("StripByteCounts", 279, 3, 4), new hh0("XResolution", 282, 5), new hh0("YResolution", 283, 5), new hh0("PlanarConfiguration", 284, 3), new hh0("ResolutionUnit", 296, 3), new hh0("TransferFunction", 301, 3), new hh0("Software", 305, 2), new hh0("DateTime", 306, 2), new hh0("Artist", 315, 2), new hh0("WhitePoint", 318, 5), new hh0("PrimaryChromaticities", 319, 5), new hh0("SubIFDPointer", 330, 4), new hh0("JPEGInterchangeFormat", 513, 4), new hh0("JPEGInterchangeFormatLength", 514, 4), new hh0("YCbCrCoefficients", 529, 5), new hh0("YCbCrSubSampling", 530, 3), new hh0("YCbCrPositioning", 531, 3), new hh0("ReferenceBlackWhite", 532, 5), new hh0("Copyright", 33432, 2), new hh0("ExifIFDPointer", 34665, 4), new hh0("GPSInfoIFDPointer", 34853, 4), new hh0("SensorTopBorder", 4, 4), new hh0("SensorLeftBorder", 5, 4), new hh0("SensorBottomBorder", 6, 4), new hh0("SensorRightBorder", 7, 4), new hh0("ISO", 23, 3), new hh0("JpgFromRaw", 46, 7), new hh0("Xmp", 700, 1)};
        hh0[] hh0VarArr2 = {new hh0("ExposureTime", 33434, 5), new hh0("FNumber", 33437, 5), new hh0("ExposureProgram", 34850, 3), new hh0("SpectralSensitivity", 34852, 2), new hh0("PhotographicSensitivity", 34855, 3), new hh0("OECF", 34856, 7), new hh0("SensitivityType", 34864, 3), new hh0("StandardOutputSensitivity", 34865, 4), new hh0("RecommendedExposureIndex", 34866, 4), new hh0("ISOSpeed", 34867, 4), new hh0("ISOSpeedLatitudeyyy", 34868, 4), new hh0("ISOSpeedLatitudezzz", 34869, 4), new hh0("ExifVersion", 36864, 2), new hh0("DateTimeOriginal", 36867, 2), new hh0("DateTimeDigitized", 36868, 2), new hh0("OffsetTime", 36880, 2), new hh0("OffsetTimeOriginal", 36881, 2), new hh0("OffsetTimeDigitized", 36882, 2), new hh0("ComponentsConfiguration", 37121, 7), new hh0("CompressedBitsPerPixel", 37122, 5), new hh0("ShutterSpeedValue", 37377, 10), new hh0("ApertureValue", 37378, 5), new hh0("BrightnessValue", 37379, 10), new hh0("ExposureBiasValue", 37380, 10), new hh0("MaxApertureValue", 37381, 5), new hh0("SubjectDistance", 37382, 5), new hh0("MeteringMode", 37383, 3), new hh0("LightSource", 37384, 3), new hh0("Flash", 37385, 3), new hh0("FocalLength", 37386, 5), new hh0("SubjectArea", 37396, 3), new hh0("MakerNote", 37500, 7), new hh0("UserComment", 37510, 7), new hh0("SubSecTime", 37520, 2), new hh0("SubSecTimeOriginal", 37521, 2), new hh0("SubSecTimeDigitized", 37522, 2), new hh0("FlashpixVersion", 40960, 7), new hh0("ColorSpace", 40961, 3), new hh0("PixelXDimension", 40962, 3, 4), new hh0("PixelYDimension", 40963, 3, 4), new hh0("RelatedSoundFile", 40964, 2), new hh0("InteroperabilityIFDPointer", 40965, 4), new hh0("FlashEnergy", 41483, 5), new hh0("SpatialFrequencyResponse", 41484, 7), new hh0("FocalPlaneXResolution", 41486, 5), new hh0("FocalPlaneYResolution", 41487, 5), new hh0("FocalPlaneResolutionUnit", 41488, 3), new hh0("SubjectLocation", 41492, 3), new hh0("ExposureIndex", 41493, 5), new hh0("SensingMethod", 41495, 3), new hh0("FileSource", 41728, 7), new hh0("SceneType", 41729, 7), new hh0("CFAPattern", 41730, 7), new hh0("CustomRendered", 41985, 3), new hh0("ExposureMode", 41986, 3), new hh0("WhiteBalance", 41987, 3), new hh0("DigitalZoomRatio", 41988, 5), new hh0("FocalLengthIn35mmFilm", 41989, 3), new hh0("SceneCaptureType", 41990, 3), new hh0("GainControl", 41991, 3), new hh0("Contrast", 41992, 3), new hh0("Saturation", 41993, 3), new hh0("Sharpness", 41994, 3), new hh0("DeviceSettingDescription", 41995, 7), new hh0("SubjectDistanceRange", 41996, 3), new hh0("ImageUniqueID", 42016, 2), new hh0("CameraOwnerName", 42032, 2), new hh0("BodySerialNumber", 42033, 2), new hh0("LensSpecification", 42034, 5), new hh0("LensMake", 42035, 2), new hh0("LensModel", 42036, 2), new hh0("Gamma", 42240, 5), new hh0("DNGVersion", 50706, 1), new hh0("DefaultCropSize", 50720, 3, 4)};
        hh0[] hh0VarArr3 = {new hh0("GPSVersionID", 0, 1), new hh0("GPSLatitudeRef", 1, 2), new hh0("GPSLatitude", 2, 5, 10), new hh0("GPSLongitudeRef", 3, 2), new hh0("GPSLongitude", 4, 5, 10), new hh0("GPSAltitudeRef", 5, 1), new hh0("GPSAltitude", 6, 5), new hh0("GPSTimeStamp", 7, 5), new hh0("GPSSatellites", 8, 2), new hh0("GPSStatus", 9, 2), new hh0("GPSMeasureMode", 10, 2), new hh0("GPSDOP", 11, 5), new hh0("GPSSpeedRef", 12, 2), new hh0("GPSSpeed", 13, 5), new hh0("GPSTrackRef", 14, 2), new hh0("GPSTrack", 15, 5), new hh0("GPSImgDirectionRef", 16, 2), new hh0("GPSImgDirection", 17, 5), new hh0("GPSMapDatum", 18, 2), new hh0("GPSDestLatitudeRef", 19, 2), new hh0("GPSDestLatitude", 20, 5), new hh0("GPSDestLongitudeRef", 21, 2), new hh0("GPSDestLongitude", 22, 5), new hh0("GPSDestBearingRef", 23, 2), new hh0("GPSDestBearing", 24, 5), new hh0("GPSDestDistanceRef", 25, 2), new hh0("GPSDestDistance", 26, 5), new hh0("GPSProcessingMethod", 27, 7), new hh0("GPSAreaInformation", 28, 7), new hh0("GPSDateStamp", 29, 2), new hh0("GPSDifferential", 30, 3), new hh0("GPSHPositioningError", 31, 5)};
        hh0[] hh0VarArr4 = {new hh0("InteroperabilityIndex", 1, 2)};
        hh0[] hh0VarArr5 = {new hh0("NewSubfileType", 254, 4), new hh0("SubfileType", 255, 4), new hh0("ThumbnailImageWidth", 256, 3, 4), new hh0("ThumbnailImageLength", 257, 3, 4), new hh0("BitsPerSample", 258, 3), new hh0("Compression", 259, 3), new hh0("PhotometricInterpretation", 262, 3), new hh0("ImageDescription", 270, 2), new hh0("Make", 271, 2), new hh0("Model", 272, 2), new hh0("StripOffsets", 273, 3, 4), new hh0("ThumbnailOrientation", 274, 3), new hh0("SamplesPerPixel", 277, 3), new hh0("RowsPerStrip", 278, 3, 4), new hh0("StripByteCounts", 279, 3, 4), new hh0("XResolution", 282, 5), new hh0("YResolution", 283, 5), new hh0("PlanarConfiguration", 284, 3), new hh0("ResolutionUnit", 296, 3), new hh0("TransferFunction", 301, 3), new hh0("Software", 305, 2), new hh0("DateTime", 306, 2), new hh0("Artist", 315, 2), new hh0("WhitePoint", 318, 5), new hh0("PrimaryChromaticities", 319, 5), new hh0("SubIFDPointer", 330, 4), new hh0("JPEGInterchangeFormat", 513, 4), new hh0("JPEGInterchangeFormatLength", 514, 4), new hh0("YCbCrCoefficients", 529, 5), new hh0("YCbCrSubSampling", 530, 3), new hh0("YCbCrPositioning", 531, 3), new hh0("ReferenceBlackWhite", 532, 5), new hh0("Copyright", 33432, 2), new hh0("ExifIFDPointer", 34665, 4), new hh0("GPSInfoIFDPointer", 34853, 4), new hh0("DNGVersion", 50706, 1), new hh0("DefaultCropSize", 50720, 3, 4)};
        E = new hh0("StripOffsets", 273, 3);
        F = new hh0[][]{hh0VarArr, hh0VarArr2, hh0VarArr3, hh0VarArr4, hh0VarArr5, hh0VarArr, new hh0[]{new hh0("ThumbnailImage", 256, 7), new hh0("CameraSettingsIFDPointer", 8224, 4), new hh0("ImageProcessingIFDPointer", 8256, 4)}, new hh0[]{new hh0("PreviewImageStart", 257, 4), new hh0("PreviewImageLength", 258, 4)}, new hh0[]{new hh0("AspectFrame", 4371, 3)}, new hh0[]{new hh0("ColorSpace", 55, 3)}};
        G = new hh0[]{new hh0("SubIFDPointer", 330, 4), new hh0("ExifIFDPointer", 34665, 4), new hh0("GPSInfoIFDPointer", 34853, 4), new hh0("InteroperabilityIFDPointer", 40965, 4), new hh0("CameraSettingsIFDPointer", 8224, 1), new hh0("ImageProcessingIFDPointer", 8256, 1)};
        H = new HashMap[10];
        I = new HashMap[10];
        J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        L = charsetForName;
        M = "Exif\u0000\u0000".getBytes(charsetForName);
        N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            hh0[][] hh0VarArr6 = F;
            if (i >= hh0VarArr6.length) {
                HashMap map = K;
                hh0[] hh0VarArr7 = G;
                map.put(Integer.valueOf(hh0VarArr7[0].a), 5);
                map.put(Integer.valueOf(hh0VarArr7[1].a), 1);
                map.put(Integer.valueOf(hh0VarArr7[2].a), 2);
                map.put(Integer.valueOf(hh0VarArr7[3].a), 3);
                map.put(Integer.valueOf(hh0VarArr7[4].a), 7);
                map.put(Integer.valueOf(hh0VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            H[i] = new HashMap();
            I[i] = new HashMap();
            for (hh0 hh0Var : hh0VarArr6[i]) {
                H[i].put(Integer.valueOf(hh0Var.a), hh0Var);
                I[i].put(hh0Var.b, hh0Var);
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:39:0x00a5, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:65:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kh0(InputStream inputStream) throws IOException {
        hh0[][] hh0VarArr = F;
        this.d = new HashMap[hh0VarArr.length];
        this.e = new HashSet(hh0VarArr.length);
        this.f = ByteOrder.BIG_ENDIAN;
        boolean z2 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z3 = l;
        if (z2) {
            this.b = (AssetManager.AssetInputStream) inputStream;
            this.a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                mh0.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.b = null;
                this.a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z3) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.b = null;
                this.a = null;
            }
        } else {
            this.b = null;
            this.a = null;
        }
        for (int i = 0; i < hh0VarArr.length; i++) {
            try {
                try {
                    this.d[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z3) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z3) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z3) {
                    return;
                }
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z3) {
                }
                a();
                if (!z3) {
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iF = f(bufferedInputStream);
        this.c = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            fh0 fh0Var = new fh0(bufferedInputStream);
            int i2 = this.c;
            if (i2 == 4) {
                e(fh0Var, 0, 0);
            } else if (i2 == 13) {
                h(fh0Var);
            } else if (i2 == 9) {
                i(fh0Var);
            } else if (i2 == 14) {
                l(fh0Var);
            }
        } else {
            jh0 jh0Var = new jh0(bufferedInputStream);
            int i3 = this.c;
            if (i3 == 12) {
                d(jh0Var);
            } else if (i3 == 7) {
                g(jh0Var);
            } else if (i3 == 10) {
                k(jh0Var);
            } else {
                j(jh0Var);
            }
            jh0Var.c(this.h);
            u(jh0Var);
        }
        a();
        if (!z3) {
            return;
        }
        p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ByteOrder q(fh0 fh0Var) throws IOException {
        short s2 = fh0Var.readShort();
        boolean z2 = l;
        if (s2 == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 != 19789) {
            c80.w("Invalid byte order: ", Integer.toHexString(s2));
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(L);
            map.put("DateTime", new gh0(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", gh0.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", gh0.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", gh0.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", gh0.a(0L, this.f));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b(String str) {
        gh0 gh0VarC = c(str);
        if (gh0VarC != null) {
            int i = gh0VarC.a;
            if (!J.contains(str)) {
                return gh0VarC.f(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                ih0[] ih0VarArr = (ih0[]) gh0VarC.g(this.f);
                if (ih0VarArr == null || ih0VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(ih0VarArr));
                    return null;
                }
                ih0 ih0Var = ih0VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (ih0Var.a / ih0Var.b));
                ih0 ih0Var2 = ih0VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (ih0Var2.a / ih0Var2.b));
                ih0 ih0Var3 = ih0VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (ih0Var3.a / ih0Var3.b)));
            }
            try {
                return Double.toString(gh0VarC.d(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final gh0 c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < F.length; i++) {
            gh0 gh0Var = (gh0) this.d[i].get(str);
            if (gh0Var != null) {
                return gh0Var;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(jh0 jh0Var) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            c80.t("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                nh0.a(mediaMetadataRetriever, new eh0(jh0Var));
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
                HashMap[] mapArr = this.d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", gh0.c(Integer.parseInt(strExtractMetadata), this.f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", gh0.c(Integer.parseInt(strExtractMetadata2), this.f));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", gh0.c(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    jh0Var.c(i2);
                    byte[] bArr = new byte[6];
                    if (jh0Var.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (jh0Var.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.h = i4;
                    r(0, bArr2);
                }
                if (l) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(defpackage.fh0 r23, int r24, int r25) throws java.lang.Throwable {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            java.lang.String r3 = "ExifInterface"
            boolean r4 = defpackage.kh0.l
            if (r4 == 0) goto L1d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getJpegAttributes starting with: "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r3, r5)
        L1d:
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r1.i = r5
            byte r5 = r1.readByte()
            java.lang.String r6 = "Invalid marker: "
            r7 = -1
            if (r5 != r7) goto L1b7
            byte r8 = r1.readByte()
            r9 = -40
            if (r8 != r9) goto L1ad
            r5 = 2
            r6 = r5
        L34:
            byte r8 = r1.readByte()
            if (r8 != r7) goto L1a1
            byte r8 = r1.readByte()
            if (r4 == 0) goto L57
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Found JPEG segment indicator: "
            r9.<init>(r10)
            r10 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r3, r9)
        L57:
            r9 = -39
            if (r8 == r9) goto L19c
            r9 = -38
            if (r8 != r9) goto L61
            goto L19c
        L61:
            int r9 = r1.readUnsignedShort()
            int r10 = r9 + (-2)
            r11 = 4
            int r6 = r6 + r11
            if (r4 == 0) goto L8f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "JPEG segment: "
            r12.<init>(r13)
            r13 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r12.append(r13)
            java.lang.String r13 = " (length: "
            r12.append(r13)
            r12.append(r9)
            java.lang.String r13 = ")"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.d(r3, r12)
        L8f:
            java.lang.String r12 = "Invalid length"
            if (r10 < 0) goto L198
            r13 = -31
            r14 = 0
            java.util.HashMap[] r15 = r0.d
            if (r8 == r13) goto L116
            r13 = -2
            r7 = 1
            if (r8 == r13) goto Le1
            switch(r8) {
                case -64: goto Lac;
                case -63: goto Lac;
                case -62: goto Lac;
                case -61: goto Lac;
                default: goto La1;
            }
        La1:
            switch(r8) {
                case -59: goto Lac;
                case -58: goto Lac;
                case -57: goto Lac;
                default: goto La4;
            }
        La4:
            switch(r8) {
                case -55: goto Lac;
                case -54: goto Lac;
                case -53: goto Lac;
                default: goto La7;
            }
        La7:
            switch(r8) {
                case -51: goto Lac;
                case -50: goto Lac;
                case -49: goto Lac;
                default: goto Laa;
            }
        Laa:
            goto L18a
        Lac:
            r1.b(r7)
            r7 = r15[r2]
            if (r2 == r11) goto Lb6
            java.lang.String r8 = "ImageLength"
            goto Lb8
        Lb6:
            java.lang.String r8 = "ThumbnailImageLength"
        Lb8:
            int r10 = r1.readUnsignedShort()
            long r13 = (long) r10
            java.nio.ByteOrder r10 = r0.f
            gh0 r10 = defpackage.gh0.a(r13, r10)
            r7.put(r8, r10)
            r7 = r15[r2]
            if (r2 == r11) goto Lcd
            java.lang.String r8 = "ImageWidth"
            goto Lcf
        Lcd:
            java.lang.String r8 = "ThumbnailImageWidth"
        Lcf:
            int r10 = r1.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r13 = r0.f
            gh0 r10 = defpackage.gh0.a(r10, r13)
            r7.put(r8, r10)
            int r10 = r9 + (-7)
            goto L18a
        Le1:
            byte[] r8 = new byte[r10]
            int r9 = r1.read(r8)
            if (r9 != r10) goto L110
            java.lang.String r9 = "UserComment"
            java.lang.String r10 = r0.b(r9)
            if (r10 != 0) goto L10d
            r7 = r15[r7]
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r11 = defpackage.kh0.L
            r10.<init>(r8, r11)
            java.lang.String r8 = "\u0000"
            java.lang.String r8 = r10.concat(r8)
            byte[] r8 = r8.getBytes(r11)
            gh0 r10 = new gh0
            int r11 = r8.length
            r10.<init>(r8, r5, r11)
            r7.put(r9, r10)
        L10d:
            r10 = r14
            goto L18a
        L110:
            java.lang.String r0 = "Invalid exif"
            defpackage.c80.v(r0)
            return
        L116:
            byte[] r7 = new byte[r10]
            r1.readFully(r7)
            int r8 = r6 + r10
            byte[] r9 = defpackage.kh0.M
            if (r9 != 0) goto L122
            goto L130
        L122:
            int r11 = r9.length
            if (r10 >= r11) goto L126
            goto L130
        L126:
            r11 = r14
        L127:
            int r13 = r9.length
            if (r11 >= r13) goto L172
            r13 = r7[r11]
            r5 = r9[r11]
            if (r13 == r5) goto L16d
        L130:
            byte[] r5 = defpackage.kh0.N
            if (r5 != 0) goto L135
            goto L188
        L135:
            int r9 = r5.length
            if (r10 >= r9) goto L139
            goto L188
        L139:
            r9 = r14
        L13a:
            int r11 = r5.length
            if (r9 >= r11) goto L147
            r11 = r7[r9]
            r13 = r5[r9]
            if (r11 == r13) goto L144
            goto L188
        L144:
            int r9 = r9 + 1
            goto L13a
        L147:
            int r9 = r5.length
            int r6 = r6 + r9
            int r5 = r5.length
            byte[] r5 = java.util.Arrays.copyOfRange(r7, r5, r10)
            java.lang.String r7 = "Xmp"
            java.lang.String r9 = r0.b(r7)
            if (r9 != 0) goto L188
            r9 = r15[r14]
            gh0 r16 = new gh0
            int r10 = r5.length
            long r14 = (long) r6
            r20 = 1
            r19 = r5
            r21 = r10
            r17 = r14
            r16.<init>(r17, r19, r20, r21)
            r5 = r16
            r9.put(r7, r5)
            goto L188
        L16d:
            int r11 = r11 + 1
            r5 = 2
            r14 = 0
            goto L127
        L172:
            int r5 = r9.length
            byte[] r5 = java.util.Arrays.copyOfRange(r7, r5, r10)
            int r6 = r24 + r6
            int r7 = r9.length
            int r6 = r6 + r7
            r0.h = r6
            r0.r(r2, r5)
            fh0 r6 = new fh0
            r6.<init>(r5)
            r0.u(r6)
        L188:
            r6 = r8
            r10 = 0
        L18a:
            if (r10 < 0) goto L194
            r1.b(r10)
            int r6 = r6 + r10
            r5 = 2
            r7 = -1
            goto L34
        L194:
            defpackage.c80.v(r12)
            return
        L198:
            defpackage.c80.v(r12)
            return
        L19c:
            java.nio.ByteOrder r0 = r0.f
            r1.i = r0
            return
        L1a1:
            r0 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = "Invalid marker:"
            defpackage.c80.w(r1, r0)
            return
        L1ad:
            r0 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            defpackage.c80.w(r6, r0)
            return
        L1b7:
            r0 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            defpackage.c80.w(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh0.e(fh0, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x00bf */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
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
            byte[] bArr3 = o;
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
                        if (Arrays.equals(bArr, p)) {
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
                                boolean z2 = false;
                                boolean z3 = false;
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
                                            if (Arrays.equals(bArr4, q)) {
                                                z2 = true;
                                            } else if (Arrays.equals(bArr4, r)) {
                                                z3 = true;
                                            }
                                            if (z2 && z3) {
                                                fh0Var.close();
                                                return 12;
                                            }
                                        }
                                        j4++;
                                    } catch (Exception e3) {
                                        e = e3;
                                        if (l) {
                                        }
                                        if (fh0Var != null) {
                                            break;
                                        }
                                        fh0 fh0Var5 = new fh0(bArr2);
                                        ByteOrder byteOrderQ = q(fh0Var5);
                                        this.f = byteOrderQ;
                                        fh0Var5.i = byteOrderQ;
                                        short s2 = fh0Var5.readShort();
                                        if (s2 == 20306) {
                                        }
                                        if (i2 != 0) {
                                        }
                                    }
                                }
                            }
                            if (l) {
                                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                            }
                            if (fh0Var != null) {
                                fh0Var.close();
                            }
                            fh0 fh0Var52 = new fh0(bArr2);
                            ByteOrder byteOrderQ2 = q(fh0Var52);
                            this.f = byteOrderQ2;
                            fh0Var52.i = byteOrderQ2;
                            short s22 = fh0Var52.readShort();
                            i2 = (s22 == 20306 || s22 == 21330) ? 1 : i;
                            fh0Var52.close();
                            if (i2 != 0) {
                                return 7;
                            }
                            try {
                                fh0 fh0Var6 = new fh0(bArr2);
                                try {
                                    ByteOrder byteOrderQ3 = q(fh0Var6);
                                    this.f = byteOrderQ3;
                                    fh0Var6.i = byteOrderQ3;
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
                                byte[] bArr5 = u;
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
                                byte[] bArr6 = y;
                                if (i9 >= bArr6.length) {
                                    int i10 = i;
                                    while (true) {
                                        byte[] bArr7 = z;
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
                        ByteOrder byteOrderQ22 = q(fh0Var522);
                        this.f = byteOrderQ22;
                        fh0Var522.i = byteOrderQ22;
                        short s222 = fh0Var522.readShort();
                        if (s222 == 20306) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(jh0 jh0Var) throws Throwable {
        int i;
        int i2;
        j(jh0Var);
        HashMap[] mapArr = this.d;
        gh0 gh0Var = (gh0) mapArr[1].get("MakerNote");
        if (gh0Var != null) {
            jh0 jh0Var2 = new jh0(gh0Var.d);
            jh0Var2.i = this.f;
            byte[] bArr = s;
            byte[] bArr2 = new byte[bArr.length];
            jh0Var2.readFully(bArr2);
            jh0Var2.c(0L);
            byte[] bArr3 = t;
            byte[] bArr4 = new byte[bArr3.length];
            jh0Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                jh0Var2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                jh0Var2.c(12L);
            }
            s(jh0Var2, 6);
            gh0 gh0Var2 = (gh0) mapArr[7].get("PreviewImageStart");
            gh0 gh0Var3 = (gh0) mapArr[7].get("PreviewImageLength");
            if (gh0Var2 != null && gh0Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", gh0Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", gh0Var3);
            }
            gh0 gh0Var4 = (gh0) mapArr[8].get("AspectFrame");
            if (gh0Var4 != null) {
                int[] iArr = (int[]) gh0Var4.g(this.f);
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
                gh0 gh0VarC = gh0.c(i5, this.f);
                gh0 gh0VarC2 = gh0.c(i6, this.f);
                mapArr[0].put("ImageWidth", gh0VarC);
                mapArr[0].put("ImageLength", gh0VarC2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(fh0 fh0Var) throws Throwable {
        if (l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + fh0Var);
        }
        fh0Var.i = ByteOrder.BIG_ENDIAN;
        byte[] bArr = u;
        fh0Var.b(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = fh0Var.readInt();
                byte[] bArr2 = new byte[4];
                if (fh0Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, x)) {
                    return;
                }
                if (Arrays.equals(bArr2, v)) {
                    byte[] bArr3 = new byte[i];
                    if (fh0Var.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + xe1.h(bArr2));
                    }
                    int i3 = fh0Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.h = i2;
                        r(0, bArr3);
                        x();
                        u(new fh0(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                fh0Var.b(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                c80.v("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(fh0 fh0Var) throws Throwable {
        boolean z2 = l;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + fh0Var);
        }
        fh0Var.b(84);
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
        fh0Var.b(i - fh0Var.j);
        fh0Var.read(bArr4);
        e(new fh0(bArr4), i, 5);
        fh0Var.b(i3 - fh0Var.j);
        fh0Var.i = ByteOrder.BIG_ENDIAN;
        int i4 = fh0Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = fh0Var.readUnsignedShort();
            int unsignedShort2 = fh0Var.readUnsignedShort();
            if (unsignedShort == E.a) {
                short s2 = fh0Var.readShort();
                short s3 = fh0Var.readShort();
                gh0 gh0VarC = gh0.c(s2, this.f);
                gh0 gh0VarC2 = gh0.c(s3, this.f);
                HashMap[] mapArr = this.d;
                mapArr[0].put("ImageLength", gh0VarC);
                mapArr[0].put("ImageWidth", gh0VarC2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            fh0Var.b(unsignedShort2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(jh0 jh0Var) throws Throwable {
        o(jh0Var);
        s(jh0Var, 0);
        w(jh0Var, 0);
        w(jh0Var, 5);
        w(jh0Var, 4);
        x();
        if (this.c == 8) {
            HashMap[] mapArr = this.d;
            gh0 gh0Var = (gh0) mapArr[1].get("MakerNote");
            if (gh0Var != null) {
                jh0 jh0Var2 = new jh0(gh0Var.d);
                jh0Var2.i = this.f;
                jh0Var2.b(6);
                s(jh0Var2, 9);
                gh0 gh0Var2 = (gh0) mapArr[9].get("ColorSpace");
                if (gh0Var2 != null) {
                    mapArr[1].put("ColorSpace", gh0Var2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(jh0 jh0Var) throws Throwable {
        if (l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + jh0Var);
        }
        j(jh0Var);
        HashMap[] mapArr = this.d;
        gh0 gh0Var = (gh0) mapArr[0].get("JpgFromRaw");
        if (gh0Var != null) {
            e(new fh0(gh0Var.d), (int) gh0Var.c, 5);
        }
        gh0 gh0Var2 = (gh0) mapArr[0].get("ISO");
        gh0 gh0Var3 = (gh0) mapArr[1].get("PhotographicSensitivity");
        if (gh0Var2 == null || gh0Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", gh0Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(fh0 fh0Var) throws Throwable {
        if (l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + fh0Var);
        }
        fh0Var.i = ByteOrder.LITTLE_ENDIAN;
        fh0Var.b(y.length);
        int i = fh0Var.readInt() + 8;
        byte[] bArr = z;
        fh0Var.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (fh0Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = fh0Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(A, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (fh0Var.read(bArr3) == i2) {
                        this.h = i3;
                        r(0, bArr3);
                        u(new fh0(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + xe1.h(bArr2));
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
                fh0Var.b(i2);
            } catch (EOFException unused) {
                c80.v("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(fh0 fh0Var, HashMap map) throws Throwable {
        gh0 gh0Var = (gh0) map.get("JPEGInterchangeFormat");
        gh0 gh0Var2 = (gh0) map.get("JPEGInterchangeFormatLength");
        if (gh0Var == null || gh0Var2 == null) {
            return;
        }
        int iE = gh0Var.e(this.f);
        int iE2 = gh0Var2.e(this.f);
        if (this.c == 7) {
            iE += this.i;
        }
        if (iE > 0 && iE2 > 0 && this.b == null && this.a == null) {
            fh0Var.skip(iE);
            fh0Var.read(new byte[iE2]);
        }
        if (l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean n(HashMap map) {
        gh0 gh0Var = (gh0) map.get("ImageLength");
        gh0 gh0Var2 = (gh0) map.get("ImageWidth");
        if (gh0Var == null || gh0Var2 == null) {
            return false;
        }
        return gh0Var.e(this.f) <= 512 && gh0Var2.e(this.f) <= 512;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(jh0 jh0Var) throws IOException {
        ByteOrder byteOrderQ = q(jh0Var);
        this.f = byteOrderQ;
        jh0Var.i = byteOrderQ;
        int unsignedShort = jh0Var.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            c80.w("Invalid start code: ", Integer.toHexString(unsignedShort));
            return;
        }
        int i2 = jh0Var.readInt();
        if (i2 < 8) {
            c80.v(vi0.g("Invalid first Ifd offset: ", i2));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            jh0Var.b(i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.d;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbN = vi0.n(i, "The size of tag group[", "]: ");
            sbN.append(mapArr[i].size());
            Log.d("ExifInterface", sbN.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                gh0 gh0Var = (gh0) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + gh0Var.toString() + ", tagValue: '" + gh0Var.f(this.f) + "'");
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(int i, byte[] bArr) throws IOException {
        jh0 jh0Var = new jh0(bArr);
        o(jh0Var);
        s(jh0Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(jh0 jh0Var, int i) throws IOException {
        HashMap[] mapArr;
        short s2;
        boolean z2;
        short s3;
        HashMap[] mapArr2;
        long j;
        long j2;
        boolean z3;
        int i2;
        long j3;
        int i3;
        int i4;
        int unsignedShort;
        long j4;
        Integer numValueOf = Integer.valueOf(jh0Var.j);
        HashSet hashSet = this.e;
        hashSet.add(numValueOf);
        short s4 = jh0Var.readShort();
        boolean z4 = l;
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s4));
        }
        if (s4 <= 0) {
            return;
        }
        short s5 = 0;
        while (true) {
            mapArr = this.d;
            if (s5 >= s4) {
                break;
            }
            int unsignedShort2 = jh0Var.readUnsignedShort();
            int unsignedShort3 = jh0Var.readUnsignedShort();
            int i5 = jh0Var.readInt();
            long j5 = ((long) jh0Var.j) + 4;
            hh0 hh0Var = (hh0) H[i].get(Integer.valueOf(unsignedShort2));
            if (z4) {
                s2 = s4;
                z2 = z4;
                s3 = s5;
                mapArr2 = mapArr;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), hh0Var != null ? hh0Var.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i5)));
            } else {
                s2 = s4;
                z2 = z4;
                s3 = s5;
                mapArr2 = mapArr;
            }
            if (hh0Var != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = C;
                    if (unsignedShort3 < iArr.length) {
                        int i6 = hh0Var.c;
                        if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3 || (i2 = hh0Var.d) == unsignedShort3 || (((i6 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i6 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i6 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i6;
                            }
                            j = j5;
                            j2 = ((long) i5) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z2) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i5);
                                }
                                z3 = false;
                                if (z3) {
                                    jh0Var.c(j);
                                } else {
                                    long j6 = j;
                                    if (j2 > 4) {
                                        int i7 = jh0Var.readInt();
                                        if (z2) {
                                            i3 = unsignedShort2;
                                            Log.d("ExifInterface", "seek to data offset: " + i7);
                                        } else {
                                            i3 = unsignedShort2;
                                        }
                                        if (this.c != 7) {
                                            j3 = j6;
                                            i4 = unsignedShort3;
                                            jh0Var.c(i7);
                                        } else {
                                            if ("MakerNote".equals(hh0Var.b)) {
                                                this.i = i7;
                                            } else {
                                                if (i == 6 && "ThumbnailImage".equals(hh0Var.b)) {
                                                    this.j = i7;
                                                    this.k = i5;
                                                    gh0 gh0VarC = gh0.c(6, this.f);
                                                    j3 = j6;
                                                    gh0 gh0VarA = gh0.a(this.j, this.f);
                                                    i4 = unsignedShort3;
                                                    gh0 gh0VarA2 = gh0.a(this.k, this.f);
                                                    mapArr2[4].put("Compression", gh0VarC);
                                                    mapArr2[4].put("JPEGInterchangeFormat", gh0VarA);
                                                    mapArr2[4].put("JPEGInterchangeFormatLength", gh0VarA2);
                                                }
                                                jh0Var.c(i7);
                                            }
                                            j3 = j6;
                                            i4 = unsignedShort3;
                                            jh0Var.c(i7);
                                        }
                                    } else {
                                        j3 = j6;
                                        i3 = unsignedShort2;
                                        i4 = unsignedShort3;
                                    }
                                    Integer num = (Integer) K.get(Integer.valueOf(i3));
                                    if (z2) {
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
                                            if (z2) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), hh0Var.b));
                                            }
                                            if (j4 <= 0) {
                                                if (!hashSet.contains(Integer.valueOf((int) j4))) {
                                                    jh0Var.c(j4);
                                                    s(jh0Var, num.intValue());
                                                } else if (z2) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j4 + ")");
                                                }
                                            } else if (z2) {
                                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                                            }
                                            jh0Var.c(j3);
                                        } else {
                                            unsignedShort = jh0Var.readUnsignedShort();
                                        }
                                        j4 = unsignedShort;
                                        if (z2) {
                                        }
                                        if (j4 <= 0) {
                                        }
                                        jh0Var.c(j3);
                                    } else {
                                        long j7 = j3;
                                        int i9 = jh0Var.j + this.h;
                                        byte[] bArr = new byte[(int) j2];
                                        jh0Var.readFully(bArr);
                                        gh0 gh0Var = new gh0(i9, bArr, i4, i5);
                                        HashMap map = mapArr2[i];
                                        String str = hh0Var.b;
                                        map.put(str, gh0Var);
                                        if ("DNGVersion".equals(str)) {
                                            this.c = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && gh0Var.f(this.f).contains("PENTAX")) || ("Compression".equals(str) && gh0Var.e(this.f) == 65535)) {
                                            this.c = 8;
                                        }
                                        if (jh0Var.j != j7) {
                                            jh0Var.c(j7);
                                        }
                                    }
                                }
                                s5 = (short) (s3 + 1);
                                s4 = s2;
                                z4 = z2;
                            } else {
                                z3 = true;
                                if (z3) {
                                }
                                s5 = (short) (s3 + 1);
                                s4 = s2;
                                z4 = z2;
                            }
                        } else if (z2) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + B[unsignedShort3] + ") is unexpected for tag: " + hh0Var.b);
                        }
                    }
                }
                j = j5;
                if (z2) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z3 = false;
                if (z3) {
                }
                s5 = (short) (s3 + 1);
                s4 = s2;
                z4 = z2;
            } else if (z2) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j5;
            j2 = 0;
            z3 = false;
            if (z3) {
            }
            s5 = (short) (s3 + 1);
            s4 = s2;
            z4 = z2;
        }
        boolean z5 = z4;
        int i10 = jh0Var.readInt();
        if (z5) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i10)));
        }
        long j8 = i10;
        if (j8 <= 0) {
            if (z5) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        if (hashSet.contains(Integer.valueOf(i10))) {
            if (z5) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        jh0Var.c(j8);
        if (mapArr[4].isEmpty()) {
            s(jh0Var, 4);
        } else if (mapArr[5].isEmpty()) {
            s(jh0Var, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(int i, String str, String str2) {
        HashMap[] mapArr = this.d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(fh0 fh0Var) throws Throwable {
        gh0 gh0Var;
        int iE;
        HashMap map = this.d[4];
        gh0 gh0Var2 = (gh0) map.get("Compression");
        if (gh0Var2 == null) {
            m(fh0Var, map);
            return;
        }
        int iE2 = gh0Var2.e(this.f);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(fh0Var, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        gh0 gh0Var3 = (gh0) map.get("BitsPerSample");
        if (gh0Var3 != null) {
            int[] iArr = (int[]) gh0Var3.g(this.f);
            int[] iArr2 = m;
            if (Arrays.equals(iArr2, iArr) || (this.c == 3 && (gh0Var = (gh0) map.get("PhotometricInterpretation")) != null && (((iE = gh0Var.e(this.f)) == 1 && Arrays.equals(iArr, n)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                gh0 gh0Var4 = (gh0) map.get("StripOffsets");
                gh0 gh0Var5 = (gh0) map.get("StripByteCounts");
                if (gh0Var4 == null || gh0Var5 == null) {
                    return;
                }
                long[] jArrL = xe1.l(gh0Var4.g(this.f));
                long[] jArrL2 = xe1.l(gh0Var5.g(this.f));
                if (jArrL == null || jArrL.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrL2 == null || jArrL2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrL.length != jArrL2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrL2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.g = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrL.length; i3++) {
                    int i4 = (int) jArrL[i3];
                    int i5 = (int) jArrL2[i3];
                    if (i3 < jArrL.length - 1 && i4 + i5 != jArrL[i3 + 1]) {
                        this.g = false;
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
                if (this.g) {
                    long j4 = jArrL[0];
                    return;
                }
                return;
            }
        }
        if (l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.d;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = l;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
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
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (gh0Var3 == null || gh0Var4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = gh0Var.e(this.f);
        int iE2 = gh0Var2.e(this.f);
        int iE3 = gh0Var3.e(this.f);
        int iE4 = gh0Var4.e(this.f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(jh0 jh0Var, int i) throws Throwable {
        gh0 gh0VarC;
        gh0 gh0VarC2;
        HashMap[] mapArr = this.d;
        gh0 gh0Var = (gh0) mapArr[i].get("DefaultCropSize");
        gh0 gh0Var2 = (gh0) mapArr[i].get("SensorTopBorder");
        gh0 gh0Var3 = (gh0) mapArr[i].get("SensorLeftBorder");
        gh0 gh0Var4 = (gh0) mapArr[i].get("SensorBottomBorder");
        gh0 gh0Var5 = (gh0) mapArr[i].get("SensorRightBorder");
        if (gh0Var != null) {
            int i2 = gh0Var.a;
            ByteOrder byteOrder = this.f;
            if (i2 == 5) {
                ih0[] ih0VarArr = (ih0[]) gh0Var.g(byteOrder);
                if (ih0VarArr == null || ih0VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(ih0VarArr));
                    return;
                }
                gh0VarC = gh0.b(ih0VarArr[0], this.f);
                gh0VarC2 = gh0.b(ih0VarArr[1], this.f);
            } else {
                int[] iArr = (int[]) gh0Var.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                gh0VarC = gh0.c(iArr[0], this.f);
                gh0VarC2 = gh0.c(iArr[1], this.f);
            }
            mapArr[i].put("ImageWidth", gh0VarC);
            mapArr[i].put("ImageLength", gh0VarC2);
            return;
        }
        if (gh0Var2 != null && gh0Var3 != null && gh0Var4 != null && gh0Var5 != null) {
            int iE = gh0Var2.e(this.f);
            int iE2 = gh0Var4.e(this.f);
            int iE3 = gh0Var5.e(this.f);
            int iE4 = gh0Var3.e(this.f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            gh0 gh0VarC3 = gh0.c(iE2 - iE, this.f);
            gh0 gh0VarC4 = gh0.c(iE3 - iE4, this.f);
            mapArr[i].put("ImageLength", gh0VarC3);
            mapArr[i].put("ImageWidth", gh0VarC4);
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
            int iE5 = gh0Var8.e(this.f);
            int iE6 = gh0Var8.e(this.f);
            jh0Var.c(iE5);
            byte[] bArr = new byte[iE6];
            jh0Var.read(bArr);
            e(new fh0(bArr), iE5, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x() throws Throwable {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.d;
        gh0 gh0Var = (gh0) mapArr[1].get("PixelXDimension");
        gh0 gh0Var2 = (gh0) mapArr[1].get("PixelYDimension");
        if (gh0Var != null && gh0Var2 != null) {
            mapArr[0].put("ImageWidth", gh0Var);
            mapArr[0].put("ImageLength", gh0Var2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
