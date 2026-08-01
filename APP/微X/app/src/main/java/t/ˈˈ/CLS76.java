// Decompiled by JEB v5.42.0.202606242140

package t.ˈˈ;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public final class CLS76 implements Externalizable {
    public int FLD576;
    public int FLD577;

    public CLS76() {
    }

    public CLS76(int v, int v1) {
        this.FLD576 = v;
        this.FLD577 = v1;
    }

    @Override
    public final void readExternal(ObjectInput objectInput0) {
        this.FLD576 = objectInput0.readByte();
        this.FLD577 = objectInput0.readByte();
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput0) {
        objectOutput0.writeByte(this.FLD576);
        objectOutput0.writeByte(this.FLD577);
    }
}

