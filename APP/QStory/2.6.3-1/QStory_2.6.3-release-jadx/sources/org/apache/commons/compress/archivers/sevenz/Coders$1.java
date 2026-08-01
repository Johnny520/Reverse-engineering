package org.apache.commons.compress.archivers.sevenz;

import com.alibaba.fastjson2.AbstractC3738;
import java.util.HashMap;
import org.tukaani.xz.ARMOptions;
import org.tukaani.xz.ARMThumbOptions;
import org.tukaani.xz.IA64Options;
import org.tukaani.xz.PowerPCOptions;
import org.tukaani.xz.SPARCOptions;
import org.tukaani.xz.X86Options;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
class Coders$1 extends HashMap<SevenZMethod, AbstractC3738> {
    private static final long serialVersionUID = 1664829131806520867L;

    public Coders$1() {
        put(SevenZMethod.COPY, new C6408());
        put(SevenZMethod.LZMA, new C6405());
        put(SevenZMethod.LZMA2, new C6406());
        put(SevenZMethod.DEFLATE, new C6408());
        put(SevenZMethod.DEFLATE64, new C6408());
        put(SevenZMethod.BZIP2, new C6408());
        put(SevenZMethod.AES256SHA256, new C6408());
        SevenZMethod sevenZMethod = SevenZMethod.BCJ_X86_FILTER;
        new X86Options();
        put(sevenZMethod, new C6408());
        SevenZMethod sevenZMethod2 = SevenZMethod.BCJ_PPC_FILTER;
        new PowerPCOptions();
        put(sevenZMethod2, new C6408());
        SevenZMethod sevenZMethod3 = SevenZMethod.BCJ_IA64_FILTER;
        new IA64Options();
        put(sevenZMethod3, new C6408());
        SevenZMethod sevenZMethod4 = SevenZMethod.BCJ_ARM_FILTER;
        new ARMOptions();
        put(sevenZMethod4, new C6408());
        SevenZMethod sevenZMethod5 = SevenZMethod.BCJ_ARM_THUMB_FILTER;
        new ARMThumbOptions();
        put(sevenZMethod5, new C6408());
        SevenZMethod sevenZMethod6 = SevenZMethod.BCJ_SPARC_FILTER;
        new SPARCOptions();
        put(sevenZMethod6, new C6408());
        put(SevenZMethod.DELTA_FILTER, new C6408());
    }
}
