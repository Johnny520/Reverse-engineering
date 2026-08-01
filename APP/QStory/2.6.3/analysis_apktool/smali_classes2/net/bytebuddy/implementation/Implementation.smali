.class public interface abstract Lnet/bytebuddy/implementation/Implementation;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/Implementation$Simple;,
        Lnet/bytebuddy/implementation/Implementation$Compound;,
        Lnet/bytebuddy/implementation/Implementation$Context;,
        Lnet/bytebuddy/implementation/Implementation$Target;,
        Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;,
        Lnet/bytebuddy/implementation/Implementation$Composable;
    }
.end annotation


# virtual methods
.method public abstract appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
.end method
