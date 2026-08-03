package p000;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
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
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: Fg */
/* JADX INFO: loaded from: classes.dex */
public final class C0238Fg {

    /* JADX INFO: renamed from: A */
    public static final byte[] f754A;

    /* JADX INFO: renamed from: B */
    public static final String[] f755B;

    /* JADX INFO: renamed from: C */
    public static final int[] f756C;

    /* JADX INFO: renamed from: D */
    public static final byte[] f757D;

    /* JADX INFO: renamed from: E */
    public static final C0109Cg f758E;

    /* JADX INFO: renamed from: F */
    public static final C0109Cg[][] f759F;

    /* JADX INFO: renamed from: G */
    public static final C0109Cg[] f760G;

    /* JADX INFO: renamed from: H */
    public static final HashMap[] f761H;

    /* JADX INFO: renamed from: I */
    public static final HashMap[] f762I;

    /* JADX INFO: renamed from: J */
    public static final HashSet f763J;

    /* JADX INFO: renamed from: K */
    public static final HashMap f764K;

    /* JADX INFO: renamed from: L */
    public static final Charset f765L;

    /* JADX INFO: renamed from: M */
    public static final byte[] f766M;

    /* JADX INFO: renamed from: N */
    public static final byte[] f767N;

    /* JADX INFO: renamed from: l */
    public static final boolean f768l = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: m */
    public static final int[] f769m;

    /* JADX INFO: renamed from: n */
    public static final int[] f770n;

    /* JADX INFO: renamed from: o */
    public static final byte[] f771o;

    /* JADX INFO: renamed from: p */
    public static final byte[] f772p;

    /* JADX INFO: renamed from: q */
    public static final byte[] f773q;

    /* JADX INFO: renamed from: r */
    public static final byte[] f774r;

    /* JADX INFO: renamed from: s */
    public static final byte[] f775s;

    /* JADX INFO: renamed from: t */
    public static final byte[] f776t;

    /* JADX INFO: renamed from: u */
    public static final byte[] f777u;

    /* JADX INFO: renamed from: v */
    public static final byte[] f778v;

    /* JADX INFO: renamed from: w */
    public static final byte[] f779w;

    /* JADX INFO: renamed from: x */
    public static final byte[] f780x;

    /* JADX INFO: renamed from: y */
    public static final byte[] f781y;

    /* JADX INFO: renamed from: z */
    public static final byte[] f782z;

    /* JADX INFO: renamed from: a */
    public final FileDescriptor f783a;

    /* JADX INFO: renamed from: b */
    public final AssetManager.AssetInputStream f784b;

    /* JADX INFO: renamed from: c */
    public int f785c;

    /* JADX INFO: renamed from: d */
    public final HashMap[] f786d;

    /* JADX INFO: renamed from: e */
    public final HashSet f787e;

    /* JADX INFO: renamed from: f */
    public ByteOrder f788f;

    /* JADX INFO: renamed from: g */
    public boolean f789g;

    /* JADX INFO: renamed from: h */
    public int f790h;

    /* JADX INFO: renamed from: i */
    public int f791i;

    /* JADX INFO: renamed from: j */
    public int f792j;

