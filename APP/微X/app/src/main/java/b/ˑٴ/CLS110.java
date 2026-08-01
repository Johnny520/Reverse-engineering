// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import b.ʾᵢ.CLS34;
import java.io.File;
import java.util.Comparator;
import java.util.Map.Entry;

public final class CLS110 implements Comparator {
    public final int FLD688;

    public CLS110(int v) {
        this.FLD688 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override
    public final int compare(Object object0, Object object1) {
        long v = 0L;
        switch(this.FLD688) {
            case 0: {
                return ((Integer)((Map.Entry)object1).getValue()).compareTo(((Integer)((Map.Entry)object0).getValue()));
            }
            case 1: {
                if(((File)object0).isFile() && ((File)object1).isFile() || ((File)object0).isDirectory() && ((File)object1).isDirectory()) {
                    return ((File)object0).getName().toLowerCase().compareTo(((File)object1).getName().toLowerCase());
                }
                if(((File)object0).isDirectory() && ((File)object1).isFile()) {
                    return -1;
                }
                return !((File)object0).isFile() || !((File)object1).isDirectory() ? 0 : 1;
            }
            case 2: {
                if(((File)object0).isFile() && ((File)object1).isFile() || ((File)object0).isDirectory() && ((File)object1).isDirectory()) {
                    return ((File)object0).getName().toLowerCase().compareTo(((File)object1).getName().toLowerCase());
                }
                if(((File)object0).isDirectory() && ((File)object1).isFile()) {
                    return -1;
                }
                return !((File)object0).isFile() || !((File)object1).isDirectory() ? 0 : 1;
            }
            case 3: {
                if(((File)object0).lastModified() < ((File)object1).lastModified()) {
                    return 1;
                }
                return ((File)object0).lastModified() == ((File)object1).lastModified() ? 0 : -1;
            }
            case 4: {
                long v1 = ((ContentValues)object0).containsKey("time") ? CLS34.MTH1080(4101200087684535093L, ((ContentValues)object0)) : 0L;
                if(((ContentValues)object1).containsKey("time")) {
                    v = CLS34.MTH1080(4101200130634208053L, ((ContentValues)object1));
                }
                return Long.compare(v, v1);
            }
            case 5: {
                return ((ContentValues)object1).getAsInteger("todayCount").compareTo(((ContentValues)object0).getAsInteger("todayCount"));
            }
            case 6: {
                return ((ContentValues)object1).getAsInteger("count").compareTo(((ContentValues)object0).getAsInteger("count"));
            }
            default: {
                return ((String)object0).compareTo(((String)object1));
            }
        }
    }
}

