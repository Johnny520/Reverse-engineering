package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(30)
final class ColorResourcesLoaderCreator {
    private static final java.lang.String TAG = "ColorResLoaderCreator";

    private ColorResourcesLoaderCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    public static android.content.res.loader.ResourcesLoader create(@Yue.InterfaceC4410 android.content.Context r5, @Yue.InterfaceC4410 java.util.Map<java.lang.Integer, java.lang.Integer> r6) {
            java.lang.String r0 = "ColorResLoaderCreator"
            r1 = 0
            byte[] r5 = com.google.android.material.color.ColorResourcesTableCreator.create(r5, r6)     // Catch: java.lang.Exception -> L34
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L34
            r6.<init>()     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = "Table created, length: "
            r6.append(r2)     // Catch: java.lang.Exception -> L34
            int r2 = r5.length     // Catch: java.lang.Exception -> L34
            r6.append(r2)     // Catch: java.lang.Exception -> L34
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L34
            android.util.Log.i(r0, r6)     // Catch: java.lang.Exception -> L34
            int r6 = r5.length     // Catch: java.lang.Exception -> L34
            if (r6 != 0) goto L20
            return r1
        L20:
            java.lang.String r6 = "temp.arsc"
            r2 = 0
            java.io.FileDescriptor r6 = Yue.C1242.m6626(r6, r2)     // Catch: java.lang.Throwable -> L77
            if (r6 != 0) goto L39
            java.lang.String r5 = "Cannot create memory file descriptor."
            android.util.Log.w(r0, r5)     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L36
            android.system.Os.close(r6)     // Catch: java.lang.Exception -> L34
            goto L36
        L34:
            r5 = move-exception
            goto L7f
        L36:
            return r1
        L37:
            r5 = move-exception
            goto L79
        L39:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L37
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L37
            r2.write(r5)     // Catch: java.lang.Throwable -> L59
            android.os.ParcelFileDescriptor r5 = android.os.ParcelFileDescriptor.dup(r6)     // Catch: java.lang.Throwable -> L59
            Yue.C1246.m6630()     // Catch: java.lang.Throwable -> L62
            android.content.res.loader.ResourcesLoader r3 = Yue.C1245.m6629()     // Catch: java.lang.Throwable -> L62
            android.content.res.loader.ResourcesProvider r4 = Yue.C1243.m6627(r5, r1)     // Catch: java.lang.Throwable -> L62
            Yue.C1244.m6628(r3, r4)     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L5b
            r5.close()     // Catch: java.lang.Throwable -> L59
            goto L5b
        L59:
            r5 = move-exception
            goto L6e
        L5b:
            r2.close()     // Catch: java.lang.Throwable -> L37
            android.system.Os.close(r6)     // Catch: java.lang.Exception -> L34
            return r3
        L62:
            r3 = move-exception
            if (r5 == 0) goto L6d
            r5.close()     // Catch: java.lang.Throwable -> L69
            goto L6d
        L69:
            r5 = move-exception
            r3.addSuppressed(r5)     // Catch: java.lang.Throwable -> L59
        L6d:
            throw r3     // Catch: java.lang.Throwable -> L59
        L6e:
            r2.close()     // Catch: java.lang.Throwable -> L72
            goto L76
        L72:
            r2 = move-exception
            r5.addSuppressed(r2)     // Catch: java.lang.Throwable -> L37
        L76:
            throw r5     // Catch: java.lang.Throwable -> L37
        L77:
            r5 = move-exception
            r6 = r1
        L79:
            if (r6 == 0) goto L7e
            android.system.Os.close(r6)     // Catch: java.lang.Exception -> L34
        L7e:
            throw r5     // Catch: java.lang.Exception -> L34
        L7f:
            java.lang.String r6 = "Failed to create the ColorResourcesTableCreator."
            android.util.Log.e(r0, r6, r5)
            return r1
    }
}
