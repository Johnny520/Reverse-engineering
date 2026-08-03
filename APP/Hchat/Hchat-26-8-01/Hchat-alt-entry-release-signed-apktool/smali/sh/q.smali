.class public final synthetic Lsh/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Lv1/b1;

.field public final synthetic j:I

.field public final synthetic k:Lv1/b1;

.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:Lv1/b1;

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(IILv1/b1;ILv1/b1;IILv1/b1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lsh/q;->g:I

    .line 5
    .line 6
    iput p2, p0, Lsh/q;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lsh/q;->i:Lv1/b1;

    .line 9
    .line 10
    iput p4, p0, Lsh/q;->j:I

    .line 11
    .line 12
    iput-object p5, p0, Lsh/q;->k:Lv1/b1;

    .line 13
    .line 14
    iput p6, p0, Lsh/q;->l:I

    .line 15
    .line 16
    iput p7, p0, Lsh/q;->m:I

    .line 17
    .line 18
    iput-object p8, p0, Lsh/q;->n:Lv1/b1;

    .line 19
    .line 20
    iput p9, p0, Lsh/q;->o:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lv1/a1;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lsh/q;->g:I

    .line 7
    .line 8
    iget v1, p0, Lsh/q;->h:I

    .line 9
    .line 10
    sub-int v1, v0, v1

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-gez v1, :cond_0

    .line 14
    .line 15
    move v1, v2

    .line 16
    :cond_0
    div-int/lit8 v1, v1, 0x2

    .line 17
    .line 18
    iget-object v3, p0, Lsh/q;->i:Lv1/b1;

    .line 19
    .line 20
    iget v4, v3, Lv1/b1;->h:I

    .line 21
    .line 22
    sub-int v4, v0, v4

    .line 23
    .line 24
    div-int/lit8 v4, v4, 0x2

    .line 25
    .line 26
    iget v5, p0, Lsh/q;->j:I

    .line 27
    .line 28
    sub-int/2addr v0, v5

    .line 29
    if-gez v0, :cond_1

    .line 30
    .line 31
    move v0, v2

    .line 32
    :cond_1
    div-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    iget-object v5, p0, Lsh/q;->k:Lv1/b1;

    .line 35
    .line 36
    if-eqz v5, :cond_2

    .line 37
    .line 38
    invoke-static {p1, v5, v2, v1}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget v1, p0, Lsh/q;->l:I

    .line 42
    .line 43
    iget v2, p0, Lsh/q;->m:I

    .line 44
    .line 45
    add-int/2addr v1, v2

    .line 46
    invoke-static {p1, v3, v1, v4}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lsh/q;->n:Lv1/b1;

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    iget v2, v1, Lv1/b1;->g:I

    .line 54
    .line 55
    iget v3, p0, Lsh/q;->o:I

    .line 56
    .line 57
    sub-int/2addr v3, v2

    .line 58
    invoke-static {p1, v1, v3, v0}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 59
    .line 60
    .line 61
    :cond_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 62
    .line 63
    return-object p1
.end method
