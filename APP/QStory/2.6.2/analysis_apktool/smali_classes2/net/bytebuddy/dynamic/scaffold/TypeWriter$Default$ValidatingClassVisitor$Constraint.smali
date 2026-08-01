.class public interface abstract Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Constraint"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$Compound;,
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClassFileVersion;,
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation;,
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForRecord;,
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface;,
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForPackageType;,
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForModuleType;,
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass;
    }
.end annotation


# virtual methods
.method public abstract assertAnnotation()V
.end method

.method public abstract assertDefaultMethodCall()V
.end method

.method public abstract assertDefaultValue(Ljava/lang/String;)V
.end method

.method public abstract assertDynamicValueInConstantPool()V
.end method

.method public abstract assertField(Ljava/lang/String;ZZZZ)V
.end method

.method public abstract assertHandleInConstantPool()V
.end method

.method public abstract assertInvokeDynamic()V
.end method

.method public abstract assertMethod(Ljava/lang/String;ZZZZZZZZ)V
.end method

.method public abstract assertMethodTypeInConstantPool()V
.end method

.method public abstract assertNestMate()V
.end method

.method public abstract assertPermittedSubclass()V
.end method

.method public abstract assertRecord()V
.end method

.method public abstract assertSubRoutine()V
.end method

.method public abstract assertType(ILjava/lang/String;ZZ)V
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
.end method

.method public abstract assertTypeAnnotation()V
.end method

.method public abstract assertTypeInConstantPool()V
.end method
