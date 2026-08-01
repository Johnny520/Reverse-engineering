package com.android.dx.io;

import androidx.activity.AbstractC0053;
import com.google.protobuf.C3349;
import java.io.File;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import p292.C8540;
import p292.C8546;
import p292.C8547;
import p292.C8551;
import p292.C8552;
import p292.C8553;
import p292.C8558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DexIndexPrinter {
    private final C8558 dex;
    private final C8546 tableOfContents;

    public DexIndexPrinter(File file) {
        C8558 c8558 = new C8558(file);
        this.dex = c8558;
        this.tableOfContents = c8558.f23889;
    }

    public static void main(String[] strArr) {
        DexIndexPrinter dexIndexPrinter = new DexIndexPrinter(new File(strArr[0]));
        dexIndexPrinter.printMap();
        dexIndexPrinter.printStrings();
        dexIndexPrinter.printTypeIds();
        dexIndexPrinter.printProtoIds();
        dexIndexPrinter.printFieldIds();
        dexIndexPrinter.printMethodIds();
        dexIndexPrinter.printTypeLists();
        dexIndexPrinter.printClassDefs();
    }

    private void printClassDefs() {
        C8558 c8558 = this.dex;
        c8558.getClass();
        Iterator it = !c8558.f23889.f23839.m14111() ? Collections.EMPTY_SET.iterator() : new C3349(c8558);
        int i = 0;
        while (it.hasNext()) {
            C8540 c8540 = (C8540) it.next();
            System.out.println("class def " + i + ": " + c8540);
            i++;
        }
    }

    private void printFieldIds() {
        int i = 0;
        for (C8553 c8553 : this.dex.f23891) {
            System.out.println("field " + i + ": " + c8553);
            i++;
        }
    }

    private void printMap() {
        for (C8547 c8547 : this.tableOfContents.f23830) {
            if (c8547.f23846 != -1) {
                System.out.println("section " + Integer.toHexString(c8547.f23847) + " off=" + Integer.toHexString(c8547.f23846) + " size=" + Integer.toHexString(c8547.f23845) + " byteCount=" + Integer.toHexString(c8547.f23844));
            }
        }
    }

    private void printMethodIds() {
        int i = 0;
        for (C8551 c8551 : this.dex.f23893) {
            System.out.println("methodId " + i + ": " + c8551);
            i++;
        }
    }

    private void printProtoIds() {
        int i = 0;
        for (C8552 c8552 : this.dex.f23892) {
            System.out.println("proto " + i + ": " + c8552);
            i++;
        }
    }

    private void printStrings() {
        int i = 0;
        for (String str : this.dex.f23887) {
            System.out.println("string " + i + ": " + str);
            i++;
        }
    }

    private void printTypeIds() {
        int i = 0;
        for (Integer num : this.dex.f23886) {
            PrintStream printStream = System.out;
            StringBuilder sbM150 = AbstractC0053.m150(i, "type ", ": ");
            sbM150.append((String) this.dex.f23887.get(num.intValue()));
            printStream.println(sbM150.toString());
            i++;
        }
    }

    private void printTypeLists() {
        int i = this.tableOfContents.f23840.f23846;
        if (i == -1) {
            System.out.println("No type lists");
            return;
        }
        ByteBuffer byteBuffer = this.dex.m14133(i).f23882;
        for (int i2 = 0; i2 < this.tableOfContents.f23840.f23845; i2++) {
            int i3 = byteBuffer.getInt();
            System.out.print("Type list i=" + i2 + ", size=" + i3 + ", elements=");
            for (int i4 = 0; i4 < i3; i4++) {
                System.out.print(" ".concat((String) this.dex.f23885.get(byteBuffer.getShort())));
            }
            if (i3 % 2 == 1) {
                byteBuffer.getShort();
            }
            System.out.println();
        }
    }
}
