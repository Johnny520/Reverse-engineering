package com.android.p002dx.p005io;

import androidx.activity.AbstractC0900;
import com.google.protobuf.C4181;
import java.io.File;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import p308.C9369;
import p308.C9375;
import p308.C9376;
import p308.C9380;
import p308.C9381;
import p308.C9382;
import p308.C9387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DexIndexPrinter {
    private final C9387 dex;
    private final C9375 tableOfContents;

    public DexIndexPrinter(File file) {
        C9387 c9387 = new C9387(file);
        this.dex = c9387;
        this.tableOfContents = c9387.f24234;
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
        C9387 c9387 = this.dex;
        c9387.getClass();
        Iterator it = !c9387.f24234.f24184.m14670() ? Collections.EMPTY_SET.iterator() : new C4181(c9387);
        int i = 0;
        while (it.hasNext()) {
            C9369 c9369 = (C9369) it.next();
            System.out.println("class def " + i + ": " + c9369);
            i++;
        }
    }

    private void printFieldIds() {
        int i = 0;
        for (C9382 c9382 : this.dex.f24236) {
            System.out.println("field " + i + ": " + c9382);
            i++;
        }
    }

    private void printMap() {
        for (C9376 c9376 : this.tableOfContents.f24175) {
            if (c9376.f24191 != -1) {
                System.out.println("section " + Integer.toHexString(c9376.f24192) + " off=" + Integer.toHexString(c9376.f24191) + " size=" + Integer.toHexString(c9376.f24190) + " byteCount=" + Integer.toHexString(c9376.f24189));
            }
        }
    }

    private void printMethodIds() {
        int i = 0;
        for (C9380 c9380 : this.dex.f24238) {
            System.out.println("methodId " + i + ": " + c9380);
            i++;
        }
    }

    private void printProtoIds() {
        int i = 0;
        for (C9381 c9381 : this.dex.f24237) {
            System.out.println("proto " + i + ": " + c9381);
            i++;
        }
    }

    private void printStrings() {
        int i = 0;
        for (String str : this.dex.f24232) {
            System.out.println("string " + i + ": " + str);
            i++;
        }
    }

    private void printTypeIds() {
        int i = 0;
        for (Integer num : this.dex.f24231) {
            PrintStream printStream = System.out;
            StringBuilder sbM710 = AbstractC0900.m710(i, "type ", ": ");
            sbM710.append((String) this.dex.f24232.get(num.intValue()));
            printStream.println(sbM710.toString());
            i++;
        }
    }

    private void printTypeLists() {
        int i = this.tableOfContents.f24185.f24191;
        if (i == -1) {
            System.out.println("No type lists");
            return;
        }
        ByteBuffer byteBuffer = this.dex.m14692(i).f24227;
        for (int i2 = 0; i2 < this.tableOfContents.f24185.f24190; i2++) {
            int i3 = byteBuffer.getInt();
            System.out.print("Type list i=" + i2 + ", size=" + i3 + ", elements=");
            for (int i4 = 0; i4 < i3; i4++) {
                System.out.print(" ".concat((String) this.dex.f24230.get(byteBuffer.getShort())));
            }
            if (i3 % 2 == 1) {
                byteBuffer.getShort();
            }
            System.out.println();
        }
    }
}
