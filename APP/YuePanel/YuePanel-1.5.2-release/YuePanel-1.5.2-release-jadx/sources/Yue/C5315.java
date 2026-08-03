package Yue;

import Yue.C7583;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5315 extends C3691 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Object f12847;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Object f12848;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Object f12849;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Object f12850;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۦۦ$ۥ */
    public static /* synthetic */ class C0710 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f1434;

        static {
            int[] iArr = new int[C7583.EnumC1301.values().length];
            f1434 = iArr;
            try {
                iArr[C7583.EnumC1301.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1434[C7583.EnumC1301.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1434[C7583.EnumC1301.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C5315(C7583 c7583) {
        super(c7583, C7583.EnumC7586.HORIZONTAL_CHAIN);
    }

    @Override // Yue.C5279
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo264() {
        Iterator<Object> it = this.f12573.iterator();
        while (it.hasNext()) {
            this.f1384.m23731(it.next()).m11797();
        }
        Iterator<Object> it2 = this.f12573.iterator();
        C4126 c4126 = null;
        C4126 c41262 = null;
        while (it2.hasNext()) {
            C4126 c4126M23731 = this.f1384.m23731(it2.next());
            if (c41262 == null) {
                Object obj = this.f12847;
                if (obj != null) {
                    c4126M23731.m11829(obj);
                } else {
                    Object obj2 = this.f12848;
                    if (obj2 != null) {
                        c4126M23731.m11828(obj2);
                    } else {
                        c4126M23731.m11829(C7583.f22905);
                    }
                }
                c41262 = c4126M23731;
            }
            if (c4126 != null) {
                c4126.m11803(c4126M23731.getKey());
                c4126M23731.m11828(c4126.getKey());
            }
            c4126 = c4126M23731;
        }
        if (c4126 != null) {
            Object obj3 = this.f12849;
            if (obj3 != null) {
                c4126.m11803(obj3);
            } else {
                Object obj4 = this.f12850;
                if (obj4 != null) {
                    c4126.m11802(obj4);
                } else {
                    c4126.m11802(C7583.f22905);
                }
            }
        }
        if (c41262 != null) {
            float f = this.f6528;
            if (f != 0.5f) {
                c41262.m11812(f);
            }
        }
        int i = C0710.f1434[this.f6529.ordinal()];
        if (i == 1) {
            c41262.m11823(0);
        } else if (i == 2) {
            c41262.m11823(1);
        } else {
            if (i != 3) {
                return;
            }
            c41262.m11823(2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m16312(Object obj) {
        this.f12850 = obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m16313(Object obj) {
        this.f12849 = obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m16314(Object obj) {
        this.f12848 = obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m16315(Object obj) {
        this.f12847 = obj;
    }
}
