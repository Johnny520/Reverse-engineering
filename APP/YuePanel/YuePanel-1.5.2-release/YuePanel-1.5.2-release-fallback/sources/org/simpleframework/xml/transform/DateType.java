package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
enum DateType extends java.lang.Enum<org.simpleframework.xml.transform.DateType> {
    private static final /* synthetic */ org.simpleframework.xml.transform.DateType[] $VALUES = null;
    public static final org.simpleframework.xml.transform.DateType FULL = null;
    public static final org.simpleframework.xml.transform.DateType LONG = null;
    public static final org.simpleframework.xml.transform.DateType NORMAL = null;
    public static final org.simpleframework.xml.transform.DateType SHORT = null;
    private org.simpleframework.xml.transform.DateType.DateFormat format;

    public static class DateFormat {
        private java.text.SimpleDateFormat format;

        public DateFormat(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                r0.<init>(r2)
                r1.format = r0
                return
        }

        public synchronized java.util.Date getDate(java.lang.String r2) throws java.lang.Exception {
                r1 = this;
                monitor-enter(r1)
                java.text.SimpleDateFormat r0 = r1.format     // Catch: java.lang.Throwable -> L9
                java.util.Date r2 = r0.parse(r2)     // Catch: java.lang.Throwable -> L9
                monitor-exit(r1)
                return r2
            L9:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                throw r2
        }

        public synchronized java.lang.String getText(java.util.Date r2) throws java.lang.Exception {
                r1 = this;
                monitor-enter(r1)
                java.text.SimpleDateFormat r0 = r1.format     // Catch: java.lang.Throwable -> L9
                java.lang.String r2 = r0.format(r2)     // Catch: java.lang.Throwable -> L9
                monitor-exit(r1)
                return r2
            L9:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                throw r2
        }
    }

    static {
            org.simpleframework.xml.transform.DateType r0 = new org.simpleframework.xml.transform.DateType
            r1 = 0
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss.S z"
            java.lang.String r3 = "FULL"
            r0.<init>(r3, r1, r2)
            org.simpleframework.xml.transform.DateType.FULL = r0
            org.simpleframework.xml.transform.DateType r1 = new org.simpleframework.xml.transform.DateType
            r2 = 1
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss z"
            java.lang.String r4 = "LONG"
            r1.<init>(r4, r2, r3)
            org.simpleframework.xml.transform.DateType.LONG = r1
            org.simpleframework.xml.transform.DateType r2 = new org.simpleframework.xml.transform.DateType
            r3 = 2
            java.lang.String r4 = "yyyy-MM-dd z"
            java.lang.String r5 = "NORMAL"
            r2.<init>(r5, r3, r4)
            org.simpleframework.xml.transform.DateType.NORMAL = r2
            org.simpleframework.xml.transform.DateType r3 = new org.simpleframework.xml.transform.DateType
            r4 = 3
            java.lang.String r5 = "yyyy-MM-dd"
            java.lang.String r6 = "SHORT"
            r3.<init>(r6, r4, r5)
            org.simpleframework.xml.transform.DateType.SHORT = r3
            org.simpleframework.xml.transform.DateType[] r0 = new org.simpleframework.xml.transform.DateType[]{r0, r1, r2, r3}
            org.simpleframework.xml.transform.DateType.$VALUES = r0
            return
    }

    DateType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            org.simpleframework.xml.transform.DateType$DateFormat r1 = new org.simpleframework.xml.transform.DateType$DateFormat
            r1.<init>(r3)
            r0.format = r1
            return
    }

    public static java.util.Date getDate(java.lang.String r1) throws java.lang.Exception {
            org.simpleframework.xml.transform.DateType r0 = getType(r1)
            org.simpleframework.xml.transform.DateType$DateFormat r0 = r0.getFormat()
            java.util.Date r1 = r0.getDate(r1)
            return r1
    }

    private org.simpleframework.xml.transform.DateType.DateFormat getFormat() {
            r1 = this;
            org.simpleframework.xml.transform.DateType$DateFormat r0 = r1.format
            return r0
    }

    public static java.lang.String getText(java.util.Date r1) throws java.lang.Exception {
            org.simpleframework.xml.transform.DateType r0 = org.simpleframework.xml.transform.DateType.FULL
            org.simpleframework.xml.transform.DateType$DateFormat r0 = r0.getFormat()
            java.lang.String r1 = r0.getText(r1)
            return r1
    }

    public static org.simpleframework.xml.transform.DateType getType(java.lang.String r1) {
            int r1 = r1.length()
            r0 = 23
            if (r1 <= r0) goto Lb
            org.simpleframework.xml.transform.DateType r1 = org.simpleframework.xml.transform.DateType.FULL
            return r1
        Lb:
            r0 = 20
            if (r1 <= r0) goto L12
            org.simpleframework.xml.transform.DateType r1 = org.simpleframework.xml.transform.DateType.LONG
            return r1
        L12:
            r0 = 11
            if (r1 <= r0) goto L19
            org.simpleframework.xml.transform.DateType r1 = org.simpleframework.xml.transform.DateType.NORMAL
            return r1
        L19:
            org.simpleframework.xml.transform.DateType r1 = org.simpleframework.xml.transform.DateType.SHORT
            return r1
    }

    public static org.simpleframework.xml.transform.DateType valueOf(java.lang.String r1) {
            java.lang.Class<org.simpleframework.xml.transform.DateType> r0 = org.simpleframework.xml.transform.DateType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.simpleframework.xml.transform.DateType r1 = (org.simpleframework.xml.transform.DateType) r1
            return r1
    }

    public static org.simpleframework.xml.transform.DateType[] values() {
            org.simpleframework.xml.transform.DateType[] r0 = org.simpleframework.xml.transform.DateType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.simpleframework.xml.transform.DateType[] r0 = (org.simpleframework.xml.transform.DateType[]) r0
            return r0
    }
}
