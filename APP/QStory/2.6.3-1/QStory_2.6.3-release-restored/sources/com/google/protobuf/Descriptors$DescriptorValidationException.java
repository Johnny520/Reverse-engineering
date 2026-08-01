package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Descriptors$DescriptorValidationException extends Exception {
    private static final long serialVersionUID = 5750205775490483148L;
    private final String description;
    private final String name;
    private final InterfaceC4285 proto;

    private Descriptors$DescriptorValidationException(AbstractC4490 abstractC4490, String str) {
        super(abstractC4490.mo8360() + ": " + str);
        this.name = abstractC4490.mo8360();
        this.proto = abstractC4490.mo8362();
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public InterfaceC4285 getProblemProto() {
        return this.proto;
    }

    public String getProblemSymbolName() {
        return this.name;
    }

    private Descriptors$DescriptorValidationException(AbstractC4490 abstractC4490, String str, Throwable th) {
        this(abstractC4490, str);
        initCause(th);
    }

    private Descriptors$DescriptorValidationException(C4488 c4488, String str) {
        super(c4488.f11684.getName() + ": " + str);
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = c4488.f11684;
        this.name = descriptorProtos$FileDescriptorProto.getName();
        this.proto = descriptorProtos$FileDescriptorProto;
        this.description = str;
    }
}
