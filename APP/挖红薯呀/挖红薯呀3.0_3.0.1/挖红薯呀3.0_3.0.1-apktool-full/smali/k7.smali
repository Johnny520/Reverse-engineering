.class public final Lk7;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lwf;

.field public final synthetic e:Z

.field public final synthetic f:Lpe0;

.field public final synthetic g:Lvs;

.field public final synthetic h:Ljt;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lxw;

.field public final synthetic k:I


# direct methods
.method public constructor <init>(Lwf;ZLpe0;Lvs;Ljt;Ljava/lang/String;Lxw;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk7;->d:Lwf;

    .line 2
    .line 3
    iput-boolean p2, p0, Lk7;->e:Z

    .line 4
    .line 5
    iput-object p3, p0, Lk7;->f:Lpe0;

    .line 6
    .line 7
    iput-object p4, p0, Lk7;->g:Lvs;

    .line 8
    .line 9
    iput-object p5, p0, Lk7;->h:Ljt;

    .line 10
    .line 11
    iput-object p6, p0, Lk7;->i:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p7, p0, Lk7;->j:Lxw;

    .line 14
    .line 15
    iput p8, p0, Lk7;->k:I

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 19
    .line 20
    .line 21
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
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lk7;->k:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lj50;->A(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, Lk7;->d:Lwf;

    .line 18
    .line 19
    iget-boolean v1, p0, Lk7;->e:Z

    .line 20
    .line 21
    iget-object v2, p0, Lk7;->f:Lpe0;

    .line 22
    .line 23
    iget-object v3, p0, Lk7;->g:Lvs;

    .line 24
    .line 25
    iget-object v4, p0, Lk7;->h:Ljt;

    .line 26
    .line 27
    iget-object v5, p0, Lk7;->i:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v6, p0, Lk7;->j:Lxw;

    .line 30
    .line 31
    invoke-static/range {v0 .. v8}, Lo30;->b(Lwf;ZLpe0;Lvs;Ljt;Ljava/lang/String;Lxw;Lji;I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lna1;->a:Lna1;

    .line 35
    .line 36
    return-object p0
.end method
