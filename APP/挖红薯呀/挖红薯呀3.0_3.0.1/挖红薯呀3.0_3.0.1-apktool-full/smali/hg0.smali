.class public final synthetic Lhg0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Lfn;

.field public final synthetic e:Lzt0;

.field public final synthetic f:Lwt0;

.field public final synthetic g:Llz0;

.field public final synthetic h:Lvt0;


# direct methods
.method public synthetic constructor <init>(Lfn;Lzt0;Lwt0;Llz0;Lvt0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhg0;->d:Lfn;

    .line 5
    .line 6
    iput-object p2, p0, Lhg0;->e:Lzt0;

    .line 7
    .line 8
    iput-object p3, p0, Lhg0;->f:Lwt0;

    .line 9
    .line 10
    iput-object p4, p0, Lhg0;->g:Llz0;

    .line 11
    .line 12
    iput-object p5, p0, Lhg0;->h:Lvt0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/lang/Float;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lhg0;->d:Lfn;

    .line 8
    .line 9
    iget-object v1, v0, Lfn;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lvb;

    .line 12
    .line 13
    invoke-static {v1}, Lfn;->g(Lvb;)Lfg0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lfn;->h(Lfg0;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lhg0;->e:Lzt0;

    .line 24
    .line 25
    iget-object v3, v0, Lzt0;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Lfg0;

    .line 28
    .line 29
    invoke-virtual {v3, v1}, Lfg0;->a(Lfg0;)Lfg0;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iput-object v3, v0, Lzt0;->d:Ljava/lang/Object;

    .line 34
    .line 35
    iget-wide v3, v3, Lfg0;->a:J

    .line 36
    .line 37
    iget-object v0, p0, Lhg0;->g:Llz0;

    .line 38
    .line 39
    invoke-virtual {v0, v3, v4}, Llz0;->e(J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    invoke-virtual {v0, v3, v4}, Llz0;->i(J)F

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v3, p0, Lhg0;->f:Lwt0;

    .line 48
    .line 49
    iput v0, v3, Lwt0;->d:F

    .line 50
    .line 51
    sub-float/2addr v0, p1

    .line 52
    invoke-static {v0}, Lr60;->e(F)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    xor-int/2addr p1, v2

    .line 57
    iget-object p0, p0, Lhg0;->h:Lvt0;

    .line 58
    .line 59
    iput-boolean p1, p0, Lvt0;->d:Z

    .line 60
    .line 61
    :cond_0
    if-eqz v1, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    const/4 v2, 0x0

    .line 65
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method
