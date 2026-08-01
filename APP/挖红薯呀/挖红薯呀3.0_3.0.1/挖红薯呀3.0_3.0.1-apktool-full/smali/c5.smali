.class public final Lc5;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lpe0;

.field public final synthetic e:Lww;

.field public final synthetic f:I


# direct methods
.method public constructor <init>(Lpe0;Lww;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc5;->d:Lpe0;

    .line 2
    .line 3
    iput-object p2, p0, Lc5;->e:Lww;

    .line 4
    .line 5
    iput p3, p0, Lc5;->f:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

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
    iget p2, p0, Lc5;->f:I

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
    iget-object v0, p0, Lc5;->d:Lpe0;

    .line 17
    .line 18
    iget-object p0, p0, Lc5;->e:Lww;

    .line 19
    .line 20
    invoke-static {v0, p0, p1, p2}, Li4;->h(Lpe0;Lww;Lji;I)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lna1;->a:Lna1;

    .line 24
    .line 25
    return-object p0
.end method
