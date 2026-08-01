package com.android.dx.command.findusages;

import com.android.dx.io.CodeReader;
import com.android.dx.io.OpcodeInfo;
import com.android.dx.io.instructions.DecodedInstruction;
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
import p292.C8543;
import p292.C8548;
import p292.C8551;
import p292.C8553;
import p292.C8558;
import p292.C8560;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class FindUsages {
    private final CodeReader codeReader = new CodeReader();
    private C8540 currentClass;
    private C8542 currentMethod;
    private final C8558 dex;
    private final Set<Integer> fieldIds;
    private final Set<Integer> methodIds;
    private final PrintWriter out;

    public FindUsages(final C8558 c8558, String str, String str2, final PrintWriter printWriter) {
        this.dex = c8558;
        this.out = printWriter;
        HashSet<Integer> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Pattern patternCompile = Pattern.compile(str);
        Pattern patternCompile2 = Pattern.compile(str2);
        C8560 c8560 = c8558.f23887;
        for (int i = 0; i < c8560.size(); i++) {
            String str3 = (String) c8560.get(i);
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
            int iBinarySearch = Collections.binarySearch(c8558.f23886, num);
            if (iBinarySearch >= 0) {
                this.methodIds.addAll(getMethodIds(c8558, hashSet2, iBinarySearch));
                this.fieldIds.addAll(getFieldIds(c8558, hashSet2, iBinarySearch));
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
                    printWriter.println(this.this$0.location() + ": field reference " + c8558.f23891.get(index) + " (" + OpcodeInfo.getName(decodedInstruction.getOpcode()) + ")");
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
                    printWriter.println(this.this$0.location() + ": method reference " + c8558.f23893.get(index) + " (" + OpcodeInfo.getName(decodedInstruction.getOpcode()) + ")");
                }
            }
        });
    }

    private Set<Integer> findAssignableTypes(C8558 c8558, int i) {
        C8548 c8548M14122;
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(i));
        c8558.getClass();
        Iterator it = !c8558.f23889.f23839.m14111() ? Collections.EMPTY_SET.iterator() : new C3349(c8558);
        while (it.hasNext()) {
            C8540 c8540 = (C8540) it.next();
            int i2 = c8540.f23792;
            int i3 = c8540.f23794;
            if (hashSet.contains(Integer.valueOf(i2))) {
                hashSet.add(Integer.valueOf(i3));
            } else {
                C8558 c85582 = c8540.f23796;
                int i4 = c8540.f23791;
                if (i4 == 0) {
                    c85582.getClass();
                    c8548M14122 = C8548.f23848;
                } else {
                    c8548M14122 = c85582.m14133(i4).m14122();
                }
                short[] sArr = c8548M14122.f23849;
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

    private Set<Integer> getFieldIds(C8558 c8558, Set<Integer> set, int i) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (C8553 c8553 : c8558.f23891) {
            if (set.contains(Integer.valueOf(c8553.f23864)) && i == c8553.f23865) {
                hashSet.add(Integer.valueOf(i2));
            }
            i2++;
        }
        return hashSet;
    }

    private Set<Integer> getMethodIds(C8558 c8558, Set<Integer> set, int i) {
        Set<Integer> setFindAssignableTypes = findAssignableTypes(c8558, i);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (C8551 c8551 : c8558.f23893) {
            if (set.contains(Integer.valueOf(c8551.f23856)) && setFindAssignableTypes.contains(Integer.valueOf(c8551.f23857))) {
                hashSet.add(Integer.valueOf(i2));
            }
            i2++;
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String location() {
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

    public void findUsages() {
        if (this.fieldIds == null || this.methodIds == null) {
            return;
        }
        C8558 c8558 = this.dex;
        c8558.getClass();
        Iterator it = !c8558.f23889.f23839.m14111() ? Collections.EMPTY_SET.iterator() : new C3349(c8558);
        while (it.hasNext()) {
            C8540 c8540 = (C8540) it.next();
            this.currentClass = c8540;
            this.currentMethod = null;
            if (c8540.f23799 != 0) {
                C8541 c8541M14132 = this.dex.m14132(c8540);
                C8543[] c8543Arr = c8541M14132.f23804;
                int length = c8543Arr.length;
                C8543[] c8543Arr2 = c8541M14132.f23803;
                int length2 = length + c8543Arr2.length;
                C8543[] c8543Arr3 = new C8543[length2];
                System.arraycopy(c8543Arr, 0, c8543Arr3, 0, c8543Arr.length);
                System.arraycopy(c8543Arr2, 0, c8543Arr3, c8543Arr.length, c8543Arr2.length);
                for (int i = 0; i < length2; i++) {
                    int i2 = c8543Arr3[i].f23809;
                    if (this.fieldIds.contains(Integer.valueOf(i2))) {
                        this.out.println(location() + " field declared " + this.dex.f23891.get(i2));
                    }
                }
                C8542[] c8542Arr = c8541M14132.f23802;
                int length3 = c8542Arr.length;
                C8542[] c8542Arr2 = c8541M14132.f23801;
                int length4 = length3 + c8542Arr2.length;
                C8542[] c8542Arr3 = new C8542[length4];
                System.arraycopy(c8542Arr, 0, c8542Arr3, 0, c8542Arr.length);
                System.arraycopy(c8542Arr2, 0, c8542Arr3, c8542Arr.length, c8542Arr2.length);
                for (int i3 = 0; i3 < length4; i3++) {
                    C8542 c8542 = c8542Arr3[i3];
                    this.currentMethod = c8542;
                    int i4 = c8542.f23807;
                    if (this.methodIds.contains(Integer.valueOf(i4))) {
                        this.out.println(location() + " method declared " + this.dex.f23893.get(i4));
                    }
                    if (c8542.f23805 != 0) {
                        this.codeReader.visitAll(this.dex.m14131(c8542).f23895);
                    }
                }
            }
        }
        this.currentClass = null;
        this.currentMethod = null;
    }
}
