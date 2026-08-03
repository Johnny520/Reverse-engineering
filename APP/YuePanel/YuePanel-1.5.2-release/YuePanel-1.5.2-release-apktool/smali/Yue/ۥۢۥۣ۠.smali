.class public abstract LYue/ۥۢۥۣ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۟ۨۨ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۥۣ۠$ۥ۟;
    }
.end annotation


# instance fields
.field public ۥ:I

.field public ۥ۟:LYue/ۥ۟ۧ۟ۢ;

.field public ۥ۟۟:LYue/ۥۡۧ۠ۨ;

.field public ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

.field public ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

.field public ۥ۟۟۟۠:I

.field public ۥ۟۟۟ۡ:Z

.field public ۥ۟۟۟ۢ:LYue/ۥ۟ۨۨۥ;

.field public ۥۣ۟۟۟:LYue/ۥ۟ۨۨۥ;

.field public ۥ۟۟۟ۤ:LYue/ۥۢۥۣ۠$ۥ۟;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧ۟ۢ;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYue/ۥ۠۟ۡۡ;

    invoke-direct {v0, p0}, LYue/ۥ۠۟ۡۡ;-><init>(LYue/ۥۢۥۣ۠;)V

    iput-object v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۠:I

    iput-boolean v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۡ:Z

    new-instance v0, LYue/ۥ۟ۨۨۥ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۨۨۥ;-><init>(LYue/ۥۢۥۣ۠;)V

    iput-object v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۢ:LYue/ۥ۟ۨۨۥ;

    new-instance v0, LYue/ۥ۟ۨۨۥ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۨۨۥ;-><init>(LYue/ۥۢۥۣ۠;)V

    iput-object v0, p0, LYue/ۥۢۥۣ۠;->ۥۣ۟۟۟:LYue/ۥ۟ۨۨۥ;

    sget-object v0, LYue/ۥۢۥۣ۠$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۢۥۣ۠$ۥ۟;

    iput-object v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۤ:LYue/ۥۢۥۣ۠$ۥ۟;

    iput-object p1, p0, LYue/ۥۢۥۣ۠;->ۥ۟:LYue/ۥ۟ۧ۟ۢ;

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۣ۟ۨۨ;)V
    .locals 0

    return-void
.end method

.method public final ۥ۟(LYue/ۥ۟ۨۨۥ;LYue/ۥ۟ۨۨۥ;I)V
    .locals 1

    iget-object v0, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۦ:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۠:I

    iget-object p2, p2, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۥ۟۟(LYue/ۥ۟ۨۨۥ;LYue/ۥ۟ۨۨۥ;ILYue/ۥ۠۟ۡۡ;)V
    .locals 2

    iget-object v0, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۦ:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۦ:Ljava/util/List;

    iget-object v1, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۢ:I

    iput-object p4, p1, LYue/ۥ۟ۨۨۥ;->ۥۣ۟۟۟:LYue/ۥ۠۟ۡۡ;

    iget-object p2, p2, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p2, p4, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract ۥ۟۟۟()V
.end method

.method public abstract ۥ۟۟۟۟()V
.end method

.method public abstract ۥ۟۟۟۠()V
.end method

.method public final ۥ۟۟۟ۡ(II)I
    .locals 1

    if-nez p2, :cond_1

    iget-object p2, p0, LYue/ۥۢۥۣ۠;->ۥ۟:LYue/ۥ۟ۧ۟ۢ;

    iget v0, p2, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟۠:I

    iget p2, p2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۢ:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_0
    if-eq p2, p1, :cond_3

    goto :goto_0

    :cond_1
    iget-object p2, p0, LYue/ۥۢۥۣ۠;->ۥ۟:LYue/ۥ۟ۧ۟ۢ;

    iget v0, p2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۦ:I

    iget p2, p2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۥ:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_2

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_2
    if-eq p2, p1, :cond_3

    :goto_0
    move p1, p2

    :cond_3
    return p1
.end method

