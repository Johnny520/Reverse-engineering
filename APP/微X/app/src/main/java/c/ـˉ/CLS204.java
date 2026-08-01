// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.text.TextUtils;
import android.util.Log;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS102;
import c.יᴵ.CLS156;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CLS204 {
    public static void MTH3252(String s) {
        synchronized(CLS204.class) {
            CLS204.MTH3255(s, false, false);
        }
    }

    public static void MTH3253(Throwable throwable0, boolean z, boolean z1) {
        synchronized(CLS204.class) {
            if(throwable0 == null) {
                return;
            }
            if(CLS102.MTH2156() || CLS102.MTH2176() || CLS102.MTH2159()) {
                System.out.println("X: " + Log.getStackTraceString(throwable0));
            }
            CLS102.MTH2146(throwable0);
            if(!z1) {
                CLS204.MTH3256(Log.getStackTraceString(throwable0), z);
            }
        }
    }

    public static void MTH3254(Object object0) {
        CLS156 ٴʻ0 = CLS95.MTH2031();
        if(ٴʻ0 != null && !ٴʻ0.MTH2725("_debug", false)) {
            return;
        }
        if(object0 instanceof Throwable) {
            CLS204.MTH3257(((Throwable)object0));
            return;
        }
        CLS204.MTH3252(("" + object0));
    }

    public static void MTH3255(String s, boolean z, boolean z1) {
        synchronized(CLS204.class) {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            if(s.length() > 4000) {
                CLS204.MTH3255(s.substring(0, 4000), z, z1);
                CLS204.MTH3255(s.substring(4000), z, z1);
                return;
            }
            if(CLS102.MTH2156() || CLS102.MTH2176() || CLS102.MTH2159() || CLS102.MTH2165()) {
                System.out.println("X: " + s);
            }
            CLS102.MTH2178(("X: " + s));
            if(!z1) {
                CLS204.MTH3256(s, z);
            }
        }
    }

    public static void MTH3256(String s, boolean z) {
        synchronized(CLS204.class) {
            if(!CLS102.MTH2171() && !CLS102.MTH2169() && !CLS102.MTH2145()) {
                try {
                    if(!z) {
                        CLS156 ٴʻ0 = CLS95.MTH2031();
                        if(ٴʻ0 == null || !ٴʻ0.MTH2725("log_to_file_enable", false)) {
                            return;
                        }
                    }
                    File file0 = CLS243.MTH3618(CLS95.MTH2017(), 1);
                    if(file0 == null) {
                        return;
                    }
                    File file1 = new File(file0, "logFile.log");
                    if(file1.length() >= 5000000L) {
                        file1.delete();
                    }
                    if(!CLS262.MTH4050(file1)) {
                        try {
                            file1.createNewFile();
                        }
                        catch(Throwable throwable1) {
                            throwable1.printStackTrace();
                        }
                    }
                    if(!file1.canWrite()) {
                        return;
                    }
                    BufferedWriter bufferedWriter0 = new BufferedWriter(new FileWriter(file1, true));
                    bufferedWriter0.write(CLS259.MTH3820(System.currentTimeMillis()) + ": " + s + "\r\n");
                    bufferedWriter0.newLine();
                    bufferedWriter0.flush();
                    bufferedWriter0.close();
                }
                catch(Throwable throwable0) {
                    throwable0.printStackTrace();
                }
            }
        }
    }

    public static void MTH3257(Throwable throwable0) {
        synchronized(CLS204.class) {
            CLS204.MTH3253(throwable0, false, false);
        }
    }
}

