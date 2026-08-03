.class public final Ln5/g;
.super Li5/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final j:Lk5/u;

.field public final k:I


# direct methods
.method public constructor <init>(Lk5/u;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln5/g;->j:Lk5/u;

    .line 5
    .line 6
    iput p2, p0, Ln5/g;->k:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget v0, p0, Ln5/g;->k:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Ln5/g;->j:Lk5/u;

    .line 6
    .line 7
    iget-object v1, v1, Lk5/u;->s:Lk5/s;

    .line 8
    .line 9
    iget-object v1, v1, Lk5/s;->h:Lk5/u;

    .line 10
    .line 11
    iget v1, v1, Lk5/u;->f:I

    .line 12
    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v1, Lv5/a;

    .line 17
    .line 18
    const-string v2, "type@"

    .line 19
    .line 20
    invoke-static {v0, v2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {v1, v0}, Lv5/a;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1
.end method

.method public final getType()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Ln5/g;->j:Lk5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lk5/u;->s:Lk5/s;

    .line 4
    .line 5
    iget v1, p0, Ln5/g;->k:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lk5/s;->b(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
