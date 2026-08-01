package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import java.util.zip.ZipException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class UnsupportedZipFeatureException extends ZipException {
    private static final long serialVersionUID = 20161219;
    private final transient C5584 entry;
    private final Feature reason;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class Feature implements Serializable {
        private static final long serialVersionUID = 4112582948775420359L;
        private final String name;
        public static final Feature ENCRYPTION = new Feature("encryption");
        public static final Feature METHOD = new Feature("compression method");
        public static final Feature DATA_DESCRIPTOR = new Feature("data descriptor");
        public static final Feature SPLITTING = new Feature("splitting");
        public static final Feature UNKNOWN_COMPRESSED_SIZE = new Feature("unknown compressed size");

        private Feature(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public UnsupportedZipFeatureException(ZipMethod zipMethod, C5584 c5584) {
        super("Unsupported compression method " + c5584.f15371 + " (" + zipMethod.name() + ") used in entry " + c5584.getName());
        this.reason = Feature.METHOD;
        this.entry = c5584;
    }

    public C5584 getEntry() {
        return this.entry;
    }

    public Feature getFeature() {
        return this.reason;
    }

    public UnsupportedZipFeatureException(Feature feature, C5584 c5584) {
        super("Unsupported feature " + feature + " used in entry " + c5584.getName());
        this.reason = feature;
        this.entry = c5584;
    }

    public UnsupportedZipFeatureException(Feature feature) {
        super("Unsupported feature " + feature + " used in archive.");
        this.reason = feature;
        this.entry = null;
    }
}
