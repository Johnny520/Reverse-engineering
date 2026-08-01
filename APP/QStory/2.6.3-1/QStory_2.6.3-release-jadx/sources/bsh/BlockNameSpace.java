package bsh;

import bsh.util.ValueReferenceMap$Type;
import java.util.concurrent.atomic.AtomicInteger;
import p296.C9200;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BlockNameSpace extends NameSpace {
    public static final AtomicInteger blockCount = new AtomicInteger();
    private static C9200 blockspaces = new C9200(new C3474(0), ValueReferenceMap$Type.Weak);
    public final AtomicInteger used;

    public BlockNameSpace(NameSpace nameSpace, int i) {
        super(nameSpace, nameSpace.getName() + "/BlockNameSpace" + i);
        this.used = new AtomicInteger(1);
        this.isMethod = nameSpace.isMethod;
    }

    public static NameSpace getInstance(NameSpace nameSpace, int i) {
        C9200 c9200 = blockspaces;
        C3473 c3473 = new C3473();
        c3473.f8256 = nameSpace;
        c3473.f8255 = i;
        BlockNameSpace blockNameSpace = (BlockNameSpace) c9200.m14429(c3473);
        blockNameSpace.clear();
        return blockNameSpace;
    }

    private NameSpace getNonBlockParent() {
        NameSpace parent = super.getParent();
        return parent instanceof BlockNameSpace ? ((BlockNameSpace) parent).getNonBlockParent() : parent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BlockNameSpace lambda$static$0(C3473 c3473) {
        return new BlockNameSpace(c3473.f8256, c3473.f8255);
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
