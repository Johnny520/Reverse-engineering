package com.yuexin.panel.myClass.LinDuo;

import Yue.InterfaceC5615;
import com.nmmedit.protect.NativeUtil;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5615
@Root(name = "ring", strict = false)
public class Ring {
    private static volatile /* synthetic */ String yue_xin_qwq0;

    @Attribute(required = false)
    private String artist;

    @Attribute(required = false)
    private String cid;

    @Attribute(required = false)
    private String date;

    @Attribute(required = false)
    private String duration;

    @Attribute(required = false)
    private String mp3url;

    @Attribute(required = false)
    private String name;

    @Attribute(required = false)
    private String rid;

    @Attribute(required = false)
    private String uid;

    static {
        NativeUtil.classesInit0(616);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    public native String getArtist();

    public native String getCid();

    public native String getDate();

    public native String getDuration();

    public native String getMp3url();

    public native String getName();

    public native String getRid();

    public native String getUid();

    public native void setArtist(String str);

    public native void setCid(String str);

    public native void setDate(String str);

    public native void setDuration(String str);

    public native void setMp3url(String str);

    public native void setName(String str);

    public native void setRid(String str);

    public native void setUid(String str);
}
