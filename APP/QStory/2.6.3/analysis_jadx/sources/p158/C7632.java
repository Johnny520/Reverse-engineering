package p158;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.activity.AbstractC0053;
import com.android.dx.io.Opcodes;
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
import net.bytebuddy.description.modifier.ModifierContributor;
import p009.AbstractC6183;
import p018.AbstractC6253;
import p019.C6263;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7632 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final byte[] f20679;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final Charset f20680;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final byte[] f20681;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final HashMap[] f20682;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final HashMap[] f20683;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final HashMap f20684;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final HashSet f20685;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final C7627[] f20692;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final C7627[][] f20693;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C7627 f20694;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final byte[] f20695;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final int[] f20696;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final String[] f20697;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final HashSet f20710;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final HashMap[] f20711;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f20712;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AssetManager.AssetInputStream f20713;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final FileDescriptor f20714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f20715;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f20716;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ByteOrder f20717;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f20718;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f20719;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f20720;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f20721;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final boolean f20705 = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final List f20704 = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final List f20708 = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final int[] f20709 = {8, 8, 8};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final int[] f20706 = {8};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final byte[] f20707 = {-1, -40, -1};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final byte[] f20699 = {102, 116, 121, 112};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final byte[] f20698 = {109, 105, 102, 49};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final byte[] f20702 = {104, 101, 105, 99};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final byte[] f20703 = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final byte[] f20700 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final byte[] f20701 = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final byte[] f20691 = {101, 88, 73, 102};

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final byte[] f20690 = {73, 72, 68, 82};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final byte[] f20689 = {73, 69, 78, 68};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final byte[] f20688 = {82, 73, 70, 70};

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final byte[] f20687 = {87, 69, 66, 80};

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final byte[] f20686 = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f20697 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f20696 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f20695 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C7627[] c7627Arr = {new C7627("NewSubfileType", Opcodes.CONST_METHOD_HANDLE, 4), new C7627("SubfileType", Opcodes.CONST_METHOD_TYPE, 4), new C7627("ImageWidth", 256, 3, 4), new C7627("ImageLength", 257, 3, 4), new C7627("BitsPerSample", 258, 3), new C7627("Compression", 259, 3), new C7627("PhotometricInterpretation", 262, 3), new C7627("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new C7627("Make", 271, 2), new C7627("Model", 272, 2), new C7627("StripOffsets", 273, 3, 4), new C7627("Orientation", 274, 3), new C7627("SamplesPerPixel", 277, 3), new C7627("RowsPerStrip", 278, 3, 4), new C7627("StripByteCounts", 279, 3, 4), new C7627("XResolution", 282, 5), new C7627("YResolution", 283, 5), new C7627("PlanarConfiguration", 284, 3), new C7627("ResolutionUnit", 296, 3), new C7627("TransferFunction", 301, 3), new C7627("Software", 305, 2), new C7627("DateTime", 306, 2), new C7627("Artist", 315, 2), new C7627("WhitePoint", 318, 5), new C7627("PrimaryChromaticities", 319, 5), new C7627("SubIFDPointer", 330, 4), new C7627("JPEGInterchangeFormat", 513, 4), new C7627("JPEGInterchangeFormatLength", 514, 4), new C7627("YCbCrCoefficients", 529, 5), new C7627("YCbCrSubSampling", 530, 3), new C7627("YCbCrPositioning", 531, 3), new C7627("ReferenceBlackWhite", 532, 5), new C7627("Copyright", 33432, 2), new C7627("ExifIFDPointer", 34665, 4), new C7627("GPSInfoIFDPointer", 34853, 4), new C7627("SensorTopBorder", 4, 4), new C7627("SensorLeftBorder", 5, 4), new C7627("SensorBottomBorder", 6, 4), new C7627("SensorRightBorder", 7, 4), new C7627("ISO", 23, 3), new C7627("JpgFromRaw", 46, 7), new C7627("Xmp", 700, 1)};
        C7627[] c7627Arr2 = {new C7627("ExposureTime", 33434, 5), new C7627("FNumber", 33437, 5), new C7627("ExposureProgram", 34850, 3), new C7627("SpectralSensitivity", 34852, 2), new C7627("PhotographicSensitivity", 34855, 3), new C7627("OECF", 34856, 7), new C7627("SensitivityType", 34864, 3), new C7627("StandardOutputSensitivity", 34865, 4), new C7627("RecommendedExposureIndex", 34866, 4), new C7627("ISOSpeed", 34867, 4), new C7627("ISOSpeedLatitudeyyy", 34868, 4), new C7627("ISOSpeedLatitudezzz", 34869, 4), new C7627("ExifVersion", 36864, 2), new C7627("DateTimeOriginal", 36867, 2), new C7627("DateTimeDigitized", 36868, 2), new C7627("OffsetTime", ModifierContributor.ForParameter.MASK, 2), new C7627("OffsetTimeOriginal", 36881, 2), new C7627("OffsetTimeDigitized", 36882, 2), new C7627("ComponentsConfiguration", 37121, 7), new C7627("CompressedBitsPerPixel", 37122, 5), new C7627("ShutterSpeedValue", 37377, 10), new C7627("ApertureValue", 37378, 5), new C7627("BrightnessValue", 37379, 10), new C7627("ExposureBiasValue", 37380, 10), new C7627("MaxApertureValue", 37381, 5), new C7627("SubjectDistance", 37382, 5), new C7627("MeteringMode", 37383, 3), new C7627("LightSource", 37384, 3), new C7627("Flash", 37385, 3), new C7627("FocalLength", 37386, 5), new C7627("SubjectArea", 37396, 3), new C7627("MakerNote", 37500, 7), new C7627("UserComment", 37510, 7), new C7627("SubSecTime", 37520, 2), new C7627("SubSecTimeOriginal", 37521, 2), new C7627("SubSecTimeDigitized", 37522, 2), new C7627("FlashpixVersion", 40960, 7), new C7627("ColorSpace", 40961, 3), new C7627("PixelXDimension", 40962, 3, 4), new C7627("PixelYDimension", 40963, 3, 4), new C7627("RelatedSoundFile", 40964, 2), new C7627("InteroperabilityIFDPointer", 40965, 4), new C7627("FlashEnergy", 41483, 5), new C7627("SpatialFrequencyResponse", 41484, 7), new C7627("FocalPlaneXResolution", 41486, 5), new C7627("FocalPlaneYResolution", 41487, 5), new C7627("FocalPlaneResolutionUnit", 41488, 3), new C7627("SubjectLocation", 41492, 3), new C7627("ExposureIndex", 41493, 5), new C7627("SensingMethod", 41495, 3), new C7627("FileSource", 41728, 7), new C7627("SceneType", 41729, 7), new C7627("CFAPattern", 41730, 7), new C7627("CustomRendered", 41985, 3), new C7627("ExposureMode", 41986, 3), new C7627("WhiteBalance", 41987, 3), new C7627("DigitalZoomRatio", 41988, 5), new C7627("FocalLengthIn35mmFilm", 41989, 3), new C7627("SceneCaptureType", 41990, 3), new C7627("GainControl", 41991, 3), new C7627("Contrast", 41992, 3), new C7627("Saturation", 41993, 3), new C7627("Sharpness", 41994, 3), new C7627("DeviceSettingDescription", 41995, 7), new C7627("SubjectDistanceRange", 41996, 3), new C7627("ImageUniqueID", 42016, 2), new C7627("CameraOwnerName", 42032, 2), new C7627("BodySerialNumber", 42033, 2), new C7627("LensSpecification", 42034, 5), new C7627("LensMake", 42035, 2), new C7627("LensModel", 42036, 2), new C7627("Gamma", 42240, 5), new C7627("DNGVersion", 50706, 1), new C7627("DefaultCropSize", 50720, 3, 4)};
        C7627[] c7627Arr3 = {new C7627("GPSVersionID", 0, 1), new C7627("GPSLatitudeRef", 1, 2), new C7627("GPSLatitude", 2, 5, 10), new C7627("GPSLongitudeRef", 3, 2), new C7627("GPSLongitude", 4, 5, 10), new C7627("GPSAltitudeRef", 5, 1), new C7627("GPSAltitude", 6, 5), new C7627("GPSTimeStamp", 7, 5), new C7627("GPSSatellites", 8, 2), new C7627("GPSStatus", 9, 2), new C7627("GPSMeasureMode", 10, 2), new C7627("GPSDOP", 11, 5), new C7627("GPSSpeedRef", 12, 2), new C7627("GPSSpeed", 13, 5), new C7627("GPSTrackRef", 14, 2), new C7627("GPSTrack", 15, 5), new C7627("GPSImgDirectionRef", 16, 2), new C7627("GPSImgDirection", 17, 5), new C7627("GPSMapDatum", 18, 2), new C7627("GPSDestLatitudeRef", 19, 2), new C7627("GPSDestLatitude", 20, 5), new C7627("GPSDestLongitudeRef", 21, 2), new C7627("GPSDestLongitude", 22, 5), new C7627("GPSDestBearingRef", 23, 2), new C7627("GPSDestBearing", 24, 5), new C7627("GPSDestDistanceRef", 25, 2), new C7627("GPSDestDistance", 26, 5), new C7627("GPSProcessingMethod", 27, 7), new C7627("GPSAreaInformation", 28, 7), new C7627("GPSDateStamp", 29, 2), new C7627("GPSDifferential", 30, 3), new C7627("GPSHPositioningError", 31, 5)};
        C7627[] c7627Arr4 = {new C7627("InteroperabilityIndex", 1, 2)};
        C7627[] c7627Arr5 = {new C7627("NewSubfileType", Opcodes.CONST_METHOD_HANDLE, 4), new C7627("SubfileType", Opcodes.CONST_METHOD_TYPE, 4), new C7627("ThumbnailImageWidth", 256, 3, 4), new C7627("ThumbnailImageLength", 257, 3, 4), new C7627("BitsPerSample", 258, 3), new C7627("Compression", 259, 3), new C7627("PhotometricInterpretation", 262, 3), new C7627("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new C7627("Make", 271, 2), new C7627("Model", 272, 2), new C7627("StripOffsets", 273, 3, 4), new C7627("ThumbnailOrientation", 274, 3), new C7627("SamplesPerPixel", 277, 3), new C7627("RowsPerStrip", 278, 3, 4), new C7627("StripByteCounts", 279, 3, 4), new C7627("XResolution", 282, 5), new C7627("YResolution", 283, 5), new C7627("PlanarConfiguration", 284, 3), new C7627("ResolutionUnit", 296, 3), new C7627("TransferFunction", 301, 3), new C7627("Software", 305, 2), new C7627("DateTime", 306, 2), new C7627("Artist", 315, 2), new C7627("WhitePoint", 318, 5), new C7627("PrimaryChromaticities", 319, 5), new C7627("SubIFDPointer", 330, 4), new C7627("JPEGInterchangeFormat", 513, 4), new C7627("JPEGInterchangeFormatLength", 514, 4), new C7627("YCbCrCoefficients", 529, 5), new C7627("YCbCrSubSampling", 530, 3), new C7627("YCbCrPositioning", 531, 3), new C7627("ReferenceBlackWhite", 532, 5), new C7627("Copyright", 33432, 2), new C7627("ExifIFDPointer", 34665, 4), new C7627("GPSInfoIFDPointer", 34853, 4), new C7627("DNGVersion", 50706, 1), new C7627("DefaultCropSize", 50720, 3, 4)};
        f20694 = new C7627("StripOffsets", 273, 3);
        f20693 = new C7627[][]{c7627Arr, c7627Arr2, c7627Arr3, c7627Arr4, c7627Arr5, c7627Arr, new C7627[]{new C7627("ThumbnailImage", 256, 7), new C7627("CameraSettingsIFDPointer", 8224, 4), new C7627("ImageProcessingIFDPointer", 8256, 4)}, new C7627[]{new C7627("PreviewImageStart", 257, 4), new C7627("PreviewImageLength", 258, 4)}, new C7627[]{new C7627("AspectFrame", 4371, 3)}, new C7627[]{new C7627("ColorSpace", 55, 3)}};
        f20692 = new C7627[]{new C7627("SubIFDPointer", 330, 4), new C7627("ExifIFDPointer", 34665, 4), new C7627("GPSInfoIFDPointer", 34853, 4), new C7627("InteroperabilityIFDPointer", 40965, 4), new C7627("CameraSettingsIFDPointer", 8224, 1), new C7627("ImageProcessingIFDPointer", 8256, 1)};
        f20683 = new HashMap[10];
        f20682 = new HashMap[10];
        f20685 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f20684 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f20680 = charsetForName;
        f20681 = "Exif\u0000\u0000".getBytes(charsetForName);
        f20679 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C7627[][] c7627Arr6 = f20693;
            if (i >= c7627Arr6.length) {
                HashMap map = f20684;
                C7627[] c7627Arr7 = f20692;
                map.put(Integer.valueOf(c7627Arr7[0].f20666), 5);
                map.put(Integer.valueOf(c7627Arr7[1].f20666), 1);
                map.put(Integer.valueOf(c7627Arr7[2].f20666), 2);
                map.put(Integer.valueOf(c7627Arr7[3].f20666), 3);
                map.put(Integer.valueOf(c7627Arr7[4].f20666), 7);
                map.put(Integer.valueOf(c7627Arr7[5].f20666), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f20683[i] = new HashMap();
            f20682[i] = new HashMap();
            for (C7627 c7627 : c7627Arr6[i]) {
                f20683[i].put(Integer.valueOf(c7627.f20666), c7627);
                f20682[i].put(c7627.f20665, c7627);
            }
            i++;
        }
    }

    public C7632(String str) throws Throwable {
        FileInputStream fileInputStream;
        boolean z;
        C7627[][] c7627Arr = f20693;
        this.f20711 = new HashMap[c7627Arr.length];
        this.f20710 = new HashSet(c7627Arr.length);
        this.f20717 = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream2 = null;
        this.f20713 = null;
        this.f20715 = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                AbstractC7631.m12867(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z = true;
            } catch (Exception unused) {
                if (f20705) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                z = false;
            }
            if (z) {
                this.f20714 = fileInputStream.getFD();
            } else {
                this.f20714 = null;
            }
            m12887(fileInputStream);
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
    public static ByteOrder m12870(C7629 c7629) throws IOException {
        short s = c7629.readShort();
        boolean z = f20705;
        if (s == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            C6263.m11777(Integer.toHexString(s), "Invalid byte order: ");
            return null;
        }
        if (z) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m12871() throws Throwable {
        m12880(0, 5);
        m12880(0, 4);
        m12880(5, 4);
        HashMap[] mapArr = this.f20711;
        C7628 c7628 = (C7628) mapArr[1].get("PixelXDimension");
        C7628 c76282 = (C7628) mapArr[1].get("PixelYDimension");
        if (c7628 != null && c76282 != null) {
            mapArr[0].put("ImageWidth", c7628);
            mapArr[0].put("ImageLength", c76282);
        }
        if (mapArr[4].isEmpty() && m12884(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m12884(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m12882(0, "ThumbnailOrientation", "Orientation");
        m12882(0, "ThumbnailImageLength", "ImageLength");
        m12882(0, "ThumbnailImageWidth", "ImageWidth");
        m12882(5, "ThumbnailOrientation", "Orientation");
        m12882(5, "ThumbnailImageLength", "ImageLength");
        m12882(5, "ThumbnailImageWidth", "ImageWidth");
        m12882(4, "Orientation", "ThumbnailOrientation");
        m12882(4, "ImageLength", "ThumbnailImageLength");
        m12882(4, "ImageWidth", "ThumbnailImageWidth");
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
    public final int m12872(java.io.BufferedInputStream r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158.C7632.m12872(java.io.BufferedInputStream):int");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12873(p158.C7629 r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158.C7632.m12873(飘花落叶言子哲兰楪世苏.飘花落叶言子楪世苏兰哲, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12874(C7625 c7625) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            C5925.m11308("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC7633.m12895(mediaMetadataRetriever, new C7630(c7625));
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
                HashMap[] mapArr = this.f20711;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C7628.m12859(Integer.parseInt(strExtractMetadata), this.f20717));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C7628.m12859(Integer.parseInt(strExtractMetadata2), this.f20717));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", C7628.m12859(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f20717));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c7625.m12858(i2);
                    byte[] bArr = new byte[6];
                    if (c7625.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, f20681)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (c7625.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.f20720 = i4;
                    m12879(bArr2, 0);
                }
                if (f20705) {
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
    public final C7628 m12875(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f20705) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f20693.length; i++) {
            C7628 c7628 = (C7628) this.f20711[i].get(str);
            if (c7628 != null) {
                return c7628;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m12876(String str) {
        C7628 c7628M12875 = m12875(str);
        if (c7628M12875 != null) {
            int i = c7628M12875.f20670;
            if (!f20685.contains(str)) {
                return c7628M12875.m12862(this.f20717);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C7626[] c7626Arr = (C7626[]) c7628M12875.m12865(this.f20717);
                if (c7626Arr == null || c7626Arr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c7626Arr));
                    return null;
                }
                C7626 c7626 = c7626Arr[0];
                Integer numValueOf = Integer.valueOf((int) (c7626.f20662 / c7626.f20661));
                C7626 c76262 = c7626Arr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c76262.f20662 / c76262.f20661));
                C7626 c76263 = c7626Arr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c76263.f20662 / c76263.f20661)));
            }
            try {
                return Double.toString(c7628M12875.m12864(this.f20717));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12877() {
        String strM12876 = m12876("DateTimeOriginal");
        HashMap[] mapArr = this.f20711;
        if (strM12876 != null && m12876("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM12876.concat("\u0000").getBytes(f20680);
            map.put("DateTime", new C7628(2, bytes, bytes.length));
        }
        if (m12876("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C7628.m12861(0L, this.f20717));
        }
        if (m12876("ImageLength") == null) {
            mapArr[0].put("ImageLength", C7628.m12861(0L, this.f20717));
        }
        if (m12876("Orientation") == null) {
            mapArr[0].put("Orientation", C7628.m12861(0L, this.f20717));
        }
        if (m12876("LightSource") == null) {
            mapArr[1].put("LightSource", C7628.m12861(0L, this.f20717));
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
    public final void m12878(p158.C7625 r29, int r30) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158.C7632.m12878(飘花落叶言子哲兰楪世苏.飘花落叶言子楪世兰哲苏, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m12879(byte[] bArr, int i) throws IOException {
        C7625 c7625 = new C7625(bArr);
        m12888(c7625);
        m12878(c7625, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m12880(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f20711;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f20705;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C7628 c7628 = (C7628) mapArr[i].get("ImageLength");
        C7628 c76282 = (C7628) mapArr[i].get("ImageWidth");
        C7628 c76283 = (C7628) mapArr[i2].get("ImageLength");
        C7628 c76284 = (C7628) mapArr[i2].get("ImageWidth");
        if (c7628 == null || c76282 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c76283 == null || c76284 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM12863 = c7628.m12863(this.f20717);
        int iM128632 = c76282.m12863(this.f20717);
        int iM128633 = c76283.m12863(this.f20717);
        int iM128634 = c76284.m12863(this.f20717);
        if (iM12863 >= iM128633 || iM128632 >= iM128634) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m12881(C7625 c7625, int i) throws Throwable {
        C7628 c7628M12859;
        C7628 c7628M128592;
        HashMap[] mapArr = this.f20711;
        C7628 c7628 = (C7628) mapArr[i].get("DefaultCropSize");
        C7628 c76282 = (C7628) mapArr[i].get("SensorTopBorder");
        C7628 c76283 = (C7628) mapArr[i].get("SensorLeftBorder");
        C7628 c76284 = (C7628) mapArr[i].get("SensorBottomBorder");
        C7628 c76285 = (C7628) mapArr[i].get("SensorRightBorder");
        if (c7628 != null) {
            int i2 = c7628.f20670;
            ByteOrder byteOrder = this.f20717;
            if (i2 == 5) {
                C7626[] c7626Arr = (C7626[]) c7628.m12865(byteOrder);
                if (c7626Arr == null || c7626Arr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c7626Arr));
                    return;
                }
                c7628M12859 = C7628.m12860(c7626Arr[0], this.f20717);
                c7628M128592 = C7628.m12860(c7626Arr[1], this.f20717);
            } else {
                int[] iArr = (int[]) c7628.m12865(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c7628M12859 = C7628.m12859(iArr[0], this.f20717);
                c7628M128592 = C7628.m12859(iArr[1], this.f20717);
            }
            mapArr[i].put("ImageWidth", c7628M12859);
            mapArr[i].put("ImageLength", c7628M128592);
            return;
        }
        if (c76282 != null && c76283 != null && c76284 != null && c76285 != null) {
            int iM12863 = c76282.m12863(this.f20717);
            int iM128632 = c76284.m12863(this.f20717);
            int iM128633 = c76285.m12863(this.f20717);
            int iM128634 = c76283.m12863(this.f20717);
            if (iM128632 <= iM12863 || iM128633 <= iM128634) {
                return;
            }
            C7628 c7628M128593 = C7628.m12859(iM128632 - iM12863, this.f20717);
            C7628 c7628M128594 = C7628.m12859(iM128633 - iM128634, this.f20717);
            mapArr[i].put("ImageLength", c7628M128593);
            mapArr[i].put("ImageWidth", c7628M128594);
            return;
        }
        C7628 c76286 = (C7628) mapArr[i].get("ImageLength");
        C7628 c76287 = (C7628) mapArr[i].get("ImageWidth");
        if (c76286 == null || c76287 == null) {
            C7628 c76288 = (C7628) mapArr[i].get("JPEGInterchangeFormat");
            C7628 c76289 = (C7628) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c76288 == null || c76289 == null) {
                return;
            }
            int iM128635 = c76288.m12863(this.f20717);
            int iM128636 = c76288.m12863(this.f20717);
            c7625.m12858(iM128635);
            byte[] bArr = new byte[iM128636];
            c7625.read(bArr);
            m12873(new C7629(bArr), iM128635, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m12882(int i, String str, String str2) {
        HashMap[] mapArr = this.f20711;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m12883(C7629 c7629) throws Throwable {
        C7628 c7628;
        int iM12863;
        HashMap map = this.f20711[4];
        C7628 c76282 = (C7628) map.get("Compression");
        if (c76282 == null) {
            m12885(c7629, map);
            return;
        }
        int iM128632 = c76282.m12863(this.f20717);
        if (iM128632 != 1) {
            if (iM128632 == 6) {
                m12885(c7629, map);
                return;
            } else if (iM128632 != 7) {
                return;
            }
        }
        C7628 c76283 = (C7628) map.get("BitsPerSample");
        if (c76283 != null) {
            int[] iArr = (int[]) c76283.m12865(this.f20717);
            int[] iArr2 = f20709;
            if (Arrays.equals(iArr2, iArr) || (this.f20712 == 3 && (c7628 = (C7628) map.get("PhotometricInterpretation")) != null && (((iM12863 = c7628.m12863(this.f20717)) == 1 && Arrays.equals(iArr, f20706)) || (iM12863 == 6 && Arrays.equals(iArr, iArr2))))) {
                C7628 c76284 = (C7628) map.get("StripOffsets");
                C7628 c76285 = (C7628) map.get("StripByteCounts");
                if (c76284 == null || c76285 == null) {
                    return;
                }
                long[] jArrM11740 = AbstractC6253.m11740(c76284.m12865(this.f20717));
                long[] jArrM117402 = AbstractC6253.m11740(c76285.m12865(this.f20717));
                if (jArrM11740 == null || jArrM11740.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM117402 == null || jArrM117402.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM11740.length != jArrM117402.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrM117402) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f20716 = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM11740.length; i3++) {
                    int i4 = (int) jArrM11740[i3];
                    int i5 = (int) jArrM117402[i3];
                    if (i3 < jArrM11740.length - 1 && i4 + i5 != jArrM11740[i3 + 1]) {
                        this.f20716 = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (c7629.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (c7629.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.f20716) {
                    long j4 = jArrM11740[0];
                    return;
                }
                return;
            }
        }
        if (f20705) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m12884(HashMap map) {
        C7628 c7628 = (C7628) map.get("ImageLength");
        C7628 c76282 = (C7628) map.get("ImageWidth");
        if (c7628 == null || c76282 == null) {
            return false;
        }
        return c7628.m12863(this.f20717) <= 512 && c76282.m12863(this.f20717) <= 512;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m12885(C7629 c7629, HashMap map) throws Throwable {
        C7628 c7628 = (C7628) map.get("JPEGInterchangeFormat");
        C7628 c76282 = (C7628) map.get("JPEGInterchangeFormatLength");
        if (c7628 == null || c76282 == null) {
            return;
        }
        int iM12863 = c7628.m12863(this.f20717);
        int iM128632 = c76282.m12863(this.f20717);
        if (this.f20712 == 7) {
            iM12863 += this.f20721;
        }
        if (iM12863 > 0 && iM128632 > 0 && this.f20715 == null && this.f20713 == null && this.f20714 == null) {
            c7629.skip(iM12863);
            c7629.read(new byte[iM128632]);
        }
        if (f20705) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM12863 + ", length: " + iM128632);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m12886() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f20711;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbM150 = AbstractC0053.m150(i, "The size of tag group[", "]: ");
            sbM150.append(mapArr[i].size());
            Log.d("ExifInterface", sbM150.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C7628 c7628 = (C7628) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c7628.toString() + ", tagValue: '" + c7628.m12862(this.f20717) + "'");
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
    public final void m12887(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = p158.C7632.f20705
            r1 = 0
            r2 = r1
        L4:
            飘花落叶言子哲兰楪世苏.飘花落叶言子楪世哲兰苏[][] r3 = p158.C7632.f20693     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r3 = r3.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 >= r3) goto L1e
            java.util.HashMap[] r3 = r7.f20711     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
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
            int r8 = r7.m12872(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r7.f20712 = r8     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
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
            int r1 = r7.f20712     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 12
            if (r1 != r2) goto L4a
            r7.m12874(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L4a:
            r2 = 7
            if (r1 != r2) goto L51
            r7.m12890(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L51:
            r2 = 10
            if (r1 != r2) goto L59
            r7.m12891(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L59:
            r7.m12894(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L5c:
            int r1 = r7.f20720     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.m12858(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r7.m12883(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L66:
            飘花落叶言子哲兰楪世苏.飘花落叶言子楪世苏兰哲 r8 = new 飘花落叶言子哲兰楪世苏.飘花落叶言子楪世苏兰哲     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r7.f20712     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 != r6) goto L73
            r7.m12873(r8, r1, r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L73:
            if (r2 != r4) goto L79
            r7.m12889(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L79:
            if (r2 != r5) goto L7f
            r7.m12893(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L7f:
            if (r2 != r3) goto L84
            r7.m12892(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L84:
            r7.m12877()
            if (r0 == 0) goto La8
            r7.m12886()
            return
        L8d:
            if (r0 == 0) goto La0
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r8)     // Catch: java.lang.Throwable -> L15
            goto La0
        L97:
            r7.m12877()
            if (r0 == 0) goto L9f
            r7.m12886()
        L9f:
            throw r8
        La0:
            r7.m12877()
            if (r0 == 0) goto La8
            r7.m12886()
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p158.C7632.m12887(java.io.InputStream):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m12888(C7625 c7625) throws IOException {
        ByteOrder byteOrderM12870 = m12870(c7625);
        this.f20717 = byteOrderM12870;
        c7625.f20674 = byteOrderM12870;
        int unsignedShort = c7625.readUnsignedShort();
        int i = this.f20712;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            C6263.m11777(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = c7625.readInt();
        if (i2 < 8) {
            C5925.m11307(AbstractC6183.m11588(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c7625.m12866(i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12889(C7629 c7629) throws Throwable {
        if (f20705) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c7629);
        }
        c7629.f20674 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f20701;
        c7629.m12866(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c7629.readInt();
                byte[] bArr2 = new byte[4];
                if (c7629.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f20690)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f20689)) {
                    return;
                }
                if (Arrays.equals(bArr2, f20691)) {
                    byte[] bArr3 = new byte[i];
                    if (c7629.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC6253.m11742(bArr2));
                    }
                    int i3 = c7629.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f20720 = i2;
                        m12879(bArr3, 0);
                        m12871();
                        m12883(new C7629(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c7629.m12866(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                C5925.m11307("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m12890(C7625 c7625) throws Throwable {
        int i;
        int i2;
        m12894(c7625);
        HashMap[] mapArr = this.f20711;
        C7628 c7628 = (C7628) mapArr[1].get("MakerNote");
        if (c7628 != null) {
            C7625 c76252 = new C7625(c7628.f20667);
            c76252.f20674 = this.f20717;
            byte[] bArr = f20703;
            byte[] bArr2 = new byte[bArr.length];
            c76252.readFully(bArr2);
            c76252.m12858(0L);
            byte[] bArr3 = f20700;
            byte[] bArr4 = new byte[bArr3.length];
            c76252.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c76252.m12858(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c76252.m12858(12L);
            }
            m12878(c76252, 6);
            C7628 c76282 = (C7628) mapArr[7].get("PreviewImageStart");
            C7628 c76283 = (C7628) mapArr[7].get("PreviewImageLength");
            if (c76282 != null && c76283 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c76282);
                mapArr[5].put("JPEGInterchangeFormatLength", c76283);
            }
            C7628 c76284 = (C7628) mapArr[8].get("AspectFrame");
            if (c76284 != null) {
                int[] iArr = (int[]) c76284.m12865(this.f20717);
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
                C7628 c7628M12859 = C7628.m12859(i5, this.f20717);
                C7628 c7628M128592 = C7628.m12859(i6, this.f20717);
                mapArr[0].put("ImageWidth", c7628M12859);
                mapArr[0].put("ImageLength", c7628M128592);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m12891(C7625 c7625) throws Throwable {
        if (f20705) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c7625);
        }
        m12894(c7625);
        HashMap[] mapArr = this.f20711;
        C7628 c7628 = (C7628) mapArr[0].get("JpgFromRaw");
        if (c7628 != null) {
            m12873(new C7629(c7628.f20667), (int) c7628.f20668, 5);
        }
        C7628 c76282 = (C7628) mapArr[0].get("ISO");
        C7628 c76283 = (C7628) mapArr[1].get("PhotographicSensitivity");
        if (c76282 == null || c76283 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c76282);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m12892(C7629 c7629) throws Throwable {
        if (f20705) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c7629);
        }
        c7629.f20674 = ByteOrder.LITTLE_ENDIAN;
        c7629.m12866(f20688.length);
        int i = c7629.readInt() + 8;
        byte[] bArr = f20687;
        c7629.m12866(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c7629.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c7629.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f20686, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c7629.read(bArr3) == i2) {
                        this.f20720 = i3;
                        m12879(bArr3, 0);
                        m12883(new C7629(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC6253.m11742(bArr2));
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
                c7629.m12866(i2);
            } catch (EOFException unused) {
                C5925.m11307("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m12893(C7629 c7629) throws Throwable {
        boolean z = f20705;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c7629);
        }
        c7629.m12866(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c7629.read(bArr);
        c7629.read(bArr2);
        c7629.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c7629.m12866(i - c7629.f20675);
        c7629.read(bArr4);
        m12873(new C7629(bArr4), i, 5);
        c7629.m12866(i3 - c7629.f20675);
        c7629.f20674 = ByteOrder.BIG_ENDIAN;
        int i4 = c7629.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c7629.readUnsignedShort();
            int unsignedShort2 = c7629.readUnsignedShort();
            if (unsignedShort == f20694.f20666) {
                short s = c7629.readShort();
                short s2 = c7629.readShort();
                C7628 c7628M12859 = C7628.m12859(s, this.f20717);
                C7628 c7628M128592 = C7628.m12859(s2, this.f20717);
                HashMap[] mapArr = this.f20711;
                mapArr[0].put("ImageLength", c7628M12859);
                mapArr[0].put("ImageWidth", c7628M128592);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            c7629.m12866(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m12894(C7625 c7625) throws Throwable {
        m12888(c7625);
        m12878(c7625, 0);
        m12881(c7625, 0);
        m12881(c7625, 5);
        m12881(c7625, 4);
        m12871();
        if (this.f20712 == 8) {
            HashMap[] mapArr = this.f20711;
            C7628 c7628 = (C7628) mapArr[1].get("MakerNote");
            if (c7628 != null) {
                C7625 c76252 = new C7625(c7628.f20667);
                c76252.f20674 = this.f20717;
                c76252.m12866(6);
                m12878(c76252, 9);
                C7628 c76282 = (C7628) mapArr[9].get("ColorSpace");
                if (c76282 != null) {
                    mapArr[1].put("ColorSpace", c76282);
                }
            }
        }
    }

    public C7632(InputStream inputStream) throws IOException {
        C7627[][] c7627Arr = f20693;
        this.f20711 = new HashMap[c7627Arr.length];
        this.f20710 = new HashSet(c7627Arr.length);
        this.f20717 = ByteOrder.BIG_ENDIAN;
        this.f20715 = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f20713 = (AssetManager.AssetInputStream) inputStream;
            this.f20714 = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC7631.m12867(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f20713 = null;
                this.f20714 = fileInputStream.getFD();
            } catch (Exception unused) {
                if (f20705) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f20713 = null;
                this.f20714 = null;
            }
        } else {
            this.f20713 = null;
            this.f20714 = null;
        }
        m12887(inputStream);
    }
}
