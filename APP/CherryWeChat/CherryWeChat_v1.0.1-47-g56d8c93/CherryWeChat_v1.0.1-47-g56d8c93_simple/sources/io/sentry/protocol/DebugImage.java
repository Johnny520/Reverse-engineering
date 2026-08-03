package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Iterator;
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

    public DebugImage() {
    }

    public static /* synthetic */ String access$002(DebugImage r0, String r1) {
        r0.uuid = r1;
        return r1;
    }

    public static /* synthetic */ String access$102(DebugImage r0, String r1) {
        r0.type = r1;
        return r1;
    }

    public static /* synthetic */ String access$202(DebugImage r0, String r1) {
        r0.debugId = r1;
        return r1;
    }

    public static /* synthetic */ String access$302(DebugImage r0, String r1) {
        r0.debugFile = r1;
        return r1;
    }

    public static /* synthetic */ String access$402(DebugImage r0, String r1) {
        r0.codeId = r1;
        return r1;
    }

    public static /* synthetic */ String access$502(DebugImage r0, String r1) {
        r0.codeFile = r1;
        return r1;
    }

    public static /* synthetic */ String access$602(DebugImage r0, String r1) {
        r0.imageAddr = r1;
        return r1;
    }

    public static /* synthetic */ Long access$702(DebugImage r0, Long r1) {
        r0.imageSize = r1;
        return r1;
    }

    public static /* synthetic */ String access$802(DebugImage r0, String r1) {
        r0.arch = r1;
        return r1;
    }

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
    public void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.uuid == null) goto L6;
        r42.m4106p("uuid");
        r42.m4115z(this.uuid);
    L6:
        if (this.type == null) goto L9;
        r42.m4106p("type");
        r42.m4115z(this.type);
    L9:
        if (this.debugId == null) goto L12;
        r42.m4106p("debug_id");
        r42.m4115z(this.debugId);
    L12:
        if (this.debugFile == null) goto L15;
        r42.m4106p("debug_file");
        r42.m4115z(this.debugFile);
    L15:
        if (this.codeId == null) goto L18;
        r42.m4106p("code_id");
        r42.m4115z(this.codeId);
    L18:
        if (this.codeFile == null) goto L21;
        r42.m4106p("code_file");
        r42.m4115z(this.codeFile);
    L21:
        if (this.imageAddr == null) goto L24;
        r42.m4106p("image_addr");
        r42.m4115z(this.imageAddr);
    L24:
        if (this.imageSize == null) goto L27;
        r42.m4106p("image_size");
        r42.m4114y(this.imageSize);
    L27:
        if (this.arch == null) goto L29;
        r42.m4106p("arch");
        r42.m4115z(this.arch);
    L29:
        Map<String, Object> r0 = this.unknown;
        if (r0 == null) goto L35;
        Iterator<String> r02 = r0.keySet().iterator();
    L33:
        if (r02.hasNext() == false) goto L35;
        String r1 = r02.next();
        Object r2 = this.unknown.get(r1);
        r42.m4106p(r1);
        r42.m4112w(r5, r2);
    L35:
        r42.m4102k();
    }

    public void setArch(String r1) {
        this.arch = r1;
    }

    public void setCodeFile(String r1) {
        this.codeFile = r1;
    }

    public void setCodeId(String r1) {
        this.codeId = r1;
    }

    public void setDebugFile(String r1) {
        this.debugFile = r1;
    }

    public void setDebugId(String r1) {
        this.debugId = r1;
    }

    public void setImageAddr(String r1) {
        this.imageAddr = r1;
    }

    public void setImageSize(Long r1) {
        this.imageSize = r1;
    }

    public void setType(String r1) {
        this.type = r1;
    }

    public void setUnknown(Map<String, Object> r1) {
        this.unknown = r1;
    }

    public void setUuid(String r1) {
        this.uuid = r1;
    }

    public void setImageSize(long r1) {
        this.imageSize = Long.valueOf(r1);
    }
}
