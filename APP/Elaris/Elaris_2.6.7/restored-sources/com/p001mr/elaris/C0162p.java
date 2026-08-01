package com.p001mr.elaris;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: com.mr.elaris.p */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0162p implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f141b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ClassLoader f142c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f143d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f144e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f145f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0162p(ClassLoader classLoader, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.f140a = obj;
        this.f141b = z;
        this.f142c = classLoader;
        this.f143d = obj2;
        this.f144e = obj3;
        this.f145f = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        List listFirstListArg;
        try {
            listFirstListArg = MessageRepeater.firstListArg(objArr);
        } catch (Throwable th) {
            Throwable thUnwrap = MessageRepeater.unwrap(th);
            MessageRepeater.logFail("getMsgs callback " + thUnwrap.getClass().getSimpleName() + ": " + thUnwrap.getMessage());
        }
        if (listFirstListArg != null && !listFirstListArg.isEmpty()) {
            Object obj2 = listFirstListArg.get(0);
            if (obj2 != null) {
                MessageRepeater.logMsgDetails(obj2);
            }
            boolean zIsReplyLikeMessage = MessageRepeater.isReplyLikeMessage(this.f140a, obj2, this.f141b);
            Object obj3 = this.f145f;
            Object obj4 = this.f144e;
            ClassLoader classLoader = this.f142c;
            Object obj5 = this.f143d;
            if (zIsReplyLikeMessage) {
                MessageRepeater.sendResolvedMessage(classLoader, obj5, obj4, obj3, obj2, true);
            } else {
                MessageRepeater.sendResolvedMessage(classLoader, obj5, obj4, obj3, obj2);
            }
            return MessageRepeater.defaultArg(method != null ? method.getReturnType() : null);
        }
        MessageRepeater.logFail("getMsgs callback empty");
        return MessageRepeater.defaultArg(method == null ? null : method.getReturnType());
    }
}
