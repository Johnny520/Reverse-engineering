.class public interface abstract Lnet/bytebuddy/asm/Advice$ArgumentHandler;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ArgumentHandler"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$ArgumentHandler$Factory;,
        Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;,
        Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForInstrumentedMethod;
    }
.end annotation


# static fields
.field public static final THIS_REFERENCE:I


# virtual methods
.method public abstract argument(I)I
.end method

.method public abstract enter()I
.end method

.method public abstract exit()I
.end method

.method public abstract named(Ljava/lang/String;)I
.end method

.method public abstract returned()I
.end method

.method public abstract thrown()I
.end method
