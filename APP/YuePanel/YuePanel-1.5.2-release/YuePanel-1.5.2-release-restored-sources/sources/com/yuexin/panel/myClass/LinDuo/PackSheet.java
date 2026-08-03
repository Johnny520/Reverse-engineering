package com.yuexin.panel.myClass.LinDuo;

import Yue.InterfaceC5615;
import com.nmmedit.protect.NativeUtil;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
@Root(name = "sheet", strict = false)
public class PackSheet {

    @Element(name = "page")
    @Attribute(required = false)
    private Page page;

    static {
        NativeUtil.classesInit0(191);
    }

    public native Page getPage();

    public native void setPage(Page page);
}
