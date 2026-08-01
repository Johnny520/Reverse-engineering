package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: kb */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0301kb {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f502a = false;

    /* JADX INFO: renamed from: b */
    public static volatile boolean f503b = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m739a(Object obj) {
        long jLongValue;
        if (obj == null) {
            return;
        }
        try {
            Field fieldM1118a = AbstractC0513w4.m1118a(obj.getClass(), "lCurrentStyleId");
            if (fieldM1118a == null) {
                return;
            }
            fieldM1118a.setAccessible(true);
            Class<?> type = fieldM1118a.getType();
            Class<?> cls = Long.TYPE;
            if (type == cls) {
                jLongValue = fieldM1118a.getLong(obj);
            } else {
                Object obj2 = fieldM1118a.get(obj);
                jLongValue = obj2 instanceof Number ? ((Number) obj2).longValue() : 0L;
            }
            if (jLongValue == 21 || jLongValue == 22) {
                if (type == cls) {
                    fieldM1118a.setLong(obj, 0L);
                    return;
                }
                if (type == Long.class) {
                    fieldM1118a.set(obj, 0L);
                } else if (type == Integer.TYPE) {
                    fieldM1118a.setInt(obj, 0);
                } else if (type == Integer.class) {
                    fieldM1118a.set(obj, 0);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m740b(Object[] objArr) {
        if (objArr == null || !HookEntry.runtimeBool(Prefs.KEY_BLOCK_PROFILE_CARD_DECOR)) {
            return;
        }
        for (Object obj : objArr) {
            m741c(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m741c(Object obj) {
        if (HookEntry.runtimeBool(Prefs.KEY_BLOCK_PROFILE_CARD_DECOR)) {
            m742d(obj, 0, Collections.newSetFromMap(new IdentityHashMap()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m742d(Object obj, int i, Set set) {
        if (obj == null || i > 3 || set.contains(obj)) {
            return;
        }
        set.add(obj);
        m739a(obj);
        AbstractC0513w4.m1121d(obj, "zplanCover", null);
        AbstractC0513w4.m1121d(obj, "zplanCoverInfo", null);
        AbstractC0513w4.m1121d(obj, "zPlanCoverInfo", null);
        Boolean bool = Boolean.FALSE;
        AbstractC0513w4.m1121d(obj, "profileCardShowZplanCover", bool);
        AbstractC0513w4.m1121d(obj, "isProfileCardShowZplanCover", bool);
        AbstractC0513w4.m1121d(obj, "showZPlan", bool);
        AbstractC0513w4.m1121d(obj, "isShowZPlan", bool);
        Object objM1119b = AbstractC0513w4.m1119b(obj, "diyCard");
        if (objM1119b != null && objM1119b != obj) {
            m739a(objM1119b);
        }
        Object objM1119b2 = AbstractC0513w4.m1119b(obj, "diyCardInfo");
        if (objM1119b2 != null && objM1119b2 != obj) {
            m739a(objM1119b2);
        }
        Object objM1119b3 = AbstractC0513w4.m1119b(obj, "background");
        if (objM1119b3 != null && objM1119b3 != obj) {
            m739a(objM1119b3);
        }
        Object objM1119b4 = AbstractC0513w4.m1119b(obj, "template");
        if (objM1119b4 != null && objM1119b4 != obj) {
            m739a(objM1119b4);
        }
        String[] strArr = {"iCardType", "cardType", "templateId", "templateID", "profileTemplateId", "profileCardTemplateId", "dynamicCardId", "dynamicCardID", "bgId", "backgroundId", "dressId", "vipDressId", "namePlateId", "nameplateId", "diyCardId", "diyId", "officialCardId", "officialBgId", "profileBgId", "profileCoverId"};
        for (int i2 = 0; i2 < 20; i2++) {
            AbstractC0513w4.m1121d(obj, strArr[i2], 0);
        }
        String[] strArr2 = {"lCurrentStyleId", "lCurrentBgId", "lTemplateId", "lNamePlateId", "backgroundTimeStamp", "dynamicCardTimeStamp", "officialCardId", "profileCardId", "profileBgId", "profileCoverId", "lProfileBgId"};
        for (int i3 = 0; i3 < 11; i3++) {
            AbstractC0513w4.m1121d(obj, strArr2[i3], 0L);
        }
        String[] strArr3 = {"isShowCardBackground", "showCardBackground", "showProfileBackground", "isDynamicCard", "isShowDynamicCard", "useDiyCard", "isUseDiyCard", "hasDiyCard", "hasProfileDecor", "isShowNamePlate", "isShowProfileBg", "showProfileBg", "hasProfileBg", "hasOfficialCard", "isUseOfficialCard"};
        for (int i4 = 0; i4 < 15; i4++) {
            AbstractC0513w4.m1121d(obj, strArr3[i4], Boolean.FALSE);
        }
        String[] strArr4 = {"cardBackground", "cardBackgroundInfo", "background", "backgroundInfo", "profileBg", "profileBgInfo", "profileCardBg", "profileCardBackground", "profileBackground", "profileBackgroundInfo", "officialCard", "officialCardInfo", "officialBg", "officialBgInfo", "bgUrl", "backgroundUrl", "coverUrl", "videoUrl", "dynamicCardUrl", "profileBgUrl", "profileVideoUrl", "coverInfo", "dynamicCard", "dynamicCardInfo", "template", "profileTemplate", "templateInfo", "profileTemplateInfo", "vipCard", "vipCardInfo", "namePlate", "nameplate", "namePlateInfo", "nameplateInfo", "cardDecor", "cardDecorInfo", "decorInfo", "dressInfo", "vasCardInfo", "vasProfileInfo", "profileVasInfo"};
        for (int i5 = 0; i5 < 41; i5++) {
            AbstractC0513w4.m1121d(obj, strArr4[i5], null);
        }
        Object objM1119b5 = AbstractC0513w4.m1119b(obj, "card");
        if (objM1119b5 != null) {
            m742d(objM1119b5, i + 1, set);
        }
        Object objM1119b6 = AbstractC0513w4.m1119b(obj, "a");
        if (objM1119b6 != null && objM1119b6 != obj) {
            m742d(objM1119b6, i + 1, set);
        }
        Object objM1119b7 = AbstractC0513w4.m1119b(obj, "b");
        if (objM1119b7 != null && objM1119b7 != obj) {
            m742d(objM1119b7, i + 1, set);
        }
        Object objM1119b8 = AbstractC0513w4.m1119b(obj, "profileCardInfo");
        if (objM1119b8 != null && objM1119b8 != obj) {
            m742d(objM1119b8, i + 1, set);
        }
        Object objM1119b9 = AbstractC0513w4.m1119b(obj, "cardInfo");
        if (objM1119b9 == null || objM1119b9 == obj) {
            return;
        }
        m742d(objM1119b9, i + 1, set);
    }
}
