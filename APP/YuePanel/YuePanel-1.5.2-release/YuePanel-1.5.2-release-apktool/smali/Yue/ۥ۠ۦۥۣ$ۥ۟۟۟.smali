.class public LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۦۥۣ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# static fields
.field public static final ۥ۟۟۟ۨ:I = -0x1

.field public static final ۥ۟۟۠:Ljava/lang/String; = "CycleOscillator"


# instance fields
.field public final ۥ:I

.field public ۥ۟:LYue/ۥۣۡۤۦ;

.field public ۥ۟۟:[F

.field public ۥ۟۟۟:[D

.field public ۥ۟۟۟۟:[F

.field public ۥ۟۟۟۠:[F

.field public ۥ۟۟۟ۡ:[F

.field public ۥ۟۟۟ۢ:I

.field public ۥۣ۟۟۟:LYue/ۥ۟ۨ۟۠;

.field public ۥ۟۟۟ۤ:[D

.field public ۥ۟۟۟ۥ:[D

.field public ۥ۟۟۟ۦ:F

.field public ۥ۟۟۟ۧ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroidx/constraintlayout/widget/\u06e5\u06df;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(III)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYue/ۥۣۡۤۦ;

    invoke-direct {v0}, LYue/ۥۣۡۤۦ;-><init>()V

    iput-object v0, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟:LYue/ۥۣۡۤۦ;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۧ:Ljava/util/HashMap;

    iput p1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۢ:I

    iput p2, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ:I

    iget-object p2, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟:LYue/ۥۣۡۤۦ;

    invoke-virtual {p2, p1}, LYue/ۥۣۡۤۦ;->ۥ۟۟۟ۡ(I)V

    new-array p1, p3, [F

    iput-object p1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟:[F

    new-array p1, p3, [D

    iput-object p1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟:[D

    new-array p1, p3, [F

    iput-object p1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟۟:[F

    new-array p1, p3, [F

    iput-object p1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟۠:[F

    new-array p1, p3, [F

    iput-object p1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۡ:[F

    return-void
.end method


# virtual methods
.method public final ۥ(Ljava/lang/String;Landroidx/constraintlayout/widget/ۥ۟$ۥ۟;)Landroidx/constraintlayout/widget/ۥ۟;
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ۥ۟;

    invoke-virtual {p1}, Landroidx/constraintlayout/widget/ۥ۟;->ۥ۟۟۟()Landroidx/constraintlayout/widget/ۥ۟$ۥ۟;

    move-result-object v0

    if-ne v0, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConstraintAttribute is already a "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroidx/constraintlayout/widget/ۥ۟;->ۥ۟۟۟()Landroidx/constraintlayout/widget/ۥ۟$ۥ۟;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance v0, Landroidx/constraintlayout/widget/ۥ۟;

    invoke-direct {v0, p1, p2}, Landroidx/constraintlayout/widget/ۥ۟;-><init>(Ljava/lang/String;Landroidx/constraintlayout/widget/ۥ۟$ۥ۟;)V

    iget-object p2, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۧ:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public ۥ۟(F)D
    .locals 9

    iget-object v0, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥۣ۟۟۟:LYue/ۥ۟ۨ۟۠;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    float-to-double v3, p1

    iget-object v5, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۥ:[D

    invoke-virtual {v0, v3, v4, v5}, LYue/ۥ۟ۨ۟۠;->ۥ۟۟۟ۡ(D[D)V

    iget-object v0, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥۣ۟۟۟:LYue/ۥ۟ۨ۟۠;

    iget-object v5, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۤ:[D

    invoke-virtual {v0, v3, v4, v5}, LYue/ۥ۟ۨ۟۠;->ۥ۟۟۟(D[D)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۥ:[D

    const-wide/16 v3, 0x0

    aput-wide v3, v0, v1

    aput-wide v3, v0, v2

    :goto_0
    iget-object v0, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟:LYue/ۥۣۡۤۦ;

    float-to-double v3, p1

    invoke-virtual {v0, v3, v4}, LYue/ۥۣۡۤۦ;->ۥ۟۟۟۟(D)D

    move-result-wide v5

    iget-object p1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟:LYue/ۥۣۡۤۦ;

    invoke-virtual {p1, v3, v4}, LYue/ۥۣۡۤۦ;->ۥ۟۟۟(D)D

    move-result-wide v3

    iget-object p1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۥ:[D

    aget-wide v0, p1, v1

    aget-wide v7, p1, v2

    mul-double/2addr v5, v7

    add-double/2addr v0, v5

    iget-object p1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۤ:[D

    aget-wide v5, p1, v2

    mul-double/2addr v3, v5

    add-double/2addr v0, v3

    return-wide v0
.end method

.method public ۥ۟۟(F)D
    .locals 6

    iget-object v0, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥۣ۟۟۟:LYue/ۥ۟ۨ۟۠;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    float-to-double v3, p1

    iget-object v5, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۤ:[D

    invoke-virtual {v0, v3, v4, v5}, LYue/ۥ۟ۨ۟۠;->ۥ۟۟۟(D[D)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۤ:[D

    iget-object v3, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟۠:[F

    aget v3, v3, v2

    float-to-double v3, v3

    aput-wide v3, v0, v2

    iget-object v3, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟:[F

    aget v3, v3, v2

    float-to-double v3, v3

    aput-wide v3, v0, v1

    :goto_0
    iget-object v0, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۤ:[D

    aget-wide v2, v0, v2

    iget-object v0, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟:LYue/ۥۣۡۤۦ;

    float-to-double v4, p1

    invoke-virtual {v0, v4, v5}, LYue/ۥۣۡۤۦ;->ۥ۟۟۟۟(D)D

    move-result-wide v4

    iget-object p1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۤ:[D

    aget-wide v0, p1, v1

    mul-double/2addr v4, v0

    add-double/2addr v2, v4

    return-wide v2
.end method

.method public ۥ۟۟۟(IIFFF)V
    .locals 5

    iget-object v0, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟:[D

    int-to-double v1, p2

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    div-double/2addr v1, v3

    aput-wide v1, v0, p1

    iget-object p2, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟۟:[F

    aput p3, p2, p1

    iget-object p2, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟۠:[F

    aput p4, p2, p1

    iget-object p2, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟:[F

    aput p5, p2, p1

    return-void
.end method

.method public ۥ۟۟۟۟(F)V
    .locals 8

    iput p1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۦ:F

    iget-object p1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟:[D

    array-length p1, p1

    const/4 v0, 0x2

    new-array v1, v0, [I

    const/4 v2, 0x1

    aput v0, v1, v2

    const/4 v0, 0x0

    aput p1, v1, v0

    sget-object p1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[D

    iget-object v1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟:[F

    array-length v3, v1

    add-int/2addr v3, v2

    new-array v3, v3, [D

    iput-object v3, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۤ:[D

    array-length v1, v1

    add-int/2addr v1, v2

    new-array v1, v1, [D

    iput-object v1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟ۥ:[D

    iget-object v1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟:[D

    aget-wide v3, v1, v0

    const-wide/16 v5, 0x0

    cmpl-double v1, v3, v5

    if-lez v1, :cond_0

    iget-object v1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟:LYue/ۥۣۡۤۦ;

    iget-object v3, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟۟:[F

    aget v3, v3, v0

    invoke-virtual {v1, v5, v6, v3}, LYue/ۥۣۡۤۦ;->ۥ(DF)V

    :cond_0
    iget-object v1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟:[D

    array-length v3, v1

    sub-int/2addr v3, v2

    aget-wide v4, v1, v3

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    cmpg-double v1, v4, v6

    if-gez v1, :cond_1

    iget-object v1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟:LYue/ۥۣۡۤۦ;

    iget-object v4, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟۟:[F

    aget v3, v4, v3

    invoke-virtual {v1, v6, v7, v3}, LYue/ۥۣۡۤۦ;->ۥ(DF)V

    :cond_1
    move v1, v0

    :goto_0
    array-length v3, p1

    if-ge v1, v3, :cond_3

    aget-object v3, p1, v1

    iget-object v4, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟۠:[F

    aget v4, v4, v1

    float-to-double v4, v4

    aput-wide v4, v3, v0

    move v3, v0

    :goto_1
    iget-object v4, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟:[F

    array-length v5, v4

    if-ge v3, v5, :cond_2

    aget-object v5, p1, v3

    aget v4, v4, v3

    float-to-double v6, v4

    aput-wide v6, v5, v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    iget-object v3, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟:LYue/ۥۣۡۤۦ;

    iget-object v4, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟:[D

    aget-wide v5, v4, v1

    iget-object v4, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟۟:[F

    aget v4, v4, v1

    invoke-virtual {v3, v5, v6, v4}, LYue/ۥۣۡۤۦ;->ۥ(DF)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    iget-object v1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟:LYue/ۥۣۡۤۦ;

    invoke-virtual {v1}, LYue/ۥۣۡۤۦ;->ۥ۟۟۟۠()V

    iget-object v1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥ۟۟۟:[D

    array-length v3, v1

    if-le v3, v2, :cond_4

    invoke-static {v0, v1, p1}, LYue/ۥ۟ۨ۟۠;->ۥ(I[D[[D)LYue/ۥ۟ۨ۟۠;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥۣ۟۟۟:LYue/ۥ۟ۨ۟۠;

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥ۠ۦۥۣ$ۥ۟۟۟;->ۥۣ۟۟۟:LYue/ۥ۟ۨ۟۠;

    :goto_2
    return-void
.end method
