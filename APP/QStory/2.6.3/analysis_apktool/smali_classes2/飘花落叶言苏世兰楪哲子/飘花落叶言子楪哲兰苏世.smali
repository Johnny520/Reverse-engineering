.class public final synthetic L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:F

.field public final synthetic 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/io/File;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(IILjava/io/File;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:I

    .line 5
    .line 6
    iput p2, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:I

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Ljava/io/File;

    .line 9
    .line 10
    iput p4, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:F

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xad2

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget v1, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x2f

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget v1, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:I

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, "\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u545c\u545c\u545c\u545c\u545c\u545c\u545c"

    .line 33
    .line 34
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:Ljava/io/File;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget p0, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:F

    .line 55
    .line 56
    invoke-static {v0, p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏楪哲(Ljava/lang/String;F)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 57
    .line 58
    .line 59
    return-void
.end method
