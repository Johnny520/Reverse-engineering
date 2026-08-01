package top.suzhelan.qstory.entity;

import androidx.activity.AbstractC0900;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006&"}, m151d2 = {"Ltop/suzhelan/qstory/entity/UpdateInfo;", "", "fileName", "", "forceUpdate", "", "id", "", "time", "Ljava/time/LocalDateTime;", "updateLog", "versionCode", "versionName", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ZILjava/time/LocalDateTime;Ljava/lang/String;ILjava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getForceUpdate", "()Z", "getId", "()I", "getTime", "()Ljava/time/LocalDateTime;", "getUpdateLog", "getVersionCode", "getVersionName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final /* data */ class UpdateInfo {
    public static final int $stable = 8;
    private final String fileName;
    private final boolean forceUpdate;
    private final int id;
    private final LocalDateTime time;
    private final String updateLog;
    private final int versionCode;
    private final String versionName;

    public UpdateInfo(String str, boolean z, int i, LocalDateTime localDateTime, String str2, int i2, String str3) {
        "fileName";
        str.getClass();
        "time";
        localDateTime.getClass();
        "updateLog";
        str2.getClass();
        "versionName";
        str3.getClass();
        this.fileName = str;
        this.forceUpdate = z;
        this.id = i;
        this.time = localDateTime;
        this.updateLog = str2;
        this.versionCode = i2;
        this.versionName = str3;
    }

    public static /* synthetic */ UpdateInfo copy$default(UpdateInfo updateInfo, String str, boolean z, int i, LocalDateTime localDateTime, String str2, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = updateInfo.fileName;
        }
        if ((i3 & 2) != 0) {
            z = updateInfo.forceUpdate;
        }
        if ((i3 & 4) != 0) {
            i = updateInfo.id;
        }
        if ((i3 & 8) != 0) {
            localDateTime = updateInfo.time;
        }
        if ((i3 & 16) != 0) {
            str2 = updateInfo.updateLog;
        }
        if ((i3 & 32) != 0) {
            i2 = updateInfo.versionCode;
        }
        if ((i3 & 64) != 0) {
            str3 = updateInfo.versionName;
        }
        int i4 = i2;
        String str4 = str3;
        String str5 = str2;
        int i5 = i;
        return updateInfo.copy(str, z, i5, localDateTime, str5, i4, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LocalDateTime getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUpdateLog() {
        return this.updateLog;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    public final UpdateInfo copy(String fileName, boolean forceUpdate, int id, LocalDateTime time, String updateLog, int versionCode, String versionName) {
        "fileName";
        fileName.getClass();
        "time";
        time.getClass();
        "updateLog";
        updateLog.getClass();
        "versionName";
        versionName.getClass();
        return new UpdateInfo(fileName, forceUpdate, id, time, updateLog, versionCode, versionName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateInfo)) {
            return false;
        }
        UpdateInfo updateInfo = (UpdateInfo) other;
        return AbstractC5227.m9466(this.fileName, updateInfo.fileName) && this.forceUpdate == updateInfo.forceUpdate && this.id == updateInfo.id && AbstractC5227.m9466(this.time, updateInfo.time) && AbstractC5227.m9466(this.updateLog, updateInfo.updateLog) && this.versionCode == updateInfo.versionCode && AbstractC5227.m9466(this.versionName, updateInfo.versionName);
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public final int getId() {
        return this.id;
    }

    public final LocalDateTime getTime() {
        return this.time;
    }

    public final String getUpdateLog() {
        return this.updateLog;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return this.versionName.hashCode() + AbstractC0900.m704(this.versionCode, AbstractC7012.m12131((this.time.hashCode() + AbstractC0900.m704(this.id, AbstractC0900.m701(this.fileName.hashCode() * 31, 31, this.forceUpdate), 31)) * 31, 31, this.updateLog), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateInfo(fileName=");
        AbstractC7012.m12138(sb, this.fileName, 1505);
        sb.append(this.forceUpdate);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", updateLog=");
        AbstractC7012.m12138(sb, this.updateLog, 1507);
        AbstractC7012.m12137(sb, this.versionCode, 1508);
        return AbstractC0900.m708(sb, this.versionName, ')');
    }
}