.method public final ۥ۟۟۟ۢ(LYue/ۥ۟ۧ۟۠;)LYue/ۥ۟ۨۨۥ;
    .locals 3

    iget-object p1, p1, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۠:LYue/ۥ۟ۧ۟۠;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    iget-object p1, p1, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟:LYue/ۥ۟ۧ۟۠$ۥ۟;

    sget-object v2, LYue/ۥۢۥۣ۠$ۥ;->ۥ:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_5

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

    const/4 v2, 0x3

    if-eq p1, v2, :cond_3

    const/4 v2, 0x4

    if-eq p1, v2, :cond_2

    const/4 v2, 0x5

    if-eq p1, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, v1, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۟۠:LYue/ۥۣۢۦۧ;

    iget-object v0, p1, LYue/ۥۢۥۣ۠;->ۥۣ۟۟۟:LYue/ۥ۟ۨۨۥ;

    goto :goto_0

    :cond_2
    iget-object p1, v1, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۟۠:LYue/ۥۣۢۦۧ;

    iget-object v0, p1, LYue/ۥۣۢۦۧ;->ۥ۟۟۟ۥ:LYue/ۥ۟ۨۨۥ;

    goto :goto_0

    :cond_3
    iget-object p1, v1, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۟۠:LYue/ۥۣۢۦۧ;

    iget-object v0, p1, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۢ:LYue/ۥ۟ۨۨۥ;

    goto :goto_0

    :cond_4
    iget-object p1, v1, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۦۧ;

    iget-object v0, p1, LYue/ۥۢۥۣ۠;->ۥۣ۟۟۟:LYue/ۥ۟ۨۨۥ;

    goto :goto_0

    :cond_5
    iget-object p1, v1, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۦۧ;

    iget-object v0, p1, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۢ:LYue/ۥ۟ۨۨۥ;

    :goto_0
    return-object v0
.end method

.method public final ۥۣ۟۟۟(LYue/ۥ۟ۧ۟۠;I)LYue/ۥ۟ۨۨۥ;
    .locals 2

    iget-object p1, p1, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۠:LYue/ۥ۟ۧ۟۠;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    if-nez p2, :cond_1

    iget-object p2, v1, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۦۧ;

    goto :goto_0

    :cond_1
    iget-object p2, v1, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۟۠:LYue/ۥۣۢۦۧ;

    :goto_0
    iget-object p1, p1, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۟:LYue/ۥ۟ۧ۟۠$ۥ۟;

    sget-object v1, LYue/ۥۢۥۣ۠$ۥ;->ۥ:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x5

    if-eq p1, v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p2, LYue/ۥۢۥۣ۠;->ۥۣ۟۟۟:LYue/ۥ۟ۨۨۥ;

    goto :goto_1

    :cond_3
    iget-object v0, p2, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۢ:LYue/ۥ۟ۨۨۥ;

    :goto_1
    return-object v0
.end method

.method public ۥ۟۟۟ۤ()J
    .locals 2

    iget-object v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    iget-boolean v1, v0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-eqz v1, :cond_0

    iget v0, v0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public ۥ۟۟۟ۥ()Z
    .locals 5

    iget-object v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۢ:LYue/ۥ۟ۨۨۥ;

    iget-object v0, v0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۦ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v4, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۢ:LYue/ۥ۟ۨۨۥ;

    iget-object v4, v4, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۦ:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYue/ۥ۟ۨۨۥ;

    iget-object v4, v4, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟:LYue/ۥۢۥۣ۠;

    if-eq v4, p0, :cond_0

    add-int/lit8 v3, v3, 0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LYue/ۥۢۥۣ۠;->ۥۣ۟۟۟:LYue/ۥ۟ۨۨۥ;

    iget-object v0, v0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۦ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_3

    iget-object v4, p0, LYue/ۥۢۥۣ۠;->ۥۣ۟۟۟:LYue/ۥ۟ۨۨۥ;

    iget-object v4, v4, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۦ:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYue/ۥ۟ۨۨۥ;

    iget-object v4, v4, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟:LYue/ۥۢۥۣ۠;

    if-eq v4, p0, :cond_2

    add-int/lit8 v3, v3, 0x1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x2

    if-lt v3, v0, :cond_4

    const/4 v1, 0x1

    :cond_4
    return v1
.end method

.method public ۥ۟۟۟ۦ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    iget-boolean v0, v0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    return v0
.end method

.method public ۥ۟۟۟ۧ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۡ:Z

    return v0
.end method

.method public abstract ۥ۟۟۟ۨ()V
.end method

