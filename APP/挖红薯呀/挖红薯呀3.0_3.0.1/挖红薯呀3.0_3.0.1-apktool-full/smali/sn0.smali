.class public final synthetic Lsn0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lkm;

.field public final synthetic e:Lpe0;

.field public final synthetic f:Ljn0;

.field public final synthetic g:Ln2;

.field public final synthetic h:Lga;

.field public final synthetic i:Lf21;

.field public final synthetic j:Z

.field public final synthetic k:Laj0;

.field public final synthetic l:Ln2;

.field public final synthetic m:Lj5;

.field public final synthetic n:Lmh;


# direct methods
.method public synthetic constructor <init>(Lkm;Lpe0;Ljn0;Ln2;Lga;Lf21;ZLaj0;Ln2;Lj5;Lmh;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsn0;->d:Lkm;

    .line 5
    .line 6
    iput-object p2, p0, Lsn0;->e:Lpe0;

    .line 7
    .line 8
    iput-object p3, p0, Lsn0;->f:Ljn0;

    .line 9
    .line 10
    iput-object p4, p0, Lsn0;->g:Ln2;

    .line 11
    .line 12
    iput-object p5, p0, Lsn0;->h:Lga;

    .line 13
    .line 14
    iput-object p6, p0, Lsn0;->i:Lf21;

    .line 15
    .line 16
    iput-boolean p7, p0, Lsn0;->j:Z

    .line 17
    .line 18
    iput-object p8, p0, Lsn0;->k:Laj0;

    .line 19
    .line 20
    iput-object p9, p0, Lsn0;->l:Ln2;

    .line 21
    .line 22
    iput-object p10, p0, Lsn0;->m:Lj5;

    .line 23
    .line 24
    iput-object p11, p0, Lsn0;->n:Lmh;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v11, p1

    .line 2
    check-cast v11, Lji;

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
    invoke-static {p1}, Lj50;->A(I)I

    .line 11
    .line 12
    .line 13
    move-result v12

    .line 14
    iget-object v0, p0, Lsn0;->d:Lkm;

    .line 15
    .line 16
    iget-object v1, p0, Lsn0;->e:Lpe0;

    .line 17
    .line 18
    iget-object v2, p0, Lsn0;->f:Ljn0;

    .line 19
    .line 20
    iget-object v3, p0, Lsn0;->g:Ln2;

    .line 21
    .line 22
    iget-object v4, p0, Lsn0;->h:Lga;

    .line 23
    .line 24
    iget-object v5, p0, Lsn0;->i:Lf21;

    .line 25
    .line 26
    iget-boolean v6, p0, Lsn0;->j:Z

    .line 27
    .line 28
    iget-object v7, p0, Lsn0;->k:Laj0;

    .line 29
    .line 30
    iget-object v8, p0, Lsn0;->l:Ln2;

    .line 31
    .line 32
    iget-object v9, p0, Lsn0;->m:Lj5;

    .line 33
    .line 34
    iget-object v10, p0, Lsn0;->n:Lmh;

    .line 35
    .line 36
    invoke-static/range {v0 .. v12}, Lr60;->a(Lkm;Lpe0;Ljn0;Ln2;Lga;Lf21;ZLaj0;Ln2;Lj5;Lmh;Lji;I)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lna1;->a:Lna1;

    .line 40
    .line 41
    return-object p0
.end method
