package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class Zip64RequiredException extends ZipException {
    static final String ARCHIVE_TOO_BIG_MESSAGE = "Archive's size exceeds the limit of 4GByte.";
    static final String CENTRAL_DIRECTORY_DISK_NUMBER_TOO_BIG_MESSAGE = "Number of the disk with the start of Central Directory exceeds the limit of 65535.";
    static final String CENTRAL_DIRECTORY_SIZE_TOO_BIG_MESSAGE = "The size of the entire central directory exceeds the limit of 4GByte.";
    static final String DISK_NUMBER_TOO_BIG_MESSAGE = "Number of the disk of End Of Central Directory exceeds the limit of 65535.";
    static final String TOO_MANY_ENTRIES_MESSAGE = "Archive contains more than 65535 entries.";
    static final String TOO_MANY_ENTRIES_ON_DISK_MESSAGE = "Number of entries on this disk exceeds the limit of 65535.";
    private static final long serialVersionUID = 20110809;

    public Zip64RequiredException(String str) {
        super(str);
    }

    public static String getEntryTooBigMessage(C5584 c5584) {
        return c5584.getName() + "'s size exceeds the limit of 4GByte.";
    }
}
