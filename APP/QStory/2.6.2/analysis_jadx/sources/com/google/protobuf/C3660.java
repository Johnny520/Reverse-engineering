package com.google.protobuf;

import androidx.activity.AbstractC0053;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Set;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3660 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f11358 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f11359 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Set f11360;

    public C3660(C3655[] c3655Arr) {
        this.f11360 = Collections.newSetFromMap(new IdentityHashMap(c3655Arr.length));
        for (C3655 c3655 : c3655Arr) {
            this.f11360.add(c3655);
            m7882(c3655);
        }
        for (C3655 c36552 : this.f11360) {
            try {
                m7885(c36552, c36552.f11334.getPackage());
            } catch (Descriptors$DescriptorValidationException e) {
                C5919.m11243(e);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC3657 m7881(String str, AbstractC3657 abstractC3657, Descriptors$FileDescriptorTables$SearchFilter descriptors$FileDescriptorTables$SearchFilter, boolean z) throws Descriptors$DescriptorValidationException {
        AbstractC3657 abstractC3657M7883;
        String string;
        AbstractC3657 abstractC3657M78832;
        if (str.startsWith(".")) {
            string = str.substring(1);
            abstractC3657M7883 = m7883(string, descriptors$FileDescriptorTables$SearchFilter);
        } else {
            int iIndexOf = str.indexOf(46);
            String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
            StringBuilder sb = new StringBuilder(abstractC3657.mo7814());
            while (true) {
                int iLastIndexOf = sb.lastIndexOf(".");
                if (iLastIndexOf == -1) {
                    abstractC3657M7883 = m7883(str, descriptors$FileDescriptorTables$SearchFilter);
                    string = str;
                    break;
                }
                int i = iLastIndexOf + 1;
                sb.setLength(i);
                sb.append(strSubstring);
                abstractC3657M78832 = m7883(sb.toString(), Descriptors$FileDescriptorTables$SearchFilter.AGGREGATES_ONLY);
                if (abstractC3657M78832 != null) {
                    if (iIndexOf != -1) {
                        sb.setLength(i);
                        sb.append(str);
                        abstractC3657M7883 = m7883(sb.toString(), descriptors$FileDescriptorTables$SearchFilter);
                        string = sb.toString();
                        break;
                    }
                    if (descriptors$FileDescriptorTables$SearchFilter != Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY || (abstractC3657M78832 instanceof C3662) || (abstractC3657M78832 instanceof C3665)) {
                        break;
                    }
                }
                sb.setLength(iLastIndexOf);
            }
            string = sb.toString();
            abstractC3657M7883 = abstractC3657M78832;
        }
        if (abstractC3657M7883 != null) {
            return abstractC3657M7883;
        }
        if (!this.f11359 || descriptors$FileDescriptorTables$SearchFilter != Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY) {
            throw new Descriptors$DescriptorValidationException(abstractC3657, AbstractC0053.m156("\"", str, "\" is not defined."));
        }
        AbstractC3591.f11214.warning("The descriptor for type \"" + str + "\" cannot be found and a placeholder is created for it");
        AbstractC3657 c3665 = z ? new C3665(string) : new C3662(string);
        this.f11360.add(c3665.mo7815());
        return c3665;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7882(C3655 c3655) {
        for (C3655 c36552 : Collections.unmodifiableList(Arrays.asList(c3655.f11330))) {
            if (this.f11360.add(c36552)) {
                m7882(c36552);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if ((r0 instanceof com.google.protobuf.C3592) != false) goto L23;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.protobuf.AbstractC3657 m7883(java.lang.String r3, com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter r4) {
        /*
            r2 = this;
            java.util.HashMap r0 = r2.f11358
            java.lang.Object r0 = r0.get(r3)
            com.google.protobuf.飘花落叶言楪子兰哲世苏 r0 = (com.google.protobuf.AbstractC3657) r0
            if (r0 == 0) goto L30
            com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter r1 = com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter.ALL_SYMBOLS
            if (r4 == r1) goto L2f
            com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter r1 = com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY
            if (r4 != r1) goto L1b
            boolean r1 = r0 instanceof com.google.protobuf.C3662
            if (r1 != 0) goto L1a
            boolean r1 = r0 instanceof com.google.protobuf.C3665
            if (r1 == 0) goto L1b
        L1a:
            return r0
        L1b:
            com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter r1 = com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter.AGGREGATES_ONLY
            if (r4 != r1) goto L30
            boolean r1 = r0 instanceof com.google.protobuf.C3662
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof com.google.protobuf.C3665
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof com.google.protobuf.C3659
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof com.google.protobuf.C3592
            if (r1 == 0) goto L30
        L2f:
            return r0
        L30:
            java.util.Set r2 = r2.f11360
            java.util.Iterator r2 = r2.iterator()
        L36:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r2.next()
            com.google.protobuf.飘花落叶言楪子兰世哲苏 r0 = (com.google.protobuf.C3655) r0
            com.google.protobuf.飘花落叶言楪子兰苏哲世 r0 = r0.f11331
            java.util.HashMap r0 = r0.f11358
            java.lang.Object r0 = r0.get(r3)
            com.google.protobuf.飘花落叶言楪子兰哲世苏 r0 = (com.google.protobuf.AbstractC3657) r0
            if (r0 == 0) goto L36
            com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter r1 = com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter.ALL_SYMBOLS
            if (r4 == r1) goto L73
            com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter r1 = com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY
            if (r4 != r1) goto L5f
            boolean r1 = r0 instanceof com.google.protobuf.C3662
            if (r1 != 0) goto L5e
            boolean r1 = r0 instanceof com.google.protobuf.C3665
            if (r1 == 0) goto L5f
        L5e:
            return r0
        L5f:
            com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter r1 = com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter.AGGREGATES_ONLY
            if (r4 != r1) goto L36
            boolean r1 = r0 instanceof com.google.protobuf.C3662
            if (r1 != 0) goto L73
            boolean r1 = r0 instanceof com.google.protobuf.C3665
            if (r1 != 0) goto L73
            boolean r1 = r0 instanceof com.google.protobuf.C3659
            if (r1 != 0) goto L73
            boolean r1 = r0 instanceof com.google.protobuf.C3592
            if (r1 == 0) goto L36
        L73:
            return r0
        L74:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3660.m7883(java.lang.String, com.google.protobuf.Descriptors$FileDescriptorTables$SearchFilter):com.google.protobuf.飘花落叶言楪子兰哲世苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7884(AbstractC3657 abstractC3657) {
        String strMo7813 = abstractC3657.mo7813();
        AbstractC3670 abstractC3670 = null;
        if (strMo7813.length() == 0) {
            throw new Descriptors$DescriptorValidationException(abstractC3657, "Missing name.");
        }
        for (int i = 0; i < strMo7813.length(); i++) {
            char cCharAt = strMo7813.charAt(i);
            if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && cCharAt != '_' && ('0' > cCharAt || cCharAt > '9' || i <= 0))) {
                throw new Descriptors$DescriptorValidationException(abstractC3657, AbstractC0053.m156("\"", strMo7813, "\" is not a valid identifier."));
            }
        }
        String strMo7814 = abstractC3657.mo7814();
        HashMap map = this.f11358;
        AbstractC3657 abstractC36572 = (AbstractC3657) map.put(strMo7814, abstractC3657);
        if (abstractC36572 != null) {
            map.put(strMo7814, abstractC36572);
            if (abstractC3657.mo7815() != abstractC36572.mo7815()) {
                StringBuilder sbM11550 = AbstractC6136.m11550("\"", strMo7814, "\" is already defined in file \"");
                sbM11550.append(abstractC36572.mo7815().f11334.getName());
                sbM11550.append("\".");
                throw new Descriptors$DescriptorValidationException(abstractC3657, sbM11550.toString());
            }
            int iLastIndexOf = strMo7814.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                throw new Descriptors$DescriptorValidationException(abstractC3657, AbstractC0053.m156("\"", strMo7814, "\" is already defined."));
            }
            throw new Descriptors$DescriptorValidationException(abstractC3657, "\"" + strMo7814.substring(iLastIndexOf + 1) + "\" is already defined in \"" + strMo7814.substring(0, iLastIndexOf) + "\".");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7885(C3655 c3655, String str) {
        String strSubstring;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            strSubstring = str;
        } else {
            m7885(c3655, str.substring(0, iLastIndexOf));
            strSubstring = str.substring(iLastIndexOf + 1);
        }
        C3659 c3659 = new C3659(strSubstring, str, c3655);
        HashMap map = this.f11358;
        AbstractC3657 abstractC3657 = (AbstractC3657) map.put(str, c3659);
        if (abstractC3657 != null) {
            map.put(str, abstractC3657);
            if (abstractC3657 instanceof C3659) {
                return;
            }
            StringBuilder sbM11550 = AbstractC6136.m11550("\"", strSubstring, "\" is already defined (as something other than a package) in file \"");
            sbM11550.append(abstractC3657.mo7815().f11334.getName());
            sbM11550.append("\".");
            throw new Descriptors$DescriptorValidationException(c3655, sbM11550.toString());
        }
    }
}
