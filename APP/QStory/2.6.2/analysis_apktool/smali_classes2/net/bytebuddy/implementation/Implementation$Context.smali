.class public interface abstract Lnet/bytebuddy/implementation/Implementation$Context;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/MethodAccessorFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/Implementation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Context"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/Implementation$Context$Default;,
        Lnet/bytebuddy/implementation/Implementation$Context$Disabled;,
        Lnet/bytebuddy/implementation/Implementation$Context$Factory;,
        Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;,
        Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;
    }
.end annotation


# virtual methods
.method public abstract cache(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;
.end method

.method public abstract getClassFileVersion()Lnet/bytebuddy/ClassFileVersion;
.end method

.method public abstract getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;
.end method

.method public abstract getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;
.end method

.method public abstract register(Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;)Lnet/bytebuddy/description/type/TypeDescription;
.end method
