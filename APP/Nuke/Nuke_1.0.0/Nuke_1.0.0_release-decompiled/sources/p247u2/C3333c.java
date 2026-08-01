package p247u2;

import java.sql.Timestamp;
import java.util.Date;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.InterfaceC2771C;
import p252v2.C3352a;

/* JADX INFO: renamed from: u2.c */
/* JADX INFO: loaded from: classes.dex */
public class C3333c implements InterfaceC2771C {
    @Override // p213o2.InterfaceC2771C
    /* JADX INFO: renamed from: a */
    public final AbstractC2770B mo4967a(C2785n c2785n, C3352a c3352a) {
        if (c3352a.f10417a != Timestamp.class) {
            return null;
        }
        c2785n.getClass();
        return new C3334d(c2785n.m4973b(new C3352a(Date.class)));
    }
}
