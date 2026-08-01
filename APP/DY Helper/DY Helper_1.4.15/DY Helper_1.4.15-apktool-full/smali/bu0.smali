.class public final Lbu0;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ε:I

.field public final synthetic ζ:Lcu0;


# direct methods
.method public constructor <init>(Lcu0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbu0;->ζ:Lcu0;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lbu0;->ε:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lbu0;->α()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 2

    .line 1
    iget-object v0, p0, Lbu0;->ζ:Lcu0;

    .line 2
    .line 3
    iget-object v1, v0, Lcu0;->η:Liz0;

    .line 4
    .line 5
    invoke-virtual {v1}, Liz0;->ι()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v1, Liz0;->κ:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget p0, p0, Lbu0;->ε:I

    .line 18
    .line 19
    if-gez p0, :cond_0

    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    return v1
.end method

.method public final bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lbu0;->β(I)Llz0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getItemId(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lbu0;->ζ:Lcu0;

    .line 4
    .line 5
    iget-object p2, p2, Lcu0;->ζ:Landroid/view/LayoutInflater;

    .line 6
    .line 7
    const v0, 0x7f0c0010

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    :cond_0
    move-object p3, p2

    .line 16
    check-cast p3, Lvz0;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lbu0;->β(I)Llz0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p3, p0}, Lvz0;->α(Llz0;)V

    .line 23
    .line 24
    .line 25
    return-object p2
.end method

.method public final notifyDataSetChanged()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbu0;->α()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final α()V
    .locals 5

    .line 1
    iget-object v0, p0, Lbu0;->ζ:Lcu0;

    .line 2
    .line 3
    iget-object v0, v0, Lcu0;->η:Liz0;

    .line 4
    .line 5
    iget-object v1, v0, Liz0;->χ:Llz0;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Liz0;->ι()V

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, Liz0;->κ:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_0
    if-ge v3, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Llz0;

    .line 26
    .line 27
    if-ne v4, v1, :cond_0

    .line 28
    .line 29
    iput v3, p0, Lbu0;->ε:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v0, -0x1

    .line 36
    iput v0, p0, Lbu0;->ε:I

    .line 37
    .line 38
    return-void
.end method

.method public final β(I)Llz0;
    .locals 2

    .line 1
    iget-object v0, p0, Lbu0;->ζ:Lcu0;

    .line 2
    .line 3
    iget-object v1, v0, Lcu0;->η:Liz0;

    .line 4
    .line 5
    invoke-virtual {v1}, Liz0;->ι()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v1, Liz0;->κ:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget p0, p0, Lbu0;->ε:I

    .line 14
    .line 15
    if-ltz p0, :cond_0

    .line 16
    .line 17
    if-lt p1, p0, :cond_0

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Llz0;

    .line 26
    .line 27
    return-object p0
.end method
