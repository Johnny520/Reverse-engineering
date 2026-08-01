package org.apache.commons.compress.archivers.sevenz;

import java.util.HashMap;
import kotlin.reflect.jvm.internal.AbstractC5061;
import org.tukaani.xz.ARMOptions;
import org.tukaani.xz.ARMThumbOptions;
import org.tukaani.xz.IA64Options;
import org.tukaani.xz.PowerPCOptions;
import org.tukaani.xz.SPARCOptions;
import org.tukaani.xz.X86Options;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
class Coders$1 extends HashMap<SevenZMethod, AbstractC5061> {
    private static final long serialVersionUID = 1664829131806520867L;

    public Coders$1() {
        put(SevenZMethod.COPY, new C5577());
        put(SevenZMethod.LZMA, new C5574());
        put(SevenZMethod.LZMA2, new C5575());
        put(SevenZMethod.DEFLATE, new C5577());
        put(SevenZMethod.DEFLATE64, new C5577());
        put(SevenZMethod.BZIP2, new C5577());
        put(SevenZMethod.AES256SHA256, new C5577());
        SevenZMethod sevenZMethod = SevenZMethod.BCJ_X86_FILTER;
        new X86Options();
        put(sevenZMethod, new C5577());
        SevenZMethod sevenZMethod2 = SevenZMethod.BCJ_PPC_FILTER;
        new PowerPCOptions();
        put(sevenZMethod2, new C5577());
        SevenZMethod sevenZMethod3 = SevenZMethod.BCJ_IA64_FILTER;
        new IA64Options();
        put(sevenZMethod3, new C5577());
        SevenZMethod sevenZMethod4 = SevenZMethod.BCJ_ARM_FILTER;
        new ARMOptions();
        put(sevenZMethod4, new C5577());
        SevenZMethod sevenZMethod5 = SevenZMethod.BCJ_ARM_THUMB_FILTER;
        new ARMThumbOptions();
        put(sevenZMethod5, new C5577());
        SevenZMethod sevenZMethod6 = SevenZMethod.BCJ_SPARC_FILTER;
        new SPARCOptions();
        put(sevenZMethod6, new C5577());
        put(SevenZMethod.DELTA_FILTER, new C5577());
    }
}
