.class public interface abstract Lnet/bytebuddy/dynamic/scaffold/MethodGraph;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Simple;,
        Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;,
        Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;,
        Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;,
        Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;,
        Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Empty;
    }
.end annotation


# virtual methods
.method public abstract listNodes()Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;
.end method

.method public abstract locate(Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;
.end method
