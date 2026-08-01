package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import java.util.zip.ZipException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class UnsupportedZipFeatureException extends ZipException {
    private static final long serialVersionUID = 20161219;
    private final transient C6415 entry;
    private final Feature reason;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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

    public UnsupportedZipFeatureException(ZipMethod zipMethod, C6415 c6415) {
        super("Unsupported compression method " + c6415.f15716 + " (" + zipMethod.name() + ") used in entry " + c6415.getName());
        this.reason = Feature.METHOD;
        this.entry = c6415;
    }

    public C6415 getEntry() {
        return this.entry;
    }

    public Feature getFeature() {
        return this.reason;
    }

    public UnsupportedZipFeatureException(Feature feature, C6415 c6415) {
        super("Unsupported feature " + feature + " used in entry " + c6415.getName());
        this.reason = feature;
        this.entry = c6415;
    }

    public UnsupportedZipFeatureException(Feature feature) {
        super("Unsupported feature " + feature + " used in archive.");
        this.reason = feature;
        this.entry = null;
    }
}
