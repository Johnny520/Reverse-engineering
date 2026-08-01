package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes.dex */
class Handler {
    Label a;
    Label b;
    Label c;
    String d;
    int e;
    Handler f;

    public static Handler a(Handler handler, Label label, Label label2) {
        if (handler == null) {
            return null;
        }
        Handler handlerA = a(handler.f, label, label2);
        handler.f = handlerA;
        int i = handler.a.c;
        int i2 = handler.b.c;
        int i3 = label.c;
        int i4 = label2 == null ? Integer.MAX_VALUE : label2.c;
        if (i3 < i2 && i4 > i) {
            if (i3 <= i) {
                if (i4 >= i2) {
                    return handlerA;
                }
                handler.a = label2;
                return handler;
            }
            if (i4 >= i2) {
                handler.b = label;
                return handler;
            }
            Handler handler2 = new Handler();
            handler2.a = label2;
            handler2.b = handler.b;
            handler2.c = handler.c;
            handler2.d = handler.d;
            handler2.e = handler.e;
            handler2.f = handler.f;
            handler.b = label;
            handler.f = handler2;
        }
        return handler;
    }
}
