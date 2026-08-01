.class public interface abstract Lnet/bytebuddy/dynamic/scaffold/MethodGraph;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
