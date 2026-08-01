package com.google.protobuf;

import androidx.activity.AbstractC0053;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Set;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3661 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f11363 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f11364 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Set f11365;

    public C3661(C3656[] c3656Arr) {
        this.f11365 = Collections.newSetFromMap(new IdentityHashMap(c3656Arr.length));
        for (C3656 c3656 : c3656Arr) {
            this.f11365.add(c3656);
            m7869(c3656);
        }
        for (C3656 c36562 : this.f11365) {
            try {
                m7872(c36562, c36562.f11339.getPackage());
            } catch (Descriptors$DescriptorValidationException e) {
                C5925.m11304(e);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC3658 m7868(String str, AbstractC3658 abstractC3658, Descriptors$FileDescriptorTables$SearchFilter descriptors$FileDescriptorTables$SearchFilter, boolean z) throws Descriptors$DescriptorValidationException {
        AbstractC3658 abstractC3658M7870;
        String string;
        AbstractC3658 abstractC3658M78702;
        if (str.startsWith(".")) {
            string = str.substring(1);
            abstractC3658M7870 = m7870(string, descriptors$FileDescriptorTables$SearchFilter);
        } else {
            int iIndexOf = str.indexOf(46);
            String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
            StringBuilder sb = new StringBuilder(abstractC3658.mo7801());
            while (true) {
                int iLastIndexOf = sb.lastIndexOf(".");
                if (iLastIndexOf == -1) {
                    abstractC3658M7870 = m7870(str, descriptors$FileDescriptorTables$SearchFilter);
                    string = str;
                    break;
                }
                int i = iLastIndexOf + 1;
                sb.setLength(i);
                sb.append(strSubstring);
                abstractC3658M78702 = m7870(sb.toString(), Descriptors$FileDescriptorTables$SearchFilter.AGGREGATES_ONLY);
                if (abstractC3658M78702 != null) {
                    if (iIndexOf != -1) {
                        sb.setLength(i);
                        sb.append(str);
                        abstractC3658M7870 = m7870(sb.toString(), descriptors$FileDescriptorTables$SearchFilter);
                        string = sb.toString();
                        break;
                    }
                    if (descriptors$FileDescriptorTables$SearchFilter != Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY || (abstractC3658M78702 instanceof C3663) || (abstractC3658M78702 instanceof C3666)) {
                        break;
                    }
                }
                sb.setLength(iLastIndexOf);
            }
            string = sb.toString();
            abstractC3658M7870 = abstractC3658M78702;
        }
        if (abstractC3658M7870 != null) {
            return abstractC3658M7870;
        }
        if (!this.f11364 || descriptors$FileDescriptorTables$SearchFilter != Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY) {
            throw new Descriptors$DescriptorValidationException(abstractC3658, AbstractC0053.m158("\"", str, "\" is not defined."));
        }
        AbstractC3592.f11219.warning("The descriptor for type \"" + str + "\" cannot be found and a placeholder is created for it");
        AbstractC3658 c3666 = z ? new C3666(string) : new C3663(string);
        this.f11365.add(c3666.mo7802());
        return c3666;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7869(C3656 c3656) {
        for (C3656 c36562 : Collections.unmodifiableList(Arrays.asList(c3656.f11335))) {
            if (this.f11365.add(c36562)) {
                m7869(c36562);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if ((r0 instanceof com.google.protobuf.C3593) != false) goto L23;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.protobuf.AbstractC3658 m7870(java.lang.String r3, com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter r4) {
        /*
            r2 = this;
            java.util.HashMap r0 = r2.f11363
            java.lang.Object r0 = r0.get(r3)
            com.google.protobuf.飘花落叶言楪子兰哲世苏 r0 = (com.google.protobuf.AbstractC3658) r0
            if (r0 == 0) goto L30
            com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter r1 = com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter.ALL_SYMBOLS
            if (r4 == r1) goto L2f
            com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter r1 = com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY
            if (r4 != r1) goto L1b
            boolean r1 = r0 instanceof com.google.protobuf.C3663
            if (r1 != 0) goto L1a
            boolean r1 = r0 instanceof com.google.protobuf.C3666
            if (r1 == 0) goto L1b
        L1a:
            return r0
        L1b:
            com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter r1 = com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter.AGGREGATES_ONLY
            if (r4 != r1) goto L30
            boolean r1 = r0 instanceof com.google.protobuf.C3663
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof com.google.protobuf.C3666
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof com.google.protobuf.C3660
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof com.google.protobuf.C3593
            if (r1 == 0) goto L30
        L2f:
            return r0
        L30:
            java.util.Set r2 = r2.f11365
            java.util.Iterator r2 = r2.iterator()
        L36:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r2.next()
            com.google.protobuf.飘花落叶言楪子兰世哲苏 r0 = (com.google.protobuf.C3656) r0
            com.google.protobuf.飘花落叶言楪子兰苏哲世 r0 = r0.f11336
            java.util.HashMap r0 = r0.f11363
            java.lang.Object r0 = r0.get(r3)
            com.google.protobuf.飘花落叶言楪子兰哲世苏 r0 = (com.google.protobuf.AbstractC3658) r0
            if (r0 == 0) goto L36
            com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter r1 = com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter.ALL_SYMBOLS
            if (r4 == r1) goto L73
            com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter r1 = com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY
            if (r4 != r1) goto L5f
            boolean r1 = r0 instanceof com.google.protobuf.C3663
            if (r1 != 0) goto L5e
            boolean r1 = r0 instanceof com.google.protobuf.C3666
            if (r1 == 0) goto L5f
        L5e:
            return r0
        L5f:
            com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter r1 = com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter.AGGREGATES_ONLY
            if (r4 != r1) goto L36
            boolean r1 = r0 instanceof com.google.protobuf.C3663
            if (r1 != 0) goto L73
            boolean r1 = r0 instanceof com.google.protobuf.C3666
            if (r1 != 0) goto L73
            boolean r1 = r0 instanceof com.google.protobuf.C3660
            if (r1 != 0) goto L73
            boolean r1 = r0 instanceof com.google.protobuf.C3593
            if (r1 == 0) goto L36
        L73:
            return r0
        L74:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3661.m7870(java.lang.String, com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter):com.google.protobuf.飘花落叶言楪子兰哲世苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7871(AbstractC3658 abstractC3658) {
        String strMo7800 = abstractC3658.mo7800();
        AbstractC3671 abstractC3671 = null;
        if (strMo7800.length() == 0) {
            throw new Descriptors$DescriptorValidationException(abstractC3658, "Missing name.");
        }
        for (int i = 0; i < strMo7800.length(); i++) {
            char cCharAt = strMo7800.charAt(i);
            if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && cCharAt != '_' && ('0' > cCharAt || cCharAt > '9' || i <= 0))) {
                throw new Descriptors$DescriptorValidationException(abstractC3658, AbstractC0053.m158("\"", strMo7800, "\" is not a valid identifier."));
            }
        }
        String strMo7801 = abstractC3658.mo7801();
        HashMap map = this.f11363;
        AbstractC3658 abstractC36582 = (AbstractC3658) map.put(strMo7801, abstractC3658);
        if (abstractC36582 != null) {
            map.put(strMo7801, abstractC36582);
            if (abstractC3658.mo7802() != abstractC36582.mo7802()) {
                StringBuilder sbM11585 = AbstractC6183.m11585("\"", strMo7801, "\" is already defined in file \"");
                sbM11585.append(abstractC36582.mo7802().f11339.getName());
                sbM11585.append("\".");
                throw new Descriptors$DescriptorValidationException(abstractC3658, sbM11585.toString());
            }
            int iLastIndexOf = strMo7801.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                throw new Descriptors$DescriptorValidationException(abstractC3658, AbstractC0053.m158("\"", strMo7801, "\" is already defined."));
            }
            throw new Descriptors$DescriptorValidationException(abstractC3658, "\"" + strMo7801.substring(iLastIndexOf + 1) + "\" is already defined in \"" + strMo7801.substring(0, iLastIndexOf) + "\".");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7872(C3656 c3656, String str) {
        String strSubstring;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            strSubstring = str;
        } else {
            m7872(c3656, str.substring(0, iLastIndexOf));
            strSubstring = str.substring(iLastIndexOf + 1);
        }
        C3660 c3660 = new C3660(strSubstring, str, c3656);
        HashMap map = this.f11363;
        AbstractC3658 abstractC3658 = (AbstractC3658) map.put(str, c3660);
        if (abstractC3658 != null) {
            map.put(str, abstractC3658);
            if (abstractC3658 instanceof C3660) {
                return;
            }
            StringBuilder sbM11585 = AbstractC6183.m11585("\"", strSubstring, "\" is already defined (as something other than a package) in file \"");
            sbM11585.append(abstractC3658.mo7802().f11339.getName());
            sbM11585.append("\".");
            throw new Descriptors$DescriptorValidationException(c3656, sbM11585.toString());
        }
    }
}
