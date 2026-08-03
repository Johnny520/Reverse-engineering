.class public final Lv1/j1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lv1/l1;

.field public b:Lv1/j0;

.field public final c:Lv1/i1;

.field public final d:Lv1/i1;

.field public final e:Lv1/i1;


# direct methods
.method public constructor <init>(Lv1/l1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv1/j1;->a:Lv1/l1;

    .line 5
    .line 6
    new-instance p1, Lv1/i1;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p1, p0, v0}, Lv1/i1;-><init>(Lv1/j1;I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lv1/j1;->c:Lv1/i1;

    .line 13
    .line 14
    new-instance p1, Lv1/i1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p1, p0, v0}, Lv1/i1;-><init>(Lv1/j1;I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lv1/j1;->d:Lv1/i1;

    .line 21
    .line 22
    new-instance p1, Lv1/i1;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, v0}, Lv1/i1;-><init>(Lv1/j1;I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lv1/j1;->e:Lv1/i1;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()Lv1/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/j1;->b:Lv1/j0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "SubcomposeLayoutState is not attached to SubcomposeLayout"

    .line 7
    .line 8
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method
