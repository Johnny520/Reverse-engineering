.class public final synthetic Ljk;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Luh1;

.field public final synthetic j:Lm13;

.field public final synthetic k:I

.field public final synthetic l:Z

.field public final synthetic m:I

.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Luh1;Lm13;IZIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljk;->h:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ljk;->i:Luh1;

    .line 7
    .line 8
    iput-object p3, p0, Ljk;->j:Lm13;

    .line 9
    .line 10
    iput p4, p0, Ljk;->k:I

    .line 11
    .line 12
    iput-boolean p5, p0, Ljk;->l:Z

    .line 13
    .line 14
    iput p6, p0, Ljk;->m:I

    .line 15
    .line 16
    iput p7, p0, Ljk;->n:I

    .line 17
    .line 18
    iput p8, p0, Ljk;->o:I

    .line 19
    .line 20
    iput p9, p0, Ljk;->p:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Lpx;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Ljk;->o:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lpp0;->N(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, Ljk;->h:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Ljk;->i:Luh1;

    .line 20
    .line 21
    iget-object v2, p0, Ljk;->j:Lm13;

    .line 22
    .line 23
    iget v3, p0, Ljk;->k:I

    .line 24
    .line 25
    iget-boolean v4, p0, Ljk;->l:Z

    .line 26
    .line 27
    iget v5, p0, Ljk;->m:I

    .line 28
    .line 29
    iget v6, p0, Ljk;->n:I

    .line 30
    .line 31
    iget v9, p0, Ljk;->p:I

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 34
    .line 35
    .line 36
    sget-object p0, La83;->a:La83;

    .line 37
    .line 38
    return-object p0
.end method