.method public final ۥ۟۟۠(II)V
    .locals 7

    iget v0, p0, LYue/ۥۢۥۣ۠;->ۥ:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 p2, 0x2

    const/high16 v2, 0x3f000000    # 0.5f

    if-eq v0, p2, :cond_4

    const/4 p2, 0x3

    if-eq v0, p2, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟:LYue/ۥ۟ۧ۟ۢ;

    iget-object v3, v0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۦۧ;

    iget-object v4, v3, LYue/ۥۢۥۣ۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    sget-object v5, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    if-ne v4, v5, :cond_1

    iget v4, v3, LYue/ۥۢۥۣ۠;->ۥ:I

    if-ne v4, p2, :cond_1

    iget-object v4, v0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۟۠:LYue/ۥۣۢۦۧ;

    iget-object v6, v4, LYue/ۥۢۥۣ۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    if-ne v6, v5, :cond_1

    iget v4, v4, LYue/ۥۢۥۣ۠;->ۥ:I

    if-ne v4, p2, :cond_1

    goto/16 :goto_3

    :cond_1
    if-nez p1, :cond_2

    iget-object v3, v0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۟۠:LYue/ۥۣۢۦۧ;

    :cond_2
    iget-object p2, v3, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    iget-boolean p2, p2, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-eqz p2, :cond_9

    invoke-virtual {v0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۡ۟()F

    move-result p2

    if-ne p1, v1, :cond_3

    iget-object p1, v3, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    iget p1, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    int-to-float p1, p1

    div-float/2addr p1, p2

    add-float/2addr p1, v2

    float-to-int p1, p1

    goto :goto_0

    :cond_3
    iget-object p1, v3, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    iget p1, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    int-to-float p1, p1

    mul-float/2addr p2, p1

    add-float/2addr p2, v2

    float-to-int p1, p2

    :goto_0
    iget-object p2, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    invoke-virtual {p2, p1}, LYue/ۥ۠۟ۡۡ;->ۥ۟۟۟۟(I)V

    goto :goto_3

    :cond_4
    iget-object p2, p0, LYue/ۥۢۥۣ۠;->ۥ۟:LYue/ۥ۟ۧ۟ۢ;

    invoke-virtual {p2}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۨ()LYue/ۥ۟ۧ۟ۢ;

    move-result-object p2

    if-eqz p2, :cond_9

    if-nez p1, :cond_5

    iget-object p2, p2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۦۧ;

    goto :goto_1

    :cond_5
    iget-object p2, p2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۟۠:LYue/ۥۣۢۦۧ;

    :goto_1
    iget-object p2, p2, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    iget-boolean v0, p2, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟:LYue/ۥ۟ۧ۟ۢ;

    if-nez p1, :cond_6

    iget v0, v0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۤ:F

    goto :goto_2

    :cond_6
    iget v0, v0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۧ:F

    :goto_2
    iget p2, p2, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    int-to-float p2, p2

    mul-float/2addr p2, v0

    add-float/2addr p2, v2

    float-to-int p2, p2

    iget-object v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    invoke-virtual {p0, p2, p1}, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۡ(II)I

    move-result p1

    invoke-virtual {v0, p1}, LYue/ۥ۠۟ۡۡ;->ۥ۟۟۟۟(I)V

    goto :goto_3

    :cond_7
    iget-object v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    iget v0, v0, LYue/ۥ۠۟ۡۡ;->ۥ۟۟۟ۧ:I

    invoke-virtual {p0, v0, p1}, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۡ(II)I

    move-result p1

    iget-object v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {v0, p1}, LYue/ۥ۠۟ۡۡ;->ۥ۟۟۟۟(I)V

    goto :goto_3

    :cond_8
    iget-object v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    invoke-virtual {p0, p2, p1}, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۡ(II)I

    move-result p1

    invoke-virtual {v0, p1}, LYue/ۥ۠۟ۡۡ;->ۥ۟۟۟۟(I)V

    :cond_9
    :goto_3
    return-void
.end method

.method public abstract ۥ۟۟۠۟()Z
.end method

.method public ۥ۟۟۠۠(LYue/ۥۣ۟ۨۨ;LYue/ۥ۟ۧ۟۠;LYue/ۥ۟ۧ۟۠;I)V
    .locals 4

    invoke-virtual {p0, p2}, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۢ(LYue/ۥ۟ۧ۟۠;)LYue/ۥ۟ۨۨۥ;

    move-result-object p1

    invoke-virtual {p0, p3}, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۢ(LYue/ۥ۟ۧ۟۠;)LYue/ۥ۟ۨۨۥ;

    move-result-object v0

    iget-boolean v1, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-eqz v1, :cond_6

    iget-boolean v1, v0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    invoke-virtual {p2}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟ۡ()I

    move-result p2

    add-int/2addr v1, p2

    iget p2, v0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    invoke-virtual {p3}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟ۡ()I

    move-result p3

    sub-int/2addr p2, p3

    sub-int p3, p2, v1

    iget-object v2, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    iget-boolean v2, v2, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-nez v2, :cond_1

    iget-object v2, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    sget-object v3, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    if-ne v2, v3, :cond_1

    invoke-virtual {p0, p4, p3}, LYue/ۥۢۥۣ۠;->ۥ۟۟۠(II)V

    :cond_1
    iget-object v2, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    iget-boolean v3, v2, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-nez v3, :cond_2

    return-void

    :cond_2
    iget v2, v2, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    if-ne v2, p3, :cond_3

    iget-object p1, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۢ:LYue/ۥ۟ۨۨۥ;

    invoke-virtual {p1, v1}, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۟(I)V

    iget-object p1, p0, LYue/ۥۢۥۣ۠;->ۥۣ۟۟۟:LYue/ۥ۟ۨۨۥ;

    invoke-virtual {p1, p2}, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۟(I)V

    return-void

    :cond_3
    iget-object p3, p0, LYue/ۥۢۥۣ۠;->ۥ۟:LYue/ۥ۟ۧ۟ۢ;

    if-nez p4, :cond_4

    invoke-virtual {p3}, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟ۡ()F

    move-result p3

    goto :goto_0

    :cond_4
    invoke-virtual {p3}, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟ۦ()F

    move-result p3

    :goto_0
    const/high16 p4, 0x3f000000    # 0.5f

    if-ne p1, v0, :cond_5

    iget v1, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    iget p2, v0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    move p3, p4

    :cond_5
    sub-int/2addr p2, v1

    iget-object p1, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    iget p1, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    sub-int/2addr p2, p1

    iget-object p1, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۢ:LYue/ۥ۟ۨۨۥ;

    int-to-float v0, v1

    add-float/2addr v0, p4

    int-to-float p2, p2

    mul-float/2addr p2, p3

    add-float/2addr v0, p2

    float-to-int p2, v0

    invoke-virtual {p1, p2}, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۟(I)V

    iget-object p1, p0, LYue/ۥۢۥۣ۠;->ۥۣ۟۟۟:LYue/ۥ۟ۨۨۥ;

    iget-object p2, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۢ:LYue/ۥ۟ۨۨۥ;

    iget p2, p2, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    iget-object p3, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    iget p3, p3, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    add-int/2addr p2, p3

    invoke-virtual {p1, p2}, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۟(I)V

    :cond_6
    :goto_1
    return-void
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥۣ۟ۨۨ;)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟۠ۢ(LYue/ۥۣ۟ۨۨ;)V
    .locals 0

    return-void
.end method

.method public ۥۣ۟۟۠(I)J
    .locals 4

    iget-object v0, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۡ;

    iget-boolean v1, v0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-eqz v1, :cond_2

    iget v0, v0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    int-to-long v0, v0

    invoke-virtual {p0}, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۥ()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۢ:LYue/ۥ۟ۨۨۥ;

    iget p1, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۠:I

    iget-object v2, p0, LYue/ۥۢۥۣ۠;->ۥۣ۟۟۟:LYue/ۥ۟ۨۨۥ;

    iget v2, v2, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۠:I

    sub-int/2addr p1, v2

    :goto_0
    int-to-long v2, p1

    add-long/2addr v0, v2

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, LYue/ۥۢۥۣ۠;->ۥ۟۟۟ۢ:LYue/ۥ۟ۨۨۥ;

    iget p1, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۠:I

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYue/ۥۢۥۣ۠;->ۥۣ۟۟۟:LYue/ۥ۟ۨۨۥ;

    iget p1, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۠:I

    int-to-long v2, p1

    sub-long/2addr v0, v2

    :goto_1
    return-wide v0

    :cond_2
    const-wide/16 v0, 0x0

    return-wide v0
.end method
