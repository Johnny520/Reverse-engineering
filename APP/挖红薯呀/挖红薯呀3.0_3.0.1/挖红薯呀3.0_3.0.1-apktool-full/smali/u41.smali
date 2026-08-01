.class public final Lu41;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lx41;

.field public final synthetic e:Lpe0;

.field public final synthetic f:Lww;

.field public final synthetic g:I


# direct methods
.method public constructor <init>(Lx41;Lpe0;Lww;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu41;->d:Lx41;

    .line 2
    .line 3
    iput-object p2, p0, Lu41;->e:Lpe0;

    .line 4
    .line 5
    iput-object p3, p0, Lu41;->f:Lww;

    .line 6
    .line 7
    iput p4, p0, Lu41;->g:I

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lji;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    iget p2, p0, Lu41;->g:I

    .line 9
    .line 10
    or-int/lit8 p2, p2, 0x1

    .line 11
    .line 12
    invoke-static {p2}, Lj50;->A(I)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iget-object v0, p0, Lu41;->d:Lx41;

    .line 17
    .line 18
    iget-object v1, p0, Lu41;->e:Lpe0;

    .line 19
    .line 20
    iget-object p0, p0, Lu41;->f:Lww;

    .line 21
    .line 22
    invoke-static {v0, v1, p0, p1, p2}, Li4;->g(Lx41;Lpe0;Lww;Lji;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lna1;->a:Lna1;

    .line 26
    .line 27
    return-object p0
.end method
