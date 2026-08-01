.class public interface abstract Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RelocationHandler"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Disabled;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;
    }
.end annotation


# virtual methods
.method public abstract bind(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;)Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;
.end method
