.class public interface abstract Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Step"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentLoading;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForAssignment;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Resolution;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U::",
        "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract resolve(Lnet/bytebuddy/asm/MemberSubstitution$Target;Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/Map;I)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Resolution;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;I)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Resolution;"
        }
    .end annotation
.end method
