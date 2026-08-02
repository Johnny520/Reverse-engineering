.class public final Lnb;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lzy2;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lin0;

.field public final c:Lxm0;

.field public final d:Lgl1;

.field public final e:Lts2;

.field public final f:Lgb;

.field public final g:Lgb;

.field public h:Landroid/view/ActionMode;

.field public i:Llb;

.field public j:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/view/View;Lin0;Lxm0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnb;->a:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lnb;->b:Lin0;

    .line 7
    .line 8
    iput-object p3, p0, Lnb;->c:Lxm0;

    .line 9
    .line 10
    new-instance p1, Lgl1;

    .line 11
    .line 12
    invoke-direct {p1}, Lgl1;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lnb;->d:Lgl1;

    .line 16
    .line 17
    new-instance p1, Lts2;

    .line 18
    .line 19
    new-instance p2, Lgb;

    .line 20
    .line 21
    const/4 p3, 0x0

    .line 22
    invoke-direct {p2, p0, p3}, Lgb;-><init>(Lnb;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, p2}, Lts2;-><init>(Lin0;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lnb;->e:Lts2;

    .line 29
    .line 30
    new-instance p1, Lgb;

    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-direct {p1, p0, p2}, Lgb;-><init>(Lnb;I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lnb;->f:Lgb;

    .line 37
    .line 38
    new-instance p1, Lgb;

    .line 39
    .line 40
    const/4 p2, 0x2

    .line 41
    invoke-direct {p1, p0, p2}, Lgb;-><init>(Lnb;I)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lnb;->g:Lgb;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a(Lry2;Ltw2;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lmb;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p0, p1, v2, v1}, Lmb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lnb;->d:Lgl1;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p1, Ltc;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {p1, p0, v0, v2, v1}, Ltc;-><init>(Ljava/lang/Object;Lin0;Lt00;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, Lte;->u(Lmn0;Lt00;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object p1, Lk20;->h:Lk20;

    .line 24
    .line 25
    if-ne p0, p1, :cond_0

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    sget-object p0, La83;->a:La83;

    .line 29
    .line 30
    return-object p0
.end method
