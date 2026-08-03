.class public abstract La/ih;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/T4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/ih$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:La/N3;

.field public c:La/Dd;

.field public d:La/N3$a;

.field public final e:La/l5;

.field public f:I

.field public g:Z

.field public final h:La/V4;

.field public final i:La/V4;

.field public j:La/ih$a;


# direct methods
.method public constructor <init>(La/N3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La/l5;

    invoke-direct {v0, p0}, La/l5;-><init>(La/ih;)V

    iput-object v0, p0, La/ih;->e:La/l5;

    const/4 v0, 0x0

    iput v0, p0, La/ih;->f:I

    iput-boolean v0, p0, La/ih;->g:Z

    new-instance v0, La/V4;

    invoke-direct {v0, p0}, La/V4;-><init>(La/ih;)V

    iput-object v0, p0, La/ih;->h:La/V4;

    new-instance v0, La/V4;

    invoke-direct {v0, p0}, La/V4;-><init>(La/ih;)V

    iput-object v0, p0, La/ih;->i:La/V4;

    sget-object v0, La/ih$a;->a:La/ih$a;

    iput-object v0, p0, La/ih;->j:La/ih$a;

    iput-object p1, p0, La/ih;->b:La/N3;

    return-void
.end method

.method public static b(La/V4;La/V4;I)V
    .locals 1

    iget-object v0, p0, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput p2, p0, La/V4;->f:I

    iget-object p1, p1, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static h(La/M3;)La/V4;
    .locals 2

    iget-object p0, p0, La/M3;->d:La/M3;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, La/M3;->b:La/N3;

    iget-object p0, p0, La/M3;->c:La/M3$a;

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_5

    const/4 v1, 0x2

    if-eq p0, v1, :cond_4

    const/4 v1, 0x3

    if-eq p0, v1, :cond_3

    const/4 v1, 0x4

    if-eq p0, v1, :cond_2

    const/4 v1, 0x5

    if-eq p0, v1, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    iget-object p0, v0, La/N3;->e:La/og;

    iget-object p0, p0, La/og;->k:La/V4;

    return-object p0

    :cond_2
    iget-object p0, v0, La/N3;->e:La/og;

    iget-object p0, p0, La/ih;->i:La/V4;

    return-object p0

    :cond_3
    iget-object p0, v0, La/N3;->d:La/K8;

    iget-object p0, p0, La/ih;->i:La/V4;

    return-object p0

    :cond_4
    iget-object p0, v0, La/N3;->e:La/og;

    iget-object p0, p0, La/ih;->h:La/V4;

    return-object p0

    :cond_5
    iget-object p0, v0, La/N3;->d:La/K8;

    iget-object p0, p0, La/ih;->h:La/V4;

    return-object p0
.end method

.method public static i(La/M3;I)La/V4;
    .locals 1

    iget-object p0, p0, La/M3;->d:La/M3;

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, La/M3;->b:La/N3;

    if-nez p1, :cond_1

    iget-object p1, v0, La/N3;->d:La/K8;

    goto :goto_0

    :cond_1
    iget-object p1, v0, La/N3;->e:La/og;

    :goto_0
    iget-object p0, p0, La/M3;->c:La/M3$a;

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    :goto_1
    const/4 p0, 0x0

    return-object p0

    :cond_2
    iget-object p0, p1, La/ih;->i:La/V4;

    return-object p0

    :cond_3
    iget-object p0, p1, La/ih;->h:La/V4;

    return-object p0
.end method


# virtual methods
.method public a(La/T4;)V
    .locals 0

    return-void
.end method

.method public final c(La/V4;La/V4;ILa/l5;)V
    .locals 2

    iget-object v0, p1, La/V4;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, La/V4;->l:Ljava/util/ArrayList;

    iget-object v1, p0, La/ih;->e:La/l5;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput p3, p1, La/V4;->h:I

    iput-object p4, p1, La/V4;->i:La/l5;

    iget-object p2, p2, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, p4, La/V4;->k:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract d()V
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public final g(II)I
    .locals 1

    if-nez p2, :cond_1

    iget-object p2, p0, La/ih;->b:La/N3;

    iget v0, p2, La/N3;->n:I

    iget p2, p2, La/N3;->m:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_0
    if-eq p2, p1, :cond_3

    return p2

    :cond_1
    iget-object p2, p0, La/ih;->b:La/N3;

    iget v0, p2, La/N3;->q:I

    iget p2, p2, La/N3;->p:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_2

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_2
    if-eq p2, p1, :cond_3

    return p2

    :cond_3
    return p1
.end method

.method public j()J
    .locals 2

    iget-object v0, p0, La/ih;->e:La/l5;

    iget-boolean v1, v0, La/V4;->j:Z

    if-eqz v1, :cond_0

    iget v0, v0, La/V4;->g:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public abstract k()Z
.end method

.method public final l(La/M3;La/M3;I)V
    .locals 12

    invoke-static {p1}, La/ih;->h(La/M3;)La/V4;

    move-result-object v0

    invoke-static {p2}, La/ih;->h(La/M3;)La/V4;

    move-result-object v1

    iget-boolean v2, v0, La/V4;->j:Z

    if-eqz v2, :cond_f

    iget-boolean v2, v1, La/V4;->j:Z

    if-nez v2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget v2, v0, La/V4;->g:I

    invoke-virtual {p1}, La/M3;->c()I

    move-result p1

    add-int/2addr p1, v2

    iget v2, v1, La/V4;->g:I

    invoke-virtual {p2}, La/M3;->c()I

    move-result p2

    sub-int/2addr v2, p2

    sub-int p2, v2, p1

    iget-object v3, p0, La/ih;->e:La/l5;

    iget-boolean v4, v3, La/V4;->j:Z

    const/high16 v5, 0x3f000000    # 0.5f

    if-nez v4, :cond_a

    iget-object v4, p0, La/ih;->d:La/N3$a;

    sget-object v6, La/N3$a;->c:La/N3$a;

    if-ne v4, v6, :cond_a

    iget v4, p0, La/ih;->a:I

    if-eqz v4, :cond_9

    const/4 v7, 0x1

    if-eq v4, v7, :cond_8

    const/4 v8, 0x2

    if-eq v4, v8, :cond_5

    const/4 v8, 0x3

    if-eq v4, v8, :cond_1

    goto/16 :goto_3

    :cond_1
    iget-object v4, p0, La/ih;->b:La/N3;

    iget-object v9, v4, La/N3;->d:La/K8;

    iget-object v10, v9, La/ih;->d:La/N3$a;

    iget-object v11, v4, La/N3;->e:La/og;

    if-ne v10, v6, :cond_2

    iget v10, v9, La/ih;->a:I

    if-ne v10, v8, :cond_2

    iget-object v10, v11, La/ih;->d:La/N3$a;

    if-ne v10, v6, :cond_2

    iget v6, v11, La/ih;->a:I

    if-ne v6, v8, :cond_2

    goto :goto_3

    :cond_2
    if-nez p3, :cond_3

    move-object v9, v11

    :cond_3
    iget-object v6, v9, La/ih;->e:La/l5;

    iget-boolean v8, v6, La/V4;->j:Z

    if-eqz v8, :cond_a

    iget v4, v4, La/N3;->N:F

    if-ne p3, v7, :cond_4

    iget v6, v6, La/V4;->g:I

    int-to-float v6, v6

    div-float/2addr v6, v4

    add-float/2addr v6, v5

    float-to-int v4, v6

    goto :goto_0

    :cond_4
    iget v6, v6, La/V4;->g:I

    int-to-float v6, v6

    mul-float/2addr v4, v6

    add-float/2addr v4, v5

    float-to-int v4, v4

    :goto_0
    invoke-virtual {v3, v4}, La/l5;->d(I)V

    goto :goto_3

    :cond_5
    iget-object v4, p0, La/ih;->b:La/N3;

    iget-object v6, v4, La/N3;->K:La/N3;

    if-eqz v6, :cond_a

    if-nez p3, :cond_6

    iget-object v6, v6, La/N3;->d:La/K8;

    goto :goto_1

    :cond_6
    iget-object v6, v6, La/N3;->e:La/og;

    :goto_1
    iget-object v6, v6, La/ih;->e:La/l5;

    iget-boolean v7, v6, La/V4;->j:Z

    if-eqz v7, :cond_a

    if-nez p3, :cond_7

    iget v4, v4, La/N3;->o:F

    goto :goto_2

    :cond_7
    iget v4, v4, La/N3;->r:F

    :goto_2
    iget v6, v6, La/V4;->g:I

    int-to-float v6, v6

    mul-float/2addr v6, v4

    add-float/2addr v6, v5

    float-to-int v4, v6

    invoke-virtual {p0, v4, p3}, La/ih;->g(II)I

    move-result v4

    invoke-virtual {v3, v4}, La/l5;->d(I)V

    goto :goto_3

    :cond_8
    iget v4, v3, La/l5;->m:I

    invoke-virtual {p0, v4, p3}, La/ih;->g(II)I

    move-result v4

    invoke-static {v4, p2}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {v3, v4}, La/l5;->d(I)V

    goto :goto_3

    :cond_9
    invoke-virtual {p0, p2, p3}, La/ih;->g(II)I

    move-result v4

    invoke-virtual {v3, v4}, La/l5;->d(I)V

    :cond_a
    :goto_3
    iget-boolean v4, v3, La/V4;->j:Z

    if-nez v4, :cond_b

    goto :goto_5

    :cond_b
    iget v4, v3, La/V4;->g:I

    iget-object v6, p0, La/ih;->i:La/V4;

    iget-object v7, p0, La/ih;->h:La/V4;

    if-ne v4, p2, :cond_c

    invoke-virtual {v7, p1}, La/V4;->d(I)V

    invoke-virtual {v6, v2}, La/V4;->d(I)V

    return-void

    :cond_c
    iget-object p2, p0, La/ih;->b:La/N3;

    if-nez p3, :cond_d

    iget p2, p2, La/N3;->U:F

    goto :goto_4

    :cond_d
    iget p2, p2, La/N3;->V:F

    :goto_4
    if-ne v0, v1, :cond_e

    iget p1, v0, La/V4;->g:I

    iget v2, v1, La/V4;->g:I

    move p2, v5

    :cond_e
    sub-int/2addr v2, p1

    sub-int/2addr v2, v4

    int-to-float p1, p1

    add-float/2addr p1, v5

    int-to-float p3, v2

    mul-float/2addr p3, p2

    add-float/2addr p3, p1

    float-to-int p1, p3

    invoke-virtual {v7, p1}, La/V4;->d(I)V

    iget p1, v7, La/V4;->g:I

    iget p2, v3, La/V4;->g:I

    add-int/2addr p1, p2

    invoke-virtual {v6, p1}, La/V4;->d(I)V

    :cond_f
    :goto_5
    return-void
.end method
