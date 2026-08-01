package com.android.p002dx.command.findusages;

import com.android.p002dx.p005io.CodeReader;
import com.android.p002dx.p005io.OpcodeInfo;
import com.android.p002dx.p005io.instructions.DecodedInstruction;
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
import p308.C9372;
import p308.C9377;
import p308.C9380;
import p308.C9382;
import p308.C9387;
import p308.C9389;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class FindUsages {
    private final CodeReader codeReader = new CodeReader();
    private C9369 currentClass;
    private C9371 currentMethod;
    private final C9387 dex;
    private final Set<Integer> fieldIds;
    private final Set<Integer> methodIds;
    private final PrintWriter out;

    public FindUsages(final C9387 c9387, String str, String str2, final PrintWriter printWriter) {
        this.dex = c9387;
        this.out = printWriter;
        HashSet<Integer> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Pattern patternCompile = Pattern.compile(str);
        Pattern patternCompile2 = Pattern.compile(str2);
        C9389 c9389 = c9387.f24232;
        for (int i = 0; i < c9389.size(); i++) {
            String str3 = (String) c9389.get(i);
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
            int iBinarySearch = Collections.binarySearch(c9387.f24231, num);
            if (iBinarySearch >= 0) {
                this.methodIds.addAll(getMethodIds(c9387, hashSet2, iBinarySearch));
                this.fieldIds.addAll(getFieldIds(c9387, hashSet2, iBinarySearch));
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
                    printWriter.println(this.this$0.location() + ": field reference " + c9387.f24236.get(index) + " (" + OpcodeInfo.getName(decodedInstruction.getOpcode()) + ")");
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
                    printWriter.println(this.this$0.location() + ": method reference " + c9387.f24238.get(index) + " (" + OpcodeInfo.getName(decodedInstruction.getOpcode()) + ")");
                }
            }
        });
    }

    private Set<Integer> findAssignableTypes(C9387 c9387, int i) {
        C9377 c9377M14681;
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(i));
        c9387.getClass();
        Iterator it = !c9387.f24234.f24184.m14670() ? Collections.EMPTY_SET.iterator() : new C4181(c9387);
        while (it.hasNext()) {
            C9369 c9369 = (C9369) it.next();
            int i2 = c9369.f24137;
            int i3 = c9369.f24139;
            if (hashSet.contains(Integer.valueOf(i2))) {
                hashSet.add(Integer.valueOf(i3));
            } else {
                C9387 c93872 = c9369.f24141;
                int i4 = c9369.f24136;
                if (i4 == 0) {
                    c93872.getClass();
                    c9377M14681 = C9377.f24193;
                } else {
                    c9377M14681 = c93872.m14692(i4).m14681();
                }
                short[] sArr = c9377M14681.f24194;
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

    private Set<Integer> getFieldIds(C9387 c9387, Set<Integer> set, int i) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (C9382 c9382 : c9387.f24236) {
            if (set.contains(Integer.valueOf(c9382.f24209)) && i == c9382.f24210) {
                hashSet.add(Integer.valueOf(i2));
            }
            i2++;
        }
        return hashSet;
    }

    private Set<Integer> getMethodIds(C9387 c9387, Set<Integer> set, int i) {
        Set<Integer> setFindAssignableTypes = findAssignableTypes(c9387, i);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (C9380 c9380 : c9387.f24238) {
            if (set.contains(Integer.valueOf(c9380.f24201)) && setFindAssignableTypes.contains(Integer.valueOf(c9380.f24202))) {
                hashSet.add(Integer.valueOf(i2));
            }
            i2++;
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String location() {
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

    public void findUsages() {
        if (this.fieldIds == null || this.methodIds == null) {
            return;
        }
        C9387 c9387 = this.dex;
        c9387.getClass();
        Iterator it = !c9387.f24234.f24184.m14670() ? Collections.EMPTY_SET.iterator() : new C4181(c9387);
        while (it.hasNext()) {
            C9369 c9369 = (C9369) it.next();
            this.currentClass = c9369;
            this.currentMethod = null;
            if (c9369.f24144 != 0) {
                C9370 c9370M14691 = this.dex.m14691(c9369);
                C9372[] c9372Arr = c9370M14691.f24149;
                int length = c9372Arr.length;
                C9372[] c9372Arr2 = c9370M14691.f24148;
                int length2 = length + c9372Arr2.length;
                C9372[] c9372Arr3 = new C9372[length2];
                System.arraycopy(c9372Arr, 0, c9372Arr3, 0, c9372Arr.length);
                System.arraycopy(c9372Arr2, 0, c9372Arr3, c9372Arr.length, c9372Arr2.length);
                for (int i = 0; i < length2; i++) {
                    int i2 = c9372Arr3[i].f24154;
                    if (this.fieldIds.contains(Integer.valueOf(i2))) {
                        this.out.println(location() + " field declared " + this.dex.f24236.get(i2));
                    }
                }
                C9371[] c9371Arr = c9370M14691.f24147;
                int length3 = c9371Arr.length;
                C9371[] c9371Arr2 = c9370M14691.f24146;
                int length4 = length3 + c9371Arr2.length;
                C9371[] c9371Arr3 = new C9371[length4];
                System.arraycopy(c9371Arr, 0, c9371Arr3, 0, c9371Arr.length);
                System.arraycopy(c9371Arr2, 0, c9371Arr3, c9371Arr.length, c9371Arr2.length);
                for (int i3 = 0; i3 < length4; i3++) {
                    C9371 c9371 = c9371Arr3[i3];
                    this.currentMethod = c9371;
                    int i4 = c9371.f24152;
                    if (this.methodIds.contains(Integer.valueOf(i4))) {
                        this.out.println(location() + " method declared " + this.dex.f24238.get(i4));
                    }
                    if (c9371.f24150 != 0) {
                        this.codeReader.visitAll(this.dex.m14690(c9371).f24240);
                    }
                }
            }
        }
        this.currentClass = null;
        this.currentMethod = null;
    }
}
