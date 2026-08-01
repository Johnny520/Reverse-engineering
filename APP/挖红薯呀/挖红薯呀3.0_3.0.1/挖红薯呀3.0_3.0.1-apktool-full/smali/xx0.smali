.class public final synthetic Lxx0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lww;

.field public final synthetic f:Lmh;

.field public final synthetic g:Lww;

.field public final synthetic h:Lww;

.field public final synthetic i:Lfd1;

.field public final synthetic j:Lmh;


# direct methods
.method public synthetic constructor <init>(ILww;Lmh;Lww;Lww;Lfd1;Lmh;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lxx0;->d:I

    .line 5
    .line 6
    iput-object p2, p0, Lxx0;->e:Lww;

    .line 7
    .line 8
    iput-object p3, p0, Lxx0;->f:Lmh;

    .line 9
    .line 10
    iput-object p4, p0, Lxx0;->g:Lww;

    .line 11
    .line 12
    iput-object p5, p0, Lxx0;->h:Lww;

    .line 13
    .line 14
    iput-object p6, p0, Lxx0;->i:Lfd1;

    .line 15
    .line 16
    iput-object p7, p0, Lxx0;->j:Lmh;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Lji;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, Lj50;->A(I)I

    .line 11
    .line 12
    .line 13
    move-result v8

    .line 14
    iget v0, p0, Lxx0;->d:I

    .line 15
    .line 16
    iget-object v1, p0, Lxx0;->e:Lww;

    .line 17
    .line 18
    iget-object v2, p0, Lxx0;->f:Lmh;

    .line 19
    .line 20
    iget-object v3, p0, Lxx0;->g:Lww;

    .line 21
    .line 22
    iget-object v4, p0, Lxx0;->h:Lww;

    .line 23
    .line 24
    iget-object v5, p0, Lxx0;->i:Lfd1;

    .line 25
    .line 26
    iget-object v6, p0, Lxx0;->j:Lmh;

    .line 27
    .line 28
    invoke-static/range {v0 .. v8}, Lz60;->c(ILww;Lmh;Lww;Lww;Lfd1;Lmh;Lji;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lna1;->a:Lna1;

    .line 32
    .line 33
    return-object p0
.end method
