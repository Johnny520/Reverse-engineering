.class public final Ln7;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lb91;

.field public final synthetic e:Lsw;

.field public final synthetic f:Lvs;

.field public final synthetic g:Ljt;

.field public final synthetic h:Lxw;

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Lb91;Lsw;Lvs;Ljt;Lxw;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln7;->d:Lb91;

    .line 2
    .line 3
    iput-object p2, p0, Ln7;->e:Lsw;

    .line 4
    .line 5
    iput-object p3, p0, Ln7;->f:Lvs;

    .line 6
    .line 7
    iput-object p4, p0, Ln7;->g:Ljt;

    .line 8
    .line 9
    iput-object p5, p0, Ln7;->h:Lxw;

    .line 10
    .line 11
    iput p6, p0, Ln7;->i:I

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 15
    .line 16
    .line 17
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
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Ln7;->i:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lj50;->A(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-object v0, p0, Ln7;->d:Lb91;

    .line 18
    .line 19
    iget-object v1, p0, Ln7;->e:Lsw;

    .line 20
    .line 21
    iget-object v2, p0, Ln7;->f:Lvs;

    .line 22
    .line 23
    iget-object v3, p0, Ln7;->g:Ljt;

    .line 24
    .line 25
    iget-object v4, p0, Ln7;->h:Lxw;

    .line 26
    .line 27
    invoke-static/range {v0 .. v6}, Lo30;->c(Lb91;Lsw;Lvs;Ljt;Lxw;Lji;I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lna1;->a:Lna1;

    .line 31
    .line 32
    return-object p0
.end method
