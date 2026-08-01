.class public final synthetic Lhc;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lhw;

.field public final synthetic e:Lpe0;

.field public final synthetic f:Z

.field public final synthetic g:Lx01;

.field public final synthetic h:Lcc;

.field public final synthetic i:Lgc;

.field public final synthetic j:Ljn0;

.field public final synthetic k:Lxw;

.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Lhw;Lpe0;ZLx01;Lcc;Lgc;Ljn0;Lxw;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhc;->d:Lhw;

    .line 5
    .line 6
    iput-object p2, p0, Lhc;->e:Lpe0;

    .line 7
    .line 8
    iput-boolean p3, p0, Lhc;->f:Z

    .line 9
    .line 10
    iput-object p4, p0, Lhc;->g:Lx01;

    .line 11
    .line 12
    iput-object p5, p0, Lhc;->h:Lcc;

    .line 13
    .line 14
    iput-object p6, p0, Lhc;->i:Lgc;

    .line 15
    .line 16
    iput-object p7, p0, Lhc;->j:Ljn0;

    .line 17
    .line 18
    iput-object p8, p0, Lhc;->k:Lxw;

    .line 19
    .line 20
    iput p9, p0, Lhc;->l:I

    .line 21
    .line 22
    iput p10, p0, Lhc;->m:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, Lji;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lhc;->l:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lj50;->A(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    iget-object v0, p0, Lhc;->d:Lhw;

    .line 18
    .line 19
    iget-object v1, p0, Lhc;->e:Lpe0;

    .line 20
    .line 21
    iget-boolean v2, p0, Lhc;->f:Z

    .line 22
    .line 23
    iget-object v3, p0, Lhc;->g:Lx01;

    .line 24
    .line 25
    iget-object v4, p0, Lhc;->h:Lcc;

    .line 26
    .line 27
    iget-object v5, p0, Lhc;->i:Lgc;

    .line 28
    .line 29
    iget-object v6, p0, Lhc;->j:Ljn0;

    .line 30
    .line 31
    iget-object v7, p0, Lhc;->k:Lxw;

    .line 32
    .line 33
    iget v10, p0, Lhc;->m:I

    .line 34
    .line 35
    invoke-static/range {v0 .. v10}, Lo30;->d(Lhw;Lpe0;ZLx01;Lcc;Lgc;Ljn0;Lxw;Lji;II)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lna1;->a:Lna1;

    .line 39
    .line 40
    return-object p0
.end method
