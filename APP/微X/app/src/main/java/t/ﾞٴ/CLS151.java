// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import java.io.File;
import java.util.Comparator;

public final class CLS151 implements Comparator {
    public final int FLD1038;

    public CLS151(int v) {
        this.FLD1038 = v;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        if(this.FLD1038 == 0) {
            return ((String)object0).compareTo(((String)object1));
        }
        if(((File)object0).isFile() && ((File)object1).isFile() || ((File)object0).isDirectory() && ((File)object1).isDirectory()) {
            return ((File)object0).getName().toLowerCase().compareTo(((File)object1).getName().toLowerCase());
        }
        if(((File)object0).isDirectory() && ((File)object1).isFile()) {
            return -1;
        }
        return !((File)object0).isFile() || !((File)object1).isDirectory() ? 0 : 1;
    }
}

