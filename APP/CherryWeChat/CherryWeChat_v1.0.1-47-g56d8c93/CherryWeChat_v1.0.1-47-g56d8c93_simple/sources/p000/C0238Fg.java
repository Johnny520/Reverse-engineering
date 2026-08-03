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
import java.util.Iterator;
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
    public static final byte[] f754A = null;

    /* JADX INFO: renamed from: B */
    public static final String[] f755B = null;

    /* JADX INFO: renamed from: C */
    public static final int[] f756C = null;

    /* JADX INFO: renamed from: D */
    public static final byte[] f757D = null;

    /* JADX INFO: renamed from: E */
    public static final C0109Cg f758E = null;

    /* JADX INFO: renamed from: F */
    public static final C0109Cg[][] f759F = null;

    /* JADX INFO: renamed from: G */
    public static final C0109Cg[] f760G = null;

    /* JADX INFO: renamed from: H */
    public static final HashMap[] f761H = null;

    /* JADX INFO: renamed from: I */
    public static final HashMap[] f762I = null;

    /* JADX INFO: renamed from: J */
    public static final HashSet f763J = null;

    /* JADX INFO: renamed from: K */
    public static final HashMap f764K = null;

    /* JADX INFO: renamed from: L */
    public static final Charset f765L = null;

    /* JADX INFO: renamed from: M */
    public static final byte[] f766M = null;

    /* JADX INFO: renamed from: N */
    public static final byte[] f767N = null;

    /* JADX INFO: renamed from: l */
    public static final boolean f768l = false;

    /* JADX INFO: renamed from: m */
    public static final int[] f769m = null;

    /* JADX INFO: renamed from: n */
    public static final int[] f770n = null;

    /* JADX INFO: renamed from: o */
    public static final byte[] f771o = null;

    /* JADX INFO: renamed from: p */
    public static final byte[] f772p = null;

    /* JADX INFO: renamed from: q */
    public static final byte[] f773q = null;

    /* JADX INFO: renamed from: r */
    public static final byte[] f774r = null;

    /* JADX INFO: renamed from: s */
    public static final byte[] f775s = null;

    /* JADX INFO: renamed from: t */
    public static final byte[] f776t = null;

    /* JADX INFO: renamed from: u */
    public static final byte[] f777u = null;

    /* JADX INFO: renamed from: v */
    public static final byte[] f778v = null;

    /* JADX INFO: renamed from: w */
    public static final byte[] f779w = null;

    /* JADX INFO: renamed from: x */
    public static final byte[] f780x = null;

    /* JADX INFO: renamed from: y */
    public static final byte[] f781y = null;

    /* JADX INFO: renamed from: z */
    public static final byte[] f782z = null;

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
        f768l = Log.isLoggable("ExifInterface", 3);
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
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
        C0109Cg[] r69 = {new C0109Cg("NewSubfileType", 254, 4), new C0109Cg("SubfileType", 255, 4), new C0109Cg("ImageWidth", 256, 3, 4), new C0109Cg("ImageLength", 257, 3, 4), new C0109Cg("BitsPerSample", 258, 3), new C0109Cg("Compression", 259, 3), new C0109Cg("PhotometricInterpretation", 262, 3), new C0109Cg("ImageDescription", 270, 2), new C0109Cg("Make", 271, 2), new C0109Cg("Model", 272, 2), new C0109Cg("StripOffsets", 273, 3, 4), new C0109Cg("Orientation", 274, 3), new C0109Cg("SamplesPerPixel", 277, 3), new C0109Cg("RowsPerStrip", 278, 3, 4), new C0109Cg("StripByteCounts", 279, 3, 4), new C0109Cg("XResolution", 282, 5), new C0109Cg("YResolution", 283, 5), new C0109Cg("PlanarConfiguration", 284, 3), new C0109Cg("ResolutionUnit", 296, 3), new C0109Cg("TransferFunction", 301, 3), new C0109Cg("Software", 305, 2), new C0109Cg("DateTime", 306, 2), new C0109Cg("Artist", 315, 2), new C0109Cg("WhitePoint", 318, 5), new C0109Cg("PrimaryChromaticities", 319, 5), new C0109Cg("SubIFDPointer", 330, 4), new C0109Cg("JPEGInterchangeFormat", 513, 4), new C0109Cg("JPEGInterchangeFormatLength", 514, 4), new C0109Cg("YCbCrCoefficients", 529, 5), new C0109Cg("YCbCrSubSampling", 530, 3), new C0109Cg("YCbCrPositioning", 531, 3), new C0109Cg("ReferenceBlackWhite", 532, 5), new C0109Cg("Copyright", 33432, 2), new C0109Cg("ExifIFDPointer", 34665, 4), new C0109Cg("GPSInfoIFDPointer", 34853, 4), new C0109Cg("SensorTopBorder", 4, 4), new C0109Cg("SensorLeftBorder", 5, 4), new C0109Cg("SensorBottomBorder", 6, 4), new C0109Cg("SensorRightBorder", 7, 4), new C0109Cg("ISO", 23, 3), new C0109Cg("JpgFromRaw", 46, 7), new C0109Cg("Xmp", 700, 1)};
        C0109Cg[] r70 = {new C0109Cg("ExposureTime", 33434, 5), new C0109Cg("FNumber", 33437, 5), new C0109Cg("ExposureProgram", 34850, 3), new C0109Cg("SpectralSensitivity", 34852, 2), new C0109Cg("PhotographicSensitivity", 34855, 3), new C0109Cg("OECF", 34856, 7), new C0109Cg("SensitivityType", 34864, 3), new C0109Cg("StandardOutputSensitivity", 34865, 4), new C0109Cg("RecommendedExposureIndex", 34866, 4), new C0109Cg("ISOSpeed", 34867, 4), new C0109Cg("ISOSpeedLatitudeyyy", 34868, 4), new C0109Cg("ISOSpeedLatitudezzz", 34869, 4), new C0109Cg("ExifVersion", 36864, 2), new C0109Cg("DateTimeOriginal", 36867, 2), new C0109Cg("DateTimeDigitized", 36868, 2), new C0109Cg("OffsetTime", 36880, 2), new C0109Cg("OffsetTimeOriginal", 36881, 2), new C0109Cg("OffsetTimeDigitized", 36882, 2), new C0109Cg("ComponentsConfiguration", 37121, 7), new C0109Cg("CompressedBitsPerPixel", 37122, 5), new C0109Cg("ShutterSpeedValue", 37377, 10), new C0109Cg("ApertureValue", 37378, 5), new C0109Cg("BrightnessValue", 37379, 10), new C0109Cg("ExposureBiasValue", 37380, 10), new C0109Cg("MaxApertureValue", 37381, 5), new C0109Cg("SubjectDistance", 37382, 5), new C0109Cg("MeteringMode", 37383, 3), new C0109Cg("LightSource", 37384, 3), new C0109Cg("Flash", 37385, 3), new C0109Cg("FocalLength", 37386, 5), new C0109Cg("SubjectArea", 37396, 3), new C0109Cg("MakerNote", 37500, 7), new C0109Cg("UserComment", 37510, 7), new C0109Cg("SubSecTime", 37520, 2), new C0109Cg("SubSecTimeOriginal", 37521, 2), new C0109Cg("SubSecTimeDigitized", 37522, 2), new C0109Cg("FlashpixVersion", 40960, 7), new C0109Cg("ColorSpace", 40961, 3), new C0109Cg("PixelXDimension", 40962, 3, 4), new C0109Cg("PixelYDimension", 40963, 3, 4), new C0109Cg("RelatedSoundFile", 40964, 2), new C0109Cg("InteroperabilityIFDPointer", 40965, 4), new C0109Cg("FlashEnergy", 41483, 5), new C0109Cg("SpatialFrequencyResponse", 41484, 7), new C0109Cg("FocalPlaneXResolution", 41486, 5), new C0109Cg("FocalPlaneYResolution", 41487, 5), new C0109Cg("FocalPlaneResolutionUnit", 41488, 3), new C0109Cg("SubjectLocation", 41492, 3), new C0109Cg("ExposureIndex", 41493, 5), new C0109Cg("SensingMethod", 41495, 3), new C0109Cg("FileSource", 41728, 7), new C0109Cg("SceneType", 41729, 7), new C0109Cg("CFAPattern", 41730, 7), new C0109Cg("CustomRendered", 41985, 3), new C0109Cg("ExposureMode", 41986, 3), new C0109Cg("WhiteBalance", 41987, 3), new C0109Cg("DigitalZoomRatio", 41988, 5), new C0109Cg("FocalLengthIn35mmFilm", 41989, 3), new C0109Cg("SceneCaptureType", 41990, 3), new C0109Cg("GainControl", 41991, 3), new C0109Cg("Contrast", 41992, 3), new C0109Cg("Saturation", 41993, 3), new C0109Cg("Sharpness", 41994, 3), new C0109Cg("DeviceSettingDescription", 41995, 7), new C0109Cg("SubjectDistanceRange", 41996, 3), new C0109Cg("ImageUniqueID", 42016, 2), new C0109Cg("CameraOwnerName", 42032, 2), new C0109Cg("BodySerialNumber", 42033, 2), new C0109Cg("LensSpecification", 42034, 5), new C0109Cg("LensMake", 42035, 2), new C0109Cg("LensModel", 42036, 2), new C0109Cg("Gamma", 42240, 5), new C0109Cg("DNGVersion", 50706, 1), new C0109Cg("DefaultCropSize", 50720, 3, 4)};
        C0109Cg[] r71 = {new C0109Cg("GPSVersionID", 0, 1), new C0109Cg("GPSLatitudeRef", 1, 2), new C0109Cg("GPSLatitude", 2, 5, 10), new C0109Cg("GPSLongitudeRef", 3, 2), new C0109Cg("GPSLongitude", 4, 5, 10), new C0109Cg("GPSAltitudeRef", 5, 1), new C0109Cg("GPSAltitude", 6, 5), new C0109Cg("GPSTimeStamp", 7, 5), new C0109Cg("GPSSatellites", 8, 2), new C0109Cg("GPSStatus", 9, 2), new C0109Cg("GPSMeasureMode", 10, 2), new C0109Cg("GPSDOP", 11, 5), new C0109Cg("GPSSpeedRef", 12, 2), new C0109Cg("GPSSpeed", 13, 5), new C0109Cg("GPSTrackRef", 14, 2), new C0109Cg("GPSTrack", 15, 5), new C0109Cg("GPSImgDirectionRef", 16, 2), new C0109Cg("GPSImgDirection", 17, 5), new C0109Cg("GPSMapDatum", 18, 2), new C0109Cg("GPSDestLatitudeRef", 19, 2), new C0109Cg("GPSDestLatitude", 20, 5), new C0109Cg("GPSDestLongitudeRef", 21, 2), new C0109Cg("GPSDestLongitude", 22, 5), new C0109Cg("GPSDestBearingRef", 23, 2), new C0109Cg("GPSDestBearing", 24, 5), new C0109Cg("GPSDestDistanceRef", 25, 2), new C0109Cg("GPSDestDistance", 26, 5), new C0109Cg("GPSProcessingMethod", 27, 7), new C0109Cg("GPSAreaInformation", 28, 7), new C0109Cg("GPSDateStamp", 29, 2), new C0109Cg("GPSDifferential", 30, 3), new C0109Cg("GPSHPositioningError", 31, 5)};
        C0109Cg[] r72 = {new C0109Cg("InteroperabilityIndex", 1, 2)};
        C0109Cg[] r73 = {new C0109Cg("NewSubfileType", 254, 4), new C0109Cg("SubfileType", 255, 4), new C0109Cg("ThumbnailImageWidth", 256, 3, 4), new C0109Cg("ThumbnailImageLength", 257, 3, 4), new C0109Cg("BitsPerSample", 258, 3), new C0109Cg("Compression", 259, 3), new C0109Cg("PhotometricInterpretation", 262, 3), new C0109Cg("ImageDescription", 270, 2), new C0109Cg("Make", 271, 2), new C0109Cg("Model", 272, 2), new C0109Cg("StripOffsets", 273, 3, 4), new C0109Cg("ThumbnailOrientation", 274, 3), new C0109Cg("SamplesPerPixel", 277, 3), new C0109Cg("RowsPerStrip", 278, 3, 4), new C0109Cg("StripByteCounts", 279, 3, 4), new C0109Cg("XResolution", 282, 5), new C0109Cg("YResolution", 283, 5), new C0109Cg("PlanarConfiguration", 284, 3), new C0109Cg("ResolutionUnit", 296, 3), new C0109Cg("TransferFunction", 301, 3), new C0109Cg("Software", 305, 2), new C0109Cg("DateTime", 306, 2), new C0109Cg("Artist", 315, 2), new C0109Cg("WhitePoint", 318, 5), new C0109Cg("PrimaryChromaticities", 319, 5), new C0109Cg("SubIFDPointer", 330, 4), new C0109Cg("JPEGInterchangeFormat", 513, 4), new C0109Cg("JPEGInterchangeFormatLength", 514, 4), new C0109Cg("YCbCrCoefficients", 529, 5), new C0109Cg("YCbCrSubSampling", 530, 3), new C0109Cg("YCbCrPositioning", 531, 3), new C0109Cg("ReferenceBlackWhite", 532, 5), new C0109Cg("Copyright", 33432, 2), new C0109Cg("ExifIFDPointer", 34665, 4), new C0109Cg("GPSInfoIFDPointer", 34853, 4), new C0109Cg("DNGVersion", 50706, 1), new C0109Cg("DefaultCropSize", 50720, 3, 4)};
        f758E = new C0109Cg("StripOffsets", 273, 3);
        f759F = new C0109Cg[][]{r69, r70, r71, r72, r73, r69, new C0109Cg[]{new C0109Cg("ThumbnailImage", 256, 7), new C0109Cg("CameraSettingsIFDPointer", 8224, 4), new C0109Cg("ImageProcessingIFDPointer", 8256, 4)}, new C0109Cg[]{new C0109Cg("PreviewImageStart", 257, 4), new C0109Cg("PreviewImageLength", 258, 4)}, new C0109Cg[]{new C0109Cg("AspectFrame", 4371, 3)}, new C0109Cg[]{new C0109Cg("ColorSpace", 55, 3)}};
        f760G = new C0109Cg[]{new C0109Cg("SubIFDPointer", 330, 4), new C0109Cg("ExifIFDPointer", 34665, 4), new C0109Cg("GPSInfoIFDPointer", 34853, 4), new C0109Cg("InteroperabilityIFDPointer", 40965, 4), new C0109Cg("CameraSettingsIFDPointer", 8224, 1), new C0109Cg("ImageProcessingIFDPointer", 8256, 1)};
        f761H = new HashMap[10];
        f762I = new HashMap[10];
        f763J = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
        f764K = new HashMap();
        Charset r0 = Charset.forName("US-ASCII");
        f765L = r0;
        f766M = "Exif\u0000\u0000".getBytes(r0);
        f767N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(r0);
        Locale r1 = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", r1).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", r1).setTimeZone(TimeZone.getTimeZone("UTC"));
        int r02 = 0;
    L3:
        C0109Cg[][] r12 = f759F;
        if (r02 >= r12.length) goto L9;
        f761H[r02] = new HashMap();
        f762I[r02] = new HashMap();
        C0109Cg[] r13 = r12[r02];
        int r2 = r13.length;
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L8;
        C0109Cg r4 = r13[r3];
        f761H[r02].put(Integer.valueOf(r4.f254a), r4);
        f762I[r02].put(r4.f255b, r4);
        r3 = r3 + 1;
        goto L6
    L8:
        r02 = r02 + 1;
        goto L3
    L9:
        HashMap r03 = f764K;
        C0109Cg[] r14 = f760G;
        r03.put(Integer.valueOf(r14[0].f254a), 5);
        r03.put(Integer.valueOf(r14[1].f254a), 1);
        r03.put(Integer.valueOf(r14[2].f254a), 2);
        r03.put(Integer.valueOf(r14[3].f254a), 3);
        r03.put(Integer.valueOf(r14[4].f254a), 7);
        r03.put(Integer.valueOf(r14[5].f254a), 8);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }

    public C0238Fg(InputStream r8) {
        C0109Cg[][] r0 = f759F;
        this.f786d = new HashMap[r0.length];
        this.f787e = new HashSet(r0.length);
        this.f788f = ByteOrder.BIG_ENDIAN;
        if ((r8 instanceof AssetManager.AssetInputStream) == false) goto L6;
        this.f784b = (AssetManager.AssetInputStream) r8;
        this.f783a = null;
    L11:
        boolean r1 = f768l;
        int r3 = 0;
    L57:
    L50:
        m485a();
        if (r1 == false) goto L60;
    L45:
        m500p();
        return;
    L60:
        return;
    L15:
        th = move-exception;
        m485a();
        if (r1 == false) goto L49;
        m500p();
    L49:
        throw th;
    L13:
        if (r3 >= r0.length) goto L17;
        this.f786d[r3] = new HashMap();     // Catch: Throwable -> L15 Throwable -> L50
        r3 = r3 + 1;     // Catch: Throwable -> L15 Throwable -> L50
        goto L57
    L17:
        BufferedInputStream r02 = new BufferedInputStream(r8, 5000);     // Catch: Throwable -> L15 Throwable -> L50
        int r82 = m490f(r02);     // Catch: Throwable -> L15 Throwable -> L50
        this.f785c = r82;     // Catch: Throwable -> L15 Throwable -> L50
        if (r82 == 4) goto L34;
        if (r82 == 9) goto L34;
        if (r82 == 13) goto L34;
        if (r82 == 14) goto L34;
        C0195Eg r83 = new C0195Eg(r02);     // Catch: Throwable -> L15 Throwable -> L50
        int r03 = this.f785c;     // Catch: Throwable -> L15 Throwable -> L50
        if (r03 != 12) goto L27;
        m488d(r83);     // Catch: Throwable -> L15 Throwable -> L50
    L33:
        r83.m388f(this.f790h);     // Catch: Throwable -> L15 Throwable -> L50
        m504u(r83);     // Catch: Throwable -> L15 Throwable -> L50
    L43:
        m485a();
        if (r1 == true) goto L45;
        return;
    L27:
        if (r03 != 7) goto L30;
        m491g(r83);     // Catch: Throwable -> L15 Throwable -> L50
        goto L33
    L30:
        if (r03 != 10) goto L32;
        m495k(r83);     // Catch: Throwable -> L15 Throwable -> L50
        goto L33
    L32:
        m494j(r83);     // Catch: Throwable -> L15 Throwable -> L50
    L34:
        C0023Ag r84 = new C0023Ag(r02);     // Catch: Throwable -> L15 Throwable -> L50
        int r04 = this.f785c;     // Catch: Throwable -> L15 Throwable -> L50
        if (r04 != 4) goto L37;
        m489e(r84, 0, 0);     // Catch: Throwable -> L15 Throwable -> L50
        goto L43
    L37:
        if (r04 != 13) goto L39;
        m492h(r84);     // Catch: Throwable -> L15 Throwable -> L50
        goto L43
    L39:
        if (r04 != 9) goto L41;
        m493i(r84);     // Catch: Throwable -> L15 Throwable -> L50
        goto L43
    L41:
        if (r04 != 14) goto L43;
        m496l(r84);     // Catch: Throwable -> L15 Throwable -> L50
        goto L43
    L6:
        if ((r8 instanceof FileInputStream) == false) goto L10;
        FileInputStream r12 = (FileInputStream) r8;
        AbstractC0324Hg.m687c(r12.getFD(), 0, OsConstants.SEEK_CUR);     // Catch: Exception -> L54
        this.f784b = null;
        this.f783a = r12.getFD();
    L10:
        this.f784b = null;
        this.f783a = null;
        goto L11
    }

    /* JADX INFO: renamed from: q */
    public static ByteOrder m484q(C0023Ag r3) {
        short r32 = r3.readShort();
        if (r32 == 18761) goto L11;
        if (r32 != 19789) goto L9;
        return ByteOrder.BIG_ENDIAN;
    L9:
        throw new IOException("Invalid byte order: " + Integer.toHexString(r32));
    L11:
        return ByteOrder.LITTLE_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public final void m485a() {
        String r0 = m486b("DateTimeOriginal");
        HashMap[] r2 = this.f786d;
        if (r0 == null) goto L8;
        if (m486b("DateTime") != null) goto L8;
        HashMap r4 = r2[0];
        byte[] r02 = r0.concat("\u0000").getBytes(f765L);
        r4.put("DateTime", new C0066Bg(r02, 2, r02.length));
    L8:
        if (m486b("ImageWidth") != null) goto L11;
        r2[0].put("ImageWidth", C0066Bg.m106a(0, this.f788f));
    L11:
        if (m486b("ImageLength") != null) goto L14;
        r2[0].put("ImageLength", C0066Bg.m106a(0, this.f788f));
    L14:
        if (m486b("Orientation") != null) goto L17;
        r2[0].put("Orientation", C0066Bg.m106a(0, this.f788f));
    L17:
        if (m486b("LightSource") != null) goto L20;
        r2[1].put("LightSource", C0066Bg.m106a(0, this.f788f));
        return;
    }

    /* JADX INFO: renamed from: b */
    public final String m486b(String r6) {
        C0066Bg r0 = m487c(r6);
        if (r0 != null) goto L5;
    L26:
        return null;
    L5:
        if (f763J.contains(r6) == true) goto L9;
        return r0.m111f(this.f788f);
    L9:
        if (r6.equals("GPSTimeStamp") == false) goto L28;
        int r62 = r0.f157a;
        if (r62 != 5) goto L13;
    L15:
        C0152Dg[] r63 = (C0152Dg[]) r0.m112g(this.f788f);
        if (r63 != null) goto L18;
    L22:
        Arrays.toString(r63);
        return null;
    L18:
        if (r63.length != 3) goto L22;
        C0152Dg r02 = r63[0];
        Integer r03 = Integer.valueOf((int) (r02.f408a / r02.f409b));
        C0152Dg r1 = r63[1];
        Integer r12 = Integer.valueOf((int) (r1.f408a / r1.f409b));
        C0152Dg r64 = r63[2];
        return String.format("%02d:%02d:%02d", new Object[]{r03, r12, Integer.valueOf((int) (r64.f408a / r64.f409b))});
    L13:
        if (r62 == 10) goto L15;
    L28:
        return Double.toString(r0.m109d(this.f788f));
    }

    /* JADX INFO: renamed from: c */
    public final C0066Bg m487c(String r3) {
        if ("ISOSpeedRatings".equals(r3) == false) goto L5;
        r3 = "PhotographicSensitivity";
    L5:
        int r0 = 0;
    L7:
        if (r0 >= f759F.length) goto L12;
        C0066Bg r1 = (C0066Bg) this.f786d[r0].get(r3);
        if (r1 != null) goto L10;
        r0 = r0 + 1;
        goto L7
    L10:
        return r1;
    L12:
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m488d(C0195Eg r12) {
        MediaMetadataRetriever r1 = new MediaMetadataRetriever();
        AbstractC0367Ig.m808a(r1, new C2803zg(r12));     // Catch: Throwable -> L6 RuntimeException -> L44
        String r2 = r1.extractMetadata(33);     // Catch: Throwable -> L6 RuntimeException -> L44
        String r3 = r1.extractMetadata(34);     // Catch: Throwable -> L6 RuntimeException -> L44
        String r4 = r1.extractMetadata(26);     // Catch: Throwable -> L6 RuntimeException -> L44
        String r5 = r1.extractMetadata(17);     // Catch: Throwable -> L6 RuntimeException -> L44
        if ("yes".equals(r4) == false) goto L9;
        String r0 = r1.extractMetadata(29);     // Catch: Throwable -> L6 RuntimeException -> L44
        String r42 = r1.extractMetadata(30);     // Catch: Throwable -> L6 RuntimeException -> L44
        String r52 = r1.extractMetadata(31);     // Catch: Throwable -> L6 RuntimeException -> L44
    L13:
        HashMap[] r6 = this.f786d;
        if (r0 == null) goto L16;
        r6[0].put("ImageWidth", C0066Bg.m108c(Integer.parseInt(r0), this.f788f));     // Catch: Throwable -> L6 RuntimeException -> L44
    L16:
        if (r42 == null) goto L19;
        r6[0].put("ImageLength", C0066Bg.m108c(Integer.parseInt(r42), this.f788f));     // Catch: Throwable -> L6 RuntimeException -> L44
    L19:
        if (r52 == null) goto L31;
        int r43 = Integer.parseInt(r52);     // Catch: Throwable -> L6 RuntimeException -> L44
        if (r43 != 90) goto L23;
        int r44 = 6;
    L30:
        r6[0].put("Orientation", C0066Bg.m108c(r44, this.f788f));     // Catch: Throwable -> L6 RuntimeException -> L44
        goto L31
    L23:
        if (r43 != 180) goto L25;
        r44 = 3;
        goto L30
    L25:
        if (r43 == 270) goto L27;
        r44 = 1;
        goto L30
    L27:
        r44 = 8;
    L31:
        if (r2 == null) goto L42;
        if (r3 == null) goto L42;
        int r22 = Integer.parseInt(r2);     // Catch: Throwable -> L6 RuntimeException -> L44
        int r32 = Integer.parseInt(r3);     // Catch: Throwable -> L6 RuntimeException -> L44
        if (r32 <= 6) goto L41;
        r12.m388f(r22);     // Catch: Throwable -> L6 RuntimeException -> L44
        byte[] r45 = new byte[6];     // Catch: Throwable -> L6 RuntimeException -> L44
        r12.readFully(r45);     // Catch: Throwable -> L6 RuntimeException -> L44
        int r23 = r22 + 6;     // Catch: Throwable -> L6 RuntimeException -> L44
        int r33 = r32 - 6;
        if (Arrays.equals(r45, f766M) == false) goto L39;
        byte[] r02 = new byte[r33];     // Catch: Throwable -> L6 RuntimeException -> L44
        r12.readFully(r02);     // Catch: Throwable -> L6 RuntimeException -> L44
        this.f790h = r23;     // Catch: Throwable -> L6 RuntimeException -> L44
        m501r(0, r02);     // Catch: Throwable -> L6 RuntimeException -> L44
        goto L42
    L39:
        throw new IOException("Invalid identifier");     // Catch: Throwable -> L6 RuntimeException -> L44
    L41:
        throw new IOException("Invalid exif length");     // Catch: Throwable -> L6 RuntimeException -> L44
    L42:
        r1.release();
        return;
    L9:
        if ("yes".equals(r5) == false) goto L12;
        r0 = r1.extractMetadata(18);     // Catch: Throwable -> L6 RuntimeException -> L44
        r42 = r1.extractMetadata(19);     // Catch: Throwable -> L6 RuntimeException -> L44
        r52 = r1.extractMetadata(24);     // Catch: Throwable -> L6 RuntimeException -> L44
        goto L13
    L12:
        r0 = null;
        r42 = null;
        r52 = null;
    L6:
        th = move-exception;
        r1.release();
        throw th;
    L45:
        throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");     // Catch: Throwable -> L6
    }

    /* JADX INFO: renamed from: e */
    public final void m489e(C0023Ag r23, int r24, int r25) {
        boolean r3 = f768l;
        if (r3 == false) goto L5;
        Objects.toString(r23);
    L5:
        r23.f47c = ByteOrder.BIG_ENDIAN;
        byte r4 = r23.readByte();
        if (r4 != (-1)) goto L90;
        if (r23.readByte() != (-40)) goto L88;
        int r42 = 2;
        int r5 = 2;
    L10:
        byte r7 = r23.readByte();
        if (r7 != (-1)) goto L86;
        byte r72 = r23.readByte();
        if (r3 == false) goto L16;
        Integer.toHexString(r72 & 255);
    L16:
        if (r72 == (-39)) goto L83;
        if (r72 == (-38)) goto L83;
        int r8 = r23.readUnsignedShort();
        int r9 = r8 - 2;
        int r52 = r5 + 4;
        if (r3 == false) goto L24;
        Integer.toHexString(r72 & 255);
    L24:
        if (r9 < 0) goto L82;
        HashMap[] r14 = this.f786d;
        if (r72 != (-31)) goto L28;
        byte[] r73 = new byte[r9];
        r23.readFully(r73);
        int r82 = r52 + r9;
        byte[] r10 = f766M;
        if (r10 != null) goto L51;
    L58:
        byte[] r43 = f767N;
        if (r43 != null) goto L62;
    L76:
        r52 = r82;
    L46:
        r9 = 0;
    L77:
        if (r9 < 0) goto L80;
        r23.m34d(r9);
        r5 = r52 + r9;
        r42 = 2;
        goto L10
    L80:
        throw new IOException("Invalid length");
    L62:
        if (r9 < r43.length) goto L76;
        int r102 = 0;
    L66:
        if (r102 >= r43.length) goto L71;
        if (r73[r102] != r43[r102]) goto L76;
        r102 = r102 + 1;
        goto L66
    L71:
        int r53 = r52 + r43.length;
        byte[] r44 = Arrays.copyOfRange(r73, r43.length, r9);
        if (m486b("Xmp") != null) goto L76;
        r14[0].put("Xmp", new C0066Bg(r53, r44, 1, r44.length));
        goto L76
    L51:
        if (r9 < r10.length) goto L58;
        int r12 = 0;
    L55:
        if (r12 >= r10.length) goto L75;
        if (r73[r12] != r10[r12]) goto L58;
        r12 = r12 + 1;
        goto L55
    L75:
        byte[] r45 = Arrays.copyOfRange(r73, r10.length, r9);
        this.f790h = (r24 + r52) + r10.length;
        m501r(r25, r45);
        m504u(new C0023Ag(r45));
        goto L76
    L28:
        if (r72 == (-2)) goto L43;
        switch(r72) {
            case -64: goto L34;
            case -63: goto L34;
            case -62: goto L34;
            case -61: goto L34;
            default: goto L30;
        };
    L30:
        switch(r72) {
            case -59: goto L34;
            case -58: goto L34;
            case -57: goto L34;
            default: goto L31;
        };
    L31:
        switch(r72) {
            case -55: goto L34;
            case -54: goto L34;
            case -53: goto L34;
            default: goto L32;
        };
    L32:
        switch(r72) {
            case -51: goto L34;
            case -50: goto L34;
            case -49: goto L34;
            default: goto L77;
        };
    L34:
        r23.m34d(1);
        HashMap r74 = r14[r25];
        if (r25 == 4) goto L37;
        String r92 = "ImageLength";
    L38:
        r74.put(r92, C0066Bg.m106a(r23.readUnsignedShort(), this.f788f));
        HashMap r75 = r14[r25];
        if (r25 == 4) goto L41;
        String r93 = "ImageWidth";
    L42:
        r75.put(r93, C0066Bg.m106a(r23.readUnsignedShort(), this.f788f));
        r9 = r8 - 7;
        goto L77
    L41:
        r93 = "ThumbnailImageWidth";
        goto L42
    L37:
        r92 = "ThumbnailImageLength";
        goto L38
    L43:
        byte[] r76 = new byte[r9];
        r23.readFully(r76);
        if (m486b("UserComment") != null) goto L46;
        HashMap r94 = r14[1];
        Charset r122 = f765L;
        byte[] r77 = new String(r76, r122).concat("\u0000").getBytes(r122);
        r94.put("UserComment", new C0066Bg(r77, r42, r77.length));
        goto L46
    L82:
        throw new IOException("Invalid length");
    L83:
        r23.f47c = this.f788f;
        return;
    L86:
        throw new IOException("Invalid marker:" + Integer.toHexString(r7 & 255));
    L88:
        throw new IOException("Invalid marker: " + Integer.toHexString(r4 & 255));
    L90:
        throw new IOException("Invalid marker: " + Integer.toHexString(r4 & 255));
    }

    /* JADX INFO: renamed from: f */
    public final int m490f(BufferedInputStream r18) {
        r18.mark(5000);
        byte[] r3 = new byte[5000];
        r18.read(r3);
        r18.reset();
        int r4 = 0;
    L3:
        byte[] r5 = f771o;
        if (r4 >= r5.length) goto L136;
        if (r3[r4] != r5[r4]) goto L7;
        r4 = r4 + 1;
        goto L3
    L7:
        byte[] r42 = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int r52 = 0;
    L9:
        if (r52 >= r42.length) goto L133;
        if (r3[r52] != r42[r52]) goto L146;
        r52 = r52 + 1;
        goto L9
    L146:
        C0023Ag r6 = new C0023Ag(r3);     // Catch: Throwable -> L49 Exception -> L51
        long r8 = r6.readInt();     // Catch: Throwable -> L21 Exception -> L139
        byte[] r10 = new byte[4];     // Catch: Throwable -> L21 Exception -> L139
        r6.readFully(r10);     // Catch: Throwable -> L21 Exception -> L139
        if (Arrays.equals(r10, f772p) == true) goto L17;
    L15:
        r6.close();
    L150:
        C0023Ag r2 = new C0023Ag(r3);     // Catch: Throwable -> L69 Exception -> L71
    L152:
        ByteOrder r43 = m484q(r2);     // Catch: Throwable -> L67 Exception -> L138
        this.f788f = r43;     // Catch: Throwable -> L67 Exception -> L138
        r2.f47c = r43;     // Catch: Throwable -> L67 Exception -> L138
        short r44 = r2.readShort();     // Catch: Throwable -> L67 Exception -> L138
        goto L75
    L60:
        if (r44 != 20306) goto L62;
    L65:
        boolean r45 = true;
    L66:
        r2.close();
    L78:
        if (r45 == false) goto L148;
        return 7;
    L148:
        C0023Ag r22 = new C0023Ag(r3);     // Catch: Throwable -> L91 Exception -> L93
        ByteOrder r46 = m484q(r22);     // Catch: Throwable -> L88 Exception -> L90
        this.f788f = r46;     // Catch: Throwable -> L88 Exception -> L90
        r22.f47c = r46;     // Catch: Throwable -> L88 Exception -> L90
    L84:
        if (r22.readShort() != 85) goto L86;
        boolean r47 = true;
    L87:
        r22.close();
    L100:
        if (r47 == false) goto L103;
        return 10;
    L103:
        int r23 = 0;
    L104:
        byte[] r48 = f777u;
        if (r23 >= r48.length) goto L110;
        if (r3[r23] != r48[r23]) goto L108;
        r23 = r23 + 1;
        goto L104
    L108:
        boolean r24 = false;
    L111:
        if (r24 == false) goto L114;
        return 13;
    L114:
        int r25 = 0;
    L115:
        byte[] r49 = f781y;
        if (r25 >= r49.length) goto L121;
        if (r3[r25] != r49[r25]) goto L119;
        r25 = r25 + 1;
    L119:
        boolean r53 = false;
    L129:
        if (r53 == false) goto L168;
        return 14;
    L168:
        return 0;
    L121:
        int r26 = 0;
    L122:
        byte[] r54 = f782z;
        if (r26 >= r54.length) goto L128;
        if (r3[(r49.length + r26) + 4] != r54[r26]) goto L119;
        r26 = r26 + 1;
        goto L122
    L128:
        r53 = true;
        goto L129
    L110:
        r24 = true;
        goto L111
    L86:
        r47 = false;
    L90:
        C0023Ag r410 = r22;
    L97:
        if (r410 == null) goto L99;
        r410.close();
    L99:
        r47 = false;
    L88:
        th = th;
        C0023Ag r411 = r22;
    L94:
        if (r411 == null) goto L96;
        r411.close();
    L96:
        throw th;
    L93:
        r410 = null;
    L91:
        th = th;
        r411 = null;
        goto L94
    L62:
        if (r44 == 21330) goto L65;
        r45 = false;
    L67:
        th = th;
        C0023Ag r412 = r2;
    L72:
        if (r412 == null) goto L74;
        r412.close();
    L74:
        throw th;
    L75:
        if (r2 == null) goto L77;
        r2.close();
    L77:
        r45 = false;
    L71:
        r2 = null;
    L69:
        th = th;
        r412 = null;
        goto L72
    L17:
        if (r8 != 1) goto L23;
        r8 = r6.readLong();     // Catch: Throwable -> L21 Exception -> L139
        long r15 = 16;
        if (r8 < 16) goto L15;
    L24:
        long r413 = 5000;
        if (r8 <= r413) goto L27;
        r8 = r413;
    L27:
        long r82 = r8 - r15;     // Catch: Throwable -> L21 Exception -> L139
        if (r82 < 8) goto L15;
        byte[] r27 = new byte[4];     // Catch: Throwable -> L21 Exception -> L139
        long r414 = 0;
        boolean r13 = false;
        boolean r14 = false;
    L31:
        goto L55
    L33:
        if (r414 >= (r82 / 4)) goto L15;
        r6.readFully(r27);     // Catch: EOFException -> L137 Throwable -> L21 Exception -> L139
        if (r414 == 1) goto L48;
        if (Arrays.equals(r27, f773q) == false) goto L42;
        r13 = true;
    L44:
        if (r13 == false) goto L48;
        if (r14 == false) goto L48;
        r6.close();
        return 12;
    L42:
        if (Arrays.equals(r27, f774r) == false) goto L44;
        r14 = true;
    L48:
        r414 = r414 + 1;
        goto L31
    L23:
        r15 = 8;
    L21:
        th = th;
        C0023Ag r415 = r6;
    L52:
        if (r415 == null) goto L54;
        r415.close();
    L54:
        throw th;
    L55:
        if (r6 == null) goto L150;
    L51:
        r6 = null;
    L49:
        th = th;
        r415 = null;
        goto L52
    L133:
        return 9;
    L136:
        return 4;
    }

    /* JADX INFO: renamed from: g */
    public final void m491g(C0195Eg r7) {
        m494j(r7);
        HashMap[] r72 = this.f786d;
        C0066Bg r1 = (C0066Bg) r72[1].get("MakerNote");
        if (r1 == null) goto L32;
        C0195Eg r2 = new C0195Eg(r1.f160d);
        r2.f47c = this.f788f;
        byte[] r12 = f775s;
        byte[] r3 = new byte[r12.length];
        r2.readFully(r3);
        r2.m388f(0);
        byte[] r4 = f776t;
        byte[] r5 = new byte[r4.length];
        r2.readFully(r5);
        if (Arrays.equals(r3, r12) == false) goto L8;
        r2.m388f(8);
    L10:
        m502s(r2, 6);
        C0066Bg r22 = (C0066Bg) r72[7].get("PreviewImageStart");
        C0066Bg r13 = (C0066Bg) r72[7].get("PreviewImageLength");
        if (r22 == null) goto L14;
        if (r13 == null) goto L14;
        r72[5].put("JPEGInterchangeFormat", r22);
        r72[5].put("JPEGInterchangeFormatLength", r13);
    L14:
        C0066Bg r14 = (C0066Bg) r72[8].get("AspectFrame");
        if (r14 == null) goto L33;
        int[] r15 = (int[]) r14.m112g(this.f788f);
        if (r15 != null) goto L19;
    L30:
        Arrays.toString(r15);
        return;
    L19:
        if (r15.length != 4) goto L30;
        int r23 = r15[2];
        int r42 = r15[0];
        if (r23 <= r42) goto L34;
        int r52 = r15[3];
        int r16 = r15[1];
        if (r52 <= r16) goto L35;
        int r24 = (r23 - r42) + 1;
        int r53 = (r52 - r16) + 1;
        if (r24 >= r53) goto L28;
        int r25 = r24 + r53;
        r53 = r25 - r53;
        r24 = r25 - r53;
    L28:
        C0066Bg r0 = C0066Bg.m108c(r24, this.f788f);
        C0066Bg r17 = C0066Bg.m108c(r53, this.f788f);
        r72[0].put("ImageWidth", r0);
        r72[0].put("ImageLength", r17);
        return;
    L35:
        return;
    L34:
        return;
    L33:
        return;
    L8:
        if (Arrays.equals(r5, r4) == false) goto L10;
        r2.m388f(12);
        goto L10
    }

    /* JADX INFO: renamed from: h */
    public final void m492h(C0023Ag r7) {
        if (f768l == false) goto L5;
        Objects.toString(r7);
    L5:
        r7.f47c = ByteOrder.BIG_ENDIAN;
        byte[] r0 = f777u;
        r7.m34d(r0.length);
        int r02 = r0.length;
    L28:
        int r1 = r7.readInt();     // Catch: EOFException -> L26
        byte[] r2 = new byte[4];     // Catch: EOFException -> L26
        r7.readFully(r2);     // Catch: EOFException -> L26
        int r03 = r02 + 8;     // Catch: EOFException -> L26
        if (r03 != 16) goto L14;
        if (Arrays.equals(r2, f779w) == true) goto L14;
        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");     // Catch: EOFException -> L26
    L14:
        if (Arrays.equals(r2, f780x) == true) goto L15;
        if (Arrays.equals(r2, f778v) == true) goto L18;
        int r12 = r1 + 4;     // Catch: EOFException -> L26
        r7.m34d(r12);     // Catch: EOFException -> L26
        r02 = r03 + r12;
        goto L28
    L18:
        byte[] r13 = new byte[r1];     // Catch: EOFException -> L26
        r7.readFully(r13);     // Catch: EOFException -> L26
        int r72 = r7.readInt();     // Catch: EOFException -> L26
        CRC32 r3 = new CRC32();     // Catch: EOFException -> L26
        r3.update(r2);     // Catch: EOFException -> L26
        r3.update(r13);     // Catch: EOFException -> L26
        if (((int) r3.getValue()) != r72) goto L23;
        this.f790h = r03;     // Catch: EOFException -> L26
        m501r(0, r13);     // Catch: EOFException -> L26
        m507x();     // Catch: EOFException -> L26
        m504u(new C0023Ag(r13));     // Catch: EOFException -> L26
        return;
    L23:
        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + r72 + ", calculated CRC value: " + r3.getValue());     // Catch: EOFException -> L26
    L15:
        return;
    L27:
        throw new IOException("Encountered corrupt PNG file.");
    }

    /* JADX INFO: renamed from: i */
    public final void m493i(C0023Ag r7) {
        if (f768l == false) goto L5;
        Objects.toString(r7);
    L5:
        r7.m34d(84);
        byte[] r1 = new byte[4];
        byte[] r2 = new byte[4];
        byte[] r0 = new byte[4];
        r7.readFully(r1);
        r7.readFully(r2);
        r7.readFully(r0);
        int r12 = ByteBuffer.wrap(r1).getInt();
        int r22 = ByteBuffer.wrap(r2).getInt();
        int r02 = ByteBuffer.wrap(r0).getInt();
        byte[] r23 = new byte[r22];
        r7.m34d(r12 - r7.f46b);
        r7.readFully(r23);
        m489e(new C0023Ag(r23), r12, 5);
        r7.m34d(r02 - r7.f46b);
        r7.f47c = ByteOrder.BIG_ENDIAN;
        int r03 = r7.readInt();
        int r24 = 0;
    L6:
        if (r24 >= r03) goto L12;
        int r3 = r7.readUnsignedShort();
        int r4 = r7.readUnsignedShort();
        if (r3 == f758E.f254a) goto L9;
        r7.m34d(r4);
        r24 = r24 + 1;
        goto L6
    L9:
        short r04 = r7.readShort();
        short r72 = r7.readShort();
        C0066Bg r05 = C0066Bg.m108c(r04, this.f788f);
        C0066Bg r73 = C0066Bg.m108c(r72, this.f788f);
        HashMap[] r25 = this.f786d;
        r25[0].put("ImageLength", r05);
        r25[0].put("ImageWidth", r73);
        return;
    }

    /* JADX INFO: renamed from: j */
    public final void m494j(C0195Eg r4) {
        m499o(r4);
        m502s(r4, 0);
        m506w(r4, 0);
        m506w(r4, 5);
        m506w(r4, 4);
        m507x();
        if (this.f785c != 8) goto L10;
        HashMap[] r42 = this.f786d;
        C0066Bg r1 = (C0066Bg) r42[1].get("MakerNote");
        if (r1 == null) goto L11;
        C0195Eg r2 = new C0195Eg(r1.f160d);
        r2.f47c = this.f788f;
        r2.m34d(6);
        m502s(r2, 9);
        C0066Bg r12 = (C0066Bg) r42[9].get("ColorSpace");
        if (r12 == null) goto L12;
        r42[1].put("ColorSpace", r12);
        return;
    L12:
        return;
    L11:
        return;
    }

    /* JADX INFO: renamed from: k */
    public final void m495k(C0195Eg r6) {
        if (f768l == false) goto L5;
        Objects.toString(r6);
    L5:
        m494j(r6);
        HashMap[] r62 = this.f786d;
        C0066Bg r1 = (C0066Bg) r62[0].get("JpgFromRaw");
        if (r1 == null) goto L8;
        m489e(new C0023Ag(r1.f160d), (int) r1.f159c, 5);
    L8:
        C0066Bg r0 = (C0066Bg) r62[0].get("ISO");
        C0066Bg r2 = (C0066Bg) r62[1].get("PhotographicSensitivity");
        if (r0 == null) goto L13;
        if (r2 != null) goto L14;
        r62[1].put("PhotographicSensitivity", r0);
        return;
    L14:
        return;
    }

    /* JADX INFO: renamed from: l */
    public final void m496l(C0023Ag r6) {
        if (f768l == false) goto L5;
        Objects.toString(r6);
    L5:
        r6.f47c = ByteOrder.LITTLE_ENDIAN;
        r6.m34d(f781y.length);
        int r0 = r6.readInt() + 8;
        byte[] r1 = f782z;
        r6.m34d(r1.length);
        int r12 = r1.length + 8;
    L23:
        byte[] r2 = new byte[4];     // Catch: EOFException -> L21
        r6.readFully(r2);     // Catch: EOFException -> L21
        int r3 = r6.readInt();     // Catch: EOFException -> L21
        int r13 = r12 + 8;     // Catch: EOFException -> L21
        if (Arrays.equals(f754A, r2) == true) goto L9;
        if ((r3 % 2) != 1) goto L14;
        r3 = r3 + 1;     // Catch: EOFException -> L21
    L14:
        r12 = r13 + r3;     // Catch: EOFException -> L21
        if (r12 == r0) goto L16;
        if (r12 > r0) goto L20;
        r6.m34d(r3);     // Catch: EOFException -> L21
        goto L23
    L20:
        throw new IOException("Encountered WebP file with invalid chunk size");     // Catch: EOFException -> L21
    L16:
        return;
    L9:
        byte[] r02 = new byte[r3];     // Catch: EOFException -> L21
        r6.readFully(r02);     // Catch: EOFException -> L21
        this.f790h = r13;     // Catch: EOFException -> L21
        m501r(0, r02);     // Catch: EOFException -> L21
        m504u(new C0023Ag(r02));     // Catch: EOFException -> L21
        return;
    L22:
        throw new IOException("Encountered corrupt WebP file.");
    }

    /* JADX INFO: renamed from: m */
    public final void m497m(C0023Ag r4, HashMap r5) {
        C0066Bg r0 = (C0066Bg) r5.get("JPEGInterchangeFormat");
        C0066Bg r52 = (C0066Bg) r5.get("JPEGInterchangeFormatLength");
        if (r0 == null) goto L16;
        if (r52 == null) goto L17;
        int r02 = r0.m110e(this.f788f);
        int r53 = r52.m110e(this.f788f);
        if (this.f785c != 7) goto L8;
        r02 = r02 + this.f791i;
    L8:
        if (r02 <= 0) goto L18;
        if (r53 > 0) goto L11;
        return;
    L11:
        if (this.f784b == null) goto L13;
        return;
    L13:
        if (this.f783a != null) goto L21;
        r4.m34d(r02);
        r4.readFully(new byte[r53]);
        return;
    L21:
        return;
    L18:
        return;
    L17:
        return;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m498n(HashMap r3) {
        C0066Bg r0 = (C0066Bg) r3.get("ImageLength");
        C0066Bg r32 = (C0066Bg) r3.get("ImageWidth");
        if (r0 == null) goto L10;
        if (r32 == null) goto L12;
        int r02 = r0.m110e(this.f788f);
        int r33 = r32.m110e(this.f788f);
        if (r02 > 512) goto L13;
        if (r33 > 512) goto L14;
        return true;
    L14:
        return false;
    L13:
        return false;
    L12:
        return false;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m499o(C0195Eg r4) {
        ByteOrder r0 = m484q(r4);
        this.f788f = r0;
        r4.f47c = r0;
        int r02 = r4.readUnsignedShort();
        int r1 = this.f785c;
        if (r1 != 7) goto L5;
    L11:
        int r03 = r4.readInt();
        if (r03 < 8) goto L18;
        int r04 = r03 - 8;
        if (r04 <= 0) goto L19;
        r4.m34d(r04);
        return;
    L19:
        return;
    L18:
        throw new IOException(AbstractC2374ph.m4812i(r03, "Invalid first Ifd offset: "));
    L5:
        if (r1 == 10) goto L11;
        if (r02 == 42) goto L11;
        throw new IOException("Invalid start code: " + Integer.toHexString(r02));
    }

    /* JADX INFO: renamed from: p */
    public final void m500p() {
        int r0 = 0;
    L3:
        HashMap[] r1 = this.f786d;
        if (r0 >= r1.length) goto L10;
        r1[r0].size();
        Iterator r12 = r1[r0].entrySet().iterator();
    L7:
        if (r12.hasNext() == false) goto L9;
        Map.Entry r2 = (Map.Entry) r12.next();
        C0066Bg r3 = (C0066Bg) r2.getValue();
        String r22 = (String) r2.getKey();
        r3.toString();
        r3.m111f(this.f788f);
        goto L7
    L9:
        r0 = r0 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: r */
    public final void m501r(int r2, byte[] r3) {
        C0195Eg r0 = new C0195Eg(r3);
        m499o(r0);
        m502s(r0, r2);
    }

    /* JADX INFO: renamed from: s */
    public final void m502s(C0195Eg r27, int r28) {
        int r2 = r28;
        Integer r3 = Integer.valueOf(r27.f46b);
        HashSet r4 = this.f787e;
        r4.add(r3);
        short r32 = r27.readShort();
        if (r32 <= 0) goto L152;
        short r6 = 0;
    L6:
        boolean r7 = f768l;
        HashMap[] r10 = this.f786d;
        if (r6 >= r32) goto L129;
        int r12 = r27.readUnsignedShort();
        int r13 = r27.readUnsignedShort();
        int r14 = r27.readInt();
        short r20 = r6;
        long r5 = ((long) r27.f46b) + 4;
        C0109Cg r8 = (C0109Cg) f761H[r2].get(Integer.valueOf(r12));
        if (r7 == false) goto L16;
        Integer r9 = Integer.valueOf(r2);
        long r21 = 4;
        Integer r15 = Integer.valueOf(r12);
        if (r8 == null) goto L14;
        String r11 = r8.f255b;
    L13:
        short r23 = r32;
        boolean r17 = r7;
        String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", new Object[]{r9, r15, r11, Integer.valueOf(r13), Integer.valueOf(r14)});
    L18:
        if (r8 != null) goto L20;
    L19:
        C0109Cg r25 = r8;
        HashMap[] r33 = r10;
        long r92 = 0;
    L60:
        boolean r72 = false;
    L62:
        if (r72 == true) goto L65;
        r27.m388f(r5);
    L128:
        r6 = (short) (r20 + 1);
        r2 = r28;
        r32 = r23;
        goto L6
    L65:
        if (r92 <= r21) goto L80;
        int r73 = r27.readInt();
        if (this.f785c != 7) goto L78;
        HashMap[] r22 = r33;
        C0109Cg r152 = r25;
        if ("MakerNote".equals(r152.f255b) == false) goto L74;
        this.f791i = r73;
    L71:
        int r24 = r12;
    L72:
        int r252 = r14;
    L79:
        r27.m388f(r73);
    L81:
        Integer r26 = (Integer) f764K.get(Integer.valueOf(r24));
        if (r26 != null) goto L84;
        int r29 = r27.f46b + this.f790h;
        byte[] r34 = new byte[(int) r92];
        r27.readFully(r34);
        C0066Bg r142 = new C0066Bg(r29, r34, r13, r252);
        HashMap r35 = r22[r28];
        String r210 = r152.f255b;
        r35.put(r210, r142);
        if ("DNGVersion".equals(r210) == false) goto L115;
        this.f785c = 3;
    L115:
        if ("Make".equals(r210) == true) goto L119;
        if ("Model".equals(r210) == true) goto L119;
    L121:
        if ("Compression".equals(r210) == false) goto L126;
        if (r142.m110e(this.f788f) != 65535) goto L126;
    L124:
        this.f785c = 8;
    L126:
        if (r27.f46b == r5) goto L128;
        r27.m388f(r5);
    L119:
        if (r142.m111f(this.f788f).contains("PENTAX") == true) goto L124;
    L84:
        if (r13 != 3) goto L86;
        int r36 = r27.readUnsignedShort();
    L95:
        long r74 = r36;
    L99:
        if (r17 == false) goto L102;
        String.format("Offset: %d, tagName: %s", new Object[]{Long.valueOf(r74), r152.f255b});
    L102:
        if (r74 <= 0) goto L110;
        int r37 = r27.f49e;
        if (r37 == (-1)) goto L108;
        if (r74 >= r37) goto L110;
    L108:
        if (r4.contains(Integer.valueOf((int) r74)) == true) goto L110;
        r27.m388f(r74);
        m502s(r27, r26.intValue());
    L110:
        r27.m388f(r5);
        goto L128
    L86:
        if (r13 != 4) goto L88;
        r74 = ((long) r27.readInt()) & 4294967295L;
        goto L99
    L88:
        if (r13 != 8) goto L90;
        r36 = r27.readShort();
        goto L95
    L90:
        if (r13 != 9) goto L92;
    L94:
        r36 = r27.readInt();
        goto L95
    L92:
        if (r13 == 13) goto L94;
        r74 = -1;
        goto L99
    L74:
        if (r2 != 6) goto L71;
        if ("ThumbnailImage".equals(r152.f255b) == false) goto L71;
        this.f792j = r73;
        this.f793k = r14;
        C0066Bg r38 = C0066Bg.m108c(6, this.f788f);
        r24 = r12;
        C0066Bg r211 = C0066Bg.m106a(this.f792j, this.f788f);
        r252 = r14;
        C0066Bg r112 = C0066Bg.m106a(this.f793k, this.f788f);
        r22[4].put("Compression", r38);
        r22[4].put("JPEGInterchangeFormat", r211);
        r22[4].put("JPEGInterchangeFormatLength", r112);
        goto L79
    L78:
        r22 = r33;
        r24 = r12;
        r152 = r25;
        goto L72
    L80:
        r22 = r33;
        r24 = r12;
        r152 = r25;
        r252 = r14;
        goto L81
    L20:
        if (r13 <= 0) goto L19;
        int[] r153 = f756C;
        if (r13 >= r153.length) goto L19;
        int r75 = r8.f256c;
        if (r75 == 7) goto L52;
        if (r13 == 7) goto L52;
        if (r75 == r13) goto L52;
        int r113 = r8.f257d;
        if (r113 == r13) goto L52;
        if (r75 == 4) goto L37;
        if (r113 == 4) goto L37;
    L39:
        if (r75 == 9) goto L42;
        if (r113 == 9) goto L42;
    L45:
        if (r75 == 12) goto L48;
        if (r113 == 12) goto L48;
    L50:
        if (r17 == false) goto L19;
        String r39 = f755B[r13];
    L48:
        if (r13 != 11) goto L50;
    L42:
        if (r13 != 8) goto L45;
    L37:
        if (r13 != 3) goto L39;
    L52:
        if (r13 != 7) goto L54;
        r13 = r75;
    L54:
        r33 = r10;
        r25 = r8;
        r92 = ((long) r14) * ((long) r153[r13]);
        if (r92 < 0) goto L60;
        if (r92 > 2147483647L) goto L60;
        r72 = true;
        goto L62
    L14:
        r11 = null;
        goto L13
    L16:
        r23 = r32;
        r17 = r7;
        r21 = 4;
        goto L18
    L129:
        int r212 = r27.readInt();
        if (r7 == false) goto L132;
        String.format("nextIfdOffset: %d", new Object[]{Integer.valueOf(r212)});
    L132:
        long r52 = r212;
        if (r52 > 0) goto L135;
        return;
    L135:
        if (r4.contains(Integer.valueOf(r212)) == true) goto L150;
        r27.m388f(r52);
        if (r10[4].isEmpty() == false) goto L141;
        m502s(r27, 4);
        return;
    L141:
        if (r10[5].isEmpty() == false) goto L151;
        m502s(r27, 5);
        return;
    L151:
        return;
    L150:
        return;
    }

    /* JADX INFO: renamed from: t */
    public final void m503t(int r4, String r5, String r6) {
        HashMap[] r0 = this.f786d;
        if (r0[r4].isEmpty() == false) goto L5;
        return;
    L5:
        if (r0[r4].get(r5) == null) goto L9;
        HashMap r1 = r0[r4];
        r1.put(r6, r1.get(r5));
        r0[r4].remove(r5);
        return;
    }

    /* JADX INFO: renamed from: u */
    public final void m504u(C0023Ag r15) {
        HashMap r0 = this.f786d[4];
        C0066Bg r1 = (C0066Bg) r0.get("Compression");
        if (r1 == null) goto L65;
        int r12 = r1.m110e(this.f788f);
        if (r12 == 1) goto L12;
        if (r12 != 6) goto L8;
        m497m(r15, r0);
        return;
    L8:
        if (r12 == 7) goto L12;
        return;
    L12:
        C0066Bg r13 = (C0066Bg) r0.get("BitsPerSample");
        if (r13 == null) goto L73;
        int[] r14 = (int[]) r13.m112g(this.f788f);
        int[] r4 = f769m;
        if (Arrays.equals(r4, r14) == false) goto L18;
    L28:
        C0066Bg r16 = (C0066Bg) r0.get("StripOffsets");
        C0066Bg r02 = (C0066Bg) r0.get("StripByteCounts");
        if (r16 == null) goto L78;
        if (r02 == null) goto L79;
        long[] r17 = AbstractC0585Nj.m1140h(r16.m112g(this.f788f));
        long[] r03 = AbstractC0585Nj.m1140h(r02.m112g(this.f788f));
        if (r17 != null) goto L34;
        return;
    L34:
        if (r17.length == 0) goto L84;
        if (r03 != null) goto L38;
        return;
    L38:
        if (r03.length != 0) goto L41;
        return;
    L41:
        if (r17.length != r03.length) goto L86;
        int r2 = r03.length;
        long r5 = 0;
        int r7 = 0;
    L44:
        if (r7 >= r2) goto L46;
        r5 = r5 + r03[r7];
        r7 = r7 + 1;
        goto L44
    L46:
        byte[] r22 = new byte[(int) r5];
        this.f789g = true;
        int r52 = 0;
        int r6 = 0;
        int r72 = 0;
    L48:
        if (r52 >= r17.length) goto L62;
        int r8 = (int) r17[r52];
        int r9 = (int) r03[r52];
        if (r52 < (r17.length - 1)) goto L52;
    L54:
        int r82 = r8 - r6;
        if (r82 < 0) goto L88;
        r15.m34d(r82);     // Catch: EOFException -> L67
        int r62 = r6 + r82;
        byte[] r83 = new byte[r9];
        r15.readFully(r83);     // Catch: EOFException -> L67
        r6 = r62 + r9;
        System.arraycopy(r83, 0, r22, r72, r9);
        r72 = r72 + r9;
        r52 = r52 + 1;
    L87:
        return;
    L88:
        return;
    L52:
        if ((r8 + r9) == r17[r52 + 1]) goto L54;
        this.f789g = false;
        goto L54
    L62:
        if (this.f789g == false) goto L82;
        long r04 = r17[0];
        return;
    L82:
        return;
    L86:
        return;
    L84:
        return;
    L79:
        return;
    L78:
        return;
    L18:
        if (this.f785c != 3) goto L74;
        C0066Bg r53 = (C0066Bg) r0.get("PhotometricInterpretation");
        if (r53 == null) goto L75;
        int r54 = r53.m110e(this.f788f);
        if (r54 == 1) goto L24;
    L25:
        if (r54 == 6) goto L27;
        return;
    L27:
        if (Arrays.equals(r14, r4) == true) goto L28;
        return;
    L24:
        if (Arrays.equals(r14, f770n) == true) goto L28;
    L75:
        return;
    L74:
        return;
    L73:
        return;
    L65:
        m497m(r15, r0);
    }

    /* JADX INFO: renamed from: v */
    public final void m505v(int r7, int r8) {
        HashMap[] r0 = this.f786d;
        if (r0[r7].isEmpty() == false) goto L5;
        return;
    L5:
        if (r0[r8].isEmpty() == true) goto L24;
        C0066Bg r1 = (C0066Bg) r0[r7].get("ImageLength");
        C0066Bg r3 = (C0066Bg) r0[r7].get("ImageWidth");
        C0066Bg r2 = (C0066Bg) r0[r8].get("ImageLength");
        C0066Bg r4 = (C0066Bg) r0[r8].get("ImageWidth");
        if (r1 == null) goto L20;
        if (r3 == null) goto L25;
        if (r2 == null) goto L21;
        if (r4 == null) goto L26;
        int r12 = r1.m110e(this.f788f);
        int r32 = r3.m110e(this.f788f);
        int r22 = r2.m110e(this.f788f);
        int r42 = r4.m110e(this.f788f);
        if (r12 >= r22) goto L22;
        if (r32 >= r42) goto L23;
        HashMap r13 = r0[r7];
        r0[r7] = r0[r8];
        r0[r8] = r13;
        return;
    L23:
        return;
    L22:
        return;
    L26:
        return;
    L21:
        return;
    L25:
        return;
    L20:
        return;
    }

    /* JADX INFO: renamed from: w */
    public final void m506w(C0195Eg r9, int r10) {
        HashMap[] r0 = this.f786d;
        C0066Bg r1 = (C0066Bg) r0[r10].get("DefaultCropSize");
        C0066Bg r2 = (C0066Bg) r0[r10].get("SensorTopBorder");
        C0066Bg r3 = (C0066Bg) r0[r10].get("SensorLeftBorder");
        C0066Bg r4 = (C0066Bg) r0[r10].get("SensorBottomBorder");
        C0066Bg r5 = (C0066Bg) r0[r10].get("SensorRightBorder");
        if (r1 != null) goto L5;
        if (r2 == null) goto L33;
        if (r3 == null) goto L33;
        if (r4 == null) goto L33;
        if (r5 == null) goto L33;
        int r92 = r2.m110e(this.f788f);
        int r12 = r4.m110e(this.f788f);
        int r22 = r5.m110e(this.f788f);
        int r32 = r3.m110e(this.f788f);
        if (r12 <= r92) goto L41;
        if (r22 <= r32) goto L42;
        C0066Bg r93 = C0066Bg.m108c(r12 - r92, this.f788f);
        C0066Bg r13 = C0066Bg.m108c(r22 - r32, this.f788f);
        r0[r10].put("ImageLength", r93);
        r0[r10].put("ImageWidth", r13);
        return;
    L42:
        return;
    L41:
        return;
    L33:
        C0066Bg r14 = (C0066Bg) r0[r10].get("ImageLength");
        C0066Bg r23 = (C0066Bg) r0[r10].get("ImageWidth");
        if (r14 == null) goto L36;
        if (r23 == null) goto L36;
        return;
    L36:
        C0066Bg r15 = (C0066Bg) r0[r10].get("JPEGInterchangeFormat");
        C0066Bg r02 = (C0066Bg) r0[r10].get("JPEGInterchangeFormatLength");
        if (r15 == null) goto L44;
        if (r02 == null) goto L45;
        int r03 = r15.m110e(this.f788f);
        int r16 = r15.m110e(this.f788f);
        r9.m388f(r03);
        byte[] r17 = new byte[r16];
        r9.readFully(r17);
        m489e(new C0023Ag(r17), r03, r10);
        return;
    L45:
        return;
    L44:
        return;
    L5:
        if (r1.f157a != 5) goto L14;
        C0152Dg[] r94 = (C0152Dg[]) r1.m112g(this.f788f);
        if (r94 != null) goto L9;
    L12:
        Arrays.toString(r94);
        return;
    L9:
        if (r94.length != 2) goto L12;
        C0066Bg r18 = C0066Bg.m107b(r94[0], this.f788f);
        C0066Bg r95 = C0066Bg.m107b(r94[1], this.f788f);
    L20:
        r0[r10].put("ImageWidth", r18);
        r0[r10].put("ImageLength", r95);
        return;
    L14:
        int[] r96 = (int[]) r1.m112g(this.f788f);
        if (r96 != null) goto L17;
    L22:
        Arrays.toString(r96);
        return;
    L17:
        if (r96.length != 2) goto L22;
        r18 = C0066Bg.m108c(r96[0], this.f788f);
        r95 = C0066Bg.m108c(r96[1], this.f788f);
        goto L20
    }

    /* JADX INFO: renamed from: x */
    public final void m507x() {
        m505v(0, 5);
        m505v(0, 4);
        m505v(5, 4);
        HashMap[] r3 = this.f786d;
        C0066Bg r5 = (C0066Bg) r3[1].get("PixelXDimension");
        C0066Bg r4 = (C0066Bg) r3[1].get("PixelYDimension");
        if (r5 == null) goto L7;
        if (r4 == null) goto L7;
        r3[0].put("ImageWidth", r5);
        r3[0].put("ImageLength", r4);
    L7:
        if (r3[4].isEmpty() == true) goto L9;
    L11:
        m498n(r3[4]);
        m503t(0, "ThumbnailOrientation", "Orientation");
        m503t(0, "ThumbnailImageLength", "ImageLength");
        m503t(0, "ThumbnailImageWidth", "ImageWidth");
        m503t(5, "ThumbnailOrientation", "Orientation");
        m503t(5, "ThumbnailImageLength", "ImageLength");
        m503t(5, "ThumbnailImageWidth", "ImageWidth");
        m503t(4, "Orientation", "ThumbnailOrientation");
        m503t(4, "ImageLength", "ThumbnailImageLength");
        m503t(4, "ImageWidth", "ThumbnailImageWidth");
        return;
    L9:
        if (m498n(r3[5]) == false) goto L11;
        r3[4] = r3[5];
        r3[5] = new HashMap();
        goto L11
    }
}
