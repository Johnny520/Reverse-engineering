package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public final class ShareCompat {
    public static final java.lang.String EXTRA_CALLING_ACTIVITY = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final java.lang.String EXTRA_CALLING_ACTIVITY_INTEROP = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    public static final java.lang.String EXTRA_CALLING_PACKAGE = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final java.lang.String EXTRA_CALLING_PACKAGE_INTEROP = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
    private static final java.lang.String HISTORY_FILENAME_PREFIX = ".sharecompat_";

    private static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String escapeHtml(java.lang.CharSequence r1) {
                java.lang.String r0 = android.text.Html.escapeHtml(r1)
                return r0
        }

        static void migrateExtraStreamToClipData(android.content.Intent r7, java.util.ArrayList<android.net.Uri> r8) {
                java.lang.String r0 = "android.intent.extra.TEXT"
                java.lang.CharSequence r0 = r7.getCharSequenceExtra(r0)
                java.lang.String r1 = "android.intent.extra.HTML_TEXT"
                java.lang.String r1 = r7.getStringExtra(r1)
                android.content.ClipData r2 = new android.content.ClipData
                java.lang.String r3 = r7.getType()
                java.lang.String[] r3 = new java.lang.String[]{r3}
                android.content.ClipData$Item r4 = new android.content.ClipData$Item
                r5 = 0
                java.lang.Object r5 = r8.get(r5)
                android.net.Uri r5 = (android.net.Uri) r5
                r6 = 0
                r4.<init>(r0, r1, r6, r5)
                r2.<init>(r6, r3, r4)
                r3 = 1
                int r4 = r8.size()
            L2b:
                if (r3 >= r4) goto L3e
                java.lang.Object r5 = r8.get(r3)
                android.net.Uri r5 = (android.net.Uri) r5
                android.content.ClipData$Item r6 = new android.content.ClipData$Item
                r6.<init>(r5)
                r2.addItem(r6)
                int r3 = r3 + 1
                goto L2b
            L3e:
                r7.setClipData(r2)
                r3 = 1
                r7.addFlags(r3)
                return
        }

        static void removeClipData(android.content.Intent r1) {
                r0 = 0
                r1.setClipData(r0)
                int r0 = r1.getFlags()
                r0 = r0 & (-2)
                r1.setFlags(r0)
                return
        }
    }

    public static class IntentBuilder {
        private java.util.ArrayList<java.lang.String> mBccAddresses;
        private java.util.ArrayList<java.lang.String> mCcAddresses;
        private java.lang.CharSequence mChooserTitle;
        private final android.content.Context mContext;
        private final android.content.Intent mIntent;
        private java.util.ArrayList<android.net.Uri> mStreams;
        private java.util.ArrayList<java.lang.String> mToAddresses;

        public IntentBuilder(android.content.Context r6) {
                r5 = this;
                r5.<init>()
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r6)
                android.content.Context r0 = (android.content.Context) r0
                r5.mContext = r0
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = "android.intent.action.SEND"
                android.content.Intent r0 = r0.setAction(r1)
                r5.mIntent = r0
                android.content.Intent r0 = r5.mIntent
                java.lang.String r1 = "androidx.core.app.EXTRA_CALLING_PACKAGE"
                java.lang.String r2 = r6.getPackageName()
                r0.putExtra(r1, r2)
                android.content.Intent r0 = r5.mIntent
                java.lang.String r1 = "android.support.v4.app.EXTRA_CALLING_PACKAGE"
                java.lang.String r2 = r6.getPackageName()
                r0.putExtra(r1, r2)
                android.content.Intent r0 = r5.mIntent
                r1 = 524288(0x80000, float:7.34684E-40)
                r0.addFlags(r1)
                r0 = 0
                r1 = r6
            L37:
                boolean r2 = r1 instanceof android.content.ContextWrapper
                if (r2 == 0) goto L4b
                boolean r2 = r1 instanceof android.app.Activity
                if (r2 == 0) goto L43
                r0 = r1
                android.app.Activity r0 = (android.app.Activity) r0
                goto L4b
            L43:
                r2 = r1
                android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
                android.content.Context r1 = r2.getBaseContext()
                goto L37
            L4b:
                if (r0 == 0) goto L5f
                android.content.ComponentName r2 = r0.getComponentName()
                android.content.Intent r3 = r5.mIntent
                java.lang.String r4 = "androidx.core.app.EXTRA_CALLING_ACTIVITY"
                r3.putExtra(r4, r2)
                android.content.Intent r3 = r5.mIntent
                java.lang.String r4 = "android.support.v4.app.EXTRA_CALLING_ACTIVITY"
                r3.putExtra(r4, r2)
            L5f:
                return
        }

        private void combineArrayExtra(java.lang.String r6, java.util.ArrayList<java.lang.String> r7) {
                r5 = this;
                android.content.Intent r0 = r5.mIntent
                java.lang.String[] r0 = r0.getStringArrayExtra(r6)
                r1 = 0
                if (r0 == 0) goto Lb
                int r2 = r0.length
                goto Lc
            Lb:
                r2 = r1
            Lc:
                int r3 = r7.size()
                int r3 = r3 + r2
                java.lang.String[] r3 = new java.lang.String[r3]
                r7.toArray(r3)
                if (r0 == 0) goto L1f
                int r4 = r7.size()
                java.lang.System.arraycopy(r0, r1, r3, r4, r2)
            L1f:
                android.content.Intent r1 = r5.mIntent
                r1.putExtra(r6, r3)
                return
        }

        private void combineArrayExtra(java.lang.String r7, java.lang.String[] r8) {
                r6 = this;
                android.content.Intent r0 = r6.getIntent()
                java.lang.String[] r1 = r0.getStringArrayExtra(r7)
                r2 = 0
                if (r1 == 0) goto Ld
                int r3 = r1.length
                goto Le
            Ld:
                r3 = r2
            Le:
                int r4 = r8.length
                int r4 = r4 + r3
                java.lang.String[] r4 = new java.lang.String[r4]
                if (r1 == 0) goto L17
                java.lang.System.arraycopy(r1, r2, r4, r2, r3)
            L17:
                int r5 = r8.length
                java.lang.System.arraycopy(r8, r2, r4, r3, r5)
                r0.putExtra(r7, r4)
                return
        }

        @java.lang.Deprecated
        public static androidx.core.app.ShareCompat.IntentBuilder from(android.app.Activity r1) {
                androidx.core.app.ShareCompat$IntentBuilder r0 = new androidx.core.app.ShareCompat$IntentBuilder
                r0.<init>(r1)
                return r0
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailBcc(java.lang.String r2) {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.mBccAddresses
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mBccAddresses = r0
            Lb:
                java.util.ArrayList<java.lang.String> r0 = r1.mBccAddresses
                r0.add(r2)
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailBcc(java.lang.String[] r2) {
                r1 = this;
                java.lang.String r0 = "android.intent.extra.BCC"
                r1.combineArrayExtra(r0, r2)
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailCc(java.lang.String r2) {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.mCcAddresses
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mCcAddresses = r0
            Lb:
                java.util.ArrayList<java.lang.String> r0 = r1.mCcAddresses
                r0.add(r2)
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailCc(java.lang.String[] r2) {
                r1 = this;
                java.lang.String r0 = "android.intent.extra.CC"
                r1.combineArrayExtra(r0, r2)
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailTo(java.lang.String r2) {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.mToAddresses
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mToAddresses = r0
            Lb:
                java.util.ArrayList<java.lang.String> r0 = r1.mToAddresses
                r0.add(r2)
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailTo(java.lang.String[] r2) {
                r1 = this;
                java.lang.String r0 = "android.intent.extra.EMAIL"
                r1.combineArrayExtra(r0, r2)
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder addStream(android.net.Uri r2) {
                r1 = this;
                java.util.ArrayList<android.net.Uri> r0 = r1.mStreams
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mStreams = r0
            Lb:
                java.util.ArrayList<android.net.Uri> r0 = r1.mStreams
                r0.add(r2)
                return r1
        }

        public android.content.Intent createChooserIntent() {
                r2 = this;
                android.content.Intent r0 = r2.getIntent()
                java.lang.CharSequence r1 = r2.mChooserTitle
                android.content.Intent r0 = android.content.Intent.createChooser(r0, r1)
                return r0
        }

        android.content.Context getContext() {
                r1 = this;
                android.content.Context r0 = r1.mContext
                return r0
        }

        public android.content.Intent getIntent() {
                r5 = this;
                java.util.ArrayList<java.lang.String> r0 = r5.mToAddresses
                r1 = 0
                if (r0 == 0) goto Le
                java.lang.String r0 = "android.intent.extra.EMAIL"
                java.util.ArrayList<java.lang.String> r2 = r5.mToAddresses
                r5.combineArrayExtra(r0, r2)
                r5.mToAddresses = r1
            Le:
                java.util.ArrayList<java.lang.String> r0 = r5.mCcAddresses
                if (r0 == 0) goto L1b
                java.lang.String r0 = "android.intent.extra.CC"
                java.util.ArrayList<java.lang.String> r2 = r5.mCcAddresses
                r5.combineArrayExtra(r0, r2)
                r5.mCcAddresses = r1
            L1b:
                java.util.ArrayList<java.lang.String> r0 = r5.mBccAddresses
                if (r0 == 0) goto L28
                java.lang.String r0 = "android.intent.extra.BCC"
                java.util.ArrayList<java.lang.String> r2 = r5.mBccAddresses
                r5.combineArrayExtra(r0, r2)
                r5.mBccAddresses = r1
            L28:
                java.util.ArrayList<android.net.Uri> r0 = r5.mStreams
                r1 = 0
                if (r0 == 0) goto L37
                java.util.ArrayList<android.net.Uri> r0 = r5.mStreams
                int r0 = r0.size()
                r2 = 1
                if (r0 <= r2) goto L37
                goto L38
            L37:
                r2 = r1
            L38:
                r0 = r2
                java.lang.String r2 = "android.intent.extra.STREAM"
                if (r0 != 0) goto L72
                android.content.Intent r3 = r5.mIntent
                java.lang.String r4 = "android.intent.action.SEND"
                r3.setAction(r4)
                java.util.ArrayList<android.net.Uri> r3 = r5.mStreams
                if (r3 == 0) goto L66
                java.util.ArrayList<android.net.Uri> r3 = r5.mStreams
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L66
                android.content.Intent r3 = r5.mIntent
                java.util.ArrayList<android.net.Uri> r4 = r5.mStreams
                java.lang.Object r1 = r4.get(r1)
                android.os.Parcelable r1 = (android.os.Parcelable) r1
                r3.putExtra(r2, r1)
                android.content.Intent r1 = r5.mIntent
                java.util.ArrayList<android.net.Uri> r2 = r5.mStreams
                androidx.core.app.ShareCompat.Api16Impl.migrateExtraStreamToClipData(r1, r2)
                goto L88
            L66:
                android.content.Intent r1 = r5.mIntent
                r1.removeExtra(r2)
                android.content.Intent r1 = r5.mIntent
                androidx.core.app.ShareCompat.Api16Impl.removeClipData(r1)
                goto L88
            L72:
                android.content.Intent r1 = r5.mIntent
                java.lang.String r3 = "android.intent.action.SEND_MULTIPLE"
                r1.setAction(r3)
                android.content.Intent r1 = r5.mIntent
                java.util.ArrayList<android.net.Uri> r3 = r5.mStreams
                r1.putParcelableArrayListExtra(r2, r3)
                android.content.Intent r1 = r5.mIntent
                java.util.ArrayList<android.net.Uri> r2 = r5.mStreams
                androidx.core.app.ShareCompat.Api16Impl.migrateExtraStreamToClipData(r1, r2)
            L88:
                android.content.Intent r1 = r5.mIntent
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder setChooserTitle(int r2) {
                r1 = this;
                android.content.Context r0 = r1.mContext
                java.lang.CharSequence r0 = r0.getText(r2)
                androidx.core.app.ShareCompat$IntentBuilder r0 = r1.setChooserTitle(r0)
                return r0
        }

        public androidx.core.app.ShareCompat.IntentBuilder setChooserTitle(java.lang.CharSequence r1) {
                r0 = this;
                r0.mChooserTitle = r1
                return r0
        }

        public androidx.core.app.ShareCompat.IntentBuilder setEmailBcc(java.lang.String[] r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.BCC"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.core.app.ShareCompat.IntentBuilder setEmailCc(java.lang.String[] r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.CC"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.core.app.ShareCompat.IntentBuilder setEmailTo(java.lang.String[] r3) {
                r2 = this;
                java.util.ArrayList<java.lang.String> r0 = r2.mToAddresses
                if (r0 == 0) goto L7
                r0 = 0
                r2.mToAddresses = r0
            L7:
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.EMAIL"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.core.app.ShareCompat.IntentBuilder setHtmlText(java.lang.String r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.HTML_TEXT"
                r0.putExtra(r1, r3)
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.TEXT"
                boolean r0 = r0.hasExtra(r1)
                if (r0 != 0) goto L18
                android.text.Spanned r0 = android.text.Html.fromHtml(r3)
                r2.setText(r0)
            L18:
                return r2
        }

        public androidx.core.app.ShareCompat.IntentBuilder setStream(android.net.Uri r2) {
                r1 = this;
                r0 = 0
                r1.mStreams = r0
                if (r2 == 0) goto L8
                r1.addStream(r2)
            L8:
                return r1
        }

        public androidx.core.app.ShareCompat.IntentBuilder setSubject(java.lang.String r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.SUBJECT"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.core.app.ShareCompat.IntentBuilder setText(java.lang.CharSequence r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.TEXT"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.core.app.ShareCompat.IntentBuilder setType(java.lang.String r2) {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                r0.setType(r2)
                return r1
        }

        public void startChooser() {
                r2 = this;
                android.content.Context r0 = r2.mContext
                android.content.Intent r1 = r2.createChooserIntent()
                r0.startActivity(r1)
                return
        }
    }

    public static class IntentReader {
        private static final java.lang.String TAG = "IntentReader";
        private final android.content.ComponentName mCallingActivity;
        private final java.lang.String mCallingPackage;
        private final android.content.Context mContext;
        private final android.content.Intent mIntent;
        private java.util.ArrayList<android.net.Uri> mStreams;

        public IntentReader(android.app.Activity r3) {
                r2 = this;
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r3)
                android.content.Context r0 = (android.content.Context) r0
                android.content.Intent r1 = r3.getIntent()
                r2.<init>(r0, r1)
                return
        }

        public IntentReader(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r2)
                android.content.Context r0 = (android.content.Context) r0
                r1.mContext = r0
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r3)
                android.content.Intent r0 = (android.content.Intent) r0
                r1.mIntent = r0
                java.lang.String r0 = androidx.core.app.ShareCompat.getCallingPackage(r3)
                r1.mCallingPackage = r0
                android.content.ComponentName r0 = androidx.core.app.ShareCompat.getCallingActivity(r3)
                r1.mCallingActivity = r0
                return
        }

        @java.lang.Deprecated
        public static androidx.core.app.ShareCompat.IntentReader from(android.app.Activity r1) {
                androidx.core.app.ShareCompat$IntentReader r0 = new androidx.core.app.ShareCompat$IntentReader
                r0.<init>(r1)
                return r0
        }

        private static void withinStyle(java.lang.StringBuilder r4, java.lang.CharSequence r5, int r6, int r7) {
                r0 = r6
            L1:
                if (r0 >= r7) goto L5e
                char r1 = r5.charAt(r0)
                r2 = 60
                if (r1 != r2) goto L11
                java.lang.String r2 = "&lt;"
                r4.append(r2)
                goto L5b
            L11:
                r2 = 62
                if (r1 != r2) goto L1b
                java.lang.String r2 = "&gt;"
                r4.append(r2)
                goto L5b
            L1b:
                r2 = 38
                if (r1 != r2) goto L25
                java.lang.String r2 = "&amp;"
                r4.append(r2)
                goto L5b
            L25:
                r2 = 126(0x7e, float:1.77E-43)
                if (r1 > r2) goto L4c
                r2 = 32
                if (r1 >= r2) goto L2e
                goto L4c
            L2e:
                if (r1 != r2) goto L48
            L30:
                int r3 = r0 + 1
                if (r3 >= r7) goto L44
                int r3 = r0 + 1
                char r3 = r5.charAt(r3)
                if (r3 != r2) goto L44
                java.lang.String r3 = "&nbsp;"
                r4.append(r3)
                int r0 = r0 + 1
                goto L30
            L44:
                r4.append(r2)
                goto L5b
            L48:
                r4.append(r1)
                goto L5b
            L4c:
                java.lang.String r2 = "&#"
                java.lang.StringBuilder r2 = r4.append(r2)
                java.lang.StringBuilder r2 = r2.append(r1)
                java.lang.String r3 = ";"
                r2.append(r3)
            L5b:
                int r0 = r0 + 1
                goto L1
            L5e:
                return
        }

        public android.content.ComponentName getCallingActivity() {
                r1 = this;
                android.content.ComponentName r0 = r1.mCallingActivity
                return r0
        }

        public android.graphics.drawable.Drawable getCallingActivityIcon() {
                r5 = this;
                android.content.ComponentName r0 = r5.mCallingActivity
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.content.Context r0 = r5.mContext
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                android.content.ComponentName r2 = r5.mCallingActivity     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
                android.graphics.drawable.Drawable r1 = r0.getActivityIcon(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
                return r1
            L13:
                r2 = move-exception
                java.lang.String r3 = "IntentReader"
                java.lang.String r4 = "Could not retrieve icon for calling activity"
                android.util.Log.e(r3, r4, r2)
                return r1
        }

        public android.graphics.drawable.Drawable getCallingApplicationIcon() {
                r5 = this;
                java.lang.String r0 = r5.mCallingPackage
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.content.Context r0 = r5.mContext
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                java.lang.String r2 = r5.mCallingPackage     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
                android.graphics.drawable.Drawable r1 = r0.getApplicationIcon(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
                return r1
            L13:
                r2 = move-exception
                java.lang.String r3 = "IntentReader"
                java.lang.String r4 = "Could not retrieve icon for calling application"
                android.util.Log.e(r3, r4, r2)
                return r1
        }

        public java.lang.CharSequence getCallingApplicationLabel() {
                r5 = this;
                java.lang.String r0 = r5.mCallingPackage
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.content.Context r0 = r5.mContext
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                java.lang.String r2 = r5.mCallingPackage     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
                r3 = 0
                android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
                java.lang.CharSequence r1 = r0.getApplicationLabel(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
                return r1
            L18:
                r2 = move-exception
                java.lang.String r3 = "IntentReader"
                java.lang.String r4 = "Could not retrieve label for calling application"
                android.util.Log.e(r3, r4, r2)
                return r1
        }

        public java.lang.String getCallingPackage() {
                r1 = this;
                java.lang.String r0 = r1.mCallingPackage
                return r0
        }

        public java.lang.String[] getEmailBcc() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.BCC"
                java.lang.String[] r0 = r0.getStringArrayExtra(r1)
                return r0
        }

        public java.lang.String[] getEmailCc() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.CC"
                java.lang.String[] r0 = r0.getStringArrayExtra(r1)
                return r0
        }

        public java.lang.String[] getEmailTo() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.EMAIL"
                java.lang.String[] r0 = r0.getStringArrayExtra(r1)
                return r0
        }

        public java.lang.String getHtmlText() {
                r3 = this;
                android.content.Intent r0 = r3.mIntent
                java.lang.String r1 = "android.intent.extra.HTML_TEXT"
                java.lang.String r0 = r0.getStringExtra(r1)
                if (r0 != 0) goto L21
                java.lang.CharSequence r1 = r3.getText()
                boolean r2 = r1 instanceof android.text.Spanned
                if (r2 == 0) goto L1a
                r2 = r1
                android.text.Spanned r2 = (android.text.Spanned) r2
                java.lang.String r0 = android.text.Html.toHtml(r2)
                goto L21
            L1a:
                if (r1 == 0) goto L21
            L1d:
                java.lang.String r0 = androidx.core.app.ShareCompat.Api16Impl.escapeHtml(r1)
            L21:
                return r0
        }

        public android.net.Uri getStream() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.STREAM"
                android.os.Parcelable r0 = r0.getParcelableExtra(r1)
                android.net.Uri r0 = (android.net.Uri) r0
                return r0
        }

        public android.net.Uri getStream(int r4) {
                r3 = this;
                java.util.ArrayList<android.net.Uri> r0 = r3.mStreams
                java.lang.String r1 = "android.intent.extra.STREAM"
                if (r0 != 0) goto L14
                boolean r0 = r3.isMultipleShare()
                if (r0 == 0) goto L14
                android.content.Intent r0 = r3.mIntent
                java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r1)
                r3.mStreams = r0
            L14:
                java.util.ArrayList<android.net.Uri> r0 = r3.mStreams
                if (r0 == 0) goto L21
                java.util.ArrayList<android.net.Uri> r0 = r3.mStreams
                java.lang.Object r0 = r0.get(r4)
                android.net.Uri r0 = (android.net.Uri) r0
                return r0
            L21:
                if (r4 != 0) goto L2c
                android.content.Intent r0 = r3.mIntent
                android.os.Parcelable r0 = r0.getParcelableExtra(r1)
                android.net.Uri r0 = (android.net.Uri) r0
                return r0
            L2c:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Stream items available: "
                java.lang.StringBuilder r1 = r1.append(r2)
                int r2 = r3.getStreamCount()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " index requested: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public int getStreamCount() {
                r2 = this;
                java.util.ArrayList<android.net.Uri> r0 = r2.mStreams
                java.lang.String r1 = "android.intent.extra.STREAM"
                if (r0 != 0) goto L14
                boolean r0 = r2.isMultipleShare()
                if (r0 == 0) goto L14
                android.content.Intent r0 = r2.mIntent
                java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r1)
                r2.mStreams = r0
            L14:
                java.util.ArrayList<android.net.Uri> r0 = r2.mStreams
                if (r0 == 0) goto L1f
                java.util.ArrayList<android.net.Uri> r0 = r2.mStreams
                int r0 = r0.size()
                return r0
            L1f:
                android.content.Intent r0 = r2.mIntent
                boolean r0 = r0.hasExtra(r1)
                return r0
        }

        public java.lang.String getSubject() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.SUBJECT"
                java.lang.String r0 = r0.getStringExtra(r1)
                return r0
        }

        public java.lang.CharSequence getText() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.intent.extra.TEXT"
                java.lang.CharSequence r0 = r0.getCharSequenceExtra(r1)
                return r0
        }

        public java.lang.String getType() {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                java.lang.String r0 = r0.getType()
                return r0
        }

        public boolean isMultipleShare() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r0 = r0.getAction()
                java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
                boolean r0 = r1.equals(r0)
                return r0
        }

        public boolean isShareIntent() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r0 = r0.getAction()
                java.lang.String r1 = "android.intent.action.SEND"
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L19
                java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L17
                goto L19
            L17:
                r1 = 0
                goto L1a
            L19:
                r1 = 1
            L1a:
                return r1
        }

        public boolean isSingleShare() {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r0 = r0.getAction()
                java.lang.String r1 = "android.intent.action.SEND"
                boolean r0 = r1.equals(r0)
                return r0
        }
    }

    private ShareCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static void configureMenuItem(android.view.Menu r4, int r5, androidx.core.app.ShareCompat.IntentBuilder r6) {
            android.view.MenuItem r0 = r4.findItem(r5)
            if (r0 == 0) goto La
            configureMenuItem(r0, r6)
            return
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not find menu item with id "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " in the supplied menu"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @java.lang.Deprecated
    public static void configureMenuItem(android.view.MenuItem r4, androidx.core.app.ShareCompat.IntentBuilder r5) {
            android.view.ActionProvider r0 = r4.getActionProvider()
            boolean r1 = r0 instanceof android.widget.ShareActionProvider
            if (r1 != 0) goto L12
            android.widget.ShareActionProvider r1 = new android.widget.ShareActionProvider
            android.content.Context r2 = r5.getContext()
            r1.<init>(r2)
            goto L15
        L12:
            r1 = r0
            android.widget.ShareActionProvider r1 = (android.widget.ShareActionProvider) r1
        L15:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ".sharecompat_"
            java.lang.StringBuilder r2 = r2.append(r3)
            android.content.Context r3 = r5.getContext()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setShareHistoryFileName(r2)
            android.content.Intent r2 = r5.getIntent()
            r1.setShareIntent(r2)
            r4.setActionProvider(r1)
            return
    }

    public static android.content.ComponentName getCallingActivity(android.app.Activity r2) {
            android.content.Intent r0 = r2.getIntent()
            android.content.ComponentName r1 = r2.getCallingActivity()
            if (r1 != 0) goto Le
            android.content.ComponentName r1 = getCallingActivity(r0)
        Le:
            return r1
    }

    static android.content.ComponentName getCallingActivity(android.content.Intent r2) {
            java.lang.String r0 = "androidx.core.app.EXTRA_CALLING_ACTIVITY"
            android.os.Parcelable r0 = r2.getParcelableExtra(r0)
            android.content.ComponentName r0 = (android.content.ComponentName) r0
            if (r0 != 0) goto L13
            java.lang.String r1 = "android.support.v4.app.EXTRA_CALLING_ACTIVITY"
            android.os.Parcelable r1 = r2.getParcelableExtra(r1)
            r0 = r1
            android.content.ComponentName r0 = (android.content.ComponentName) r0
        L13:
            return r0
    }

    public static java.lang.String getCallingPackage(android.app.Activity r2) {
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = r2.getCallingPackage()
            if (r1 != 0) goto L10
            if (r0 == 0) goto L10
            java.lang.String r1 = getCallingPackage(r0)
        L10:
            return r1
    }

    static java.lang.String getCallingPackage(android.content.Intent r2) {
            java.lang.String r0 = "androidx.core.app.EXTRA_CALLING_PACKAGE"
            java.lang.String r0 = r2.getStringExtra(r0)
            if (r0 != 0) goto Le
            java.lang.String r1 = "android.support.v4.app.EXTRA_CALLING_PACKAGE"
            java.lang.String r0 = r2.getStringExtra(r1)
        Le:
            return r0
    }
}
