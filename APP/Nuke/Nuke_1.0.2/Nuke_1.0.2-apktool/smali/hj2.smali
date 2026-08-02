.class public final Lhj2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lil1;

.field public b:Lgj2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lkl1;

    .line 2
    .line 3
    invoke-direct {v0}, Lkl1;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lhj2;->a:Lil1;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lhj2;->b:Lgj2;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Lgj2;
    .locals 4

    .line 1
    iget-object v0, p0, Lhj2;->b:Lgj2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    sget-object v2, Lwj2;->h:Ljava/util/Set;

    .line 8
    .line 9
    sget-object v2, Lwj2;->h:Ljava/util/Set;

    .line 10
    .line 11
    iget-object v3, v0, Lgj2;->b:Lf52;

    .line 12
    .line 13
    iget-object v3, v3, Lf52;->o:Lrk2;

    .line 14
    .line 15
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iput-object v1, p0, Lhj2;->b:Lgj2;

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_1
    return-object v0
.end method
