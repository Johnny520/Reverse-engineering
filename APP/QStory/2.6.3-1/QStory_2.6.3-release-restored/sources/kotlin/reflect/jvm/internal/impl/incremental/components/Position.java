package kotlin.reflect.jvm.internal.impl.incremental.components;

import androidx.activity.AbstractC0900;
import java.io.Serializable;
import p092.C7793;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class Position implements Serializable {
    public static final C7793 Companion = new C7793();
    private static final Position NO_POSITION = new Position(-1, -1);
    private final int column;
    private final int line;

    public Position(int i, int i2) {
        this.line = i;
        this.column = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.line == position.line && this.column == position.column;
    }

    public int hashCode() {
        return Integer.hashCode(this.column) + (Integer.hashCode(this.line) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Position(line=");
        sb.append(this.line);
        sb.append(", column=");
        return AbstractC0900.m716(sb, this.column, ')');
    }
}
