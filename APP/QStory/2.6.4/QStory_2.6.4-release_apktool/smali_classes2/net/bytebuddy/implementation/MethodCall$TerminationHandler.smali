.class public interface abstract Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TerminationHandler"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$FieldSetting;,
        Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;,
        Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;
    }
.end annotation


# virtual methods
.method public abstract prepare()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method

.method public abstract toStackManipulation(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method
