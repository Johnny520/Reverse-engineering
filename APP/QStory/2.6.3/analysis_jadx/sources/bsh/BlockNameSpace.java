package bsh;

import bsh.util.ValueReferenceMap$Type;
import java.util.concurrent.atomic.AtomicInteger;
import p280.C8371;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BlockNameSpace extends NameSpace {
    public static final AtomicInteger blockCount = new AtomicInteger();
    private static C8371 blockspaces = new C8371(new C2641(0), ValueReferenceMap$Type.Weak);
    public final AtomicInteger used;

    public BlockNameSpace(NameSpace nameSpace, int i) {
        super(nameSpace, nameSpace.getName() + "/BlockNameSpace" + i);
        this.used = new AtomicInteger(1);
        this.isMethod = nameSpace.isMethod;
    }

    public static NameSpace getInstance(NameSpace nameSpace, int i) {
        C8371 c8371 = blockspaces;
        C2640 c2640 = new C2640();
        c2640.f7911 = nameSpace;
        c2640.f7910 = i;
        BlockNameSpace blockNameSpace = (BlockNameSpace) c8371.m13870(c2640);
        blockNameSpace.clear();
        return blockNameSpace;
    }

    private NameSpace getNonBlockParent() {
        NameSpace parent = super.getParent();
        return parent instanceof BlockNameSpace ? ((BlockNameSpace) parent).getNonBlockParent() : parent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BlockNameSpace lambda$static$0(C2640 c2640) {
        return new BlockNameSpace(c2640.f7911, c2640.f7910);
    }

    private boolean weHaveVar(String str) {
        return super.getVariableImpl(str, false) != null;
    }

    @Override // bsh.NameSpace
    public This getSuper(Interpreter interpreter) {
        return getNonBlockParent().getSuper(interpreter);
    }

    @Override // bsh.NameSpace
    public This getThis(Interpreter interpreter) {
        return getNonBlockParent().getThis(interpreter);
    }

    @Override // bsh.NameSpace
    public void importClass(String str) {
        getParent().importClass(str);
    }

    @Override // bsh.NameSpace
    public void importPackage(String str) {
        getParent().importPackage(str);
    }

    public void setBlockVariable(String str, Object obj) throws UtilEvalError {
        super.setVariable(str, obj, false, false);
    }

    @Override // bsh.NameSpace
    public void setMethod(BshMethod bshMethod) {
        getParent().setMethod(bshMethod);
    }

    @Override // bsh.NameSpace
    public Variable setVariable(String str, Object obj, boolean z, boolean z2) {
        return weHaveVar(str) ? super.setVariable(str, obj, z, false) : getParent().setVariable(str, obj, z, z2);
    }
}
