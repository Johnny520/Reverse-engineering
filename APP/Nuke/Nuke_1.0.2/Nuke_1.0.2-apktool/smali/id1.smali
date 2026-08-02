.class public final Lid1;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:Lkd1;

.field public final synthetic j:J

.field public final synthetic k:J

.field public final synthetic l:Luz1;


# direct methods
.method public constructor <init>(Lkd1;JJLuz1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lid1;->i:Lkd1;

    .line 2
    .line 3
    iput-wide p2, p0, Lid1;->j:J

    .line 4
    .line 5
    iput-wide p4, p0, Lid1;->k:J

    .line 6
    .line 7
    iput-object p6, p0, Lid1;->l:Luz1;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lid1;->i:Lkd1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkd1;->D0()Lhd1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    iput-boolean v2, v1, Lhd1;->h:Z

    .line 9
    .line 10
    invoke-virtual {v0}, Lkd1;->D0()Lhd1;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-wide v2, p0, Lid1;->j:J

    .line 15
    .line 16
    iput-wide v2, v1, Lhd1;->i:J

    .line 17
    .line 18
    invoke-virtual {v0}, Lkd1;->D0()Lhd1;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-wide v2, p0, Lid1;->k:J

    .line 23
    .line 24
    iput-wide v2, v1, Lhd1;->j:J

    .line 25
    .line 26
    iget-object p0, p0, Lid1;->l:Luz1;

    .line 27
    .line 28
    iget-object p0, p0, Luz1;->h:Lof1;

    .line 29
    .line 30
    invoke-interface {p0}, Lof1;->d()Lin0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Lkd1;->D0()Lhd1;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p0, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object p0, La83;->a:La83;

    .line 44
    .line 45
    return-object p0
.end method
