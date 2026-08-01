.class public final L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;
.super L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲苏世兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Z

.field public final 飘花落叶言子楪世苏哲兰:Llin/xposed/hook/javaplugin/bean/GroupInfo;


# direct methods
.method public constructor <init>(Llin/xposed/hook/javaplugin/bean/GroupInfo;Z)V
    .locals 1

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 10
    .line 11
    iput-boolean p2, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;

    .line 12
    .line 13
    iget-object v1, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 14
    .line 15
    iget-object v3, p1, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-boolean p0, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 25
    .line 26
    iget-boolean p1, p1, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 27
    .line 28
    if-eq p0, p1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-boolean p0, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xbea

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 v1, 0xbeb

    .line 21
    .line 22
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-boolean p0, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 30
    .line 31
    const/16 v1, 0x29

    .line 32
    .line 33
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method
