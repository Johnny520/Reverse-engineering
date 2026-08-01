package org.apache.commons.compress.compressors.pack200;

import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum Pack200Strategy {
    IN_MEMORY { // from class: org.apache.commons.compress.compressors.pack200.Pack200Strategy.1
        @Override // org.apache.commons.compress.compressors.pack200.Pack200Strategy
        public AbstractC5624 newStreamBridge() {
            return new C5623(new ByteArrayOutputStream());
        }
    },
    TEMP_FILE { // from class: org.apache.commons.compress.compressors.pack200.Pack200Strategy.2
        @Override // org.apache.commons.compress.compressors.pack200.Pack200Strategy
        public AbstractC5624 newStreamBridge() {
            return new C5623();
        }
    };

    public abstract AbstractC5624 newStreamBridge();
}
