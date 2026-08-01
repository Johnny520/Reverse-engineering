.class public Landroidx/recyclerview/widget/LinearLayoutManager;
.super Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/recyclerview/widget/飘花落叶言子世楪兰哲苏;
.implements Landroidx/recyclerview/widget/飘花落叶言子苏兰世哲楪;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;
    }
.end annotation


# instance fields
.field public final 飘花落叶言子世兰楪哲苏:I

.field public final 飘花落叶言子世兰楪苏哲:Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;

.field public final 飘花落叶言子世兰苏楪哲:[I

.field public 飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

.field public final 飘花落叶言子世哲兰苏楪:Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;

.field public final 飘花落叶言子世哲楪兰苏:Z

.field public 飘花落叶言子世哲楪苏兰:Z

.field public 飘花落叶言子世哲苏兰楪:I

.field public 飘花落叶言子世哲苏楪兰:I

.field public 飘花落叶言子世苏兰哲楪:Z

.field public final 飘花落叶言子世苏兰楪哲:Z

.field public 飘花落叶言子世苏哲兰楪:Z

.field public 飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

.field public 飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

.field public 飘花落叶言子世苏楪哲兰:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 77
    invoke-direct {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;-><init>()V

    const/4 v0, 0x1

    .line 78
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    const/4 v1, 0x0

    .line 79
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰楪哲:Z

    .line 80
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 81
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪苏兰:Z

    .line 82
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪兰苏:Z

    const/4 v0, -0x1

    .line 83
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    const/high16 v0, -0x80000000

    .line 84
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏兰楪:I

    const/4 v0, 0x0

    .line 85
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 86
    new-instance v2, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;

    invoke-direct {v2}, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;-><init>()V

    iput-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰苏楪:Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;

    .line 87
    new-instance v2, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;

    .line 88
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世兰楪苏哲:Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;

    const/4 v2, 0x2

    .line 90
    iput v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世兰楪哲苏:I

    .line 91
    new-array v2, v2, [I

    iput-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世兰苏楪哲:[I

    .line 92
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世哲兰苏(I)V

    .line 93
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 94
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰楪哲:Z

    if-nez p1, :cond_0

    return-void

    .line 95
    :cond_0
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰楪哲:Z

    .line 96
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世苏兰楪()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰楪哲:Z

    .line 9
    .line 10
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 11
    .line 12
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪苏兰:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪兰苏:Z

    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    .line 18
    .line 19
    const/high16 v0, -0x80000000

    .line 20
    .line 21
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏兰楪:I

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 25
    .line 26
    new-instance v1, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;

    .line 27
    .line 28
    invoke-direct {v1}, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰苏楪:Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;

    .line 32
    .line 33
    new-instance v1, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世兰楪苏哲:Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    iput v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世兰楪哲苏:I

    .line 42
    .line 43
    new-array v1, v1, [I

    .line 44
    .line 45
    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世兰苏楪哲:[I

    .line 46
    .line 47
    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏哲楪(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/飘花落叶言子苏世楪兰哲;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget p2, p1, Landroidx/recyclerview/widget/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 52
    .line 53
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世哲兰苏(I)V

    .line 54
    .line 55
    .line 56
    iget-boolean p2, p1, Landroidx/recyclerview/widget/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰楪哲:Z

    .line 62
    .line 63
    if-ne p2, p3, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iput-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰楪哲:Z

    .line 67
    .line 68
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世苏兰楪()V

    .line 69
    .line 70
    .line 71
    :goto_0
    iget-boolean p1, p1, Landroidx/recyclerview/widget/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世兰苏哲(Z)V

    .line 74
    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public 飘花落叶言子世楪兰哲苏()Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;
    .locals 1

    .line 1
    new-instance p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 2
    .line 3
    const/4 v0, -0x2

    .line 4
    invoke-direct {p0, v0, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;-><init>(II)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子世楪兰苏哲(I)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    sub-int v1, p1, v1

    .line 19
    .line 20
    if-ltz v1, :cond_1

    .line 21
    .line 22
    if-ge v1, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ne v1, p1, :cond_1

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世楪兰苏哲(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public 飘花落叶言子世楪哲苏兰(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪哲世苏(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public 飘花落叶言子世楪苏兰哲(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪苏哲世(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子世楪苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪苏世哲(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子兰世哲楪苏()I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-virtual {p0, v0, v1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏楪哲世(IIZ)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    const/4 p0, -0x1

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-static {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public final 飘花落叶言子兰世哲苏楪()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, -0x1

    .line 9
    invoke-virtual {p0, v0, v2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏楪哲世(IIZ)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return v2

    .line 16
    :cond_0
    invoke-static {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final 飘花落叶言子兰世楪哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I
    .locals 7

    .line 1
    iget v0, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    iget v1, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:I

    .line 4
    .line 5
    const/high16 v2, -0x80000000

    .line 6
    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    if-gez v0, :cond_0

    .line 10
    .line 11
    add-int/2addr v1, v0

    .line 12
    iput v1, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:I

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲苏楪世(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget v1, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 18
    .line 19
    iget v3, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 20
    .line 21
    add-int/2addr v1, v3

    .line 22
    :cond_2
    iget-boolean v3, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰哲世:Z

    .line 23
    .line 24
    if-nez v3, :cond_3

    .line 25
    .line 26
    if-lez v1, :cond_9

    .line 27
    .line 28
    :cond_3
    iget v3, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 29
    .line 30
    if-ltz v3, :cond_9

    .line 31
    .line 32
    invoke-virtual {p3}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-ge v3, v4, :cond_9

    .line 37
    .line 38
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世兰楪苏哲:Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    iput v4, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 42
    .line 43
    iput-boolean v4, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Z

    .line 44
    .line 45
    iput-boolean v4, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲苏兰:Z

    .line 46
    .line 47
    iput-boolean v4, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏:Z

    .line 48
    .line 49
    invoke-virtual {p0, p1, p3, p2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲世楪苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;)V

    .line 50
    .line 51
    .line 52
    iget-boolean v4, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Z

    .line 53
    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    iget v4, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 58
    .line 59
    iget v5, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 60
    .line 61
    iget v6, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:I

    .line 62
    .line 63
    mul-int/2addr v6, v5

    .line 64
    add-int/2addr v6, v4

    .line 65
    iput v6, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 66
    .line 67
    iget-boolean v4, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲苏兰:Z

    .line 68
    .line 69
    if-eqz v4, :cond_5

    .line 70
    .line 71
    iget-object v4, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:Ljava/util/List;

    .line 72
    .line 73
    if-nez v4, :cond_5

    .line 74
    .line 75
    iget-boolean v4, p3, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 76
    .line 77
    if-nez v4, :cond_6

    .line 78
    .line 79
    :cond_5
    iget v4, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 80
    .line 81
    sub-int/2addr v4, v5

    .line 82
    iput v4, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 83
    .line 84
    sub-int/2addr v1, v5

    .line 85
    :cond_6
    iget v4, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:I

    .line 86
    .line 87
    if-eq v4, v2, :cond_8

    .line 88
    .line 89
    add-int/2addr v4, v5

    .line 90
    iput v4, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:I

    .line 91
    .line 92
    iget v5, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 93
    .line 94
    if-gez v5, :cond_7

    .line 95
    .line 96
    add-int/2addr v4, v5

    .line 97
    iput v4, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:I

    .line 98
    .line 99
    :cond_7
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲苏楪世(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;)V

    .line 100
    .line 101
    .line 102
    :cond_8
    if-eqz p4, :cond_2

    .line 103
    .line 104
    iget-boolean v3, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏:Z

    .line 105
    .line 106
    if-eqz v3, :cond_2

    .line 107
    .line 108
    :cond_9
    :goto_0
    iget p0, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 109
    .line 110
    sub-int/2addr v0, p0

    .line 111
    return v0
.end method

.method public final 飘花落叶言子兰世楪苏哲()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Z

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput v1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 15
    .line 16
    iput v1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:I

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-object v1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:Ljava/util/List;

    .line 20
    .line 21
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子兰世苏哲楪(Z)Landroid/view/View;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏楪哲世(IIZ)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏楪哲世(IIZ)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final 飘花落叶言子兰世苏楪哲(Z)Landroid/view/View;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏楪哲世(IIZ)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏楪哲世(IIZ)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public 飘花落叶言子兰哲世楪苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;)V
    .locals 7

    .line 1
    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p2, 0x1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iput-boolean p2, p4, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 16
    .line 17
    iget-object v1, p3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:Ljava/util/List;

    .line 18
    .line 19
    iget-boolean v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 20
    .line 21
    iget v3, p3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:I

    .line 22
    .line 23
    const/4 v4, -0x1

    .line 24
    const/4 v5, 0x0

    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    if-ne v3, v4, :cond_1

    .line 28
    .line 29
    move v1, p2

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v1, v5

    .line 32
    :goto_0
    if-ne v2, v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-virtual {p0, p1, v5, v5}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世苏兰(Landroid/view/View;IZ)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    if-ne v3, v4, :cond_4

    .line 43
    .line 44
    move v1, p2

    .line 45
    goto :goto_1

    .line 46
    :cond_4
    move v1, v5

    .line 47
    :goto_1
    if-ne v2, v1, :cond_5

    .line 48
    .line 49
    invoke-virtual {p0, p1, v4, p2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世苏兰(Landroid/view/View;IZ)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_5
    invoke-virtual {p0, p1, v5, p2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世苏兰(Landroid/view/View;IZ)V

    .line 54
    .line 55
    .line 56
    :goto_2
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子苏楪兰世哲(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 60
    .line 61
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(Landroid/view/View;)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    iput v1, p4, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 66
    .line 67
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 68
    .line 69
    if-ne v1, p2, :cond_8

    .line 70
    .line 71
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲楪苏世()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    iget v1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世楪兰苏哲:I

    .line 78
    .line 79
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingRight()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    sub-int/2addr v1, v2

    .line 84
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏(Landroid/view/View;)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    sub-int p0, v1, p0

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingLeft()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏(Landroid/view/View;)I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    add-int/2addr p0, v1

    .line 104
    move v6, v1

    .line 105
    move v1, p0

    .line 106
    move p0, v6

    .line 107
    :goto_3
    iget v2, p3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:I

    .line 108
    .line 109
    iget p3, p3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 110
    .line 111
    iget v3, p4, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 112
    .line 113
    if-ne v2, v4, :cond_7

    .line 114
    .line 115
    sub-int v2, p3, v3

    .line 116
    .line 117
    move v3, p3

    .line 118
    move p3, v2

    .line 119
    goto :goto_4

    .line 120
    :cond_7
    add-int/2addr v3, p3

    .line 121
    goto :goto_4

    .line 122
    :cond_8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->getPaddingTop()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 127
    .line 128
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏(Landroid/view/View;)I

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    add-int/2addr p0, v1

    .line 133
    iget v2, p3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:I

    .line 134
    .line 135
    iget p3, p3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 136
    .line 137
    iget v3, p4, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 138
    .line 139
    if-ne v2, v4, :cond_9

    .line 140
    .line 141
    sub-int v2, p3, v3

    .line 142
    .line 143
    move v3, v1

    .line 144
    move v1, p3

    .line 145
    move p3, v3

    .line 146
    move v3, p0

    .line 147
    move p0, v2

    .line 148
    goto :goto_4

    .line 149
    :cond_9
    add-int v2, p3, v3

    .line 150
    .line 151
    move v3, p0

    .line 152
    move p0, p3

    .line 153
    move p3, v1

    .line 154
    move v1, v2

    .line 155
    :goto_4
    invoke-static {p1, p0, p3, v1, v3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子苏楪哲兰世(Landroid/view/View;IIII)V

    .line 156
    .line 157
    .line 158
    iget-object p0, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 159
    .line 160
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-nez p0, :cond_a

    .line 165
    .line 166
    iget-object p0, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 167
    .line 168
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isUpdated()Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    if-eqz p0, :cond_b

    .line 173
    .line 174
    :cond_a
    iput-boolean p2, p4, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲苏兰:Z

    .line 175
    .line 176
    :cond_b
    invoke-virtual {p1}, Landroid/view/View;->hasFocusable()Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    iput-boolean p0, p4, Landroidx/recyclerview/widget/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏:Z

    .line 181
    .line 182
    return-void
.end method

.method public 飘花落叶言子兰哲世苏楪(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子兰哲楪世苏()Landroid/view/View;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final 飘花落叶言子兰哲楪苏世()Z
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x1

    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final 飘花落叶言子兰哲苏世楪(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;II)V
    .locals 2

    .line 1
    if-ne p2, p3, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    if-le p3, p2, :cond_2

    .line 5
    .line 6
    add-int/lit8 p3, p3, -0x1

    .line 7
    .line 8
    :goto_0
    if-lt p3, p2, :cond_4

    .line 9
    .line 10
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;

    .line 21
    .line 22
    invoke-virtual {v1, p3}, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏哲世兰(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 p3, p3, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    :goto_1
    if-le p2, p3, :cond_4

    .line 32
    .line 33
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    iget-object v1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;

    .line 44
    .line 45
    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(I)V

    .line 46
    .line 47
    .line 48
    :cond_3
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏哲世兰(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 p2, p2, -0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_4
    :goto_2
    return-void
.end method

.method public final 飘花落叶言子兰哲苏楪世(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;)V
    .locals 5

    .line 1
    iget-boolean v0, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Z

    .line 2
    .line 3
    if-eqz v0, :cond_e

    .line 4
    .line 5
    iget-boolean v0, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰哲世:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_8

    .line 10
    .line 11
    :cond_0
    iget v0, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:I

    .line 12
    .line 13
    iget v1, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:I

    .line 14
    .line 15
    iget p2, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, -0x1

    .line 19
    if-ne p2, v3, :cond_7

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-gez v0, :cond_1

    .line 26
    .line 27
    goto/16 :goto_8

    .line 28
    .line 29
    :cond_1
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 30
    .line 31
    invoke-virtual {v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰哲苏()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    sub-int/2addr v3, v0

    .line 36
    add-int/2addr v3, v1

    .line 37
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 38
    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    move v0, v2

    .line 42
    :goto_0
    if-ge v0, p2, :cond_e

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 49
    .line 50
    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-lt v4, v3, :cond_3

    .line 55
    .line 56
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 57
    .line 58
    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏世兰(Landroid/view/View;)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-ge v1, v3, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_1
    invoke-virtual {p0, p1, v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲苏世楪(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;II)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_4
    add-int/lit8 p2, p2, -0x1

    .line 73
    .line 74
    move v0, p2

    .line 75
    :goto_2
    if-ltz v0, :cond_e

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 82
    .line 83
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-lt v2, v3, :cond_6

    .line 88
    .line 89
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 90
    .line 91
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏世兰(Landroid/view/View;)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-ge v1, v3, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    add-int/lit8 v0, v0, -0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_6
    :goto_3
    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲苏世楪(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;II)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_7
    if-gez v0, :cond_8

    .line 106
    .line 107
    goto :goto_8

    .line 108
    :cond_8
    sub-int/2addr v0, v1

    .line 109
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 114
    .line 115
    if-eqz v1, :cond_b

    .line 116
    .line 117
    add-int/lit8 p2, p2, -0x1

    .line 118
    .line 119
    move v1, p2

    .line 120
    :goto_4
    if-ltz v1, :cond_e

    .line 121
    .line 122
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 127
    .line 128
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-gt v3, v0, :cond_a

    .line 133
    .line 134
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 135
    .line 136
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世兰苏(Landroid/view/View;)I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-le v2, v0, :cond_9

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_9
    add-int/lit8 v1, v1, -0x1

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_a
    :goto_5
    invoke-virtual {p0, p1, p2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲苏世楪(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;II)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_b
    move v1, v2

    .line 151
    :goto_6
    if-ge v1, p2, :cond_e

    .line 152
    .line 153
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 158
    .line 159
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)I

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-gt v4, v0, :cond_d

    .line 164
    .line 165
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 166
    .line 167
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世兰苏(Landroid/view/View;)I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-le v3, v0, :cond_c

    .line 172
    .line 173
    goto :goto_7

    .line 174
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_d
    :goto_7
    invoke-virtual {p0, p1, v2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲苏世楪(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;II)V

    .line 178
    .line 179
    .line 180
    :cond_e
    :goto_8
    return-void
.end method

.method public 飘花落叶言子兰楪世哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;)V
    .locals 0

    .line 1
    iget p0, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 2
    .line 3
    if-ltz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-ge p0, p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iget p2, p2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:I

    .line 13
    .line 14
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p3, p0, p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(II)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public 飘花落叶言子兰楪世苏哲(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;[I)V
    .locals 2

    .line 1
    iget p1, p1, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, -0x1

    .line 5
    if-eq p1, v1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰哲世()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p1, v0

    .line 15
    :goto_0
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 16
    .line 17
    iget p0, p0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:I

    .line 18
    .line 19
    if-ne p0, v1, :cond_1

    .line 20
    .line 21
    move p0, v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p0, p1

    .line 24
    move p1, v0

    .line 25
    :goto_1
    aput p1, p2, v0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    aput p0, p2, p1

    .line 29
    .line 30
    return-void
.end method

.method public final 飘花落叶言子兰楪哲世苏(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪苏哲()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪兰苏:Z

    .line 15
    .line 16
    xor-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世苏哲楪(Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世苏楪哲(Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪兰苏:Z

    .line 27
    .line 28
    move-object v4, p0

    .line 29
    move-object v0, p1

    .line 30
    invoke-static/range {v0 .. v5}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;Z)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public final 飘花落叶言子兰楪哲苏世(I)I
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p1, v1, :cond_b

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-eq p1, v2, :cond_8

    .line 7
    .line 8
    const/16 v2, 0x11

    .line 9
    .line 10
    const/high16 v3, -0x80000000

    .line 11
    .line 12
    if-eq p1, v2, :cond_6

    .line 13
    .line 14
    const/16 v2, 0x21

    .line 15
    .line 16
    if-eq p1, v2, :cond_4

    .line 17
    .line 18
    const/16 v0, 0x42

    .line 19
    .line 20
    if-eq p1, v0, :cond_2

    .line 21
    .line 22
    const/16 v0, 0x82

    .line 23
    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    return v3

    .line 27
    :cond_0
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 28
    .line 29
    if-ne p0, v1, :cond_1

    .line 30
    .line 31
    return v1

    .line 32
    :cond_1
    return v3

    .line 33
    :cond_2
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 34
    .line 35
    if-nez p0, :cond_3

    .line 36
    .line 37
    return v1

    .line 38
    :cond_3
    return v3

    .line 39
    :cond_4
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 40
    .line 41
    if-ne p0, v1, :cond_5

    .line 42
    .line 43
    return v0

    .line 44
    :cond_5
    return v3

    .line 45
    :cond_6
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 46
    .line 47
    if-nez p0, :cond_7

    .line 48
    .line 49
    return v0

    .line 50
    :cond_7
    return v3

    .line 51
    :cond_8
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 52
    .line 53
    if-ne p1, v1, :cond_9

    .line 54
    .line 55
    return v1

    .line 56
    :cond_9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲楪苏世()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_a

    .line 61
    .line 62
    return v0

    .line 63
    :cond_a
    return v1

    .line 64
    :cond_b
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 65
    .line 66
    if-ne p1, v1, :cond_c

    .line 67
    .line 68
    return v0

    .line 69
    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲楪苏世()Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_d

    .line 74
    .line 75
    return v1

    .line 76
    :cond_d
    return v0
.end method

.method public final 飘花落叶言子兰楪苏世哲(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪苏哲()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪兰苏:Z

    .line 15
    .line 16
    xor-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世苏哲楪(Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世苏楪哲(Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪兰苏:Z

    .line 27
    .line 28
    move-object v4, p0

    .line 29
    move-object v0, p1

    .line 30
    invoke-static/range {v0 .. v5}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;Z)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public final 飘花落叶言子兰楪苏哲世(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪苏哲()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪兰苏:Z

    .line 15
    .line 16
    xor-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世苏哲楪(Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世苏楪哲(Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪兰苏:Z

    .line 27
    .line 28
    iget-boolean v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 29
    .line 30
    move-object v4, p0

    .line 31
    move-object v0, p1

    .line 32
    invoke-static/range {v0 .. v6}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;ZZ)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0
.end method

.method public final 飘花落叶言子兰苏世哲楪(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sub-int/2addr v0, p1

    .line 8
    if-lez v0, :cond_1

    .line 9
    .line 10
    neg-int v0, v0

    .line 11
    invoke-virtual {p0, v0, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世苏兰哲(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    neg-int p2, p2

    .line 16
    add-int/2addr p1, p2

    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 20
    .line 21
    invoke-virtual {p3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    sub-int/2addr p3, p1

    .line 26
    if-lez p3, :cond_0

    .line 27
    .line 28
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 29
    .line 30
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏兰世(I)V

    .line 31
    .line 32
    .line 33
    add-int/2addr p3, p2

    .line 34
    return p3

    .line 35
    :cond_0
    return p2

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public 飘花落叶言子兰苏世楪哲(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;ZZ)Landroid/view/View;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪苏哲()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz p4, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    sub-int/2addr v1, v3

    .line 19
    const/4 v4, -0x1

    .line 20
    move v5, v4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v4, v1

    .line 23
    move v1, v2

    .line 24
    move v5, v3

    .line 25
    :goto_0
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 30
    .line 31
    invoke-virtual {v7}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 36
    .line 37
    invoke-virtual {v8}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰()I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    const/4 v9, 0x0

    .line 42
    move-object v10, v9

    .line 43
    move-object v11, v10

    .line 44
    :goto_1
    if-eq v1, v4, :cond_a

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v12

    .line 50
    invoke-static {v12}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 51
    .line 52
    .line 53
    move-result v13

    .line 54
    iget-object v14, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 55
    .line 56
    invoke-virtual {v14, v12}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 57
    .line 58
    .line 59
    move-result v14

    .line 60
    iget-object v15, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 61
    .line 62
    invoke-virtual {v15, v12}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)I

    .line 63
    .line 64
    .line 65
    move-result v15

    .line 66
    if-ltz v13, :cond_9

    .line 67
    .line 68
    if-ge v13, v6, :cond_9

    .line 69
    .line 70
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 71
    .line 72
    .line 73
    move-result-object v13

    .line 74
    check-cast v13, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 75
    .line 76
    iget-object v13, v13, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 77
    .line 78
    invoke-virtual {v13}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 79
    .line 80
    .line 81
    move-result v13

    .line 82
    if-eqz v13, :cond_1

    .line 83
    .line 84
    if-nez v11, :cond_9

    .line 85
    .line 86
    move-object v11, v12

    .line 87
    goto :goto_7

    .line 88
    :cond_1
    if-gt v15, v7, :cond_2

    .line 89
    .line 90
    if-ge v14, v7, :cond_2

    .line 91
    .line 92
    move v13, v3

    .line 93
    goto :goto_2

    .line 94
    :cond_2
    move v13, v2

    .line 95
    :goto_2
    if-lt v14, v8, :cond_3

    .line 96
    .line 97
    if-le v15, v8, :cond_3

    .line 98
    .line 99
    move v14, v3

    .line 100
    goto :goto_3

    .line 101
    :cond_3
    move v14, v2

    .line 102
    :goto_3
    if-nez v13, :cond_5

    .line 103
    .line 104
    if-eqz v14, :cond_4

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_4
    return-object v12

    .line 108
    :cond_5
    :goto_4
    if-eqz p3, :cond_7

    .line 109
    .line 110
    if-eqz v14, :cond_6

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_6
    if-nez v9, :cond_9

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_7
    if-eqz v13, :cond_8

    .line 117
    .line 118
    :goto_5
    move-object v10, v12

    .line 119
    goto :goto_7

    .line 120
    :cond_8
    if-nez v9, :cond_9

    .line 121
    .line 122
    :goto_6
    move-object v9, v12

    .line 123
    :cond_9
    :goto_7
    add-int/2addr v1, v5

    .line 124
    goto :goto_1

    .line 125
    :cond_a
    if-eqz v9, :cond_b

    .line 126
    .line 127
    return-object v9

    .line 128
    :cond_b
    if-eqz v10, :cond_c

    .line 129
    .line 130
    return-object v10

    .line 131
    :cond_c
    return-object v11
.end method

.method public final 飘花落叶言子兰苏哲世楪()Landroid/view/View;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final 飘花落叶言子兰苏哲楪世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sub-int v0, p1, v0

    .line 8
    .line 9
    if-lez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, v0, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世苏兰哲(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    neg-int p2, p2

    .line 16
    add-int/2addr p1, p2

    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 20
    .line 21
    invoke-virtual {p3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    sub-int/2addr p1, p3

    .line 26
    if-lez p1, :cond_0

    .line 27
    .line 28
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 29
    .line 30
    neg-int p3, p1

    .line 31
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏兰世(I)V

    .line 32
    .line 33
    .line 34
    sub-int/2addr p2, p1

    .line 35
    :cond_0
    return p2

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public final 飘花落叶言子兰苏楪世哲(II)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪苏哲()V

    .line 2
    .line 3
    .line 4
    if-le p2, p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    if-ge p2, p1, :cond_3

    .line 8
    .line 9
    :goto_0
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ge v0, v1, :cond_1

    .line 26
    .line 27
    const/16 v0, 0x4104

    .line 28
    .line 29
    const/16 v1, 0x4004

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/16 v0, 0x1041

    .line 33
    .line 34
    const/16 v1, 0x1001

    .line 35
    .line 36
    :goto_1
    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2, v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪世兰哲苏(IIII)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_2
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世苏哲:Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;

    .line 48
    .line 49
    invoke-virtual {p0, p1, p2, v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪世兰哲苏(IIII)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_3
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public final 飘花落叶言子兰苏楪哲世(IIZ)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪苏哲()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x140

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    const/16 p3, 0x6003

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p3, v0

    .line 12
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪世兰哲苏(IIII)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世苏哲:Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;

    .line 24
    .line 25
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪世兰哲苏(IIII)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public 飘花落叶言子哲世兰楪苏(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世苏兰哲(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final 飘花落叶言子哲世兰苏楪(I)V
    .locals 1

    .line 1
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    .line 2
    .line 3
    const/high16 p1, -0x80000000

    .line 4
    .line 5
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏兰楪:I

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲苏兰世:I

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世苏兰楪()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public 飘花落叶言子哲兰世苏楪(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/飘花落叶言子世哲楪苏兰;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲楪苏兰;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput p2, v0, Landroidx/recyclerview/widget/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲兰苏楪世(Landroidx/recyclerview/widget/飘花落叶言子世哲楪苏兰;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final 飘花落叶言子哲兰楪苏世()Z
    .locals 5

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世楪哲兰苏:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x40000000    # 2.0f

    .line 5
    .line 6
    if-eq v0, v2, :cond_1

    .line 7
    .line 8
    iget v0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世楪哲苏兰:I

    .line 9
    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    move v2, v1

    .line 17
    :goto_0
    if-ge v2, v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 28
    .line 29
    if-gez v4, :cond_0

    .line 30
    .line 31
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 32
    .line 33
    if-gez v3, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return v1
.end method

.method public 飘花落叶言子哲兰苏世楪()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲兰楪:Z

    .line 6
    .line 7
    iget-boolean p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪苏兰:Z

    .line 8
    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final 飘花落叶言子哲楪世苏兰()Landroid/os/Parcelable;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲苏兰世:I

    .line 11
    .line 12
    iput v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲苏兰世:I

    .line 13
    .line 14
    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲兰世苏:I

    .line 15
    .line 16
    iput v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲兰世苏:I

    .line 17
    .line 18
    iget-boolean v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲兰苏世:Z

    .line 19
    .line 20
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲兰苏世:Z

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-lez v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪苏哲()V

    .line 35
    .line 36
    .line 37
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲兰楪:Z

    .line 38
    .line 39
    iget-boolean v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 40
    .line 41
    xor-int/2addr v1, v2

    .line 42
    iput-boolean v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲兰苏世:Z

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏哲世楪()Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 51
    .line 52
    invoke-virtual {v2}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    sub-int/2addr v2, p0

    .line 63
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲兰世苏:I

    .line 64
    .line 65
    invoke-static {v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    iput p0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲苏兰世:I

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲楪世苏()Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲苏兰世:I

    .line 81
    .line 82
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 83
    .line 84
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 89
    .line 90
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    sub-int/2addr v1, p0

    .line 95
    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲兰世苏:I

    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_2
    const/4 p0, -0x1

    .line 99
    iput p0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲苏兰世:I

    .line 100
    .line 101
    return-object v0
.end method

.method public 飘花落叶言子哲楪苏世兰(ILandroid/os/Bundle;)Z
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲楪苏世兰(ILandroid/os/Bundle;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const v0, 0x1020037

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-ne p1, v0, :cond_4

    .line 14
    .line 15
    if-eqz p2, :cond_4

    .line 16
    .line 17
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 18
    .line 19
    const/4 v0, -0x1

    .line 20
    if-ne p1, v1, :cond_2

    .line 21
    .line 22
    const-string p1, "android.view.accessibility.action.ARGUMENT_ROW_INT"

    .line 23
    .line 24
    invoke-virtual {p2, p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-gez p1, :cond_1

    .line 29
    .line 30
    return v2

    .line 31
    :cond_1
    iget-object p2, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 32
    .line 33
    iget-object v0, p2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;

    .line 34
    .line 35
    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲世楪:Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;

    .line 36
    .line 37
    invoke-virtual {p0, v0, p2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰哲楪苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    sub-int/2addr p2, v1

    .line 42
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const-string p1, "android.view.accessibility.action.ARGUMENT_COLUMN_INT"

    .line 48
    .line 49
    invoke-virtual {p2, p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-gez p1, :cond_3

    .line 54
    .line 55
    return v2

    .line 56
    :cond_3
    iget-object p2, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 57
    .line 58
    iget-object v0, p2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;

    .line 59
    .line 60
    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰哲世楪:Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;

    .line 61
    .line 62
    invoke-virtual {p0, v0, p2}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏兰哲楪(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    sub-int/2addr p2, v1

    .line 67
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    :goto_0
    if-ltz p1, :cond_4

    .line 72
    .line 73
    invoke-virtual {p0, p1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世哲苏兰(II)V

    .line 74
    .line 75
    .line 76
    return v1

    .line 77
    :cond_4
    return v2
.end method

.method public 飘花落叶言子哲苏楪世兰(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世苏兰哲(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(I)Landroid/graphics/PointF;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    if-ge p1, v1, :cond_1

    .line 20
    .line 21
    move v0, v2

    .line 22
    :cond_1
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 23
    .line 24
    if-eq v0, p1, :cond_2

    .line 25
    .line 26
    const/4 v2, -0x1

    .line 27
    :cond_2
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    new-instance p0, Landroid/graphics/PointF;

    .line 33
    .line 34
    int-to-float v0, v2

    .line 35
    invoke-direct {p0, v0, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_3
    new-instance p0, Landroid/graphics/PointF;

    .line 40
    .line 41
    int-to-float v0, v2

    .line 42
    invoke-direct {p0, p1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 43
    .line 44
    .line 45
    return-object p0
.end method

.method public final 飘花落叶言子楪兰世哲苏(IILandroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move p1, p2

    .line 7
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪苏哲()V

    .line 17
    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    if-lez p1, :cond_2

    .line 21
    .line 22
    move v0, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_2
    const/4 v0, -0x1

    .line 25
    :goto_1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世兰哲苏(IIZLandroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 33
    .line 34
    invoke-virtual {p0, p3, p1, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪世哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;)V

    .line 35
    .line 36
    .line 37
    :cond_3
    :goto_2
    return-void
.end method

.method public 飘花落叶言子楪兰哲世苏(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪苏哲世(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public 飘花落叶言子楪兰哲苏世(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪哲世苏(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子楪兰苏世哲(ILandroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲苏兰世:I

    .line 8
    .line 9
    if-ltz v3, :cond_0

    .line 10
    .line 11
    iget-boolean v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲兰苏世:Z

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世苏哲兰()V

    .line 15
    .line 16
    .line 17
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 18
    .line 19
    iget v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    .line 20
    .line 21
    if-ne v3, v1, :cond_2

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    add-int/lit8 v3, p1, -0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v3, v2

    .line 29
    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_3
    const/4 v1, 0x1

    .line 33
    :goto_1
    move v0, v2

    .line 34
    :goto_2
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世兰楪哲苏:I

    .line 35
    .line 36
    if-ge v0, v4, :cond_4

    .line 37
    .line 38
    if-ltz v3, :cond_4

    .line 39
    .line 40
    if-ge v3, p1, :cond_4

    .line 41
    .line 42
    invoke-virtual {p2, v3, v2}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(II)V

    .line 43
    .line 44
    .line 45
    add-int/2addr v3, v1

    .line 46
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_4
    return-void
.end method

.method public final 飘花落叶言子楪兰苏哲世(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪苏世哲(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final 飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪哲兰世苏()Z
    .locals 1

    .line 1
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final 飘花落叶言子楪哲苏兰世()Z
    .locals 0

    .line 1
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final 飘花落叶言子苏世兰哲楪(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子苏世兰哲楪(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世哲楪苏()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世哲苏楪()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public 飘花落叶言子苏世兰楪哲(Landroid/view/View;ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世苏哲兰()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪哲苏世(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/high16 p2, -0x80000000

    .line 16
    .line 17
    if-ne p1, p2, :cond_1

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪苏哲()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰哲世()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    int-to-float v0, v0

    .line 30
    const v1, 0x3eaaaaab

    .line 31
    .line 32
    .line 33
    mul-float/2addr v0, v1

    .line 34
    float-to-int v0, v0

    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-virtual {p0, p1, v0, v1, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世兰哲苏(IIZLandroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 40
    .line 41
    iput p2, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:I

    .line 42
    .line 43
    iput-boolean v1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Z

    .line 44
    .line 45
    const/4 p2, 0x1

    .line 46
    invoke-virtual {p0, p3, v0, p4, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I

    .line 47
    .line 48
    .line 49
    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 50
    .line 51
    const/4 p4, -0x1

    .line 52
    if-ne p1, p4, :cond_3

    .line 53
    .line 54
    if-eqz p3, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    sub-int/2addr p3, p2

    .line 61
    invoke-virtual {p0, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏楪世哲(II)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    invoke-virtual {p0, v1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏楪世哲(II)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    if-eqz p3, :cond_4

    .line 76
    .line 77
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    invoke-virtual {p0, v1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏楪世哲(II)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    goto :goto_0

    .line 86
    :cond_4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    sub-int/2addr p3, p2

    .line 91
    invoke-virtual {p0, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏楪世哲(II)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    :goto_0
    if-ne p1, p4, :cond_5

    .line 96
    .line 97
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲楪世苏()Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    goto :goto_1

    .line 102
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏哲世楪()Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->hasFocusable()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_7

    .line 111
    .line 112
    if-nez p2, :cond_6

    .line 113
    .line 114
    :goto_2
    const/4 p0, 0x0

    .line 115
    :cond_6
    return-object p0

    .line 116
    :cond_7
    return-object p2
.end method

.method public 飘花落叶言子苏世哲兰楪(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    return-void
.end method

.method public 飘花落叶言子苏兰世哲楪(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 8
    .line 9
    const/4 v4, -0x1

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    .line 13
    .line 14
    if-eq v3, v4, :cond_1

    .line 15
    .line 16
    :cond_0
    invoke-virtual {v2}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲楪兰苏世(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 27
    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲苏兰世:I

    .line 31
    .line 32
    if-ltz v3, :cond_2

    .line 33
    .line 34
    iput v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    .line 35
    .line 36
    :cond_2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪苏哲()V

    .line 37
    .line 38
    .line 39
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    iput-boolean v5, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Z

    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世苏哲兰()V

    .line 45
    .line 46
    .line 47
    iget-object v3, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 48
    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    iget-object v7, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;

    .line 59
    .line 60
    iget-object v7, v7, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v7, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_5

    .line 69
    .line 70
    :cond_4
    :goto_0
    const/4 v3, 0x0

    .line 71
    :cond_5
    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰苏楪:Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;

    .line 72
    .line 73
    iget-boolean v8, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Z

    .line 74
    .line 75
    const/high16 v9, -0x80000000

    .line 76
    .line 77
    const/4 v10, 0x1

    .line 78
    if-eqz v8, :cond_8

    .line 79
    .line 80
    iget v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    .line 81
    .line 82
    if-ne v8, v4, :cond_8

    .line 83
    .line 84
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 85
    .line 86
    if-eqz v8, :cond_6

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_6
    if-eqz v3, :cond_27

    .line 90
    .line 91
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 92
    .line 93
    invoke-virtual {v8, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 98
    .line 99
    invoke-virtual {v11}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰()I

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    if-ge v8, v11, :cond_7

    .line 104
    .line 105
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 106
    .line 107
    invoke-virtual {v8, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)I

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 112
    .line 113
    invoke-virtual {v11}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    if-gt v8, v11, :cond_27

    .line 118
    .line 119
    :cond_7
    invoke-static {v3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    invoke-virtual {v7, v3, v8}, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Landroid/view/View;I)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_e

    .line 127
    .line 128
    :cond_8
    :goto_1
    invoke-virtual {v7}, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 129
    .line 130
    .line 131
    iget-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 132
    .line 133
    iget-boolean v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪苏兰:Z

    .line 134
    .line 135
    xor-int/2addr v3, v8

    .line 136
    iput-boolean v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Z

    .line 137
    .line 138
    iget-boolean v3, v2, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 139
    .line 140
    if-nez v3, :cond_18

    .line 141
    .line 142
    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    .line 143
    .line 144
    if-ne v3, v4, :cond_9

    .line 145
    .line 146
    goto/16 :goto_6

    .line 147
    .line 148
    :cond_9
    if-ltz v3, :cond_17

    .line 149
    .line 150
    invoke-virtual {v2}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    if-lt v3, v8, :cond_a

    .line 155
    .line 156
    goto/16 :goto_5

    .line 157
    .line 158
    :cond_a
    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    .line 159
    .line 160
    iput v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 161
    .line 162
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 163
    .line 164
    if-eqz v8, :cond_c

    .line 165
    .line 166
    iget v11, v8, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲苏兰世:I

    .line 167
    .line 168
    if-ltz v11, :cond_c

    .line 169
    .line 170
    iget-boolean v3, v8, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲兰苏世:Z

    .line 171
    .line 172
    iput-boolean v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Z

    .line 173
    .line 174
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 175
    .line 176
    if-eqz v3, :cond_b

    .line 177
    .line 178
    invoke-virtual {v8}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰()I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 183
    .line 184
    iget v8, v8, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲兰世苏:I

    .line 185
    .line 186
    sub-int/2addr v3, v8

    .line 187
    iput v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 188
    .line 189
    goto/16 :goto_d

    .line 190
    .line 191
    :cond_b
    invoke-virtual {v8}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 196
    .line 197
    iget v8, v8, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲兰世苏:I

    .line 198
    .line 199
    add-int/2addr v3, v8

    .line 200
    iput v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 201
    .line 202
    goto/16 :goto_d

    .line 203
    .line 204
    :cond_c
    iget v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏兰楪:I

    .line 205
    .line 206
    if-ne v8, v9, :cond_15

    .line 207
    .line 208
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世楪兰苏哲(I)Landroid/view/View;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    if-eqz v3, :cond_11

    .line 213
    .line 214
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 215
    .line 216
    invoke-virtual {v8, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(Landroid/view/View;)I

    .line 217
    .line 218
    .line 219
    move-result v8

    .line 220
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 221
    .line 222
    invoke-virtual {v11}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰哲世()I

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    if-le v8, v11, :cond_d

    .line 227
    .line 228
    invoke-virtual {v7}, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰()V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_d

    .line 232
    .line 233
    :cond_d
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 234
    .line 235
    invoke-virtual {v8, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 240
    .line 241
    invoke-virtual {v11}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 242
    .line 243
    .line 244
    move-result v11

    .line 245
    sub-int/2addr v8, v11

    .line 246
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 247
    .line 248
    if-gez v8, :cond_e

    .line 249
    .line 250
    invoke-virtual {v11}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    iput v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 255
    .line 256
    iput-boolean v5, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Z

    .line 257
    .line 258
    goto/16 :goto_d

    .line 259
    .line 260
    :cond_e
    invoke-virtual {v11}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰()I

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 265
    .line 266
    invoke-virtual {v11, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)I

    .line 267
    .line 268
    .line 269
    move-result v11

    .line 270
    sub-int/2addr v8, v11

    .line 271
    if-gez v8, :cond_f

    .line 272
    .line 273
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 274
    .line 275
    invoke-virtual {v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰()I

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    iput v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 280
    .line 281
    iput-boolean v10, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Z

    .line 282
    .line 283
    goto/16 :goto_d

    .line 284
    .line 285
    :cond_f
    iget-boolean v8, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Z

    .line 286
    .line 287
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 288
    .line 289
    if-eqz v8, :cond_10

    .line 290
    .line 291
    invoke-virtual {v11, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)I

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 296
    .line 297
    invoke-virtual {v8}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世苏兰()I

    .line 298
    .line 299
    .line 300
    move-result v8

    .line 301
    add-int/2addr v8, v3

    .line 302
    goto :goto_2

    .line 303
    :cond_10
    invoke-virtual {v11, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 304
    .line 305
    .line 306
    move-result v8

    .line 307
    :goto_2
    iput v8, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 308
    .line 309
    goto/16 :goto_d

    .line 310
    .line 311
    :cond_11
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    if-lez v3, :cond_14

    .line 316
    .line 317
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-static {v3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    iget v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    .line 326
    .line 327
    if-ge v8, v3, :cond_12

    .line 328
    .line 329
    move v3, v10

    .line 330
    goto :goto_3

    .line 331
    :cond_12
    move v3, v5

    .line 332
    :goto_3
    iget-boolean v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 333
    .line 334
    if-ne v3, v8, :cond_13

    .line 335
    .line 336
    move v3, v10

    .line 337
    goto :goto_4

    .line 338
    :cond_13
    move v3, v5

    .line 339
    :goto_4
    iput-boolean v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Z

    .line 340
    .line 341
    :cond_14
    invoke-virtual {v7}, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰()V

    .line 342
    .line 343
    .line 344
    goto/16 :goto_d

    .line 345
    .line 346
    :cond_15
    iget-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 347
    .line 348
    iput-boolean v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Z

    .line 349
    .line 350
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 351
    .line 352
    if-eqz v3, :cond_16

    .line 353
    .line 354
    invoke-virtual {v8}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰()I

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    iget v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏兰楪:I

    .line 359
    .line 360
    sub-int/2addr v3, v8

    .line 361
    iput v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 362
    .line 363
    goto/16 :goto_d

    .line 364
    .line 365
    :cond_16
    invoke-virtual {v8}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    iget v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏兰楪:I

    .line 370
    .line 371
    add-int/2addr v3, v8

    .line 372
    iput v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 373
    .line 374
    goto/16 :goto_d

    .line 375
    .line 376
    :cond_17
    :goto_5
    iput v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    .line 377
    .line 378
    iput v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏兰楪:I

    .line 379
    .line 380
    :cond_18
    :goto_6
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    if-nez v3, :cond_19

    .line 385
    .line 386
    goto/16 :goto_b

    .line 387
    .line 388
    :cond_19
    iget-object v3, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 389
    .line 390
    if-nez v3, :cond_1a

    .line 391
    .line 392
    goto :goto_7

    .line 393
    :cond_1a
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    if-eqz v3, :cond_1b

    .line 398
    .line 399
    iget-object v8, v0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;

    .line 400
    .line 401
    iget-object v8, v8, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v8, Ljava/util/ArrayList;

    .line 404
    .line 405
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v8

    .line 409
    if-eqz v8, :cond_1c

    .line 410
    .line 411
    :cond_1b
    :goto_7
    const/4 v3, 0x0

    .line 412
    :cond_1c
    if-eqz v3, :cond_1d

    .line 413
    .line 414
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 415
    .line 416
    .line 417
    move-result-object v8

    .line 418
    check-cast v8, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 419
    .line 420
    iget-object v11, v8, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 421
    .line 422
    invoke-virtual {v11}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 423
    .line 424
    .line 425
    move-result v11

    .line 426
    if-nez v11, :cond_1d

    .line 427
    .line 428
    iget-object v11, v8, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 429
    .line 430
    invoke-virtual {v11}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getLayoutPosition()I

    .line 431
    .line 432
    .line 433
    move-result v11

    .line 434
    if-ltz v11, :cond_1d

    .line 435
    .line 436
    iget-object v8, v8, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 437
    .line 438
    invoke-virtual {v8}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getLayoutPosition()I

    .line 439
    .line 440
    .line 441
    move-result v8

    .line 442
    invoke-virtual {v2}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 443
    .line 444
    .line 445
    move-result v11

    .line 446
    if-ge v8, v11, :cond_1d

    .line 447
    .line 448
    invoke-static {v3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 449
    .line 450
    .line 451
    move-result v8

    .line 452
    invoke-virtual {v7, v3, v8}, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Landroid/view/View;I)V

    .line 453
    .line 454
    .line 455
    goto/16 :goto_d

    .line 456
    .line 457
    :cond_1d
    iget-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲兰楪:Z

    .line 458
    .line 459
    iget-boolean v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪苏兰:Z

    .line 460
    .line 461
    if-eq v3, v8, :cond_1e

    .line 462
    .line 463
    goto/16 :goto_b

    .line 464
    .line 465
    :cond_1e
    iget-boolean v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Z

    .line 466
    .line 467
    invoke-virtual {v0, v1, v2, v3, v8}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏世楪哲(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;ZZ)Landroid/view/View;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    if-eqz v3, :cond_24

    .line 472
    .line 473
    invoke-static {v3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 474
    .line 475
    .line 476
    move-result v8

    .line 477
    iget-boolean v11, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Z

    .line 478
    .line 479
    iget-object v12, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 480
    .line 481
    if-eqz v11, :cond_1f

    .line 482
    .line 483
    invoke-virtual {v12, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)I

    .line 484
    .line 485
    .line 486
    move-result v11

    .line 487
    iget-object v12, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 488
    .line 489
    invoke-virtual {v12}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世苏兰()I

    .line 490
    .line 491
    .line 492
    move-result v12

    .line 493
    add-int/2addr v12, v11

    .line 494
    iput v12, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 495
    .line 496
    goto :goto_8

    .line 497
    :cond_1f
    invoke-virtual {v12, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 498
    .line 499
    .line 500
    move-result v11

    .line 501
    iput v11, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 502
    .line 503
    :goto_8
    iput v8, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 504
    .line 505
    iget-boolean v8, v2, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 506
    .line 507
    if-nez v8, :cond_26

    .line 508
    .line 509
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子哲兰苏世楪()Z

    .line 510
    .line 511
    .line 512
    move-result v8

    .line 513
    if-eqz v8, :cond_26

    .line 514
    .line 515
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 516
    .line 517
    invoke-virtual {v8, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 518
    .line 519
    .line 520
    move-result v8

    .line 521
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 522
    .line 523
    invoke-virtual {v11, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)I

    .line 524
    .line 525
    .line 526
    move-result v3

    .line 527
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 528
    .line 529
    invoke-virtual {v11}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 530
    .line 531
    .line 532
    move-result v11

    .line 533
    iget-object v12, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 534
    .line 535
    invoke-virtual {v12}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰()I

    .line 536
    .line 537
    .line 538
    move-result v12

    .line 539
    if-gt v3, v11, :cond_20

    .line 540
    .line 541
    if-ge v8, v11, :cond_20

    .line 542
    .line 543
    move v13, v10

    .line 544
    goto :goto_9

    .line 545
    :cond_20
    move v13, v5

    .line 546
    :goto_9
    if-lt v8, v12, :cond_21

    .line 547
    .line 548
    if-le v3, v12, :cond_21

    .line 549
    .line 550
    move v3, v10

    .line 551
    goto :goto_a

    .line 552
    :cond_21
    move v3, v5

    .line 553
    :goto_a
    if-nez v13, :cond_22

    .line 554
    .line 555
    if-eqz v3, :cond_26

    .line 556
    .line 557
    :cond_22
    iget-boolean v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Z

    .line 558
    .line 559
    if-eqz v3, :cond_23

    .line 560
    .line 561
    move v11, v12

    .line 562
    :cond_23
    iput v11, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 563
    .line 564
    goto :goto_d

    .line 565
    :cond_24
    :goto_b
    invoke-virtual {v7}, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰()V

    .line 566
    .line 567
    .line 568
    iget-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪苏兰:Z

    .line 569
    .line 570
    if-eqz v3, :cond_25

    .line 571
    .line 572
    invoke-virtual {v2}, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()I

    .line 573
    .line 574
    .line 575
    move-result v3

    .line 576
    sub-int/2addr v3, v10

    .line 577
    goto :goto_c

    .line 578
    :cond_25
    move v3, v5

    .line 579
    :goto_c
    iput v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 580
    .line 581
    :cond_26
    :goto_d
    iput-boolean v10, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Z

    .line 582
    .line 583
    :cond_27
    :goto_e
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 584
    .line 585
    iget v8, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世:I

    .line 586
    .line 587
    if-ltz v8, :cond_28

    .line 588
    .line 589
    move v8, v10

    .line 590
    goto :goto_f

    .line 591
    :cond_28
    move v8, v4

    .line 592
    :goto_f
    iput v8, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:I

    .line 593
    .line 594
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世兰苏楪哲:[I

    .line 595
    .line 596
    aput v5, v3, v5

    .line 597
    .line 598
    aput v5, v3, v10

    .line 599
    .line 600
    invoke-virtual {v0, v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪世苏哲(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;[I)V

    .line 601
    .line 602
    .line 603
    aget v8, v3, v5

    .line 604
    .line 605
    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    .line 606
    .line 607
    .line 608
    move-result v8

    .line 609
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 610
    .line 611
    invoke-virtual {v11}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 612
    .line 613
    .line 614
    move-result v11

    .line 615
    add-int/2addr v11, v8

    .line 616
    aget v3, v3, v10

    .line 617
    .line 618
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    .line 619
    .line 620
    .line 621
    move-result v3

    .line 622
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 623
    .line 624
    invoke-virtual {v8}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世兰哲()I

    .line 625
    .line 626
    .line 627
    move-result v8

    .line 628
    add-int/2addr v8, v3

    .line 629
    iget-boolean v3, v2, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 630
    .line 631
    if-eqz v3, :cond_2b

    .line 632
    .line 633
    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    .line 634
    .line 635
    if-eq v3, v4, :cond_2b

    .line 636
    .line 637
    iget v12, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏兰楪:I

    .line 638
    .line 639
    if-eq v12, v9, :cond_2b

    .line 640
    .line 641
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世楪兰苏哲(I)Landroid/view/View;

    .line 642
    .line 643
    .line 644
    move-result-object v3

    .line 645
    if-eqz v3, :cond_2b

    .line 646
    .line 647
    iget-boolean v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 648
    .line 649
    iget-object v12, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 650
    .line 651
    if-eqz v9, :cond_29

    .line 652
    .line 653
    invoke-virtual {v12}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰()I

    .line 654
    .line 655
    .line 656
    move-result v9

    .line 657
    iget-object v12, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 658
    .line 659
    invoke-virtual {v12, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)I

    .line 660
    .line 661
    .line 662
    move-result v3

    .line 663
    sub-int/2addr v9, v3

    .line 664
    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏兰楪:I

    .line 665
    .line 666
    :goto_10
    sub-int/2addr v9, v3

    .line 667
    goto :goto_11

    .line 668
    :cond_29
    invoke-virtual {v12, v3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 669
    .line 670
    .line 671
    move-result v3

    .line 672
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 673
    .line 674
    invoke-virtual {v9}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 675
    .line 676
    .line 677
    move-result v9

    .line 678
    sub-int/2addr v3, v9

    .line 679
    iget v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏兰楪:I

    .line 680
    .line 681
    goto :goto_10

    .line 682
    :goto_11
    if-lez v9, :cond_2a

    .line 683
    .line 684
    add-int/2addr v11, v9

    .line 685
    goto :goto_12

    .line 686
    :cond_2a
    sub-int/2addr v8, v9

    .line 687
    :cond_2b
    :goto_12
    iget-boolean v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Z

    .line 688
    .line 689
    iget-boolean v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 690
    .line 691
    if-eqz v3, :cond_2d

    .line 692
    .line 693
    if-eqz v9, :cond_2e

    .line 694
    .line 695
    :cond_2c
    move v4, v10

    .line 696
    goto :goto_13

    .line 697
    :cond_2d
    if-eqz v9, :cond_2c

    .line 698
    .line 699
    :cond_2e
    :goto_13
    invoke-virtual {v0, v1, v2, v7, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲世苏楪(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世楪哲兰苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;)V

    .line 703
    .line 704
    .line 705
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 706
    .line 707
    iget-object v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 708
    .line 709
    invoke-virtual {v4}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲世兰()I

    .line 710
    .line 711
    .line 712
    move-result v4

    .line 713
    if-nez v4, :cond_2f

    .line 714
    .line 715
    iget-object v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 716
    .line 717
    invoke-virtual {v4}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰哲苏()I

    .line 718
    .line 719
    .line 720
    move-result v4

    .line 721
    if-nez v4, :cond_2f

    .line 722
    .line 723
    move v4, v10

    .line 724
    goto :goto_14

    .line 725
    :cond_2f
    move v4, v5

    .line 726
    :goto_14
    iput-boolean v4, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰哲世:Z

    .line 727
    .line 728
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 729
    .line 730
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 734
    .line 735
    iput v5, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:I

    .line 736
    .line 737
    iget-boolean v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Z

    .line 738
    .line 739
    iget v4, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 740
    .line 741
    if-eqz v3, :cond_31

    .line 742
    .line 743
    iget v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 744
    .line 745
    invoke-virtual {v0, v4, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子苏世兰哲(II)V

    .line 746
    .line 747
    .line 748
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 749
    .line 750
    iput v11, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 751
    .line 752
    invoke-virtual {v0, v1, v3, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I

    .line 753
    .line 754
    .line 755
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 756
    .line 757
    iget v4, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 758
    .line 759
    iget v9, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 760
    .line 761
    iget v3, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 762
    .line 763
    if-lez v3, :cond_30

    .line 764
    .line 765
    add-int/2addr v8, v3

    .line 766
    :cond_30
    iget v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 767
    .line 768
    iget v11, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 769
    .line 770
    invoke-virtual {v0, v3, v11}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子苏世哲兰(II)V

    .line 771
    .line 772
    .line 773
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 774
    .line 775
    iput v8, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 776
    .line 777
    iget v8, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 778
    .line 779
    iget v11, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 780
    .line 781
    add-int/2addr v8, v11

    .line 782
    iput v8, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 783
    .line 784
    invoke-virtual {v0, v1, v3, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I

    .line 785
    .line 786
    .line 787
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 788
    .line 789
    iget v8, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 790
    .line 791
    iget v3, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 792
    .line 793
    if-lez v3, :cond_34

    .line 794
    .line 795
    invoke-virtual {v0, v9, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子苏世兰哲(II)V

    .line 796
    .line 797
    .line 798
    iget-object v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 799
    .line 800
    iput v3, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 801
    .line 802
    invoke-virtual {v0, v1, v4, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I

    .line 803
    .line 804
    .line 805
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 806
    .line 807
    iget v4, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 808
    .line 809
    goto :goto_15

    .line 810
    :cond_31
    iget v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 811
    .line 812
    invoke-virtual {v0, v4, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子苏世哲兰(II)V

    .line 813
    .line 814
    .line 815
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 816
    .line 817
    iput v8, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 818
    .line 819
    invoke-virtual {v0, v1, v3, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I

    .line 820
    .line 821
    .line 822
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 823
    .line 824
    iget v8, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 825
    .line 826
    iget v4, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 827
    .line 828
    iget v3, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 829
    .line 830
    if-lez v3, :cond_32

    .line 831
    .line 832
    add-int/2addr v11, v3

    .line 833
    :cond_32
    iget v3, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 834
    .line 835
    iget v9, v7, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 836
    .line 837
    invoke-virtual {v0, v3, v9}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子苏世兰哲(II)V

    .line 838
    .line 839
    .line 840
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 841
    .line 842
    iput v11, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 843
    .line 844
    iget v9, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 845
    .line 846
    iget v11, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 847
    .line 848
    add-int/2addr v9, v11

    .line 849
    iput v9, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 850
    .line 851
    invoke-virtual {v0, v1, v3, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I

    .line 852
    .line 853
    .line 854
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 855
    .line 856
    iget v9, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 857
    .line 858
    iget v3, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 859
    .line 860
    if-lez v3, :cond_33

    .line 861
    .line 862
    invoke-virtual {v0, v4, v8}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子苏世哲兰(II)V

    .line 863
    .line 864
    .line 865
    iget-object v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 866
    .line 867
    iput v3, v4, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 868
    .line 869
    invoke-virtual {v0, v1, v4, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I

    .line 870
    .line 871
    .line 872
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 873
    .line 874
    iget v8, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 875
    .line 876
    :cond_33
    move v4, v9

    .line 877
    :cond_34
    :goto_15
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 878
    .line 879
    .line 880
    move-result v3

    .line 881
    if-lez v3, :cond_36

    .line 882
    .line 883
    iget-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 884
    .line 885
    iget-boolean v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪苏兰:Z

    .line 886
    .line 887
    xor-int/2addr v3, v9

    .line 888
    if-eqz v3, :cond_35

    .line 889
    .line 890
    invoke-virtual {v0, v8, v1, v2, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏世哲楪(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I

    .line 891
    .line 892
    .line 893
    move-result v3

    .line 894
    add-int/2addr v4, v3

    .line 895
    add-int/2addr v8, v3

    .line 896
    invoke-virtual {v0, v4, v1, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏哲楪世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I

    .line 897
    .line 898
    .line 899
    move-result v3

    .line 900
    :goto_16
    add-int/2addr v4, v3

    .line 901
    add-int/2addr v8, v3

    .line 902
    goto :goto_17

    .line 903
    :cond_35
    invoke-virtual {v0, v4, v1, v2, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏哲楪世(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I

    .line 904
    .line 905
    .line 906
    move-result v3

    .line 907
    add-int/2addr v4, v3

    .line 908
    add-int/2addr v8, v3

    .line 909
    invoke-virtual {v0, v8, v1, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏世哲楪(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I

    .line 910
    .line 911
    .line 912
    move-result v3

    .line 913
    goto :goto_16

    .line 914
    :cond_36
    :goto_17
    iget-boolean v3, v2, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏兰世哲:Z

    .line 915
    .line 916
    if-eqz v3, :cond_3e

    .line 917
    .line 918
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 919
    .line 920
    .line 921
    move-result v3

    .line 922
    if-eqz v3, :cond_3e

    .line 923
    .line 924
    iget-boolean v3, v2, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 925
    .line 926
    if-nez v3, :cond_3e

    .line 927
    .line 928
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子哲兰苏世楪()Z

    .line 929
    .line 930
    .line 931
    move-result v3

    .line 932
    if-nez v3, :cond_37

    .line 933
    .line 934
    goto/16 :goto_1d

    .line 935
    .line 936
    :cond_37
    iget-object v3, v1, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 937
    .line 938
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 939
    .line 940
    .line 941
    move-result v9

    .line 942
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲楪兰(I)Landroid/view/View;

    .line 943
    .line 944
    .line 945
    move-result-object v11

    .line 946
    invoke-static {v11}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 947
    .line 948
    .line 949
    move-result v11

    .line 950
    move v12, v5

    .line 951
    move v13, v12

    .line 952
    move v14, v13

    .line 953
    :goto_18
    if-ge v12, v9, :cond_3b

    .line 954
    .line 955
    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 956
    .line 957
    .line 958
    move-result-object v15

    .line 959
    check-cast v15, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 960
    .line 961
    invoke-virtual {v15}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isRemoved()Z

    .line 962
    .line 963
    .line 964
    move-result v16

    .line 965
    if-eqz v16, :cond_38

    .line 966
    .line 967
    goto :goto_1a

    .line 968
    :cond_38
    invoke-virtual {v15}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getLayoutPosition()I

    .line 969
    .line 970
    .line 971
    move-result v10

    .line 972
    if-ge v10, v11, :cond_39

    .line 973
    .line 974
    const/4 v10, 0x1

    .line 975
    goto :goto_19

    .line 976
    :cond_39
    move v10, v5

    .line 977
    :goto_19
    iget-boolean v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 978
    .line 979
    iget-object v5, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 980
    .line 981
    iget-object v15, v15, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 982
    .line 983
    if-eq v10, v6, :cond_3a

    .line 984
    .line 985
    invoke-virtual {v5, v15}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(Landroid/view/View;)I

    .line 986
    .line 987
    .line 988
    move-result v5

    .line 989
    add-int/2addr v13, v5

    .line 990
    goto :goto_1a

    .line 991
    :cond_3a
    invoke-virtual {v5, v15}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(Landroid/view/View;)I

    .line 992
    .line 993
    .line 994
    move-result v5

    .line 995
    add-int/2addr v14, v5

    .line 996
    :goto_1a
    add-int/lit8 v12, v12, 0x1

    .line 997
    .line 998
    const/4 v5, 0x0

    .line 999
    const/4 v10, 0x1

    .line 1000
    goto :goto_18

    .line 1001
    :cond_3b
    iget-object v5, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 1002
    .line 1003
    iput-object v3, v5, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:Ljava/util/List;

    .line 1004
    .line 1005
    if-lez v13, :cond_3c

    .line 1006
    .line 1007
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲楪世苏()Landroid/view/View;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v3

    .line 1011
    invoke-static {v3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 1012
    .line 1013
    .line 1014
    move-result v3

    .line 1015
    invoke-virtual {v0, v3, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子苏世兰哲(II)V

    .line 1016
    .line 1017
    .line 1018
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 1019
    .line 1020
    iput v13, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 1021
    .line 1022
    const/4 v4, 0x0

    .line 1023
    iput v4, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 1024
    .line 1025
    const/4 v5, 0x0

    .line 1026
    invoke-virtual {v3, v5}, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰(Landroid/view/View;)V

    .line 1027
    .line 1028
    .line 1029
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 1030
    .line 1031
    invoke-virtual {v0, v1, v3, v2, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I

    .line 1032
    .line 1033
    .line 1034
    goto :goto_1b

    .line 1035
    :cond_3c
    const/4 v4, 0x0

    .line 1036
    :goto_1b
    if-lez v14, :cond_3d

    .line 1037
    .line 1038
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏哲世楪()Landroid/view/View;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v3

    .line 1042
    invoke-static {v3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 1043
    .line 1044
    .line 1045
    move-result v3

    .line 1046
    invoke-virtual {v0, v3, v8}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子苏世哲兰(II)V

    .line 1047
    .line 1048
    .line 1049
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 1050
    .line 1051
    iput v14, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 1052
    .line 1053
    iput v4, v3, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 1054
    .line 1055
    const/4 v5, 0x0

    .line 1056
    invoke-virtual {v3, v5}, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰(Landroid/view/View;)V

    .line 1057
    .line 1058
    .line 1059
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 1060
    .line 1061
    invoke-virtual {v0, v1, v3, v2, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I

    .line 1062
    .line 1063
    .line 1064
    goto :goto_1c

    .line 1065
    :cond_3d
    const/4 v5, 0x0

    .line 1066
    :goto_1c
    iget-object v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 1067
    .line 1068
    iput-object v5, v1, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:Ljava/util/List;

    .line 1069
    .line 1070
    :cond_3e
    :goto_1d
    iget-boolean v1, v2, Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏世哲兰:Z

    .line 1071
    .line 1072
    if-nez v1, :cond_3f

    .line 1073
    .line 1074
    iget-object v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 1075
    .line 1076
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰哲世()I

    .line 1077
    .line 1078
    .line 1079
    move-result v2

    .line 1080
    iput v2, v1, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:I

    .line 1081
    .line 1082
    goto :goto_1e

    .line 1083
    :cond_3f
    invoke-virtual {v7}, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 1084
    .line 1085
    .line 1086
    :goto_1e
    iget-boolean v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪苏兰:Z

    .line 1087
    .line 1088
    iput-boolean v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲兰楪:Z

    .line 1089
    .line 1090
    return-void
.end method

.method public final 飘花落叶言子苏兰哲世楪(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 8
    .line 9
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    iput v1, p1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲苏兰世:I

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世苏兰楪()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public 飘花落叶言子苏兰哲楪世(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    .line 6
    .line 7
    const/high16 p1, -0x80000000

    .line 8
    .line 9
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏兰楪:I

    .line 10
    .line 11
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰苏楪:Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public 飘花落叶言子苏哲楪世兰(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子苏哲楪世兰(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世楪哲兰苏:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-lez p0, :cond_0

    .line 15
    .line 16
    sget-object p0, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世:L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世哲苏兰;

    .line 17
    .line 18
    invoke-virtual {p3, p0}, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世哲苏兰;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子苏楪世兰哲()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰楪哲:Z

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子苏楪世哲兰()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言楪子世兰哲苏(IIZLandroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲世兰()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰哲苏()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    move v1, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v2

    .line 24
    :goto_0
    iput-boolean v1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰哲世:Z

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 27
    .line 28
    iput p1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:I

    .line 29
    .line 30
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世兰苏楪哲:[I

    .line 31
    .line 32
    aput v2, v0, v2

    .line 33
    .line 34
    aput v2, v0, v3

    .line 35
    .line 36
    invoke-virtual {p0, p4, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰楪世苏哲(Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;[I)V

    .line 37
    .line 38
    .line 39
    aget p4, v0, v2

    .line 40
    .line 41
    invoke-static {v2, p4}, Ljava/lang/Math;->max(II)I

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    aget v0, v0, v3

    .line 46
    .line 47
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-ne p1, v3, :cond_1

    .line 52
    .line 53
    move v2, v3

    .line 54
    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    move v1, v0

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v1, p4

    .line 61
    :goto_1
    iput v1, p1, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 62
    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move p4, v0

    .line 67
    :goto_2
    iput p4, p1, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:I

    .line 68
    .line 69
    const/4 p4, -0x1

    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世兰哲()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    add-int/2addr v0, v1

    .line 79
    iput v0, p1, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰苏哲世楪()Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 86
    .line 87
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 88
    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    move v3, p4

    .line 92
    :cond_4
    iput v3, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 93
    .line 94
    invoke-static {p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 95
    .line 96
    .line 97
    move-result p4

    .line 98
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 99
    .line 100
    iget v2, v1, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 101
    .line 102
    add-int/2addr p4, v2

    .line 103
    iput p4, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 104
    .line 105
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 106
    .line 107
    invoke-virtual {p4, p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)I

    .line 108
    .line 109
    .line 110
    move-result p4

    .line 111
    iput p4, v1, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 112
    .line 113
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 114
    .line 115
    invoke-virtual {p4, p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 120
    .line 121
    invoke-virtual {p4}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰()I

    .line 122
    .line 123
    .line 124
    move-result p4

    .line 125
    sub-int/2addr p1, p4

    .line 126
    goto :goto_4

    .line 127
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲楪世苏()Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 132
    .line 133
    iget v1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 134
    .line 135
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 136
    .line 137
    invoke-virtual {v2}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    add-int/2addr v2, v1

    .line 142
    iput v2, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:I

    .line 143
    .line 144
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 145
    .line 146
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 147
    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_6
    move v3, p4

    .line 152
    :goto_3
    iput v3, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 153
    .line 154
    invoke-static {p1}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世兰苏楪哲(Landroid/view/View;)I

    .line 155
    .line 156
    .line 157
    move-result p4

    .line 158
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 159
    .line 160
    iget v2, v1, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 161
    .line 162
    add-int/2addr p4, v2

    .line 163
    iput p4, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 164
    .line 165
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 166
    .line 167
    invoke-virtual {p4, p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 168
    .line 169
    .line 170
    move-result p4

    .line 171
    iput p4, v1, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 172
    .line 173
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 174
    .line 175
    invoke-virtual {p4, p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    neg-int p1, p1

    .line 180
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 181
    .line 182
    invoke-virtual {p4}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 183
    .line 184
    .line 185
    move-result p4

    .line 186
    add-int/2addr p1, p4

    .line 187
    :goto_4
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 188
    .line 189
    iput p2, p0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 190
    .line 191
    if-eqz p3, :cond_7

    .line 192
    .line 193
    sub-int/2addr p2, p1

    .line 194
    iput p2, p0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 195
    .line 196
    :cond_7
    iput p1, p0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:I

    .line 197
    .line 198
    return-void
.end method

.method public 飘花落叶言楪子世兰苏哲(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪苏兰:Z

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲楪苏兰:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世苏兰楪()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final 飘花落叶言楪子世哲兰苏(I)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string p0, "invalid orientation:"

    .line 8
    .line 9
    invoke-static {p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 22
    .line 23
    if-ne p1, v0, :cond_3

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    return-void

    .line 31
    :cond_3
    :goto_1
    invoke-static {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;I)Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 36
    .line 37
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰苏楪:Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;

    .line 38
    .line 39
    iput-object v0, v1, Landroidx/recyclerview/widget/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 40
    .line 41
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世苏兰楪()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final 飘花落叶言楪子世哲苏兰(II)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏楪兰:I

    .line 2
    .line 3
    iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲苏兰楪:I

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世哲兰楪苏:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p2, -0x1

    .line 10
    iput p2, p1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->飘花落叶言子楪哲苏兰世:I

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世苏兰楪()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final 飘花落叶言楪子世苏兰哲(ILandroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子世苏哲兰楪()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪苏哲()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    iput-boolean v2, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Z

    .line 18
    .line 19
    if-lez p1, :cond_1

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, -0x1

    .line 24
    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {p0, v0, v3, v2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世兰哲苏(IIZLandroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 32
    .line 33
    iget v4, v2, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:I

    .line 34
    .line 35
    invoke-virtual {p0, p2, v2, p3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世楪哲苏(Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;Z)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    add-int/2addr p2, v4

    .line 40
    if-gez p2, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    if-le v3, p2, :cond_3

    .line 44
    .line 45
    mul-int p1, v0, p2

    .line 46
    .line 47
    :cond_3
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 48
    .line 49
    neg-int p3, p1

    .line 50
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏兰世(I)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 54
    .line 55
    iput p1, p0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世:I

    .line 56
    .line 57
    return p1

    .line 58
    :cond_4
    :goto_1
    return v1
.end method

.method public final 飘花落叶言楪子世苏哲兰()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰哲楪苏世()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰楪哲:Z

    .line 14
    .line 15
    xor-int/2addr v0, v1

    .line 16
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰楪哲:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 22
    .line 23
    return-void
.end method

.method public final 飘花落叶言楪子苏世兰哲(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int v1, p2, v1

    .line 10
    .line 11
    iput v1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 14
    .line 15
    iput p1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 16
    .line 17
    iget-boolean p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 18
    .line 19
    const/4 p1, -0x1

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p0, p1

    .line 25
    :goto_0
    iput p0, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 26
    .line 27
    iput p1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:I

    .line 28
    .line 29
    iput p2, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 30
    .line 31
    const/high16 p0, -0x80000000

    .line 32
    .line 33
    iput p0, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:I

    .line 34
    .line 35
    return-void
.end method

.method public final 飘花落叶言楪子苏世哲兰(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏哲楪兰:Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v1, p2

    .line 10
    iput v1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏楪兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;

    .line 13
    .line 14
    iget-boolean p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子世苏兰哲楪:Z

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, -0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move p0, v1

    .line 22
    :goto_0
    iput p0, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 23
    .line 24
    iput p1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:I

    .line 25
    .line 26
    iput v1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:I

    .line 27
    .line 28
    iput p2, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:I

    .line 29
    .line 30
    const/high16 p0, -0x80000000

    .line 31
    .line 32
    iput p0, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:I

    .line 33
    .line 34
    return-void
.end method
