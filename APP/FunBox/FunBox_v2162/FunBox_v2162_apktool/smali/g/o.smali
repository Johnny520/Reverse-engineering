.class public final Lg/o;
.super Lg/w;
.source "SourceFile"


# instance fields
.field private final f:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>(Lg/k;)V
    .locals 1

    const-string v0, "field_ids"

    invoke-direct {p0, v0, p1}, Lg/w;-><init>(Ljava/lang/String;Lg/k;)V

    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Lg/o;->f:Ljava/util/TreeMap;

    return-void
.end method


# virtual methods
.method public final f()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lg/o;->f:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final p(Ln/d;)V
    .locals 5

    invoke-virtual {p0}, Lg/E;->j()V

    iget-object v0, p0, Lg/o;->f:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lg/E;->e()I

    move-result v1

    :goto_0
    invoke-virtual {p1}, Ln/d;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v0}, La/b;->s(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "field_ids_size:  "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {p1, v3, v2}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v1}, La/b;->s(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "field_ids_off:   "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v3, v2}, Ln/d;->b(ILjava/lang/String;)V

    :cond_1
    invoke-virtual {p1, v0}, Ln/d;->q(I)V

    invoke-virtual {p1, v1}, Ln/d;->q(I)V

    return-void
.end method
