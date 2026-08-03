.class public interface abstract Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Dispatcher"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForDynamicInvocation;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Resolved;
    }
.end annotation


# virtual methods
.method public abstract resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Resolved;
.end method
