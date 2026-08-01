// Decompiled by JEB v5.42.0.202606242140

package p.pkg7;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

public final class CLS40 {
    public static final Charset FLD317;

    static {
        Pattern.compile("(?i)\\bcharset=\\s*(?:[\"\'])?([^\\s,;\"\']*)");
        Charset charset0 = Charset.forName("UTF-8");
        CLS40.FLD317 = charset0;
        charset0.name();
        "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}

