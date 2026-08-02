.class public final synthetic Lso1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lxm0;

.field public final synthetic j:Luh1;

.field public final synthetic k:Z

.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lxm0;Luh1;ZIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lso1;->h:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lso1;->i:Lxm0;

    .line 7
    .line 8
    iput-object p3, p0, Lso1;->j:Luh1;

    .line 9
    .line 10
    iput-boolean p4, p0, Lso1;->k:Z

    .line 11
    .line 12
    iput p5, p0, Lso1;->l:I

    .line 13
    .line 14
    iput p7, p0, Lso1;->m:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, Lpx;

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
    invoke-static {p1}, Lpp0;->N(I)I

    .line 11
    .line 12
    .line 13
    move-result v6

    .line 14
    iget-object v0, p0, Lso1;->h:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v1, p0, Lso1;->i:Lxm0;

    .line 17
    .line 18
    iget-object v2, p0, Lso1;->j:Luh1;

    .line 19
    .line 20
    iget-boolean v3, p0, Lso1;->k:Z

    .line 21
    .line 22
    iget v4, p0, Lso1;->l:I

    .line 23
    .line 24
    iget v7, p0, Lso1;->m:I

    .line 25
    .line 26
    invoke-static/range {v0 .. v7}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 27
    .line 28
    .line 29
    sget-object p0, La83;->a:La83;

    .line 30
    .line 31
    return-object p0
.end method
