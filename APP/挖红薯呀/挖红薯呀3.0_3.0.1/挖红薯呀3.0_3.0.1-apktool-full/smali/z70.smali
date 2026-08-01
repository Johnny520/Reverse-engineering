.class public final synthetic Lz70;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:I

.field public final synthetic f:La80;

.field public final synthetic g:Lmh;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILa80;Lmh;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz70;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Lz70;->e:I

    .line 7
    .line 8
    iput-object p3, p0, Lz70;->f:La80;

    .line 9
    .line 10
    iput-object p4, p0, Lz70;->g:Lmh;

    .line 11
    .line 12
    iput p5, p0, Lz70;->h:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Lji;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lz70;->h:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lj50;->A(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget-object v0, p0, Lz70;->d:Ljava/lang/Object;

    .line 18
    .line 19
    iget v1, p0, Lz70;->e:I

    .line 20
    .line 21
    iget-object v2, p0, Lz70;->f:La80;

    .line 22
    .line 23
    iget-object v3, p0, Lz70;->g:Lmh;

    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, Lz60;->a(Ljava/lang/Object;ILa80;Lmh;Lji;I)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lna1;->a:Lna1;

    .line 29
    .line 30
    return-object p0
.end method
