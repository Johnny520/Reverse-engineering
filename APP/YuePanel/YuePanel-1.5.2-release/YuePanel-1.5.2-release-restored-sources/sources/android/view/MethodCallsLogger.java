package android.view;

import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC7144;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2698d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0006H\u0017R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m2699d2 = {"Landroidx/lifecycle/MethodCallsLogger;", "", "()V", "calledMethods", "", "", "", "approveCall", "", "name", "type", "lifecycle-common"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class MethodCallsLogger {

    @InterfaceC6399
    private final Map<String, Integer> calledMethods = new HashMap();

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public boolean approveCall(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "name");
        Integer num = this.calledMethods.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z = (iIntValue & i) != 0;
        this.calledMethods.put(str, Integer.valueOf(i | iIntValue));
        return !z;
    }
}
