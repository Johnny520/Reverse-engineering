.class public interface abstract Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
