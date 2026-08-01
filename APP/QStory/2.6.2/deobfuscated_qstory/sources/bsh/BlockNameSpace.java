package bsh;

import bsh.util.ValueReferenceMap$Type;
import java.util.concurrent.atomic.AtomicInteger;
import p280.C8370;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BlockNameSpace extends NameSpace {
    public static final AtomicInteger blockCount = new AtomicInteger();
    private static C8370 blockspaces = new C8370(new C2640(0), ValueReferenceMap$Type.Weak);
    public final AtomicInteger used;

    public BlockNameSpace(NameSpace nameSpace, int i) {
        super(nameSpace, nameSpace.getName() + "/BlockNameSpace" + i);
        this.used = new AtomicInteger(1);
        this.isMethod = nameSpace.isMethod;
    }

    public static NameSpace getInstance(NameSpace nameSpace, int i) {
        C8370 c8370 = blockspaces;
        C2639 c2639 = new C2639();
        c2639.f7909 = nameSpace;
        c2639.f7908 = i;
        BlockNameSpace blockNameSpace = (BlockNameSpace) c8370.m13853(c2639);
        blockNameSpace.clear();
        return blockNameSpace;
    }

    private NameSpace getNonBlockParent() {
        NameSpace parent = super.getParent();
        return parent instanceof BlockNameSpace ? ((BlockNameSpace) parent).getNonBlockParent() : parent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BlockNameSpace lambda$static$0(C2639 c2639) {
        return new BlockNameSpace(c2639.f7909, c2639.f7908);
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
