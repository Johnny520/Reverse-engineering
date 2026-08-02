.class public final synthetic Luo1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Lbs0;

.field public final synthetic j:Lin0;

.field public final synthetic k:Z


# direct methods
.method public synthetic constructor <init>(ZLbs0;Lin0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Luo1;->h:Z

    .line 5
    .line 6
    iput-object p2, p0, Luo1;->i:Lbs0;

    .line 7
    .line 8
    iput-object p3, p0, Luo1;->j:Lin0;

    .line 9
    .line 10
    iput-boolean p4, p0, Luo1;->k:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Luo1;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Luo1;->i:Lbs0;

    .line 6
    .line 7
    check-cast v0, Lb02;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Lb02;->a(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-boolean v0, p0, Luo1;->k:Z

    .line 14
    .line 15
    xor-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object p0, p0, Luo1;->j:Lin0;

    .line 22
    .line 23
    invoke-interface {p0, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object p0, La83;->a:La83;

    .line 27
    .line 28
    return-object p0
.end method
