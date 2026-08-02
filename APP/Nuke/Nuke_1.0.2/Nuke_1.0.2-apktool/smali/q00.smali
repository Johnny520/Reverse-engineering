.class public final synthetic Lq00;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Z

.field public final synthetic j:Lm00;

.field public final synthetic k:Luh1;

.field public final synthetic l:Lnn0;

.field public final synthetic m:Lxm0;

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZLm00;Luh1;Lnn0;Lxm0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq00;->h:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Lq00;->i:Z

    .line 7
    .line 8
    iput-object p3, p0, Lq00;->j:Lm00;

    .line 9
    .line 10
    iput-object p4, p0, Lq00;->k:Luh1;

    .line 11
    .line 12
    iput-object p5, p0, Lq00;->l:Lnn0;

    .line 13
    .line 14
    iput-object p6, p0, Lq00;->m:Lxm0;

    .line 15
    .line 16
    iput p7, p0, Lq00;->n:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

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
    iget p1, p0, Lq00;->n:I

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
    iget-object v0, p0, Lq00;->h:Ljava/lang/String;

    .line 18
    .line 19
    iget-boolean v1, p0, Lq00;->i:Z

    .line 20
    .line 21
    iget-object v2, p0, Lq00;->j:Lm00;

    .line 22
    .line 23
    iget-object v3, p0, Lq00;->k:Luh1;

    .line 24
    .line 25
    iget-object v4, p0, Lq00;->l:Lnn0;

    .line 26
    .line 27
    iget-object v5, p0, Lq00;->m:Lxm0;

    .line 28
    .line 29
    invoke-static/range {v0 .. v7}, Lr00;->c(Ljava/lang/String;ZLm00;Luh1;Lnn0;Lxm0;Lpx;I)V

    .line 30
    .line 31
    .line 32
    sget-object p0, La83;->a:La83;

    .line 33
    .line 34
    return-object p0
.end method
