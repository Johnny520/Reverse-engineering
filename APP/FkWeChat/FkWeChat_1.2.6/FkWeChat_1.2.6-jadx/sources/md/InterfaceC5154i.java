package md;

/* JADX INFO: renamed from: md.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5154i {
    default Object arg(int i10) {
        return getArgs()[i10];
    }

    Object[] getArgs();

    Object getResult();

    Object getThisObject();

    default void setArg(int i10, Object obj) {
        getArgs()[i10] = obj;
    }

    void setResult(Object obj);

    default void skipWith(Object obj) {
        setResult(obj);
    }
}
