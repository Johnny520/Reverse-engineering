package ca;

import android.app.Activity;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import p085fg.InterfaceC1236q;
import p276sf.C3967n;
import p332wb.InterfaceC5059kv;

/* JADX INFO: renamed from: ca.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0530q implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1650g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0517e0 f1651h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AtomicBoolean f1652i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC5059kv f1653j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f1654k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Activity f1655l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0530q(C0517e0 c0517e0, AtomicBoolean atomicBoolean, InterfaceC5059kv interfaceC5059kv, String str, Activity activity, int i9) {
        this.f1650g = i9;
        this.f1651h = c0517e0;
        this.f1652i = atomicBoolean;
        this.f1653j = interfaceC5059kv;
        this.f1654k = str;
        this.f1655l = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f1650g;
        final int iIntValue = ((Integer) obj).intValue();
        final int iIntValue2 = ((Integer) obj2).intValue();
        final boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        switch (i9) {
            case 0:
                final C0517e0 c0517e0 = this.f1651h;
                Handler handler = c0517e0.f1582d;
                final int i10 = 0;
                final AtomicBoolean atomicBoolean = this.f1652i;
                final InterfaceC5059kv interfaceC5059kv = this.f1653j;
                final String str = this.f1654k;
                final Activity activity = this.f1655l;
                handler.post(new Runnable() { // from class: ca.v
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str2;
                        String str3;
                        switch (i10) {
                            case 0:
                                atomicBoolean.set(true);
                                InterfaceC5059kv interfaceC5059kv2 = interfaceC5059kv;
                                if (interfaceC5059kv2 != null) {
                                    interfaceC5059kv2.close();
                                }
                                boolean z9 = zBooleanValue;
                                String str4 = str;
                                int i11 = iIntValue;
                                int i12 = iIntValue2;
                                if (z9) {
                                    str2 = str4 + " 已取消: " + i11 + "/" + i12;
                                } else if (i11 == i12) {
                                    str2 = str4 + " 完成: " + i11 + "/" + i12;
                                } else {
                                    str2 = str4 + " 部分失败: " + i11 + "/" + i12;
                                }
                                c0517e0.m1532r(activity, str2);
                                break;
                            default:
                                atomicBoolean.set(true);
                                InterfaceC5059kv interfaceC5059kv3 = interfaceC5059kv;
                                if (interfaceC5059kv3 != null) {
                                    interfaceC5059kv3.close();
                                }
                                boolean z10 = zBooleanValue;
                                String str5 = str;
                                int i13 = iIntValue;
                                int i14 = iIntValue2;
                                if (z10) {
                                    str3 = str5 + " 已取消: " + i13 + "/" + i14;
                                } else if (i13 == i14) {
                                    str3 = str5 + " 完成: " + i13 + "/" + i14;
                                } else {
                                    str3 = str5 + " 部分失败: " + i13 + "/" + i14;
                                }
                                c0517e0.m1532r(activity, str3);
                                break;
                        }
                    }
                });
                break;
            default:
                final C0517e0 c0517e02 = this.f1651h;
                Handler handler2 = c0517e02.f1582d;
                final int i11 = 1;
                final AtomicBoolean atomicBoolean2 = this.f1652i;
                final InterfaceC5059kv interfaceC5059kv2 = this.f1653j;
                final String str2 = this.f1654k;
                final Activity activity2 = this.f1655l;
                handler2.post(new Runnable() { // from class: ca.v
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str22;
                        String str3;
                        switch (i11) {
                            case 0:
                                atomicBoolean2.set(true);
                                InterfaceC5059kv interfaceC5059kv22 = interfaceC5059kv2;
                                if (interfaceC5059kv22 != null) {
                                    interfaceC5059kv22.close();
                                }
                                boolean z9 = zBooleanValue;
                                String str4 = str2;
                                int i112 = iIntValue;
                                int i12 = iIntValue2;
                                if (z9) {
                                    str22 = str4 + " 已取消: " + i112 + "/" + i12;
                                } else if (i112 == i12) {
                                    str22 = str4 + " 完成: " + i112 + "/" + i12;
                                } else {
                                    str22 = str4 + " 部分失败: " + i112 + "/" + i12;
                                }
                                c0517e02.m1532r(activity2, str22);
                                break;
                            default:
                                atomicBoolean2.set(true);
                                InterfaceC5059kv interfaceC5059kv3 = interfaceC5059kv2;
                                if (interfaceC5059kv3 != null) {
                                    interfaceC5059kv3.close();
                                }
                                boolean z10 = zBooleanValue;
                                String str5 = str2;
                                int i13 = iIntValue;
                                int i14 = iIntValue2;
                                if (z10) {
                                    str3 = str5 + " 已取消: " + i13 + "/" + i14;
                                } else if (i13 == i14) {
                                    str3 = str5 + " 完成: " + i13 + "/" + i14;
                                } else {
                                    str3 = str5 + " 部分失败: " + i13 + "/" + i14;
                                }
                                c0517e02.m1532r(activity2, str3);
                                break;
                        }
                    }
                });
                break;
        }
        return C3967n.f12976a;
    }
}
