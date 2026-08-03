.class public final Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/ۥ۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# static fields
.field public static final ۥۣ۟۟۟:I = 0x1

.field public static final ۥ۟۟۟ۤ:I = 0x2


# instance fields
.field public ۥ:I

.field public final ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

.field public ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

.field public ۥ۟۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:I

.field public final ۥ۟۟۟ۡ:Z

.field public final ۥ۟۟۟ۢ:[I


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;Z[I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ:I

    iput-object p1, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    iput-object p1, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    iput-boolean p2, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟ۡ:Z

    iput-object p3, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟ۢ:[I

    return-void
.end method

.method public static ۥ۟۟۟(I)Z
    .locals 1

    const v0, 0xfe0f

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static ۥ۟۟۟۠(I)Z
    .locals 1

    const v0, 0xfe0e

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public ۥ(I)I
    .locals 4

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ(I)Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    move-result-object v0

    iget v1, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟ۡ()I

    move-result v3

    goto :goto_0

    :cond_0
    iput v3, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ:I

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    iput v2, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟۠:I

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    iget v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟۠:I

    add-int/2addr v0, v2

    iput v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟۠:I

    goto :goto_0

    :cond_2
    invoke-static {p1}, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟۠(I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟ۡ()I

    move-result v3

    goto :goto_0

    :cond_3
    invoke-static {p1}, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟(I)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ۟()LYue/ۥۢۢۤۥ;

    move-result-object v0

    if-eqz v0, :cond_7

    iget v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟۠:I

    const/4 v3, 0x3

    if-ne v0, v2, :cond_6

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟ۢ()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟ۡ()I

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟ۡ()I

    move-result v3

    goto :goto_0

    :cond_6
    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟ۡ()I

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟ۡ()I

    move-result v3

    :goto_0
    iput p1, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    return v3
.end method

.method public ۥ۟()LYue/ۥۢۢۤۥ;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ۟()LYue/ۥۢۢۤۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()LYue/ۥۢۢۤۥ;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ۟()LYue/ۥۢۢۤۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟()Z
    .locals 2

    iget v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ۟()LYue/ۥۢۢۤۥ;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟۠:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public final ۥ۟۟۟ۡ()I
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ:I

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    iput-object v1, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    const/4 v1, 0x0

    iput v1, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟۠:I

    return v0
.end method

.method public final ۥ۟۟۟ۢ()Z
    .locals 4

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ۟()LYue/ۥۢۢۤۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۦ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    invoke-static {v0}, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟(I)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-boolean v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟ۡ:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟ۢ:[I

    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ۟()LYue/ۥۢۢۤۥ;

    move-result-object v0

    invoke-virtual {v0, v2}, LYue/ۥۢۢۤۥ;->ۥ۟(I)I

    move-result v0

    iget-object v3, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟۠;->ۥ۟۟۟ۢ:[I

    invoke-static {v3, v0}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    if-gez v0, :cond_3

    return v1

    :cond_3
    return v2
.end method
