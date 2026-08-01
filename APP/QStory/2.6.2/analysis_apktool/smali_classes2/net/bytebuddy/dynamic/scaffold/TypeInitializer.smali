.class public interface abstract Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/TypeInitializer$Simple;,
        Lnet/bytebuddy/dynamic/scaffold/TypeInitializer$None;,
        Lnet/bytebuddy/dynamic/scaffold/TypeInitializer$Drain;
    }
.end annotation


# virtual methods
.method public abstract expandWith(Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;
.end method

.method public abstract isDefined()Z
.end method

.method public abstract wrap(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;
.end method
