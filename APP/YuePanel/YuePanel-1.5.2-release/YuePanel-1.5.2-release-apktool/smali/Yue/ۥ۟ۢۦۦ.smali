.class public LYue/ۥ۟ۢۦۦ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۧۢۦ;


# static fields
.field public static final ۥ۟۟۠ۨ:I = 0x0

.field public static final ۥ۟۟ۡ:I = 0x1

.field public static final ۥ۟۟ۡ۟:I = 0x2

.field public static final ۥ۟۟ۡ۠:I = 0x3


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۠ۧۢۦ;

.field public ۥ۟۟۠ۤ:I

.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:I

.field public ۥ۟۟۠ۧ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۧۢۦ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۧۢۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۤ:I

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۥ:I

    iput v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۦ:I

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput-object p1, p0, LYue/ۥ۟ۢۦۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۧۢۦ;

    return-void
.end method


# virtual methods
.method public ۥ(II)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۟۟()V

    iget-object v0, p0, LYue/ۥ۟ۢۦۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۧۢۦ;

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۧۢۦ;->ۥ(II)V

    return-void
.end method

.method public ۥ۟(II)V
    .locals 4

    iget v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۤ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۥ:I

    if-lt p1, v0, :cond_0

    iget v2, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۦ:I

    add-int v3, v0, v2

    if-gt p1, v3, :cond_0

    add-int/2addr v2, p2

    iput v2, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۦ:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۥ:I

    return-void

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۟۟()V

    iput p1, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۥ:I

    iput p2, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۦ:I

    iput v1, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۤ:I

    return-void
.end method

.method public ۥ۟۟(II)V
    .locals 3

    iget v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۤ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۥ:I

    if-lt v0, p1, :cond_0

    add-int v2, p1, p2

    if-gt v0, v2, :cond_0

    iget v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۦ:I

    add-int/2addr v0, p2

    iput v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۦ:I

    iput p1, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۥ:I

    return-void

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۟۟()V

    iput p1, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۥ:I

    iput p2, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۦ:I

    iput v1, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۤ:I

    return-void
.end method

.method public ۥ۟۟۟(IILjava/lang/Object;)V
    .locals 5

    iget v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۤ:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۥ:I

    iget v2, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۦ:I

    add-int v3, v0, v2

    if-gt p1, v3, :cond_0

    add-int v3, p1, p2

    if-lt v3, v0, :cond_0

    iget-object v4, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    if-ne v4, p3, :cond_0

    add-int/2addr v2, v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۥ:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget p2, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۥ:I

    sub-int/2addr p1, p2

    iput p1, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۦ:I

    return-void

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۟۟()V

    iput p1, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۥ:I

    iput p2, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۦ:I

    iput-object p3, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput v1, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۤ:I

    return-void
.end method

.method public ۥ۟۟۟۟()V
    .locals 4

    iget v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۤ:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LYue/ۥ۟ۢۦۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۧۢۦ;

    iget v1, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۥ:I

    iget v2, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۦ:I

    iget-object v3, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    invoke-interface {v0, v1, v2, v3}, LYue/ۥ۠ۧۢۦ;->ۥ۟۟۟(IILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LYue/ۥ۟ۢۦۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۧۢۦ;

    iget v1, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۥ:I

    iget v2, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۦ:I

    invoke-interface {v0, v1, v2}, LYue/ۥ۠ۧۢۦ;->ۥ۟۟(II)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, LYue/ۥ۟ۢۦۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۧۢۦ;

    iget v1, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۥ:I

    iget v2, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۦ:I

    invoke-interface {v0, v1, v2}, LYue/ۥ۠ۧۢۦ;->ۥ۟(II)V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥ۟ۢۦۦ;->ۥ۟۟۠ۤ:I

    return-void
.end method
