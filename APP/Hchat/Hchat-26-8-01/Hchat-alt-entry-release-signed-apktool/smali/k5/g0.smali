.class public final Lk5/g0;
.super Lk5/v;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Lk5/u;

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(Lk5/u;La5/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk5/g0;->g:Lk5/u;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p2, p1}, La5/a;->o(Z)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lk5/g0;->h:I

    .line 12
    .line 13
    invoke-virtual {p2, p1}, La5/a;->o(Z)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lk5/g0;->i:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lk5/g0;->g:Lk5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lk5/u;->s:Lk5/s;

    .line 4
    .line 5
    iget v1, p0, Lk5/g0;->h:I

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

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lk5/g0;->i:I

    .line 2
    .line 3
    return v0
.end method
