.class public final LYue/ۥۢ۟ۦۢ$ۥ;
.super LYue/ۥ۠ۥۣۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢ۟ۦۢ;->ۥ۟۟۟ۤ(Landroid/util/SparseBooleanArray;)LYue/ۥ۠ۥۣۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public ۥۣ۟۟۠:I

.field public final synthetic ۥ۟۟۠ۤ:Landroid/util/SparseBooleanArray;


# direct methods
.method public constructor <init>(Landroid/util/SparseBooleanArray;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢ۟ۦۢ$ۥ;->ۥ۟۟۠ۤ:Landroid/util/SparseBooleanArray;

    invoke-direct {p0}, LYue/ۥ۠ۥۣۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    iget v0, p0, LYue/ۥۢ۟ۦۢ$ۥ;->ۥۣ۟۟۠:I

    iget-object v1, p0, LYue/ۥۢ۟ۦۢ$ۥ;->ۥ۟۟۠ۤ:Landroid/util/SparseBooleanArray;

    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟()I
    .locals 3

    iget-object v0, p0, LYue/ۥۢ۟ۦۢ$ۥ;->ۥ۟۟۠ۤ:Landroid/util/SparseBooleanArray;

    iget v1, p0, LYue/ۥۢ۟ۦۢ$ۥ;->ۥۣ۟۟۠:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LYue/ۥۢ۟ۦۢ$ۥ;->ۥۣ۟۟۠:I

    invoke-virtual {v0, v1}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    move-result v0

    return v0
.end method

.method public final ۥ۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥۢ۟ۦۢ$ۥ;->ۥۣ۟۟۠:I

    return v0
.end method

.method public final ۥ۟۟۟(I)V
    .locals 0

    iput p1, p0, LYue/ۥۢ۟ۦۢ$ۥ;->ۥۣ۟۟۠:I

    return-void
.end method
