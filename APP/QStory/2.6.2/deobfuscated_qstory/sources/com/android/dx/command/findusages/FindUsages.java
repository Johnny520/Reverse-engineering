package com.android.dx.command.findusages;

import com.android.dx.io.CodeReader;
import com.android.dx.io.OpcodeInfo;
import com.android.dx.io.instructions.DecodedInstruction;
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
import p292.C8551;
import p292.C8556;
import p292.C8559;
import p292.C8561;
import p292.C8566;
import p292.C8568;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class FindUsages {
    private final CodeReader codeReader = new CodeReader();
    private C8548 currentClass;
    private C8550 currentMethod;
    private final C8566 dex;
    private final Set<Integer> fieldIds;
    private final Set<Integer> methodIds;
    private final PrintWriter out;

    public FindUsages(final C8566 c8566, String str, String str2, final PrintWriter printWriter) {
        this.dex = c8566;
        this.out = printWriter;
        HashSet<Integer> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Pattern patternCompile = Pattern.compile(str);
        Pattern patternCompile2 = Pattern.compile(str2);
        C8568 c8568 = c8566.f23896;
        for (int i = 0; i < c8568.size(); i++) {
            String str3 = (String) c8568.get(i);
            if (patternCompile.matcher(str3).matches()) {
                hashSet.add(Integer.valueOf(i));
            }
            if (patternCompile2.matcher(str3).matches()) {
                hashSet2.add(Integer.valueOf(i));
            }
        }
        if (hashSet.isEmpty() || hashSet2.isEmpty()) {
            this.fieldIds = null;
            this.methodIds = null;
            return;
        }
        this.methodIds = new HashSet();
        this.fieldIds = new HashSet();
        for (Integer num : hashSet) {
            num.intValue();
            int iBinarySearch = Collections.binarySearch(c8566.f23895, num);
            if (iBinarySearch >= 0) {
                this.methodIds.addAll(getMethodIds(c8566, hashSet2, iBinarySearch));
                this.fieldIds.addAll(getFieldIds(c8566, hashSet2, iBinarySearch));
            }
        }
        this.codeReader.setFieldVisitor(new CodeReader.Visitor(this) { // from class: com.android.dx.command.findusages.FindUsages.1
            final /* synthetic */ FindUsages this$0;

            {
                this.this$0 = this;
            }

            @Override // com.android.dx.io.CodeReader.Visitor
            public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
                int index = decodedInstruction.getIndex();
                if (this.this$0.fieldIds.contains(Integer.valueOf(index))) {
                    printWriter.println(this.this$0.location() + ": field reference " + c8566.f23900.get(index) + " (" + OpcodeInfo.getName(decodedInstruction.getOpcode()) + ")");
                }
            }
        });
        this.codeReader.setMethodVisitor(new CodeReader.Visitor(this) { // from class: com.android.dx.command.findusages.FindUsages.2
            final /* synthetic */ FindUsages this$0;

            {
                this.this$0 = this;
            }

            @Override // com.android.dx.io.CodeReader.Visitor
            public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
                int index = decodedInstruction.getIndex();
                if (this.this$0.methodIds.contains(Integer.valueOf(index))) {
                    printWriter.println(this.this$0.location() + ": method reference " + c8566.f23902.get(index) + " (" + OpcodeInfo.getName(decodedInstruction.getOpcode()) + ")");
                }
            }
        });
    }

    private Set<Integer> findAssignableTypes(C8566 c8566, int i) {
        C8556 c8556M14103;
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(i));
        c8566.getClass();
        Iterator it = !c8566.f23898.f23848.m14092() ? Collections.EMPTY_SET.iterator() : new C3348(c8566);
        while (it.hasNext()) {
            C8548 c8548 = (C8548) it.next();
            int i2 = c8548.f23801;
            int i3 = c8548.f23803;
            if (hashSet.contains(Integer.valueOf(i2))) {
                hashSet.add(Integer.valueOf(i3));
            } else {
                C8566 c85662 = c8548.f23805;
                int i4 = c8548.f23800;
                if (i4 == 0) {
                    c85662.getClass();
                    c8556M14103 = C8556.f23857;
                } else {
                    c8556M14103 = c85662.m14114(i4).m14103();
                }
                short[] sArr = c8556M14103.f23858;
                int length = sArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    if (hashSet.contains(Integer.valueOf(sArr[i5]))) {
                        hashSet.add(Integer.valueOf(i3));
                        break;
                    }
                    i5++;
                }
            }
        }
        return hashSet;
    }

    private Set<Integer> getFieldIds(C8566 c8566, Set<Integer> set, int i) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (C8561 c8561 : c8566.f23900) {
            if (set.contains(Integer.valueOf(c8561.f23873)) && i == c8561.f23874) {
                hashSet.add(Integer.valueOf(i2));
            }
            i2++;
        }
        return hashSet;
    }

    private Set<Integer> getMethodIds(C8566 c8566, Set<Integer> set, int i) {
        Set<Integer> setFindAssignableTypes = findAssignableTypes(c8566, i);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (C8559 c8559 : c8566.f23902) {
            if (set.contains(Integer.valueOf(c8559.f23865)) && setFindAssignableTypes.contains(Integer.valueOf(c8559.f23866))) {
                hashSet.add(Integer.valueOf(i2));
            }
            i2++;
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String location() {
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

    public void findUsages() {
        if (this.fieldIds == null || this.methodIds == null) {
            return;
        }
        C8566 c8566 = this.dex;
        c8566.getClass();
        Iterator it = !c8566.f23898.f23848.m14092() ? Collections.EMPTY_SET.iterator() : new C3348(c8566);
        while (it.hasNext()) {
            C8548 c8548 = (C8548) it.next();
            this.currentClass = c8548;
            this.currentMethod = null;
            if (c8548.f23808 != 0) {
                C8549 c8549M14113 = this.dex.m14113(c8548);
                C8551[] c8551Arr = c8549M14113.f23813;
                int length = c8551Arr.length;
                C8551[] c8551Arr2 = c8549M14113.f23812;
                int length2 = length + c8551Arr2.length;
                C8551[] c8551Arr3 = new C8551[length2];
                System.arraycopy(c8551Arr, 0, c8551Arr3, 0, c8551Arr.length);
                System.arraycopy(c8551Arr2, 0, c8551Arr3, c8551Arr.length, c8551Arr2.length);
                for (int i = 0; i < length2; i++) {
                    int i2 = c8551Arr3[i].f23818;
                    if (this.fieldIds.contains(Integer.valueOf(i2))) {
                        this.out.println(location() + " field declared " + this.dex.f23900.get(i2));
                    }
                }
                C8550[] c8550Arr = c8549M14113.f23811;
                int length3 = c8550Arr.length;
                C8550[] c8550Arr2 = c8549M14113.f23810;
                int length4 = length3 + c8550Arr2.length;
                C8550[] c8550Arr3 = new C8550[length4];
                System.arraycopy(c8550Arr, 0, c8550Arr3, 0, c8550Arr.length);
                System.arraycopy(c8550Arr2, 0, c8550Arr3, c8550Arr.length, c8550Arr2.length);
                for (int i3 = 0; i3 < length4; i3++) {
                    C8550 c8550 = c8550Arr3[i3];
                    this.currentMethod = c8550;
                    int i4 = c8550.f23816;
                    if (this.methodIds.contains(Integer.valueOf(i4))) {
                        this.out.println(location() + " method declared " + this.dex.f23902.get(i4));
                    }
                    if (c8550.f23814 != 0) {
                        this.codeReader.visitAll(this.dex.m14112(c8550).f23904);
                    }
                }
            }
        }
        this.currentClass = null;
        this.currentMethod = null;
    }
}
