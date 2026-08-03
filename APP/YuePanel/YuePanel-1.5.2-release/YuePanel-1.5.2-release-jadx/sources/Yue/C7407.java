package Yue;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥۡۨۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7407 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f2857 = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f2858 = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f22367 = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f22368 = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f22369 = ".sharecompat_";

    /* JADX INFO: renamed from: Yue.ۥۡۨۦ۟$ۥ */
    public static class C1252 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final Context f2859;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6391
        public final Intent f2860;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public CharSequence f22370;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public ArrayList<String> f22371;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public ArrayList<String> f22372;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @InterfaceC6490
        public ArrayList<String> f22373;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @InterfaceC6490
        public ArrayList<Uri> f22374;

        public C1252(@InterfaceC6391 Context context) {
            Activity activity;
            this.f2859 = (Context) C6740.m21415(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f2860 = action;
            action.putExtra(C7407.f2857, context.getPackageName());
            action.putExtra(C7407.f2858, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f2860.putExtra(C7407.f22367, componentName);
                this.f2860.putExtra(C7407.f22368, componentName);
            }
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static C1252 m23189(@InterfaceC6391 Activity activity) {
            return new C1252(activity);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C1252 m3611(@InterfaceC6391 String str) {
            if (this.f22373 == null) {
                this.f22373 = new ArrayList<>();
            }
            this.f22373.add(str);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C1252 m3612(@InterfaceC6391 String[] strArr) {
            m23196("android.intent.extra.BCC", strArr);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C1252 m23190(@InterfaceC6391 String str) {
            if (this.f22372 == null) {
                this.f22372 = new ArrayList<>();
            }
            this.f22372.add(str);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C1252 m23191(@InterfaceC6391 String[] strArr) {
            m23196("android.intent.extra.CC", strArr);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C1252 m23192(@InterfaceC6391 String str) {
            if (this.f22371 == null) {
                this.f22371 = new ArrayList<>();
            }
            this.f22371.add(str);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C1252 m23193(@InterfaceC6391 String[] strArr) {
            m23196("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C1252 m23194(@InterfaceC6391 Uri uri) {
            if (this.f22374 == null) {
                this.f22374 = new ArrayList<>();
            }
            this.f22374.add(uri);
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m23195(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f2860.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f2860.putExtra(str, strArr);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m23196(@InterfaceC6490 String str, @InterfaceC6391 String[] strArr) {
            Intent intentM23199 = m23199();
            String[] stringArrayExtra = intentM23199.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[strArr.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            intentM23199.putExtra(str, strArr2);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public Intent m23197() {
            return Intent.createChooser(m23199(), this.f22370);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public Context m23198() {
            return this.f2859;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public Intent m23199() {
            ArrayList<String> arrayList = this.f22371;
            if (arrayList != null) {
                m23195("android.intent.extra.EMAIL", arrayList);
                this.f22371 = null;
            }
            ArrayList<String> arrayList2 = this.f22372;
            if (arrayList2 != null) {
                m23195("android.intent.extra.CC", arrayList2);
                this.f22372 = null;
            }
            ArrayList<String> arrayList3 = this.f22373;
            if (arrayList3 != null) {
                m23195("android.intent.extra.BCC", arrayList3);
                this.f22373 = null;
            }
            ArrayList<Uri> arrayList4 = this.f22374;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                this.f2860.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.f22374;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f2860.removeExtra("android.intent.extra.STREAM");
                    this.f2860.setClipData(null);
                    Intent intent = this.f2860;
                    intent.setFlags(intent.getFlags() & (-2));
                } else {
                    this.f2860.putExtra("android.intent.extra.STREAM", this.f22374.get(0));
                    C7407.m23188(this.f2860, this.f22374);
                }
            } else {
                this.f2860.setAction("android.intent.action.SEND_MULTIPLE");
                this.f2860.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f22374);
                C7407.m23188(this.f2860, this.f22374);
            }
            return this.f2860;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public C1252 m23200(@InterfaceC7613 int i) {
            return m23201(this.f2859.getText(i));
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public C1252 m23201(@InterfaceC6490 CharSequence charSequence) {
            this.f22370 = charSequence;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public C1252 m23202(@InterfaceC6490 String[] strArr) {
            this.f2860.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public C1252 m23203(@InterfaceC6490 String[] strArr) {
            this.f2860.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public C1252 m23204(@InterfaceC6490 String[] strArr) {
            if (this.f22371 != null) {
                this.f22371 = null;
            }
            this.f2860.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public C1252 m23205(@InterfaceC6490 String str) {
            this.f2860.putExtra(C5463.f1525, str);
            if (!this.f2860.hasExtra("android.intent.extra.TEXT")) {
                m23208(Html.fromHtml(str));
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public C1252 m23206(@InterfaceC6490 Uri uri) {
            this.f22374 = null;
            if (uri != null) {
                m23194(uri);
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public C1252 m23207(@InterfaceC6490 String str) {
            this.f2860.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public C1252 m23208(@InterfaceC6490 CharSequence charSequence) {
            this.f2860.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public C1252 m23209(@InterfaceC6490 String str) {
            this.f2860.setType(str);
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public void m23210() {
            this.f2859.startActivity(m23197());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۨۦ۟$ۥ۟ */
    public static class C1253 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final String f22375 = "IntentReader";

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final Context f2861;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6391
        public final Intent f2862;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public final String f22376;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public final ComponentName f22377;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public ArrayList<Uri> f22378;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1253(@InterfaceC6391 Activity activity) {
            this((Context) C6740.m21415(activity), activity.getIntent());
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ */
        public static C1253 m3613(@InterfaceC6391 Activity activity) {
            return new C1253(activity);
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟ */
        public ComponentName m3614() {
            return this.f22377;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Drawable m23211() {
            if (this.f22377 == null) {
                return null;
            }
            try {
                return this.f2861.getPackageManager().getActivityIcon(this.f22377);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f22375, "Could not retrieve icon for calling activity", e);
                return null;
            }
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Drawable m23212() {
            if (this.f22376 == null) {
                return null;
            }
            try {
                return this.f2861.getPackageManager().getApplicationIcon(this.f22376);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f22375, "Could not retrieve icon for calling application", e);
                return null;
            }
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public CharSequence m23213() {
            if (this.f22376 == null) {
                return null;
            }
            PackageManager packageManager = this.f2861.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f22376, 0));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f22375, "Could not retrieve label for calling application", e);
                return null;
            }
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public String m23214() {
            return this.f22376;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public String[] m23215() {
            return this.f2862.getStringArrayExtra("android.intent.extra.BCC");
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public String[] m23216() {
            return this.f2862.getStringArrayExtra("android.intent.extra.CC");
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public String[] m23217() {
            return this.f2862.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public String m23218() {
            String stringExtra = this.f2862.getStringExtra(C5463.f1525);
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence charSequenceM23223 = m23223();
            return charSequenceM23223 instanceof Spanned ? Html.toHtml((Spanned) charSequenceM23223) : charSequenceM23223 != null ? Html.escapeHtml(charSequenceM23223) : stringExtra;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public Uri m23219() {
            return (Uri) this.f2862.getParcelableExtra("android.intent.extra.STREAM");
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public Uri m23220(int i) {
            if (this.f22378 == null && m23225()) {
                this.f22378 = this.f2862.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f22378;
            if (arrayList != null) {
                return arrayList.get(i);
            }
            if (i == 0) {
                return (Uri) this.f2862.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + m23221() + " index requested: " + i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int m23221() {
            if (this.f22378 == null && m23225()) {
                this.f22378 = this.f2862.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f22378;
            return arrayList != null ? arrayList.size() : this.f2862.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public String m23222() {
            return this.f2862.getStringExtra("android.intent.extra.SUBJECT");
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public CharSequence m23223() {
            return this.f2862.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public String m23224() {
            return this.f2862.getType();
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public boolean m23225() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f2862.getAction());
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public boolean m23226() {
            String action = this.f2862.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public boolean m23227() {
            return "android.intent.action.SEND".equals(this.f2862.getAction());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1253(@InterfaceC6391 Context context, @InterfaceC6391 Intent intent) {
            this.f2861 = (Context) C6740.m21415(context);
            this.f2862 = (Intent) C6740.m21415(intent);
            this.f22376 = C7407.m23187(intent);
            this.f22377 = C7407.m23185(intent);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public static void m3609(@InterfaceC6391 Menu menu, @InterfaceC5411 int i, @InterfaceC6391 C1252 c1252) {
        MenuItem menuItemFindItem = menu.findItem(i);
        if (menuItemFindItem != null) {
            m3610(menuItemFindItem, c1252);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + i + " in the supplied menu");
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3610(@InterfaceC6391 MenuItem menuItem, @InterfaceC6391 C1252 c1252) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(c1252.m23198()) : (ShareActionProvider) actionProvider;
        shareActionProvider.setShareHistoryFileName(f22369 + c1252.m23198().getClass().getName());
        shareActionProvider.setShareIntent(c1252.m23199());
        menuItem.setActionProvider(shareActionProvider);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static ComponentName m23184(@InterfaceC6391 Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? m23185(intent) : callingActivity;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static ComponentName m23185(@InterfaceC6391 Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(f22367);
        return componentName == null ? (ComponentName) intent.getParcelableExtra(f22368) : componentName;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String m23186(@InterfaceC6391 Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : m23187(intent);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static String m23187(@InterfaceC6391 Intent intent) {
        String stringExtra = intent.getStringExtra(f2857);
        return stringExtra == null ? intent.getStringExtra(f2858) : stringExtra;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m23188(@InterfaceC6391 Intent intent, @InterfaceC6391 ArrayList<Uri> arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(C5463.f1525), null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}
