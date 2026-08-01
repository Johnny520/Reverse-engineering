package p110h9;

/* JADX INFO: renamed from: h9.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2900b extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2900b(IllegalAccessException illegalAccessException) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
        illegalAccessException.getClass();
    }
}
