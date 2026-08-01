.class public interface abstract Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/MethodGraph;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Node"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Simple;,
        Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Unresolved;,
        Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;
    }
.end annotation


# virtual methods
.method public abstract getMethodTypes()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lnet/bytebuddy/description/method/MethodDescription$TypeToken;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRepresentative()Lnet/bytebuddy/description/method/MethodDescription;
.end method

.method public abstract getSort()Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;
.end method

.method public abstract getVisibility()Lnet/bytebuddy/description/modifier/Visibility;
.end method
