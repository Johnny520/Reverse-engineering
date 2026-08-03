package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class Symbol {
    static final int BOOTSTRAP_METHOD_TAG = 64;
    static final int CONSTANT_CLASS_TAG = 7;
    static final int CONSTANT_DOUBLE_TAG = 6;
    static final int CONSTANT_DYNAMIC_TAG = 17;
    static final int CONSTANT_FIELDREF_TAG = 9;
    static final int CONSTANT_FLOAT_TAG = 4;
    static final int CONSTANT_INTEGER_TAG = 3;
    static final int CONSTANT_INTERFACE_METHODREF_TAG = 11;
    static final int CONSTANT_INVOKE_DYNAMIC_TAG = 18;
    static final int CONSTANT_LONG_TAG = 5;
    static final int CONSTANT_METHODREF_TAG = 10;
    static final int CONSTANT_METHOD_HANDLE_TAG = 15;
    static final int CONSTANT_METHOD_TYPE_TAG = 16;
    static final int CONSTANT_MODULE_TAG = 19;
    static final int CONSTANT_NAME_AND_TYPE_TAG = 12;
    static final int CONSTANT_PACKAGE_TAG = 20;
    static final int CONSTANT_STRING_TAG = 8;
    static final int CONSTANT_UTF8_TAG = 1;
    static final int MERGED_TYPE_TAG = 130;
    static final int TYPE_TAG = 128;
    static final int UNINITIALIZED_TYPE_TAG = 129;
    final long data;
    final int index;
    int info;
    final java.lang.String name;
    final java.lang.String owner;
    final int tag;
    final java.lang.String value;

    public Symbol(int r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, long r6) {
            r0 = this;
            r0.<init>()
            r0.index = r1
            r0.tag = r2
            r0.owner = r3
            r0.name = r4
            r0.value = r5
            r0.data = r6
            return
    }

    public int getArgumentsAndReturnSizes() {
            r1 = this;
            int r0 = r1.info
            if (r0 != 0) goto Lc
            java.lang.String r0 = r1.value
            int r0 = bsh.org.objectweb.asm.Type.getArgumentsAndReturnSizes(r0)
            r1.info = r0
        Lc:
            int r0 = r1.info
            return r0
    }
}
