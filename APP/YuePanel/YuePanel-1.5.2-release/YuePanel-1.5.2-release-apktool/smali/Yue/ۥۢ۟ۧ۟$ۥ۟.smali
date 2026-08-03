.class public LYue/ۥۢ۟ۧ۟$ۥ۟;
.super LYue/ۥۢ۟ۧ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢ۟ۧ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public ۥ۟۟۟ۡ:Ljava/lang/String;

.field public ۥ۟۟۟ۢ:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroidx/constraintlayout/widget/\u06e5\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public ۥۣ۟۟۟:[F


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/util/SparseArray;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/util/SparseArray<",
            "Landroidx/constraintlayout/widget/\u06e5\u06df;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟;-><init>()V

    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    aget-object p1, p1, v0

    iput-object p1, p0, LYue/ۥۢ۟ۧ۟$ۥ۟;->ۥ۟۟۟ۡ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۢ۟ۧ۟$ۥ۟;->ۥ۟۟۟ۢ:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠(IF)V
    .locals 0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "don\'t call for custom attribute call setPoint(pos, ConstraintAttribute)"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۡ(Landroid/view/View;F)V
    .locals 3

    iget-object v0, p0, LYue/ۥۢ۟ۧ۟;->ۥ:LYue/ۥ۟ۨ۟۠;

    float-to-double v1, p2

    iget-object p2, p0, LYue/ۥۢ۟ۧ۟$ۥ۟;->ۥۣ۟۟۟:[F

    invoke-virtual {v0, v1, v2, p2}, LYue/ۥ۟ۨ۟۠;->ۥ۟۟۟۟(D[F)V

    iget-object p2, p0, LYue/ۥۢ۟ۧ۟$ۥ۟;->ۥ۟۟۟ۢ:Landroid/util/SparseArray;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/constraintlayout/widget/ۥ۟;

    iget-object v0, p0, LYue/ۥۢ۟ۧ۟$ۥ۟;->ۥۣ۟۟۟:[F

    invoke-virtual {p2, p1, v0}, Landroidx/constraintlayout/widget/ۥ۟;->ۥ۟۟۟ۧ(Landroid/view/View;[F)V

    return-void
.end method

.method public ۥۣ۟۟۟(I)V
    .locals 11

    iget-object v0, p0, LYue/ۥۢ۟ۧ۟$ۥ۟;->ۥ۟۟۟ۢ:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    iget-object v1, p0, LYue/ۥۢ۟ۧ۟$ۥ۟;->ۥ۟۟۟ۢ:Landroid/util/SparseArray;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ۥ۟;

    invoke-virtual {v1}, Landroidx/constraintlayout/widget/ۥ۟;->ۥ۟۟۟ۡ()I

    move-result v1

    new-array v3, v0, [D

    new-array v4, v1, [F

    iput-object v4, p0, LYue/ۥۢ۟ۧ۟$ۥ۟;->ۥۣ۟۟۟:[F

    const/4 v4, 0x2

    new-array v4, v4, [I

    const/4 v5, 0x1

    aput v1, v4, v5

    aput v0, v4, v2

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[D

    move v4, v2

    :goto_0
    if-ge v4, v0, :cond_1

    iget-object v5, p0, LYue/ۥۢ۟ۧ۟$ۥ۟;->ۥ۟۟۟ۢ:Landroid/util/SparseArray;

    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    iget-object v6, p0, LYue/ۥۢ۟ۧ۟$ۥ۟;->ۥ۟۟۟ۢ:Landroid/util/SparseArray;

    invoke-virtual {v6, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/constraintlayout/widget/ۥ۟;

    int-to-double v7, v5

    const-wide v9, 0x3f847ae147ae147bL    # 0.01

    mul-double/2addr v7, v9

    aput-wide v7, v3, v4

    iget-object v5, p0, LYue/ۥۢ۟ۧ۟$ۥ۟;->ۥۣ۟۟۟:[F

    invoke-virtual {v6, v5}, Landroidx/constraintlayout/widget/ۥ۟;->ۥ۟۟۟۠([F)V

    move v5, v2

    :goto_1
    iget-object v6, p0, LYue/ۥۢ۟ۧ۟$ۥ۟;->ۥۣ۟۟۟:[F

    array-length v7, v6

    if-ge v5, v7, :cond_0

    aget-object v7, v1, v4

    aget v6, v6, v5

    float-to-double v8, v6

    aput-wide v8, v7, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p1, v3, v1}, LYue/ۥ۟ۨ۟۠;->ۥ(I[D[[D)LYue/ۥ۟ۨ۟۠;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۢ۟ۧ۟;->ۥ:LYue/ۥ۟ۨ۟۠;

    return-void
.end method

.method public ۥ۟۟۟ۤ(ILandroidx/constraintlayout/widget/ۥ۟;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۧ۟$ۥ۟;->ۥ۟۟۟ۢ:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    return-void
.end method
