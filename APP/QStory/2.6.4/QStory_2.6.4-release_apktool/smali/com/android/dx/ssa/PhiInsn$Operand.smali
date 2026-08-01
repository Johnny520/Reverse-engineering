.class Lcom/android/dx/ssa/PhiInsn$Operand;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/ssa/PhiInsn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Operand"
.end annotation


# instance fields
.field public final blockIndex:I

.field public regSpec:Lcom/android/dx/rop/code/RegisterSpec;

.field public final ropLabel:I


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/code/RegisterSpec;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 5
    .line 6
    iput p2, p0, Lcom/android/dx/ssa/PhiInsn$Operand;->blockIndex:I

    .line 7
    .line 8
    iput p3, p0, Lcom/android/dx/ssa/PhiInsn$Operand;->ropLabel:I

    .line 9
    .line 10
    return-void
.end method
