package kotlin.reflect;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: kotlin.reflect.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5094 extends InterfaceC5095 {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    InterfaceC5087 getReturnType();

    List getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
