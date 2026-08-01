.class public final synthetic Lhd;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lpe0;

.field public final synthetic e:Lx01;

.field public final synthetic f:Lfd;

.field public final synthetic g:Lgd;

.field public final synthetic h:Lmh;


# direct methods
.method public synthetic constructor <init>(Lpe0;Lx01;Lfd;Lgd;Lmh;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhd;->d:Lpe0;

    .line 5
    .line 6
    iput-object p2, p0, Lhd;->e:Lx01;

    .line 7
    .line 8
    iput-object p3, p0, Lhd;->f:Lfd;

    .line 9
    .line 10
    iput-object p4, p0, Lhd;->g:Lgd;

    .line 11
    .line 12
    iput-object p5, p0, Lhd;->h:Lmh;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, Lji;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p1, 0x30007

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lj50;->A(I)I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    iget-object v0, p0, Lhd;->d:Lpe0;

    .line 17
    .line 18
    iget-object v1, p0, Lhd;->e:Lx01;

    .line 19
    .line 20
    iget-object v2, p0, Lhd;->f:Lfd;

    .line 21
    .line 22
    iget-object v3, p0, Lhd;->g:Lgd;

    .line 23
    .line 24
    iget-object v4, p0, Lhd;->h:Lmh;

    .line 25
    .line 26
    invoke-static/range {v0 .. v6}, Li4;->a(Lpe0;Lx01;Lfd;Lgd;Lmh;Lji;I)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lna1;->a:Lna1;

    .line 30
    .line 31
    return-object p0
.end method
