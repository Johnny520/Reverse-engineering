package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
enum CLI$Mode {
    LIST("Analysing") { // from class: org.apache.commons.compress.archivers.sevenz.CLI$Mode.1
        private String getContentMethods(AbstractC5573 abstractC5573) {
            throw null;
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CLI$Mode
        public void takeAction(AbstractC5572 abstractC5572, AbstractC5573 abstractC5573) {
            throw null;
        }
    };

    private final String message;

    CLI$Mode(String str) {
        this.message = str;
    }

    public String getMessage() {
        return this.message;
    }

    public abstract void takeAction(AbstractC5572 abstractC5572, AbstractC5573 abstractC5573);
}
