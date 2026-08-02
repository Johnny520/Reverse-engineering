.class public final synthetic Lem;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:Lsz1;

.field public final synthetic i:Lif1;

.field public final synthetic j:Lpf1;

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:Lgm;


# direct methods
.method public synthetic constructor <init>(Lsz1;Lif1;Lpf1;IILgm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lem;->h:Lsz1;

    .line 5
    .line 6
    iput-object p2, p0, Lem;->i:Lif1;

    .line 7
    .line 8
    iput-object p3, p0, Lem;->j:Lpf1;

    .line 9
    .line 10
    iput p4, p0, Lem;->k:I

    .line 11
    .line 12
    iput p5, p0, Lem;->l:I

    .line 13
    .line 14
    iput-object p6, p0, Lem;->m:Lgm;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lrz1;

    .line 3
    .line 4
    iget-object p1, p0, Lem;->j:Lpf1;

    .line 5
    .line 6
    invoke-interface {p1}, Lm11;->getLayoutDirection()Ld61;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    iget-object p1, p0, Lem;->m:Lgm;

    .line 11
    .line 12
    iget-object v6, p1, Lgm;->a:Lr5;

    .line 13
    .line 14
    iget-object v1, p0, Lem;->h:Lsz1;

    .line 15
    .line 16
    iget-object v2, p0, Lem;->i:Lif1;

    .line 17
    .line 18
    iget v4, p0, Lem;->k:I

    .line 19
    .line 20
    iget v5, p0, Lem;->l:I

    .line 21
    .line 22
    invoke-static/range {v0 .. v6}, Ldm;->b(Lrz1;Lsz1;Lif1;Ld61;IILr5;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, La83;->a:La83;

    .line 26
    .line 27
    return-object p0
.end method
