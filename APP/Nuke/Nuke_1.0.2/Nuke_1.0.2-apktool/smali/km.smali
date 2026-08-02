.class public final Lkm;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public v:Lcc;

.field public final w:Lv5;


# direct methods
.method public constructor <init>(Lcc;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lth1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkm;->v:Lcc;

    .line 5
    .line 6
    new-instance p1, Lv5;

    .line 7
    .line 8
    const/4 v0, 0x6

    .line 9
    invoke-direct {p1, v0, p0}, Lv5;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lkm;->w:Lv5;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final E0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lkm;->v:Lcc;

    .line 2
    .line 3
    iget-object p0, p0, Lkm;->w:Lv5;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcc;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final F0()V
    .locals 1

    .line 1
    iget-object p0, p0, Lkm;->v:Lcc;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lcc;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    return-void
.end method
