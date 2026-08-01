.class public interface abstract Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
