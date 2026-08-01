.class public final Lwb0;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:Lyb0;

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:Lzq0;


# direct methods
.method public constructor <init>(Lyb0;JJLzq0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwb0;->d:Lyb0;

    .line 2
    .line 3
    iput-wide p2, p0, Lwb0;->e:J

    .line 4
    .line 5
    iput-wide p4, p0, Lwb0;->f:J

    .line 6
    .line 7
    iput-object p6, p0, Lwb0;->g:Lzq0;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lwb0;->d:Lyb0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyb0;->r0()Lvb0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    iput-boolean v2, v1, Lvb0;->d:Z

    .line 9
    .line 10
    invoke-virtual {v0}, Lyb0;->r0()Lvb0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-wide v2, p0, Lwb0;->e:J

    .line 15
    .line 16
    iput-wide v2, v1, Lvb0;->e:J

    .line 17
    .line 18
    invoke-virtual {v0}, Lyb0;->r0()Lvb0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-wide v2, p0, Lwb0;->f:J

    .line 23
    .line 24
    iput-wide v2, v1, Lvb0;->f:J

    .line 25
    .line 26
    iget-object p0, p0, Lwb0;->g:Lzq0;

    .line 27
    .line 28
    iget-object p0, p0, Lzq0;->d:Lyd0;

    .line 29
    .line 30
    invoke-interface {p0}, Lyd0;->d()Lsw;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Lyb0;->r0()Lvb0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p0, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object p0, Lna1;->a:Lna1;

    .line 44
    .line 45
    return-object p0
.end method
