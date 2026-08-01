package androidx.appcompat.app;

/* JADX INFO: loaded from: classes2.dex */
class AppLocalesStorageHelper {
    static final java.lang.String APPLICATION_LOCALES_RECORD_FILE = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    static final java.lang.String APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME = "androidx.appcompat.app.AppLocalesMetadataHolderService";
    static final java.lang.String LOCALE_RECORD_ATTRIBUTE_TAG = "application_locales";
    static final java.lang.String LOCALE_RECORD_FILE_TAG = "locales";
    static final java.lang.String TAG = "AppLocalesStorageHelper";

    static class SerialExecutor implements java.util.concurrent.Executor {
        java.lang.Runnable mActive;
        final java.util.concurrent.Executor mExecutor;
        private final java.lang.Object mLock;
        final java.util.Queue<java.lang.Runnable> mTasks;

        SerialExecutor(java.util.concurrent.Executor r2) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.mLock = r0
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r1.mTasks = r0
                r1.mExecutor = r2
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r4) {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                java.util.Queue<java.lang.Runnable> r1 = r3.mTasks     // Catch: java.lang.Throwable -> L16
                androidx.appcompat.app.AppLocalesStorageHelper$SerialExecutor$$ExternalSyntheticLambda0 r2 = new androidx.appcompat.app.AppLocalesStorageHelper$SerialExecutor$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L16
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L16
                r1.add(r2)     // Catch: java.lang.Throwable -> L16
                java.lang.Runnable r1 = r3.mActive     // Catch: java.lang.Throwable -> L16
                if (r1 != 0) goto L14
                r3.scheduleNext()     // Catch: java.lang.Throwable -> L16
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                return
            L16:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                throw r1
        }

        /* JADX INFO: renamed from: lambda$execute$0$androidx-appcompat-app-AppLocalesStorageHelper$SerialExecutor */
        /* synthetic */ void m4xd188c474(java.lang.Runnable r2) {
                r1 = this;
                r2.run()     // Catch: java.lang.Throwable -> L8
                r1.scheduleNext()
                return
            L8:
                r0 = move-exception
                r1.scheduleNext()
                throw r0
        }

