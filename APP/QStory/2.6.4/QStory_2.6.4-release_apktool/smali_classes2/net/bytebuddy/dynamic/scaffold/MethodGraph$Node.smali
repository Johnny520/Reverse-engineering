.class public interface abstract Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
