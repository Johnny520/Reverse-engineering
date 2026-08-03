package p015b0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import bsh.org.objectweb.asm.Opcodes;
import p040d0.InterfaceC0647d;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1238s;
import p117i0.C1836h0;
import p119i2.C1939m0;
import p276sf.C3967n;
import p372z.InterfaceC6059g;

/* JADX INFO: renamed from: b0.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0148n implements InterfaceC1238s {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f391g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1238s
    /* JADX INFO: renamed from: d */
    public final Object mo726d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i9;
        int i10;
        switch (this.f391g) {
            case 0:
                InterfaceC6059g interfaceC6059g = (InterfaceC6059g) obj;
                InterfaceC0647d interfaceC0647d = (InterfaceC0647d) obj2;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj3;
                C1836h0 c1836h0 = (C1836h0) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i9 = ((iIntValue & 8) == 0 ? c1836h0.m4534f(interfaceC6059g) : c1836h0.m4538h(interfaceC6059g) ? 4 : 2) | iIntValue;
                } else {
                    i9 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i9 |= (iIntValue & 64) == 0 ? c1836h0.m4534f(interfaceC0647d) : c1836h0.m4538h(interfaceC0647d) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i9 |= c1836h0.m4538h(interfaceC1220a) ? Opcodes.ACC_NATIVE : 128;
                }
                if (c1836h0.m4516S(i9 & 1, (i9 & 1171) != 1170)) {
                    AbstractC0157w.m737c(interfaceC6059g, interfaceC0647d, interfaceC1220a, c1836h0, i9 & 1022);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                InterfaceC6059g interfaceC6059g2 = (InterfaceC6059g) obj;
                InterfaceC0647d interfaceC0647d2 = (InterfaceC0647d) obj2;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) obj3;
                C1836h0 c1836h02 = (C1836h0) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i10 = ((iIntValue2 & 8) == 0 ? c1836h02.m4534f(interfaceC6059g2) : c1836h02.m4538h(interfaceC6059g2) ? 4 : 2) | iIntValue2;
                } else {
                    i10 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i10 |= (iIntValue2 & 64) == 0 ? c1836h02.m4534f(interfaceC0647d2) : c1836h02.m4538h(interfaceC0647d2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i10 |= c1836h02.m4538h(interfaceC1220a2) ? Opcodes.ACC_NATIVE : 128;
                }
                if (c1836h02.m4516S(i10 & 1, (i10 & 1171) != 1170)) {
                    AbstractC0157w.m737c(interfaceC6059g2, interfaceC0647d2, interfaceC1220a2, c1836h02, i10 & 1022);
                } else {
                    c1836h02.m4519V();
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j3 = ((C1939m0) obj5).f6575a;
                String string = ((CharSequence) obj4).subSequence(C1939m0.m4816f(j3), C1939m0.m4815e(j3)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return C3967n.f12976a;
    }
}
