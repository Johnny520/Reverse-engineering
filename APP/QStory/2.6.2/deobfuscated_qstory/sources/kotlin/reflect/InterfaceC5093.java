package kotlin.reflect;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: kotlin.reflect.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5093 extends InterfaceC5094 {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    InterfaceC5086 getReturnType();

    List getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
