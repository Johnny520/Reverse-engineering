package com.android.p002dx.command.grep;

import com.android.p002dx.p005io.CodeReader;
import com.android.p002dx.p005io.instructions.DecodedInstruction;
import com.bumptech.glide.AbstractC3887;
import com.google.protobuf.C4181;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import p025.AbstractC7012;
import p308.C9369;
import p308.C9370;
import p308.C9371;
import p308.C9378;
import p308.C9380;
import p308.C9387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Grep {
    private final CodeReader codeReader;
    private int count;
    private C9369 currentClass;
    private C9371 currentMethod;
    private final C9387 dex;
    private final PrintWriter out;
    private final Set<Integer> stringIds;

    public Grep(C9387 c9387, Pattern pattern, PrintWriter printWriter) {
        CodeReader codeReader = new CodeReader();
        this.codeReader = codeReader;
        this.count = 0;
        this.dex = c9387;
        this.out = printWriter;
        this.stringIds = getStringIds(c9387, pattern);
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
            this.out.println(location() + " " + ((String) this.dex.f24232.get(i)));
            this.count = this.count + 1;
        }
    }

    private Set<Integer> getStringIds(C9387 c9387, Pattern pattern) {
        HashSet hashSet = new HashSet();
        Iterator it = c9387.f24232.iterator();
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
        String str = (String) this.dex.f24230.get(this.currentClass.f24139);
        C9371 c9371 = this.currentMethod;
        if (c9371 == null) {
            return str;
        }
        C9380 c9380 = (C9380) this.dex.f24238.get(c9371.f24152);
        StringBuilder sbM12143 = AbstractC7012.m12143(str, ".");
        sbM12143.append((String) this.dex.f24232.get(c9380.f24201));
        return sbM12143.toString();
    }

    private void readArray(C9378 c9378) {
        c9378.m14676(28);
        c9378.f24198 = -1;
        int iM7204 = AbstractC3887.m7204(c9378.f24199);
        for (int i = 0; i < iM7204; i++) {
            int iM14675 = c9378.m14675();
            if (iM14675 == 23) {
                encounterString(c9378.m14671());
            } else if (iM14675 == 28) {
                readArray(c9378);
            }
        }
    }

    public int grep() {
        C9387 c9387 = this.dex;
        c9387.getClass();
        Iterator it = !c9387.f24234.f24184.m14670() ? Collections.EMPTY_SET.iterator() : new C4181(c9387);
        while (it.hasNext()) {
            C9369 c9369 = (C9369) it.next();
            this.currentClass = c9369;
            this.currentMethod = null;
            if (c9369.f24144 != 0) {
                C9370 c9370M14691 = this.dex.m14691(c9369);
                int i = c9369.f24145;
                if (i != 0) {
                    readArray(new C9378(this.dex.m14692(i)));
                }
                C9371[] c9371Arr = c9370M14691.f24147;
                int length = c9371Arr.length;
                C9371[] c9371Arr2 = c9370M14691.f24146;
                int length2 = length + c9371Arr2.length;
                C9371[] c9371Arr3 = new C9371[length2];
                System.arraycopy(c9371Arr, 0, c9371Arr3, 0, c9371Arr.length);
                System.arraycopy(c9371Arr2, 0, c9371Arr3, c9371Arr.length, c9371Arr2.length);
                for (int i2 = 0; i2 < length2; i2++) {
                    C9371 c9371 = c9371Arr3[i2];
                    this.currentMethod = c9371;
                    if (c9371.f24150 != 0) {
                        this.codeReader.visitAll(this.dex.m14690(c9371).f24240);
                    }
                }
            }
        }
        this.currentClass = null;
        this.currentMethod = null;
        return this.count;
    }
}
