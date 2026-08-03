package p259r9;

import gg.C1425u;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import okhttp3.HttpUrl;
import okio.C3193a;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: r9.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3761k implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f12291g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1425u f12292h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3756f0 f12293i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1425u f12294j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C3776z f12295k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3761k(C3752d0 c3752d0, long j3, C1425u c1425u, C3756f0 c3756f0, C1425u c1425u2, C3776z c3776z) {
        this.f12291g = j3;
        this.f12292h = c1425u;
        this.f12293i = c3756f0;
        this.f12294j = c1425u2;
        this.f12295k = c3776z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int iIntValue;
        String str = (String) obj;
        str.getClass();
        int iHashCode = str.hashCode();
        long j3 = this.f12291g;
        C3756f0 c3756f0 = this.f12293i;
        switch (iHashCode) {
            case -2137767260:
                if (str.equals("rawAtUserList")) {
                    return c3756f0.f12248i;
                }
                return null;
            case -1295335332:
                if (!str.equals("atUserList")) {
                    return null;
                }
                int iOrdinal = C3752d0.m7793f(c3756f0).ordinal();
                return iOrdinal != 2 ? iOrdinal != 3 ? c3756f0.f12248i : "群公告全体" : "@所有人";
            case -1294411543:
                if (str.equals("msgSvrId")) {
                    return String.valueOf(c3756f0.f12242c);
                }
                return null;
            case -1207901313:
                if (!str.equals("mentionedUsers")) {
                    return null;
                }
                int iOrdinal2 = C3752d0.m7793f(c3756f0).ordinal();
                if (iOrdinal2 == 0) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (iOrdinal2 == 1) {
                    return "@我";
                }
                if (iOrdinal2 == 2) {
                    return "@所有人";
                }
                if (iOrdinal2 == 3) {
                    return "群公告";
                }
                if (iOrdinal2 == 4) {
                    return AbstractC0921a.m2250m(C3752d0.m7794f0(c3756f0.f12248i).size(), "@", "人");
                }
                C3193a.m6822k();
                return null;
            case -853116312:
                if (str.equals("typeDec")) {
                    return String.valueOf(c3756f0.f12240a);
                }
                return null;
            case -853112447:
                if (str.equals("typeHex")) {
                    return AbstractC4855en.m9263g("0x", Integer.toUnsignedString(c3756f0.f12240a, 16));
                }
                return null;
            case -70681671:
                if (!str.equals("relativeTime")) {
                    return null;
                }
                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                long epochDay = LocalDate.now(zoneIdSystemDefault).toEpochDay() - Instant.ofEpochMilli(j3).atZone(zoneIdSystemDefault).toLocalDate().toEpochDay();
                if (epochDay > 1) {
                    return epochDay + "天前";
                }
                if (epochDay == 1) {
                    return "昨天";
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - j3;
                if (jCurrentTimeMillis <= 0) {
                    return "刚刚";
                }
                long j4 = jCurrentTimeMillis / 60000;
                long j5 = jCurrentTimeMillis / 3600000;
                if (j4 < 1) {
                    return "刚刚";
                }
                if (j5 < 1) {
                    return j4 + "分钟前";
                }
                return (j5 >= 1 ? j5 : 1L) + "小时前";
            case 3560141:
                if (!str.equals("time")) {
                    return null;
                }
                C1425u c1425u = this.f12294j;
                String str2 = (String) c1425u.f4738g;
                if (str2 != null) {
                    return str2;
                }
                String str3 = LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault()).format(this.f12295k.f12356e);
                c1425u.f4738g = str3;
                str3.getClass();
                return str3;
            case 3575610:
                if (!str.equals("type")) {
                    return null;
                }
                C1425u c1425u2 = this.f12292h;
                Integer num = (Integer) c1425u2.f4738g;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    int i9 = c3756f0.f12240a;
                    if (i9 > 0) {
                        int i10 = i9 & 255;
                        int i11 = 65535 & i9;
                        if ((i9 >>> 16) != 0) {
                            if (i11 == 10000 || i11 == 10002) {
                                i9 = i11;
                            } else if (i10 != 0 && i11 == i10) {
                                i9 = i10;
                            }
                        }
                    }
                    c1425u2.f4738g = Integer.valueOf(i9);
                    iIntValue = i9;
                }
                if (iIntValue == 1) {
                    return "文字";
                }
                if (iIntValue == 3) {
                    return "图片";
                }
                if (iIntValue == 34) {
                    return "语音";
                }
                if (iIntValue == 37) {
                    return "好友申请";
                }
                if (iIntValue == 62) {
                    return "小视频";
                }
                if (iIntValue == 66) {
                    return "名片";
                }
                if (iIntValue == 10000) {
                    return "系统消息";
                }
                if (iIntValue == 10002) {
                    return "撤回消息";
                }
                if (iIntValue == 42) {
                    return "名片";
                }
                if (iIntValue == 43) {
                    return "视频";
                }
                switch (iIntValue) {
                    case 47:
                        return "表情";
                    case 48:
                        return "位置";
                    case 49:
                        return "链接/卡片";
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                        return "通话消息";
                    default:
                        return "未知消息";
                }
            case 104191100:
                if (str.equals("msgId")) {
                    return String.valueOf(c3756f0.f12241b);
                }
                return null;
            default:
                return null;
        }
    }
}
