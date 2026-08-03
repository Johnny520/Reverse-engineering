package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.bumptech.glide.load.Key;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟ */
/* JADX INFO: loaded from: classes.dex */
public class C1629 extends DataSetObservable {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final boolean f26357 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final String f26358 = "ۥ۟";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final String f26359 = "historical-records";

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final String f26360 = "historical-record";

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final String f26361 = "activity";

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final String f26362 = "time";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String f26363 = "weight";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final String f26364 = "activity_choser_model_history.xml";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f26365 = 50;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f26366 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final float f26367 = 1.0f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final String f26368 = ".xml";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f26369 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final Object f26370 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final Map<String, C1629> f26371 = new HashMap();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Context f26373;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final String f26374;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Intent f26375;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public InterfaceC8751 f26382;

    /* JADX INFO: renamed from: ۥ */
    public final Object f3667 = new Object();

    /* JADX INFO: renamed from: ۥ۟ */
    public final List<C8747> f3668 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final List<C8750> f26372 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public InterfaceC8748 f26376 = new C8749();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f26377 = 50;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f26378 = true;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean f26379 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f26380 = true;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f26381 = false;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟$ۥ, reason: contains not printable characters */
    public interface InterfaceC8746 {
        void setActivityChooserModel(C1629 c1629);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟$ۥ۟, reason: contains not printable characters */
    public static final class C8747 implements Comparable<C8747> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final ResolveInfo f26383;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public float f26384;

