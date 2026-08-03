.class public abstract LYue/ۥۢ۟ۧ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۧ;,
        LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۡ;,
        LYue/ۥۢ۟ۧ۟$ۥ۟;,
        LYue/ۥۢ۟ۧ۟$ۥ۟۟۠۟;,
        LYue/ۥۢ۟ۧ۟$ۥ۟۟۠;,
        LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۨ;,
        LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۦ;,
        LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۥ;,
        LYue/ۥۢ۟ۧ۟$ۥ۟۟۟;,
        LYue/ۥۢ۟ۧ۟$ۥ۟۟۟۠;,
        LYue/ۥۢ۟ۧ۟$ۥ۟۟۟۟;,
        LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۤ;,
        LYue/ۥۢ۟ۧ۟$ۥۣ۟۟۟;,
        LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۢ;,
        LYue/ۥۢ۟ۧ۟$ۥ;,
        LYue/ۥۢ۟ۧ۟$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟۠:Ljava/lang/String; = "SplineSet"


# instance fields
.field public ۥ:LYue/ۥ۟ۨ۟۠;

.field public ۥ۟:[I

.field public ۥ۟۟:[F

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    new-array v1, v0, [I

    iput-object v1, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟:[I

    new-array v0, v0, [F

    iput-object v0, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟:[F

    return-void
.end method

.method public static ۥ۟۟۟(Ljava/lang/String;Landroid/util/SparseArray;)LYue/ۥۢ۟ۧ۟;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/util/SparseArray<",
            "Landroidx/constraintlayout/widget/\u06e5\u06df;",
            ">;)",
            "LYue/\u06e5\u06e2\u06df\u06e7\u06df;"
        }
    .end annotation

    new-instance v0, LYue/ۥۢ۟ۧ۟$ۥ۟;

    invoke-direct {v0, p0, p1}, LYue/ۥۢ۟ۧ۟$ۥ۟;-><init>(Ljava/lang/String;Landroid/util/SparseArray;)V

    return-object v0
.end method

.method public static ۥ۟۟۟۟(Ljava/lang/String;)LYue/ۥۢ۟ۧ۟;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    const/4 v0, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "waveOffset"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v0, 0xf

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "alpha"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v0, 0xe

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "transitionPathRotate"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v0, 0xd

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "elevation"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v0, 0xc

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "rotation"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v0, 0xb

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "transformPivotY"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v0, 0xa

    goto/16 :goto_0

    :sswitch_6
    const-string v1, "transformPivotX"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v0, 0x9

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "waveVariesBy"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v0, 0x8

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "scaleY"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v0, 0x7

    goto :goto_0

    :sswitch_9
    const-string v1, "scaleX"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v0, 0x6

    goto :goto_0

    :sswitch_a
    const-string v1, "progress"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_0

    :cond_a
    const/4 v0, 0x5

    goto :goto_0

    :sswitch_b
    const-string v1, "translationZ"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto :goto_0

    :cond_b
    const/4 v0, 0x4

    goto :goto_0

    :sswitch_c
    const-string v1, "translationY"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto :goto_0

    :cond_c
    const/4 v0, 0x3

    goto :goto_0

    :sswitch_d
    const-string v1, "translationX"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto :goto_0

    :cond_d
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_e
    const-string v1, "rotationY"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto :goto_0

    :cond_e
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_f
    const-string v1, "rotationX"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto :goto_0

    :cond_f
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ;-><init>()V

    return-object p0

    :pswitch_1
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ;-><init>()V

    return-object p0

    :pswitch_2
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟;-><init>()V

    return-object p0

    :pswitch_3
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ۟۟;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ۟۟;-><init>()V

    return-object p0

    :pswitch_4
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۢ;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۢ;-><init>()V

    return-object p0

    :pswitch_5
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟۠;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟۠;-><init>()V

    return-object p0

    :pswitch_6
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟۟;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟۟;-><init>()V

    return-object p0

    :pswitch_7
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ;-><init>()V

    return-object p0

    :pswitch_8
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۦ;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۦ;-><init>()V

    return-object p0

    :pswitch_9
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۥ;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۥ;-><init>()V

    return-object p0

    :pswitch_a
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۡ;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۡ;-><init>()V

    return-object p0

    :pswitch_b
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ۟۟۠۟;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ۟۟۠۟;-><init>()V

    return-object p0

    :pswitch_c
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ۟۟۠;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ۟۟۠;-><init>()V

    return-object p0

    :pswitch_d
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۨ;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۨ;-><init>()V

    return-object p0

    :pswitch_e
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۤ;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۤ;-><init>()V

    return-object p0

    :pswitch_f
    new-instance p0, LYue/ۥۢ۟ۧ۟$ۥۣ۟۟۟;

    invoke-direct {p0}, LYue/ۥۢ۟ۧ۟$ۥۣ۟۟۟;-><init>()V

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4a771f66 -> :sswitch_f
        -0x4a771f65 -> :sswitch_e
        -0x490b9c39 -> :sswitch_d
        -0x490b9c38 -> :sswitch_c
        -0x490b9c37 -> :sswitch_b
        -0x3bab3dd3 -> :sswitch_a
        -0x3621dfb2 -> :sswitch_9
        -0x3621dfb1 -> :sswitch_8
        -0x2f893320 -> :sswitch_7
        -0x2d5a2d1e -> :sswitch_6
        -0x2d5a2d1d -> :sswitch_5
        -0x266f082 -> :sswitch_4
        -0x42d1a3 -> :sswitch_3
        0x2382115 -> :sswitch_2
        0x589b15e -> :sswitch_1
        0x94e04ec -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟۟۟:Ljava/lang/String;

    new-instance v1, Ljava/text/DecimalFormat;

    const-string v2, "##.##"

    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    :goto_0
    iget v3, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟۟:I

    if-ge v2, v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟:[I

    aget v0, v0, v2

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " , "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟:[F

    aget v0, v0, v2

    float-to-double v4, v0

    invoke-virtual {v1, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public ۥ(F)F
    .locals 3

    iget-object v0, p0, LYue/ۥۢ۟ۧ۟;->ۥ:LYue/ۥ۟ۨ۟۠;

    float-to-double v1, p1

    const/4 p1, 0x0

    invoke-virtual {v0, v1, v2, p1}, LYue/ۥ۟ۨ۟۠;->ۥ۟۟(DI)D

    move-result-wide v0

    double-to-float p1, v0

    return p1
.end method

.method public ۥ۟()LYue/ۥ۟ۨ۟۠;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۧ۟;->ۥ:LYue/ۥ۟ۨ۟۠;

    return-object v0
.end method

.method public ۥ۟۟(F)F
    .locals 3

    iget-object v0, p0, LYue/ۥۢ۟ۧ۟;->ۥ:LYue/ۥ۟ۨ۟۠;

    float-to-double v1, p1

    const/4 p1, 0x0

    invoke-virtual {v0, v1, v2, p1}, LYue/ۥ۟ۨ۟۠;->ۥ۟۟۟۠(DI)D

    move-result-wide v0

    double-to-float p1, v0

    return p1
.end method

.method public ۥ۟۟۟۠(IF)V
    .locals 3

    iget-object v0, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟:[I

    array-length v1, v0

    iget v2, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟۟:I

    add-int/lit8 v2, v2, 0x1

    if-ge v1, v2, :cond_0

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟:[I

    iget-object v0, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟:[F

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟:[F

    :cond_0
    iget-object v0, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟:[I

    iget v1, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟۟:I

    aput p1, v0, v1

    iget-object p1, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟:[F

    aput p2, p1, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟۟:I

    return-void
.end method

.method public abstract ۥ۟۟۟ۡ(Landroid/view/View;F)V
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟۟۟:Ljava/lang/String;

    return-void
.end method

.method public ۥۣ۟۟۟(I)V
    .locals 9

    iget v0, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟۟:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟:[I

    iget-object v2, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟:[F

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    const/4 v4, 0x0

    invoke-static {v1, v2, v4, v0}, LYue/ۥۢ۟ۧ۟$ۥ۟۟۟ۧ;->ۥ([I[FII)V

    move v0, v3

    move v1, v0

    :goto_0
    iget v2, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟۟:I

    if-ge v0, v2, :cond_2

    iget-object v2, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟:[I

    add-int/lit8 v5, v0, -0x1

    aget v5, v2, v5

    aget v2, v2, v0

    if-eq v5, v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    new-array v0, v1, [D

    const/4 v2, 0x2

    new-array v2, v2, [I

    aput v3, v2, v3

    aput v1, v2, v4

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[D

    move v2, v4

    move v3, v2

    :goto_1
    iget v5, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟۟:I

    if-ge v2, v5, :cond_4

    if-lez v2, :cond_3

    iget-object v5, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟:[I

    aget v6, v5, v2

    add-int/lit8 v7, v2, -0x1

    aget v5, v5, v7

    if-ne v6, v5, :cond_3

    goto :goto_2

    :cond_3
    iget-object v5, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟:[I

    aget v5, v5, v2

    int-to-double v5, v5

    const-wide v7, 0x3f847ae147ae147bL    # 0.01

    mul-double/2addr v5, v7

    aput-wide v5, v0, v3

    aget-object v5, v1, v3

    iget-object v6, p0, LYue/ۥۢ۟ۧ۟;->ۥ۟۟:[F

    aget v6, v6, v2

    float-to-double v6, v6

    aput-wide v6, v5, v4

    add-int/lit8 v3, v3, 0x1

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    invoke-static {p1, v0, v1}, LYue/ۥ۟ۨ۟۠;->ۥ(I[D[[D)LYue/ۥ۟ۨ۟۠;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۢ۟ۧ۟;->ۥ:LYue/ۥ۟ۨ۟۠;

    return-void
.end method
