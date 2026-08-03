.class public abstract LYue/ۥۣۢۡۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۢۡۥ$ۥ۟۟۟ۥ;,
        LYue/ۥۣۢۡۥ$ۥ۟۟۟۟;,
        LYue/ۥۣۢۡۥ$ۥ۟;,
        LYue/ۥۣۢۡۥ$ۥ۟۟۟ۨ;,
        LYue/ۥۣۢۡۥ$ۥ۟۟۟ۧ;,
        LYue/ۥۣۢۡۥ$ۥ۟۟۟ۦ;,
        LYue/ۥۣۢۡۥ$ۥ۟۟۟ۤ;,
        LYue/ۥۣۢۡۥ$ۥۣ۟۟۟;,
        LYue/ۥۣۢۡۥ$ۥ۟۟۟;,
        LYue/ۥۣۢۡۥ$ۥ۟۟۟ۢ;,
        LYue/ۥۣۢۡۥ$ۥ۟۟۟ۡ;,
        LYue/ۥۣۢۡۥ$ۥ۟۟۟۠;,
        LYue/ۥۣۢۡۥ$ۥ;,
        LYue/ۥۣۢۡۥ$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۥ:Ljava/lang/String; = "SplineSet"

.field public static final ۥ۟۟۟ۦ:I = 0x0

.field public static final ۥ۟۟۟ۧ:I = 0x1

.field public static final ۥ۟۟۟ۨ:I = 0x2

.field public static ۥ۟۟۠:F = 6.2831855f


# instance fields
.field public ۥ:LYue/ۥ۟ۨ۟۠;

.field public ۥ۟:I

