.class public final synthetic Lfb;
.super Lhx;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:Lhb;

.field public final synthetic e:Lqj0;

.field public final synthetic f:Lm3;


# direct methods
.method public constructor <init>(Lhb;Lqj0;Lm3;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lfb;->d:Lhb;

    .line 2
    .line 3
    iput-object p2, p0, Lfb;->e:Lqj0;

    .line 4
    .line 5
    iput-object p3, p0, Lfb;->f:Lm3;

    .line 6
    .line 7
    const-string v4, "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const-class v2, Lo30;

    .line 12
    .line 13
    const-string v3, "localRect"

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    invoke-direct/range {v0 .. v5}, Lhx;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lfb;->e:Lqj0;

    .line 2
    .line 3
    iget-object v1, p0, Lfb;->f:Lm3;

    .line 4
    .line 5
    iget-object p0, p0, Lfb;->d:Lhb;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Lhb;->w0(Lhb;Lqj0;Lm3;)Lst0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
