.class public final synthetic Lrw2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:Lo72;

.field public final synthetic i:F

.field public final synthetic j:Led;

.field public final synthetic k:Lid;

.field public final synthetic l:Lin0;


# direct methods
.method public synthetic constructor <init>(Lo72;FLed;Lid;Lin0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrw2;->h:Lo72;

    .line 5
    .line 6
    iput p2, p0, Lrw2;->i:F

    .line 7
    .line 8
    iput-object p3, p0, Lrw2;->j:Led;

    .line 9
    .line 10
    iput-object p4, p0, Lrw2;->k:Lid;

    .line 11
    .line 12
    iput-object p5, p0, Lrw2;->l:Lin0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-object p1, p0, Lrw2;->h:Lo72;

    .line 8
    .line 9
    iget-object p1, p1, Lo72;->i:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Lgd;

    .line 16
    .line 17
    iget v3, p0, Lrw2;->i:F

    .line 18
    .line 19
    iget-object v4, p0, Lrw2;->j:Led;

    .line 20
    .line 21
    iget-object v5, p0, Lrw2;->k:Lid;

    .line 22
    .line 23
    iget-object v6, p0, Lrw2;->l:Lin0;

    .line 24
    .line 25
    invoke-static/range {v0 .. v6}, Lte;->w(Lgd;JFLed;Lid;Lin0;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, La83;->a:La83;

    .line 29
    .line 30
    return-object p0
.end method
