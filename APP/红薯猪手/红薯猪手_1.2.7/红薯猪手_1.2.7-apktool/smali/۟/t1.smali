.class public final L۟/t1;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/h3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/h3<",
        "Landroid/widget/TextView;",
        "Landroid/app/AlertDialog;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    iput-object p2, p0, L۟/t1;->ۥ:Ljava/util/List;

    iput-object p1, p0, L۟/t1;->ۥ۟:Ljava/lang/String;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method

.method public static final ۥ۟۠(L۟/p8;Ljava/util/List;L۟/p8;Ljava/lang/String;L۟/q8;Landroid/app/AlertDialog;Landroid/widget/TextView;)V
    .locals 15
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u06df/p8;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "L\u06df/p8;",
            "Ljava/lang/String;",
            "L\u06df/q8<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/app/AlertDialog;",
            "Landroid/widget/TextView;",
            ")V"
        }
    .end annotation

    move-object v1, p0

    move-object/from16 v5, p1

    move-object/from16 v3, p2

    iget v0, v1, L۟/p8;->ۥ:I

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v9, 0x0

    const/4 v10, 0x6

    if-lt v0, v2, :cond_3

    iget v0, v3, L۟/p8;->ۥ:I

    const/16 v1, 0xd

    const/4 v2, 0x1

    if-gtz v0, :cond_1

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v2, :cond_0

    sget v0, L۟/o;->ۥ:I

    const/16 v0, 0x17

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    new-array v3, v10, [B

    fill-array-data v3, :array_1

    invoke-static {v0, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static/range {p3 .. p3}, L۟/w1;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, L۟/r2;->ۥ(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [B

    fill-array-data v1, :array_2

    new-array v3, v10, [B

    fill-array-data v3, :array_3

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_0

    :cond_0
    sget v0, L۟/o;->ۥ:I

    const/16 v0, 0x1d

    new-array v0, v0, [B

    fill-array-data v0, :array_4

    new-array v3, v10, [B

    fill-array-data v3, :array_5

    invoke-static {v0, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static/range {p3 .. p3}, L۟/w1;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, L۟/r2;->ۥ(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [B

    fill-array-data v1, :array_6

    new-array v3, v10, [B

    fill-array-data v3, :array_7

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_0

    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v2, :cond_2

    sget v0, L۟/o;->ۥ:I

    new-array v0, v1, [B

    fill-array-data v0, :array_8

    new-array v3, v10, [B

    fill-array-data v3, :array_9

    invoke-static {v0, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v4, p4

    iget-object v3, v4, L۟/q8;->ۥ:Ljava/lang/Object;

    invoke-static {v0, v3}, L۟/r2;->ۥ(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [B

    fill-array-data v1, :array_a

    new-array v3, v10, [B

    fill-array-data v3, :array_b

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    sget v0, L۟/o;->ۥ:I

    const/16 v0, 0x13

    new-array v0, v0, [B

    fill-array-data v0, :array_c

    new-array v4, v10, [B

    fill-array-data v4, :array_d

    invoke-static {v0, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v4

    iget v5, v3, L۟/p8;->ۥ:I

    sub-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, L۟/r2;->ۥ(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v4, 0x9

    new-array v4, v4, [B

    fill-array-data v4, :array_e

    new-array v5, v10, [B

    fill-array-data v5, :array_f

    invoke-static {v4, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v3, L۟/p8;->ۥ:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [B

    fill-array-data v1, :array_10

    new-array v3, v10, [B

    fill-array-data v3, :array_11

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-static {v1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v2, v0}, L۟/o;->ۥ۟ۨ(ILjava/lang/String;)V

    new-instance v0, L۟/t1$a;

    move-object/from16 v7, p5

    invoke-direct {v0, v7}, L۟/t1$a;-><init>(Landroid/app/AlertDialog;)V

    invoke-static {v0}, L۟/l3;->ۥۣ۟(L۟/g3;)V

    return-void

    :cond_3
    move-object/from16 v4, p4

    move-object/from16 v7, p5

    iget v0, v1, L۟/p8;->ۥ:I

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    invoke-static/range {p3 .. p3}, L۟/w1;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "h_"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v6, p3

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    new-instance v13, L۟/t1$b;

    move-object/from16 v8, p6

    invoke-direct {v13, v5, v8, p0}, L۟/t1$b;-><init>(Ljava/util/List;Landroid/widget/TextView;L۟/p8;)V

    new-instance v14, L۟/t1$c;

    move-object v0, v14

    move-object v1, p0

    move-object/from16 v2, p4

    move-object/from16 v3, p2

    move-object v4, v12

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v8}, L۟/t1$c;-><init>(L۟/p8;L۟/q8;L۟/p8;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroid/app/AlertDialog;Landroid/widget/TextView;)V

    const/4 v0, 0x7

    new-array v0, v0, [B

    fill-array-data v0, :array_12

    new-array v1, v10, [B

    fill-array-data v1, :array_13

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v11}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_14

    new-array v1, v10, [B

    fill-array-data v1, :array_15

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v12}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v0, 0xa

    new-array v0, v0, [B

    fill-array-data v0, :array_16

    new-array v1, v10, [B

    fill-array-data v1, :array_17

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    new-array v0, v10, [B

    fill-array-data v0, :array_18

    new-array v1, v10, [B

    fill-array-data v1, :array_19

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    sput-boolean v9, L۟/u6;->ۥ:Z

    sget-object v0, L۟/q;->ۥ۟:L۟/kb;

    invoke-static {}, L۟/q$c;->ۥ۟۟()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, L۟/t6;

    invoke-direct {v1, v11, v12, v13, v14}, L۟/t6;-><init>(Ljava/lang/String;Ljava/lang/String;L۟/t1$b;L۟/t1$c;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :array_0
    .array-data 1
        0x5at
        0x25t
        0x3dt
        -0x16t
        -0x7t
        -0xct
        0x5bt
        0x33t
        0x3at
        -0x1ct
        -0x15t
        -0x24t
        0x51t
        0x21t
        0x3at
        -0x16t
        -0xdt
        -0x1at
        0x5bt
        0x23t
        0x32t
        0x38t
        0x64t
    .end array-data

    :array_1
    .array-data 1
        -0x42t
        -0x63t
        -0x4at
        0x2t
        0x44t
        0x49t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x57t
        0x44t
        0x44t
        0xct
        -0x70t
        -0x18t
        0x4dt
        0x4ct
        0x3ft
        0x56t
        -0x34t
        -0x51t
        0xat
    .end array-data

    nop

    :array_3
    .array-data 1
        0x23t
        0x2bt
        0x17t
        0x78t
        -0x1et
        -0x7ft
    .end array-data

    nop

    :array_4
    .array-data 1
        0x42t
        -0x2bt
        0x71t
        -0x28t
        0x6ct
        0x43t
        0x43t
        -0x18t
        0x52t
        -0x27t
        0x52t
        0x56t
        0x42t
        -0x2t
        0x55t
        -0x29t
        0x40t
        0x7et
        0x48t
        -0x14t
        0x55t
        -0x27t
        0x58t
        0x44t
        0x42t
        -0x12t
        0x5dt
        0xbt
        -0x31t
    .end array-data

    nop

    :array_5
    .array-data 1
        -0x59t
        0x50t
        -0x27t
        0x31t
        -0x11t
        -0x15t
    .end array-data

    nop

    :array_6
    .array-data 1
        0x1et
        -0x7bt
        -0x37t
        0x57t
        -0x1et
        -0x6t
        0x4t
        -0x73t
        -0x4et
        0xdt
        -0x42t
        -0x43t
        0x43t
    .end array-data

    nop

    :array_7
    .array-data 1
        0x6at
        -0x16t
        -0x66t
        0x23t
        -0x70t
        -0x6dt
    .end array-data

    nop

    :array_8
    .array-data 1
        0x66t
        -0x4t
        0x79t
        0x4dt
        -0x4bt
        0x5bt
        0x67t
        -0x20t
        0x43t
        0x4dt
        -0x44t
        0x43t
        -0x48t
    .end array-data

    nop

    :array_9
    .array-data 1
        -0x7et
        0x44t
        -0xet
        -0x5bt
        0x8t
        -0x1at
    .end array-data

    nop

    :array_a
    .array-data 1
        0x3ct
        -0x33t
        -0x2ct
        0x67t
        -0x4bt
        0x59t
        0x26t
        -0x3bt
        -0x51t
        0x3dt
        -0x17t
        0x1et
        0x61t
    .end array-data

    nop

    :array_b
    .array-data 1
        0x48t
        -0x5et
        -0x79t
        0x13t
        -0x39t
        0x30t
    .end array-data

    nop

    :array_c
    .array-data 1
        -0x34t
        0x53t
        -0x2ct
        -0x62t
        -0x18t
        -0x21t
        -0x33t
        0x45t
        -0x2dt
        -0x70t
        -0x6t
        -0x9t
        0x4t
        0xdt
        -0x29t
        -0x1at
        -0x50t
        -0x18t
        -0x49t
    .end array-data

    :array_d
    .array-data 1
        0x28t
        -0x15t
        0x5ft
        0x76t
        0x55t
        0x62t
    .end array-data

    nop

    :array_e
    .array-data 1
        -0x6t
        0x2at
        -0x78t
        -0x3t
        0x7et
        -0x69t
        -0x3t
        0x22t
        -0x5ft
    .end array-data

    nop

    :array_f
    .array-data 1
        0x15t
        -0x6at
        0x4t
        0x18t
        -0x26t
        0x26t
    .end array-data

    nop

    :array_10
    .array-data 1
        -0x2t
        -0x1et
        0x3at
        0x51t
        0x43t
        0x26t
        -0x1ct
        -0x16t
        0x41t
        0xbt
        0x1ft
        0x61t
        -0x5dt
    .end array-data

    nop

    :array_11
    .array-data 1
        -0x76t
        -0x73t
        0x69t
        0x25t
        0x31t
        0x4ft
    .end array-data

    nop

    :array_12
    .array-data 1
        0x7at
        0x46t
        -0x20t
        -0x62t
        0x20t
        -0x45t
        0x72t
    .end array-data

    :array_13
    .array-data 1
        0x1et
        0x29t
        -0x69t
        -0x10t
        0x75t
        -0x37t
    .end array-data

    nop

    :array_14
    .array-data 1
        0x20t
        0x6ct
        -0x14t
        -0x7ft
        0x5t
        0x57t
        0x27t
        0x65t
    .end array-data

    :array_15
    .array-data 1
        0x53t
        0xdt
        -0x66t
        -0x1ct
        0x55t
        0x36t
    .end array-data

    nop

    :array_16
    .array-data 1
        0x6ft
        -0x1ft
        -0x62t
        -0x12t
        -0x1et
        0x4dt
        0x72t
        -0x16t
        -0x43t
        -0x11t
    .end array-data

    nop

    :array_17
    .array-data 1
        0x0t
        -0x71t
        -0x32t
        -0x64t
        -0x73t
        0x2at
    .end array-data

    nop

    :array_18
    .array-data 1
        -0x11t
        0x8t
        -0x53t
        0x3ct
        0x61t
        0x18t
    .end array-data

    nop

    :array_19
    .array-data 1
        -0x80t
        0x66t
        -0x17t
        0x53t
        0xft
        0x7dt
    .end array-data
.end method


# virtual methods
.method public final ۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Landroid/widget/TextView;

    .line 3
    .line 4
    move-object v5, p2

    .line 5
    check-cast v5, Landroid/app/AlertDialog;

    .line 6
    .line 7
    const/4 p1, 0x7

    .line 8
    new-array p1, p1, [B

    .line 9
    .line 10
    fill-array-data p1, :array_0

    .line 11
    .line 12
    .line 13
    const/4 p2, 0x6

    .line 14
    new-array v0, p2, [B

    .line 15
    .line 16
    fill-array-data v0, :array_1

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1, v6}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/16 p1, 0xb

    .line 27
    .line 28
    new-array p1, p1, [B

    .line 29
    .line 30
    fill-array-data p1, :array_2

    .line 31
    .line 32
    .line 33
    new-array p2, p2, [B

    .line 34
    .line 35
    fill-array-data p2, :array_3

    .line 36
    .line 37
    .line 38
    invoke-static {p1, p2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1, v5}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, L۟/p8;

    .line 46
    .line 47
    invoke-direct {v0}, L۟/p8;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v2, L۟/p8;

    .line 51
    .line 52
    invoke-direct {v2}, L۟/p8;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance v4, L۟/q8;

    .line 56
    .line 57
    invoke-direct {v4}, L۟/q8;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string p1, ""

    .line 61
    .line 62
    iput-object p1, v4, L۟/q8;->ۥ:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v1, p0, L۟/t1;->ۥ:Ljava/util/List;

    .line 65
    .line 66
    iget-object v3, p0, L۟/t1;->ۥ۟:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static/range {v0 .. v6}, L۟/t1;->ۥ۟۠(L۟/p8;Ljava/util/List;L۟/p8;Ljava/lang/String;L۟/q8;Landroid/app/AlertDialog;Landroid/widget/TextView;)V

    .line 69
    .line 70
    .line 71
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 72
    .line 73
    return-object p1

    .line 74
    nop

    .line 75
    :array_0
    .array-data 1
        0x38t
        -0x41t
        0x4bt
        0x3t
        0x6ft
        -0x46t
        0x3bt
    .end array-data

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    :array_1
    .array-data 1
        0x4ct
        -0x2at
        0x3bt
        0x55t
        0x6t
        -0x21t
    .end array-data

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    nop

    .line 91
    :array_2
    .array-data 1
        0x8t
        -0x42t
        -0x30t
        0x4ct
        0x5et
        0x23t
        0x0t
        -0x4dt
        -0x27t
        0x51t
        0x4dt
    .end array-data

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    :array_3
    .array-data 1
        0x69t
        -0x2et
        -0x4bt
        0x3et
        0x2at
        0x67t
    .end array-data
.end method
