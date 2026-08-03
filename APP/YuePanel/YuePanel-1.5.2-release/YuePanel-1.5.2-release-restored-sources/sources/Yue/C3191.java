package Yue;

import Yue.C7583;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣ۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3191 extends C5279 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f4798;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Object f4799;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Object f4800;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Object f4801;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Object f4802;

    public C3191(C7583 c7583) {
        super(c7583, C7583.EnumC7586.ALIGN_VERTICALLY);
        this.f4798 = 0.5f;
    }

    @Override // Yue.C5279
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo264() {
        Iterator<Object> it = this.f12573.iterator();
        while (it.hasNext()) {
            C4126 c4126M23731 = this.f1384.m23731(it.next());
            c4126M23731.m11798();
            Object obj = this.f4799;
            if (obj != null) {
                c4126M23731.m11832(obj);
            } else {
                Object obj2 = this.f4800;
                if (obj2 != null) {
                    c4126M23731.m11831(obj2);
                } else {
                    c4126M23731.m11832(C7583.f22905);
                }
            }
            Object obj3 = this.f4801;
            if (obj3 != null) {
                c4126M23731.m11793(obj3);
            } else {
                Object obj4 = this.f4802;
                if (obj4 != null) {
                    c4126M23731.m11792(obj4);
                } else {
                    c4126M23731.m11792(C7583.f22905);
                }
            }
            float f = this.f4798;
            if (f != 0.5f) {
                c4126M23731.m11834(f);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m6546(float f) {
        this.f4798 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m6547(Object obj) {
        this.f4802 = obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m6548(Object obj) {
        this.f4801 = obj;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m6549(Object obj) {
        this.f4800 = obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m6550(Object obj) {
        this.f4799 = obj;
    }
}
