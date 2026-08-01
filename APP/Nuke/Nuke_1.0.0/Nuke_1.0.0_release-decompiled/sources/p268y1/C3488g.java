package p268y1;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.AbstractC1926h;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
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
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: y1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3488g {

    /* JADX INFO: renamed from: A */
    public static final byte[] f10828A;

    /* JADX INFO: renamed from: B */
    public static final String[] f10829B;

    /* JADX INFO: renamed from: C */
    public static final int[] f10830C;

    /* JADX INFO: renamed from: D */
    public static final byte[] f10831D;

    /* JADX INFO: renamed from: E */
    public static final C3485d f10832E;

    /* JADX INFO: renamed from: F */
    public static final C3485d[][] f10833F;

    /* JADX INFO: renamed from: G */
    public static final C3485d[] f10834G;

    /* JADX INFO: renamed from: H */
    public static final HashMap[] f10835H;

    /* JADX INFO: renamed from: I */
    public static final HashMap[] f10836I;

    /* JADX INFO: renamed from: J */
    public static final HashSet f10837J;

    /* JADX INFO: renamed from: K */
    public static final HashMap f10838K;

    /* JADX INFO: renamed from: L */
    public static final Charset f10839L;

    /* JADX INFO: renamed from: M */
    public static final byte[] f10840M;

    /* JADX INFO: renamed from: N */
    public static final byte[] f10841N;

    /* JADX INFO: renamed from: l */
    public static final boolean f10842l = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: m */
    public static final int[] f10843m;

    /* JADX INFO: renamed from: n */
    public static final int[] f10844n;

    /* JADX INFO: renamed from: o */
    public static final byte[] f10845o;

    /* JADX INFO: renamed from: p */
    public static final byte[] f10846p;

    /* JADX INFO: renamed from: q */
    public static final byte[] f10847q;

    /* JADX INFO: renamed from: r */
    public static final byte[] f10848r;

    /* JADX INFO: renamed from: s */
    public static final byte[] f10849s;

    /* JADX INFO: renamed from: t */
    public static final byte[] f10850t;

    /* JADX INFO: renamed from: u */
    public static final byte[] f10851u;

    /* JADX INFO: renamed from: v */
    public static final byte[] f10852v;

    /* JADX INFO: renamed from: w */
    public static final byte[] f10853w;

    /* JADX INFO: renamed from: x */
    public static final byte[] f10854x;

    /* JADX INFO: renamed from: y */
    public static final byte[] f10855y;

    /* JADX INFO: renamed from: z */
    public static final byte[] f10856z;

    /* JADX INFO: renamed from: a */
    public final FileDescriptor f10857a;

    /* JADX INFO: renamed from: b */
    public final AssetManager.AssetInputStream f10858b;

    /* JADX INFO: renamed from: c */
    public int f10859c;

    /* JADX INFO: renamed from: d */
    public final HashMap[] f10860d;

    /* JADX INFO: renamed from: e */
    public final HashSet f10861e;

    /* JADX INFO: renamed from: f */
    public ByteOrder f10862f;

    /* JADX INFO: renamed from: g */
    public boolean f10863g;

    /* JADX INFO: renamed from: h */
    public int f10864h;

    /* JADX INFO: renamed from: i */
    public int f10865i;

    /* JADX INFO: renamed from: j */
    public int f10866j;

    /* JADX INFO: renamed from: k */
    public int f10867k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f10843m = new int[]{8, 8, 8};
        f10844n = new int[]{8};
        f10845o = new byte[]{-1, -40, -1};
        f10846p = new byte[]{102, 116, 121, 112};
        f10847q = new byte[]{109, 105, 102, 49};
        f10848r = new byte[]{104, 101, 105, 99};
        f10849s = new byte[]{79, 76, 89, 77, 80, 0};
        f10850t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f10851u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f10852v = new byte[]{101, 88, 73, 102};
        f10853w = new byte[]{73, 72, 68, 82};
        f10854x = new byte[]{73, 69, 78, 68};
        f10855y = new byte[]{82, 73, 70, 70};
        f10856z = new byte[]{87, 69, 66, 80};
        f10828A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f10829B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f10830C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f10831D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C3485d[] c3485dArr = {new C3485d(254, 4, "NewSubfileType"), new C3485d(255, 4, "SubfileType"), new C3485d("ImageWidth", 256, 3, 4), new C3485d("ImageLength", 257, 3, 4), new C3485d(258, 3, "BitsPerSample"), new C3485d(259, 3, "Compression"), new C3485d(262, 3, "PhotometricInterpretation"), new C3485d(270, 2, "ImageDescription"), new C3485d(271, 2, "Make"), new C3485d(272, 2, "Model"), new C3485d("StripOffsets", 273, 3, 4), new C3485d(274, 3, "Orientation"), new C3485d(277, 3, "SamplesPerPixel"), new C3485d("RowsPerStrip", 278, 3, 4), new C3485d("StripByteCounts", 279, 3, 4), new C3485d(282, 5, "XResolution"), new C3485d(283, 5, "YResolution"), new C3485d(284, 3, "PlanarConfiguration"), new C3485d(296, 3, "ResolutionUnit"), new C3485d(301, 3, "TransferFunction"), new C3485d(305, 2, "Software"), new C3485d(306, 2, "DateTime"), new C3485d(315, 2, "Artist"), new C3485d(318, 5, "WhitePoint"), new C3485d(319, 5, "PrimaryChromaticities"), new C3485d(330, 4, "SubIFDPointer"), new C3485d(513, 4, "JPEGInterchangeFormat"), new C3485d(514, 4, "JPEGInterchangeFormatLength"), new C3485d(529, 5, "YCbCrCoefficients"), new C3485d(530, 3, "YCbCrSubSampling"), new C3485d(531, 3, "YCbCrPositioning"), new C3485d(532, 5, "ReferenceBlackWhite"), new C3485d(33432, 2, "Copyright"), new C3485d(34665, 4, "ExifIFDPointer"), new C3485d(34853, 4, "GPSInfoIFDPointer"), new C3485d(4, 4, "SensorTopBorder"), new C3485d(5, 4, "SensorLeftBorder"), new C3485d(6, 4, "SensorBottomBorder"), new C3485d(7, 4, "SensorRightBorder"), new C3485d(23, 3, "ISO"), new C3485d(46, 7, "JpgFromRaw"), new C3485d(700, 1, "Xmp")};
        C3485d[] c3485dArr2 = {new C3485d(33434, 5, "ExposureTime"), new C3485d(33437, 5, "FNumber"), new C3485d(34850, 3, "ExposureProgram"), new C3485d(34852, 2, "SpectralSensitivity"), new C3485d(34855, 3, "PhotographicSensitivity"), new C3485d(34856, 7, "OECF"), new C3485d(34864, 3, "SensitivityType"), new C3485d(34865, 4, "StandardOutputSensitivity"), new C3485d(34866, 4, "RecommendedExposureIndex"), new C3485d(34867, 4, "ISOSpeed"), new C3485d(34868, 4, "ISOSpeedLatitudeyyy"), new C3485d(34869, 4, "ISOSpeedLatitudezzz"), new C3485d(36864, 2, "ExifVersion"), new C3485d(36867, 2, "DateTimeOriginal"), new C3485d(36868, 2, "DateTimeDigitized"), new C3485d(36880, 2, "OffsetTime"), new C3485d(36881, 2, "OffsetTimeOriginal"), new C3485d(36882, 2, "OffsetTimeDigitized"), new C3485d(37121, 7, "ComponentsConfiguration"), new C3485d(37122, 5, "CompressedBitsPerPixel"), new C3485d(37377, 10, "ShutterSpeedValue"), new C3485d(37378, 5, "ApertureValue"), new C3485d(37379, 10, "BrightnessValue"), new C3485d(37380, 10, "ExposureBiasValue"), new C3485d(37381, 5, "MaxApertureValue"), new C3485d(37382, 5, "SubjectDistance"), new C3485d(37383, 3, "MeteringMode"), new C3485d(37384, 3, "LightSource"), new C3485d(37385, 3, "Flash"), new C3485d(37386, 5, "FocalLength"), new C3485d(37396, 3, "SubjectArea"), new C3485d(37500, 7, "MakerNote"), new C3485d(37510, 7, "UserComment"), new C3485d(37520, 2, "SubSecTime"), new C3485d(37521, 2, "SubSecTimeOriginal"), new C3485d(37522, 2, "SubSecTimeDigitized"), new C3485d(40960, 7, "FlashpixVersion"), new C3485d(40961, 3, "ColorSpace"), new C3485d("PixelXDimension", 40962, 3, 4), new C3485d("PixelYDimension", 40963, 3, 4), new C3485d(40964, 2, "RelatedSoundFile"), new C3485d(40965, 4, "InteroperabilityIFDPointer"), new C3485d(41483, 5, "FlashEnergy"), new C3485d(41484, 7, "SpatialFrequencyResponse"), new C3485d(41486, 5, "FocalPlaneXResolution"), new C3485d(41487, 5, "FocalPlaneYResolution"), new C3485d(41488, 3, "FocalPlaneResolutionUnit"), new C3485d(41492, 3, "SubjectLocation"), new C3485d(41493, 5, "ExposureIndex"), new C3485d(41495, 3, "SensingMethod"), new C3485d(41728, 7, "FileSource"), new C3485d(41729, 7, "SceneType"), new C3485d(41730, 7, "CFAPattern"), new C3485d(41985, 3, "CustomRendered"), new C3485d(41986, 3, "ExposureMode"), new C3485d(41987, 3, "WhiteBalance"), new C3485d(41988, 5, "DigitalZoomRatio"), new C3485d(41989, 3, "FocalLengthIn35mmFilm"), new C3485d(41990, 3, "SceneCaptureType"), new C3485d(41991, 3, "GainControl"), new C3485d(41992, 3, "Contrast"), new C3485d(41993, 3, "Saturation"), new C3485d(41994, 3, "Sharpness"), new C3485d(41995, 7, "DeviceSettingDescription"), new C3485d(41996, 3, "SubjectDistanceRange"), new C3485d(42016, 2, "ImageUniqueID"), new C3485d(42032, 2, "CameraOwnerName"), new C3485d(42033, 2, "BodySerialNumber"), new C3485d(42034, 5, "LensSpecification"), new C3485d(42035, 2, "LensMake"), new C3485d(42036, 2, "LensModel"), new C3485d(42240, 5, "Gamma"), new C3485d(50706, 1, "DNGVersion"), new C3485d("DefaultCropSize", 50720, 3, 4)};
        C3485d[] c3485dArr3 = {new C3485d(0, 1, "GPSVersionID"), new C3485d(1, 2, "GPSLatitudeRef"), new C3485d("GPSLatitude", 2, 5, 10), new C3485d(3, 2, "GPSLongitudeRef"), new C3485d("GPSLongitude", 4, 5, 10), new C3485d(5, 1, "GPSAltitudeRef"), new C3485d(6, 5, "GPSAltitude"), new C3485d(7, 5, "GPSTimeStamp"), new C3485d(8, 2, "GPSSatellites"), new C3485d(9, 2, "GPSStatus"), new C3485d(10, 2, "GPSMeasureMode"), new C3485d(11, 5, "GPSDOP"), new C3485d(12, 2, "GPSSpeedRef"), new C3485d(13, 5, "GPSSpeed"), new C3485d(14, 2, "GPSTrackRef"), new C3485d(15, 5, "GPSTrack"), new C3485d(16, 2, "GPSImgDirectionRef"), new C3485d(17, 5, "GPSImgDirection"), new C3485d(18, 2, "GPSMapDatum"), new C3485d(19, 2, "GPSDestLatitudeRef"), new C3485d(20, 5, "GPSDestLatitude"), new C3485d(21, 2, "GPSDestLongitudeRef"), new C3485d(22, 5, "GPSDestLongitude"), new C3485d(23, 2, "GPSDestBearingRef"), new C3485d(24, 5, "GPSDestBearing"), new C3485d(25, 2, "GPSDestDistanceRef"), new C3485d(26, 5, "GPSDestDistance"), new C3485d(27, 7, "GPSProcessingMethod"), new C3485d(28, 7, "GPSAreaInformation"), new C3485d(29, 2, "GPSDateStamp"), new C3485d(30, 3, "GPSDifferential"), new C3485d(31, 5, "GPSHPositioningError")};
        C3485d[] c3485dArr4 = {new C3485d(1, 2, "InteroperabilityIndex")};
        C3485d[] c3485dArr5 = {new C3485d(254, 4, "NewSubfileType"), new C3485d(255, 4, "SubfileType"), new C3485d("ThumbnailImageWidth", 256, 3, 4), new C3485d("ThumbnailImageLength", 257, 3, 4), new C3485d(258, 3, "BitsPerSample"), new C3485d(259, 3, "Compression"), new C3485d(262, 3, "PhotometricInterpretation"), new C3485d(270, 2, "ImageDescription"), new C3485d(271, 2, "Make"), new C3485d(272, 2, "Model"), new C3485d("StripOffsets", 273, 3, 4), new C3485d(274, 3, "ThumbnailOrientation"), new C3485d(277, 3, "SamplesPerPixel"), new C3485d("RowsPerStrip", 278, 3, 4), new C3485d("StripByteCounts", 279, 3, 4), new C3485d(282, 5, "XResolution"), new C3485d(283, 5, "YResolution"), new C3485d(284, 3, "PlanarConfiguration"), new C3485d(296, 3, "ResolutionUnit"), new C3485d(301, 3, "TransferFunction"), new C3485d(305, 2, "Software"), new C3485d(306, 2, "DateTime"), new C3485d(315, 2, "Artist"), new C3485d(318, 5, "WhitePoint"), new C3485d(319, 5, "PrimaryChromaticities"), new C3485d(330, 4, "SubIFDPointer"), new C3485d(513, 4, "JPEGInterchangeFormat"), new C3485d(514, 4, "JPEGInterchangeFormatLength"), new C3485d(529, 5, "YCbCrCoefficients"), new C3485d(530, 3, "YCbCrSubSampling"), new C3485d(531, 3, "YCbCrPositioning"), new C3485d(532, 5, "ReferenceBlackWhite"), new C3485d(33432, 2, "Copyright"), new C3485d(34665, 4, "ExifIFDPointer"), new C3485d(34853, 4, "GPSInfoIFDPointer"), new C3485d(50706, 1, "DNGVersion"), new C3485d("DefaultCropSize", 50720, 3, 4)};
        f10832E = new C3485d(273, 3, "StripOffsets");
        f10833F = new C3485d[][]{c3485dArr, c3485dArr2, c3485dArr3, c3485dArr4, c3485dArr5, c3485dArr, new C3485d[]{new C3485d(256, 7, "ThumbnailImage"), new C3485d(8224, 4, "CameraSettingsIFDPointer"), new C3485d(8256, 4, "ImageProcessingIFDPointer")}, new C3485d[]{new C3485d(257, 4, "PreviewImageStart"), new C3485d(258, 4, "PreviewImageLength")}, new C3485d[]{new C3485d(4371, 3, "AspectFrame")}, new C3485d[]{new C3485d(55, 3, "ColorSpace")}};
        f10834G = new C3485d[]{new C3485d(330, 4, "SubIFDPointer"), new C3485d(34665, 4, "ExifIFDPointer"), new C3485d(34853, 4, "GPSInfoIFDPointer"), new C3485d(40965, 4, "InteroperabilityIFDPointer"), new C3485d(8224, 1, "CameraSettingsIFDPointer"), new C3485d(8256, 1, "ImageProcessingIFDPointer")};
        f10835H = new HashMap[10];
        f10836I = new HashMap[10];
        f10837J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f10838K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f10839L = charsetForName;
        f10840M = "Exif\u0000\u0000".getBytes(charsetForName);
        f10841N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i5 = 0;
        while (true) {
            C3485d[][] c3485dArr6 = f10833F;
            if (i5 >= c3485dArr6.length) {
                HashMap map = f10838K;
                C3485d[] c3485dArr7 = f10834G;
                map.put(Integer.valueOf(c3485dArr7[0].f10822a), 5);
                map.put(Integer.valueOf(c3485dArr7[1].f10822a), 1);
                map.put(Integer.valueOf(c3485dArr7[2].f10822a), 2);
                map.put(Integer.valueOf(c3485dArr7[3].f10822a), 3);
                map.put(Integer.valueOf(c3485dArr7[4].f10822a), 7);
                map.put(Integer.valueOf(c3485dArr7[5].f10822a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f10835H[i5] = new HashMap();
            f10836I[i5] = new HashMap();
            for (C3485d c3485d : c3485dArr6[i5]) {
                f10835H[i5].put(Integer.valueOf(c3485d.f10822a), c3485d);
                f10836I[i5].put(c3485d.f10823b, c3485d);
            }
            i5++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:39:0x00a5, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:65:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3488g(java.io.InputStream r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p268y1.C3488g.<init>(java.io.InputStream):void");
    }

    /* JADX INFO: renamed from: q */
    public static ByteOrder m5721q(C3483b c3483b) throws IOException {
        short s5 = c3483b.readShort();
        boolean z5 = f10842l;
        if (s5 == 18761) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s5 == 19789) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s5));
    }

    /* JADX INFO: renamed from: a */
    public final void m5722a() {
        String strM5723b = m5723b("DateTimeOriginal");
        HashMap[] mapArr = this.f10860d;
        if (strM5723b != null && m5723b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM5723b.concat("\u0000").getBytes(f10839L);
            map.put("DateTime", new C3484c(bytes, 2, bytes.length));
        }
        if (m5723b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C3484c.m5713a(0L, this.f10862f));
        }
        if (m5723b("ImageLength") == null) {
            mapArr[0].put("ImageLength", C3484c.m5713a(0L, this.f10862f));
        }
        if (m5723b("Orientation") == null) {
            mapArr[0].put("Orientation", C3484c.m5713a(0L, this.f10862f));
        }
        if (m5723b("LightSource") == null) {
            mapArr[1].put("LightSource", C3484c.m5713a(0L, this.f10862f));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m5723b(String str) {
        C3484c c3484cM5724c = m5724c(str);
        if (c3484cM5724c != null) {
            int i5 = c3484cM5724c.f10818a;
            if (!f10837J.contains(str)) {
                return c3484cM5724c.m5718f(this.f10862f);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i5 != 5 && i5 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i5);
                    return null;
                }
                C3486e[] c3486eArr = (C3486e[]) c3484cM5724c.m5719g(this.f10862f);
                if (c3486eArr == null || c3486eArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c3486eArr));
                    return null;
                }
                C3486e c3486e = c3486eArr[0];
                Integer numValueOf = Integer.valueOf((int) (c3486e.f10826a / c3486e.f10827b));
                C3486e c3486e2 = c3486eArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c3486e2.f10826a / c3486e2.f10827b));
                C3486e c3486e3 = c3486eArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c3486e3.f10826a / c3486e3.f10827b)));
            }
            try {
                return Double.toString(c3484cM5724c.m5716d(this.f10862f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C3484c m5724c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f10842l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i5 = 0; i5 < f10833F.length; i5++) {
            C3484c c3484c = (C3484c) this.f10860d[i5].get(str);
            if (c3484c != null) {
                return c3484c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m5725d(C3487f c3487f) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC3490i.m5748a(mediaMetadataRetriever, new C3482a(c3487f));
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
                HashMap[] mapArr = this.f10860d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C3484c.m5715c(Integer.parseInt(strExtractMetadata), this.f10862f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C3484c.m5715c(Integer.parseInt(strExtractMetadata2), this.f10862f));
                }
                if (strExtractMetadata3 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", C3484c.m5715c(i5 != 90 ? i5 != 180 ? i5 != 270 ? 1 : 8 : 3 : 6, this.f10862f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i6 = Integer.parseInt(strExtractMetadata4);
                    int i7 = Integer.parseInt(strExtractMetadata5);
                    if (i7 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c3487f.m5720c(i6);
                    byte[] bArr = new byte[6];
                    if (c3487f.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i8 = i6 + 6;
                    int i9 = i7 - 6;
                    if (!Arrays.equals(bArr, f10840M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i9];
                    if (c3487f.read(bArr2) != i9) {
                        throw new IOException("Can't read exif");
                    }
                    this.f10864h = i8;
                    m5738r(0, bArr2);
                }
                if (f10842l) {
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5726e(p268y1.C3483b r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p268y1.C3488g.m5726e(y1.b, int, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:167|12|158|13|150|14|(16:17|(2:19|20)(1:28)|23|29|(1:31)|32|(3:152|35|(4:41|(3:44|(1:46)(2:47|(1:49))|(1:179)(3:176|52|53))(2:43|177)|54|36))|34|162|66|160|67|68|(1:74)(1:73)|75|(1:88)(8:156|90|154|91|92|(1:94)(1:95)|96|(1:110)(3:112|(2:113|(2:115|(2:169|117)(1:118))(2:168|119))|(1:121)(4:123|(2:124|(2:126|(1:171)(1:129))(3:170|130|(2:131|(1:172)(2:133|(1:173)(1:136)))))|128|(1:138)(1:140)))))|16|162|66|160|67|68|(3:70|74|75)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f5, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f8, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00fa, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fc, code lost:
    
        if (r5 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fe, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0101, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0102, code lost:
    
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0104, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0107, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b A[RETURN] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m5727f(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p268y1.C3488g.m5727f(java.io.BufferedInputStream):int");
    }

    /* JADX INFO: renamed from: g */
    public final void m5728g(C3487f c3487f) throws Throwable {
        int i5;
        int i6;
        m5731j(c3487f);
        HashMap[] mapArr = this.f10860d;
        C3484c c3484c = (C3484c) mapArr[1].get("MakerNote");
        if (c3484c != null) {
            C3487f c3487f2 = new C3487f(c3484c.f10821d);
            c3487f2.f10815e = this.f10862f;
            byte[] bArr = f10849s;
            byte[] bArr2 = new byte[bArr.length];
            c3487f2.readFully(bArr2);
            c3487f2.m5720c(0L);
            byte[] bArr3 = f10850t;
            byte[] bArr4 = new byte[bArr3.length];
            c3487f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c3487f2.m5720c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c3487f2.m5720c(12L);
            }
            m5739s(c3487f2, 6);
            C3484c c3484c2 = (C3484c) mapArr[7].get("PreviewImageStart");
            C3484c c3484c3 = (C3484c) mapArr[7].get("PreviewImageLength");
            if (c3484c2 != null && c3484c3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c3484c2);
                mapArr[5].put("JPEGInterchangeFormatLength", c3484c3);
            }
            C3484c c3484c4 = (C3484c) mapArr[8].get("AspectFrame");
            if (c3484c4 != null) {
                int[] iArr = (int[]) c3484c4.m5719g(this.f10862f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i7 = iArr[2];
                int i8 = iArr[0];
                if (i7 <= i8 || (i5 = iArr[3]) <= (i6 = iArr[1])) {
                    return;
                }
                int i9 = (i7 - i8) + 1;
                int i10 = (i5 - i6) + 1;
                if (i9 < i10) {
                    int i11 = i9 + i10;
                    i10 = i11 - i10;
                    i9 = i11 - i10;
                }
                C3484c c3484cM5715c = C3484c.m5715c(i9, this.f10862f);
                C3484c c3484cM5715c2 = C3484c.m5715c(i10, this.f10862f);
                mapArr[0].put("ImageWidth", c3484cM5715c);
                mapArr[0].put("ImageLength", c3484cM5715c2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5729h(C3483b c3483b) throws Throwable {
        if (f10842l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c3483b);
        }
        c3483b.f10815e = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f10851u;
        c3483b.m5712b(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i5 = c3483b.readInt();
                byte[] bArr2 = new byte[4];
                if (c3483b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i6 = length + 8;
                if (i6 == 16 && !Arrays.equals(bArr2, f10853w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f10854x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f10852v)) {
                    byte[] bArr3 = new byte[i5];
                    if (c3483b.read(bArr3) != i5) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC1926h.m3563f(bArr2));
                    }
                    int i7 = c3483b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i7) {
                        this.f10864h = i6;
                        m5738r(0, bArr3);
                        m5744x();
                        m5741u(new C3483b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                }
                int i8 = i5 + 4;
                c3483b.m5712b(i8);
                length = i6 + i8;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5730i(C3483b c3483b) throws Throwable {
        boolean z5 = f10842l;
        if (z5) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c3483b);
        }
        c3483b.m5712b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c3483b.read(bArr);
        c3483b.read(bArr2);
        c3483b.read(bArr3);
        int i5 = ByteBuffer.wrap(bArr).getInt();
        int i6 = ByteBuffer.wrap(bArr2).getInt();
        int i7 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i6];
        c3483b.m5712b(i5 - c3483b.f10816f);
        c3483b.read(bArr4);
        m5726e(new C3483b(bArr4), i5, 5);
        c3483b.m5712b(i7 - c3483b.f10816f);
        c3483b.f10815e = ByteOrder.BIG_ENDIAN;
        int i8 = c3483b.readInt();
        if (z5) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i8);
        }
        for (int i9 = 0; i9 < i8; i9++) {
            int unsignedShort = c3483b.readUnsignedShort();
            int unsignedShort2 = c3483b.readUnsignedShort();
            if (unsignedShort == f10832E.f10822a) {
                short s5 = c3483b.readShort();
                short s6 = c3483b.readShort();
                C3484c c3484cM5715c = C3484c.m5715c(s5, this.f10862f);
                C3484c c3484cM5715c2 = C3484c.m5715c(s6, this.f10862f);
                HashMap[] mapArr = this.f10860d;
                mapArr[0].put("ImageLength", c3484cM5715c);
                mapArr[0].put("ImageWidth", c3484cM5715c2);
                if (z5) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s5) + ", width: " + ((int) s6));
                    return;
                }
                return;
            }
            c3483b.m5712b(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5731j(C3487f c3487f) throws Throwable {
        m5736o(c3487f);
        m5739s(c3487f, 0);
        m5743w(c3487f, 0);
        m5743w(c3487f, 5);
        m5743w(c3487f, 4);
        m5744x();
        if (this.f10859c == 8) {
            HashMap[] mapArr = this.f10860d;
            C3484c c3484c = (C3484c) mapArr[1].get("MakerNote");
            if (c3484c != null) {
                C3487f c3487f2 = new C3487f(c3484c.f10821d);
                c3487f2.f10815e = this.f10862f;
                c3487f2.m5712b(6);
                m5739s(c3487f2, 9);
                C3484c c3484c2 = (C3484c) mapArr[9].get("ColorSpace");
                if (c3484c2 != null) {
                    mapArr[1].put("ColorSpace", c3484c2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5732k(C3487f c3487f) throws Throwable {
        if (f10842l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c3487f);
        }
        m5731j(c3487f);
        HashMap[] mapArr = this.f10860d;
        C3484c c3484c = (C3484c) mapArr[0].get("JpgFromRaw");
        if (c3484c != null) {
            m5726e(new C3483b(c3484c.f10821d), (int) c3484c.f10820c, 5);
        }
        C3484c c3484c2 = (C3484c) mapArr[0].get("ISO");
        C3484c c3484c3 = (C3484c) mapArr[1].get("PhotographicSensitivity");
        if (c3484c2 == null || c3484c3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c3484c2);
    }

    /* JADX INFO: renamed from: l */
    public final void m5733l(C3483b c3483b) throws Throwable {
        if (f10842l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c3483b);
        }
        c3483b.f10815e = ByteOrder.LITTLE_ENDIAN;
        c3483b.m5712b(f10855y.length);
        int i5 = c3483b.readInt() + 8;
        byte[] bArr = f10856z;
        c3483b.m5712b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c3483b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i6 = c3483b.readInt();
                int i7 = length + 8;
                if (Arrays.equals(f10828A, bArr2)) {
                    byte[] bArr3 = new byte[i6];
                    if (c3483b.read(bArr3) == i6) {
                        this.f10864h = i7;
                        m5738r(0, bArr3);
                        m5741u(new C3483b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC1926h.m3563f(bArr2));
                    }
                }
                if (i6 % 2 == 1) {
                    i6++;
                }
                length = i7 + i6;
                if (length == i5) {
                    return;
                }
                if (length > i5) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c3483b.m5712b(i6);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5734m(C3483b c3483b, HashMap map) throws Throwable {
        C3484c c3484c = (C3484c) map.get("JPEGInterchangeFormat");
        C3484c c3484c2 = (C3484c) map.get("JPEGInterchangeFormatLength");
        if (c3484c == null || c3484c2 == null) {
            return;
        }
        int iM5717e = c3484c.m5717e(this.f10862f);
        int iM5717e2 = c3484c2.m5717e(this.f10862f);
        if (this.f10859c == 7) {
            iM5717e += this.f10865i;
        }
        if (iM5717e > 0 && iM5717e2 > 0 && this.f10858b == null && this.f10857a == null) {
            c3483b.skip(iM5717e);
            c3483b.read(new byte[iM5717e2]);
        }
        if (f10842l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM5717e + ", length: " + iM5717e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m5735n(HashMap map) {
        C3484c c3484c = (C3484c) map.get("ImageLength");
        C3484c c3484c2 = (C3484c) map.get("ImageWidth");
        if (c3484c == null || c3484c2 == null) {
            return false;
        }
        return c3484c.m5717e(this.f10862f) <= 512 && c3484c2.m5717e(this.f10862f) <= 512;
    }

    /* JADX INFO: renamed from: o */
    public final void m5736o(C3487f c3487f) throws IOException {
        ByteOrder byteOrderM5721q = m5721q(c3487f);
        this.f10862f = byteOrderM5721q;
        c3487f.f10815e = byteOrderM5721q;
        int unsignedShort = c3487f.readUnsignedShort();
        int i5 = this.f10859c;
        if (i5 != 7 && i5 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i6 = c3487f.readInt();
        if (i6 < 8) {
            throw new IOException(AbstractC0231b.m398i("Invalid first Ifd offset: ", i6));
        }
        int i7 = i6 - 8;
        if (i7 > 0) {
            c3487f.m5712b(i7);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5737p() {
        int i5 = 0;
        while (true) {
            HashMap[] mapArr = this.f10860d;
            if (i5 >= mapArr.length) {
                return;
            }
            StringBuilder sbM404o = AbstractC0231b.m404o(i5, "The size of tag group[", "]: ");
            sbM404o.append(mapArr[i5].size());
            Log.d("ExifInterface", sbM404o.toString());
            for (Map.Entry entry : mapArr[i5].entrySet()) {
                C3484c c3484c = (C3484c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c3484c.toString() + ", tagValue: '" + c3484c.m5718f(this.f10862f) + "'");
            }
            i5++;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m5738r(int i5, byte[] bArr) throws IOException {
        C3487f c3487f = new C3487f(bArr);
        m5736o(c3487f);
        m5739s(c3487f, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5739s(p268y1.C3487f r29, int r30) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p268y1.C3488g.m5739s(y1.f, int):void");
    }

    /* JADX INFO: renamed from: t */
    public final void m5740t(int i5, String str, String str2) {
        HashMap[] mapArr = this.f10860d;
        if (mapArr[i5].isEmpty() || mapArr[i5].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i5];
        map.put(str2, map.get(str));
        mapArr[i5].remove(str);
    }

    /* JADX INFO: renamed from: u */
    public final void m5741u(C3483b c3483b) throws Throwable {
        C3484c c3484c;
        int iM5717e;
        HashMap map = this.f10860d[4];
        C3484c c3484c2 = (C3484c) map.get("Compression");
        if (c3484c2 == null) {
            m5734m(c3483b, map);
            return;
        }
        int iM5717e2 = c3484c2.m5717e(this.f10862f);
        if (iM5717e2 != 1) {
            if (iM5717e2 == 6) {
                m5734m(c3483b, map);
                return;
            } else if (iM5717e2 != 7) {
                return;
            }
        }
        C3484c c3484c3 = (C3484c) map.get("BitsPerSample");
        if (c3484c3 != null) {
            int[] iArr = (int[]) c3484c3.m5719g(this.f10862f);
            int[] iArr2 = f10843m;
            if (Arrays.equals(iArr2, iArr) || (this.f10859c == 3 && (c3484c = (C3484c) map.get("PhotometricInterpretation")) != null && (((iM5717e = c3484c.m5717e(this.f10862f)) == 1 && Arrays.equals(iArr, f10844n)) || (iM5717e == 6 && Arrays.equals(iArr, iArr2))))) {
                C3484c c3484c4 = (C3484c) map.get("StripOffsets");
                C3484c c3484c5 = (C3484c) map.get("StripByteCounts");
                if (c3484c4 == null || c3484c5 == null) {
                    return;
                }
                long[] jArrM3570m = AbstractC1926h.m3570m(c3484c4.m5719g(this.f10862f));
                long[] jArrM3570m2 = AbstractC1926h.m3570m(c3484c5.m5719g(this.f10862f));
                if (jArrM3570m == null || jArrM3570m.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM3570m2 == null || jArrM3570m2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM3570m.length != jArrM3570m2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j5 = 0;
                for (long j6 : jArrM3570m2) {
                    j5 += j6;
                }
                byte[] bArr = new byte[(int) j5];
                this.f10863g = true;
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < jArrM3570m.length; i7++) {
                    int i8 = (int) jArrM3570m[i7];
                    int i9 = (int) jArrM3570m2[i7];
                    if (i7 < jArrM3570m.length - 1 && i8 + i9 != jArrM3570m[i7 + 1]) {
                        this.f10863g = false;
                    }
                    int i10 = i8 - i5;
                    if (i10 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j7 = i10;
                    if (c3483b.skip(j7) != j7) {
                        Log.d("ExifInterface", "Failed to skip " + i10 + " bytes.");
                        return;
                    }
                    int i11 = i5 + i10;
                    byte[] bArr2 = new byte[i9];
                    if (c3483b.read(bArr2) != i9) {
                        Log.d("ExifInterface", "Failed to read " + i9 + " bytes.");
                        return;
                    }
                    i5 = i11 + i9;
                    System.arraycopy(bArr2, 0, bArr, i6, i9);
                    i6 += i9;
                }
                if (this.f10863g) {
                    long j8 = jArrM3570m[0];
                    return;
                }
                return;
            }
        }
        if (f10842l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m5742v(int i5, int i6) throws Throwable {
        HashMap[] mapArr = this.f10860d;
        boolean zIsEmpty = mapArr[i5].isEmpty();
        boolean z5 = f10842l;
        if (zIsEmpty || mapArr[i6].isEmpty()) {
            if (z5) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C3484c c3484c = (C3484c) mapArr[i5].get("ImageLength");
        C3484c c3484c2 = (C3484c) mapArr[i5].get("ImageWidth");
        C3484c c3484c3 = (C3484c) mapArr[i6].get("ImageLength");
        C3484c c3484c4 = (C3484c) mapArr[i6].get("ImageWidth");
        if (c3484c == null || c3484c2 == null) {
            if (z5) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c3484c3 == null || c3484c4 == null) {
            if (z5) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM5717e = c3484c.m5717e(this.f10862f);
        int iM5717e2 = c3484c2.m5717e(this.f10862f);
        int iM5717e3 = c3484c3.m5717e(this.f10862f);
        int iM5717e4 = c3484c4.m5717e(this.f10862f);
        if (iM5717e >= iM5717e3 || iM5717e2 >= iM5717e4) {
            return;
        }
        HashMap map = mapArr[i5];
        mapArr[i5] = mapArr[i6];
        mapArr[i6] = map;
    }

    /* JADX INFO: renamed from: w */
    public final void m5743w(C3487f c3487f, int i5) throws Throwable {
        C3484c c3484cM5715c;
        C3484c c3484cM5715c2;
        HashMap[] mapArr = this.f10860d;
        C3484c c3484c = (C3484c) mapArr[i5].get("DefaultCropSize");
        C3484c c3484c2 = (C3484c) mapArr[i5].get("SensorTopBorder");
        C3484c c3484c3 = (C3484c) mapArr[i5].get("SensorLeftBorder");
        C3484c c3484c4 = (C3484c) mapArr[i5].get("SensorBottomBorder");
        C3484c c3484c5 = (C3484c) mapArr[i5].get("SensorRightBorder");
        if (c3484c != null) {
            if (c3484c.f10818a == 5) {
                C3486e[] c3486eArr = (C3486e[]) c3484c.m5719g(this.f10862f);
                if (c3486eArr == null || c3486eArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c3486eArr));
                    return;
                }
                c3484cM5715c = C3484c.m5714b(c3486eArr[0], this.f10862f);
                c3484cM5715c2 = C3484c.m5714b(c3486eArr[1], this.f10862f);
            } else {
                int[] iArr = (int[]) c3484c.m5719g(this.f10862f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c3484cM5715c = C3484c.m5715c(iArr[0], this.f10862f);
                c3484cM5715c2 = C3484c.m5715c(iArr[1], this.f10862f);
            }
            mapArr[i5].put("ImageWidth", c3484cM5715c);
            mapArr[i5].put("ImageLength", c3484cM5715c2);
            return;
        }
        if (c3484c2 != null && c3484c3 != null && c3484c4 != null && c3484c5 != null) {
            int iM5717e = c3484c2.m5717e(this.f10862f);
            int iM5717e2 = c3484c4.m5717e(this.f10862f);
            int iM5717e3 = c3484c5.m5717e(this.f10862f);
            int iM5717e4 = c3484c3.m5717e(this.f10862f);
            if (iM5717e2 <= iM5717e || iM5717e3 <= iM5717e4) {
                return;
            }
            C3484c c3484cM5715c3 = C3484c.m5715c(iM5717e2 - iM5717e, this.f10862f);
            C3484c c3484cM5715c4 = C3484c.m5715c(iM5717e3 - iM5717e4, this.f10862f);
            mapArr[i5].put("ImageLength", c3484cM5715c3);
            mapArr[i5].put("ImageWidth", c3484cM5715c4);
            return;
        }
        C3484c c3484c6 = (C3484c) mapArr[i5].get("ImageLength");
        C3484c c3484c7 = (C3484c) mapArr[i5].get("ImageWidth");
        if (c3484c6 == null || c3484c7 == null) {
            C3484c c3484c8 = (C3484c) mapArr[i5].get("JPEGInterchangeFormat");
            C3484c c3484c9 = (C3484c) mapArr[i5].get("JPEGInterchangeFormatLength");
            if (c3484c8 == null || c3484c9 == null) {
                return;
            }
            int iM5717e5 = c3484c8.m5717e(this.f10862f);
            int iM5717e6 = c3484c8.m5717e(this.f10862f);
            c3487f.m5720c(iM5717e5);
            byte[] bArr = new byte[iM5717e6];
            c3487f.read(bArr);
            m5726e(new C3483b(bArr), iM5717e5, i5);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5744x() throws Throwable {
        m5742v(0, 5);
        m5742v(0, 4);
        m5742v(5, 4);
        HashMap[] mapArr = this.f10860d;
        C3484c c3484c = (C3484c) mapArr[1].get("PixelXDimension");
        C3484c c3484c2 = (C3484c) mapArr[1].get("PixelYDimension");
        if (c3484c != null && c3484c2 != null) {
            mapArr[0].put("ImageWidth", c3484c);
            mapArr[0].put("ImageLength", c3484c2);
        }
        if (mapArr[4].isEmpty() && m5735n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m5735n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m5740t(0, "ThumbnailOrientation", "Orientation");
        m5740t(0, "ThumbnailImageLength", "ImageLength");
        m5740t(0, "ThumbnailImageWidth", "ImageWidth");
        m5740t(5, "ThumbnailOrientation", "Orientation");
        m5740t(5, "ThumbnailImageLength", "ImageLength");
        m5740t(5, "ThumbnailImageWidth", "ImageWidth");
        m5740t(4, "Orientation", "ThumbnailOrientation");
        m5740t(4, "ImageLength", "ThumbnailImageLength");
        m5740t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
