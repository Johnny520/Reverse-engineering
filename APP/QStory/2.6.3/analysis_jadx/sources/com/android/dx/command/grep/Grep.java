package com.android.dx.command.grep;

import com.android.dx.io.CodeReader;
import com.android.dx.io.instructions.DecodedInstruction;
import com.bumptech.glide.AbstractC3055;
import com.google.protobuf.C3349;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import p009.AbstractC6183;
import p292.C8540;
import p292.C8541;
import p292.C8542;
import p292.C8549;
import p292.C8551;
import p292.C8558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Grep {
    private final CodeReader codeReader;
    private int count;
    private C8540 currentClass;
    private C8542 currentMethod;
    private final C8558 dex;
    private final PrintWriter out;
    private final Set<Integer> stringIds;

    public Grep(C8558 c8558, Pattern pattern, PrintWriter printWriter) {
        CodeReader codeReader = new CodeReader();
        this.codeReader = codeReader;
        this.count = 0;
        this.dex = c8558;
        this.out = printWriter;
        this.stringIds = getStringIds(c8558, pattern);
        codeReader.setStringVisitor(new CodeReader.Visitor() { // from class: com.android.dx.command.grep.Grep.1
            @Override // com.android.dx.io.CodeReader.Visitor
            public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
                Grep.this.encounterString(decodedInstruction.getIndex());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void encounterString(int i) {
        if (this.stringIds.contains(Integer.valueOf(i))) {
            this.out.println(location() + " " + ((String) this.dex.f23887.get(i)));
            this.count = this.count + 1;
        }
    }

    private Set<Integer> getStringIds(C8558 c8558, Pattern pattern) {
        HashSet hashSet = new HashSet();
        Iterator it = c8558.f23887.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (pattern.matcher((String) it.next()).find()) {
                hashSet.add(Integer.valueOf(i));
            }
            i++;
        }
        return hashSet;
    }

    private String location() {
        String str = (String) this.dex.f23885.get(this.currentClass.f23794);
        C8542 c8542 = this.currentMethod;
        if (c8542 == null) {
            return str;
        }
        C8551 c8551 = (C8551) this.dex.f23893.get(c8542.f23807);
        StringBuilder sbM11584 = AbstractC6183.m11584(str, ".");
        sbM11584.append((String) this.dex.f23887.get(c8551.f23856));
        return sbM11584.toString();
    }

    private void readArray(C8549 c8549) {
        c8549.m14117(28);
        c8549.f23853 = -1;
        int iM6644 = AbstractC3055.m6644(c8549.f23854);
        for (int i = 0; i < iM6644; i++) {
            int iM14116 = c8549.m14116();
            if (iM14116 == 23) {
                encounterString(c8549.m14112());
            } else if (iM14116 == 28) {
                readArray(c8549);
            }
        }
    }

    public int grep() {
        C8558 c8558 = this.dex;
        c8558.getClass();
        Iterator it = !c8558.f23889.f23839.m14111() ? Collections.EMPTY_SET.iterator() : new C3349(c8558);
        while (it.hasNext()) {
            C8540 c8540 = (C8540) it.next();
            this.currentClass = c8540;
            this.currentMethod = null;
            if (c8540.f23799 != 0) {
                C8541 c8541M14132 = this.dex.m14132(c8540);
                int i = c8540.f23800;
                if (i != 0) {
                    readArray(new C8549(this.dex.m14133(i)));
                }
                C8542[] c8542Arr = c8541M14132.f23802;
                int length = c8542Arr.length;
                C8542[] c8542Arr2 = c8541M14132.f23801;
                int length2 = length + c8542Arr2.length;
                C8542[] c8542Arr3 = new C8542[length2];
                System.arraycopy(c8542Arr, 0, c8542Arr3, 0, c8542Arr.length);
                System.arraycopy(c8542Arr2, 0, c8542Arr3, c8542Arr.length, c8542Arr2.length);
                for (int i2 = 0; i2 < length2; i2++) {
                    C8542 c8542 = c8542Arr3[i2];
                    this.currentMethod = c8542;
                    if (c8542.f23805 != 0) {
                        this.codeReader.visitAll(this.dex.m14131(c8542).f23895);
                    }
                }
            }
        }
        this.currentClass = null;
        this.currentMethod = null;
        return this.count;
    }
}