        protected void scheduleNext() {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                java.util.Queue<java.lang.Runnable> r1 = r3.mTasks     // Catch: java.lang.Throwable -> L18
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L18
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L18
                r3.mActive = r1     // Catch: java.lang.Throwable -> L18
                if (r1 == 0) goto L16
                java.util.concurrent.Executor r1 = r3.mExecutor     // Catch: java.lang.Throwable -> L18
                java.lang.Runnable r2 = r3.mActive     // Catch: java.lang.Throwable -> L18
                r1.execute(r2)     // Catch: java.lang.Throwable -> L18
            L16:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                return
            L18:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r1
        }
    }

    static class ThreadPerTaskExecutor implements java.util.concurrent.Executor {
        ThreadPerTaskExecutor() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                java.lang.Thread r0 = new java.lang.Thread
                r0.<init>(r2)
                r0.start()
                return
        }
    }

    private AppLocalesStorageHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static void persistLocales(android.content.Context r7, java.lang.String r8) {
            java.lang.String r0 = "locales"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            boolean r2 = r8.equals(r2)
            java.lang.String r3 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            if (r2 == 0) goto L12
            r7.deleteFile(r3)
            return
        L12:
            r2 = 0
            java.io.FileOutputStream r2 = r7.openFileOutput(r3, r2)     // Catch: java.io.FileNotFoundException -> L85
            org.xmlpull.v1.XmlSerializer r3 = android.util.Xml.newSerializer()
            r4 = 0
            r3.setOutput(r2, r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.String r5 = "UTF-8"
            r6 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            r3.startDocument(r5, r6)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            r3.startTag(r4, r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.String r5 = "application_locales"
            r3.attribute(r4, r5, r8)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            r3.endTag(r4, r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            r3.endDocument()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            r0.<init>()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.String r4 = "Storing App Locales : app-locales: "
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.StringBuilder r0 = r0.append(r8)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.String r4 = " persisted successfully."
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            android.util.Log.d(r1, r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            if (r2 == 0) goto L7c
            r2.close()     // Catch: java.io.IOException -> L7a
            goto L79
        L5a:
            r0 = move-exception
            goto L7d
        L5c:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r4.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = "Storing App Locales : Failed to persist app-locales: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r4 = r4.append(r8)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5a
            android.util.Log.w(r1, r4, r0)     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L7c
            r2.close()     // Catch: java.io.IOException -> L7a
        L79:
            goto L7c
        L7a:
            r0 = move-exception
            goto L79
        L7c:
            return
        L7d:
            if (r2 == 0) goto L84
            r2.close()     // Catch: java.io.IOException -> L83
            goto L84
        L83:
            r1 = move-exception
        L84:
            throw r0
        L85:
            r0 = move-exception
            java.lang.String r2 = "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = java.lang.String.format(r2, r3)
            android.util.Log.w(r1, r2)
            return
    }

    static java.lang.String readLocales(android.content.Context r10) {
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r10.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L87
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L51
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L51
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L51
        L18:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L51
            r7 = r6
            r8 = 1
            if (r6 == r8) goto L45
            r6 = 3
            if (r7 != r6) goto L29
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L51
            if (r8 <= r5) goto L45
        L29:
            if (r7 == r6) goto L18
            r6 = 4
            if (r7 != r6) goto L2f
            goto L18
        L2f:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L51
            java.lang.String r8 = "locales"
            boolean r8 = r6.equals(r8)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L51
            if (r8 == 0) goto L44
            java.lang.String r8 = "application_locales"
            r9 = 0
            java.lang.String r8 = r4.getAttributeValue(r9, r8)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f org.xmlpull.v1.XmlPullParserException -> L51
            r2 = r8
            goto L45
        L44:
            goto L18
        L45:
            if (r3 == 0) goto L5e
            r3.close()     // Catch: java.io.IOException -> L4b
        L4a:
            goto L5e
        L4b:
            r4 = move-exception
            goto L4a
        L4d:
            r0 = move-exception
            goto L7f
        L4f:
            r4 = move-exception
            goto L52
        L51:
            r4 = move-exception
        L52:
            java.lang.String r5 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r5)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L5e
            r3.close()     // Catch: java.io.IOException -> L4b
            goto L4a
        L5e:
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L7b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
            goto L7e
        L7b:
            r10.deleteFile(r0)
        L7e:
            return r2
        L7f:
            if (r3 == 0) goto L86
            r3.close()     // Catch: java.io.IOException -> L85
            goto L86
        L85:
            r1 = move-exception
        L86:
            throw r0
        L87:
            r0 = move-exception
            java.lang.String r3 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r3)
            return r2
    }

    static void syncLocalesToFramework(android.content.Context r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L3d
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r1 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r5, r1)
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            int r1 = r1.getComponentEnabledSetting(r0)
            r2 = 1
            if (r1 == r2) goto L3d
            androidx.core.os.LocaleListCompat r1 = androidx.appcompat.app.AppCompatDelegate.getApplicationLocales()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L36
            java.lang.String r1 = readLocales(r5)
            java.lang.String r3 = "locale"
            java.lang.Object r3 = r5.getSystemService(r3)
            if (r3 == 0) goto L36
        L2f:
            android.os.LocaleList r4 = androidx.appcompat.app.AppCompatDelegate.Api24Impl.localeListForLanguageTags(r1)
            androidx.appcompat.app.AppCompatDelegate.Api33Impl.localeManagerSetApplicationLocales(r3, r4)
        L36:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r1.setComponentEnabledSetting(r0, r2, r2)
        L3d:
            return
    }
}
