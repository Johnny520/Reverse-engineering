package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.util.Log;
import android.util.Xml;
import com.bumptech.glide.load.Key;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C3365 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f250 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f251 = "application_locales";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f5331 = "locales";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f5332 = "AppLocalesStorageHelper";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean f5333 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Object f5334 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r5 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r5 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m445(@InterfaceC6391 Context context, @InterfaceC6391 String str) {
        synchronized (f5334) {
            if (str.equals("")) {
                context.deleteFile(f250);
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(f250, 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument(Key.STRING_CHARSET_NAME, Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, f5331);
                        xmlSerializerNewSerializer.attribute(null, f251, str);
                        xmlSerializerNewSerializer.endTag(null, f5331);
                        xmlSerializerNewSerializer.endDocument();
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    Log.w(f5332, "Storing App Locales : Failed to persist app-locales in storage ", e);
                }
            } catch (FileNotFoundException unused2) {
                Log.w(f5332, String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", f250));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, Yue.C3365.f251);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
  0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m446(@InterfaceC6391 Context context) {
        String attributeValue;
        synchronized (f5334) {
            attributeValue = "";
            try {
                FileInputStream fileInputStreamOpenFileInput = context.openFileInput(f250);
                try {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, Key.STRING_CHARSET_NAME);
                        int depth = xmlPullParserNewPullParser.getDepth();
                        while (true) {
                            int next = xmlPullParserNewPullParser.next();
                            if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals(f5331)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        Log.w(f5332, "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                        }
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile(f250);
                    }
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }
}
