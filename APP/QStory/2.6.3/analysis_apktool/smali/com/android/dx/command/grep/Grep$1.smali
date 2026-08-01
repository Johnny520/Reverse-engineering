.class Lcom/android/dx/command/grep/Grep$1;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/io/CodeReader$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/command/grep/Grep;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Ljava/util/regex/Pattern;Ljava/io/PrintWriter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/command/grep/Grep;


# direct methods
.method public constructor <init>(Lcom/android/dx/command/grep/Grep;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/command/grep/Grep$1;->this$0:Lcom/android/dx/command/grep/Grep;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public visit([Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/DecodedInstruction;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/grep/Grep$1;->this$0:Lcom/android/dx/command/grep/Grep;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/android/dx/io/instructions/DecodedInstruction;->getIndex()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p0, p1}, Lcom/android/dx/command/grep/Grep;->access$000(Lcom/android/dx/command/grep/Grep;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
