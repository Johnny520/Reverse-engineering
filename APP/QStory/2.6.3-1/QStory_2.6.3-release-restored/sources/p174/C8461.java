package p174;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.activity.AbstractC0900;
import com.android.p002dx.p005io.Opcodes;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
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
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import net.bytebuddy.description.modifier.ModifierContributor;
import p025.AbstractC7012;
import p034.AbstractC7082;
import p035.C7092;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8461 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final byte[] f21024;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final Charset f21025;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final byte[] f21026;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final HashMap[] f21027;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final HashMap[] f21028;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final HashMap f21029;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final HashSet f21030;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final C8456[] f21037;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final C8456[][] f21038;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C8456 f21039;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final byte[] f21040;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final int[] f21041;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final String[] f21042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final HashSet f21055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final HashMap[] f21056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f21057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AssetManager.AssetInputStream f21058;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final FileDescriptor f21059;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f21060;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f21061;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ByteOrder f21062;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f21063;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f21064;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f21065;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f21066;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final boolean f21050 = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final List f21049 = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final List f21053 = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final int[] f21054 = {8, 8, 8};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final int[] f21051 = {8};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final byte[] f21052 = {-1, -40, -1};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final byte[] f21044 = {102, 116, 121, 112};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final byte[] f21043 = {109, 105, 102, 49};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final byte[] f21047 = {104, 101, 105, 99};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final byte[] f21048 = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final byte[] f21045 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final byte[] f21046 = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final byte[] f21036 = {101, 88, 73, 102};

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final byte[] f21035 = {73, 72, 68, 82};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final byte[] f21034 = {73, 69, 78, 68};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final byte[] f21033 = {82, 73, 70, 70};

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final byte[] f21032 = {87, 69, 66, 80};

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final byte[] f21031 = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f21042 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f21041 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f21040 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C8456[] c8456Arr = {new C8456("NewSubfileType", Opcodes.CONST_METHOD_HANDLE, 4), new C8456("SubfileType", Opcodes.CONST_METHOD_TYPE, 4), new C8456("ImageWidth", 256, 3, 4), new C8456("ImageLength", 257, 3, 4), new C8456("BitsPerSample", 258, 3), new C8456("Compression", 259, 3), new C8456("PhotometricInterpretation", 262, 3), new C8456("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new C8456("Make", 271, 2), new C8456("Model", 272, 2), new C8456("StripOffsets", 273, 3, 4), new C8456("Orientation", 274, 3), new C8456("SamplesPerPixel", 277, 3), new C8456("RowsPerStrip", 278, 3, 4), new C8456("StripByteCounts", 279, 3, 4), new C8456("XResolution", 282, 5), new C8456("YResolution", 283, 5), new C8456("PlanarConfiguration", 284, 3), new C8456("ResolutionUnit", 296, 3), new C8456("TransferFunction", 301, 3), new C8456("Software", 305, 2), new C8456("DateTime", 306, 2), new C8456("Artist", 315, 2), new C8456("WhitePoint", 318, 5), new C8456("PrimaryChromaticities", 319, 5), new C8456("SubIFDPointer", 330, 4), new C8456("JPEGInterchangeFormat", 513, 4), new C8456("JPEGInterchangeFormatLength", 514, 4), new C8456("YCbCrCoefficients", 529, 5), new C8456("YCbCrSubSampling", 530, 3), new C8456("YCbCrPositioning", 531, 3), new C8456("ReferenceBlackWhite", 532, 5), new C8456("Copyright", 33432, 2), new C8456("ExifIFDPointer", 34665, 4), new C8456("GPSInfoIFDPointer", 34853, 4), new C8456("SensorTopBorder", 4, 4), new C8456("SensorLeftBorder", 5, 4), new C8456("SensorBottomBorder", 6, 4), new C8456("SensorRightBorder", 7, 4), new C8456("ISO", 23, 3), new C8456("JpgFromRaw", 46, 7), new C8456("Xmp", 700, 1)};
        C8456[] c8456Arr2 = {new C8456("ExposureTime", 33434, 5), new C8456("FNumber", 33437, 5), new C8456("ExposureProgram", 34850, 3), new C8456("SpectralSensitivity", 34852, 2), new C8456("PhotographicSensitivity", 34855, 3), new C8456("OECF", 34856, 7), new C8456("SensitivityType", 34864, 3), new C8456("StandardOutputSensitivity", 34865, 4), new C8456("RecommendedExposureIndex", 34866, 4), new C8456("ISOSpeed", 34867, 4), new C8456("ISOSpeedLatitudeyyy", 34868, 4), new C8456("ISOSpeedLatitudezzz", 34869, 4), new C8456("ExifVersion", 36864, 2), new C8456("DateTimeOriginal", 36867, 2), new C8456("DateTimeDigitized", 36868, 2), new C8456("OffsetTime", ModifierContributor.ForParameter.MASK, 2), new C8456("OffsetTimeOriginal", 36881, 2), new C8456("OffsetTimeDigitized", 36882, 2), new C8456("ComponentsConfiguration", 37121, 7), new C8456("CompressedBitsPerPixel", 37122, 5), new C8456("ShutterSpeedValue", 37377, 10), new C8456("ApertureValue", 37378, 5), new C8456("BrightnessValue", 37379, 10), new C8456("ExposureBiasValue", 37380, 10), new C8456("MaxApertureValue", 37381, 5), new C8456("SubjectDistance", 37382, 5), new C8456("MeteringMode", 37383, 3), new C8456("LightSource", 37384, 3), new C8456("Flash", 37385, 3), new C8456("FocalLength", 37386, 5), new C8456("SubjectArea", 37396, 3), new C8456("MakerNote", 37500, 7), new C8456("UserComment", 37510, 7), new C8456("SubSecTime", 37520, 2), new C8456("SubSecTimeOriginal", 37521, 2), new C8456("SubSecTimeDigitized", 37522, 2), new C8456("FlashpixVersion", 40960, 7), new C8456("ColorSpace", 40961, 3), new C8456("PixelXDimension", 40962, 3, 4), new C8456("PixelYDimension", 40963, 3, 4), new C8456("RelatedSoundFile", 40964, 2), new C8456("InteroperabilityIFDPointer", 40965, 4), new C8456("FlashEnergy", 41483, 5), new C8456("SpatialFrequencyResponse", 41484, 7), new C8456("FocalPlaneXResolution", 41486, 5), new C8456("FocalPlaneYResolution", 41487, 5), new C8456("FocalPlaneResolutionUnit", 41488, 3), new C8456("SubjectLocation", 41492, 3), new C8456("ExposureIndex", 41493, 5), new C8456("SensingMethod", 41495, 3), new C8456("FileSource", 41728, 7), new C8456("SceneType", 41729, 7), new C8456("CFAPattern", 41730, 7), new C8456("CustomRendered", 41985, 3), new C8456("ExposureMode", 41986, 3), new C8456("WhiteBalance", 41987, 3), new C8456("DigitalZoomRatio", 41988, 5), new C8456("FocalLengthIn35mmFilm", 41989, 3), new C8456("SceneCaptureType", 41990, 3), new C8456("GainControl", 41991, 3), new C8456("Contrast", 41992, 3), new C8456("Saturation", 41993, 3), new C8456("Sharpness", 41994, 3), new C8456("DeviceSettingDescription", 41995, 7), new C8456("SubjectDistanceRange", 41996, 3), new C8456("ImageUniqueID", 42016, 2), new C8456("CameraOwnerName", 42032, 2), new C8456("BodySerialNumber", 42033, 2), new C8456("LensSpecification", 42034, 5), new C8456("LensMake", 42035, 2), new C8456("LensModel", 42036, 2), new C8456("Gamma", 42240, 5), new C8456("DNGVersion", 50706, 1), new C8456("DefaultCropSize", 50720, 3, 4)};
        C8456[] c8456Arr3 = {new C8456("GPSVersionID", 0, 1), new C8456("GPSLatitudeRef", 1, 2), new C8456("GPSLatitude", 2, 5, 10), new C8456("GPSLongitudeRef", 3, 2), new C8456("GPSLongitude", 4, 5, 10), new C8456("GPSAltitudeRef", 5, 1), new C8456("GPSAltitude", 6, 5), new C8456("GPSTimeStamp", 7, 5), new C8456("GPSSatellites", 8, 2), new C8456("GPSStatus", 9, 2), new C8456("GPSMeasureMode", 10, 2), new C8456("GPSDOP", 11, 5), new C8456("GPSSpeedRef", 12, 2), new C8456("GPSSpeed", 13, 5), new C8456("GPSTrackRef", 14, 2), new C8456("GPSTrack", 15, 5), new C8456("GPSImgDirectionRef", 16, 2), new C8456("GPSImgDirection", 17, 5), new C8456("GPSMapDatum", 18, 2), new C8456("GPSDestLatitudeRef", 19, 2), new C8456("GPSDestLatitude", 20, 5), new C8456("GPSDestLongitudeRef", 21, 2), new C8456("GPSDestLongitude", 22, 5), new C8456("GPSDestBearingRef", 23, 2), new C8456("GPSDestBearing", 24, 5), new C8456("GPSDestDistanceRef", 25, 2), new C8456("GPSDestDistance", 26, 5), new C8456("GPSProcessingMethod", 27, 7), new C8456("GPSAreaInformation", 28, 7), new C8456("GPSDateStamp", 29, 2), new C8456("GPSDifferential", 30, 3), new C8456("GPSHPositioningError", 31, 5)};
        C8456[] c8456Arr4 = {new C8456("InteroperabilityIndex", 1, 2)};
        C8456[] c8456Arr5 = {new C8456("NewSubfileType", Opcodes.CONST_METHOD_HANDLE, 4), new C8456("SubfileType", Opcodes.CONST_METHOD_TYPE, 4), new C8456("ThumbnailImageWidth", 256, 3, 4), new C8456("ThumbnailImageLength", 257, 3, 4), new C8456("BitsPerSample", 258, 3), new C8456("Compression", 259, 3), new C8456("PhotometricInterpretation", 262, 3), new C8456("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new C8456("Make", 271, 2), new C8456("Model", 272, 2), new C8456("StripOffsets", 273, 3, 4), new C8456("ThumbnailOrientation", 274, 3), new C8456("SamplesPerPixel", 277, 3), new C8456("RowsPerStrip", 278, 3, 4), new C8456("StripByteCounts", 279, 3, 4), new C8456("XResolution", 282, 5), new C8456("YResolution", 283, 5), new C8456("PlanarConfiguration", 284, 3), new C8456("ResolutionUnit", 296, 3), new C8456("TransferFunction", 301, 3), new C8456("Software", 305, 2), new C8456("DateTime", 306, 2), new C8456("Artist", 315, 2), new C8456("WhitePoint", 318, 5), new C8456("PrimaryChromaticities", 319, 5), new C8456("SubIFDPointer", 330, 4), new C8456("JPEGInterchangeFormat", 513, 4), new C8456("JPEGInterchangeFormatLength", 514, 4), new C8456("YCbCrCoefficients", 529, 5), new C8456("YCbCrSubSampling", 530, 3), new C8456("YCbCrPositioning", 531, 3), new C8456("ReferenceBlackWhite", 532, 5), new C8456("Copyright", 33432, 2), new C8456("ExifIFDPointer", 34665, 4), new C8456("GPSInfoIFDPointer", 34853, 4), new C8456("DNGVersion", 50706, 1), new C8456("DefaultCropSize", 50720, 3, 4)};
        f21039 = new C8456("StripOffsets", 273, 3);
        f21038 = new C8456[][]{c8456Arr, c8456Arr2, c8456Arr3, c8456Arr4, c8456Arr5, c8456Arr, new C8456[]{new C8456("ThumbnailImage", 256, 7), new C8456("CameraSettingsIFDPointer", 8224, 4), new C8456("ImageProcessingIFDPointer", 8256, 4)}, new C8456[]{new C8456("PreviewImageStart", 257, 4), new C8456("PreviewImageLength", 258, 4)}, new C8456[]{new C8456("AspectFrame", 4371, 3)}, new C8456[]{new C8456("ColorSpace", 55, 3)}};
        f21037 = new C8456[]{new C8456("SubIFDPointer", 330, 4), new C8456("ExifIFDPointer", 34665, 4), new C8456("GPSInfoIFDPointer", 34853, 4), new C8456("InteroperabilityIFDPointer", 40965, 4), new C8456("CameraSettingsIFDPointer", 8224, 1), new C8456("ImageProcessingIFDPointer", 8256, 1)};
        f21028 = new HashMap[10];
        f21027 = new HashMap[10];
        f21030 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f21029 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f21025 = charsetForName;
        f21026 = "Exif\u0000\u0000".getBytes(charsetForName);
        f21024 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C8456[][] c8456Arr6 = f21038;
            if (i >= c8456Arr6.length) {
                HashMap map = f21029;
                C8456[] c8456Arr7 = f21037;
                map.put(Integer.valueOf(c8456Arr7[0].f21011), 5);
                map.put(Integer.valueOf(c8456Arr7[1].f21011), 1);
                map.put(Integer.valueOf(c8456Arr7[2].f21011), 2);
                map.put(Integer.valueOf(c8456Arr7[3].f21011), 3);
                map.put(Integer.valueOf(c8456Arr7[4].f21011), 7);
                map.put(Integer.valueOf(c8456Arr7[5].f21011), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f21028[i] = new HashMap();
            f21027[i] = new HashMap();
            for (C8456 c8456 : c8456Arr6[i]) {
                f21028[i].put(Integer.valueOf(c8456.f21011), c8456);
                f21027[i].put(c8456.f21010, c8456);
            }
            i++;
        }
    }

    public C8461(String str) throws Throwable {
        FileInputStream fileInputStream;
        boolean z;
        C8456[][] c8456Arr = f21038;
        this.f21056 = new HashMap[c8456Arr.length];
        this.f21055 = new HashSet(c8456Arr.length);
        this.f21062 = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream2 = null;
        this.f21058 = null;
        this.f21060 = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                AbstractC8460.m13426(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z = true;
            } catch (Exception unused) {
                if (f21050) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                z = false;
            }
            if (z) {
                this.f21059 = fileInputStream.getFD();
            } else {
                this.f21059 = null;
            }
            m13446(fileInputStream);
            try {
                fileInputStream.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static ByteOrder m13429(C8458 c8458) throws IOException {
        short s = c8458.readShort();
        boolean z = f21050;
        if (s == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            C7092.m12336(Integer.toHexString(s), "Invalid byte order: ");
            return null;
        }
        if (z) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m13430() throws Throwable {
        m13439(0, 5);
        m13439(0, 4);
        m13439(5, 4);
        HashMap[] mapArr = this.f21056;
        C8457 c8457 = (C8457) mapArr[1].get("PixelXDimension");
        C8457 c84572 = (C8457) mapArr[1].get("PixelYDimension");
        if (c8457 != null && c84572 != null) {
            mapArr[0].put("ImageWidth", c8457);
            mapArr[0].put("ImageLength", c84572);
        }
        if (mapArr[4].isEmpty() && m13443(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m13443(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m13441(0, "ThumbnailOrientation", "Orientation");
        m13441(0, "ThumbnailImageLength", "ImageLength");
        m13441(0, "ThumbnailImageWidth", "ImageWidth");
        m13441(5, "ThumbnailOrientation", "Orientation");
        m13441(5, "ThumbnailImageLength", "ImageLength");
        m13441(5, "ThumbnailImageWidth", "ImageWidth");
        m13441(4, "Orientation", "ThumbnailOrientation");
        m13441(4, "ImageLength", "ThumbnailImageLength");
        m13441(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:162|12|(4:145|13|146|14)|(17:17|(2:19|(1:21))(1:26)|27|(1:29)|30|(1:32)(2:33|(3:34|35|(4:37|148|38|(1:170)(3:41|(3:44|(1:46)(2:47|(1:49))|(1:173)(3:171|52|53))(1:174)|54))(2:169|57)))|62|(1:64)|(1:40)|154|67|156|68|69|(1:75)(1:74)|76|(1:89)(8:152|91|150|92|93|(1:96)|97|(1:109)(2:111|(2:112|(2:114|(4:164|116|(2:117|(2:119|(1:166)(1:122))(3:165|123|(2:124|(2:126|(1:168)(1:129))(2:167|130))))|128)(1:132))(2:163|133)))))|16|154|67|156|68|69|(3:71|75|76)(0)|(0)(0)) */
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
    /* JADX WARN: Removed duplicated region for block: B:136:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ca A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:14:0x0039, B:19:0x005a, B:30:0x0076, B:33:0x007c, B:34:0x0082, B:38:0x008c, B:44:0x009b, B:47:0x00a5, B:62:0x00c6, B:64:0x00ca), top: B:145:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m13431(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        C8458 c8458;
        int i2;
        int i3;
        long j;
        byte[] bArr;
        long j2;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr3 = f21052;
            if (i4 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i4] != bArr3[i4]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i5 = 0; i5 < bytes.length; i5++) {
                    byte b = bArr2[i5];
                    ?? r7 = bytes[i5];
                    if (b != r7) {
                        ?? r4 = 0;
                        C8458 c84582 = null;
                        C8458 c84583 = null;
                        C8458 c84584 = null;
                        try {
                            try {
                                c8458 = new C8458(bArr2);
                                try {
                                    j = c8458.readInt();
                                    bArr = new byte[4];
                                    c8458.read(bArr);
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
                            c8458 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (r4 != 0) {
                            }
                            throw th;
                        }
                        if (Arrays.equals(bArr, f21044)) {
                            if (j == 1) {
                                j = c8458.readLong();
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
                                        if (c8458.read(bArr4) != 4) {
                                            break;
                                        }
                                        if (j4 != 1) {
                                            if (Arrays.equals(bArr4, f21043)) {
                                                z = true;
                                            } else if (Arrays.equals(bArr4, f21047)) {
                                                z2 = true;
                                            }
                                            if (z && z2) {
                                                c8458.close();
                                                return 12;
                                            }
                                        }
                                        j4++;
                                    } catch (Exception e3) {
                                        e = e3;
                                        if (f21050) {
                                        }
                                        if (c8458 != null) {
                                            break;
                                        }
                                        C8458 c84585 = new C8458(bArr2);
                                        ByteOrder byteOrderM13429 = m13429(c84585);
                                        this.f21062 = byteOrderM13429;
                                        c84585.f21019 = byteOrderM13429;
                                        short s = c84585.readShort();
                                        if (s == 20306) {
                                        }
                                        if (i2 != 0) {
                                        }
                                    }
                                }
                            }
                            if (f21050) {
                                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                            }
                            if (c8458 != null) {
                                c8458.close();
                            }
                            C8458 c845852 = new C8458(bArr2);
                            ByteOrder byteOrderM134292 = m13429(c845852);
                            this.f21062 = byteOrderM134292;
                            c845852.f21019 = byteOrderM134292;
                            short s2 = c845852.readShort();
                            i2 = (s2 == 20306 || s2 == 21330) ? 1 : i;
                            c845852.close();
                            if (i2 != 0) {
                                return 7;
                            }
                            try {
                                C8458 c84586 = new C8458(bArr2);
                                try {
                                    ByteOrder byteOrderM134293 = m13429(c84586);
                                    this.f21062 = byteOrderM134293;
                                    c84586.f21019 = byteOrderM134293;
                                    i3 = c84586.readShort() != 85 ? i : 1;
                                    c84586.close();
                                } catch (Exception unused) {
                                    c84582 = c84586;
                                    if (c84582 != null) {
                                        c84582.close();
                                    }
                                    i3 = i;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c84583 = c84586;
                                    if (c84583 != null) {
                                        c84583.close();
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
                            int i6 = i;
                            while (true) {
                                byte[] bArr5 = f21046;
                                if (i6 >= bArr5.length) {
                                    return 13;
                                }
                                if (bArr2[i6] != bArr5[i6]) {
                                    int i7 = i;
                                    while (true) {
                                        byte[] bArr6 = f21033;
                                        if (i7 >= bArr6.length) {
                                            int i8 = i;
                                            while (true) {
                                                byte[] bArr7 = f21032;
                                                if (i8 >= bArr7.length) {
                                                    return 14;
                                                }
                                                if (bArr2[bArr6.length + i8 + 4] != bArr7[i8]) {
                                                    break;
                                                }
                                                i8++;
                                            }
                                        } else {
                                            if (bArr2[i7] != bArr6[i7]) {
                                                break;
                                            }
                                            i7++;
                                        }
                                    }
                                    return i;
                                }
                                i6++;
                            }
                        }
                        c8458.close();
                        i = 0;
                        C8458 c8458522 = new C8458(bArr2);
                        ByteOrder byteOrderM1342922 = m13429(c8458522);
                        this.f21062 = byteOrderM1342922;
                        c8458522.f21019 = byteOrderM1342922;
                        short s22 = c8458522.readShort();
                        if (s22 == 20306) {
                            c8458522.close();
                        }
                        if (i2 != 0) {
                        }
                    }
                }
                return 9;
            }
            i4++;
        }
    }

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
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13432(p174.C8458 r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p174.C8461.m13432(飘花落叶言子哲兰楪世苏.飘花落叶言子楪世苏兰哲, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13433(C8454 c8454) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            C6755.m11867("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC8462.m13454(mediaMetadataRetriever, new C8459(c8454));
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
                HashMap[] mapArr = this.f21056;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C8457.m13418(Integer.parseInt(strExtractMetadata), this.f21062));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C8457.m13418(Integer.parseInt(strExtractMetadata2), this.f21062));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", C8457.m13418(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f21062));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c8454.m13417(i2);
                    byte[] bArr = new byte[6];
                    if (c8454.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, f21026)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (c8454.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.f21065 = i4;
                    m13438(bArr2, 0);
                }
                if (f21050) {
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8457 m13434(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f21050) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f21038.length; i++) {
            C8457 c8457 = (C8457) this.f21056[i].get(str);
            if (c8457 != null) {
                return c8457;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m13435(String str) {
        C8457 c8457M13434 = m13434(str);
        if (c8457M13434 != null) {
            int i = c8457M13434.f21015;
            if (!f21030.contains(str)) {
                return c8457M13434.m13421(this.f21062);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C8455[] c8455Arr = (C8455[]) c8457M13434.m13424(this.f21062);
                if (c8455Arr == null || c8455Arr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c8455Arr));
                    return null;
                }
                C8455 c8455 = c8455Arr[0];
                Integer numValueOf = Integer.valueOf((int) (c8455.f21007 / c8455.f21006));
                C8455 c84552 = c8455Arr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c84552.f21007 / c84552.f21006));
                C8455 c84553 = c8455Arr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c84553.f21007 / c84553.f21006)));
            }
            try {
                return Double.toString(c8457M13434.m13423(this.f21062));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13436() {
        String strM13435 = m13435("DateTimeOriginal");
        HashMap[] mapArr = this.f21056;
        if (strM13435 != null && m13435("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM13435.concat("\u0000").getBytes(f21025);
            map.put("DateTime", new C8457(2, bytes, bytes.length));
        }
        if (m13435("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C8457.m13420(0L, this.f21062));
        }
        if (m13435("ImageLength") == null) {
            mapArr[0].put("ImageLength", C8457.m13420(0L, this.f21062));
        }
        if (m13435("Orientation") == null) {
            mapArr[0].put("Orientation", C8457.m13420(0L, this.f21062));
        }
        if (m13435("LightSource") == null) {
            mapArr[1].put("LightSource", C8457.m13420(0L, this.f21062));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13437(C8454 c8454, int i) throws IOException {
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
        Integer numValueOf = Integer.valueOf(c8454.f21020);
        HashSet hashSet = this.f21055;
        hashSet.add(numValueOf);
        short s3 = c8454.readShort();
        boolean z3 = f21050;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s3));
        }
        if (s3 <= 0) {
            return;
        }
        short s4 = 0;
        while (true) {
            mapArr = this.f21056;
            if (s4 >= s3) {
                break;
            }
            int unsignedShort2 = c8454.readUnsignedShort();
            int unsignedShort3 = c8454.readUnsignedShort();
            int i5 = c8454.readInt();
            long j5 = ((long) c8454.f21020) + 4;
            C8456 c8456 = (C8456) f21028[i].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                s = s3;
                z = z3;
                s2 = s4;
                mapArr2 = mapArr;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c8456 != null ? c8456.f21010 : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i5)));
            } else {
                s = s3;
                z = z3;
                s2 = s4;
                mapArr2 = mapArr;
            }
            if (c8456 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f21041;
                    if (unsignedShort3 < iArr.length) {
                        int i6 = c8456.f21009;
                        if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3 || (i2 = c8456.f21008) == unsignedShort3 || (((i6 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i6 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i6 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
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
                                    c8454.m13417(j);
                                } else {
                                    long j6 = j;
                                    if (j2 > 4) {
                                        int i7 = c8454.readInt();
                                        if (z) {
                                            i3 = unsignedShort2;
                                            Log.d("ExifInterface", "seek to data offset: " + i7);
                                        } else {
                                            i3 = unsignedShort2;
                                        }
                                        if (this.f21057 != 7) {
                                            j3 = j6;
                                            i4 = unsignedShort3;
                                            c8454.m13417(i7);
                                        } else {
                                            if ("MakerNote".equals(c8456.f21010)) {
                                                this.f21066 = i7;
                                            } else {
                                                if (i == 6 && "ThumbnailImage".equals(c8456.f21010)) {
                                                    this.f21063 = i7;
                                                    this.f21064 = i5;
                                                    C8457 c8457M13418 = C8457.m13418(6, this.f21062);
                                                    j3 = j6;
                                                    C8457 c8457M13420 = C8457.m13420(this.f21063, this.f21062);
                                                    i4 = unsignedShort3;
                                                    C8457 c8457M134202 = C8457.m13420(this.f21064, this.f21062);
                                                    mapArr2[4].put("Compression", c8457M13418);
                                                    mapArr2[4].put("JPEGInterchangeFormat", c8457M13420);
                                                    mapArr2[4].put("JPEGInterchangeFormatLength", c8457M134202);
                                                }
                                                c8454.m13417(i7);
                                            }
                                            j3 = j6;
                                            i4 = unsignedShort3;
                                            c8454.m13417(i7);
                                        }
                                    } else {
                                        j3 = j6;
                                        i3 = unsignedShort2;
                                        i4 = unsignedShort3;
                                    }
                                    Integer num = (Integer) f21029.get(Integer.valueOf(i3));
                                    if (z) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                                    }
                                    if (num != null) {
                                        int i8 = i4;
                                        if (i8 != 3) {
                                            if (i8 == 4) {
                                                j4 = ((long) c8454.readInt()) & 4294967295L;
                                            } else if (i8 == 8) {
                                                unsignedShort = c8454.readShort();
                                            } else if (i8 == 9 || i8 == 13) {
                                                unsignedShort = c8454.readInt();
                                            } else {
                                                j4 = -1;
                                            }
                                            if (z) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), c8456.f21010));
                                            }
                                            if (j4 <= 0) {
                                                if (!hashSet.contains(Integer.valueOf((int) j4))) {
                                                    c8454.m13417(j4);
                                                    m13437(c8454, num.intValue());
                                                } else if (z) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j4 + ")");
                                                }
                                            } else if (z) {
                                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                                            }
                                            c8454.m13417(j3);
                                        } else {
                                            unsignedShort = c8454.readUnsignedShort();
                                        }
                                        j4 = unsignedShort;
                                        if (z) {
                                        }
                                        if (j4 <= 0) {
                                        }
                                        c8454.m13417(j3);
                                    } else {
                                        long j7 = j3;
                                        int i9 = c8454.f21020 + this.f21065;
                                        byte[] bArr = new byte[(int) j2];
                                        c8454.readFully(bArr);
                                        C8457 c8457 = new C8457(i9, bArr, i4, i5);
                                        HashMap map = mapArr2[i];
                                        String str = c8456.f21010;
                                        map.put(str, c8457);
                                        if ("DNGVersion".equals(str)) {
                                            this.f21057 = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && c8457.m13421(this.f21062).contains("PENTAX")) || ("Compression".equals(str) && c8457.m13422(this.f21062) == 65535)) {
                                            this.f21057 = 8;
                                        }
                                        if (c8454.f21020 != j7) {
                                            c8454.m13417(j7);
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
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f21042[unsignedShort3] + ") is unexpected for tag: " + c8456.f21010);
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
        int i10 = c8454.readInt();
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
        c8454.m13417(j8);
        if (mapArr[4].isEmpty()) {
            m13437(c8454, 4);
        } else if (mapArr[5].isEmpty()) {
            m13437(c8454, 5);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m13438(byte[] bArr, int i) throws IOException {
        C8454 c8454 = new C8454(bArr);
        m13447(c8454);
        m13437(c8454, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m13439(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f21056;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f21050;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C8457 c8457 = (C8457) mapArr[i].get("ImageLength");
        C8457 c84572 = (C8457) mapArr[i].get("ImageWidth");
        C8457 c84573 = (C8457) mapArr[i2].get("ImageLength");
        C8457 c84574 = (C8457) mapArr[i2].get("ImageWidth");
        if (c8457 == null || c84572 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c84573 == null || c84574 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM13422 = c8457.m13422(this.f21062);
        int iM134222 = c84572.m13422(this.f21062);
        int iM134223 = c84573.m13422(this.f21062);
        int iM134224 = c84574.m13422(this.f21062);
        if (iM13422 >= iM134223 || iM134222 >= iM134224) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m13440(C8454 c8454, int i) throws Throwable {
        C8457 c8457M13418;
        C8457 c8457M134182;
        HashMap[] mapArr = this.f21056;
        C8457 c8457 = (C8457) mapArr[i].get("DefaultCropSize");
        C8457 c84572 = (C8457) mapArr[i].get("SensorTopBorder");
        C8457 c84573 = (C8457) mapArr[i].get("SensorLeftBorder");
        C8457 c84574 = (C8457) mapArr[i].get("SensorBottomBorder");
        C8457 c84575 = (C8457) mapArr[i].get("SensorRightBorder");
        if (c8457 != null) {
            int i2 = c8457.f21015;
            ByteOrder byteOrder = this.f21062;
            if (i2 == 5) {
                C8455[] c8455Arr = (C8455[]) c8457.m13424(byteOrder);
                if (c8455Arr == null || c8455Arr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c8455Arr));
                    return;
                }
                c8457M13418 = C8457.m13419(c8455Arr[0], this.f21062);
                c8457M134182 = C8457.m13419(c8455Arr[1], this.f21062);
            } else {
                int[] iArr = (int[]) c8457.m13424(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c8457M13418 = C8457.m13418(iArr[0], this.f21062);
                c8457M134182 = C8457.m13418(iArr[1], this.f21062);
            }
            mapArr[i].put("ImageWidth", c8457M13418);
            mapArr[i].put("ImageLength", c8457M134182);
            return;
        }
        if (c84572 != null && c84573 != null && c84574 != null && c84575 != null) {
            int iM13422 = c84572.m13422(this.f21062);
            int iM134222 = c84574.m13422(this.f21062);
            int iM134223 = c84575.m13422(this.f21062);
            int iM134224 = c84573.m13422(this.f21062);
            if (iM134222 <= iM13422 || iM134223 <= iM134224) {
                return;
            }
            C8457 c8457M134183 = C8457.m13418(iM134222 - iM13422, this.f21062);
            C8457 c8457M134184 = C8457.m13418(iM134223 - iM134224, this.f21062);
            mapArr[i].put("ImageLength", c8457M134183);
            mapArr[i].put("ImageWidth", c8457M134184);
            return;
        }
        C8457 c84576 = (C8457) mapArr[i].get("ImageLength");
        C8457 c84577 = (C8457) mapArr[i].get("ImageWidth");
        if (c84576 == null || c84577 == null) {
            C8457 c84578 = (C8457) mapArr[i].get("JPEGInterchangeFormat");
            C8457 c84579 = (C8457) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c84578 == null || c84579 == null) {
                return;
            }
            int iM134225 = c84578.m13422(this.f21062);
            int iM134226 = c84578.m13422(this.f21062);
            c8454.m13417(iM134225);
            byte[] bArr = new byte[iM134226];
            c8454.read(bArr);
            m13432(new C8458(bArr), iM134225, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m13441(int i, String str, String str2) {
        HashMap[] mapArr = this.f21056;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m13442(C8458 c8458) throws Throwable {
        C8457 c8457;
        int iM13422;
        HashMap map = this.f21056[4];
        C8457 c84572 = (C8457) map.get("Compression");
        if (c84572 == null) {
            m13444(c8458, map);
            return;
        }
        int iM134222 = c84572.m13422(this.f21062);
        if (iM134222 != 1) {
            if (iM134222 == 6) {
                m13444(c8458, map);
                return;
            } else if (iM134222 != 7) {
                return;
            }
        }
        C8457 c84573 = (C8457) map.get("BitsPerSample");
        if (c84573 != null) {
            int[] iArr = (int[]) c84573.m13424(this.f21062);
            int[] iArr2 = f21054;
            if (Arrays.equals(iArr2, iArr) || (this.f21057 == 3 && (c8457 = (C8457) map.get("PhotometricInterpretation")) != null && (((iM13422 = c8457.m13422(this.f21062)) == 1 && Arrays.equals(iArr, f21051)) || (iM13422 == 6 && Arrays.equals(iArr, iArr2))))) {
                C8457 c84574 = (C8457) map.get("StripOffsets");
                C8457 c84575 = (C8457) map.get("StripByteCounts");
                if (c84574 == null || c84575 == null) {
                    return;
                }
                long[] jArrM12299 = AbstractC7082.m12299(c84574.m13424(this.f21062));
                long[] jArrM122992 = AbstractC7082.m12299(c84575.m13424(this.f21062));
                if (jArrM12299 == null || jArrM12299.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM122992 == null || jArrM122992.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM12299.length != jArrM122992.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrM122992) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f21061 = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM12299.length; i3++) {
                    int i4 = (int) jArrM12299[i3];
                    int i5 = (int) jArrM122992[i3];
                    if (i3 < jArrM12299.length - 1 && i4 + i5 != jArrM12299[i3 + 1]) {
                        this.f21061 = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (c8458.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (c8458.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.f21061) {
                    long j4 = jArrM12299[0];
                    return;
                }
                return;
            }
        }
        if (f21050) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m13443(HashMap map) {
        C8457 c8457 = (C8457) map.get("ImageLength");
        C8457 c84572 = (C8457) map.get("ImageWidth");
        if (c8457 == null || c84572 == null) {
            return false;
        }
        return c8457.m13422(this.f21062) <= 512 && c84572.m13422(this.f21062) <= 512;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m13444(C8458 c8458, HashMap map) throws Throwable {
        C8457 c8457 = (C8457) map.get("JPEGInterchangeFormat");
        C8457 c84572 = (C8457) map.get("JPEGInterchangeFormatLength");
        if (c8457 == null || c84572 == null) {
            return;
        }
        int iM13422 = c8457.m13422(this.f21062);
        int iM134222 = c84572.m13422(this.f21062);
        if (this.f21057 == 7) {
            iM13422 += this.f21066;
        }
        if (iM13422 > 0 && iM134222 > 0 && this.f21060 == null && this.f21058 == null && this.f21059 == null) {
            c8458.skip(iM13422);
            c8458.read(new byte[iM134222]);
        }
        if (f21050) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM13422 + ", length: " + iM134222);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m13445() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f21056;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbM710 = AbstractC0900.m710(i, "The size of tag group[", "]: ");
            sbM710.append(mapArr[i].size());
            Log.d("ExifInterface", sbM710.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C8457 c8457 = (C8457) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c8457.toString() + ", tagValue: '" + c8457.m13421(this.f21062) + "'");
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0004, B:5:0x0009, B:12:0x001e, B:18:0x003b, B:20:0x0046, B:28:0x005c, B:23:0x004d, B:26:0x0055, B:27:0x0059, B:29:0x0066, B:31:0x006f, B:33:0x0075, B:35:0x007b, B:37:0x0081, B:43:0x008f), top: B:53:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13446(InputStream inputStream) {
        boolean z = f21050;
        for (int i = 0; i < f21038.length; i++) {
            try {
                try {
                    this.f21056[i] = new HashMap();
                } catch (Throwable th) {
                    m13436();
                    if (z) {
                        m13445();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m13436();
                if (z) {
                    return;
                }
                m13445();
                return;
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z) {
                }
                m13436();
                if (z) {
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iM13431 = m13431(bufferedInputStream);
        this.f21057 = iM13431;
        if (iM13431 == 4 || iM13431 == 9 || iM13431 == 13 || iM13431 == 14) {
            C8458 c8458 = new C8458(bufferedInputStream);
            int i2 = this.f21057;
            if (i2 == 4) {
                m13432(c8458, 0, 0);
            } else if (i2 == 13) {
                m13448(c8458);
            } else if (i2 == 9) {
                m13452(c8458);
            } else if (i2 == 14) {
                m13451(c8458);
            }
        } else {
            C8454 c8454 = new C8454(bufferedInputStream);
            int i3 = this.f21057;
            if (i3 == 12) {
                m13433(c8454);
            } else if (i3 == 7) {
                m13449(c8454);
            } else if (i3 == 10) {
                m13450(c8454);
            } else {
                m13453(c8454);
            }
            c8454.m13417(this.f21065);
            m13442(c8454);
        }
        m13436();
        if (z) {
            m13445();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m13447(C8454 c8454) throws IOException {
        ByteOrder byteOrderM13429 = m13429(c8454);
        this.f21062 = byteOrderM13429;
        c8454.f21019 = byteOrderM13429;
        int unsignedShort = c8454.readUnsignedShort();
        int i = this.f21057;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            C7092.m12336(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = c8454.readInt();
        if (i2 < 8) {
            C6755.m11866(AbstractC7012.m12147(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c8454.m13425(i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13448(C8458 c8458) throws Throwable {
        if (f21050) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c8458);
        }
        c8458.f21019 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f21046;
        c8458.m13425(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c8458.readInt();
                byte[] bArr2 = new byte[4];
                if (c8458.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f21035)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f21034)) {
                    return;
                }
                if (Arrays.equals(bArr2, f21036)) {
                    byte[] bArr3 = new byte[i];
                    if (c8458.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC7082.m12301(bArr2));
                    }
                    int i3 = c8458.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f21065 = i2;
                        m13438(bArr3, 0);
                        m13430();
                        m13442(new C8458(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c8458.m13425(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                C6755.m11866("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13449(C8454 c8454) throws Throwable {
        int i;
        int i2;
        m13453(c8454);
        HashMap[] mapArr = this.f21056;
        C8457 c8457 = (C8457) mapArr[1].get("MakerNote");
        if (c8457 != null) {
            C8454 c84542 = new C8454(c8457.f21012);
            c84542.f21019 = this.f21062;
            byte[] bArr = f21048;
            byte[] bArr2 = new byte[bArr.length];
            c84542.readFully(bArr2);
            c84542.m13417(0L);
            byte[] bArr3 = f21045;
            byte[] bArr4 = new byte[bArr3.length];
            c84542.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c84542.m13417(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c84542.m13417(12L);
            }
            m13437(c84542, 6);
            C8457 c84572 = (C8457) mapArr[7].get("PreviewImageStart");
            C8457 c84573 = (C8457) mapArr[7].get("PreviewImageLength");
            if (c84572 != null && c84573 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c84572);
                mapArr[5].put("JPEGInterchangeFormatLength", c84573);
            }
            C8457 c84574 = (C8457) mapArr[8].get("AspectFrame");
            if (c84574 != null) {
                int[] iArr = (int[]) c84574.m13424(this.f21062);
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
                C8457 c8457M13418 = C8457.m13418(i5, this.f21062);
                C8457 c8457M134182 = C8457.m13418(i6, this.f21062);
                mapArr[0].put("ImageWidth", c8457M13418);
                mapArr[0].put("ImageLength", c8457M134182);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m13450(C8454 c8454) throws Throwable {
        if (f21050) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c8454);
        }
        m13453(c8454);
        HashMap[] mapArr = this.f21056;
        C8457 c8457 = (C8457) mapArr[0].get("JpgFromRaw");
        if (c8457 != null) {
            m13432(new C8458(c8457.f21012), (int) c8457.f21013, 5);
        }
        C8457 c84572 = (C8457) mapArr[0].get("ISO");
        C8457 c84573 = (C8457) mapArr[1].get("PhotographicSensitivity");
        if (c84572 == null || c84573 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c84572);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m13451(C8458 c8458) throws Throwable {
        if (f21050) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c8458);
        }
        c8458.f21019 = ByteOrder.LITTLE_ENDIAN;
        c8458.m13425(f21033.length);
        int i = c8458.readInt() + 8;
        byte[] bArr = f21032;
        c8458.m13425(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c8458.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c8458.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f21031, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c8458.read(bArr3) == i2) {
                        this.f21065 = i3;
                        m13438(bArr3, 0);
                        m13442(new C8458(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC7082.m12301(bArr2));
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
                c8458.m13425(i2);
            } catch (EOFException unused) {
                C6755.m11866("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13452(C8458 c8458) throws Throwable {
        boolean z = f21050;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c8458);
        }
        c8458.m13425(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c8458.read(bArr);
        c8458.read(bArr2);
        c8458.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c8458.m13425(i - c8458.f21020);
        c8458.read(bArr4);
        m13432(new C8458(bArr4), i, 5);
        c8458.m13425(i3 - c8458.f21020);
        c8458.f21019 = ByteOrder.BIG_ENDIAN;
        int i4 = c8458.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c8458.readUnsignedShort();
            int unsignedShort2 = c8458.readUnsignedShort();
            if (unsignedShort == f21039.f21011) {
                short s = c8458.readShort();
                short s2 = c8458.readShort();
                C8457 c8457M13418 = C8457.m13418(s, this.f21062);
                C8457 c8457M134182 = C8457.m13418(s2, this.f21062);
                HashMap[] mapArr = this.f21056;
                mapArr[0].put("ImageLength", c8457M13418);
                mapArr[0].put("ImageWidth", c8457M134182);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            c8458.m13425(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m13453(C8454 c8454) throws Throwable {
        m13447(c8454);
        m13437(c8454, 0);
        m13440(c8454, 0);
        m13440(c8454, 5);
        m13440(c8454, 4);
        m13430();
        if (this.f21057 == 8) {
            HashMap[] mapArr = this.f21056;
            C8457 c8457 = (C8457) mapArr[1].get("MakerNote");
            if (c8457 != null) {
                C8454 c84542 = new C8454(c8457.f21012);
                c84542.f21019 = this.f21062;
                c84542.m13425(6);
                m13437(c84542, 9);
                C8457 c84572 = (C8457) mapArr[9].get("ColorSpace");
                if (c84572 != null) {
                    mapArr[1].put("ColorSpace", c84572);
                }
            }
        }
    }

    public C8461(InputStream inputStream) throws IOException {
        C8456[][] c8456Arr = f21038;
        this.f21056 = new HashMap[c8456Arr.length];
        this.f21055 = new HashSet(c8456Arr.length);
        this.f21062 = ByteOrder.BIG_ENDIAN;
        this.f21060 = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f21058 = (AssetManager.AssetInputStream) inputStream;
            this.f21059 = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC8460.m13426(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f21058 = null;
                this.f21059 = fileInputStream.getFD();
            } catch (Exception unused) {
                if (f21050) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f21058 = null;
                this.f21059 = null;
            }
        } else {
            this.f21058 = null;
            this.f21059 = null;
        }
        m13446(inputStream);
    }
}
