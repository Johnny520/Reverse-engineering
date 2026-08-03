.class public final Lyb/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lth/a;


# instance fields
.field public final a:Lth/a;

.field public final b:Lth/j;

.field public final c:Z


# direct methods
.method public constructor <init>(Lth/a;Lth/j;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyb/a;->a:Lth/a;

    .line 8
    .line 9
    iput-object p2, p0, Lyb/a;->b:Lth/j;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lyb/a;->c:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Lh1/d;Lu2/c;Lv1/t;Lfg/l;I)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lyb/a;->a:Lth/a;

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    move-object v2, p2

    .line 11
    move-object v3, p3

    .line 12
    move-object v4, p4

    .line 13
    move v5, p5

    .line 14
    invoke-interface/range {v0 .. v5}, Lth/a;->a(Lh1/d;Lu2/c;Lv1/t;Lfg/l;I)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lyb/a;->b:Lth/j;

    .line 18
    .line 19
    move v6, v5

    .line 20
    move-object v5, v4

    .line 21
    move-object v4, v3

    .line 22
    move-object v3, v2

    .line 23
    move-object v2, v1

    .line 24
    move-object v1, p1

    .line 25
    invoke-virtual/range {v1 .. v6}, Lth/j;->a(Lh1/d;Lu2/c;Lv1/t;Lfg/l;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyb/a;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()F
    .locals 1

    .line 1
    iget-object v0, p0, Lyb/a;->a:Lth/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lth/a;->c()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final d()F
    .locals 1

    .line 1
    iget-object v0, p0, Lyb/a;->a:Lth/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lth/a;->d()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
