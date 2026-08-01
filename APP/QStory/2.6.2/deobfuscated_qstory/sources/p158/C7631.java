package p158;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.activity.AbstractC0053;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3064;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
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
import lin.xposed.BuildConfig;
import net.bytebuddy.description.modifier.ModifierContributor;
import p007.AbstractC6136;
import p022.C6267;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7631 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final byte[] f20684;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final Charset f20685;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final byte[] f20686;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final HashMap[] f20687;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final HashMap[] f20688;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final HashMap f20689;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final HashSet f20690;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final C7626[] f20697;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final C7626[][] f20698;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C7626 f20699;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final byte[] f20700;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final int[] f20701;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final String[] f20702;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final HashSet f20715;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final HashMap[] f20716;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f20717;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AssetManager.AssetInputStream f20718;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final FileDescriptor f20719;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f20720;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f20721;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ByteOrder f20722;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f20723;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f20724;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f20725;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f20726;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final boolean f20710 = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final List f20709 = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final List f20713 = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final int[] f20714 = {8, 8, 8};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final int[] f20711 = {8};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final byte[] f20712 = {-1, -40, -1};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final byte[] f20704 = {102, 116, 121, 112};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final byte[] f20703 = {109, 105, 102, 49};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final byte[] f20707 = {104, 101, 105, 99};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final byte[] f20708 = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final byte[] f20705 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final byte[] f20706 = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final byte[] f20696 = {101, 88, 73, 102};

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final byte[] f20695 = {73, 72, 68, 82};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final byte[] f20694 = {73, 69, 78, 68};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final byte[] f20693 = {82, 73, 70, 70};

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final byte[] f20692 = {87, 69, 66, 80};

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final byte[] f20691 = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f20702 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f20701 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f20700 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C7626[] c7626Arr = {new C7626("NewSubfileType", Opcodes.CONST_METHOD_HANDLE, 4), new C7626("SubfileType", Opcodes.CONST_METHOD_TYPE, 4), new C7626("ImageWidth", 256, 3, 4), new C7626("ImageLength", 257, 3, 4), new C7626("BitsPerSample", 258, 3), new C7626("Compression", 259, 3), new C7626("PhotometricInterpretation", BuildConfig.VERSION_CODE, 3), new C7626("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new C7626("Make", 271, 2), new C7626("Model", 272, 2), new C7626("StripOffsets", 273, 3, 4), new C7626("Orientation", 274, 3), new C7626("SamplesPerPixel", 277, 3), new C7626("RowsPerStrip", 278, 3, 4), new C7626("StripByteCounts", 279, 3, 4), new C7626("XResolution", 282, 5), new C7626("YResolution", 283, 5), new C7626("PlanarConfiguration", 284, 3), new C7626("ResolutionUnit", 296, 3), new C7626("TransferFunction", 301, 3), new C7626("Software", 305, 2), new C7626("DateTime", 306, 2), new C7626("Artist", 315, 2), new C7626("WhitePoint", 318, 5), new C7626("PrimaryChromaticities", 319, 5), new C7626("SubIFDPointer", 330, 4), new C7626("JPEGInterchangeFormat", 513, 4), new C7626("JPEGInterchangeFormatLength", 514, 4), new C7626("YCbCrCoefficients", 529, 5), new C7626("YCbCrSubSampling", 530, 3), new C7626("YCbCrPositioning", 531, 3), new C7626("ReferenceBlackWhite", 532, 5), new C7626("Copyright", 33432, 2), new C7626("ExifIFDPointer", 34665, 4), new C7626("GPSInfoIFDPointer", 34853, 4), new C7626("SensorTopBorder", 4, 4), new C7626("SensorLeftBorder", 5, 4), new C7626("SensorBottomBorder", 6, 4), new C7626("SensorRightBorder", 7, 4), new C7626("ISO", 23, 3), new C7626("JpgFromRaw", 46, 7), new C7626("Xmp", 700, 1)};
        C7626[] c7626Arr2 = {new C7626("ExposureTime", 33434, 5), new C7626("FNumber", 33437, 5), new C7626("ExposureProgram", 34850, 3), new C7626("SpectralSensitivity", 34852, 2), new C7626("PhotographicSensitivity", 34855, 3), new C7626("OECF", 34856, 7), new C7626("SensitivityType", 34864, 3), new C7626("StandardOutputSensitivity", 34865, 4), new C7626("RecommendedExposureIndex", 34866, 4), new C7626("ISOSpeed", 34867, 4), new C7626("ISOSpeedLatitudeyyy", 34868, 4), new C7626("ISOSpeedLatitudezzz", 34869, 4), new C7626("ExifVersion", 36864, 2), new C7626("DateTimeOriginal", 36867, 2), new C7626("DateTimeDigitized", 36868, 2), new C7626("OffsetTime", ModifierContributor.ForParameter.MASK, 2), new C7626("OffsetTimeOriginal", 36881, 2), new C7626("OffsetTimeDigitized", 36882, 2), new C7626("ComponentsConfiguration", 37121, 7), new C7626("CompressedBitsPerPixel", 37122, 5), new C7626("ShutterSpeedValue", 37377, 10), new C7626("ApertureValue", 37378, 5), new C7626("BrightnessValue", 37379, 10), new C7626("ExposureBiasValue", 37380, 10), new C7626("MaxApertureValue", 37381, 5), new C7626("SubjectDistance", 37382, 5), new C7626("MeteringMode", 37383, 3), new C7626("LightSource", 37384, 3), new C7626("Flash", 37385, 3), new C7626("FocalLength", 37386, 5), new C7626("SubjectArea", 37396, 3), new C7626("MakerNote", 37500, 7), new C7626("UserComment", 37510, 7), new C7626("SubSecTime", 37520, 2), new C7626("SubSecTimeOriginal", 37521, 2), new C7626("SubSecTimeDigitized", 37522, 2), new C7626("FlashpixVersion", 40960, 7), new C7626("ColorSpace", 40961, 3), new C7626("PixelXDimension", 40962, 3, 4), new C7626("PixelYDimension", 40963, 3, 4), new C7626("RelatedSoundFile", 40964, 2), new C7626("InteroperabilityIFDPointer", 40965, 4), new C7626("FlashEnergy", 41483, 5), new C7626("SpatialFrequencyResponse", 41484, 7), new C7626("FocalPlaneXResolution", 41486, 5), new C7626("FocalPlaneYResolution", 41487, 5), new C7626("FocalPlaneResolutionUnit", 41488, 3), new C7626("SubjectLocation", 41492, 3), new C7626("ExposureIndex", 41493, 5), new C7626("SensingMethod", 41495, 3), new C7626("FileSource", 41728, 7), new C7626("SceneType", 41729, 7), new C7626("CFAPattern", 41730, 7), new C7626("CustomRendered", 41985, 3), new C7626("ExposureMode", 41986, 3), new C7626("WhiteBalance", 41987, 3), new C7626("DigitalZoomRatio", 41988, 5), new C7626("FocalLengthIn35mmFilm", 41989, 3), new C7626("SceneCaptureType", 41990, 3), new C7626("GainControl", 41991, 3), new C7626("Contrast", 41992, 3), new C7626("Saturation", 41993, 3), new C7626("Sharpness", 41994, 3), new C7626("DeviceSettingDescription", 41995, 7), new C7626("SubjectDistanceRange", 41996, 3), new C7626("ImageUniqueID", 42016, 2), new C7626("CameraOwnerName", 42032, 2), new C7626("BodySerialNumber", 42033, 2), new C7626("LensSpecification", 42034, 5), new C7626("LensMake", 42035, 2), new C7626("LensModel", 42036, 2), new C7626("Gamma", 42240, 5), new C7626("DNGVersion", 50706, 1), new C7626("DefaultCropSize", 50720, 3, 4)};
        C7626[] c7626Arr3 = {new C7626("GPSVersionID", 0, 1), new C7626("GPSLatitudeRef", 1, 2), new C7626("GPSLatitude", 2, 5, 10), new C7626("GPSLongitudeRef", 3, 2), new C7626("GPSLongitude", 4, 5, 10), new C7626("GPSAltitudeRef", 5, 1), new C7626("GPSAltitude", 6, 5), new C7626("GPSTimeStamp", 7, 5), new C7626("GPSSatellites", 8, 2), new C7626("GPSStatus", 9, 2), new C7626("GPSMeasureMode", 10, 2), new C7626("GPSDOP", 11, 5), new C7626("GPSSpeedRef", 12, 2), new C7626("GPSSpeed", 13, 5), new C7626("GPSTrackRef", 14, 2), new C7626("GPSTrack", 15, 5), new C7626("GPSImgDirectionRef", 16, 2), new C7626("GPSImgDirection", 17, 5), new C7626("GPSMapDatum", 18, 2), new C7626("GPSDestLatitudeRef", 19, 2), new C7626("GPSDestLatitude", 20, 5), new C7626("GPSDestLongitudeRef", 21, 2), new C7626("GPSDestLongitude", 22, 5), new C7626("GPSDestBearingRef", 23, 2), new C7626("GPSDestBearing", 24, 5), new C7626("GPSDestDistanceRef", 25, 2), new C7626("GPSDestDistance", 26, 5), new C7626("GPSProcessingMethod", 27, 7), new C7626("GPSAreaInformation", 28, 7), new C7626("GPSDateStamp", 29, 2), new C7626("GPSDifferential", 30, 3), new C7626("GPSHPositioningError", 31, 5)};
        C7626[] c7626Arr4 = {new C7626("InteroperabilityIndex", 1, 2)};
        C7626[] c7626Arr5 = {new C7626("NewSubfileType", Opcodes.CONST_METHOD_HANDLE, 4), new C7626("SubfileType", Opcodes.CONST_METHOD_TYPE, 4), new C7626("ThumbnailImageWidth", 256, 3, 4), new C7626("ThumbnailImageLength", 257, 3, 4), new C7626("BitsPerSample", 258, 3), new C7626("Compression", 259, 3), new C7626("PhotometricInterpretation", BuildConfig.VERSION_CODE, 3), new C7626("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new C7626("Make", 271, 2), new C7626("Model", 272, 2), new C7626("StripOffsets", 273, 3, 4), new C7626("ThumbnailOrientation", 274, 3), new C7626("SamplesPerPixel", 277, 3), new C7626("RowsPerStrip", 278, 3, 4), new C7626("StripByteCounts", 279, 3, 4), new C7626("XResolution", 282, 5), new C7626("YResolution", 283, 5), new C7626("PlanarConfiguration", 284, 3), new C7626("ResolutionUnit", 296, 3), new C7626("TransferFunction", 301, 3), new C7626("Software", 305, 2), new C7626("DateTime", 306, 2), new C7626("Artist", 315, 2), new C7626("WhitePoint", 318, 5), new C7626("PrimaryChromaticities", 319, 5), new C7626("SubIFDPointer", 330, 4), new C7626("JPEGInterchangeFormat", 513, 4), new C7626("JPEGInterchangeFormatLength", 514, 4), new C7626("YCbCrCoefficients", 529, 5), new C7626("YCbCrSubSampling", 530, 3), new C7626("YCbCrPositioning", 531, 3), new C7626("ReferenceBlackWhite", 532, 5), new C7626("Copyright", 33432, 2), new C7626("ExifIFDPointer", 34665, 4), new C7626("GPSInfoIFDPointer", 34853, 4), new C7626("DNGVersion", 50706, 1), new C7626("DefaultCropSize", 50720, 3, 4)};
        f20699 = new C7626("StripOffsets", 273, 3);
        f20698 = new C7626[][]{c7626Arr, c7626Arr2, c7626Arr3, c7626Arr4, c7626Arr5, c7626Arr, new C7626[]{new C7626("ThumbnailImage", 256, 7), new C7626("CameraSettingsIFDPointer", 8224, 4), new C7626("ImageProcessingIFDPointer", 8256, 4)}, new C7626[]{new C7626("PreviewImageStart", 257, 4), new C7626("PreviewImageLength", 258, 4)}, new C7626[]{new C7626("AspectFrame", 4371, 3)}, new C7626[]{new C7626("ColorSpace", 55, 3)}};
        f20697 = new C7626[]{new C7626("SubIFDPointer", 330, 4), new C7626("ExifIFDPointer", 34665, 4), new C7626("GPSInfoIFDPointer", 34853, 4), new C7626("InteroperabilityIFDPointer", 40965, 4), new C7626("CameraSettingsIFDPointer", 8224, 1), new C7626("ImageProcessingIFDPointer", 8256, 1)};
        f20688 = new HashMap[10];
        f20687 = new HashMap[10];
        f20690 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f20689 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f20685 = charsetForName;
        f20686 = "Exif\u0000\u0000".getBytes(charsetForName);
        f20684 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C7626[][] c7626Arr6 = f20698;
            if (i >= c7626Arr6.length) {
                HashMap map = f20689;
                C7626[] c7626Arr7 = f20697;
                map.put(Integer.valueOf(c7626Arr7[0].f20671), 5);
                map.put(Integer.valueOf(c7626Arr7[1].f20671), 1);
                map.put(Integer.valueOf(c7626Arr7[2].f20671), 2);
                map.put(Integer.valueOf(c7626Arr7[3].f20671), 3);
                map.put(Integer.valueOf(c7626Arr7[4].f20671), 7);
                map.put(Integer.valueOf(c7626Arr7[5].f20671), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f20688[i] = new HashMap();
            f20687[i] = new HashMap();
            for (C7626 c7626 : c7626Arr6[i]) {
                f20688[i].put(Integer.valueOf(c7626.f20671), c7626);
                f20687[i].put(c7626.f20670, c7626);
            }
            i++;
        }
    }

    public C7631(String str) throws Throwable {
        FileInputStream fileInputStream;
        boolean z;
        C7626[][] c7626Arr = f20698;
        this.f20716 = new HashMap[c7626Arr.length];
        this.f20715 = new HashSet(c7626Arr.length);
        this.f20722 = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream2 = null;
        this.f20718 = null;
        this.f20720 = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                AbstractC7630.m12838(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z = true;
            } catch (Exception unused) {
                if (f20710) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                z = false;
            }
            if (z) {
                this.f20719 = fileInputStream.getFD();
            } else {
                this.f20719 = null;
            }
            m12858(fileInputStream);
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
    public static ByteOrder m12841(C7628 c7628) throws IOException {
        short s = c7628.readShort();
        boolean z = f20710;
        if (s == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            C6267.m11760(Integer.toHexString(s), "Invalid byte order: ");
            return null;
        }
        if (z) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m12842() throws Throwable {
        m12851(0, 5);
        m12851(0, 4);
        m12851(5, 4);
        HashMap[] mapArr = this.f20716;
        C7627 c7627 = (C7627) mapArr[1].get("PixelXDimension");
        C7627 c76272 = (C7627) mapArr[1].get("PixelYDimension");
        if (c7627 != null && c76272 != null) {
            mapArr[0].put("ImageWidth", c7627);
            mapArr[0].put("ImageLength", c76272);
        }
        if (mapArr[4].isEmpty() && m12855(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m12855(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m12853(0, "ThumbnailOrientation", "Orientation");
        m12853(0, "ThumbnailImageLength", "ImageLength");
        m12853(0, "ThumbnailImageWidth", "ImageWidth");
        m12853(5, "ThumbnailOrientation", "Orientation");
        m12853(5, "ThumbnailImageLength", "ImageLength");
        m12853(5, "ThumbnailImageWidth", "ImageWidth");
        m12853(4, "Orientation", "ThumbnailOrientation");
        m12853(4, "ImageLength", "ThumbnailImageLength");
        m12853(4, "ImageWidth", "ThumbnailImageWidth");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m12843(java.io.BufferedInputStream r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158.C7631.m12843(java.io.BufferedInputStream):int");
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
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12844(p158.C7628 r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158.C7631.m12844(飘花落叶言子哲兰楪世苏.飘花落叶言子楪世苏兰哲, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12845(C7624 c7624) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            C5919.m11247("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC7632.m12866(mediaMetadataRetriever, new C7629(c7624));
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
                HashMap[] mapArr = this.f20716;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C7627.m12830(Integer.parseInt(strExtractMetadata), this.f20722));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C7627.m12830(Integer.parseInt(strExtractMetadata2), this.f20722));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", C7627.m12830(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f20722));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c7624.m12829(i2);
                    byte[] bArr = new byte[6];
                    if (c7624.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, f20686)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (c7624.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.f20725 = i4;
                    m12850(bArr2, 0);
                }
                if (f20710) {
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
    public final C7627 m12846(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f20710) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f20698.length; i++) {
            C7627 c7627 = (C7627) this.f20716[i].get(str);
            if (c7627 != null) {
                return c7627;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m12847(String str) {
        C7627 c7627M12846 = m12846(str);
        if (c7627M12846 != null) {
            int i = c7627M12846.f20675;
            if (!f20690.contains(str)) {
                return c7627M12846.m12833(this.f20722);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C7625[] c7625Arr = (C7625[]) c7627M12846.m12836(this.f20722);
                if (c7625Arr == null || c7625Arr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c7625Arr));
                    return null;
                }
                C7625 c7625 = c7625Arr[0];
                Integer numValueOf = Integer.valueOf((int) (c7625.f20667 / c7625.f20666));
                C7625 c76252 = c7625Arr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c76252.f20667 / c76252.f20666));
                C7625 c76253 = c7625Arr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c76253.f20667 / c76253.f20666)));
            }
            try {
                return Double.toString(c7627M12846.m12835(this.f20722));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12848() {
        String strM12847 = m12847("DateTimeOriginal");
        HashMap[] mapArr = this.f20716;
        if (strM12847 != null && m12847("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM12847.concat("\u0000").getBytes(f20685);
            map.put("DateTime", new C7627(2, bytes, bytes.length));
        }
        if (m12847("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C7627.m12832(0L, this.f20722));
        }
        if (m12847("ImageLength") == null) {
            mapArr[0].put("ImageLength", C7627.m12832(0L, this.f20722));
        }
        if (m12847("Orientation") == null) {
            mapArr[0].put("Orientation", C7627.m12832(0L, this.f20722));
        }
        if (m12847("LightSource") == null) {
            mapArr[1].put("LightSource", C7627.m12832(0L, this.f20722));
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12849(p158.C7624 r29, int r30) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158.C7631.m12849(飘花落叶言子哲兰楪世苏.飘花落叶言子楪世兰哲苏, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m12850(byte[] bArr, int i) throws IOException {
        C7624 c7624 = new C7624(bArr);
        m12859(c7624);
        m12849(c7624, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m12851(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f20716;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f20710;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C7627 c7627 = (C7627) mapArr[i].get("ImageLength");
        C7627 c76272 = (C7627) mapArr[i].get("ImageWidth");
        C7627 c76273 = (C7627) mapArr[i2].get("ImageLength");
        C7627 c76274 = (C7627) mapArr[i2].get("ImageWidth");
        if (c7627 == null || c76272 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c76273 == null || c76274 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM12834 = c7627.m12834(this.f20722);
        int iM128342 = c76272.m12834(this.f20722);
        int iM128343 = c76273.m12834(this.f20722);
        int iM128344 = c76274.m12834(this.f20722);
        if (iM12834 >= iM128343 || iM128342 >= iM128344) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m12852(C7624 c7624, int i) throws Throwable {
        C7627 c7627M12830;
        C7627 c7627M128302;
        HashMap[] mapArr = this.f20716;
        C7627 c7627 = (C7627) mapArr[i].get("DefaultCropSize");
        C7627 c76272 = (C7627) mapArr[i].get("SensorTopBorder");
        C7627 c76273 = (C7627) mapArr[i].get("SensorLeftBorder");
        C7627 c76274 = (C7627) mapArr[i].get("SensorBottomBorder");
        C7627 c76275 = (C7627) mapArr[i].get("SensorRightBorder");
        if (c7627 != null) {
            int i2 = c7627.f20675;
            ByteOrder byteOrder = this.f20722;
            if (i2 == 5) {
                C7625[] c7625Arr = (C7625[]) c7627.m12836(byteOrder);
                if (c7625Arr == null || c7625Arr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c7625Arr));
                    return;
                }
                c7627M12830 = C7627.m12831(c7625Arr[0], this.f20722);
                c7627M128302 = C7627.m12831(c7625Arr[1], this.f20722);
            } else {
                int[] iArr = (int[]) c7627.m12836(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c7627M12830 = C7627.m12830(iArr[0], this.f20722);
                c7627M128302 = C7627.m12830(iArr[1], this.f20722);
            }
            mapArr[i].put("ImageWidth", c7627M12830);
            mapArr[i].put("ImageLength", c7627M128302);
            return;
        }
        if (c76272 != null && c76273 != null && c76274 != null && c76275 != null) {
            int iM12834 = c76272.m12834(this.f20722);
            int iM128342 = c76274.m12834(this.f20722);
            int iM128343 = c76275.m12834(this.f20722);
            int iM128344 = c76273.m12834(this.f20722);
            if (iM128342 <= iM12834 || iM128343 <= iM128344) {
                return;
            }
            C7627 c7627M128303 = C7627.m12830(iM128342 - iM12834, this.f20722);
            C7627 c7627M128304 = C7627.m12830(iM128343 - iM128344, this.f20722);
            mapArr[i].put("ImageLength", c7627M128303);
            mapArr[i].put("ImageWidth", c7627M128304);
            return;
        }
        C7627 c76276 = (C7627) mapArr[i].get("ImageLength");
        C7627 c76277 = (C7627) mapArr[i].get("ImageWidth");
        if (c76276 == null || c76277 == null) {
            C7627 c76278 = (C7627) mapArr[i].get("JPEGInterchangeFormat");
            C7627 c76279 = (C7627) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c76278 == null || c76279 == null) {
                return;
            }
            int iM128345 = c76278.m12834(this.f20722);
            int iM128346 = c76278.m12834(this.f20722);
            c7624.m12829(iM128345);
            byte[] bArr = new byte[iM128346];
            c7624.read(bArr);
            m12844(new C7628(bArr), iM128345, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m12853(int i, String str, String str2) {
        HashMap[] mapArr = this.f20716;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m12854(C7628 c7628) throws Throwable {
        C7627 c7627;
        int iM12834;
        HashMap map = this.f20716[4];
        C7627 c76272 = (C7627) map.get("Compression");
        if (c76272 == null) {
            m12856(c7628, map);
            return;
        }
        int iM128342 = c76272.m12834(this.f20722);
        if (iM128342 != 1) {
            if (iM128342 == 6) {
                m12856(c7628, map);
                return;
            } else if (iM128342 != 7) {
                return;
            }
        }
        C7627 c76273 = (C7627) map.get("BitsPerSample");
        if (c76273 != null) {
            int[] iArr = (int[]) c76273.m12836(this.f20722);
            int[] iArr2 = f20714;
            if (Arrays.equals(iArr2, iArr) || (this.f20717 == 3 && (c7627 = (C7627) map.get("PhotometricInterpretation")) != null && (((iM12834 = c7627.m12834(this.f20722)) == 1 && Arrays.equals(iArr, f20711)) || (iM12834 == 6 && Arrays.equals(iArr, iArr2))))) {
                C7627 c76274 = (C7627) map.get("StripOffsets");
                C7627 c76275 = (C7627) map.get("StripByteCounts");
                if (c76274 == null || c76275 == null) {
                    return;
                }
                long[] jArrM6774 = AbstractC3064.m6774(c76274.m12836(this.f20722));
                long[] jArrM67742 = AbstractC3064.m6774(c76275.m12836(this.f20722));
                if (jArrM6774 == null || jArrM6774.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM67742 == null || jArrM67742.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM6774.length != jArrM67742.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrM67742) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f20721 = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM6774.length; i3++) {
                    int i4 = (int) jArrM6774[i3];
                    int i5 = (int) jArrM67742[i3];
                    if (i3 < jArrM6774.length - 1 && i4 + i5 != jArrM6774[i3 + 1]) {
                        this.f20721 = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (c7628.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (c7628.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.f20721) {
                    long j4 = jArrM6774[0];
                    return;
                }
                return;
            }
        }
        if (f20710) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m12855(HashMap map) {
        C7627 c7627 = (C7627) map.get("ImageLength");
        C7627 c76272 = (C7627) map.get("ImageWidth");
        if (c7627 == null || c76272 == null) {
            return false;
        }
        return c7627.m12834(this.f20722) <= 512 && c76272.m12834(this.f20722) <= 512;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m12856(C7628 c7628, HashMap map) throws Throwable {
        C7627 c7627 = (C7627) map.get("JPEGInterchangeFormat");
        C7627 c76272 = (C7627) map.get("JPEGInterchangeFormatLength");
        if (c7627 == null || c76272 == null) {
            return;
        }
        int iM12834 = c7627.m12834(this.f20722);
        int iM128342 = c76272.m12834(this.f20722);
        if (this.f20717 == 7) {
            iM12834 += this.f20726;
        }
        if (iM12834 > 0 && iM128342 > 0 && this.f20720 == null && this.f20718 == null && this.f20719 == null) {
            c7628.skip(iM12834);
            c7628.read(new byte[iM128342]);
        }
        if (f20710) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM12834 + ", length: " + iM128342);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m12857() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f20716;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbM148 = AbstractC0053.m148(i, "The size of tag group[", "]: ");
            sbM148.append(mapArr[i].size());
            Log.d("ExifInterface", sbM148.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C7627 c7627 = (C7627) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c7627.toString() + ", tagValue: '" + c7627.m12833(this.f20722) + "'");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12858(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = p158.C7631.f20710
            r1 = 0
            r2 = r1
        L4:
            飘花落叶言子哲兰楪世苏.飘花落叶言子楪世哲兰苏[][] r3 = p158.C7631.f20698     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r3 = r3.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 >= r3) goto L1e
            java.util.HashMap[] r3 = r7.f20716     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3[r2] = r4     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2 + 1
            goto L4
        L15:
            r8 = move-exception
            goto L97
        L18:
            r8 = move-exception
            goto L8d
        L1b:
            r8 = move-exception
            goto L8d
        L1e:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r8 = r7.m12843(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r7.f20717 = r8     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L66
            if (r8 == r5) goto L66
            if (r8 == r4) goto L66
            if (r8 != r3) goto L3b
            goto L66
        L3b:
            飘花落叶言子哲兰楪世苏.飘花落叶言子楪世兰哲苏 r8 = new 飘花落叶言子哲兰楪世苏.飘花落叶言子楪世兰哲苏     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r7.f20717     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 12
            if (r1 != r2) goto L4a
            r7.m12845(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L4a:
            r2 = 7
            if (r1 != r2) goto L51
            r7.m12861(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L51:
            r2 = 10
            if (r1 != r2) goto L59
            r7.m12862(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L59:
            r7.m12865(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L5c:
            int r1 = r7.f20725     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.m12829(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r7.m12854(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L66:
            飘花落叶言子哲兰楪世苏.飘花落叶言子楪世苏兰哲 r8 = new 飘花落叶言子哲兰楪世苏.飘花落叶言子楪世苏兰哲     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r7.f20717     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 != r6) goto L73
            r7.m12844(r8, r1, r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L73:
            if (r2 != r4) goto L79
            r7.m12860(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L79:
            if (r2 != r5) goto L7f
            r7.m12864(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L7f:
            if (r2 != r3) goto L84
            r7.m12863(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L84:
            r7.m12848()
            if (r0 == 0) goto La8
            r7.m12857()
            return
        L8d:
            if (r0 == 0) goto La0
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r8)     // Catch: java.lang.Throwable -> L15
            goto La0
        L97:
            r7.m12848()
            if (r0 == 0) goto L9f
            r7.m12857()
        L9f:
            throw r8
        La0:
            r7.m12848()
            if (r0 == 0) goto La8
            r7.m12857()
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p158.C7631.m12858(java.io.InputStream):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m12859(C7624 c7624) throws IOException {
        ByteOrder byteOrderM12841 = m12841(c7624);
        this.f20722 = byteOrderM12841;
        c7624.f20679 = byteOrderM12841;
        int unsignedShort = c7624.readUnsignedShort();
        int i = this.f20717;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            C6267.m11760(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = c7624.readInt();
        if (i2 < 8) {
            C5919.m11246(AbstractC6136.m11556(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c7624.m12837(i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12860(C7628 c7628) throws Throwable {
        if (f20710) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c7628);
        }
        c7628.f20679 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f20706;
        c7628.m12837(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c7628.readInt();
                byte[] bArr2 = new byte[4];
                if (c7628.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f20695)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f20694)) {
                    return;
                }
                if (Arrays.equals(bArr2, f20696)) {
                    byte[] bArr3 = new byte[i];
                    if (c7628.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC3064.m6769(bArr2));
                    }
                    int i3 = c7628.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f20725 = i2;
                        m12850(bArr3, 0);
                        m12842();
                        m12854(new C7628(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c7628.m12837(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                C5919.m11246("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m12861(C7624 c7624) throws Throwable {
        int i;
        int i2;
        m12865(c7624);
        HashMap[] mapArr = this.f20716;
        C7627 c7627 = (C7627) mapArr[1].get("MakerNote");
        if (c7627 != null) {
            C7624 c76242 = new C7624(c7627.f20672);
            c76242.f20679 = this.f20722;
            byte[] bArr = f20708;
            byte[] bArr2 = new byte[bArr.length];
            c76242.readFully(bArr2);
            c76242.m12829(0L);
            byte[] bArr3 = f20705;
            byte[] bArr4 = new byte[bArr3.length];
            c76242.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c76242.m12829(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c76242.m12829(12L);
            }
            m12849(c76242, 6);
            C7627 c76272 = (C7627) mapArr[7].get("PreviewImageStart");
            C7627 c76273 = (C7627) mapArr[7].get("PreviewImageLength");
            if (c76272 != null && c76273 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c76272);
                mapArr[5].put("JPEGInterchangeFormatLength", c76273);
            }
            C7627 c76274 = (C7627) mapArr[8].get("AspectFrame");
            if (c76274 != null) {
                int[] iArr = (int[]) c76274.m12836(this.f20722);
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
                C7627 c7627M12830 = C7627.m12830(i5, this.f20722);
                C7627 c7627M128302 = C7627.m12830(i6, this.f20722);
                mapArr[0].put("ImageWidth", c7627M12830);
                mapArr[0].put("ImageLength", c7627M128302);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m12862(C7624 c7624) throws Throwable {
        if (f20710) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c7624);
        }
        m12865(c7624);
        HashMap[] mapArr = this.f20716;
        C7627 c7627 = (C7627) mapArr[0].get("JpgFromRaw");
        if (c7627 != null) {
            m12844(new C7628(c7627.f20672), (int) c7627.f20673, 5);
        }
        C7627 c76272 = (C7627) mapArr[0].get("ISO");
        C7627 c76273 = (C7627) mapArr[1].get("PhotographicSensitivity");
        if (c76272 == null || c76273 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c76272);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m12863(C7628 c7628) throws Throwable {
        if (f20710) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c7628);
        }
        c7628.f20679 = ByteOrder.LITTLE_ENDIAN;
        c7628.m12837(f20693.length);
        int i = c7628.readInt() + 8;
        byte[] bArr = f20692;
        c7628.m12837(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c7628.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c7628.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f20691, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c7628.read(bArr3) == i2) {
                        this.f20725 = i3;
                        m12850(bArr3, 0);
                        m12854(new C7628(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC3064.m6769(bArr2));
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
                c7628.m12837(i2);
            } catch (EOFException unused) {
                C5919.m11246("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m12864(C7628 c7628) throws Throwable {
        boolean z = f20710;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c7628);
        }
        c7628.m12837(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c7628.read(bArr);
        c7628.read(bArr2);
        c7628.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c7628.m12837(i - c7628.f20680);
        c7628.read(bArr4);
        m12844(new C7628(bArr4), i, 5);
        c7628.m12837(i3 - c7628.f20680);
        c7628.f20679 = ByteOrder.BIG_ENDIAN;
        int i4 = c7628.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c7628.readUnsignedShort();
            int unsignedShort2 = c7628.readUnsignedShort();
            if (unsignedShort == f20699.f20671) {
                short s = c7628.readShort();
                short s2 = c7628.readShort();
                C7627 c7627M12830 = C7627.m12830(s, this.f20722);
                C7627 c7627M128302 = C7627.m12830(s2, this.f20722);
                HashMap[] mapArr = this.f20716;
                mapArr[0].put("ImageLength", c7627M12830);
                mapArr[0].put("ImageWidth", c7627M128302);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            c7628.m12837(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m12865(C7624 c7624) throws Throwable {
        m12859(c7624);
        m12849(c7624, 0);
        m12852(c7624, 0);
        m12852(c7624, 5);
        m12852(c7624, 4);
        m12842();
        if (this.f20717 == 8) {
            HashMap[] mapArr = this.f20716;
            C7627 c7627 = (C7627) mapArr[1].get("MakerNote");
            if (c7627 != null) {
                C7624 c76242 = new C7624(c7627.f20672);
                c76242.f20679 = this.f20722;
                c76242.m12837(6);
                m12849(c76242, 9);
                C7627 c76272 = (C7627) mapArr[9].get("ColorSpace");
                if (c76272 != null) {
                    mapArr[1].put("ColorSpace", c76272);
                }
            }
        }
    }

    public C7631(InputStream inputStream) throws IOException {
        C7626[][] c7626Arr = f20698;
        this.f20716 = new HashMap[c7626Arr.length];
        this.f20715 = new HashSet(c7626Arr.length);
        this.f20722 = ByteOrder.BIG_ENDIAN;
        this.f20720 = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f20718 = (AssetManager.AssetInputStream) inputStream;
            this.f20719 = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC7630.m12838(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f20718 = null;
                this.f20719 = fileInputStream.getFD();
            } catch (Exception unused) {
                if (f20710) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f20718 = null;
                this.f20719 = null;
            }
        } else {
            this.f20718 = null;
            this.f20719 = null;
        }
        m12858(inputStream);
    }
}
