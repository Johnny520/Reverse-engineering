.class public final Lh/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Ljava/lang/Object;

.field private c:Ljava/io/Serializable;

.field private d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILjava/lang/String;Li/E;Lh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh/b;->a:I

    iput-object p2, p0, Lh/b;->b:Ljava/lang/Object;

    iput-object p3, p0, Lh/b;->c:Ljava/io/Serializable;

    iput-object p4, p0, Lh/b;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lj/c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh/b;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lh/b;->a:I

    const/4 p1, 0x0

    iput-object p1, p0, Lh/b;->c:Ljava/io/Serializable;

    iput-object p1, p0, Lh/b;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Lj/c;
    .locals 1

    iget-object v0, p0, Lh/b;->b:Ljava/lang/Object;

    check-cast v0, Lj/c;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lh/b;->a:I

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh/b;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lh/b;->a:I

    return v0
.end method

.method public final e(I)Ln/g;
    .locals 14

    iget-object v0, p0, Lh/b;->d:Ljava/lang/Object;

    check-cast v0, Ln/g;

    if-nez v0, :cond_7

    iget-object v0, p0, Lh/b;->b:Ljava/lang/Object;

    check-cast v0, Lj/c;

    invoke-virtual {v0}, Ln/i;->F()I

    move-result v1

    new-array v2, v1, [Ln/g;

    new-instance v3, Ln/g;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Ln/g;-><init>(I)V

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v5

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v5, :cond_3

    invoke-virtual {v0, v7}, Lj/c;->n(I)Lj/a;

    move-result-object v8

    invoke-virtual {v8}, Lj/a;->c()I

    move-result v9

    invoke-virtual {v8}, Lj/a;->g()Ln/g;

    move-result-object v8

    invoke-virtual {v8}, Ln/g;->o()I

    move-result v10

    if-nez v10, :cond_0

    invoke-virtual {v3, v9}, Ln/g;->j(I)V

    goto :goto_2

    :cond_0
    move v11, v6

    :goto_1
    if-ge v11, v10, :cond_2

    invoke-virtual {v8, v11}, Ln/g;->l(I)I

    move-result v12

    aget-object v13, v2, v12

    if-nez v13, :cond_1

    new-instance v13, Ln/g;

    invoke-direct {v13, v4}, Ln/g;-><init>(I)V

    aput-object v13, v2, v12

    :cond_1
    invoke-virtual {v13, v9}, Ln/g;->j(I)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    :goto_3
    if-ge v6, v1, :cond_5

    aget-object v0, v2, v6

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ln/g;->p()V

    invoke-virtual {v0}, Ln/j;->g()V

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_5
    invoke-virtual {v3}, Ln/g;->p()V

    invoke-virtual {v3}, Ln/j;->g()V

    iget v0, p0, Lh/b;->a:I

    aget-object v1, v2, v0

    if-nez v1, :cond_6

    sget-object v1, Ln/g;->e:Ln/g;

    aput-object v1, v2, v0

    :cond_6
    iput-object v2, p0, Lh/b;->c:Ljava/io/Serializable;

    iput-object v3, p0, Lh/b;->d:Ljava/lang/Object;

    :cond_7
    iget-object v0, p0, Lh/b;->c:Ljava/io/Serializable;

    check-cast v0, [Ln/g;

    aget-object v0, v0, p1

    if-eqz v0, :cond_8

    return-object v0

    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-static {p1}, La/b;->q(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "no such block: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
