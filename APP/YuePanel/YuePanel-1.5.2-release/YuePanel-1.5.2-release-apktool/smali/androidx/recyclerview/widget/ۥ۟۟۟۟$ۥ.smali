.class public Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/ۥ۟۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# static fields
.field public static final ۥ۟۟:I = 0x40

.field public static final ۥ۟۟۟:J = -0x8000000000000000L


# instance fields
.field public ۥ:J

.field public ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    if-nez v0, :cond_0

    iget-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "xx"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    invoke-static {v1, v2}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public ۥ(I)V
    .locals 4

    const/16 v0, 0x40

    if-lt p1, v0, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    if-eqz v1, :cond_1

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ(I)V

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    not-long v2, v2

    and-long/2addr v0, v2

    iput-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    :cond_1
    :goto_0
    return-void
.end method

.method public ۥ۟(I)I
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    const/16 v1, 0x40

    const-wide/16 v2, 0x1

    if-nez v0, :cond_1

    if-lt p1, v1, :cond_0

    iget-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result p1

    return p1

    :cond_0
    iget-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    shl-long v4, v2, p1

    sub-long/2addr v4, v2

    and-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result p1

    return p1

    :cond_1
    if-ge p1, v1, :cond_2

    iget-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    shl-long v4, v2, p1

    sub-long/2addr v4, v2

    and-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result p1

    return p1

    :cond_2
    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟(I)I

    move-result p1

    iget-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result v0

    add-int/2addr p1, v0

    return p1
.end method

.method public final ۥ۟۟()V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    invoke-direct {v0}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟(I)Z
    .locals 4

    const/16 v0, 0x40

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟()V

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟۟(I)Z

    move-result p1

    return p1

    :cond_0
    iget-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟۟۟(IZ)V
    .locals 9

    const/16 v0, 0x40

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟()V

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1, p2}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟۟۟(IZ)V

    goto :goto_2

    :cond_0
    iget-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    const-wide/high16 v2, -0x8000000000000000L

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    const-wide/16 v5, 0x1

    shl-long v7, v5, p1

    sub-long/2addr v7, v5

    and-long v5, v0, v7

    not-long v7, v7

    and-long/2addr v0, v7

    shl-long/2addr v0, v4

    or-long/2addr v0, v5

    iput-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    if-eqz p2, :cond_2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟۟ۢ(I)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ(I)V

    :goto_1
    if-nez v2, :cond_3

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    if-eqz p1, :cond_4

    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟()V

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    invoke-virtual {p1, v3, v2}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟۟۟(IZ)V

    :cond_4
    :goto_2
    return-void
.end method

.method public ۥ۟۟۟۠(I)Z
    .locals 10

    const/16 v0, 0x40

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟()V

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟۟۠(I)Z

    move-result p1

    return p1

    :cond_0
    const-wide/16 v0, 0x1

    shl-long v2, v0, p1

    iget-wide v4, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    and-long v6, v4, v2

    const-wide/16 v8, 0x0

    cmp-long p1, v6, v8

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz p1, :cond_1

    move p1, v6

    goto :goto_0

    :cond_1
    move p1, v7

    :goto_0
    not-long v8, v2

    and-long/2addr v4, v8

    iput-wide v4, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    sub-long/2addr v2, v0

    and-long v0, v4, v2

    not-long v2, v2

    and-long/2addr v2, v4

    invoke-static {v2, v3, v6}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v2

    or-long/2addr v0, v2

    iput-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟۟(I)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x3f

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟۟ۢ(I)V

    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟۟۠(I)Z

    :cond_3
    return p1
.end method

.method public ۥ۟۟۟ۡ()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟۟ۡ()V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟ۢ(I)V
    .locals 4

    const/16 v0, 0x40

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟()V

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ۟۟۟ۢ(I)V

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    or-long/2addr v0, v2

    iput-wide v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۟$ۥ;->ۥ:J

    :goto_0
    return-void
.end method
