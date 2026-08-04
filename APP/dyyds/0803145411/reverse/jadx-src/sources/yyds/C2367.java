package yyds;

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
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: yyds.ᲁᲈᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2367 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static final int[] f11630;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final int[] f11631;

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public static final HashMap f11632;

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public static final HashSet f11633;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final int[] f11634;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static final byte[] f11635;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static final byte[] f11636;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static final byte[] f11637;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static final byte[] f11638;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static final byte[] f11639;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static final byte[] f11640;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static final byte[] f11641;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static final byte[] f11642;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static final byte[] f11643;

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public static final byte[] f11644;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static final byte[] f11645;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final boolean f11646 = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public static final C2069[] f11647;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public static final String[] f11648;

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public static final HashMap[] f11649;

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public static final Charset f11650;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static final byte[] f11651;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static final C2069 f11652;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static final byte[] f11653;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static final C2069[][] f11654;

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public static final byte[] f11655;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static final byte[] f11656;

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public static final HashMap[] f11657;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static final byte[] f11658;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f11659;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f11660;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final HashSet f11661;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final FileDescriptor f11662;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final AssetManager.AssetInputStream f11663;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f11664;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f11665;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f11666;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f11667;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public ByteOrder f11668;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final HashMap[] f11669;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f11634 = new int[]{8, 8, 8};
        f11631 = new int[]{8};
        f11638 = new byte[]{-1, -40, -1};
        f11656 = new byte[]{102, 116, 121, 112};
        f11642 = new byte[]{109, 105, 102, 49};
        f11639 = new byte[]{104, 101, 105, 99};
        f11653 = new byte[]{79, 76, 89, 77, 80, 0};
        f11637 = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f11645 = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f11643 = new byte[]{101, 88, 73, 102};
        f11641 = new byte[]{73, 72, 68, 82};
        f11636 = new byte[]{73, 69, 78, 68};
        f11658 = new byte[]{82, 73, 70, 70};
        f11640 = new byte[]{87, 69, 66, 80};
        f11635 = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f11648 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f11630 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f11651 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C2069[] c2069Arr = {new C2069("NewSubfileType", 254, 4), new C2069("SubfileType", 255, 4), new C2069(256, 3, 4, "ImageWidth"), new C2069(257, 3, 4, "ImageLength"), new C2069("BitsPerSample", 258, 3), new C2069("Compression", 259, 3), new C2069("PhotometricInterpretation", 262, 3), new C2069("ImageDescription", 270, 2), new C2069("Make", 271, 2), new C2069("Model", 272, 2), new C2069(273, 3, 4, "StripOffsets"), new C2069("Orientation", 274, 3), new C2069("SamplesPerPixel", 277, 3), new C2069(278, 3, 4, "RowsPerStrip"), new C2069(279, 3, 4, "StripByteCounts"), new C2069("XResolution", 282, 5), new C2069("YResolution", 283, 5), new C2069("PlanarConfiguration", 284, 3), new C2069("ResolutionUnit", 296, 3), new C2069("TransferFunction", 301, 3), new C2069("Software", 305, 2), new C2069("DateTime", 306, 2), new C2069("Artist", 315, 2), new C2069("WhitePoint", 318, 5), new C2069("PrimaryChromaticities", 319, 5), new C2069("SubIFDPointer", 330, 4), new C2069("JPEGInterchangeFormat", 513, 4), new C2069("JPEGInterchangeFormatLength", 514, 4), new C2069("YCbCrCoefficients", 529, 5), new C2069("YCbCrSubSampling", 530, 3), new C2069("YCbCrPositioning", 531, 3), new C2069("ReferenceBlackWhite", 532, 5), new C2069("Copyright", 33432, 2), new C2069("ExifIFDPointer", 34665, 4), new C2069("GPSInfoIFDPointer", 34853, 4), new C2069("SensorTopBorder", 4, 4), new C2069("SensorLeftBorder", 5, 4), new C2069("SensorBottomBorder", 6, 4), new C2069("SensorRightBorder", 7, 4), new C2069("ISO", 23, 3), new C2069("JpgFromRaw", 46, 7), new C2069("Xmp", 700, 1)};
        C2069[] c2069Arr2 = {new C2069("ExposureTime", 33434, 5), new C2069("FNumber", 33437, 5), new C2069("ExposureProgram", 34850, 3), new C2069("SpectralSensitivity", 34852, 2), new C2069("PhotographicSensitivity", 34855, 3), new C2069("OECF", 34856, 7), new C2069("SensitivityType", 34864, 3), new C2069("StandardOutputSensitivity", 34865, 4), new C2069("RecommendedExposureIndex", 34866, 4), new C2069("ISOSpeed", 34867, 4), new C2069("ISOSpeedLatitudeyyy", 34868, 4), new C2069("ISOSpeedLatitudezzz", 34869, 4), new C2069("ExifVersion", 36864, 2), new C2069("DateTimeOriginal", 36867, 2), new C2069("DateTimeDigitized", 36868, 2), new C2069("OffsetTime", 36880, 2), new C2069("OffsetTimeOriginal", 36881, 2), new C2069("OffsetTimeDigitized", 36882, 2), new C2069("ComponentsConfiguration", 37121, 7), new C2069("CompressedBitsPerPixel", 37122, 5), new C2069("ShutterSpeedValue", 37377, 10), new C2069("ApertureValue", 37378, 5), new C2069("BrightnessValue", 37379, 10), new C2069("ExposureBiasValue", 37380, 10), new C2069("MaxApertureValue", 37381, 5), new C2069("SubjectDistance", 37382, 5), new C2069("MeteringMode", 37383, 3), new C2069("LightSource", 37384, 3), new C2069("Flash", 37385, 3), new C2069("FocalLength", 37386, 5), new C2069("SubjectArea", 37396, 3), new C2069("MakerNote", 37500, 7), new C2069("UserComment", 37510, 7), new C2069("SubSecTime", 37520, 2), new C2069("SubSecTimeOriginal", 37521, 2), new C2069("SubSecTimeDigitized", 37522, 2), new C2069("FlashpixVersion", 40960, 7), new C2069("ColorSpace", 40961, 3), new C2069(40962, 3, 4, "PixelXDimension"), new C2069(40963, 3, 4, "PixelYDimension"), new C2069("RelatedSoundFile", 40964, 2), new C2069("InteroperabilityIFDPointer", 40965, 4), new C2069("FlashEnergy", 41483, 5), new C2069("SpatialFrequencyResponse", 41484, 7), new C2069("FocalPlaneXResolution", 41486, 5), new C2069("FocalPlaneYResolution", 41487, 5), new C2069("FocalPlaneResolutionUnit", 41488, 3), new C2069("SubjectLocation", 41492, 3), new C2069("ExposureIndex", 41493, 5), new C2069("SensingMethod", 41495, 3), new C2069("FileSource", 41728, 7), new C2069("SceneType", 41729, 7), new C2069("CFAPattern", 41730, 7), new C2069("CustomRendered", 41985, 3), new C2069("ExposureMode", 41986, 3), new C2069("WhiteBalance", 41987, 3), new C2069("DigitalZoomRatio", 41988, 5), new C2069("FocalLengthIn35mmFilm", 41989, 3), new C2069("SceneCaptureType", 41990, 3), new C2069("GainControl", 41991, 3), new C2069("Contrast", 41992, 3), new C2069("Saturation", 41993, 3), new C2069("Sharpness", 41994, 3), new C2069("DeviceSettingDescription", 41995, 7), new C2069("SubjectDistanceRange", 41996, 3), new C2069("ImageUniqueID", 42016, 2), new C2069("CameraOwnerName", 42032, 2), new C2069("BodySerialNumber", 42033, 2), new C2069("LensSpecification", 42034, 5), new C2069("LensMake", 42035, 2), new C2069("LensModel", 42036, 2), new C2069("Gamma", 42240, 5), new C2069("DNGVersion", 50706, 1), new C2069(50720, 3, 4, "DefaultCropSize")};
        C2069[] c2069Arr3 = {new C2069("GPSVersionID", 0, 1), new C2069("GPSLatitudeRef", 1, 2), new C2069(2, 5, 10, "GPSLatitude"), new C2069("GPSLongitudeRef", 3, 2), new C2069(4, 5, 10, "GPSLongitude"), new C2069("GPSAltitudeRef", 5, 1), new C2069("GPSAltitude", 6, 5), new C2069("GPSTimeStamp", 7, 5), new C2069("GPSSatellites", 8, 2), new C2069("GPSStatus", 9, 2), new C2069("GPSMeasureMode", 10, 2), new C2069("GPSDOP", 11, 5), new C2069("GPSSpeedRef", 12, 2), new C2069("GPSSpeed", 13, 5), new C2069("GPSTrackRef", 14, 2), new C2069("GPSTrack", 15, 5), new C2069("GPSImgDirectionRef", 16, 2), new C2069("GPSImgDirection", 17, 5), new C2069("GPSMapDatum", 18, 2), new C2069("GPSDestLatitudeRef", 19, 2), new C2069("GPSDestLatitude", 20, 5), new C2069("GPSDestLongitudeRef", 21, 2), new C2069("GPSDestLongitude", 22, 5), new C2069("GPSDestBearingRef", 23, 2), new C2069("GPSDestBearing", 24, 5), new C2069("GPSDestDistanceRef", 25, 2), new C2069("GPSDestDistance", 26, 5), new C2069("GPSProcessingMethod", 27, 7), new C2069("GPSAreaInformation", 28, 7), new C2069("GPSDateStamp", 29, 2), new C2069("GPSDifferential", 30, 3), new C2069("GPSHPositioningError", 31, 5)};
        C2069[] c2069Arr4 = {new C2069("InteroperabilityIndex", 1, 2)};
        C2069[] c2069Arr5 = {new C2069("NewSubfileType", 254, 4), new C2069("SubfileType", 255, 4), new C2069(256, 3, 4, "ThumbnailImageWidth"), new C2069(257, 3, 4, "ThumbnailImageLength"), new C2069("BitsPerSample", 258, 3), new C2069("Compression", 259, 3), new C2069("PhotometricInterpretation", 262, 3), new C2069("ImageDescription", 270, 2), new C2069("Make", 271, 2), new C2069("Model", 272, 2), new C2069(273, 3, 4, "StripOffsets"), new C2069("ThumbnailOrientation", 274, 3), new C2069("SamplesPerPixel", 277, 3), new C2069(278, 3, 4, "RowsPerStrip"), new C2069(279, 3, 4, "StripByteCounts"), new C2069("XResolution", 282, 5), new C2069("YResolution", 283, 5), new C2069("PlanarConfiguration", 284, 3), new C2069("ResolutionUnit", 296, 3), new C2069("TransferFunction", 301, 3), new C2069("Software", 305, 2), new C2069("DateTime", 306, 2), new C2069("Artist", 315, 2), new C2069("WhitePoint", 318, 5), new C2069("PrimaryChromaticities", 319, 5), new C2069("SubIFDPointer", 330, 4), new C2069("JPEGInterchangeFormat", 513, 4), new C2069("JPEGInterchangeFormatLength", 514, 4), new C2069("YCbCrCoefficients", 529, 5), new C2069("YCbCrSubSampling", 530, 3), new C2069("YCbCrPositioning", 531, 3), new C2069("ReferenceBlackWhite", 532, 5), new C2069("Copyright", 33432, 2), new C2069("ExifIFDPointer", 34665, 4), new C2069("GPSInfoIFDPointer", 34853, 4), new C2069("DNGVersion", 50706, 1), new C2069(50720, 3, 4, "DefaultCropSize")};
        f11652 = new C2069("StripOffsets", 273, 3);
        f11654 = new C2069[][]{c2069Arr, c2069Arr2, c2069Arr3, c2069Arr4, c2069Arr5, c2069Arr, new C2069[]{new C2069("ThumbnailImage", 256, 7), new C2069("CameraSettingsIFDPointer", 8224, 4), new C2069("ImageProcessingIFDPointer", 8256, 4)}, new C2069[]{new C2069("PreviewImageStart", 257, 4), new C2069("PreviewImageLength", 258, 4)}, new C2069[]{new C2069("AspectFrame", 4371, 3)}, new C2069[]{new C2069("ColorSpace", 55, 3)}};
        f11647 = new C2069[]{new C2069("SubIFDPointer", 330, 4), new C2069("ExifIFDPointer", 34665, 4), new C2069("GPSInfoIFDPointer", 34853, 4), new C2069("InteroperabilityIFDPointer", 40965, 4), new C2069("CameraSettingsIFDPointer", 8224, 1), new C2069("ImageProcessingIFDPointer", 8256, 1)};
        f11649 = new HashMap[10];
        f11657 = new HashMap[10];
        f11633 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f11632 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f11650 = charsetForName;
        f11655 = "Exif\u0000\u0000".getBytes(charsetForName);
        f11644 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C2069[][] c2069Arr6 = f11654;
            if (i >= c2069Arr6.length) {
                HashMap map = f11632;
                C2069[] c2069Arr7 = f11647;
                map.put(Integer.valueOf(c2069Arr7[0].f10222), 5);
                map.put(Integer.valueOf(c2069Arr7[1].f10222), 1);
                map.put(Integer.valueOf(c2069Arr7[2].f10222), 2);
                map.put(Integer.valueOf(c2069Arr7[3].f10222), 3);
                map.put(Integer.valueOf(c2069Arr7[4].f10222), 7);
                map.put(Integer.valueOf(c2069Arr7[5].f10222), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f11649[i] = new HashMap();
            f11657[i] = new HashMap();
            for (C2069 c2069 : c2069Arr6[i]) {
                f11649[i].put(Integer.valueOf(c2069.f10222), c2069);
                f11657[i].put(c2069.f10223, c2069);
            }
            i++;
        }
    }

    public C2367(InputStream inputStream) throws IOException {
        C2069[][] c2069Arr = f11654;
        this.f11669 = new HashMap[c2069Arr.length];
        this.f11661 = new HashSet(c2069Arr.length);
        this.f11668 = ByteOrder.BIG_ENDIAN;
        boolean z = inputStream instanceof AssetManager.AssetInputStream;
        boolean z2 = f11646;
        if (z) {
            this.f11663 = (AssetManager.AssetInputStream) inputStream;
            this.f11662 = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC1071.m2277(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f11663 = null;
                this.f11662 = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z2) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f11663 = null;
                this.f11662 = null;
            }
        } else {
            this.f11663 = null;
            this.f11662 = null;
        }
        for (int i = 0; i < c2069Arr.length; i++) {
            try {
                try {
                    this.f11669[i] = new HashMap();
                } catch (IOException | UnsupportedOperationException e) {
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    m4394();
                    if (!z2) {
                        return;
                    }
                }
            } catch (Throwable th) {
                m4394();
                if (z2) {
                    m4408();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iM4409 = m4409(bufferedInputStream);
        this.f11667 = iM4409;
        if (iM4409 == 4 || iM4409 == 9 || iM4409 == 13 || iM4409 == 14) {
            C0886 c0886 = new C0886(bufferedInputStream);
            int i2 = this.f11667;
            if (i2 == 4) {
                m4392(c0886, 0, 0);
            } else if (i2 == 13) {
                m4389(c0886);
            } else if (i2 == 9) {
                m4391(c0886);
            } else if (i2 == 14) {
                m4404(c0886);
            }
        } else {
            C2033 c2033 = new C2033(bufferedInputStream);
            int i3 = this.f11667;
            if (i3 == 12) {
                m4410(c2033);
            } else if (i3 == 7) {
                m4400(c2033);
            } else if (i3 == 10) {
                m4403(c2033);
            } else {
                m4405(c2033);
            }
            c2033.m3910(this.f11659);
            m4402(c2033);
        }
        m4394();
        if (!z2) {
            return;
        }
        m4408();
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static ByteOrder m4387(C0886 c0886) throws IOException {
        short s = c0886.readShort();
        boolean z = f11646;
        if (s == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            C0188.m797(Integer.toHexString(s), "Invalid byte order: ");
            return null;
        }
        if (z) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final boolean m4388(HashMap map) {
        C1207 c1207 = (C1207) map.get("ImageLength");
        C1207 c12072 = (C1207) map.get("ImageWidth");
        if (c1207 == null || c12072 == null) {
            return false;
        }
        return c1207.m2399(this.f11668) <= 512 && c12072.m2399(this.f11668) <= 512;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m4389(C0886 c0886) throws Throwable {
        if (f11646) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c0886);
        }
        c0886.f4065 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f11645;
        c0886.m1980(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c0886.readInt();
                byte[] bArr2 = new byte[4];
                if (c0886.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f11641)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f11636)) {
                    return;
                }
                if (Arrays.equals(bArr2, f11643)) {
                    byte[] bArr3 = new byte[i];
                    if (c0886.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC0319.m984(bArr2));
                    }
                    int i3 = c0886.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f11659 = i2;
                        m4397(0, bArr3);
                        m4393();
                        m4402(new C0886(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c0886.m1980(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                C0188.m804("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m4390(C0886 c0886, HashMap map) throws Throwable {
        C1207 c1207 = (C1207) map.get("JPEGInterchangeFormat");
        C1207 c12072 = (C1207) map.get("JPEGInterchangeFormatLength");
        if (c1207 == null || c12072 == null) {
            return;
        }
        int iM2399 = c1207.m2399(this.f11668);
        int iM23992 = c12072.m2399(this.f11668);
        if (this.f11667 == 7) {
            iM2399 += this.f11660;
        }
        if (iM2399 > 0 && iM23992 > 0 && this.f11663 == null && this.f11662 == null) {
            c0886.skip(iM2399);
            c0886.read(new byte[iM23992]);
        }
        if (f11646) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM2399 + ", length: " + iM23992);
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m4391(C0886 c0886) throws Throwable {
        boolean z = f11646;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c0886);
        }
        c0886.m1980(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0886.read(bArr);
        c0886.read(bArr2);
        c0886.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c0886.m1980(i - c0886.f4062);
        c0886.read(bArr4);
        m4392(new C0886(bArr4), i, 5);
        c0886.m1980(i3 - c0886.f4062);
        c0886.f4065 = ByteOrder.BIG_ENDIAN;
        int i4 = c0886.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c0886.readUnsignedShort();
            int unsignedShort2 = c0886.readUnsignedShort();
            if (unsignedShort == f11652.f10222) {
                short s = c0886.readShort();
                short s2 = c0886.readShort();
                C1207 c1207M2398 = C1207.m2398(s, this.f11668);
                C1207 c1207M23982 = C1207.m2398(s2, this.f11668);
                HashMap[] mapArr = this.f11669;
                mapArr[0].put("ImageLength", c1207M2398);
                mapArr[0].put("ImageWidth", c1207M23982);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            c0886.m1980(unsignedShort2);
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
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4392(yyds.C0886 r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yyds.C2367.m4392(yyds.ᛴᛷᛳᛴ, int, int):void");
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final void m4393() throws Throwable {
        m4401(0, 5);
        m4401(0, 4);
        m4401(5, 4);
        HashMap[] mapArr = this.f11669;
        C1207 c1207 = (C1207) mapArr[1].get("PixelXDimension");
        C1207 c12072 = (C1207) mapArr[1].get("PixelYDimension");
        if (c1207 != null && c12072 != null) {
            mapArr[0].put("ImageWidth", c1207);
            mapArr[0].put("ImageLength", c12072);
        }
        if (mapArr[4].isEmpty() && m4388(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m4388(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m4395("ThumbnailOrientation", 0, "Orientation");
        m4395("ThumbnailImageLength", 0, "ImageLength");
        m4395("ThumbnailImageWidth", 0, "ImageWidth");
        m4395("ThumbnailOrientation", 5, "Orientation");
        m4395("ThumbnailImageLength", 5, "ImageLength");
        m4395("ThumbnailImageWidth", 5, "ImageWidth");
        m4395("Orientation", 4, "ThumbnailOrientation");
        m4395("ImageLength", 4, "ThumbnailImageLength");
        m4395("ImageWidth", 4, "ThumbnailImageWidth");
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4394() {
        String strM4398 = m4398("DateTimeOriginal");
        HashMap[] mapArr = this.f11669;
        if (strM4398 != null && m4398("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM4398.concat("\u0000").getBytes(f11650);
            map.put("DateTime", new C1207(bytes, 2, bytes.length));
        }
        if (m4398("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C1207.m2396(0L, this.f11668));
        }
        if (m4398("ImageLength") == null) {
            mapArr[0].put("ImageLength", C1207.m2396(0L, this.f11668));
        }
        if (m4398("Orientation") == null) {
            mapArr[0].put("Orientation", C1207.m2396(0L, this.f11668));
        }
        if (m4398("LightSource") == null) {
            mapArr[1].put("LightSource", C1207.m2396(0L, this.f11668));
        }
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final void m4395(String str, int i, String str2) {
        HashMap[] mapArr = this.f11669;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m4396(C2033 c2033) throws IOException {
        ByteOrder byteOrderM4387 = m4387(c2033);
        this.f11668 = byteOrderM4387;
        c2033.f4065 = byteOrderM4387;
        int unsignedShort = c2033.readUnsignedShort();
        int i = this.f11667;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            C0188.m797(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = c2033.readInt();
        if (i2 < 8) {
            C0188.m804(AbstractC0897.m1989(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c2033.m1980(i3);
        }
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final void m4397(int i, byte[] bArr) throws IOException {
        C2033 c2033 = new C2033(bArr);
        m4396(c2033);
        m4406(c2033, i);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String m4398(String str) {
        C1207 c1207M4407 = m4407(str);
        if (c1207M4407 != null) {
            int i = c1207M4407.f5494;
            if (!f11633.contains(str)) {
                return c1207M4407.m2401(this.f11668);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C0885[] c0885Arr = (C0885[]) c1207M4407.m2400(this.f11668);
                if (c0885Arr == null || c0885Arr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c0885Arr));
                    return null;
                }
                C0885 c0885 = c0885Arr[0];
                Integer numValueOf = Integer.valueOf((int) (c0885.f4058 / c0885.f4059));
                C0885 c08852 = c0885Arr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c08852.f4058 / c08852.f4059));
                C0885 c08853 = c0885Arr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c08853.f4058 / c08853.f4059)));
            }
            try {
                return Double.toString(c1207M4407.m2402(this.f11668));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final void m4399(C2033 c2033, int i) throws Throwable {
        C1207 c1207M2398;
        C1207 c1207M23982;
        HashMap[] mapArr = this.f11669;
        C1207 c1207 = (C1207) mapArr[i].get("DefaultCropSize");
        C1207 c12072 = (C1207) mapArr[i].get("SensorTopBorder");
        C1207 c12073 = (C1207) mapArr[i].get("SensorLeftBorder");
        C1207 c12074 = (C1207) mapArr[i].get("SensorBottomBorder");
        C1207 c12075 = (C1207) mapArr[i].get("SensorRightBorder");
        if (c1207 != null) {
            int i2 = c1207.f5494;
            ByteOrder byteOrder = this.f11668;
            if (i2 == 5) {
                C0885[] c0885Arr = (C0885[]) c1207.m2400(byteOrder);
                if (c0885Arr == null || c0885Arr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c0885Arr));
                    return;
                }
                c1207M2398 = C1207.m2397(c0885Arr[0], this.f11668);
                c1207M23982 = C1207.m2397(c0885Arr[1], this.f11668);
            } else {
                int[] iArr = (int[]) c1207.m2400(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c1207M2398 = C1207.m2398(iArr[0], this.f11668);
                c1207M23982 = C1207.m2398(iArr[1], this.f11668);
            }
            mapArr[i].put("ImageWidth", c1207M2398);
            mapArr[i].put("ImageLength", c1207M23982);
            return;
        }
        if (c12072 != null && c12073 != null && c12074 != null && c12075 != null) {
            int iM2399 = c12072.m2399(this.f11668);
            int iM23992 = c12074.m2399(this.f11668);
            int iM23993 = c12075.m2399(this.f11668);
            int iM23994 = c12073.m2399(this.f11668);
            if (iM23992 <= iM2399 || iM23993 <= iM23994) {
                return;
            }
            C1207 c1207M23983 = C1207.m2398(iM23992 - iM2399, this.f11668);
            C1207 c1207M23984 = C1207.m2398(iM23993 - iM23994, this.f11668);
            mapArr[i].put("ImageLength", c1207M23983);
            mapArr[i].put("ImageWidth", c1207M23984);
            return;
        }
        C1207 c12076 = (C1207) mapArr[i].get("ImageLength");
        C1207 c12077 = (C1207) mapArr[i].get("ImageWidth");
        if (c12076 == null || c12077 == null) {
            C1207 c12078 = (C1207) mapArr[i].get("JPEGInterchangeFormat");
            C1207 c12079 = (C1207) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c12078 == null || c12079 == null) {
                return;
            }
            int iM23995 = c12078.m2399(this.f11668);
            int iM23996 = c12078.m2399(this.f11668);
            c2033.m3910(iM23995);
            byte[] bArr = new byte[iM23996];
            c2033.read(bArr);
            m4392(new C0886(bArr), iM23995, i);
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m4400(C2033 c2033) throws Throwable {
        int i;
        int i2;
        m4405(c2033);
        HashMap[] mapArr = this.f11669;
        C1207 c1207 = (C1207) mapArr[1].get("MakerNote");
        if (c1207 != null) {
            C2033 c20332 = new C2033(c1207.f5497);
            c20332.f4065 = this.f11668;
            byte[] bArr = f11653;
            byte[] bArr2 = new byte[bArr.length];
            c20332.readFully(bArr2);
            c20332.m3910(0L);
            byte[] bArr3 = f11637;
            byte[] bArr4 = new byte[bArr3.length];
            c20332.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c20332.m3910(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c20332.m3910(12L);
            }
            m4406(c20332, 6);
            C1207 c12072 = (C1207) mapArr[7].get("PreviewImageStart");
            C1207 c12073 = (C1207) mapArr[7].get("PreviewImageLength");
            if (c12072 != null && c12073 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c12072);
                mapArr[5].put("JPEGInterchangeFormatLength", c12073);
            }
            C1207 c12074 = (C1207) mapArr[8].get("AspectFrame");
            if (c12074 != null) {
                int[] iArr = (int[]) c12074.m2400(this.f11668);
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
                C1207 c1207M2398 = C1207.m2398(i5, this.f11668);
                C1207 c1207M23982 = C1207.m2398(i6, this.f11668);
                mapArr[0].put("ImageWidth", c1207M2398);
                mapArr[0].put("ImageLength", c1207M23982);
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final void m4401(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f11669;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f11646;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C1207 c1207 = (C1207) mapArr[i].get("ImageLength");
        C1207 c12072 = (C1207) mapArr[i].get("ImageWidth");
        C1207 c12073 = (C1207) mapArr[i2].get("ImageLength");
        C1207 c12074 = (C1207) mapArr[i2].get("ImageWidth");
        if (c1207 == null || c12072 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c12073 == null || c12074 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM2399 = c1207.m2399(this.f11668);
        int iM23992 = c12072.m2399(this.f11668);
        int iM23993 = c12073.m2399(this.f11668);
        int iM23994 = c12074.m2399(this.f11668);
        if (iM2399 >= iM23993 || iM23992 >= iM23994) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final void m4402(C0886 c0886) throws Throwable {
        C1207 c1207;
        int iM2399;
        HashMap map = this.f11669[4];
        C1207 c12072 = (C1207) map.get("Compression");
        if (c12072 == null) {
            m4390(c0886, map);
            return;
        }
        int iM23992 = c12072.m2399(this.f11668);
        if (iM23992 != 1) {
            if (iM23992 == 6) {
                m4390(c0886, map);
                return;
            } else if (iM23992 != 7) {
                return;
            }
        }
        C1207 c12073 = (C1207) map.get("BitsPerSample");
        if (c12073 != null) {
            int[] iArr = (int[]) c12073.m2400(this.f11668);
            int[] iArr2 = f11634;
            if (Arrays.equals(iArr2, iArr) || (this.f11667 == 3 && (c1207 = (C1207) map.get("PhotometricInterpretation")) != null && (((iM2399 = c1207.m2399(this.f11668)) == 1 && Arrays.equals(iArr, f11631)) || (iM2399 == 6 && Arrays.equals(iArr, iArr2))))) {
                C1207 c12074 = (C1207) map.get("StripOffsets");
                C1207 c12075 = (C1207) map.get("StripByteCounts");
                if (c12074 == null || c12075 == null) {
                    return;
                }
                long[] jArrM982 = AbstractC0319.m982(c12074.m2400(this.f11668));
                long[] jArrM9822 = AbstractC0319.m982(c12075.m2400(this.f11668));
                if (jArrM982 == null || jArrM982.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM9822 == null || jArrM9822.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM982.length != jArrM9822.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrM9822) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f11664 = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM982.length; i3++) {
                    int i4 = (int) jArrM982[i3];
                    int i5 = (int) jArrM9822[i3];
                    if (i3 < jArrM982.length - 1 && i4 + i5 != jArrM982[i3 + 1]) {
                        this.f11664 = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (c0886.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (c0886.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.f11664) {
                    long j4 = jArrM982[0];
                    return;
                }
                return;
            }
        }
        if (f11646) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void m4403(C2033 c2033) throws Throwable {
        if (f11646) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c2033);
        }
        m4405(c2033);
        HashMap[] mapArr = this.f11669;
        C1207 c1207 = (C1207) mapArr[0].get("JpgFromRaw");
        if (c1207 != null) {
            m4392(new C0886(c1207.f5497), (int) c1207.f5496, 5);
        }
        C1207 c12072 = (C1207) mapArr[0].get("ISO");
        C1207 c12073 = (C1207) mapArr[1].get("PhotographicSensitivity");
        if (c12072 == null || c12073 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c12072);
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m4404(C0886 c0886) throws Throwable {
        if (f11646) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c0886);
        }
        c0886.f4065 = ByteOrder.LITTLE_ENDIAN;
        c0886.m1980(f11658.length);
        int i = c0886.readInt() + 8;
        byte[] bArr = f11640;
        c0886.m1980(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c0886.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c0886.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f11635, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c0886.read(bArr3) == i2) {
                        this.f11659 = i3;
                        m4397(0, bArr3);
                        m4402(new C0886(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC0319.m984(bArr2));
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
                c0886.m1980(i2);
            } catch (EOFException unused) {
                C0188.m804("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m4405(C2033 c2033) throws Throwable {
        m4396(c2033);
        m4406(c2033, 0);
        m4399(c2033, 0);
        m4399(c2033, 5);
        m4399(c2033, 4);
        m4393();
        if (this.f11667 == 8) {
            HashMap[] mapArr = this.f11669;
            C1207 c1207 = (C1207) mapArr[1].get("MakerNote");
            if (c1207 != null) {
                C2033 c20332 = new C2033(c1207.f5497);
                c20332.f4065 = this.f11668;
                c20332.m1980(6);
                m4406(c20332, 9);
                C1207 c12072 = (C1207) mapArr[9].get("ColorSpace");
                if (c12072 != null) {
                    mapArr[1].put("ColorSpace", c12072);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4406(C2033 c2033, int i) throws IOException {
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
        Integer numValueOf = Integer.valueOf(c2033.f4062);
        HashSet hashSet = this.f11661;
        hashSet.add(numValueOf);
        short s3 = c2033.readShort();
        boolean z3 = f11646;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s3));
        }
        if (s3 <= 0) {
            return;
        }
        short s4 = 0;
        while (true) {
            mapArr = this.f11669;
            if (s4 >= s3) {
                break;
            }
            int unsignedShort2 = c2033.readUnsignedShort();
            int unsignedShort3 = c2033.readUnsignedShort();
            int i5 = c2033.readInt();
            long j5 = ((long) c2033.f4062) + 4;
            C2069 c2069 = (C2069) f11649[i].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                s = s3;
                z = z3;
                s2 = s4;
                mapArr2 = mapArr;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c2069 != null ? c2069.f10223 : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i5)));
            } else {
                s = s3;
                z = z3;
                s2 = s4;
                mapArr2 = mapArr;
            }
            if (c2069 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f11630;
                    if (unsignedShort3 < iArr.length) {
                        int i6 = c2069.f10224;
                        if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3 || (i2 = c2069.f10225) == unsignedShort3 || (((i6 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i6 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i6 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
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
                                    c2033.m3910(j);
                                } else {
                                    long j6 = j;
                                    if (j2 > 4) {
                                        int i7 = c2033.readInt();
                                        if (z) {
                                            i3 = unsignedShort2;
                                            Log.d("ExifInterface", "seek to data offset: " + i7);
                                        } else {
                                            i3 = unsignedShort2;
                                        }
                                        if (this.f11667 != 7) {
                                            j3 = j6;
                                            i4 = unsignedShort3;
                                            c2033.m3910(i7);
                                        } else {
                                            if ("MakerNote".equals(c2069.f10223)) {
                                                this.f11660 = i7;
                                            } else {
                                                if (i == 6 && "ThumbnailImage".equals(c2069.f10223)) {
                                                    this.f11666 = i7;
                                                    this.f11665 = i5;
                                                    C1207 c1207M2398 = C1207.m2398(6, this.f11668);
                                                    j3 = j6;
                                                    C1207 c1207M2396 = C1207.m2396(this.f11666, this.f11668);
                                                    i4 = unsignedShort3;
                                                    C1207 c1207M23962 = C1207.m2396(this.f11665, this.f11668);
                                                    mapArr2[4].put("Compression", c1207M2398);
                                                    mapArr2[4].put("JPEGInterchangeFormat", c1207M2396);
                                                    mapArr2[4].put("JPEGInterchangeFormatLength", c1207M23962);
                                                }
                                                c2033.m3910(i7);
                                            }
                                            j3 = j6;
                                            i4 = unsignedShort3;
                                            c2033.m3910(i7);
                                        }
                                    } else {
                                        j3 = j6;
                                        i3 = unsignedShort2;
                                        i4 = unsignedShort3;
                                    }
                                    Integer num = (Integer) f11632.get(Integer.valueOf(i3));
                                    if (z) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                                    }
                                    if (num != null) {
                                        int i8 = i4;
                                        if (i8 != 3) {
                                            if (i8 == 4) {
                                                j4 = ((long) c2033.readInt()) & 4294967295L;
                                            } else if (i8 == 8) {
                                                unsignedShort = c2033.readShort();
                                            } else if (i8 == 9 || i8 == 13) {
                                                unsignedShort = c2033.readInt();
                                            } else {
                                                j4 = -1;
                                            }
                                            if (z) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), c2069.f10223));
                                            }
                                            if (j4 <= 0) {
                                                if (!hashSet.contains(Integer.valueOf((int) j4))) {
                                                    c2033.m3910(j4);
                                                    m4406(c2033, num.intValue());
                                                } else if (z) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j4 + ")");
                                                }
                                            } else if (z) {
                                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                                            }
                                            c2033.m3910(j3);
                                        } else {
                                            unsignedShort = c2033.readUnsignedShort();
                                        }
                                        j4 = unsignedShort;
                                        if (z) {
                                        }
                                        if (j4 <= 0) {
                                        }
                                        c2033.m3910(j3);
                                    } else {
                                        long j7 = j3;
                                        int i9 = c2033.f4062 + this.f11659;
                                        byte[] bArr = new byte[(int) j2];
                                        c2033.readFully(bArr);
                                        C1207 c1207 = new C1207(i9, bArr, i4, i5);
                                        HashMap map = mapArr2[i];
                                        String str = c2069.f10223;
                                        map.put(str, c1207);
                                        if ("DNGVersion".equals(str)) {
                                            this.f11667 = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && c1207.m2401(this.f11668).contains("PENTAX")) || ("Compression".equals(str) && c1207.m2399(this.f11668) == 65535)) {
                                            this.f11667 = 8;
                                        }
                                        if (c2033.f4062 != j7) {
                                            c2033.m3910(j7);
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
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f11648[unsignedShort3] + ") is unexpected for tag: " + c2069.f10223);
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
        int i10 = c2033.readInt();
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
        c2033.m3910(j8);
        if (mapArr[4].isEmpty()) {
            m4406(c2033, 4);
        } else if (mapArr[5].isEmpty()) {
            m4406(c2033, 5);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1207 m4407(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f11646) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f11654.length; i++) {
            C1207 c1207 = (C1207) this.f11669[i].get(str);
            if (c1207 != null) {
                return c1207;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m4408() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f11669;
            if (i >= mapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + mapArr[i].size());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C1207 c1207 = (C1207) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c1207.toString() + ", tagValue: '" + c1207.m2401(this.f11668) + "'");
            }
            i++;
        }
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
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m4409(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        C0886 c0886;
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
            byte[] bArr3 = f11638;
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
                        C0886 c08862 = null;
                        C0886 c08863 = null;
                        C0886 c08864 = null;
                        try {
                            try {
                                c0886 = new C0886(bArr2);
                                try {
                                    j = c0886.readInt();
                                    bArr = new byte[4];
                                    c0886.read(bArr);
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
                            c0886 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (r4 != 0) {
                            }
                            throw th;
                        }
                        if (Arrays.equals(bArr, f11656)) {
                            if (j == 1) {
                                j = c0886.readLong();
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
                                        if (c0886.read(bArr4) != 4) {
                                            break;
                                        }
                                        if (j4 != 1) {
                                            if (Arrays.equals(bArr4, f11642)) {
                                                z = true;
                                            } else if (Arrays.equals(bArr4, f11639)) {
                                                z2 = true;
                                            }
                                            if (z && z2) {
                                                c0886.close();
                                                return 12;
                                            }
                                        }
                                        j4++;
                                    } catch (Exception e3) {
                                        e = e3;
                                        if (f11646) {
                                        }
                                        if (c0886 != null) {
                                            break;
                                        }
                                        C0886 c08865 = new C0886(bArr2);
                                        ByteOrder byteOrderM4387 = m4387(c08865);
                                        this.f11668 = byteOrderM4387;
                                        c08865.f4065 = byteOrderM4387;
                                        short s = c08865.readShort();
                                        if (s == 20306) {
                                        }
                                        if (i2 != 0) {
                                        }
                                    }
                                }
                            }
                            if (f11646) {
                                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                            }
                            if (c0886 != null) {
                                c0886.close();
                            }
                            C0886 c088652 = new C0886(bArr2);
                            ByteOrder byteOrderM43872 = m4387(c088652);
                            this.f11668 = byteOrderM43872;
                            c088652.f4065 = byteOrderM43872;
                            short s2 = c088652.readShort();
                            i2 = (s2 == 20306 || s2 == 21330) ? 1 : i;
                            c088652.close();
                            if (i2 != 0) {
                                return 7;
                            }
                            try {
                                C0886 c08866 = new C0886(bArr2);
                                try {
                                    ByteOrder byteOrderM43873 = m4387(c08866);
                                    this.f11668 = byteOrderM43873;
                                    c08866.f4065 = byteOrderM43873;
                                    i3 = c08866.readShort() != 85 ? i : 1;
                                    c08866.close();
                                } catch (Exception unused) {
                                    c08862 = c08866;
                                    if (c08862 != null) {
                                        c08862.close();
                                    }
                                    i3 = i;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c08863 = c08866;
                                    if (c08863 != null) {
                                        c08863.close();
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
                                byte[] bArr5 = f11645;
                                if (i6 >= bArr5.length) {
                                    return 13;
                                }
                                if (bArr2[i6] != bArr5[i6]) {
                                    int i7 = i;
                                    while (true) {
                                        byte[] bArr6 = f11658;
                                        if (i7 >= bArr6.length) {
                                            int i8 = i;
                                            while (true) {
                                                byte[] bArr7 = f11640;
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
                        c0886.close();
                        i = 0;
                        C0886 c0886522 = new C0886(bArr2);
                        ByteOrder byteOrderM438722 = m4387(c0886522);
                        this.f11668 = byteOrderM438722;
                        c0886522.f4065 = byteOrderM438722;
                        short s22 = c0886522.readShort();
                        if (s22 == 20306) {
                            c0886522.close();
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

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m4410(C2033 c2033) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC2073.m3980(mediaMetadataRetriever, new C1657(c2033));
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
                HashMap[] mapArr = this.f11669;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C1207.m2398(Integer.parseInt(strExtractMetadata), this.f11668));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C1207.m2398(Integer.parseInt(strExtractMetadata2), this.f11668));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", C1207.m2398(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f11668));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c2033.m3910(i2);
                    byte[] bArr = new byte[6];
                    if (c2033.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, f11655)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (c2033.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.f11659 = i4;
                    m4397(0, bArr2);
                }
                if (f11646) {
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
}
