package Yue;

import android.widget.Switch;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5391 {
    static {
        NativeUtil.classesInit0(29);
    }

    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    public native String[] getClickStrings();

    public native String[] getLongClickStrings();

    public abstract itemInfo info();

    public native void load(C3828 c3828, ClassLoader classLoader);

    public native void load(C3829 c3829, ClassLoader classLoader);

    public native boolean onCheck(String str, Switch r2);

    public native void onClick();

    public native void onLongClick();
}
