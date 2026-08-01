.class public interface abstract Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TransformerDecorator"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator$Compound;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator$ForSubstitution;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator$NoOp;
    }
.end annotation


# virtual methods
.method public abstract decorate(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
.end method
