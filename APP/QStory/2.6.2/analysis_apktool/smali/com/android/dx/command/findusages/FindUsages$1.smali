.class Lcom/android/dx/command/findusages/FindUsages$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/io/CodeReader$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/command/findusages/FindUsages;-><init>(L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;Ljava/lang/String;Ljava/lang/String;Ljava/io/PrintWriter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/command/findusages/FindUsages;

.field final synthetic val$dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

.field final synthetic val$out:Ljava/io/PrintWriter;


# direct methods
.method public constructor <init>(Lcom/android/dx/command/findusages/FindUsages;Ljava/io/PrintWriter;L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/android/dx/command/findusages/FindUsages$1;->val$out:Ljava/io/PrintWriter;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/android/dx/command/findusages/FindUsages$1;->val$dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/android/dx/command/findusages/FindUsages$1;->this$0:Lcom/android/dx/command/findusages/FindUsages;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public visit([Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/DecodedInstruction;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lcom/android/dx/io/instructions/DecodedInstruction;->getIndex()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lcom/android/dx/command/findusages/FindUsages$1;->this$0:Lcom/android/dx/command/findusages/FindUsages;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/android/dx/command/findusages/FindUsages;->access$000(Lcom/android/dx/command/findusages/FindUsages;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/android/dx/command/findusages/FindUsages$1;->val$out:Ljava/io/PrintWriter;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lcom/android/dx/command/findusages/FindUsages$1;->this$0:Lcom/android/dx/command/findusages/FindUsages;

    .line 29
    .line 30
    invoke-static {v2}, Lcom/android/dx/command/findusages/FindUsages;->access$100(Lcom/android/dx/command/findusages/FindUsages;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v2, ": field reference "

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Lcom/android/dx/command/findusages/FindUsages$1;->val$dex:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;

    .line 43
    .line 44
    iget-object p0, p0, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, L飘花落叶言楪子哲兰苏世/飘花落叶言子楪苏哲兰世;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, " ("

    .line 54
    .line 55
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcode()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    invoke-static {p0}, Lcom/android/dx/io/OpcodeInfo;->getName(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p0, ")"

    .line 70
    .line 71
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {v0, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_0
    return-void
.end method
