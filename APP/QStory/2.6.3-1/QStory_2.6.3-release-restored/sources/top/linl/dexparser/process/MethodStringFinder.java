package top.linl.dexparser.process;

import java.util.Iterator;
import top.linl.dexparser.DexParser;
import top.linl.dexparser.bean.ids.DexMethodId;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
