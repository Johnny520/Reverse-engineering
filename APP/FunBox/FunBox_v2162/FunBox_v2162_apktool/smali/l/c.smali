.class public final Ll/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/d;
.implements Ljava/lang/Comparable;


# static fields
.field public static final A:Ll/c;

.field public static final B:Ll/c;

.field public static final C:Ll/c;

.field public static final D:Ll/c;

.field public static final E:Ll/c;

.field public static final F:Ll/c;

.field public static final G:Ll/c;

.field public static final H:Ll/c;

.field public static final I:Ll/c;

.field public static final J:Ll/c;

.field public static final K:Ll/c;

.field public static final L:Ll/c;

.field public static final M:Ll/c;

.field public static final N:Ll/c;

.field public static final O:Ll/c;

.field private static final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final g:Ll/c;

.field public static final h:Ll/c;

.field public static final i:Ll/c;

.field public static final j:Ll/c;

.field public static final k:Ll/c;

.field public static final l:Ll/c;

.field public static final m:Ll/c;

.field public static final n:Ll/c;

.field public static final o:Ll/c;

.field public static final p:Ll/c;

.field public static final q:Ll/c;

.field public static final r:Ll/c;

.field public static final s:Ll/c;

.field public static final t:Ll/c;

.field public static final u:Ll/c;

.field public static final v:Ll/c;

.field public static final w:Ll/c;

.field public static final x:Ll/c;

.field public static final y:Ll/c;

.field public static final z:Ll/c;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private c:Ljava/lang/String;

.field private d:Ll/c;

.field private e:Ll/c;


