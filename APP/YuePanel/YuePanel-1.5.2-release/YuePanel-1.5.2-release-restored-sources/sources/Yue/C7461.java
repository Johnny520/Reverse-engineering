package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class C7461 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f2900 = "ShortcutXmlParser";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f2901 = "android.app.shortcuts";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f22602 = "shortcut";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f22603 = "shortcutId";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile ArrayList<String> f22604;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Object f22605 = new Object();

    /* JADX INFO: renamed from: ۥ */
    public static String m3662(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(C8021.f3196, str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    @InterfaceC6391
    @InterfaceC8532
    /* JADX INFO: renamed from: ۥ۟ */
    public static List<String> m3663(@InterfaceC6391 Context context) {
        if (f22604 == null) {
            synchronized (f22605) {
                try {
                    if (f22604 == null) {
                        f22604 = new ArrayList<>();
                        f22604.addAll(m23415(context));
                    }
                } finally {
                }
            }
        }
        return f22604;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static XmlResourceParser m23413(Context context, ActivityInfo activityInfo) {
        XmlResourceParser xmlResourceParserLoadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), f2901);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    @InterfaceC6391
    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static List<String> m23414(@InterfaceC6391 XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strM3662;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && f22602.equals(name) && (strM3662 = m3662(xmlPullParser, f22603)) != null) {
                arrayList.add(strM3662);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Set<String> m23415(@InterfaceC6391 Context context) {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (listQueryIntentActivities != null && listQueryIntentActivities.size() != 0) {
            try {
                Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(f2901)) {
                        XmlResourceParser xmlResourceParserM23413 = m23413(context, activityInfo);
                        try {
                            hashSet.addAll(m23414(xmlResourceParserM23413));
                            if (xmlResourceParserM23413 != null) {
                                xmlResourceParserM23413.close();
                            }
                        } finally {
                        }
                    }
                }
            } catch (Exception e) {
                Log.e(f2900, "Failed to parse the Xml resource: ", e);
            }
        }
        return hashSet;
    }
}
