// Decompiled by JEB v5.42.0.202606242140

package p.pkg5;

public final class CLS32 {
    public static String MTH839(String s) {
        s.getClass();
        switch(s) {
            case "arm64-v8a": {
                return "arm64";
            }
            case "armeabi-v7a": {
                return "arm";
            }
            case "x86": {
                return "x86_32";
            }
            case "x86_64": {
                return "x86_64";
            }
            default: {
                return s;
            }
        }
    }
}

