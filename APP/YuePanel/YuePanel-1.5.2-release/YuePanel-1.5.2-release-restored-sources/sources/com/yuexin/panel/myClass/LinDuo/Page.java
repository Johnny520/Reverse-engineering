package com.yuexin.panel.myClass.LinDuo;

import Yue.InterfaceC5615;
import com.nmmedit.protect.NativeUtil;
import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
@Root(name = "page", strict = false)
public class Page {

    @Attribute(required = false)
    private String baseurl;

    @Attribute(required = false)
    private String expire;

    @Attribute(required = false)
    private String hasmore;

    @Attribute(required = false)
    private String num;

    @ElementList(empty = true, entry = "ring", inline = true, required = false)
    private List<Ring> ringList;

    @Attribute(required = false)
    private String sig;

    static {
        NativeUtil.classesInit0(619);
    }

    public native String getBaseurl();

    public native String getExpire();

    public native String getHasmore();

    public native String getNum();

    public native List<Ring> getRingList();

    public native String getSig();

    public native void setBaseurl(String str);

    public native void setExpire(String str);

    public native void setHasmore(String str);

    public native void setNum(String str);

    public native void setRingList(List<Ring> list);

    public native void setSig(String str);
}
