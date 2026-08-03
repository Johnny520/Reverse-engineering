package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DebugImage implements InterfaceC1567C0 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.uuid != null) {
            c1901c.m4106p("uuid");
            c1901c.m4115z(this.uuid);
        }
        if (this.type != null) {
            c1901c.m4106p("type");
            c1901c.m4115z(this.type);
        }
        if (this.debugId != null) {
            c1901c.m4106p("debug_id");
            c1901c.m4115z(this.debugId);
        }
        if (this.debugFile != null) {
            c1901c.m4106p("debug_file");
            c1901c.m4115z(this.debugFile);
        }
        if (this.codeId != null) {
            c1901c.m4106p("code_id");
            c1901c.m4115z(this.codeId);
        }
        if (this.codeFile != null) {
            c1901c.m4106p("code_file");
            c1901c.m4115z(this.codeFile);
        }
        if (this.imageAddr != null) {
            c1901c.m4106p("image_addr");
            c1901c.m4115z(this.imageAddr);
        }
        if (this.imageSize != null) {
            c1901c.m4106p("image_size");
            c1901c.m4114y(this.imageSize);
        }
        if (this.arch != null) {
            c1901c.m4106p("arch");
            c1901c.m4115z(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                c1901c.m4106p(str);
                c1901c.m4112w(iLogger, obj);
            }
        }
        c1901c.m4102k();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l) {
        this.imageSize = l;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j) {
        this.imageSize = Long.valueOf(j);
    }
}
