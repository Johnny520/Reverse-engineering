package bsh.org.objectweb.asm;

import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Handle {
    private final String descriptor;
    private final boolean isInterface;
    private final String name;
    private final String owner;
    private final int tag;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public Handle(int i9, String str, String str2, String str3) {
        this(i9, str, str2, str3, i9 == 9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getDesc() {
        return this.descriptor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getOwner() {
        return this.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return (this.descriptor.hashCode() * this.name.hashCode() * this.owner.hashCode()) + this.tag + (this.isInterface ? 64 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isInterface() {
        return this.isInterface;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.owner);
        sb2.append('.');
        sb2.append(this.name);
        sb2.append(this.descriptor);
        sb2.append(" (");
        sb2.append(this.tag);
        return AbstractC0921a.m2254q(sb2, this.isInterface ? " itf" : HttpUrl.FRAGMENT_ENCODE_SET, ')');
    }

    public Handle(int i9, String str, String str2, String str3, boolean z9) {
        this.tag = i9;
        this.owner = str;
        this.name = str2;
        this.descriptor = str3;
        this.isInterface = z9;
    }
}