    /* JADX INFO: renamed from: k */
    public int f793k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f769m = new int[]{8, 8, 8};
        f770n = new int[]{8};
        f771o = new byte[]{-1, -40, -1};
        f772p = new byte[]{102, 116, 121, 112};
        f773q = new byte[]{109, 105, 102, 49};
        f774r = new byte[]{104, 101, 105, 99};
        f775s = new byte[]{79, 76, 89, 77, 80, 0};
        f776t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f777u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f778v = new byte[]{101, 88, 73, 102};
        f779w = new byte[]{73, 72, 68, 82};
        f780x = new byte[]{73, 69, 78, 68};
        f781y = new byte[]{82, 73, 70, 70};
        f782z = new byte[]{87, 69, 66, 80};
        f754A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f755B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f756C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f757D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C0109Cg[] c0109CgArr = {new C0109Cg("NewSubfileType", 254, 4), new C0109Cg("SubfileType", 255, 4), new C0109Cg("ImageWidth", 256, 3, 4), new C0109Cg("ImageLength", 257, 3, 4), new C0109Cg("BitsPerSample", 258, 3), new C0109Cg("Compression", 259, 3), new C0109Cg("PhotometricInterpretation", 262, 3), new C0109Cg("ImageDescription", 270, 2), new C0109Cg("Make", 271, 2), new C0109Cg("Model", 272, 2), new C0109Cg("StripOffsets", 273, 3, 4), new C0109Cg("Orientation", 274, 3), new C0109Cg("SamplesPerPixel", 277, 3), new C0109Cg("RowsPerStrip", 278, 3, 4), new C0109Cg("StripByteCounts", 279, 3, 4), new C0109Cg("XResolution", 282, 5), new C0109Cg("YResolution", 283, 5), new C0109Cg("PlanarConfiguration", 284, 3), new C0109Cg("ResolutionUnit", 296, 3), new C0109Cg("TransferFunction", 301, 3), new C0109Cg("Software", 305, 2), new C0109Cg("DateTime", 306, 2), new C0109Cg("Artist", 315, 2), new C0109Cg("WhitePoint", 318, 5), new C0109Cg("PrimaryChromaticities", 319, 5), new C0109Cg("SubIFDPointer", 330, 4), new C0109Cg("JPEGInterchangeFormat", 513, 4), new C0109Cg("JPEGInterchangeFormatLength", 514, 4), new C0109Cg("YCbCrCoefficients", 529, 5), new C0109Cg("YCbCrSubSampling", 530, 3), new C0109Cg("YCbCrPositioning", 531, 3), new C0109Cg("ReferenceBlackWhite", 532, 5), new C0109Cg("Copyright", 33432, 2), new C0109Cg("ExifIFDPointer", 34665, 4), new C0109Cg("GPSInfoIFDPointer", 34853, 4), new C0109Cg("SensorTopBorder", 4, 4), new C0109Cg("SensorLeftBorder", 5, 4), new C0109Cg("SensorBottomBorder", 6, 4), new C0109Cg("SensorRightBorder", 7, 4), new C0109Cg("ISO", 23, 3), new C0109Cg("JpgFromRaw", 46, 7), new C0109Cg("Xmp", 700, 1)};
        C0109Cg[] c0109CgArr2 = {new C0109Cg("ExposureTime", 33434, 5), new C0109Cg("FNumber", 33437, 5), new C0109Cg("ExposureProgram", 34850, 3), new C0109Cg("SpectralSensitivity", 34852, 2), new C0109Cg("PhotographicSensitivity", 34855, 3), new C0109Cg("OECF", 34856, 7), new C0109Cg("SensitivityType", 34864, 3), new C0109Cg("StandardOutputSensitivity", 34865, 4), new C0109Cg("RecommendedExposureIndex", 34866, 4), new C0109Cg("ISOSpeed", 34867, 4), new C0109Cg("ISOSpeedLatitudeyyy", 34868, 4), new C0109Cg("ISOSpeedLatitudezzz", 34869, 4), new C0109Cg("ExifVersion", 36864, 2), new C0109Cg("DateTimeOriginal", 36867, 2), new C0109Cg("DateTimeDigitized", 36868, 2), new C0109Cg("OffsetTime", 36880, 2), new C0109Cg("OffsetTimeOriginal", 36881, 2), new C0109Cg("OffsetTimeDigitized", 36882, 2), new C0109Cg("ComponentsConfiguration", 37121, 7), new C0109Cg("CompressedBitsPerPixel", 37122, 5), new C0109Cg("ShutterSpeedValue", 37377, 10), new C0109Cg("ApertureValue", 37378, 5), new C0109Cg("BrightnessValue", 37379, 10), new C0109Cg("ExposureBiasValue", 37380, 10), new C0109Cg("MaxApertureValue", 37381, 5), new C0109Cg("SubjectDistance", 37382, 5), new C0109Cg("MeteringMode", 37383, 3), new C0109Cg("LightSource", 37384, 3), new C0109Cg("Flash", 37385, 3), new C0109Cg("FocalLength", 37386, 5), new C0109Cg("SubjectArea", 37396, 3), new C0109Cg("MakerNote", 37500, 7), new C0109Cg("UserComment", 37510, 7), new C0109Cg("SubSecTime", 37520, 2), new C0109Cg("SubSecTimeOriginal", 37521, 2), new C0109Cg("SubSecTimeDigitized", 37522, 2), new C0109Cg("FlashpixVersion", 40960, 7), new C0109Cg("ColorSpace", 40961, 3), new C0109Cg("PixelXDimension", 40962, 3, 4), new C0109Cg("PixelYDimension", 40963, 3, 4), new C0109Cg("RelatedSoundFile", 40964, 2), new C0109Cg("InteroperabilityIFDPointer", 40965, 4), new C0109Cg("FlashEnergy", 41483, 5), new C0109Cg("SpatialFrequencyResponse", 41484, 7), new C0109Cg("FocalPlaneXResolution", 41486, 5), new C0109Cg("FocalPlaneYResolution", 41487, 5), new C0109Cg("FocalPlaneResolutionUnit", 41488, 3), new C0109Cg("SubjectLocation", 41492, 3), new C0109Cg("ExposureIndex", 41493, 5), new C0109Cg("SensingMethod", 41495, 3), new C0109Cg("FileSource", 41728, 7), new C0109Cg("SceneType", 41729, 7), new C0109Cg("CFAPattern", 41730, 7), new C0109Cg("CustomRendered", 41985, 3), new C0109Cg("ExposureMode", 41986, 3), new C0109Cg("WhiteBalance", 41987, 3), new C0109Cg("DigitalZoomRatio", 41988, 5), new C0109Cg("FocalLengthIn35mmFilm", 41989, 3), new C0109Cg("SceneCaptureType", 41990, 3), new C0109Cg("GainControl", 41991, 3), new C0109Cg("Contrast", 41992, 3), new C0109Cg("Saturation", 41993, 3), new C0109Cg("Sharpness", 41994, 3), new C0109Cg("DeviceSettingDescription", 41995, 7), new C0109Cg("SubjectDistanceRange", 41996, 3), new C0109Cg("ImageUniqueID", 42016, 2), new C0109Cg("CameraOwnerName", 42032, 2), new C0109Cg("BodySerialNumber", 42033, 2), new C0109Cg("LensSpecification", 42034, 5), new C0109Cg("LensMake", 42035, 2), new C0109Cg("LensModel", 42036, 2), new C0109Cg("Gamma", 42240, 5), new C0109Cg("DNGVersion", 50706, 1), new C0109Cg("DefaultCropSize", 50720, 3, 4)};
        C0109Cg[] c0109CgArr3 = {new C0109Cg("GPSVersionID", 0, 1), new C0109Cg("GPSLatitudeRef", 1, 2), new C0109Cg("GPSLatitude", 2, 5, 10), new C0109Cg("GPSLongitudeRef", 3, 2), new C0109Cg("GPSLongitude", 4, 5, 10), new C0109Cg("GPSAltitudeRef", 5, 1), new C0109Cg("GPSAltitude", 6, 5), new C0109Cg("GPSTimeStamp", 7, 5), new C0109Cg("GPSSatellites", 8, 2), new C0109Cg("GPSStatus", 9, 2), new C0109Cg("GPSMeasureMode", 10, 2), new C0109Cg("GPSDOP", 11, 5), new C0109Cg("GPSSpeedRef", 12, 2), new C0109Cg("GPSSpeed", 13, 5), new C0109Cg("GPSTrackRef", 14, 2), new C0109Cg("GPSTrack", 15, 5), new C0109Cg("GPSImgDirectionRef", 16, 2), new C0109Cg("GPSImgDirection", 17, 5), new C0109Cg("GPSMapDatum", 18, 2), new C0109Cg("GPSDestLatitudeRef", 19, 2), new C0109Cg("GPSDestLatitude", 20, 5), new C0109Cg("GPSDestLongitudeRef", 21, 2), new C0109Cg("GPSDestLongitude", 22, 5), new C0109Cg("GPSDestBearingRef", 23, 2), new C0109Cg("GPSDestBearing", 24, 5), new C0109Cg("GPSDestDistanceRef", 25, 2), new C0109Cg("GPSDestDistance", 26, 5), new C0109Cg("GPSProcessingMethod", 27, 7), new C0109Cg("GPSAreaInformation", 28, 7), new C0109Cg("GPSDateStamp", 29, 2), new C0109Cg("GPSDifferential", 30, 3), new C0109Cg("GPSHPositioningError", 31, 5)};
        C0109Cg[] c0109CgArr4 = {new C0109Cg("InteroperabilityIndex", 1, 2)};
        C0109Cg[] c0109CgArr5 = {new C0109Cg("NewSubfileType", 254, 4), new C0109Cg("SubfileType", 255, 4), new C0109Cg("ThumbnailImageWidth", 256, 3, 4), new C0109Cg("ThumbnailImageLength", 257, 3, 4), new C0109Cg("BitsPerSample", 258, 3), new C0109Cg("Compression", 259, 3), new C0109Cg("PhotometricInterpretation", 262, 3), new C0109Cg("ImageDescription", 270, 2), new C0109Cg("Make", 271, 2), new C0109Cg("Model", 272, 2), new C0109Cg("StripOffsets", 273, 3, 4), new C0109Cg("ThumbnailOrientation", 274, 3), new C0109Cg("SamplesPerPixel", 277, 3), new C0109Cg("RowsPerStrip", 278, 3, 4), new C0109Cg("StripByteCounts", 279, 3, 4), new C0109Cg("XResolution", 282, 5), new C0109Cg("YResolution", 283, 5), new C0109Cg("PlanarConfiguration", 284, 3), new C0109Cg("ResolutionUnit", 296, 3), new C0109Cg("TransferFunction", 301, 3), new C0109Cg("Software", 305, 2), new C0109Cg("DateTime", 306, 2), new C0109Cg("Artist", 315, 2), new C0109Cg("WhitePoint", 318, 5), new C0109Cg("PrimaryChromaticities", 319, 5), new C0109Cg("SubIFDPointer", 330, 4), new C0109Cg("JPEGInterchangeFormat", 513, 4), new C0109Cg("JPEGInterchangeFormatLength", 514, 4), new C0109Cg("YCbCrCoefficients", 529, 5), new C0109Cg("YCbCrSubSampling", 530, 3), new C0109Cg("YCbCrPositioning", 531, 3), new C0109Cg("ReferenceBlackWhite", 532, 5), new C0109Cg("Copyright", 33432, 2), new C0109Cg("ExifIFDPointer", 34665, 4), new C0109Cg("GPSInfoIFDPointer", 34853, 4), new C0109Cg("DNGVersion", 50706, 1), new C0109Cg("DefaultCropSize", 50720, 3, 4)};
        f758E = new C0109Cg("StripOffsets", 273, 3);
        f759F = new C0109Cg[][]{c0109CgArr, c0109CgArr2, c0109CgArr3, c0109CgArr4, c0109CgArr5, c0109CgArr, new C0109Cg[]{new C0109Cg("ThumbnailImage", 256, 7), new C0109Cg("CameraSettingsIFDPointer", 8224, 4), new C0109Cg("ImageProcessingIFDPointer", 8256, 4)}, new C0109Cg[]{new C0109Cg("PreviewImageStart", 257, 4), new C0109Cg("PreviewImageLength", 258, 4)}, new C0109Cg[]{new C0109Cg("AspectFrame", 4371, 3)}, new C0109Cg[]{new C0109Cg("ColorSpace", 55, 3)}};
        f760G = new C0109Cg[]{new C0109Cg("SubIFDPointer", 330, 4), new C0109Cg("ExifIFDPointer", 34665, 4), new C0109Cg("GPSInfoIFDPointer", 34853, 4), new C0109Cg("InteroperabilityIFDPointer", 40965, 4), new C0109Cg("CameraSettingsIFDPointer", 8224, 1), new C0109Cg("ImageProcessingIFDPointer", 8256, 1)};
        f761H = new HashMap[10];
        f762I = new HashMap[10];
        f763J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f764K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f765L = charsetForName;
        f766M = "Exif\u0000\u0000".getBytes(charsetForName);
        f767N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C0109Cg[][] c0109CgArr6 = f759F;
            if (i >= c0109CgArr6.length) {
                HashMap map = f764K;
                C0109Cg[] c0109CgArr7 = f760G;
                map.put(Integer.valueOf(c0109CgArr7[0].f254a), 5);
                map.put(Integer.valueOf(c0109CgArr7[1].f254a), 1);
                map.put(Integer.valueOf(c0109CgArr7[2].f254a), 2);
                map.put(Integer.valueOf(c0109CgArr7[3].f254a), 3);
                map.put(Integer.valueOf(c0109CgArr7[4].f254a), 7);
                map.put(Integer.valueOf(c0109CgArr7[5].f254a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f761H[i] = new HashMap();
            f762I[i] = new HashMap();
            for (C0109Cg c0109Cg : c0109CgArr6[i]) {
                f761H[i].put(Integer.valueOf(c0109Cg.f254a), c0109Cg);
                f762I[i].put(c0109Cg.f255b, c0109Cg);
            }
            i++;
        }
    }

    public C0238Fg(InputStream inputStream) throws Throwable {
        C0109Cg[][] c0109CgArr = f759F;
        this.f786d = new HashMap[c0109CgArr.length];
        this.f787e = new HashSet(c0109CgArr.length);
        this.f788f = ByteOrder.BIG_ENDIAN;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f784b = (AssetManager.AssetInputStream) inputStream;
            this.f783a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC0324Hg.m687c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f784b = null;
                this.f783a = fileInputStream.getFD();
            } catch (Exception unused) {
                this.f784b = null;
                this.f783a = null;
            }
        } else {
            this.f784b = null;
            this.f783a = null;
        }
        boolean z = f768l;
        for (int i = 0; i < c0109CgArr.length; i++) {
            try {
                this.f786d[i] = new HashMap();
            } catch (IOException | UnsupportedOperationException unused2) {
                m485a();
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                m485a();
                if (z) {
                    m500p();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iM490f = m490f(bufferedInputStream);
        this.f785c = iM490f;
        if (iM490f == 4 || iM490f == 9 || iM490f == 13 || iM490f == 14) {
            C0023Ag c0023Ag = new C0023Ag(bufferedInputStream);
            int i2 = this.f785c;
            if (i2 == 4) {
                m489e(c0023Ag, 0, 0);
            } else if (i2 == 13) {
                m492h(c0023Ag);
            } else if (i2 == 9) {
                m493i(c0023Ag);
            } else if (i2 == 14) {
                m496l(c0023Ag);
            }
        } else {
            C0195Eg c0195Eg = new C0195Eg(bufferedInputStream);
            int i3 = this.f785c;
            if (i3 == 12) {
                m488d(c0195Eg);
            } else if (i3 == 7) {
                m491g(c0195Eg);
            } else if (i3 == 10) {
                m495k(c0195Eg);
            } else {
                m494j(c0195Eg);
            }
            c0195Eg.m388f(this.f790h);
            m504u(c0195Eg);
        }
        m485a();
        if (!z) {
            return;
        }
        m500p();
    }

    /* JADX INFO: renamed from: q */
    public static ByteOrder m484q(C0023Ag c0023Ag) throws IOException {
        short s = c0023Ag.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    /* JADX INFO: renamed from: a */
    public final void m485a() {
        String strM486b = m486b("DateTimeOriginal");
        HashMap[] mapArr = this.f786d;
        if (strM486b != null && m486b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM486b.concat("\u0000").getBytes(f765L);
            map.put("DateTime", new C0066Bg(bytes, 2, bytes.length));
        }
        if (m486b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C0066Bg.m106a(0L, this.f788f));
        }
        if (m486b("ImageLength") == null) {
            mapArr[0].put("ImageLength", C0066Bg.m106a(0L, this.f788f));
        }
        if (m486b("Orientation") == null) {
            mapArr[0].put("Orientation", C0066Bg.m106a(0L, this.f788f));
        }
        if (m486b("LightSource") == null) {
            mapArr[1].put("LightSource", C0066Bg.m106a(0L, this.f788f));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m486b(String str) {
        C0066Bg c0066BgM487c = m487c(str);
        if (c0066BgM487c != null) {
            if (!f763J.contains(str)) {
                return c0066BgM487c.m111f(this.f788f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c0066BgM487c.f157a;
                if (i == 5 || i == 10) {
                    C0152Dg[] c0152DgArr = (C0152Dg[]) c0066BgM487c.m112g(this.f788f);
                    if (c0152DgArr == null || c0152DgArr.length != 3) {
                        Arrays.toString(c0152DgArr);
                        return null;
                    }
                    C0152Dg c0152Dg = c0152DgArr[0];
                    Integer numValueOf = Integer.valueOf((int) (c0152Dg.f408a / c0152Dg.f409b));
                    C0152Dg c0152Dg2 = c0152DgArr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (c0152Dg2.f408a / c0152Dg2.f409b));
                    C0152Dg c0152Dg3 = c0152DgArr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c0152Dg3.f408a / c0152Dg3.f409b)));
                }
            } else {
                try {
                    return Double.toString(c0066BgM487c.m109d(this.f788f));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C0066Bg m487c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f759F.length; i++) {
            C0066Bg c0066Bg = (C0066Bg) this.f786d[i].get(str);
            if (c0066Bg != null) {
                return c0066Bg;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m488d(C0195Eg c0195Eg) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC0367Ig.m808a(mediaMetadataRetriever, new C2803zg(c0195Eg));
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
                HashMap[] mapArr = this.f786d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C0066Bg.m108c(Integer.parseInt(strExtractMetadata), this.f788f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C0066Bg.m108c(Integer.parseInt(strExtractMetadata2), this.f788f));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", C0066Bg.m108c(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f788f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c0195Eg.m388f(i2);
                    byte[] bArr = new byte[6];
                    c0195Eg.readFully(bArr);
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, f766M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    c0195Eg.readFully(bArr2);
                    this.f790h = i4;
                    m501r(0, bArr2);
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

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0060. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0063. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0141 A[LOOP:0: B:10:0x0024->B:78:0x0141, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fd A[SYNTHETIC] */
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
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m489e(p000.C0023Ag r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0238Fg.m489e(Ag, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec A[RETURN] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m490f(BufferedInputStream bufferedInputStream) throws Throwable {
        C0023Ag c0023Ag;
        C0023Ag c0023Ag2;
        C0023Ag c0023Ag3;
        C0023Ag c0023Ag4;
        boolean z;
        C0023Ag c0023Ag5;
        C0023Ag c0023Ag6;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr2 = f771o;
            if (i >= bArr2.length) {
                return 4;
            }
            if (bArr[i] != bArr2[i]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i2 = 0; i2 < bytes.length; i2++) {
                    if (bArr[i2] != bytes[i2]) {
                        try {
                            c0023Ag2 = new C0023Ag(bArr);
                            try {
                                long j2 = c0023Ag2.readInt();
                                byte[] bArr3 = new byte[4];
                                c0023Ag2.readFully(bArr3);
                                if (Arrays.equals(bArr3, f772p)) {
                                    if (j2 == 1) {
                                        j2 = c0023Ag2.readLong();
                                        j = 16;
                                        if (j2 < 16) {
                                        }
                                    } else {
                                        j = 8;
                                    }
                                    long j3 = 5000;
                                    if (j2 > j3) {
                                        j2 = j3;
                                    }
                                    long j4 = j2 - j;
                                    if (j4 >= 8) {
                                        byte[] bArr4 = new byte[4];
                                        boolean z5 = false;
                                        boolean z6 = false;
                                        for (long j5 = 0; j5 < j4 / 4; j5++) {
                                            try {
                                                c0023Ag2.readFully(bArr4);
                                                if (j5 != 1) {
                                                    if (Arrays.equals(bArr4, f773q)) {
                                                        z5 = true;
                                                    } else if (Arrays.equals(bArr4, f774r)) {
                                                        z6 = true;
                                                    }
                                                    if (z5 && z6) {
                                                        c0023Ag2.close();
                                                        return 12;
                                                    }
                                                }
                                            } catch (EOFException unused) {
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused2) {
                                if (c0023Ag2 != null) {
                                }
                                c0023Ag4 = new C0023Ag(bArr);
                                ByteOrder byteOrderM484q = m484q(c0023Ag4);
                                this.f788f = byteOrderM484q;
                                c0023Ag4.f47c = byteOrderM484q;
                                short s = c0023Ag4.readShort();
                                if (s != 20306) {
                                    c0023Ag4.close();
                                }
                                if (!z) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                c0023Ag = c0023Ag2;
                                if (c0023Ag != null) {
                                    c0023Ag.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused3) {
                            c0023Ag2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            c0023Ag = null;
                        }
                        c0023Ag2.close();
                        try {
                            c0023Ag4 = new C0023Ag(bArr);
                        } catch (Exception unused4) {
                            c0023Ag4 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            c0023Ag3 = null;
                        }
                        try {
                            ByteOrder byteOrderM484q2 = m484q(c0023Ag4);
                            this.f788f = byteOrderM484q2;
                            c0023Ag4.f47c = byteOrderM484q2;
                            short s2 = c0023Ag4.readShort();
                            z = s2 != 20306 || s2 == 21330;
                            c0023Ag4.close();
                        } catch (Exception unused5) {
                            if (c0023Ag4 != null) {
                                c0023Ag4.close();
                            }
                            z = false;
                        } catch (Throwable th4) {
                            th = th4;
                            c0023Ag3 = c0023Ag4;
                            if (c0023Ag3 != null) {
                                c0023Ag3.close();
                            }
                            throw th;
                        }
                        if (!z) {
                            return 7;
                        }
                        try {
                            C0023Ag c0023Ag7 = new C0023Ag(bArr);
                            try {
                                ByteOrder byteOrderM484q3 = m484q(c0023Ag7);
                                this.f788f = byteOrderM484q3;
                                c0023Ag7.f47c = byteOrderM484q3;
                                z2 = c0023Ag7.readShort() == 85;
                                c0023Ag7.close();
                            } catch (Exception unused6) {
                                c0023Ag6 = c0023Ag7;
                                if (c0023Ag6 != null) {
                                    c0023Ag6.close();
                                }
                                z2 = false;
                            } catch (Throwable th5) {
                                th = th5;
                                c0023Ag5 = c0023Ag7;
                                if (c0023Ag5 != null) {
                                    c0023Ag5.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused7) {
                            c0023Ag6 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            c0023Ag5 = null;
                        }
                        if (z2) {
                            return 10;
                        }
                        int i3 = 0;
                        while (true) {
                            byte[] bArr5 = f777u;
                            if (i3 >= bArr5.length) {
                                z3 = true;
                                break;
                            }
                            if (bArr[i3] != bArr5[i3]) {
                                z3 = false;
                                break;
                            }
                            i3++;
                        }
                        if (z3) {
                            return 13;
                        }
                        int i4 = 0;
                        while (true) {
                            byte[] bArr6 = f781y;
                            if (i4 >= bArr6.length) {
                                int i5 = 0;
                                while (true) {
                                    byte[] bArr7 = f782z;
                                    if (i5 >= bArr7.length) {
                                        z4 = true;
                                        break;
                                    }
                                    if (bArr[bArr6.length + i5 + 4] != bArr7[i5]) {
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                if (bArr[i4] != bArr6[i4]) {
                                    break;
                                }
                                i4++;
                            }
                        }
                        z4 = false;
                        return z4 ? 14 : 0;
                    }
                }
                return 9;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m491g(C0195Eg c0195Eg) throws Throwable {
        int i;
        int i2;
        m494j(c0195Eg);
        HashMap[] mapArr = this.f786d;
        C0066Bg c0066Bg = (C0066Bg) mapArr[1].get("MakerNote");
        if (c0066Bg != null) {
            C0195Eg c0195Eg2 = new C0195Eg(c0066Bg.f160d);
            c0195Eg2.f47c = this.f788f;
            byte[] bArr = f775s;
            byte[] bArr2 = new byte[bArr.length];
            c0195Eg2.readFully(bArr2);
            c0195Eg2.m388f(0L);
            byte[] bArr3 = f776t;
            byte[] bArr4 = new byte[bArr3.length];
            c0195Eg2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c0195Eg2.m388f(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c0195Eg2.m388f(12L);
            }
            m502s(c0195Eg2, 6);
            C0066Bg c0066Bg2 = (C0066Bg) mapArr[7].get("PreviewImageStart");
            C0066Bg c0066Bg3 = (C0066Bg) mapArr[7].get("PreviewImageLength");
            if (c0066Bg2 != null && c0066Bg3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c0066Bg2);
                mapArr[5].put("JPEGInterchangeFormatLength", c0066Bg3);
            }
            C0066Bg c0066Bg4 = (C0066Bg) mapArr[8].get("AspectFrame");
            if (c0066Bg4 != null) {
                int[] iArr = (int[]) c0066Bg4.m112g(this.f788f);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
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
                C0066Bg c0066BgM108c = C0066Bg.m108c(i5, this.f788f);
                C0066Bg c0066BgM108c2 = C0066Bg.m108c(i6, this.f788f);
                mapArr[0].put("ImageWidth", c0066BgM108c);
                mapArr[0].put("ImageLength", c0066BgM108c2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m492h(C0023Ag c0023Ag) throws Throwable {
        if (f768l) {
            Objects.toString(c0023Ag);
        }
        c0023Ag.f47c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f777u;
        c0023Ag.m34d(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c0023Ag.readInt();
                byte[] bArr2 = new byte[4];
                c0023Ag.readFully(bArr2);
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f779w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f780x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f778v)) {
                    byte[] bArr3 = new byte[i];
                    c0023Ag.readFully(bArr3);
                    int i3 = c0023Ag.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f790h = i2;
                        m501r(0, bArr3);
                        m507x();
                        m504u(new C0023Ag(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c0023Ag.m34d(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m493i(C0023Ag c0023Ag) throws Throwable {
        if (f768l) {
            Objects.toString(c0023Ag);
        }
        c0023Ag.m34d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0023Ag.readFully(bArr);
        c0023Ag.readFully(bArr2);
        c0023Ag.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c0023Ag.m34d(i - c0023Ag.f46b);
        c0023Ag.readFully(bArr4);
        m489e(new C0023Ag(bArr4), i, 5);
        c0023Ag.m34d(i3 - c0023Ag.f46b);
        c0023Ag.f47c = ByteOrder.BIG_ENDIAN;
        int i4 = c0023Ag.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c0023Ag.readUnsignedShort();
            int unsignedShort2 = c0023Ag.readUnsignedShort();
            if (unsignedShort == f758E.f254a) {
                short s = c0023Ag.readShort();
                short s2 = c0023Ag.readShort();
                C0066Bg c0066BgM108c = C0066Bg.m108c(s, this.f788f);
                C0066Bg c0066BgM108c2 = C0066Bg.m108c(s2, this.f788f);
                HashMap[] mapArr = this.f786d;
                mapArr[0].put("ImageLength", c0066BgM108c);
                mapArr[0].put("ImageWidth", c0066BgM108c2);
                return;
            }
            c0023Ag.m34d(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m494j(C0195Eg c0195Eg) throws Throwable {
        m499o(c0195Eg);
        m502s(c0195Eg, 0);
        m506w(c0195Eg, 0);
        m506w(c0195Eg, 5);
        m506w(c0195Eg, 4);
        m507x();
        if (this.f785c == 8) {
            HashMap[] mapArr = this.f786d;
            C0066Bg c0066Bg = (C0066Bg) mapArr[1].get("MakerNote");
            if (c0066Bg != null) {
                C0195Eg c0195Eg2 = new C0195Eg(c0066Bg.f160d);
                c0195Eg2.f47c = this.f788f;
                c0195Eg2.m34d(6);
                m502s(c0195Eg2, 9);
                C0066Bg c0066Bg2 = (C0066Bg) mapArr[9].get("ColorSpace");
                if (c0066Bg2 != null) {
                    mapArr[1].put("ColorSpace", c0066Bg2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m495k(C0195Eg c0195Eg) throws Throwable {
        if (f768l) {
            Objects.toString(c0195Eg);
        }
        m494j(c0195Eg);
        HashMap[] mapArr = this.f786d;
        C0066Bg c0066Bg = (C0066Bg) mapArr[0].get("JpgFromRaw");
        if (c0066Bg != null) {
            m489e(new C0023Ag(c0066Bg.f160d), (int) c0066Bg.f159c, 5);
        }
        C0066Bg c0066Bg2 = (C0066Bg) mapArr[0].get("ISO");
        C0066Bg c0066Bg3 = (C0066Bg) mapArr[1].get("PhotographicSensitivity");
        if (c0066Bg2 == null || c0066Bg3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c0066Bg2);
    }

    /* JADX INFO: renamed from: l */
    public final void m496l(C0023Ag c0023Ag) throws Throwable {
        if (f768l) {
            Objects.toString(c0023Ag);
        }
        c0023Ag.f47c = ByteOrder.LITTLE_ENDIAN;
        c0023Ag.m34d(f781y.length);
        int i = c0023Ag.readInt() + 8;
        byte[] bArr = f782z;
        c0023Ag.m34d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c0023Ag.readFully(bArr2);
                int i2 = c0023Ag.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f754A, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    c0023Ag.readFully(bArr3);
                    this.f790h = i3;
                    m501r(0, bArr3);
                    m504u(new C0023Ag(bArr3));
                    return;
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
                c0023Ag.m34d(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m497m(C0023Ag c0023Ag, HashMap map) throws Throwable {
        C0066Bg c0066Bg = (C0066Bg) map.get("JPEGInterchangeFormat");
        C0066Bg c0066Bg2 = (C0066Bg) map.get("JPEGInterchangeFormatLength");
        if (c0066Bg == null || c0066Bg2 == null) {
            return;
        }
        int iM110e = c0066Bg.m110e(this.f788f);
        int iM110e2 = c0066Bg2.m110e(this.f788f);
        if (this.f785c == 7) {
            iM110e += this.f791i;
        }
        if (iM110e <= 0 || iM110e2 <= 0 || this.f784b != null || this.f783a != null) {
            return;
        }
        c0023Ag.m34d(iM110e);
        c0023Ag.readFully(new byte[iM110e2]);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m498n(HashMap map) {
        C0066Bg c0066Bg = (C0066Bg) map.get("ImageLength");
        C0066Bg c0066Bg2 = (C0066Bg) map.get("ImageWidth");
        if (c0066Bg == null || c0066Bg2 == null) {
            return false;
        }
        return c0066Bg.m110e(this.f788f) <= 512 && c0066Bg2.m110e(this.f788f) <= 512;
    }

    /* JADX INFO: renamed from: o */
    public final void m499o(C0195Eg c0195Eg) throws IOException {
        ByteOrder byteOrderM484q = m484q(c0195Eg);
        this.f788f = byteOrderM484q;
        c0195Eg.f47c = byteOrderM484q;
        int unsignedShort = c0195Eg.readUnsignedShort();
        int i = this.f785c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = c0195Eg.readInt();
        if (i2 < 8) {
            throw new IOException(AbstractC2374ph.m4812i(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c0195Eg.m34d(i3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m500p() throws Throwable {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f786d;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C0066Bg c0066Bg = (C0066Bg) entry.getValue();
                c0066Bg.toString();
                c0066Bg.m111f(this.f788f);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m501r(int i, byte[] bArr) throws IOException {
        C0195Eg c0195Eg = new C0195Eg(bArr);
        m499o(c0195Eg);
        m502s(c0195Eg, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m502s(C0195Eg c0195Eg, int i) throws IOException {
        boolean z;
        HashMap[] mapArr;
        short s;
        boolean z2;
        long j;
        HashMap[] mapArr2;
        C0109Cg c0109Cg;
        long j2;
        int i2;
        boolean z3;
        HashMap[] mapArr3;
        int i3;
        C0109Cg c0109Cg2;
        int i4;
        int unsignedShort;
        long j3;
        int i5;
        int i6 = i;
        Integer numValueOf = Integer.valueOf(c0195Eg.f46b);
        HashSet hashSet = this.f787e;
        hashSet.add(numValueOf);
        short s2 = c0195Eg.readShort();
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            z = f768l;
            mapArr = this.f786d;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = c0195Eg.readUnsignedShort();
            int unsignedShort3 = c0195Eg.readUnsignedShort();
            int i7 = c0195Eg.readInt();
            short s4 = s3;
            long j4 = ((long) c0195Eg.f46b) + 4;
            C0109Cg c0109Cg3 = (C0109Cg) f761H[i6].get(Integer.valueOf(unsignedShort2));
            if (z) {
                j = 4;
                s = s2;
                z2 = z;
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i6), Integer.valueOf(unsignedShort2), c0109Cg3 != null ? c0109Cg3.f255b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i7));
            } else {
                s = s2;
                z2 = z;
                j = 4;
            }
            if (c0109Cg3 != null && unsignedShort3 > 0) {
                int[] iArr = f756C;
                if (unsignedShort3 < iArr.length) {
                    int i8 = c0109Cg3.f256c;
                    if (i8 == 7 || unsignedShort3 == 7 || i8 == unsignedShort3 || (i2 = c0109Cg3.f257d) == unsignedShort3 || (((i8 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i8 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i8 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i8;
                        }
                        mapArr2 = mapArr;
                        c0109Cg = c0109Cg3;
                        j2 = ((long) i7) * ((long) iArr[unsignedShort3]);
                        z3 = j2 >= 0 && j2 <= 2147483647L;
                    } else {
                        if (z2) {
                            String str = f755B[unsignedShort3];
                        }
                        c0109Cg = c0109Cg3;
                        mapArr2 = mapArr;
                        j2 = 0;
                    }
                } else {
                    c0109Cg = c0109Cg3;
                    mapArr2 = mapArr;
                    j2 = 0;
                }
            }
            if (z3) {
                if (j2 > j) {
                    int i9 = c0195Eg.readInt();
                    if (this.f785c == 7) {
                        mapArr3 = mapArr2;
                        c0109Cg2 = c0109Cg;
                        if ("MakerNote".equals(c0109Cg2.f255b)) {
                            this.f791i = i9;
                        } else if (i6 == 6 && "ThumbnailImage".equals(c0109Cg2.f255b)) {
                            this.f792j = i9;
                            this.f793k = i7;
                            C0066Bg c0066BgM108c = C0066Bg.m108c(6, this.f788f);
                            i3 = unsignedShort2;
                            C0066Bg c0066BgM106a = C0066Bg.m106a(this.f792j, this.f788f);
                            i4 = i7;
                            C0066Bg c0066BgM106a2 = C0066Bg.m106a(this.f793k, this.f788f);
                            mapArr3[4].put("Compression", c0066BgM108c);
                            mapArr3[4].put("JPEGInterchangeFormat", c0066BgM106a);
                            mapArr3[4].put("JPEGInterchangeFormatLength", c0066BgM106a2);
                            c0195Eg.m388f(i9);
                        }
                        i3 = unsignedShort2;
                    } else {
                        mapArr3 = mapArr2;
                        i3 = unsignedShort2;
                        c0109Cg2 = c0109Cg;
                    }
                    i4 = i7;
                    c0195Eg.m388f(i9);
                } else {
                    mapArr3 = mapArr2;
                    i3 = unsignedShort2;
                    c0109Cg2 = c0109Cg;
                    i4 = i7;
                }
                Integer num = (Integer) f764K.get(Integer.valueOf(i3));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j3 = ((long) c0195Eg.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = c0195Eg.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = c0195Eg.readInt();
                        } else {
                            j3 = -1;
                        }
                        if (z2) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j3), c0109Cg2.f255b);
                        }
                        if (j3 > 0 && (((i5 = c0195Eg.f49e) == -1 || j3 < i5) && !hashSet.contains(Integer.valueOf((int) j3)))) {
                            c0195Eg.m388f(j3);
                            m502s(c0195Eg, num.intValue());
                        }
                        c0195Eg.m388f(j4);
                    } else {
                        unsignedShort = c0195Eg.readUnsignedShort();
                    }
                    j3 = unsignedShort;
                    if (z2) {
                    }
                    if (j3 > 0) {
                        c0195Eg.m388f(j3);
                        m502s(c0195Eg, num.intValue());
                    }
                    c0195Eg.m388f(j4);
                } else {
                    int i10 = c0195Eg.f46b + this.f790h;
                    byte[] bArr = new byte[(int) j2];
                    c0195Eg.readFully(bArr);
                    C0066Bg c0066Bg = new C0066Bg(i10, bArr, unsignedShort3, i4);
                    HashMap map = mapArr3[i];
                    String str2 = c0109Cg2.f255b;
                    map.put(str2, c0066Bg);
                    if ("DNGVersion".equals(str2)) {
                        this.f785c = 3;
                    }
                    if ((("Make".equals(str2) || "Model".equals(str2)) && c0066Bg.m111f(this.f788f).contains("PENTAX")) || ("Compression".equals(str2) && c0066Bg.m110e(this.f788f) == 65535)) {
                        this.f785c = 8;
                    }
                    if (c0195Eg.f46b != j4) {
                        c0195Eg.m388f(j4);
                    }
                }
            } else {
                c0195Eg.m388f(j4);
            }
            s3 = (short) (s4 + 1);
            i6 = i;
            s2 = s;
        }
        int i11 = c0195Eg.readInt();
        if (z) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i11));
        }
        long j5 = i11;
        if (j5 <= 0 || hashSet.contains(Integer.valueOf(i11))) {
            return;
        }
        c0195Eg.m388f(j5);
        if (mapArr[4].isEmpty()) {
            m502s(c0195Eg, 4);
        } else if (mapArr[5].isEmpty()) {
            m502s(c0195Eg, 5);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m503t(int i, String str, String str2) {
        HashMap[] mapArr = this.f786d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: renamed from: u */
    public final void m504u(C0023Ag c0023Ag) throws Throwable {
        C0066Bg c0066Bg;
        HashMap map = this.f786d[4];
        C0066Bg c0066Bg2 = (C0066Bg) map.get("Compression");
        if (c0066Bg2 == null) {
            m497m(c0023Ag, map);
            return;
        }
        int iM110e = c0066Bg2.m110e(this.f788f);
        if (iM110e != 1) {
            if (iM110e == 6) {
                m497m(c0023Ag, map);
                return;
            } else if (iM110e != 7) {
                return;
            }
        }
        C0066Bg c0066Bg3 = (C0066Bg) map.get("BitsPerSample");
        if (c0066Bg3 != null) {
            int[] iArr = (int[]) c0066Bg3.m112g(this.f788f);
            int[] iArr2 = f769m;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f785c != 3 || (c0066Bg = (C0066Bg) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iM110e2 = c0066Bg.m110e(this.f788f);
                if ((iM110e2 != 1 || !Arrays.equals(iArr, f770n)) && (iM110e2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            C0066Bg c0066Bg4 = (C0066Bg) map.get("StripOffsets");
            C0066Bg c0066Bg5 = (C0066Bg) map.get("StripByteCounts");
            if (c0066Bg4 == null || c0066Bg5 == null) {
                return;
            }
            long[] jArrM1140h = AbstractC0585Nj.m1140h(c0066Bg4.m112g(this.f788f));
            long[] jArrM1140h2 = AbstractC0585Nj.m1140h(c0066Bg5.m112g(this.f788f));
            if (jArrM1140h == null || jArrM1140h.length == 0 || jArrM1140h2 == null || jArrM1140h2.length == 0 || jArrM1140h.length != jArrM1140h2.length) {
                return;
            }
            long j = 0;
            for (long j2 : jArrM1140h2) {
                j += j2;
            }
            byte[] bArr = new byte[(int) j];
            this.f789g = true;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < jArrM1140h.length; i3++) {
                int i4 = (int) jArrM1140h[i3];
                int i5 = (int) jArrM1140h2[i3];
                if (i3 < jArrM1140h.length - 1 && i4 + i5 != jArrM1140h[i3 + 1]) {
                    this.f789g = false;
                }
                int i6 = i4 - i;
                if (i6 < 0) {
                    return;
                }
                try {
                    c0023Ag.m34d(i6);
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    c0023Ag.readFully(bArr2);
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                } catch (EOFException unused) {
                    return;
                }
            }
            if (this.f789g) {
                long j3 = jArrM1140h[0];
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m505v(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f786d;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        C0066Bg c0066Bg = (C0066Bg) mapArr[i].get("ImageLength");
        C0066Bg c0066Bg2 = (C0066Bg) mapArr[i].get("ImageWidth");
        C0066Bg c0066Bg3 = (C0066Bg) mapArr[i2].get("ImageLength");
        C0066Bg c0066Bg4 = (C0066Bg) mapArr[i2].get("ImageWidth");
        if (c0066Bg == null || c0066Bg2 == null || c0066Bg3 == null || c0066Bg4 == null) {
            return;
        }
        int iM110e = c0066Bg.m110e(this.f788f);
        int iM110e2 = c0066Bg2.m110e(this.f788f);
        int iM110e3 = c0066Bg3.m110e(this.f788f);
        int iM110e4 = c0066Bg4.m110e(this.f788f);
        if (iM110e >= iM110e3 || iM110e2 >= iM110e4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: w */
    public final void m506w(C0195Eg c0195Eg, int i) throws Throwable {
        C0066Bg c0066BgM108c;
        C0066Bg c0066BgM108c2;
        HashMap[] mapArr = this.f786d;
        C0066Bg c0066Bg = (C0066Bg) mapArr[i].get("DefaultCropSize");
        C0066Bg c0066Bg2 = (C0066Bg) mapArr[i].get("SensorTopBorder");
        C0066Bg c0066Bg3 = (C0066Bg) mapArr[i].get("SensorLeftBorder");
        C0066Bg c0066Bg4 = (C0066Bg) mapArr[i].get("SensorBottomBorder");
        C0066Bg c0066Bg5 = (C0066Bg) mapArr[i].get("SensorRightBorder");
        if (c0066Bg != null) {
            if (c0066Bg.f157a == 5) {
                C0152Dg[] c0152DgArr = (C0152Dg[]) c0066Bg.m112g(this.f788f);
                if (c0152DgArr == null || c0152DgArr.length != 2) {
                    Arrays.toString(c0152DgArr);
                    return;
                } else {
                    c0066BgM108c = C0066Bg.m107b(c0152DgArr[0], this.f788f);
                    c0066BgM108c2 = C0066Bg.m107b(c0152DgArr[1], this.f788f);
                }
            } else {
                int[] iArr = (int[]) c0066Bg.m112g(this.f788f);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    c0066BgM108c = C0066Bg.m108c(iArr[0], this.f788f);
                    c0066BgM108c2 = C0066Bg.m108c(iArr[1], this.f788f);
                }
            }
            mapArr[i].put("ImageWidth", c0066BgM108c);
            mapArr[i].put("ImageLength", c0066BgM108c2);
            return;
        }
        if (c0066Bg2 != null && c0066Bg3 != null && c0066Bg4 != null && c0066Bg5 != null) {
            int iM110e = c0066Bg2.m110e(this.f788f);
            int iM110e2 = c0066Bg4.m110e(this.f788f);
            int iM110e3 = c0066Bg5.m110e(this.f788f);
            int iM110e4 = c0066Bg3.m110e(this.f788f);
            if (iM110e2 <= iM110e || iM110e3 <= iM110e4) {
                return;
            }
            C0066Bg c0066BgM108c3 = C0066Bg.m108c(iM110e2 - iM110e, this.f788f);
            C0066Bg c0066BgM108c4 = C0066Bg.m108c(iM110e3 - iM110e4, this.f788f);
            mapArr[i].put("ImageLength", c0066BgM108c3);
            mapArr[i].put("ImageWidth", c0066BgM108c4);
            return;
        }
        C0066Bg c0066Bg6 = (C0066Bg) mapArr[i].get("ImageLength");
        C0066Bg c0066Bg7 = (C0066Bg) mapArr[i].get("ImageWidth");
        if (c0066Bg6 == null || c0066Bg7 == null) {
            C0066Bg c0066Bg8 = (C0066Bg) mapArr[i].get("JPEGInterchangeFormat");
            C0066Bg c0066Bg9 = (C0066Bg) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c0066Bg8 == null || c0066Bg9 == null) {
                return;
            }
            int iM110e5 = c0066Bg8.m110e(this.f788f);
            int iM110e6 = c0066Bg8.m110e(this.f788f);
            c0195Eg.m388f(iM110e5);
            byte[] bArr = new byte[iM110e6];
            c0195Eg.readFully(bArr);
            m489e(new C0023Ag(bArr), iM110e5, i);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m507x() throws Throwable {
        m505v(0, 5);
        m505v(0, 4);
        m505v(5, 4);
        HashMap[] mapArr = this.f786d;
        C0066Bg c0066Bg = (C0066Bg) mapArr[1].get("PixelXDimension");
        C0066Bg c0066Bg2 = (C0066Bg) mapArr[1].get("PixelYDimension");
        if (c0066Bg != null && c0066Bg2 != null) {
            mapArr[0].put("ImageWidth", c0066Bg);
            mapArr[0].put("ImageLength", c0066Bg2);
        }
        if (mapArr[4].isEmpty() && m498n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        m498n(mapArr[4]);
        m503t(0, "ThumbnailOrientation", "Orientation");
        m503t(0, "ThumbnailImageLength", "ImageLength");
        m503t(0, "ThumbnailImageWidth", "ImageWidth");
        m503t(5, "ThumbnailOrientation", "Orientation");
        m503t(5, "ThumbnailImageLength", "ImageLength");
        m503t(5, "ThumbnailImageWidth", "ImageWidth");
        m503t(4, "Orientation", "ThumbnailOrientation");
        m503t(4, "ImageLength", "ThumbnailImageLength");
        m503t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
