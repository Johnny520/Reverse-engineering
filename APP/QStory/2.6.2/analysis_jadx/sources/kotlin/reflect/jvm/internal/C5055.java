package kotlin.reflect.jvm.internal;

import androidx.collection.C0276;
import io.ktor.util.C4210;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4393;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import p053.AbstractC6560;
import p175.AbstractC7738;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5055 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ String f14595;

    public C5055(String str) {
        this.f14595 = str;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Class<?> cls;
        String strMo8911;
        String strMo89112;
        InterfaceC5091 interfaceC5091Mo8909 = ((InterfaceC5086) obj).mo8909();
        String str = this.f14595;
        if (interfaceC5091Mo8909 == null) {
            C4210.m8603(str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
            return 0;
        }
        if (interfaceC5091Mo8909 instanceof InterfaceC5092) {
            strMo8911 = AbstractC6560.m12029((InterfaceC5092) interfaceC5091Mo8909).getName();
        } else {
            if (!(interfaceC5091Mo8909 instanceof AbstractC4393)) {
                cls = interfaceC5091Mo8909.getClass();
                C0276.m844(AbstractC4395.f12971.mo8927(cls), "Unknown upper bound classifier: ");
                return 0;
            }
            strMo8911 = ((AbstractC4393) interfaceC5091Mo8909).mo8911();
        }
        InterfaceC5091 interfaceC5091Mo89092 = ((InterfaceC5086) obj2).mo8909();
        if (interfaceC5091Mo89092 == null) {
            C4210.m8603(str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
            return 0;
        }
        if (interfaceC5091Mo89092 instanceof InterfaceC5092) {
            strMo89112 = AbstractC6560.m12029((InterfaceC5092) interfaceC5091Mo89092).getName();
        } else {
            if (!(interfaceC5091Mo89092 instanceof AbstractC4393)) {
                cls = interfaceC5091Mo89092.getClass();
                C0276.m844(AbstractC4395.f12971.mo8927(cls), "Unknown upper bound classifier: ");
                return 0;
            }
            strMo89112 = ((AbstractC4393) interfaceC5091Mo89092).mo8911();
        }
        return AbstractC7738.m13040(strMo8911, strMo89112);
    }
}
