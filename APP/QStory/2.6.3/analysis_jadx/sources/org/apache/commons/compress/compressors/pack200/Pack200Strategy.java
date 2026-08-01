package org.apache.commons.compress.compressors.pack200;

import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum Pack200Strategy {
    IN_MEMORY { // from class: org.apache.commons.compress.compressors.pack200.Pack200Strategy.1
        @Override // org.apache.commons.compress.compressors.pack200.Pack200Strategy
        public AbstractC5625 newStreamBridge() {
            return new C5624(new ByteArrayOutputStream());
        }
    },
    TEMP_FILE { // from class: org.apache.commons.compress.compressors.pack200.Pack200Strategy.2
        @Override // org.apache.commons.compress.compressors.pack200.Pack200Strategy
        public AbstractC5625 newStreamBridge() {
            return new C5624();
        }
    };

    public abstract AbstractC5625 newStreamBridge();
}
