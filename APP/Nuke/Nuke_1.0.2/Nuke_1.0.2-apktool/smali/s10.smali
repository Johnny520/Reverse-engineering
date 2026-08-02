.class public final Ls10;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:Lkz2;

.field public final synthetic b:Lb03;


# direct methods
.method public constructor <init>(Lkz2;Lb03;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls10;->a:Lkz2;

    .line 5
    .line 6
    iput-object p2, p0, Ls10;->b:Lb03;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ls12;Lt00;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lr10;

    .line 2
    .line 3
    iget-object v1, p0, Ls10;->b:Lb03;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Ls10;->a:Lkz2;

    .line 7
    .line 8
    invoke-direct {v0, p1, p0, v1, v2}, Lr10;-><init>(Ls12;Lkz2;Lb03;Lt00;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p2}, Lte;->u(Lmn0;Lt00;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, Lk20;->h:Lk20;

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, La83;->a:La83;

    .line 21
    .line 22
    return-object p0
.end method
