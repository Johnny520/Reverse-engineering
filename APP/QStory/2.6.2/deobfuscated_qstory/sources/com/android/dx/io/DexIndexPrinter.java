package com.android.dx.io;

import androidx.activity.AbstractC0053;
import com.google.protobuf.C3348;
import java.io.File;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import p292.C8548;
import p292.C8554;
import p292.C8555;
import p292.C8559;
import p292.C8560;
import p292.C8561;
import p292.C8566;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DexIndexPrinter {
    private final C8566 dex;
    private final C8554 tableOfContents;

    public DexIndexPrinter(File file) {
        C8566 c8566 = new C8566(file);
        this.dex = c8566;
        this.tableOfContents = c8566.f23898;
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
        C8566 c8566 = this.dex;
        c8566.getClass();
        Iterator it = !c8566.f23898.f23848.m14092() ? Collections.EMPTY_SET.iterator() : new C3348(c8566);
        int i = 0;
        while (it.hasNext()) {
            C8548 c8548 = (C8548) it.next();
            System.out.println("class def " + i + ": " + c8548);
            i++;
        }
    }

    private void printFieldIds() {
        int i = 0;
        for (C8561 c8561 : this.dex.f23900) {
            System.out.println("field " + i + ": " + c8561);
            i++;
        }
    }

    private void printMap() {
        for (C8555 c8555 : this.tableOfContents.f23839) {
            if (c8555.f23855 != -1) {
                System.out.println("section " + Integer.toHexString(c8555.f23856) + " off=" + Integer.toHexString(c8555.f23855) + " size=" + Integer.toHexString(c8555.f23854) + " byteCount=" + Integer.toHexString(c8555.f23853));
            }
        }
    }

    private void printMethodIds() {
        int i = 0;
        for (C8559 c8559 : this.dex.f23902) {
            System.out.println("methodId " + i + ": " + c8559);
            i++;
        }
    }

    private void printProtoIds() {
        int i = 0;
        for (C8560 c8560 : this.dex.f23901) {
            System.out.println("proto " + i + ": " + c8560);
            i++;
        }
    }

    private void printStrings() {
        int i = 0;
        for (String str : this.dex.f23896) {
            System.out.println("string " + i + ": " + str);
            i++;
        }
    }

    private void printTypeIds() {
        int i = 0;
        for (Integer num : this.dex.f23895) {
            PrintStream printStream = System.out;
            StringBuilder sbM148 = AbstractC0053.m148(i, "type ", ": ");
            sbM148.append((String) this.dex.f23896.get(num.intValue()));
            printStream.println(sbM148.toString());
            i++;
        }
    }

    private void printTypeLists() {
        int i = this.tableOfContents.f23849.f23855;
        if (i == -1) {
            System.out.println("No type lists");
            return;
        }
        ByteBuffer byteBuffer = this.dex.m14114(i).f23891;
        for (int i2 = 0; i2 < this.tableOfContents.f23849.f23854; i2++) {
            int i3 = byteBuffer.getInt();
            System.out.print("Type list i=" + i2 + ", size=" + i3 + ", elements=");
            for (int i4 = 0; i4 < i3; i4++) {
                System.out.print(" ".concat((String) this.dex.f23894.get(byteBuffer.getShort())));
            }
            if (i3 % 2 == 1) {
                byteBuffer.getShort();
            }
            System.out.println();
        }
    }
}
