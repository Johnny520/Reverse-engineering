.class public LYue/ۥۡۧ۠ۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥۣ۟۟۟:I = -0x80000000


# instance fields
.field public ۥ:I

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:I

.field public ۥ۟۟۟ۡ:Z

.field public ۥ۟۟۟ۢ:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ:I

    iput v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟:I

    const/high16 v1, -0x80000000

    iput v1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟:I

    iput v1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟:I

    iput v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟۟:I

    iput v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟۠:I

    iput-boolean v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟ۡ:Z

    iput-boolean v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟ۢ:Z

    return-void
.end method


# virtual methods
.method public ۥ()I
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟ۡ:Z

    if-eqz v0, :cond_0

    iget v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ:I

    goto :goto_0

    :cond_0
    iget v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟:I

    :goto_0
    return v0
.end method

.method public ۥ۟()I
    .locals 1

    iget v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ:I

    return v0
.end method

.method public ۥ۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟:I

    return v0
.end method

.method public ۥ۟۟۟()I
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟ۡ:Z

    if-eqz v0, :cond_0

    iget v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟:I

    goto :goto_0

    :cond_0
    iget v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ:I

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟۟(II)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟ۢ:Z

    const/high16 v0, -0x80000000

    if-eq p1, v0, :cond_0

    iput p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟۟:I

    iput p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ:I

    :cond_0
    if-eq p2, v0, :cond_1

    iput p2, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟۠:I

    iput p2, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟:I

    :cond_1
    return-void
.end method

.method public ۥ۟۟۟۠(Z)V
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟ۡ:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟ۡ:Z

    iget-boolean v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟ۢ:Z

    if-eqz v0, :cond_6

    const/high16 v0, -0x80000000

    if-eqz p1, :cond_3

    iget p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟:I

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    iget p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟۟:I

    :goto_0
    iput p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ:I

    iget p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟:I

    if-eq p1, v0, :cond_2

    goto :goto_1

    :cond_2
    iget p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟۠:I

    :goto_1
    iput p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟:I

    goto :goto_4

    :cond_3
    iget p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟:I

    if-eq p1, v0, :cond_4

    goto :goto_2

    :cond_4
    iget p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟۟:I

    :goto_2
    iput p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ:I

    iget p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟:I

    if-eq p1, v0, :cond_5

    goto :goto_3

    :cond_5
    iget p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟۠:I

    :goto_3
    iput p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟:I

    goto :goto_4

    :cond_6
    iget p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟۟:I

    iput p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ:I

    iget p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟۠:I

    iput p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟:I

    :goto_4
    return-void
.end method

.method public ۥ۟۟۟ۡ(II)V
    .locals 2

    iput p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟:I

    iput p2, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟:I

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟ۢ:Z

    iget-boolean v0, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟۟۟ۡ:Z

    const/high16 v1, -0x80000000

    if-eqz v0, :cond_1

    if-eq p2, v1, :cond_0

    iput p2, p0, LYue/ۥۡۧ۠ۧ;->ۥ:I

    :cond_0
    if-eq p1, v1, :cond_3

    iput p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟:I

    goto :goto_0

    :cond_1
    if-eq p1, v1, :cond_2

    iput p1, p0, LYue/ۥۡۧ۠ۧ;->ۥ:I

    :cond_2
    if-eq p2, v1, :cond_3

    iput p2, p0, LYue/ۥۡۧ۠ۧ;->ۥ۟:I

    :cond_3
    :goto_0
    return-void
.end method
