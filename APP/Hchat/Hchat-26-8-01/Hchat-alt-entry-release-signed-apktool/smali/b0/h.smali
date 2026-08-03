.class public final Lb0/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ld0/e;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lfg/l;

.field public final c:Lfg/a;

.field public final d:Lk/h1;

.field public final e:Lw0/s;

.field public final f:Lb0/a;

.field public final g:Lb0/a;

.field public h:Landroid/view/ActionMode;

.field public i:Lac/l;

.field public j:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/view/View;Lfg/l;Lfg/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb0/h;->a:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lb0/h;->b:Lfg/l;

    .line 7
    .line 8
    iput-object p3, p0, Lb0/h;->c:Lfg/a;

    .line 9
    .line 10
    new-instance p1, Lk/h1;

    .line 11
    .line 12
    invoke-direct {p1}, Lk/h1;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lb0/h;->d:Lk/h1;

    .line 16
    .line 17
    new-instance p1, Lw0/s;

    .line 18
    .line 19
    new-instance p2, Lb0/a;

    .line 20
    .line 21
    const/4 p3, 0x0

    .line 22
    invoke-direct {p2, p0, p3}, Lb0/a;-><init>(Lb0/h;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, p2}, Lw0/s;-><init>(Lfg/l;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lb0/h;->e:Lw0/s;

    .line 29
    .line 30
    new-instance p1, Lb0/a;

    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-direct {p1, p0, p2}, Lb0/a;-><init>(Lb0/h;I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lb0/h;->f:Lb0/a;

    .line 37
    .line 38
    new-instance p1, Lb0/a;

    .line 39
    .line 40
    const/4 p2, 0x2

    .line 41
    invoke-direct {p1, p0, p2}, Lb0/a;-><init>(Lb0/h;I)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lb0/h;->g:Lb0/a;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a(Ld0/d;Lyf/i;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lb0/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p0, p1, v1, v2}, Lb0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lb0/h;->d:Lk/h1;

    .line 9
    .line 10
    invoke-static {p1, v0, p2}, Lk/h1;->b(Lk/h1;Lfg/l;Lyf/i;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 15
    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 20
    .line 21
    return-object p1
.end method
