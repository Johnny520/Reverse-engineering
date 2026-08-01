package p372;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: 飘花落叶言苏子哲楪世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC8973 {
    InterfaceC8973 addContextValue(String str, Object obj);

    List getContextEntries();

    Set getContextLabels();

    List getContextValues(String str);

    Object getFirstContextValue(String str);

    String getFormattedExceptionMessage(String str);

    InterfaceC8973 setContextValue(String str, Object obj);
}
