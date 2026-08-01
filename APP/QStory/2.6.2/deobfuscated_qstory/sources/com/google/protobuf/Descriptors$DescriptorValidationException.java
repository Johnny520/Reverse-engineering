package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class Descriptors$DescriptorValidationException extends Exception {
    private static final long serialVersionUID = 5750205775490483148L;
    private final String description;
    private final String name;
    private final InterfaceC3452 proto;

    private Descriptors$DescriptorValidationException(AbstractC3657 abstractC3657, String str) {
        super(abstractC3657.mo7814() + ": " + str);
        this.name = abstractC3657.mo7814();
        this.proto = abstractC3657.mo7816();
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public InterfaceC3452 getProblemProto() {
        return this.proto;
    }

    public String getProblemSymbolName() {
        return this.name;
    }

    private Descriptors$DescriptorValidationException(AbstractC3657 abstractC3657, String str, Throwable th) {
        this(abstractC3657, str);
        initCause(th);
    }

    private Descriptors$DescriptorValidationException(C3655 c3655, String str) {
        super(c3655.f11334.getName() + ": " + str);
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = c3655.f11334;
        this.name = descriptorProtos$FileDescriptorProto.getName();
        this.proto = descriptorProtos$FileDescriptorProto;
        this.description = str;
    }
}
