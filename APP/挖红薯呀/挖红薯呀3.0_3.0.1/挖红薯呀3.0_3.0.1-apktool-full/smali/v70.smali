.class public final synthetic Lv70;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lpe0;

.field public final synthetic e:Lkm;

.field public final synthetic f:Ljn0;

.field public final synthetic g:Lf21;

.field public final synthetic h:Z

.field public final synthetic i:Lj5;

.field public final synthetic j:Ln2;

.field public final synthetic k:Laj0;

.field public final synthetic l:Lga;

.field public final synthetic m:Ln2;

.field public final synthetic n:Lmh;

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lpe0;Lkm;Ljn0;Lf21;ZLj5;Ln2;Laj0;Lga;Ln2;Lmh;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv70;->d:Lpe0;

    .line 5
    .line 6
    iput-object p2, p0, Lv70;->e:Lkm;

    .line 7
    .line 8
    iput-object p3, p0, Lv70;->f:Ljn0;

    .line 9
    .line 10
    iput-object p4, p0, Lv70;->g:Lf21;

    .line 11
    .line 12
    iput-boolean p5, p0, Lv70;->h:Z

    .line 13
    .line 14
    iput-object p6, p0, Lv70;->i:Lj5;

    .line 15
    .line 16
    iput-object p7, p0, Lv70;->j:Ln2;

    .line 17
    .line 18
    iput-object p8, p0, Lv70;->k:Laj0;

    .line 19
    .line 20
    iput-object p9, p0, Lv70;->l:Lga;

    .line 21
    .line 22
    iput-object p10, p0, Lv70;->m:Ln2;

    .line 23
    .line 24
    iput-object p11, p0, Lv70;->n:Lmh;

    .line 25
    .line 26
    iput p12, p0, Lv70;->o:I

    .line 27
    .line 28
    iput p13, p0, Lv70;->p:I

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v11, p1

    .line 2
    check-cast v11, Lji;

    .line 3
    .line 4
    move-object/from16 v0, p2

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lv70;->o:I

    .line 12
    .line 13
    or-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    invoke-static {v0}, Lj50;->A(I)I

    .line 16
    .line 17
    .line 18
    move-result v12

    .line 19
    iget v0, p0, Lv70;->p:I

    .line 20
    .line 21
    invoke-static {v0}, Lj50;->A(I)I

    .line 22
    .line 23
    .line 24
    move-result v13

    .line 25
    iget-object v0, p0, Lv70;->d:Lpe0;

    .line 26
    .line 27
    iget-object v1, p0, Lv70;->e:Lkm;

    .line 28
    .line 29
    iget-object v2, p0, Lv70;->f:Ljn0;

    .line 30
    .line 31
    iget-object v3, p0, Lv70;->g:Lf21;

    .line 32
    .line 33
    iget-boolean v4, p0, Lv70;->h:Z

    .line 34
    .line 35
    iget-object v5, p0, Lv70;->i:Lj5;

    .line 36
    .line 37
    iget-object v6, p0, Lv70;->j:Ln2;

    .line 38
    .line 39
    iget-object v7, p0, Lv70;->k:Laj0;

    .line 40
    .line 41
    iget-object v8, p0, Lv70;->l:Lga;

    .line 42
    .line 43
    iget-object v9, p0, Lv70;->m:Ln2;

    .line 44
    .line 45
    iget-object v10, p0, Lv70;->n:Lmh;

    .line 46
    .line 47
    invoke-static/range {v0 .. v13}, Lw60;->b(Lpe0;Lkm;Ljn0;Lf21;ZLj5;Ln2;Laj0;Lga;Ln2;Lmh;Lji;II)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lna1;->a:Lna1;

    .line 51
    .line 52
    return-object p0
.end method
