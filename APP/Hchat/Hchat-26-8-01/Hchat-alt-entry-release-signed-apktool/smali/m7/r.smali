.class public final Lm7/r;
.super Ljava/util/AbstractList;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:Lm7/i;


# direct methods
.method public constructor <init>(Lm7/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm7/r;->g:Lm7/i;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/r;->g:Lm7/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm7/i;->R()Ld7/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lo7/b;->Q(I)Lk7/a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lm7/q;

    .line 12
    .line 13
    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/r;->g:Lm7/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm7/i;->R()Ld7/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 8
    .line 9
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method
