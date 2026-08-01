.class public interface abstract Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Replacement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Binding"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;,
        Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForMember;,
        Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$Unresolved;
    }
.end annotation


# virtual methods
.method public abstract isBound()Z
.end method

.method public abstract make(Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/implementation/bytecode/StackManipulation;I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method
