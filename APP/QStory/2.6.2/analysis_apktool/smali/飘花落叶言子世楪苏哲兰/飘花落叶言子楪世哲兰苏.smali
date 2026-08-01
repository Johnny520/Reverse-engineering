.class public final L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲兰苏;
.super L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

.field public final 飘花落叶言子楪世哲苏兰:I

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 5
    .line 6
    iput p3, p0, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:I

    .line 7
    .line 8
    iput-object p4, p0, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TextContextMenuItem(key="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", label=\""

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "\", leadingIcon="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget p0, p0, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:I

    .line 29
    .line 30
    const/16 v1, 0x29

    .line 31
    .line 32
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
