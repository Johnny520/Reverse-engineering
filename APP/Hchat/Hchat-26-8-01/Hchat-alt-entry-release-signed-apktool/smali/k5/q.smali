.class public final Lk5/q;
.super Lo5/o;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:Lk5/u;


# direct methods
.method public constructor <init>(Lk5/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/q;->g:Lk5/u;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/q;->g:Lk5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lk5/u;->w:Lk5/p;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lk5/p;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lk5/o;

    .line 10
    .line 11
    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/q;->g:Lk5/u;

    .line 2
    .line 3
    iget v0, v0, Lk5/u;->n:I

    .line 4
    .line 5
    return v0
.end method
