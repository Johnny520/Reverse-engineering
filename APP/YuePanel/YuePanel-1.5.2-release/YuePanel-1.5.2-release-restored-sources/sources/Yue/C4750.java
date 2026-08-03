package Yue;

import Yue.C4758;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.android.p001dx.p004io.Opcodes;
import com.google.flatbuffers.reflection.BaseType;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import net.bytebuddy.description.modifier.ModifierContributor;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4750 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final String f10210 = "ImageWidth";

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final String f10211 = "ImageLength";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final String f10212 = "BitsPerSample";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final String f10213 = "Compression";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final String f10214 = "PhotometricInterpretation";

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final String f10215 = "Orientation";

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final String f10216 = "SamplesPerPixel";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final String f10217 = "PlanarConfiguration";

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final String f10218 = "YCbCrSubSampling";

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final String f10219 = "YCbCrPositioning";

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final String f10220 = "XResolution";

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final String f10221 = "YResolution";

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final String f10222 = "ResolutionUnit";

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final String f10223 = "StripOffsets";

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final String f10224 = "RowsPerStrip";

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final String f10225 = "StripByteCounts";

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final String f10226 = "JPEGInterchangeFormat";

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final String f10227 = "JPEGInterchangeFormatLength";

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final String f10228 = "TransferFunction";

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final String f10229 = "WhitePoint";

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final String f10230 = "PrimaryChromaticities";

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final String f10231 = "YCbCrCoefficients";

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final String f10232 = "ReferenceBlackWhite";

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final String f10233 = "DateTime";

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final String f10234 = "ImageDescription";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f10235 = "Make";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String f10236 = "Model";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final String f10237 = "Software";

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final String f10238 = "Artist";

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final String f10239 = "Copyright";

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final String f10240 = "ExifVersion";

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final String f10241 = "FlashpixVersion";

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final String f10242 = "ColorSpace";

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final String f10243 = "Gamma";

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final String f10244 = "PixelXDimension";

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final String f10245 = "PixelYDimension";

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final String f10246 = "ComponentsConfiguration";

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final String f10247 = "CompressedBitsPerPixel";

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final String f10248 = "MakerNote";

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final String f10249 = "UserComment";

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final String f10250 = "RelatedSoundFile";

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final String f10251 = "DateTimeOriginal";

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final String f10252 = "DateTimeDigitized";

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final String f10253 = "OffsetTime";

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final String f10254 = "OffsetTimeOriginal";

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final String f10255 = "OffsetTimeDigitized";

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final String f10256 = "SubSecTime";

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final String f10257 = "SubSecTimeOriginal";

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final String f10258 = "SubSecTimeDigitized";

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final String f10259 = "ExposureTime";

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static final String f10260 = "FNumber";

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final String f10261 = "ExposureProgram";

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final String f10262 = "SpectralSensitivity";

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    @Deprecated
    public static final String f10263 = "ISOSpeedRatings";

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final String f10264 = "PhotographicSensitivity";

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final String f10265 = "OECF";

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final String f10266 = "SensitivityType";

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final String f10267 = "StandardOutputSensitivity";

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final String f10268 = "RecommendedExposureIndex";

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final String f10269 = "ISOSpeed";

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static final String f10270 = "ISOSpeedLatitudeyyy";

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final String f10271 = "ISOSpeedLatitudezzz";

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final String f10272 = "ShutterSpeedValue";

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static final String f10273 = "ApertureValue";

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final String f10274 = "BrightnessValue";

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static final String f10275 = "ExposureBiasValue";

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static final String f10276 = "MaxApertureValue";

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final String f10277 = "SubjectDistance";

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final String f10278 = "MeteringMode";

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final String f10279 = "LightSource";

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final String f10280 = "Flash";

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final String f10281 = "SubjectArea";

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final String f10282 = "FocalLength";

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final String f10283 = "FlashEnergy";

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final String f10284 = "SpatialFrequencyResponse";

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final String f10285 = "FocalPlaneXResolution";

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final String f10286 = "FocalPlaneYResolution";

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final String f10287 = "FocalPlaneResolutionUnit";

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final String f10288 = "SubjectLocation";

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final String f10289 = "ExposureIndex";

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final String f10290 = "SensingMethod";

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final String f10291 = "FileSource";

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final String f10292 = "SceneType";

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final String f10293 = "CFAPattern";

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final String f10294 = "CustomRendered";

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final String f10295 = "ExposureMode";

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final String f10296 = "WhiteBalance";

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final String f10297 = "DigitalZoomRatio";

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final String f10298 = "FocalLengthIn35mmFilm";

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static final String f10299 = "SceneCaptureType";

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final String f10300 = "GainControl";

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static final String f10301 = "Contrast";

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static final String f10302 = "Saturation";

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static final String f10303 = "Sharpness";

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static final String f10304 = "DeviceSettingDescription";

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static final String f10305 = "SubjectDistanceRange";

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final String f10306 = "ImageUniqueID";

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    @Deprecated
    public static final String f10307 = "CameraOwnerName";

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static final String f10308 = "CameraOwnerName";

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static final String f10309 = "BodySerialNumber";

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static final String f10310 = "LensSpecification";

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static final String f10311 = "LensMake";

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static final String f10312 = "LensModel";

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static final String f10313 = "LensSerialNumber";

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static final String f10314 = "GPSVersionID";

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static final String f10315 = "GPSLatitudeRef";

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static final String f10316 = "GPSLatitude";

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final String f10317 = "GPSLongitudeRef";

    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static final String f10318 = "GPSLongitude";

    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static final String f10319 = "GPSAltitudeRef";

    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static final String f10320 = "GPSAltitude";

    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static final String f10321 = "GPSTimeStamp";

    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public static final String f10322 = "GPSSatellites";

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public static final String f10323 = "GPSStatus";

    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public static final String f10324 = "GPSMeasureMode";

    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public static final String f10325 = "GPSDOP";

    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public static final String f10326 = "GPSSpeedRef";

    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public static final String f10327 = "GPSSpeed";

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static final String f10328 = "GPSTrackRef";

    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public static final String f10329 = "GPSTrack";

    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public static final String f10330 = "GPSImgDirectionRef";

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public static final String f10331 = "GPSImgDirection";

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public static final String f10332 = "GPSMapDatum";

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public static final String f10333 = "GPSDestLatitudeRef";

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public static final String f10334 = "GPSDestLatitude";

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public static final String f10335 = "GPSDestLongitudeRef";

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public static final String f10336 = "GPSDestLongitude";

    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public static final String f10337 = "GPSDestBearingRef";

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public static final String f10338 = "GPSDestBearing";

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static final String f10339 = "GPSDestDistanceRef";

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public static final String f10340 = "GPSDestDistance";

    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public static final String f10341 = "GPSProcessingMethod";

    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public static final String f10342 = "GPSAreaInformation";

    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public static final String f10343 = "GPSDateStamp";

    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public static final String f10344 = "GPSDifferential";

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static final String f10345 = "GPSHPositioningError";

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final String f10346 = "InteroperabilityIndex";

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final String f10347 = "ThumbnailImageLength";

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static final String f10348 = "ThumbnailImageWidth";

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static final String f10349 = "ThumbnailOrientation";

    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public static final String f10350 = "DNGVersion";

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static final String f10351 = "DefaultCropSize";

    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public static final String f10352 = "ThumbnailImage";

    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public static final String f10353 = "PreviewImageStart";

    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static final String f10354 = "PreviewImageLength";

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static final String f10355 = "AspectFrame";

    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public static final String f10356 = "SensorBottomBorder";

    /* JADX INFO: renamed from: ۥ۟۠ۤ۟, reason: contains not printable characters */
    public static final String f10357 = "SensorLeftBorder";

    /* JADX INFO: renamed from: ۥ۟۠ۤ۠, reason: contains not printable characters */
    public static final String f10358 = "SensorRightBorder";

    /* JADX INFO: renamed from: ۥ۟۠ۤۡ, reason: contains not printable characters */
    public static final String f10359 = "SensorTopBorder";

    /* JADX INFO: renamed from: ۥ۟۠ۤۢ, reason: contains not printable characters */
    public static final String f10360 = "ISO";

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static final String f10361 = "JpgFromRaw";

    /* JADX INFO: renamed from: ۥ۟۠ۤۤ, reason: contains not printable characters */
    public static final String f10362 = "Xmp";

    /* JADX INFO: renamed from: ۥ۟۠ۤۥ, reason: contains not printable characters */
    public static final String f10363 = "NewSubfileType";

    /* JADX INFO: renamed from: ۥ۟۠ۤۦ, reason: contains not printable characters */
    public static final String f10364 = "SubfileType";

    /* JADX INFO: renamed from: ۥ۟۠ۤۧ, reason: contains not printable characters */
    public static final String f10365 = "ExifIFDPointer";

    /* JADX INFO: renamed from: ۥ۟۠ۤۨ, reason: contains not printable characters */
    public static final String f10366 = "GPSInfoIFDPointer";

    /* JADX INFO: renamed from: ۥ۟۠ۥ, reason: contains not printable characters */
    public static final String f10367 = "InteroperabilityIFDPointer";

    /* JADX INFO: renamed from: ۥ۟۠ۥ۟, reason: contains not printable characters */
    public static final String f10368 = "SubIFDPointer";

    /* JADX INFO: renamed from: ۥ۟۠ۥ۠, reason: contains not printable characters */
    public static final String f10369 = "CameraSettingsIFDPointer";

    /* JADX INFO: renamed from: ۥ۟۠ۥۡ, reason: contains not printable characters */
    public static final String f10370 = "ImageProcessingIFDPointer";

    /* JADX INFO: renamed from: ۥ۟۠ۥۢ, reason: contains not printable characters */
    public static final int f10371 = 512;

    /* JADX INFO: renamed from: ۥ۟۠ۥۣ, reason: contains not printable characters */
    public static final int f10372 = 0;

    /* JADX INFO: renamed from: ۥ۟۠ۥۤ, reason: contains not printable characters */
    public static final int f10373 = 1;

    /* JADX INFO: renamed from: ۥ۟۠ۥۥ, reason: contains not printable characters */
    public static final int f10374 = 2;

    /* JADX INFO: renamed from: ۥ۟۠ۥۦ, reason: contains not printable characters */
    public static final int f10375 = 3;

    /* JADX INFO: renamed from: ۥ۟۠ۥۧ, reason: contains not printable characters */
    public static final int f10376 = 4;

    /* JADX INFO: renamed from: ۥ۟۠ۥۨ, reason: contains not printable characters */
    public static final int f10377 = 5;

    /* JADX INFO: renamed from: ۥ۟۠ۦ, reason: contains not printable characters */
    public static final int f10378 = 6;

    /* JADX INFO: renamed from: ۥ۟۠ۦ۟, reason: contains not printable characters */
    public static final int f10379 = 7;

    /* JADX INFO: renamed from: ۥ۟۠ۦ۠, reason: contains not printable characters */
    public static final int f10380 = 8;

    /* JADX INFO: renamed from: ۥ۟۠ۦۣ, reason: contains not printable characters */
    public static final short f10383 = 1;

    /* JADX INFO: renamed from: ۥ۟۠ۦۤ, reason: contains not printable characters */
    public static final short f10384 = 2;

    /* JADX INFO: renamed from: ۥ۟۠ۦۥ, reason: contains not printable characters */
    public static final short f10385 = 1;

    /* JADX INFO: renamed from: ۥ۟۠ۦۦ, reason: contains not printable characters */
    public static final short f10386 = 2;

    /* JADX INFO: renamed from: ۥ۟۠ۦۧ, reason: contains not printable characters */
    public static final short f10387 = 2;

    /* JADX INFO: renamed from: ۥ۟۠ۦۨ, reason: contains not printable characters */
    public static final short f10388 = 3;

    /* JADX INFO: renamed from: ۥ۟۠ۧ, reason: contains not printable characters */
    public static final int f10389 = 1;

    /* JADX INFO: renamed from: ۥ۟۠ۧ۟, reason: contains not printable characters */
    public static final int f10390 = 65535;

    /* JADX INFO: renamed from: ۥ۟۠ۧ۠, reason: contains not printable characters */
    public static final short f10391 = 0;

    /* JADX INFO: renamed from: ۥ۟۠ۧۡ, reason: contains not printable characters */
    public static final short f10392 = 1;

    /* JADX INFO: renamed from: ۥ۟۠ۧۢ, reason: contains not printable characters */
    public static final short f10393 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static final short f10394 = 3;

    /* JADX INFO: renamed from: ۥ۟۠ۧۤ, reason: contains not printable characters */
    public static final short f10395 = 4;

    /* JADX INFO: renamed from: ۥ۟۠ۧۥ, reason: contains not printable characters */
    public static final short f10396 = 5;

    /* JADX INFO: renamed from: ۥ۟۠ۧۦ, reason: contains not printable characters */
    public static final short f10397 = 6;

    /* JADX INFO: renamed from: ۥ۟۠ۧۧ, reason: contains not printable characters */
    public static final short f10398 = 7;

    /* JADX INFO: renamed from: ۥ۟۠ۧۨ, reason: contains not printable characters */
    public static final short f10399 = 8;

    /* JADX INFO: renamed from: ۥ۟۠ۨ, reason: contains not printable characters */
    public static final short f10400 = 0;

    /* JADX INFO: renamed from: ۥ۟۠ۨ۟, reason: contains not printable characters */
    public static final short f10401 = 1;

    /* JADX INFO: renamed from: ۥ۟۠ۨ۠, reason: contains not printable characters */
    public static final short f10402 = 2;

    /* JADX INFO: renamed from: ۥ۟۠ۨۡ, reason: contains not printable characters */
    public static final short f10403 = 3;

    /* JADX INFO: renamed from: ۥ۟۠ۨۢ, reason: contains not printable characters */
    public static final short f10404 = 4;

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static final short f10405 = 5;

    /* JADX INFO: renamed from: ۥ۟۠ۨۤ, reason: contains not printable characters */
    public static final short f10406 = 6;

    /* JADX INFO: renamed from: ۥ۟۠ۨۥ, reason: contains not printable characters */
    public static final short f10407 = 7;

    /* JADX INFO: renamed from: ۥ۟۠ۨۦ, reason: contains not printable characters */
    public static final short f10408 = 0;

    /* JADX INFO: renamed from: ۥ۟۠ۨۧ, reason: contains not printable characters */
    public static final short f10409 = 1;

    /* JADX INFO: renamed from: ۥ۟۠ۨۨ, reason: contains not printable characters */
    public static final short f10410 = 2;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final short f10411 = 3;

    /* JADX INFO: renamed from: ۥ۟ۡ۟, reason: contains not printable characters */
    public static final short f10412 = 4;

    /* JADX INFO: renamed from: ۥ۟ۡ۟۟, reason: contains not printable characters */
    public static final short f10413 = 5;

    /* JADX INFO: renamed from: ۥ۟ۡ۟۠, reason: contains not printable characters */
    public static final short f10414 = 6;

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۡ, reason: contains not printable characters */
    public static final short f10415 = 255;

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۢ, reason: contains not printable characters */
    public static final short f10416 = 0;

    /* JADX INFO: renamed from: ۥۣ۟ۡ۟, reason: contains not printable characters */
    public static final short f10417 = 1;

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۤ, reason: contains not printable characters */
    public static final short f10418 = 2;

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۥ, reason: contains not printable characters */
    public static final short f10419 = 3;

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۦ, reason: contains not printable characters */
    public static final short f10420 = 4;

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۧ, reason: contains not printable characters */
    public static final short f10421 = 9;

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۨ, reason: contains not printable characters */
    public static final short f10422 = 10;

    /* JADX INFO: renamed from: ۥ۟ۡ۠, reason: contains not printable characters */
    public static final short f10423 = 11;

    /* JADX INFO: renamed from: ۥ۟ۡ۠۟, reason: contains not printable characters */
    public static final short f10424 = 12;

    /* JADX INFO: renamed from: ۥ۟ۡ۠۠, reason: contains not printable characters */
    public static final short f10425 = 13;

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۡ, reason: contains not printable characters */
    public static final short f10426 = 14;

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۢ, reason: contains not printable characters */
    public static final short f10427 = 15;

    /* JADX INFO: renamed from: ۥۣ۟ۡ۠, reason: contains not printable characters */
    public static final short f10428 = 16;

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۤ, reason: contains not printable characters */
    public static final short f10429 = 17;

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۥ, reason: contains not printable characters */
    public static final short f10430 = 18;

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۦ, reason: contains not printable characters */
    public static final short f10431 = 19;

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۧ, reason: contains not printable characters */
    public static final short f10432 = 20;

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۨ, reason: contains not printable characters */
    public static final short f10433 = 21;

    /* JADX INFO: renamed from: ۥ۟ۡۡ, reason: contains not printable characters */
    public static final short f10434 = 22;

    /* JADX INFO: renamed from: ۥ۟ۡۡ۟, reason: contains not printable characters */
    public static final short f10435 = 23;

    /* JADX INFO: renamed from: ۥ۟ۡۡ۠, reason: contains not printable characters */
    public static final short f10436 = 24;

    /* JADX INFO: renamed from: ۥ۟ۡۡۡ, reason: contains not printable characters */
    public static final short f10437 = 255;

    /* JADX INFO: renamed from: ۥ۟ۡۡۢ, reason: contains not printable characters */
    public static final short f10438 = 1;

    /* JADX INFO: renamed from: ۥۣ۟ۡۡ, reason: contains not printable characters */
    public static final short f10439 = 4;

    /* JADX INFO: renamed from: ۥ۟ۡۡۤ, reason: contains not printable characters */
    public static final short f10440 = 6;

    /* JADX INFO: renamed from: ۥ۟ۡۡۥ, reason: contains not printable characters */
    public static final short f10441 = 8;

    /* JADX INFO: renamed from: ۥ۟ۡۡۦ, reason: contains not printable characters */
    public static final short f10442 = 16;

    /* JADX INFO: renamed from: ۥ۟ۡۡۧ, reason: contains not printable characters */
    public static final short f10443 = 24;

    /* JADX INFO: renamed from: ۥ۟ۡۡۨ, reason: contains not printable characters */
    public static final short f10444 = 32;

    /* JADX INFO: renamed from: ۥ۟ۡۢ, reason: contains not printable characters */
    public static final short f10445 = 64;

    /* JADX INFO: renamed from: ۥ۟ۡۢ۟, reason: contains not printable characters */
    public static final short f10446 = 1;

    /* JADX INFO: renamed from: ۥ۟ۡۢ۠, reason: contains not printable characters */
    public static final short f10447 = 2;

    /* JADX INFO: renamed from: ۥ۟ۡۢۡ, reason: contains not printable characters */
    public static final short f10448 = 3;

    /* JADX INFO: renamed from: ۥ۟ۡۢۢ, reason: contains not printable characters */
    public static final short f10449 = 4;

    /* JADX INFO: renamed from: ۥۣ۟ۡۢ, reason: contains not printable characters */
    public static final short f10450 = 5;

    /* JADX INFO: renamed from: ۥ۟ۡۢۤ, reason: contains not printable characters */
    public static final short f10451 = 7;

    /* JADX INFO: renamed from: ۥ۟ۡۢۥ, reason: contains not printable characters */
    public static final short f10452 = 8;

    /* JADX INFO: renamed from: ۥ۟ۡۢۦ, reason: contains not printable characters */
    public static final short f10453 = 0;

    /* JADX INFO: renamed from: ۥ۟ۡۢۧ, reason: contains not printable characters */
    public static final short f10454 = 1;

    /* JADX INFO: renamed from: ۥ۟ۡۢۨ, reason: contains not printable characters */
    public static final short f10455 = 2;

    /* JADX INFO: renamed from: ۥۣ۟ۡ, reason: contains not printable characters */
    public static final short f10456 = 3;

    /* JADX INFO: renamed from: ۥۣ۟ۡ۟, reason: contains not printable characters */
    public static final short f10457 = 1;

    /* JADX INFO: renamed from: ۥۣ۟ۡ۠, reason: contains not printable characters */
    public static final short f10458 = 0;

    /* JADX INFO: renamed from: ۥۣ۟ۡۡ, reason: contains not printable characters */
    public static final short f10459 = 1;

    /* JADX INFO: renamed from: ۥۣ۟ۡۢ, reason: contains not printable characters */
    public static final short f10460 = 0;

    /* JADX INFO: renamed from: ۥۣۣ۟ۡ, reason: contains not printable characters */
    public static final short f10461 = 1;

    /* JADX INFO: renamed from: ۥۣ۟ۡۤ, reason: contains not printable characters */
    public static final short f10462 = 2;

    /* JADX INFO: renamed from: ۥۣ۟ۡۥ, reason: contains not printable characters */
    @Deprecated
    public static final int f10463 = 0;

    /* JADX INFO: renamed from: ۥۣ۟ۡۦ, reason: contains not printable characters */
    @Deprecated
    public static final int f10464 = 1;

    /* JADX INFO: renamed from: ۥۣ۟ۡۧ, reason: contains not printable characters */
    public static final short f10465 = 0;

    /* JADX INFO: renamed from: ۥۣ۟ۡۨ, reason: contains not printable characters */
    public static final short f10466 = 1;

    /* JADX INFO: renamed from: ۥ۟ۡۤ, reason: contains not printable characters */
    public static final short f10467 = 0;

    /* JADX INFO: renamed from: ۥ۟ۡۤ۟, reason: contains not printable characters */
    public static final short f10468 = 1;

    /* JADX INFO: renamed from: ۥ۟ۡۤ۠, reason: contains not printable characters */
    public static final short f10469 = 2;

    /* JADX INFO: renamed from: ۥ۟ۡۤۡ, reason: contains not printable characters */
    public static final short f10470 = 3;

    /* JADX INFO: renamed from: ۥ۟ۡۤۢ, reason: contains not printable characters */
    public static final short f10471 = 0;

    /* JADX INFO: renamed from: ۥۣ۟ۡۤ, reason: contains not printable characters */
    public static final short f10472 = 1;

    /* JADX INFO: renamed from: ۥ۟ۡۤۤ, reason: contains not printable characters */
    public static final short f10473 = 2;

    /* JADX INFO: renamed from: ۥ۟ۡۤۥ, reason: contains not printable characters */
    public static final short f10474 = 3;

    /* JADX INFO: renamed from: ۥ۟ۡۤۦ, reason: contains not printable characters */
    public static final short f10475 = 4;

    /* JADX INFO: renamed from: ۥ۟ۡۤۧ, reason: contains not printable characters */
    public static final short f10476 = 0;

    /* JADX INFO: renamed from: ۥ۟ۡۤۨ, reason: contains not printable characters */
    public static final short f10477 = 1;

    /* JADX INFO: renamed from: ۥ۟ۡۥ, reason: contains not printable characters */
    public static final short f10478 = 2;

    /* JADX INFO: renamed from: ۥ۟ۡۥ۟, reason: contains not printable characters */
    public static final short f10479 = 0;

    /* JADX INFO: renamed from: ۥ۟ۡۥ۠, reason: contains not printable characters */
    public static final short f10480 = 0;

    /* JADX INFO: renamed from: ۥ۟ۡۥۡ, reason: contains not printable characters */
    public static final short f10481 = 0;

    /* JADX INFO: renamed from: ۥ۟ۡۥۢ, reason: contains not printable characters */
    public static final short f10482 = 0;

    /* JADX INFO: renamed from: ۥ۟ۡۥۣ, reason: contains not printable characters */
    public static final short f10483 = 1;

    /* JADX INFO: renamed from: ۥ۟ۡۥۤ, reason: contains not printable characters */
    public static final short f10484 = 2;

    /* JADX INFO: renamed from: ۥ۟ۡۥۥ, reason: contains not printable characters */
    public static final short f10485 = 0;

    /* JADX INFO: renamed from: ۥ۟ۡۥۦ, reason: contains not printable characters */
    public static final short f10486 = 1;

    /* JADX INFO: renamed from: ۥ۟ۡۥۧ, reason: contains not printable characters */
    public static final short f10487 = 2;

    /* JADX INFO: renamed from: ۥ۟ۡۥۨ, reason: contains not printable characters */
    public static final short f10488 = 3;

    /* JADX INFO: renamed from: ۥ۟ۡۦ, reason: contains not printable characters */
    public static final String f10489 = "N";

    /* JADX INFO: renamed from: ۥ۟ۡۦ۟, reason: contains not printable characters */
    public static final String f10490 = "S";

    /* JADX INFO: renamed from: ۥ۟ۡۦ۠, reason: contains not printable characters */
    public static final String f10491 = "E";

    /* JADX INFO: renamed from: ۥ۟ۡۦۡ, reason: contains not printable characters */
    public static final String f10492 = "W";

    /* JADX INFO: renamed from: ۥ۟ۡۦۢ, reason: contains not printable characters */
    public static final short f10493 = 0;

    /* JADX INFO: renamed from: ۥ۟ۡۦۣ, reason: contains not printable characters */
    public static final short f10494 = 1;

    /* JADX INFO: renamed from: ۥ۟ۡۦۤ, reason: contains not printable characters */
    public static final String f10495 = "A";

    /* JADX INFO: renamed from: ۥ۟ۡۦۥ, reason: contains not printable characters */
    public static final String f10496 = "V";

    /* JADX INFO: renamed from: ۥ۟ۡۦۦ, reason: contains not printable characters */
    public static final String f10497 = "2";

    /* JADX INFO: renamed from: ۥ۟ۡۦۧ, reason: contains not printable characters */
    public static final String f10498 = "3";

    /* JADX INFO: renamed from: ۥ۟ۡۦۨ, reason: contains not printable characters */
    public static final String f10499 = "K";

    /* JADX INFO: renamed from: ۥ۟ۡۧ, reason: contains not printable characters */
    public static final String f10500 = "M";

    /* JADX INFO: renamed from: ۥ۟ۡۧ۟, reason: contains not printable characters */
    public static final String f10501 = "N";

    /* JADX INFO: renamed from: ۥ۟ۡۧ۠, reason: contains not printable characters */
    public static final String f10502 = "T";

    /* JADX INFO: renamed from: ۥ۟ۡۧۡ, reason: contains not printable characters */
    public static final String f10503 = "M";

    /* JADX INFO: renamed from: ۥ۟ۡۧۢ, reason: contains not printable characters */
    public static final String f10504 = "K";

    /* JADX INFO: renamed from: ۥۣ۟ۡۧ, reason: contains not printable characters */
    public static final String f10505 = "M";

    /* JADX INFO: renamed from: ۥ۟ۡۧۤ, reason: contains not printable characters */
    public static final String f10506 = "N";

    /* JADX INFO: renamed from: ۥ۟ۡۧۥ, reason: contains not printable characters */
    public static final short f10507 = 0;

    /* JADX INFO: renamed from: ۥ۟ۡۧۦ, reason: contains not printable characters */
    public static final short f10508 = 1;

    /* JADX INFO: renamed from: ۥ۟ۡۧۧ, reason: contains not printable characters */
    public static final int f10509 = 1;

    /* JADX INFO: renamed from: ۥ۟ۡۧۨ, reason: contains not printable characters */
    public static final int f10510 = 2;

    /* JADX INFO: renamed from: ۥ۟ۡۨ, reason: contains not printable characters */
    public static final int f10511 = 6;

    /* JADX INFO: renamed from: ۥ۟ۡۨ۟, reason: contains not printable characters */
    public static final int f10512 = 7;

    /* JADX INFO: renamed from: ۥ۟ۡۨ۠, reason: contains not printable characters */
    public static final int f10513 = 8;

    /* JADX INFO: renamed from: ۥ۟ۡۨۡ, reason: contains not printable characters */
    public static final int f10514 = 32773;

    /* JADX INFO: renamed from: ۥ۟ۡۨۢ, reason: contains not printable characters */
    public static final int f10515 = 34892;

    /* JADX INFO: renamed from: ۥ۟ۡۨۦ, reason: contains not printable characters */
    public static final int f10519 = 0;

    /* JADX INFO: renamed from: ۥ۟ۡۨۧ, reason: contains not printable characters */
    public static final int f10520 = 1;

    /* JADX INFO: renamed from: ۥ۟ۡۨۨ, reason: contains not printable characters */
    public static final int f10521 = 2;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static final int f10522 = 6;

    /* JADX INFO: renamed from: ۥ۟ۢ۟, reason: contains not printable characters */
    public static final int f10523 = 0;

    /* JADX INFO: renamed from: ۥ۟ۢ۟۟, reason: contains not printable characters */
    public static final int f10524 = 1;

    /* JADX INFO: renamed from: ۥ۟ۢ۟۠, reason: contains not printable characters */
    public static final int f10525 = 0;

    /* JADX INFO: renamed from: ۥ۟ۢ۟ۡ, reason: contains not printable characters */
    public static final int f10526 = 1;

    /* JADX INFO: renamed from: ۥ۟ۢ۟ۢ, reason: contains not printable characters */
    public static final int f10527 = 5000;

    /* JADX INFO: renamed from: ۥ۟ۢ۟ۤ, reason: contains not printable characters */
    public static final String f10529 = "FUJIFILMCCD-RAW";

    /* JADX INFO: renamed from: ۥ۟ۢ۟ۥ, reason: contains not printable characters */
    public static final int f10530 = 84;

    /* JADX INFO: renamed from: ۥ۟ۢ۠, reason: contains not printable characters */
    public static final short f10534 = 20306;

    /* JADX INFO: renamed from: ۥ۟ۢ۠۟, reason: contains not printable characters */
    public static final short f10535 = 21330;

    /* JADX INFO: renamed from: ۥ۟ۢ۠ۢ, reason: contains not printable characters */
    public static final int f10538 = 8;

    /* JADX INFO: renamed from: ۥۣ۟ۢ۠, reason: contains not printable characters */
    public static final int f10539 = 12;

    /* JADX INFO: renamed from: ۥ۟ۢ۠ۤ, reason: contains not printable characters */
    public static final short f10540 = 85;

    /* JADX INFO: renamed from: ۥ۟ۢ۠ۥ, reason: contains not printable characters */
    public static final String f10541 = "PENTAX";

    /* JADX INFO: renamed from: ۥ۟ۢ۠ۦ, reason: contains not printable characters */
    public static final int f10542 = 6;

    /* JADX INFO: renamed from: ۥ۟ۢۡ۠, reason: contains not printable characters */
    public static final int f10547 = 4;

    /* JADX INFO: renamed from: ۥ۟ۢۡۡ, reason: contains not printable characters */
    public static final int f10548 = 4;

    /* JADX INFO: renamed from: ۥ۟ۢۡۤ, reason: contains not printable characters */
    public static final int f10551 = 4;

    /* JADX INFO: renamed from: ۥ۟ۢۡۧ, reason: contains not printable characters */
    public static final byte f10554 = 47;

    /* JADX INFO: renamed from: ۥ۟ۢۢۢ, reason: contains not printable characters */
    public static final int f10560 = 10;

    /* JADX INFO: renamed from: ۥۣ۟ۢۢ, reason: contains not printable characters */
    public static final int f10561 = 4;

    /* JADX INFO: renamed from: ۥ۟ۢۢۤ, reason: contains not printable characters */
    public static final int f10562 = 4;

    /* JADX INFO: renamed from: ۥ۟ۢۢۥ, reason: contains not printable characters */
    public static SimpleDateFormat f10563 = null;

    /* JADX INFO: renamed from: ۥ۟ۢۢۦ, reason: contains not printable characters */
    public static SimpleDateFormat f10564 = null;

    /* JADX INFO: renamed from: ۥ۟ۢۢۧ, reason: contains not printable characters */
    public static final short f10565 = 18761;

    /* JADX INFO: renamed from: ۥ۟ۢۢۨ, reason: contains not printable characters */
    public static final short f10566 = 19789;

    /* JADX INFO: renamed from: ۥۣ۟ۢ۟, reason: contains not printable characters */
    public static final int f10568 = 8;

    /* JADX INFO: renamed from: ۥۣ۟ۢ۠, reason: contains not printable characters */
    public static final int f10569 = 1;

    /* JADX INFO: renamed from: ۥۣ۟ۢۡ, reason: contains not printable characters */
    public static final int f10570 = 2;

    /* JADX INFO: renamed from: ۥۣ۟ۢۢ, reason: contains not printable characters */
    public static final int f10571 = 3;

    /* JADX INFO: renamed from: ۥۣۣ۟ۢ, reason: contains not printable characters */
    public static final int f10572 = 4;

    /* JADX INFO: renamed from: ۥۣ۟ۢۤ, reason: contains not printable characters */
    public static final int f10573 = 5;

    /* JADX INFO: renamed from: ۥۣ۟ۢۥ, reason: contains not printable characters */
    public static final int f10574 = 6;

    /* JADX INFO: renamed from: ۥۣ۟ۢۦ, reason: contains not printable characters */
    public static final int f10575 = 7;

    /* JADX INFO: renamed from: ۥۣ۟ۢۧ, reason: contains not printable characters */
    public static final int f10576 = 8;

    /* JADX INFO: renamed from: ۥۣ۟ۢۨ, reason: contains not printable characters */
    public static final int f10577 = 9;

    /* JADX INFO: renamed from: ۥ۟ۢۤ, reason: contains not printable characters */
    public static final int f10578 = 10;

    /* JADX INFO: renamed from: ۥ۟ۢۤ۟, reason: contains not printable characters */
    public static final int f10579 = 11;

    /* JADX INFO: renamed from: ۥ۟ۢۤ۠, reason: contains not printable characters */
    public static final int f10580 = 12;

    /* JADX INFO: renamed from: ۥ۟ۢۤۡ, reason: contains not printable characters */
    public static final int f10581 = 13;

    /* JADX INFO: renamed from: ۥ۟ۢۤۢ, reason: contains not printable characters */
    public static final int f10582 = 8192;

    /* JADX INFO: renamed from: ۥ۟ۢۤۦ, reason: contains not printable characters */
    public static final C4754[] f10586;

    /* JADX INFO: renamed from: ۥ۟ۢۤۧ, reason: contains not printable characters */
    public static final C4754[] f10587;

    /* JADX INFO: renamed from: ۥ۟ۢۤۨ, reason: contains not printable characters */
    public static final C4754[] f10588;

    /* JADX INFO: renamed from: ۥ۟ۢۥ, reason: contains not printable characters */
    public static final C4754[] f10589;

    /* JADX INFO: renamed from: ۥ۟ۢۥ۟, reason: contains not printable characters */
    public static final C4754[] f10590;

    /* JADX INFO: renamed from: ۥ۟ۢۥ۠, reason: contains not printable characters */
    public static final C4754 f10591;

    /* JADX INFO: renamed from: ۥ۟ۢۥۡ, reason: contains not printable characters */
    public static final C4754[] f10592;

    /* JADX INFO: renamed from: ۥ۟ۢۥۢ, reason: contains not printable characters */
    public static final C4754[] f10593;

    /* JADX INFO: renamed from: ۥ۟ۢۥۣ, reason: contains not printable characters */
    public static final C4754[] f10594;

    /* JADX INFO: renamed from: ۥ۟ۢۥۤ, reason: contains not printable characters */
    public static final C4754[] f10595;

    /* JADX INFO: renamed from: ۥ۟ۢۥۥ, reason: contains not printable characters */
    public static final int f10596 = 0;

    /* JADX INFO: renamed from: ۥ۟ۢۥۦ, reason: contains not printable characters */
    public static final int f10597 = 1;

    /* JADX INFO: renamed from: ۥ۟ۢۥۧ, reason: contains not printable characters */
    public static final int f10598 = 2;

    /* JADX INFO: renamed from: ۥ۟ۢۥۨ, reason: contains not printable characters */
    public static final int f10599 = 3;

    /* JADX INFO: renamed from: ۥ۟ۢۦ, reason: contains not printable characters */
    public static final int f10600 = 4;

    /* JADX INFO: renamed from: ۥ۟ۢۦ۟, reason: contains not printable characters */
    public static final int f10601 = 5;

    /* JADX INFO: renamed from: ۥ۟ۢۦ۠, reason: contains not printable characters */
    public static final int f10602 = 6;

    /* JADX INFO: renamed from: ۥ۟ۢۦۡ, reason: contains not printable characters */
    public static final int f10603 = 7;

    /* JADX INFO: renamed from: ۥ۟ۢۦۢ, reason: contains not printable characters */
    public static final int f10604 = 8;

    /* JADX INFO: renamed from: ۥ۟ۢۦۣ, reason: contains not printable characters */
    public static final int f10605 = 9;

    /* JADX INFO: renamed from: ۥ۟ۢۦۤ, reason: contains not printable characters */
    public static final C4754[][] f10606;

    /* JADX INFO: renamed from: ۥ۟ۢۦۥ, reason: contains not printable characters */
    public static final C4754[] f10607;

    /* JADX INFO: renamed from: ۥ۟ۢۦۦ, reason: contains not printable characters */
    public static final HashMap<Integer, C4754>[] f10608;

    /* JADX INFO: renamed from: ۥ۟ۢۦۧ, reason: contains not printable characters */
    public static final HashMap<String, C4754>[] f10609;

    /* JADX INFO: renamed from: ۥ۟ۢۦۨ, reason: contains not printable characters */
    public static final HashSet<String> f10610;

    /* JADX INFO: renamed from: ۥ۟ۢۧ, reason: contains not printable characters */
    public static final HashMap<Integer, Integer> f10611;

    /* JADX INFO: renamed from: ۥ۟ۢۧ۟, reason: contains not printable characters */
    public static final Charset f10612;

    /* JADX INFO: renamed from: ۥ۟ۢۧ۠, reason: contains not printable characters */
    public static final byte[] f10613;

    /* JADX INFO: renamed from: ۥ۟ۢۧۡ, reason: contains not printable characters */
    public static final byte[] f10614;

    /* JADX INFO: renamed from: ۥ۟ۢۧۢ, reason: contains not printable characters */
    public static final byte f10615 = -1;

    /* JADX INFO: renamed from: ۥ۟ۢۧۤ, reason: contains not printable characters */
    public static final byte f10617 = -64;

    /* JADX INFO: renamed from: ۥ۟ۢۧۥ, reason: contains not printable characters */
    public static final byte f10618 = -63;

    /* JADX INFO: renamed from: ۥ۟ۢۧۦ, reason: contains not printable characters */
    public static final byte f10619 = -62;

    /* JADX INFO: renamed from: ۥ۟ۢۧۧ, reason: contains not printable characters */
    public static final byte f10620 = -61;

    /* JADX INFO: renamed from: ۥ۟ۢۧۨ, reason: contains not printable characters */
    public static final byte f10621 = -59;

    /* JADX INFO: renamed from: ۥ۟ۢۨ, reason: contains not printable characters */
    public static final byte f10622 = -58;

    /* JADX INFO: renamed from: ۥ۟ۢۨ۟, reason: contains not printable characters */
    public static final byte f10623 = -57;

    /* JADX INFO: renamed from: ۥ۟ۢۨ۠, reason: contains not printable characters */
    public static final byte f10624 = -55;

    /* JADX INFO: renamed from: ۥ۟ۢۨۡ, reason: contains not printable characters */
    public static final byte f10625 = -54;

    /* JADX INFO: renamed from: ۥ۟ۢۨۢ, reason: contains not printable characters */
    public static final byte f10626 = -53;

    /* JADX INFO: renamed from: ۥۣ۟ۢۨ, reason: contains not printable characters */
    public static final byte f10627 = -51;

    /* JADX INFO: renamed from: ۥ۟ۢۨۤ, reason: contains not printable characters */
    public static final byte f10628 = -50;

    /* JADX INFO: renamed from: ۥ۟ۢۨۥ, reason: contains not printable characters */
    public static final byte f10629 = -49;

    /* JADX INFO: renamed from: ۥ۟ۢۨۦ, reason: contains not printable characters */
    public static final byte f10630 = -38;

    /* JADX INFO: renamed from: ۥ۟ۢۨۧ, reason: contains not printable characters */
    public static final byte f10631 = -31;

    /* JADX INFO: renamed from: ۥ۟ۢۨۨ, reason: contains not printable characters */
    public static final byte f10632 = -2;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static final byte f10633 = -39;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final int f10634 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f10635 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f10636 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f10637 = 3;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f10638 = 4;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final int f10639 = 5;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int f10640 = 6;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final int f10641 = 7;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final int f10642 = 8;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final int f10643 = 9;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final int f10644 = 10;

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static final int f10645 = 11;

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final int f10646 = 12;

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final int f10647 = 13;

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static final int f10648 = 14;

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static final Pattern f10649;

    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public static final Pattern f10650;

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static final Pattern f10651;

    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public static final Pattern f10652;

    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public static final int f10653 = 19;

    /* JADX INFO: renamed from: ۥ */
    public String f1094;

    /* JADX INFO: renamed from: ۥ۟ */
    public FileDescriptor f1095;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public AssetManager.AssetInputStream f10654;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f10655;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f10656;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final HashMap<String, C4752>[] f10657;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Set<Integer> f10658;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public ByteOrder f10659;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f10660;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean f10661;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f10662;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f10663;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f10664;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public byte[] f10665;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int f10666;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int f10667;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int f10668;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int f10669;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int f10670;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f10671;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f10672;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final String f10208 = "ExifInterface";

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final boolean f10209 = Log.isLoggable(f10208, 3);

    /* JADX INFO: renamed from: ۥ۟۠ۦۡ, reason: contains not printable characters */
    public static final List<Integer> f10381 = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: ۥ۟۠ۦۢ, reason: contains not printable characters */
    public static final List<Integer> f10382 = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: ۥۣ۟ۡۨ, reason: contains not printable characters */
    public static final int[] f10516 = {8, 8, 8};

    /* JADX INFO: renamed from: ۥ۟ۡۨۤ, reason: contains not printable characters */
    public static final int[] f10517 = {4};

    /* JADX INFO: renamed from: ۥ۟ۡۨۥ, reason: contains not printable characters */
    public static final int[] f10518 = {8};

    /* JADX INFO: renamed from: ۥۣ۟ۢۧ, reason: contains not printable characters */
    public static final byte f10616 = -40;

    /* JADX INFO: renamed from: ۥۣ۟ۢ۟, reason: contains not printable characters */
    public static final byte[] f10528 = {-1, f10616, -1};

    /* JADX INFO: renamed from: ۥ۟ۢ۟ۦ, reason: contains not printable characters */
    public static final byte[] f10531 = {102, 116, 121, 112};

    /* JADX INFO: renamed from: ۥ۟ۢ۟ۧ, reason: contains not printable characters */
    public static final byte[] f10532 = {109, 105, 102, 49};

    /* JADX INFO: renamed from: ۥ۟ۢ۟ۨ, reason: contains not printable characters */
    public static final byte[] f10533 = {104, 101, 105, 99};

    /* JADX INFO: renamed from: ۥ۟ۢ۠۠, reason: contains not printable characters */
    public static final byte[] f10536 = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: ۥ۟ۢ۠ۡ, reason: contains not printable characters */
    public static final byte[] f10537 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: ۥ۟ۢ۠ۧ, reason: contains not printable characters */
    public static final byte[] f10543 = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: ۥ۟ۢ۠ۨ, reason: contains not printable characters */
    public static final byte[] f10544 = {101, 88, 73, 102};

    /* JADX INFO: renamed from: ۥ۟ۢۡ, reason: contains not printable characters */
    public static final byte[] f10545 = {73, 72, 68, 82};

    /* JADX INFO: renamed from: ۥ۟ۢۡ۟, reason: contains not printable characters */
    public static final byte[] f10546 = {73, 69, 78, 68};

    /* JADX INFO: renamed from: ۥ۟ۢۡۢ, reason: contains not printable characters */
    public static final byte[] f10549 = {82, 73, 70, 70};

    /* JADX INFO: renamed from: ۥۣ۟ۢۡ, reason: contains not printable characters */
    public static final byte[] f10550 = {87, 69, 66, 80};

    /* JADX INFO: renamed from: ۥ۟ۢۡۥ, reason: contains not printable characters */
    public static final byte[] f10552 = {69, 88, 73, 70};

    /* JADX INFO: renamed from: ۥۣ۟ۢ, reason: contains not printable characters */
    public static final byte f10567 = 42;

    /* JADX INFO: renamed from: ۥ۟ۢۡۦ, reason: contains not printable characters */
    public static final byte[] f10553 = {-99, 1, f10567};

    /* JADX INFO: renamed from: ۥ۟ۢۡۨ, reason: contains not printable characters */
    public static final byte[] f10555 = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: ۥ۟ۢۢ, reason: contains not printable characters */
    public static final byte[] f10556 = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: ۥ۟ۢۢ۟, reason: contains not printable characters */
    public static final byte[] f10557 = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: ۥ۟ۢۢ۠, reason: contains not printable characters */
    public static final byte[] f10558 = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: ۥ۟ۢۢۡ, reason: contains not printable characters */
    public static final byte[] f10559 = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: ۥۣ۟ۢۤ, reason: contains not printable characters */
    public static final String[] f10583 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: ۥ۟ۢۤۤ, reason: contains not printable characters */
    public static final int[] f10584 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: ۥ۟ۢۤۥ, reason: contains not printable characters */
    public static final byte[] f10585 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۦ$ۥ */
    public class C0481 extends MediaDataSource {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public long f10673;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C4757 f10674;

        public C0481(C4757 c4757) {
            this.f10674 = c4757;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f10673;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f10674.available())) {
                        return -1;
                    }
                    this.f10674.m14419(j);
                    this.f10673 = j;
                }
                if (i2 > this.f10674.available()) {
                    i2 = this.f10674.available();
                }
                int i3 = this.f10674.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f10673 += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f10673 = -1L;
            return -1;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۦ$ۥ۟ */
    public static class C0482 extends InputStream implements DataInput {

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static final ByteOrder f10676 = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static final ByteOrder f10677 = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final DataInputStream f10678;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public ByteOrder f10679;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f10680;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public byte[] f10681;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0482(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f10678.available();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f10680++;
            return this.f10678.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f10680++;
            return this.f10678.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f10680++;
            int i = this.f10678.read();
            if (i >= 0) {
                return (byte) i;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f10680 += 2;
            return this.f10678.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f10680 += i2;
            this.f10678.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f10680 += 4;
            int i = this.f10678.read();
            int i2 = this.f10678.read();
            int i3 = this.f10678.read();
            int i4 = this.f10678.read();
            if ((i | i2 | i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f10679;
            if (byteOrder == f10676) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == f10677) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            throw new IOException("Invalid byte order: " + this.f10679);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d(C4750.f10208, "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f10680 += 8;
            int i = this.f10678.read();
            int i2 = this.f10678.read();
            int i3 = this.f10678.read();
            int i4 = this.f10678.read();
            int i5 = this.f10678.read();
            int i6 = this.f10678.read();
            int i7 = this.f10678.read();
            int i8 = this.f10678.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f10679;
            if (byteOrder == f10676) {
                return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
            }
            if (byteOrder == f10677) {
                return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
            }
            throw new IOException("Invalid byte order: " + this.f10679);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f10680 += 2;
            int i = this.f10678.read();
            int i2 = this.f10678.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f10679;
            if (byteOrder == f10676) {
                return (short) ((i2 << 8) + i);
            }
            if (byteOrder == f10677) {
                return (short) ((i << 8) + i2);
            }
            throw new IOException("Invalid byte order: " + this.f10679);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f10680 += 2;
            return this.f10678.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f10680++;
            return this.f10678.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f10680 += 2;
            int i = this.f10678.read();
            int i2 = this.f10678.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f10679;
            if (byteOrder == f10676) {
                return (i2 << 8) + i;
            }
            if (byteOrder == f10677) {
                return (i << 8) + i2;
            }
            throw new IOException("Invalid byte order: " + this.f10679);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m1669() {
            return this.f10680;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public long m14394() throws IOException {
            return ((long) readInt()) & C8578.f25466;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m14395(ByteOrder byteOrder) {
            this.f10679 = byteOrder;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m14396(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int iSkip = (int) this.f10678.skip(i3);
                if (iSkip <= 0) {
                    if (this.f10681 == null) {
                        this.f10681 = new byte[8192];
                    }
                    iSkip = this.f10678.read(this.f10681, 0, Math.min(8192, i3));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += iSkip;
            }
            this.f10680 += i2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0482(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public C0482(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f10679 = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f10678 = dataInputStream;
            dataInputStream.mark(0);
            this.f10680 = 0;
            this.f10679 = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f10678.read(bArr, i, i2);
            this.f10680 += i3;
            return i3;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f10680 += bArr.length;
            this.f10678.readFully(bArr);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۦ$ۥ۟۟, reason: contains not printable characters */
    public static class C4751 extends FilterOutputStream {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final OutputStream f10682;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public ByteOrder f10683;

        public C4751(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f10682 = outputStream;
            this.f10683 = byteOrder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f10682.write(bArr);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m1670(ByteOrder byteOrder) {
            this.f10683 = byteOrder;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m14397(int i) throws IOException {
            this.f10682.write(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m14398(int i) throws IOException {
            ByteOrder byteOrder = this.f10683;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f10682.write(i & 255);
                this.f10682.write((i >>> 8) & 255);
                this.f10682.write((i >>> 16) & 255);
                this.f10682.write((i >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f10682.write((i >>> 24) & 255);
                this.f10682.write((i >>> 16) & 255);
                this.f10682.write((i >>> 8) & 255);
                this.f10682.write(i & 255);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m14399(short s) throws IOException {
            ByteOrder byteOrder = this.f10683;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f10682.write(s & 255);
                this.f10682.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f10682.write((s >>> 8) & 255);
                this.f10682.write(s & 255);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m14400(long j) throws IOException {
            m14398((int) j);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m14401(int i) throws IOException {
            m14399((short) i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f10682.write(bArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۦ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C4752 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final long f10684 = -1;

        /* JADX INFO: renamed from: ۥ */
        public final int f1096;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f1097;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final long f10685;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final byte[] f10686;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C4752(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        /* JADX INFO: renamed from: ۥ */
        public static C4752 m1671(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new C4752(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(C4750.f10612);
            return new C4752(1, bytes.length, bytes);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static C4752 m1672(double d, ByteOrder byteOrder) {
            return m14402(new double[]{d}, byteOrder);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static C4752 m14402(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C4750.f10584[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d : dArr) {
                byteBufferWrap.putDouble(d);
            }
            return new C4752(12, dArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static C4752 m14403(int i, ByteOrder byteOrder) {
            return m14404(new int[]{i}, byteOrder);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static C4752 m14404(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C4750.f10584[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putInt(i);
            }
            return new C4752(9, iArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static C4752 m14405(C4756 c4756, ByteOrder byteOrder) {
            return m14406(new C4756[]{c4756}, byteOrder);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static C4752 m14406(C4756[] c4756Arr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C4750.f10584[10] * c4756Arr.length]);
            byteBufferWrap.order(byteOrder);
            for (C4756 c4756 : c4756Arr) {
                byteBufferWrap.putInt((int) c4756.f1100);
                byteBufferWrap.putInt((int) c4756.f1101);
            }
            return new C4752(10, c4756Arr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static C4752 m14407(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C4750.f10612);
            return new C4752(2, bytes.length, bytes);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static C4752 m14408(long j, ByteOrder byteOrder) {
            return m14409(new long[]{j}, byteOrder);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static C4752 m14409(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C4750.f10584[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j : jArr) {
                byteBufferWrap.putInt((int) j);
            }
            return new C4752(4, jArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static C4752 m14410(C4756 c4756, ByteOrder byteOrder) {
            return m14411(new C4756[]{c4756}, byteOrder);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static C4752 m14411(C4756[] c4756Arr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C4750.f10584[5] * c4756Arr.length]);
            byteBufferWrap.order(byteOrder);
            for (C4756 c4756 : c4756Arr) {
                byteBufferWrap.putInt((int) c4756.f1100);
                byteBufferWrap.putInt((int) c4756.f1101);
            }
            return new C4752(5, c4756Arr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static C4752 m14412(int i, ByteOrder byteOrder) {
            return m14413(new int[]{i}, byteOrder);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static C4752 m14413(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C4750.f10584[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putShort((short) i);
            }
            return new C4752(3, iArr.length, byteBufferWrap.array());
        }

        public String toString() {
            return "(" + C4750.f10583[this.f1096] + ", data length:" + this.f10686.length + ")";
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public double m14414(ByteOrder byteOrder) throws Throwable {
            Object objM14417 = m14417(byteOrder);
            if (objM14417 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objM14417 instanceof String) {
                return Double.parseDouble((String) objM14417);
            }
            if (objM14417 instanceof long[]) {
                if (((long[]) objM14417).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM14417 instanceof int[]) {
                if (((int[]) objM14417).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM14417 instanceof double[]) {
                double[] dArr = (double[]) objM14417;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM14417 instanceof C4756[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            C4756[] c4756Arr = (C4756[]) objM14417;
            if (c4756Arr.length == 1) {
                return c4756Arr[0].m1674();
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public int m14415(ByteOrder byteOrder) throws Throwable {
            Object objM14417 = m14417(byteOrder);
            if (objM14417 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objM14417 instanceof String) {
                return Integer.parseInt((String) objM14417);
            }
            if (objM14417 instanceof long[]) {
                long[] jArr = (long[]) objM14417;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM14417 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objM14417;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public String m14416(ByteOrder byteOrder) throws Throwable {
            Object objM14417 = m14417(byteOrder);
            if (objM14417 == null) {
                return null;
            }
            if (objM14417 instanceof String) {
                return (String) objM14417;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objM14417 instanceof long[]) {
                long[] jArr = (long[]) objM14417;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM14417 instanceof int[]) {
                int[] iArr = (int[]) objM14417;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM14417 instanceof double[]) {
                double[] dArr = (double[]) objM14417;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objM14417 instanceof C4756[])) {
                return null;
            }
            C4756[] c4756Arr = (C4756[]) objM14417;
            while (i < c4756Arr.length) {
                sb.append(c4756Arr[i].f1100);
                sb.append('/');
                sb.append(c4756Arr[i].f1101);
                i++;
                if (i != c4756Arr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:17:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:162:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object m14417(ByteOrder byteOrder) throws Throwable {
            C0482 c0482;
            InputStream inputStream;
            byte b;
            byte b2;
            int length = 0;
            InputStream inputStream2 = null;
            try {
                try {
                    c0482 = new C0482(this.f10686);
                    try {
                        c0482.m14395(byteOrder);
                        switch (this.f1096) {
                            case 1:
                            case 6:
                                byte[] bArr = this.f10686;
                                if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                    String str = new String(bArr, C4750.f10612);
                                    try {
                                        c0482.close();
                                        break;
                                    } catch (IOException e) {
                                        Log.e(C4750.f10208, "IOException occurred while closing InputStream", e);
                                    }
                                    return str;
                                }
                                String str2 = new String(new char[]{(char) (b + 48)});
                                try {
                                    c0482.close();
                                    break;
                                } catch (IOException e2) {
                                    Log.e(C4750.f10208, "IOException occurred while closing InputStream", e2);
                                }
                                return str2;
                            case 2:
                            case 7:
                                if (this.f1097 >= C4750.f10585.length) {
                                    int i = 0;
                                    while (true) {
                                        byte[] bArr2 = C4750.f10585;
                                        if (i >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (this.f10686[i] == bArr2[i]) {
                                            i++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (length < this.f1097 && (b2 = this.f10686[length]) != 0) {
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                String string = sb.toString();
                                try {
                                    c0482.close();
                                    break;
                                } catch (IOException e3) {
                                    Log.e(C4750.f10208, "IOException occurred while closing InputStream", e3);
                                }
                                return string;
                            case 3:
                                int[] iArr = new int[this.f1097];
                                while (length < this.f1097) {
                                    iArr[length] = c0482.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    c0482.close();
                                    break;
                                } catch (IOException e4) {
                                    Log.e(C4750.f10208, "IOException occurred while closing InputStream", e4);
                                }
                                return iArr;
                            case 4:
                                long[] jArr = new long[this.f1097];
                                while (length < this.f1097) {
                                    jArr[length] = c0482.m14394();
                                    length++;
                                }
                                try {
                                    c0482.close();
                                    break;
                                } catch (IOException e5) {
                                    Log.e(C4750.f10208, "IOException occurred while closing InputStream", e5);
                                }
                                return jArr;
                            case 5:
                                C4756[] c4756Arr = new C4756[this.f1097];
                                while (length < this.f1097) {
                                    c4756Arr[length] = new C4756(c0482.m14394(), c0482.m14394());
                                    length++;
                                }
                                try {
                                    c0482.close();
                                    break;
                                } catch (IOException e6) {
                                    Log.e(C4750.f10208, "IOException occurred while closing InputStream", e6);
                                }
                                return c4756Arr;
                            case 8:
                                int[] iArr2 = new int[this.f1097];
                                while (length < this.f1097) {
                                    iArr2[length] = c0482.readShort();
                                    length++;
                                }
                                try {
                                    c0482.close();
                                    break;
                                } catch (IOException e7) {
                                    Log.e(C4750.f10208, "IOException occurred while closing InputStream", e7);
                                }
                                return iArr2;
                            case 9:
                                int[] iArr3 = new int[this.f1097];
                                while (length < this.f1097) {
                                    iArr3[length] = c0482.readInt();
                                    length++;
                                }
                                try {
                                    c0482.close();
                                    break;
                                } catch (IOException e8) {
                                    Log.e(C4750.f10208, "IOException occurred while closing InputStream", e8);
                                }
                                return iArr3;
                            case 10:
                                C4756[] c4756Arr2 = new C4756[this.f1097];
                                while (length < this.f1097) {
                                    c4756Arr2[length] = new C4756(c0482.readInt(), c0482.readInt());
                                    length++;
                                }
                                try {
                                    c0482.close();
                                    break;
                                } catch (IOException e9) {
                                    Log.e(C4750.f10208, "IOException occurred while closing InputStream", e9);
                                }
                                return c4756Arr2;
                            case 11:
                                double[] dArr = new double[this.f1097];
                                while (length < this.f1097) {
                                    dArr[length] = c0482.readFloat();
                                    length++;
                                }
                                try {
                                    c0482.close();
                                    break;
                                } catch (IOException e10) {
                                    Log.e(C4750.f10208, "IOException occurred while closing InputStream", e10);
                                }
                                return dArr;
                            case 12:
                                double[] dArr2 = new double[this.f1097];
                                while (length < this.f1097) {
                                    dArr2[length] = c0482.readDouble();
                                    length++;
                                }
                                try {
                                    c0482.close();
                                    break;
                                } catch (IOException e11) {
                                    Log.e(C4750.f10208, "IOException occurred while closing InputStream", e11);
                                }
                                return dArr2;
                            default:
                                try {
                                    c0482.close();
                                    break;
                                } catch (IOException e12) {
                                    Log.e(C4750.f10208, "IOException occurred while closing InputStream", e12);
                                }
                                return null;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        Log.w(C4750.f10208, "IOException occurred during reading a value", e);
                        if (c0482 != null) {
                            try {
                                c0482.close();
                            } catch (IOException e14) {
                                Log.e(C4750.f10208, "IOException occurred while closing InputStream", e14);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e15) {
                            Log.e(C4750.f10208, "IOException occurred while closing InputStream", e15);
                        }
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                c0482 = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                }
                throw th;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public int m14418() {
            return C4750.f10584[this.f1096] * this.f1097;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C4752(int i, int i2, long j, byte[] bArr) {
            this.f1096 = i;
            this.f1097 = i2;
            this.f10685 = j;
            this.f10686 = bArr;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۦ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC4753 {
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۦ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC4755 {
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۦ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C4756 {

        /* JADX INFO: renamed from: ۥ */
        public final long f1100;

        /* JADX INFO: renamed from: ۥ۟ */
        public final long f1101;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C4756(double d) {
            this((long) (d * 10000.0d), 10000L);
        }

        public String toString() {
            return this.f1100 + "/" + this.f1101;
        }

        /* JADX INFO: renamed from: ۥ */
        public double m1674() {
            return this.f1100 / this.f1101;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C4756(long j, long j2) {
            if (j2 == 0) {
                this.f1100 = 0L;
                this.f1101 = 1L;
            } else {
                this.f1100 = j;
                this.f1101 = j2;
            }
        }
    }

    static {
        C4754[] c4754Arr = {new C4754(f10363, Opcodes.CONST_METHOD_HANDLE, 4), new C4754(f10364, 255, 4), new C4754(f10210, 256, 3, 4), new C4754(f10211, 257, 3, 4), new C4754(f10212, 258, 3), new C4754(f10213, 259, 3), new C4754(f10214, 262, 3), new C4754(f10234, 270, 2), new C4754(f10235, 271, 2), new C4754(f10236, 272, 2), new C4754(f10223, 273, 3, 4), new C4754(f10215, 274, 3), new C4754(f10216, 277, 3), new C4754(f10224, 278, 3, 4), new C4754(f10225, 279, 3, 4), new C4754(f10220, 282, 5), new C4754(f10221, 283, 5), new C4754(f10217, 284, 3), new C4754(f10222, 296, 3), new C4754(f10228, 301, 3), new C4754(f10237, 305, 2), new C4754(f10233, 306, 2), new C4754(f10238, AbstractViewOnTouchListenerC3498.f5822, 2), new C4754(f10229, 318, 5), new C4754(f10230, 319, 5), new C4754(f10368, 330, 4), new C4754(f10226, C5445.f13377, 4), new C4754(f10227, 514, 4), new C4754(f10231, 529, 5), new C4754(f10218, 530, 3), new C4754(f10219, 531, 3), new C4754(f10232, 532, 5), new C4754(f10239, 33432, 2), new C4754(f10365, 34665, 4), new C4754(f10366, 34853, 4), new C4754(f10359, 4, 4), new C4754(f10357, 5, 4), new C4754(f10356, 6, 4), new C4754(f10358, 7, 4), new C4754(f10360, 23, 3), new C4754(f10361, 46, 7), new C4754(f10362, 700, 1)};
        f10586 = c4754Arr;
        C4754[] c4754Arr2 = {new C4754(f10259, 33434, 5), new C4754(f10260, 33437, 5), new C4754(f10261, 34850, 3), new C4754(f10262, 34852, 2), new C4754(f10264, 34855, 3), new C4754(f10265, 34856, 7), new C4754(f10266, 34864, 3), new C4754(f10267, 34865, 4), new C4754(f10268, 34866, 4), new C4754(f10269, 34867, 4), new C4754(f10270, 34868, 4), new C4754(f10271, 34869, 4), new C4754(f10240, 36864, 2), new C4754(f10251, 36867, 2), new C4754(f10252, 36868, 2), new C4754(f10253, ModifierContributor.ForParameter.MASK, 2), new C4754(f10254, 36881, 2), new C4754(f10255, 36882, 2), new C4754(f10246, 37121, 7), new C4754(f10247, 37122, 5), new C4754(f10272, 37377, 10), new C4754(f10273, 37378, 5), new C4754(f10274, 37379, 10), new C4754(f10275, 37380, 10), new C4754(f10276, 37381, 5), new C4754(f10277, 37382, 5), new C4754(f10278, 37383, 3), new C4754(f10279, 37384, 3), new C4754(f10280, 37385, 3), new C4754(f10282, 37386, 5), new C4754(f10281, 37396, 3), new C4754(f10248, 37500, 7), new C4754(f10249, 37510, 7), new C4754(f10256, 37520, 2), new C4754(f10257, 37521, 2), new C4754(f10258, 37522, 2), new C4754(f10241, 40960, 7), new C4754(f10242, 40961, 3), new C4754(f10244, 40962, 3, 4), new C4754(f10245, 40963, 3, 4), new C4754(f10250, 40964, 2), new C4754(f10367, 40965, 4), new C4754(f10283, 41483, 5), new C4754(f10284, 41484, 7), new C4754(f10285, 41486, 5), new C4754(f10286, 41487, 5), new C4754(f10287, 41488, 3), new C4754(f10288, 41492, 3), new C4754(f10289, 41493, 5), new C4754(f10290, 41495, 3), new C4754(f10291, 41728, 7), new C4754(f10292, 41729, 7), new C4754(f10293, 41730, 7), new C4754(f10294, 41985, 3), new C4754(f10295, 41986, 3), new C4754(f10296, 41987, 3), new C4754(f10297, 41988, 5), new C4754(f10298, 41989, 3), new C4754(f10299, 41990, 3), new C4754(f10300, 41991, 3), new C4754(f10301, 41992, 3), new C4754(f10302, 41993, 3), new C4754(f10303, 41994, 3), new C4754(f10304, 41995, 7), new C4754(f10305, 41996, 3), new C4754(f10306, 42016, 2), new C4754("CameraOwnerName", 42032, 2), new C4754(f10309, 42033, 2), new C4754(f10310, 42034, 5), new C4754(f10311, 42035, 2), new C4754(f10312, 42036, 2), new C4754(f10243, 42240, 5), new C4754(f10350, 50706, 1), new C4754(f10351, 50720, 3, 4)};
        f10587 = c4754Arr2;
        C4754[] c4754Arr3 = {new C4754(f10314, 0, 1), new C4754(f10315, 1, 2), new C4754(f10316, 2, 5, 10), new C4754(f10317, 3, 2), new C4754(f10318, 4, 5, 10), new C4754(f10319, 5, 1), new C4754(f10320, 6, 5), new C4754(f10321, 7, 5), new C4754(f10322, 8, 2), new C4754(f10323, 9, 2), new C4754(f10324, 10, 2), new C4754(f10325, 11, 5), new C4754(f10326, 12, 2), new C4754(f10327, 13, 5), new C4754(f10328, 14, 2), new C4754(f10329, 15, 5), new C4754(f10330, 16, 2), new C4754(f10331, 17, 5), new C4754(f10332, 18, 2), new C4754(f10333, 19, 2), new C4754(f10334, 20, 5), new C4754(f10335, 21, 2), new C4754(f10336, 22, 5), new C4754(f10337, 23, 2), new C4754(f10338, 24, 5), new C4754(f10339, 25, 2), new C4754(f10340, 26, 5), new C4754(f10341, 27, 7), new C4754(f10342, 28, 7), new C4754(f10343, 29, 2), new C4754(f10344, 30, 3), new C4754(f10345, 31, 5)};
        f10588 = c4754Arr3;
        C4754[] c4754Arr4 = {new C4754(f10346, 1, 2)};
        f10589 = c4754Arr4;
        C4754[] c4754Arr5 = {new C4754(f10363, Opcodes.CONST_METHOD_HANDLE, 4), new C4754(f10364, 255, 4), new C4754(f10348, 256, 3, 4), new C4754(f10347, 257, 3, 4), new C4754(f10212, 258, 3), new C4754(f10213, 259, 3), new C4754(f10214, 262, 3), new C4754(f10234, 270, 2), new C4754(f10235, 271, 2), new C4754(f10236, 272, 2), new C4754(f10223, 273, 3, 4), new C4754(f10349, 274, 3), new C4754(f10216, 277, 3), new C4754(f10224, 278, 3, 4), new C4754(f10225, 279, 3, 4), new C4754(f10220, 282, 5), new C4754(f10221, 283, 5), new C4754(f10217, 284, 3), new C4754(f10222, 296, 3), new C4754(f10228, 301, 3), new C4754(f10237, 305, 2), new C4754(f10233, 306, 2), new C4754(f10238, AbstractViewOnTouchListenerC3498.f5822, 2), new C4754(f10229, 318, 5), new C4754(f10230, 319, 5), new C4754(f10368, 330, 4), new C4754(f10226, C5445.f13377, 4), new C4754(f10227, 514, 4), new C4754(f10231, 529, 5), new C4754(f10218, 530, 3), new C4754(f10219, 531, 3), new C4754(f10232, 532, 5), new C4754(f10239, 33432, 2), new C4754(f10365, 34665, 4), new C4754(f10366, 34853, 4), new C4754(f10350, 50706, 1), new C4754(f10351, 50720, 3, 4)};
        f10590 = c4754Arr5;
        f10591 = new C4754(f10223, 273, 3);
        C4754[] c4754Arr6 = {new C4754(f10352, 256, 7), new C4754(f10369, 8224, 4), new C4754(f10370, 8256, 4)};
        f10592 = c4754Arr6;
        C4754[] c4754Arr7 = {new C4754(f10353, 257, 4), new C4754(f10354, 258, 4)};
        f10593 = c4754Arr7;
        C4754[] c4754Arr8 = {new C4754(f10355, 4371, 3)};
        f10594 = c4754Arr8;
        C4754[] c4754Arr9 = {new C4754(f10242, 55, 3)};
        f10595 = c4754Arr9;
        C4754[][] c4754Arr10 = {c4754Arr, c4754Arr2, c4754Arr3, c4754Arr4, c4754Arr5, c4754Arr, c4754Arr6, c4754Arr7, c4754Arr8, c4754Arr9};
        f10606 = c4754Arr10;
        f10607 = new C4754[]{new C4754(f10368, 330, 4), new C4754(f10365, 34665, 4), new C4754(f10366, 34853, 4), new C4754(f10367, 40965, 4), new C4754(f10369, 8224, 1), new C4754(f10370, 8256, 1)};
        f10608 = new HashMap[c4754Arr10.length];
        f10609 = new HashMap[c4754Arr10.length];
        f10610 = new HashSet<>(Arrays.asList(f10260, f10297, f10259, f10277, f10321));
        f10611 = new HashMap<>();
        Charset charsetForName = Charset.forName(C3510.f5906);
        f10612 = charsetForName;
        f10613 = "Exif\u0000\u0000".getBytes(charsetForName);
        f10614 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f10563 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f10564 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C4754[][] c4754Arr11 = f10606;
            if (i >= c4754Arr11.length) {
                HashMap<Integer, Integer> map = f10611;
                C4754[] c4754Arr12 = f10607;
                map.put(Integer.valueOf(c4754Arr12[0].f1098), 5);
                map.put(Integer.valueOf(c4754Arr12[1].f1098), 1);
                map.put(Integer.valueOf(c4754Arr12[2].f1098), 2);
                map.put(Integer.valueOf(c4754Arr12[3].f1098), 3);
                map.put(Integer.valueOf(c4754Arr12[4].f1098), 7);
                map.put(Integer.valueOf(c4754Arr12[5].f1098), 8);
                f10649 = Pattern.compile(".*[1-9].*");
                f10650 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f10651 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f10652 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f10608[i] = new HashMap<>();
            f10609[i] = new HashMap<>();
            for (C4754 c4754 : c4754Arr11[i]) {
                f10608[i].put(Integer.valueOf(c4754.f1098), c4754);
                f10609[i].put(c4754.f1099, c4754);
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4750(@InterfaceC6391 File file) throws Throwable {
        C4754[][] c4754Arr = f10606;
        this.f10657 = new HashMap[c4754Arr.length];
        this.f10658 = new HashSet(c4754Arr.length);
        this.f10659 = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        m14358(file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static double m14313(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d3 = d + (d2 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals(f10490) && !str2.equals(f10492)) {
                if (!str2.equals("N") && !str2.equals(f10491)) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static Pair<Integer, Integer> m14314(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairM14314 = m14314(strArrSplit[0]);
            if (((Integer) pairM14314.first).intValue() == 2) {
                return pairM14314;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair<Integer, Integer> pairM143142 = m14314(strArrSplit[i]);
                int iIntValue = (((Integer) pairM143142.first).equals(pairM14314.first) || ((Integer) pairM143142.second).equals(pairM14314.first)) ? ((Integer) pairM14314.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairM14314.second).intValue() == -1 || !(((Integer) pairM143142.first).equals(pairM14314.second) || ((Integer) pairM143142.second).equals(pairM14314.second))) ? -1 : ((Integer) pairM14314.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairM14314 = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairM14314 = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairM14314;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    return (j < 0 || j > C8417.f25173) ? j < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static boolean m14315(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f10613;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f10613;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static boolean m14316(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f10528;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static boolean m14317(FileDescriptor fileDescriptor) {
        try {
            C4758.C0483.m14426(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f10209) {
                return false;
            }
            Log.d(f10208, "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static boolean m14318(int i) {
        return i == 4 || i == 13 || i == 14;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static boolean m14319(@InterfaceC6391 String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "image/x-fuji-raf":
            case "image/x-samsung-srw":
            case "image/x-sony-arw":
            case "image/heic":
            case "image/heif":
            case "image/jpeg":
            case "image/webp":
            case "image/x-adobe-dng":
            case "image/x-panasonic-rw2":
            case "image/png":
            case "image/x-pentax-pef":
            case "image/x-olympus-orf":
            case "image/x-nikon-nef":
            case "image/x-nikon-nrw":
            case "image/x-canon-cr2":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static Long m14320(@InterfaceC6490 String str, @InterfaceC6490 String str2, @InterfaceC6490 String str3) {
        if (str != null && f10649.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = f10563.parse(str, parsePosition);
                if (date == null && (date = f10564.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    int i = 1;
                    String strSubstring = str3.substring(0, 1);
                    int i2 = Integer.parseInt(str3.substring(1, 3));
                    int i3 = Integer.parseInt(str3.substring(4, 6));
                    if ((InterfaceC5949.f14893.equals(strSubstring) || "-".equals(strSubstring)) && ":".equals(str3.substring(3, 4)) && i2 <= 14) {
                        int i4 = ((i2 * 60) + i3) * 60000;
                        if (!"-".equals(strSubstring)) {
                            i = -1;
                        }
                        time += (long) (i4 * i);
                    }
                }
                if (str2 != null) {
                    time += C4758.m14424(str2);
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static boolean m14321(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m1667() {
        String strM14327 = m14327(f10251);
        if (strM14327 != null && m14327(f10233) == null) {
            this.f10657[0].put(f10233, C4752.m14407(strM14327));
        }
        if (m14327(f10210) == null) {
            this.f10657[0].put(f10210, C4752.m14408(0L, this.f10659));
        }
        if (m14327(f10211) == null) {
            this.f10657[0].put(f10211, C4752.m14408(0L, this.f10659));
        }
        if (m14327(f10215) == null) {
            this.f10657[0].put(f10215, C4752.m14408(0L, this.f10659));
        }
        if (m14327(f10279) == null) {
            this.f10657[1].put(f10279, C4752.m14408(0L, this.f10659));
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final String m1668(double d) {
        long j = (long) d;
        double d2 = d - j;
        long j2 = (long) (d2 * 60.0d);
        return j + "/1," + j2 + "/1," + Math.round((d2 - (j2 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m14322(C0482 c0482, C4751 c4751, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (c0482.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f10612;
                sb.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            m14323(c0482, c4751, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m14323(C0482 c0482, C4751 c4751, byte[] bArr) throws IOException {
        int i = c0482.readInt();
        c4751.write(bArr);
        c4751.m14398(i);
        if (i % 2 == 1) {
            i++;
        }
        C4758.m14423(c0482, c4751, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m14324() {
        int i = 1;
        switch (m14330(f10215, 1)) {
            case 1:
                i = 2;
                break;
            case 2:
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        m14385(f10215, Integer.toString(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m14325() {
        int i = 1;
        switch (m14330(f10215, 1)) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 0;
                break;
        }
        m14385(f10215, Integer.toString(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public double m14326(double d) {
        double dM14329 = m14329(f10320, -1.0d);
        int iM14330 = m14330(f10319, -1);
        if (dM14329 < 0.0d || iM14330 < 0) {
            return d;
        }
        return dM14329 * ((double) (iM14330 != 1 ? 1 : -1));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public String m14327(@InterfaceC6391 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C4752 c4752M14335 = m14335(str);
        if (c4752M14335 != null) {
            if (!f10610.contains(str)) {
                return c4752M14335.m14416(this.f10659);
            }
            if (str.equals(f10321)) {
                int i = c4752M14335.f1096;
                if (i != 5 && i != 10) {
                    Log.w(f10208, "GPS Timestamp format is not rational. format=" + c4752M14335.f1096);
                    return null;
                }
                C4756[] c4756Arr = (C4756[]) c4752M14335.m14417(this.f10659);
                if (c4756Arr == null || c4756Arr.length != 3) {
                    Log.w(f10208, "Invalid GPS Timestamp array. array=" + Arrays.toString(c4756Arr));
                    return null;
                }
                C4756 c4756 = c4756Arr[0];
                Integer numValueOf = Integer.valueOf((int) (c4756.f1100 / c4756.f1101));
                C4756 c47562 = c4756Arr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c47562.f1100 / c47562.f1101));
                C4756 c47563 = c4756Arr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c47563.f1100 / c47563.f1101)));
            }
            try {
                return Double.toString(c4752M14335.m14414(this.f10659));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public byte[] m14328(@InterfaceC6391 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C4752 c4752M14335 = m14335(str);
        if (c4752M14335 != null) {
            return c4752M14335.f10686;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public double m14329(@InterfaceC6391 String str, double d) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C4752 c4752M14335 = m14335(str);
        if (c4752M14335 == null) {
            return d;
        }
        try {
            return c4752M14335.m14414(this.f10659);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m14330(@InterfaceC6391 String str, int i) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C4752 c4752M14335 = m14335(str);
        if (c4752M14335 == null) {
            return i;
        }
        try {
            return c4752M14335.m14415(this.f10659);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public long[] m14331(@InterfaceC6391 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (this.f10671) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        C4752 c4752M14335 = m14335(str);
        if (c4752M14335 != null) {
            return new long[]{c4752M14335.f10685, c4752M14335.f10686.length};
        }
        return null;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public Long m14332() {
        return m14320(m14327(f10233), m14327(f10256), m14327(f10253));
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public Long m14333() {
        return m14320(m14327(f10252), m14327(f10258), m14327(f10255));
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public Long m14334() {
        return m14320(m14327(f10251), m14327(f10257), m14327(f10254));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final C4752 m14335(@InterfaceC6391 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (f10263.equals(str)) {
            if (f10209) {
                Log.d(f10208, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = f10264;
        }
        for (int i = 0; i < f10606.length; i++) {
            C4752 c4752 = this.f10657[i].get(str);
            if (c4752 != null) {
                return c4752;
            }
        }
        return null;
    }

    @InterfaceC6490
    @SuppressLint({"AutoBoxing"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public Long m14336() {
        String strM14327 = m14327(f10343);
        String strM143272 = m14327(f10321);
        if (strM14327 != null && strM143272 != null) {
            Pattern pattern = f10649;
            if (pattern.matcher(strM14327).matches() || pattern.matcher(strM143272).matches()) {
                String str = strM14327 + ' ' + strM143272;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date date = f10563.parse(str, parsePosition);
                    if (date == null && (date = f10564.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(date.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m14337(C4757 c4757) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                C4758.C0484.m1679(mediaMetadataRetriever, new C0481(c4757));
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
                if (strExtractMetadata != null) {
                    this.f10657[0].put(f10210, C4752.m14412(Integer.parseInt(strExtractMetadata), this.f10659));
                }
                if (strExtractMetadata2 != null) {
                    this.f10657[0].put(f10211, C4752.m14412(Integer.parseInt(strExtractMetadata2), this.f10659));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    this.f10657[0].put(f10215, C4752.m14412(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f10659));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c4757.m14419(i2);
                    byte[] bArr = new byte[6];
                    if (c4757.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, f10613)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (c4757.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.f10667 = i4;
                    m14373(bArr2, 0);
                }
                if (f10209) {
                    Log.d(f10208, "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017b A[LOOP:0: B:10:0x0037->B:63:0x017b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0182 A[SYNTHETIC] */
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
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14338(Yue.C4750.C0482 r22, int r23, int r24) throws java.lang.Throwable {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            boolean r3 = Yue.C4750.f10209
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getJpegAttributes starting with: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
        L20:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.m14395(r3)
            byte r3 = r22.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r3 != r6) goto L1cf
            byte r7 = r22.readByte()
            r8 = -40
            if (r7 != r8) goto L1b4
            r3 = 2
        L37:
            byte r5 = r22.readByte()
            if (r5 != r6) goto L197
            byte r5 = r22.readByte()
            boolean r7 = Yue.C4750.f10209
            if (r7 == 0) goto L5f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Found JPEG segment indicator: "
            r8.append(r9)
            r9 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r4, r8)
        L5f:
            r8 = -39
            if (r5 == r8) goto L191
            r8 = -38
            if (r5 != r8) goto L69
            goto L191
        L69:
            int r8 = r22.readUnsignedShort()
            int r9 = r8 + (-2)
            r10 = 4
            int r3 = r3 + r10
            if (r7 == 0) goto L9a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "JPEG segment: "
            r7.append(r11)
            r11 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r7.append(r11)
            java.lang.String r11 = " (length: "
            r7.append(r11)
            r7.append(r8)
            java.lang.String r11 = ")"
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r4, r7)
        L9a:
            java.lang.String r7 = "Invalid length"
            if (r9 < 0) goto L18a
            r11 = -31
            r12 = 1
            r13 = 0
            if (r5 == r11) goto L11d
            r11 = -2
            if (r5 == r11) goto Lef
            switch(r5) {
                case -64: goto Lb7;
                case -63: goto Lb7;
                case -62: goto Lb7;
                case -61: goto Lb7;
                default: goto Laa;
            }
        Laa:
            switch(r5) {
                case -59: goto Lb7;
                case -58: goto Lb7;
                case -57: goto Lb7;
                default: goto Lad;
            }
        Lad:
            switch(r5) {
                case -55: goto Lb7;
                case -54: goto Lb7;
                case -53: goto Lb7;
                default: goto Lb0;
            }
        Lb0:
            switch(r5) {
                case -51: goto Lb7;
                case -50: goto Lb7;
                case -49: goto Lb7;
                default: goto Lb3;
            }
        Lb3:
            r20 = r7
            goto L179
        Lb7:
            r1.m14396(r12)
            java.util.HashMap<java.lang.String, Yue.ۥۣ۠ۡۦ$ۥ۟۟۟>[] r5 = r0.f10657
            r5 = r5[r2]
            if (r2 == r10) goto Lc3
            java.lang.String r9 = "ImageLength"
            goto Lc5
        Lc3:
            java.lang.String r9 = "ThumbnailImageLength"
        Lc5:
            int r11 = r22.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.f10659
            Yue.ۥۣ۠ۡۦ$ۥ۟۟۟ r11 = Yue.C4750.C4752.m14408(r11, r13)
            r5.put(r9, r11)
            java.util.HashMap<java.lang.String, Yue.ۥۣ۠ۡۦ$ۥ۟۟۟>[] r5 = r0.f10657
            r5 = r5[r2]
            if (r2 == r10) goto Ldc
            java.lang.String r9 = "ImageWidth"
            goto Lde
        Ldc:
            java.lang.String r9 = "ThumbnailImageWidth"
        Lde:
            int r10 = r22.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f10659
            Yue.ۥۣ۠ۡۦ$ۥ۟۟۟ r10 = Yue.C4750.C4752.m14408(r10, r12)
            r5.put(r9, r10)
            int r9 = r8 + (-7)
            goto Lb3
        Lef:
            byte[] r5 = new byte[r9]
            int r8 = r1.read(r5)
            if (r8 != r9) goto L115
            java.lang.String r8 = "UserComment"
            java.lang.String r9 = r0.m14327(r8)
            if (r9 != 0) goto L111
            java.util.HashMap<java.lang.String, Yue.ۥۣ۠ۡۦ$ۥ۟۟۟>[] r9 = r0.f10657
            r9 = r9[r12]
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r11 = Yue.C4750.f10612
            r10.<init>(r5, r11)
            Yue.ۥۣ۠ۡۦ$ۥ۟۟۟ r5 = Yue.C4750.C4752.m14407(r10)
            r9.put(r8, r5)
        L111:
            r20 = r7
        L113:
            r9 = r13
            goto L179
        L115:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L11d:
            byte[] r5 = new byte[r9]
            r1.readFully(r5)
            int r8 = r3 + r9
            byte[] r10 = Yue.C4750.f10613
            boolean r11 = Yue.C4758.m14425(r5, r10)
            if (r11 == 0) goto L145
            int r11 = r10.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r11, r9)
            int r3 = r23 + r3
            int r9 = r10.length
            int r3 = r3 + r9
            r0.f10667 = r3
            r0.m14373(r5, r2)
            Yue.ۥۣ۠ۡۦ$ۥ۟ r3 = new Yue.ۥۣ۠ۡۦ$ۥ۟
            r3.<init>(r5)
            r0.m14389(r3)
        L142:
            r20 = r7
            goto L177
        L145:
            byte[] r10 = Yue.C4750.f10614
            boolean r11 = Yue.C4758.m14425(r5, r10)
            if (r11 == 0) goto L142
            int r11 = r10.length
            int r3 = r3 + r11
            int r10 = r10.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r10, r9)
            java.lang.String r9 = "Xmp"
            java.lang.String r10 = r0.m14327(r9)
            if (r10 != 0) goto L142
            java.util.HashMap<java.lang.String, Yue.ۥۣ۠ۡۦ$ۥ۟۟۟>[] r10 = r0.f10657
            r10 = r10[r13]
            Yue.ۥۣ۠ۡۦ$ۥ۟۟۟ r11 = new Yue.ۥۣ۠ۡۦ$ۥ۟۟۟
            int r15 = r5.length
            r20 = r7
            long r6 = (long) r3
            r3 = 1
            r14 = r11
            r16 = r15
            r15 = r3
            r17 = r6
            r19 = r5
            r14.<init>(r15, r16, r17, r19)
            r10.put(r9, r11)
            r0.f10672 = r12
        L177:
            r3 = r8
            goto L113
        L179:
            if (r9 < 0) goto L182
            r1.m14396(r9)
            int r3 = r3 + r9
            r6 = -1
            goto L37
        L182:
            java.io.IOException r1 = new java.io.IOException
            r2 = r20
            r1.<init>(r2)
            throw r1
        L18a:
            r2 = r7
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r2)
            throw r1
        L191:
            java.nio.ByteOrder r2 = r0.f10659
            r1.m14395(r2)
            return
        L197:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1b4:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1cf:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Yue.C4750.m14338(Yue.ۥۣ۠ۡۦ$ۥ۟, int, int):void");
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m14339(float[] fArr) {
        double[] dArrM14340 = m14340();
        if (dArrM14340 == null) {
            return false;
        }
        fArr[0] = (float) dArrM14340[0];
        fArr[1] = (float) dArrM14340[1];
        return true;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public double[] m14340() {
        String strM14327 = m14327(f10316);
        String strM143272 = m14327(f10315);
        String strM143273 = m14327(f10318);
        String strM143274 = m14327(f10317);
        if (strM14327 == null || strM143272 == null || strM143273 == null || strM143274 == null) {
            return null;
        }
        try {
            return new double[]{m14313(strM14327, strM143272), m14313(strM143273, strM143274)};
        } catch (IllegalArgumentException unused) {
            Log.w(f10208, "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strM14327, strM143272, strM143273, strM143274));
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int m14341(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m14316(bArr)) {
            return 4;
        }
        if (m14363(bArr)) {
            return 9;
        }
        if (m14360(bArr)) {
            return 12;
        }
        if (m14361(bArr)) {
            return 7;
        }
        if (m14364(bArr)) {
            return 10;
        }
        if (m14362(bArr)) {
            return 13;
        }
        return m14368(bArr) ? 14 : 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m14342(C4757 c4757) throws Throwable {
        int i;
        int i2;
        m14345(c4757);
        C4752 c4752 = this.f10657[1].get(f10248);
        if (c4752 != null) {
            C4757 c47572 = new C4757(c4752.f10686);
            c47572.m14395(this.f10659);
            byte[] bArr = f10536;
            byte[] bArr2 = new byte[bArr.length];
            c47572.readFully(bArr2);
            c47572.m14419(0L);
            byte[] bArr3 = f10537;
            byte[] bArr4 = new byte[bArr3.length];
            c47572.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c47572.m14419(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c47572.m14419(12L);
            }
            m14374(c47572, 6);
            C4752 c47522 = this.f10657[7].get(f10353);
            C4752 c47523 = this.f10657[7].get(f10354);
            if (c47522 != null && c47523 != null) {
                this.f10657[5].put(f10226, c47522);
                this.f10657[5].put(f10227, c47523);
            }
            C4752 c47524 = this.f10657[8].get(f10355);
            if (c47524 != null) {
                int[] iArr = (int[]) c47524.m14417(this.f10659);
                if (iArr == null || iArr.length != 4) {
                    Log.w(f10208, "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
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
                C4752 c4752M14412 = C4752.m14412(i5, this.f10659);
                C4752 c4752M144122 = C4752.m14412(i6, this.f10659);
                this.f10657[0].put(f10210, c4752M14412);
                this.f10657[0].put(f10211, c4752M144122);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m14343(C0482 c0482) throws Throwable {
        if (f10209) {
            Log.d(f10208, "getPngAttributes starting with: " + c0482);
        }
        c0482.m14395(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f10543;
        c0482.m14396(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c0482.readInt();
                byte[] bArr2 = new byte[4];
                if (c0482.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f10545)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f10546)) {
                    return;
                }
                if (Arrays.equals(bArr2, f10544)) {
                    byte[] bArr3 = new byte[i];
                    if (c0482.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C4758.m1675(bArr2));
                    }
                    int i3 = c0482.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f10667 = i2;
                        m14373(bArr3, 0);
                        m14392();
                        m14389(new C0482(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c0482.m14396(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m14344(C0482 c0482) throws Throwable {
        boolean z = f10209;
        if (z) {
            Log.d(f10208, "getRafAttributes starting with: " + c0482);
        }
        c0482.m14396(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0482.read(bArr);
        c0482.read(bArr2);
        c0482.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c0482.m14396(i - c0482.m1669());
        c0482.read(bArr4);
        m14338(new C0482(bArr4), i, 5);
        c0482.m14396(i3 - c0482.m1669());
        c0482.m14395(ByteOrder.BIG_ENDIAN);
        int i4 = c0482.readInt();
        if (z) {
            Log.d(f10208, "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c0482.readUnsignedShort();
            int unsignedShort2 = c0482.readUnsignedShort();
            if (unsignedShort == f10591.f1098) {
                short s = c0482.readShort();
                short s2 = c0482.readShort();
                C4752 c4752M14412 = C4752.m14412(s, this.f10659);
                C4752 c4752M144122 = C4752.m14412(s2, this.f10659);
                this.f10657[0].put(f10211, c4752M14412);
                this.f10657[0].put(f10210, c4752M144122);
                if (f10209) {
                    Log.d(f10208, "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            c0482.m14396(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m14345(C4757 c4757) throws Throwable {
        C4752 c4752;
        m14370(c4757);
        m14374(c4757, 0);
        m14391(c4757, 0);
        m14391(c4757, 5);
        m14391(c4757, 4);
        m14392();
        if (this.f10655 != 8 || (c4752 = this.f10657[1].get(f10248)) == null) {
            return;
        }
        C4757 c47572 = new C4757(c4752.f10686);
        c47572.m14395(this.f10659);
        c47572.m14396(6);
        m14374(c47572, 9);
        C4752 c47522 = this.f10657[9].get(f10242);
        if (c47522 != null) {
            this.f10657[1].put(f10242, c47522);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int m14346() {
        switch (m14330(f10215, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m14347(C4757 c4757) throws Throwable {
        if (f10209) {
            Log.d(f10208, "getRw2Attributes starting with: " + c4757);
        }
        m14345(c4757);
        C4752 c4752 = this.f10657[0].get(f10361);
        if (c4752 != null) {
            m14338(new C0482(c4752.f10686), (int) c4752.f10685, 5);
        }
        C4752 c47522 = this.f10657[0].get(f10360);
        C4752 c47523 = this.f10657[1].get(f10264);
        if (c47522 == null || c47523 != null) {
            return;
        }
        this.f10657[1].put(f10264, c47522);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m14348(C4757 c4757) throws IOException {
        byte[] bArr = f10613;
        c4757.m14396(bArr.length);
        byte[] bArr2 = new byte[c4757.available()];
        c4757.readFully(bArr2);
        this.f10667 = bArr.length;
        m14373(bArr2, 0);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public byte[] m14349() {
        int i = this.f10666;
        if (i == 6 || i == 7) {
            return m14351();
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public Bitmap m14350() throws Throwable {
        if (!this.f10660) {
            return null;
        }
        if (this.f10665 == null) {
            this.f10665 = m14351();
        }
        int i = this.f10666;
        if (i == 6 || i == 7) {
            return BitmapFactory.decodeByteArray(this.f10665, 0, this.f10664);
        }
        if (i == 1) {
            int length = this.f10665.length / 3;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                byte[] bArr = this.f10665;
                int i3 = i2 * 3;
                iArr[i2] = (bArr[i3] << BaseType.Union) + (bArr[i3 + 1] << 8) + bArr[i3 + 2];
            }
            C4752 c4752 = this.f10657[4].get(f10347);
            C4752 c47522 = this.f10657[4].get(f10348);
            if (c4752 != null && c47522 != null) {
                return Bitmap.createBitmap(iArr, c47522.m14415(this.f10659), c4752.m14415(this.f10659), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x0086 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x0088 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m14351() throws Throwable {
        FileDescriptor fileDescriptor;
        Exception e;
        FileDescriptor fileDescriptor2;
        ?? fileInputStream;
        ?? r2 = 0;
        r2 = 0;
        if (!this.f10660) {
            return null;
        }
        ?? fileInputStream2 = this.f10665;
        try {
            if (fileInputStream2 != 0) {
                return fileInputStream2;
            }
            try {
                fileInputStream2 = this.f10654;
                if (fileInputStream2 != 0) {
                    try {
                        if (!fileInputStream2.markSupported()) {
                            Log.d(f10208, "Cannot read thumbnail from inputstream without mark/reset support");
                            C4758.m14420(fileInputStream2);
                            return null;
                        }
                        fileInputStream2.reset();
                        fileInputStream = fileInputStream2;
                        fileDescriptor2 = null;
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        fileDescriptor2 = null;
                        Log.d(f10208, "Encountered exception while getting thumbnail", e);
                        C4758.m14420(fileInputStream2);
                        if (fileDescriptor2 != null) {
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileDescriptor = null;
                        r2 = fileInputStream2;
                        C4758.m14420(r2);
                        if (fileDescriptor != null) {
                        }
                        throw th;
                    }
                } else if (this.f1094 != null) {
                    fileInputStream = new FileInputStream(this.f1094);
                    fileDescriptor2 = null;
                    fileInputStream2 = fileInputStream;
                } else {
                    FileDescriptor fileDescriptorM1678 = C4758.C0483.m1678(this.f1095);
                    try {
                        C4758.C0483.m14426(fileDescriptorM1678, 0L, OsConstants.SEEK_SET);
                        fileDescriptor2 = fileDescriptorM1678;
                        fileInputStream2 = new FileInputStream(fileDescriptorM1678);
                    } catch (Exception e3) {
                        e = e3;
                        fileDescriptor2 = fileDescriptorM1678;
                        fileInputStream2 = 0;
                        Log.d(f10208, "Encountered exception while getting thumbnail", e);
                        C4758.m14420(fileInputStream2);
                        if (fileDescriptor2 != null) {
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileDescriptor = fileDescriptorM1678;
                        C4758.m14420(r2);
                        if (fileDescriptor != null) {
                            C4758.m1676(fileDescriptor);
                        }
                        throw th;
                    }
                }
                try {
                    if (fileInputStream2.skip(this.f10663 + this.f10667) != this.f10663 + this.f10667) {
                        throw new IOException("Corrupted image");
                    }
                    byte[] bArr = new byte[this.f10664];
                    if (fileInputStream2.read(bArr) != this.f10664) {
                        throw new IOException("Corrupted image");
                    }
                    this.f10665 = bArr;
                    C4758.m14420(fileInputStream2);
                    if (fileDescriptor2 != null) {
                        C4758.m1676(fileDescriptor2);
                    }
                    return bArr;
                } catch (Exception e4) {
                    e = e4;
                    Log.d(f10208, "Encountered exception while getting thumbnail", e);
                    C4758.m14420(fileInputStream2);
                    if (fileDescriptor2 != null) {
                        C4758.m1676(fileDescriptor2);
                    }
                    return null;
                }
            } catch (Exception e5) {
                fileInputStream2 = 0;
                e = e5;
                fileDescriptor2 = null;
            } catch (Throwable th3) {
                th = th3;
                fileDescriptor = null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public long[] m14352() {
        if (this.f10671) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.f10660) {
            return null;
        }
        if (!this.f10661 || this.f10662) {
            return new long[]{this.f10663 + this.f10667, this.f10664};
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m14353(C0482 c0482) throws Throwable {
        if (f10209) {
            Log.d(f10208, "getWebpAttributes starting with: " + c0482);
        }
        c0482.m14395(ByteOrder.LITTLE_ENDIAN);
        c0482.m14396(f10549.length);
        int i = c0482.readInt() + 8;
        byte[] bArr = f10550;
        c0482.m14396(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c0482.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c0482.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f10552, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c0482.read(bArr3) == i2) {
                        this.f10667 = i3;
                        m14373(bArr3, 0);
                        m14389(new C0482(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C4758.m1675(bArr2));
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
                c0482.m14396(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final void m14354(C0482 c0482, HashMap map) throws Throwable {
        C4752 c4752 = (C4752) map.get(f10226);
        C4752 c47522 = (C4752) map.get(f10227);
        if (c4752 == null || c47522 == null) {
            return;
        }
        int iM14415 = c4752.m14415(this.f10659);
        int iM144152 = c47522.m14415(this.f10659);
        if (this.f10655 == 7) {
            iM14415 += this.f10668;
        }
        if (iM14415 > 0 && iM144152 > 0) {
            this.f10660 = true;
            if (this.f1094 == null && this.f10654 == null && this.f1095 == null) {
                byte[] bArr = new byte[iM144152];
                c0482.skip(iM14415);
                c0482.read(bArr);
                this.f10665 = bArr;
            }
            this.f10663 = iM14415;
            this.f10664 = iM144152;
        }
        if (f10209) {
            Log.d(f10208, "Setting thumbnail attributes with offset: " + iM14415 + ", length: " + iM144152);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final void m14355(C0482 c0482, HashMap map) throws IOException {
        C4752 c4752 = (C4752) map.get(f10223);
        C4752 c47522 = (C4752) map.get(f10225);
        if (c4752 == null || c47522 == null) {
            return;
        }
        long[] jArrM14421 = C4758.m14421(c4752.m14417(this.f10659));
        long[] jArrM144212 = C4758.m14421(c47522.m14417(this.f10659));
        if (jArrM14421 == null || jArrM14421.length == 0) {
            Log.w(f10208, "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrM144212 == null || jArrM144212.length == 0) {
            Log.w(f10208, "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrM14421.length != jArrM144212.length) {
            Log.w(f10208, "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j = 0;
        for (long j2 : jArrM144212) {
            j += j2;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        this.f10662 = true;
        this.f10661 = true;
        this.f10660 = true;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jArrM14421.length; i4++) {
            int i5 = (int) jArrM14421[i4];
            int i6 = (int) jArrM144212[i4];
            if (i4 < jArrM14421.length - 1 && i5 + i6 != jArrM14421[i4 + 1]) {
                this.f10662 = false;
            }
            int i7 = i5 - i2;
            if (i7 < 0) {
                Log.d(f10208, "Invalid strip offset value");
                return;
            }
            long j3 = i7;
            if (c0482.skip(j3) != j3) {
                Log.d(f10208, "Failed to skip " + i7 + " bytes.");
                return;
            }
            int i8 = i2 + i7;
            byte[] bArr2 = new byte[i6];
            if (c0482.read(bArr2) != i6) {
                Log.d(f10208, "Failed to read " + i6 + " bytes.");
                return;
            }
            i2 = i8 + i6;
            System.arraycopy(bArr2, 0, bArr, i3, i6);
            i3 += i6;
        }
        this.f10665 = bArr;
        if (this.f10662) {
            this.f10663 = (int) jArrM14421[0];
            this.f10664 = i;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public boolean m14356(@InterfaceC6391 String str) {
        return m14335(str) != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public boolean m14357() {
        return this.f10660;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final void m14358(String str) throws Throwable {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f10654 = null;
        this.f1094 = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (m14317(fileInputStream.getFD())) {
                this.f1095 = fileInputStream.getFD();
            } else {
                this.f1095 = null;
            }
            m14369(fileInputStream);
            C4758.m14420(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            C4758.m14420(fileInputStream2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public boolean m14359() {
        int iM14330 = m14330(f10215, 1);
        return iM14330 == 2 || iM14330 == 7 || iM14330 == 4 || iM14330 == 5;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final boolean m14360(byte[] bArr) throws Throwable {
        C0482 c0482;
        long j;
        C0482 c04822 = null;
        try {
            try {
                c0482 = new C0482(bArr);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            long length = c0482.readInt();
            byte[] bArr2 = new byte[4];
            c0482.read(bArr2);
            if (!Arrays.equals(bArr2, f10531)) {
                c0482.close();
                return false;
            }
            if (length == 1) {
                length = c0482.readLong();
                j = 16;
                if (length < 16) {
                    c0482.close();
                    return false;
                }
            } else {
                j = 8;
            }
            if (length > bArr.length) {
                length = bArr.length;
            }
            long j2 = length - j;
            if (j2 < 8) {
                c0482.close();
                return false;
            }
            byte[] bArr3 = new byte[4];
            boolean z = false;
            boolean z2 = false;
            for (long j3 = 0; j3 < j2 / 4; j3++) {
                if (c0482.read(bArr3) != 4) {
                    c0482.close();
                    return false;
                }
                if (j3 != 1) {
                    if (Arrays.equals(bArr3, f10532)) {
                        z = true;
                    } else if (Arrays.equals(bArr3, f10533)) {
                        z2 = true;
                    }
                    if (z && z2) {
                        c0482.close();
                        return true;
                    }
                }
            }
            c0482.close();
        } catch (Exception e2) {
            e = e2;
            c04822 = c0482;
            if (f10209) {
                Log.d(f10208, "Exception parsing HEIF file type box.", e);
            }
            if (c04822 != null) {
                c04822.close();
            }
        } catch (Throwable th2) {
            th = th2;
            c04822 = c0482;
            if (c04822 != null) {
                c04822.close();
            }
            throw th;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final boolean m14361(byte[] bArr) throws Throwable {
        C0482 c0482 = null;
        try {
            C0482 c04822 = new C0482(bArr);
            try {
                ByteOrder byteOrderM14372 = m14372(c04822);
                this.f10659 = byteOrderM14372;
                c04822.m14395(byteOrderM14372);
                short s = c04822.readShort();
                boolean z = s == 20306 || s == 21330;
                c04822.close();
                return z;
            } catch (Exception unused) {
                c0482 = c04822;
                if (c0482 != null) {
                    c0482.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                c0482 = c04822;
                if (c0482 != null) {
                    c0482.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final boolean m14362(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f10543;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final boolean m14363(byte[] bArr) throws IOException {
        byte[] bytes = f10529.getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m14364(byte[] bArr) throws Throwable {
        C0482 c0482 = null;
        try {
            C0482 c04822 = new C0482(bArr);
            try {
                ByteOrder byteOrderM14372 = m14372(c04822);
                this.f10659 = byteOrderM14372;
                c04822.m14395(byteOrderM14372);
                boolean z = c04822.readShort() == 85;
                c04822.close();
                return z;
            } catch (Exception unused) {
                c0482 = c04822;
                if (c0482 != null) {
                    c0482.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                c0482 = c04822;
                if (c0482 != null) {
                    c0482.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final boolean m14365(HashMap map) throws IOException {
        C4752 c4752;
        int iM14415;
        C4752 c47522 = (C4752) map.get(f10212);
        if (c47522 != null) {
            int[] iArr = (int[]) c47522.m14417(this.f10659);
            int[] iArr2 = f10516;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f10655 == 3 && (c4752 = (C4752) map.get(f10214)) != null && (((iM14415 = c4752.m14415(this.f10659)) == 1 && Arrays.equals(iArr, f10518)) || (iM14415 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f10209) {
            return false;
        }
        Log.d(f10208, "Unsupported data type value");
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final boolean m14366(HashMap map) throws IOException {
        C4752 c4752 = (C4752) map.get(f10211);
        C4752 c47522 = (C4752) map.get(f10210);
        if (c4752 == null || c47522 == null) {
            return false;
        }
        return c4752.m14415(this.f10659) <= 512 && c47522.m14415(this.f10659) <= 512;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public boolean m14367() {
        if (!this.f10660) {
            return false;
        }
        int i = this.f10666;
        return i == 6 || i == 7;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public final boolean m14368(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f10549;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f10550;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f10549.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:47:0x009b, B:49:0x009f), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14369(@InterfaceC6391 InputStream inputStream) {
        boolean z;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i = 0; i < f10606.length; i++) {
            try {
                try {
                    this.f10657[i] = new HashMap<>();
                } catch (Throwable th) {
                    m1667();
                    if (f10209) {
                        m14371();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                z = f10209;
                if (z) {
                    Log.w(f10208, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m1667();
                if (!z) {
                    return;
                }
            } catch (UnsupportedOperationException e2) {
                e = e2;
                z = f10209;
                if (z) {
                }
                m1667();
                if (!z) {
                }
            }
        }
        if (!this.f10656) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f10655 = m14341(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (m14321(this.f10655)) {
            C4757 c4757 = new C4757(inputStream);
            if (this.f10656) {
                m14348(c4757);
            } else {
                int i2 = this.f10655;
                if (i2 == 12) {
                    m14337(c4757);
                } else if (i2 == 7) {
                    m14342(c4757);
                } else if (i2 == 10) {
                    m14347(c4757);
                } else {
                    m14345(c4757);
                }
            }
            c4757.m14419(this.f10667);
            m14389(c4757);
        } else {
            C0482 c0482 = new C0482(inputStream);
            int i3 = this.f10655;
            if (i3 == 4) {
                m14338(c0482, 0, 0);
            } else if (i3 == 13) {
                m14343(c0482);
            } else if (i3 == 9) {
                m14344(c0482);
            } else if (i3 == 14) {
                m14353(c0482);
            }
        }
        m1667();
        if (!f10209) {
            return;
        }
        m14371();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final void m14370(C0482 c0482) throws IOException {
        ByteOrder byteOrderM14372 = m14372(c0482);
        this.f10659 = byteOrderM14372;
        c0482.m14395(byteOrderM14372);
        int unsignedShort = c0482.readUnsignedShort();
        int i = this.f10655;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = c0482.readInt();
        if (i2 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i2);
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c0482.m14396(i3);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public final void m14371() {
        for (int i = 0; i < this.f10657.length; i++) {
            Log.d(f10208, "The size of tag group[" + i + "]: " + this.f10657[i].size());
            for (Map.Entry<String, C4752> entry : this.f10657[i].entrySet()) {
                C4752 value = entry.getValue();
                Log.d(f10208, "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.m14416(this.f10659) + "'");
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public final ByteOrder m14372(C0482 c0482) throws IOException {
        short s = c0482.readShort();
        if (s == 18761) {
            if (f10209) {
                Log.d(f10208, "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            if (f10209) {
                Log.d(f10208, "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public final void m14373(byte[] bArr, int i) throws IOException {
        C4757 c4757 = new C4757(bArr);
        m14370(c4757);
        m14374(c4757, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026e  */
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14374(C4757 c4757, int i) throws IOException {
        short s;
        short s2;
        C4754 c4754;
        long j;
        boolean z;
        long j2;
        int i2;
        C4754 c47542;
        int unsignedShort;
        long jM14394;
        int i3 = i;
        this.f10658.add(Integer.valueOf(c4757.f10680));
        short s3 = c4757.readShort();
        if (f10209) {
            Log.d(f10208, "numberOfDirectoryEntry: " + ((int) s3));
        }
        if (s3 <= 0) {
            return;
        }
        short s4 = 0;
        while (s4 < s3) {
            int unsignedShort2 = c4757.readUnsignedShort();
            int unsignedShort3 = c4757.readUnsignedShort();
            int i4 = c4757.readInt();
            long jM1669 = ((long) c4757.m1669()) + 4;
            C4754 c47543 = f10608[i3].get(Integer.valueOf(unsignedShort2));
            boolean z2 = f10209;
            if (z2) {
                s = s3;
                s2 = s4;
                Log.d(f10208, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c47543 != null ? c47543.f1099 : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i4)));
            } else {
                s = s3;
                s2 = s4;
            }
            if (c47543 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f10584;
                    if (unsignedShort3 < iArr.length) {
                        if (c47543.m1673(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = c47543.f10687;
                            }
                            c4754 = c47543;
                            j = ((long) iArr[unsignedShort3]) * ((long) i4);
                            if (j < 0 || j > 2147483647L) {
                                if (z2) {
                                    Log.d(f10208, "Skip the tag entry since the number of components is invalid: " + i4);
                                }
                                z = false;
                                if (z) {
                                    c4757.m14419(jM1669);
                                } else {
                                    if (j > 4) {
                                        int i5 = c4757.readInt();
                                        if (z2) {
                                            Log.d(f10208, "seek to data offset: " + i5);
                                        }
                                        if (this.f10655 == 7) {
                                            c47542 = c4754;
                                            j2 = jM1669;
                                            if (f10248.equals(c47542.f1099)) {
                                                this.f10668 = i5;
                                            } else if (i3 == 6 && f10352.equals(c47542.f1099)) {
                                                this.f10669 = i5;
                                                this.f10670 = i4;
                                                C4752 c4752M14412 = C4752.m14412(6, this.f10659);
                                                C4752 c4752M14408 = C4752.m14408(this.f10669, this.f10659);
                                                i2 = i4;
                                                C4752 c4752M144082 = C4752.m14408(this.f10670, this.f10659);
                                                this.f10657[4].put(f10213, c4752M14412);
                                                this.f10657[4].put(f10226, c4752M14408);
                                                this.f10657[4].put(f10227, c4752M144082);
                                            }
                                            i2 = i4;
                                        } else {
                                            j2 = jM1669;
                                            i2 = i4;
                                            c47542 = c4754;
                                        }
                                        c4757.m14419(i5);
                                    } else {
                                        j2 = jM1669;
                                        i2 = i4;
                                        c47542 = c4754;
                                    }
                                    Integer num = f10611.get(Integer.valueOf(unsignedShort2));
                                    if (z2) {
                                        Log.d(f10208, "nextIfdType: " + num + " byteCount: " + j);
                                    }
                                    if (num != null) {
                                        if (unsignedShort3 != 3) {
                                            if (unsignedShort3 == 4) {
                                                jM14394 = c4757.m14394();
                                            } else if (unsignedShort3 == 8) {
                                                unsignedShort = c4757.readShort();
                                            } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                                                unsignedShort = c4757.readInt();
                                            } else {
                                                jM14394 = -1;
                                            }
                                            if (z2) {
                                                Log.d(f10208, String.format("Offset: %d, tagName: %s", Long.valueOf(jM14394), c47542.f1099));
                                            }
                                            if (jM14394 <= 0) {
                                                if (!this.f10658.contains(Integer.valueOf((int) jM14394))) {
                                                    c4757.m14419(jM14394);
                                                    m14374(c4757, num.intValue());
                                                } else if (z2) {
                                                    Log.d(f10208, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jM14394 + ")");
                                                }
                                            } else if (z2) {
                                                Log.d(f10208, "Skip jump into the IFD since its offset is invalid: " + jM14394);
                                            }
                                            c4757.m14419(j2);
                                        } else {
                                            unsignedShort = c4757.readUnsignedShort();
                                        }
                                        jM14394 = unsignedShort;
                                        if (z2) {
                                        }
                                        if (jM14394 <= 0) {
                                        }
                                        c4757.m14419(j2);
                                    } else {
                                        long j3 = j2;
                                        int iM1669 = c4757.m1669() + this.f10667;
                                        byte[] bArr = new byte[(int) j];
                                        c4757.readFully(bArr);
                                        C4752 c4752 = new C4752(unsignedShort3, i2, iM1669, bArr);
                                        this.f10657[i].put(c47542.f1099, c4752);
                                        if (f10350.equals(c47542.f1099)) {
                                            this.f10655 = 3;
                                        }
                                        if (((f10235.equals(c47542.f1099) || f10236.equals(c47542.f1099)) && c4752.m14416(this.f10659).contains(f10541)) || (f10213.equals(c47542.f1099) && c4752.m14415(this.f10659) == 65535)) {
                                            this.f10655 = 8;
                                        }
                                        if (c4757.m1669() != j3) {
                                            c4757.m14419(j3);
                                        }
                                    }
                                }
                                s4 = (short) (s2 + 1);
                                i3 = i;
                                s3 = s;
                            } else {
                                z = true;
                                if (z) {
                                }
                                s4 = (short) (s2 + 1);
                                i3 = i;
                                s3 = s;
                            }
                        } else if (z2) {
                            Log.d(f10208, "Skip the tag entry since data format (" + f10583[unsignedShort3] + ") is unexpected for tag: " + c47543.f1099);
                        }
                    }
                }
                c4754 = c47543;
                if (z2) {
                    Log.d(f10208, "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j = 0;
                z = false;
                if (z) {
                }
                s4 = (short) (s2 + 1);
                i3 = i;
                s3 = s;
            } else if (z2) {
                Log.d(f10208, "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            c4754 = c47543;
            j = 0;
            z = false;
            if (z) {
            }
            s4 = (short) (s2 + 1);
            i3 = i;
            s3 = s;
        }
        int i6 = c4757.readInt();
        boolean z3 = f10209;
        if (z3) {
            Log.d(f10208, String.format("nextIfdOffset: %d", Integer.valueOf(i6)));
        }
        long j4 = i6;
        if (j4 <= 0) {
            if (z3) {
                Log.d(f10208, "Stop reading file since a wrong offset may cause an infinite loop: " + i6);
                return;
            }
            return;
        }
        if (this.f10658.contains(Integer.valueOf(i6))) {
            if (z3) {
                Log.d(f10208, "Stop reading file since re-reading an IFD may cause an infinite loop: " + i6);
                return;
            }
            return;
        }
        c4757.m14419(j4);
        if (this.f10657[4].isEmpty()) {
            m14374(c4757, 4);
        } else if (this.f10657[5].isEmpty()) {
            m14374(c4757, 5);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final void m14375(String str) {
        for (int i = 0; i < f10606.length; i++) {
            this.f10657[i].remove(str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final void m14376(int i, String str, String str2) {
        if (this.f10657[i].isEmpty() || this.f10657[i].get(str) == null) {
            return;
        }
        HashMap<String, C4752> map = this.f10657[i];
        map.put(str2, map.get(str));
        this.f10657[i].remove(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public void m14377() {
        m14385(f10215, Integer.toString(1));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public final void m14378(C4757 c4757, int i) throws Throwable {
        C4752 c4752 = this.f10657[i].get(f10211);
        C4752 c47522 = this.f10657[i].get(f10210);
        if (c4752 == null || c47522 == null) {
            C4752 c47523 = this.f10657[i].get(f10226);
            C4752 c47524 = this.f10657[i].get(f10227);
            if (c47523 == null || c47524 == null) {
                return;
            }
            int iM14415 = c47523.m14415(this.f10659);
            int iM144152 = c47523.m14415(this.f10659);
            c4757.m14419(iM14415);
            byte[] bArr = new byte[iM144152];
            c4757.read(bArr);
            m14338(new C0482(bArr), iM14415, i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public void m14379(int i) {
        if (i % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int iM14330 = m14330(f10215, 1);
        List<Integer> list = f10381;
        if (list.contains(Integer.valueOf(iM14330))) {
            int iIndexOf = (list.indexOf(Integer.valueOf(iM14330)) + (i / 90)) % 4;
            iIntValue = list.get(iIndexOf + (iIndexOf < 0 ? 4 : 0)).intValue();
        } else {
            List<Integer> list2 = f10382;
            if (list2.contains(Integer.valueOf(iM14330))) {
                int iIndexOf2 = (list2.indexOf(Integer.valueOf(iM14330)) + (i / 90)) % 4;
                iIntValue = list2.get(iIndexOf2 + (iIndexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        m14385(f10215, Integer.toString(iIntValue));
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x0106), top: B:120:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x0106), top: B:120:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m14380() throws Throwable {
        FileOutputStream fileOutputStream;
        File fileCreateTempFile;
        FileInputStream fileInputStream;
        Closeable closeable;
        FileOutputStream fileOutputStream2;
        Exception exc;
        FileOutputStream fileOutputStream3;
        InputStream fileInputStream2;
        Exception e;
        FileOutputStream fileOutputStream4;
        FileInputStream fileInputStream3;
        if (!m14318(this.f10655)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f1095 == null && this.f1094 == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f10660 && this.f10661 && !this.f10662) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        this.f10671 = true;
        this.f10665 = m14349();
        InputStream inputStream = null;
        try {
            fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.f1094 != null) {
                fileInputStream = new FileInputStream(this.f1094);
            } else {
                C4758.C0483.m14426(this.f1095, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f1095);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            C4758.m14422(fileInputStream, fileOutputStream);
            C4758.m14420(fileInputStream);
            C4758.m14420(fileOutputStream);
            try {
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                try {
                    fileInputStream3 = new FileInputStream(fileCreateTempFile);
                } catch (Throwable th4) {
                    th = th4;
                    closeable = null;
                    C4758.m14420(inputStream);
                    C4758.m14420(closeable);
                    if (0 == 0) {
                        fileCreateTempFile.delete();
                    }
                    throw th;
                }
                try {
                    if (this.f1094 != null) {
                        fileOutputStream3 = new FileOutputStream(this.f1094);
                    } else {
                        C4758.C0483.m14426(this.f1095, 0L, OsConstants.SEEK_SET);
                        fileOutputStream3 = new FileOutputStream(this.f1095);
                    }
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                        try {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                            try {
                                int i = this.f10655;
                                if (i == 4) {
                                    m14381(bufferedInputStream, bufferedOutputStream);
                                } else if (i == 13) {
                                    m14382(bufferedInputStream, bufferedOutputStream);
                                } else if (i == 14) {
                                    m14383(bufferedInputStream, bufferedOutputStream);
                                }
                                C4758.m14420(bufferedInputStream);
                                C4758.m14420(bufferedOutputStream);
                                fileCreateTempFile.delete();
                                this.f10665 = null;
                            } catch (Exception e4) {
                                exc = e4;
                                inputStream = fileInputStream3;
                                try {
                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                    try {
                                        if (this.f1094 != null) {
                                            C4758.C0483.m14426(this.f1095, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream4 = new FileOutputStream(this.f1095);
                                        } else {
                                            fileOutputStream4 = new FileOutputStream(this.f1094);
                                        }
                                        fileOutputStream3 = fileOutputStream4;
                                        C4758.m14422(fileInputStream2, fileOutputStream3);
                                        C4758.m14420(fileInputStream2);
                                        C4758.m14420(fileOutputStream3);
                                        throw new IOException("Failed to save new file", exc);
                                    } catch (Exception e5) {
                                        e = e5;
                                        try {
                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            inputStream = fileInputStream2;
                                            C4758.m14420(inputStream);
                                            C4758.m14420(fileOutputStream3);
                                            throw th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        inputStream = fileInputStream2;
                                        C4758.m14420(inputStream);
                                        C4758.m14420(fileOutputStream3);
                                        throw th;
                                    }
                                } catch (Exception e6) {
                                    fileInputStream2 = inputStream;
                                    e = e6;
                                } catch (Throwable th7) {
                                    th = th7;
                                    C4758.m14420(inputStream);
                                    C4758.m14420(fileOutputStream3);
                                    throw th;
                                }
                            }
                        } catch (Exception e7) {
                            inputStream = fileInputStream3;
                            exc = e7;
                        } catch (Throwable th8) {
                            th = th8;
                            closeable = null;
                            inputStream = bufferedInputStream;
                            C4758.m14420(inputStream);
                            C4758.m14420(closeable);
                            if (0 == 0) {
                            }
                            throw th;
                        }
                    } catch (Exception e8) {
                        inputStream = fileInputStream3;
                        exc = e8;
                    }
                } catch (Exception e9) {
                    e = e9;
                    fileOutputStream2 = null;
                    inputStream = fileInputStream3;
                    exc = e;
                    fileOutputStream3 = fileOutputStream2;
                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                    if (this.f1094 != null) {
                    }
                    fileOutputStream3 = fileOutputStream4;
                    C4758.m14422(fileInputStream2, fileOutputStream3);
                    C4758.m14420(fileInputStream2);
                    C4758.m14420(fileOutputStream3);
                    throw new IOException("Failed to save new file", exc);
                }
            } catch (Exception e10) {
                e = e10;
                fileOutputStream2 = null;
            }
        } catch (Exception e11) {
            e = e11;
            inputStream = fileInputStream;
            try {
                throw new IOException("Failed to copy original file to temp file", e);
            } catch (Throwable th9) {
                th = th9;
                C4758.m14420(inputStream);
                C4758.m14420(fileOutputStream);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            inputStream = fileInputStream;
            C4758.m14420(inputStream);
            C4758.m14420(fileOutputStream);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public final void m14381(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f10209) {
            Log.d(f10208, "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        C0482 c0482 = new C0482(inputStream);
        C4751 c4751 = new C4751(outputStream, ByteOrder.BIG_ENDIAN);
        if (c0482.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        c4751.m14397(-1);
        if (c0482.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        c4751.m14397(-40);
        C4752 c4752Remove = (m14327(f10362) == null || !this.f10672) ? null : this.f10657[0].remove(f10362);
        c4751.m14397(-1);
        c4751.m14397(-31);
        m14393(c4751);
        if (c4752Remove != null) {
            this.f10657[0].put(f10362, c4752Remove);
        }
        byte[] bArr = new byte[4096];
        while (c0482.readByte() == -1) {
            byte b = c0482.readByte();
            if (b == -39 || b == -38) {
                c4751.m14397(-1);
                c4751.m14397(b);
                C4758.m14422(c0482, c4751);
                return;
            }
            if (b != -31) {
                c4751.m14397(-1);
                c4751.m14397(b);
                int unsignedShort = c0482.readUnsignedShort();
                c4751.m14401(unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int i2 = c0482.read(bArr, 0, Math.min(i, 4096));
                    if (i2 >= 0) {
                        c4751.write(bArr, 0, i2);
                        i -= i2;
                    }
                }
            } else {
                int unsignedShort2 = c0482.readUnsignedShort();
                int i3 = unsignedShort2 - 2;
                if (i3 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i3 >= 6) {
                    if (c0482.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f10613)) {
                        c0482.m14396(unsignedShort2 - 8);
                    }
                }
                c4751.m14397(-1);
                c4751.m14397(b);
                c4751.m14401(unsignedShort2);
                if (i3 >= 6) {
                    i3 = unsignedShort2 - 8;
                    c4751.write(bArr2);
                }
                while (i3 > 0) {
                    int i4 = c0482.read(bArr, 0, Math.min(i3, 4096));
                    if (i4 >= 0) {
                        c4751.write(bArr, 0, i4);
                        i3 -= i4;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final void m14382(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f10209) {
            Log.d(f10208, "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        C0482 c0482 = new C0482(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C4751 c4751 = new C4751(outputStream, byteOrder);
        C4758.m14423(c0482, c4751, f10543.length);
        if (this.f10667 == 0) {
            int i = c0482.readInt();
            c4751.m14398(i);
            C4758.m14423(c0482, c4751, i + 8);
        } else {
            C4758.m14423(c0482, c4751, (r2 - r7.length) - 8);
            c0482.m14396(c0482.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            C4751 c47512 = new C4751(byteArrayOutputStream, byteOrder);
            m14393(c47512);
            byte[] byteArray = ((ByteArrayOutputStream) c47512.f10682).toByteArray();
            c4751.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            c4751.m14398((int) crc32.getValue());
            C4758.m14420(byteArrayOutputStream);
            C4758.m14422(c0482, c4751);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            C4758.m14420(byteArrayOutputStream2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public final void m14383(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i;
        int i2;
        int i3;
        if (f10209) {
            Log.d(f10208, "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C0482 c0482 = new C0482(inputStream, byteOrder);
        C4751 c4751 = new C4751(outputStream, byteOrder);
        byte[] bArr = f10549;
        C4758.m14423(c0482, c4751, bArr.length);
        byte[] bArr2 = f10550;
        c0482.m14396(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            C4751 c47512 = new C4751(byteArrayOutputStream, byteOrder);
            int i4 = this.f10667;
            if (i4 != 0) {
                C4758.m14423(c0482, c47512, (i4 - ((bArr.length + 4) + bArr2.length)) - 8);
                c0482.m14396(4);
                int i5 = c0482.readInt();
                if (i5 % 2 != 0) {
                    i5++;
                }
                c0482.m14396(i5);
                m14393(c47512);
            } else {
                byte[] bArr3 = new byte[4];
                if (c0482.read(bArr3) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
                byte[] bArr4 = f10555;
                boolean z = true;
                if (Arrays.equals(bArr3, bArr4)) {
                    int i6 = c0482.readInt();
                    byte[] bArr5 = new byte[i6 % 2 == 1 ? i6 + 1 : i6];
                    c0482.read(bArr5);
                    byte b = (byte) (8 | bArr5[0]);
                    bArr5[0] = b;
                    boolean z2 = ((b >> 1) & 1) == 1;
                    c47512.write(bArr4);
                    c47512.m14398(i6);
                    c47512.write(bArr5);
                    if (z2) {
                        m14322(c0482, c47512, f10558, null);
                        while (true) {
                            byte[] bArr6 = new byte[4];
                            inputStream.read(bArr6);
                            if (!Arrays.equals(bArr6, f10559)) {
                                break;
                            } else {
                                m14323(c0482, c47512, bArr6);
                            }
                        }
                        m14393(c47512);
                    } else {
                        m14322(c0482, c47512, f10557, f10556);
                        m14393(c47512);
                    }
                } else {
                    byte[] bArr7 = f10557;
                    if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f10556)) {
                        int i7 = c0482.readInt();
                        int i8 = i7 % 2 == 1 ? i7 + 1 : i7;
                        byte[] bArr8 = new byte[3];
                        if (Arrays.equals(bArr3, bArr7)) {
                            c0482.read(bArr8);
                            byte[] bArr9 = new byte[3];
                            if (c0482.read(bArr9) != 3 || !Arrays.equals(f10553, bArr9)) {
                                throw new IOException("Encountered error while checking VP8 signature");
                            }
                            i = c0482.readInt();
                            i8 -= 10;
                            i3 = (i << 2) >> 18;
                            i2 = (i << 18) >> 18;
                            z = false;
                        } else if (!Arrays.equals(bArr3, f10556)) {
                            i = 0;
                            z = false;
                            i2 = 0;
                            i3 = 0;
                        } else {
                            if (c0482.readByte() != 47) {
                                throw new IOException("Encountered error while checking VP8L signature");
                            }
                            i = c0482.readInt();
                            i2 = (i & 16383) + 1;
                            i3 = ((i & 268419072) >>> 14) + 1;
                            if ((i & 268435456) == 0) {
                                z = false;
                            }
                            i8 -= 5;
                        }
                        c47512.write(bArr4);
                        c47512.m14398(10);
                        byte[] bArr10 = new byte[10];
                        if (z) {
                            bArr10[0] = (byte) (bArr10[0] | BaseType.Union);
                        }
                        bArr10[0] = (byte) (bArr10[0] | 8);
                        int i9 = i2 - 1;
                        int i10 = i3 - 1;
                        bArr10[4] = (byte) i9;
                        bArr10[5] = (byte) (i9 >> 8);
                        bArr10[6] = (byte) (i9 >> 16);
                        bArr10[7] = (byte) i10;
                        bArr10[8] = (byte) (i10 >> 8);
                        bArr10[9] = (byte) (i10 >> 16);
                        c47512.write(bArr10);
                        c47512.write(bArr3);
                        c47512.m14398(i7);
                        if (Arrays.equals(bArr3, bArr7)) {
                            c47512.write(bArr8);
                            c47512.write(f10553);
                            c47512.m14398(i);
                        } else if (Arrays.equals(bArr3, f10556)) {
                            c47512.write(47);
                            c47512.m14398(i);
                        }
                        C4758.m14423(c0482, c47512, i8);
                        m14393(c47512);
                    }
                }
            }
            C4758.m14422(c0482, c47512);
            int size = byteArrayOutputStream.size();
            byte[] bArr11 = f10550;
            c4751.m14398(size + bArr11.length);
            c4751.write(bArr11);
            byteArrayOutputStream.writeTo(c4751);
            C4758.m14420(byteArrayOutputStream);
        } catch (Exception e2) {
            e = e2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            C4758.m14420(byteArrayOutputStream2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public void m14384(double d) {
        String str = d >= 0.0d ? "0" : "1";
        m14385(f10320, new C4756(Math.abs(d)).toString());
        m14385(f10319, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public void m14385(@InterfaceC6391 String str, @InterfaceC6490 String str2) {
        C4754 c4754;
        int i;
        int i2;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ((f10233.equals(str3) || f10251.equals(str3) || f10252.equals(str3)) && strReplaceAll != null) {
            boolean zFind = f10651.matcher(strReplaceAll).find();
            boolean zFind2 = f10652.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                Log.w(f10208, "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if (f10263.equals(str3)) {
            if (f10209) {
                Log.d(f10208, "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = f10264;
        }
        int i3 = 2;
        int i4 = 1;
        if (strReplaceAll != null && f10610.contains(str3)) {
            if (str3.equals(f10321)) {
                Matcher matcher = f10650.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w(f10208, "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new C4756(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w(f10208, "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i5 = 0;
        int i6 = 0;
        while (i6 < f10606.length) {
            if ((i6 != 4 || this.f10660) && (c4754 = f10609[i6].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairM14314 = m14314(strReplaceAll);
                    int i7 = -1;
                    if (c4754.f10687 == ((Integer) pairM14314.first).intValue() || c4754.f10687 == ((Integer) pairM14314.second).intValue()) {
                        i = c4754.f10687;
                    } else {
                        int i8 = c4754.f10688;
                        if (i8 == -1 || !(i8 == ((Integer) pairM14314.first).intValue() || c4754.f10688 == ((Integer) pairM14314.second).intValue())) {
                            int i9 = c4754.f10687;
                            if (i9 == i4 || i9 == 7 || i9 == i3) {
                                i = i9;
                            } else if (f10209) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Given tag (");
                                sb.append(str3);
                                sb.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f10583;
                                sb.append(strArr[c4754.f10687]);
                                sb.append(c4754.f10688 == -1 ? "" : ", " + strArr[c4754.f10688]);
                                sb.append(" (guess: ");
                                sb.append(strArr[((Integer) pairM14314.first).intValue()]);
                                sb.append(((Integer) pairM14314.second).intValue() != -1 ? ", " + strArr[((Integer) pairM14314.second).intValue()] : "");
                                sb.append(")");
                                Log.d(f10208, sb.toString());
                            }
                        } else {
                            i = c4754.f10688;
                        }
                    }
                    switch (i) {
                        case 1:
                            i2 = i4;
                            this.f10657[i6].put(str3, C4752.m1671(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            i2 = i4;
                            this.f10657[i6].put(str3, C4752.m14407(strReplaceAll));
                            break;
                        case 3:
                            i2 = i4;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                                iArr[i10] = Integer.parseInt(strArrSplit[i10]);
                            }
                            this.f10657[i6].put(str3, C4752.m14413(iArr, this.f10659));
                            break;
                        case 4:
                            i2 = i4;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i11 = 0; i11 < strArrSplit2.length; i11++) {
                                jArr[i11] = Long.parseLong(strArrSplit2[i11]);
                            }
                            this.f10657[i6].put(str3, C4752.m14409(jArr, this.f10659));
                            break;
                        case 5:
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            C4756[] c4756Arr = new C4756[strArrSplit3.length];
                            int i12 = 0;
                            while (i12 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i12].split("/", i7);
                                c4756Arr[i12] = new C4756((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[1]));
                                i12++;
                                i7 = -1;
                            }
                            i2 = 1;
                            this.f10657[i6].put(str3, C4752.m14411(c4756Arr, this.f10659));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f10209) {
                                Log.d(f10208, "Data format isn't one of expected formats: " + i);
                            }
                            break;
                        case 9:
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i13 = 0; i13 < strArrSplit5.length; i13++) {
                                iArr2[i13] = Integer.parseInt(strArrSplit5[i13]);
                            }
                            this.f10657[i6].put(str3, C4752.m14404(iArr2, this.f10659));
                            i2 = 1;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            C4756[] c4756Arr2 = new C4756[strArrSplit6.length];
                            int i14 = i5;
                            while (i14 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i14].split("/", -1);
                                c4756Arr2[i14] = new C4756((long) Double.parseDouble(strArrSplit7[i5]), (long) Double.parseDouble(strArrSplit7[i4]));
                                i14++;
                                strArrSplit6 = strArrSplit6;
                                i5 = 0;
                                i4 = 1;
                            }
                            this.f10657[i6].put(str3, C4752.m14406(c4756Arr2, this.f10659));
                            i2 = 1;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i15 = i5; i15 < strArrSplit8.length; i15++) {
                                dArr[i15] = Double.parseDouble(strArrSplit8[i15]);
                            }
                            this.f10657[i6].put(str3, C4752.m14402(dArr, this.f10659));
                            break;
                    }
                } else {
                    this.f10657[i6].remove(str3);
                }
                i2 = i4;
            } else {
                i2 = i4;
            }
            i6++;
            i4 = i2;
            i3 = 2;
            i5 = 0;
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public void m14386(@InterfaceC6391 Long l) {
        if (l == null) {
            throw new NullPointerException("Timestamp should not be null.");
        }
        if (l.longValue() < 0) {
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        String string = Long.toString(l.longValue() % 1000);
        for (int length = string.length(); length < 3; length++) {
            string = "0" + string;
        }
        m14385(f10233, f10563.format(new Date(l.longValue())));
        m14385(f10256, string);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public void m14387(Location location) {
        if (location == null) {
            return;
        }
        m14385(f10341, location.getProvider());
        m14388(location.getLatitude(), location.getLongitude());
        m14384(location.getAltitude());
        m14385(f10326, "K");
        m14385(f10327, new C4756((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = f10563.format(new Date(location.getTime())).split("\\s+", -1);
        m14385(f10343, strArrSplit[0]);
        m14385(f10321, strArrSplit[1]);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public void m14388(double d, double d2) {
        if (d < -90.0d || d > 90.0d || Double.isNaN(d)) {
            throw new IllegalArgumentException("Latitude value " + d + " is not valid.");
        }
        if (d2 < -180.0d || d2 > 180.0d || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Longitude value " + d2 + " is not valid.");
        }
        m14385(f10315, d >= 0.0d ? "N" : f10490);
        m14385(f10316, m1668(Math.abs(d)));
        m14385(f10317, d2 >= 0.0d ? f10491 : f10492);
        m14385(f10318, m1668(Math.abs(d2)));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public final void m14389(C0482 c0482) throws Throwable {
        HashMap<String, C4752> map = this.f10657[4];
        C4752 c4752 = map.get(f10213);
        if (c4752 == null) {
            this.f10666 = 6;
            m14354(c0482, map);
            return;
        }
        int iM14415 = c4752.m14415(this.f10659);
        this.f10666 = iM14415;
        if (iM14415 != 1) {
            if (iM14415 == 6) {
                m14354(c0482, map);
                return;
            } else if (iM14415 != 7) {
                return;
            }
        }
        if (m14365(map)) {
            m14355(c0482, map);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public final void m14390(int i, int i2) throws Throwable {
        if (this.f10657[i].isEmpty() || this.f10657[i2].isEmpty()) {
            if (f10209) {
                Log.d(f10208, "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C4752 c4752 = this.f10657[i].get(f10211);
        C4752 c47522 = this.f10657[i].get(f10210);
        C4752 c47523 = this.f10657[i2].get(f10211);
        C4752 c47524 = this.f10657[i2].get(f10210);
        if (c4752 == null || c47522 == null) {
            if (f10209) {
                Log.d(f10208, "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c47523 == null || c47524 == null) {
            if (f10209) {
                Log.d(f10208, "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM14415 = c4752.m14415(this.f10659);
        int iM144152 = c47522.m14415(this.f10659);
        int iM144153 = c47523.m14415(this.f10659);
        int iM144154 = c47524.m14415(this.f10659);
        if (iM14415 >= iM144153 || iM144152 >= iM144154) {
            return;
        }
        HashMap<String, C4752>[] mapArr = this.f10657;
        HashMap<String, C4752> map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public final void m14391(C4757 c4757, int i) throws Throwable {
        C4752 c4752M14412;
        C4752 c4752M144122;
        C4752 c4752 = this.f10657[i].get(f10351);
        C4752 c47522 = this.f10657[i].get(f10359);
        C4752 c47523 = this.f10657[i].get(f10357);
        C4752 c47524 = this.f10657[i].get(f10356);
        C4752 c47525 = this.f10657[i].get(f10358);
        if (c4752 == null) {
            if (c47522 == null || c47523 == null || c47524 == null || c47525 == null) {
                m14378(c4757, i);
                return;
            }
            int iM14415 = c47522.m14415(this.f10659);
            int iM144152 = c47524.m14415(this.f10659);
            int iM144153 = c47525.m14415(this.f10659);
            int iM144154 = c47523.m14415(this.f10659);
            if (iM144152 <= iM14415 || iM144153 <= iM144154) {
                return;
            }
            C4752 c4752M144123 = C4752.m14412(iM144152 - iM14415, this.f10659);
            C4752 c4752M144124 = C4752.m14412(iM144153 - iM144154, this.f10659);
            this.f10657[i].put(f10211, c4752M144123);
            this.f10657[i].put(f10210, c4752M144124);
            return;
        }
        if (c4752.f1096 == 5) {
            C4756[] c4756Arr = (C4756[]) c4752.m14417(this.f10659);
            if (c4756Arr == null || c4756Arr.length != 2) {
                Log.w(f10208, "Invalid crop size values. cropSize=" + Arrays.toString(c4756Arr));
                return;
            }
            c4752M14412 = C4752.m14410(c4756Arr[0], this.f10659);
            c4752M144122 = C4752.m14410(c4756Arr[1], this.f10659);
        } else {
            int[] iArr = (int[]) c4752.m14417(this.f10659);
            if (iArr == null || iArr.length != 2) {
                Log.w(f10208, "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            c4752M14412 = C4752.m14412(iArr[0], this.f10659);
            c4752M144122 = C4752.m14412(iArr[1], this.f10659);
        }
        this.f10657[i].put(f10210, c4752M14412);
        this.f10657[i].put(f10211, c4752M144122);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public final void m14392() throws Throwable {
        m14390(0, 5);
        m14390(0, 4);
        m14390(5, 4);
        C4752 c4752 = this.f10657[1].get(f10244);
        C4752 c47522 = this.f10657[1].get(f10245);
        if (c4752 != null && c47522 != null) {
            this.f10657[0].put(f10210, c4752);
            this.f10657[0].put(f10211, c47522);
        }
        if (this.f10657[4].isEmpty() && m14366(this.f10657[5])) {
            HashMap<String, C4752>[] mapArr = this.f10657;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!m14366(this.f10657[4])) {
            Log.d(f10208, "No image meets the size requirements of a thumbnail image.");
        }
        m14376(0, f10349, f10215);
        m14376(0, f10347, f10211);
        m14376(0, f10348, f10210);
        m14376(5, f10349, f10215);
        m14376(5, f10347, f10211);
        m14376(5, f10348, f10210);
        m14376(4, f10215, f10349);
        m14376(4, f10211, f10347);
        m14376(4, f10210, f10348);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public final int m14393(C4751 c4751) throws IOException {
        C4754[][] c4754Arr = f10606;
        int[] iArr = new int[c4754Arr.length];
        int[] iArr2 = new int[c4754Arr.length];
        for (C4754 c4754 : f10607) {
            m14375(c4754.f1099);
        }
        if (this.f10660) {
            if (this.f10661) {
                m14375(f10223);
                m14375(f10225);
            } else {
                m14375(f10226);
                m14375(f10227);
            }
        }
        for (int i = 0; i < f10606.length; i++) {
            for (Object obj : this.f10657[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f10657[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f10657[1].isEmpty()) {
            this.f10657[0].put(f10607[1].f1099, C4752.m14408(0L, this.f10659));
        }
        if (!this.f10657[2].isEmpty()) {
            this.f10657[0].put(f10607[2].f1099, C4752.m14408(0L, this.f10659));
        }
        if (!this.f10657[3].isEmpty()) {
            this.f10657[1].put(f10607[3].f1099, C4752.m14408(0L, this.f10659));
        }
        if (this.f10660) {
            if (this.f10661) {
                this.f10657[4].put(f10223, C4752.m14412(0, this.f10659));
                this.f10657[4].put(f10225, C4752.m14412(this.f10664, this.f10659));
            } else {
                this.f10657[4].put(f10226, C4752.m14408(0L, this.f10659));
                this.f10657[4].put(f10227, C4752.m14408(this.f10664, this.f10659));
            }
        }
        for (int i2 = 0; i2 < f10606.length; i2++) {
            Iterator<Map.Entry<String, C4752>> it = this.f10657[i2].entrySet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int iM14418 = it.next().getValue().m14418();
                if (iM14418 > 4) {
                    i3 += iM14418;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int size = 8;
        for (int i4 = 0; i4 < f10606.length; i4++) {
            if (!this.f10657[i4].isEmpty()) {
                iArr[i4] = size;
                size += (this.f10657[i4].size() * 12) + 6 + iArr2[i4];
            }
        }
        if (this.f10660) {
            if (this.f10661) {
                this.f10657[4].put(f10223, C4752.m14412(size, this.f10659));
            } else {
                this.f10657[4].put(f10226, C4752.m14408(size, this.f10659));
            }
            this.f10663 = size;
            size += this.f10664;
        }
        if (this.f10655 == 4) {
            size += 8;
        }
        if (f10209) {
            for (int i5 = 0; i5 < f10606.length; i5++) {
                Log.d(f10208, String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i5), Integer.valueOf(iArr[i5]), Integer.valueOf(this.f10657[i5].size()), Integer.valueOf(iArr2[i5]), Integer.valueOf(size)));
            }
        }
        if (!this.f10657[1].isEmpty()) {
            this.f10657[0].put(f10607[1].f1099, C4752.m14408(iArr[1], this.f10659));
        }
        if (!this.f10657[2].isEmpty()) {
            this.f10657[0].put(f10607[2].f1099, C4752.m14408(iArr[2], this.f10659));
        }
        if (!this.f10657[3].isEmpty()) {
            this.f10657[1].put(f10607[3].f1099, C4752.m14408(iArr[3], this.f10659));
        }
        int i6 = this.f10655;
        if (i6 == 4) {
            c4751.m14401(size);
            c4751.write(f10613);
        } else if (i6 == 13) {
            c4751.m14398(size);
            c4751.write(f10544);
        } else if (i6 == 14) {
            c4751.write(f10552);
            c4751.m14398(size);
        }
        c4751.m14399(this.f10659 == ByteOrder.BIG_ENDIAN ? f10566 : f10565);
        c4751.m1670(this.f10659);
        c4751.m14401(42);
        c4751.m14400(8L);
        for (int i7 = 0; i7 < f10606.length; i7++) {
            if (!this.f10657[i7].isEmpty()) {
                c4751.m14401(this.f10657[i7].size());
                int size2 = iArr[i7] + 2 + (this.f10657[i7].size() * 12) + 4;
                for (Map.Entry<String, C4752> entry2 : this.f10657[i7].entrySet()) {
                    int i8 = f10609[i7].get(entry2.getKey()).f1098;
                    C4752 value = entry2.getValue();
                    int iM144182 = value.m14418();
                    c4751.m14401(i8);
                    c4751.m14401(value.f1096);
                    c4751.m14398(value.f1097);
                    if (iM144182 > 4) {
                        c4751.m14400(size2);
                        size2 += iM144182;
                    } else {
                        c4751.write(value.f10686);
                        if (iM144182 < 4) {
                            while (iM144182 < 4) {
                                c4751.m14397(0);
                                iM144182++;
                            }
                        }
                    }
                }
                if (i7 != 0 || this.f10657[4].isEmpty()) {
                    c4751.m14400(0L);
                } else {
                    c4751.m14400(iArr[4]);
                }
                Iterator<Map.Entry<String, C4752>> it2 = this.f10657[i7].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f10686;
                    if (bArr.length > 4) {
                        c4751.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f10660) {
            c4751.write(m14351());
        }
        if (this.f10655 == 14 && size % 2 == 1) {
            c4751.m14397(0);
        }
        c4751.m1670(ByteOrder.BIG_ENDIAN);
        return size;
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۦ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C4757 extends C0482 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C4757(byte[] bArr) throws IOException {
            super(bArr);
            this.f10678.mark(Integer.MAX_VALUE);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m14419(long j) throws IOException {
            int i = this.f10680;
            if (i > j) {
                this.f10680 = 0;
                this.f10678.reset();
            } else {
                j -= (long) i;
            }
            m14396((int) j);
        }

        public C4757(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f10678.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۦ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C4754 {

        /* JADX INFO: renamed from: ۥ */
        public final int f1098;

        /* JADX INFO: renamed from: ۥ۟ */
        public final String f1099;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f10687;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int f10688;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C4754(String str, int i, int i2) {
            this.f1099 = str;
            this.f1098 = i;
            this.f10687 = i2;
            this.f10688 = -1;
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean m1673(int i) {
            int i2;
            int i3 = this.f10687;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f10688) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }

        public C4754(String str, int i, int i2, int i3) {
            this.f1099 = str;
            this.f1098 = i;
            this.f10687 = i2;
            this.f10688 = i3;
        }
    }

    public C4750(@InterfaceC6391 String str) throws Throwable {
        C4754[][] c4754Arr = f10606;
        this.f10657 = new HashMap[c4754Arr.length];
        this.f10658 = new HashSet(c4754Arr.length);
        this.f10659 = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            m14358(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public C4750(@InterfaceC6391 FileDescriptor fileDescriptor) throws Throwable {
        boolean z;
        FileInputStream fileInputStream;
        Throwable th;
        C4754[][] c4754Arr = f10606;
        this.f10657 = new HashMap[c4754Arr.length];
        this.f10658 = new HashSet(c4754Arr.length);
        this.f10659 = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f10654 = null;
            this.f1094 = null;
            if (m14317(fileDescriptor)) {
                this.f1095 = fileDescriptor;
                try {
                    fileDescriptor = C4758.C0483.m1678(fileDescriptor);
                    z = true;
                } catch (Exception e) {
                    throw new IOException("Failed to duplicate file descriptor", e);
                }
            } else {
                this.f1095 = null;
                z = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    m14369(fileInputStream);
                    C4758.m14420(fileInputStream);
                    if (z) {
                        C4758.m1676(fileDescriptor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C4758.m14420(fileInputStream);
                    if (z) {
                        C4758.m1676(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    public C4750(@InterfaceC6391 InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4750(@InterfaceC6391 InputStream inputStream, int i) throws IOException {
        C4754[][] c4754Arr = f10606;
        this.f10657 = new HashMap[c4754Arr.length];
        this.f10658 = new HashSet(c4754Arr.length);
        this.f10659 = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f1094 = null;
            if (i == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f10613.length);
                if (!m14315(bufferedInputStream)) {
                    Log.w(f10208, "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f10656 = true;
                this.f10654 = null;
                this.f1095 = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f10654 = (AssetManager.AssetInputStream) inputStream;
                this.f1095 = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (m14317(fileInputStream.getFD())) {
                    this.f10654 = null;
                    this.f1095 = fileInputStream.getFD();
                } else {
                    this.f10654 = null;
                    this.f1095 = null;
                }
            }
            m14369(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
