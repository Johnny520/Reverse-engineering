.class public final Ljb1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public h:Llb1;

.field public i:Llb1;

.field public j:I

.field public final synthetic k:Lmb1;

.field public final synthetic l:I


# direct methods
.method public constructor <init>(Lmb1;I)V
    .locals 0

    .line 1
    iput p2, p0, Ljb1;->l:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ljb1;->k:Lmb1;

    .line 7
    .line 8
    iget-object p2, p1, Lmb1;->m:Llb1;

    .line 9
    .line 10
    iget-object p2, p2, Llb1;->k:Llb1;

    .line 11
    .line 12
    iput-object p2, p0, Ljb1;->h:Llb1;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    iput-object p2, p0, Ljb1;->i:Llb1;

    .line 16
    .line 17
    iget p1, p1, Lmb1;->l:I

    .line 18
    .line 19
    iput p1, p0, Ljb1;->j:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljb1;->b()Llb1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final b()Llb1;
    .locals 3

    .line 1
    iget-object v0, p0, Ljb1;->h:Llb1;

    .line 2
    .line 3
    iget-object v1, p0, Ljb1;->k:Lmb1;

    .line 4
    .line 5
    iget-object v2, v1, Lmb1;->m:Llb1;

    .line 6
    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    iget v1, v1, Lmb1;->l:I

    .line 10
    .line 11
    iget v2, p0, Ljb1;->j:I

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Llb1;->k:Llb1;

    .line 16
    .line 17
    iput-object v1, p0, Ljb1;->h:Llb1;

    .line 18
    .line 19
    iput-object v0, p0, Ljb1;->i:Llb1;

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 23
    .line 24
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p0

    .line 28
    :cond_1
    invoke-static {}, Lum2;->b()V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ljb1;->h:Llb1;

    .line 2
    .line 3
    iget-object p0, p0, Ljb1;->k:Lmb1;

    .line 4
    .line 5
    iget-object p0, p0, Lmb1;->m:Llb1;

    .line 6
    .line 7
    if-eq v0, p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ljb1;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljb1;->a()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Ljb1;->b()Llb1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p0, p0, Llb1;->m:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget-object v0, p0, Ljb1;->i:Llb1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iget-object v2, p0, Ljb1;->k:Lmb1;

    .line 7
    .line 8
    invoke-virtual {v2, v0, v1}, Lmb1;->c(Llb1;Z)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Ljb1;->i:Llb1;

    .line 13
    .line 14
    iget v0, v2, Lmb1;->l:I

    .line 15
    .line 16
    iput v0, p0, Ljb1;->j:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw p0
.end method
