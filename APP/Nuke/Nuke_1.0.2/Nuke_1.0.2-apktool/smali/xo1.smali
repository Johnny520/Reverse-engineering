.class public final synthetic Lxo1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lxm0;

.field public final synthetic i:J

.field public final synthetic j:Luh1;

.field public final synthetic k:Lkw;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lxm0;JLuh1;Lkw;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxo1;->h:Lxm0;

    .line 5
    .line 6
    iput-wide p2, p0, Lxo1;->i:J

    .line 7
    .line 8
    iput-object p4, p0, Lxo1;->j:Luh1;

    .line 9
    .line 10
    iput-object p5, p0, Lxo1;->k:Lkw;

    .line 11
    .line 12
    iput p6, p0, Lxo1;->l:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

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
    iget p1, p0, Lxo1;->l:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lpp0;->N(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-object v0, p0, Lxo1;->h:Lxm0;

    .line 18
    .line 19
    iget-wide v1, p0, Lxo1;->i:J

    .line 20
    .line 21
    iget-object v3, p0, Lxo1;->j:Luh1;

    .line 22
    .line 23
    iget-object v4, p0, Lxo1;->k:Lkw;

    .line 24
    .line 25
    invoke-static/range {v0 .. v6}, Lpp0;->h(Lxm0;JLuh1;Lkw;Lpx;I)V

    .line 26
    .line 27
    .line 28
    sget-object p0, La83;->a:La83;

    .line 29
    .line 30
    return-object p0
.end method
