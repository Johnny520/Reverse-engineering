package p144c4;

import p049I2.AbstractC0797o;
import p117X2.C1675t;
import p118X3.AbstractC1687I;
import p118X3.C1711u;
import p208n4.C2716o;
import p208n4.InterfaceC2708g;

/* JADX INFO: renamed from: c4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1918h extends AbstractC1687I {

    /* JADX INFO: renamed from: f */
    public final String f6507f;

    /* JADX INFO: renamed from: g */
    public final long f6508g;

    /* JADX INFO: renamed from: h */
    public final C2716o f6509h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1918h(String str, long j5, C2716o c2716o) {
        this.f6507f = str;
        this.f6508g = j5;
        this.f6509h = c2716o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118X3.AbstractC1687I
    /* JADX INFO: renamed from: c */
    public final long mo505c() {
        return this.f6508g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118X3.AbstractC1687I
    /* JADX INFO: renamed from: d */
    public final C1711u mo506d() {
        String str = this.f6507f;
        if (str == null) {
            return null;
        }
        C1675t c1675t = C1711u.f5877d;
        try {
            return AbstractC0797o.m1390o(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118X3.AbstractC1687I
    /* JADX INFO: renamed from: f */
    public final InterfaceC2708g mo507f() {
        return this.f6509h;
    }
}
