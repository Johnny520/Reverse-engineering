.class public final Lvy2;
.super Lu60;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lgy;
.implements Ldq0;


# instance fields
.field public x:Luz2;

.field public final y:Lnx1;


# direct methods
.method public constructor <init>(Luz2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lu60;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvy2;->x:Luz2;

    .line 5
    .line 6
    sget-object p1, Lgd3;->C:Lgd3;

    .line 7
    .line 8
    new-instance v0, Lnx1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1, p1}, Lnx1;-><init>(Ljava/lang/Object;Lks2;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lvy2;->y:Lnx1;

    .line 15
    .line 16
    new-instance p1, Lr8;

    .line 17
    .line 18
    const/4 v0, 0x3

    .line 19
    invoke-direct {p1, v0, p0}, Lr8;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lvw2;->a:Lh12;

    .line 23
    .line 24
    new-instance v0, Lzw2;

    .line 25
    .line 26
    invoke-direct {v0, v1, v1, p1}, Lzw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lu60;->M0(Lt60;)Lt60;

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final w(Lzn1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lvy2;->y:Lnx1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
