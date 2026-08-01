package com.android.dx.command.grep;

import com.android.dx.io.CodeReader;
import com.android.dx.io.instructions.DecodedInstruction;
import com.bumptech.glide.AbstractC3065;
import com.google.protobuf.C3348;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import p007.AbstractC6136;
import p292.C8548;
import p292.C8549;
import p292.C8550;
import p292.C8557;
import p292.C8559;
import p292.C8566;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Grep {
    private final CodeReader codeReader;
    private int count;
    private C8548 currentClass;
    private C8550 currentMethod;
    private final C8566 dex;
    private final PrintWriter out;
    private final Set<Integer> stringIds;

    public Grep(C8566 c8566, Pattern pattern, PrintWriter printWriter) {
        CodeReader codeReader = new CodeReader();
        this.codeReader = codeReader;
        this.count = 0;
        this.dex = c8566;
        this.out = printWriter;
        this.stringIds = getStringIds(c8566, pattern);
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
            this.out.println(location() + " " + ((String) this.dex.f23896.get(i)));
            this.count = this.count + 1;
        }
    }

    private Set<Integer> getStringIds(C8566 c8566, Pattern pattern) {
        HashSet hashSet = new HashSet();
        Iterator it = c8566.f23896.iterator();
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
        String str = (String) this.dex.f23894.get(this.currentClass.f23803);
        C8550 c8550 = this.currentMethod;
        if (c8550 == null) {
            return str;
        }
        C8559 c8559 = (C8559) this.dex.f23902.get(c8550.f23816);
        StringBuilder sbM11553 = AbstractC6136.m11553(str, ".");
        sbM11553.append((String) this.dex.f23896.get(c8559.f23865));
        return sbM11553.toString();
    }

    private void readArray(C8557 c8557) {
        c8557.m14098(28);
        c8557.f23862 = -1;
        int iM6852 = AbstractC3065.m6852(c8557.f23863);
        for (int i = 0; i < iM6852; i++) {
            int iM14097 = c8557.m14097();
            if (iM14097 == 23) {
                encounterString(c8557.m14093());
            } else if (iM14097 == 28) {
                readArray(c8557);
            }
        }
    }

    public int grep() {
        C8566 c8566 = this.dex;
        c8566.getClass();
        Iterator it = !c8566.f23898.f23848.m14092() ? Collections.EMPTY_SET.iterator() : new C3348(c8566);
        while (it.hasNext()) {
            C8548 c8548 = (C8548) it.next();
            this.currentClass = c8548;
            this.currentMethod = null;
            if (c8548.f23808 != 0) {
                C8549 c8549M14113 = this.dex.m14113(c8548);
                int i = c8548.f23809;
                if (i != 0) {
                    readArray(new C8557(this.dex.m14114(i)));
                }
                C8550[] c8550Arr = c8549M14113.f23811;
                int length = c8550Arr.length;
                C8550[] c8550Arr2 = c8549M14113.f23810;
                int length2 = length + c8550Arr2.length;
                C8550[] c8550Arr3 = new C8550[length2];
                System.arraycopy(c8550Arr, 0, c8550Arr3, 0, c8550Arr.length);
                System.arraycopy(c8550Arr2, 0, c8550Arr3, c8550Arr.length, c8550Arr2.length);
                for (int i2 = 0; i2 < length2; i2++) {
                    C8550 c8550 = c8550Arr3[i2];
                    this.currentMethod = c8550;
                    if (c8550.f23814 != 0) {
                        this.codeReader.visitAll(this.dex.m14112(c8550).f23904);
                    }
                }
            }
        }
        this.currentClass = null;
        this.currentMethod = null;
        return this.count;
    }
}
