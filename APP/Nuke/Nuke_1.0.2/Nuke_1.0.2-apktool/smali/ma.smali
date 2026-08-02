.class public final Lma;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnf1;


# instance fields
.field public final synthetic a:Ld22;

.field public final synthetic b:Ld61;


# direct methods
.method public constructor <init>(Ld22;Ld61;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lma;->a:Ld22;

    .line 5
    .line 6
    iput-object p2, p0, Lma;->b:Ld61;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final g(Lpf1;Ljava/util/List;J)Lof1;
    .locals 0

    .line 1
    iget-object p2, p0, Lma;->a:Ld22;

    .line 2
    .line 3
    iget-object p0, p0, Lma;->b:Ld61;

    .line 4
    .line 5
    invoke-virtual {p2, p0}, Ld22;->setParentLayoutDirection(Ld61;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lv6;->p:Lv6;

    .line 9
    .line 10
    sget-object p2, Lce0;->h:Lce0;

    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    invoke-interface {p1, p3, p3, p2, p0}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
