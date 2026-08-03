package android.view.viewmodel;

import Yue.C4335;
import Yue.C4750;
import Yue.C5499;
import Yue.C6659;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import android.view.viewmodel.CreationExtras;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J,\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initialExtras", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/lifecycle/viewmodel/CreationExtras;)V", C4750.f10502, "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", C6659.f17103, "t", "LYue/ۥۣۢ۠ۤ;", "set", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;Ljava/lang/Object;)V", "get", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public final class MutableCreationExtras extends CreationExtras {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public MutableCreationExtras() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.view.viewmodel.CreationExtras
    @InterfaceC6489
    public <T> T get(@InterfaceC6399 CreationExtras.Key<T> key) {
        C5499.m17103(key, C6659.f17103);
        return (T) getMap$lifecycle_viewmodel_release().get(key);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.lifecycle.viewmodel.CreationExtras$Key<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void set(@InterfaceC6399 CreationExtras.Key<T> key, T t) {
        C5499.m17103(key, C6659.f17103);
        getMap$lifecycle_viewmodel_release().put(key, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MutableCreationExtras(@InterfaceC6399 CreationExtras creationExtras) {
        C5499.m17103(creationExtras, "initialExtras");
        getMap$lifecycle_viewmodel_release().putAll(creationExtras.getMap$lifecycle_viewmodel_release());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:androidx.lifecycle.viewmodel.CreationExtras:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:androidx.lifecycle.viewmodel.CreationExtras:0x0004: SGET  A[WRAPPED] (LINE:4) androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE androidx.lifecycle.viewmodel.CreationExtras$Empty) : (r1v0 androidx.lifecycle.viewmodel.CreationExtras))
 A[MD:(androidx.lifecycle.viewmodel.CreationExtras):void (m)] (LINE:4) call: androidx.lifecycle.viewmodel.MutableCreationExtras.<init>(androidx.lifecycle.viewmodel.CreationExtras):void type: THIS */
    public /* synthetic */ MutableCreationExtras(CreationExtras creationExtras, int i, C4335 c4335) {
        this((i & 1) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }
}
