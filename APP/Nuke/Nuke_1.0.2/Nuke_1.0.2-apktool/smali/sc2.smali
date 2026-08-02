.class public final Lsc2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Ltc2;

.field public final b:Lta;

.field public final c:Ljx2;

.field public final d:Ljava/util/LinkedHashMap;

.field public e:Z

.field public f:Landroid/os/Bundle;

.field public g:Z

.field public h:Z


# direct methods
.method public constructor <init>(Ltc2;Lta;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsc2;->a:Ltc2;

    .line 5
    .line 6
    iput-object p2, p0, Lsc2;->b:Lta;

    .line 7
    .line 8
    new-instance p1, Ljx2;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-direct {p1, p2}, Ljx2;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lsc2;->c:Ljx2;

    .line 15
    .line 16
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lsc2;->d:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Lsc2;->h:Z

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lsc2;->a:Ltc2;

    .line 2
    .line 3
    invoke-interface {v0}, Lia1;->getLifecycle()Lba1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lla1;

    .line 8
    .line 9
    iget-object v1, v1, Lla1;->h:Laa1;

    .line 10
    .line 11
    sget-object v2, Laa1;->i:Laa1;

    .line 12
    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    iget-boolean v1, p0, Lsc2;->e:Z

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lsc2;->b:Lta;

    .line 20
    .line 21
    invoke-virtual {v1}, Lta;->a()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Lia1;->getLifecycle()Lba1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Llg1;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-direct {v1, v2, p0}, Llg1;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lba1;->a(Lha1;)V

    .line 35
    .line 36
    .line 37
    iput-boolean v2, p0, Lsc2;->e:Z

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    const-string p0, "SavedStateRegistry was already attached."

    .line 41
    .line 42
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    const-string p0, "Restarter must be created only during owner\'s initialization stage"

    .line 47
    .line 48
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
