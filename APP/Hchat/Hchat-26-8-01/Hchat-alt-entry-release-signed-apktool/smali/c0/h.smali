.class public final Lc0/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ld0/d;


# instance fields
.field public final g:J

.field public final synthetic h:Lc0/j;


# direct methods
.method public constructor <init>(Lc0/j;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc0/h;->h:Lc0/j;

    .line 5
    .line 6
    iput-wide p2, p0, Lc0/h;->g:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final E0(Lv1/t;)J
    .locals 3

    .line 1
    iget-object v0, p0, Lc0/h;->h:Lc0/j;

    .line 2
    .line 3
    iget-object v0, v0, Lc0/j;->x:Li0/j1;

    .line 4
    .line 5
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lv1/t;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-wide v1, p0, Lc0/h;->g:J

    .line 14
    .line 15
    invoke-interface {p1, v0, v1, v2}, Lv1/t;->w(Lv1/t;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0

    .line 20
    :cond_0
    const-string p1, "Tried to open context menu before the anchor was placed."

    .line 21
    .line 22
    invoke-static {p1}, Lo/b;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lokio/a;->c()V

    .line 26
    .line 27
    .line 28
    const-wide/16 v0, 0x0

    .line 29
    .line 30
    return-wide v0
.end method

.method public final j0()Lz/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lc0/h;->h:Lc0/j;

    .line 2
    .line 3
    invoke-static {v0}, Lc0/k;->b(Lx1/i;)Lz/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final w0(Lv1/t;)Le1/c;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lc0/h;->E0(Lv1/t;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, Lac/p;->a(JJ)Le1/c;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
