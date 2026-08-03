package androidx.startup;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends android.content.ContentProvider {
    public InitializationProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public final int delete(@Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4544 java.lang.String r2, @Yue.InterfaceC4544 java.lang.String[] r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    @Yue.InterfaceC4544
    public final java.lang.String getType(@Yue.InterfaceC4410 android.net.Uri r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not allowed."
            r2.<init>(r0)
            throw r2
    }

    @Override // android.content.ContentProvider
    @Yue.InterfaceC4544
    public final android.net.Uri insert(@Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4544 android.content.ContentValues r2) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L15
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 == 0) goto L13
            Yue.ۥ۟ۡۥۢ r0 = Yue.C0532.m1881(r0)
            r0.m1883()
        L13:
            r0 = 1
            return r0
        L15:
            Yue.ۥۢ۠ r0 = new Yue.ۥۢ۠
            java.lang.String r1 = "Context cannot be null"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    @Yue.InterfaceC4544
    public final android.database.Cursor query(@Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4544 java.lang.String[] r2, @Yue.InterfaceC4544 java.lang.String r3, @Yue.InterfaceC4544 java.lang.String[] r4, @Yue.InterfaceC4544 java.lang.String r5) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public final int update(@Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4544 android.content.ContentValues r2, @Yue.InterfaceC4544 java.lang.String r3, @Yue.InterfaceC4544 java.lang.String[] r4) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }
}
