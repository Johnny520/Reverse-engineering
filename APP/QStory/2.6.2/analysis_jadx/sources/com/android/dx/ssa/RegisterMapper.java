package com.android.dx.ssa;

import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.RegisterSpecSet;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class RegisterMapper {
    public abstract int getNewRegisterCount();

    public abstract RegisterSpec map(RegisterSpec registerSpec);

    public final RegisterSpecSet map(RegisterSpecSet registerSpecSet) {
        int maxSize = registerSpecSet.getMaxSize();
        RegisterSpecSet registerSpecSet2 = new RegisterSpecSet(getNewRegisterCount());
        for (int i = 0; i < maxSize; i++) {
            RegisterSpec registerSpec = registerSpecSet.get(i);
            if (registerSpec != null) {
                registerSpecSet2.put(map(registerSpec));
            }
        }
        registerSpecSet2.setImmutable();
        return registerSpecSet2.equals(registerSpecSet) ? registerSpecSet : registerSpecSet2;
    }

    public final RegisterSpecList map(RegisterSpecList registerSpecList) {
        int size = registerSpecList.size();
        RegisterSpecList registerSpecList2 = new RegisterSpecList(size);
        for (int i = 0; i < size; i++) {
            registerSpecList2.set(i, map(registerSpecList.get(i)));
        }
        registerSpecList2.setImmutable();
        return registerSpecList2.equals(registerSpecList) ? registerSpecList : registerSpecList2;
    }
}
