.class public interface abstract Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/FieldLocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Resolution"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution$Simple;,
        Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution$Illegal;
    }
.end annotation


# virtual methods
.method public abstract getField()Lnet/bytebuddy/description/field/FieldDescription;
.end method

.method public abstract isResolved()Z
.end method
