package com.android.p002dx.command.dump;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import bsh.C3466;
import com.android.p002dx.p003cf.iface.ParseException;
import com.android.p002dx.util.HexParser;
import java.io.File;
import java.io.UnsupportedEncodingException;
import net.bytebuddy.dynamic.ClassFileLocator;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Main {
    private final Args parsedArgs = new Args();

    private Main() {
    }

    public static void main(String[] strArr) {
        new Main().run(strArr);
    }

    private void processOne(String str, byte[] bArr) {
        Args args = this.parsedArgs;
        if (args.dotDump) {
            DotDumper.dump(bArr, str, args);
            return;
        }
        if (args.basicBlocks) {
            BlockDumper.dump(bArr, System.out, str, false, args);
            return;
        }
        if (args.ropBlocks) {
            BlockDumper.dump(bArr, System.out, str, true, args);
        } else if (!args.ssaBlocks) {
            ClassDumper.dump(bArr, System.out, str, args);
        } else {
            args.optimize = false;
            SsaDumper.dump(bArr, System.out, str, args);
        }
    }

    private void run(String[] strArr) {
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            if (str.equals("--") || !str.startsWith("--")) {
                break;
            }
            if (str.equals("--bytes")) {
                this.parsedArgs.rawBytes = true;
            } else if (str.equals("--basic-blocks")) {
                this.parsedArgs.basicBlocks = true;
            } else if (str.equals("--rop-blocks")) {
                this.parsedArgs.ropBlocks = true;
            } else if (str.equals("--optimize")) {
                this.parsedArgs.optimize = true;
            } else if (str.equals("--ssa-blocks")) {
                this.parsedArgs.ssaBlocks = true;
            } else if (str.startsWith("--ssa-step=")) {
                this.parsedArgs.ssaStep = str.substring(str.indexOf(61) + 1);
            } else if (str.equals("--debug")) {
                this.parsedArgs.debug = true;
            } else if (str.equals("--dot")) {
                this.parsedArgs.dotDump = true;
            } else if (str.equals("--strict")) {
                this.parsedArgs.strictParse = true;
            } else if (str.startsWith("--width=")) {
                this.parsedArgs.width = Integer.parseInt(str.substring(str.indexOf(61) + 1));
            } else {
                if (!str.startsWith("--method=")) {
                    System.err.println("unknown option: ".concat(str));
                    C3466.m5899("usage");
                    return;
                }
                this.parsedArgs.method = str.substring(str.indexOf(61) + 1);
            }
            i++;
        }
        if (i == strArr.length) {
            System.err.println("no input files specified");
            C3466.m5899("usage");
            return;
        }
        while (i < strArr.length) {
            try {
                String str2 = strArr[i];
                System.out.println("reading " + str2 + "...");
                byte[] bArrM1713 = AbstractC1298.m1713(new File(str2));
                if (!str2.endsWith(ClassFileLocator.CLASS_FILE_EXTENSION)) {
                    try {
                        bArrM1713 = HexParser.parse(new String(bArrM1713, "utf-8"));
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException("shouldn't happen", e);
                    }
                }
                processOne(str2, bArrM1713);
            } catch (ParseException e2) {
                System.err.println("\ntrouble parsing:");
                if (this.parsedArgs.debug) {
                    e2.printStackTrace();
                } else {
                    e2.printContext(System.err);
                }
            }
            i++;
        }
    }
}
