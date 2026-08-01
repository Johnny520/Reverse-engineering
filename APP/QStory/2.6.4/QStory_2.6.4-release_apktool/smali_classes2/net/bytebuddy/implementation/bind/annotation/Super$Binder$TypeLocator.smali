.class public interface abstract Lnet/bytebuddy/implementation/bind/annotation/Super$Binder$TypeLocator;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TypeLocator"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bind/annotation/Super$Binder$TypeLocator$ForType;,
        Lnet/bytebuddy/implementation/bind/annotation/Super$Binder$TypeLocator$ForParameterType;,
        Lnet/bytebuddy/implementation/bind/annotation/Super$Binder$TypeLocator$ForInstrumentedType;
    }
.end annotation


# virtual methods
.method public abstract resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/description/type/TypeDescription;
.end method
