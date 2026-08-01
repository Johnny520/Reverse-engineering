.class Lcom/android/dx/ssa/EscapeAnalysis$2;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/ssa/SsaBasicBlock$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/ssa/EscapeAnalysis;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/ssa/EscapeAnalysis;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/EscapeAnalysis;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/ssa/EscapeAnalysis$2;->this$0:Lcom/android/dx/ssa/EscapeAnalysis;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public visitBlock(Lcom/android/dx/ssa/SsaBasicBlock;Lcom/android/dx/ssa/SsaBasicBlock;)V
    .locals 0

    .line 1
    new-instance p2, Lcom/android/dx/ssa/EscapeAnalysis$2$1;

    .line 2
    .line 3
    invoke-direct {p2, p0}, Lcom/android/dx/ssa/EscapeAnalysis$2$1;-><init>(Lcom/android/dx/ssa/EscapeAnalysis$2;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lcom/android/dx/ssa/SsaBasicBlock;->forEachInsn(Lcom/android/dx/ssa/SsaInsn$Visitor;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
