package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class SessionManager {
    private ThreadLocal<Reference> local = new ThreadLocal<>();

    public static class Reference {
        private int count;
        private Session session;

        public Reference(boolean z) {
            this.session = new Session(z);
        }

        public int clear() {
            int i = this.count - 1;
            this.count = i;
            return i;
        }

        public Session get() {
            int i = this.count;
            if (i >= 0) {
                this.count = i + 1;
            }
            return this.session;
        }
    }

    private Session create(boolean z) throws Exception {
        Reference reference = new Reference(z);
        this.local.set(reference);
        return reference.get();
    }

    public void close() throws Exception {
        Reference reference = this.local.get();
        if (reference == null) {
            throw new PersistenceException("Session does not exist", new Object[0]);
        }
        if (reference.clear() == 0) {
            this.local.remove();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Session open() throws Exception {
        return open(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Session open(boolean z) throws Exception {
        Reference reference = this.local.get();
        return reference != null ? reference.get() : create(z);
    }
}
