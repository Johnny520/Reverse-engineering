.class public Lr7/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lr7/m;


# instance fields
.field public final g:Lr7/b;

.field public final h:I


# direct methods
.method public constructor <init>(Lr7/b;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr7/l;->g:Lr7/b;

    .line 5
    .line 6
    iput p2, p0, Lr7/l;->h:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Class;)Lk7/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/l;->g:Lr7/b;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-virtual {v0, p1}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final get()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/l;->g:Lr7/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr7/b;->r()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lr7/l;->h:I

    .line 8
    .line 9
    invoke-static {v0, v1}, Lk7/a;->s([BI)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final k(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/l;->g:Lr7/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr7/b;->r()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lr7/l;->h:I

    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lk7/a;->D([BII)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lr7/l;->get()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ":"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lr7/l;->g:Lr7/b;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method
