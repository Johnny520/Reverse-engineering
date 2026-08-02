.class public abstract Lvw2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lh12;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lh12;

    .line 2
    .line 3
    sget-object v1, Lbe0;->h:Lbe0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lh12;-><init>(Ljava/util/List;Ler2;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lvw2;->a:Lh12;

    .line 10
    .line 11
    return-void
.end method

.method public static final a(Luh1;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Luh1;
    .locals 3

    .line 1
    new-instance v0, Luw2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x6

    .line 5
    invoke-direct {v0, p1, v1, p2, v2}, Luw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
