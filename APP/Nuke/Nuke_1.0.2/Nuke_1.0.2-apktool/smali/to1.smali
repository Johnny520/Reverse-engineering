.class public final synthetic Lto1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Luh1;

.field public final synthetic i:Z

.field public final synthetic j:Lxm0;

.field public final synthetic k:Z

.field public final synthetic l:I

.field public final synthetic m:Lkw;

.field public final synthetic n:I

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(Luh1;ZLxm0;ZILkw;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lto1;->h:Luh1;

    .line 5
    .line 6
    iput-boolean p2, p0, Lto1;->i:Z

    .line 7
    .line 8
    iput-object p3, p0, Lto1;->j:Lxm0;

    .line 9
    .line 10
    iput-boolean p4, p0, Lto1;->k:Z

    .line 11
    .line 12
    iput p5, p0, Lto1;->l:I

    .line 13
    .line 14
    iput-object p6, p0, Lto1;->m:Lkw;

    .line 15
    .line 16
    iput p7, p0, Lto1;->n:I

    .line 17
    .line 18
    iput p8, p0, Lto1;->o:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Lpx;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lto1;->n:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lpp0;->N(I)I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    iget-object v0, p0, Lto1;->h:Luh1;

    .line 18
    .line 19
    iget-boolean v1, p0, Lto1;->i:Z

    .line 20
    .line 21
    iget-object v2, p0, Lto1;->j:Lxm0;

    .line 22
    .line 23
    iget-boolean v3, p0, Lto1;->k:Z

    .line 24
    .line 25
    iget v4, p0, Lto1;->l:I

    .line 26
    .line 27
    iget-object v5, p0, Lto1;->m:Lkw;

    .line 28
    .line 29
    iget v8, p0, Lto1;->o:I

    .line 30
    .line 31
    invoke-static/range {v0 .. v8}, Lse;->p(Luh1;ZLxm0;ZILkw;Lpx;II)V

    .line 32
    .line 33
    .line 34
    sget-object p0, La83;->a:La83;

    .line 35
    .line 36
    return-object p0
.end method
