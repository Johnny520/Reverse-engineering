.class public interface abstract Lnet/bytebuddy/dynamic/scaffold/MethodGraph;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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
