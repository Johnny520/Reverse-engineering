package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1955 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f6125 = "tree";

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۨ$ۥ, reason: contains not printable characters */
    public static final class C1956 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final int f6126 = 512;

        public C1956() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۨ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C1957 {
        public C1957() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.net.Uri m9042(java.lang.String r0, java.lang.String r1) {
                android.net.Uri r0 = android.provider.DocumentsContract.buildChildDocumentsUri(r0, r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.net.Uri m9043(android.net.Uri r0, java.lang.String r1) {
                android.net.Uri r0 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r0, r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.net.Uri m9044(android.net.Uri r0, java.lang.String r1) {
                android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r0, r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static android.net.Uri m9045(java.lang.String r0, java.lang.String r1) {
                android.net.Uri r0 = android.provider.DocumentsContract.buildTreeDocumentUri(r0, r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static android.net.Uri m9046(android.content.ContentResolver r0, android.net.Uri r1, java.lang.String r2, java.lang.String r3) throws java.io.FileNotFoundException {
                android.net.Uri r0 = android.provider.DocumentsContract.createDocument(r0, r1, r2, r3)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static java.lang.String m9047(android.net.Uri r0) {
                java.lang.String r0 = android.provider.DocumentsContract.getTreeDocumentId(r0)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static android.net.Uri m9048(@Yue.InterfaceC4410 android.content.ContentResolver r0, @Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4410 java.lang.String r2) throws java.io.FileNotFoundException {
                android.net.Uri r0 = android.provider.DocumentsContract.renameDocument(r0, r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۨ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C1958 {
        public C1958() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m9049(@Yue.InterfaceC4410 android.net.Uri r0) {
                boolean r0 = android.provider.DocumentsContract.isTreeUri(r0)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m9050(android.content.ContentResolver r0, android.net.Uri r1, android.net.Uri r2) throws java.io.FileNotFoundException {
                boolean r0 = android.provider.DocumentsContract.removeDocument(r0, r1, r2)
                return r0
        }
    }

    public C1955() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.net.Uri m9030(@Yue.InterfaceC4410 java.lang.String r0, @Yue.InterfaceC4544 java.lang.String r1) {
            android.net.Uri r0 = Yue.C1955.C1957.m9042(r0, r1)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.net.Uri m9031(@Yue.InterfaceC4410 android.net.Uri r0, @Yue.InterfaceC4410 java.lang.String r1) {
            android.net.Uri r0 = Yue.C1955.C1957.m9043(r0, r1)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.net.Uri m9032(@Yue.InterfaceC4410 java.lang.String r0, @Yue.InterfaceC4410 java.lang.String r1) {
            android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUri(r0, r1)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static android.net.Uri m9033(@Yue.InterfaceC4410 android.net.Uri r0, @Yue.InterfaceC4410 java.lang.String r1) {
            android.net.Uri r0 = Yue.C1955.C1957.m9044(r0, r1)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static android.net.Uri m9034(@Yue.InterfaceC4410 java.lang.String r0, @Yue.InterfaceC4410 java.lang.String r1) {
            android.net.Uri r0 = Yue.C1955.C1957.m9045(r0, r1)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static android.net.Uri m9035(@Yue.InterfaceC4410 android.content.ContentResolver r0, @Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 java.lang.String r3) throws java.io.FileNotFoundException {
            android.net.Uri r0 = Yue.C1955.C1957.m9046(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.lang.String m9036(@Yue.InterfaceC4410 android.net.Uri r0) {
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r0)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static java.lang.String m9037(@Yue.InterfaceC4410 android.net.Uri r0) {
            java.lang.String r0 = Yue.C1955.C1957.m9047(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m9038(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4544 android.net.Uri r1) {
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m9039(@Yue.InterfaceC4410 android.net.Uri r0) {
            boolean r0 = Yue.C1955.C1958.m9049(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m9040(@Yue.InterfaceC4410 android.content.ContentResolver r0, @Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4410 android.net.Uri r2) throws java.io.FileNotFoundException {
            boolean r0 = Yue.C1955.C1958.m9050(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static android.net.Uri m9041(@Yue.InterfaceC4410 android.content.ContentResolver r0, @Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4410 java.lang.String r2) throws java.io.FileNotFoundException {
            android.net.Uri r0 = Yue.C1955.C1957.m9048(r0, r1, r2)
            return r0
    }
}
