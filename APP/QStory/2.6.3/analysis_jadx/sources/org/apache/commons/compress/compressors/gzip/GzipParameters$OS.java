package org.apache.commons.compress.compressors.gzip;

import com.android.dx.io.Opcodes;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum GzipParameters$OS {
    ACORN_RISCOS(13),
    AMIGA(1),
    ATARI_TOS(5),
    CPM(9),
    FAT(0),
    HPFS(6),
    MACINTOSH(7),
    NTFS(11),
    QDOS(12),
    TOPS_20(10),
    UNIX(3),
    UNKNOWN(Opcodes.CONST_METHOD_TYPE),
    VM_CMS(4),
    VMS(2),
    Z_SYSTEM(8);

    private final int type;

    GzipParameters$OS(int i) {
        this.type = i;
    }

    public static GzipParameters$OS from(int i) {
        if (i == 255) {
            return UNKNOWN;
        }
        switch (i) {
            case 0:
                return FAT;
            case 1:
                return AMIGA;
            case 2:
                return VMS;
            case 3:
                return UNIX;
            case 4:
                return VM_CMS;
            case 5:
                return ATARI_TOS;
            case 6:
                return HPFS;
            case 7:
                return MACINTOSH;
            case 8:
                return Z_SYSTEM;
            case 9:
                return CPM;
            case 10:
                return TOPS_20;
            case 11:
                return NTFS;
            case 12:
                return QDOS;
            case 13:
                return ACORN_RISCOS;
            default:
                return UNKNOWN;
        }
    }

    public int type() {
        return this.type;
    }
}
