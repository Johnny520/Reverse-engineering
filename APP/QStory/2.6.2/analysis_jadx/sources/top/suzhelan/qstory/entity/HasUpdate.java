package top.suzhelan.qstory.entity;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Ltop/suzhelan/qstory/entity/HasUpdate;", "", "hasUpdate", "", "isForceUpdate", "version", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ZZI)V", "getHasUpdate", "()Z", "getVersion", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final /* data */ class HasUpdate {
    public static final int $stable = 0;
    private final boolean hasUpdate;
    private final boolean isForceUpdate;
    private final int version;

    public HasUpdate(boolean z, boolean z2, int i) {
        this.hasUpdate = z;
        this.isForceUpdate = z2;
        this.version = i;
    }

    public static /* synthetic */ HasUpdate copy$default(HasUpdate hasUpdate, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = hasUpdate.hasUpdate;
        }
        if ((i2 & 2) != 0) {
            z2 = hasUpdate.isForceUpdate;
        }
        if ((i2 & 4) != 0) {
            i = hasUpdate.version;
        }
        return hasUpdate.copy(z, z2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasUpdate() {
        return this.hasUpdate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsForceUpdate() {
        return this.isForceUpdate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final HasUpdate copy(boolean hasUpdate, boolean isForceUpdate, int version) {
        return new HasUpdate(hasUpdate, isForceUpdate, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HasUpdate)) {
            return false;
        }
        HasUpdate hasUpdate = (HasUpdate) other;
        return this.hasUpdate == hasUpdate.hasUpdate && this.isForceUpdate == hasUpdate.isForceUpdate && this.version == hasUpdate.version;
    }

    public final boolean getHasUpdate() {
        return this.hasUpdate;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Integer.hashCode(this.version) + AbstractC0053.m140(Boolean.hashCode(this.hasUpdate) * 31, 31, this.isForceUpdate);
    }

    public final boolean isForceUpdate() {
        return this.isForceUpdate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937706723788457383L));
        sb.append(this.hasUpdate);
        sb.append(AbstractC3056.m6668(-3937706676543817127L));
        sb.append(this.isForceUpdate);
        sb.append(AbstractC3056.m6668(-3937706612119307687L));
        return AbstractC0053.m154(sb, this.version, ')');
    }
}
