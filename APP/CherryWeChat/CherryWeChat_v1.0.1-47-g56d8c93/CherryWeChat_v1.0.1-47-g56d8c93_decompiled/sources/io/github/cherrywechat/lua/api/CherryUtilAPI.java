package io.github.cherrywechat.lua.api;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.Base64;
import io.github.cherrywechat.lua.LuaUiScheduler;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import p000.AbstractC0295Gu;
import p000.AbstractC2453ra;
import p000.AbstractC2496sa;
import p000.AbstractC2564tz;
import p000.AbstractC2659w7;
import p000.AbstractC2822zz;
import p000.C0439K8;
import p000.C2789z8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryUtilAPI {
    private static final String TAG = AbstractC0295Gu.m625r(-545254688159797L);
    public static final CherryUtilAPI INSTANCE = new CherryUtilAPI();

    private CherryUtilAPI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$0(Lua lua) {
        AbstractC0295Gu.m625r(-529165740668981L);
        lua.push(Double.valueOf(System.currentTimeMillis()));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$1(Lua lua) {
        AbstractC0295Gu.m625r(-529174330603573L);
        lua.push(Double.valueOf(System.currentTimeMillis() / ((long) 1000)));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$10(Lua lua) {
        AbstractC0295Gu.m625r(-529582352496693L);
        int number = (int) lua.toNumber(1);
        lua.push(Double.valueOf(new Random().nextInt((((int) lua.toNumber(2)) - number) + 1) + number));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$11(Lua lua) {
        AbstractC0295Gu.m625r(-529590942431285L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-529599532365877L);
        }
        lua.push(AbstractC2564tz.m5070e0(string).toString());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$13(Lua lua) {
        AbstractC0295Gu.m625r(-529603827333173L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-529612417267765L);
        }
        String string2 = lua.toString(2);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-529616712235061L);
        }
        List listM5065Z = AbstractC2564tz.m5065Z(string, new String[]{string2}, 6);
        int i = 0;
        lua.createTable(listM5065Z.size(), 0);
        for (Object obj : listM5065Z) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2496sa.m4978c0();
                throw null;
            }
            lua.push((String) obj);
            lua.rawSetI(-2, i2);
            i = i2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int register$lambda$15(Lua lua) {
        String strM625r;
        long j;
        AbstractC0295Gu.m625r(-529625302169653L);
        if (!lua.isTable(1)) {
            lua.push(AbstractC0295Gu.m625r(-529633892104245L));
            return 1;
        }
        if (lua.getTop() >= 2) {
            strM625r = lua.toString(2);
            j = strM625r == null ? -529638187071541L : -529646777006133L;
            String str = strM625r;
            ArrayList arrayList = new ArrayList();
            lua.pushValue(1);
            lua.pushNil();
            while (lua.next(-2) != 0) {
                String string = lua.toString(-1);
                if (string != null) {
                    arrayList.add(string);
                }
                lua.pop(1);
            }
            lua.pop(1);
            lua.push(AbstractC2453ra.m4901k0(arrayList, str, null, null, null, 62));
            return 1;
        }
        strM625r = AbstractC0295Gu.m625r(j);
        String str2 = strM625r;
        ArrayList arrayList2 = new ArrayList();
        lua.pushValue(1);
        lua.pushNil();
        while (lua.next(-2) != 0) {
        }
        lua.pop(1);
        lua.push(AbstractC2453ra.m4901k0(arrayList2, str2, null, null, null, 62));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$16(Lua lua) {
        AbstractC0295Gu.m625r(-529655366940725L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-529663956875317L);
        }
        byte[] bytes = string.getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-529668251842613L);
        lua.push(Base64.encodeToString(bytes, 2));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$17(Lua lua) {
        AbstractC0295Gu.m625r(-528079113943093L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-528087703877685L);
        }
        try {
            byte[] bArrDecode = Base64.decode(string, 2);
            AbstractC0295Gu.m625r(-528091998844981L);
            lua.push(new String(bArrDecode, AbstractC2659w7.f9201a));
        } catch (Exception unused) {
            lua.push(AbstractC0295Gu.m625r(-528143538452533L));
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$18(Lua lua) {
        AbstractC0295Gu.m625r(-528147833419829L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-528156423354421L);
        }
        lua.push(URLEncoder.encode(string, AbstractC0295Gu.m625r(-528160718321717L)));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$19(Lua lua) {
        AbstractC0295Gu.m625r(-528186488125493L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-528195078060085L);
        }
        try {
            lua.push(URLDecoder.decode(string, AbstractC0295Gu.m625r(-528199373027381L)));
        } catch (Exception unused) {
            lua.push(string);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:7)(1:6)|8|(5:10|(1:12)|19|15|18)(1:14)|13|19|15|18) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        r6.push(p000.AbstractC0295Gu.m625r(-529363309164597L));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int register$lambda$2(Lua lua) {
        String strM625r;
        long j;
        AbstractC0295Gu.m625r(-529182920538165L);
        long jCurrentTimeMillis = (lua.getTop() < 1 || lua.isNil(1)) ? System.currentTimeMillis() : (long) lua.toNumber(1);
        if (lua.getTop() >= 2) {
            strM625r = lua.toString(2);
            j = strM625r == null ? -529191510472757L : -529277409818677L;
            lua.push(new SimpleDateFormat(strM625r, Locale.getDefault()).format(new Date(jCurrentTimeMillis)));
            return 1;
        }
        strM625r = AbstractC0295Gu.m625r(j);
        lua.push(new SimpleDateFormat(strM625r, Locale.getDefault()).format(new Date(jCurrentTimeMillis)));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$21(Lua lua) throws NoSuchAlgorithmException {
        AbstractC0295Gu.m625r(-528298157275189L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-528306747209781L);
        }
        MessageDigest messageDigest = MessageDigest.getInstance(AbstractC0295Gu.m625r(-528311042177077L));
        byte[] bytes = string.getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-527778466232373L);
        byte[] bArrDigest = messageDigest.digest(bytes);
        AbstractC0295Gu.m625r(-527838595774517L);
        String strM625r = AbstractC0295Gu.m625r(-527890135382069L);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArrDigest) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) strM625r);
            }
            sb.append(register$lambda$21$lambda$20(b));
        }
        sb.append((CharSequence) "");
        lua.push(sb.toString());
        return 1;
    }

    private static final CharSequence register$lambda$21$lambda$20(byte b) {
        String str = String.format(AbstractC0295Gu.m625r(-528225142831157L), Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        AbstractC0295Gu.m625r(-528246617667637L);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$23(Lua lua) throws NoSuchAlgorithmException {
        AbstractC0295Gu.m625r(-527967444793397L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-527976034727989L);
        }
        MessageDigest messageDigest = MessageDigest.getInstance(AbstractC0295Gu.m625r(-527980329695285L));
        byte[] bytes = string.getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-528006099499061L);
        byte[] bArrDigest = messageDigest.digest(bytes);
        AbstractC0295Gu.m625r(-528615984855093L);
        String strM625r = AbstractC0295Gu.m625r(-528667524462645L);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArrDigest) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) strM625r);
            }
            sb.append(register$lambda$23$lambda$22(b));
        }
        sb.append((CharSequence) "");
        lua.push(sb.toString());
        return 1;
    }

    private static final CharSequence register$lambda$23$lambda$22(byte b) {
        String str = String.format(AbstractC0295Gu.m625r(-527894430349365L), Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        AbstractC0295Gu.m625r(-527915905185845L);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$25(Lua lua) throws NoSuchAlgorithmException {
        AbstractC0295Gu.m625r(-528744833873973L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-528753423808565L);
        }
        MessageDigest messageDigest = MessageDigest.getInstance(AbstractC0295Gu.m625r(-528757718775861L));
        byte[] bytes = string.getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-528792078514229L);
        byte[] bArrDigest = messageDigest.digest(bytes);
        AbstractC0295Gu.m625r(-528852208056373L);
        String strM625r = AbstractC0295Gu.m625r(-528353991850037L);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArrDigest) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) strM625r);
            }
            sb.append(register$lambda$25$lambda$24(b));
        }
        sb.append((CharSequence) "");
        lua.push(sb.toString());
        return 1;
    }

    private static final CharSequence register$lambda$25$lambda$24(byte b) {
        String str = String.format(AbstractC0295Gu.m625r(-528671819429941L), Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        AbstractC0295Gu.m625r(-528693294266421L);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$26(Lua lua) {
        AbstractC0295Gu.m625r(-528358286817333L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext != null) {
            Object systemService = currentContext.getSystemService(AbstractC0295Gu.m625r(-528366876751925L));
            AbstractC0295Gu.m625r(-528409826424885L);
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(AbstractC0295Gu.m625r(-544653392738357L), string));
            lua.push(true);
        } else {
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$27(Lua lua) {
        ClipData.Item itemAt;
        CharSequence text;
        AbstractC0295Gu.m625r(-544692047444021L);
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext == null) {
            lua.pushNil();
            return 1;
        }
        Object systemService = currentContext.getSystemService(AbstractC0295Gu.m625r(-544700637378613L));
        AbstractC0295Gu.m625r(-544743587051573L);
        ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
        String string = (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null) ? null : text.toString();
        if (string != null) {
            lua.push(string);
            return 1;
        }
        lua.pushNil();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$28(Lua lua) {
        AbstractC0295Gu.m625r(-544494478948405L);
        Object object = lua.toObject(1);
        lua.push(object == null ? AbstractC0295Gu.m625r(-544503068882997L) : object instanceof String ? AbstractC0295Gu.m625r(-544520248752181L) : object instanceof Number ? AbstractC0295Gu.m625r(-545100069337141L) : object instanceof Boolean ? AbstractC0295Gu.m625r(-545130134108213L) : object.getClass().getSimpleName());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$29(Lua lua) {
        AbstractC0295Gu.m625r(-545164493846581L);
        Object object = lua.toObject(1);
        if (object != null) {
            lua.push(object.getClass().getName());
        } else {
            lua.push(AbstractC0295Gu.m625r(-545173083781173L));
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:6|(8:8|(1:10)|13|22|14|(1:16)(1:17)|18|21)(1:12)|11|13|22|14|(0)(0)|18|21) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        r7.push(java.lang.Double.valueOf(0.0d));
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0030, B:16:0x003f, B:18:0x0046), top: B:22:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int register$lambda$3(Lua lua) {
        String strM625r;
        long j;
        AbstractC0295Gu.m625r(-529367604131893L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        if (lua.getTop() >= 2) {
            strM625r = lua.toString(2);
            j = strM625r == null ? -529376194066485L : -528912337598517L;
            lua.push(Double.valueOf(new SimpleDateFormat(strM625r, Locale.getDefault()).parse(string) == null ? r1.getTime() : 0.0d));
            return 1;
        }
        strM625r = AbstractC0295Gu.m625r(j);
        lua.push(Double.valueOf(new SimpleDateFormat(strM625r, Locale.getDefault()).parse(string) == null ? r1.getTime() : 0.0d));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$30(Lua lua) {
        AbstractC0295Gu.m625r(-545190263650357L);
        Object object = lua.toObject(1);
        String string = lua.toString(2);
        if (object == null || string == null) {
            lua.push(false);
        } else {
            try {
                lua.push(Class.forName(string).isInstance(object));
            } catch (ClassNotFoundException unused) {
                lua.push(false);
            }
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int register$lambda$31(Lua lua) {
        boolean zIsEmpty;
        AbstractC0295Gu.m625r(-545198853584949L);
        Object object = lua.toObject(1);
        if (object == null) {
            zIsEmpty = true;
        } else {
            zIsEmpty = false;
            if (object instanceof String) {
                if (((CharSequence) object).length() == 0) {
                }
            } else if (object instanceof Collection) {
                zIsEmpty = ((Collection) object).isEmpty();
            } else if (object instanceof Map) {
                zIsEmpty = ((Map) object).isEmpty();
            } else if ((object instanceof Object[]) && ((Object[]) object).length == 0) {
            }
        }
        lua.push(zIsEmpty);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$32(Lua lua) {
        AbstractC0295Gu.m625r(-545207443519541L);
        String string = lua.toString(1);
        lua.push(string == null || AbstractC2564tz.m5059T(string));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$33(Lua lua) {
        AbstractC0295Gu.m625r(-545216033454133L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-545224623388725L);
        }
        double number = lua.getTop() >= 2 ? lua.toNumber(2) : 0.0d;
        Double dM5461F = AbstractC2822zz.m5461F(string);
        if (dM5461F != null) {
            number = dM5461F.doubleValue();
        }
        lua.push(Double.valueOf(number));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$34(Lua lua) {
        String strM625r;
        AbstractC0295Gu.m625r(-545228918356021L);
        Object object = lua.toObject(1);
        if (object == null || (strM625r = object.toString()) == null) {
            strM625r = AbstractC0295Gu.m625r(-545237508290613L);
        }
        lua.push(strM625r);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$4(Lua lua) throws InterruptedException {
        AbstractC0295Gu.m625r(-528998236944437L);
        long number = (long) lua.toNumber(1);
        if (number <= 0) {
            return 0;
        }
        Thread.sleep(number);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$5(Lua lua) {
        AbstractC0295Gu.m625r(-529006826879029L);
        lua.push(LuaUiScheduler.INSTANCE.isForeground());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$6(Lua lua) {
        AbstractC0295Gu.m625r(-529015416813621L);
        lua.push(!LuaUiScheduler.INSTANCE.isForeground());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$7(Lua lua) {
        AbstractC0295Gu.m625r(-529024006748213L);
        lua.push(UUID.randomUUID().toString());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$9(Lua lua) {
        String strM625r;
        AbstractC0295Gu.m625r(-529032596682805L);
        int number = (int) lua.toNumber(1);
        if (lua.getTop() >= 2) {
            strM625r = lua.toString(2);
            if (strM625r == null) {
                strM625r = AbstractC0295Gu.m625r(-529041186617397L);
            }
        } else {
            strM625r = AbstractC0295Gu.m625r(-529861525370933L);
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append(strM625r.charAt(random.nextInt(strM625r.length())));
        }
        lua.push(sb.toString());
        return 1;
    }

    public final void register(Lua lua) {
        AbstractC0295Gu.m625r(-531781375752245L);
        lua.createTable(0, 30);
        lua.push(new C2789z8(19));
        lua.setField(-2, AbstractC0295Gu.m625r(-531798555621429L));
        lua.push(new C2789z8(21));
        lua.setField(-2, AbstractC0295Gu.m625r(-531820030457909L));
        lua.push(new C0439K8(2));
        lua.setField(-2, AbstractC0295Gu.m625r(-531871570065461L));
        lua.push(new C0439K8(3));
        lua.setField(-2, AbstractC0295Gu.m625r(-530269547264053L));
        lua.push(new C0439K8(4));
        lua.setField(-2, AbstractC0295Gu.m625r(-530312496937013L));
        lua.push(new C0439K8(5));
        lua.setField(-2, AbstractC0295Gu.m625r(-530338266740789L));
        lua.push(new C0439K8(6));
        lua.setField(-2, AbstractC0295Gu.m625r(-530394101315637L));
        lua.push(new C0439K8(7));
        lua.setField(-2, AbstractC0295Gu.m625r(-530449935890485L));
        lua.push(new C0439K8(8));
        lua.setField(-2, AbstractC0295Gu.m625r(-530471410726965L));
        lua.push(new C0439K8(9));
        lua.setField(-2, AbstractC0295Gu.m625r(-529977489487925L));
        lua.push(new C0439K8(0));
        lua.setField(-2, AbstractC0295Gu.m625r(-530020439160885L));
        lua.push(new C0439K8(10));
        lua.setField(-2, AbstractC0295Gu.m625r(-530041913997365L));
        lua.push(new C0439K8(11));
        lua.setField(-2, AbstractC0295Gu.m625r(-530067683801141L));
        lua.push(new C0439K8(12));
        lua.setField(-2, AbstractC0295Gu.m625r(-530089158637621L));
        lua.push(new C0439K8(13));
        lua.setField(-2, AbstractC0295Gu.m625r(-530144993212469L));
        lua.push(new C0439K8(14));
        lua.setField(-2, AbstractC0295Gu.m625r(-530200827787317L));
        lua.push(new C0439K8(15));
        lua.setField(-2, AbstractC0295Gu.m625r(-530793533274165L));
        lua.push(new C0439K8(16));
        lua.setField(-2, AbstractC0295Gu.m625r(-530836482947125L));
        lua.push(new C0439K8(17));
        lua.setField(-2, AbstractC0295Gu.m625r(-530853662816309L));
        lua.push(new C2789z8(20));
        lua.setField(-2, AbstractC0295Gu.m625r(-530875137652789L));
        lua.push(new C2789z8(22));
        lua.setField(-2, AbstractC0295Gu.m625r(-530905202423861L));
        lua.push(new C2789z8(23));
        lua.setField(-2, AbstractC0295Gu.m625r(-530926677260341L));
        lua.push(new C2789z8(24));
        lua.setField(-2, AbstractC0295Gu.m625r(-530952447064117L));
        lua.push(new C2789z8(25));
        lua.setField(-2, AbstractC0295Gu.m625r(-530973921900597L));
        lua.push(new C2789z8(26));
        lua.setField(-2, AbstractC0295Gu.m625r(-531003986671669L));
        lua.push(new C2789z8(27));
        lua.setField(-2, AbstractC0295Gu.m625r(-531051231311925L));
        lua.push(new C2789z8(28));
        lua.setField(-2, AbstractC0295Gu.m625r(-530535835236405L));
        lua.push(new C2789z8(29));
        lua.setField(-2, AbstractC0295Gu.m625r(-530570194974773L));
        lua.push(new C0439K8(1));
        lua.setField(-2, AbstractC0295Gu.m625r(-530608849680437L));
        AbstractC0295Gu.m625r(-530647504386101L);
        AbstractC0295Gu.m625r(-530707633928245L);
    }
}