        public C8747(ResolveInfo resolveInfo) {
            this.f26383 = resolveInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && C8747.class == obj.getClass() && Float.floatToIntBits(this.f26384) == Float.floatToIntBits(((C8747) obj).f26384);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f26384) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.f26383.toString() + "; weight:" + new BigDecimal(this.f26384) + "]";
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public int compareTo(C8747 c8747) {
            return Float.floatToIntBits(c8747.f26384) - Float.floatToIntBits(this.f26384);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC8748 {
        /* JADX INFO: renamed from: ۥ */
        void mo4694(Intent intent, List<C8747> list, List<C8750> list2);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C8749 implements InterfaceC8748 {

        /* JADX INFO: renamed from: ۥ۟ */
        public static final float f3669 = 0.95f;

        /* JADX INFO: renamed from: ۥ */
        public final Map<ComponentName, C8747> f3670 = new HashMap();

        @Override // androidx.appcompat.widget.C1629.InterfaceC8748
        /* JADX INFO: renamed from: ۥ */
        public void mo4694(Intent intent, List<C8747> list, List<C8750> list2) {
            Map<ComponentName, C8747> map = this.f3670;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C8747 c8747 = list.get(i);
                c8747.f26384 = 0.0f;
                ActivityInfo activityInfo = c8747.f26383.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), c8747);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                C8750 c8750 = list2.get(size2);
                C8747 c87472 = map.get(c8750.f3671);
                if (c87472 != null) {
                    c87472.f26384 += c8750.f26385 * f;
                    f *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C8750 {

        /* JADX INFO: renamed from: ۥ */
        public final ComponentName f3671;

        /* JADX INFO: renamed from: ۥ۟ */
        public final long f3672;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final float f26385;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8750(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8750.class != obj.getClass()) {
                return false;
            }
            C8750 c8750 = (C8750) obj;
            ComponentName componentName = this.f3671;
            if (componentName == null) {
                if (c8750.f3671 != null) {
                    return false;
                }
            } else if (!componentName.equals(c8750.f3671)) {
                return false;
            }
            return this.f3672 == c8750.f3672 && Float.floatToIntBits(this.f26385) == Float.floatToIntBits(c8750.f26385);
        }

        public int hashCode() {
            ComponentName componentName = this.f3671;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.f3672;
            return ((((iHashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f26385);
        }

        public String toString() {
            return "[; activity:" + this.f3671 + "; time:" + this.f3672 + "; weight:" + new BigDecimal(this.f26385) + "]";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8750(ComponentName componentName, long j, float f) {
            this.f3671 = componentName;
            this.f3672 = j;
            this.f26385 = f;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۠, reason: contains not printable characters */
    public interface InterfaceC8751 {
        /* JADX INFO: renamed from: ۥ */
        boolean mo4695(C1629 c1629, Intent intent);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final class AsyncTaskC8752 extends AsyncTask<Object, Void, Void> {
        public AsyncTaskC8752() {
        }

        /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Void doInBackground(Object... objArr) {
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = C1629.this.f26373.openFileOutput(str, 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        try {
                            try {
                                xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                                xmlSerializerNewSerializer.startDocument(Key.STRING_CHARSET_NAME, Boolean.TRUE);
                                xmlSerializerNewSerializer.startTag(null, C1629.f26359);
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    C8750 c8750 = (C8750) list.remove(0);
                                    xmlSerializerNewSerializer.startTag(null, C1629.f26360);
                                    xmlSerializerNewSerializer.attribute(null, C1629.f26361, c8750.f3671.flattenToString());
                                    xmlSerializerNewSerializer.attribute(null, "time", String.valueOf(c8750.f3672));
                                    xmlSerializerNewSerializer.attribute(null, C1629.f26363, String.valueOf(c8750.f26385));
                                    xmlSerializerNewSerializer.endTag(null, C1629.f26360);
                                }
                                xmlSerializerNewSerializer.endTag(null, C1629.f26359);
                                xmlSerializerNewSerializer.endDocument();
                                C1629.this.f26378 = true;
                            } catch (Throwable th) {
                                C1629.this.f26378 = true;
                                if (fileOutputStreamOpenFileOutput != null) {
                                    try {
                                        fileOutputStreamOpenFileOutput.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            Log.e(C1629.f26358, "Error writing historical record file: " + C1629.this.f26374, e);
                            C1629.this.f26378 = true;
                            if (fileOutputStreamOpenFileOutput != null) {
                            }
                        }
                    } catch (IllegalStateException e2) {
                        Log.e(C1629.f26358, "Error writing historical record file: " + C1629.this.f26374, e2);
                        C1629.this.f26378 = true;
                        if (fileOutputStreamOpenFileOutput != null) {
                        }
                    }
                } catch (IllegalArgumentException e3) {
                    Log.e(C1629.f26358, "Error writing historical record file: " + C1629.this.f26374, e3);
                    C1629.this.f26378 = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                    }
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                return null;
            } catch (FileNotFoundException e4) {
                Log.e(C1629.f26358, "Error writing historical record file: " + str, e4);
                return null;
            }
        }
    }

    public C1629(Context context, String str) {
        this.f26373 = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(f26368)) {
            this.f26374 = str;
            return;
        }
        this.f26374 = str + f26368;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C1629 m29208(Context context, String str) {
        C1629 c1629;
        synchronized (f26370) {
            try {
                Map<String, C1629> map = f26371;
                c1629 = map.get(str);
                if (c1629 == null) {
                    c1629 = new C1629(context, str);
                    map.put(str, c1629);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1629;
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m4691(C8750 c8750) {
        boolean zAdd = this.f26372.add(c8750);
        if (zAdd) {
            this.f26380 = true;
            m29219();
            m29218();
            m29227();
            notifyChanged();
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public Intent m4692(int i) {
        synchronized (this.f3667) {
            try {
                if (this.f26375 == null) {
                    return null;
                }
                m29209();
                ActivityInfo activityInfo = this.f3668.get(i).f26383.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f26375);
                intent.setComponent(componentName);
                if (this.f26382 != null) {
                    if (this.f26382.mo4695(this, new Intent(intent))) {
                        return null;
                    }
                }
                m4691(new C8750(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m29209() {
        boolean zM29217 = m29217() | m29220();
        m29219();
        if (zM29217) {
            m29227();
            notifyChanged();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public ResolveInfo m29210(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f3667) {
            m29209();
            resolveInfo = this.f3668.get(i).f26383;
        }
        return resolveInfo;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m29211() {
        int size;
        synchronized (this.f3667) {
            m29209();
            size = this.f3668.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m29212(ResolveInfo resolveInfo) {
        synchronized (this.f3667) {
            try {
                m29209();
                List<C8747> list = this.f3668;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (list.get(i).f26383 == resolveInfo) {
                        return i;
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public ResolveInfo m29213() {
        synchronized (this.f3667) {
            try {
                m29209();
                if (this.f3668.isEmpty()) {
                    return null;
                }
                return this.f3668.get(0).f26383;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m29214() {
        int i;
        synchronized (this.f3667) {
            i = this.f26377;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m29215() {
        int size;
        synchronized (this.f3667) {
            m29209();
            size = this.f26372.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Intent m29216() {
        Intent intent;
        synchronized (this.f3667) {
            intent = this.f26375;
        }
        return intent;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m29217() {
        if (!this.f26381 || this.f26375 == null) {
            return false;
        }
        this.f26381 = false;
        this.f3668.clear();
        List<ResolveInfo> listQueryIntentActivities = this.f26373.getPackageManager().queryIntentActivities(this.f26375, 0);
        int size = listQueryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f3668.add(new C8747(listQueryIntentActivities.get(i)));
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m29218() {
        if (!this.f26379) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f26380) {
            this.f26380 = false;
            if (TextUtils.isEmpty(this.f26374)) {
                return;
            }
            new AsyncTaskC8752().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f26372), this.f26374);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m29219() {
        int size = this.f26372.size() - this.f26377;
        if (size <= 0) {
            return;
        }
        this.f26380 = true;
        for (int i = 0; i < size; i++) {
            this.f26372.remove(0);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m29220() {
        if (!this.f26378 || !this.f26380 || TextUtils.isEmpty(this.f26374)) {
            return false;
        }
        this.f26378 = false;
        this.f26379 = true;
        m29221();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m29221() {
        FileInputStream fileInputStreamOpenFileInput;
        try {
            try {
                fileInputStreamOpenFileInput = this.f26373.openFileInput(this.f26374);
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, Key.STRING_CHARSET_NAME);
                    for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                    }
                    if (!f26359.equals(xmlPullParserNewPullParser.getName())) {
                        throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                    }
                    List<C8750> list = this.f26372;
                    list.clear();
                    while (true) {
                        int next2 = xmlPullParserNewPullParser.next();
                        if (next2 == 1) {
                            if (fileInputStreamOpenFileInput == null) {
                                return;
                            }
                        } else if (next2 != 3 && next2 != 4) {
                            if (!f26360.equals(xmlPullParserNewPullParser.getName())) {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                            list.add(new C8750(xmlPullParserNewPullParser.getAttributeValue(null, f26361), Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, f26363))));
                        }
                    }
                } catch (IOException e) {
                    Log.e(f26358, "Error reading historical recrod file: " + this.f26374, e);
                    if (fileInputStreamOpenFileInput == null) {
                    }
                } catch (XmlPullParserException e2) {
                    Log.e(f26358, "Error reading historical recrod file: " + this.f26374, e2);
                    if (fileInputStreamOpenFileInput == null) {
                    }
                }
            } catch (FileNotFoundException unused) {
            }
        } catch (Throwable th) {
            if (fileInputStreamOpenFileInput != null) {
                try {
                    fileInputStreamOpenFileInput.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m29222(InterfaceC8748 interfaceC8748) {
        synchronized (this.f3667) {
            try {
                if (this.f26376 == interfaceC8748) {
                    return;
                }
                this.f26376 = interfaceC8748;
                if (m29227()) {
                    notifyChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m29223(int i) {
        synchronized (this.f3667) {
            try {
                m29209();
                C8747 c8747 = this.f3668.get(i);
                C8747 c87472 = this.f3668.get(0);
                float f = c87472 != null ? (c87472.f26384 - c8747.f26384) + 5.0f : 1.0f;
                ActivityInfo activityInfo = c8747.f26383.activityInfo;
                m4691(new C8750(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m29224(int i) {
        synchronized (this.f3667) {
            try {
                if (this.f26377 == i) {
                    return;
                }
                this.f26377 = i;
                m29219();
                if (m29227()) {
                    notifyChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29225(Intent intent) {
        synchronized (this.f3667) {
            try {
                if (this.f26375 == intent) {
                    return;
                }
                this.f26375 = intent;
                this.f26381 = true;
                m29209();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m29226(InterfaceC8751 interfaceC8751) {
        synchronized (this.f3667) {
            this.f26382 = interfaceC8751;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m29227() {
        if (this.f26376 == null || this.f26375 == null || this.f3668.isEmpty() || this.f26372.isEmpty()) {
            return false;
        }
        this.f26376.mo4694(this.f26375, this.f3668, Collections.unmodifiableList(this.f26372));
        return true;
    }
}
