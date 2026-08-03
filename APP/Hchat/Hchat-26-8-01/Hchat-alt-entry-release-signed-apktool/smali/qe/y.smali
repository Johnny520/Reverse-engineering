.class public final Lqe/y;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:I

.field public final h:Lqd/l;

.field public final i:Lqd/j;


# direct methods
.method public constructor <init>(ILqd/l;Lqd/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lqe/y;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Lqe/y;->h:Lqd/l;

    .line 7
    .line 8
    iput-object p3, p0, Lqe/y;->i:Lqd/j;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lqe/y;

    .line 2
    .line 3
    iget v0, p0, Lqe/y;->g:I

    .line 4
    .line 5
    iget p1, p1, Lqe/y;->g:I

    .line 6
    .line 7
    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lqe/y;->i:Lqd/j;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lqe/y;->h:Lqd/l;

    .line 8
    .line 9
    invoke-virtual {v1}, Lqd/l;->X()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v1, v1, Lqd/l;->j:Lud/p;

    .line 14
    .line 15
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v3, " -> "

    .line 20
    .line 21
    const-string v4, " in "

    .line 22
    .line 23
    invoke-static {v0, v3, v2, v4, v1}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method
