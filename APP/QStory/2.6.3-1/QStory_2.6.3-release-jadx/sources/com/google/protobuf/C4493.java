package com.google.protobuf;

import androidx.activity.AbstractC0900;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f11708 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f11709 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Set f11710;

    public C4493(C4488[] c4488Arr) {
        this.f11710 = Collections.newSetFromMap(new IdentityHashMap(c4488Arr.length));
        for (C4488 c4488 : c4488Arr) {
            this.f11710.add(c4488);
            m8428(c4488);
        }
        for (C4488 c44882 : this.f11710) {
            try {
                m8431(c44882, c44882.f11684.getPackage());
            } catch (Descriptors$DescriptorValidationException e) {
                C6755.m11863(e);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC4490 m8427(String str, AbstractC4490 abstractC4490, Descriptors$FileDescriptorTables$SearchFilter descriptors$FileDescriptorTables$SearchFilter, boolean z) throws Descriptors$DescriptorValidationException {
        AbstractC4490 abstractC4490M8429;
        String string;
        AbstractC4490 abstractC4490M84292;
        if (str.startsWith(".")) {
            string = str.substring(1);
            abstractC4490M8429 = m8429(string, descriptors$FileDescriptorTables$SearchFilter);
        } else {
            int iIndexOf = str.indexOf(46);
            String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
            StringBuilder sb = new StringBuilder(abstractC4490.mo8360());
            while (true) {
                int iLastIndexOf = sb.lastIndexOf(".");
                if (iLastIndexOf == -1) {
                    abstractC4490M8429 = m8429(str, descriptors$FileDescriptorTables$SearchFilter);
                    string = str;
                    break;
                }
                int i = iLastIndexOf + 1;
                sb.setLength(i);
                sb.append(strSubstring);
                abstractC4490M84292 = m8429(sb.toString(), Descriptors$FileDescriptorTables$SearchFilter.AGGREGATES_ONLY);
                if (abstractC4490M84292 != null) {
                    if (iIndexOf != -1) {
                        sb.setLength(i);
                        sb.append(str);
                        abstractC4490M8429 = m8429(sb.toString(), descriptors$FileDescriptorTables$SearchFilter);
                        string = sb.toString();
                        break;
                    }
                    if (descriptors$FileDescriptorTables$SearchFilter != Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY || (abstractC4490M84292 instanceof C4495) || (abstractC4490M84292 instanceof C4498)) {
                        break;
                    }
                }
                sb.setLength(iLastIndexOf);
            }
            string = sb.toString();
            abstractC4490M8429 = abstractC4490M84292;
        }
        if (abstractC4490M8429 != null) {
            return abstractC4490M8429;
        }
        if (!this.f11709 || descriptors$FileDescriptorTables$SearchFilter != Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY) {
            throw new Descriptors$DescriptorValidationException(abstractC4490, AbstractC0900.m718("\"", str, "\" is not defined."));
        }
        AbstractC4424.f11564.warning("The descriptor for type \"" + str + "\" cannot be found and a placeholder is created for it");
        AbstractC4490 c4498 = z ? new C4498(string) : new C4495(string);
        this.f11710.add(c4498.mo8361());
        return c4498;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8428(C4488 c4488) {
        for (C4488 c44882 : Collections.unmodifiableList(Arrays.asList(c4488.f11680))) {
            if (this.f11710.add(c44882)) {
                m8428(c44882);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if ((r0 instanceof com.google.protobuf.C4425) != false) goto L23;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC4490 m8429(String str, Descriptors$FileDescriptorTables$SearchFilter descriptors$FileDescriptorTables$SearchFilter) {
        AbstractC4490 abstractC4490 = (AbstractC4490) this.f11708.get(str);
        if (abstractC4490 != null) {
            if (descriptors$FileDescriptorTables$SearchFilter == Descriptors$FileDescriptorTables$SearchFilter.ALL_SYMBOLS || (descriptors$FileDescriptorTables$SearchFilter == Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY && ((abstractC4490 instanceof C4495) || (abstractC4490 instanceof C4498)))) {
                return abstractC4490;
            }
            if (descriptors$FileDescriptorTables$SearchFilter == Descriptors$FileDescriptorTables$SearchFilter.AGGREGATES_ONLY) {
                if (!(abstractC4490 instanceof C4495)) {
                    if (!(abstractC4490 instanceof C4498)) {
                        if (!(abstractC4490 instanceof C4492)) {
                        }
                    }
                }
                return abstractC4490;
            }
        }
        Iterator it = this.f11710.iterator();
        while (it.hasNext()) {
            AbstractC4490 abstractC44902 = (AbstractC4490) ((C4488) it.next()).f11681.f11708.get(str);
            if (abstractC44902 != null) {
                if (descriptors$FileDescriptorTables$SearchFilter != Descriptors$FileDescriptorTables$SearchFilter.ALL_SYMBOLS) {
                    if (descriptors$FileDescriptorTables$SearchFilter == Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY && ((abstractC44902 instanceof C4495) || (abstractC44902 instanceof C4498))) {
                        return abstractC44902;
                    }
                    if (descriptors$FileDescriptorTables$SearchFilter != Descriptors$FileDescriptorTables$SearchFilter.AGGREGATES_ONLY || (!(abstractC44902 instanceof C4495) && !(abstractC44902 instanceof C4498) && !(abstractC44902 instanceof C4492) && !(abstractC44902 instanceof C4425))) {
                    }
                }
                return abstractC44902;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8430(AbstractC4490 abstractC4490) {
        String strMo8359 = abstractC4490.mo8359();
        AbstractC4503 abstractC4503 = null;
        if (strMo8359.length() == 0) {
            throw new Descriptors$DescriptorValidationException(abstractC4490, "Missing name.");
        }
        for (int i = 0; i < strMo8359.length(); i++) {
            char cCharAt = strMo8359.charAt(i);
            if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && cCharAt != '_' && ('0' > cCharAt || cCharAt > '9' || i <= 0))) {
                throw new Descriptors$DescriptorValidationException(abstractC4490, AbstractC0900.m718("\"", strMo8359, "\" is not a valid identifier."));
            }
        }
        String strMo8360 = abstractC4490.mo8360();
        HashMap map = this.f11708;
        AbstractC4490 abstractC44902 = (AbstractC4490) map.put(strMo8360, abstractC4490);
        if (abstractC44902 != null) {
            map.put(strMo8360, abstractC44902);
            if (abstractC4490.mo8361() != abstractC44902.mo8361()) {
                StringBuilder sbM12144 = AbstractC7012.m12144("\"", strMo8360, "\" is already defined in file \"");
                sbM12144.append(abstractC44902.mo8361().f11684.getName());
                sbM12144.append("\".");
                throw new Descriptors$DescriptorValidationException(abstractC4490, sbM12144.toString());
            }
            int iLastIndexOf = strMo8360.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                throw new Descriptors$DescriptorValidationException(abstractC4490, AbstractC0900.m718("\"", strMo8360, "\" is already defined."));
            }
            throw new Descriptors$DescriptorValidationException(abstractC4490, "\"" + strMo8360.substring(iLastIndexOf + 1) + "\" is already defined in \"" + strMo8360.substring(0, iLastIndexOf) + "\".");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8431(C4488 c4488, String str) {
        String strSubstring;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            strSubstring = str;
        } else {
            m8431(c4488, str.substring(0, iLastIndexOf));
            strSubstring = str.substring(iLastIndexOf + 1);
        }
        C4492 c4492 = new C4492(strSubstring, str, c4488);
        HashMap map = this.f11708;
        AbstractC4490 abstractC4490 = (AbstractC4490) map.put(str, c4492);
        if (abstractC4490 != null) {
            map.put(str, abstractC4490);
            if (abstractC4490 instanceof C4492) {
                return;
            }
            StringBuilder sbM12144 = AbstractC7012.m12144("\"", strSubstring, "\" is already defined (as something other than a package) in file \"");
            sbM12144.append(abstractC4490.mo8361().f11684.getName());
            sbM12144.append("\".");
            throw new Descriptors$DescriptorValidationException(c4488, sbM12144.toString());
        }
    }
}
