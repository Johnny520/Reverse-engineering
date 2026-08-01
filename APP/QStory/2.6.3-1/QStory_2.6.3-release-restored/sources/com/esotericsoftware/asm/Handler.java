package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes.dex */
class Handler {

    /* JADX INFO: renamed from: a */
    Label f203a;

    /* JADX INFO: renamed from: b */
    Label f204b;

    /* JADX INFO: renamed from: c */
    Label f205c;

    /* JADX INFO: renamed from: d */
    String f206d;

    /* JADX INFO: renamed from: e */
    int f207e;

    /* JADX INFO: renamed from: f */
    Handler f208f;

    /* JADX INFO: renamed from: a */
    public static Handler m98a(Handler handler, Label label, Label label2) {
        if (handler == null) {
            return null;
        }
        Handler handlerM98a = m98a(handler.f208f, label, label2);
        handler.f208f = handlerM98a;
        int i = handler.f203a.f220c;
        int i2 = handler.f204b.f220c;
        int i3 = label.f220c;
        int i4 = label2 == null ? Integer.MAX_VALUE : label2.f220c;
        if (i3 < i2 && i4 > i) {
            if (i3 <= i) {
                if (i4 >= i2) {
                    return handlerM98a;
                }
                handler.f203a = label2;
                return handler;
            }
            if (i4 >= i2) {
                handler.f204b = label;
                return handler;
            }
            Handler handler2 = new Handler();
            handler2.f203a = label2;
            handler2.f204b = handler.f204b;
            handler2.f205c = handler.f205c;
            handler2.f206d = handler.f206d;
            handler2.f207e = handler.f207e;
            handler2.f208f = handler.f208f;
            handler.f204b = label;
            handler.f208f = handler2;
        }
        return handler;
    }
}
