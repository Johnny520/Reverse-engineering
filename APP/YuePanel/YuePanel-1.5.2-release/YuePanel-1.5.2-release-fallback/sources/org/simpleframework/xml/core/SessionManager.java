package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class SessionManager {
    private java.lang.ThreadLocal<org.simpleframework.xml.core.SessionManager.Reference> local;

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
                org.simpleframework.xml.core.Session r0 = r1.session
                return r0
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

    private org.simpleframework.xml.core.Session create(boolean r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.SessionManager$Reference r0 = new org.simpleframework.xml.core.SessionManager$Reference
            r0.<init>(r2)
            java.lang.ThreadLocal<org.simpleframework.xml.core.SessionManager$Reference> r2 = r1.local
            r2.set(r0)
            org.simpleframework.xml.core.Session r2 = r0.get()
            return r2
    }

    public void close() throws java.lang.Exception {
            r3 = this;
            java.lang.ThreadLocal<org.simpleframework.xml.core.SessionManager$Reference> r0 = r3.local
            java.lang.Object r0 = r0.get()
            org.simpleframework.xml.core.SessionManager$Reference r0 = (org.simpleframework.xml.core.SessionManager.Reference) r0
            if (r0 == 0) goto L16
            int r0 = r0.clear()
            if (r0 != 0) goto L15
            java.lang.ThreadLocal<org.simpleframework.xml.core.SessionManager$Reference> r0 = r3.local
            r0.remove()
        L15:
            return
        L16:
            org.simpleframework.xml.core.PersistenceException r0 = new org.simpleframework.xml.core.PersistenceException
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Session does not exist"
            r0.<init>(r2, r1)
            throw r0
    }

    public org.simpleframework.xml.core.Session open() throws java.lang.Exception {
            r1 = this;
            r0 = 1
            org.simpleframework.xml.core.Session r0 = r1.open(r0)
            return r0
    }

    public org.simpleframework.xml.core.Session open(boolean r2) throws java.lang.Exception {
            r1 = this;
            java.lang.ThreadLocal<org.simpleframework.xml.core.SessionManager$Reference> r0 = r1.local
            java.lang.Object r0 = r0.get()
            org.simpleframework.xml.core.SessionManager$Reference r0 = (org.simpleframework.xml.core.SessionManager.Reference) r0
            if (r0 == 0) goto Lf
            org.simpleframework.xml.core.Session r2 = r0.get()
            return r2
        Lf:
            org.simpleframework.xml.core.Session r2 = r1.create(r2)
            return r2
    }
}
