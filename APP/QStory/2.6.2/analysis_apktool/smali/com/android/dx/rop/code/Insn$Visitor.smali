.class public interface abstract Lcom/android/dx/rop/code/Insn$Visitor;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/rop/code/Insn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Visitor"
.end annotation


# virtual methods
.method public abstract visitFillArrayDataInsn(Lcom/android/dx/rop/code/FillArrayDataInsn;)V
.end method

.method public abstract visitInvokePolymorphicInsn(Lcom/android/dx/rop/code/InvokePolymorphicInsn;)V
.end method

.method public abstract visitPlainCstInsn(Lcom/android/dx/rop/code/PlainCstInsn;)V
.end method

.method public abstract visitPlainInsn(Lcom/android/dx/rop/code/PlainInsn;)V
.end method

.method public abstract visitSwitchInsn(Lcom/android/dx/rop/code/SwitchInsn;)V
.end method

.method public abstract visitThrowingCstInsn(Lcom/android/dx/rop/code/ThrowingCstInsn;)V
.end method

.method public abstract visitThrowingInsn(Lcom/android/dx/rop/code/ThrowingInsn;)V
.end method
