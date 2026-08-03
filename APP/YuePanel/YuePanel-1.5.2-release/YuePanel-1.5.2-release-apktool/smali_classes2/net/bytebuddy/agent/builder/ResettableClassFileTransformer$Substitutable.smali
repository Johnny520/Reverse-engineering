.class public interface abstract Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Substitutable"
.end annotation


# virtual methods
.method public abstract substitute(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V
.end method

.method public abstract unwrap()Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
.end method
