.class public interface abstract Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