.field public ۥ۟۟:[I

.field public ۥ۟۟۟:[[F

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:Ljava/lang/String;

.field public ۥ۟۟۟ۡ:[F

.field public ۥ۟۟۟ۢ:Z

.field public ۥۣ۟۟۟:J

.field public ۥ۟۟۟ۤ:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۣۢۡۥ;->ۥ۟:I

    const/16 v1, 0xa

    new-array v2, v1, [I

    iput-object v2, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟:[I

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x1

    const/4 v4, 0x3

    aput v4, v2, v3

    aput v1, v2, v0

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[F

    iput-object v1, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟:[[F

    new-array v1, v4, [F

    iput-object v1, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۡ:[F

    iput-boolean v0, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۢ:Z

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۤ:F

    return-void
.end method

.method public static ۥ۟۟۟(Ljava/lang/String;Landroid/util/SparseArray;)LYue/ۥۣۢۡۥ;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/util/SparseArray<",
            "Landroidx/constraintlayout/widget/\u06e5\u06df;",
            ">;)",
            "LYue/\u06e5\u06e2\u06e1\u06e3\u06e5;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣۢۡۥ$ۥ۟;

    invoke-direct {v0, p0, p1}, LYue/ۥۣۢۡۥ$ۥ۟;-><init>(Ljava/lang/String;Landroid/util/SparseArray;)V

    return-object v0
.end method

.method public static ۥ۟۟۟۟(Ljava/lang/String;J)LYue/ۥۣۢۡۥ;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    const/4 v0, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "alpha"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v0, 0xb

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "transitionPathRotate"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v0, 0xa

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "elevation"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v0, 0x9

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "rotation"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v0, 0x8

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "scaleY"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x7

    goto :goto_0

    :sswitch_5
    const-string v1, "scaleX"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v0, 0x6

    goto :goto_0

    :sswitch_6
    const-string v1, "progress"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v0, 0x5

    goto :goto_0

    :sswitch_7
    const-string v1, "translationZ"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v0, 0x4

    goto :goto_0

    :sswitch_8
    const-string v1, "translationY"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v0, 0x3

    goto :goto_0

    :sswitch_9
    const-string v1, "translationX"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_a
    const-string v1, "rotationY"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_0

    :cond_a
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_b
    const-string v1, "rotationX"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto :goto_0

    :cond_b
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    new-instance p0, LYue/ۥۣۢۡۥ$ۥ;

    invoke-direct {p0}, LYue/ۥۣۢۡۥ$ۥ;-><init>()V

    goto :goto_1

    :pswitch_1
    new-instance p0, LYue/ۥۣۢۡۥ$ۥ۟۟۟;

    invoke-direct {p0}, LYue/ۥۣۢۡۥ$ۥ۟۟۟;-><init>()V

    goto :goto_1

    :pswitch_2
    new-instance p0, LYue/ۥۣۢۡۥ$ۥ۟۟;

    invoke-direct {p0}, LYue/ۥۣۢۡۥ$ۥ۟۟;-><init>()V

    goto :goto_1

    :pswitch_3
    new-instance p0, LYue/ۥۣۢۡۥ$ۥ۟۟۟۠;

    invoke-direct {p0}, LYue/ۥۣۢۡۥ$ۥ۟۟۟۠;-><init>()V

    goto :goto_1

    :pswitch_4
    new-instance p0, LYue/ۥۣۢۡۥ$ۥ۟۟۟ۤ;

    invoke-direct {p0}, LYue/ۥۣۢۡۥ$ۥ۟۟۟ۤ;-><init>()V

    goto :goto_1

    :pswitch_5
    new-instance p0, LYue/ۥۣۢۡۥ$ۥۣ۟۟۟;

    invoke-direct {p0}, LYue/ۥۣۢۡۥ$ۥۣ۟۟۟;-><init>()V

    goto :goto_1

    :pswitch_6
    new-instance p0, LYue/ۥۣۢۡۥ$ۥ۟۟۟۟;

    invoke-direct {p0}, LYue/ۥۣۢۡۥ$ۥ۟۟۟۟;-><init>()V

    goto :goto_1

    :pswitch_7
    new-instance p0, LYue/ۥۣۢۡۥ$ۥ۟۟۟ۨ;

    invoke-direct {p0}, LYue/ۥۣۢۡۥ$ۥ۟۟۟ۨ;-><init>()V

    goto :goto_1

    :pswitch_8
    new-instance p0, LYue/ۥۣۢۡۥ$ۥ۟۟۟ۧ;

    invoke-direct {p0}, LYue/ۥۣۢۡۥ$ۥ۟۟۟ۧ;-><init>()V

    goto :goto_1

    :pswitch_9
    new-instance p0, LYue/ۥۣۢۡۥ$ۥ۟۟۟ۦ;

    invoke-direct {p0}, LYue/ۥۣۢۡۥ$ۥ۟۟۟ۦ;-><init>()V

    goto :goto_1

    :pswitch_a
    new-instance p0, LYue/ۥۣۢۡۥ$ۥ۟۟۟ۢ;

    invoke-direct {p0}, LYue/ۥۣۢۡۥ$ۥ۟۟۟ۢ;-><init>()V

    goto :goto_1

    :pswitch_b
    new-instance p0, LYue/ۥۣۢۡۥ$ۥ۟۟۟ۡ;

    invoke-direct {p0}, LYue/ۥۣۢۡۥ$ۥ۟۟۟ۡ;-><init>()V

    :goto_1
    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۢ(J)V

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x4a771f66 -> :sswitch_b
        -0x4a771f65 -> :sswitch_a
        -0x490b9c39 -> :sswitch_9
        -0x490b9c38 -> :sswitch_8
        -0x490b9c37 -> :sswitch_7
        -0x3bab3dd3 -> :sswitch_6
        -0x3621dfb2 -> :sswitch_5
        -0x3621dfb1 -> :sswitch_4
        -0x266f082 -> :sswitch_3
        -0x42d1a3 -> :sswitch_2
        0x2382115 -> :sswitch_1
        0x589b15e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 4

    iget-object v0, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟۠:Ljava/lang/String;

    new-instance v1, Ljava/text/DecimalFormat;

    const-string v2, "##.##"

    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    :goto_0
    iget v3, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟۟:I

    if-ge v2, v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟:[I

    aget v0, v0, v2

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " , "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟:[[F

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

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

    iget v0, p0, LYue/ۥۣۢۡۥ;->ۥ۟:I

    const/high16 v1, 0x40000000    # 2.0f

    const/high16 v2, 0x3f800000    # 1.0f

    packed-switch v0, :pswitch_data_0

    sget v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۠:F

    mul-float/2addr p1, v0

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1

    :pswitch_0
    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr p1, v0

    rem-float/2addr p1, v0

    sub-float/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sub-float p1, v2, p1

    mul-float/2addr p1, p1

    :goto_0
    sub-float/2addr v2, p1

    return v2

    :pswitch_1
    sget v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۠:F

    mul-float/2addr p1, v0

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1

    :pswitch_2
    mul-float/2addr p1, v1

    add-float/2addr p1, v2

    rem-float/2addr p1, v1

    goto :goto_0

    :pswitch_3
    mul-float/2addr p1, v1

    add-float/2addr p1, v2

    rem-float/2addr p1, v1

    sub-float/2addr p1, v2

    return p1

    :pswitch_4
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    goto :goto_0

    :pswitch_5
    sget v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۠:F

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ۥ۟(FJLandroid/view/View;LYue/ۥ۠ۦۥۡ;)F
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    iget-object v5, v0, LYue/ۥۣۢۡۥ;->ۥ:LYue/ۥ۟ۨ۟۠;

    move/from16 v6, p1

    float-to-double v6, v6

    iget-object v8, v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۡ:[F

    invoke-virtual {v5, v6, v7, v8}, LYue/ۥ۟ۨ۟۠;->ۥ۟۟۟۟(D[F)V

    iget-object v5, v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۡ:[F

    const/4 v6, 0x1

    aget v7, v5, v6

    const/4 v8, 0x0

    cmpl-float v9, v7, v8

    const/4 v10, 0x2

    const/4 v11, 0x0

    if-nez v9, :cond_0

    iput-boolean v11, v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۢ:Z

    aget v1, v5, v10

    return v1

    :cond_0
    iget v5, v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۤ:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟۠:Ljava/lang/String;

    invoke-virtual {v4, v3, v5, v11}, LYue/ۥ۠ۦۥۡ;->ۥ(Ljava/lang/Object;Ljava/lang/String;I)F

    move-result v5

    iput v5, v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۤ:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_1

    iput v8, v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۤ:F

    :cond_1
    iget-wide v12, v0, LYue/ۥۣۢۡۥ;->ۥۣ۟۟۟:J

    sub-long v12, v1, v12

    iget v5, v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۤ:F

    float-to-double v14, v5

    long-to-double v12, v12

    const-wide v16, 0x3e112e0be826d695L    # 1.0E-9

    mul-double v12, v12, v16

    float-to-double v6, v7

    mul-double/2addr v12, v6

    add-double/2addr v14, v12

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    rem-double/2addr v14, v5

    double-to-float v5, v14

    iput v5, v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۤ:F

    iget-object v6, v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟۠:Ljava/lang/String;

    invoke-virtual {v4, v3, v6, v11, v5}, LYue/ۥ۠ۦۥۡ;->ۥ۟(Ljava/lang/Object;Ljava/lang/String;IF)V

    iput-wide v1, v0, LYue/ۥۣۢۡۥ;->ۥۣ۟۟۟:J

    iget-object v1, v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۡ:[F

    aget v1, v1, v11

    iget v2, v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۤ:F

    invoke-virtual {v0, v2}, LYue/ۥۣۢۡۥ;->ۥ(F)F

    move-result v2

    iget-object v3, v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۡ:[F

    aget v3, v3, v10

    mul-float/2addr v2, v1

    add-float/2addr v2, v3

    cmpl-float v1, v1, v8

    if-nez v1, :cond_3

    if-eqz v9, :cond_2

    goto :goto_0

    :cond_2
    move v6, v11

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v6, 0x1

    :goto_1
    iput-boolean v6, v0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۢ:Z

    return v2
.end method

.method public ۥ۟۟()LYue/ۥ۟ۨ۟۠;
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۡۥ;->ۥ:LYue/ۥ۟ۨ۟۠;

    return-object v0
.end method

.method public ۥ۟۟۟۠(IFFIF)V
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟:[I

    iget v1, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟۟:I

    aput p1, v0, v1

    iget-object p1, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟:[[F

    aget-object p1, p1, v1

    const/4 v0, 0x0

    aput p2, p1, v0

    const/4 p2, 0x1

    aput p3, p1, p2

    const/4 p3, 0x2

    aput p5, p1, p3

    iget p1, p0, LYue/ۥۣۢۡۥ;->ۥ۟:I

    invoke-static {p1, p4}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, LYue/ۥۣۢۡۥ;->ۥ۟:I

    iget p1, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟۟:I

    add-int/2addr p1, p2

    iput p1, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟۟:I

    return-void
.end method

.method public abstract ۥ۟۟۟ۡ(Landroid/view/View;FJLYue/ۥ۠ۦۥۡ;)Z
.end method

.method public ۥ۟۟۟ۢ(J)V
    .locals 0

    iput-wide p1, p0, LYue/ۥۣۢۡۥ;->ۥۣ۟۟۟:J

    return-void
.end method

.method public ۥۣ۟۟۟(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟۠:Ljava/lang/String;

    return-void
.end method

.method public ۥ۟۟۟ۤ(I)V
    .locals 11

    iget v0, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟۟:I

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error no points added to "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟۠:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SplineSet"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v1, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟:[I

    iget-object v2, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟:[[F

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    const/4 v4, 0x0

    invoke-static {v1, v2, v4, v0}, LYue/ۥۣۢۡۥ$ۥ۟۟۟ۥ;->ۥ([I[[FII)V

    move v0, v3

    move v1, v4

    :goto_0
    iget-object v2, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟:[I

    array-length v5, v2

    if-ge v0, v5, :cond_2

    aget v5, v2, v0

    add-int/lit8 v6, v0, -0x1

    aget v2, v2, v6

    if-eq v5, v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    move v1, v3

    :cond_3
    new-array v0, v1, [D

    const/4 v2, 0x2

    new-array v5, v2, [I

    const/4 v6, 0x3

    aput v6, v5, v3

    aput v1, v5, v4

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[D

    move v5, v4

    move v6, v5

    :goto_1
    iget v7, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟۟:I

    if-ge v5, v7, :cond_5

    if-lez v5, :cond_4

    iget-object v7, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟:[I

    aget v8, v7, v5

    add-int/lit8 v9, v5, -0x1

    aget v7, v7, v9

    if-ne v8, v7, :cond_4

    goto :goto_2

    :cond_4
    iget-object v7, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟:[I

    aget v7, v7, v5

    int-to-double v7, v7

    const-wide v9, 0x3f847ae147ae147bL    # 0.01

    mul-double/2addr v7, v9

    aput-wide v7, v0, v6

    aget-object v7, v1, v6

    iget-object v8, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟:[[F

    aget-object v8, v8, v5

    aget v9, v8, v4

    float-to-double v9, v9

    aput-wide v9, v7, v4

    aget v9, v8, v3

    float-to-double v9, v9

    aput-wide v9, v7, v3

    aget v8, v8, v2

    float-to-double v8, v8

    aput-wide v8, v7, v2

    add-int/lit8 v6, v6, 0x1

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    invoke-static {p1, v0, v1}, LYue/ۥ۟ۨ۟۠;->ۥ(I[D[[D)LYue/ۥ۟ۨ۟۠;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣۢۡۥ;->ۥ:LYue/ۥ۟ۨ۟۠;

    return-void
.end method
