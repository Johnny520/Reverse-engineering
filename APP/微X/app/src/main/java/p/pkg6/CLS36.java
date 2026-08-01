// Decompiled by JEB v5.42.0.202606242140

package p.pkg6;

import java.net.URL;
import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Pattern;
import p.pkg7.CLS39;

public final class CLS36 {
    public final class CLS35 extends ThreadLocal {
        public CLS35() {
            super();
        }

        @Override
        public final Object initialValue() {
            return new Stack();
        }
    }

    public static final Pattern FLD311;
    public static final CLS35 FLD312;
    public static final String[] FLD313;
    public static final Pattern FLD314;
    public static final Pattern FLD315;

    static {
        CLS36.FLD313 = new String[]{"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
        CLS36.FLD315 = Pattern.compile("^/((\\.{1,2}/)+)");
        CLS36.FLD314 = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
        CLS36.FLD311 = Pattern.compile("[\\x00-\\x1f]*");
        CLS36.FLD312 = new CLS35();
    }

    public static String MTH848(StringBuilder stringBuilder0) {
        CLS39.MTH871(stringBuilder0);
        String s = stringBuilder0.toString();
        if(stringBuilder0.length() > 0x2000) {
            stringBuilder0 = new StringBuilder(0x2000);
        }
        else {
            stringBuilder0.delete(0, stringBuilder0.length());
        }
        Stack stack0 = (Stack)CLS36.FLD312.get();
        stack0.push(stringBuilder0);
        while(stack0.size() > 8) {
            stack0.pop();
        }
        return s;
    }

    public static URL MTH849(URL uRL0, String s) {
        String s1 = CLS36.FLD311.matcher(s).replaceAll("");
        if(s1.startsWith("?")) {
            s1 = uRL0.getPath() + s1;
        }
        URL uRL1 = new URL(uRL0, s1);
        String s2 = uRL1.getFile();
        String s3 = CLS36.FLD315.matcher(s2).replaceFirst("/");
        if(uRL1.getRef() != null) {
            s3 = s3 + "#" + uRL1.getRef();
        }
        return new URL(uRL1.getProtocol(), uRL1.getHost(), uRL1.getPort(), s3);
    }

    public static StringBuilder MTH850() {
        Stack stack0 = (Stack)CLS36.FLD312.get();
        return stack0.empty() ? new StringBuilder(0x2000) : ((StringBuilder)stack0.pop());
    }

    public static boolean MTH851(String s) {
        if(s != null && s.length() != 0) {
            int v = s.length();
            for(int v1 = 0; v1 < v; ++v1) {
                if(s.codePointAt(v1) != 9 && s.codePointAt(v1) != 10 && s.codePointAt(v1) != 12 && s.codePointAt(v1) != 13 && s.codePointAt(v1) != 0x20) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean MTH852(String s, String[] arr_s) {
        return Arrays.binarySearch(arr_s, s) >= 0;
    }
}

