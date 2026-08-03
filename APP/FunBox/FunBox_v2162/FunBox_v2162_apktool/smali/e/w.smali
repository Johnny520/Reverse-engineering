.class public final Le/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Le/x;

.field private b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ld/a;IIII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le/x;

    invoke-direct {v0, p1, p2, p4, p5}, Le/x;-><init>(Ld/a;III)V

    iput-object v0, p0, Le/w;->a:Le/x;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Le/w;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(Le/j;)V
    .locals 1

    iget-object v0, p0, Le/w;->a:Le/x;

    invoke-virtual {v0, p1}, Le/x;->a(Le/j;)V

    return-void
.end method

.method public final b(I)Le/j;
    .locals 2

    iget-object v0, p0, Le/w;->a:Le/x;

    invoke-virtual {v0}, Le/x;->m()I

    move-result v1

    if-ge p1, v1, :cond_1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Le/x;->g(I)Le/j;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c()Le/x;
    .locals 4

    iget-object v0, p0, Le/w;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Le/w;->a:Le/x;

    if-ge v1, v0, :cond_0

    iget-object v3, p0, Le/w;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/j;

    invoke-virtual {v2, v3}, Le/x;->a(Le/j;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Le/w;->b:Ljava/util/ArrayList;

    return-object v2

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "already processed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Le/f;)V
    .locals 1

    iget-object v0, p0, Le/w;->a:Le/x;

    invoke-virtual {v0, p1}, Le/x;->l(Le/f;)V

    return-void
.end method

.method public final e()I
    .locals 1

    iget-object v0, p0, Le/w;->a:Le/x;

    invoke-virtual {v0}, Le/x;->m()I

    move-result v0

    return v0
.end method
