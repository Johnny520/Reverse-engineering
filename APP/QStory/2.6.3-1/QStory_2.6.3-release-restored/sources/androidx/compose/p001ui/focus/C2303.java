package androidx.compose.p001ui.focus;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.InterfaceC2622;
import androidx.compose.runtime.collection.C2059;
import p226.AbstractC8765;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2303 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2059 f4515 = new C2059(0, new InterfaceC2308[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2303 f4514 = new C2303();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2303 f4513 = new C2303();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2303 f4512 = new C2303();

    /* JADX WARN: Code restructure failed: missing block: B:69:0x004b, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3192(C2303 c2303) {
        c2303.getClass();
        if (c2303 == f4514) {
            C6755.m11870("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (c2303 == f4513) {
            C6755.m11870("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        C2059 c2059 = c2303.f4515;
        int i = c2059.f3865;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = c2059.f3866;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC2622 interfaceC2622 = (InterfaceC2308) objArr[i2];
            if (!((AbstractC2961) interfaceC2622).f6637.f6624) {
                AbstractC8765.m13982("visitChildren called on an unattached node");
            }
            C2059 c20592 = new C2059(0, new AbstractC2961[16]);
            AbstractC2961 abstractC2961 = ((AbstractC2961) interfaceC2622).f6637;
            AbstractC2961 abstractC29612 = abstractC2961.f6633;
            if (abstractC29612 == null) {
                AbstractC2620.m3902(c20592, abstractC2961);
            } else {
                c20592.m2607(abstractC29612);
            }
            while (true) {
                int i3 = c20592.f3865;
                if (i3 != 0) {
                    AbstractC2961 abstractC2961M3899 = (AbstractC2961) c20592.m2613(i3 - 1);
                    if ((abstractC2961M3899.f6630 & 1024) == 0) {
                        AbstractC2620.m3902(c20592, abstractC2961M3899);
                    } else {
                        while (true) {
                            if (abstractC2961M3899 == null) {
                                break;
                            }
                            if ((abstractC2961M3899.f6636 & 1024) != 0) {
                                C2059 c20593 = null;
                                while (abstractC2961M3899 != null) {
                                    if (abstractC2961M3899 instanceof C2287) {
                                        if (((C2287) abstractC2961M3899).m3156(7)) {
                                            break;
                                        }
                                    } else if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                        int i4 = 0;
                                        for (AbstractC2961 abstractC29613 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29613 != null; abstractC29613 = abstractC29613.f6633) {
                                            if ((abstractC29613.f6636 & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    abstractC2961M3899 = abstractC29613;
                                                } else {
                                                    if (c20593 == null) {
                                                        c20593 = new C2059(0, new AbstractC2961[16]);
                                                    }
                                                    if (abstractC2961M3899 != null) {
                                                        c20593.m2607(abstractC2961M3899);
                                                        abstractC2961M3899 = null;
                                                    }
                                                    c20593.m2607(abstractC29613);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    abstractC2961M3899 = AbstractC2620.m3899(c20593);
                                }
                            } else {
                                abstractC2961M3899 = abstractC2961M3899.f6633;
                            }
                        }
                    }
                }
            }
        }
    }
}
