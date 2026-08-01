package net.bytebuddy.jar.asm;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class Handle {
    private final String descriptor;
    private final boolean isInterface;
    private final String name;
    private final String owner;
    private final int tag;

    @Deprecated(forRemoval = false)
    public Handle(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, i == 9);
    }

    private static /* synthetic */ String stringConcat$0(String str, String str2, String str3, int i, String str4) {
        return str + "." + str2 + str3 + " (" + i + str4 + ")";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Handle)) {
            return false;
        }
        Handle handle = (Handle) obj;
        return this.tag == handle.tag && this.isInterface == handle.isInterface && this.owner.equals(handle.owner) && this.name.equals(handle.name) && this.descriptor.equals(handle.descriptor);
    }

    public String getDesc() {
        return this.descriptor;
    }

    public String getName() {
        return this.name;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (this.descriptor.hashCode() * this.name.hashCode() * this.owner.hashCode()) + this.tag + (this.isInterface ? 64 : 0);
    }

    public boolean isInterface() {
        return this.isInterface;
    }

    public String toString() {
        return stringConcat$0(this.owner, this.name, this.descriptor, this.tag, this.isInterface ? " itf" : "");
    }

    public Handle(int i, String str, String str2, String str3, boolean z) {
        this.tag = i;
        this.owner = str;
        this.name = str2;
        this.descriptor = str3;
        this.isInterface = z;
    }
}
