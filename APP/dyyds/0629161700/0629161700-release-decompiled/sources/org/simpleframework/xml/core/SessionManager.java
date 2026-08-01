package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class SessionManager {
    private java.lang.ThreadLocal<org.simpleframework.xml.core.SessionManager.Reference> local;

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class Reference {
        private int count;
        private org.simpleframework.xml.core.Session session;

        public Reference(boolean r2) {
                r1 = this;
                r1.<init>()
                org.simpleframework.xml.core.Session r0 = new org.simpleframework.xml.core.Session
                r0.<init>(r2)
                r1.session = r0
                return
        }

        public int clear() {
                r1 = this;
                int r0 = r1.count
                int r0 = r0 + (-1)
                r1.count = r0
                return r0
        }

        public org.simpleframework.xml.core.Session get() {
                r1 = this;
                int r0 = r1.count
                if (r0 < 0) goto L8
                int r0 = r0 + 1
                r1.count = r0
            L8:
                org.simpleframework.xml.core.Session r1 = r1.session
                return r1
        }
    }

    public SessionManager() {
            r1 = this;
            r1.<init>()
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.local = r0
            return
    }

    private org.simpleframework.xml.core.Session create(boolean r2) {
            r1 = this;
            org.simpleframework.xml.core.SessionManager$Reference r0 = new org.simpleframework.xml.core.SessionManager$Reference
            r0.<init>(r2)
            java.lang.ThreadLocal<org.simpleframework.xml.core.SessionManager$Reference> r1 = r1.local
            r1.set(r0)
            org.simpleframework.xml.core.Session r1 = r0.get()
            return r1
    }

    public void close() {
            r2 = this;
            java.lang.ThreadLocal<org.simpleframework.xml.core.SessionManager$Reference> r0 = r2.local
            java.lang.Object r0 = r0.get()
            org.simpleframework.xml.core.SessionManager$Reference r0 = (org.simpleframework.xml.core.SessionManager.Reference) r0
            if (r0 == 0) goto L16
            int r0 = r0.clear()
            if (r0 != 0) goto L15
            java.lang.ThreadLocal<org.simpleframework.xml.core.SessionManager$Reference> r2 = r2.local
            r2.remove()
        L15:
            return
        L16:
            org.simpleframework.xml.core.PersistenceException r2 = new org.simpleframework.xml.core.PersistenceException
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Session does not exist"
            r2.<init>(r1, r0)
            throw r2
    }

    public org.simpleframework.xml.core.Session open() {
            r1 = this;
            r0 = 1
            org.simpleframework.xml.core.Session r1 = r1.open(r0)
            return r1
    }

    public org.simpleframework.xml.core.Session open(boolean r2) {
            r1 = this;
            java.lang.ThreadLocal<org.simpleframework.xml.core.SessionManager$Reference> r0 = r1.local
            java.lang.Object r0 = r0.get()
            org.simpleframework.xml.core.SessionManager$Reference r0 = (org.simpleframework.xml.core.SessionManager.Reference) r0
            if (r0 == 0) goto Lf
            org.simpleframework.xml.core.Session r1 = r0.get()
            return r1
        Lf:
            org.simpleframework.xml.core.Session r1 = r1.create(r2)
            return r1
    }
}