# direct methods
.method static constructor <clinit>()V
    .locals 37

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v1, 0x2710

    const/high16 v2, 0x3f400000    # 0.75f

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IF)V

    sput-object v0, Ll/c;->f:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ll/c;

    const/4 v1, 0x1

    const-string v2, "Z"

    invoke-direct {v0, v1, v2}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v0, Ll/c;->g:Ll/c;

    new-instance v1, Ll/c;

    const/4 v2, 0x2

    const-string v3, "B"

    invoke-direct {v1, v2, v3}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v1, Ll/c;->h:Ll/c;

    new-instance v2, Ll/c;

    const/4 v3, 0x3

    const-string v4, "C"

    invoke-direct {v2, v3, v4}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v2, Ll/c;->i:Ll/c;

    new-instance v3, Ll/c;

    const/4 v4, 0x4

    const-string v5, "D"

    invoke-direct {v3, v4, v5}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v3, Ll/c;->j:Ll/c;

    new-instance v4, Ll/c;

    const/4 v5, 0x5

    const-string v6, "F"

    invoke-direct {v4, v5, v6}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v4, Ll/c;->k:Ll/c;

    new-instance v5, Ll/c;

    const/4 v6, 0x6

    const-string v7, "I"

    invoke-direct {v5, v6, v7}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v5, Ll/c;->l:Ll/c;

    new-instance v6, Ll/c;

    const/4 v7, 0x7

    const-string v8, "J"

    invoke-direct {v6, v7, v8}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v6, Ll/c;->m:Ll/c;

    new-instance v7, Ll/c;

    const/16 v8, 0x8

    const-string v9, "S"

    invoke-direct {v7, v8, v9}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v7, Ll/c;->n:Ll/c;

    new-instance v8, Ll/c;

    const-string v9, "V"

    const/4 v10, 0x0

    invoke-direct {v8, v10, v9}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v8, Ll/c;->o:Ll/c;

    new-instance v8, Ll/c;

    const-string v9, "<null>"

    const/16 v10, 0x9

    invoke-direct {v8, v10, v9}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v8, Ll/c;->p:Ll/c;

    new-instance v8, Ll/c;

    const-string v9, "<addr>"

    const/16 v11, 0xa

    invoke-direct {v8, v11, v9}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v8, Ll/c;->q:Ll/c;

    new-instance v8, Ll/c;

    const-string v9, "Ljava/lang/annotation/Annotation;"

    invoke-direct {v8, v10, v9}, Ll/c;-><init>(ILjava/lang/String;)V

    new-instance v9, Ll/c;

    const-string v11, "Ljava/lang/Class;"

    invoke-direct {v9, v10, v11}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v9, Ll/c;->r:Ll/c;

    new-instance v11, Ll/c;

    const-string v12, "Ljava/lang/Cloneable;"

    invoke-direct {v11, v10, v12}, Ll/c;-><init>(ILjava/lang/String;)V

    new-instance v12, Ll/c;

    const-string v13, "Ljava/lang/invoke/MethodHandle;"

    invoke-direct {v12, v10, v13}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v12, Ll/c;->s:Ll/c;

    new-instance v13, Ll/c;

    const-string v14, "Ljava/lang/invoke/MethodType;"

    invoke-direct {v13, v10, v14}, Ll/c;-><init>(ILjava/lang/String;)V

    new-instance v13, Ll/c;

    const-string v14, "Ljava/lang/invoke/VarHandle;"

    invoke-direct {v13, v10, v14}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v13, Ll/c;->t:Ll/c;

    new-instance v14, Ll/c;

    const-string v15, "Ljava/lang/Object;"

    invoke-direct {v14, v10, v15}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v14, Ll/c;->u:Ll/c;

    new-instance v15, Ll/c;

    move-object/from16 v16, v14

    const-string v14, "Ljava/io/Serializable;"

    invoke-direct {v15, v10, v14}, Ll/c;-><init>(ILjava/lang/String;)V

    new-instance v14, Ll/c;

    move-object/from16 v17, v15

    const-string v15, "Ljava/lang/String;"

    invoke-direct {v14, v10, v15}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v14, Ll/c;->v:Ll/c;

    new-instance v15, Ll/c;

    move-object/from16 v18, v14

    const-string v14, "Ljava/lang/Throwable;"

    invoke-direct {v15, v10, v14}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v15, Ll/c;->w:Ll/c;

    new-instance v14, Ll/c;

    move-object/from16 v19, v15

    const-string v15, "Ljava/lang/Boolean;"

    invoke-direct {v14, v10, v15}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v14, Ll/c;->x:Ll/c;

    new-instance v15, Ll/c;

    move-object/from16 v20, v14

    const-string v14, "Ljava/lang/Byte;"

    invoke-direct {v15, v10, v14}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v15, Ll/c;->y:Ll/c;

    new-instance v14, Ll/c;

    move-object/from16 v21, v15

    const-string v15, "Ljava/lang/Character;"

    invoke-direct {v14, v10, v15}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v14, Ll/c;->z:Ll/c;

    new-instance v15, Ll/c;

    move-object/from16 v22, v14

    const-string v14, "Ljava/lang/Double;"

    invoke-direct {v15, v10, v14}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v15, Ll/c;->A:Ll/c;

    new-instance v14, Ll/c;

    move-object/from16 v23, v15

    const-string v15, "Ljava/lang/Float;"

    invoke-direct {v14, v10, v15}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v14, Ll/c;->B:Ll/c;

    new-instance v15, Ll/c;

    move-object/from16 v24, v14

    const-string v14, "Ljava/lang/Integer;"

    invoke-direct {v15, v10, v14}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v15, Ll/c;->C:Ll/c;

    new-instance v14, Ll/c;

    move-object/from16 v25, v15

    const-string v15, "Ljava/lang/Long;"

    invoke-direct {v14, v10, v15}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v14, Ll/c;->D:Ll/c;

    new-instance v15, Ll/c;

    move-object/from16 v26, v14

    const-string v14, "Ljava/lang/Short;"

    invoke-direct {v15, v10, v14}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v15, Ll/c;->E:Ll/c;

    new-instance v14, Ll/c;

    move-object/from16 v27, v15

    const-string v15, "Ljava/lang/Void;"

    invoke-direct {v14, v10, v15}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v14, Ll/c;->F:Ll/c;

    new-instance v15, Ll/c;

    move-object/from16 v28, v14

    const-string v14, "[Z"

    invoke-direct {v15, v10, v14}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v15, Ll/c;->G:Ll/c;

    new-instance v14, Ll/c;

    move-object/from16 v29, v15

    const-string v15, "[B"

    invoke-direct {v14, v10, v15}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v14, Ll/c;->H:Ll/c;

    new-instance v15, Ll/c;

    move-object/from16 v30, v14

    const-string v14, "[C"

    invoke-direct {v15, v10, v14}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v15, Ll/c;->I:Ll/c;

    new-instance v14, Ll/c;

    move-object/from16 v31, v15

    const-string v15, "[D"

    invoke-direct {v14, v10, v15}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v14, Ll/c;->J:Ll/c;

    new-instance v15, Ll/c;

    move-object/from16 v32, v14

    const-string v14, "[F"

    invoke-direct {v15, v10, v14}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v15, Ll/c;->K:Ll/c;

    new-instance v14, Ll/c;

    move-object/from16 v33, v15

    const-string v15, "[I"

    invoke-direct {v14, v10, v15}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v14, Ll/c;->L:Ll/c;

    new-instance v15, Ll/c;

    move-object/from16 v34, v14

    const-string v14, "[J"

    invoke-direct {v15, v10, v14}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v15, Ll/c;->M:Ll/c;

    new-instance v14, Ll/c;

    move-object/from16 v35, v15

    const-string v15, "[Ljava/lang/Object;"

    invoke-direct {v14, v10, v15}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v14, Ll/c;->N:Ll/c;

    new-instance v15, Ll/c;

    move-object/from16 v36, v14

    const-string v14, "[S"

    invoke-direct {v15, v10, v14}, Ll/c;-><init>(ILjava/lang/String;)V

    sput-object v15, Ll/c;->O:Ll/c;

    invoke-static {v0}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static {v1}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static {v2}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static {v3}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static {v4}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static {v5}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static {v6}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static {v7}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static {v8}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static {v9}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static {v11}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static {v12}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static {v13}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v16 .. v16}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v17 .. v17}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v18 .. v18}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v19 .. v19}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v20 .. v20}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v21 .. v21}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v22 .. v22}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v23 .. v23}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v24 .. v24}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v25 .. v25}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v26 .. v26}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v27 .. v27}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v28 .. v28}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v29 .. v29}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v30 .. v30}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v31 .. v31}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v32 .. v32}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v33 .. v33}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v34 .. v34}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v35 .. v35}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static/range {v36 .. v36}, Ll/c;->m(Ll/c;)Ll/c;

    invoke-static {v15}, Ll/c;->m(Ll/c;)Ll/c;

    return-void
