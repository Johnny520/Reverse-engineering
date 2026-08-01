.class public interface abstract Lnet/bytebuddy/implementation/Implementation;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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
