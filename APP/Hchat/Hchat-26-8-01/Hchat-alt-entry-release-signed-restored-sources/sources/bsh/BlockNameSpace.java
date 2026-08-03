package bsh;

import bsh.util.ValueReferenceMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BlockNameSpace extends NameSpace {
    public static final AtomicInteger blockCount = new AtomicInteger();
    private static ValueReferenceMap<UniqueBlock, BlockNameSpace> blockspaces = new ValueReferenceMap<>(new C0342b(0), ValueReferenceMap.Type.Weak);
    public final AtomicInteger used;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class UniqueBlock {

        /* JADX INFO: renamed from: id */
        int f974id;

        /* JADX INFO: renamed from: ns */
        NameSpace f975ns;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public UniqueBlock(NameSpace nameSpace, int i9) {
            this.f975ns = nameSpace;
            this.f974id = i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof UniqueBlock) {
                UniqueBlock uniqueBlock = (UniqueBlock) obj;
                if (this.f975ns == uniqueBlock.f975ns && this.f974id == uniqueBlock.f974id) {
                    return true;
                }
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return Integer.hashCode(this.f974id) + (this.f975ns.hashCode() * 31);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BlockNameSpace(NameSpace nameSpace, int i9) {
        super(nameSpace, nameSpace.getName() + "/BlockNameSpace" + i9);
        this.used = new AtomicInteger(1);
        this.isMethod = nameSpace.isMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static NameSpace getInstance(NameSpace nameSpace, int i9) {
        BlockNameSpace blockNameSpace = blockspaces.get(new UniqueBlock(nameSpace, i9));
        blockNameSpace.clear();
        return blockNameSpace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private NameSpace getNonBlockParent() {
        NameSpace parent = super.getParent();
        return parent instanceof BlockNameSpace ? ((BlockNameSpace) parent).getNonBlockParent() : parent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BlockNameSpace lambda$static$0(UniqueBlock uniqueBlock) {
        return new BlockNameSpace(uniqueBlock.f975ns, uniqueBlock.f974id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean weHaveVar(String str) {
        return super.getVariableImpl(str, false) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSpace
    public This getSuper(Interpreter interpreter) {
        return getNonBlockParent().getSuper(interpreter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSpace
    public This getThis(Interpreter interpreter) {
        return getNonBlockParent().getThis(interpreter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSpace
    public void importClass(String str) {
        getParent().importClass(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSpace
    public void importPackage(String str) {
        getParent().importPackage(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBlockVariable(String str, Object obj) throws UtilEvalError {
        super.setVariable(str, obj, false, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSpace
    public void setMethod(BshMethod bshMethod) {
        getParent().setMethod(bshMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSpace
    public Variable setVariable(String str, Object obj, boolean z9, boolean z10) {
        return weHaveVar(str) ? super.setVariable(str, obj, z9, false) : getParent().setVariable(str, obj, z9, z10);
    }
}
