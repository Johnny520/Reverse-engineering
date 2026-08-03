package io.github.cherrywechat.lua.api;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import p000.AbstractC0295Gu;
import p000.AbstractC2496sa;
import p000.AbstractC2564tz;
import p000.AbstractC2659w7;
import p000.AbstractC2675wh;
import p000.C2402q8;
import p000.C2574u8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryFileAPI {
    private static final String TAG = AbstractC0295Gu.m625r(-550382879111221L);
    public static final CherryFileAPI INSTANCE = new CherryFileAPI();

    private CherryFileAPI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$0(Lua lua) {
        AbstractC0295Gu.m625r(-550176720681013L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        try {
            lua.push(AbstractC2675wh.m5244g0(new File(string)));
            return 1;
        } catch (Exception unused) {
            lua.pushNil();
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$1(Lua lua) {
        AbstractC0295Gu.m625r(-550185310615605L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        try {
            lua.push(AbstractC2675wh.m5242e0(new File(string)), Lua.Conversion.SEMI);
        } catch (Exception unused) {
            lua.pushNil();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$10(Lua lua) {
        AbstractC0295Gu.m625r(-550262620026933L);
        if (lua.toString(1) == null) {
            return 0;
        }
        lua.push(Double.valueOf(new File(r1).length()));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$11(Lua lua) {
        AbstractC0295Gu.m625r(-550271209961525L);
        if (lua.toString(1) == null) {
            return 0;
        }
        lua.push(Double.valueOf(new File(r1).lastModified()));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$12(Lua lua) {
        AbstractC0295Gu.m625r(-550279799896117L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        lua.push(new File(string).getName());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$13(Lua lua) {
        AbstractC0295Gu.m625r(-550288389830709L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        String parent = new File(string).getParent();
        if (parent != null) {
            lua.push(parent);
        } else {
            lua.pushNil();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$14(Lua lua) {
        AbstractC0295Gu.m625r(-550296979765301L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        String name = new File(string).getName();
        int iM5061V = AbstractC2564tz.m5061V(name, '.');
        lua.push(iM5061V == -1 ? "" : name.substring(iM5061V + 1, name.length()));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$15(Lua lua) {
        AbstractC0295Gu.m625r(-550305569699893L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        lua.push(new File(string).getAbsolutePath());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$16(Lua lua) {
        AbstractC0295Gu.m625r(-549764403820597L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        lua.push(new File(string).delete());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$17(Lua lua) {
        AbstractC0295Gu.m625r(-549772993755189L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        lua.push(AbstractC2675wh.m5239b0(new File(string)));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$18(Lua lua) {
        AbstractC0295Gu.m625r(-549781583689781L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        lua.push(new File(string).mkdirs());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$19(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-549790173624373L);
        String string2 = lua.toString(1);
        if (string2 == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        lua.push(new File(string2).renameTo(new File(string)));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$20(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-549798763558965L);
        String string2 = lua.toString(1);
        if (string2 == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            AbstractC2675wh.m5238a0(new File(string2), new File(string));
            lua.push(true);
            return 1;
        } catch (Exception unused) {
            lua.push(false);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$21(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-549807353493557L);
        String string2 = lua.toString(1);
        if (string2 == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            AbstractC2675wh.m5238a0(new File(string2), new File(string));
            new File(string2).delete();
            lua.push(true);
            return 1;
        } catch (Exception unused) {
            lua.push(false);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$23(Lua lua) {
        AbstractC0295Gu.m625r(-549815943428149L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        File[] fileArrListFiles = new File(string).listFiles();
        if (fileArrListFiles != null) {
            lua.createTable(fileArrListFiles.length, 0);
            int i = 0;
            for (File file : fileArrListFiles) {
                i++;
                lua.push(file.getName());
                lua.rawSetI(-2, i);
            }
        } else {
            lua.createTable(0, 0);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$25(Lua lua) {
        AbstractC0295Gu.m625r(-549824533362741L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        File[] fileArrListFiles = new File(string).listFiles();
        if (fileArrListFiles != null) {
            lua.createTable(fileArrListFiles.length, 0);
            int i = 0;
            for (File file : fileArrListFiles) {
                i++;
                lua.createTable(0, 5);
                lua.push(file.getName());
                lua.setField(-2, AbstractC0295Gu.m625r(-549833123297333L));
                lua.push(file.getAbsolutePath());
                lua.setField(-2, AbstractC0295Gu.m625r(-549854598133813L));
                lua.push(file.isDirectory());
                lua.setField(-2, AbstractC0295Gu.m625r(-549876072970293L));
                lua.push(Double.valueOf(file.length()));
                lua.setField(-2, AbstractC0295Gu.m625r(-549901842774069L));
                lua.push(Double.valueOf(file.lastModified()));
                lua.setField(-2, AbstractC0295Gu.m625r(-549923317610549L));
                lua.rawSetI(-2, i);
            }
        } else {
            lua.createTable(0, 0);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$29(Lua lua) {
        AbstractC0295Gu.m625r(-550601922443317L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AbstractC0295Gu.m625r(-550610512377909L));
            FileInputStream fileInputStream = new FileInputStream(new File(string));
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                }
                fileInputStream.close();
                byte[] bArrDigest = messageDigest.digest();
                AbstractC0295Gu.m625r(-550627692247093L);
                String strM625r = AbstractC0295Gu.m625r(-550679231854645L);
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "");
                int i2 = 0;
                for (byte b : bArrDigest) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((CharSequence) strM625r);
                    }
                    sb.append(register$lambda$29$lambda$28(b));
                }
                sb.append((CharSequence) "");
                lua.push(sb.toString());
                return 1;
            } finally {
            }
        } catch (Exception unused) {
            lua.pushNil();
            return 1;
        }
    }

    private static final CharSequence register$lambda$29$lambda$28(byte b) {
        String str = String.format(AbstractC0295Gu.m625r(-549979152185397L), Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        AbstractC0295Gu.m625r(-550000627021877L);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$3(Lua lua) {
        AbstractC0295Gu.m625r(-550193900550197L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        try {
            ArrayList arrayListM5243f0 = AbstractC2675wh.m5243f0(new File(string));
            lua.createTable(arrayListM5243f0.size(), 0);
            int i = 0;
            for (Object obj : arrayListM5243f0) {
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
        } catch (Exception unused) {
            lua.createTable(0, 0);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$33(Lua lua) {
        AbstractC0295Gu.m625r(-550756541265973L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AbstractC0295Gu.m625r(-550765131200565L));
            FileInputStream fileInputStream = new FileInputStream(new File(string));
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                }
                fileInputStream.close();
                byte[] bArrDigest = messageDigest.digest();
                AbstractC0295Gu.m625r(-550799490938933L);
                String strM625r = AbstractC0295Gu.m625r(-550851030546485L);
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "");
                int i2 = 0;
                for (byte b : bArrDigest) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((CharSequence) strM625r);
                    }
                    sb.append(register$lambda$33$lambda$32(b));
                }
                sb.append((CharSequence) "");
                lua.push(sb.toString());
                return 1;
            } finally {
            }
        } catch (Exception unused) {
            lua.pushNil();
            return 1;
        }
    }

    private static final CharSequence register$lambda$33$lambda$32(byte b) {
        String str = String.format(AbstractC0295Gu.m625r(-550683526821941L), Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        AbstractC0295Gu.m625r(-550705001658421L);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$34(Lua lua) {
        AbstractC0295Gu.m625r(-550855325513781L);
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext == null) {
            lua.pushNil();
            return 1;
        }
        File file = new File(currentContext.getFilesDir(), AbstractC0295Gu.m625r(-550314159634485L));
        if (!file.exists()) {
            file.mkdirs();
        }
        lua.push(file.getAbsolutePath());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$35(Lua lua) {
        AbstractC0295Gu.m625r(-550365699242037L);
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext != null) {
            lua.push(currentContext.getCacheDir().getAbsolutePath());
            return 1;
        }
        lua.pushNil();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$36(Lua lua) {
        AbstractC0295Gu.m625r(-550374289176629L);
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext != null) {
            lua.push(currentContext.getFilesDir().getAbsolutePath());
            return 1;
        }
        lua.pushNil();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$4(Lua lua) {
        AbstractC0295Gu.m625r(-550202490484789L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        String string2 = lua.toString(2);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-550211080419381L);
        }
        try {
            AbstractC2675wh.m5246i0(new File(string), string2);
            lua.push(true);
            return 1;
        } catch (Exception unused) {
            lua.push(false);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$5(Lua lua) {
        AbstractC0295Gu.m625r(-550215375386677L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        Object object = lua.toObject(2);
        byte[] bArr = object instanceof byte[] ? (byte[]) object : null;
        if (bArr == null) {
            return 0;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(string));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                lua.push(true);
            } finally {
            }
        } catch (Exception unused) {
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$6(Lua lua) {
        AbstractC0295Gu.m625r(-550223965321269L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        String string2 = lua.toString(2);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-550232555255861L);
        }
        try {
            File file = new File(string);
            Charset charset = AbstractC2659w7.f9201a;
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            try {
                AbstractC2675wh.m5247j0(fileOutputStream, string2, charset);
                fileOutputStream.close();
                lua.push(true);
                return 1;
            } finally {
            }
        } catch (Exception unused) {
            lua.push(false);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$7(Lua lua) {
        AbstractC0295Gu.m625r(-550236850223157L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        lua.push(new File(string).exists());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$8(Lua lua) {
        AbstractC0295Gu.m625r(-550245440157749L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        lua.push(new File(string).isFile());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$9(Lua lua) {
        AbstractC0295Gu.m625r(-550254030092341L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        lua.push(new File(string).isDirectory());
        return 1;
    }

    public final void register(Lua lua) {
        AbstractC0295Gu.m625r(-552594787268661L);
        lua.createTable(0, 25);
        lua.push(new C2402q8(22));
        lua.setField(-2, AbstractC0295Gu.m625r(-552611967137845L));
        lua.push(new C2402q8(24));
        lua.setField(-2, AbstractC0295Gu.m625r(-552650621843509L));
        lua.push(new C2574u8(4));
        lua.setField(-2, AbstractC0295Gu.m625r(-552693571516469L));
        lua.push(new C2574u8(5));
        lua.setField(-2, AbstractC0295Gu.m625r(-552736521189429L));
        lua.push(new C2574u8(6));
        lua.setField(-2, AbstractC0295Gu.m625r(-552779470862389L));
        lua.push(new C2574u8(7));
        lua.setField(-2, AbstractC0295Gu.m625r(-551177448060981L));
        lua.push(new C2574u8(8));
        lua.setField(-2, AbstractC0295Gu.m625r(-551224692701237L));
        lua.push(new C2574u8(9));
        lua.setField(-2, AbstractC0295Gu.m625r(-551254757472309L));
        lua.push(new C2574u8(10));
        lua.setField(-2, AbstractC0295Gu.m625r(-551284822243381L));
        lua.push(new C2574u8(11));
        lua.setField(-2, AbstractC0295Gu.m625r(-551310592047157L));
        lua.push(new C2574u8(3));
        lua.setField(-2, AbstractC0295Gu.m625r(-551344951785525L));
        lua.push(new C2574u8(12));
        lua.setField(-2, AbstractC0295Gu.m625r(-550863915448373L));
        lua.push(new C2574u8(13));
        lua.setField(-2, AbstractC0295Gu.m625r(-550898275186741L));
        lua.push(new C2574u8(14));
        lua.setField(-2, AbstractC0295Gu.m625r(-550941224859701L));
        lua.push(new C2574u8(15));
        lua.setField(-2, AbstractC0295Gu.m625r(-550997059434549L));
        lua.push(new C2574u8(16));
        lua.setField(-2, AbstractC0295Gu.m625r(-551065778911285L));
        lua.push(new C2574u8(17));
        lua.setField(-2, AbstractC0295Gu.m625r(-551113023551541L));
        lua.push(new C2574u8(18));
        lua.setField(-2, AbstractC0295Gu.m625r(-551731498842165L));
        lua.push(new C2574u8(19));
        lua.setField(-2, AbstractC0295Gu.m625r(-551774448515125L));
        lua.push(new C2402q8(23));
        lua.setField(-2, AbstractC0295Gu.m625r(-551821693155381L));
        lua.push(new C2402q8(25));
        lua.setField(-2, AbstractC0295Gu.m625r(-551860347861045L));
        lua.push(new C2402q8(26));
        lua.setField(-2, AbstractC0295Gu.m625r(-551899002566709L));
        lua.push(new C2402q8(27));
        lua.setField(-2, AbstractC0295Gu.m625r(-551933362305077L));
        lua.push(new C2402q8(28));
        lua.setField(-2, AbstractC0295Gu.m625r(-551426556164149L));
        lua.push(new C2402q8(29));
        lua.setField(-2, AbstractC0295Gu.m625r(-551456620935221L));
        lua.push(new C2574u8(0));
        lua.setField(-2, AbstractC0295Gu.m625r(-551499570608181L));
        lua.push(new C2574u8(1));
        lua.setField(-2, AbstractC0295Gu.m625r(-551555405183029L));
        lua.push(new C2574u8(2));
        lua.setField(-2, AbstractC0295Gu.m625r(-551606944790581L));
        AbstractC0295Gu.m625r(-551658484398133L);
        AbstractC0295Gu.m625r(-550069346498613L);
    }
}
