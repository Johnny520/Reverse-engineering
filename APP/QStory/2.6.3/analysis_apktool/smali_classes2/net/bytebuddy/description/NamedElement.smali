.class public interface abstract Lnet/bytebuddy/description/NamedElement;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/NamedElement$WithDescriptor;,
        Lnet/bytebuddy/description/NamedElement$WithGenericName;,
        Lnet/bytebuddy/description/NamedElement$WithOptionalName;,
        Lnet/bytebuddy/description/NamedElement$WithRuntimeName;
    }
.end annotation


# static fields
.field public static final EMPTY_NAME:Ljava/lang/String; = ""

.field public static final NO_NAME:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# virtual methods
.method public abstract getActualName()Ljava/lang/String;
.end method
