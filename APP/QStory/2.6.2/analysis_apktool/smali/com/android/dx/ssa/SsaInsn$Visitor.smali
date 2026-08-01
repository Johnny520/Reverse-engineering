.class public interface abstract Lcom/android/dx/ssa/SsaInsn$Visitor;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/ssa/SsaInsn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Visitor"
.end annotation


# virtual methods
.method public abstract visitMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V
.end method

.method public abstract visitNonMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V
.end method

.method public abstract visitPhiInsn(Lcom/android/dx/ssa/PhiInsn;)V
.end method
