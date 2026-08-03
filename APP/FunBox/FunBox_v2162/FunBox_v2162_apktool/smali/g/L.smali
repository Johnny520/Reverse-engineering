.class public final Lg/L;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lg/k;

.field private final b:Ln/a;


# direct methods
.method public constructor <init>(Lg/k;Ln/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lg/L;->a:Lg/k;

    iput-object p2, p0, Lg/L;->b:Ln/a;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "file == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Lg/k;Lk/a;)V
    .locals 3

    instance-of v0, p1, Lk/c;

    if-eqz v0, :cond_0

    check-cast p1, Lk/c;

    invoke-virtual {p1}, Lk/c;->g()Lk/b;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p1, v1}, Lk/b;->q(I)Lk/a;

    move-result-object v2

    invoke-static {p0, v2}, Lg/L;->a(Lg/k;Lk/a;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lg/k;->t(Lk/a;)V

    :cond_1
    return-void
.end method

.method private static b(Lk/a;)I
    .locals 1

    instance-of v0, p0, Lk/f;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Lk/s;

    if-eqz v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    instance-of v0, p0, Lk/g;

    if-eqz v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    instance-of v0, p0, Lk/j;

    if-eqz v0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    instance-of v0, p0, Lk/o;

    if-eqz v0, :cond_4

    const/4 p0, 0x6

    return p0

    :cond_4
    instance-of v0, p0, Lk/i;

    if-eqz v0, :cond_5

    const/16 p0, 0x10

    return p0

    :cond_5
    instance-of v0, p0, Lk/h;

    if-eqz v0, :cond_6

    const/16 p0, 0x11

    return p0

    :cond_6
    instance-of v0, p0, Lk/t;

    if-eqz v0, :cond_7

    const/16 p0, 0x17

    return p0

    :cond_7
    instance-of v0, p0, Lk/u;

    if-eqz v0, :cond_8

    const/16 p0, 0x18

    return p0

    :cond_8
    instance-of v0, p0, Lk/q;

    if-eqz v0, :cond_9

    const/16 p0, 0x1a

    return p0

    :cond_9
    instance-of v0, p0, Lk/c;

    if-eqz v0, :cond_a

    const/16 p0, 0x1c

    return p0

    :cond_a
    instance-of v0, p0, Lk/k;

    if-eqz v0, :cond_b

    const/16 p0, 0x1e

    return p0

    :cond_b
    instance-of p0, p0, Lk/e;

    if-eqz p0, :cond_c

    const/16 p0, 0x1f

    return p0

    :cond_c
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Shouldn\'t happen"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final c(Lk/c;Z)V
    .locals 11

    const/4 v0, 0x0

    iget-object v1, p0, Lg/L;->b:Ln/a;

    if-eqz p2, :cond_0

    move-object p2, v1

    check-cast p2, Ln/d;

    invoke-virtual {p2}, Ln/d;->d()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    invoke-virtual {p1}, Lk/c;->g()Lk/b;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v2

    if-eqz p2, :cond_1

    invoke-static {v2}, La/b;->s(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "  size: "

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v4, v1

    check-cast v4, Ln/d;

    invoke-virtual {v4, v3}, Ln/d;->c(Ljava/lang/String;)V

    :cond_1
    move-object v3, v1

    check-cast v3, Ln/d;

    invoke-virtual {v3, v2}, Ln/d;->t(I)I

    move v4, v0

    :goto_1
    if-ge v4, v2, :cond_9

    invoke-virtual {p1, v4}, Lk/b;->q(I)Lk/a;

    move-result-object v5

    const/16 v6, 0x20

    if-eqz p2, :cond_3

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "  ["

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "] "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lg/L;->b(Lk/a;)I

    move-result v8

    const/16 v9, 0x1e

    if-ne v8, v9, :cond_2

    const-string v8, "null"

    goto :goto_2

    :cond_2
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lk/a;->f()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v5}, Ln/k;->a()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :goto_2
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ln/d;->c(Ljava/lang/String;)V

    :cond_3
    invoke-static {v5}, Lg/L;->b(Lk/a;)I

    move-result v7

    const/4 v8, 0x3

    if-eqz v7, :cond_7

    const/4 v9, 0x6

    if-eq v7, v9, :cond_7

    const/4 v9, 0x2

    if-eq v7, v9, :cond_7

    if-eq v7, v8, :cond_6

    const/4 v9, 0x4

    if-eq v7, v9, :cond_7

    const/16 v8, 0x10

    if-eq v7, v8, :cond_5

    const/16 v6, 0x11

    if-eq v7, v6, :cond_4

    const/4 v6, 0x0

    iget-object v8, p0, Lg/L;->a:Lg/k;

    packed-switch v7, :pswitch_data_0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Shouldn\'t happen"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    check-cast v5, Lk/e;

    invoke-virtual {v5}, Lk/l;->h()I

    move-result v5

    shl-int/lit8 v5, v5, 0x5

    or-int/2addr v5, v7

    move-object v6, v1

    check-cast v6, Ln/d;

    invoke-virtual {v6, v5}, Ln/d;->p(I)V

    goto/16 :goto_7

    :pswitch_1
    move-object v5, v1

    check-cast v5, Ln/d;

    invoke-virtual {v5, v7}, Ln/d;->p(I)V

    goto/16 :goto_7

    :pswitch_2
    check-cast v1, Ln/d;

    invoke-virtual {v1, v7}, Ln/d;->p(I)V

    invoke-static {v5}, Lc/d;->b(Ljava/lang/Object;)V

    throw v6

    :pswitch_3
    move-object v6, v1

    check-cast v6, Ln/d;

    invoke-virtual {v6, v7}, Ln/d;->p(I)V

    check-cast v5, Lk/c;

    invoke-virtual {p0, v5, v0}, Lg/L;->c(Lk/c;Z)V

    goto/16 :goto_7

    :pswitch_4
    invoke-static {v5}, Lc/d;->b(Ljava/lang/Object;)V

    throw v6

    :pswitch_5
    invoke-virtual {v8}, Lg/k;->m()Lg/z;

    move-result-object v6

    check-cast v5, Lk/q;

    invoke-virtual {v6, v5}, Lg/z;->q(Lk/d;)I

    move-result v5

    goto :goto_3

    :pswitch_6
    invoke-virtual {v8}, Lg/k;->g()Lg/o;

    invoke-static {v5}, Lc/d;->b(Ljava/lang/Object;)V

    throw v6

    :pswitch_7
    invoke-virtual {v8}, Lg/k;->q()Lg/x;

    move-result-object v6

    check-cast v5, Lk/u;

    invoke-virtual {v6, v5}, Lg/x;->r(Lk/u;)I

    move-result v5

    goto :goto_3

    :pswitch_8
    invoke-virtual {v8}, Lg/k;->p()Lg/x;

    move-result-object v6

    check-cast v5, Lk/t;

    invoke-virtual {v6, v5}, Lg/x;->q(Lk/t;)I

    move-result v5

    :goto_3
    int-to-long v5, v5

    goto :goto_5

    :pswitch_9
    invoke-virtual {v8}, Lg/k;->l()Lg/x;

    invoke-static {v5}, Lc/d;->b(Ljava/lang/Object;)V

    throw v6

    :pswitch_a
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lc/d;->b(Ljava/lang/Object;)V

    throw v6

    :cond_4
    check-cast v5, Lk/h;

    invoke-virtual {v5}, Lk/m;->i()J

    move-result-wide v5

    goto :goto_4

    :cond_5
    check-cast v5, Lk/i;

    invoke-virtual {v5}, Lk/l;->i()J

    move-result-wide v8

    shl-long v5, v8, v6

    :goto_4
    invoke-static {v1, v7, v5, v6}, La/b;->v(Ln/a;IJ)V

    goto :goto_7

    :cond_6
    check-cast v5, Lk/n;

    invoke-virtual {v5}, Lk/n;->i()J

    move-result-wide v5

    :goto_5
    invoke-static {v1, v7, v5, v6}, La/b;->w(Ln/a;IJ)V

    goto :goto_7

    :cond_7
    check-cast v5, Lk/n;

    invoke-virtual {v5}, Lk/n;->i()J

    move-result-wide v5

    const/16 v9, 0x3f

    shr-long v9, v5, v9

    xor-long/2addr v9, v5

    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v9

    rsub-int/lit8 v9, v9, 0x41

    add-int/lit8 v9, v9, 0x7

    shr-int/lit8 v8, v9, 0x3

    add-int/lit8 v9, v8, -0x1

    shl-int/lit8 v9, v9, 0x5

    or-int/2addr v7, v9

    move-object v9, v1

    check-cast v9, Ln/d;

    invoke-virtual {v9, v7}, Ln/d;->p(I)V

    :goto_6
    if-lez v8, :cond_8

    long-to-int v7, v5

    int-to-byte v7, v7

    invoke-virtual {v9, v7}, Ln/d;->p(I)V

    const/16 v7, 0x8

    shr-long/2addr v5, v7

    add-int/lit8 v8, v8, -0x1

    goto :goto_6

    :cond_8
    :goto_7
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :cond_9
    if-eqz p2, :cond_a

    invoke-virtual {v3}, Ln/d;->f()V

    :cond_a
    return-void

    :pswitch_data_0
    .packed-switch 0x15
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
