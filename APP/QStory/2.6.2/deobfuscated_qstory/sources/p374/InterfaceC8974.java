package p374;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: 飘花落叶言苏子哲楪兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC8974 {
    InterfaceC8974 addContextValue(String str, Object obj);

    List getContextEntries();

    Set getContextLabels();

    List getContextValues(String str);

    Object getFirstContextValue(String str);

    String getFormattedExceptionMessage(String str);

    InterfaceC8974 setContextValue(String str, Object obj);
}
