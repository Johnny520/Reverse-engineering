package Yue;

import Yue.C7583;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣۢۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8183 extends C3691 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Object f24346;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Object f24347;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Object f24348;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Object f24349;

    /* JADX INFO: renamed from: Yue.ۥۣۢۦۦ$ۥ */
    public static /* synthetic */ class C1455 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f3294;

        static {
            int[] iArr = new int[C7583.EnumC1301.values().length];
            f3294 = iArr;
            try {
                iArr[C7583.EnumC1301.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3294[C7583.EnumC1301.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3294[C7583.EnumC1301.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C8183(C7583 c7583) {
        super(c7583, C7583.EnumC7586.VERTICAL_CHAIN);
    }

    @Override // Yue.C5279
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo264() {
        Iterator<Object> it = this.f12573.iterator();
        while (it.hasNext()) {
            this.f1384.m23731(it.next()).m11798();
        }
        Iterator<Object> it2 = this.f12573.iterator();
        C4126 c4126 = null;
        C4126 c41262 = null;
        while (it2.hasNext()) {
            C4126 c4126M23731 = this.f1384.m23731(it2.next());
            if (c41262 == null) {
                Object obj = this.f24346;
                if (obj != null) {
                    c4126M23731.m11832(obj);
                } else {
                    Object obj2 = this.f24347;
                    if (obj2 != null) {
                        c4126M23731.m11831(obj2);
                    } else {
                        c4126M23731.m11832(C7583.f22905);
                    }
                }
                c41262 = c4126M23731;
            }
            if (c4126 != null) {
                c4126.m11793(c4126M23731.getKey());
                c4126M23731.m11831(c4126.getKey());
            }
            c4126 = c4126M23731;
        }
        if (c4126 != null) {
            Object obj3 = this.f24348;
            if (obj3 != null) {
                c4126.m11793(obj3);
            } else {
                Object obj4 = this.f24349;
                if (obj4 != null) {
                    c4126.m11792(obj4);
                } else {
                    c4126.m11792(C7583.f22905);
                }
            }
        }
        if (c41262 != null) {
            float f = this.f6528;
            if (f != 0.5f) {
                c41262.m11834(f);
            }
        }
        int i = C1455.f3294[this.f6529.ordinal()];
        if (i == 1) {
            c41262.m11824(0);
        } else if (i == 2) {
            c41262.m11824(1);
        } else {
            if (i != 3) {
                return;
            }
            c41262.m11824(2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m27097(Object obj) {
        this.f24349 = obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m27098(Object obj) {
        this.f24348 = obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m27099(Object obj) {
        this.f24347 = obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m27100(Object obj) {
        this.f24346 = obj;
    }
}
