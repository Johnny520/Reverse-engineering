.class public final LOe;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# static fields
.field public static final a:LOe;

.field public static final b:Lru;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LOe;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LOe;->a:LOe;

    new-instance v0, Lru;

    const-string v1, "kotlin.time.Duration"

    sget-object v2, Lmu;->o:Lmu;

    invoke-direct {v0, v1, v2}, Lru;-><init>(Ljava/lang/String;Lnu;)V

    sput-object v0, LOe;->b:Lru;

    return-void
.end method


# virtual methods
.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 4

    sget v0, LMe;->d:I

    invoke-interface {p1}, LJc;->y()Ljava/lang/String;

    move-result-object p1

    :try_start_0
    invoke-static {p1}, LOj;->b(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance p1, LMe;

    invoke-direct {p1, v0, v1}, LMe;-><init>(J)V

    return-object p1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid ISO duration string format: \'"

    const-string v3, "\'."

    invoke-static {v2, p1, v3}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, LOe;->b:Lru;

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 15

    move-object/from16 v0, p2

    check-cast v0, LMe;

    iget-wide v0, v0, LMe;->a:J

    sget v2, LMe;->d:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/16 v4, 0x0

    cmp-long v2, v0, v4

    if-gez v2, :cond_0

    const/16 v6, 0x2d

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    const-string v6, "PT"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v6, 0x1

    if-gez v2, :cond_1

    shr-long v7, v0, v6

    neg-long v7, v7

    long-to-int v2, v0

    and-int/2addr v2, v6

    shl-long/2addr v7, v6

    int-to-long v9, v2

    add-long/2addr v7, v9

    sget v2, LNe;->a:I

    goto :goto_0

    :cond_1
    move-wide v7, v0

    :goto_0
    sget-object v2, LPe;->f:LPe;

    invoke-static {v7, v8, v2}, LMe;->f(JLPe;)J

    move-result-wide v9

    invoke-static {v7, v8}, LMe;->d(J)Z

    move-result v2

    const/16 v11, 0x3c

    const/4 v12, 0x0

    if-eqz v2, :cond_2

    move-wide/from16 p1, v4

    move v2, v12

    goto :goto_1

    :cond_2
    sget-object v2, LPe;->e:LPe;

    invoke-static {v7, v8, v2}, LMe;->f(JLPe;)J

    move-result-wide v13

    move-wide/from16 p1, v4

    int-to-long v4, v11

    rem-long/2addr v13, v4

    long-to-int v2, v13

    :goto_1
    invoke-static {v7, v8}, LMe;->d(J)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v12

    goto :goto_2

    :cond_3
    sget-object v4, LPe;->d:LPe;

    invoke-static {v7, v8, v4}, LMe;->f(JLPe;)J

    move-result-wide v4

    int-to-long v13, v11

    rem-long/2addr v4, v13

    long-to-int v4, v4

    :goto_2
    invoke-static {v7, v8}, LMe;->c(J)I

    move-result v5

    invoke-static {v0, v1}, LMe;->d(J)Z

    move-result v0

    if-eqz v0, :cond_4

    const-wide v9, 0x9184e729fffL

    :cond_4
    cmp-long v0, v9, p1

    if-eqz v0, :cond_5

    move v0, v6

    goto :goto_3

    :cond_5
    move v0, v12

    :goto_3
    if-nez v4, :cond_7

    if-eqz v5, :cond_6

    goto :goto_4

    :cond_6
    move v1, v12

    goto :goto_5

    :cond_7
    :goto_4
    move v1, v6

    :goto_5
    if-nez v2, :cond_9

    if-eqz v1, :cond_8

    if-eqz v0, :cond_8

    goto :goto_6

    :cond_8
    move v6, v12

    :cond_9
    :goto_6
    if-eqz v0, :cond_a

    invoke-virtual {v3, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v7, 0x48

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_a
    if-eqz v6, :cond_b

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x4d

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_b
    if-nez v1, :cond_c

    if-nez v0, :cond_d

    if-nez v6, :cond_d

    :cond_c
    const-string v7, "S"

    const/4 v8, 0x1

    const/16 v6, 0x9

    invoke-static/range {v3 .. v8}, LMe;->b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V

    :cond_d
    const/4 v0, 0x0

    throw v0
.end method
