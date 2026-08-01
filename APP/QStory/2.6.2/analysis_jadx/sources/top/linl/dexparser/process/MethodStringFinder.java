package top.linl.dexparser.process;

import java.util.Iterator;
import top.linl.dexparser.DexParser;
import top.linl.dexparser.bean.ids.DexMethodId;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class MethodStringFinder extends BaseFinder {
    private final String[] findString;

    public MethodStringFinder(String... strArr) {
        this.findString = strArr;
    }

    @Override // top.linl.dexparser.process.BaseFinder
    public void startParserMethodId(DexParser dexParser, DexMethodId dexMethodId) {
        if (dexMethodId.getUsedStringList() == null) {
            return;
        }
        Iterator<Integer> it = dexMethodId.getUsedStringList().iterator();
        int i = 0;
        while (it.hasNext()) {
            String string = dexParser.dexStringIdsList[it.next().intValue()].getString(dexParser);
            for (String str : this.findString) {
                if (string.contains(str)) {
                    i++;
                }
            }
            if (i >= this.findString.length) {
                addMethodToResult(dexParser, dexMethodId);
                return;
            }
        }
    }
}