.end method

.method private constructor <init>(ILjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    if-ltz p1, :cond_0

    const/16 v0, 0xb

    if-ge p1, v0, :cond_0

    iput-object p2, p0, Ll/c;->a:Ljava/lang/String;

    iput p1, p0, Ll/c;->b:I

    const/4 p1, 0x0

    iput-object p1, p0, Ll/c;->d:Ll/c;

    iput-object p1, p0, Ll/c;->e:Ll/c;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bad basicType"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "descriptor == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static i(Ljava/lang/String;)Ll/c;
    .locals 9

    sget-object v0, Ll/c;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    const/16 v2, 0x9

    const/16 v3, 0x5b

    if-ne v0, v3, :cond_2

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/c;->i(Ljava/lang/String;)Ll/c;

    move-result-object p0

    iget-object v0, p0, Ll/c;->d:Ll/c;

    if-nez v0, :cond_1

    new-instance v0, Ll/c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "["

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/c;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ll/c;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Ll/c;->m(Ll/c;)Ll/c;

    move-result-object v0

    iput-object v0, p0, Ll/c;->d:Ll/c;

    :cond_1
    iget-object p0, p0, Ll/c;->d:Ll/c;

    return-object p0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x4c

    const-string v6, "bad descriptor: "

    if-ne v0, v5, :cond_7

    sub-int/2addr v4, v1

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v5, 0x3b

    if-ne v0, v5, :cond_7

    move v0, v1

    :goto_0
    if-ge v0, v4, :cond_6

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x28

    if-eq v7, v8, :cond_5

    const/16 v8, 0x29

    if-eq v7, v8, :cond_5

    const/16 v8, 0x2e

    if-eq v7, v8, :cond_5

    const/16 v8, 0x2f

    if-eq v7, v8, :cond_3

    if-eq v7, v5, :cond_5

    if-eq v7, v3, :cond_5

    goto :goto_1

    :cond_3
    if-eq v0, v1, :cond_4

    if-eq v0, v4, :cond_4

    add-int/lit8 v7, v0, -0x1

    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-eq v7, v8, :cond_4

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ll/c;

    invoke-direct {v0, v2, p0}, Ll/c;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Ll/c;->m(Ll/c;)Ll/c;

    move-result-object p0

    return-object p0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "descriptor == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "descriptor is empty"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static m(Ll/c;)Ll/c;
    .locals 2

    iget-object v0, p0, Ll/c;->a:Ljava/lang/String;

    sget-object v1, Ll/c;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/c;

    if-eqz v0, :cond_0

    move-object p0, v0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 5

    iget v0, p0, Ll/c;->b:I

    iget-object v1, p0, Ll/c;->a:Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    return-object v1

    :pswitch_0
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0x5b

    if-ne v2, v4, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-eqz v2, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/c;->g()Ll/c;

    move-result-object v1

    invoke-virtual {v1}, Ll/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v2, p0, Ll/c;->c:Ljava/lang/String;

    if-nez v2, :cond_4

    invoke-virtual {p0}, Ll/c;->l()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v4, :cond_2

    iput-object v1, p0, Ll/c;->c:Ljava/lang/String;

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-virtual {v1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/c;->c:Ljava/lang/String;

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "not an object type: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    iget-object v0, p0, Ll/c;->c:Ljava/lang/String;

    const-string v1, "/"

    const-string v2, "."

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    const-string v0, "short"

    return-object v0

    :pswitch_2
    const-string v0, "long"

    return-object v0

    :pswitch_3
    const-string v0, "int"

    return-object v0

    :pswitch_4
    const-string v0, "float"

    return-object v0

    :pswitch_5
    const-string v0, "double"

    return-object v0

    :pswitch_6
    const-string v0, "char"

    return-object v0

    :pswitch_7
    const-string v0, "byte"

    return-object v0

    :pswitch_8
    const-string v0, "boolean"

    return-object v0

    :pswitch_9
    const-string v0, "void"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final b(Ll/c;)I
    .locals 1

    iget-object v0, p0, Ll/c;->a:Ljava/lang/String;

    iget-object p1, p1, Ll/c;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final c()Ll/c;
    .locals 0

    return-object p0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ll/c;

    invoke-virtual {p0, p1}, Ll/c;->b(Ll/c;)I

    move-result p1

    return p1
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Ll/c;->b:I

    return v0
.end method

.method public final e()I
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x6

    iget v2, p0, Ll/c;->b:I

    if-eq v2, v0, :cond_0

    const/4 v0, 0x2

    if-eq v2, v0, :cond_0

    const/4 v0, 0x3

    if-eq v2, v0, :cond_0

    if-eq v2, v1, :cond_0

    const/16 v0, 0x8

    if-eq v2, v0, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ll/c;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Ll/c;

    iget-object p1, p1, Ll/c;->a:Ljava/lang/String;

    iget-object v0, p0, Ll/c;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()I
    .locals 2

    const/4 v0, 0x4

    iget v1, p0, Ll/c;->b:I

    if-eq v1, v0, :cond_0

    const/4 v0, 0x7

    if-eq v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x2

    return v0
.end method

.method public final g()Ll/c;
    .locals 4

    iget-object v0, p0, Ll/c;->e:Ll/c;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    iget-object v1, p0, Ll/c;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x5b

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/c;->i(Ljava/lang/String;)Ll/c;

    move-result-object v0

    iput-object v0, p0, Ll/c;->e:Ll/c;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "not an array type: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Ll/c;->e:Ll/c;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ll/c;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final j()Z
    .locals 2

    const/4 v0, 0x4

    iget v1, p0, Ll/c;->b:I

    if-eq v1, v0, :cond_0

    const/4 v0, 0x7

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final k()Z
    .locals 3

    const/4 v0, 0x1

    iget v1, p0, Ll/c;->b:I

    if-eq v1, v0, :cond_0

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    const/4 v2, 0x6

    if-eq v1, v2, :cond_0

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public final l()Z
    .locals 2

    iget v0, p0, Ll/c;->b:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll/c;->a:Ljava/lang/String;

    return-object v0
.end method
