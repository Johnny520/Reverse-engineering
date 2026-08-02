.class public final synthetic Lqm;
.super Lyn0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic o:Lsm;

.field public final synthetic p:Lzn1;

.field public final synthetic q:Lt6;


# direct methods
.method public constructor <init>(Lsm;Lzn1;Lt6;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lqm;->o:Lsm;

    .line 2
    .line 3
    iput-object p2, p0, Lqm;->p:Lzn1;

    .line 4
    .line 5
    iput-object p3, p0, Lqm;->q:Lt6;

    .line 6
    .line 7
    const-string v4, "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const-class v2, Ls11;

    .line 12
    .line 13
    const-string v3, "localRect"

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    invoke-direct/range {v0 .. v5}, Lyn0;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lqm;->p:Lzn1;

    .line 2
    .line 3
    iget-object v1, p0, Lqm;->q:Lt6;

    .line 4
    .line 5
    iget-object p0, p0, Lqm;->o:Lsm;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Lsm;->M0(Lsm;Lzn1;Lt6;)Lo62;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
