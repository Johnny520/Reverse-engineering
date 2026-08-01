package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
enum CLI$Mode {
    LIST("Analysing") { // from class: org.apache.commons.compress.archivers.sevenz.CLI$Mode.1
        private String getContentMethods(AbstractC5574 abstractC5574) {
            throw null;
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CLI$Mode
        public void takeAction(AbstractC5573 abstractC5573, AbstractC5574 abstractC5574) {
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

    public abstract void takeAction(AbstractC5573 abstractC5573, AbstractC5574 abstractC5574);
}
