.class public final Lef/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final m:Lmh/b;

.field public static n:I


# instance fields
.field public final a:B

.field public final b:B

.field public final c:B

.field public final d:B

.field public final e:B

.field public final f:B

.field public final g:S

.field public final h:S

.field public final i:S

.field public final j:B

.field public final k:Z

.field public final l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lef/a;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lef/a;->m:Lmh/b;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    sput v0, Lef/a;->n:I

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(SS[C[CBBIBBBBSSSBBSSS[C[CBBI)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p8

    move/from16 v7, p9

    move/from16 v8, p15

    move/from16 v9, p17

    move/from16 v10, p18

    move-object/from16 v12, p20

    move-object/from16 v13, p21

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v15, 0x3

    const/16 v16, 0x0

    .line 2
    sget-object v14, Lef/a;->m:Lmh/b;

    if-ltz v4, :cond_1

    if-le v4, v15, :cond_0

    goto :goto_0

    :cond_0
    move/from16 v11, v16

    goto :goto_1

    .line 3
    :cond_1
    :goto_0
    const-string v11, "Invalid orientation value: {}"

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    invoke-interface {v14, v4, v11}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v4, v16

    const/4 v11, 0x1

    :goto_1
    if-ltz v5, :cond_2

    if-le v5, v15, :cond_3

    .line 4
    :cond_2
    const-string v11, "Invalid touchscreen value: {}"

    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v5

    invoke-interface {v14, v5, v11}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v5, v16

    const/4 v11, 0x1

    :cond_3
    const/4 v15, -0x1

    move/from16 p5, v11

    move/from16 v11, p7

    if-ge v11, v15, :cond_4

    .line 5
    const-string v15, "Invalid density value: {}"

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v14, v11, v15}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v11, v16

    const/4 v15, 0x1

    goto :goto_2

    :cond_4
    move/from16 v15, p5

    :goto_2
    if-ltz v6, :cond_5

    move/from16 p5, v15

    const/4 v15, 0x3

    if-le v6, v15, :cond_6

    .line 6
    :cond_5
    const-string v15, "Invalid keyboard value: {}"

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {v14, v6, v15}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v6, v16

    const/16 p5, 0x1

    :cond_6
    const/4 v15, 0x4

    if-ltz v7, :cond_8

    if-le v7, v15, :cond_7

    goto :goto_3

    :cond_7
    move/from16 v14, p5

    goto :goto_4

    .line 7
    :cond_8
    :goto_3
    const-string v15, "Invalid navigation value: {}"

    invoke-static {v7}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v7

    invoke-interface {v14, v7, v15}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v7, v16

    const/4 v14, 0x1

    :goto_4
    if-eqz v12, :cond_9

    .line 8
    array-length v15, v12

    if-eqz v15, :cond_9

    .line 9
    aget-char v15, v12, v16

    if-nez v15, :cond_a

    :cond_9
    const/4 v12, 0x0

    :cond_a
    if-eqz v13, :cond_b

    .line 10
    array-length v15, v13

    if-eqz v15, :cond_b

    .line 11
    aget-char v15, v13, v16

    if-nez v15, :cond_c

    :cond_b
    const/4 v13, 0x0

    .line 12
    :cond_c
    iput-byte v4, v0, Lef/a;->a:B

    .line 13
    iput-byte v5, v0, Lef/a;->b:B

    .line 14
    iput-byte v6, v0, Lef/a;->c:B

    .line 15
    iput-byte v7, v0, Lef/a;->d:B

    move/from16 v4, p10

    .line 16
    iput-byte v4, v0, Lef/a;->e:B

    move/from16 v4, p11

    .line 17
    iput-byte v4, v0, Lef/a;->f:B

    move/from16 v4, p12

    .line 18
    iput-short v4, v0, Lef/a;->g:S

    move/from16 v4, p13

    .line 19
    iput-short v4, v0, Lef/a;->h:S

    move/from16 v4, p14

    .line 20
    iput-short v4, v0, Lef/a;->i:S

    move/from16 v4, p22

    .line 21
    iput-byte v4, v0, Lef/a;->j:B

    .line 22
    iput-boolean v14, v0, Lef/a;->k:Z

    .line 23
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    const-string v5, "-mnc"

    const/16 v6, 0x20

    if-eqz p1, :cond_10

    .line 25
    const-string v7, "-mcc"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p1 .. p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const-string v14, "%03d"

    invoke-static {v14, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v7, -0x1

    if-eq v1, v7, :cond_f

    if-eqz v1, :cond_11

    .line 26
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v5, p24

    if-gt v5, v6, :cond_e

    if-lez v1, :cond_d

    const/16 v5, 0xa

    if-ge v1, v5, :cond_d

    .line 27
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v5, "%02d"

    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 28
    :cond_d
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v14, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 29
    :cond_e
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 30
    :cond_f
    const-string v1, "-mnc00"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_10
    if-eqz v1, :cond_11

    .line 31
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    :cond_11
    :goto_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v5, 0x2d

    const/4 v7, 0x2

    if-nez v13, :cond_13

    if-nez v12, :cond_13

    .line 33
    aget-char v14, v3, v16

    if-nez v14, :cond_12

    aget-char v14, v2, v16

    if-eqz v14, :cond_13

    :cond_12
    array-length v14, v3

    const/4 v15, 0x3

    if-eq v14, v15, :cond_13

    .line 34
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    .line 35
    aget-char v2, v3, v16

    if-eqz v2, :cond_1a

    .line 36
    const-string v2, "-r"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    goto :goto_7

    .line 37
    :cond_13
    aget-char v14, v2, v16

    if-nez v14, :cond_14

    aget-char v14, v3, v16

    if-nez v14, :cond_14

    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_8

    .line 39
    :cond_14
    const-string v14, "-b+"

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    aget-char v14, v2, v16

    if-eqz v14, :cond_15

    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    :cond_15
    const/16 v2, 0x2b

    if-eqz v12, :cond_16

    .line 42
    array-length v14, v12

    const/4 v15, 0x4

    if-ne v14, v15, :cond_16

    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    .line 44
    :cond_16
    array-length v12, v3

    if-eq v12, v7, :cond_17

    array-length v12, v3

    const/4 v15, 0x3

    if-ne v12, v15, :cond_18

    :cond_17
    aget-char v12, v3, v16

    if-eqz v12, :cond_18

    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    :cond_18
    if-eqz v13, :cond_1a

    .line 46
    array-length v3, v13

    const/4 v12, 0x5

    if-lt v3, v12, :cond_1a

    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    array-length v3, v13

    move/from16 v12, v16

    :goto_6
    if-ge v12, v3, :cond_19

    aget-char v14, v13, v12

    .line 50
    invoke-static {v14}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v14

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v12, v12, 0x1

    goto :goto_6

    .line 51
    :cond_19
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    :cond_1a
    :goto_7
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 54
    :goto_8
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    iget-byte v1, v0, Lef/a;->f:B

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1d

    if-eq v1, v7, :cond_1c

    const/4 v15, 0x3

    if-eq v1, v15, :cond_1b

    goto :goto_9

    .line 56
    :cond_1b
    const-string v1, "-masculine"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_9

    .line 57
    :cond_1c
    const-string v1, "-feminine"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_9

    .line 58
    :cond_1d
    const-string v1, "-neuter"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_9
    and-int/lit16 v1, v8, 0xc0

    const/16 v2, 0x40

    if-eq v1, v2, :cond_1f

    const/16 v2, 0x80

    if-eq v1, v2, :cond_1e

    goto :goto_a

    .line 59
    :cond_1e
    const-string v1, "-ldrtl"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_a

    .line 60
    :cond_1f
    const-string v1, "-ldltr"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    :goto_a
    const-string v1, "dp"

    if-eqz v9, :cond_20

    .line 62
    const-string v2, "-sw"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_20
    if-eqz v10, :cond_21

    .line 63
    const-string v2, "-w"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_21
    if-eqz p19, :cond_22

    .line 64
    const-string v2, "-h"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v2, p19

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_b

    :cond_22
    move/from16 v2, p19

    :goto_b
    and-int/lit8 v1, v8, 0xf

    const/4 v3, 0x1

    if-eq v1, v3, :cond_26

    if-eq v1, v7, :cond_25

    const/4 v15, 0x3

    if-eq v1, v15, :cond_24

    const/4 v15, 0x4

    if-eq v1, v15, :cond_23

    goto :goto_c

    .line 65
    :cond_23
    const-string v1, "-xlarge"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_c

    .line 66
    :cond_24
    const-string v1, "-large"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_c

    .line 67
    :cond_25
    const-string v1, "-normal"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_c

    .line 68
    :cond_26
    const-string v1, "-small"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_c
    and-int/lit8 v1, v8, 0x30

    const/16 v3, 0x10

    if-eq v1, v3, :cond_28

    if-eq v1, v6, :cond_27

    goto :goto_d

    .line 69
    :cond_27
    const-string v1, "-long"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_d

    .line 70
    :cond_28
    const-string v1, "-notlong"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    :goto_d
    iget-byte v1, v0, Lef/a;->j:B

    const/16 v17, 0x3

    and-int/lit8 v1, v1, 0x3

    const/4 v12, 0x1

    if-eq v1, v12, :cond_2a

    if-eq v1, v7, :cond_29

    goto :goto_e

    .line 72
    :cond_29
    const-string v1, "-round"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_e

    .line 73
    :cond_2a
    const-string v1, "-notround"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_e
    and-int/lit8 v1, p23, 0xc

    const/16 v12, 0x8

    const/4 v15, 0x4

    if-eq v1, v15, :cond_2c

    if-eq v1, v12, :cond_2b

    :goto_f
    const/16 v17, 0x3

    goto :goto_10

    .line 74
    :cond_2b
    const-string v13, "-highdr"

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    .line 75
    :cond_2c
    const-string v13, "-lowdr"

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    :goto_10
    and-int/lit8 v13, p23, 0x3

    const/4 v14, 0x1

    if-eq v13, v14, :cond_2e

    if-eq v13, v7, :cond_2d

    goto :goto_11

    .line 76
    :cond_2d
    const-string v15, "-widecg"

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_11

    .line 77
    :cond_2e
    const-string v15, "-nowidecg"

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    :goto_11
    iget-byte v15, v0, Lef/a;->a:B

    if-eq v15, v14, :cond_31

    if-eq v15, v7, :cond_30

    const/4 v14, 0x3

    if-eq v15, v14, :cond_2f

    goto :goto_12

    .line 79
    :cond_2f
    const-string v14, "-square"

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_12

    .line 80
    :cond_30
    const-string v14, "-land"

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_12

    .line 81
    :cond_31
    const-string v14, "-port"

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_12
    and-int/lit8 v14, p16, 0xf

    packed-switch v14, :pswitch_data_0

    :pswitch_0
    goto :goto_13

    .line 82
    :pswitch_1
    const-string v15, "-hugeui"

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_13

    .line 83
    :pswitch_2
    const-string v15, "-largeui"

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_13

    .line 84
    :pswitch_3
    const-string v15, "-mediumui"

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_13

    .line 85
    :pswitch_4
    const-string v15, "-smallui"

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_13

    .line 86
    :pswitch_5
    const-string v15, "-godzillaui"

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_13

    .line 87
    :pswitch_6
    const-string v15, "-vrheadset"

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_13

    .line 88
    :pswitch_7
    const-string v15, "-watch"

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_13

    .line 89
    :pswitch_8
    const-string v15, "-appliance"

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_13

    .line 90
    :pswitch_9
    const-string v15, "-television"

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_13

    .line 91
    :pswitch_a
    const-string v15, "-car"

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_13

    .line 92
    :pswitch_b
    const-string v15, "-desk"

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_13
    and-int/lit8 v15, p16, 0x30

    if-eq v15, v3, :cond_33

    if-eq v15, v6, :cond_32

    goto :goto_14

    .line 93
    :cond_32
    const-string v3, "-night"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_14

    .line 94
    :cond_33
    const-string v3, "-notnight"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_14
    if-eqz v11, :cond_3b

    const/16 v3, 0x78

    if-eq v11, v3, :cond_3a

    const/16 v3, 0xa0

    if-eq v11, v3, :cond_39

    const/16 v3, 0xd5

    if-eq v11, v3, :cond_38

    const/16 v3, 0xf0

    if-eq v11, v3, :cond_37

    const/16 v3, 0x140

    if-eq v11, v3, :cond_36

    const/16 v3, 0x1e0

    if-eq v11, v3, :cond_35

    const/16 v3, 0x280

    if-eq v11, v3, :cond_34

    packed-switch v11, :pswitch_data_1

    .line 95
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "dpi"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_15

    .line 96
    :pswitch_c
    const-string v3, "-nodpi"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_15

    .line 97
    :pswitch_d
    const-string v3, "-anydpi"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_15

    .line 98
    :cond_34
    const-string v3, "-xxxhdpi"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_15

    .line 99
    :cond_35
    const-string v3, "-xxhdpi"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_15

    .line 100
    :cond_36
    const-string v3, "-xhdpi"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_15

    .line 101
    :cond_37
    const-string v3, "-hdpi"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_15

    .line 102
    :cond_38
    const-string v3, "-tvdpi"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_15

    .line 103
    :cond_39
    const-string v3, "-mdpi"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_15

    .line 104
    :cond_3a
    const-string v3, "-ldpi"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    :cond_3b
    :goto_15
    iget-byte v3, v0, Lef/a;->b:B

    const/4 v5, 0x1

    if-eq v3, v5, :cond_3e

    if-eq v3, v7, :cond_3d

    const/4 v15, 0x3

    if-eq v3, v15, :cond_3c

    goto :goto_16

    .line 106
    :cond_3c
    const-string v3, "-finger"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_16

    .line 107
    :cond_3d
    const-string v3, "-stylus"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_16

    .line 108
    :cond_3e
    const-string v3, "-notouch"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    :goto_16
    iget-byte v3, v0, Lef/a;->e:B

    const/4 v15, 0x3

    and-int/2addr v3, v15

    const/4 v5, 0x1

    if-eq v3, v5, :cond_41

    if-eq v3, v7, :cond_40

    if-eq v3, v15, :cond_3f

    goto :goto_17

    .line 110
    :cond_3f
    const-string v3, "-keyssoft"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_17

    .line 111
    :cond_40
    const-string v3, "-keyshidden"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_17

    .line 112
    :cond_41
    const-string v3, "-keysexposed"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    :goto_17
    iget-byte v3, v0, Lef/a;->c:B

    const/4 v5, 0x1

    if-eq v3, v5, :cond_44

    if-eq v3, v7, :cond_43

    const/4 v15, 0x3

    if-eq v3, v15, :cond_42

    goto :goto_18

    .line 114
    :cond_42
    const-string v3, "-12key"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_18

    .line 115
    :cond_43
    const-string v3, "-qwerty"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_18

    .line 116
    :cond_44
    const-string v3, "-nokeys"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    :goto_18
    iget-byte v3, v0, Lef/a;->e:B

    and-int/lit8 v3, v3, 0xc

    const/4 v15, 0x4

    if-eq v3, v15, :cond_46

    if-eq v3, v12, :cond_45

    goto :goto_19

    .line 118
    :cond_45
    const-string v3, "-navhidden"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_19

    .line 119
    :cond_46
    const-string v3, "-navexposed"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    :goto_19
    iget-byte v3, v0, Lef/a;->d:B

    const/4 v5, 0x1

    if-eq v3, v5, :cond_4a

    if-eq v3, v7, :cond_49

    const/4 v15, 0x3

    if-eq v3, v15, :cond_48

    const/4 v15, 0x4

    if-eq v3, v15, :cond_47

    goto :goto_1a

    .line 121
    :cond_47
    const-string v3, "-wheel"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1a

    :cond_48
    const/4 v15, 0x4

    .line 122
    const-string v3, "-trackball"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1a

    :cond_49
    const/4 v15, 0x4

    .line 123
    const-string v3, "-dpad"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1a

    :cond_4a
    const/4 v15, 0x4

    .line 124
    const-string v3, "-nonav"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    :goto_1a
    iget-short v3, v0, Lef/a;->g:S

    if-eqz v3, :cond_4c

    iget-short v5, v0, Lef/a;->h:S

    if-eqz v5, :cond_4c

    .line 126
    const-string v6, "-%dx%d"

    if-le v3, v5, :cond_4b

    .line 127
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    iget-short v5, v0, Lef/a;->h:S

    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v5

    filled-new-array {v3, v5}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1b

    .line 128
    :cond_4b
    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    iget-short v5, v0, Lef/a;->g:S

    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v5

    filled-new-array {v3, v5}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    :cond_4c
    :goto_1b
    iget-short v3, v0, Lef/a;->i:S

    if-lez v3, :cond_56

    const/4 v5, 0x7

    if-eq v14, v5, :cond_55

    if-nez v13, :cond_55

    if-eqz v1, :cond_4d

    goto :goto_1e

    .line 130
    :cond_4d
    iget-byte v1, v0, Lef/a;->j:B

    const/16 v17, 0x3

    and-int/lit8 v1, v1, 0x3

    if-eqz v1, :cond_4e

    const/16 v14, 0x17

    goto :goto_1f

    :cond_4e
    const v1, 0xfffe

    if-ne v11, v1, :cond_4f

    const/16 v14, 0x15

    goto :goto_1f

    :cond_4f
    if-nez v9, :cond_54

    if-nez v10, :cond_54

    if-eqz v2, :cond_50

    goto :goto_1d

    :cond_50
    and-int/lit8 v1, p16, 0x3f

    if-eqz v1, :cond_51

    move v14, v12

    goto :goto_1f

    :cond_51
    and-int/lit8 v1, v8, 0x3f

    if-nez v1, :cond_53

    if-eqz v11, :cond_52

    goto :goto_1c

    :cond_52
    move/from16 v14, v16

    goto :goto_1f

    :cond_53
    :goto_1c
    move v14, v15

    goto :goto_1f

    :cond_54
    :goto_1d
    const/16 v14, 0xd

    goto :goto_1f

    :cond_55
    :goto_1e
    const/16 v14, 0x1a

    :goto_1f
    if-lt v3, v14, :cond_56

    .line 131
    const-string v1, "-v"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, v0, Lef/a;->i:S

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    :cond_56
    iget-boolean v1, v0, Lef/a;->k:Z

    if-eqz v1, :cond_57

    .line 133
    const-string v1, "-ERR"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Lef/a;->n:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lef/a;->n:I

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    :cond_57
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 135
    iput-object v1, v0, Lef/a;->l:Ljava/lang/String;

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xfffe
        :pswitch_d
        :pswitch_c
    .end packed-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-class v1, Lef/a;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eq v1, v2, :cond_1

    .line 12
    .line 13
    return v0

    .line 14
    :cond_1
    check-cast p1, Lef/a;

    .line 15
    .line 16
    iget-object v0, p0, Lef/a;->l:Ljava/lang/String;

    .line 17
    .line 18
    iget-object p1, p1, Lef/a;->l:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lef/a;->l:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0x20f

    .line 8
    .line 9
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lef/a;->l:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const-string v0, "[DEFAULT]"

    .line 11
    .line 12
    return-object v0
.end method
