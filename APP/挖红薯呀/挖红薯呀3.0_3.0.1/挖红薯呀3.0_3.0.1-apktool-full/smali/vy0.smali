.class public final synthetic Lvy0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lwt0;

.field public final synthetic e:Llz0;

.field public final synthetic f:Ljz0;


# direct methods
.method public synthetic constructor <init>(Lwt0;Llz0;Ljz0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvy0;->d:Lwt0;

    .line 5
    .line 6
    iput-object p2, p0, Lvy0;->e:Llz0;

    .line 7
    .line 8
    iput-object p3, p0, Lvy0;->f:Ljz0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

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
    check-cast p2, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Lvy0;->d:Lwt0;

    .line 13
    .line 14
    iget v0, p2, Lwt0;->d:F

    .line 15
    .line 16
    sub-float/2addr p1, v0

    .line 17
    iget-object v0, p0, Lvy0;->e:Llz0;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Llz0;->d(F)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {v0, p1}, Llz0;->h(F)J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    iget-object p0, p0, Lvy0;->f:Ljz0;

    .line 28
    .line 29
    iget-object p0, p0, Ljz0;->a:Llz0;

    .line 30
    .line 31
    iget-object p1, p0, Llz0;->k:Lny0;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-virtual {p0, p1, v1, v2, v3}, Llz0;->c(Lny0;JI)J

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    invoke-virtual {v0, p0, p1}, Llz0;->g(J)F

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-virtual {v0, p0}, Llz0;->d(F)F

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    iget p1, p2, Lwt0;->d:F

    .line 47
    .line 48
    add-float/2addr p1, p0

    .line 49
    iput p1, p2, Lwt0;->d:F

    .line 50
    .line 51
    sget-object p0, Lna1;->a:Lna1;

    .line 52
    .line 53
    return-object p0
.end method
