.class public interface abstract Lnet/bytebuddy/description/NamedElement;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
