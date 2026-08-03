.class public interface abstract Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Resolved;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Resolved"
.end annotation


# virtual methods
.method public abstract make(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            ")",
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;"
        }
    .end annotation
.end method
