.class public final Lbg3;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxx;
.implements Lfa1;


# instance fields
.field public final h:Lb7;

.field public final i:Lfy;

.field public j:Z

.field public k:Lba1;

.field public l:Lmn0;


# direct methods
.method public constructor <init>(Lb7;Lfy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbg3;->h:Lb7;

    .line 5
    .line 6
    iput-object p2, p0, Lbg3;->i:Lfy;

    .line 7
    .line 8
    sget-object p1, Lrw;->a:Lkw;

    .line 9
    .line 10
    iput-object p1, p0, Lbg3;->l:Lmn0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lbg3;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lbg3;->j:Z

    .line 7
    .line 8
    iget-object v0, p0, Lbg3;->h:Lb7;

    .line 9
    .line 10
    invoke-virtual {v0}, Lb7;->getView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const v1, 0x79080086

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lbg3;->k:Lba1;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Lba1;->b(Lha1;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iput-object v2, p0, Lbg3;->k:Lba1;

    .line 29
    .line 30
    :cond_1
    iget-object p0, p0, Lbg3;->i:Lfy;

    .line 31
    .line 32
    invoke-virtual {p0}, Lfy;->m()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final d(Lmn0;)V
    .locals 2

    .line 1
    new-instance v0, Lfa;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1, p0, p1}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lbg3;->h:Lb7;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lb7;->setOnReadyForComposition(Lin0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final g(Lia1;Lz91;)V
    .locals 0

    .line 1
    sget-object p1, Lz91;->ON_DESTROY:Lz91;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lbg3;->a()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object p1, Lz91;->ON_CREATE:Lz91;

    .line 10
    .line 11
    if-ne p2, p1, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, Lbg3;->j:Z

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lbg3;->l:Lmn0;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lbg3;->d(Lmn0;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method
