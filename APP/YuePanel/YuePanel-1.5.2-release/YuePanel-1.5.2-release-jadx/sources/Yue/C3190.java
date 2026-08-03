package Yue;

import Yue.C7583;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣ۟۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3190 extends C5279 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f4793;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Object f4794;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Object f4795;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Object f4796;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Object f4797;

    public C3190(C7583 c7583) {
        super(c7583, C7583.EnumC7586.ALIGN_VERTICALLY);
        this.f4793 = 0.5f;
    }

    @Override // Yue.C5279
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo264() {
        Iterator<Object> it = this.f12573.iterator();
        while (it.hasNext()) {
            C4126 c4126M23731 = this.f1384.m23731(it.next());
            c4126M23731.m11797();
            Object obj = this.f4794;
            if (obj != null) {
                c4126M23731.m11829(obj);
            } else {
                Object obj2 = this.f4795;
                if (obj2 != null) {
                    c4126M23731.m11828(obj2);
                } else {
                    c4126M23731.m11829(C7583.f22905);
                }
            }
            Object obj3 = this.f4796;
            if (obj3 != null) {
                c4126M23731.m11803(obj3);
            } else {
                Object obj4 = this.f4797;
                if (obj4 != null) {
                    c4126M23731.m11802(obj4);
                } else {
                    c4126M23731.m11802(C7583.f22905);
                }
            }
            float f = this.f4793;
            if (f != 0.5f) {
                c4126M23731.m11812(f);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m6541(float f) {
        this.f4793 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m6542(Object obj) {
        this.f4797 = obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m6543(Object obj) {
        this.f4796 = obj;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m6544(Object obj) {
        this.f4795 = obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m6545(Object obj) {
        this.f4794 = obj;
    }
}
