// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.text.TextUtils;
import android.util.Log;
import c.ˉˆ.CLS59;
import c.ˊﹶ.CLS98;
import c.ˏי.CLS111;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CLS185 {
    public static void MTH2706(String s, boolean z, boolean z1) {
        synchronized(CLS185.class) {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            if(s.length() > 4000) {
                CLS185.MTH2706(s.substring(0, 4000), z, z1);
                CLS185.MTH2706(s.substring(4000), z, z1);
                return;
            }
            if(CLS111.MTH1570() || CLS111.MTH1549() || CLS111.MTH1561() || CLS111.MTH1588()) {
                System.out.println("X: " + s);
            }
            CLS111.MTH1567(("X: " + s));
            if(!z1) {
                CLS185.MTH2709(s, z);
            }
        }
    }

    public static void MTH2707(Throwable throwable0, boolean z, boolean z1) {
        synchronized(CLS185.class) {
            if(throwable0 == null) {
                return;
            }
            if(CLS111.MTH1570() || CLS111.MTH1549() || CLS111.MTH1561()) {
                System.out.println("X: " + Log.getStackTraceString(throwable0));
            }
            CLS111.MTH1585(throwable0);
            if(!z1) {
                CLS185.MTH2709(Log.getStackTraceString(throwable0), z);
            }
        }
    }

    public static void MTH2708(Throwable throwable0) {
        synchronized(CLS185.class) {
            CLS185.MTH2707(throwable0, false, false);
        }
    }

    public static void MTH2709(String s, boolean z) {
        synchronized(CLS185.class) {
            if(!CLS111.MTH1569() && !CLS111.MTH1559() && !CLS111.MTH1579()) {
                try {
                    if(!z) {
                        CLS59 ʼˊ0 = CLS98.MTH1297();
                        if(ʼˊ0 == null || !ʼˊ0.MTH994("log_to_file_enable", false)) {
                            return;
                        }
                    }
                    File file0 = CLS186.MTH2743(CLS98.MTH1323(), 1);
                    if(file0 == null) {
                        return;
                    }
                    File file1 = new File(file0, "logFile.log");
                    if(file1.length() >= 5000000L) {
                        file1.delete();
                    }
                    if(!CLS176.MTH2570(file1)) {
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
                    bufferedWriter0.write(CLS205.MTH2977(System.currentTimeMillis()) + ": " + s + "\r\n");
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

    public static void MTH2710(Object object0) {
        CLS59 ʼˊ0 = CLS98.MTH1297();
        if(ʼˊ0 != null && !ʼˊ0.MTH994("_debug", false)) {
            return;
        }
        if(object0 instanceof Throwable) {
            CLS185.MTH2708(((Throwable)object0));
            return;
        }
        CLS185.MTH2711(("" + object0));
    }

    public static void MTH2711(String s) {
        synchronized(CLS185.class) {
            CLS185.MTH2706(s, false, false);
        }
    }
}

