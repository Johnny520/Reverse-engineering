package com.yuexin.panel.myClass;

import Yue.InterfaceC5615;
import com.nmmedit.protect.NativeUtil;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
public class itemInfo {
    private static volatile /* synthetic */ String yue_xin_qwq0;
    public String checkID;

    /* JADX INFO: renamed from: id */
    public String f4200id;
    public String name;
    public String[] open;
    public String permission;
    public boolean firstHook = false;
    public boolean items = false;
    public boolean load = true;
    public boolean dexKit = true;
    public boolean activity = false;
    public boolean add = false;
    public String desc = yue_xin_awa(0);
    public boolean click = false;
    public boolean longClick = false;
    public boolean isCheck = false;
    public HashMap<String, String> map = new LinkedHashMap();

    static {
        NativeUtil.classesInit0(17);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);
}
