.class public abstract Lsq;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/Filterable;


# instance fields
.field public ε:Z

.field public ζ:Z

.field public η:Landroid/database/Cursor;

.field public θ:I

.field public ι:Lqq;

.field public κ:Lrq;

.field public λ:Ltq;


# virtual methods
.method public final getCount()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lsq;->ε:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lsq;->η:Landroid/database/Cursor;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Landroid/database/Cursor;->getCount()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lsq;->ε:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lsq;->η:Landroid/database/Cursor;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 8
    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    move-object p1, p0

    .line 13
    check-cast p1, Lm12;

    .line 14
    .line 15
    iget p2, p1, Lm12;->ν:I

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iget-object p1, p1, Lm12;->ξ:Landroid/view/LayoutInflater;

    .line 19
    .line 20
    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    :cond_0
    iget-object p1, p0, Lsq;->η:Landroid/database/Cursor;

    .line 25
    .line 26
    invoke-virtual {p0, p2, p1}, Lsq;->α(Landroid/view/View;Landroid/database/Cursor;)V

    .line 27
    .line 28
    .line 29
    return-object p2

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public final getFilter()Landroid/widget/Filter;
    .locals 1

    .line 1
    iget-object v0, p0, Lsq;->λ:Ltq;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ltq;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/widget/Filter;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p0, v0, Ltq;->α:Lsq;

    .line 11
    .line 12
    iput-object v0, p0, Lsq;->λ:Ltq;

    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Lsq;->λ:Ltq;

    .line 15
    .line 16
    return-object p0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lsq;->ε:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lsq;->η:Landroid/database/Cursor;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lsq;->η:Landroid/database/Cursor;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public final getItemId(I)J
    .locals 3

    .line 1
    iget-boolean v0, p0, Lsq;->ε:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lsq;->η:Landroid/database/Cursor;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lsq;->η:Landroid/database/Cursor;

    .line 18
    .line 19
    iget p0, p0, Lsq;->θ:I

    .line 20
    .line 21
    invoke-interface {p1, p0}, Landroid/database/Cursor;->getLong(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide p0

    .line 25
    return-wide p0

    .line 26
    :cond_0
    return-wide v1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lsq;->ε:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lsq;->η:Landroid/database/Cursor;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    move-object p1, p0

    .line 17
    check-cast p1, Lm12;

    .line 18
    .line 19
    iget p2, p1, Lm12;->μ:I

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iget-object v1, p1, Lm12;->ξ:Landroid/view/LayoutInflater;

    .line 23
    .line 24
    invoke-virtual {v1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance p3, Ll12;

    .line 29
    .line 30
    invoke-direct {p3, p2}, Ll12;-><init>(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const p3, 0x7f09013d

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    check-cast p3, Landroid/widget/ImageView;

    .line 44
    .line 45
    iget p1, p1, Lm12;->τ:I

    .line 46
    .line 47
    invoke-virtual {p3, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 48
    .line 49
    .line 50
    :cond_0
    iget-object p1, p0, Lsq;->η:Landroid/database/Cursor;

    .line 51
    .line 52
    invoke-virtual {p0, p2, p1}, Lsq;->α(Landroid/view/View;Landroid/database/Cursor;)V

    .line 53
    .line 54
    .line 55
    return-object p2

    .line 56
    :cond_1
    const-string p0, "couldn\'t move cursor to position "

    .line 57
    .line 58
    invoke-static {p0, p1}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_2
    const-string p0, "this should only be called when the cursor is valid"

    .line 67
    .line 68
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v1
.end method

.method public abstract α(Landroid/view/View;Landroid/database/Cursor;)V
.end method

.method public β(Landroid/database/Cursor;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsq;->η:Landroid/database/Cursor;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v1, p0, Lsq;->ι:Lqq;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0, v1}, Landroid/database/Cursor;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget-object v1, p0, Lsq;->κ:Lrq;

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-interface {v0, v1}, Landroid/database/Cursor;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 21
    .line 22
    .line 23
    :cond_2
    iput-object p1, p0, Lsq;->η:Landroid/database/Cursor;

    .line 24
    .line 25
    if-eqz p1, :cond_5

    .line 26
    .line 27
    iget-object v1, p0, Lsq;->ι:Lqq;

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    invoke-interface {p1, v1}, Landroid/database/Cursor;->registerContentObserver(Landroid/database/ContentObserver;)V

    .line 32
    .line 33
    .line 34
    :cond_3
    iget-object v1, p0, Lsq;->κ:Lrq;

    .line 35
    .line 36
    if-eqz v1, :cond_4

    .line 37
    .line 38
    invoke-interface {p1, v1}, Landroid/database/Cursor;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 39
    .line 40
    .line 41
    :cond_4
    const-string v1, "_id"

    .line 42
    .line 43
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iput p1, p0, Lsq;->θ:I

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, Lsq;->ε:Z

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    const/4 p1, -0x1

    .line 57
    iput p1, p0, Lsq;->θ:I

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    iput-boolean p1, p0, Lsq;->ε:Z

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 63
    .line 64
    .line 65
    :goto_0
    if-eqz v0, :cond_6

    .line 66
    .line 67
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 68
    .line 69
    .line 70
    :cond_6
    return-void
.end method

.method public abstract γ(Landroid/database/Cursor;)Ljava/lang/String;
.end method
