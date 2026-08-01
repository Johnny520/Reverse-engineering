package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Descriptors$DescriptorValidationException extends Exception {
    private static final long serialVersionUID = 5750205775490483148L;
    private final String description;
    private final String name;
    private final InterfaceC3453 proto;

    private Descriptors$DescriptorValidationException(AbstractC3658 abstractC3658, String str) {
        super(abstractC3658.mo7801() + ": " + str);
        this.name = abstractC3658.mo7801();
        this.proto = abstractC3658.mo7803();
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public InterfaceC3453 getProblemProto() {
        return this.proto;
    }

    public String getProblemSymbolName() {
        return this.name;
    }

    private Descriptors$DescriptorValidationException(AbstractC3658 abstractC3658, String str, Throwable th) {
        this(abstractC3658, str);
        initCause(th);
    }

    private Descriptors$DescriptorValidationException(C3656 c3656, String str) {
        super(c3656.f11339.getName() + ": " + str);
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = c3656.f11339;
        this.name = descriptorProtos$FileDescriptorProto.getName();
        this.proto = descriptorProtos$FileDescriptorProto;
        this.description = str;
    }
}
