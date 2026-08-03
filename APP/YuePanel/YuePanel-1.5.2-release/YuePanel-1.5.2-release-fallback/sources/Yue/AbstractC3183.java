package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3183 {
    static {
            r0 = 29
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public AbstractC3183() {
            r0 = this;
            r0.<init>()
            return
    }

    public native java.util.HashMap<java.lang.String, org.luckypray.dexkit.query.FindMethod> dexKit(org.luckypray.dexkit.DexKitBridge r1, java.lang.String r2);

    public native org.luckypray.dexkit.result.MethodDataList dexKit(org.luckypray.dexkit.DexKitBridge r1);

    public native java.lang.String[] getClickStrings();

    public native java.lang.String[] getLongClickStrings();

    public abstract com.yuexin.panel.myClass.itemInfo info();

    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);

    public native void load(Yue.C1146 r1, java.lang.ClassLoader r2);

    public native boolean onCheck(java.lang.String r1, android.widget.Switch r2);

    public native void onClick();

    public native void onLongClick();
}
